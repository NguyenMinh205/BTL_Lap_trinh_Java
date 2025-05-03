package repository;

import model.Bill;
import repository.IRepository.IBillRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BillRepositoryImpl implements IBillRepository {
    private static final String FILE_PATH = "bills.txt";
    private List<Bill> bills = new ArrayList<>();

    public BillRepositoryImpl() {
        loadBillsFromFile();
        if (bills.isEmpty()) {
            initializeSampleBills();
            saveBillsToFile();
        }
    }

    private void loadBillsFromFile() {
        File file = new File(FILE_PATH);
        if (!file.exists()) return;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Object obj = ois.readObject();
            if (obj instanceof List<?>) {
                List<?> list = (List<?>) obj;
                bills = new ArrayList<>();
                for (Object item : list) {
                    if (item instanceof Bill) {
                        bills.add((Bill) item);
                    }
                }
                System.out.println("Đã đọc danh sách hóa đơn từ file.");
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void saveBillsToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(bills);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initializeSampleBills() {
        bills.add(new Bill("HD01", "Nguyễn Văn A", "0123456789", "a@gmail.com", "2025-05-01", 150000.0));
        bills.add(new Bill("HD02", "Trần Thị B", "0234567891", "b@gmail.com", "2025-05-01", 180000.0));
        bills.add(new Bill("HD03", "Lê Văn C", "0345678912", "c@gmail.com", "2025-05-02", 220000.0));
        bills.add(new Bill("HD04", "Phạm Thị D", "0456789123", "d@gmail.com", "2025-05-02", 95000.0));
        bills.add(new Bill("HD05", "Hoàng Văn E", "0567891234", "e@gmail.com", "2025-05-02", 275000.0));
    }

    private String generateNewId() {
        int max = bills.stream()
            .mapToInt(b -> {
                try {
                    return Integer.parseInt(b.getMaHD().replace("HD", ""));
                } catch (NumberFormatException e) {
                    return 0;
                }
            })
            .max().orElse(0);
        return String.format("HD%02d", max + 1);
    }

    @Override
    public Bill save(Bill bill) {
        String newId = generateNewId();
        bill.setMaHD(newId);
        bills.add(bill);
        saveBillsToFile();
        return bill;
    }

    @Override
    public List<Bill> findAll() {
        return new ArrayList<>(bills);
    }

    @Override
    public void clear() {
        bills.clear();
        saveBillsToFile();
    }
}

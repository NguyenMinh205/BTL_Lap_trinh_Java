package repository;

import model.Bill;
import repository.IRepository.IBillRepository;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        bills.add(new Bill("HD01", "Nguyễn Văn A", "0123456789", "a@gmail.com", LocalDate.of(2025, 5, 1), 150000.0));
        bills.add(new Bill("HD02", "Trần Thị B", "0234567891", "b@gmail.com", LocalDate.of(2025, 5, 1), 180000.0));
        bills.add(new Bill("HD03", "Lê Văn C", "0345678912", "c@gmail.com", LocalDate.of(2025, 5, 2), 220000.0));
        bills.add(new Bill("HD04", "Phạm Thị D", "0456789123", "d@gmail.com", LocalDate.of(2025, 5, 2), 95000.0));
        bills.add(new Bill("HD05", "Hoàng Văn E", "0567891234", "e@gmail.com", LocalDate.of(2025, 5, 2), 275000.0));
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
        if (bill.getNgayDat() == null) {
            bill.setNgayDat(LocalDate.now());
        }
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

    @Override
    public Bill findById(String maHD) {
        return bills.stream()
                .filter(b -> b.getMaHD().equalsIgnoreCase(maHD))
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean deleteById(String maHD) {
        boolean removed = bills.removeIf(b -> b.getMaHD().equalsIgnoreCase(maHD));
        if (removed) saveBillsToFile();
        return removed;
    }

    @Override
    public List<Bill> findByDateRange(LocalDate from, LocalDate to) {
        return bills.stream()
                .filter(b -> {
                    LocalDate d = b.getNgayDat();
                    return d != null && (d.isEqual(from) || d.isAfter(from)) && (d.isBefore(to) || d.isEqual(to));
                })
                .collect(Collectors.toList());
    }
}
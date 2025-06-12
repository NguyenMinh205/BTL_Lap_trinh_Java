package repository;

import model.User;
import repository.IRepository.IUserRepository;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements IUserRepository {

    private static final String FILE_PATH = "users.txt";
    private List<User> users = new ArrayList<>();

    public UserRepositoryImpl() {
        loadUsersFromFile();
        if (users.isEmpty()) {
            initializeUsers();
            saveUsersToFile();
        }
    }

    private void saveUsersToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadUsersFromFile() {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Object obj = ois.readObject();
            if (obj instanceof List<?>) {
                users = new ArrayList<>();
                for (Object o : (List<?>) obj) {
                    if (o instanceof User) {
                        users.add((User) o);
                    }
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void initializeUsers() {
        users.add(new User("AD01", "Nguyễn Quang Minh", "nqm1312@gmail.com", "0966618229", "Minh123*", "Hà Nội", "ADMIN", "Nam", "Ca sáng"));
        users.add(new User("AD02", "Vũ Tiến Khang", "khang2404@gmail.com", "0966618229", "Khang123*", "Hà Nội", "ADMIN", "Nam", "Ca sáng"));
        users.add(new User("NV01", "Nguyễn Văn A", "manh@gmail.com", "0900000001", "Abcd123*", "Hà Nội", "USER", "Nam", "Ca chiều"));
        users.add(new User("NV02", "Trần Thị B", "b@gmail.com", "0900000002", "Abcd123*", "Hà Nội", "USER", "Nữ", "Ca sáng"));
        users.add(new User("NV03", "Lê Văn C", "c@gmail.com", "0900000003", "Abcd123*", "Hà Nội", "USER", "Nam", "Ca tối"));
        users.add(new User("NV04", "Phạm Thị D", "d@gmail.com", "0900000004", "Abcd123*", "Hà Nội", "USER", "Nữ", "Ca chiều"));
        users.add(new User("NV05", "Vũ Văn E", "e@gmail.com", "0900000005", "Abcd123*", "Hà Nội", "USER", "Nam", "Ca sáng"));
    }

    private String generateNewId(String role) {
        int count = (int) users.stream()
                .filter(u -> u.getChucVu().equalsIgnoreCase(role))
                .count() + 1;
        return role.equalsIgnoreCase("ADMIN") ? String.format("AD%02d", count) : String.format("NV%02d", count);
    }

    @Override
    public User findByEmailAndPassword(String email, String password) {
        for (User user : users) {
            System.out.println("Check: " + user.getEmail() + " == " + email + " && " + user.getMatKhau() + " == " + password);
            if (user.getEmail().equalsIgnoreCase(email.trim()) && user.getMatKhau().equals(password.trim())) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User findByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void addUser(User user) {
        user.setMaNV(generateNewId(user.getChucVu()));
        users.add(user);
        saveUsersToFile();
    }

    @Override
    public User update(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getMaNV().equals(user.getMaNV())) {
                users.set(i, user);
                saveUsersToFile();
                return users.get(i);
            }
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users);
    }

    @Override
    public void clear() {
        users.clear();
        saveUsersToFile();
    }

    @Override
    public void delete(User user) {
        users.remove(user);
        saveUsersToFile();
    }
}

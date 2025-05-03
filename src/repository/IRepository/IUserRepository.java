package repository.IRepository;

import model.User;
import java.util.List;

public interface IUserRepository {

    public User findByEmailAndPassword(String email, String password);

    public User findByEmail(String email);

    public User update(User user);

    public List<User> findAll();

    public void addUser(User user);

    public void clear();

    public void delete(User user);
}

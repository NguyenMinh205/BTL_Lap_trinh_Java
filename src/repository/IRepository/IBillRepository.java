package repository.IRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import model.Bill;
import java.util.List;

public interface IBillRepository {

    Bill save(Bill bill);

    List<Bill> findAll();

    void clear();

    Bill findById(String maHD);                

    boolean deleteById(String maHD);    

    List<Bill> findByDateRange(LocalDate from, LocalDate to); 
}
import java.time.LocalDate;
import java.time.LocalDateTime;

public class StoragePackages {

    private Products product;
    private LocalDate entryDate;
    public void setEntryDate(LocalDateTime entryDate) {
        this.expirationDate = expirationDate;
    }
    private LocalDate expirationDate;
    public void setExpirationDate(LocalDate expirationDate) {
        LocalDate today = LocalDate.now();
        LocalDate datePesteOLuna = today.plusMonths(1);
        this.expirationDate = expirationDate;
    }
}

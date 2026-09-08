import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Card {

    private Long id;
    private String fingerprint;
    private LocalDate expiryDate;

    public Card(Long id, String fingerprint, LocalDate expiryDate) {
        this.id = id;
        this.fingerprint = fingerprint;
        this.expiryDate = expiryDate;
    }

    public Long getId() {
        return id;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", fingerprint='" + fingerprint + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }
}

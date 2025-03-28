import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ansatt") // This should match your actual DB table name
public class Ansatt {

    @Id
    private int ansattId;  // Must match the primary key column name

    private String navn;
    private String stilling;

    // Constructors
    public Ansatt() {}

    public Ansatt(int ansattId, String navn, String stilling) {
        this.ansattId = ansattId;
        this.navn = navn;
        this.stilling = stilling;
    }

    // Getters and setters
    public int getAnsattId() {
        return ansattId;
    }

    public void setAnsattId(int ansattId) {
        this.ansattId = ansattId;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getStilling() {
        return stilling;
    }

    public void setStilling(String stilling) {
        this.stilling = stilling;
    }
}

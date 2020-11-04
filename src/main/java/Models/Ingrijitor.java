package Models;

import javax.persistence.*;

@Entity
@Table(name = "Ingrijitor")
public class Ingrijitor {
    private int id;
    @Column(name = "nume")
    private String nume;
    @Column(name = "data_N")
    private String data_N;
    @Column(name = "sex")
    private String sex;
    @Column(name = "adresa")
    private String adr;


    public Ingrijitor() {
    }
    @Id
    @Column(name = "Ingrijitor_id")
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getData_N() {
        return data_N;
    }

    public void setData_N(String data_N) {
        this.data_N = data_N;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }
}

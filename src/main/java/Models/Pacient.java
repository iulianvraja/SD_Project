package Models;

import javax.persistence.*;

@Entity
@Table(name = "Pacient")
public class Pacient {

    private int id;
    @Column(name = "nume")
    private String nume;
    @Column(name = "parola")
    private String parola;
    @Column(name = "data_N")
    private String data_n;
    @Column(name = "sex")
    private String sex;
    @Column(name = "adresa")
    private String adr;

    private FisaMedicala fis;
    private MedicPojo m;

    public Pacient(){

    }
    @Id
    @Column(name = "Pacient_id")
    @GeneratedValue
    public int getId() {
        return id;
    }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Medic_id")
    public MedicPojo getM() {
        return m;
    }

    public void setM(MedicPojo m) {
        this.m = m;
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

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getData_n() {
        return data_n;
    }

    public void setData_n(String data_n) {
        this.data_n = data_n;
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
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Fisa_id")
    public FisaMedicala getFis() {
        return fis;
    }

    public void setFis(FisaMedicala fis) {
        this.fis = fis;
    }
}

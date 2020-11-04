package Models;

import javax.persistence.*;

@Entity
@Table(name = "Medtofisa")
public class Medtofisa {
    private Medicamente m;
    private FisaMedicala f;
    private int id;

    public Medtofisa() {
    }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Med_id")
    public Medicamente getM() {
        return m;
    }

    public void setM(Medicamente m) {
        this.m = m;
    }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Fisa_id")
    public FisaMedicala getF() {
        return f;
    }

    public void setF(FisaMedicala f) {
        this.f = f;
    }
    @Id
    @Column(name = "Medtof_id")
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }





}

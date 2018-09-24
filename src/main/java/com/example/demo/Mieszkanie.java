package com.example.demo;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Mieszkanie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int numer;

    private int powierzchnia;

    @OneToMany(mappedBy = "mieszkanie")
    private List<Mieszkaniec> mieszkancy;

    @ManyToOne
    private Wspolnota wspolnota;

    public Mieszkanie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public int getPowierzchnia() {
        return powierzchnia;
    }

    public void setPowierzchnia(int powierzchnia) {
        this.powierzchnia = powierzchnia;
    }

    public List<Mieszkaniec> getMieszkancy() {
        return mieszkancy;
    }

    public void setMieszkancy(List<Mieszkaniec> mieszkancy) {
        this.mieszkancy = mieszkancy;
    }

    public Wspolnota getWspolnota() {
        return wspolnota;
    }

    public void setWspolnota(Wspolnota wspolnota) {
        this.wspolnota = wspolnota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mieszkanie that = (Mieszkanie) o;
        return numer == that.numer &&
                powierzchnia == that.powierzchnia &&
                Objects.equals(id, that.id) &&
                Objects.equals(mieszkancy, that.mieszkancy) &&
                Objects.equals(wspolnota, that.wspolnota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numer, powierzchnia, mieszkancy, wspolnota);
    }

    @Override
    public String toString() {
        return "Mieszkanie{" +
                "id=" + id +
                ", numer=" + numer +
                ", powierzchnia=" + powierzchnia +
                ", mieszkancy=" + mieszkancy +
                ", wspolnota=" + wspolnota +
                '}';
    }
}

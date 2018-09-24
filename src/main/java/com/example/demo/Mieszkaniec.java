package com.example.demo;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Mieszkaniec {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imie;

    private String nazwisko;

    private String plec;

    @ManyToOne
    private Mieszkanie mieszkanie;

    public Mieszkaniec() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public Mieszkanie getMieszkanie() {
        return mieszkanie;
    }

    public void setMieszkanie(Mieszkanie mieszkanie) {
        this.mieszkanie = mieszkanie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mieszkaniec that = (Mieszkaniec) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(imie, that.imie) &&
                Objects.equals(nazwisko, that.nazwisko) &&
                Objects.equals(plec, that.plec) &&
                Objects.equals(mieszkanie, that.mieszkanie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imie, nazwisko, plec, mieszkanie);
    }

    @Override
    public String toString() {
        return "Mieszkaniec{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", plec='" + plec + '\'' +
                ", mieszkanie=" + mieszkanie +
                '}';
    }
}

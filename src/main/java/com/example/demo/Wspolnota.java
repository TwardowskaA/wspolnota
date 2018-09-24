package com.example.demo;

import org.hibernate.annotations.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Objects;

@Entity
public class Wspolnota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nazwa;

    private String adres;

    @OneToMany(mappedBy = "wspolnota")
    private List<Mieszkanie> mieszkania;

    public Wspolnota() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getAddres() {
        return adres;
    }

    public void setAddres(String addres) {
        this.adres = addres;
    }

    public List<Mieszkanie> getMieszkania() {
        return mieszkania;
    }

    public void setMieszkania(List<Mieszkanie> mieszkania) {
        this.mieszkania = mieszkania;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wspolnota wspolnota = (Wspolnota) o;
        return Objects.equals(id, wspolnota.id) &&
                Objects.equals(nazwa, wspolnota.nazwa) &&
                Objects.equals(adres, wspolnota.adres) &&
                Objects.equals(mieszkania, wspolnota.mieszkania);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nazwa, adres, mieszkania);
    }

    @Override
    public String toString() {
        return "Wspolnota{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", adres='" + adres + '\'' +
                ", mieszkania=" + mieszkania +
                '}';
    }
}

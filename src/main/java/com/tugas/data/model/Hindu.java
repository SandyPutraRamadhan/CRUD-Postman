package com.tugas.data.model;

import javax.persistence.*;

//@Entity untuk menentukan nama entitas
@Entity
//Untuk create table dan menambahkan nama table
@Table(name = "hindu")
public class Hindu {
    @Id
//  @GeneratedValue Auto_Increment dan Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Colomn untuk menambahkan colom
    @Column(name = "kerajaan_hindu")
    private String kerajaan;

    @Column(name = "letak")
    private String letak;

    @Column(name = "tahun_berdiri")
    private String tahun;

    @Column(name = "raja_terkenal")
    private String raja;

    @Column(name = "peninggalan_sejarah")
    private String sejarah;

// Setter adalah member function atau method yang dipakai untuk memberikan nilai ke dalam sebuah data member. Sedangkan Getter adalah member function yang dipakai untuk menampilkan nilai data member
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKerajaan() {
        return kerajaan;
    }

    public void setKerajaan(String kerajaan) {
        this.kerajaan = kerajaan;
    }

    public String getLetak() {
        return letak;
    }

    public void setLetak(String letak) {
        this.letak = letak;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getRaja() {
        return raja;
    }

    public void setRaja(String raja) {
        this.raja = raja;
    }

    public String getSejarah() {
        return sejarah;
    }

    public void setSejarah(String sejarah) {
        this.sejarah = sejarah;
    }

    @Override
//    mengembalikan representasi string dari suatu objek
    public String toString() {
        return "Hindu{" +
                "id=" + id +
                ", kerajaan='" + kerajaan + '\'' +
                ", letak='" + letak + '\'' +
                ", tahun='" + tahun + '\'' +
                ", raja='" + raja + '\'' +
                ", sejarah='" + sejarah + '\'' +
                '}';
    }
}

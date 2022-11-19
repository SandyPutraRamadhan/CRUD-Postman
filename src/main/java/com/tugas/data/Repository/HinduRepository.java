package com.tugas.data.Repository;

import com.tugas.data.model.Hindu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository untuk menunjukkan bahwa kelas menyediakan mekanisme untuk penyimpanan, pengambilan, pencarian, pembaruan, dan operasi penghapusan pada objek
@Repository
//extends JpaRepository merupakan extends khusus JPA untuk Repository
public interface HinduRepository extends JpaRepository<Hindu, Long> {
}

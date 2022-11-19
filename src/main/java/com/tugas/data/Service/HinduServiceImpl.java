package com.tugas.data.Service;

import com.tugas.data.Repository.HinduRepository;
import com.tugas.data.model.Hindu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service untuk menunjukkan bahwa suatu kelas termasuk dalam lapisan
@Service
public class HinduServiceImpl implements HinduService {

//  @Autowired untuk meng-autowire bean pada method setter
    @Autowired
    private HinduRepository hinduRepository;

    @Override
    public Hindu addHindu(Hindu hindu) {
        return hinduRepository.save(hindu);
    }

    @Override
    public Hindu getHinduById(Long id) {return hinduRepository.findById(id).get();}

    @Override
    public Hindu editHinduById(Long id, String kerajaan, String letak, String tahun, String raja, String sejarah) {
//        orElse untuk mengembalikan nilai jika ada, jika tidak mengembalikan lainnya
        Hindu hindu = hinduRepository.findById(id).orElse(null);
        hindu.setKerajaan(kerajaan);
        hindu.setLetak(letak);
        hindu.setTahun(tahun);
        hindu.setRaja(raja);
        hindu.setSejarah(sejarah);
        return hinduRepository.save(hindu);
    }
    @Override
//    findAll() adalah mengambil semua entitas dari tabel database
    public List<Hindu> getAllHindu() {
        return hinduRepository.findAll();
    }

    @Override
    public void deleteHinduById(Long id) {
        hinduRepository.deleteById(id);
    }
}

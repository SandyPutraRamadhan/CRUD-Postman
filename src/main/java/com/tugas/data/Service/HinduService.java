package com.tugas.data.Service;

import com.tugas.data.model.Hindu;

import java.util.List;

public interface HinduService {

    Hindu editHinduById(Long id, String kerajaan, String letak, String tahun, String raja, String sejarah);

    Hindu addHindu(Hindu hindu);

    Hindu getHinduById(Long id);

    List<Hindu> getAllHindu();

    void deleteHinduById(Long id);
}

package com.tugas.data.controller;

import com.tugas.data.Service.HinduService;
import com.tugas.data.model.Hindu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@restcontroller adalah annotation untuk menandakan bahwa suat class adalah Controller
@RestController
//@requestmapping adalah annotation untuk menandakan url yang digunakan untuk mengakses dan method
@RequestMapping("/hindu")
public class HinduController {

    @Autowired
    private HinduService hinduService;

//    @PostMapping untuk menambahkan data
    @PostMapping
    private Hindu addHindu(@RequestBody Hindu hindu) {
        return hinduService.addHindu(hindu);
    }

//    @GetMapping untuk menampilkan data sesuai id
    @GetMapping("/{id}")
    private Hindu getHinduById(@PathVariable("id") Long id) {
        return hinduService.getHinduById(id);
    }

//    @PutMapping untuk mengedit data
    @PutMapping("/{id}")
    private Hindu editHinduById(@PathVariable("id")Long id, @RequestBody Hindu hindu) {
        return hinduService.editHinduById(id, hindu.getKerajaan(), hindu.getLetak(), hindu.getTahun(), hindu.getRaja(), hindu.getSejarah());
    }

//    @GetMapping("/all") untuk menampilkan semua data
    @GetMapping("/all")
    public List<Hindu> getAllHindu() {
        return hinduService.getAllHindu();
    }

//    @DeleteMapping untuk mendelete data
    @DeleteMapping("/{id}")
    public void deleteHinduById(@PathVariable("id")Long id) {
        hinduService.deleteHinduById(id);
    }

}

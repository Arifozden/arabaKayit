package oslomet.bilreg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ArabaController {
    public final List<Araba> arabaKayit=new ArrayList<>();

    @PostMapping("/kayit")
    public void kayit(Araba araba){
        arabaKayit.add(araba);
    }

    @GetMapping("/hepsiniGetir")
    public List<Araba> hepsiniGetir(){
        return arabaKayit;
    }

    @GetMapping("/hepsiniSil")
    public void hepsiniSil(){
        arabaKayit.clear();
    }
}

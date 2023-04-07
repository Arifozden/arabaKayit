function arabaKayit(){
    const araba = {
        tc : $("#tc").val(),
        ad : $("#ad").val(),
        soyad : $("#soyad").val(),
        adres : $("#adres").val(),
        telefon : $("#telefon").val(),
        mail : $("#mail").val(),
        plaka : $("#plaka").val(),
        marka : $("#marka").val(),
        model : $("#model").val(),
        yil : $("#yil").val()
    }

    $.post("/kayit", araba, function (){
       hepsiniGetir();
    });

    $("#tc").val("");
    $("#ad").val("");
    $("#soyad").val("");
    $("#adres").val("");
    $("#telefon").val("");
    $("#mail").val("");
    $("#plaka").val("");
    $("#marka").val("");
    $("#model").val("");
    $("#yil").val("");

}

function hepsiniGetir(){
    $.get("/hepsiniGetir", function (arabalar){
        bilgiDuzenle(arabalar);
    });
}

function bilgiDuzenle(arabalar){
    let yaz="<table border='1'><tr><th>TC</th><th>Isim</th><th>Soyisim</th><th>Adres</th><th>Telefon</th><th>Mail</th><th>Plaka</th>" +
        "<th>Marka</th><th>Model</th><th>Yil</th></tr>";
    for(const araba of arabalar){
        yaz+= "<tr><td>"+araba.tc+"</td><td>"+araba.isim+"</td><td>"+araba.soyisim+"</td><td>"+araba.adres+"</td><td>"+araba.telefon
            +"</td><td>"+araba.mail+"</td><td>"+araba.plaka+"</td><td>"+araba.marka+"</td><td>"+araba.model+"</td><td>"+araba.yil+"</td></tr>";
    }
    yaz+="</table>";
    $("#tumKayitlar").html(yaz);
}

function hepsiniSil(){
    $.get("/hepsiniSil", function (){
         hepsiniGetir();
    });
}
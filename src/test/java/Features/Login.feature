@LoginTest
  Feature: Trendyol sitesine login işlemi olma otomasyonudur
    Scenario: Başarılı Login girişi
      Given Trendyol sayfasina gidilir
      When Cikan pop-up'dan kadin secilir
      And Giris yap ikonuna tiklanir
      And E-posta ve sifre girilir
      Then Giris yap butonuna tiklanir
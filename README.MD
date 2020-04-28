****Object Serialization (Nesne Serileştirme)****
1.Bir nesneyi bir yerden başka bir yere taşımak, nesneyi depolayıp istenildiği zaman tekrar elde etmek için kullanılır.
2.Serileştirme işlemi kullanılarak  bir nesnenin anlık olarak tuttuğu bilgiler bir yere kaydedilir disk üzerinde (bir dosyada) ve istenildiği zman aynı şekilde elde edilir.
3.Değişkenlere ait değerleri bir dosyaya kaydetdiğinizi düşünün. Tekrar kullanmak istediğinizde bu değerlerin ne ve hangi tipte olduğunu bilemeyiz.
  Nesnelerimizin içinde bulunan değerler ve ve veri tipleri ile birlikte saklayabiliyoruz.
  Bu güzel yöntem “Java Serileştirme” sayesinde olmaktadır.
  Nesnelerin içerisindeki değişkenlerin adları, tipleri değeleri byte’lara çevrilerek kaydedilir ve bu dosyayı nereye götürürsek götürelim JVM bu değerleri bir kayıp olmadan okuyup kullanabiliriz.
  Serileştirme işlemi için Java’nın Serializable sınıfını kullanıyoruz.
3.Serileştirme işlemi yapılırken nesne bilgileri byte olarak diske kaydedilir.
4.Serileştirme işlemi nesneleri ağ üzerinden taşımak için kullanılır.
5.Nesnenin byte olarak saklanmasına Serialization, bu byte verilerden tekrar nesne oluşturulmasına DeSerialization denir.

****Externalizable Arayüzü****
1.Eğer serileştirmek istediğimiz nesnenin her özelliğini serileştirmek istemiyorsak , bu yöntemi kullanmalıyız.
3.Başkalarının bilmemesi gereken yerler , serileştirme işlemine tabi tutulmazlar.
4.Okunmasını istediğimiz yerlerini readExternal() metodumuza parametre olarak göndereceğiz.
5.writeExternal() ilede serileştirmek istediğimiz yerleri bu metoda parametre olarak veririz.
6.Externalizable arayüzü kullanılarak Serializable arayüzünü kullanmaya  göre daha az disk alanı harcanır.




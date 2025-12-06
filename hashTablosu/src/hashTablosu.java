

public class hashTablosu
{   indis head;
    private int a;
    hashTablosu(int data)
    {
        head=null;
        hashTablosuOlustur(data);
    }
    void hashTablosuOlustur(int data)
    {
        while (a < data) {
        indis newindis = new indis(a);
        newindis.data=new Liste();
        if (head == null) {
            head = newindis;
        } else {
            indis temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newindis;

        }
        a++;
        }
      }



        void ekle(int deger)
       {
        int mod=deger%a;
        indis current=head;
        while (current!=null)
        {if (current.indisi==mod)
         {
            current.data.ekle(deger);
            return;
         }
         current=current.next;
        }
       }
    void goruntule()
    {

        System.out.println("==================================");
        System.out.printf("%-10s | %s\n", "İNDİS (a)", "ALT LİSTE İÇERİĞİ");
        System.out.println("----------------------------------");

        indis current = head;
        while (current != null)
        {
            // 1. Ana düğümün indis numarasını yazdır
            String indisNum = String.valueOf(current.indisi);

            // 2. O düğümün içindeki alt listenin içeriğini çağır
            String altListeIcerigi = current.data.goruntule();

            // Tablo formatında yazdır
            System.out.printf("%-10s | %s\n", indisNum, altListeIcerigi);

            current = current.next;
        }
        System.out.println("==================================");
    }

    }













class indis
{
    int indisi;
    Liste data;
    indis next;
    indis(int indisi)
    {this.indisi=indisi;}

}
class listeNodeu
{
    int data;
    listeNodeu next;
    listeNodeu(int data){this.data=data;}

}
class Liste
{   listeNodeu head;
    Liste()
    {
      head=null;
    }
    // Sona ekleme
    public void ekle(int data) {
        listeNodeu newNode = new listeNodeu(data);
        if (head == null) {
           head=newNode;
        } else {
            listeNodeu temp=head;

            while (temp.next!= null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public String goruntule() {
        if (head == null) {
            return "Boş";
        }
        StringBuilder sb = new StringBuilder();
        listeNodeu temp = head;
        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null) {
                sb.append(" -> ");
            }
            temp = temp.next;
        }
        return sb.toString();
    }


}
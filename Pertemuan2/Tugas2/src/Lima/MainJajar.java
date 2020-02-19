package Lima;

public class MainJajar {
    public static void main(String[] args) {
        JajarGenjang[] sgArray = new JajarGenjang[4];
        sgArray[0] = new JajarGenjang(10,4, 5);
        sgArray[1] = new JajarGenjang(20,10,6);
        sgArray[2] = new JajarGenjang(15,6,4);
        sgArray[3] = new JajarGenjang(25,10,3);
        for(int i=0; i<4; i++){
            System.out.println("Luas Jajar Genjang ke "+i+"= "+sgArray[i].hitungLuas());
            System.out.println("Keliling Jajar Genjang ke"+i+"= "+sgArray[i].hitungKeliling());
        }
    }
}

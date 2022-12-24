import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    private ArrayList <Arma> arsenale;
    private int dimensione = 0;

    public Inventario(){
        this.arsenale = new ArrayList<>();
    }
    public void aggiungiArma (Arma x){
        if (this.dimensione < 100) {
            (this.arsenale).add(x);
            dimensione++;
        }
        else
            System.out.println("Arsenale gia pieno (100/100).");
    }

    public void rimuoviArma (){

        if (this.dimensione == 0){
            System.out.println("Questo arsenale è vuoto.");
            return;
        }
        Scanner in = new Scanner(System.in);
        System.out.print("Nome dell'arma da rimuovere: ");
        String nome = in.nextLine();
        for (Arma i : arsenale){
            String inome = i.getNome();
            if (inome.equalsIgnoreCase(nome)){
                arsenale.remove(i);
                System.out.println(nome + " rimossa con successo.\n");
                dimensione--;
                return;
            }
        }
        System.out.println("Arma non trovata.\n");
    }

    public int getSize() {
        return dimensione;
    }

    public void plotAvg(){
        if (this.dimensione == 0){
            System.out.println("Questo arsenale è vuoto.");
            return;
        }

        int avgImpatto;
        int totImpatto = 0;
        int avgGittata;
        int totGittata = 0;
        int avgStabilita;
        int totStabilita = 0;
        int avgManegevolezza;
        int totManegevolezza = 0;
        int avgVelRicarica;
        int totVelRicarica = 0;
        int avgProPerMin;
        int totProPerMin = 0;
        int avgCapacita;
        int totCapacita = 0;
        
        for (Arma i : arsenale){
            totImpatto += i.getImpatto();
            totGittata += i.getGittata();
            totStabilita += i.getStabilita();
            totManegevolezza += i.getManegevolezza();
            totVelRicarica += i.getVelRicarica();
            totProPerMin += i.getProiettiliPerMin();
            totCapacita += i.getCaricatore();
        }

        avgImpatto = totImpatto/this.dimensione;
        avgGittata = totGittata/this.dimensione;
        avgStabilita = totStabilita/this.dimensione;
        avgManegevolezza = totManegevolezza/this.dimensione;
        avgVelRicarica = totVelRicarica/this.dimensione;
        avgProPerMin = totProPerMin/this.dimensione;
        avgCapacita = totCapacita/this.dimensione;

        System.out.println("\n0   10   20   30   40   50   60   70   80   90  100");
        System.out.println("|    |    |    |    |    |    |    |    |    |    |");
        for (int i = 0; i<(avgImpatto/2)+1; i++)
            System.out.print('*');
        System.out.println(" impatto");

        for (int i = 0; i<(avgGittata/2)+1; i++)
            System.out.print('*');
        System.out.println(" gittata");

        for (int i = 0; i<(avgStabilita/2)+1; i++)
            System.out.print('*');
        System.out.println(" stabilità");

        for (int i = 0; i<(avgManegevolezza/2)+1; i++)
            System.out.print('*');
        System.out.println(" manegevolezza");

        for (int i = 0; i<(avgVelRicarica/2)+1; i++)
            System.out.print('*');
        System.out.println(" velocità di ricarica");

        for (int i = 0; i<(avgProPerMin/2)+1; i++)
            System.out.print('*');
        System.out.println(" proiettili per minuto");

        for (int i = 0; i<(avgCapacita/2)+1; i++)
            System.out.print('*');
        System.out.println(" capacità");
        System.out.println();
    }

    public Arma cercaArma(String nome){
        for (Arma i : arsenale){
            if ((i.getNome()).equalsIgnoreCase(nome))
                return i;
        }
        System.out.println("Arma non trovata.");
        return null;
    }
}

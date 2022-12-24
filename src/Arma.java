import java.util.Scanner;

public class Arma {
    private int impatto;
    private int gittata;
    private int stabilita;
    private int manegevolezza;
    private int velRicarica;
    private int proiettiliPerMin;
    private int caricatore;

    private String nome;

    public Arma(){
        System.out.print("Nome arma: ");
        Scanner in = new Scanner(System.in);
        String nome = in.nextLine();
        this.nome = nome;
    }

    public void setup(){
        if (this.nome == null) {
            System.out.println("Prima di effettuare il setup richiedi un arma e dalle un nome");
            return;
        }

        Scanner in = new Scanner(System.in);

        System.out.println("\n--SETUP DELL'ARMA " + this.nome + " --");
        System.out.print("Impatto: ");
        int a = in.nextInt();
        this.impatto = a;
        System.out.print("Gittata: ");
        int b = in.nextInt();
        this.gittata = b;
        System.out.print("Stabilità: ");
        int c = in.nextInt();
        this.stabilita = c;
        System.out.print("Manegevolezza: ");
        int d = in.nextInt();
        this.manegevolezza = d;
        System.out.print("Velocità di Ricarica: ");
        int e = in.nextInt();
        this.velRicarica = e;
        System.out.print("Proiettili per minuto: ");
        int f = in.nextInt();
        this.proiettiliPerMin = f;
        System.out.print("Caricatore: ");
        int g = in.nextInt();
        this.caricatore = g;
        System.out.println("Setup di " + this.nome + " completato con successo!\n");

        //in.close();
    }

    public void getInfo(){
        System.out.print("Campo da visualizzare: ");
        Scanner in = new Scanner(System.in);
        String query = in.nextLine();

        if (query.equalsIgnoreCase("Impatto")){
            System.out.println("Impatto = " + this.impatto);
        }
        else if (query.equalsIgnoreCase("Gittata")){
            System.out.println("Gittata = " + this.gittata);
        }
        else if (query.equalsIgnoreCase("Stabilità")){
            System.out.println("Stabilità = " + this.stabilita);
        }
        else if (query.equalsIgnoreCase("Manegevolezza")){
            System.out.println("Manegevolezza = " + this.manegevolezza);
        }
        else if (query.equalsIgnoreCase("Velocità di ricarica")){
            System.out.println("Velocità di Ricarica = " + this.velRicarica);
        }
        else if (query.equalsIgnoreCase("Proiettili per minuto")){
            System.out.println("Proiettilii per Minuto = " + this.proiettiliPerMin);
        }
        else if (query.equalsIgnoreCase("Caricatore")){
            System.out.println("Caricatore = " + this.caricatore);
        }
        else System.out.println("Qualcosa è andato storto...controllare l'input.");
    }

    public void changeInfo(){
        System.out.print("Campo da modificare: ");
        Scanner in = new Scanner(System.in);
        String query = in.nextLine();

        if (query.equalsIgnoreCase("Impatto")){
            System.out.print("Nuovo impatto = ");
            int x = in.nextInt();
            this.impatto = x;
            System.out.println("Impatto modificato con successo.\n");
        }
        else if (query.equalsIgnoreCase("Gittata")){
            System.out.print("Nuova gittata = ");
            int x = in.nextInt();
            this.gittata = x;
            System.out.println("Gittata modificata con successo.\n");
        }
        else if (query.equalsIgnoreCase("Stabilità")){
            System.out.print("Nuova stabilità = ");
            int x = in.nextInt();
            this.stabilita = x;
            System.out.println("Stabilità modificata con successo.\n");
        }
        else if (query.equalsIgnoreCase("Manegevolezza")){
            System.out.print("Nuova manegevolezza = ");
            int x = in.nextInt();
            this.manegevolezza = x;
            System.out.println("Manegevolezza modificata con successo.\n");
        }
        else if (query.equalsIgnoreCase("Velocità di ricarica")){
            System.out.print("Nuova velocità di ricarica = ");
            int x = in.nextInt();
            this.velRicarica = x;
            System.out.println("Velocità di ricarica modificata con successo.\n");
        }
        else if (query.equalsIgnoreCase("Proiettili per minuto")){
            System.out.print("Nuovi proiettili per minuto = ");
            int x = in.nextInt();
            this.proiettiliPerMin = x;
            System.out.println("Proiettili per minuto modificati con successo.\n");
        }
        else if (query.equalsIgnoreCase("Caricatore")){
            System.out.print("Nuovo caricatore = ");
            int x = in.nextInt();
            this.caricatore = x;
            System.out.println("Caricatore modificato con successo.\n");
        }
        else System.out.print("Qualcosa è andato storto...controllare l'input.");
    }

    public String getNome(){
        return this.nome;
    }

    public int getImpatto() {
        return impatto;
    }

    public int getGittata() {
        return gittata;
    }

    public int getStabilita() {
        return stabilita;
    }

    public int getManegevolezza() {
        return manegevolezza;
    }

    public int getVelRicarica() {
        return velRicarica;
    }

    public int getProiettiliPerMin() {
        return proiettiliPerMin;
    }

    public int getCaricatore() {
        return caricatore;
    }
}

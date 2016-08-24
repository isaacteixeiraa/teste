package batalha;

import java.util.Scanner;
import superherois.SuperHeroi;
import superherois.SuperPoder;
import superherois.Vilao;
import superherois.Confronto;

public class Batalha {

    public static void main(String[] args) {
        int op = 0, forcah = 0, prisao = 0, forcav = 0;
        String sh = "", real = "", superpoderh = "";
        String vilao = "", realv ="", poderv="";
        boolean loop = true;
        
        Scanner rec = new Scanner(System.in);
        SuperHeroi sph = new SuperHeroi(null, null);
        SuperPoder poder = new SuperPoder(null, 0);
        Vilao vl = new Vilao(null, null, 0);

        while (loop == true) {
            System.out.println("[1]Criar super-hero [2]Criar vilão [3]Confronto [4]Sair");
            op = rec.nextInt();

            switch (op) {
                case 1: {
                    System.out.println("Informe o nome do super heroi");
                    sh = rec.next();
                    System.out.println("Informe o nome real do super heroi");
                    real = rec.next();
                    sph = new SuperHeroi(sh, real);

                    System.out.println("Qual o super poder");
                    superpoderh = rec.next();
                    System.out.println("Qual a força do super poder");
                    forcah = rec.nextInt();
                    poder = new SuperPoder(superpoderh, forcah);
                    sph.adicionarSuperPoder(poder);
                    break;
                }
                case 2: {
                    System.out.println("Informe o nome do vilão");
                    vilao = rec.next();
                    System.out.println("Informe o nome real do vilão");
                    realv = rec.next();
                    System.out.println("Tempo de prisão");
                    prisao = rec.nextInt();
                    vl = new Vilao(vilao, realv, prisao);

                    System.out.println("Qual o super poder");
                    poderv = rec.next();
                    System.out.println("Qual a força do super poder");
                    forcav = rec.nextInt();
                    poder = new SuperPoder(poderv, forcav);
                    vl.adicionarSuperPoder(poder);
                    break;
                }
                case 3: {
                    Confronto batalha = new Confronto();
                    
                    System.out.println(batalha.executar(sph, vl));
                    break;
                }
                case 4: {
                    loop = false;
                    break;
                }
            }
        }
    }

}

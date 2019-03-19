package art;
import java.util.Random;

public class Askisi3 {

        public static void main(String[] args) {

                int N = Integer.parseInt(args[0]);
                String s1 = args[1], s2 = args[2];
                move R, movement;
                con K, condition;
                techn t;
                mate m;

                if(s1.equals("impressionism")) R = move.impressionism;
                else if(s1.equals("expressionism")) R = move.expressionism;
                else R = move.naturalism;

                if(s2.equals("bad"))  K = con.bad;
                else if(s2.equals("good")) K = con.good;
                else K = con.excellent;

                System.out.println(R);
                System.out.println(K);

                Random rand = new Random();
                int painting = rand.nextInt(N);
                int sculpture = N - painting;
                System.out.println("Painting are "+painting+" Sculpture are "+sculpture);

                artifacts [] art = new artifacts[N];
                int I = 1;
		for(int i = 0 ; i < painting ; i++){
                        String result = String.format("Creator%d", I);
                        int year = rand.nextInt(2000);
                        int l = rand.nextInt(100) + 50;
                        int w = rand.nextInt(100) + 25;
                        int r = rand.nextInt(3);
                        if(r == 0)      movement = move.impressionism;
                        else if(r == 1) movement = move.expressionism;
                        else            movement = move.naturalism;
                        int r1 = rand.nextInt(3);
                        if(r1 == 0)     condition = con.bad;
                        else if(r1 == 1)condition = con.good;
                        else            condition = con.excellent;
                        int r2 = rand.nextInt(3);
                        if(r2 == 0)     t = techn.oil;
                        else if(r2 == 1)t = techn.aquarelle;
                        else            t = techn.tempera;
                        art[i] = new paintings(result,i+1,year,movement,condition,l,w,l*w,t);
                        I++;
                }

		for(int i = painting ; i < N ; i++){
                        String result = String.format("Creator%d", I);
                        int year = rand.nextInt(2000);
                        int r = rand.nextInt(3);
                        if(r == 0)      movement = move.impressionism;
                        else if(r == 1) movement = move.expressionism;
                        else            movement = move.naturalism;
                        int r1 = rand.nextInt(3);
                        if(r1 == 0)     condition = con.bad;
                        else if(r1 == 1)condition = con.good;
                        else            condition = con.excellent;
                        int r2 = rand.nextInt(3);
                        if(r2 == 0)     m = mate.iron;
                        else if(r2 == 1)m = mate.stone;
                        else            m = mate.wood;
                        int v = rand.nextInt(100) + 1000;
                        art[i] = new sculptures(result,i+1,year,movement,condition,v,m);
                        I++;
                }
                auction(art,N,R,K);
        }

        static void  auction(artifacts [] art, int N, move R, con K){
                System.out.println("\n");
                for(int i = 0 ; i < N ; i++){
                        art[i].getIndex();
                        art[i].getInfo();
                        if(art[i].evaluate(R,K) == true)
                                System.out.println("The artifact "+(i+1)+" is acceptable");
                        else
                                System.out.println("The artifact "+(i+1)+" is not acceptable");
			System.out.println("\n");
                }
        }
}


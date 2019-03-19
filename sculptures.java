package art;

class sculptures extends masterpiece {
        private int valume; // ogkos
        private mate material; // iliko

        sculptures(String Creat, int index,int year,move movement,con condition,int v,mate m){
                super(Creat,index,year,movement,condition);
                valume = v;
                material = m;
                System.out.println("Creating an instance of sculpture");
        }
        void getInfo(){
                super.getInfo();
                System.out.println("Valume is "+valume);
                System.out.println("Material is "+material);
        }
        boolean evaluate(move mov, con cond){
                if(cond == con.good && get_condition() == con.excellent) return false;
                if((mov ==  get_movement()) && (cond == get_condition()))
                                return true;
                        else
                                return false;
        }
        boolean evaluate(move mov){
                if(evaluate(mov,con.excellent)) return true;
                else return false;
        }
}


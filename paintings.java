package art;

class paintings extends masterpiece {
        private int length;
        private int width;
        private int surface;
        private techn technique;

        paintings(String Creator, int index,int year,move movement,con condition,int l,int w,int s,techn t){
                super(Creator,index,year,movement,condition);
                length = l;
                width = w;
                surface = s;
                technique = t;
                System.out.println("Creating an instance of painting");
        }
        void getInfo() {
                super.getInfo(); // aristourgimaton
                System.out.println("Length is "+length);
                System.out.println("Width is "+width);
                System.out.println("Technique is "+technique);
                System.out.println("Surface is "+surface);
        }
        boolean evaluate(move mov, con cond){
                        if((mov ==  get_movement()) && (get_condition() == con.excellent) && (cond == con.good))
                                return true;
                        if((mov ==  get_movement()) && (cond == get_condition()))
                                return true;
                        else
                                return false;
        }
	boolean evaluate(move mov){
                if(evaluate(mov,con.good)) return true;
                else return false;
        }
}


package art;

abstract class artifacts {
        private int index;
        private int year;
        private String creator;

        artifacts(String creator, int index,int year){
                this.index = index;
                this.creator = creator;
                this.year = year;
                System.out.println("Creating an instance of artifact");
        }
        void getInfo(){
                System.out.println("Creator is "+creator);
                System.out.println("Year of creation is "+year);
        }
        void getIndex(){ System.out.println("Index is "+index); }
        abstract boolean evaluate(move mov, con cond);
        abstract void set_condition(con condition);
}


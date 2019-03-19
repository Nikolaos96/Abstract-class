package art;

abstract class masterpiece extends artifacts {
        private move movement; // reuma
        private con condition; // katastasi

        masterpiece(String Creator,int index, int year,move movement, con condition){
                super(Creator,index,year);
                this.movement = movement;
                this.condition = condition;
                System.out.println("Creating an instance of masterpiece");
        }
        void getInfo(){
                super.getInfo();
                System.out.println("Movement is "+movement);
                System.out.println("Condition is "+condition);
        }
        move get_movement(){ return movement; }
        con  get_condition(){ return condition; }

        void set_condition(con condition){ this.condition = condition; }
}


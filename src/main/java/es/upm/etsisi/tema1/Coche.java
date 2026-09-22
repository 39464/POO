package es.upm.etsisi.tema1;

public class Coche {

        private String brand;
        private String model;
        private int year;

        public Coche(String brand, String model, int year){
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        public Coche(){ //abre la posibilidad de que el usuario no sepa los valores
            this.brand = "BRAND";
            this.model = "MODEL";
            this.year = 0;
        }

        public String getDescription(){ return (this.brand + " " + this.model + " ("+ this.year+")");}

        public void startCar(){ System.out.println("El coche ha arrancado"); }

        public int carAge(int currentYear){
            if(this.year < 0 || currentYear < 0) return 0;
            return currentYear - this.year;
        }

}


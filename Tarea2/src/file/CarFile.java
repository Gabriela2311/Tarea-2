package file;

import domain.Car;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class CarFile extends Car {

    //atributos 
    public RandomAccessFile randomAccessFile;
    private int regsQuantity; //cantidad de registros que tiene mi archivo
    private int regSize; //el tamaño en bytes de mis registrod(tamaño maximo lo define el programador)
    private String FilePath; //ruta del archivo

   

    //Constructor 
    public CarFile(File file) throws IOException {

        //guardar la ruta del archivo 
        this.FilePath = file.getPath();

        //tamaño máximo de cada registro en el archivo
        this.regSize = 160;

        //una validación básica de file 
        if (file.exists() && !file.isFile()) {

            throw new IOException(file.getName() + " is an invalid file");
        } else {
            //crear una nueva instancia de RAF 
            randomAccessFile = new RandomAccessFile(file, "rw");

            //necesitamos indicar cuantos registros tiene el archivo 
            this.regsQuantity = (int) Math.ceil((double) randomAccessFile.length() / (double) this.regSize);
        }

    }//end method 

    //metodo para insertar un vehículo en una posición específica 
    public boolean insertCar(int position, Car carToInsert) throws IOException {

        //validación de posición 
        if (position >= 0 && position <= this.regsQuantity) {

            //verificar que el tamaño sea el adecuado 
            if (carToInsert.sizeInBytes() > this.regSize) {
                System.err.println("101 - record size is too large");
                return false;
            } else {
                //escribir en el archivo
                randomAccessFile.seek(position * this.regSize);
                randomAccessFile.writeUTF(carToInsert.getName());
                randomAccessFile.writeInt(carToInsert.getYear());
                randomAccessFile.writeFloat(carToInsert.getMileaje());
                randomAccessFile.writeBoolean(carToInsert.isAmerican());
                randomAccessFile.writeInt(carToInsert.getSeries());
                return true;
            }
        } else {
            System.err.println("102 - position is out of bounds");
        }

        return true;
    }// end method 

    //método para insertar al final del archivo 
    public boolean addEndCar(Car car) throws IOException {

        boolean success = insertCar(this.regsQuantity, car);

        if (success) {

            ++this.regsQuantity;
        }

        return success;
    }

    //obtener vehiculo en una posicion especifica  
    public Car getCar(int position) throws IOException {
    
        //validar posición 
        if (position >= 0 && position <= this.regsQuantity) {
            //brazo en la posicion adecuada
            randomAccessFile.seek(position * this.regSize);
            //leemos los datos
            Car carTemp = new Car();
            carTemp.setName(randomAccessFile.readUTF());
            carTemp.setYear(randomAccessFile.readInt());
            carTemp.setMileaje(randomAccessFile.readFloat());
            carTemp.setAmerican(randomAccessFile.readBoolean());
            carTemp.setSeries(randomAccessFile.readInt());

            if (carTemp.getName().equals("vehicle removed")) {
                return null;
            } else {
                return carTemp;
            }
            
        } else {
            System.err.println("103 - position is out of bounds");
            return null;
        }

    }// end method

    //metodo para retornar todos los vehiculos 
    public List<Car> getCarList() throws IOException {
        
        //crear una instancia de ArrayList 
         List<Car> carsList = new ArrayList<>();
         
        //recorrer el arreglo para insertar la lista 
        for (int i = 0; i < this.regsQuantity; i++) {
            Car carTemp = this.getCar(i);

            //insertar el vehiculo en la lista 
            if (carTemp != null) {
                carsList.add(carTemp);
            }

        }
        return carsList;
    }//end method 

    // Metodo para borrar
    public boolean DeleteCar(int serie) throws IOException {

        Car carTemp;

        for (int i = 0; i < this.regsQuantity; i++) {

            carTemp = this.getCar(i);
            
            if (serie==0) {
            return false;
            }else if (carTemp.getSeries() == serie) {
                carTemp.setName("vehicle remove");
                carTemp.setSeries(0);

                return this.insertCar(i, carTemp);
            }// if 
        }//for
        return false;

    }// end method

    // Metodo para recibir serie al actualizar
    public boolean inPutSerie(int serie) throws IOException {

        Car carTemp;
        boolean aux = false;
        
        if (serie!=0) {
            for (int i = 0; i < this.regsQuantity; i++) {

            carTemp = this.getCar(i);
            
            if (carTemp.getSeries() == serie) {
                aux = true;
                return true;
                
            } else {
                 aux = false;
            }
        }// fin del for
        }
        
        return aux;

    }// end method
    
    // metodo que actualiza los datos
    public boolean Update(int serie, String name, int year, boolean amer) throws IOException {

        Car carTemp;

        for (int i = 0; i < this.regsQuantity; i++) {

            carTemp = this.getCar(i);

            if (carTemp.getSeries() == serie) {
                carTemp.setName(name);
                carTemp.setYear(year);
                carTemp.setAmerican(amer);

                return this.insertCar(i, carTemp);
            } else {
            }

        }
        return false;

    }// end method
    
    // 
    public Car getBySerie(int serie) throws IOException {

        Car carTemp=new Car();

        boolean aux = false;

        for (int i = 0; i < this.regsQuantity; i++) {

            carTemp = this.getCar(i);

            if (carTemp.getSeries() == serie) {
                aux = true;
                return carTemp;

            } else {
                aux = false;
            }

        }

        return carTemp;

    }// end method

    //ingresa la serie según el registro
    public int OutPutSerie() {

        int serie = this.regsQuantity+1;
        return serie;

    }    

}//end class


public class TVdevice extends Device {
    private int portsUSB;
    private int hourMax;


    public TVdevice() {
        super();
        this.portsUSB = 0;
        this.hourMax = 0;
    }
    public TVdevice(int id, Boolean status, String name, DeviceSpecs deviceSpecs, int portsUSB, int hourMax){
        super(id, status, name, deviceSpecs);
        this.portsUSB = portsUSB;
        this.hourMax = hourMax;
    }

    @Override
    public String toString(){
        String output = ""; 
        output = super.toString() +
            "Puertos USB: " + this.portsUSB + "\n" +
            "Hora Máxima de uso: " + this.hourMax + "\n";
        return output;
    }
}
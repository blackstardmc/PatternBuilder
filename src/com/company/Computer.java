package com.company;

public class Computer {
    private String cpu,graphicsCard,opticalDrive;
    private int ram,storage;


    public Computer(String cpu, String graphicsCard, String opticalDrive, int ram, int storage) {
        this.cpu = cpu;
        this.graphicsCard = graphicsCard;
        this.opticalDrive = opticalDrive;
        this.ram = ram;
        this.storage = storage;
    }

    public String getOpticalDrive() {
        return opticalDrive;
    }

    public void setOpticalDrive(String opticalDrive) {
        this.opticalDrive = opticalDrive;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}

class ComputerBuilder{
    private String cpu,graphicsCard,opticalDrive;
    private int ram,storage;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setOpticalDrive(String opticalDrive) {
        this.opticalDrive = opticalDrive;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Computer build(){
        return new Computer(cpu,graphicsCard,opticalDrive,ram,storage);
    }
}


class PCDirector{
    public Computer createGamerComputer(){
        ComputerBuilder computerBuilder=new ComputerBuilder();
        computerBuilder.setCpu("i7-8350H");
        computerBuilder.setGraphicsCard("Nvidia RTX 3080");
        computerBuilder.setOpticalDrive("Nvme.M2");
        computerBuilder.setRam(16);
        computerBuilder.setStorage(2000);
        return computerBuilder.build();
    }

    public Computer createWorkComputer(){
        ComputerBuilder computerBuilder=new ComputerBuilder();
        computerBuilder.setCpu("i3-10050H");
        computerBuilder.setGraphicsCard("Intel Graphics HD 4000");
        computerBuilder.setOpticalDrive("Toshiba Storage");
        computerBuilder.setRam(8);
        computerBuilder.setStorage(500);
        return computerBuilder.build();
    }
}





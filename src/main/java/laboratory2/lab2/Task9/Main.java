package laboratory2.lab2.Task9;


public class Main {
    public static void main(String[] args) {
        Conveyor conveyor = new Conveyor();

        StampingWorker stampingWorker = new StampingWorker(conveyor);
        AssemblyWorker assemblyWorker = new AssemblyWorker(conveyor);
        QualityControlWorker qualityControlWorker = new QualityControlWorker(conveyor);

        stampingWorker.start();
        assemblyWorker.start();
        qualityControlWorker.start();
    }
}


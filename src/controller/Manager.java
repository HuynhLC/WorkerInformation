package controller;

import Repository.WorkerRepository;
import java.util.ArrayList;
import model.History;
import model.Worker;
import view.Menu;

public class Manager extends Menu {

    private final WorkerRepository workerRepository;
    private ArrayList<Worker> lw;
    private ArrayList<History> lh;
    
    public Manager (String td, String[] mc, String exit) {
        super (td, mc, exit);
      
        lw = new ArrayList<>();
        lh = new ArrayList<>();
    
        workerRepository = new WorkerRepository();
    }

    @Override
    public void execute(int n){
        switch (n) {
            case 1:
                workerRepository.addWorker(lw);
                break;
            case 2:
                workerRepository.changeSalary(lw, lh, 1);
                break;
            case 3:
                workerRepository.changeSalary(lw, lh, 2);
                break;
            case 4:
                workerRepository.printListHistory(lh);
                break;
            case 5:
                System.exit(0);
        }
    }
    
}
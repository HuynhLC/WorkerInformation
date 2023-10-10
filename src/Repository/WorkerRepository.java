package Repository;

import DateAccess.WorkerDao;
import java.util.ArrayList;
import model.History;
import model.Worker;

public class WorkerRepository implements IWorkerRepository {
   
    @Override
    public void addWorker(ArrayList<Worker> lw) {
        WorkerDao.Instance().addWorker(lw);
    }

    @Override
    public void changeSalary(ArrayList<Worker> lw, ArrayList<History> lh, int status) {
        WorkerDao.Instance().changeSalary(lw, lh, status);
    }

    @Override
    public void printListHistory(ArrayList<History> lh) {
        WorkerDao.Instance().printListHistory(lh);
    }
}

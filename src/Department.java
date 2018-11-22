public class Department {

    private String workerName;
    private String workerPosition;
    private int workerAge;

    public Department() {
    }
    public Department(String workerName, String workerPosition, int workerAge) {
        this.workerName = workerName;
        this.workerPosition = workerPosition;
        this.workerAge = workerAge;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerPosition() {
        return workerPosition;
    }

    public void setWorkerPosition(String workerPosition) {
        this.workerPosition = workerPosition;
    }

    public int getWorkerAge() {
        return workerAge;
    }

    public void setWorkerAge(int workerAge) {
        this.workerAge = workerAge;
    }
}


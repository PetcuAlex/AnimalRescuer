package Homework;

public class Jobs {

    private String jobName;
    private int payday;
    private int rank;



    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public int getPayday() {
        return payday;
    }

    public void setPayday(int payday) {
        this.payday = payday;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return   " " + jobName + '\'' +
                ", payday " + payday + "$/day" +
                ", rank " + rank;
    }
}

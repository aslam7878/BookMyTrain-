public class Train {
    private int trainId ;
    private  String name;
  //  private int trainNumber;
    private String source;
    private String destination;
  //  private int arrivalTime;
 //    private  int departureTime;
 //   private  String trainType;
  //  private  String runningDay;
    private int totalSeats;
    private int availableSeats;
// constructor
    public Train(int trainId, String name,  String source, String destination, int totalSeats)
    {
        this.trainId = trainId;
          this.name = name;
        //this.trainNumber = trainNumber;
          this.source = source;
          this.destination = destination;
       // this.arrivalTime = arrivalTime;
       // this.departureTime = departureTime;
      //  this.trainType = trainType;
      //  this.runningDay = runningDay;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }
// getter setter
    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public String getTrainName() {
        return name;
    }

    public void setTrainName(String trainName) {
        this.name = trainName;
    }

   /* public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }
*/
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

   /* public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public String getTraintype() {
        return traintype;
    }

    public void setTraintype(String traintype) {
        this.traintype = traintype;
    }

    public String getRunningDay() {
        return runningDay;
    }

    public void setRunningDay(String runningDay) {
        this.runningDay = runningDay;
    }
*/
    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
 //logic
    public  boolean bookSeats(int count){
        if (count<=availableSeats){
            availableSeats-=count;
            return true;
        }

            return false;
        }

    public void cancelSeats(int count){
        availableSeats +=count;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainId=" + trainId +
                ", trainName='" + name + '\'' +
               // ", trainNumber=" + trainNumber +
                ", source='" + source + '\'' +
                ", destination=" + destination + '\'' +
              //  ", arrivalTime=" + arrivalTime +
              //  ", departureTime=" + departureTime +
              //  ", traintype='" + traintype + '\'' +
              //  ", runningDay='" + runningDay + '\'' +
                ", totalSeats=" + totalSeats +
                ", availableSeats=" + availableSeats +
                '}';
    }
}
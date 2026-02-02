
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookingService {
    private List<Train>trainList = new ArrayList<>();
    private  List<Ticket>ticketList = new ArrayList<>();
    public BookingService()
    {
        trainList.add(new Train(101, "Rajdhani Express","nagpur","Delhi",80));
        trainList.add(new Train(102, "Satabdi Express", "Lucknow","Agra",90));
        trainList.add(new Train(103, "VandeBharat Express", "nagpur","Lucknow",78));
        trainList.add(new Train(104, "Mumbai  Express",  "Mumbai","Chennai",70));
        trainList.add(new Train(105, "Chennai Express", "Goa","Bangla",85));
        trainList.add(new Train(106, "Frakka Express", "Pune","Aallahbad",95));
    }
    public List<Train> searchTrain( String source , String destination) {

            List<Train> res = new ArrayList<>();
            for (Train train : trainList) {
                if (train.getSource().equalsIgnoreCase(source) && train.getDestination().equalsIgnoreCase(destination)) {
                    res.add(train);
                }
            }
            return res;
        }

    public Ticket bookTicket( User user, int trainId ,int seatCount) {

        for (Train train : trainList) {
            if (train.getTrainId() == trainId) {
                if (train.bookSeats(seatCount)){
                    Ticket ticket = new Ticket(user,train,seatCount);
                    ticketList.add(ticket);
                    return ticket;
                }
            else {
                    System.out.println(" no enough Seat Available Here");
                    return null;
                }
            }
        }
        System.out.println("TrainId Not Found");
        return null;
    }

    public List<Ticket> getTicketByUser(User user ){
    List <Ticket>  res = new  ArrayList<>();
  for ( Ticket ticket : ticketList){
        if (ticket.getUser().getFullName().equalsIgnoreCase(user.getUsername())){
            res.add(ticket);
        }
        }
        return res;
    }

  public boolean cancelTicket( int tickedId ,User user ) {
      Iterator<Ticket>iterator = ticketList. listIterator();
      while( iterator.hasNext()) {
          Ticket ticket = iterator.next ();
          if( ticket.getTicketId()==tickedId &&
          ticket.getUser().getFullName().equalsIgnoreCase(user.getUsername())) {
              Train train = ticket.getTrain();
              train.cancelSeats(ticket.getSeatBooked());
              iterator.remove();
              System.out.println("Ticket"+ tickedId + " cancelled SuccesFully ");
              return true;
          }
      }
      System.out.println("Ticket not found or Does not Belong to current User ");
      return false;
  }

  public void listAllTrain() {
      System.out.println("List of All Train :");
      for (Train train:trainList) {
          System.out.println(train);
      }
  }
}

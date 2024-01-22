package classes;

public class Room {
    String roomType;
    int room;
    String dialouge;
    String[] options;

    //defined room based on where the user is in the game (usually for special rooms like bosses)
    public Room(String roomType, int room){
        //define roomType and room
        this.roomType = roomType;
        this.room = room;
        //get dialouge
        this.dialouge = roomDialouge();
        this.options = roomOptions();
    }
    //randomly generated room
    public Room(int room){

    }

    public String roomDialouge(){
        switch (roomType) {
            case "start":
                return "You awaken with nothing but scrap clothes on your back. The musky scent of death hangs in the air around you. There is only one way forward.";
            default:
                return "ERROR: Room Type is invalid!";
        }
    }

    public String[] roomOptions(){
        switch (roomType) {
            case "start":
                return new String[] {"f"};
            default:
                return new String[] {"ERROR: Room Type is invalid!"};
        }
    }
}

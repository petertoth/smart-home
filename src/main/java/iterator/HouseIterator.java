package iterator;

import java.util.Iterator;
import house.House;
import house.Room;

public class HouseIterator implements Iterator<Room> {
  private House house;
  private Room currentRoom;

  public HouseIterator(House house) {
    this.house = house;
  }

  public boolean hasNext() {
    if (houseIsEmpty()) { return false; }

    if (currentRoom == null) {
      this.currentRoom = this.house.getFloors().get(0).getRooms().get(0);
      return true;
    }

    int currentFloorIndex = this.house.getFloors().indexOf(currentRoom.getFloor());
    int currentRoomIndex = this.currentRoom.getFloor().getRooms().indexOf(currentRoom);

    while(currentFloorIndex < this.house.getFloors().size()) {
      if (currentRoomIndex + 1 < this.house.getFloors().get(currentFloorIndex).getRooms().size()) {
        this.currentRoom = this.house.getFloors().get(currentFloorIndex).getRooms().get(currentRoomIndex + 1);
        return true;
      }

      currentFloorIndex++;
      currentRoomIndex = -1;
    }

    return false;
  }

  public Room next() {
    return currentRoom;
//    if (currentRoom == null) {
//      if (house.floor(0).getRooms().isEmpty()) { return null; }
//
//      this.currentRoom = house.floor(0).getRooms().get(0);
//      return currentRoom;
//    }
//
//    return currentRoom;

//    int currentFloorIndex = this.house.getFloors().indexOf(currentRoom.getFloor());
//    int currentRoomIndex = this.currentRoom.getFloor().getRooms().indexOf(currentRoom);
//
//    while(currentFloorIndex < this.house.getFloors().size()) {
//      if (currentRoomIndex < this.house.getFloors().get(currentFloorIndex).getRooms().size()) {
//        return true;
//      }
//    }

//    return this.house.getFloors().get(currentFloorIndex).getRooms().get(currentRoomIndex+1);
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }

  private boolean houseIsEmpty() {
    if (house.floor(0).getRooms().isEmpty()) {
      return true;
    } else {
      return false;
    }
  }
}

package Garbage_Collector;

class DoorKnob {
}

class Door {
    private DoorKnob knob = new DoorKnob(); // knob trỏ tới new Obj DoorKnob()

    public DoorKnob getKnob() {
        return knob;
    }

    public void setKnob(DoorKnob knob) {
        this.knob = knob;
    }
}

class Room {

    private Door door = new Door(); // door trỏ tới new Obj Door()

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }
}

class Test_Garbage_Collector {

    public static void main(String[] args) {
        Door door = new Door();
        Room room = new Room();
        room.setDoor(door);
    }
}
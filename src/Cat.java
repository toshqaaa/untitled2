public class Cat {
    String name;
    String nameOfParent;
    String dateOfPresentation;
    int position;

    Cat(String name, String nameOfParent, String dateOfPresentation, int position){
        this.name = name;
        this.nameOfParent = nameOfParent;
        this.dateOfPresentation = dateOfPresentation;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfParent() {
        return nameOfParent;
    }

    public void setNameOfParent(String nameOfParent) {
        this.nameOfParent = nameOfParent;
    }

    public String getDateOfPresentation() {
        return dateOfPresentation;
    }

    public void setDateOfPresentation(String dateOfPresentation) {
        this.dateOfPresentation = dateOfPresentation;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Хозяин: " + getNameOfParent() + ", питомец: " + getName();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

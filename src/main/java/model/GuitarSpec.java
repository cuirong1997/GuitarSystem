package model;

public class GuitarSpec {

    String builder;
    String type;
    String style;
    int price;
    String topWood;
    String backWood;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }
    
    public String getBackWood() {
        return backWood;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public boolean matches(GuitarSpec guitarSpec,Guitar guitar){
        if(guitarSpec.getBuilder()!=null && !guitarSpec.getBuilder().equals("")
                && !guitar.getGuitarSpec().getBuilder().equals(guitarSpec.getBuilder())){
            return false;
        }
        if(guitarSpec.getStyle()!=null && !guitarSpec.getStyle().equals("")
                && !guitar.getGuitarSpec().getStyle().equals(guitarSpec.getStyle())){
            return false;
        }
        if(guitarSpec.getType()!=null && !guitarSpec.getType().equals("")
                && !guitar.getGuitarSpec().getType().equals(guitarSpec.getType())){
            return false;
        }
        return true;
    }
}

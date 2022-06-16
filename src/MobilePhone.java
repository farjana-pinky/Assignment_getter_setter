public class MobilePhone {

    private String brandName;
    private String colour;
    private int modelNo;

    public void setBrandName(String s){

        brandName = s;
    }

    public String getBrandName(){
        return brandName;

    }

    public void setColour(String s){

        colour = s;
    }

    public String getColour(){
        return colour;

    }

    public void setModelNo(int s){

        modelNo = s;
        if(modelNo<25 || modelNo>50)
        {
            System.out.println("value of modelNo to 0" );
        }
        else {

            System.out.println("value of modelNo is " +modelNo);
        }

    }

    public int getModelNo(){

        return modelNo;

    }

    public static void main(String[] args) {


        MobilePhone obj = new MobilePhone();
        obj.setBrandName("vivo");
        obj.setColour("blue,green,yellow");
        obj.setModelNo(70);
        System.out.println("Brand Name is " +obj.getBrandName());
        System.out.println("The colour is " +obj.getColour());
        System.out.println("return value is " +obj.getModelNo());



    }
}






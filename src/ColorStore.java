import java.util.HashMap;

public class ColorStore {


    public final static HashMap<String, Color> colors = new HashMap<>();

    static {
        System.out.println("I am being run at static block");
        Color red = new Color(255,0,0);
        colors.put("Red", red);
        colors.put("Green", new Color(0,255,0));
        colors.put("Blue", new Color(0,0,255));
    }

    public static Color getCopy(String color){
        Color original = colors.get(color);// prototype
        Color copy =  (Color)original.clone();// copy from prototype
        return copy;
    }

    public void addColor(int red,int green, int blue){

        String key = ("Red"+ red + "Green" + green + "Blue" + blue).toString();
        if(ColorStore.colors.containsKey(key)){
            System.out.println("Not Valid");
        }

        else {
            System.out.println("Add Color");
            ColorStore.colors.put(key,new Color(red, green, blue));
        }
    }
}
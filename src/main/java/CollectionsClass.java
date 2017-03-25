import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by fatimam on 20/03/2017.
 */
public class CollectionsClass

{
    public static void main(String[]args) {
    {
        CollectionsClass collectionsClass=new CollectionsClass();

        collectionsClass.listColors();
        collectionsClass.hashSetColors();
        collectionsClass.mapColorID();
    }

    }

    public String listColors () {
        String indexValue;
        List<String> listColors = new ArrayList<String>();

        listColors.add("Purple");
        listColors.add("Blue");
        listColors.add("Red");
        indexValue = listColors.get(1);
        return indexValue;
    }

  public Boolean hashSetColors() {
      HashSet<String> color = new HashSet<String>();
        Boolean selectedColour;
      // Adding colors to the HashSet
      color.add("Purple");
      color.add("Blue");
      color.add("Red");

      //demonstrating that duplication of values will only reflect once
      color.add("Yellow");
      color.add("Blue");
      selectedColour=color.contains("Yellow");
      System.out.println("HashSet colors: "+ color);
      return selectedColour;
  }

   /* public void mapColors() {
        HashSet<String> color = new HashSet<String>();


        // Adding colors to the HashSet
        color.add("Purple");
        color.add("Blue");
        color.add("Yellow");
        //demonstrating that duplication of values will only reflect once
        color.add("Yellow");
        color.add("Blue");

        color.contains("Yellow");
        System.out.println(color);
    }
'*/
    public String mapColorID()
    {
        HashMap<Integer, String> colorID = new HashMap<Integer, String>();
        String colourResult;

        colorID.put(1, "red");
        colorID.put(13, "yellow");
        colorID.put(8, "green");

        System.out.println("All the Colors and IDs: " + colorID);
        //get value by entering key
        System.out.println("The color is: "+colorID.get(8));
         colourResult=colorID.get(8);
        //Searching value exist
        System.out.println("The value exist: " + colorID.containsValue("green"));
        return colourResult;

    }

}









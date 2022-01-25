
/**
 * Write a description of class Appliances here.
 *
 * @author MUHAMMAD AMIRUL SYAFIQ BIN MOHD NOR (2020620108)
 * @version 1.0.0
 */
public class Appliances {
   private String name; // fan,microwave,blender
   private int watt;

   public Appliances(String name, int watt) {
      this.name = name;
      this.watt = watt;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setWatt(int watt) {
      this.watt = watt;
   }

   public String getName() {
      return name;
   }

   public int getWatt() {
      return watt;
   }

   public String toString() {
      return ("Name of appliances:" + name + "\nWatt:" + watt);
   }

}

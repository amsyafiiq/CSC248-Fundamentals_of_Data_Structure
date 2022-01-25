public class BSTAppliances {
   private TreeNode root;

   public BSTAppliances() {
      root = null;
   }

   public void insertNode(Appliances d) {
      if (root == null)
         root = new TreeNode(d);
      else
         root.insert(d);
   }

   // 7(b)(ii)-Dec2019:return the count of appliances that have watt more than 1000
   public int countHiPower() {
      return countHiPowerApp(root);
   }

   // recursive method that will count the number of appliances have watt more than
   // 1000
   public int countHiPowerApp(TreeNode node) {
      if (node == null)
         return 0;
      else if (node.data.getWatt() > 1000) {
         return 1 + countHiPowerApp(node.left) + countHiPowerApp(node.right);
      } else {
         return countHiPowerApp(node.left) + countHiPowerApp(node.right);
      }

   }
   // end of 7(b)(ii)

   // 7(b)(iii)-Dec2019:display the watt for the name of appliances pass through
   // parameter
   public void showWatt(String name) { // call the showWattApp() recursive method;
      showWattApp(root, name);
   }

   // complete the recursive method that will display the watt based on the
   // appliance name pass through parameter
   public void showWattApp(TreeNode node, String name) {
      if (node == null)
         return;

      if (node.data.getName().equalsIgnoreCase(name))
         System.out.println("Watt: " + node.data.getWatt());
      showWattApp(node.left, name);
      showWattApp(node.right, name);
   }
   // end of 7(b)(iii)

   // addition: find the sum of watt
   public int calcSum() { // call the calcSumApp() recursive method
      return calcSumApp(root);
   }

   // write the recursive method to calculate the sum of appliances watt in the
   // tree
   public int calcSumApp(TreeNode node) {
      if (node == null) {
         return 0;
      } else {
         return node.data.getWatt() + calcSumApp(node.left) + calcSumApp(node.right);
      }
   }

   // addition: sort and display the value of the tree
   // hint: sorting in BST is using inorder recursive display method
   public void inorder(TreeNode node) {
      if (node == null) {
         return;
      }

      inorder(node.left);
      System.out.println(node.data.toString());
      inorder(node.right);
   }

   public void print() {
      inorder(root);
   }
}

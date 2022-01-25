public class TreeNode {
   TreeNode left; // left node
   Appliances data; // data item
   TreeNode right; // right node

   public TreeNode(Appliances d) {
      data = d;
      left = right = null;
   }

   public void insert(Appliances d) {
      if (d.getWatt() < data.getWatt()) {
         if (left == null)
            left = new TreeNode(d);
         else
            left.insert(d);
      } else if (d.getWatt() > data.getWatt()) {
         if (right == null)
            right = new TreeNode(d);
         else
            right.insert(d);
      }
   }

}
public class IntArrayUtilTest{

  public static void main(String[] args){
    int[] a = {1,2,3,4,5,6,7,8};
    System.out.println(IntArrayUtil.toString(a));
    IntArrayUtil.reset(a);
    System.out.println(IntArrayUtil.toString(a));
    System.out.println(IntArrayUtil.toString(IntArrayUtil.createSequence(7)));
    System.out.println(IntArrayUtil.toString(IntArrayUtil.createSequence(-3)));
  }


}

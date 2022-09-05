public class ArrayDemo {
public static void main(String[] args) {

        int id[]=new int[]{1,2,3,5,6};
        String name[] =new String[]{"abc","cde","ggg","jkj","kyu"};
        double eng[]=new double[]{67,89,78,67,80};
        double hindi[]=new double[]{67,89,78,67,80};
        double phy[]=new double[]{67,89,78,67,80};
        double chem[]=new double[]{67,89,78,67,80};
        double bio[]=new double[]{67,89,78,67,80};
        double maths[]=new double[]{67,89,78,67,80};
        double total[];
    System.out.println("Roll No" + "\t\t" + "Name" + "\t\t" + "Eng" + "\t\t" +"Hindi" +"\t\t" + "\t\t" +"Phy" +"\t\t" + "Chem" + "\t\t" + "Bio" + "\t\t" + "Maths"+"\t\t" + "Total"+"\t\t"+"AVG");
    System.out.println("============================================================================================================================================");

    for(int i=0;i<=4;i++)
    {

        System.out.println(id[i] + "\t\t" + name[i] + "\t\t" + eng[i] + "\t\t" + hindi[i] +"\t\t" +phy[i] +"\t\t" + chem[i] + "\t\t" + bio[i] + "\t\t" +maths[i]+"\t\t" +
                (eng[i]+hindi[i] +phy[i]+chem[i]+bio[i]+maths[i]) + ((eng[i]+hindi[i] +phy[i]+chem[i]+bio[i]+maths[i])/6));
    }
// System.out.println();
}
}



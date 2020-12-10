import java.util.Date;

public class Account {
    private String name;
    private double balance;
    public Account(String t, double bl){
        name = t;
        balance = bl;
    }
    public Account(){

    }
    public void Add(double num){
        this.balance = this.balance + num;
    }
    public void hienthi(){
        System.out.println("tài khoản tên: "+name+" có số dư: " +balance);
    }
    /*public void hienthi(String pName, double bl){

    }*/

    public static void main(String[] args) {
        Account x = new Account("Dang Duong",50000);
        Account y = new Account();
        //y.name = " ";
        //y.balance = 40000;
        x.hienthi();
        y.hienthi();
        x.Add(500000);
        x.hienthi();

    }
}

package player;

import java.util.*;

public class Player {
    String name;
    String phno;
    String emailId;
    String addr;
    int age;
    public Player()
    {
        setPlayerDetails(name, phno, emailId, addr, age);
    }
    public void setPlayerDetails(String name,String phno,String emailId,String addr,int age)
    {
        this.name=name;
        this.phno=phno;
        this.emailId=emailId;
        this.addr=addr;
        this.age=age;
    }
    public void getPlayerDetails()
    {
        System.out.println("player name:"+this.name);
        System.out.println("player phno:"+this.phno);
        System.out.println("player emailid:"+this.emailId);
        System.out.println("player address:"+this.addr);
        System.out.println("player age:"+this.age);
    }
    public void setPlayerName(String name)
    {
        this.name=name;
    }
    public String getPlayerName()
    {
        return this.name;
    }
    public void setPlayerDetailsFromInput(Player p)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the player details");
        System.out.println("Enter the player name");
        String name=sc.nextLine();
        System.out.println("Enter the player contact no");
        String cno=sc.nextLine();
        System.out.println("Enter the player emailId");
        String mail=sc.nextLine();
        System.out.println("Enter the player address");
        String add=sc.nextLine();
        System.out.println("Enter the player age");
        int age=sc.nextInt();
        p.setPlayerDetails(name,cno,mail,add,age);
    }
}

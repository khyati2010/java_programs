package ques;
class Kid extends Person
{ 
    private void who()
    {
        System.out.println("Kid(who)");
    }
  
    public static void whoAmI()
    {
        System.out.println("Kid(whoAmI)");
    }
  
    public void whoAreYou()
    {
        who();
        System.out.println("Kid(whoAreYou)");
    }
}
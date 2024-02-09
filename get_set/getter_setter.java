package get_set;

class A{
    private int rollno;
    private String collegename;
    
    
    public A(int rollno,String collegename) {
        this.rollno = rollno;
        this.collegename=collegename;
    }


    public int get(){
        return rollno;
        
    }
    public void set(String collegename){
        this.collegename=collegename;
    }

    public String get2(){
        return collegename;
    }
    public void set2(String collegename){
        this.collegename=collegename;
    }

}








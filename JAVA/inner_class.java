class test{
    int n = 100;
    int m = 25;
    void fn(){
        System.out.println(n-m);
    }
}

class inner_class{
    test obj = new test(){
        void fn(){
            System.out.println(n+m);
        }
    };
    public static void main(String[] args) {
        //System.out.print("goin");
        inner_class obj2 = new inner_class();
        //System.out.println(obj2.obj.n);
        obj2.obj.fn();
    }
}


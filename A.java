public class A{
    private int A1;
    private float A2;

    public A(){}

    //metodo do caio
    public int getSoma(int a, int b){
        return a+b;
    }


    public void setA1(int x){
        this.A1 = x;
    }

    public void setA2(float y){
        this.A2 = y;
    }

    public int getA1(){
        return this.A1;
    }
    
    public float getA2(){
        return this.A2;
    }

    public void MA1(){
        System.out.println("Teste A");
    }
    
    public void MA2(){
        System.out.println("Teste A, mas metodo 2");
    }
    
    public void MA3(){
        System.out.println("Alteração a classe A partir do clone");
    }

    

}

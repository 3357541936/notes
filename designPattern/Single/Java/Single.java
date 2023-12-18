package designPattern.Single.Java;

public class Single {
    private Single instance = new Single();
    private Single(){}
    public Single getInstance(){
        return instance;
    }
}

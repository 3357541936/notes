package designPattern.Single.Java;

public class LazySingle {
    private LazySingle instance = null;
    private LazySingle(){}
    public LazySingle getInstance(){
        if (instance == null)
            instance = new LazySingle();
        return instance;
    }
}

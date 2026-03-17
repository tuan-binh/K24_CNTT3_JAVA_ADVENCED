package structural.adapter;

public class Main {
    public static void main(String[] args) {
        Android oppo = new Android();
        LightningToTypeCAdapter adapter = new LightningToTypeCAdapter(oppo);
        adapter.rechange();
    }
}

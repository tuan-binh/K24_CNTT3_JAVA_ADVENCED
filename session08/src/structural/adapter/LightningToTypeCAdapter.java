package structural.adapter;

public class LightningToTypeCAdapter implements Lightning{
    Android android;

    public LightningToTypeCAdapter(Android android) {
        this.android = android;
    }

    @Override
    public void rechange() {
        android.rechangeTypeC();
    }
}

package Chapter_5.RandomObjectsExamples;

import Chapter_5.Interfaces.ITelephone;

public class OfficePhone implements ITelephone {
    @Override
    public void dial(int phoneNumber) {

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        return false;
    }

    @Override
    public boolean IsRinging() {
        return false;
    }
}

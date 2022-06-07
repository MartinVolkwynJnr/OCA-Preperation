package Chapter_3;

public class ChapterThreeMain {
    public static void main(String[] args) {
        ChapterThreeMain ctm = new ChapterThreeMain();

//        ctm.StringManipulation();
//        ctm.UsingStringBuilder();
//        ctm.DateAndTimes();
//        ctm.EqualityUnderstanding();
        ctm.UnderstandingArrays();
        ctm.UnderstandingArrayLists();
    }

    private void StringManipulation() {
        StringManipulation sm = new StringManipulation();
        sm.ConcatenateStrings();
        sm.ImportantStringMethods();
    }

    private void UsingStringBuilder() {
        UsingOfStringBuilder sb = new UsingOfStringBuilder();
        sb.creatingStringBuilder();
        sb.ImportantStringBuilderMethods();
    }

    private void UnderstandingArrayLists() {
    }

    private void UnderstandingArrays() {
        UnderStandingArrays us = new UnderStandingArrays();
        us.createArraysOfPrimitives();
        us.createArraysOfReferenceVariables();
        us.usingArrays();
        us.sortingOfArrays();
        us.searchingArrays();
        us.multidimensionalArrays();
    }

    private void EqualityUnderstanding() {

    }

    private void DateAndTimes() {
        DatesAndTimes.printStringDates();
        DatesAndTimes.printCustomDates();
        DatesAndTimes.printLocalDates();
    }
}

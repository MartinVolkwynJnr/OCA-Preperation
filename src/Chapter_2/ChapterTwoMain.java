package Chapter_2;

public class ChapterTwoMain {
    public static void main(String[] args) {
        ChapterTwoMain ctm = new ChapterTwoMain();

//        ctm.javaOperators();
//        ctm.ifElseAndTernaryConstructs();
//        ctm.switchStatements();
        ctm.loopConstructs();
    }

    private void javaOperators(){
        JavaOperators jo = new JavaOperators();
        jo.printOperatorExamples();
        jo.casting();
        jo.logicalOperators();
    }

    private void ifElseAndTernaryConstructs(){
        JavaStatements js = new JavaStatements();
        js.ifElseStatements();
    }

    private void switchStatements(){
        JavaSwitchStatements jss = new JavaSwitchStatements();
        jss.runSwitch(3);
        jss.runSwitch(4);
        jss.runSwitch(2);
        jss.runSwitch(1);
        jss.runSwitch(5);
        jss.runSwitch(10);
    }

    private void loopConstructs(){
        /*
            while loops
            for loop and enhanced for loops
            do/while loops
            compare loop constructs
            use of break and continue
         */
        JavaLoops jl = new JavaLoops();
        //jl.whileLoop();
        jl.forLoop();
//        jl.enhancedForLoop();
//        jl.doWhileLoop();
    }
}

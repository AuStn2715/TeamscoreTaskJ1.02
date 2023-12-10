package Tasks.MicroTask1;
import java.util.Date;
public abstract class A {
    private String varA1 = "aaa";
    private int varA2;

    public void setVarA2(int varA2) {
        if (varA2 > 99) {
            this.varA2 = 99;
        } else if (varA2 < 0) {
            this.varA2 = 0;
        }
        else {
            this.varA2 = varA2;
        }
    }
    public int getVarA2() {
        return varA2;
    }

    public void setVarA1(String varA1) {
        this.varA1 = varA1;
    }
    public String getVarA1() {
        return varA1;
    }

    public int foo(Date dt) {
        return 0;
    }

    public void buzz() { }
}

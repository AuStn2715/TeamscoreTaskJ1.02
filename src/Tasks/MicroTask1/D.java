package Tasks.MicroTask1;

import java.util.Date;

public class D extends C {
    double varD1 = Math.E; // на схеме написано "+varD1: Е" иной трактовки как экспонента не знаю, но странно ее хранить переменной

    @Override
    public int foo(Date dt) {
        return 0;
    }
}

class E extends D {
    double varE1 = Math.E;

    public void bar() { }
    public void bar(int size) { }
}
package ru.spbstu.icc.kspt.graphicEditor;

import ru.spbstu.icc.kspt.graphicEditor.core.PaintedElement;

/**
 * @author Marinchenko V. A.
 */
public class SuperTester {

    public static void main(String[] args) {
        doNull(null);
    }

    public static void doNull(PaintedElement e){
        if(e == null){
            System.out.println(e);
        }
    }

    //OLD CODE
    /* BRUSH ELEMENT */
    //graphicsContext.fillOval((int) (event.getX() - width/2 + 1),(int) (event.getY() - width/2 + 1), width, width);

    /* INSTRUMENT */
    /*
     * Активные значения - общие переменные для классов-наследников, которые изменяются при работе программы
     */ /*
    protected static Instrument activeInstrument;
    protected static Color activeColor;
    protected static Color backgroundColor;
    protected static Integer lineWidth = 10;
    protected static TextField widthSetter;
    protected static Canvas deskCanvas;
    protected static Desk desk;
    */
}

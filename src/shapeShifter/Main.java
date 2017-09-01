// Annie Wong
// CS 111B

package shapeShifter;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {

        System.out.println("Vertical Line:");
        // create and use object to access a class
        draw drawObject = new draw();
        drawObject.drawLine();

        System.out.println("Rectangle:");
        drawObject.drawRectangle();

        System.out.println("Triangle:");
        drawObject.drawTriangle();

        System.out.println("Festive Tree:");
        drawObject.drawTriangle();
        drawObject.drawTriangle();
        drawObject.drawLine();

        System.out.println("House:");
        drawObject.drawTriangle();
        drawObject.drawRectangle();

        System.out.println("Beaker:");
        drawObject.drawLine();
        drawObject.drawTriangle();

        System.out.println("Popicle:");
        drawObject.drawRectangle();
        drawObject.drawLine();


    }
}

package customapplication.gl.com.customview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import static android.graphics.Region.Op.DIFFERENCE;
import static android.graphics.Region.Op.INTERSECT;


public class CustomView extends View {

    private final int paintColor = Color.BLACK;
    // defines paint and canvas
    private Paint drawPaint;
    float centerX = getWidth() / 2f+550;
    float centerY = getHeight() / 2f + 550;
    private Paint paintClear;


    public CustomView(Context context) {
        super(context);

        setupPaint();
    }

    // Setup paint with color and stroke styles
    private void setupPaint() {
        drawPaint = new Paint();  //instance of Paint for drawing circles
        drawPaint.setColor(paintColor);
        drawPaint.setAntiAlias(true);
        drawPaint.setStrokeWidth(7);
        drawPaint.setStyle(Paint.Style.STROKE);
        drawPaint.setStrokeJoin(Paint.Join.ROUND);
        drawPaint.setStrokeCap(Paint.Cap.ROUND);
        paintClear=new Paint();   //instance of Paint for coloring the intersection region
        paintClear.setStyle(Paint.Style.FILL);
        paintClear.setColor(Color.RED);

    }


    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(centerX-150, centerY, 200, drawPaint);
        drawPaint.setColor(Color.BLACK);
        canvas.drawCircle(centerX+150, centerY, 200, drawPaint);
        drawPaint.setColor(Color.BLACK);
        canvas.drawCircle(centerX, centerY+250, 200, drawPaint);
        Path pathA = new Path();
        pathA.addCircle(centerX-150, centerY, 200,Path.Direction.CW);
        Path pathB = new Path();
        pathB.addCircle(centerX+150, centerY, 200, Path.Direction.CW);
        canvas.clipPath(pathA);
        Path pathC=new Path();
        pathC.addCircle(centerX, centerY+250, 200,Path.Direction.CW);
        canvas.clipPath(pathB,INTERSECT);
        canvas.clipPath(pathC, DIFFERENCE);

        canvas.drawPath(pathA,paintClear);
        canvas.drawPath(pathB,paintClear);
        canvas.drawPath(pathC,paintClear);



    }
}

package o;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/* JADX INFO: renamed from: o.yqV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C57865yqV extends android.widget.ImageView {
    public int AEQbTJ;

    public C57865yqV(android.content.Context context, int i) {
        super(context);
        float f = getResources().getDisplayMetrics().density;
        this.AEQbTJ = (int) (3.5f * f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        setElevation(f * 4.0f);
        shapeDrawable.getPaint().setColor(i);
        setBackground(shapeDrawable);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setBackgroundColor(@androidx.annotation.ColorInt int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}

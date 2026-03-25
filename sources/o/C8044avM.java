package o;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: o.avM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8044avM extends android.widget.ImageView {
    public int AEQbTJ;
    public Animation.AnimationListener EZpvd;

    public final boolean OLrzqt() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAnimationListener(Animation.AnimationListener animationListener) {
        this.EZpvd = animationListener;
    }

    public C8044avM(android.content.Context context, int i) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.AEQbTJ = (int) (3.5f * f);
        if (OLrzqt()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            ViewCompat.setElevation(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new TaskDescription(this.AEQbTJ));
            ViewCompat.setLayerType(this, 1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.AEQbTJ, i3, i2, 503316480);
            int i4 = this.AEQbTJ;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        setBackgroundDrawable(shapeDrawable);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (OLrzqt()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.AEQbTJ * 2), getMeasuredHeight() + (this.AEQbTJ * 2));
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.EZpvd;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.EZpvd;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void setBackgroundColorRes(int i) {
        setBackgroundColor(ContextCompat.getColor(getContext(), i));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    /* JADX INFO: renamed from: o.avM$TaskDescription */
    /* JADX INFO: loaded from: classes14.dex */
    public class TaskDescription extends OvalShape {
        public android.graphics.Paint AEQbTJ = new android.graphics.Paint();
        public RadialGradient EZpvd;

        public TaskDescription(int i) {
            C8044avM.this.AEQbTJ = i;
            OLrzqt((int) rect().width());
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            OLrzqt((int) f);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(android.graphics.Canvas canvas, android.graphics.Paint paint) {
            float width = C8044avM.this.getWidth() / 2;
            float height = C8044avM.this.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.AEQbTJ);
            canvas.drawCircle(width, height, r0 - C8044avM.this.AEQbTJ, paint);
        }

        public final void OLrzqt(int i) {
            float f = i / 2;
            RadialGradient radialGradient = new RadialGradient(f, f, C8044avM.this.AEQbTJ, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.EZpvd = radialGradient;
            this.AEQbTJ.setShader(radialGradient);
        }
    }
}

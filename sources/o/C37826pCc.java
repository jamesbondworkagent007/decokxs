package o;

import android.graphics.drawable.GradientDrawable;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pCc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37826pCc extends android.widget.RelativeLayout {
    public float AEQbTJ;
    public int KWHzl;
    public float OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDownX(float f) {
        this.AEQbTJ = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDownY(float f) {
        this.OLrzqt = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37826pCc(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = 1;
        AEQbTJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37826pCc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = 1;
        AEQbTJ();
    }

    public final void AEQbTJ() {
        setBackground(copydefault());
    }

    public final void setPosition(int i) {
        this.copydefault = i;
        setBackground(copydefault());
    }

    public final void setThemeMode(int i) {
        this.KWHzl = i;
        setBackground(copydefault());
    }

    public final android.graphics.drawable.Drawable copydefault() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        float fEZpvd = C33052mpF.EZpvd(20, context);
        int i = this.copydefault;
        if (i == 0) {
            gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, fEZpvd, fEZpvd, fEZpvd, fEZpvd, 0.0f, 0.0f});
        } else if (i == 1) {
            gradientDrawable.setCornerRadii(new float[]{fEZpvd, fEZpvd, fEZpvd, fEZpvd, fEZpvd, fEZpvd, fEZpvd, fEZpvd});
        } else if (i == 2) {
            gradientDrawable.setCornerRadii(new float[]{fEZpvd, fEZpvd, 0.0f, 0.0f, 0.0f, 0.0f, fEZpvd, fEZpvd});
        }
        int i2 = this.KWHzl;
        if (i2 == 0) {
            gradientDrawable.setColor(C33070mpX.copydefault(C52761wXj.Activity.DcMfJKDCKfqP));
        } else if (i2 == 1) {
            gradientDrawable.setColor(C33070mpX.copydefault(C52761wXj.Activity.onComplete));
        }
        return gradientDrawable;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.AEQbTJ = motionEvent.getX();
            this.OLrzqt = motionEvent.getY();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.AEQbTJ = motionEvent.getX();
            this.OLrzqt = motionEvent.getY();
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 2) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }
}

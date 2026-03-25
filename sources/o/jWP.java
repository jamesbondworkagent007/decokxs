package o;

import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jWP extends android.widget.RelativeLayout {
    public float AEQbTJ;
    public float EZpvd;
    public int KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDownX(float f) {
        this.EZpvd = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDownY(float f) {
        this.AEQbTJ = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jWP(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jWP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd();
    }

    public final void EZpvd() {
        AEQbTJ();
    }

    public final void setPosition(int i) {
        if (this.KWHzl != i) {
            this.KWHzl = i;
            AEQbTJ();
        }
    }

    public final void AEQbTJ() {
        int i = this.KWHzl;
        setBackgroundResource(i != 0 ? (i == 1 || i != 2) ? C23274hvD.ActionBar.aKErDB : C23274hvD.ActionBar.dNCPSb : C23274hvD.ActionBar.UeEOUB);
        invalidate();
        requestLayout();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.EZpvd = motionEvent.getX();
            this.AEQbTJ = motionEvent.getY();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.EZpvd = motionEvent.getX();
            this.AEQbTJ = motionEvent.getY();
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 2) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }
}

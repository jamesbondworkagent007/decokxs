package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mUp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32238mUp extends android.widget.FrameLayout {
    public float AEQbTJ;
    public float EZpvd;
    public int copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32238mUp(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32238mUp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        return EZpvd(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean EZpvd(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.EZpvd = motionEvent.getX();
            this.AEQbTJ = motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (action == 2) {
            float fAbs = java.lang.Math.abs(motionEvent.getX() - this.EZpvd);
            float fAbs2 = java.lang.Math.abs(motionEvent.getY() - this.AEQbTJ);
            float f = this.copydefault;
            if (fAbs > f && fAbs > fAbs2) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (fAbs2 > f && fAbs2 > fAbs) {
                getParent().requestDisallowInterceptTouchEvent(false);
                return true;
            }
        } else if (action == 3) {
        }
        return false;
    }
}

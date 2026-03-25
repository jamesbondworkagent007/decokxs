package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wyL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C54116wyL extends android.widget.FrameLayout {
    public final int AEQbTJ;
    public float EZpvd;
    public boolean KWHzl;
    public float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C54116wyL(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:14) call: o.wyL.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C54116wyL(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54116wyL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.EZpvd = motionEvent.getX();
            this.copydefault = motionEvent.getY();
            this.KWHzl = false;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (actionMasked == 1) {
            this.KWHzl = false;
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (actionMasked == 2) {
            float x = motionEvent.getX() - this.EZpvd;
            float y = motionEvent.getY() - this.copydefault;
            if (!this.KWHzl) {
                if (java.lang.Math.abs(y) > java.lang.Math.abs(x) && java.lang.Math.abs(y) > this.AEQbTJ) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.KWHzl = true;
                } else if (java.lang.Math.abs(x) > java.lang.Math.abs(y) && java.lang.Math.abs(x) > this.AEQbTJ) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.KWHzl = true;
                }
            }
        } else if (actionMasked == 3) {
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}

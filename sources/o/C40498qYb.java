package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC40497qYa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qYb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C40498qYb extends android.widget.FrameLayout implements InterfaceC40497qYa {
    public final /* synthetic */ C40500qYd EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C40498qYb(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C40498qYb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40497qYa
    public java.lang.Boolean KWHzl(@NotNull android.view.ViewGroup viewGroup, android.view.View view, @NotNull android.view.MotionEvent motionEvent, boolean z) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(motionEvent, "");
        return this.EZpvd.KWHzl(viewGroup, view, motionEvent, z);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:35) call: o.qYb.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C40498qYb(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40498qYb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new C40500qYd();
    }

    private final android.view.View EZpvd() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        InterfaceC40497qYa.StateListAnimator.handleInterceptTouchEvent$default(this, this, EZpvd(), motionEvent, false, 8, null);
        return super.onInterceptTouchEvent(motionEvent);
    }
}

package o;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.business.dex.utils.CDNSourceManager;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ipy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25083ipy extends android.widget.FrameLayout {
    public android.view.View AEQbTJ;
    public ViewTreeObserver.OnGlobalLayoutListener EZpvd;
    public final java.lang.Runnable KWHzl;
    public final LottieAnimationView OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25083ipy(@NotNull android.content.Context context) {
        this(context, null, 0, null, 14, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25083ipy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25083ipy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static final void EZpvd(android.view.View view) {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("default_trade") : (r4v0 java.lang.String))
 A[MD:(android.content.Context, android.util.AttributeSet, int, java.lang.String):void (m)] (LINE:21) call: o.ipy.<init>(android.content.Context, android.util.AttributeSet, int, java.lang.String):void type: THIS */
    public /* synthetic */ C25083ipy(android.content.Context context, android.util.AttributeSet attributeSet, int i, java.lang.String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "default_trade" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25083ipy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, @NotNull java.lang.String str) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        this.OLrzqt = lottieAnimationView;
        this.KWHzl = new java.lang.Runnable() { // from class: o.ipB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C25083ipy.AEQbTJ(this.copydefault);
            }
        };
        this.copydefault = str;
        KWHzl();
        lottieAnimationView.setRepeatCount(-1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        Unit unit = Unit.INSTANCE;
        addView(lottieAnimationView, layoutParams);
        setOnClickListener(new View.OnClickListener() { // from class: o.ipF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C25083ipy.EZpvd(view);
            }
        });
    }

    public static final void AEQbTJ(C25083ipy c25083ipy) {
        c25083ipy.copydefault();
    }

    public final void KWHzl() {
        if (C22372heC.copydefault(this.copydefault)) {
            LottieAnimationView lottieAnimationView = this.OLrzqt;
            C22361hds.OLrzqt(lottieAnimationView, CDNSourceManager.LottieSource.DEX_SWAP_LOADING);
            lottieAnimationView.playAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        android.view.ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        this.OLrzqt.cancelAnimation();
        removeCallbacks(this.KWHzl);
        android.view.View view = this.AEQbTJ;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.EZpvd);
        }
        this.AEQbTJ = null;
    }

    public final void copydefault() {
        android.view.ViewParent parent = getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }
}

package o;

import com.airbnb.lottie.LottieAnimationView;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31699mAq;
import o.C7343ahz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.akw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C7499akw extends AbstractC57946yrx implements InterfaceC57933yrk {
    public android.widget.TextView EZpvd;
    public LottieAnimationView OLrzqt;

    /* JADX INFO: renamed from: o.akw$StateListAnimator */
    /* JADX INFO: loaded from: classes22.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RefreshState.values().length];
            try {
                iArr[RefreshState.PullDownToRefresh.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RefreshState.ReleaseToRefresh.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[RefreshState.RefreshFinish.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[RefreshState.PullDownCanceled.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7499akw(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:19) call: o.akw.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C7499akw(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7499akw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        android.widget.TextView textView;
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C7343ahz.Activity.getNewProxyInstance, (android.view.ViewGroup) this, true);
        this.OLrzqt = (LottieAnimationView) viewInflate.findViewById(C7343ahz.TaskDescription.uzCIH);
        this.EZpvd = (android.widget.TextView) viewInflate.findViewById(C7343ahz.TaskDescription.fFgQHt);
        C31699mAq.Application application = C31699mAq.Companion;
        if (application.OLrzqt() != -1 && (textView = this.EZpvd) != null) {
            textView.setText(application.OLrzqt());
        }
        LottieAnimationView lottieAnimationView = this.OLrzqt;
        if (lottieAnimationView != null) {
            lottieAnimationView.loop(true);
        }
    }

    public final void setLottieJson(@NotNull C7322ahe c7322ahe, @NotNull java.lang.String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(c7322ahe, "");
        Intrinsics.checkNotNullParameter(str, "");
        LottieAnimationView lottieAnimationView = this.OLrzqt;
        if (lottieAnimationView != null) {
            C7823arB.EZpvd(c7322ahe, lottieAnimationView, str);
            if (i > 0) {
                i = C33052mpF.dpInt$default(i, (android.content.Context) null, 1, (java.lang.Object) null);
            }
            lottieAnimationView.getLayoutParams().width = i;
            lottieAnimationView.getLayoutParams().height = C33052mpF.dpInt$default(i2, (android.content.Context) null, 1, (java.lang.Object) null);
        }
        android.widget.TextView textView = this.EZpvd;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57908yrL
    public void OLrzqt(@NotNull InterfaceC57934yrl interfaceC57934yrl, @NotNull RefreshState refreshState, @NotNull RefreshState refreshState2) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        Intrinsics.checkNotNullParameter(refreshState, "");
        Intrinsics.checkNotNullParameter(refreshState2, "");
        super.OLrzqt(interfaceC57934yrl, refreshState, refreshState2);
        int i = StateListAnimator.OLrzqt[refreshState2.ordinal()];
        if (i == 3 || i == 4) {
            LottieAnimationView lottieAnimationView = this.OLrzqt;
            if (lottieAnimationView != null) {
                lottieAnimationView.cancelAnimation();
            }
            LottieAnimationView lottieAnimationView2 = this.OLrzqt;
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.setProgress(0.0f);
            }
        }
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public void copydefault(boolean z, float f, int i, int i2, int i3) {
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        super.copydefault(z, f, i, i2, i3);
        if (!z || i <= i2 / 2 || (lottieAnimationView = this.OLrzqt) == null || lottieAnimationView.isAnimating() || (lottieAnimationView2 = this.OLrzqt) == null) {
            return;
        }
        lottieAnimationView2.playAnimation();
    }
}

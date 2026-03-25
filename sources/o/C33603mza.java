package o;

import android.widget.RelativeLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mza, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33603mza extends AbstractC57946yrx implements InterfaceC57933yrk {
    public C31699mAq OLrzqt;
    public RefreshState copydefault;

    /* JADX INFO: renamed from: o.mza$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RefreshState.values().length];
            try {
                iArr[RefreshState.ReleaseToRefresh.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RefreshState.Refreshing.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[RefreshState.RefreshFinish.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C33603mza() {
        this(null, null, 0, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C33603mza(android.content.Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C33603mza(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentView(@NotNull C31699mAq c31699mAq) {
        Intrinsics.checkNotNullParameter(c31699mAq, "");
        this.OLrzqt = c31699mAq;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:android.content.Context:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null android.content.Context) : (r2v0 android.content.Context))
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r3v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:14) call: o.mza.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C33603mza(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public C33603mza(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        KWHzl(context);
    }

    public final C31699mAq EZpvd() {
        C31699mAq c31699mAq = this.OLrzqt;
        if (c31699mAq != null) {
            return c31699mAq;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    private final void KWHzl(android.content.Context context) {
        setCurrentView(new C31699mAq(context, null, 0, 6, null));
        EZpvd().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        addView(EZpvd());
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57908yrL
    public void OLrzqt(@NotNull InterfaceC57934yrl interfaceC57934yrl, @NotNull RefreshState refreshState, @NotNull RefreshState refreshState2) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        Intrinsics.checkNotNullParameter(refreshState, "");
        Intrinsics.checkNotNullParameter(refreshState2, "");
        super.OLrzqt(interfaceC57934yrl, refreshState, refreshState2);
        this.copydefault = refreshState2;
        int i = StateListAnimator.AEQbTJ[refreshState2.ordinal()];
        if (i == 1) {
            EZpvd().gEmmrt();
        } else if (i == 2) {
            EZpvd().djBIcL();
        } else {
            if (i != 3) {
                return;
            }
            EZpvd().AYXKKw();
        }
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public void copydefault(boolean z, float f, int i, int i2, int i3) {
        float f2 = i / i3;
        if (this.copydefault != RefreshState.Refreshing) {
            C31699mAq c31699mAqEZpvd = EZpvd();
            if (f2 > 0.5f) {
                f2 = 0.5f;
            }
            c31699mAqEZpvd.EZpvd(f2);
        }
        super.copydefault(z, f, i, i2, i3);
    }

    public final void setLottieJson(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C31699mAq c31699mAqEZpvd = EZpvd();
        if (c31699mAqEZpvd != null) {
            c31699mAqEZpvd.setLottieJson(str);
        }
    }
}

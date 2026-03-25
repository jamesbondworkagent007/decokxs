package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kLp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28011kLp extends android.widget.FrameLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public java.lang.String EZpvd;
    public InterfaceC28006kLk OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28011kLp(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28011kLp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback(@NotNull InterfaceC28006kLk interfaceC28006kLk) {
        Intrinsics.checkNotNullParameter(interfaceC28006kLk, "");
        this.OLrzqt = interfaceC28006kLk;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.kLp.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C28011kLp(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28011kLp(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.kLl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28011kLp.EZpvd(context, this);
            }
        });
        this.EZpvd = "";
        wYC wyc = KWHzl().KWHzl;
        wyc.setOnClickListener(new StateListAnimator(wyc, 1000L, this));
        C55001xbh c55001xbhAkhnZx = KWHzl().EZpvd.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            C33606mzd.AEQbTJ(c55001xbhAkhnZx, new Function1() { // from class: o.kLm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28011kLp.OLrzqt(this.OLrzqt, (java.lang.CharSequence) obj);
                }
            });
        }
    }

    private final C21646hHb KWHzl() {
        return (C21646hHb) this.AEQbTJ.getValue();
    }

    public static final C21646hHb EZpvd(android.content.Context context, C28011kLp c28011kLp) {
        return C21646hHb.AEQbTJ(android.view.LayoutInflater.from(context), c28011kLp, true);
    }

    public static final Unit OLrzqt(C28011kLp c28011kLp, java.lang.CharSequence charSequence) {
        InterfaceC28006kLk interfaceC28006kLk = c28011kLp.OLrzqt;
        if (interfaceC28006kLk != null) {
            interfaceC28006kLk.EZpvd(c28011kLp.EZpvd, java.lang.String.valueOf(charSequence));
        }
        return Unit.INSTANCE;
    }

    public final void setData(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        KWHzl().EZpvd.setText(str2);
        KWHzl().EZpvd.setHintText(getContext().getString(C23274hvD.Fragment.seuMaA));
    }

    /* JADX INFO: renamed from: o.kLp$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C28011kLp EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C28011kLp c28011kLp) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c28011kLp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                InterfaceC28006kLk interfaceC28006kLk = this.EZpvd.OLrzqt;
                if (interfaceC28006kLk != null) {
                    interfaceC28006kLk.OLrzqt(this.EZpvd.EZpvd);
                }
            }
        }
    }
}

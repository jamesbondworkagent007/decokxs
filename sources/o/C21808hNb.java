package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Flow;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hNb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C21808hNb extends android.widget.RelativeLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public hGS valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21808hNb(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21808hNb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.hNb.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C21808hNb(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21808hNb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.hMZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21808hNb.DbNXlk(this.AEQbTJ);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.hNc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21808hNb.gEmmrt(this.EZpvd);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.hNg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21808hNb.values(this.EZpvd);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.hNh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21808hNb.AYXKKw(this.OLrzqt);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.hNf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21808hNb.valueOf(this.EZpvd);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.hNi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21808hNb.djBIcL(this.OLrzqt);
            }
        });
        this.valueOf = hGS.KWHzl(android.view.LayoutInflater.from(context), this, true);
    }

    private final AppCompatTextView AYXKKw() {
        return (AppCompatTextView) this.AhwBna.getValue();
    }

    public static final AppCompatTextView DbNXlk(C21808hNb c21808hNb) {
        hGS hgs = c21808hNb.valueOf;
        if (hgs == null) {
            Intrinsics.gEmmrt("");
            hgs = null;
        }
        AppCompatTextView appCompatTextView = hgs.djBIcL;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        return appCompatTextView;
    }

    private final AppCompatImageView KWHzl() {
        return (AppCompatImageView) this.EZpvd.getValue();
    }

    public static final AppCompatImageView gEmmrt(C21808hNb c21808hNb) {
        hGS hgs = c21808hNb.valueOf;
        if (hgs == null) {
            Intrinsics.gEmmrt("");
            hgs = null;
        }
        AppCompatImageView appCompatImageView = hgs.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        return appCompatImageView;
    }

    private final AppCompatTextView OLrzqt() {
        return (AppCompatTextView) this.copydefault.getValue();
    }

    public static final AppCompatTextView values(C21808hNb c21808hNb) {
        hGS hgs = c21808hNb.valueOf;
        if (hgs == null) {
            Intrinsics.gEmmrt("");
            hgs = null;
        }
        AppCompatTextView appCompatTextView = hgs.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        return appCompatTextView;
    }

    private final AppCompatTextView AEQbTJ() {
        return (AppCompatTextView) this.KWHzl.getValue();
    }

    public static final AppCompatTextView AYXKKw(C21808hNb c21808hNb) {
        hGS hgs = c21808hNb.valueOf;
        if (hgs == null) {
            Intrinsics.gEmmrt("");
            hgs = null;
        }
        AppCompatTextView appCompatTextView = hgs.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        return appCompatTextView;
    }

    private final C55320xhi copydefault() {
        return (C55320xhi) this.AEQbTJ.getValue();
    }

    public static final C55320xhi valueOf(C21808hNb c21808hNb) {
        hGS hgs = c21808hNb.valueOf;
        if (hgs == null) {
            Intrinsics.gEmmrt("");
            hgs = null;
        }
        C55320xhi c55320xhi = hgs.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55320xhi, "");
        return c55320xhi;
    }

    private final Flow EZpvd() {
        return (Flow) this.OLrzqt.getValue();
    }

    public static final Flow djBIcL(C21808hNb c21808hNb) {
        hGS hgs = c21808hNb.valueOf;
        if (hgs == null) {
            Intrinsics.gEmmrt("");
            hgs = null;
        }
        Flow flow = hgs.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(flow, "");
        return flow;
    }

    public final void setOrderSideMessage(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AYXKKw().setText(str);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25386ivj.loadImageWithBorder$default(KWHzl(), str, null, 2, null);
    }

    public final void setValue(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C24324ibg c24324ibgKWHzl = C24324ibg.Companion.KWHzl(C23273hvC.AEQbTJ.EZpvd(str, str2, " "));
        int i = C52761wXj.Activity.QwvEab;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        OLrzqt().setText(pTF.KWHzl.KWHzl(C24324ibg.addSpanWithColor$default(c24324ibgKWHzl, str2, C25382ivf.copydefault(i, context), 0, 4, null).AEQbTJ()));
    }

    public final void setValueColor(int i) {
        OLrzqt().setTextColor(i);
    }

    public final void setFailReasonMessage(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ().setText(str);
    }

    public final void setFailReasonClickMessage(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault().setText(str);
    }

    public final void setFailViewVisible(int i, boolean z) {
        EZpvd().setVisibility(i);
        if (i == 0) {
            if (z) {
                OLrzqt(i);
                AEQbTJ(8);
            } else {
                OLrzqt(0);
                AEQbTJ(0);
            }
        }
    }

    private final void OLrzqt(int i) {
        AEQbTJ().setVisibility(i);
    }

    private final void AEQbTJ(int i) {
        copydefault().setVisibility(i);
    }

    public final void setFailReasonClick(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        copydefault().setOnClickListener(new View.OnClickListener() { // from class: o.hNa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                function0.invoke();
            }
        });
    }
}

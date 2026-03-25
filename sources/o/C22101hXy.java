package o;

import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hXy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22101hXy extends android.widget.RelativeLayout {
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22101hXy(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22101hXy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.hXy.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C22101hXy(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22101hXy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.hXB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22101hXy.EZpvd(this.copydefault);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.hXA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22101hXy.KWHzl(this.copydefault);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.hXz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22101hXy.valueOf(this.OLrzqt);
            }
        });
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.DpxfQh, (android.view.ViewGroup) this, true);
    }

    private final AppCompatTextView AEQbTJ() {
        java.lang.Object value = this.EZpvd.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView EZpvd(C22101hXy c22101hXy) {
        return (AppCompatTextView) c22101hXy.findViewById(C23274hvD.Application.setVerticalMirror);
    }

    private final AppCompatTextView KWHzl() {
        java.lang.Object value = this.copydefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView KWHzl(C22101hXy c22101hXy) {
        return (AppCompatTextView) c22101hXy.findViewById(C23274hvD.Application.ActionBarDrawerToggleDelegate);
    }

    private final C24253iaO OLrzqt() {
        java.lang.Object value = this.KWHzl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C24253iaO) value;
    }

    public static final C24253iaO valueOf(C22101hXy c22101hXy) {
        return (C24253iaO) c22101hXy.findViewById(C23274hvD.Application.isChecked);
    }

    public final void setState(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (AEQbTJ(str)) {
            OLrzqt().setVisibility(0);
            AEQbTJ().setVisibility(8);
        } else {
            OLrzqt().setVisibility(8);
            AEQbTJ().setVisibility(0);
        }
        OLrzqt().setState(str);
    }

    public final void setValue(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C24324ibg c24324ibgKWHzl = C24324ibg.Companion.KWHzl(C23273hvC.AEQbTJ.EZpvd(str, str2, " "));
        int i = C52761wXj.Activity.QwvEab;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        AEQbTJ().setText(pTF.KWHzl.KWHzl(C24324ibg.addSpanWithColor$default(c24324ibgKWHzl, str2, C25382ivf.copydefault(i, context), 0, 4, null).AEQbTJ()));
    }

    public final void setExtraGas(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl().setText(str);
    }

    public final void setExtraGasVisible(int i) {
        KWHzl().setVisibility(i);
    }

    public final boolean AEQbTJ(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "-4") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "-3");
    }

    public final void setValueColor(int i) {
        AEQbTJ().setTextColor(i);
    }
}

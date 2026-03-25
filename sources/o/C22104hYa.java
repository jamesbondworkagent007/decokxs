package o;

import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hYa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22104hYa extends android.widget.RelativeLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22104hYa(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22104hYa(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: o.hYa.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C22104hYa(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22104hYa(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.hXX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22104hYa.copydefault(this.OLrzqt);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.hYc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22104hYa.gEmmrt(this.EZpvd);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.hYg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22104hYa.AEQbTJ(this.EZpvd);
            }
        });
        this.copydefault = "";
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.ilfrrN, (android.view.ViewGroup) this, true);
    }

    private final AppCompatTextView EZpvd() {
        java.lang.Object value = this.EZpvd.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView copydefault(C22104hYa c22104hYa) {
        return (AppCompatTextView) c22104hYa.findViewById(C23274hvD.Application.setVerticalMirror);
    }

    private final C24253iaO OLrzqt() {
        java.lang.Object value = this.KWHzl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C24253iaO) value;
    }

    public static final C24253iaO gEmmrt(C22104hYa c22104hYa) {
        return (C24253iaO) c22104hYa.findViewById(C23274hvD.Application.isChecked);
    }

    public static final hXZ AEQbTJ(C22104hYa c22104hYa) {
        return (hXZ) c22104hYa.findViewById(C23274hvD.Application.WindowCallbackWrapper);
    }

    private final hXZ copydefault() {
        java.lang.Object value = this.AEQbTJ.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (hXZ) value;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hYa */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initView$default(C22104hYa c22104hYa, java.lang.String str, java.lang.String str2, java.lang.String str3, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        c22104hYa.EZpvd(str, str2, str3, function1);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, final Function1<? super kotlin.Pair<java.lang.Long, java.lang.Long>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.copydefault = str;
        boolean z = Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "0") || str2.length() == 0;
        if ((AEQbTJ(str) || (OLrzqt(str) && z)) && function1 != null) {
            function1.invoke(C56390yDp.OLrzqt(-1L, -1L));
        }
        if (OLrzqt(str) && C23313hvq.valueOf(str2, "0")) {
            copydefault().setVisibility(8);
            OLrzqt().setVisibility(0);
            EZpvd().setVisibility(8);
        } else if (OLrzqt(str)) {
            copydefault().setOnCountDownCallback(new Function1() { // from class: o.hYd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C22104hYa.EZpvd(function1, this, (kotlin.Pair) obj);
                }
            });
            copydefault().copydefault(str2, str3);
            copydefault().setVisibility(0);
            OLrzqt().setVisibility(8);
            EZpvd().setVisibility(8);
        } else if (EZpvd(str)) {
            OLrzqt().setVisibility(0);
            copydefault().setVisibility(8);
            EZpvd().setVisibility(8);
        } else {
            OLrzqt().setVisibility(8);
            copydefault().setVisibility(8);
            EZpvd().setVisibility(0);
        }
        OLrzqt().setState(str);
    }

    public static final Unit EZpvd(Function1 function1, C22104hYa c22104hYa, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (function1 != null) {
            function1.invoke(pair);
        }
        if (((java.lang.Number) pair.getSecond()).longValue() == -1 && ((java.lang.Number) pair.getFirst()).longValue() == -1) {
            c22104hYa.copydefault().setVisibility(8);
            c22104hYa.OLrzqt().setVisibility(0);
            c22104hYa.EZpvd().setVisibility(8);
        }
        if (Intrinsics.EZpvd((java.lang.Object) c22104hYa.copydefault, (java.lang.Object) "-4") && ((java.lang.Number) pair.getFirst()).longValue() != -1) {
            c22104hYa.OLrzqt().copydefault(((java.lang.Number) pair.getFirst()).longValue());
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        copydefault().EZpvd();
    }

    public final void setValue(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C24324ibg c24324ibgKWHzl = C24324ibg.Companion.KWHzl(C23273hvC.AEQbTJ.EZpvd(str, str2, " "));
        int i = C52761wXj.Activity.QwvEab;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        EZpvd().setText(pTF.KWHzl.KWHzl(C24324ibg.addSpanWithColor$default(c24324ibgKWHzl, str2, C25382ivf.copydefault(i, context), 0, 4, null).AEQbTJ()));
    }

    public final boolean OLrzqt(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0");
    }

    public final boolean EZpvd(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "-4");
    }

    public final boolean AEQbTJ(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "-3");
    }

    public final void setValueColor(int i) {
        EZpvd().setTextColor(i);
    }
}

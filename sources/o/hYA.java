package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class hYA extends android.widget.RelativeLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hYA(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hYA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:19) call: o.hYA.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ hYA(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hYA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.hYx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hYA.valueOf(this.OLrzqt);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.hYB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hYA.djBIcL(this.KWHzl);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.hYF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hYA.values(this.EZpvd);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.hYC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hYA.gEmmrt(this.AEQbTJ);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.hYD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hYA.AkhnZx(this.OLrzqt);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.hYE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hYA.AhwBna(this.OLrzqt);
            }
        });
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.onLocationChanged, (android.view.ViewGroup) this, true);
    }

    private final AppCompatTextView AEQbTJ() {
        java.lang.Object value = this.EZpvd.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView valueOf(hYA hya) {
        return (AppCompatTextView) hya.findViewById(C23274hvD.Application.populateOptionsMenu);
    }

    private final AppCompatImageView copydefault() {
        java.lang.Object value = this.copydefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatImageView) value;
    }

    public static final AppCompatImageView djBIcL(hYA hya) {
        return (AppCompatImageView) hya.findViewById(C23274hvD.Application.MediaBrowserCompatMediaBrowserImpl);
    }

    private final C22101hXy valueOf() {
        java.lang.Object value = this.OLrzqt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C22101hXy) value;
    }

    public static final C22101hXy values(hYA hya) {
        return (C22101hXy) hya.findViewById(C23274hvD.Application.getNumericShortcut);
    }

    private final AppCompatTextView EZpvd() {
        java.lang.Object value = this.AEQbTJ.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView gEmmrt(hYA hya) {
        return (AppCompatTextView) hya.findViewById(C23274hvD.Application.removeAllTabs);
    }

    public static final C24331ibn AkhnZx(hYA hya) {
        return (C24331ibn) hya.findViewById(C23274hvD.Application.setActionProvider);
    }

    private final C24331ibn djBIcL() {
        java.lang.Object value = this.AhwBna.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C24331ibn) value;
    }

    public static final C22073hWx AhwBna(hYA hya) {
        return (C22073hWx) hya.findViewById(C23274hvD.Application.putInt);
    }

    private final C22073hWx OLrzqt() {
        java.lang.Object value = this.KWHzl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C22073hWx) value;
    }

    public final void setOrderSideMessage(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ().setText(str);
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25386ivj.loadImageWithBorder$default(copydefault(), str, null, 2, null);
    }

    public final void setChildOrderState(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        valueOf().setState(str);
    }

    public final void setValue(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        valueOf().setValue(str, str2);
    }

    public final void setValueColor(int i) {
        valueOf().setValueColor(i);
    }

    public final void setChainName(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd().setText(str);
    }

    public final void KWHzl(boolean z) {
        if (z) {
            djBIcL().EZpvd().setVisibility(8);
            djBIcL().setVisibility(0);
            djBIcL().setTimeOutDec(C33070mpX.AYXKKw(C23274hvD.Fragment.QVMIlxQVMIlx));
            return;
        }
        djBIcL().setVisibility(8);
    }

    public final void KWHzl() {
        djBIcL().setVisibility(8);
    }

    public final void setInstructionInfo(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull Function2<? super java.lang.String, ? super DexMultiChildOrderInfoVo, Unit> function2) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(function2, "");
        C25352ivB.setErrorCodeMsgView$default(OLrzqt(), dexMultiChildOrderInfoVo, function2, false, 4, null);
    }
}

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
public final class hYO extends android.widget.RelativeLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hYO(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hYO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:19) call: o.hYO.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ hYO(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hYO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.hYP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hYO.AhwBna(this.AEQbTJ);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.hYM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hYO.AYXKKw(this.OLrzqt);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.hYR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hYO.isConnected(this.AEQbTJ);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.hYT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hYO.valueOf(this.EZpvd);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.hYS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hYO.AkhnZx(this.KWHzl);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.hYU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hYO.djBIcL(this.EZpvd);
            }
        });
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.onStatusChanged, (android.view.ViewGroup) this, true);
    }

    public static final AppCompatTextView AhwBna(hYO hyo) {
        return (AppCompatTextView) hyo.findViewById(C23274hvD.Application.populateOptionsMenu);
    }

    private final AppCompatTextView OLrzqt() {
        java.lang.Object value = this.AEQbTJ.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatImageView AYXKKw(hYO hyo) {
        return (AppCompatImageView) hyo.findViewById(C23274hvD.Application.MediaBrowserCompatMediaBrowserImpl);
    }

    private final AppCompatImageView copydefault() {
        java.lang.Object value = this.OLrzqt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatImageView) value;
    }

    private final C22101hXy AhwBna() {
        java.lang.Object value = this.copydefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C22101hXy) value;
    }

    public static final C22101hXy isConnected(hYO hyo) {
        return (C22101hXy) hyo.findViewById(C23274hvD.Application.getNumericShortcut);
    }

    private final hXE AEQbTJ() {
        java.lang.Object value = this.EZpvd.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (hXE) value;
    }

    public static final hXE valueOf(hYO hyo) {
        return (hXE) hyo.findViewById(C23274hvD.Application.WindowCallbackWrapperApi24Impl);
    }

    public static final C24331ibn AkhnZx(hYO hyo) {
        return (C24331ibn) hyo.findViewById(C23274hvD.Application.setActionProvider);
    }

    private final C24331ibn valueOf() {
        java.lang.Object value = this.gEmmrt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C24331ibn) value;
    }

    private final C22073hWx KWHzl() {
        java.lang.Object value = this.KWHzl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C22073hWx) value;
    }

    public static final C22073hWx djBIcL(hYO hyo) {
        return (C22073hWx) hyo.findViewById(C23274hvD.Application.putInt);
    }

    public final void setOrderSideMessage(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt().setText(str);
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25386ivj.loadImageWithBorder$default(copydefault(), str, null, 2, null);
    }

    public final void setChildOrderState(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AhwBna().setState(str);
    }

    public final void setValue(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AhwBna().setValue(str, str2);
    }

    public final void setValueColor(int i) {
        AhwBna().setValueColor(i);
    }

    public final void setExtraGas(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AhwBna().setExtraGas(str);
    }

    public final void setExtraGasVisible(int i) {
        AhwBna().setExtraGasVisible(i);
    }

    public final void setInstructionInfo(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull Function2<? super java.lang.String, ? super DexMultiChildOrderInfoVo, Unit> function2) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(function2, "");
        AEQbTJ().setVisibility((!dexMultiChildOrderInfoVo.isShowInstructionView() || C25352ivB.setErrorCodeMsgView$default(KWHzl(), dexMultiChildOrderInfoVo, function2, false, 4, null)) ? 8 : 0);
        AEQbTJ().EZpvd(dexMultiChildOrderInfoVo, function2);
    }

    public final void EZpvd(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String str3 = z ? str : "";
        valueOf().EZpvd().setVisibility(8);
        valueOf().EZpvd(str3, false, z, str2, true);
    }

    public final void EZpvd() {
        valueOf().setVisibility(8);
    }
}

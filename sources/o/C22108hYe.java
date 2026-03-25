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

/* JADX INFO: renamed from: o.hYe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22108hYe extends android.widget.RelativeLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22108hYe(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22108hYe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: o.hYe.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C22108hYe(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22108hYe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.hYf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22108hYe.gEmmrt(this.OLrzqt);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.hYj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22108hYe.djBIcL(this.OLrzqt);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.hYi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22108hYe.AkhnZx(this.AEQbTJ);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.hYl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22108hYe.valueOf(this.copydefault);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.hYh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22108hYe.DbNXlk(this.AEQbTJ);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.hYk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22108hYe.AhwBna(this.KWHzl);
            }
        });
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.onProviderDisabled, (android.view.ViewGroup) this, true);
    }

    private final AppCompatTextView KWHzl() {
        java.lang.Object value = this.KWHzl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView gEmmrt(C22108hYe c22108hYe) {
        return (AppCompatTextView) c22108hYe.findViewById(C23274hvD.Application.populateOptionsMenu);
    }

    private final AppCompatImageView OLrzqt() {
        java.lang.Object value = this.OLrzqt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatImageView) value;
    }

    public static final AppCompatImageView djBIcL(C22108hYe c22108hYe) {
        return (AppCompatImageView) c22108hYe.findViewById(C23274hvD.Application.MediaBrowserCompatMediaBrowserImpl);
    }

    public static final C22101hXy AkhnZx(C22108hYe c22108hYe) {
        return (C22101hXy) c22108hYe.findViewById(C23274hvD.Application.getNumericShortcut);
    }

    private final C22101hXy copydefault() {
        java.lang.Object value = this.AEQbTJ.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C22101hXy) value;
    }

    private final hXE EZpvd() {
        java.lang.Object value = this.copydefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (hXE) value;
    }

    public static final hXE valueOf(C22108hYe c22108hYe) {
        return (hXE) c22108hYe.findViewById(C23274hvD.Application.WindowCallbackWrapperApi24Impl);
    }

    private final C22067hWr AhwBna() {
        java.lang.Object value = this.AYXKKw.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C22067hWr) value;
    }

    public static final C22067hWr DbNXlk(C22108hYe c22108hYe) {
        return (C22067hWr) c22108hYe.findViewById(C23274hvD.Application.setActionProvider);
    }

    private final C22073hWx AEQbTJ() {
        java.lang.Object value = this.EZpvd.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C22073hWx) value;
    }

    public static final C22073hWx AhwBna(C22108hYe c22108hYe) {
        return (C22073hWx) c22108hYe.findViewById(C23274hvD.Application.HJWChPOKBmQN);
    }

    public final void setOrderSideMessage(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl().setText(str);
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25386ivj.loadImageWithBorder$default(OLrzqt(), str, null, 2, null);
    }

    public final void setChildOrderState(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault().setState(str);
    }

    public final void setValue(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        copydefault().setValue(str, str2);
    }

    public final void setValueColor(int i) {
        copydefault().setValueColor(i);
    }

    public final void AEQbTJ(boolean z) {
        AhwBna().setVisibility(z ? 0 : 8);
        AhwBna().setTimeOutInfo();
    }

    public final void setTryTransactionAgain(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        AhwBna().EZpvd(function0);
    }

    public final void setAvailableUpdateInfo(boolean z) {
        AhwBna().setVisibility(z ? 0 : 8);
        AhwBna().setBalanceUpdateInfo();
    }

    public final void setInstructionInfo(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, boolean z, @NotNull Function2<? super java.lang.String, ? super DexMultiChildOrderInfoVo, Unit> function2) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(function2, "");
        boolean errorCodeMsgView$default = C25352ivB.setErrorCodeMsgView$default(AEQbTJ(), dexMultiChildOrderInfoVo, function2, false, 4, null);
        int i = 0;
        AEQbTJ().setVisibility(errorCodeMsgView$default ? 0 : 8);
        hXE hxeEZpvd = EZpvd();
        if (!dexMultiChildOrderInfoVo.isShowInstructionView() || errorCodeMsgView$default) {
            i = 8;
        } else {
            EZpvd().EZpvd(dexMultiChildOrderInfoVo, function2);
        }
        hxeEZpvd.setVisibility(i);
    }
}

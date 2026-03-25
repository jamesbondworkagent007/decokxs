package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.main.swap.history.bean.AccelerateBean;
import com.okinc.wallet.api.bean.WalletTxDetailBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class hXN extends android.widget.RelativeLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hXN(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hXN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:23) call: o.hXN.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ hXN(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hXN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.hXO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hXN.fetchVPNInfo(this.OLrzqt);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.hXV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hXN.AYXKKw(this.copydefault);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.hXT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hXN.AhwBna(this.AEQbTJ);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.hXU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hXN.isConnected(this.AEQbTJ);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.hXS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hXN.AkhnZx(this.copydefault);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.hXW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hXN.DbNXlk(this.KWHzl);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.hXY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hXN.gEmmrt(this.EZpvd);
            }
        });
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.HrFqwD, (android.view.ViewGroup) this, true);
        AYXKKw().EZpvd().setAccelerateSize(24);
    }

    public static final AppCompatTextView fetchVPNInfo(hXN hxn) {
        return (AppCompatTextView) hxn.findViewById(C23274hvD.Application.populateOptionsMenu);
    }

    private final AppCompatTextView valueOf() {
        java.lang.Object value = this.AEQbTJ.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatImageView AYXKKw(hXN hxn) {
        return (AppCompatImageView) hxn.findViewById(C23274hvD.Application.MediaBrowserCompatMediaBrowserImpl);
    }

    private final AppCompatImageView djBIcL() {
        java.lang.Object value = this.EZpvd.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatImageView) value;
    }

    public static final AppCompatImageView AhwBna(hXN hxn) {
        return (AppCompatImageView) hxn.findViewById(C23274hvD.Application.ICustomTabsServiceStub);
    }

    private final AppCompatImageView EZpvd() {
        java.lang.Object value = this.OLrzqt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatImageView) value;
    }

    private final C22101hXy gEmmrt() {
        java.lang.Object value = this.AYXKKw.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C22101hXy) value;
    }

    public static final C22101hXy isConnected(hXN hxn) {
        return (C22101hXy) hxn.findViewById(C23274hvD.Application.getNumericShortcut);
    }

    private final AppCompatTextView AhwBna() {
        java.lang.Object value = this.copydefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView AkhnZx(hXN hxn) {
        return (AppCompatTextView) hxn.findViewById(C23274hvD.Application.removeAllTabs);
    }

    private final C24331ibn AYXKKw() {
        java.lang.Object value = this.AhwBna.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C24331ibn) value;
    }

    public static final C24331ibn DbNXlk(hXN hxn) {
        return (C24331ibn) hxn.findViewById(C23274hvD.Application.dispatchGenericMotionEvent);
    }

    private final C22073hWx AEQbTJ() {
        java.lang.Object value = this.KWHzl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C22073hWx) value;
    }

    public static final C22073hWx gEmmrt(hXN hxn) {
        return (C22073hWx) hxn.findViewById(C23274hvD.Application.putInt);
    }

    public static /* synthetic */ void showOrHideDecView$default(hXN hxn, java.lang.String str, boolean z, boolean z2, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        hxn.AEQbTJ(str, z, z2, str2);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C24331ibn.showOrHideDecView$default(AYXKKw(), str, z, z2, str2, false, 16, null);
    }

    public final void OLrzqt() {
        AYXKKw().setVisibility(8);
    }

    public final void EZpvd(DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, boolean z) {
        if (dexMultiChildOrderInfoVo != null) {
            C24328ibk.updateState$default(AYXKKw().EZpvd(), new AccelerateBean(dexMultiChildOrderInfoVo.isShowSpeedUp(), dexMultiChildOrderInfoVo.isShowCancel(), dexMultiChildOrderInfoVo.isShowSpeedUpCancel(), "--", C22420hey.OLrzqt(dexMultiChildOrderInfoVo.getSwapTradeType())), dexMultiChildOrderInfoVo.getStatus(), z, null, 8, null);
        }
    }

    public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull WalletTxDetailBean walletTxDetailBean, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(walletTxDetailBean, "");
        C24328ibk.startSpeedUpTx$default(AYXKKw().EZpvd(), fragmentManager, walletTxDetailBean, null, yho, 4, null);
        C24328ibk.startCancelTx$default(AYXKKw().EZpvd(), fragmentManager, walletTxDetailBean, null, yho, 4, null);
        C24328ibk.startSpeedUpCancelTx$default(AYXKKw().EZpvd(), fragmentManager, walletTxDetailBean, null, yho, 4, null);
    }

    public final C24331ibn copydefault() {
        return AYXKKw();
    }

    public final void setOrderSideMessage(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        valueOf().setText(str);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25386ivj.loadImageWithBorder$default(djBIcL(), str, null, 2, null);
    }

    public final AppCompatImageView KWHzl() {
        return EZpvd();
    }

    public final void EZpvd(boolean z) {
        EZpvd().setVisibility(z ? 0 : 8);
    }

    public final void setChildOrderState(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        gEmmrt().setState(str);
    }

    public final void setValue(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        gEmmrt().setValue(str, str2);
    }

    public final void setValueColor(int i) {
        gEmmrt().setValueColor(i);
    }

    public final void setChainName(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AhwBna().setText(str);
    }

    public final void setInstructionInfo(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull Function2<? super java.lang.String, ? super DexMultiChildOrderInfoVo, Unit> function2) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(function2, "");
        C25352ivB.setErrorCodeMsgView$default(AEQbTJ(), dexMultiChildOrderInfoVo, function2, false, 4, null);
    }
}

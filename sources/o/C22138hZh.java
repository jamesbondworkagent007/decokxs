package o;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.main.swap.history.bean.AccelerateBean;
import com.okinc.business.dexlogic.main.swap.history.detail.DexOrderDetailViewModel;
import com.okinc.wallet.api.bean.WalletTxDetailBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hZh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22138hZh extends android.widget.RelativeLayout {
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22138hZh(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22138hZh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:23) call: o.hZh.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C22138hZh(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22138hZh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.hZn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22138hZh.djBIcL(this.AEQbTJ);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.hZm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22138hZh.valueOf(this.AEQbTJ);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.hZl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22138hZh.AhwBna(this.KWHzl);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.hZo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22138hZh.OLrzqt(this.OLrzqt);
            }
        });
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.aappFQ, (android.view.ViewGroup) this, true);
    }

    private final hYQ AEQbTJ() {
        java.lang.Object value = this.KWHzl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (hYQ) value;
    }

    public static final hYQ djBIcL(C22138hZh c22138hZh) {
        return (hYQ) c22138hZh.findViewById(C23274hvD.Application.dGrqPl);
    }

    private final C24328ibk KWHzl() {
        java.lang.Object value = this.EZpvd.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C24328ibk) value;
    }

    public static final C24328ibk valueOf(C22138hZh c22138hZh) {
        return (C24328ibk) c22138hZh.findViewById(C23274hvD.Application.zbGDDc);
    }

    public static final C22073hWx AhwBna(C22138hZh c22138hZh) {
        return (C22073hWx) c22138hZh.findViewById(C23274hvD.Application.putInt);
    }

    private final C22073hWx copydefault() {
        java.lang.Object value = this.OLrzqt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C22073hWx) value;
    }

    private final android.widget.LinearLayout EZpvd() {
        java.lang.Object value = this.copydefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (android.widget.LinearLayout) value;
    }

    public static final android.widget.LinearLayout OLrzqt(C22138hZh c22138hZh) {
        return (android.widget.LinearLayout) c22138hZh.findViewById(C23274hvD.Application.fTEjYi);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hZh */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initData$default(C22138hZh c22138hZh, DexOrderDetailViewModel dexOrderDetailViewModel, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, kotlin.Pair pair, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            pair = null;
        }
        c22138hZh.KWHzl(dexOrderDetailViewModel, dexMultiChildOrderInfoVo, pair);
    }

    public final void KWHzl(@NotNull DexOrderDetailViewModel dexOrderDetailViewModel, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, kotlin.Pair<java.lang.Long, java.lang.Long> pair) {
        Intrinsics.checkNotNullParameter(dexOrderDetailViewModel, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        if (dexMultiChildOrderInfoVo.isSuccess()) {
            DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2 = dexOrderDetailViewModel.AhwBna().get(1);
            Intrinsics.checkNotNullExpressionValue(dexMultiChildOrderInfoVo2, "");
            AEQbTJ().EZpvd(dexOrderDetailViewModel, dexMultiChildOrderInfoVo2, true, pair);
            return;
        }
        AEQbTJ().EZpvd(dexOrderDetailViewModel, dexMultiChildOrderInfoVo, false, pair);
    }

    public final void OLrzqt(boolean z) {
        if (z) {
            EZpvd().setVisibility(8);
        }
    }

    public final void setInstructionInfo(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull Function2<? super java.lang.String, ? super DexMultiChildOrderInfoVo, Unit> function2) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(function2, "");
        EZpvd().setVisibility(C25352ivB.KWHzl(copydefault(), dexMultiChildOrderInfoVo, function2, true) ? 8 : 0);
    }

    public final void setAccelerateViewSize(int i) {
        KWHzl().setAccelerateSize(i);
    }

    public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull WalletTxDetailBean walletTxDetailBean, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(walletTxDetailBean, "");
        C24328ibk.startSpeedUpTx$default(KWHzl(), fragmentManager, walletTxDetailBean, null, yho, 4, null);
        C24328ibk.startCancelTx$default(KWHzl(), fragmentManager, walletTxDetailBean, null, yho, 4, null);
        C24328ibk.startSpeedUpCancelTx$default(KWHzl(), fragmentManager, walletTxDetailBean, null, yho, 4, null);
    }

    public static /* synthetic */ void updateAccelerateState$default(C22138hZh c22138hZh, AccelerateBean accelerateBean, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str2 = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        c22138hZh.EZpvd(accelerateBean, str, z, str2);
    }

    public final void EZpvd(@NotNull AccelerateBean accelerateBean, @NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(accelerateBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        KWHzl().copydefault(accelerateBean, str, z, str2);
    }
}

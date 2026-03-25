package o;

import androidx.appcompat.widget.LinearLayoutCompat;
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

/* JADX INFO: loaded from: classes18.dex */
public final class hZD extends android.widget.RelativeLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hZD(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hZD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:23) call: o.hZD.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ hZD(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hZD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.hZz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hZD.gEmmrt(this.KWHzl);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.hZC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hZD.valueOf(this.OLrzqt);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.hZG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hZD.OLrzqt(this.OLrzqt);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.hZH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hZD.AhwBna(this.EZpvd);
            }
        });
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.GiPPlLgiPPlL, (android.view.ViewGroup) this, true);
    }

    private final hZN AEQbTJ() {
        java.lang.Object value = this.OLrzqt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (hZN) value;
    }

    public static final hZN gEmmrt(hZD hzd) {
        return (hZN) hzd.findViewById(C23274hvD.Application.dGrqPl);
    }

    private final C24328ibk copydefault() {
        java.lang.Object value = this.KWHzl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C24328ibk) value;
    }

    public static final C24328ibk valueOf(hZD hzd) {
        return (C24328ibk) hzd.findViewById(C23274hvD.Application.zbGDDc);
    }

    private final LinearLayoutCompat EZpvd() {
        java.lang.Object value = this.EZpvd.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (LinearLayoutCompat) value;
    }

    public static final LinearLayoutCompat OLrzqt(hZD hzd) {
        return (LinearLayoutCompat) hzd.findViewById(C23274hvD.Application.fTEjYi);
    }

    public static final C22073hWx AhwBna(hZD hzd) {
        return (C22073hWx) hzd.findViewById(C23274hvD.Application.putInt);
    }

    private final C22073hWx OLrzqt() {
        java.lang.Object value = this.AEQbTJ.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C22073hWx) value;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.hZD */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initData$default(hZD hzd, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3, DexOrderDetailViewModel dexOrderDetailViewModel, kotlin.Pair pair, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            pair = null;
        }
        hzd.copydefault(dexMultiChildOrderInfoVo, dexMultiChildOrderInfoVo2, dexMultiChildOrderInfoVo3, dexOrderDetailViewModel, pair);
    }

    public final void copydefault(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3, @NotNull DexOrderDetailViewModel dexOrderDetailViewModel, kotlin.Pair<java.lang.Long, java.lang.Long> pair) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo2, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo3, "");
        Intrinsics.checkNotNullParameter(dexOrderDetailViewModel, "");
        AEQbTJ().AEQbTJ(dexMultiChildOrderInfoVo, dexMultiChildOrderInfoVo2, dexMultiChildOrderInfoVo3, dexOrderDetailViewModel, pair);
    }

    public final void setAccelerateViewSize(int i) {
        copydefault().setAccelerateSize(i);
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull WalletTxDetailBean walletTxDetailBean, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(walletTxDetailBean, "");
        C24328ibk.startSpeedUpTx$default(copydefault(), fragmentManager, walletTxDetailBean, null, yho, 4, null);
        C24328ibk.startCancelTx$default(copydefault(), fragmentManager, walletTxDetailBean, null, yho, 4, null);
        C24328ibk.startSpeedUpCancelTx$default(copydefault(), fragmentManager, walletTxDetailBean, null, yho, 4, null);
    }

    public static /* synthetic */ void updateAccelerateState$default(hZD hzd, AccelerateBean accelerateBean, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str2 = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        hzd.EZpvd(accelerateBean, str, z, str2);
    }

    public final void EZpvd(@NotNull AccelerateBean accelerateBean, @NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(accelerateBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        copydefault().copydefault(accelerateBean, str, z, str2);
    }

    public final void setInstructionInfo(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull Function2<? super java.lang.String, ? super DexMultiChildOrderInfoVo, Unit> function2) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(function2, "");
        EZpvd().setVisibility(C25352ivB.KWHzl(OLrzqt(), dexMultiChildOrderInfoVo, function2, true) ? 8 : 0);
    }
}

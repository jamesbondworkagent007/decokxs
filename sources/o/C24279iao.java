package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.main.swap.history.bean.AccelerateBean;
import com.okinc.business.dexlogic.main.swap.history.detail.DexOrderDetailViewModel;
import com.okinc.business.dexui.main.swap.history.detail.widget.childorder.two.TwoCrossOrderChildInfoPackUpView;
import com.okinc.wallet.api.bean.WalletTxDetailBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24279iao extends android.widget.RelativeLayout {
    public final hFL copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24279iao(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24279iao(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.iao.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C24279iao(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24279iao(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        hFL hflKWHzl = hFL.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(hflKWHzl, "");
        this.copydefault = hflKWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.iao */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initData$default(C24279iao c24279iao, DexOrderDetailViewModel dexOrderDetailViewModel, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3, kotlin.Pair pair, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            pair = null;
        }
        c24279iao.KWHzl(dexOrderDetailViewModel, dexMultiChildOrderInfoVo, dexMultiChildOrderInfoVo2, dexMultiChildOrderInfoVo3, pair);
    }

    public final void KWHzl(@NotNull DexOrderDetailViewModel dexOrderDetailViewModel, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3, kotlin.Pair<java.lang.Long, java.lang.Long> pair) {
        Intrinsics.checkNotNullParameter(dexOrderDetailViewModel, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo2, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo3, "");
        if (dexMultiChildOrderInfoVo.isOpenPackUpViewStatus()) {
            this.copydefault.AEQbTJ.KWHzl(dexOrderDetailViewModel, dexMultiChildOrderInfoVo, TwoCrossOrderChildInfoPackUpView.PackInfoType.From, pair);
        } else if (dexMultiChildOrderInfoVo2.isOpenPackUpViewStatus()) {
            this.copydefault.AEQbTJ.KWHzl(dexOrderDetailViewModel, dexMultiChildOrderInfoVo2, TwoCrossOrderChildInfoPackUpView.PackInfoType.Bridge, pair);
        } else if (dexMultiChildOrderInfoVo3.isOpenPackUpViewStatus()) {
            this.copydefault.AEQbTJ.KWHzl(dexOrderDetailViewModel, dexMultiChildOrderInfoVo3, TwoCrossOrderChildInfoPackUpView.PackInfoType.To, pair);
        }
    }

    public final void KWHzl(boolean z) {
        if (z) {
            this.copydefault.EZpvd.setVisibility(8);
        }
    }

    public final void setInstructionInfo(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, @NotNull Function2<? super java.lang.String, ? super DexMultiChildOrderInfoVo, Unit> function2) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        C22073hWx c22073hWx = this.copydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c22073hWx, "");
        boolean zKWHzl = C25352ivB.KWHzl(c22073hWx, dexMultiChildOrderInfoVo, function2, true);
        if (!zKWHzl) {
            C22073hWx c22073hWx2 = this.copydefault.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c22073hWx2, "");
            zKWHzl = C25352ivB.KWHzl(c22073hWx2, dexMultiChildOrderInfoVo2, function2, true);
        }
        LinearLayoutCompat linearLayoutCompat = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(zKWHzl ? 8 : 0);
    }

    public final void setAccelerateViewSize(int i) {
        this.copydefault.copydefault.setAccelerateSize(i);
    }

    public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull WalletTxDetailBean walletTxDetailBean, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(walletTxDetailBean, "");
        C24328ibk.startSpeedUpTx$default(this.copydefault.copydefault, fragmentManager, walletTxDetailBean, null, yho, 4, null);
        C24328ibk.startCancelTx$default(this.copydefault.copydefault, fragmentManager, walletTxDetailBean, null, yho, 4, null);
        C24328ibk.startSpeedUpCancelTx$default(this.copydefault.copydefault, fragmentManager, walletTxDetailBean, null, yho, 4, null);
    }

    public static /* synthetic */ void updateAccelerateState$default(C24279iao c24279iao, AccelerateBean accelerateBean, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str2 = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        c24279iao.AEQbTJ(accelerateBean, str, z, str2);
    }

    public final void AEQbTJ(@NotNull AccelerateBean accelerateBean, @NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(accelerateBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault.copydefault.copydefault(accelerateBean, str, z, str2);
    }
}

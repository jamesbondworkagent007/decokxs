package o;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.main.swap.history.bean.AccelerateBean;
import com.okinc.business.dexlogic.main.swap.history.detail.DexOrderDetailViewModel;
import com.okinc.wallet.api.bean.WalletTxDetailBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iaj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24274iaj extends android.widget.RelativeLayout {
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm copydefault;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24274iaj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24274iaj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24274iaj(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24274iaj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.iaq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24274iaj.EZpvd(this.copydefault);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.iap
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24274iaj.OLrzqt(this.AEQbTJ);
            }
        });
        AEQbTJ();
    }

    private final C24266iab copydefault() {
        java.lang.Object value = this.copydefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C24266iab) value;
    }

    public static final C24266iab EZpvd(C24274iaj c24274iaj) {
        return (C24266iab) c24274iaj.findViewById(C23274hvD.Application.gZKUVK);
    }

    private final hZS EZpvd() {
        java.lang.Object value = this.KWHzl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (hZS) value;
    }

    public static final hZS OLrzqt(C24274iaj c24274iaj) {
        return (hZS) c24274iaj.findViewById(C23274hvD.Application.zblBkD);
    }

    public final void AEQbTJ() {
        android.view.LayoutInflater.from(getContext()).inflate(C23274hvD.Activity.GzAsTt, (android.view.ViewGroup) this, true);
    }

    public final void OLrzqt(@NotNull final DexOrderDetailViewModel dexOrderDetailViewModel, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, @NotNull java.lang.String str, Function1<? super kotlin.Pair<java.lang.Long, java.lang.Long>, Unit> function1, final Function1<? super kotlin.Pair<java.lang.Long, java.lang.Long>, Unit> function12) {
        Intrinsics.checkNotNullParameter(dexOrderDetailViewModel, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo2, "");
        Intrinsics.checkNotNullParameter(str, "");
        copydefault().OLrzqt(dexOrderDetailViewModel, dexMultiChildOrderInfoVo, dexMultiChildOrderInfoVo2, str, function1);
        EZpvd().AEQbTJ(dexOrderDetailViewModel, dexMultiChildOrderInfoVo2, str, new Function1() { // from class: o.iam
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24274iaj.OLrzqt(function12, this, dexMultiChildOrderInfoVo2, dexOrderDetailViewModel, (kotlin.Pair) obj);
            }
        });
    }

    public static final Unit OLrzqt(Function1 function1, C24274iaj c24274iaj, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, DexOrderDetailViewModel dexOrderDetailViewModel, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (function1 != null) {
            function1.invoke(pair);
        }
        c24274iaj.setProgress(pair);
        if (dexMultiChildOrderInfoVo.isOpenPackUpViewStatus()) {
            c24274iaj.copydefault().setBridgeDescView(dexMultiChildOrderInfoVo, ((java.lang.Number) pair.getSecond()).longValue() == -1 && ((java.lang.Number) pair.getFirst()).longValue() == -1, dexOrderDetailViewModel);
        } else if (((DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.AubY(dexOrderDetailViewModel.AhwBna())).isOpenPackUpViewStatus()) {
            c24274iaj.EZpvd().setToDescView((DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.AubY(dexOrderDetailViewModel.AhwBna()), c24274iaj.AEQbTJ(dexOrderDetailViewModel, dexOrderDetailViewModel.fetchVPNInfo()));
        }
        return Unit.INSTANCE;
    }

    public final boolean AEQbTJ(DexOrderDetailViewModel dexOrderDetailViewModel, boolean z) {
        OrderDetailBean value = dexOrderDetailViewModel.djBIcL().getValue();
        if (value == null || !value.isOrderInRedeemStatus()) {
            return z;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.iaj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setProgress$default(C24274iaj c24274iaj, kotlin.Pair pair, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pair = null;
        }
        c24274iaj.setProgress(pair);
    }

    public final void setProgress(kotlin.Pair<java.lang.Long, java.lang.Long> pair) {
        copydefault().setProgress(pair);
        if (pair == null || pair.getSecond().longValue() != -100) {
            EZpvd().setProgress(C56390yDp.OLrzqt(0L, 0L));
        } else {
            EZpvd().setProgress(C56390yDp.OLrzqt(0L, -100L));
        }
    }

    public final void setInstructionInfo(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, @NotNull Function2<? super java.lang.String, ? super DexMultiChildOrderInfoVo, Unit> function2) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        copydefault().setInstructionInfo(dexMultiChildOrderInfoVo, function2);
        EZpvd().setInstructionInfo(dexMultiChildOrderInfoVo2, function2);
    }

    public final void setAccelerateViewSize(int i) {
        copydefault().setAccelerateViewSize(i);
    }

    public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull WalletTxDetailBean walletTxDetailBean, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(walletTxDetailBean, "");
        copydefault().KWHzl(fragmentManager, walletTxDetailBean, yho);
    }

    public static /* synthetic */ void updateAccelerateState$default(C24274iaj c24274iaj, AccelerateBean accelerateBean, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str2 = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        c24274iaj.AEQbTJ(accelerateBean, str, z, str2);
    }

    public final void AEQbTJ(@NotNull AccelerateBean accelerateBean, @NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(accelerateBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        copydefault().OLrzqt(accelerateBean, str, z, str2);
    }
}

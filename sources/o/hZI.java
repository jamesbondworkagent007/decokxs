package o;

import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.main.swap.history.bean.AccelerateBean;
import com.okinc.business.dexlogic.main.swap.history.detail.DexOrderDetailViewModel;
import com.okinc.wallet.api.bean.WalletTxDetailBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9737bbI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class hZI extends android.widget.RelativeLayout {
    public hFJ EZpvd;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hZI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hZI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hZI(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hZI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl();
    }

    public final void KWHzl() {
        this.EZpvd = hFJ.AEQbTJ(android.view.LayoutInflater.from(getContext()), this, true);
    }

    public final void AEQbTJ(@NotNull final DexOrderDetailViewModel dexOrderDetailViewModel, @NotNull final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3, boolean z, @NotNull java.lang.String str, final Function1<? super kotlin.Pair<java.lang.Long, java.lang.Long>, Unit> function1) {
        Intrinsics.checkNotNullParameter(dexOrderDetailViewModel, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo2, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo3, "");
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(dexOrderDetailViewModel, dexMultiChildOrderInfoVo, dexMultiChildOrderInfoVo2, dexMultiChildOrderInfoVo3);
        AEQbTJ(dexOrderDetailViewModel, dexMultiChildOrderInfoVo2, str, new Function1() { // from class: o.hZF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hZI.OLrzqt(function1, this, dexMultiChildOrderInfoVo, dexOrderDetailViewModel, (kotlin.Pair) obj);
            }
        });
        copydefault(z, dexOrderDetailViewModel, dexMultiChildOrderInfoVo, dexMultiChildOrderInfoVo2, dexMultiChildOrderInfoVo3);
    }

    public static final Unit OLrzqt(Function1 function1, hZI hzi, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, DexOrderDetailViewModel dexOrderDetailViewModel, kotlin.Pair pair) {
        hZD hzd;
        Intrinsics.checkNotNullParameter(pair, "");
        if (function1 != null) {
            function1.invoke(pair);
        }
        hFJ hfj = hzi.EZpvd;
        if (hfj != null && (hzd = hfj.EZpvd) != null) {
            DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2 = dexOrderDetailViewModel.OLrzqt().get(0);
            Intrinsics.checkNotNullExpressionValue(dexMultiChildOrderInfoVo2, "");
            hzd.copydefault(dexMultiChildOrderInfoVo, dexMultiChildOrderInfoVo2, (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.AubY(dexOrderDetailViewModel.AhwBna()), dexOrderDetailViewModel, pair);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(boolean z, @NotNull DexOrderDetailViewModel dexOrderDetailViewModel, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3) {
        hZD hzd;
        C22147hZq c22147hZq;
        hZD hzd2;
        C22147hZq c22147hZq2;
        Intrinsics.checkNotNullParameter(dexOrderDetailViewModel, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo2, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo3, "");
        int i = 0;
        boolean z2 = dexMultiChildOrderInfoVo2.isOpenPackUpViewStatus() || dexMultiChildOrderInfoVo.isOpenPackUpViewStatus() || (dexMultiChildOrderInfoVo3.isOpenPackUpViewStatus() && dexOrderDetailViewModel.fetchVPNInfo());
        boolean zIsOpenErrorView = dexMultiChildOrderInfoVo2.isOpenErrorView();
        if (z) {
            hFJ hfj = this.EZpvd;
            if (hfj != null && (c22147hZq2 = hfj.AEQbTJ) != null) {
                c22147hZq2.setVisibility(0);
            }
            hFJ hfj2 = this.EZpvd;
            if (hfj2 == null || (hzd2 = hfj2.EZpvd) == null) {
                return;
            }
            hzd2.setVisibility(8);
            return;
        }
        hFJ hfj3 = this.EZpvd;
        if (hfj3 != null && (c22147hZq = hfj3.AEQbTJ) != null) {
            c22147hZq.setVisibility(8);
        }
        hFJ hfj4 = this.EZpvd;
        if (hfj4 == null || (hzd = hfj4.EZpvd) == null) {
            return;
        }
        if (!z2 && !zIsOpenErrorView) {
            i = 8;
        }
        hzd.setVisibility(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hZI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initExpandView$default(hZI hzi, DexOrderDetailViewModel dexOrderDetailViewModel, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        hzi.AEQbTJ(dexOrderDetailViewModel, dexMultiChildOrderInfoVo, str, function1);
    }

    public final void AEQbTJ(DexOrderDetailViewModel dexOrderDetailViewModel, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, java.lang.String str, Function1<? super kotlin.Pair<java.lang.Long, java.lang.Long>, Unit> function1) {
        hFJ hfj = this.EZpvd;
        if (hfj != null) {
            hfj.AEQbTJ.KWHzl(dexOrderDetailViewModel, dexMultiChildOrderInfoVo, str, function1);
        }
    }

    public final void copydefault(DexOrderDetailViewModel dexOrderDetailViewModel, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3) {
        hFJ hfj = this.EZpvd;
        if (hfj != null) {
            hZD.initData$default(hfj.EZpvd, dexMultiChildOrderInfoVo, dexMultiChildOrderInfoVo2, dexMultiChildOrderInfoVo3, dexOrderDetailViewModel, null, 16, null);
        }
    }

    public final void setInstructionInfo(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull Function2<? super java.lang.String, ? super DexMultiChildOrderInfoVo, Unit> function2) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(function2, "");
        hFJ hfj = this.EZpvd;
        if (hfj != null) {
            hfj.AEQbTJ.setInstructionInfo(dexMultiChildOrderInfoVo, function2);
            hfj.EZpvd.setInstructionInfo(dexMultiChildOrderInfoVo, function2);
        }
    }

    public final void setToTimeOutDescView(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        hFJ hfj = this.EZpvd;
        if (hfj != null) {
            hfj.AEQbTJ.setToTimeOutDescView(dexMultiChildOrderInfoVo);
        }
    }

    public final void OLrzqt(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        hFJ hfj = this.EZpvd;
        if (hfj != null) {
            hZD hzd = hfj.EZpvd;
            Intrinsics.checkNotNullExpressionValue(hzd, "");
            KWHzl(hzd, dexMultiChildOrderInfoVo, fragmentManager, str, interfaceC9738bbJ);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.hZD.updateAccelerateState$default(o.hZD, com.okinc.business.dexlogic.main.swap.history.bean.AccelerateBean, java.lang.String, boolean, java.lang.String, int, java.lang.Object):void */
    public final void KWHzl(hZD hzd, final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ) {
        java.lang.String strDbNXlk;
        InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), C33129mqd.valueOf(dexMultiChildOrderInfoVo.getFromChainId()), false, 2, null);
        long jAhwBna = chainMetaWithRealChainId$default != null ? chainMetaWithRealChainId$default.AhwBna() : 0L;
        java.lang.String transactionHash = dexMultiChildOrderInfoVo.getTransactionHash();
        if (interfaceC9738bbJ == null || (strDbNXlk = interfaceC9738bbJ.DbNXlk()) == null) {
            strDbNXlk = "";
        }
        hzd.copydefault(fragmentManager, new WalletTxDetailBean("", transactionHash, str, jAhwBna, strDbNXlk, (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null), new yHO() { // from class: o.hZE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return hZI.copydefault(dexMultiChildOrderInfoVo, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2, (java.lang.String) obj3);
            }
        });
        hzd.setAccelerateViewSize(24);
        hZD.updateAccelerateState$default(hzd, new AccelerateBean(dexMultiChildOrderInfoVo.isShowSpeedUp(), dexMultiChildOrderInfoVo.isShowCancel(), dexMultiChildOrderInfoVo.isShowSpeedUpCancel(), (java.lang.String) null, C22420hey.OLrzqt(dexMultiChildOrderInfoVo.getSwapTradeType()), 8, (DefaultConstructorMarker) null), dexMultiChildOrderInfoVo.getStatus(), interfaceC9738bbJ == null || interfaceC9738bbJ.QfsBiF() || interfaceC9738bbJ == null || interfaceC9738bbJ.zsXlph(), null, 8, null);
    }

    public static final Unit copydefault(DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, boolean z, java.lang.String str, java.lang.String str2) {
        if (z && str2 != null) {
            dexMultiChildOrderInfoVo.setTransactionHash(str2);
        }
        return Unit.INSTANCE;
    }
}

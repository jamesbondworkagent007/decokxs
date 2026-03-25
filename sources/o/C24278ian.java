package o;

import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.main.swap.history.bean.AccelerateBean;
import com.okinc.business.dexlogic.main.swap.history.detail.DexOrderDetailViewModel;
import com.okinc.wallet.api.bean.WalletTxDetailBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9737bbI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ian, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24278ian extends android.widget.RelativeLayout {
    public hFN KWHzl;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24278ian(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24278ian(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24278ian(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24278ian(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt();
    }

    public final void OLrzqt() {
        this.KWHzl = hFN.OLrzqt(android.view.LayoutInflater.from(getContext()), this, true);
    }

    public final void AEQbTJ(@NotNull final DexOrderDetailViewModel dexOrderDetailViewModel, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, @NotNull final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3, boolean z, @NotNull java.lang.String str, final Function1<? super kotlin.Pair<java.lang.Long, java.lang.Long>, Unit> function1) {
        Intrinsics.checkNotNullParameter(dexOrderDetailViewModel, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo2, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo3, "");
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ(dexOrderDetailViewModel, dexMultiChildOrderInfoVo, dexMultiChildOrderInfoVo2, dexMultiChildOrderInfoVo3);
        KWHzl(dexOrderDetailViewModel, dexMultiChildOrderInfoVo, dexMultiChildOrderInfoVo2, str, new Function1() { // from class: o.iar
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24278ian.EZpvd(function1, dexOrderDetailViewModel, this, dexMultiChildOrderInfoVo3, (kotlin.Pair) obj);
            }
        }, new Function1() { // from class: o.iav
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24278ian.OLrzqt(dexOrderDetailViewModel, this, dexMultiChildOrderInfoVo3, (kotlin.Pair) obj);
            }
        });
        OLrzqt(z, dexOrderDetailViewModel, dexMultiChildOrderInfoVo, dexMultiChildOrderInfoVo2, dexMultiChildOrderInfoVo3);
    }

    public static final Unit EZpvd(Function1 function1, DexOrderDetailViewModel dexOrderDetailViewModel, C24278ian c24278ian, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, kotlin.Pair pair) {
        C24279iao c24279iao;
        OrderDetailBean value;
        Intrinsics.checkNotNullParameter(pair, "");
        if (function1 != null) {
            function1.invoke(pair);
        }
        if (((java.lang.Number) pair.getFirst()).longValue() == -1 && ((java.lang.Number) pair.getSecond()).longValue() == -1 && (value = dexOrderDetailViewModel.djBIcL().getValue()) != null) {
            value.setFromEstimatedTime("");
        }
        hFN hfn = c24278ian.KWHzl;
        if (hfn != null && (c24279iao = hfn.EZpvd) != null) {
            DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2 = dexOrderDetailViewModel.OLrzqt().get(0);
            Intrinsics.checkNotNullExpressionValue(dexMultiChildOrderInfoVo2, "");
            DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3 = dexMultiChildOrderInfoVo2;
            DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo4 = dexOrderDetailViewModel.OLrzqt().get(1);
            Intrinsics.checkNotNullExpressionValue(dexMultiChildOrderInfoVo4, "");
            c24279iao.KWHzl(dexOrderDetailViewModel, dexMultiChildOrderInfoVo3, dexMultiChildOrderInfoVo4, dexMultiChildOrderInfoVo, pair);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(DexOrderDetailViewModel dexOrderDetailViewModel, C24278ian c24278ian, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, kotlin.Pair pair) {
        C24279iao c24279iao;
        OrderDetailBean value;
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Number) pair.getFirst()).longValue() == -1 && ((java.lang.Number) pair.getSecond()).longValue() == -1 && (value = dexOrderDetailViewModel.djBIcL().getValue()) != null) {
            value.setBridgeEstimatedTime("");
        }
        hFN hfn = c24278ian.KWHzl;
        if (hfn != null && (c24279iao = hfn.EZpvd) != null) {
            DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2 = dexOrderDetailViewModel.OLrzqt().get(0);
            Intrinsics.checkNotNullExpressionValue(dexMultiChildOrderInfoVo2, "");
            DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3 = dexMultiChildOrderInfoVo2;
            DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo4 = dexOrderDetailViewModel.OLrzqt().get(1);
            Intrinsics.checkNotNullExpressionValue(dexMultiChildOrderInfoVo4, "");
            c24279iao.KWHzl(dexOrderDetailViewModel, dexMultiChildOrderInfoVo3, dexMultiChildOrderInfoVo4, dexMultiChildOrderInfoVo, pair);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(boolean z, @NotNull DexOrderDetailViewModel dexOrderDetailViewModel, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3) {
        C24279iao c24279iao;
        C24279iao c24279iao2;
        C24274iaj c24274iaj;
        hFN hfn;
        C24274iaj c24274iaj2;
        C24279iao c24279iao3;
        C24274iaj c24274iaj3;
        Intrinsics.checkNotNullParameter(dexOrderDetailViewModel, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo2, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo3, "");
        int i = 0;
        boolean z2 = dexMultiChildOrderInfoVo.isOpenPackUpViewStatus() || dexMultiChildOrderInfoVo2.isOpenPackUpViewStatus() || (dexMultiChildOrderInfoVo3.isOpenPackUpViewStatus() && dexOrderDetailViewModel.fetchVPNInfo());
        boolean z3 = dexMultiChildOrderInfoVo.isOpenErrorView() || dexMultiChildOrderInfoVo2.isOpenErrorView();
        if (z) {
            hFN hfn2 = this.KWHzl;
            if (hfn2 != null && (c24274iaj3 = hfn2.AEQbTJ) != null) {
                c24274iaj3.setVisibility(0);
            }
            hFN hfn3 = this.KWHzl;
            if (hfn3 != null && (c24279iao3 = hfn3.EZpvd) != null) {
                c24279iao3.setVisibility(8);
            }
            if (!dexMultiChildOrderInfoVo2.isProgressDoneStatus() || (hfn = this.KWHzl) == null || (c24274iaj2 = hfn.AEQbTJ) == null) {
                return;
            }
            c24274iaj2.setProgress(C56390yDp.OLrzqt(-100L, -100L));
            return;
        }
        hFN hfn4 = this.KWHzl;
        if (hfn4 != null && (c24274iaj = hfn4.AEQbTJ) != null) {
            c24274iaj.setVisibility(8);
        }
        hFN hfn5 = this.KWHzl;
        if (hfn5 != null && (c24279iao2 = hfn5.EZpvd) != null) {
            if (!z2 && !z3) {
                i = 8;
            }
            c24279iao2.setVisibility(i);
        }
        hFN hfn6 = this.KWHzl;
        if (hfn6 == null || (c24279iao = hfn6.EZpvd) == null) {
            return;
        }
        c24279iao.KWHzl(!dexMultiChildOrderInfoVo2.isErrorCodeNormal());
    }

    public final void KWHzl(DexOrderDetailViewModel dexOrderDetailViewModel, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, java.lang.String str, Function1<? super kotlin.Pair<java.lang.Long, java.lang.Long>, Unit> function1, Function1<? super kotlin.Pair<java.lang.Long, java.lang.Long>, Unit> function12) {
        hFN hfn = this.KWHzl;
        if (hfn != null) {
            hfn.AEQbTJ.OLrzqt(dexOrderDetailViewModel, dexMultiChildOrderInfoVo, dexMultiChildOrderInfoVo2, str, function1, function12);
        }
    }

    public final void AEQbTJ(DexOrderDetailViewModel dexOrderDetailViewModel, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3) {
        hFN hfn = this.KWHzl;
        if (hfn != null) {
            C24279iao.initData$default(hfn.EZpvd, dexOrderDetailViewModel, dexMultiChildOrderInfoVo, dexMultiChildOrderInfoVo2, dexMultiChildOrderInfoVo3, null, 16, null);
        }
    }

    public final void setInstructionInfo(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, @NotNull Function2<? super java.lang.String, ? super DexMultiChildOrderInfoVo, Unit> function2) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        hFN hfn = this.KWHzl;
        if (hfn != null) {
            hfn.AEQbTJ.setInstructionInfo(dexMultiChildOrderInfoVo, dexMultiChildOrderInfoVo2, function2);
            hfn.EZpvd.setInstructionInfo(dexMultiChildOrderInfoVo, dexMultiChildOrderInfoVo2, function2);
        }
    }

    public final void AEQbTJ(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        hFN hfn = this.KWHzl;
        if (hfn != null) {
            C24274iaj c24274iaj = hfn.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c24274iaj, "");
            OLrzqt(c24274iaj, dexMultiChildOrderInfoVo, fragmentManager, str, interfaceC9738bbJ);
            C24279iao c24279iao = hfn.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c24279iao, "");
            copydefault(c24279iao, dexMultiChildOrderInfoVo, fragmentManager, str, interfaceC9738bbJ);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.iaj.updateAccelerateState$default(o.iaj, com.okinc.business.dexlogic.main.swap.history.bean.AccelerateBean, java.lang.String, boolean, java.lang.String, int, java.lang.Object):void */
    public final void OLrzqt(@NotNull C24274iaj c24274iaj, @NotNull final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ) {
        java.lang.String strDbNXlk;
        Intrinsics.checkNotNullParameter(c24274iaj, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), C33129mqd.valueOf(dexMultiChildOrderInfoVo.getFromChainId()), false, 2, null);
        c24274iaj.EZpvd(fragmentManager, new WalletTxDetailBean("", dexMultiChildOrderInfoVo.getTransactionHash(), str, chainMetaWithRealChainId$default != null ? chainMetaWithRealChainId$default.AhwBna() : 0L, (interfaceC9738bbJ == null || (strDbNXlk = interfaceC9738bbJ.DbNXlk()) == null) ? "" : strDbNXlk, (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null), new yHO() { // from class: o.iaw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C24278ian.copydefault(dexMultiChildOrderInfoVo, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2, (java.lang.String) obj3);
            }
        });
        c24274iaj.setAccelerateViewSize(24);
        C24274iaj.updateAccelerateState$default(c24274iaj, new AccelerateBean(dexMultiChildOrderInfoVo.isShowSpeedUp(), dexMultiChildOrderInfoVo.isShowCancel(), dexMultiChildOrderInfoVo.isShowSpeedUpCancel(), (java.lang.String) null, C22420hey.OLrzqt(dexMultiChildOrderInfoVo.getSwapTradeType()), 8, (DefaultConstructorMarker) null), dexMultiChildOrderInfoVo.getStatus(), interfaceC9738bbJ == null || interfaceC9738bbJ.QfsBiF() || interfaceC9738bbJ == null || interfaceC9738bbJ.zsXlph(), null, 8, null);
    }

    public static final Unit copydefault(DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, boolean z, java.lang.String str, java.lang.String str2) {
        if (z && str2 != null) {
            dexMultiChildOrderInfoVo.setTransactionHash(str2);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull C24279iao c24279iao, @NotNull final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ) {
        java.lang.String strDbNXlk;
        Intrinsics.checkNotNullParameter(c24279iao, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), C33129mqd.valueOf(dexMultiChildOrderInfoVo.getFromChainId()), false, 2, null);
        c24279iao.KWHzl(fragmentManager, new WalletTxDetailBean("", dexMultiChildOrderInfoVo.getTransactionHash(), str, chainMetaWithRealChainId$default != null ? chainMetaWithRealChainId$default.AhwBna() : 0L, (interfaceC9738bbJ == null || (strDbNXlk = interfaceC9738bbJ.DbNXlk()) == null) ? "" : strDbNXlk, (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null), new yHO() { // from class: o.iat
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C24278ian.OLrzqt(dexMultiChildOrderInfoVo, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2, (java.lang.String) obj3);
            }
        });
        c24279iao.setAccelerateViewSize(24);
        C24279iao.updateAccelerateState$default(c24279iao, new AccelerateBean(dexMultiChildOrderInfoVo.isShowSpeedUp(), dexMultiChildOrderInfoVo.isShowCancel(), dexMultiChildOrderInfoVo.isShowSpeedUpCancel(), (java.lang.String) null, C22420hey.OLrzqt(dexMultiChildOrderInfoVo.getSwapTradeType()), 8, (DefaultConstructorMarker) null), dexMultiChildOrderInfoVo.getStatus(), interfaceC9738bbJ == null || interfaceC9738bbJ.QfsBiF() || interfaceC9738bbJ == null || interfaceC9738bbJ.zsXlph(), null, 8, null);
    }

    public static final Unit OLrzqt(DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, boolean z, java.lang.String str, java.lang.String str2) {
        if (z && str2 != null) {
            dexMultiChildOrderInfoVo.setTransactionHash(str2);
        }
        return Unit.INSTANCE;
    }
}

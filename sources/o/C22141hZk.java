package o;

import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
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

/* JADX INFO: renamed from: o.hZk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22141hZk extends android.widget.RelativeLayout {
    public hFM AEQbTJ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22141hZk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22141hZk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22141hZk(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22141hZk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl();
    }

    public final void KWHzl() {
        this.AEQbTJ = hFM.copydefault(android.view.LayoutInflater.from(getContext()), this, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.hZk */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initData$default(C22141hZk c22141hZk, DexOrderDetailViewModel dexOrderDetailViewModel, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, boolean z, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            function1 = null;
        }
        c22141hZk.EZpvd(dexOrderDetailViewModel, dexMultiChildOrderInfoVo, z, str, function1);
    }

    public final void EZpvd(@NotNull final DexOrderDetailViewModel dexOrderDetailViewModel, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, boolean z, @NotNull java.lang.String str, final Function1<? super kotlin.Pair<java.lang.Long, java.lang.Long>, Unit> function1) {
        Intrinsics.checkNotNullParameter(dexOrderDetailViewModel, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(dexOrderDetailViewModel, dexMultiChildOrderInfoVo);
        KWHzl(dexOrderDetailViewModel, dexMultiChildOrderInfoVo, str, new Function1() { // from class: o.hZt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22141hZk.AEQbTJ(function1, this, dexOrderDetailViewModel, (kotlin.Pair) obj);
            }
        }, new Function1() { // from class: o.hZp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22141hZk.copydefault(this.KWHzl, dexOrderDetailViewModel, (kotlin.Pair) obj);
            }
        });
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2 = dexOrderDetailViewModel.AhwBna().get(1);
        Intrinsics.checkNotNullExpressionValue(dexMultiChildOrderInfoVo2, "");
        KWHzl(z, dexMultiChildOrderInfoVo, dexMultiChildOrderInfoVo2);
    }

    public static final Unit AEQbTJ(Function1 function1, C22141hZk c22141hZk, DexOrderDetailViewModel dexOrderDetailViewModel, kotlin.Pair pair) {
        C22138hZh c22138hZh;
        Intrinsics.checkNotNullParameter(pair, "");
        if (function1 != null) {
            function1.invoke(pair);
        }
        hFM hfm = c22141hZk.AEQbTJ;
        if (hfm != null && (c22138hZh = hfm.EZpvd) != null) {
            DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo = dexOrderDetailViewModel.OLrzqt().get(0);
            Intrinsics.checkNotNullExpressionValue(dexMultiChildOrderInfoVo, "");
            c22138hZh.KWHzl(dexOrderDetailViewModel, dexMultiChildOrderInfoVo, pair);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C22141hZk c22141hZk, DexOrderDetailViewModel dexOrderDetailViewModel, kotlin.Pair pair) {
        C22138hZh c22138hZh;
        Intrinsics.checkNotNullParameter(pair, "");
        hFM hfm = c22141hZk.AEQbTJ;
        if (hfm != null && (c22138hZh = hfm.EZpvd) != null) {
            DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo = dexOrderDetailViewModel.OLrzqt().get(0);
            Intrinsics.checkNotNullExpressionValue(dexMultiChildOrderInfoVo, "");
            c22138hZh.KWHzl(dexOrderDetailViewModel, dexMultiChildOrderInfoVo, pair);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(boolean z, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2) {
        C22138hZh c22138hZh;
        C22138hZh c22138hZh2;
        hYY hyy;
        C22138hZh c22138hZh3;
        hYY hyy2;
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo2, "");
        int i = 0;
        boolean z2 = dexMultiChildOrderInfoVo.isOpenPackUpViewStatus() || dexMultiChildOrderInfoVo2.isPending();
        boolean z3 = dexMultiChildOrderInfoVo.isOpenErrorView() || dexMultiChildOrderInfoVo2.isOpenErrorView();
        if (z) {
            hFM hfm = this.AEQbTJ;
            if (hfm != null && (hyy2 = hfm.OLrzqt) != null) {
                hyy2.setVisibility(0);
            }
            hFM hfm2 = this.AEQbTJ;
            if (hfm2 == null || (c22138hZh3 = hfm2.EZpvd) == null) {
                return;
            }
            c22138hZh3.setVisibility(8);
            return;
        }
        hFM hfm3 = this.AEQbTJ;
        if (hfm3 != null && (hyy = hfm3.OLrzqt) != null) {
            hyy.setVisibility(8);
        }
        hFM hfm4 = this.AEQbTJ;
        if (hfm4 != null && (c22138hZh2 = hfm4.EZpvd) != null) {
            if (!z2 && !z3) {
                i = 8;
            }
            c22138hZh2.setVisibility(i);
        }
        hFM hfm5 = this.AEQbTJ;
        if (hfm5 == null || (c22138hZh = hfm5.EZpvd) == null) {
            return;
        }
        c22138hZh.OLrzqt(!dexMultiChildOrderInfoVo2.isErrorCodeNormal());
    }

    public final void KWHzl(DexOrderDetailViewModel dexOrderDetailViewModel, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, java.lang.String str, Function1<? super kotlin.Pair<java.lang.Long, java.lang.Long>, Unit> function1, Function1<? super kotlin.Pair<java.lang.Long, java.lang.Long>, Unit> function12) {
        hFM hfm = this.AEQbTJ;
        if (hfm != null) {
            hfm.OLrzqt.KWHzl(dexOrderDetailViewModel, dexMultiChildOrderInfoVo, str, function1, function12);
        }
    }

    public final void copydefault(DexOrderDetailViewModel dexOrderDetailViewModel, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        hFM hfm = this.AEQbTJ;
        if (hfm != null) {
            C22138hZh.initData$default(hfm.EZpvd, dexOrderDetailViewModel, dexMultiChildOrderInfoVo, null, 4, null);
        }
    }

    public final void setInstructionInfo(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull Function2<? super java.lang.String, ? super DexMultiChildOrderInfoVo, Unit> function2) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(function2, "");
        hFM hfm = this.AEQbTJ;
        if (hfm != null) {
            hfm.OLrzqt.setInstructionInfo(dexMultiChildOrderInfoVo, function2);
            hfm.EZpvd.setInstructionInfo(dexMultiChildOrderInfoVo, function2);
        }
    }

    public final void copydefault(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        hFM hfm = this.AEQbTJ;
        if (hfm != null) {
            hYY hyy = hfm.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(hyy, "");
            OLrzqt(hyy, dexMultiChildOrderInfoVo, fragmentManager, str, interfaceC9738bbJ);
            C22138hZh c22138hZh = hfm.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c22138hZh, "");
            KWHzl(c22138hZh, dexMultiChildOrderInfoVo, fragmentManager, str, interfaceC9738bbJ);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.hYY.updateAccelerateState$default(o.hYY, com.okinc.business.dexlogic.main.swap.history.bean.AccelerateBean, java.lang.String, boolean, java.lang.String, int, java.lang.Object):void */
    public final void OLrzqt(@NotNull hYY hyy, @NotNull final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ) {
        java.lang.String strDbNXlk;
        Intrinsics.checkNotNullParameter(hyy, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), C33129mqd.valueOf(dexMultiChildOrderInfoVo.getFromChainId()), false, 2, null);
        hyy.EZpvd(fragmentManager, new WalletTxDetailBean("", dexMultiChildOrderInfoVo.getTransactionHash(), str, chainMetaWithRealChainId$default != null ? chainMetaWithRealChainId$default.AhwBna() : 0L, (interfaceC9738bbJ == null || (strDbNXlk = interfaceC9738bbJ.DbNXlk()) == null) ? "" : strDbNXlk, (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null), new yHO() { // from class: o.hZr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C22141hZk.AEQbTJ(dexMultiChildOrderInfoVo, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2, (java.lang.String) obj3);
            }
        });
        hyy.setAccelerateViewSize(24);
        hYY.updateAccelerateState$default(hyy, new AccelerateBean(dexMultiChildOrderInfoVo.isShowSpeedUp(), dexMultiChildOrderInfoVo.isShowCancel(), dexMultiChildOrderInfoVo.isShowSpeedUpCancel(), (java.lang.String) null, C22420hey.OLrzqt(dexMultiChildOrderInfoVo.getSwapTradeType()), 8, (DefaultConstructorMarker) null), dexMultiChildOrderInfoVo.getStatus(), interfaceC9738bbJ == null || interfaceC9738bbJ.QfsBiF() || interfaceC9738bbJ == null || interfaceC9738bbJ.zsXlph(), null, 8, null);
    }

    public static final Unit AEQbTJ(DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, boolean z, java.lang.String str, java.lang.String str2) {
        if (z && str2 != null) {
            dexMultiChildOrderInfoVo.setTransactionHash(str2);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.hZh.updateAccelerateState$default(o.hZh, com.okinc.business.dexlogic.main.swap.history.bean.AccelerateBean, java.lang.String, boolean, java.lang.String, int, java.lang.Object):void */
    public final void KWHzl(@NotNull C22138hZh c22138hZh, @NotNull final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ) {
        java.lang.String strDbNXlk;
        Intrinsics.checkNotNullParameter(c22138hZh, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), C33129mqd.valueOf(dexMultiChildOrderInfoVo.getFromChainId()), false, 2, null);
        c22138hZh.AEQbTJ(fragmentManager, new WalletTxDetailBean("", dexMultiChildOrderInfoVo.getTransactionHash(), str, chainMetaWithRealChainId$default != null ? chainMetaWithRealChainId$default.AhwBna() : 0L, (interfaceC9738bbJ == null || (strDbNXlk = interfaceC9738bbJ.DbNXlk()) == null) ? "" : strDbNXlk, (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null), new yHO() { // from class: o.hZs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C22141hZk.KWHzl(dexMultiChildOrderInfoVo, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2, (java.lang.String) obj3);
            }
        });
        c22138hZh.setAccelerateViewSize(24);
        C22138hZh.updateAccelerateState$default(c22138hZh, new AccelerateBean(dexMultiChildOrderInfoVo.isShowSpeedUp(), dexMultiChildOrderInfoVo.isShowCancel(), dexMultiChildOrderInfoVo.isShowSpeedUpCancel(), (java.lang.String) null, C22420hey.OLrzqt(dexMultiChildOrderInfoVo.getSwapTradeType()), 8, (DefaultConstructorMarker) null), dexMultiChildOrderInfoVo.getStatus(), interfaceC9738bbJ == null || interfaceC9738bbJ.QfsBiF() || interfaceC9738bbJ == null || interfaceC9738bbJ.zsXlph(), null, 8, null);
    }

    public static final Unit KWHzl(DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, boolean z, java.lang.String str, java.lang.String str2) {
        if (z && str2 != null) {
            dexMultiChildOrderInfoVo.setTransactionHash(str2);
        }
        return Unit.INSTANCE;
    }
}

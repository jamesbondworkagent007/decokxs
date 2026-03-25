package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.main.swap.history.detail.DexOrderDetailViewModel;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import o.InterfaceC9737bbI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class hVI extends AbstractC22038hVp {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int gEmmrt = 8;
    public hBH djBIcL;

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hVI.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final hVI EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            hVI hvi = new hVI();
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, str);
            hvi.setArguments(bundle);
            return hvi;
        }
    }

    public final C22093hXq OLrzqt() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return (C22093hXq) activity.findViewById(C23274hvD.Application.readGroup);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hBH hbhCopydefault = hBH.copydefault(layoutInflater, viewGroup, false);
        this.djBIcL = hbhCopydefault;
        if (hbhCopydefault != null) {
            return hbhCopydefault.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC22038hVp, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        MutableLiveData<OrderDetailBean> mutableLiveDataDjBIcL;
        OrderDetailBean value;
        DexMultiChildOrderInfoVo fromChildOrderDetailVo;
        java.lang.String transactionHash;
        MutableLiveData<OrderDetailBean> mutableLiveDataDjBIcL2;
        OrderDetailBean value2;
        DexMultiChildOrderInfoVo fromChildOrderDetailVo2;
        java.lang.String fromChainId;
        MutableLiveData<OrderDetailBean> mutableLiveDataDjBIcL3;
        OrderDetailBean value3;
        java.lang.String from;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ = AEQbTJ();
        java.lang.String str = (dexOrderDetailViewModelAEQbTJ == null || (mutableLiveDataDjBIcL3 = dexOrderDetailViewModelAEQbTJ.djBIcL()) == null || (value3 = mutableLiveDataDjBIcL3.getValue()) == null || (from = value3.getFrom()) == null) ? "" : from;
        DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ2 = AEQbTJ();
        java.lang.String str2 = (dexOrderDetailViewModelAEQbTJ2 == null || (mutableLiveDataDjBIcL2 = dexOrderDetailViewModelAEQbTJ2.djBIcL()) == null || (value2 = mutableLiveDataDjBIcL2.getValue()) == null || (fromChildOrderDetailVo2 = value2.getFromChildOrderDetailVo()) == null || (fromChainId = fromChildOrderDetailVo2.getFromChainId()) == null) ? "" : fromChainId;
        DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ3 = AEQbTJ();
        EZpvd(copydefault(), str, str2, (dexOrderDetailViewModelAEQbTJ3 == null || (mutableLiveDataDjBIcL = dexOrderDetailViewModelAEQbTJ3.djBIcL()) == null || (value = mutableLiveDataDjBIcL.getValue()) == null || (fromChildOrderDetailVo = value.getFromChildOrderDetailVo()) == null || (transactionHash = fromChildOrderDetailVo.getTransactionHash()) == null) ? "" : transactionHash, new yHO() { // from class: o.hVK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return hVI.OLrzqt(this.KWHzl, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2, (java.lang.String) obj3);
            }
        });
    }

    public static final Unit OLrzqt(hVI hvi, boolean z, java.lang.String str, java.lang.String str2) {
        DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ;
        MutableLiveData<OrderDetailBean> mutableLiveDataDjBIcL;
        OrderDetailBean value;
        DexMultiChildOrderInfoVo fromChildOrderDetailVo;
        if (z && str2 != null && (dexOrderDetailViewModelAEQbTJ = hvi.AEQbTJ()) != null && (mutableLiveDataDjBIcL = dexOrderDetailViewModelAEQbTJ.djBIcL()) != null && (value = mutableLiveDataDjBIcL.getValue()) != null && (fromChildOrderDetailVo = value.getFromChildOrderDetailVo()) != null) {
            fromChildOrderDetailVo.setTransactionHash(str2);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC22038hVp
    public void KWHzl(@NotNull final OrderDetailBean orderDetailBean) {
        C22108hYe c22108hYe;
        C22108hYe c22108hYe2;
        C22108hYe c22108hYe3;
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        hBH hbh = this.djBIcL;
        if (hbh != null) {
            hbh.copydefault.setOrderSideMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.apNbdB));
            hbh.valueOf.setOrderSideMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.gSBher));
            hbh.KWHzl.OLrzqt(orderDetailBean);
            KWHzl(copydefault(), orderDetailBean);
            hBH hbh2 = this.djBIcL;
            if (hbh2 != null && (c22108hYe3 = hbh2.copydefault) != null) {
                c22108hYe3.AEQbTJ(orderDetailBean.isMemeTimeOut() && C22416heu.uzCIH());
            }
            hBH hbh3 = this.djBIcL;
            if (hbh3 != null && (c22108hYe2 = hbh3.valueOf) != null) {
                c22108hYe2.setAvailableUpdateInfo(orderDetailBean.getAssetDelay());
            }
            hBH hbh4 = this.djBIcL;
            if (hbh4 != null && (c22108hYe = hbh4.copydefault) != null) {
                c22108hYe.setTryTransactionAgain(new Function0() { // from class: o.hVH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return hVI.copydefault(orderDetailBean, this);
                    }
                });
            }
        }
        OLrzqt(orderDetailBean);
    }

    public static final Unit copydefault(OrderDetailBean orderDetailBean, hVI hvi) {
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        FragmentActivity fragmentActivityRequireActivity = hvi.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        java.lang.String strAEQbTJ = gKZ.EZpvd.AEQbTJ("dex/meme/swap");
        kotlin.Pair[] pairArr = new kotlin.Pair[6];
        pairArr[0] = C56390yDp.OLrzqt("chainId", orderDetailBean.getMemeModeTokenBase().getChainId());
        pairArr[1] = C56390yDp.OLrzqt("tokenContractAddress", orderDetailBean.getMemeModeTokenBase().getTokenContractAddress());
        pairArr[2] = C56390yDp.OLrzqt("transaction_direction", java.lang.Integer.valueOf(orderDetailBean.getDirection()));
        pairArr[3] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, Intrinsics.EZpvd((java.lang.Object) orderDetailBean.getStatus(), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL) ? orderDetailBean.getFromAmount() : "");
        pairArr[4] = C56390yDp.OLrzqt("payTokenContractAddress", orderDetailBean.getFromTokenAddress());
        pairArr[5] = C56390yDp.OLrzqt("forTokenContractAddress", orderDetailBean.getToTokenAddress());
        interfaceC43294rma.KWHzl(fragmentActivityRequireActivity, strAEQbTJ, C56424yEw.gEmmrt(pairArr), new Function1() { // from class: o.hVL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hVI.AEQbTJ((AbstractC43238rlX) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void OLrzqt(OrderDetailBean orderDetailBean) {
        hBH hbh = this.djBIcL;
        if (hbh != null) {
            AppCompatTextView appCompatTextView = hbh.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(orderDetailBean.orderHasSurplus() ? 0 : 8);
            if (orderDetailBean.orderHasSurplus()) {
                AppCompatTextView appCompatTextView2 = hbh.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
                java.lang.String surplusAmount = orderDetailBean.getSurplusAmount();
                java.lang.String surplusValueUSD = orderDetailBean.getSurplusValueUSD();
                java.lang.String toTokenSymbol = orderDetailBean.getToTokenSymbol();
                java.util.List listGEmmrt = yDY.gEmmrt(orderDetailBean.getFromIcon(), orderDetailBean.getToIcon());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listGEmmrt) {
                    if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) obj)) {
                        arrayList.add(obj);
                    }
                }
                java.lang.String quoteToAmount = orderDetailBean.getQuoteToAmount();
                java.lang.String toAmount = orderDetailBean.getToAmount();
                java.lang.String toTokenAddress = orderDetailBean.getToTokenAddress();
                java.lang.String toChainId = orderDetailBean.getToChainId();
                java.lang.Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(orderDetailBean.getTime());
                C25402ivz c25402ivz = new C25402ivz(surplusAmount, surplusValueUSD, toTokenSymbol, arrayList, quoteToAmount, toAmount, toTokenAddress, toChainId, fieldNames != null ? fieldNames.longValue() : 0L);
                androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                C25353ivC.AEQbTJ(appCompatTextView2, c25402ivz, parentFragmentManager);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    @Override // o.AbstractC22038hVp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AEQbTJ(@NotNull java.util.List<DexMultiChildOrderInfoVo> list) {
        boolean z;
        C22108hYe c22108hYe;
        hBH hbh;
        C22108hYe c22108hYe2;
        C22108hYe c22108hYe3;
        C22108hYe c22108hYe4;
        C22108hYe c22108hYe5;
        C22108hYe c22108hYe6;
        C22108hYe c22108hYe7;
        Intrinsics.checkNotNullParameter(list, "");
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo = (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.firstOrNull(list);
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2 = (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.wlaJM(list);
        if (dexMultiChildOrderInfoVo != null) {
            hBH hbh2 = this.djBIcL;
            if (hbh2 != null && (c22108hYe7 = hbh2.copydefault) != null) {
                c22108hYe7.AEQbTJ(dexMultiChildOrderInfoVo.getToTokenIcon());
            }
            hBH hbh3 = this.djBIcL;
            if (hbh3 != null && (c22108hYe6 = hbh3.copydefault) != null) {
                c22108hYe6.setValue(dexMultiChildOrderInfoVo.getCoinFromValueShow(copydefault()), dexMultiChildOrderInfoVo.getToTokenSymbol());
            }
        }
        if (dexMultiChildOrderInfoVo2 != null) {
            hBH hbh4 = this.djBIcL;
            if (hbh4 != null && (c22108hYe5 = hbh4.valueOf) != null) {
                c22108hYe5.AEQbTJ(dexMultiChildOrderInfoVo2.getToTokenIcon());
            }
            hBH hbh5 = this.djBIcL;
            if (hbh5 != null && (c22108hYe4 = hbh5.valueOf) != null) {
                c22108hYe4.setValue(dexMultiChildOrderInfoVo2.getCoinValueShow(copydefault()), dexMultiChildOrderInfoVo2.getToTokenSymbol());
            }
            hBH hbh6 = this.djBIcL;
            if (hbh6 != null && (c22108hYe3 = hbh6.valueOf) != null) {
                c22108hYe3.setChildOrderState(dexMultiChildOrderInfoVo2.getStatus());
            }
            if (Intrinsics.EZpvd((java.lang.Object) dexMultiChildOrderInfoVo2.getMainStatus(), (java.lang.Object) "1") && (hbh = this.djBIcL) != null && (c22108hYe2 = hbh.valueOf) != null) {
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                c22108hYe2.setValueColor(C33512mxp.tradeRiseDefault$default(c33512mxp, contextRequireContext, 0.0f, 2, null));
            }
            InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = C22380heK.OLrzqt.copydefault(copydefault()).fARcdN().AEQbTJ();
            if (interfaceC9738bbJAEQbTJ != null) {
                z = interfaceC9738bbJAEQbTJ.QfsBiF();
            }
            hBH hbh7 = this.djBIcL;
            if (hbh7 == null || (c22108hYe = hbh7.copydefault) == null) {
                return;
            }
            c22108hYe.setInstructionInfo(dexMultiChildOrderInfoVo2, z, new Function2() { // from class: o.hVM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return hVI.EZpvd(this.copydefault, (java.lang.String) obj, (DexMultiChildOrderInfoVo) obj2);
                }
            });
        }
    }

    public static final Unit EZpvd(hVI hvi, java.lang.String str, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ;
        MutableLiveData<java.lang.Boolean> mutableLiveDataDbNXlk;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1") && (dexOrderDetailViewModelAEQbTJ = hvi.AEQbTJ()) != null && (mutableLiveDataDbNXlk = dexOrderDetailViewModelAEQbTJ.DbNXlk()) != null) {
            mutableLiveDataDbNXlk.setValue(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        if (this.djBIcL != null) {
            InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), C33129mqd.valueOf(str3), false, 2, null);
            long jAhwBna = chainMetaWithRealChainId$default != null ? chainMetaWithRealChainId$default.AhwBna() : 0L;
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            long j = jAhwBna;
            KWHzl(childFragmentManager, str, j, str2, str4, yho);
            androidx.fragment.app.FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
            EZpvd(childFragmentManager2, str, j, str2, str4, yho);
            androidx.fragment.app.FragmentManager childFragmentManager3 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
            AEQbTJ(childFragmentManager3, str, j, str2, str4, yho);
        }
    }

    public final void KWHzl(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, long j, java.lang.String str2, java.lang.String str3, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        C22093hXq c22093hXqOLrzqt = OLrzqt();
        if (c22093hXqOLrzqt != null) {
            c22093hXqOLrzqt.AEQbTJ(fragmentManager, str, j, str2, str3, yho);
        }
    }

    private final void AEQbTJ(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, long j, java.lang.String str2, java.lang.String str3, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        C22093hXq c22093hXqOLrzqt = OLrzqt();
        if (c22093hXqOLrzqt != null) {
            c22093hXqOLrzqt.KWHzl(fragmentManager, str, j, str2, str3, yho);
        }
    }

    private final void EZpvd(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, long j, java.lang.String str2, java.lang.String str3, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        C22093hXq c22093hXqOLrzqt = OLrzqt();
        if (c22093hXqOLrzqt != null) {
            c22093hXqOLrzqt.EZpvd(fragmentManager, str, j, str2, str3, yho);
        }
    }

    private final void KWHzl(java.lang.String str, OrderDetailBean orderDetailBean) {
        C22093hXq c22093hXqOLrzqt = OLrzqt();
        if (c22093hXqOLrzqt != null) {
            c22093hXqOLrzqt.AEQbTJ(str, orderDetailBean);
        }
    }

    @Override // o.AbstractC22038hVp
    public void copydefault(boolean z, boolean z2) {
        DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ;
        MutableLiveData<java.util.ArrayList<DexMultiChildOrderInfoVo>> mutableLiveDataValueOf;
        java.util.ArrayList<DexMultiChildOrderInfoVo> value;
        if (!z2 || !z || (dexOrderDetailViewModelAEQbTJ = AEQbTJ()) == null || (mutableLiveDataValueOf = dexOrderDetailViewModelAEQbTJ.valueOf()) == null || (value = mutableLiveDataValueOf.getValue()) == null) {
            return;
        }
        AEQbTJ(value);
    }
}

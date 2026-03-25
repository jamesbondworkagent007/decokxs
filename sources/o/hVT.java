package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.main.swap.history.detail.DexOrderDetailViewModel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import o.InterfaceC9737bbI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class hVT extends AbstractC22038hVp {
    public static final Application Companion = new Application(null);
    public static final int djBIcL = 8;
    public hBQ AhwBna;

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hVT.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final hVT EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            hVT hvt = new hVT();
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, str);
            hvt.setArguments(bundle);
            return hvt;
        }
    }

    private final C22093hXq OLrzqt() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return (C22093hXq) activity.findViewById(C23274hvD.Application.readGroup);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hBQ hbqCopydefault = hBQ.copydefault(layoutInflater, viewGroup, false);
        this.AhwBna = hbqCopydefault;
        if (hbqCopydefault != null) {
            return hbqCopydefault.getRoot();
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
        OLrzqt(copydefault(), str, str2, (dexOrderDetailViewModelAEQbTJ3 == null || (mutableLiveDataDjBIcL = dexOrderDetailViewModelAEQbTJ3.djBIcL()) == null || (value = mutableLiveDataDjBIcL.getValue()) == null || (fromChildOrderDetailVo = value.getFromChildOrderDetailVo()) == null || (transactionHash = fromChildOrderDetailVo.getTransactionHash()) == null) ? "" : transactionHash, new yHO() { // from class: o.hVS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return hVT.OLrzqt(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2, (java.lang.String) obj3);
            }
        });
    }

    public static final Unit OLrzqt(hVT hvt, boolean z, java.lang.String str, java.lang.String str2) {
        DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ;
        MutableLiveData<OrderDetailBean> mutableLiveDataDjBIcL;
        OrderDetailBean value;
        DexMultiChildOrderInfoVo fromChildOrderDetailVo;
        if (z && str2 != null && (dexOrderDetailViewModelAEQbTJ = hvt.AEQbTJ()) != null && (mutableLiveDataDjBIcL = dexOrderDetailViewModelAEQbTJ.djBIcL()) != null && (value = mutableLiveDataDjBIcL.getValue()) != null && (fromChildOrderDetailVo = value.getFromChildOrderDetailVo()) != null) {
            fromChildOrderDetailVo.setTransactionHash(str2);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC22038hVp
    public void KWHzl(@NotNull OrderDetailBean orderDetailBean) {
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        hBQ hbq = this.AhwBna;
        if (hbq != null) {
            hbq.AEQbTJ.setOrderSideMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.apNbdB));
            hbq.djBIcL.setOrderSideMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.gSBher));
            hbq.copydefault.KWHzl(orderDetailBean);
            EZpvd(copydefault(), orderDetailBean);
        }
        copydefault(orderDetailBean);
    }

    @Override // o.AbstractC22038hVp
    public void AEQbTJ(@NotNull java.util.List<DexMultiChildOrderInfoVo> list) {
        hBQ hbq;
        hYH hyh;
        hYH hyh2;
        hYH hyh3;
        hYH hyh4;
        hYH hyh5;
        hYH hyh6;
        hYH hyh7;
        hYH hyh8;
        Intrinsics.checkNotNullParameter(list, "");
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo = (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.firstOrNull(list);
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2 = (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.wlaJM(list);
        boolean z = false;
        if (dexMultiChildOrderInfoVo != null) {
            hBQ hbq2 = this.AhwBna;
            if (hbq2 != null && (hyh8 = hbq2.AEQbTJ) != null) {
                hyh8.copydefault(dexMultiChildOrderInfoVo.getToTokenIcon());
            }
            hBQ hbq3 = this.AhwBna;
            if (hbq3 != null && (hyh7 = hbq3.AEQbTJ) != null) {
                hyh7.setValue(dexMultiChildOrderInfoVo.getCoinFromValueShow(copydefault()), dexMultiChildOrderInfoVo.getToTokenSymbol());
            }
            if (dexMultiChildOrderInfoVo2 != null) {
                DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ = AEQbTJ();
                boolean zIsSupportAccelerate = dexMultiChildOrderInfoVo2.isSupportAccelerate(dexOrderDetailViewModelAEQbTJ != null ? dexOrderDetailViewModelAEQbTJ.fJNWhG() : false);
                hBQ hbq4 = this.AhwBna;
                if (hbq4 != null && (hyh6 = hbq4.AEQbTJ) != null) {
                    java.lang.String status = dexMultiChildOrderInfoVo2.getStatus();
                    DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ2 = AEQbTJ();
                    hyh6.KWHzl(zIsSupportAccelerate, status, dexOrderDetailViewModelAEQbTJ2 != null ? dexOrderDetailViewModelAEQbTJ2.fetchVPNInfo() : false);
                }
            }
        }
        if (dexMultiChildOrderInfoVo2 != null) {
            hBQ hbq5 = this.AhwBna;
            if (hbq5 != null && (hyh5 = hbq5.djBIcL) != null) {
                hyh5.copydefault(dexMultiChildOrderInfoVo2.getToTokenIcon());
            }
            hBQ hbq6 = this.AhwBna;
            if (hbq6 != null && (hyh4 = hbq6.djBIcL) != null) {
                hyh4.setValue(dexMultiChildOrderInfoVo2.getCoinValueShow(copydefault()), dexMultiChildOrderInfoVo2.getToTokenSymbol());
            }
            hBQ hbq7 = this.AhwBna;
            if (hbq7 != null && (hyh3 = hbq7.djBIcL) != null) {
                hyh3.setChildOrderState(dexMultiChildOrderInfoVo2.getStatus());
            }
            InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = C22380heK.OLrzqt.copydefault(copydefault()).fARcdN().AEQbTJ();
            if (interfaceC9738bbJAEQbTJ != null && interfaceC9738bbJAEQbTJ.QfsBiF()) {
                z = true;
            }
            hBQ hbq8 = this.AhwBna;
            if (hbq8 != null && (hyh2 = hbq8.djBIcL) != null) {
                hyh2.setInstructionInfo(dexMultiChildOrderInfoVo2, z, new Function2() { // from class: o.hVU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return hVT.KWHzl(this.copydefault, (java.lang.String) obj, (DexMultiChildOrderInfoVo) obj2);
                    }
                });
            }
            if (!Intrinsics.EZpvd((java.lang.Object) dexMultiChildOrderInfoVo2.getMainStatus(), (java.lang.Object) "1") || (hbq = this.AhwBna) == null || (hyh = hbq.djBIcL) == null) {
                return;
            }
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            hyh.setValueColor(C33512mxp.tradeRiseDefault$default(c33512mxp, contextRequireContext, 0.0f, 2, null));
        }
    }

    public static final Unit KWHzl(hVT hvt, java.lang.String str, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ;
        MutableLiveData<java.lang.Boolean> mutableLiveDataDbNXlk;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1") || (dexOrderDetailViewModelAEQbTJ = hvt.AEQbTJ()) == null || (mutableLiveDataDbNXlk = dexOrderDetailViewModelAEQbTJ.DbNXlk()) == null) {
            return null;
        }
        mutableLiveDataDbNXlk.setValue(java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    private final void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        if (this.AhwBna != null) {
            InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), C33129mqd.valueOf(str3), false, 2, null);
            long jAhwBna = chainMetaWithRealChainId$default != null ? chainMetaWithRealChainId$default.AhwBna() : 0L;
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            long j = jAhwBna;
            AEQbTJ(childFragmentManager, str, j, str2, str4, yho);
            androidx.fragment.app.FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
            OLrzqt(childFragmentManager2, str, j, str2, str4, yho);
            androidx.fragment.app.FragmentManager childFragmentManager3 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
            KWHzl(childFragmentManager3, str, j, str2, str4, yho);
        }
    }

    private final void AEQbTJ(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, long j, java.lang.String str2, java.lang.String str3, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        C22093hXq c22093hXqOLrzqt = OLrzqt();
        if (c22093hXqOLrzqt != null) {
            c22093hXqOLrzqt.AEQbTJ(fragmentManager, str, j, str2, str3, yho);
        }
    }

    private final void KWHzl(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, long j, java.lang.String str2, java.lang.String str3, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        C22093hXq c22093hXqOLrzqt = OLrzqt();
        if (c22093hXqOLrzqt != null) {
            c22093hXqOLrzqt.KWHzl(fragmentManager, str, j, str2, str3, yho);
        }
    }

    private final void OLrzqt(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, long j, java.lang.String str2, java.lang.String str3, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        C22093hXq c22093hXqOLrzqt = OLrzqt();
        if (c22093hXqOLrzqt != null) {
            c22093hXqOLrzqt.EZpvd(fragmentManager, str, j, str2, str3, yho);
        }
    }

    private final void EZpvd(java.lang.String str, OrderDetailBean orderDetailBean) {
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

    private final void copydefault(OrderDetailBean orderDetailBean) {
        hBQ hbq = this.AhwBna;
        if (hbq != null) {
            AppCompatTextView appCompatTextView = hbq.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(orderDetailBean.orderHasSurplus() ? 0 : 8);
            if (orderDetailBean.isHasSurplus() == 1) {
                AppCompatTextView appCompatTextView2 = hbq.EZpvd;
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
}

package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.DexBridgeOrderInfoVo;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.main.swap.history.detail.DexOrderDetailViewModel;
import com.okinc.wallet.api.bean.WalletTxDetailBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC9737bbI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hVt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22042hVt extends AbstractC22038hVp {
    public static final Application Companion = new Application(null);
    public static final int valueOf = 8;
    public hBG djBIcL;

    /* JADX INFO: renamed from: o.hVt$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hVt.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C22042hVt OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C22042hVt c22042hVt = new C22042hVt();
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, str);
            c22042hVt.setArguments(bundle);
            return c22042hVt;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hBG hbgEZpvd = hBG.EZpvd(layoutInflater, viewGroup, false);
        this.djBIcL = hbgEZpvd;
        if (hbgEZpvd != null) {
            return hbgEZpvd.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC22038hVp
    public void KWHzl(@NotNull OrderDetailBean orderDetailBean) {
        hBG hbg;
        hXN hxn;
        DexMultiChildOrderInfoVo bridgeChildOrderDetailVo;
        hXN hxn2;
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        hBG hbg2 = this.djBIcL;
        if (hbg2 != null) {
            hbg2.OLrzqt.setOrderSideMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.apNbdB));
            hbg2.djBIcL.setOrderSideMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.gSBher));
            hbg2.AEQbTJ.EZpvd(orderDetailBean);
            hbg2.KWHzl.AEQbTJ(orderDetailBean, copydefault());
            hBG hbg3 = this.djBIcL;
            if (hbg3 != null && (hxn2 = hbg3.djBIcL) != null) {
                hxn2.OLrzqt();
            }
            if ((!C22822hmc.EZpvd(orderDetailBean.getStatus()) && ((bridgeChildOrderDetailVo = orderDetailBean.getBridgeChildOrderDetailVo()) == null || !(!bridgeChildOrderDetailVo.isErrorCodeNormal()))) || (hbg = this.djBIcL) == null || (hxn = hbg.OLrzqt) == null) {
                return;
            }
            hxn.OLrzqt();
        }
    }

    @Override // o.AbstractC22038hVp
    public void AEQbTJ(@NotNull java.util.List<DexMultiChildOrderInfoVo> list) {
        hBG hbg;
        hXN hxn;
        MutableLiveData<OrderDetailBean> mutableLiveDataDjBIcL;
        hBG hbg2;
        hXN hxn2;
        java.lang.String bridgeName;
        hXN hxn3;
        hXN hxn4;
        AppCompatImageView appCompatImageViewKWHzl;
        hXN hxn5;
        hXN hxn6;
        hXN hxn7;
        hXN hxn8;
        hXN hxn9;
        hXN hxn10;
        hBG hbg3;
        hXN hxn11;
        hXN hxn12;
        AppCompatImageView appCompatImageViewKWHzl2;
        hXN hxn13;
        hXN hxn14;
        hXN hxn15;
        hXN hxn16;
        Intrinsics.checkNotNullParameter(list, "");
        final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo = (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.firstOrNull(list);
        final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2 = (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.wlaJM(list);
        hBG hbg4 = this.djBIcL;
        hXN hxn17 = hbg4 != null ? hbg4.OLrzqt : null;
        DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ = AEQbTJ();
        boolean z = true;
        copydefault(hxn17, dexMultiChildOrderInfoVo, dexOrderDetailViewModelAEQbTJ == null || !dexOrderDetailViewModelAEQbTJ.fJNWhG());
        hBG hbg5 = this.djBIcL;
        hXN hxn18 = hbg5 != null ? hbg5.djBIcL : null;
        DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ2 = AEQbTJ();
        if (dexOrderDetailViewModelAEQbTJ2 != null && dexOrderDetailViewModelAEQbTJ2.fJNWhG()) {
            z = false;
        }
        copydefault(hxn18, dexMultiChildOrderInfoVo2, z);
        if (dexMultiChildOrderInfoVo != null) {
            hBG hbg6 = this.djBIcL;
            if (hbg6 != null && (hxn16 = hbg6.OLrzqt) != null) {
                hxn16.OLrzqt(dexMultiChildOrderInfoVo.getToTokenIcon());
            }
            hBG hbg7 = this.djBIcL;
            if (hbg7 != null && (hxn15 = hbg7.OLrzqt) != null) {
                hxn15.setValue(dexMultiChildOrderInfoVo.getCoinFromValueShow(copydefault()), dexMultiChildOrderInfoVo.getToTokenSymbol());
            }
            hBG hbg8 = this.djBIcL;
            if (hbg8 != null && (hxn14 = hbg8.OLrzqt) != null) {
                hxn14.setChainName(dexMultiChildOrderInfoVo.getToChainName());
            }
            hBG hbg9 = this.djBIcL;
            if (hbg9 != null && (hxn13 = hbg9.OLrzqt) != null) {
                hxn13.EZpvd(dexMultiChildOrderInfoVo.isShowChildOrderLink());
            }
            DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ3 = AEQbTJ();
            boolean zIsSupportAccelerate = dexMultiChildOrderInfoVo.isSupportAccelerate(dexOrderDetailViewModelAEQbTJ3 != null ? dexOrderDetailViewModelAEQbTJ3.fJNWhG() : false);
            copydefault(dexMultiChildOrderInfoVo);
            hBG hbg10 = this.djBIcL;
            if (hbg10 != null && (hxn12 = hbg10.OLrzqt) != null && (appCompatImageViewKWHzl2 = hxn12.KWHzl()) != null) {
                appCompatImageViewKWHzl2.setOnClickListener(new View.OnClickListener() { // from class: o.hVy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C22042hVt.OLrzqt(this.AEQbTJ, dexMultiChildOrderInfoVo, view);
                    }
                });
            }
            if (dexMultiChildOrderInfoVo.isOpenPackUpViewStatus() && (hbg3 = this.djBIcL) != null && (hxn11 = hbg3.OLrzqt) != null) {
                DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ4 = AEQbTJ();
                java.lang.String strEZpvd = C25352ivB.EZpvd(zIsSupportAccelerate, dexOrderDetailViewModelAEQbTJ4 != null ? dexOrderDetailViewModelAEQbTJ4.fetchVPNInfo() : false);
                DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ5 = AEQbTJ();
                boolean zOLrzqt = dexOrderDetailViewModelAEQbTJ5 != null ? dexOrderDetailViewModelAEQbTJ5.OLrzqt(dexMultiChildOrderInfoVo) : false;
                DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ6 = AEQbTJ();
                hxn11.AEQbTJ(strEZpvd, zOLrzqt, dexOrderDetailViewModelAEQbTJ6 != null ? dexOrderDetailViewModelAEQbTJ6.fetchVPNInfo() : false, dexMultiChildOrderInfoVo.getStatus());
            }
            hBG hbg11 = this.djBIcL;
            if (hbg11 != null && (hxn10 = hbg11.OLrzqt) != null) {
                hxn10.setInstructionInfo(dexMultiChildOrderInfoVo, new Function2() { // from class: o.hVA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C22042hVt.EZpvd((java.lang.String) obj, (DexMultiChildOrderInfoVo) obj2);
                    }
                });
            }
        }
        if (dexMultiChildOrderInfoVo2 != null) {
            hBG hbg12 = this.djBIcL;
            if (hbg12 != null && (hxn9 = hbg12.djBIcL) != null) {
                hxn9.OLrzqt(dexMultiChildOrderInfoVo2.getToTokenIcon());
            }
            hBG hbg13 = this.djBIcL;
            if (hbg13 != null && (hxn8 = hbg13.djBIcL) != null) {
                hxn8.setValue(dexMultiChildOrderInfoVo2.getCoinValueShow(copydefault()), dexMultiChildOrderInfoVo2.getToTokenSymbol());
            }
            hBG hbg14 = this.djBIcL;
            if (hbg14 != null && (hxn7 = hbg14.djBIcL) != null) {
                hxn7.setChildOrderState(dexMultiChildOrderInfoVo2.getStatus());
            }
            hBG hbg15 = this.djBIcL;
            if (hbg15 != null && (hxn6 = hbg15.djBIcL) != null) {
                hxn6.setChainName(dexMultiChildOrderInfoVo2.getToChainName());
            }
            hBG hbg16 = this.djBIcL;
            if (hbg16 != null && (hxn5 = hbg16.djBIcL) != null) {
                hxn5.EZpvd(dexMultiChildOrderInfoVo2.isShowChildOrderLink());
            }
            hBG hbg17 = this.djBIcL;
            if (hbg17 != null && (hxn4 = hbg17.djBIcL) != null && (appCompatImageViewKWHzl = hxn4.KWHzl()) != null) {
                appCompatImageViewKWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.hVx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C22042hVt.EZpvd(this.EZpvd, dexMultiChildOrderInfoVo2, view);
                    }
                });
            }
            hBG hbg18 = this.djBIcL;
            if (hbg18 != null && (hxn3 = hbg18.djBIcL) != null) {
                hxn3.setInstructionInfo(dexMultiChildOrderInfoVo2, new Function2() { // from class: o.hVz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C22042hVt.copydefault(this.EZpvd, (java.lang.String) obj, (DexMultiChildOrderInfoVo) obj2);
                    }
                });
            }
            DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ7 = AEQbTJ();
            if (dexOrderDetailViewModelAEQbTJ7 != null && (mutableLiveDataDjBIcL = dexOrderDetailViewModelAEQbTJ7.djBIcL()) != null && mutableLiveDataDjBIcL.getValue() != null && dexMultiChildOrderInfoVo2.isOpenPackUpViewStatus() && dexMultiChildOrderInfoVo2.isErrorCodeNormal() && (hbg2 = this.djBIcL) != null && (hxn2 = hbg2.OLrzqt) != null) {
                DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ8 = AEQbTJ();
                boolean zCopydefault = copydefault(dexOrderDetailViewModelAEQbTJ8 != null ? dexOrderDetailViewModelAEQbTJ8.fetchVPNInfo() : false);
                DexBridgeOrderInfoVo bridgeOrderInfoVo = dexMultiChildOrderInfoVo2.getBridgeOrderInfoVo();
                if (bridgeOrderInfoVo == null || (bridgeName = bridgeOrderInfoVo.getBridgeName()) == null) {
                    bridgeName = "";
                }
                java.lang.String strOLrzqt = C25352ivB.OLrzqt(zCopydefault, bridgeName, dexMultiChildOrderInfoVo2.getToChainName());
                DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ9 = AEQbTJ();
                hxn2.AEQbTJ(strOLrzqt, false, dexOrderDetailViewModelAEQbTJ9 != null ? dexOrderDetailViewModelAEQbTJ9.fetchVPNInfo() : false, dexMultiChildOrderInfoVo2.getStatus());
            }
            if (!Intrinsics.EZpvd((java.lang.Object) dexMultiChildOrderInfoVo2.getMainStatus(), (java.lang.Object) "1") || (hbg = this.djBIcL) == null || (hxn = hbg.djBIcL) == null) {
                return;
            }
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            hxn.setValueColor(C33512mxp.tradeRiseDefault$default(c33512mxp, contextRequireContext, 0.0f, 2, null));
        }
    }

    public static final void OLrzqt(C22042hVt c22042hVt, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, android.view.View view) {
        android.content.Context context = c22042hVt.getContext();
        if (context != null) {
            C25352ivB.OLrzqt(context, dexMultiChildOrderInfoVo.getExploreUrl());
        }
    }

    public static final Unit EZpvd(java.lang.String str, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C22042hVt c22042hVt, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, android.view.View view) {
        android.content.Context context = c22042hVt.getContext();
        if (context != null) {
            C25352ivB.OLrzqt(context, dexMultiChildOrderInfoVo.getExploreUrl());
        }
    }

    public static final Unit copydefault(C22042hVt c22042hVt, java.lang.String str, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "2")) {
            c22042hVt.OLrzqt(dexMultiChildOrderInfoVo);
        }
        return Unit.INSTANCE;
    }

    public final boolean copydefault(boolean z) {
        MutableLiveData<OrderDetailBean> mutableLiveDataDjBIcL;
        OrderDetailBean value;
        DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ = AEQbTJ();
        if (dexOrderDetailViewModelAEQbTJ == null || (mutableLiveDataDjBIcL = dexOrderDetailViewModelAEQbTJ.djBIcL()) == null || (value = mutableLiveDataDjBIcL.getValue()) == null || !value.isOrderInRedeemStatus()) {
            return z;
        }
        return false;
    }

    public final void copydefault(hXN hxn, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, boolean z) {
        C24331ibn c24331ibnCopydefault;
        C24328ibk c24328ibkEZpvd;
        if (dexMultiChildOrderInfoVo != null) {
            if (hxn != null && (c24331ibnCopydefault = hxn.copydefault()) != null && (c24328ibkEZpvd = c24331ibnCopydefault.EZpvd()) != null) {
                c24328ibkEZpvd.setAccelerateSize(24);
            }
            if (hxn != null) {
                hxn.EZpvd(dexMultiChildOrderInfoVo, z);
            }
        }
    }

    public final void copydefault(final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        hXN hxn;
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ;
        java.lang.String strDbNXlk;
        MutableLiveData<OrderDetailBean> mutableLiveDataDjBIcL;
        OrderDetailBean value;
        java.lang.String from;
        InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), C33129mqd.valueOf(dexMultiChildOrderInfoVo.getFromChainId()), false, 2, null);
        long jAhwBna = chainMetaWithRealChainId$default != null ? chainMetaWithRealChainId$default.AhwBna() : 0L;
        hBG hbg = this.djBIcL;
        if (hbg == null || (hxn = hbg.OLrzqt) == null) {
            return;
        }
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        java.lang.String transactionHash = dexMultiChildOrderInfoVo.getTransactionHash();
        DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ = AEQbTJ();
        java.lang.String str = (dexOrderDetailViewModelAEQbTJ == null || (mutableLiveDataDjBIcL = dexOrderDetailViewModelAEQbTJ.djBIcL()) == null || (value = mutableLiveDataDjBIcL.getValue()) == null || (from = value.getFrom()) == null) ? "" : from;
        DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ2 = AEQbTJ();
        hxn.KWHzl(childFragmentManager, new WalletTxDetailBean("", transactionHash, str, jAhwBna, (dexOrderDetailViewModelAEQbTJ2 == null || (interfaceC9738bbJAEQbTJ = dexOrderDetailViewModelAEQbTJ2.AEQbTJ()) == null || (strDbNXlk = interfaceC9738bbJAEQbTJ.DbNXlk()) == null) ? "" : strDbNXlk, (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null), new yHO() { // from class: o.hVB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C22042hVt.copydefault(dexMultiChildOrderInfoVo, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2, (java.lang.String) obj3);
            }
        });
    }

    public static final Unit copydefault(DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, boolean z, java.lang.String str, java.lang.String str2) {
        if (z && str2 != null) {
            dexMultiChildOrderInfoVo.setTransactionHash(str2);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC22038hVp
    public void copydefault(boolean z, boolean z2) {
        DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ;
        MutableLiveData<java.util.ArrayList<DexMultiChildOrderInfoVo>> mutableLiveDataValueOf;
        java.util.ArrayList<DexMultiChildOrderInfoVo> value;
        java.lang.Boolean boolValueOf;
        hBG hbg;
        hXN hxn;
        java.lang.String bridgeName;
        hXN hxn2;
        if (!z || (dexOrderDetailViewModelAEQbTJ = AEQbTJ()) == null || (mutableLiveDataValueOf = dexOrderDetailViewModelAEQbTJ.valueOf()) == null || (value = mutableLiveDataValueOf.getValue()) == null) {
            return;
        }
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo = (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.firstOrNull(value);
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2 = (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.wlaJM(value);
        if (dexMultiChildOrderInfoVo != null) {
            DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ2 = AEQbTJ();
            boolValueOf = java.lang.Boolean.valueOf(dexMultiChildOrderInfoVo.isSupportAccelerate(dexOrderDetailViewModelAEQbTJ2 != null ? dexOrderDetailViewModelAEQbTJ2.fJNWhG() : false));
        } else {
            boolValueOf = null;
        }
        if (dexMultiChildOrderInfoVo != null && dexMultiChildOrderInfoVo.isOpenPackUpViewStatus()) {
            hBG hbg2 = this.djBIcL;
            if (hbg2 == null || (hxn2 = hbg2.OLrzqt) == null) {
                return;
            }
            java.lang.String strEZpvd = C25352ivB.EZpvd(boolValueOf != null ? boolValueOf.booleanValue() : false, z2);
            DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ3 = AEQbTJ();
            hxn2.AEQbTJ(strEZpvd, dexOrderDetailViewModelAEQbTJ3 != null ? dexOrderDetailViewModelAEQbTJ3.OLrzqt(dexMultiChildOrderInfoVo) : false, z2, dexMultiChildOrderInfoVo.getStatus());
            return;
        }
        if (dexMultiChildOrderInfoVo2 == null || !dexMultiChildOrderInfoVo2.isOpenPackUpViewStatus() || (hbg = this.djBIcL) == null || (hxn = hbg.OLrzqt) == null) {
            return;
        }
        boolean zCopydefault = copydefault(z2);
        DexBridgeOrderInfoVo bridgeOrderInfoVo = dexMultiChildOrderInfoVo2.getBridgeOrderInfoVo();
        if (bridgeOrderInfoVo == null || (bridgeName = bridgeOrderInfoVo.getBridgeName()) == null) {
            bridgeName = "";
        }
        hxn.AEQbTJ(C25352ivB.OLrzqt(zCopydefault, bridgeName, dexMultiChildOrderInfoVo2.getToChainName()), false, z2, dexMultiChildOrderInfoVo2.getStatus());
    }
}

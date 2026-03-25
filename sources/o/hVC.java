package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.main.swap.history.detail.DexOrderDetailViewModel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class hVC extends AbstractC22038hVp {
    public hBK djBIcL;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AYXKKw = 8;

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hVC.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final hVC EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            hVC hvc = new hVC();
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, str);
            hvc.setArguments(bundle);
            return hvc;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hBK hbkKWHzl = hBK.KWHzl(layoutInflater, viewGroup, false);
        this.djBIcL = hbkKWHzl;
        if (hbkKWHzl != null) {
            return hbkKWHzl.getRoot();
        }
        return null;
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

    @Override // o.AbstractC22038hVp
    public void KWHzl(@NotNull OrderDetailBean orderDetailBean) {
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        hBK hbk = this.djBIcL;
        if (hbk != null) {
            hbk.copydefault.setOrderSideMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.apNbdB));
            hbk.OLrzqt.setOrderSideMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.gSBher));
            hbk.AEQbTJ.KWHzl(orderDetailBean);
        }
    }

    @Override // o.AbstractC22038hVp
    public void AEQbTJ(@NotNull java.util.List<DexMultiChildOrderInfoVo> list) {
        hYO hyo;
        hBK hbk;
        hYO hyo2;
        hYO hyo3;
        hYO hyo4;
        hYO hyo5;
        hYO hyo6;
        hYO hyo7;
        hYO hyo8;
        hYO hyo9;
        hYO hyo10;
        hYO hyo11;
        hYO hyo12;
        Intrinsics.checkNotNullParameter(list, "");
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo = (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (dexMultiChildOrderInfoVo != null) {
            hBK hbk2 = this.djBIcL;
            if (hbk2 != null && (hyo12 = hbk2.copydefault) != null) {
                hyo12.EZpvd(dexMultiChildOrderInfoVo.getToTokenIcon());
            }
            hBK hbk3 = this.djBIcL;
            if (hbk3 != null && (hyo11 = hbk3.copydefault) != null) {
                hyo11.setValue(dexMultiChildOrderInfoVo.getCoinFromValueShow(copydefault()), dexMultiChildOrderInfoVo.getToTokenSymbol());
            }
            hBK hbk4 = this.djBIcL;
            if (hbk4 != null && (hyo10 = hbk4.copydefault) != null) {
                java.lang.String string = getString(C23274hvD.Fragment.QVMIlxQVMIlx);
                Intrinsics.checkNotNullExpressionValue(string, "");
                DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ = AEQbTJ();
                hyo10.EZpvd(string, dexOrderDetailViewModelAEQbTJ != null ? dexOrderDetailViewModelAEQbTJ.fetchVPNInfo() : false, dexMultiChildOrderInfoVo.getMainStatus());
            }
        }
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2 = (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.wlaJM(list);
        if (dexMultiChildOrderInfoVo2 != null) {
            hBK hbk5 = this.djBIcL;
            if (hbk5 != null && (hyo9 = hbk5.OLrzqt) != null) {
                hyo9.EZpvd(dexMultiChildOrderInfoVo2.getToTokenIcon());
            }
            hBK hbk6 = this.djBIcL;
            if (hbk6 != null && (hyo8 = hbk6.OLrzqt) != null) {
                hyo8.setValue(dexMultiChildOrderInfoVo2.getCoinValueShow(copydefault()), dexMultiChildOrderInfoVo2.getToTokenSymbol());
            }
            hBK hbk7 = this.djBIcL;
            if (hbk7 != null && (hyo7 = hbk7.OLrzqt) != null) {
                hyo7.setChildOrderState(dexMultiChildOrderInfoVo2.getStatus());
            }
            hBK hbk8 = this.djBIcL;
            if (hbk8 != null && (hyo6 = hbk8.OLrzqt) != null) {
                hyo6.EZpvd();
            }
            hBK hbk9 = this.djBIcL;
            if (hbk9 != null && (hyo5 = hbk9.OLrzqt) != null) {
                hyo5.setInstructionInfo(dexMultiChildOrderInfoVo2, new Function2() { // from class: o.hVJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return hVC.OLrzqt(this.KWHzl, (java.lang.String) obj, (DexMultiChildOrderInfoVo) obj2);
                    }
                });
            }
            if (dexMultiChildOrderInfoVo2.showDiscount()) {
                hBK hbk10 = this.djBIcL;
                if (hbk10 != null && (hyo4 = hbk10.OLrzqt) != null) {
                    hyo4.setExtraGasVisible(0);
                }
                java.lang.String strCopydefault = C33069mpW.copydefault(C23274hvD.Fragment.OWSZPf, C56423yEv.EZpvd(C56390yDp.OLrzqt("percentage", C23311hvo.formatPercent$default(dexMultiChildOrderInfoVo2.getGasStationActivityReward().getDiscount(), false, 0, 0, null, null, 31, null))));
                hBK hbk11 = this.djBIcL;
                if (hbk11 != null && (hyo3 = hbk11.OLrzqt) != null) {
                    hyo3.setExtraGas(strCopydefault);
                }
            } else {
                hBK hbk12 = this.djBIcL;
                if (hbk12 != null && (hyo = hbk12.OLrzqt) != null) {
                    hyo.setExtraGasVisible(8);
                }
            }
            if (!Intrinsics.EZpvd((java.lang.Object) dexMultiChildOrderInfoVo2.getMainStatus(), (java.lang.Object) "1") || (hbk = this.djBIcL) == null || (hyo2 = hbk.OLrzqt) == null) {
                return;
            }
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            hyo2.setValueColor(C33512mxp.tradeRiseDefault$default(c33512mxp, contextRequireContext, 0.0f, 2, null));
        }
    }

    public static final Unit OLrzqt(hVC hvc, java.lang.String str, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ;
        MutableLiveData<java.lang.Boolean> mutableLiveDataDbNXlk;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1") && (dexOrderDetailViewModelAEQbTJ = hvc.AEQbTJ()) != null && (mutableLiveDataDbNXlk = dexOrderDetailViewModelAEQbTJ.DbNXlk()) != null) {
            mutableLiveDataDbNXlk.setValue(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}

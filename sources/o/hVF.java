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
public final class hVF extends AbstractC22038hVp {
    public static final Activity Companion = new Activity(null);
    public static final int valueOf = 8;
    public hBD djBIcL;

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hVF.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final hVF KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            hVF hvf = new hVF();
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, str);
            hvf.setArguments(bundle);
            return hvf;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hBD hbdOLrzqt = hBD.OLrzqt(layoutInflater, viewGroup, false);
        this.djBIcL = hbdOLrzqt;
        if (hbdOLrzqt != null) {
            return hbdOLrzqt.getRoot();
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
        hBD hbd = this.djBIcL;
        if (hbd != null) {
            hbd.EZpvd.setOrderSideMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.apNbdB));
            hbd.copydefault.setOrderSideMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.gSBher));
            hbd.KWHzl.KWHzl(orderDetailBean);
        }
    }

    @Override // o.AbstractC22038hVp
    public void AEQbTJ(@NotNull java.util.List<DexMultiChildOrderInfoVo> list) {
        hBD hbd;
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
            hBD hbd2 = this.djBIcL;
            if (hbd2 != null && (hyh8 = hbd2.EZpvd) != null) {
                hyh8.copydefault(dexMultiChildOrderInfoVo.getToTokenIcon());
            }
            hBD hbd3 = this.djBIcL;
            if (hbd3 != null && (hyh7 = hbd3.EZpvd) != null) {
                hyh7.setValue(dexMultiChildOrderInfoVo.getCoinFromValueShow(copydefault()), dexMultiChildOrderInfoVo.getToTokenSymbol());
            }
            if (dexMultiChildOrderInfoVo2 != null) {
                DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ = AEQbTJ();
                boolean zIsSupportAccelerate = dexMultiChildOrderInfoVo2.isSupportAccelerate(dexOrderDetailViewModelAEQbTJ != null ? dexOrderDetailViewModelAEQbTJ.fJNWhG() : false);
                hBD hbd4 = this.djBIcL;
                if (hbd4 != null && (hyh6 = hbd4.EZpvd) != null) {
                    java.lang.String status = dexMultiChildOrderInfoVo2.getStatus();
                    DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ2 = AEQbTJ();
                    hyh6.KWHzl(zIsSupportAccelerate, status, dexOrderDetailViewModelAEQbTJ2 != null ? dexOrderDetailViewModelAEQbTJ2.fetchVPNInfo() : false);
                }
            }
        }
        if (dexMultiChildOrderInfoVo2 != null) {
            hBD hbd5 = this.djBIcL;
            if (hbd5 != null && (hyh5 = hbd5.copydefault) != null) {
                hyh5.copydefault(dexMultiChildOrderInfoVo2.getToTokenIcon());
            }
            hBD hbd6 = this.djBIcL;
            if (hbd6 != null && (hyh4 = hbd6.copydefault) != null) {
                hyh4.setValue(dexMultiChildOrderInfoVo2.getCoinValueShow(copydefault()), dexMultiChildOrderInfoVo2.getToTokenSymbol());
            }
            hBD hbd7 = this.djBIcL;
            if (hbd7 != null && (hyh3 = hbd7.copydefault) != null) {
                hyh3.setChildOrderState(dexMultiChildOrderInfoVo2.getStatus());
            }
            InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = C22380heK.OLrzqt.copydefault(copydefault()).fARcdN().AEQbTJ();
            if (interfaceC9738bbJAEQbTJ != null && interfaceC9738bbJAEQbTJ.QfsBiF()) {
                z = true;
            }
            hBD hbd8 = this.djBIcL;
            if (hbd8 != null && (hyh2 = hbd8.copydefault) != null) {
                hyh2.setInstructionInfo(dexMultiChildOrderInfoVo2, z, new Function2() { // from class: o.hVE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return hVF.AEQbTJ(this.OLrzqt, (java.lang.String) obj, (DexMultiChildOrderInfoVo) obj2);
                    }
                });
            }
            if (!Intrinsics.EZpvd((java.lang.Object) dexMultiChildOrderInfoVo2.getMainStatus(), (java.lang.Object) "1") || (hbd = this.djBIcL) == null || (hyh = hbd.copydefault) == null) {
                return;
            }
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            hyh.setValueColor(C33512mxp.tradeRiseDefault$default(c33512mxp, contextRequireContext, 0.0f, 2, null));
        }
    }

    public static final Unit AEQbTJ(hVF hvf, java.lang.String str, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ;
        MutableLiveData<java.lang.Boolean> mutableLiveDataDbNXlk;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1") && (dexOrderDetailViewModelAEQbTJ = hvf.AEQbTJ()) != null && (mutableLiveDataDbNXlk = dexOrderDetailViewModelAEQbTJ.DbNXlk()) != null) {
            mutableLiveDataDbNXlk.setValue(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}

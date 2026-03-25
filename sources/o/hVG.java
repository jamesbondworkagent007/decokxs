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
public final class hVG extends AbstractC22038hVp {
    public hBI djBIcL;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AhwBna = 8;

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hVG.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final hVG OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            hVG hvg = new hVG();
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, str);
            hvg.setArguments(bundle);
            return hvg;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hBI hbiOLrzqt = hBI.OLrzqt(layoutInflater, viewGroup, false);
        this.djBIcL = hbiOLrzqt;
        if (hbiOLrzqt != null) {
            return hbiOLrzqt.getRoot();
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
        hBI hbi = this.djBIcL;
        if (hbi != null) {
            hbi.copydefault.setOrderSideMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.apNbdB));
            hbi.OLrzqt.setOrderSideMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.gSBher));
            hbi.AEQbTJ.copydefault(orderDetailBean);
        }
    }

    @Override // o.AbstractC22038hVp
    public void AEQbTJ(@NotNull java.util.List<DexMultiChildOrderInfoVo> list) {
        hBI hbi;
        hYA hya;
        hYA hya2;
        hYA hya3;
        hYA hya4;
        hYA hya5;
        hYA hya6;
        hYA hya7;
        hYA hya8;
        hYA hya9;
        hYA hya10;
        hYA hya11;
        Intrinsics.checkNotNullParameter(list, "");
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo = (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (dexMultiChildOrderInfoVo != null) {
            hBI hbi2 = this.djBIcL;
            if (hbi2 != null && (hya11 = hbi2.copydefault) != null) {
                hya11.EZpvd(dexMultiChildOrderInfoVo.getToTokenIcon());
            }
            hBI hbi3 = this.djBIcL;
            if (hbi3 != null && (hya10 = hbi3.copydefault) != null) {
                hya10.setValue(dexMultiChildOrderInfoVo.getCoinFromValueShow(copydefault()), dexMultiChildOrderInfoVo.getToTokenSymbol());
            }
            hBI hbi4 = this.djBIcL;
            if (hbi4 != null && (hya9 = hbi4.copydefault) != null) {
                hya9.setChainName(dexMultiChildOrderInfoVo.getToChainName());
            }
            hBI hbi5 = this.djBIcL;
            if (hbi5 != null && (hya8 = hbi5.copydefault) != null) {
                DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ = AEQbTJ();
                hya8.KWHzl((dexOrderDetailViewModelAEQbTJ == null || !dexOrderDetailViewModelAEQbTJ.fetchVPNInfo() || C22822hmc.EZpvd(dexMultiChildOrderInfoVo.getMainStatus())) ? false : true);
            }
        }
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2 = (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.wlaJM(list);
        if (dexMultiChildOrderInfoVo2 != null) {
            hBI hbi6 = this.djBIcL;
            if (hbi6 != null && (hya7 = hbi6.OLrzqt) != null) {
                hya7.EZpvd(dexMultiChildOrderInfoVo2.getToTokenIcon());
            }
            hBI hbi7 = this.djBIcL;
            if (hbi7 != null && (hya6 = hbi7.OLrzqt) != null) {
                hya6.setValue(dexMultiChildOrderInfoVo2.getCoinValueShow(copydefault()), dexMultiChildOrderInfoVo2.getToTokenSymbol());
            }
            hBI hbi8 = this.djBIcL;
            if (hbi8 != null && (hya5 = hbi8.OLrzqt) != null) {
                hya5.setChildOrderState(dexMultiChildOrderInfoVo2.getStatus());
            }
            hBI hbi9 = this.djBIcL;
            if (hbi9 != null && (hya4 = hbi9.OLrzqt) != null) {
                hya4.setChainName(dexMultiChildOrderInfoVo2.getToChainName());
            }
            hBI hbi10 = this.djBIcL;
            if (hbi10 != null && (hya3 = hbi10.OLrzqt) != null) {
                hya3.KWHzl();
            }
            hBI hbi11 = this.djBIcL;
            if (hbi11 != null && (hya2 = hbi11.OLrzqt) != null) {
                hya2.setInstructionInfo(dexMultiChildOrderInfoVo2, new Function2() { // from class: o.hVD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return hVG.KWHzl(this.KWHzl, (java.lang.String) obj, (DexMultiChildOrderInfoVo) obj2);
                    }
                });
            }
            if (!Intrinsics.EZpvd((java.lang.Object) dexMultiChildOrderInfoVo2.getMainStatus(), (java.lang.Object) "1") || (hbi = this.djBIcL) == null || (hya = hbi.OLrzqt) == null) {
                return;
            }
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            hya.setValueColor(C33512mxp.tradeRiseDefault$default(c33512mxp, contextRequireContext, 0.0f, 2, null));
        }
    }

    public static final Unit KWHzl(hVG hvg, java.lang.String str, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ;
        MutableLiveData<java.lang.Boolean> mutableLiveDataDbNXlk;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1") && (dexOrderDetailViewModelAEQbTJ = hvg.AEQbTJ()) != null && (mutableLiveDataDbNXlk = dexOrderDetailViewModelAEQbTJ.DbNXlk()) != null) {
            mutableLiveDataDbNXlk.setValue(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}

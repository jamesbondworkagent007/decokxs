package o;

import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.main.swap.history.detail.DexOrderDetailViewModel;
import com.okinc.business.dexlogic.track.enums.DexHistoryDetailsFullPageClick;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class hVN extends AbstractC22038hVp {
    public hBL djBIcL;
    public final C43316rmw gEmmrt = new C43316rmw();
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AhwBna = 8;

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hVN.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final hVN copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            hVN hvn = new hVN();
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, str);
            hvn.setArguments(bundle);
            return hvn;
        }
    }

    private final void valueOf() {
        RecyclerView recyclerView;
        MutableLiveData<OrderDetailBean> mutableLiveDataDjBIcL;
        OrderDetailBean value;
        java.lang.String from;
        hBL hbl = this.djBIcL;
        if (hbl == null || (recyclerView = hbl.AEQbTJ) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(this.gEmmrt);
        C43316rmw c43316rmw = this.gEmmrt;
        java.lang.String strCopydefault = copydefault();
        android.content.Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ = AEQbTJ();
        java.lang.String str = (dexOrderDetailViewModelAEQbTJ == null || (mutableLiveDataDjBIcL = dexOrderDetailViewModelAEQbTJ.djBIcL()) == null || (value = mutableLiveDataDjBIcL.getValue()) == null || (from = value.getFrom()) == null) ? "" : from;
        DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ2 = AEQbTJ();
        c43316rmw.register(DexMultiChildOrderInfoVo.class, new C22058hWi(strCopydefault, context, childFragmentManager, str, dexOrderDetailViewModelAEQbTJ2 != null ? dexOrderDetailViewModelAEQbTJ2.KWHzl() : null, AEQbTJ(), new Function2() { // from class: o.hVQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return hVN.KWHzl(this.EZpvd, (java.lang.String) obj, (DexMultiChildOrderInfoVo) obj2);
            }
        }));
    }

    public static final Unit KWHzl(hVN hvn, java.lang.String str, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        MutableLiveData<java.lang.Boolean> mutableLiveDataDbNXlk;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1")) {
            DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ = hvn.AEQbTJ();
            if (dexOrderDetailViewModelAEQbTJ != null && (mutableLiveDataDbNXlk = dexOrderDetailViewModelAEQbTJ.DbNXlk()) != null) {
                mutableLiveDataDbNXlk.setValue(java.lang.Boolean.TRUE);
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "2")) {
            hvn.OLrzqt();
            hvn.OLrzqt(dexMultiChildOrderInfoVo);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hBL hblAEQbTJ = hBL.AEQbTJ(layoutInflater, viewGroup, false);
        this.djBIcL = hblAEQbTJ;
        if (hblAEQbTJ != null) {
            return hblAEQbTJ.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC22038hVp
    public void copydefault(boolean z, boolean z2) {
        DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ;
        java.util.ArrayList<DexMultiChildOrderInfoVo> arrayListAhwBna;
        if (this.djBIcL == null || !z2 || !z || (dexOrderDetailViewModelAEQbTJ = AEQbTJ()) == null || (arrayListAhwBna = dexOrderDetailViewModelAEQbTJ.AhwBna()) == null) {
            return;
        }
        this.gEmmrt.setItems(arrayListAhwBna);
        this.gEmmrt.notifyDataSetChanged();
    }

    @Override // o.AbstractC22038hVp, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        valueOf();
    }

    @Override // o.AbstractC22038hVp
    public void KWHzl(@NotNull OrderDetailBean orderDetailBean) {
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        hBL hbl = this.djBIcL;
        if (hbl != null) {
            hbl.copydefault.KWHzl(orderDetailBean);
            hbl.EZpvd.AEQbTJ(orderDetailBean, copydefault());
        }
    }

    @Override // o.AbstractC22038hVp
    public void AEQbTJ(@NotNull java.util.List<DexMultiChildOrderInfoVo> list) {
        java.util.ArrayList<DexMultiChildOrderInfoVo> arrayListAhwBna;
        Intrinsics.checkNotNullParameter(list, "");
        DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ = AEQbTJ();
        if (dexOrderDetailViewModelAEQbTJ == null || (arrayListAhwBna = dexOrderDetailViewModelAEQbTJ.AhwBna()) == null) {
            return;
        }
        this.gEmmrt.setItems(arrayListAhwBna);
        this.gEmmrt.notifyDataSetChanged();
    }

    public final void OLrzqt() {
        C32866mlf.onEvent$default("DEXHistoryDetail_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.hVO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hVN.copydefault(this.KWHzl, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(hVN hvn, EventParamsList eventParamsList) {
        java.lang.String from;
        MutableLiveData<OrderDetailBean> mutableLiveDataDjBIcL;
        OrderDetailBean value;
        java.lang.String orderId;
        MutableLiveData<OrderDetailBean> mutableLiveDataDjBIcL2;
        OrderDetailBean value2;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ = hvn.AEQbTJ();
        if (dexOrderDetailViewModelAEQbTJ == null || (mutableLiveDataDjBIcL2 = dexOrderDetailViewModelAEQbTJ.djBIcL()) == null || (value2 = mutableLiveDataDjBIcL2.getValue()) == null || (from = value2.getFrom()) == null) {
            from = "";
        }
        eventParamsList.put("wallet_address", from, false);
        DexOrderDetailViewModel dexOrderDetailViewModelAEQbTJ2 = hvn.AEQbTJ();
        if (dexOrderDetailViewModelAEQbTJ2 != null && (mutableLiveDataDjBIcL = dexOrderDetailViewModelAEQbTJ2.djBIcL()) != null && (value = mutableLiveDataDjBIcL.getValue()) != null && (orderId = value.getOrderId()) != null) {
            str = orderId;
        }
        eventParamsList.put("orderId", str, false);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, DexHistoryDetailsFullPageClick.ButtonName.BRIDGE_TOKEN_EXCHANGE.getValue(), true);
        return Unit.INSTANCE;
    }
}

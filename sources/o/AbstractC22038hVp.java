package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.dex.api.bean.CoinInfo;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dexlogic.bean.DexBridgeShadowTokenPairInfoVo;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.main.swap.history.detail.DexOrderDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.gKO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hVp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC22038hVp extends androidx.fragment.app.Fragment {
    public DexOrderDetailViewModel KWHzl;
    public final InterfaceC56387yDm EZpvd = C31200lpY.copydefault(this);
    public final Observer<OrderDetailBean> OLrzqt = new Observer() { // from class: o.hVw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractC22038hVp.copydefault(this.copydefault, (OrderDetailBean) obj);
        }
    };
    public final Observer<java.util.ArrayList<DexMultiChildOrderInfoVo>> copydefault = new Observer() { // from class: o.hVu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractC22038hVp.KWHzl(this.AEQbTJ, (java.util.ArrayList) obj);
        }
    };
    public final Observer<kotlin.Pair<java.lang.Boolean, java.lang.Boolean>> AEQbTJ = new Observer() { // from class: o.hVs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractC22038hVp.EZpvd(this.EZpvd, (kotlin.Pair) obj);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexOrderDetailViewModel AEQbTJ() {
        return this.KWHzl;
    }

    public abstract void AEQbTJ(@NotNull java.util.List<DexMultiChildOrderInfoVo> list);

    public abstract void KWHzl(@NotNull OrderDetailBean orderDetailBean);

    public abstract void copydefault(boolean z, boolean z2);

    public final java.lang.String copydefault() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    public static final void copydefault(AbstractC22038hVp abstractC22038hVp, OrderDetailBean orderDetailBean) {
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        abstractC22038hVp.KWHzl(orderDetailBean);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractC22038hVp, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void KWHzl(AbstractC22038hVp abstractC22038hVp, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        abstractC22038hVp.AEQbTJ(arrayList);
    }

    public static final void EZpvd(AbstractC22038hVp abstractC22038hVp, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        abstractC22038hVp.copydefault(((java.lang.Boolean) pair.getFirst()).booleanValue(), ((java.lang.Boolean) pair.getSecond()).booleanValue());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.KWHzl = (DexOrderDetailViewModel) new ViewModelProvider(activity).get(DexOrderDetailViewModel.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        KWHzl();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EZpvd();
    }

    public final void KWHzl() {
        MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.Boolean>> mutableLiveDataValues;
        MutableLiveData<java.util.ArrayList<DexMultiChildOrderInfoVo>> mutableLiveDataValueOf;
        MutableLiveData<OrderDetailBean> mutableLiveDataDjBIcL;
        DexOrderDetailViewModel dexOrderDetailViewModel = this.KWHzl;
        if (dexOrderDetailViewModel != null && (mutableLiveDataDjBIcL = dexOrderDetailViewModel.djBIcL()) != null) {
            mutableLiveDataDjBIcL.observe(getViewLifecycleOwner(), this.OLrzqt);
        }
        DexOrderDetailViewModel dexOrderDetailViewModel2 = this.KWHzl;
        if (dexOrderDetailViewModel2 != null && (mutableLiveDataValueOf = dexOrderDetailViewModel2.valueOf()) != null) {
            mutableLiveDataValueOf.observe(getViewLifecycleOwner(), this.copydefault);
        }
        DexOrderDetailViewModel dexOrderDetailViewModel3 = this.KWHzl;
        if (dexOrderDetailViewModel3 == null || (mutableLiveDataValues = dexOrderDetailViewModel3.values()) == null) {
            return;
        }
        mutableLiveDataValues.observe(getViewLifecycleOwner(), this.AEQbTJ);
    }

    public final void EZpvd() {
        MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.Boolean>> mutableLiveDataValues;
        MutableLiveData<java.util.ArrayList<DexMultiChildOrderInfoVo>> mutableLiveDataValueOf;
        MutableLiveData<OrderDetailBean> mutableLiveDataDjBIcL;
        DexOrderDetailViewModel dexOrderDetailViewModel = this.KWHzl;
        if (dexOrderDetailViewModel != null && (mutableLiveDataDjBIcL = dexOrderDetailViewModel.djBIcL()) != null) {
            mutableLiveDataDjBIcL.removeObserver(this.OLrzqt);
        }
        DexOrderDetailViewModel dexOrderDetailViewModel2 = this.KWHzl;
        if (dexOrderDetailViewModel2 != null && (mutableLiveDataValueOf = dexOrderDetailViewModel2.valueOf()) != null) {
            mutableLiveDataValueOf.removeObserver(this.copydefault);
        }
        DexOrderDetailViewModel dexOrderDetailViewModel3 = this.KWHzl;
        if (dexOrderDetailViewModel3 == null || (mutableLiveDataValues = dexOrderDetailViewModel3.values()) == null) {
            return;
        }
        mutableLiveDataValues.removeObserver(this.AEQbTJ);
    }

    public final void OLrzqt(DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        final java.lang.String strDbNXlk;
        DexOrderDetailViewModel dexOrderDetailViewModel;
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXEZpvd;
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ;
        java.lang.String needSwapAmount;
        if (dexMultiChildOrderInfoVo != null) {
            DexBridgeShadowTokenPairInfoVo dexBridgeShadowTokenPairInfoVo = dexMultiChildOrderInfoVo.getDexBridgeShadowTokenPairInfoVo();
            final java.lang.String str = (dexBridgeShadowTokenPairInfoVo == null || (needSwapAmount = dexBridgeShadowTokenPairInfoVo.getNeedSwapAmount()) == null) ? "" : needSwapAmount;
            DexOrderDetailViewModel dexOrderDetailViewModel2 = this.KWHzl;
            if (dexOrderDetailViewModel2 == null || (interfaceC9738bbJAEQbTJ = dexOrderDetailViewModel2.AEQbTJ()) == null || (strDbNXlk = interfaceC9738bbJAEQbTJ.DbNXlk()) == null) {
                strDbNXlk = "";
            }
            final CoinInfo coinInfo = new CoinInfo(dexMultiChildOrderInfoVo.getToChainId(), dexBridgeShadowTokenPairInfoVo != null ? dexBridgeShadowTokenPairInfoVo.getShadowTokenAddress() : null, false, (java.lang.String) null, 12, (DefaultConstructorMarker) null);
            final CoinInfo coinInfo2 = new CoinInfo(dexMultiChildOrderInfoVo.getToChainId(), dexBridgeShadowTokenPairInfoVo != null ? dexBridgeShadowTokenPairInfoVo.getRealTokenAddress() : null, true, (java.lang.String) null, 8, (DefaultConstructorMarker) null);
            if (dexBridgeShadowTokenPairInfoVo == null || (dexOrderDetailViewModel = this.KWHzl) == null || (abstractC58185ywXEZpvd = dexOrderDetailViewModel.EZpvd(copydefault(), dexMultiChildOrderInfoVo.getToChainId(), dexBridgeShadowTokenPairInfoVo.getShadowTokenAddress(), dexBridgeShadowTokenPairInfoVo.getShadowTokenSymbol(), dexBridgeShadowTokenPairInfoVo.getShadowTokenDecimal())) == null) {
                return;
            }
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            AbstractC58185ywX abstractC58185ywXEZpvd2 = C58156yvv.EZpvd(abstractC58185ywXEZpvd, viewLifecycleOwner);
            if (abstractC58185ywXEZpvd2 != null) {
                final Function1 function1 = new Function1() { // from class: o.hVo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC22038hVp.EZpvd(this.AEQbTJ, strDbNXlk, coinInfo, coinInfo2, str, (java.lang.Boolean) obj);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hVn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        AbstractC22038hVp.AEQbTJ(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.hVr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC22038hVp.copydefault((java.lang.Throwable) obj);
                    }
                };
                abstractC58185ywXEZpvd2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hVq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        AbstractC22038hVp.KWHzl(function12, obj);
                    }
                });
            }
        }
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(AbstractC22038hVp abstractC22038hVp, java.lang.String str, CoinInfo coinInfo, CoinInfo coinInfo2, java.lang.String str2, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            LifecycleOwner viewLifecycleOwner = abstractC22038hVp.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            abstractC22038hVp.OLrzqt(viewLifecycleOwner, str, coinInfo, coinInfo2, str2);
        } else {
            C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.getShuffleMode, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.getShuffleMode, 0, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(LifecycleOwner lifecycleOwner, java.lang.String str, CoinInfo coinInfo, CoinInfo coinInfo2, java.lang.String str2) {
        gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        TradeParam tradeParam = new TradeParam(str, "inner_trade", coinInfo, coinInfo2, str2, (java.lang.Integer) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.Boolean) null, false, (java.lang.String) null, 0, (java.lang.String) null, 16352, (DefaultConstructorMarker) null);
        java.lang.String simpleName = AbstractC22038hVp.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        gKO.StateListAnimator.goToDexTrade$default(gko, contextRequireContext, lifecycleOwner, tradeParam, simpleName, null, 0, new Function1() { // from class: o.hVv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC22038hVp.EZpvd((gKW) obj);
            }
        }, 48, null);
    }

    public static final Unit EZpvd(gKW gkw) {
        Intrinsics.checkNotNullParameter(gkw, "");
        if (!gkw.AEQbTJ()) {
            C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.ICustomTabsService, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }
}

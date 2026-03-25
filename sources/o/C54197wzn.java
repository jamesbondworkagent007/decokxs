package o;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.unify_trade.biz.OrderExpResp;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.presenter.ChildOrderPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import o.InterfaceC55705xow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wzn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54197wzn extends AbstractC54505xKx<AbstractC48651uZh, ChildOrderPresenter> {
    public final InterfaceC56387yDm copydefault;
    public final int OLrzqt = C48033uCm.Activity.GqbzPL;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.wzk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C54197wzn.AYXKKw();
        }
    });

    /* JADX INFO: renamed from: o.wzn$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    public C54197wzn() {
        final Function0 function0 = null;
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.ChildOrderListFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.ChildOrderListFragment$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.ChildOrderListFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    private final TacticsDetailPresenter djBIcL() {
        return (TacticsDetailPresenter) this.copydefault.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw AYXKKw() {
        return new C43316rmw();
    }

    private final C43316rmw valueOf() {
        return (C43316rmw) this.EZpvd.getValue();
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        copydefault();
    }

    @Override // o.AbstractC56129xww
    public void bt_() {
        dxcTrN().EZpvd(djBIcL().AhwBna());
        if (dxcTrN().EZpvd().isHistory()) {
            return;
        }
        gEmmrt();
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        KWHzl();
    }

    public final void KWHzl() {
        StrategyDetailsResponse strategyDetailsResponseCopydefault;
        if (dxcTrN().EZpvd().isHistory()) {
            AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawn));
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) dxcTrN().EZpvd().getOrderType(), (java.lang.Object) "smart_iceberg")) {
            C55804xqp<StrategyDetailsResponse> value = djBIcL().getNewProxyInstance().getValue();
            if (Intrinsics.EZpvd((java.lang.Object) ((value == null || (strategyDetailsResponseCopydefault = value.copydefault()) == null) ? null : strategyDetailsResponseCopydefault.getState()), (java.lang.Object) "all_done")) {
                djBIcL().fIwbmz().postValue("");
                AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawn));
                return;
            }
        }
        dxcTrN().copydefault();
    }

    public final void AEQbTJ(java.lang.String str) {
        C49952uyJ.updateDataOrEmpty$default(valueOf(), yDY.AhwBna(), str, 0, null, null, false, 60, null);
    }

    private final void gEmmrt() {
        TradeLiveData<C55804xqp<StrategyDetailsResponse>> newProxyInstance = djBIcL().getNewProxyInstance();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        newProxyInstance.observe(viewLifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wzm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54197wzn.OLrzqt(this.OLrzqt, (C55804xqp) obj);
            }
        }));
        dxcTrN().AEQbTJ().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.wzo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54197wzn.EZpvd(this.EZpvd, (java.util.ArrayList) obj);
            }
        }));
        TradeLiveData<java.util.List<OrderExpResp>> tradeLiveDataKWHzl = dxcTrN().KWHzl();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataKWHzl.observe(viewLifecycleOwner2, new StateListAnimator(new Function1() { // from class: o.wzt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54197wzn.OLrzqt(this.KWHzl, (java.util.List) obj);
            }
        }));
        dxcTrN().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.wzq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54197wzn.AEQbTJ(this.EZpvd, (androidx.core.util.Pair) obj);
            }
        }));
        dxcTrN().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.wzp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54197wzn.KWHzl(this.KWHzl, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit OLrzqt(C54197wzn c54197wzn, C55804xqp c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        java.lang.String state = ((StrategyDetailsResponse) c55804xqp.copydefault()).getState();
        int iHashCode = state.hashCode();
        if (iHashCode == -1884319283 ? state.equals("stopped") : iHashCode == -1821824562 ? state.equals("no_close_position") : !(iHashCode != -123173735 || !state.equals("canceled"))) {
            c54197wzn.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawn));
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c54197wzn, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C54197wzn c54197wzn, java.util.ArrayList arrayList) {
        C43316rmw c43316rmwValueOf = c54197wzn.valueOf();
        Intrinsics.copydefault(arrayList);
        C49952uyJ.updateDataOrEmpty$default(c43316rmwValueOf, arrayList, C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 0, null, null, false, 60, null);
        c54197wzn.djBIcL().fIwbmz().postValue(C33129mqd.gEmmrt(java.lang.Integer.valueOf(arrayList.size())));
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c54197wzn, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C54197wzn c54197wzn, java.util.List list) {
        InterfaceC55705xow interfaceC55705xowKWHzl;
        Intrinsics.checkNotNullParameter(list, "");
        C55804xqp<java.util.List<StrategyOrderBillDetailsResponse>> value = c54197wzn.dxcTrN().OLrzqt().getValue();
        if (value != null && (interfaceC55705xowKWHzl = value.KWHzl()) != null) {
            InterfaceC55705xow.Application.refresh$default(interfaceC55705xowKWHzl, null, 1, null);
        }
        C55326xho.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.syncState), 500);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C54197wzn c54197wzn, androidx.core.util.Pair pair) {
        if (((java.lang.Boolean) pair.second).booleanValue()) {
            c54197wzn.showLoading();
        } else {
            c54197wzn.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C54197wzn c54197wzn, androidx.core.util.Pair pair) {
        C43316rmw c43316rmwValueOf = c54197wzn.valueOf();
        CommonEmptyData.ActionBar actionBar = CommonEmptyData.Companion;
        java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
        if (message == null) {
            message = "";
        }
        C33064mpR.OLrzqt(c43316rmwValueOf, (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(actionBar, message, 60, false, null, null, false, 60, null));
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c54197wzn, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        C43316rmw c43316rmwValueOf = valueOf();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c43316rmwValueOf.register(DetailsData.class, new C52503wNv(fragmentActivityRequireActivity, new Function1() { // from class: o.wzs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54197wzn.OLrzqt(this.AEQbTJ, (DetailsData) obj);
            }
        }, new Function1() { // from class: o.wzr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54197wzn.copydefault((java.lang.String) obj);
            }
        }, null, 8, null));
        valueOf().register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.wzv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54197wzn.KWHzl(this.EZpvd, (EmptyData) obj);
            }
        }));
        gGvvIC().copydefault.setAdapter(valueOf());
        gGvvIC().copydefault.setLayoutManager(new LinearLayoutManager(requireContext()));
    }

    public static final Unit OLrzqt(C54197wzn c54197wzn, DetailsData detailsData) {
        Intrinsics.checkNotNullParameter(detailsData, "");
        C32866mlf.onEvent$default("trade_strategy_suborder_cancel", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        c54197wzn.dxcTrN().EZpvd(detailsData.getOrderId(), detailsData.getInstId());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55328xhq.show$default(C33605mzc.AEQbTJ(), str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C54197wzn c54197wzn, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        c54197wzn.KWHzl();
        return Unit.INSTANCE;
    }
}

package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.p2p.api.OtcRouteConst;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.unify_trade.biz.OrderExpResp;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.presenter.RelatedPositionPresenter;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wDP extends AbstractC54505xKx<AbstractC48651uZh, RelatedPositionPresenter> {
    public final InterfaceC56387yDm EZpvd;
    public final int copydefault = C48033uCm.Activity.GqbzPL;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.wDQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return wDP.AYXKKw();
        }
    });

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Class EZpvd(int i, DetailsData detailsData) {
        Intrinsics.checkNotNullParameter(detailsData, "");
        return C52503wNv.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    public wDP() {
        final Function0 function0 = null;
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.RelatedPositionsListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.RelatedPositionsListFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.RelatedPositionsListFragment$special$$inlined$activityViewModels$default$3
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

    private final TacticsDetailPresenter KWHzl() {
        return (TacticsDetailPresenter) this.EZpvd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw AYXKKw() {
        return new C43316rmw();
    }

    private final C43316rmw gEmmrt() {
        return (C43316rmw) this.AEQbTJ.getValue();
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        copydefault();
    }

    @Override // o.AbstractC56129xww
    public void bt_() {
        dxcTrN().KWHzl(KWHzl().AhwBna());
        if (dxcTrN().EZpvd().isHistory()) {
            return;
        }
        djBIcL();
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        valueOf();
    }

    private final void valueOf() {
        StrategyDetailsResponse strategyDetailsResponseCopydefault;
        if (dxcTrN().EZpvd().isHistory()) {
            KWHzl(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawn));
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) dxcTrN().EZpvd().getOrderType(), (java.lang.Object) "smart_iceberg")) {
            C55804xqp<StrategyDetailsResponse> value = KWHzl().getNewProxyInstance().getValue();
            if (Intrinsics.EZpvd((java.lang.Object) ((value == null || (strategyDetailsResponseCopydefault = value.copydefault()) == null) ? null : strategyDetailsResponseCopydefault.getState()), (java.lang.Object) "all_done")) {
                KWHzl(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawn));
                return;
            }
        }
        dxcTrN().OLrzqt();
    }

    private final void KWHzl(java.lang.String str) {
        C49952uyJ.updateDataOrEmpty$default(gEmmrt(), yDY.AhwBna(), str, 0, null, null, false, 60, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [87=4] */
    public final void copydefault() {
        InterfaceC59537zis interfaceC59537zisRegister = gEmmrt().register(DetailsData.class);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        interfaceC59537zisRegister.copydefault(new C52503wNv(fragmentActivityRequireActivity, new Function1() { // from class: o.wDS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wDP.EZpvd(this.AEQbTJ, (DetailsData) obj);
            }
        }, new Function1() { // from class: o.wDY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wDP.OLrzqt((java.lang.String) obj);
            }
        }, new Function1() { // from class: o.wDZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wDP.AEQbTJ(this.OLrzqt, (DetailsData) obj);
            }
        }), new wNN(0, false, false, 0, null, null, new Function1() { // from class: o.wDV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wDP.OLrzqt(this.AEQbTJ, (Triple) obj);
            }
        }, 63, null)).OLrzqt(new InterfaceC59526zih() { // from class: o.wDW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59526zih
            public final java.lang.Class EZpvd(int i, java.lang.Object obj) {
                return wDP.EZpvd(i, (DetailsData) obj);
            }
        });
        gEmmrt().register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.wDX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wDP.KWHzl(this.EZpvd, (EmptyData) obj);
            }
        }));
        gGvvIC().copydefault.setAdapter(gEmmrt());
        gGvvIC().copydefault.setLayoutManager(new LinearLayoutManager(requireContext()));
    }

    public static final Unit EZpvd(wDP wdp, DetailsData detailsData) {
        Intrinsics.checkNotNullParameter(detailsData, "");
        wdp.dxcTrN().OLrzqt(detailsData.getAlgoId(), detailsData.getInstId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55328xhq.show$default(C55328xhq.OLrzqt, str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(wDP wdp, DetailsData detailsData) {
        InterfaceC33172mrT interfaceC33172mrT;
        Intrinsics.checkNotNullParameter(detailsData, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(OtcRouteConst.MAIN_ROUTE_NAV, "route_new_trade_other");
        bundle.putString("id", detailsData.getInstId());
        bundle.putString("type", detailsData.getInstType());
        bundle.putString("trade_mode", "trade_tactics");
        bundle.putString("strategy_mode", detailsData.getOrderType());
        FragmentActivity activity = wdp.getActivity();
        if (activity != null && (interfaceC33172mrT = (InterfaceC33172mrT) C43251rlk.OLrzqt(InterfaceC33172mrT.class)) != null) {
            interfaceC33172mrT.AEQbTJ(activity, "main/trade", bundle);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(wDP wdp, Triple triple) {
        Intrinsics.checkNotNullParameter(triple, "");
        wdp.KWHzl((Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData>) triple);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(wDP wdp, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        wdp.valueOf();
        return Unit.INSTANCE;
    }

    private final void KWHzl(Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData> triple) {
        FragmentActivity activity;
        TradePositionManager.PositionItem positionItem;
        java.lang.String doubtMsg;
        TacticsUiConst.BotListSubItemType first = triple.getFirst();
        java.lang.String str = "";
        if (first instanceof TacticsUiConst.BotListSubItemType.BotSubTip) {
            TacticsInsideItemData third = triple.getThird();
            if (third != null && (doubtMsg = third.getDoubtMsg()) != null) {
                str = doubtMsg;
            }
            EZpvd(str);
            return;
        }
        if (!(first instanceof TacticsUiConst.BotListSubItemType.BotSubPosition) || triple.getSecond() == null || !(triple.getSecond() instanceof DetailsData) || (activity = getActivity()) == null) {
            return;
        }
        java.lang.Object second = triple.getSecond();
        Intrinsics.copydefault(second, "");
        StrategyPositionResponse originPosition = ((DetailsData) second).getOriginPosition();
        if (originPosition == null || (positionItem = originPosition.getPositionItem()) == null) {
            return;
        }
        C52696wUz.OLrzqt(positionItem, activity);
    }

    private final void EZpvd(java.lang.String str) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd(str);
        java.lang.String string = getString(C48033uCm.Fragment.fraLem);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.wDT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                wDP.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void djBIcL() {
        TradeLiveData<C55804xqp<StrategyDetailsResponse>> newProxyInstance = KWHzl().getNewProxyInstance();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        newProxyInstance.observe(viewLifecycleOwner, new Activity(new Function1() { // from class: o.wEc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wDP.copydefault(this.KWHzl, (C55804xqp) obj);
            }
        }));
        C56111xwe<java.util.ArrayList<DetailsData>> c56111xweCopydefault = dxcTrN().copydefault();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56111xweCopydefault.observe(viewLifecycleOwner2, new Activity(new Function1() { // from class: o.wEb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wDP.copydefault(this.EZpvd, (java.util.ArrayList) obj);
            }
        }));
        C56111xwe<java.util.List<OrderExpResp>> c56111xweKWHzl = dxcTrN().KWHzl();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56111xweKWHzl.observe(viewLifecycleOwner3, new Activity(new Function1() { // from class: o.wEe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wDP.KWHzl((java.util.List) obj);
            }
        }));
        dxcTrN().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.wDU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wDP.OLrzqt(this.EZpvd, (androidx.core.util.Pair) obj);
            }
        }));
        dxcTrN().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.wDR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wDP.EZpvd(this.AEQbTJ, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit copydefault(wDP wdp, C55804xqp c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        wdp.dxcTrN().KWHzl((StrategyDetailsResponse) c55804xqp.copydefault());
        java.lang.String state = ((StrategyDetailsResponse) c55804xqp.copydefault()).getState();
        int iHashCode = state.hashCode();
        if (iHashCode == -1884319283 ? state.equals("stopped") : iHashCode == -1821824562 ? state.equals("no_close_position") : !(iHashCode != -123173735 || !state.equals("canceled"))) {
            wdp.KWHzl(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawn));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(wDP wdp, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        C49952uyJ.updateDataOrEmpty$default(wdp.gEmmrt(), arrayList, C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 0, null, null, false, 60, null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) wdp, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C33134mqi.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.syncState), 500);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r11v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(wDP wdp, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd((java.lang.Object) pair.first, (java.lang.Object) wdp.dxcTrN().AEQbTJ().bB_())) {
            C43316rmw c43316rmwGEmmrt = wdp.gEmmrt();
            CommonEmptyData.ActionBar actionBar = CommonEmptyData.Companion;
            java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
            if (message == null) {
                message = C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT);
            }
            C33064mpR.OLrzqt(c43316rmwGEmmrt, (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(actionBar, message, 60, false, null, null, false, 60, null));
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) wdp, false, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            java.lang.String message2 = ((java.lang.Exception) pair.second).getMessage();
            if (message2 != null) {
                C33134mqi.AEQbTJ(message2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(wDP wdp, androidx.core.util.Pair pair) {
        if (((java.lang.Boolean) pair.second).booleanValue()) {
            wdp.showLoading();
        } else {
            wdp.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void showLoading() {
        if (gEmmrt().getItemCount() == 0) {
            super.showLoading();
        }
    }
}

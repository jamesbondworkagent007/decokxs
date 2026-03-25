package o;

import android.view.View;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.social_trade_api.data.BusinessLine;
import com.okinc.tradingbot.impl.order.strategy.data.BotModel;
import com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet;
import com.okinc.tradingbot.impl.order.strategy.grid.domain.SmartEarnParamsCheckUseCase;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BotParamTickerData;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.FetchMultiInstsResult;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.LmtOrderNumber;
import com.okinc.unify_trade.biz.SignParamItem;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SignalListItem;
import com.okinc.unify_trade.biz.SlippageControl;
import com.okinc.unify_trade.biz.SmartPortfolioConfig;
import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import com.okinc.unify_trade.biz.StgySourceInfo;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.ThirdSignalDetail;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.GridStopTriggerType;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.CoinStackItemData;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.DcdPnlChartData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.data.InformationFragmentData;
import com.okinc.unify_trade.bot.data.ItemData;
import com.okinc.unify_trade.bot.data.ItemDataToggle;
import com.okinc.unify_trade.bot.data.LabelData;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.presenter.TacticsInformationPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.Dispatchers;
import o.C48033uCm;
import o.C55284xgz;
import o.C55688xof;
import o.InterfaceC49317umK;
import o.vGZ;
import o.vPC;
import o.vYH;
import o.vYX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wFH extends AbstractC54505xKx<uQW, TacticsInformationPresenter> {
    public final InterfaceC56387yDm OLrzqt;
    public final int EZpvd = C48033uCm.Activity.swzYdv;
    public final C43316rmw AEQbTJ = new C43316rmw();
    public final java.util.List<java.lang.String> KWHzl = yDY.gEmmrt("grid", "moon_grid");

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
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    public wFH() {
        final Function0 function0 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsNormalInformationFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsNormalInformationFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsNormalInformationFragment$special$$inlined$activityViewModels$default$3
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

    private final TacticsDetailPresenter gEmmrt() {
        return (TacticsDetailPresenter) this.OLrzqt.getValue();
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        djBIcL();
    }

    @Override // o.AbstractC56129xww
    public void bt_() {
        dxcTrN().OLrzqt(gEmmrt().AhwBna());
        TacticsInformationPresenter tacticsInformationPresenterDxcTrN = dxcTrN();
        StrategyConfigInfo value = gEmmrt().valueOf().getValue();
        if (value == null) {
            value = new StrategyConfigInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (LmtOrderNumber) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnConfig) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 131071, (DefaultConstructorMarker) null);
        }
        tacticsInformationPresenterDxcTrN.AEQbTJ(value);
        KWHzl();
        valueOf();
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        dxcTrN().values();
    }

    private final void djBIcL() {
        C55312xha c55312xhaValueOf = gGvvIC().copydefault.valueOf();
        if (c55312xhaValueOf != null) {
            c55312xhaValueOf.setOnClickListener(new StateListAnimator(c55312xhaValueOf, 1000L, this));
        }
        C55312xha c55312xhaValueOf2 = gGvvIC().EZpvd.valueOf();
        if (c55312xhaValueOf2 != null) {
            c55312xhaValueOf2.setOnClickListener(new TaskDescription(c55312xhaValueOf2, 1000L, this));
        }
        C55312xha c55312xhaValueOf3 = gGvvIC().AhwBna.valueOf();
        if (c55312xhaValueOf3 != null) {
            c55312xhaValueOf3.setOnClickListener(new Application(c55312xhaValueOf3, 1000L, this));
        }
    }

    public final void KWHzl() {
        this.AEQbTJ.register(ItemData.class, new wNH(new Function1() { // from class: o.wFK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wFH.AhwBna(this.OLrzqt, (ItemData) obj);
            }
        }, new Function1() { // from class: o.wFM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wFH.copydefault(this.copydefault, (ItemData) obj);
            }
        }, new Function1() { // from class: o.wFY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wFH.KWHzl(this.KWHzl, (java.lang.String) obj);
            }
        }, null, new Function1() { // from class: o.wGf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wFH.EZpvd(this.OLrzqt, (ItemData) obj);
            }
        }, 8, null));
        this.AEQbTJ.register(CoinStackItemData.class, new wNI(new Function1() { // from class: o.wGe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wFH.KWHzl(this.AEQbTJ, (CoinStackItemData) obj);
            }
        }));
        this.AEQbTJ.register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.wGd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wFH.AEQbTJ(this.copydefault, (EmptyData) obj);
            }
        }));
        this.AEQbTJ.register(BotParamTickerData.class, new C51269vjo(new Function0() { // from class: o.wGc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wFH.copydefault(this.OLrzqt);
            }
        }));
        this.AEQbTJ.register(LabelData.class, new C51278vjx());
        this.AEQbTJ.register(DcdPnlChartData.class, new C52542wPg());
        gGvvIC().AYXKKw.setAdapter(this.AEQbTJ);
        gGvvIC().AYXKKw.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    public static final Unit AhwBna(wFH wfh, ItemData itemData) {
        Intrinsics.checkNotNullParameter(itemData, "");
        if (itemData.djBIcL() instanceof TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog) {
            TacticsUiConst.BotListSubItemType botListSubItemTypeDjBIcL = itemData.djBIcL();
            Intrinsics.copydefault(botListSubItemTypeDjBIcL, "");
            TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog doubtDialog = (TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog) botListSubItemTypeDjBIcL;
            wfh.KWHzl(doubtDialog.OLrzqt(), doubtDialog.AEQbTJ());
        } else {
            showDoubtTips$default(wfh, itemData.AuCTel(), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(wFH wfh, ItemData itemData) {
        java.lang.String strAYXKKw;
        java.lang.String orderType = wfh.dxcTrN().AEQbTJ().getOrderType();
        int iHashCode = orderType.hashCode();
        if (iHashCode != -1086683216) {
            if (iHashCode != -512749997) {
                strAYXKKw = itemData != null ? itemData.AYXKKw() : null;
                if (!Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) "3")) {
                    InterfaceC49317umK interfaceC49317umK = (InterfaceC49317umK) C43251rlk.OLrzqt(InterfaceC49317umK.class);
                    if (interfaceC49317umK != null) {
                        android.content.Context contextRequireContext = wfh.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                        InterfaceC49317umK.Application.navigateToTraderBusinessLinePage$default(interfaceC49317umK, contextRequireContext, itemData.AhwBna(), BusinessLine.Bots, null, null, 24, null);
                    }
                    wfh.AEQbTJ();
                } else if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) "grid_out_of_range_warning")) {
                    wfh.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.setLocationManually), C33070mpX.AYXKKw(C55688xof.Application.GqbzPL));
                } else if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) "grid_profit_show_negative_profit")) {
                    wQK wqk = wQK.OLrzqt;
                    android.content.Context context = wfh.getContext();
                    androidx.fragment.app.FragmentManager childFragmentManager = wfh.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    wqk.AEQbTJ(context, childFragmentManager, wfh.gEmmrt().zLjUOn());
                } else if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) "price_range") || Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) "grid_num")) {
                    java.lang.String orderType2 = wfh.gEmmrt().zLjUOn().getOrderType();
                    if (Intrinsics.EZpvd((java.lang.Object) orderType2, (java.lang.Object) "grid")) {
                        vGL vglOLrzqt = vGL.Companion.OLrzqt(wfh.gEmmrt().zLjUOn());
                        androidx.fragment.app.FragmentManager childFragmentManager2 = wfh.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                        vglOLrzqt.show(childFragmentManager2);
                    } else if (Intrinsics.EZpvd((java.lang.Object) orderType2, (java.lang.Object) "contract_grid")) {
                        C50225vGn c50225vGnCopydefault = C50225vGn.Companion.copydefault(wfh.gEmmrt().zLjUOn());
                        androidx.fragment.app.FragmentManager childFragmentManager3 = wfh.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
                        c50225vGnCopydefault.show(childFragmentManager3);
                    }
                    C55867xrz.KWHzl.KWHzl(orderType, itemData.AYXKKw());
                } else if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) "tp") || Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) "sl")) {
                    TacticsData tacticsDataZLjUOn = wfh.gEmmrt().zLjUOn();
                    if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "grid")) {
                        vPC.StateListAnimator.newInstance$default(vPC.Companion, tacticsDataZLjUOn, true, "from_edit", tacticsDataZLjUOn.getOrderType(), null, wfh.dxcTrN().KWHzl(), 16, null).show(wfh.getChildFragmentManager(), vPC.class.getSimpleName());
                    } else if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "contract_grid")) {
                        vGZ.StateListAnimator.newInstance$default(vGZ.Companion, tacticsDataZLjUOn, true, "from_edit", tacticsDataZLjUOn.getOrderType(), null, 16, null).show(wfh.getChildFragmentManager(), vGZ.class.getSimpleName());
                    }
                    C55867xrz.KWHzl.KWHzl(orderType, itemData.AYXKKw());
                } else if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) "forbidden_block_tp") || Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) "forbidden_block_sl")) {
                    android.content.Context context2 = wfh.getContext();
                    if (context2 != null) {
                        C52659wTp.copydefault.KWHzl(context2);
                    }
                } else if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) "start_condition")) {
                    android.content.Context context3 = wfh.getContext();
                    if (context3 != null) {
                        ActivityC53931wum.Companion.copydefault(context3, wfh.gEmmrt().zLjUOn());
                        C55867xrz.KWHzl.KWHzl(orderType, itemData.AYXKKw());
                    }
                } else if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) "stop_condition")) {
                    android.content.Context context4 = wfh.getContext();
                    if (context4 != null) {
                        ActivityC53940wuv.Companion.EZpvd(context4, wfh.gEmmrt().zLjUOn());
                        C55867xrz.KWHzl.KWHzl(orderType, itemData.AYXKKw());
                    }
                } else if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) "edit_smart_earn")) {
                    wfh.copydefault();
                } else if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) "edit_smart_earn_disabled")) {
                    android.content.Context contextRequireContext2 = wfh.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                    final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext2);
                    viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C48033uCm.Fragment.DAgZj));
                    viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.onCreate, new View.OnClickListener() { // from class: o.wFO
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            wFH.AhwBna(viewOnClickListenerC54939xaY, view);
                        }
                    });
                    viewOnClickListenerC54939xaY.show();
                } else if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) GridStartTriggerType.TRADINGVIEW.getMode()) || Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) GridStopTriggerType.TRADINGVIEW.getMode())) {
                    wfh.AYXKKw();
                }
            } else {
                if (itemData != null) {
                }
                if (!Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) "3")) {
                }
            }
        } else if (orderType.equals("signal_bot")) {
            if (Intrinsics.EZpvd((java.lang.Object) (itemData != null ? itemData.AYXKKw() : null), (java.lang.Object) "signal_intro")) {
                wfh.dxcTrN().djBIcL();
            }
        }
        return Unit.INSTANCE;
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ wFH EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, wFH wfh) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = wfh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.fGT), C33070mpX.AYXKKw(C48033uCm.Fragment.ONJgbh));
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ wFH EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, wFH wfh) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = wfh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.isTitleTruncated), C33070mpX.AYXKKw(C48033uCm.Fragment.HJWChPRAkuRW));
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ wFH KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, wFH wfh) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = wfh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.getSelectedTab), C33070mpX.AYXKKw(C48033uCm.Fragment.RWIpjU));
            }
        }
    }

    public static final void AhwBna(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit KWHzl(wFH wfh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) TtmlNode.START) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "stop")) {
            wfh.OLrzqt(str);
        } else {
            showDoubtTips$default(wfh, str, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(wFH wfh, ItemData itemData) {
        ItemDataToggle itemDataToggleAkhnZx;
        ItemDataToggle itemDataToggleAkhnZx2;
        pUU.EZpvd(wfh.getTAG(), "toggle click " + ((itemData == null || (itemDataToggleAkhnZx2 = itemData.AkhnZx()) == null) ? null : java.lang.Boolean.valueOf(itemDataToggleAkhnZx2.KWHzl())));
        if (itemData != null && (itemDataToggleAkhnZx = itemData.AkhnZx()) != null) {
            wfh.gEmmrt().AEQbTJ(itemDataToggleAkhnZx.KWHzl());
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(wFH wfh, CoinStackItemData coinStackItemData) {
        wfh.dxcTrN().AhwBna();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(wFH wfh, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        TacticsDetailPresenter.queryBotDetails$default(wfh.gEmmrt(), false, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(wFH wfh) {
        C55867xrz.KWHzl.KWHzl(wfh.dxcTrN().AEQbTJ().getOrderType(), FirebaseAnalytics.Param.PRICE);
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        vSR.Companion.AEQbTJ(dxcTrN().AEQbTJ().getAlgoId(), false, false).show(getChildFragmentManager(), "CopyTradingviewInfoDialog");
    }

    private final void valueOf() {
        TradeLiveData<C55804xqp<StrategyDetailsResponse>> newProxyInstance = gEmmrt().getNewProxyInstance();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        newProxyInstance.observe(viewLifecycleOwner, new Activity(new Function1() { // from class: o.wFV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wFH.OLrzqt(this.copydefault, (C55804xqp) obj);
            }
        }));
        TradeLiveData<InformationFragmentData> tradeLiveDataOLrzqt = dxcTrN().OLrzqt();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataOLrzqt.observe(viewLifecycleOwner2, new Activity(new Function1() { // from class: o.wFR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wFH.KWHzl(this.AEQbTJ, (InformationFragmentData) obj);
            }
        }));
        C56111xwe<java.util.List<StgySourceInfo>> c56111xweAYXKKw = dxcTrN().AYXKKw();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56111xweAYXKKw.observe(viewLifecycleOwner3, new Activity(new Function1() { // from class: o.wFU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wFH.copydefault(this.OLrzqt, (java.util.List) obj);
            }
        }));
        dxcTrN().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.wFS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wFH.EZpvd(this.KWHzl, (androidx.core.util.Pair) obj);
            }
        }));
        C56111xwe<java.util.List<FetchMultiInstsResult>> c56111xweCopydefault = dxcTrN().copydefault();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c56111xweCopydefault.observe(viewLifecycleOwner4, new Activity(new Function1() { // from class: o.wFT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wFH.KWHzl(this.EZpvd, (java.util.List) obj);
            }
        }));
        C56111xwe<SignalListItem> c56111xweGEmmrt = dxcTrN().gEmmrt();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        c56111xweGEmmrt.observe(viewLifecycleOwner5, new Activity(new Function1() { // from class: o.wFW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wFH.KWHzl(this.OLrzqt, (SignalListItem) obj);
            }
        }));
        gEmmrt().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.wFZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wFH.OLrzqt(this.OLrzqt, (androidx.core.util.Pair) obj);
            }
        }));
        dxcTrN().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.wGa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wFH.AhwBna(this.AEQbTJ, (androidx.core.util.Pair) obj);
            }
        }));
        getChildFragmentManager().setFragmentResultListener("tp_sl_settings", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.wFX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                wFH.AEQbTJ(this.OLrzqt, str, bundle);
            }
        });
    }

    public static final Unit OLrzqt(wFH wfh, C55804xqp c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        wfh.dxcTrN().OLrzqt((StrategyDetailsResponse) c55804xqp.copydefault());
        wfh.dxcTrN().valueOf();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(wFH wfh, InformationFragmentData informationFragmentData) {
        Intrinsics.checkNotNullParameter(informationFragmentData, "");
        wfh.OLrzqt(informationFragmentData.getCurrentF(), informationFragmentData.getCurrentS(), informationFragmentData.getInitF(), informationFragmentData.getInitS(), informationFragmentData.getSimpleEarnHoldingBaseSz(), informationFragmentData.getSimpleEarnHoldingQuoteSz(), wfh.KWHzl.contains(wfh.dxcTrN().AEQbTJ().getOrderType()));
        C49952uyJ.updateDataOrEmpty$default(wfh.AEQbTJ, informationFragmentData.getDataList(), C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 60, null, null, false, 56, null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) wfh, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(wFH wfh, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        wfh.dxcTrN().valueOf();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(wFH wfh, androidx.core.util.Pair pair) {
        if (((java.lang.Boolean) pair.second).booleanValue()) {
            wfh.showLoading();
        } else {
            wfh.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(wFH wfh, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        vYH.Activity activity = vYH.Companion;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String instId = ((FetchMultiInstsResult) it.next()).getInstId();
            if (instId != null) {
                arrayList2.add(instId);
            }
        }
        arrayList.addAll(arrayList2);
        Unit unit = Unit.INSTANCE;
        activity.AEQbTJ(new SignalBotReq((java.lang.String) null, (java.lang.String) null, arrayList, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, false, (ThirdSignalDetail) null, false, (java.util.ArrayList) null, (java.lang.String) null, (AutoVipProfitInfo) null, 32763, (DefaultConstructorMarker) null)).show(wfh.getChildFragmentManager(), "");
        return unit;
    }

    public static final Unit KWHzl(wFH wfh, SignalListItem signalListItem) {
        Intrinsics.checkNotNullParameter(signalListItem, "");
        vYX.StateListAnimator stateListAnimator = vYX.Companion;
        SignalListItem signalListItem2 = new SignalListItem(wfh.dxcTrN().AEQbTJ().getSignalSourceType(), wfh.dxcTrN().AEQbTJ().getSignalChanId(), wfh.dxcTrN().AEQbTJ().getSignalChanName(), signalListItem.getSignalDescription(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 32752, (DefaultConstructorMarker) null);
        androidx.fragment.app.FragmentManager childFragmentManager = wfh.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        stateListAnimator.OLrzqt(signalListItem2, childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r11v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(wFH wfh, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) wfh.gEmmrt().uzCIH().bB_())) {
            wfh.AEQbTJ.setItems(CommonEmptyData.ActionBar.buildErrorData$default(CommonEmptyData.Companion, C33129mqd.gEmmrt(((java.lang.Exception) pair.second).getMessage()), 0, false, null, null, false, 62, null));
            wfh.AEQbTJ.notifyDataSetChanged();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) wfh, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AhwBna(wFH wfh, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) wfh.dxcTrN().EZpvd().bB_())) {
            java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
            if (message != null) {
                C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
            } else {
                C55326xho.toastWithFailedIcon$default(C43422row.OLrzqt(), 0, 1, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(wFH wfh, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        TacticsDetailPresenter.queryBotDetails$default(wfh.gEmmrt(), false, 1, null);
        C55284xgz.Activity activity = C55284xgz.Companion;
        android.content.Context contextRequireContext = wfh.requireContext();
        android.view.View root = wfh.gGvvIC().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        C55284xgz c55284xgzAEQbTJ = activity.AEQbTJ(contextRequireContext, root, C33070mpX.AYXKKw(C55688xof.Application.onMultiWindowModeChanged));
        if (c55284xgzAEQbTJ != null) {
            c55284xgzAEQbTJ.isConnected(3);
            c55284xgzAEQbTJ.hDKMBd();
        }
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z) {
        java.lang.String str7;
        java.lang.String str8;
        if (!z) {
            gGvvIC().KWHzl.setVisibility(8);
            return;
        }
        C55258xgZ c55258xgZ = gGvvIC().EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
        c55258xgZ.setVisibility(dxcTrN().AEQbTJ().isHistory() ^ true ? 0 : 8);
        android.widget.TextView textView = gGvvIC().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(dxcTrN().AEQbTJ().isHistory() ^ true ? 0 : 8);
        android.widget.TextView textView2 = gGvvIC().OLrzqt;
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            str7 = str + str2;
        } else {
            str7 = str + " + " + str2;
        }
        textView2.setText(str7);
        android.widget.TextView textView3 = gGvvIC().AEQbTJ;
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3) || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str4)) {
            str8 = str3 + str4;
        } else {
            str8 = str3 + " + " + str4;
        }
        textView3.setText(str8);
        gGvvIC().KWHzl.setVisibility(0);
        if (str5 == null && str6 == null) {
            gGvvIC().AhwBna.setVisibility(8);
            gGvvIC().gEmmrt.setVisibility(8);
            return;
        }
        if (str5 != null && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str5) && str6 != null && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str6)) {
            gGvvIC().AhwBna.setVisibility(0);
            gGvvIC().gEmmrt.setVisibility(0);
            gGvvIC().gEmmrt.setText("--");
            return;
        }
        if (str5 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str5) || str6 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str6)) {
            gGvvIC().AhwBna.setVisibility(0);
            gGvvIC().gEmmrt.setVisibility(0);
            gGvvIC().gEmmrt.setText(str5 + str6);
            return;
        }
        gGvvIC().AhwBna.setVisibility(0);
        gGvvIC().gEmmrt.setVisibility(0);
        gGvvIC().gEmmrt.setText(str5 + " + " + str6);
    }

    public static /* synthetic */ void showDoubtTips$default(wFH wfh, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        wfh.EZpvd(str, str2);
    }

    private final void EZpvd(java.lang.String str, java.lang.String str2) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "contract_grid_open_position_tag")) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
            viewOnClickListenerC54939xaY.setTitle(getString(C55688xof.Application.ActivityResultContractsOpenDocumentTree));
            viewOnClickListenerC54939xaY.EZpvd(getString(C48033uCm.Fragment.gwwfep));
            java.lang.String string = getString(C55688xof.Application.QWSkGZ);
            Intrinsics.checkNotNullExpressionValue(string, "");
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.wGi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    wFH.AYXKKw(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
            viewOnClickListenerC54939xaY.show();
            return;
        }
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = new ViewOnClickListenerC54939xaY(contextRequireContext2);
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            str2 = null;
        }
        if (str2 != null) {
            viewOnClickListenerC54939xaY2.setTitle(str2);
        }
        viewOnClickListenerC54939xaY2.EZpvd(str);
        java.lang.String string2 = getString(C55688xof.Application.QWSkGZ);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        viewOnClickListenerC54939xaY2.AEQbTJ((java.lang.CharSequence) string2, new View.OnClickListener() { // from class: o.wGk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                wFH.AkhnZx(viewOnClickListenerC54939xaY2, view);
            }
        });
        viewOnClickListenerC54939xaY2.show();
    }

    public static final void AYXKKw(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AkhnZx(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2) {
        android.content.Context context = getContext();
        if (context != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle(str);
            viewOnClickListenerC54939xaY.EZpvd(str2);
            viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.onCreate, new View.OnClickListener() { // from class: o.wFQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    wFH.djBIcL(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void djBIcL(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static /* synthetic */ void showTitleMsgDialog$default(wFH wfh, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        wfh.AEQbTJ(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            viewOnClickListenerC54939xaY.setTitle(str);
        }
        viewOnClickListenerC54939xaY.EZpvd(str2);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), new View.OnClickListener() { // from class: o.wGb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                wFH.fetchVPNInfo(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void fetchVPNInfo(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void OLrzqt(java.lang.String str) {
        android.content.Context context = getContext();
        if (context != null) {
            C52602wRm.OLrzqt.AEQbTJ(context, str, dxcTrN().AEQbTJ().getOrderType(), AEQbTJ(str));
        }
    }

    public final java.lang.Object AEQbTJ(java.lang.String str) {
        java.util.List<DcaTriggerParam> triggerParams;
        java.lang.String orderType = dxcTrN().AEQbTJ().getOrderType();
        int iHashCode = orderType.hashCode();
        java.lang.Object obj = null;
        if (iHashCode == -1148661171) {
            if (!orderType.equals("smart_iceberg") || (triggerParams = dxcTrN().AEQbTJ().getTriggerParams()) == null) {
                return null;
            }
            java.util.Iterator<T> it = triggerParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((DcaTriggerParam) next).getTriggerAction(), (java.lang.Object) str)) {
                    obj = next;
                    break;
                }
            }
            return (DcaTriggerParam) obj;
        }
        if (iHashCode != -512749997) {
            if (iHashCode != 3181382 || !orderType.equals("grid")) {
                return null;
            }
        } else if (!orderType.equals("contract_grid")) {
            return null;
        }
        java.util.ArrayList<SignParamItem> signParams = dxcTrN().AEQbTJ().getSignParams();
        if (signParams == null) {
            return null;
        }
        java.util.Iterator<T> it2 = signParams.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next2 = it2.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((SignParamItem) next2).getTriggerAction(), (java.lang.Object) str)) {
                obj = next2;
                break;
            }
        }
        return (SignParamItem) obj;
    }

    public final void AEQbTJ() {
        final java.lang.String str;
        final StrategyDetailsResponse strategyDetailsResponseAEQbTJ = dxcTrN().AEQbTJ();
        if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponseAEQbTJ.getCopyType(), (java.lang.Object) "3")) {
            str = "lead";
        } else if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponseAEQbTJ.getCopyType(), (java.lang.Object) "2")) {
            str = "follow";
        } else {
            str = C33129mqd.OLrzqt((java.lang.CharSequence) strategyDetailsResponseAEQbTJ.getSourceAlgoId()) ? "copy" : "manual";
        }
        C32866mlf.onEvent$default("BotDetails_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.wFP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wFH.KWHzl(strategyDetailsResponseAEQbTJ, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(StrategyDetailsResponse strategyDetailsResponse, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "trader_avatar", false, 4, null);
        EventParamsList.put$default(eventParamsList, "bot_type", strategyDetailsResponse.getOrderType(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "createbot_type", str, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void showLoading() {
        if (this.AEQbTJ.getItemCount() == 0) {
            super.showLoading();
        }
    }

    public final void copydefault() {
        android.content.Context context;
        TacticsData tacticsDataZLjUOn = gEmmrt().zLjUOn();
        SmartEarnConfig earnConfig = dxcTrN().KWHzl().getEarnConfig();
        if (earnConfig == null) {
            StrategyConfigInfo value = gEmmrt().valueOf().getValue();
            earnConfig = value != null ? value.getEarnConfig() : null;
            if (earnConfig == null) {
                return;
            }
        }
        SmartEarnParamsCheckUseCase.Result resultPreCheck$default = SmartEarnParamsCheckUseCase.preCheck$default(new SmartEarnParamsCheckUseCase(Dispatchers.getDefault()), new SmartEarnParamsCheckUseCase.ActionBar(earnConfig, tacticsDataZLjUOn.getGridNum(), C56547yJk.EZpvd(tacticsDataZLjUOn.getMinPx(), tacticsDataZLjUOn.getMaxPx()), tacticsDataZLjUOn.getTrailingDownConfig(), tacticsDataZLjUOn.getTrailingUpConfig(), null, null, 96, null), null, null, 6, null);
        if (!(resultPreCheck$default instanceof SmartEarnParamsCheckUseCase.Result.Success)) {
            java.lang.String strKWHzl = resultPreCheck$default.KWHzl();
            if (strKWHzl == null || (context = getContext()) == null) {
                return;
            }
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle(C48033uCm.Fragment.OAUGar);
            viewOnClickListenerC54939xaY.EZpvd(strKWHzl);
            viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.trackPipAnimationHintView, new View.OnClickListener() { // from class: o.wFN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    wFH.gEmmrt(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
            return;
        }
        SmartEarnAllocationBottomSheet.Companion.KWHzl(tacticsDataZLjUOn.getLastPrice(), tacticsDataZLjUOn.getMinPx(), tacticsDataZLjUOn.getMaxPx(), earnConfig, tacticsDataZLjUOn.getSimpleEarn(), new BotModel(tacticsDataZLjUOn.getAlgoId(), tacticsDataZLjUOn.getInstId(), tacticsDataZLjUOn.getInstType())).show(getChildFragmentManager(), "SmartEarnAllocationBottomSheet");
    }

    public static final void gEmmrt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }
}

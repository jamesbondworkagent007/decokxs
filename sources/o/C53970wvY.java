package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ArbitragePositioningFragment$initListener$1;
import com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ArbitragePositioningViewModel;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.SmartArbHisOrderItem;
import com.okinc.unify_trade.biz.SmartArbListItem;
import com.okinc.unify_trade.biz.SmartArbPlanLeg;
import com.okinc.unify_trade.biz.SmartArbitrageVo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.data.TacticsListLabelData;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC54581xNr;
import o.wUX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wvY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C53970wvY extends AbstractC54034wwj {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public uMG OLrzqt;
    public final int copydefault = C48033uCm.Activity.uzCIH;
    public final C43316rmw gEmmrt;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: renamed from: o.wvY$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    public C53970wvY() {
        final Function0 function0 = null;
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ArbitragePositioningFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ArbitragePositioningFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ArbitragePositioningFragment$special$$inlined$activityViewModels$default$3
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ArbitragePositioningFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ArbitragePositioningFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ArbitragePositioningViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ArbitragePositioningFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ArbitragePositioningFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ArbitragePositioningFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.wvX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53970wvY.EZpvd(this.KWHzl);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wwb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53970wvY.EZpvd();
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.wwd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53970wvY.copydefault(this.EZpvd);
            }
        });
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(wNR.class, new wNU());
        this.gEmmrt = c43316rmw;
    }

    public final TacticsDetailPresenter OLrzqt() {
        return (TacticsDetailPresenter) this.EZpvd.getValue();
    }

    public final ArbitragePositioningViewModel valueOf() {
        return (ArbitragePositioningViewModel) this.valueOf.getValue();
    }

    public static final StrategyDetailsResponse EZpvd(C53970wvY c53970wvY) {
        return c53970wvY.OLrzqt().AhwBna();
    }

    public final StrategyDetailsResponse AEQbTJ() {
        return (StrategyDetailsResponse) this.AEQbTJ.getValue();
    }

    public static final InterfaceC54581xNr EZpvd() {
        return C54589xNz.EZpvd.OLrzqt();
    }

    private final InterfaceC54581xNr djBIcL() {
        return (InterfaceC54581xNr) this.KWHzl.getValue();
    }

    public static final TradeLiveData copydefault(C53970wvY c53970wvY) {
        return c53970wvY.OLrzqt().fARcdN();
    }

    private final TradeLiveData<java.util.List<SmartArbHisOrderItem>> fetchVPNInfo() {
        return (TradeLiveData) this.AhwBna.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        uMG umgOLrzqt = uMG.OLrzqt(view);
        Intrinsics.copydefault(umgOLrzqt);
        copydefault(umgOLrzqt);
        this.OLrzqt = umgOLrzqt;
        isConnected();
    }

    private final void isConnected() {
        if (!AEQbTJ().isHistory()) {
            C52692wUv.copydefault(valueOf().KWHzl(), this, Lifecycle.State.CREATED, new ArbitragePositioningFragment$initListener$1(this, null));
            valueOf().EZpvd();
        }
        OLrzqt().fARcdN().observe(this, new Activity(new Function1() { // from class: o.wwc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53970wvY.copydefault(this.OLrzqt, (java.util.List) obj);
            }
        }));
        OLrzqt().KWHzl(AEQbTJ().getAlgoId());
    }

    public static final Unit copydefault(C53970wvY c53970wvY, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C33064mpR.OLrzqt(c53970wvY.gEmmrt, (java.util.List<? extends java.lang.Object>) c53970wvY.copydefault(c53970wvY.AEQbTJ().isHistory()));
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c53970wvY, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(uMG umg) {
        BizInstrument suggestedInstrument$default;
        java.lang.String str;
        android.widget.TextView textView;
        java.lang.Object obj;
        java.lang.String str2;
        BizInstrument suggestedInstrument$default2;
        java.lang.String displayQuoteSymbol;
        java.lang.String strValueOf;
        java.lang.String autoStakingPos;
        android.widget.TextView textView2;
        java.lang.String str3;
        android.widget.TextView textView3;
        java.lang.String estimated;
        SmartArbitrageVo smartArbitrage;
        java.lang.String instType;
        SmartArbPlanLeg spotLeg$default = getSpotLeg$default(this, "open", false, 2, null);
        SmartArbPlanLeg swapLeg$default = getSwapLeg$default(this, "open", false, 2, null);
        java.lang.String instType2 = spotLeg$default != null ? spotLeg$default.getInstType() : null;
        if (instType2 == null) {
            instType2 = "";
        }
        java.lang.String instId = spotLeg$default != null ? spotLeg$default.getInstId() : null;
        java.lang.String str4 = instId == null ? "" : instId;
        InterfaceC54581xNr interfaceC54581xNrDjBIcL = djBIcL();
        if (interfaceC54581xNrDjBIcL != null) {
            java.lang.String instType3 = swapLeg$default != null ? swapLeg$default.getInstType() : null;
            if (instType3 == null) {
                instType3 = "";
            }
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrDjBIcL, instType3, swapLeg$default != null ? swapLeg$default.getInstId() : null, null, null, 12, null);
        } else {
            suggestedInstrument$default = null;
        }
        java.lang.String quoteSymbol = suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null;
        java.lang.String str5 = quoteSymbol == null ? "" : quoteSymbol;
        umg.values.setText(initView$formatAmountWithSwapUnit$default(str5, AEQbTJ().getTotalAmt(), null, 4, null));
        if (AEQbTJ().getLeverPrincipal() != null) {
            BotVo bot = AEQbTJ().getBot();
            SmartArbitrageVo smartArbitrage2 = bot != null ? bot.getSmartArbitrage() : null;
            LinearLayoutCompat linearLayoutCompat = umg.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(0);
            umg.EZpvd.setText(initView$formatAmountWithSwapUnit$default(str5, smartArbitrage2 != null ? smartArbitrage2.getEnlargedAmt() : null, null, 4, null));
            LinearLayoutCompat linearLayoutCompat2 = umg.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
            linearLayoutCompat2.setVisibility(0);
            umg.OLrzqt.setText(initView$formatAmountWithSwapUnit$default(str5, smartArbitrage2 != null ? smartArbitrage2.getInterestDebt() : null, null, 4, null));
        }
        java.lang.String amt = spotLeg$default != null ? spotLeg$default.getAmt() : null;
        umg.fIwbmz.setText(initView$formatAmountWithSwapUnit$default(str5, amt, null, 4, null));
        java.lang.String amt2 = swapLeg$default != null ? swapLeg$default.getAmt() : null;
        umg.AhwBna.setText(initView$formatAmountWithSwapUnit$default(str5, amt2, null, 4, null));
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ);
        int iAEQbTJ = C33512mxp.AEQbTJ.AEQbTJ(iCopydefault, 0.5f);
        android.widget.TextView textView4 = umg.fARcdN;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        C52706wVi.AEQbTJ(textView4, iCopydefault);
        android.widget.TextView textView5 = umg.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        C52706wVi.AEQbTJ(textView5, iAEQbTJ);
        umg.copydefault.OLrzqt(yDY.gEmmrt(new wUX.ActionBar(C33129mqd.EZpvd(amt), iCopydefault), new wUX.ActionBar(C33129mqd.EZpvd(amt2), iAEQbTJ)));
        if (!AEQbTJ().isStake() || AEQbTJ().isHistory()) {
            str = str5;
        } else {
            android.view.View view = umg.getFieldNames;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(0);
            LinearLayoutCompat linearLayoutCompat3 = umg.hDKMBd;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "");
            linearLayoutCompat3.setVisibility(AEQbTJ().isArbitrageWithStaking() ? 0 : 8);
            LinearLayoutCompat linearLayoutCompat4 = umg.uzCIH;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat4, "");
            linearLayoutCompat4.setVisibility(0);
            ProfitDetailResponse stakingProfit = AEQbTJ().getStakingProfit();
            java.lang.String strCopydefault = C53418wlC.copydefault(stakingProfit != null ? stakingProfit.getCcy() : null);
            umg.getNewProxyInstance.setText(C33069mpW.copydefault(C48033uCm.Fragment.ORWKdN, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, strCopydefault))));
            java.lang.String strAEQbTJ = C56107xwa.AEQbTJ(spotLeg$default);
            android.widget.TextView textView6 = umg.iwGUEr;
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)) {
                textView = textView6;
                obj = OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK;
                str = str5;
                str2 = "--";
            } else {
                textView = textView6;
                obj = OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK;
                str = str5;
                str2 = C56033xvF.getBotAmount$default(instType2, str4, strAEQbTJ, null, false, null, 56, null) + " " + strCopydefault;
            }
            textView.setText(str2);
            InterfaceC54581xNr interfaceC54581xNrDjBIcL2 = djBIcL();
            if (interfaceC54581xNrDjBIcL2 != null) {
                suggestedInstrument$default2 = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrDjBIcL2, (spotLeg$default == null || (instType = spotLeg$default.getInstType()) == null) ? "" : instType, spotLeg$default != null ? spotLeg$default.getInstId() : null, null, null, 12, null);
            } else {
                suggestedInstrument$default2 = null;
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (spotLeg$default != null ? spotLeg$default.getPosCcy() : null))) {
                displayQuoteSymbol = spotLeg$default != null ? spotLeg$default.getPosCcy() : null;
                strValueOf = (displayQuoteSymbol == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) displayQuoteSymbol)) ? "" : java.lang.String.valueOf(displayQuoteSymbol);
                umg.zsXlph.setText(C33069mpW.copydefault(C48033uCm.Fragment.ORWKdN, C56423yEv.EZpvd(C56390yDp.OLrzqt(obj, strValueOf))));
                BotVo bot2 = AEQbTJ().getBot();
                autoStakingPos = (bot2 != null || (smartArbitrage = bot2.getSmartArbitrage()) == null) ? null : smartArbitrage.getAutoStakingPos();
                textView2 = umg.AubY;
                if (autoStakingPos == null && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) autoStakingPos)) {
                    textView3 = textView2;
                    str3 = "--";
                } else {
                    str3 = C56033xvF.getBotAmount$default(instType2, str4, autoStakingPos != null ? "" : autoStakingPos, null, false, null, 56, null) + " " + strValueOf;
                    textView3 = textView2;
                }
                textView3.setText(str3);
                C55258xgZ c55258xgZ = umg.gEmmrt;
                c55258xgZ.setOnClickListener(new TaskDescription(c55258xgZ, 1000L, this));
                ProfitDetailResponse stakingProfit2 = AEQbTJ().getStakingProfit();
                estimated = stakingProfit2 == null ? stakingProfit2.getEstimated() : null;
                if (estimated == null) {
                    estimated = "";
                }
                android.widget.TextView textView7 = umg.AYXKKw;
                textView7.setText(C56033xvF.getBotPnl$default(str4, instType2, estimated, null, false, true, null, false, null, null, null, 2008, null) + " " + strCopydefault);
                textView7.setTextColor(C56033xvF.OLrzqt((java.lang.Object) estimated));
            } else {
                if (Intrinsics.EZpvd((java.lang.Object) (spotLeg$default != null ? spotLeg$default.getSide() : null), (java.lang.Object) "buy")) {
                    if (suggestedInstrument$default2 != null) {
                        displayQuoteSymbol = suggestedInstrument$default2.getTradeSymbol();
                    }
                    if (displayQuoteSymbol == null) {
                        umg.zsXlph.setText(C33069mpW.copydefault(C48033uCm.Fragment.ORWKdN, C56423yEv.EZpvd(C56390yDp.OLrzqt(obj, strValueOf))));
                        BotVo bot22 = AEQbTJ().getBot();
                        if (bot22 != null) {
                            textView2 = umg.AubY;
                            if (autoStakingPos == null) {
                                str3 = C56033xvF.getBotAmount$default(instType2, str4, autoStakingPos != null ? "" : autoStakingPos, null, false, null, 56, null) + " " + strValueOf;
                                textView3 = textView2;
                                textView3.setText(str3);
                                C55258xgZ c55258xgZ2 = umg.gEmmrt;
                                c55258xgZ2.setOnClickListener(new TaskDescription(c55258xgZ2, 1000L, this));
                                ProfitDetailResponse stakingProfit22 = AEQbTJ().getStakingProfit();
                                if (stakingProfit22 == null) {
                                }
                                if (estimated == null) {
                                }
                                android.widget.TextView textView72 = umg.AYXKKw;
                                textView72.setText(C56033xvF.getBotPnl$default(str4, instType2, estimated, null, false, true, null, false, null, null, null, 2008, null) + " " + strCopydefault);
                                textView72.setTextColor(C56033xvF.OLrzqt((java.lang.Object) estimated));
                            }
                        }
                    }
                } else {
                    if (suggestedInstrument$default2 != null) {
                        displayQuoteSymbol = suggestedInstrument$default2.getDisplayQuoteSymbol();
                    }
                    if (displayQuoteSymbol == null) {
                    }
                }
            }
        }
        RecyclerView recyclerView = umg.fetchVPNInfo;
        recyclerView.setAdapter(this.gEmmrt);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        C33064mpR.OLrzqt(this.gEmmrt, (java.util.List<? extends java.lang.Object>) copydefault(AEQbTJ().isHistory()));
        if (AEQbTJ().isHistory()) {
            android.widget.TextView textView8 = umg.AuCTel;
            Intrinsics.checkNotNullExpressionValue(textView8, "");
            textView8.setVisibility(8);
            LinearLayoutCompat linearLayoutCompat5 = umg.isConnected;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat5, "");
            linearLayoutCompat5.setVisibility(8);
            android.widget.TextView textView9 = umg.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(textView9, "");
            textView9.setVisibility(8);
            return;
        }
        android.widget.TextView textView10 = umg.AkhnZx;
        java.lang.String mgnRatio = swapLeg$default != null ? swapLeg$default.getMgnRatio() : null;
        textView10.setText(C56033xvF.fmtBotPnlPercent$default(mgnRatio != null ? mgnRatio : "", false, 0, 6, null));
        umg.DbNXlk.setText(EZpvd(str, swapLeg$default != null ? swapLeg$default.getLiquidPrice() : null, "2"));
    }

    public static /* synthetic */ java.lang.String initView$formatAmountWithSwapUnit$default(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return EZpvd(str, str2, str3);
    }

    public static final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str2 == null) {
            str2 = "";
        }
        return C56033xvF.copydefault(str2, str, (88 & 4) != 0 ? false : true, (88 & 8) != 0 ? null : str3, (88 & 16) != 0 ? false : false, (88 & 32) == 0 ? false : false, (88 & 64) == 0 ? null : null);
    }

    /* JADX INFO: renamed from: o.wvY$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C53970wvY KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C53970wvY c53970wvY) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = c53970wvY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.KWHzl.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(C48033uCm.Fragment.sYcwUD);
                viewOnClickListenerC54939xaY.copydefault(C48033uCm.Fragment.fsw);
                viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.onCreate, new StateListAnimator(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.wvY$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.OLrzqt = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.OLrzqt.dismiss();
        }
    }

    public static /* synthetic */ java.util.List getDetailDataList$default(C53970wvY c53970wvY, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c53970wvY.copydefault(z);
    }

    public final java.util.List<wNR> copydefault(boolean z) {
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(OLrzqt(AEQbTJ().isHistory() ? C33070mpX.AYXKKw(C48033uCm.Fragment.getStatusCode) : "", OLrzqt("open", z), EZpvd("open", z)));
        if (AEQbTJ().isHistory()) {
            listOLrzqt.add(OLrzqt(C33070mpX.AYXKKw(C48033uCm.Fragment.DcMfJKRKUgwx), OLrzqt(EopTrackEvent.CLOSE, z), EZpvd(EopTrackEvent.CLOSE, z)));
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final wNR OLrzqt(java.lang.String str, SmartArbPlanLeg smartArbPlanLeg, SmartArbPlanLeg smartArbPlanLeg2) {
        C56051xvX c56051xvX = C56051xvX.AEQbTJ;
        java.util.ArrayList<TacticsListLabelData> arrayListKWHzl = c56051xvX.KWHzl(smartArbPlanLeg, AEQbTJ().isHistory());
        java.util.ArrayList<TacticsListLabelData> arrayListCopydefault = c56051xvX.copydefault(smartArbPlanLeg2, AEQbTJ().isHistory());
        boolean zIsHistory = AEQbTJ().isHistory();
        boolean zIsArbitrageWithStaking = AEQbTJ().isArbitrageWithStaking();
        ProfitDetailResponse stakingProfit = AEQbTJ().getStakingProfit();
        return new wNR(str, arrayListKWHzl, arrayListCopydefault, c56051xvX.copydefault(smartArbPlanLeg, smartArbPlanLeg2, zIsHistory, zIsArbitrageWithStaking, stakingProfit != null ? stakingProfit.getCcy() : null));
    }

    public static /* synthetic */ SmartArbPlanLeg getSpotLeg$default(C53970wvY c53970wvY, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c53970wvY.OLrzqt(str, z);
    }

    public final SmartArbPlanLeg OLrzqt(java.lang.String str, boolean z) {
        return z ? EZpvd(str, "SPOT", "MARGIN") : OLrzqt(str, "SPOT", "MARGIN");
    }

    public static /* synthetic */ SmartArbPlanLeg getSwapLeg$default(C53970wvY c53970wvY, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c53970wvY.EZpvd(str, z);
    }

    public final SmartArbPlanLeg EZpvd(java.lang.String str, boolean z) {
        return z ? EZpvd(str, "SWAP") : OLrzqt(str, "SWAP");
    }

    public final SmartArbPlanLeg OLrzqt(java.lang.String str, java.lang.String... strArr) {
        SmartArbListItem smartArbListItem;
        java.util.ArrayList<SmartArbPlanLeg> planLeg;
        java.util.ArrayList<SmartArbListItem> arbList = AEQbTJ().getArbList();
        java.lang.Object obj = null;
        if (arbList == null || (smartArbListItem = (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList)) == null || (planLeg = smartArbListItem.getPlanLeg()) == null) {
            return null;
        }
        java.util.Iterator<T> it = planLeg.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            SmartArbPlanLeg smartArbPlanLeg = (SmartArbPlanLeg) next;
            if (yDV.valueOf(strArr, smartArbPlanLeg.getInstType()) && Intrinsics.EZpvd((java.lang.Object) smartArbPlanLeg.getType(), (java.lang.Object) str)) {
                obj = next;
                break;
            }
        }
        return (SmartArbPlanLeg) obj;
    }

    public final SmartArbPlanLeg EZpvd(java.lang.String str, java.lang.String... strArr) {
        SmartArbHisOrderItem smartArbHisOrderItem;
        java.util.ArrayList<SmartArbPlanLeg> planLeg;
        java.util.List<SmartArbHisOrderItem> value = fetchVPNInfo().getValue();
        java.lang.Object obj = null;
        if (value == null || (smartArbHisOrderItem = (SmartArbHisOrderItem) CollectionsKt___CollectionsKt.firstOrNull(value)) == null || (planLeg = smartArbHisOrderItem.getPlanLeg()) == null) {
            return null;
        }
        java.util.Iterator<T> it = planLeg.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            SmartArbPlanLeg smartArbPlanLeg = (SmartArbPlanLeg) next;
            if (yDV.valueOf(strArr, smartArbPlanLeg.getInstType()) && Intrinsics.EZpvd((java.lang.Object) smartArbPlanLeg.getType(), (java.lang.Object) str)) {
                obj = next;
                break;
            }
        }
        return (SmartArbPlanLeg) obj;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.OLrzqt = null;
        super.onDestroyView();
    }
}

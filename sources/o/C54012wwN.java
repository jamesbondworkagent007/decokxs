package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.okinc.tradingbot.impl.common.remoteimage.CoinRemoteImage;
import com.okinc.tradingbot.impl.dto.BillsArchive;
import com.okinc.tradingbot.impl.dto.FundingFeeIncomeResponse;
import com.okinc.tradingbot.impl.dto.InterestInfoResponse;
import com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ProfitsFragment$initListener$1;
import com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ProfitsFragment$initListener$2;
import com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ProfitsFragment$initListener$3;
import com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ProfitsViewModel;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.CostVo;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.SmartArbListItem;
import com.okinc.unify_trade.biz.SmartArbPlanLeg;
import com.okinc.unify_trade.biz.SmartArbitrageVo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingParam;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.Flow;
import o.C48033uCm;
import o.C54132wyb;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wwN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C54012wwN extends AbstractC54032wwh {
    public static final Application Companion = new Application(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AkhnZx;
    public Function1<? super java.lang.Long, ? extends android.os.CountDownTimer> AuCTel;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public android.os.CountDownTimer fJNWhG;
    public final InterfaceC56387yDm fetchVPNInfo;
    public uSJ gEmmrt;
    public TabLayout.OnTabSelectedListener getFieldNames;
    public final InterfaceC56387yDm hDKMBd;
    public TabLayout.Tab isConnected;
    public long iwGUEr;
    public final InterfaceC56387yDm uzCIH;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm values;
    public final int fIwbmz = C48033uCm.Activity.invokespecialRtjmuc;
    public final InterfaceC56387yDm getNewProxyInstance = C56392yDr.copydefault(new Function0() { // from class: o.wwP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C54012wwN.valueOf();
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.wwS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C54012wwN.uzCIH(this.AEQbTJ);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.fIwbmz;
    }

    public C54012wwN() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ProfitsFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ProfitsFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.hDKMBd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ProfitsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ProfitsFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ProfitsFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ProfitsFragment$special$$inlined$viewModels$default$5
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ProfitsFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ProfitsFragment$special$$inlined$activityViewModels$default$2
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ProfitsFragment$special$$inlined$activityViewModels$default$3
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
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.wwT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54012wwN.hDKMBd(this.OLrzqt);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.wwQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54012wwN.getFieldNames(this.AEQbTJ);
            }
        });
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.wwY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54012wwN.iwGUEr(this.OLrzqt);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.wwV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54012wwN.getNewProxyInstance(this.KWHzl);
            }
        });
        this.uzCIH = C56392yDr.copydefault(new Function0() { // from class: o.wwX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54012wwN.zsXlph(this.EZpvd);
            }
        });
        this.ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.wwW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C54012wwN.AuCTelauCTel(this.EZpvd));
            }
        });
        this.fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.wwU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C54012wwN.wlaJM(this.AEQbTJ));
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.wwR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54012wwN.AhwBna();
            }
        });
        this.iwGUEr = -1L;
    }

    /* JADX INFO: renamed from: o.wwN$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wwN.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final C59534zip fetchVPNInfo() {
        return (C59534zip) this.getNewProxyInstance.getValue();
    }

    public static final C59534zip valueOf() {
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(wOQ.class, new wOP());
        return c59534zip;
    }

    public final C59534zip djBIcL() {
        return (C59534zip) this.AhwBna.getValue();
    }

    public static final C59534zip uzCIH(final C54012wwN c54012wwN) {
        C59534zip c59534zip = new C59534zip();
        ProfitDetailResponse arbitrageProfit = c54012wwN.AuCTel().getArbitrageProfit();
        java.lang.String ccy = arbitrageProfit != null ? arbitrageProfit.getCcy() : null;
        if (ccy == null) {
            ccy = "";
        }
        c59534zip.register(FundingFeeIncomeResponse.class, new wON(ccy, new Function2() { // from class: o.wwL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C54012wwN.OLrzqt(this.EZpvd, ((java.lang.Long) obj).longValue(), (Function1) obj2);
            }
        }));
        return c59534zip;
    }

    public static final Unit OLrzqt(C54012wwN c54012wwN, long j, Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (j < c54012wwN.iwGUEr) {
            return Unit.INSTANCE;
        }
        c54012wwN.iwGUEr = j;
        c54012wwN.AuCTel = function1;
        c54012wwN.ejfBZ();
        return Unit.INSTANCE;
    }

    public final ProfitsViewModel DbNXlk() {
        return (ProfitsViewModel) this.hDKMBd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TacticsDetailPresenter fJNWhG() {
        return (TacticsDetailPresenter) this.values.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StrategyDetailsResponse AuCTel() {
        return (StrategyDetailsResponse) this.fetchVPNInfo.getValue();
    }

    public static final StrategyDetailsResponse hDKMBd(C54012wwN c54012wwN) {
        return c54012wwN.fJNWhG().AhwBna();
    }

    public static final SmartArbListItem getFieldNames(C54012wwN c54012wwN) {
        java.util.ArrayList<SmartArbListItem> arbList = c54012wwN.AuCTel().getArbList();
        if (arbList != null) {
            return (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList);
        }
        return null;
    }

    public final SmartArbListItem gEmmrt() {
        return (SmartArbListItem) this.AYXKKw.getValue();
    }

    public static final o.ActionBar iwGUEr(C54012wwN c54012wwN) {
        java.util.ArrayList<SmartArbPlanLeg> planLeg;
        SmartArbPlanLeg smartArbPlanLeg;
        SmartArbListItem smartArbListItemGEmmrt = c54012wwN.gEmmrt();
        return o.TaskDescription.AEQbTJ((smartArbListItemGEmmrt == null || (planLeg = smartArbListItemGEmmrt.getPlanLeg()) == null || (smartArbPlanLeg = (SmartArbPlanLeg) CollectionsKt___CollectionsKt.firstOrNull(planLeg)) == null) ? null : smartArbPlanLeg.getInstId());
    }

    public final o.ActionBar isConnected() {
        return (o.ActionBar) this.AkhnZx.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String fIwbmz() {
        return (java.lang.String) this.valueOf.getValue();
    }

    public static final java.lang.String getNewProxyInstance(C54012wwN c54012wwN) {
        java.lang.String upperCase = c54012wwN.isConnected().copydefault().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String uzCIH() {
        return (java.lang.String) this.uzCIH.getValue();
    }

    public static final java.lang.String zsXlph(C54012wwN c54012wwN) {
        java.lang.String upperCase = c54012wwN.isConnected().AEQbTJ().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    public static final boolean AuCTelauCTel(C54012wwN c54012wwN) {
        return c54012wwN.AuCTel().isArbitrageWithStaking();
    }

    public final boolean AkhnZx() {
        return ((java.lang.Boolean) this.ejfBZ.getValue()).booleanValue();
    }

    public static final boolean wlaJM(C54012wwN c54012wwN) {
        if (c54012wwN.AkhnZx()) {
            return true;
        }
        BotVo bot = c54012wwN.AuCTel().getBot();
        return bot != null && bot.isAutoStaking();
    }

    public final boolean values() {
        return ((java.lang.Boolean) this.fARcdN.getValue()).booleanValue();
    }

    public static final InterfaceC54581xNr AhwBna() {
        return C54589xNz.EZpvd.copydefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC54581xNr getFieldNames() {
        return (InterfaceC54581xNr) this.DbNXlk.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        uSJ usjCopydefault = uSJ.copydefault(view);
        if (values()) {
            Intrinsics.copydefault(usjCopydefault);
            AEQbTJ(usjCopydefault);
        }
        Intrinsics.copydefault(usjCopydefault);
        copydefault(usjCopydefault);
        KWHzl(usjCopydefault);
        this.gEmmrt = usjCopydefault;
        iwGUEr();
    }

    private final void iwGUEr() {
        Flow<vNB<kotlin.Pair<java.util.List<BillsArchive>, InterestInfoResponse>>> flowCopydefault = DbNXlk().copydefault();
        Lifecycle.State state = Lifecycle.State.CREATED;
        java.lang.String strFIwbmz = null;
        C52692wUv.copydefault(flowCopydefault, this, state, new ProfitsFragment$initListener$1(this, null));
        C52692wUv.copydefault(DbNXlk().AEQbTJ(), this, state, new ProfitsFragment$initListener$2(this, null));
        DbNXlk().copydefault(AuCTel().getAlgoId(), AuCTel().isHistory());
        if (values()) {
            C52692wUv.copydefault(DbNXlk().OLrzqt(), this, state, new ProfitsFragment$initListener$3(this, null));
            ProfitsViewModel profitsViewModelDbNXlk = DbNXlk();
            java.lang.String algoId = AuCTel().getAlgoId();
            java.lang.Long accountId = AuCTel().getAccountId();
            if (AkhnZx()) {
                ProfitDetailResponse stakingProfit = AuCTel().getStakingProfit();
                if (stakingProfit != null) {
                    strFIwbmz = stakingProfit.getCcy();
                }
            } else {
                strFIwbmz = fIwbmz();
            }
            profitsViewModelDbNXlk.OLrzqt(algoId, accountId, strFIwbmz);
        }
    }

    /* JADX INFO: renamed from: o.wwN$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C54012wwN copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C54012wwN c54012wwN) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c54012wwN;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.DbNXlk().KWHzl(this.copydefault.AuCTel().getAccountId(), this.copydefault.AuCTel().getAlgoId(), this.copydefault.AuCTel().isHistory());
            }
        }
    }

    /* JADX INFO: renamed from: o.wwN$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ BizInstrument AEQbTJ;
        public final /* synthetic */ CostVo EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ CostVo copydefault;
        public final /* synthetic */ C54012wwN gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C54012wwN c54012wwN, CostVo costVo, CostVo costVo2, BizInstrument bizInstrument) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.gEmmrt = c54012wwN;
            this.copydefault = costVo;
            this.EZpvd = costVo2;
            this.AEQbTJ = bizInstrument;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C43056riA c43056riA = C43056riA.AEQbTJ;
                android.content.Context contextRequireContext = this.gEmmrt.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                kotlin.Pair[] pairArr = new kotlin.Pair[6];
                CostVo costVo = this.copydefault;
                java.lang.String spotFeeAmt = costVo != null ? costVo.getSpotFeeAmt() : null;
                if (spotFeeAmt == null) {
                    spotFeeAmt = "";
                }
                pairArr[0] = C56390yDp.OLrzqt("spotOpen", spotFeeAmt);
                CostVo costVo2 = this.copydefault;
                java.lang.String swapFeeAmt = costVo2 != null ? costVo2.getSwapFeeAmt() : null;
                if (swapFeeAmt == null) {
                    swapFeeAmt = "";
                }
                pairArr[1] = C56390yDp.OLrzqt("swapOpen", swapFeeAmt);
                CostVo costVo3 = this.EZpvd;
                java.lang.String spotFeeAmt2 = costVo3 != null ? costVo3.getSpotFeeAmt() : null;
                if (spotFeeAmt2 == null) {
                    spotFeeAmt2 = "";
                }
                pairArr[2] = C56390yDp.OLrzqt("spotClose", spotFeeAmt2);
                CostVo costVo4 = this.EZpvd;
                java.lang.String swapFeeAmt2 = costVo4 != null ? costVo4.getSwapFeeAmt() : null;
                if (swapFeeAmt2 == null) {
                    swapFeeAmt2 = "";
                }
                pairArr[3] = C56390yDp.OLrzqt("swapClose", swapFeeAmt2);
                ProfitDetailResponse stakingProfit = this.gEmmrt.AuCTel().getStakingProfit();
                java.lang.String ccy = stakingProfit != null ? stakingProfit.getCcy() : null;
                BizInstrument bizInstrument = this.AEQbTJ;
                pairArr[4] = C56390yDp.OLrzqt("stakePair", ccy + "/" + (bizInstrument != null ? bizInstrument.getTradeSymbol() : null));
                CostVo costVo5 = this.EZpvd;
                java.lang.String unstakingFeeAmt = costVo5 != null ? costVo5.getUnstakingFeeAmt() : null;
                pairArr[5] = C56390yDp.OLrzqt("stakeConversion", unstakingFeeAmt != null ? unstakingFeeAmt : "");
                c43056riA.OLrzqt(contextRequireContext, "okluatradingeco", "/bot/arb/fees", C56424yEw.gEmmrt(pairArr));
            }
        }
    }

    /* JADX INFO: renamed from: o.wwN$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C54012wwN EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ C55258xgZ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C54012wwN c54012wwN, C55258xgZ c55258xgZ, int i) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c54012wwN;
            this.copydefault = c55258xgZ;
            this.OLrzqt = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.EZpvd.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(this.copydefault.AkhnZx());
                viewOnClickListenerC54939xaY.copydefault(this.OLrzqt);
                viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.onCreate, new Dialog(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.wwN$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ ProfitDetailResponse AEQbTJ;
        public final /* synthetic */ C54012wwN AYXKKw;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ ProfitDetailResponse OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, ProfitDetailResponse profitDetailResponse, C54012wwN c54012wwN, java.lang.String str, ProfitDetailResponse profitDetailResponse2) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = profitDetailResponse;
            this.AYXKKw = c54012wwN;
            this.KWHzl = str;
            this.AEQbTJ = profitDetailResponse2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            ProfitDetailResponse quote;
            TradeCoinInfo tradeCoinInfoAhwBna;
            ProfitDetailResponse quote2;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                ProfitDetailResponse profitDetailResponse = this.OLrzqt;
                java.lang.String total = null;
                java.lang.String ccy = profitDetailResponse != null ? profitDetailResponse.getCcy() : null;
                if (ccy == null) {
                    ccy = "";
                }
                C43056riA c43056riA = C43056riA.AEQbTJ;
                android.content.Context contextRequireContext = this.AYXKKw.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                kotlin.Pair[] pairArr = new kotlin.Pair[10];
                pairArr[0] = C56390yDp.OLrzqt("algoId", this.AYXKKw.AuCTel().getAlgoId());
                pairArr[1] = C56390yDp.OLrzqt("accountId", java.lang.String.valueOf(this.AYXKKw.AuCTel().getAccountId()));
                pairArr[2] = C56390yDp.OLrzqt("ccy", ccy);
                pairArr[3] = C56390yDp.OLrzqt("apy", this.KWHzl);
                ProfitDetailResponse profitDetailResponse2 = this.OLrzqt;
                java.lang.String total2 = profitDetailResponse2 != null ? profitDetailResponse2.getTotal() : null;
                if (total2 == null) {
                    total2 = "";
                }
                pairArr[4] = C56390yDp.OLrzqt("pnl", total2);
                ProfitDetailResponse profitDetailResponse3 = this.OLrzqt;
                java.lang.String total3 = (profitDetailResponse3 == null || (quote2 = profitDetailResponse3.getQuote()) == null) ? null : quote2.getTotal();
                if (total3 == null) {
                    total3 = "";
                }
                pairArr[5] = C56390yDp.OLrzqt("quotePnl", total3);
                InterfaceC54581xNr fieldNames = this.AYXKKw.getFieldNames();
                java.lang.String sizeDig = (fieldNames == null || (tradeCoinInfoAhwBna = fieldNames.AhwBna(ccy)) == null) ? null : tradeCoinInfoAhwBna.getSizeDig();
                if (sizeDig == null) {
                    sizeDig = "";
                }
                pairArr[6] = C56390yDp.OLrzqt("pnlPrecision", sizeDig);
                ProfitDetailResponse profitDetailResponse4 = this.AEQbTJ;
                java.lang.String ccy2 = profitDetailResponse4 != null ? profitDetailResponse4.getCcy() : null;
                if (ccy2 == null) {
                    ccy2 = "";
                }
                pairArr[7] = C56390yDp.OLrzqt("autoStakeCcy", ccy2);
                ProfitDetailResponse profitDetailResponse5 = this.AEQbTJ;
                java.lang.String total4 = profitDetailResponse5 != null ? profitDetailResponse5.getTotal() : null;
                if (total4 == null) {
                    total4 = "";
                }
                pairArr[8] = C56390yDp.OLrzqt("autoStakePnl", total4);
                ProfitDetailResponse profitDetailResponse6 = this.AEQbTJ;
                if (profitDetailResponse6 != null && (quote = profitDetailResponse6.getQuote()) != null) {
                    total = quote.getTotal();
                }
                pairArr[9] = C56390yDp.OLrzqt("autoStakeQuotePnl", total != null ? total : "");
                c43056riA.OLrzqt(contextRequireContext, "okluatradingeco", "/bot/arb/stake_profit_history", C56424yEw.gEmmrt(pairArr));
            }
        }
    }

    /* JADX INFO: renamed from: o.wwN$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C54012wwN copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C54012wwN c54012wwN) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c54012wwN;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                TacticsData tacticsDataZLjUOn = this.copydefault.fJNWhG().zLjUOn();
                C54132wyb.TaskDescription taskDescription = C54132wyb.Companion;
                androidx.fragment.app.FragmentManager childFragmentManager = this.copydefault.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                C54132wyb.TaskDescription.newInstance$default(taskDescription, childFragmentManager, "auto_education_single_earn", tacticsDataZLjUOn, false, 8, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.wwN$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C54012wwN copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C54012wwN c54012wwN) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c54012wwN;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.copydefault.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(C48033uCm.Fragment.sYcwUD);
                viewOnClickListenerC54939xaY.copydefault(C48033uCm.Fragment.fsw);
                viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.onCreate, new PendingIntent(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public final void KWHzl(uSJ usj) {
        java.lang.String str;
        BotVo bot;
        BotCommon common;
        AutoEarnStakingParam autoEarn;
        C55258xgZ c55258xgZ = usj.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
        OLrzqt(c55258xgZ, C55688xof.Application.IPostMessageServiceStub);
        C56051xvX c56051xvX = C56051xvX.AEQbTJ;
        SmartArbListItem smartArbListItemGEmmrt = gEmmrt();
        java.lang.String instFamily = smartArbListItemGEmmrt != null ? smartArbListItemGEmmrt.getInstFamily() : null;
        if (instFamily == null) {
            instFamily = "";
        }
        BizInstrument bizInstrumentCopydefault = c56051xvX.copydefault(instFamily, "SWAP");
        BotVo bot2 = AuCTel().getBot();
        SmartArbitrageVo smartArbitrage = bot2 != null ? bot2.getSmartArbitrage() : null;
        CostVo openCost = smartArbitrage != null ? smartArbitrage.getOpenCost() : null;
        android.widget.TextView textView = usj.AuCTel;
        java.lang.String spreadAmt = openCost != null ? openCost.getSpreadAmt() : null;
        textView.setText(C56051xvX.getSmartArbProfit$default(c56051xvX, spreadAmt, bizInstrumentCopydefault, false, true, 4, null));
        if (java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) textView.getText(), (java.lang.Object) "--")).booleanValue()) {
            spreadAmt = null;
        }
        textView.setTextColor(C56033xvF.OLrzqt((java.lang.Object) spreadAmt));
        boolean zIsDetailsEarn = AuCTel().isDetailsEarn(fJNWhG().zLjUOn());
        LinearLayoutCompat linearLayoutCompat = usj.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(zIsDetailsEarn ? 0 : 8);
        if (zIsDetailsEarn) {
            android.widget.TextView textView2 = usj.EZpvd;
            StrategyDetailsResponse strategyDetailsResponseAuCTel = AuCTel();
            java.lang.String totalProfit = (strategyDetailsResponseAuCTel == null || (bot = strategyDetailsResponseAuCTel.getBot()) == null || (common = bot.getCommon()) == null || (autoEarn = common.getAutoEarn()) == null) ? null : autoEarn.getTotalProfit();
            str = "--";
            textView2.setText(C56051xvX.getSmartArbProfit$default(c56051xvX, totalProfit, bizInstrumentCopydefault, false, true, 4, null));
            if (java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) textView2.getText(), (java.lang.Object) str)).booleanValue()) {
                totalProfit = null;
            }
            textView2.setTextColor(C56033xvF.OLrzqt((java.lang.Object) totalProfit));
            textView2.setOnClickListener(new StateListAnimator(textView2, 1000L, this));
        } else {
            str = "--";
        }
        CostVo closeCost = smartArbitrage != null ? smartArbitrage.getCloseCost() : null;
        java.lang.String spreadAmt2 = closeCost != null ? closeCost.getSpreadAmt() : null;
        android.widget.TextView textView3 = usj.gEmmrt;
        textView3.setText(C56051xvX.getSmartArbProfit$default(c56051xvX, spreadAmt2, bizInstrumentCopydefault, false, true, 4, null));
        textView3.setTextColor(C56033xvF.OLrzqt((java.lang.Object) (java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) textView3.getText(), (java.lang.Object) str)).booleanValue() ? null : spreadAmt2)));
        C55258xgZ c55258xgZ2 = usj.gHZMYf;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ2, "");
        OLrzqt(c55258xgZ2, C55688xof.Application.IPostMessageServiceDefault);
        android.widget.TextView textView4 = usj.AwvSrB;
        textView4.setText(C56051xvX.getSmartArbProfit$default(c56051xvX, AuCTel().getFee(), bizInstrumentCopydefault, false, true, 4, null));
        java.lang.String str2 = str;
        textView4.setOnClickListener(new Activity(textView4, 1000L, this, openCost, closeCost, bizInstrumentCopydefault));
        C55258xgZ c55258xgZ3 = usj.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ3, "");
        OLrzqt(c55258xgZ3, C55688xof.Application.ITrustedWebActivityServiceStub);
        android.widget.TextView textView5 = usj.AYXKKw;
        java.lang.String totalInterestAmt = AuCTel().getTotalInterestAmt();
        textView5.setText((totalInterestAmt == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) totalInterestAmt)) ? str2 : C38305pTw.formatCryptoCode$default(C33129mqd.EZpvd(totalInterestAmt), AuCTel().getDebtCcy(), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(2, 4), null, null, null, 56, null));
        textView5.setOnClickListener(new ActionBar(textView5, 1000L, this));
    }

    /* JADX INFO: renamed from: o.wwN$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.copydefault = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.copydefault.dismiss();
        }
    }

    public final void copydefault(uSJ usj) {
        ProfitDetailResponse arbitrageProfit = AuCTel().getArbitrageProfit();
        if (arbitrageProfit == null) {
            usj.DbNXlk.setText(C33069mpW.copydefault(C48033uCm.Fragment.bindToGooglePlayService, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", "--"))));
            usj.isConnected.setText("--");
            usj.values.setText("--");
        } else {
            android.widget.TextView textView = usj.isConnected;
            textView.setText(C56033xvF.fmtBotPnlPercent$default(arbitrageProfit.getApy(), true, 0, 4, null));
            textView.setTextColor(C56033xvF.OLrzqt((java.lang.Object) arbitrageProfit.getApy()));
            usj.DbNXlk.setText(C33069mpW.copydefault(C48033uCm.Fragment.bindToGooglePlayService, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", C53418wlC.copydefault(arbitrageProfit.getCcy())))));
            android.widget.TextView textView2 = usj.values;
            textView2.setText(C56033xvF.copydefault(arbitrageProfit.getTotal(), arbitrageProfit.getCcy(), (88 & 4) != 0 ? false : false, (88 & 8) != 0 ? null : "3", (88 & 16) != 0 ? false : false, (88 & 32) == 0, (88 & 64) == 0 ? null : null));
            textView2.setTextColor(C56033xvF.OLrzqt((java.lang.Object) arbitrageProfit.getTotal()));
            Intrinsics.copydefault(textView2);
        }
        RecyclerView recyclerView = usj.OLrzqt;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(djBIcL());
    }

    public final void AEQbTJ(uSJ usj) {
        BotVo bot;
        SmartArbitrageVo smartArbitrage;
        LinearLayoutCompat linearLayoutCompat = usj.AxsJAY;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(0);
        LinearLayoutCompat linearLayoutCompat2 = usj.iwGUEr;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
        linearLayoutCompat2.setVisibility(0);
        C55249xgQ c55249xgQ = usj.wlaJM;
        TabLayout.Tab id = c55249xgQ.newTab().setId(1);
        CoinRemoteImage.StateListAnimator stateListAnimator = CoinRemoteImage.Companion;
        Intrinsics.copydefault(id);
        CoinRemoteImage.StateListAnimator.loadRemoteCoinImage$default(stateListAnimator, id, fIwbmz(), null, 2, null);
        c55249xgQ.addTab(id);
        this.isConnected = id;
        TabLayout.Tab id2 = c55249xgQ.newTab().setId(2);
        Intrinsics.copydefault(id2);
        CoinRemoteImage.StateListAnimator.loadRemoteCoinImage$default(stateListAnimator, id2, uzCIH(), null, 2, null);
        c55249xgQ.addTab(id2);
        c55249xgQ.selectTab(null);
        ProfitDetailResponse stakingProfit = AuCTel().getStakingProfit();
        StrategyDetailsResponse strategyDetailsResponseAuCTel = AuCTel();
        ProfitDetailResponse autoStakingProfit = (strategyDetailsResponseAuCTel == null || (bot = strategyDetailsResponseAuCTel.getBot()) == null || (smartArbitrage = bot.getSmartArbitrage()) == null) ? null : smartArbitrage.getAutoStakingProfit();
        java.lang.String apy = stakingProfit != null ? stakingProfit.getApy() : null;
        java.lang.String str = apy == null ? "" : apy;
        android.widget.TextView textView = usj.fARcdN;
        textView.setText(xMR.formatPercentWithSymbol$default(xMR.copydefault, str, 0, 0, RoundingMode.DOWN, 6, null));
        textView.setTextColor(C56033xvF.OLrzqt((java.lang.Object) str));
        C55258xgZ c55258xgZ = usj.AhwBna;
        c55258xgZ.setOnClickListener(new TaskDescription(c55258xgZ, 1000L, this));
        RecyclerView recyclerView = usj.AuCTelauCTel;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(fetchVPNInfo());
        recyclerView.addItemDecoration(new C57593ylO(C55298xhM.dp2px$default(16.0f, null, 1, null), false, false));
        android.widget.TextView textView2 = usj.AubY;
        textView2.setOnClickListener(new FragmentManager(textView2, 1000L, stakingProfit, this, str, autoStakingProfit));
    }

    /* JADX INFO: renamed from: o.wwN$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.KWHzl.dismiss();
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        wUM wum;
        super.onResume();
        uSJ usj = this.gEmmrt;
        if (usj != null && (wum = usj.djBIcL) != null) {
            wum.EZpvd();
        }
        ejfBZ();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        wUM wum;
        super.onPause();
        uSJ usj = this.gEmmrt;
        if (usj != null && (wum = usj.djBIcL) != null) {
            wum.AEQbTJ();
        }
        fARcdN();
    }

    public final void ejfBZ() {
        fARcdN();
        long j = this.iwGUEr;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        Function1<? super java.lang.Long, ? extends android.os.CountDownTimer> function1 = this.AuCTel;
        this.fJNWhG = function1 != null ? function1.invoke(java.lang.Long.valueOf(j - jCurrentTimeMillis)) : null;
    }

    public final void fARcdN() {
        android.os.CountDownTimer countDownTimer = this.fJNWhG;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.fJNWhG = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        uSJ usj;
        C55249xgQ c55249xgQ;
        TabLayout.OnTabSelectedListener onTabSelectedListener = this.getFieldNames;
        if (onTabSelectedListener != null && (usj = this.gEmmrt) != null && (c55249xgQ = usj.wlaJM) != null) {
            c55249xgQ.removeOnTabSelectedListener(onTabSelectedListener);
        }
        this.gEmmrt = null;
        super.onDestroyView();
    }

    public final void OLrzqt(C55258xgZ c55258xgZ, @androidx.annotation.StringRes int i) {
        c55258xgZ.setOnClickListener(new Fragment(c55258xgZ, 1000L, this, c55258xgZ, i));
    }
}

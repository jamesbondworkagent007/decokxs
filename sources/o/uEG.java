package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.biz.TradeType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.aiBot.dto.InvestLimitDto;
import com.okinc.tradingbot.impl.aiBot.dto.MinMaxDto;
import com.okinc.tradingbot.impl.aiBot.dto.TpSlLimitDto;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmInvestBottomSheet$initViewModel$1;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmInvestBottomSheet$initViewModel$2;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmInvestBottomSheet$initViewModel$4;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmInvestViewModel;
import com.okinc.tradingbot.impl.order.strategy.ordercomfirm.BotOrderConfirmFragment;
import com.okinc.tradingbot.impl.utils.PriceRangeUtil;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.DataSetting;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.RecurringOrderData;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SmartArbitrageReq;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyMoveOrderReq;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.biz.TwapReq;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52755wXd;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uEG extends AbstractC48097uEw {
    public final InterfaceC56387yDm AhwBna;
    public final boolean AkhnZx = true;
    public final InterfaceC56387yDm AuCTel;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public final InterfaceC56387yDm fetchVPNInfo;
    public C52794wYp gEmmrt;
    public C48468uSn isConnected;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm values;
    public static final Activity Companion = new Activity(null);
    public static final int djBIcL = 8;
    public static final java.lang.String AYXKKw = C56524yIo.AEQbTJ(uEG.class).valueOf();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.AkhnZx;
    }

    public uEG() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.order.LlmInvestBottomSheet$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.order.LlmInvestBottomSheet$special$$inlined$viewModels$default$2
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
        this.fJNWhG = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(LlmInvestViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.order.LlmInvestBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.order.LlmInvestBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.order.LlmInvestBottomSheet$special$$inlined$viewModels$default$5
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.order.LlmInvestBottomSheet$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.order.LlmInvestBottomSheet$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C55915xsu.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.order.LlmInvestBottomSheet$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.order.LlmInvestBottomSheet$special$$inlined$viewModels$default$9
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
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.order.LlmInvestBottomSheet$special$$inlined$viewModels$default$10
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.AuCTel = C56392yDr.copydefault(new Function0() { // from class: o.uEC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return uEG.DbNXlk(this.copydefault);
            }
        });
        this.fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.uEN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return uEG.isConnected(this.OLrzqt);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.uEQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return uEG.valueOf(this.EZpvd);
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.uEO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(uEG.fetchVPNInfo(this.EZpvd));
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.uEU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(uEG.AkhnZx(this.copydefault));
            }
        });
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.uEV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return uEG.values();
            }
        });
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uEG.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, java.util.List<InvestLimitDto> list, @NotNull AiOrderReq aiOrderReq, TpSlLimitDto tpSlLimitDto, @NotNull java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(aiOrderReq, "");
            Intrinsics.checkNotNullParameter(str, "");
            uEG ueg = new uEG();
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("ORDER_REQ", aiOrderReq), C56390yDp.OLrzqt("TP_SL_LIMIT", tpSlLimitDto), C56390yDp.OLrzqt("AI_MODEL_URL", str), C56390yDp.OLrzqt("IS_TP_MANDATORY", bool), C56390yDp.OLrzqt("IS_SL_MANDATORY", bool2));
            if (list == null) {
                list = yDY.AhwBna();
            }
            bundleBundleOf.putParcelableArrayList("INVEST_LIMITS", new java.util.ArrayList<>(list));
            ueg.setArguments(bundleBundleOf);
            java.lang.String simpleName = uEG.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            C49662usl.EZpvd(ueg, fragmentManager, simpleName);
        }
    }

    public final LlmInvestViewModel AkhnZx() {
        return (LlmInvestViewModel) this.fJNWhG.getValue();
    }

    private final C55915xsu fJNWhG() {
        return (C55915xsu) this.valueOf.getValue();
    }

    public static final AiOrderReq DbNXlk(uEG ueg) {
        AiOrderReq aiOrderReq;
        android.os.Bundle arguments = ueg.getArguments();
        return (arguments == null || (aiOrderReq = (AiOrderReq) arguments.getParcelable("ORDER_REQ")) == null) ? new AiOrderReq((java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (DataSetting) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 8191, (DefaultConstructorMarker) null) : aiOrderReq;
    }

    public final AiOrderReq DbNXlk() {
        return (AiOrderReq) this.AuCTel.getValue();
    }

    private final TpSlLimitDto fIwbmz() {
        return (TpSlLimitDto) this.fIwbmz.getValue();
    }

    public static final TpSlLimitDto isConnected(uEG ueg) {
        TpSlLimitDto tpSlLimitDto;
        android.os.Bundle arguments = ueg.getArguments();
        return (arguments == null || (tpSlLimitDto = (TpSlLimitDto) arguments.getParcelable("TP_SL_LIMIT")) == null) ? new TpSlLimitDto((MinMaxDto) null, (MinMaxDto) null, 3, (DefaultConstructorMarker) null) : tpSlLimitDto;
    }

    private final java.lang.String fetchVPNInfo() {
        return (java.lang.String) this.AhwBna.getValue();
    }

    public static final java.lang.String valueOf(uEG ueg) {
        android.os.Bundle arguments = ueg.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("AI_MODEL_URL") : null;
        return string == null ? "" : string;
    }

    public static final boolean fetchVPNInfo(uEG ueg) {
        android.os.Bundle arguments = ueg.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("IS_TP_MANDATORY");
        }
        return false;
    }

    private final boolean hDKMBd() {
        return ((java.lang.Boolean) this.DbNXlk.getValue()).booleanValue();
    }

    public static final boolean AkhnZx(uEG ueg) {
        android.os.Bundle arguments = ueg.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("IS_SL_MANDATORY");
        }
        return false;
    }

    private final boolean AuCTel() {
        return ((java.lang.Boolean) this.values.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC54581xNr fARcdN() {
        return (InterfaceC54581xNr) this.fetchVPNInfo.getValue();
    }

    public static final InterfaceC54581xNr values() {
        return C54589xNz.EZpvd.copydefault();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C48468uSn c48468uSnAEQbTJ = C48468uSn.AEQbTJ(android.view.LayoutInflater.from(getContext()), constraintLayout, true);
        Intrinsics.copydefault(c48468uSnAEQbTJ);
        KWHzl(c48468uSnAEQbTJ);
        this.isConnected = c48468uSnAEQbTJ;
        ejfBZ();
    }

    private final void ejfBZ() {
        C52692wUv.flowAndCollect$default(AkhnZx().AEQbTJ(), this, null, new LlmInvestBottomSheet$initViewModel$1(this, null), 2, null);
        AkhnZx().DbNXlk();
        C52692wUv.flowAndCollect$default(fJNWhG().valueOf(), this, null, new LlmInvestBottomSheet$initViewModel$2(this, null), 2, null);
        getParentFragmentManager().setFragmentResultListener("bot_order", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.uEE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                uEG.KWHzl(this.EZpvd, str, bundle);
            }
        });
        C52692wUv.flowAndCollectLatest$default(AkhnZx().fJNWhG(), this, null, new LlmInvestBottomSheet$initViewModel$4(this, null), 2, null);
    }

    public static final void KWHzl(uEG ueg, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ueg.AkhnZx().isConnected();
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ uEG copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, uEG ueg) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = ueg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            xOW newProxyInstance;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C48468uSn c48468uSn = this.copydefault.isConnected;
                if (c48468uSn != null) {
                    AiOrderReq aiOrderReqKWHzl = this.copydefault.AkhnZx().KWHzl(c48468uSn.AEQbTJ.AkhnZx(), c48468uSn.AEQbTJ.fARcdN(), c48468uSn.gEmmrt.AkhnZx(), c48468uSn.OLrzqt.AkhnZx());
                    InterfaceC54581xNr interfaceC54581xNrFARcdN = this.copydefault.fARcdN();
                    if (interfaceC54581xNrFARcdN != null && (newProxyInstance = interfaceC54581xNrFARcdN.getNewProxyInstance()) != null && newProxyInstance.QbewEr()) {
                        this.copydefault.AEQbTJ(aiOrderReqKWHzl);
                    } else {
                        pUU.KWHzl(uEG.AYXKKw, "getOrderRemindConfirm is false, continue to order");
                        this.copydefault.AkhnZx().isConnected();
                    }
                }
            }
        }
    }

    public final void KWHzl(final C48468uSn c48468uSn) {
        final C47988uAv c47988uAv = c48468uSn.AEQbTJ;
        c47988uAv.setUnitClickable(AkhnZx().EZpvd(), new Function0() { // from class: o.uER
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return uEG.AEQbTJ(this.copydefault, c47988uAv);
            }
        });
        c47988uAv.setOnTextChangeCallback(new Function2() { // from class: o.uES
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return uEG.AEQbTJ(c47988uAv, this, c48468uSn, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        c47988uAv.copydefault(new Function1() { // from class: o.uET
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return uEG.KWHzl(c47988uAv, this, c48468uSn, ((java.lang.Float) obj).floatValue());
            }
        });
        final C47988uAv c47988uAv2 = c48468uSn.gEmmrt;
        C47988uAv.setInputLabel$default(c47988uAv2, C33070mpX.AYXKKw(C55688xof.Application.isRated), null, 2, null);
        MinMaxDto minMaxDtoKWHzl = fIwbmz().KWHzl();
        PriceRangeUtil priceRangeUtil = PriceRangeUtil.AEQbTJ;
        c47988uAv2.setInputUnit(priceRangeUtil.OLrzqt(minMaxDtoKWHzl.copydefault(), minMaxDtoKWHzl.KWHzl()));
        c47988uAv2.setMaxDecimal(2);
        c47988uAv2.setOnTextChangeCallback(new Function2() { // from class: o.uEI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return uEG.OLrzqt(this.copydefault, c47988uAv2, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        c47988uAv2.setOnFocusChangeCallback(new Function2() { // from class: o.uEJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return uEG.AEQbTJ(this.EZpvd, c47988uAv2, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
        java.lang.String tpRatio = DbNXlk().getTpRatio();
        if (tpRatio != null) {
            C47988uAv.setInputContent$default(c47988uAv2, C33129mqd.mulS$default(tpRatio, 100, null, null, null, 14, null), false, false, 6, null);
        }
        final C47988uAv c47988uAv3 = c48468uSn.OLrzqt;
        C47988uAv.setInputLabel$default(c47988uAv3, C33070mpX.AYXKKw(C55688xof.Application.getPercentRating), null, 2, null);
        MinMaxDto minMaxDtoEZpvd = fIwbmz().EZpvd();
        c47988uAv3.setInputUnit(priceRangeUtil.OLrzqt(minMaxDtoEZpvd.copydefault(), minMaxDtoEZpvd.KWHzl()));
        c47988uAv3.setMaxDecimal(2);
        c47988uAv3.setOnTextChangeCallback(new Function2() { // from class: o.uEL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return uEG.copydefault(this.AEQbTJ, c47988uAv3, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        c47988uAv3.setOnFocusChangeCallback(new Function2() { // from class: o.uEK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return uEG.copydefault(this.OLrzqt, c47988uAv3, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
        java.lang.String slRatio = DbNXlk().getSlRatio();
        if (slRatio != null) {
            C47988uAv.setInputContent$default(c47988uAv3, C33129mqd.mulS$default(slRatio, 100, null, null, null, 14, null), false, false, 6, null);
        }
    }

    public static final Unit AEQbTJ(final uEG ueg, final C47988uAv c47988uAv) {
        C52755wXd.Application application = C52755wXd.Companion;
        java.util.List<C55276xgr> listCopydefault = ueg.AkhnZx().copydefault();
        androidx.fragment.app.FragmentManager childFragmentManager = ueg.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        application.AEQbTJ(listCopydefault, childFragmentManager, (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : new Function0() { // from class: o.uEH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return uEG.KWHzl(c47988uAv);
            }
        }, new Function1() { // from class: o.uEP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return uEG.EZpvd(c47988uAv, ueg, (C55276xgr) obj);
            }
        }, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C47988uAv c47988uAv, uEG ueg, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        c47988uAv.setSidesLabelUnselect();
        java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
        InvestLimitDto investLimitDto = objOLrzqt instanceof InvestLimitDto ? (InvestLimitDto) objOLrzqt : null;
        if (investLimitDto != null) {
            ueg.AkhnZx().copydefault(investLimitDto);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C47988uAv c47988uAv) {
        c47988uAv.setSidesLabelUnselect();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C47988uAv c47988uAv, uEG ueg, C48468uSn c48468uSn, C47988uAv c47988uAv2, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv2, "");
        if (c47988uAv.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(c47988uAv, false, 1, null);
        }
        ueg.EZpvd(c48468uSn);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C47988uAv c47988uAv, uEG ueg, C48468uSn c48468uSn, float f) {
        C47988uAv.setInputContentIgnoreCallback$default(c47988uAv, c47988uAv.zLjUOn() ? C33129mqd.mulS$default(java.lang.Float.valueOf(f), ueg.fJNWhG().valueOf().getValue(), null, null, null, 14, null) : "", false, false, 6, null);
        ueg.EZpvd(c48468uSn);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(uEG ueg, C47988uAv c47988uAv, C47988uAv c47988uAv2, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv2, "");
        Intrinsics.copydefault(c47988uAv);
        ueg.AEQbTJ(c47988uAv, true);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(uEG ueg, C47988uAv c47988uAv, C47988uAv c47988uAv2, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv2, "");
        Intrinsics.copydefault(c47988uAv);
        ueg.AEQbTJ(c47988uAv, true);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(uEG ueg, C47988uAv c47988uAv, C47988uAv c47988uAv2, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv2, "");
        Intrinsics.copydefault(c47988uAv);
        ueg.AEQbTJ(c47988uAv, false);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(uEG ueg, C47988uAv c47988uAv, C47988uAv c47988uAv2, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv2, "");
        Intrinsics.copydefault(c47988uAv);
        ueg.AEQbTJ(c47988uAv, false);
        return Unit.INSTANCE;
    }

    public final void isConnected() {
        C52794wYp c52794wYp;
        C48468uSn c48468uSn = this.isConnected;
        if (c48468uSn == null || (c52794wYp = this.gEmmrt) == null) {
            return;
        }
        boolean z = false;
        if (!c48468uSn.AEQbTJ.getFieldNames() && !c48468uSn.gEmmrt.getFieldNames() && !c48468uSn.OLrzqt.getFieldNames()) {
            android.widget.TextView textView = c48468uSn.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            if (textView.getVisibility() != 0 && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c48468uSn.AEQbTJ.AkhnZx())) && C33129mqd.AEQbTJ(fJNWhG().valueOf().getValue(), 0) && ((!hDKMBd() || (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c48468uSn.gEmmrt.AkhnZx()))) && (!AuCTel() || (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c48468uSn.OLrzqt.AkhnZx()))))) {
                z = true;
            }
        }
        c52794wYp.setEnabled(z);
    }

    public final void AEQbTJ(C47988uAv c47988uAv, boolean z) {
        copydefault(c47988uAv, AkhnZx().EZpvd(c47988uAv.AkhnZx(), c47988uAv.values(), z));
        isConnected();
    }

    public final void EZpvd(C48468uSn c48468uSn) {
        java.lang.String strAkhnZx = c48468uSn.AEQbTJ.AkhnZx();
        java.lang.String strOLrzqt = AkhnZx().OLrzqt(strAkhnZx, c48468uSn.AEQbTJ.fARcdN(), c48468uSn.AEQbTJ.AuCTel());
        C47988uAv c47988uAv = c48468uSn.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        copydefault(c47988uAv, strOLrzqt);
        java.lang.String value = fJNWhG().valueOf().getValue();
        android.widget.TextView textView = c48468uSn.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility((xHL.copydefault(value) && C33129mqd.AEQbTJ(strAkhnZx, value)) ? 0 : 8);
        isConnected();
    }

    public final void copydefault(C47988uAv c47988uAv, java.lang.String str) {
        if (str.length() == 0) {
            c47988uAv.copydefault();
        } else {
            c47988uAv.setInputErrorMsg(str);
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            this.gEmmrt = c52794wYpCopydefault;
            c52794wYpCopydefault.setEnabled(false);
            c52794wYpCopydefault.setOnClickListener(new TaskDescription(c52794wYpCopydefault, 1000L, this));
        }
    }

    public final void AEQbTJ(final AiOrderReq aiOrderReq) {
        final androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        BotOrderConfirmFragment.TaskDescription taskDescription = BotOrderConfirmFragment.Companion;
        java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(aiOrderReq.getInstIds());
        if (str == null) {
            str = "";
        }
        taskDescription.copydefault(str, aiOrderReq.getInstType(), new StrategyReqGroup(new StrategyBaseReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, "ai_bot", (TradeType) null, (java.lang.String) null, (java.lang.Boolean) null, 1919, (DefaultConstructorMarker) null), (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, (AutoVipProfitInfo) null, (DcaOrderReq) null, aiOrderReq, 16382, (DefaultConstructorMarker) null), (248 & 8) != 0 ? false : false, (248 & 16) != 0 ? null : null, (248 & 32) != 0 ? "" : fetchVPNInfo(), (248 & 64) != 0 ? null : null, (248 & 128) != 0 ? null : new Function1() { // from class: o.uEM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return uEG.KWHzl(parentFragmentManager, aiOrderReq, (java.lang.String) obj);
            }
        }).show(parentFragmentManager);
    }

    public static final Unit KWHzl(androidx.fragment.app.FragmentManager fragmentManager, AiOrderReq aiOrderReq, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C48098uEx.Companion.AEQbTJ(fragmentManager, aiOrderReq.getInstIds(), aiOrderReq.getInstType());
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        iwGUEr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iwGUEr() {
        fJNWhG().KWHzl(DbNXlk().getInstType(), AkhnZx().AEQbTJ().getValue().KWHzl());
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        fJNWhG().AYXKKw();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.isConnected = null;
        this.gEmmrt = null;
    }
}

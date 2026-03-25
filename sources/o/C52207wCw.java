package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.flexbox.FlexboxLayout;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.tradingbot.impl.order.strategy.grid.domain.SmartEarnParamsCheckUseCase;
import com.okinc.tradingbot.impl.strategy.fragment.detail.DetailParameterFragment$initPresenter$2;
import com.okinc.tradingbot.impl.strategy.fragment.detail.DetailParameterFragment$initPresenter$3;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorButtonDisposer;
import com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorViewModel;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.SignParamItem;
import com.okinc.unify_trade.biz.StgySourceInfo;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.EarnType;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.GridStopTriggerType;
import com.okinc.unify_trade.bot.constant.TacticsForbiddenFunctions;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TacticsListLabelData;
import java.math.RoundingMode;
import java.util.Date;
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
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC52662wTs;
import o.InterfaceC54581xNr;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wCw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C52207wCw extends AbstractC52224wDm implements InterfaceC52662wTs {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.wCy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52207wCw.valueOf(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm AhwBna;
    public AbstractC48457uSc EZpvd;
    public TacticsData OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public boolean djBIcL;
    public final int gEmmrt;

    /* JADX INFO: renamed from: o.wCw$ComponentName */
    public static final /* synthetic */ class ComponentName implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentName(Function1 function1) {
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

    @Override // o.InterfaceC52662wTs
    public void DbNXlk() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC52662wTs
    public void EZpvd(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    @Override // o.InterfaceC52662wTs
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        InterfaceC52662wTs.TaskDescription.EZpvd(this, str, str2);
    }

    @Override // o.InterfaceC52662wTs
    public void bz_() {
        InterfaceC52662wTs.TaskDescription.KWHzl(this);
    }

    @Override // o.InterfaceC52662wTs
    public void gEmmrt() {
        InterfaceC52662wTs.TaskDescription.copydefault(this);
    }

    public C52207wCw() {
        final Function0 function0 = null;
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.DetailParameterFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.DetailParameterFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.DetailParameterFragment$special$$inlined$activityViewModels$default$3
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.DetailParameterFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.DetailParameterFragment$special$$inlined$viewModels$default$2
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(wCH.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.DetailParameterFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.DetailParameterFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.DetailParameterFragment$special$$inlined$viewModels$default$5
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
        this.djBIcL = true;
        this.gEmmrt = C48033uCm.Activity.DPhTBN;
        this.OLrzqt = new TacticsData(null, null, null, null, null, null, false, null, null, 0, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, 3, null);
    }

    /* JADX INFO: renamed from: o.wCw$ActionBar */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wCw.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C52207wCw copydefault() {
            return new C52207wCw();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BotOperatorButtonDisposer valueOf() {
        return (BotOperatorButtonDisposer) this.AEQbTJ.getValue();
    }

    public static final BotOperatorButtonDisposer valueOf(C52207wCw c52207wCw) {
        return new BotOperatorButtonDisposer(c52207wCw, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TacticsDetailPresenter djBIcL() {
        return (TacticsDetailPresenter) this.copydefault.getValue();
    }

    /* JADX DEBUG: Possible override for method o.wDm.AEQbTJ()V */
    public final wCH AEQbTJ() {
        return (wCH) this.AhwBna.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.EZpvd = AbstractC48457uSc.EZpvd(view);
        fetchVPNInfo();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        java.lang.String sourceAlgoId;
        super.onResume();
        if (!Intrinsics.EZpvd((java.lang.Object) djBIcL().AhwBna().getCopyType(), (java.lang.Object) "2") || (sourceAlgoId = djBIcL().AhwBna().getSourceAlgoId()) == null) {
            return;
        }
        djBIcL().EZpvd(sourceAlgoId);
    }

    private final void fetchVPNInfo() {
        C56111xwe<java.util.List<StgySourceInfo>> c56111xweIwGUEr = djBIcL().iwGUEr();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweIwGUEr.observe(viewLifecycleOwner, new ComponentName(new Function1() { // from class: o.wCx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52207wCw.OLrzqt(this.OLrzqt, (java.util.List) obj);
            }
        }));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        wUL.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new DetailParameterFragment$initPresenter$2(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        wUL.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new DetailParameterFragment$initPresenter$3(this, null), 3, null);
        AbstractC48457uSc abstractC48457uSc = this.EZpvd;
        if (abstractC48457uSc != null) {
            C48186uId.EZpvd(this, abstractC48457uSc, djBIcL(), valueOf(), new Function0() { // from class: o.wCu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C52207wCw.djBIcL(this.AEQbTJ);
                }
            });
        }
    }

    public static final Unit OLrzqt(C52207wCw c52207wCw, java.util.List list) {
        java.lang.String username;
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC48457uSc abstractC48457uSc = c52207wCw.EZpvd;
        if (abstractC48457uSc != null) {
            ConstraintLayout constraintLayout = abstractC48457uSc.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            if (constraintLayout.getVisibility() == 0) {
                AppCompatTextView appCompatTextView = abstractC48457uSc.QUSxYX;
                StgySourceInfo stgySourceInfo = (StgySourceInfo) CollectionsKt___CollectionsKt.AkhnZx(list, 0);
                if (stgySourceInfo == null || (username = stgySourceInfo.getUsername()) == null) {
                    username = "";
                }
                appCompatTextView.setText(username);
                StgySourceInfo stgySourceInfo2 = (StgySourceInfo) CollectionsKt___CollectionsKt.AkhnZx(list, 0);
                if (stgySourceInfo2 != null) {
                    android.widget.ImageView imageView = abstractC48457uSc.QbewEr;
                    Intrinsics.checkNotNullExpressionValue(imageView, "");
                    C33054mpH.loadAvatar$default(imageView, stgySourceInfo2.getAvatar(), stgySourceInfo2.getUsername(), null, 4, null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final TacticsData djBIcL(C52207wCw c52207wCw) {
        return c52207wCw.OLrzqt;
    }

    public final void KWHzl(C55804xqp<StrategyDetailsResponse> c55804xqp) {
        android.view.View root;
        TacticsData tacticsData = (TacticsData) CollectionsKt___CollectionsKt.AkhnZx(new C55936xtO().EZpvd(new C55804xqp<>(c55804xqp.OLrzqt(), C56402yEa.EZpvd(c55804xqp.copydefault()), null, null, 12, null)), 0);
        if (tacticsData != null) {
            this.OLrzqt = tacticsData;
        }
        AbstractC48457uSc abstractC48457uSc = this.EZpvd;
        if (abstractC48457uSc != null && (root = abstractC48457uSc.getRoot()) != null) {
            root.setVisibility(0);
        }
        if (Intrinsics.EZpvd((java.lang.Object) this.OLrzqt.getOrderType(), (java.lang.Object) "spot_dca") || Intrinsics.EZpvd((java.lang.Object) this.OLrzqt.getOrderType(), (java.lang.Object) "contract_dca")) {
            return;
        }
        if (djBIcL().AubY() || djBIcL().AwvSrB() || Intrinsics.EZpvd((java.lang.Object) "stopped", (java.lang.Object) c55804xqp.copydefault().getState())) {
            OLrzqt(c55804xqp.copydefault());
        } else {
            KWHzl(c55804xqp.copydefault());
        }
    }

    /* JADX INFO: renamed from: o.wCw$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ StrategyDetailsResponse AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C52207wCw OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C52207wCw c52207wCw, StrategyDetailsResponse strategyDetailsResponse) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = c52207wCw;
            this.AEQbTJ = strategyDetailsResponse;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
                if (oka != null) {
                    android.content.Context contextRequireContext = this.OLrzqt.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    oKA.TaskDescription.gotoNewKlinePage$default(oka, contextRequireContext, new MarketCoinInfo(this.AEQbTJ.getInstId(), this.AEQbTJ.getInstType(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null), null, null, null, null, null, null, null, null, null, 2044, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wCw$AssistContent */
    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ C52207wCw AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(android.view.View view, long j, C52207wCw c52207wCw) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c52207wCw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                BotOperatorButtonDisposer.dispose$default(this.AEQbTJ.valueOf(), "strategy_modify_start_condition", this.AEQbTJ.OLrzqt, LoaderManager.OLrzqt, null, null, null, 56, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.wCw$ClipData */
    public static final class ClipData implements View.OnClickListener {
        public final /* synthetic */ C52207wCw AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ClipData(android.view.View view, long j, C52207wCw c52207wCw) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = c52207wCw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                BotOperatorButtonDisposer.dispose$default(this.AEQbTJ.valueOf(), "strategy_button_recreate", this.AEQbTJ.OLrzqt, PictureInPictureParams.copydefault, null, null, null, 56, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.wCw$ComponentCallbacks */
    public static final class ComponentCallbacks implements View.OnClickListener {
        public final /* synthetic */ boolean AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ StrategyDetailsResponse OLrzqt;
        public final /* synthetic */ AppCompatTextView copydefault;
        public final /* synthetic */ C52207wCw djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks(android.view.View view, long j, StrategyDetailsResponse strategyDetailsResponse, AppCompatTextView appCompatTextView, boolean z, C52207wCw c52207wCw) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = strategyDetailsResponse;
            this.copydefault = appCompatTextView;
            this.AEQbTJ = z;
            this.djBIcL = c52207wCw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (yDY.copydefault("grid").contains(this.OLrzqt.getOrderType()) && yDY.copydefault("pause").contains(this.OLrzqt.getState())) {
                    android.content.Context context = this.copydefault.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                    viewOnClickListenerC54939xaY.AEQbTJ(C48033uCm.Fragment.OAUGar, C55688xof.Application.getBitmap);
                    viewOnClickListenerC54939xaY.EZpvd(C48033uCm.Fragment.QBiWsm, new Fragment(viewOnClickListenerC54939xaY));
                    viewOnClickListenerC54939xaY.show();
                    return;
                }
                if (this.AEQbTJ) {
                    android.content.Context context2 = this.copydefault.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = new ViewOnClickListenerC54939xaY(context2);
                    viewOnClickListenerC54939xaY2.AEQbTJ(C48033uCm.Fragment.OAUGar, C55688xof.Application.HrFqwD);
                    viewOnClickListenerC54939xaY2.EZpvd(C48033uCm.Fragment.QBiWsm, new FragmentManager(viewOnClickListenerC54939xaY2));
                    viewOnClickListenerC54939xaY2.show();
                    return;
                }
                BotOperatorButtonDisposer.dispose$default(this.djBIcL.valueOf(), "strategy_edit_price_range", this.djBIcL.OLrzqt, PendingIntent.OLrzqt, null, null, null, 56, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.wCw$ComponentCallbacks2 */
    public static final class ComponentCallbacks2 implements View.OnClickListener {
        public final /* synthetic */ C52207wCw AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks2(android.view.View view, long j, C52207wCw c52207wCw) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = c52207wCw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                BotOperatorButtonDisposer.dispose$default(this.AEQbTJ.valueOf(), "strategy_button_stop", this.AEQbTJ.OLrzqt, TaskStackBuilder.EZpvd, null, null, null, 56, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.wCw$Context */
    public static final class Context implements View.OnClickListener {
        public final /* synthetic */ C52207wCw AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Context(android.view.View view, long j, C52207wCw c52207wCw) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = c52207wCw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                BotOperatorButtonDisposer.dispose$default(this.AEQbTJ.valueOf(), "strategy_button_tpsl", this.AEQbTJ.OLrzqt, ContentResolver.copydefault, null, null, null, 56, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.wCw$DialogInterface */
    public static final class DialogInterface implements View.OnClickListener {
        public final /* synthetic */ C52207wCw AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ java.lang.Integer copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DialogInterface(android.view.View view, long j, java.lang.Integer num, C52207wCw c52207wCw) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = num;
            this.AEQbTJ = c52207wCw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            android.view.View root;
            C55284xgz c55284xgzAEQbTJ;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (this.copydefault != null) {
                    AbstractC48457uSc abstractC48457uSc = this.AEQbTJ.EZpvd;
                    if (abstractC48457uSc == null || (root = abstractC48457uSc.getRoot()) == null || (c55284xgzAEQbTJ = C55284xgz.Companion.AEQbTJ(this.AEQbTJ.requireContext(), root, C33070mpX.AYXKKw(this.copydefault.intValue()))) == null) {
                        return;
                    }
                    c55284xgzAEQbTJ.isConnected(0);
                    c55284xgzAEQbTJ.hDKMBd();
                    return;
                }
                BotOperatorViewModel botOperatorViewModelCopydefault = this.AEQbTJ.valueOf().copydefault();
                if (botOperatorViewModelCopydefault != null) {
                    botOperatorViewModelCopydefault.AEQbTJ(this.AEQbTJ.OLrzqt, this.AEQbTJ.new BroadcastReceiver());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wCw$SharedElementCallback */
    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C52207wCw EZpvd;
        public final /* synthetic */ StrategyDetailsResponse KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(android.view.View view, long j, C52207wCw c52207wCw, StrategyDetailsResponse strategyDetailsResponse) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = c52207wCw;
            this.KWHzl = strategyDetailsResponse;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
                if (oka != null) {
                    android.content.Context contextRequireContext = this.EZpvd.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    oKA.TaskDescription.gotoNewKlinePage$default(oka, contextRequireContext, new MarketCoinInfo(this.KWHzl.getInstId(), this.KWHzl.getInstType(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null), null, null, null, null, null, null, null, null, null, 2044, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wCw$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C52207wCw EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C52207wCw c52207wCw) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c52207wCw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                BotOperatorButtonDisposer.dispose$default(this.EZpvd.valueOf(), "strategy_button_recreate", this.EZpvd.OLrzqt, TaskDescription.EZpvd, null, null, null, 56, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.wCw$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C52207wCw OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, C52207wCw c52207wCw) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = c52207wCw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                BotOperatorButtonDisposer.dispose$default(this.OLrzqt.valueOf(), "strategy_modify_stop_condition", this.OLrzqt.OLrzqt, Dialog.copydefault, null, null, null, 56, null);
            }
        }
    }

    public final java.util.List<Activity> copydefault(StrategyDetailsResponse strategyDetailsResponse) {
        java.lang.String str;
        java.lang.String strEZpvd = C56033xvF.EZpvd(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getCtVal());
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        java.lang.String strAYXKKw = "--";
        if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getCopyType(), (java.lang.Object) "2")) {
            listOLrzqt.add(new Activity(C33070mpX.AYXKKw(C55688xof.Application.onSkipToQueueItem), C56033xvF.getBotPnl$default(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), C33129mqd.AEQbTJ(strategyDetailsResponse.getTotalPnl(), "0") ? C33129mqd.mulS$default(strategyDetailsResponse.getTotalPnl(), strategyDetailsResponse.getProfitSharingRatio(), null, null, null, 14, null) : "0", null, false, false, null, false, null, null, null, 2008, null), null, 4, null));
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityExternalSyntheticLambda2);
            xMR xmr = xMR.copydefault;
            java.lang.String profitSharingRatio = strategyDetailsResponse.getProfitSharingRatio();
            if (profitSharingRatio == null) {
                profitSharingRatio = "";
            }
            listOLrzqt.add(new Activity(strAYXKKw2, xMR.formatPercent$default(xmr, profitSharingRatio, 0, null, 4, null), null, 4, null));
            java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.getHideOffset);
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getSingleAmt())) {
                strAYXKKw = C56033xvF.getBotAmount$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getSingleAmt(), strategyDetailsResponse.getCtVal(), false, null, 48, null) + " " + strEZpvd;
            }
            listOLrzqt.add(new Activity(strAYXKKw3, strAYXKKw, null, 4, null));
            listOLrzqt.add(new Activity(C33070mpX.AYXKKw(C55688xof.Application.registerForActivityResultlambda1), C56033xvF.fmtBotPnlPercent$default(strategyDetailsResponse.getPerMinProfitRate(), false, 0, 6, null) + "-" + C56033xvF.fmtBotPnlPercent$default(strategyDetailsResponse.getPerMaxProfitRate(), false, 0, 6, null), null, 4, null));
        } else {
            java.lang.Integer num = null;
            int i = 4;
            DefaultConstructorMarker defaultConstructorMarker = null;
            listOLrzqt.add(new Activity(C33070mpX.AYXKKw(C55688xof.Application.getCallerContract), C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getMinPx(), false, false, null, null, 120, null) + "-" + C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getMaxPx(), false, false, null, null, 120, null), num, i, defaultConstructorMarker));
            listOLrzqt.add(new Activity(C33070mpX.AYXKKw(C55688xof.Application.getCallerInput), C55962xto.OLrzqt(strategyDetailsResponse.getGridNum()), num, i, defaultConstructorMarker));
            listOLrzqt.add(new Activity(C33070mpX.AYXKKw(C55688xof.Application.onKeyShortcut), C56068xvo.getProcessedPrice$default(C56068xvo.copydefault, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getRunPx(), RoundingMode.UP, false, false, 48, null), null, 4, null));
            java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.getHideOffset);
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getSingleAmt())) {
                str = "--";
            } else {
                str = C56033xvF.getBotAmount$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getSingleAmt(), strategyDetailsResponse.getCtVal(), false, null, 48, null) + " " + strEZpvd;
            }
            java.lang.Integer num2 = null;
            int i2 = 4;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            listOLrzqt.add(new Activity(strAYXKKw4, str, num2, i2, defaultConstructorMarker2));
            listOLrzqt.add(new Activity(C33070mpX.AYXKKw(C55688xof.Application.registerForActivityResultlambda1), C56033xvF.fmtBotPnlPercent$default(strategyDetailsResponse.getPerMinProfitRate(), false, 0, 6, null) + "-" + C56033xvF.fmtBotPnlPercent$default(strategyDetailsResponse.getPerMaxProfitRate(), false, 0, 6, null), num2, i2, defaultConstructorMarker2));
            java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C55688xof.Application.removeOnMenuVisibilityListener);
            java.lang.String runType = strategyDetailsResponse.getRunType();
            if (Intrinsics.EZpvd((java.lang.Object) runType, (java.lang.Object) "1")) {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setPlaybackToRemote);
            } else if (Intrinsics.EZpvd((java.lang.Object) runType, (java.lang.Object) "2")) {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setQueue);
            }
            listOLrzqt.add(new Activity(strAYXKKw5, strAYXKKw, null, 4, null));
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x035a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(StrategyDetailsResponse strategyDetailsResponse) {
        java.lang.String botPrice$default;
        SignParamItem signParamItem;
        java.util.ArrayList<SignParamItem> signParams;
        SignParamItem signParamItem2;
        GridStopTriggerType.StateListAnimator stateListAnimator;
        java.lang.String triggerPx;
        java.lang.Object next;
        java.lang.String botPrice$default2;
        java.lang.String triggerPx2;
        java.lang.Object next2;
        AbstractC48457uSc abstractC48457uSc = this.EZpvd;
        if (abstractC48457uSc != null) {
            abstractC48457uSc.KWHzl.setText(djBIcL().fetchVPNInfo());
            C55320xhi c55320xhi = abstractC48457uSc.gEmmrt;
            java.lang.String botPrice$default3 = "--";
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strategyDetailsResponse.getLastPrice())) {
                java.lang.String instType = strategyDetailsResponse.getInstType();
                java.lang.String instId = strategyDetailsResponse.getInstId();
                java.lang.String lastPrice = strategyDetailsResponse.getLastPrice();
                botPrice$default = C56033xvF.getBotPrice$default(instType, instId, lastPrice == null ? "" : lastPrice, false, false, null, null, 120, null);
            } else {
                botPrice$default = "--";
            }
            c55320xhi.setText(botPrice$default);
            abstractC48457uSc.EZpvd.OLrzqt().setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
            FlexboxLayout flexboxLayout = abstractC48457uSc.valueOf;
            flexboxLayout.setOnClickListener(new SharedElementCallback(flexboxLayout, 1000L, this, strategyDetailsResponse));
            abstractC48457uSc.DTwDnp.removeAllViews();
            if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getOrderType(), (java.lang.Object) "contract_grid")) {
                C55372xih c55372xih = abstractC48457uSc.DTwDnp;
                Intrinsics.checkNotNullExpressionValue(c55372xih, "");
                c55372xih.setVisibility(0);
                C55372xih c55372xih2 = abstractC48457uSc.DTwDnp;
                C52534wOz c52534wOz = C52534wOz.KWHzl;
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                c55372xih2.addView(c52534wOz.copydefault(contextRequireContext, new TacticsListLabelData(C56033xvF.AhwBna(strategyDetailsResponse.getDirection()), false, C56033xvF.valueOf(strategyDetailsResponse.getDirection()), 0, 0, 26, null)));
                C55372xih c55372xih3 = abstractC48457uSc.DTwDnp;
                android.content.Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                c55372xih3.addView(c52534wOz.copydefault(contextRequireContext2, new TacticsListLabelData(C56033xvF.getBotLever$default(strategyDetailsResponse.getLever(), false, 2, null), false, C56033xvF.valueOf(strategyDetailsResponse.getDirection()), 0, 0, 26, null)));
            } else {
                C55372xih c55372xih4 = abstractC48457uSc.DTwDnp;
                Intrinsics.checkNotNullExpressionValue(c55372xih4, "");
                c55372xih4.setVisibility(8);
            }
            java.util.List<Activity> listCopydefault = copydefault(strategyDetailsResponse);
            int childCount = abstractC48457uSc.DbNXlk.getChildCount();
            int i = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = abstractC48457uSc.DbNXlk.getChildAt(i2);
                Intrinsics.checkNotNullExpressionValue(childAt, "");
                OLrzqt(childAt, (Activity) CollectionsKt___CollectionsKt.AkhnZx(listCopydefault, i), i);
                i++;
            }
            int childCount2 = abstractC48457uSc.AkhnZx.getChildCount();
            for (int i3 = 0; i3 < childCount2; i3++) {
                android.view.View childAt2 = abstractC48457uSc.AkhnZx.getChildAt(i3);
                Intrinsics.checkNotNullExpressionValue(childAt2, "");
                OLrzqt(childAt2, (Activity) CollectionsKt___CollectionsKt.AkhnZx(listCopydefault, i), i);
                i++;
            }
            if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getCopyType(), (java.lang.Object) "2")) {
                LinearLayoutCompat linearLayoutCompat = abstractC48457uSc.AxsJAY;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
                linearLayoutCompat.setVisibility(8);
                LinearLayoutCompat linearLayoutCompat2 = abstractC48457uSc.isConnected;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
                linearLayoutCompat2.setVisibility(8);
                LinearLayoutCompat linearLayoutCompat3 = abstractC48457uSc.QVAiDq;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "");
                linearLayoutCompat3.setVisibility(8);
                AppCompatTextView appCompatTextView = abstractC48457uSc.AhwBna;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                appCompatTextView.setVisibility(8);
                C52705wVh c52705wVh = abstractC48457uSc.djBIcL;
                Intrinsics.checkNotNullExpressionValue(c52705wVh, "");
                c52705wVh.setVisibility(8);
                C52705wVh c52705wVh2 = abstractC48457uSc.sSMYrx;
                Intrinsics.checkNotNullExpressionValue(c52705wVh2, "");
                c52705wVh2.setVisibility(0);
                ConstraintLayout constraintLayout = abstractC48457uSc.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(0);
            } else {
                LinearLayoutCompat linearLayoutCompat4 = abstractC48457uSc.AxsJAY;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat4, "");
                linearLayoutCompat4.setVisibility(0);
                EZpvd(strategyDetailsResponse);
                LinearLayoutCompat linearLayoutCompat5 = abstractC48457uSc.QVAiDq;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat5, "");
                linearLayoutCompat5.setVisibility(0);
                AppCompatTextView appCompatTextView2 = abstractC48457uSc.AhwBna;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
                appCompatTextView2.setVisibility(0);
                if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getState(), (java.lang.Object) "no_close_position")) {
                    AppCompatTextView appCompatTextView3 = abstractC48457uSc.AhwBna;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
                    appCompatTextView3.setVisibility(8);
                    C52705wVh c52705wVh3 = abstractC48457uSc.sSMYrx;
                    Intrinsics.checkNotNullExpressionValue(c52705wVh3, "");
                    c52705wVh3.setVisibility(8);
                    android.view.View view = abstractC48457uSc.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(view, "");
                    view.setVisibility(8);
                } else {
                    boolean z = (yDY.copydefault("grid").contains(strategyDetailsResponse.getOrderType()) && yDY.copydefault("pending_signal").contains(strategyDetailsResponse.getState())) ? false : true;
                    AppCompatTextView appCompatTextView4 = abstractC48457uSc.AhwBna;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
                    appCompatTextView4.setVisibility(z ? 0 : 8);
                    android.view.View view2 = abstractC48457uSc.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    view2.setVisibility(z ? 0 : 8);
                    C52705wVh c52705wVh4 = abstractC48457uSc.sSMYrx;
                    Intrinsics.checkNotNullExpressionValue(c52705wVh4, "");
                    c52705wVh4.setVisibility(0);
                }
                ConstraintLayout constraintLayout2 = abstractC48457uSc.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                constraintLayout2.setVisibility(8);
                C52705wVh c52705wVh5 = abstractC48457uSc.djBIcL;
                Intrinsics.checkNotNullExpressionValue(c52705wVh5, "");
                c52705wVh5.setVisibility(0);
                java.util.ArrayList<SignParamItem> signParams2 = strategyDetailsResponse.getSignParams();
                if (signParams2 != null) {
                    java.util.Iterator<T> it = signParams2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next2 = it.next();
                            if (Intrinsics.EZpvd((java.lang.Object) ((SignParamItem) next2).getTriggerAction(), (java.lang.Object) TtmlNode.START)) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    signParamItem = (SignParamItem) next2;
                } else {
                    signParamItem = null;
                }
                AppCompatTextView appCompatTextView5 = abstractC48457uSc.wlaJM;
                GridStartTriggerType.Application application = GridStartTriggerType.Companion;
                appCompatTextView5.setText(application.copydefault(signParamItem != null ? signParamItem.getIndicator() : null));
                if (application.KWHzl(strategyDetailsResponse.getSignParams(), null)) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) (signParamItem != null ? signParamItem.getTriggerPx() : null))) {
                        botPrice$default2 = C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), (signParamItem == null || (triggerPx2 = signParamItem.getTriggerPx()) == null) ? "" : triggerPx2, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
                    } else {
                        botPrice$default2 = "--";
                    }
                    abstractC48457uSc.wlaJM.setText(C33070mpX.AYXKKw(GridStartTriggerType.PRICE.getDesc()) + " | " + botPrice$default2);
                }
                if (!Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getState(), (java.lang.Object) "pending_signal")) {
                    abstractC48457uSc.wlaJM.setOnClickListener(null);
                    TextViewCompat.setCompoundDrawableTintList(abstractC48457uSc.wlaJM, android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe)));
                    AppCompatTextView appCompatTextView6 = abstractC48457uSc.wlaJM;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView6, "");
                    EZpvd(appCompatTextView6, true);
                    abstractC48457uSc.wlaJM.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
                    signParams = strategyDetailsResponse.getSignParams();
                    if (signParams == null) {
                        java.util.Iterator<T> it2 = signParams.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.EZpvd((java.lang.Object) ((SignParamItem) next).getTriggerAction(), (java.lang.Object) "stop")) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        signParamItem2 = (SignParamItem) next;
                    } else {
                        signParamItem2 = null;
                    }
                    AppCompatTextView appCompatTextView7 = abstractC48457uSc.zuBGHE;
                    stateListAnimator = GridStopTriggerType.Companion;
                    appCompatTextView7.setText(stateListAnimator.EZpvd(signParamItem2 == null ? signParamItem2.getIndicator() : null));
                    if (stateListAnimator.AEQbTJ(strategyDetailsResponse.getSignParams(), null)) {
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) (signParamItem2 != null ? signParamItem2.getTriggerPx() : null))) {
                            botPrice$default3 = C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), (signParamItem2 == null || (triggerPx = signParamItem2.getTriggerPx()) == null) ? "" : triggerPx, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
                        }
                        abstractC48457uSc.zuBGHE.setText(C33070mpX.AYXKKw(GridStopTriggerType.PRICE.getDesc()) + " | " + botPrice$default3);
                    }
                    if (!AEQbTJ(strategyDetailsResponse)) {
                        AppCompatTextView appCompatTextView8 = abstractC48457uSc.zuBGHE;
                        appCompatTextView8.setOnClickListener(new VoiceInteractor(appCompatTextView8, 1000L, this));
                        abstractC48457uSc.zuBGHE.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                        TextViewCompat.setCompoundDrawableTintList(abstractC48457uSc.zuBGHE, android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
                        AppCompatTextView appCompatTextView9 = abstractC48457uSc.zuBGHE;
                        Intrinsics.checkNotNullExpressionValue(appCompatTextView9, "");
                        EZpvd(appCompatTextView9, true);
                    } else {
                        TextViewCompat.setCompoundDrawableTintList(abstractC48457uSc.zuBGHE, android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe)));
                        AppCompatTextView appCompatTextView10 = abstractC48457uSc.zuBGHE;
                        Intrinsics.checkNotNullExpressionValue(appCompatTextView10, "");
                        EZpvd(appCompatTextView10, true);
                        abstractC48457uSc.zuBGHE.setOnClickListener(null);
                        abstractC48457uSc.zuBGHE.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
                    }
                    abstractC48457uSc.fetchVPNInfo.setText(C33070mpX.AYXKKw(!strategyDetailsResponse.getBasePos() ? C55688xof.Application.registerCallback : C55688xof.Application.isSessionReady));
                    copydefault(strategyDetailsResponse, false);
                    java.util.ArrayList<java.lang.String> forbidden = strategyDetailsResponse.getForbidden();
                    boolean z2 = forbidden == null && forbidden.contains(TacticsForbiddenFunctions.EditParameters.getCode());
                    int iCopydefault = C33070mpX.copydefault(!z2 ? C52761wXj.Activity.UlJrfe : C52761wXj.Activity.fdOvFl);
                    AppCompatTextView appCompatTextView11 = abstractC48457uSc.AhwBna;
                    appCompatTextView11.setTextColor(iCopydefault);
                    TextViewCompat.setCompoundDrawableTintList(appCompatTextView11, android.content.res.ColorStateList.valueOf(iCopydefault));
                    appCompatTextView11.setOnClickListener(new ComponentCallbacks(appCompatTextView11, 1000L, strategyDetailsResponse, appCompatTextView11, z2, this));
                    AhwBna(strategyDetailsResponse);
                    valueOf(strategyDetailsResponse);
                    gEmmrt(strategyDetailsResponse);
                } else {
                    if (Intrinsics.EZpvd((java.lang.Object) (signParamItem != null ? signParamItem.getIndicator() : null), (java.lang.Object) GridStartTriggerType.PRICE.getMode())) {
                        AppCompatTextView appCompatTextView12 = abstractC48457uSc.wlaJM;
                        appCompatTextView12.setOnClickListener(new AssistContent(appCompatTextView12, 1000L, this));
                        abstractC48457uSc.wlaJM.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                        TextViewCompat.setCompoundDrawableTintList(abstractC48457uSc.wlaJM, android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
                        AppCompatTextView appCompatTextView13 = abstractC48457uSc.wlaJM;
                        Intrinsics.checkNotNullExpressionValue(appCompatTextView13, "");
                        EZpvd(appCompatTextView13, true);
                    }
                    signParams = strategyDetailsResponse.getSignParams();
                    if (signParams == null) {
                    }
                    AppCompatTextView appCompatTextView72 = abstractC48457uSc.zuBGHE;
                    stateListAnimator = GridStopTriggerType.Companion;
                    appCompatTextView72.setText(stateListAnimator.EZpvd(signParamItem2 == null ? signParamItem2.getIndicator() : null));
                    if (stateListAnimator.AEQbTJ(strategyDetailsResponse.getSignParams(), null)) {
                    }
                    if (!AEQbTJ(strategyDetailsResponse)) {
                    }
                    abstractC48457uSc.fetchVPNInfo.setText(C33070mpX.AYXKKw(!strategyDetailsResponse.getBasePos() ? C55688xof.Application.registerCallback : C55688xof.Application.isSessionReady));
                    copydefault(strategyDetailsResponse, false);
                    java.util.ArrayList<java.lang.String> forbidden2 = strategyDetailsResponse.getForbidden();
                    if (forbidden2 == null) {
                        int iCopydefault2 = C33070mpX.copydefault(!z2 ? C52761wXj.Activity.UlJrfe : C52761wXj.Activity.fdOvFl);
                        AppCompatTextView appCompatTextView112 = abstractC48457uSc.AhwBna;
                        appCompatTextView112.setTextColor(iCopydefault2);
                        TextViewCompat.setCompoundDrawableTintList(appCompatTextView112, android.content.res.ColorStateList.valueOf(iCopydefault2));
                        appCompatTextView112.setOnClickListener(new ComponentCallbacks(appCompatTextView112, 1000L, strategyDetailsResponse, appCompatTextView112, z2, this));
                        AhwBna(strategyDetailsResponse);
                        valueOf(strategyDetailsResponse);
                        gEmmrt(strategyDetailsResponse);
                    }
                }
            }
            C52705wVh c52705wVh6 = abstractC48457uSc.djBIcL;
            c52705wVh6.setOnClickListener(new ClipData(c52705wVh6, 1000L, this));
            C52705wVh c52705wVh7 = abstractC48457uSc.sSMYrx;
            c52705wVh7.setOnClickListener(new ComponentCallbacks2(c52705wVh7, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.wCw$LoaderManager */
    public static final class LoaderManager implements Function0<Unit> {
        public static final LoaderManager OLrzqt = new LoaderManager();

        public final void OLrzqt() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.wCw$Dialog */
    public static final class Dialog implements Function0<Unit> {
        public static final Dialog copydefault = new Dialog();

        public final void KWHzl() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            KWHzl();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.wCw$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.EZpvd.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.wCw$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.OLrzqt = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.OLrzqt.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.wCw$PendingIntent */
    public static final class PendingIntent implements Function0<Unit> {
        public static final PendingIntent OLrzqt = new PendingIntent();

        public final void OLrzqt() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.wCw$PictureInPictureParams */
    public static final class PictureInPictureParams implements Function0<Unit> {
        public static final PictureInPictureParams copydefault = new PictureInPictureParams();

        public final void OLrzqt() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.wCw$TaskStackBuilder */
    public static final class TaskStackBuilder implements Function0<Unit> {
        public static final TaskStackBuilder EZpvd = new TaskStackBuilder();

        public final void EZpvd() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }
    }

    public final void OLrzqt(StrategyDetailsResponse strategyDetailsResponse) {
        SignParamItem signParamItem;
        SignParamItem signParamItem2;
        java.lang.String triggerPx;
        java.lang.Object next;
        java.lang.String botPrice$default;
        java.lang.String triggerPx2;
        java.lang.Object next2;
        AbstractC48457uSc abstractC48457uSc = this.EZpvd;
        if (abstractC48457uSc != null) {
            abstractC48457uSc.KWHzl.setText(djBIcL().fetchVPNInfo());
            FlexboxLayout flexboxLayout = abstractC48457uSc.valueOf;
            Intrinsics.checkNotNullExpressionValue(flexboxLayout, "");
            flexboxLayout.setVisibility(8);
            FlexboxLayout flexboxLayout2 = abstractC48457uSc.valueOf;
            flexboxLayout2.setOnClickListener(new Application(flexboxLayout2, 1000L, this, strategyDetailsResponse));
            abstractC48457uSc.DTwDnp.removeAllViews();
            if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getOrderType(), (java.lang.Object) "contract_grid")) {
                C55372xih c55372xih = abstractC48457uSc.DTwDnp;
                Intrinsics.checkNotNullExpressionValue(c55372xih, "");
                c55372xih.setVisibility(0);
                C55372xih c55372xih2 = abstractC48457uSc.DTwDnp;
                C52534wOz c52534wOz = C52534wOz.KWHzl;
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                c55372xih2.addView(c52534wOz.copydefault(contextRequireContext, new TacticsListLabelData(C56033xvF.AhwBna(strategyDetailsResponse.getDirection()), false, C56033xvF.valueOf(strategyDetailsResponse.getDirection()), 0, 0, 26, null)));
                C55372xih c55372xih3 = abstractC48457uSc.DTwDnp;
                android.content.Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                c55372xih3.addView(c52534wOz.copydefault(contextRequireContext2, new TacticsListLabelData(C56033xvF.getBotLever$default(strategyDetailsResponse.getLever(), false, 2, null), false, C56033xvF.valueOf(strategyDetailsResponse.getDirection()), 0, 0, 26, null)));
            } else {
                C55372xih c55372xih4 = abstractC48457uSc.DTwDnp;
                Intrinsics.checkNotNullExpressionValue(c55372xih4, "");
                c55372xih4.setVisibility(8);
            }
            java.util.List<Activity> listCopydefault = copydefault(strategyDetailsResponse);
            int childCount = abstractC48457uSc.DbNXlk.getChildCount();
            int i = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = abstractC48457uSc.DbNXlk.getChildAt(i2);
                Intrinsics.checkNotNullExpressionValue(childAt, "");
                OLrzqt(childAt, (Activity) CollectionsKt___CollectionsKt.AkhnZx(listCopydefault, i), i);
                i++;
            }
            int childCount2 = abstractC48457uSc.AkhnZx.getChildCount();
            for (int i3 = 0; i3 < childCount2; i3++) {
                android.view.View childAt2 = abstractC48457uSc.AkhnZx.getChildAt(i3);
                Intrinsics.checkNotNullExpressionValue(childAt2, "");
                OLrzqt(childAt2, (Activity) CollectionsKt___CollectionsKt.AkhnZx(listCopydefault, i), i);
                i++;
            }
            if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getCopyType(), (java.lang.Object) "2")) {
                LinearLayoutCompat linearLayoutCompat = abstractC48457uSc.AxsJAY;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
                linearLayoutCompat.setVisibility(8);
                LinearLayoutCompat linearLayoutCompat2 = abstractC48457uSc.isConnected;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
                linearLayoutCompat2.setVisibility(8);
                LinearLayoutCompat linearLayoutCompat3 = abstractC48457uSc.QVAiDq;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "");
                linearLayoutCompat3.setVisibility(8);
                AppCompatTextView appCompatTextView = abstractC48457uSc.AhwBna;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                appCompatTextView.setVisibility(8);
                C52705wVh c52705wVh = abstractC48457uSc.djBIcL;
                Intrinsics.checkNotNullExpressionValue(c52705wVh, "");
                c52705wVh.setVisibility(8);
                C52705wVh c52705wVh2 = abstractC48457uSc.sSMYrx;
                Intrinsics.checkNotNullExpressionValue(c52705wVh2, "");
                c52705wVh2.setVisibility(8);
                ConstraintLayout constraintLayout = abstractC48457uSc.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(0);
                android.view.View view = abstractC48457uSc.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(view, "");
                view.setVisibility(0);
                return;
            }
            LinearLayoutCompat linearLayoutCompat4 = abstractC48457uSc.AxsJAY;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat4, "");
            linearLayoutCompat4.setVisibility(0);
            EZpvd(strategyDetailsResponse);
            LinearLayoutCompat linearLayoutCompat5 = abstractC48457uSc.QVAiDq;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat5, "");
            linearLayoutCompat5.setVisibility(0);
            C52705wVh c52705wVh3 = abstractC48457uSc.djBIcL;
            Intrinsics.checkNotNullExpressionValue(c52705wVh3, "");
            c52705wVh3.setVisibility(0);
            AppCompatTextView appCompatTextView2 = abstractC48457uSc.AhwBna;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            appCompatTextView2.setVisibility(8);
            android.view.View view2 = abstractC48457uSc.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            view2.setVisibility(8);
            ConstraintLayout constraintLayout2 = abstractC48457uSc.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(8);
            C52705wVh c52705wVh4 = abstractC48457uSc.sSMYrx;
            Intrinsics.checkNotNullExpressionValue(c52705wVh4, "");
            c52705wVh4.setVisibility(8);
            java.util.ArrayList<SignParamItem> signParams = strategyDetailsResponse.getSignParams();
            if (signParams != null) {
                java.util.Iterator<T> it = signParams.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next2 = it.next();
                        if (Intrinsics.EZpvd((java.lang.Object) ((SignParamItem) next2).getTriggerAction(), (java.lang.Object) TtmlNode.START)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                signParamItem = (SignParamItem) next2;
            } else {
                signParamItem = null;
            }
            AppCompatTextView appCompatTextView3 = abstractC48457uSc.wlaJM;
            GridStartTriggerType.Application application = GridStartTriggerType.Companion;
            appCompatTextView3.setText(application.copydefault(signParamItem != null ? signParamItem.getIndicator() : null));
            java.lang.String botPrice$default2 = "--";
            if (application.KWHzl(strategyDetailsResponse.getSignParams(), null)) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) (signParamItem != null ? signParamItem.getTriggerPx() : null))) {
                    botPrice$default = C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), (signParamItem == null || (triggerPx2 = signParamItem.getTriggerPx()) == null) ? "" : triggerPx2, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
                } else {
                    botPrice$default = "--";
                }
                abstractC48457uSc.wlaJM.setText(C33070mpX.AYXKKw(GridStartTriggerType.PRICE.getDesc()) + " | " + botPrice$default);
            }
            abstractC48457uSc.wlaJM.setOnClickListener(null);
            AppCompatTextView appCompatTextView4 = abstractC48457uSc.wlaJM;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
            EZpvd(appCompatTextView4, false);
            abstractC48457uSc.wlaJM.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            java.util.ArrayList<SignParamItem> signParams2 = strategyDetailsResponse.getSignParams();
            if (signParams2 != null) {
                java.util.Iterator<T> it2 = signParams2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.EZpvd((java.lang.Object) ((SignParamItem) next).getTriggerAction(), (java.lang.Object) "stop")) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                signParamItem2 = (SignParamItem) next;
            } else {
                signParamItem2 = null;
            }
            AppCompatTextView appCompatTextView5 = abstractC48457uSc.zuBGHE;
            GridStopTriggerType.StateListAnimator stateListAnimator = GridStopTriggerType.Companion;
            appCompatTextView5.setText(stateListAnimator.EZpvd(signParamItem2 != null ? signParamItem2.getIndicator() : null));
            if (stateListAnimator.AEQbTJ(strategyDetailsResponse.getSignParams(), null)) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) (signParamItem2 != null ? signParamItem2.getTriggerPx() : null))) {
                    botPrice$default2 = C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), (signParamItem2 == null || (triggerPx = signParamItem2.getTriggerPx()) == null) ? "" : triggerPx, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
                }
                abstractC48457uSc.zuBGHE.setText(C33070mpX.AYXKKw(GridStopTriggerType.PRICE.getDesc()) + " | " + botPrice$default2);
            }
            abstractC48457uSc.zuBGHE.setOnClickListener(null);
            AppCompatTextView appCompatTextView6 = abstractC48457uSc.zuBGHE;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView6, "");
            EZpvd(appCompatTextView6, false);
            abstractC48457uSc.zuBGHE.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            abstractC48457uSc.fetchVPNInfo.setText(C33070mpX.AYXKKw(strategyDetailsResponse.getBasePos() ? C55688xof.Application.registerCallback : C55688xof.Application.isSessionReady));
            copydefault(strategyDetailsResponse, true);
            C52705wVh c52705wVh5 = abstractC48457uSc.djBIcL;
            c52705wVh5.setOnClickListener(new StateListAnimator(c52705wVh5, 1000L, this));
            AhwBna(strategyDetailsResponse);
            valueOf(strategyDetailsResponse);
            gEmmrt(strategyDetailsResponse);
        }
    }

    /* JADX INFO: renamed from: o.wCw$TaskDescription */
    public static final class TaskDescription implements Function0<Unit> {
        public static final TaskDescription EZpvd = new TaskDescription();

        public final void EZpvd() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(StrategyDetailsResponse strategyDetailsResponse, boolean z) {
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt;
        java.lang.String second;
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt2;
        java.lang.String second2;
        java.lang.String strDjBIcL;
        java.util.ArrayList<java.lang.String> forbidden = strategyDetailsResponse.getForbidden();
        boolean z2 = true;
        boolean z3 = forbidden != null && forbidden.contains(TacticsForbiddenFunctions.Tpsl.getCode());
        C55912xsr c55912xsr = new C55912xsr(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getSourceCcy(), strategyDetailsResponse.getTradeQuoteCcy());
        TpSlTriggerParam tpSlTriggerParamOLrzqt = C55765xqC.OLrzqt(strategyDetailsResponse.getTpslTriggerParamResp());
        AbstractC48457uSc abstractC48457uSc = this.EZpvd;
        if (abstractC48457uSc != null) {
            LinearLayoutCompat linearLayoutCompat = abstractC48457uSc.QVAiDq;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(0);
            java.lang.String orderType = strategyDetailsResponse.getOrderType();
            if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "contract_grid")) {
                pairOLrzqt = C56037xvJ.OLrzqt(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getTpTriggerPx(), strategyDetailsResponse.getTpRatio());
            } else if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "grid")) {
                pairOLrzqt = C56390yDp.OLrzqt(C33129mqd.gEmmrt(c55912xsr.fetchVPNInfo(tpSlTriggerParamOLrzqt)), c55912xsr.values(tpSlTriggerParamOLrzqt));
            } else {
                pairOLrzqt = C56390yDp.OLrzqt("--", "--");
            }
            if (Intrinsics.EZpvd((java.lang.Object) pairOLrzqt.getSecond(), (java.lang.Object) "--")) {
                second = C33070mpX.AYXKKw(C55688xof.Application.StyleableRes);
            } else {
                second = pairOLrzqt.getSecond();
            }
            java.lang.String orderType2 = strategyDetailsResponse.getOrderType();
            if (Intrinsics.EZpvd((java.lang.Object) orderType2, (java.lang.Object) "contract_grid")) {
                pairOLrzqt2 = C56037xvJ.KWHzl(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getSlTriggerPx(), strategyDetailsResponse.getSlRatio());
            } else if (Intrinsics.EZpvd((java.lang.Object) orderType2, (java.lang.Object) "grid")) {
                pairOLrzqt2 = C56390yDp.OLrzqt(C33129mqd.gEmmrt(c55912xsr.isConnected(tpSlTriggerParamOLrzqt)), c55912xsr.valueOf(tpSlTriggerParamOLrzqt));
            } else {
                pairOLrzqt2 = C56390yDp.OLrzqt("--", "--");
            }
            if (Intrinsics.EZpvd((java.lang.Object) pairOLrzqt2.getSecond(), (java.lang.Object) "--")) {
                second2 = C33070mpX.AYXKKw(C55688xof.Application.StyleableRes);
            } else {
                second2 = pairOLrzqt2.getSecond();
            }
            abstractC48457uSc.ORxRYg.setText(pairOLrzqt.getFirst());
            abstractC48457uSc.QOLQEE.setText(second);
            AppCompatTextView appCompatTextView = abstractC48457uSc.QOLQEE;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            copydefault(appCompatTextView, z, z3);
            abstractC48457uSc.gHZMYf.setText(pairOLrzqt2.getFirst());
            abstractC48457uSc.AwvSrB.setText(second2);
            AppCompatTextView appCompatTextView2 = abstractC48457uSc.AwvSrB;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            copydefault(appCompatTextView2, z, z3);
            if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getOrderType(), (java.lang.Object) "grid")) {
                C55850xri c55850xri = new C55850xri(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getSourceCcy(), strategyDetailsResponse.getTradeQuoteCcy());
                if (!C33129mqd.OLrzqt((java.lang.CharSequence) tpSlTriggerParamOLrzqt.getTp().getValue()) && !C33129mqd.OLrzqt((java.lang.CharSequence) tpSlTriggerParamOLrzqt.getSl().getValue())) {
                    z2 = false;
                }
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.StyleableRes);
                LinearLayoutCompat linearLayoutCompat2 = abstractC48457uSc.QKVWgx;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
                linearLayoutCompat2.setVisibility(z2 ? 0 : 8);
                abstractC48457uSc.OcIXYQ.setText(c55850xri.copydefault());
                AppCompatTextView appCompatTextView3 = abstractC48457uSc.QfsBiF;
                if (tpSlTriggerParamOLrzqt.getDelaySeconds() != null) {
                    strDjBIcL = c55850xri.djBIcL(tpSlTriggerParamOLrzqt);
                    if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strDjBIcL)) {
                        strDjBIcL = strAYXKKw;
                    }
                    if (strDjBIcL == null) {
                        strDjBIcL = strAYXKKw;
                    }
                }
                appCompatTextView3.setText(strDjBIcL);
                AppCompatTextView appCompatTextView4 = abstractC48457uSc.QfsBiF;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
                copydefault(appCompatTextView4, z, z3);
                LinearLayoutCompat linearLayoutCompat3 = abstractC48457uSc.getNewProxyInstance;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "");
                linearLayoutCompat3.setVisibility(z2 ? 0 : 8);
                abstractC48457uSc.getFieldNames.setText(c55850xri.gEmmrt());
                AppCompatTextView appCompatTextView5 = abstractC48457uSc.uzCIH;
                java.lang.String strDbNXlk = c55850xri.DbNXlk(tpSlTriggerParamOLrzqt);
                if (strDbNXlk != null) {
                    strAYXKKw = strDbNXlk;
                }
                appCompatTextView5.setText(strAYXKKw);
                AppCompatTextView appCompatTextView6 = abstractC48457uSc.uzCIH;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView6, "");
                copydefault(appCompatTextView6, z, z3);
                return;
            }
            LinearLayoutCompat linearLayoutCompat4 = abstractC48457uSc.QKVWgx;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat4, "");
            linearLayoutCompat4.setVisibility(8);
            LinearLayoutCompat linearLayoutCompat5 = abstractC48457uSc.getNewProxyInstance;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat5, "");
            linearLayoutCompat5.setVisibility(8);
        }
    }

    public final boolean AEQbTJ(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        java.lang.String sourceCcy;
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        return (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getState(), (java.lang.Object) "no_close_position") || Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getState(), (java.lang.Object) "stopping") || Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getGridStatus(), (java.lang.Object) "stop_delay_trigger") || ((sourceCcy = strategyDetailsResponse.getSourceCcy()) != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) sourceCcy))) ? false : true;
    }

    public final void OLrzqt(android.view.View view, Activity activity, int i) {
        if (activity == null) {
            uNT untCopydefault = uNT.copydefault(view);
            android.widget.LinearLayout root = untCopydefault.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setVisibility(4);
            untCopydefault.AEQbTJ.setText("");
            untCopydefault.EZpvd.setText("");
            return;
        }
        uNT untCopydefault2 = uNT.copydefault(view);
        android.widget.LinearLayout root2 = untCopydefault2.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        root2.setVisibility(0);
        untCopydefault2.AEQbTJ.setText(activity.OLrzqt());
        untCopydefault2.EZpvd.setText(activity.copydefault());
        if (activity.AEQbTJ() != null) {
            untCopydefault2.EZpvd.setTextColor(activity.AEQbTJ().intValue());
        }
        if (i % 3 == 2) {
            untCopydefault2.getRoot().setGravity(8388613);
            untCopydefault2.AEQbTJ.setGravity(8388613);
            untCopydefault2.EZpvd.setGravity(8388613);
        }
    }

    public final void EZpvd(StrategyDetailsResponse strategyDetailsResponse) {
        AbstractC48457uSc abstractC48457uSc = this.EZpvd;
        if (abstractC48457uSc != null) {
            LinearLayoutCompat linearLayoutCompat = abstractC48457uSc.isConnected;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            java.lang.String orderType = strategyDetailsResponse.getOrderType();
            linearLayoutCompat.setVisibility((!Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "contract_grid") && Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "grid")) ? 8 : 0);
        }
    }

    public final void AhwBna(StrategyDetailsResponse strategyDetailsResponse) {
        GridProfitAutoReinvestResponse profitAutoReinvest;
        AbstractC48457uSc abstractC48457uSc = this.EZpvd;
        if (abstractC48457uSc != null) {
            GridProfitAutoReinvestResponse profitAutoReinvest2 = strategyDetailsResponse.getProfitAutoReinvest();
            boolean z = (profitAutoReinvest2 != null && profitAutoReinvest2.getEditable()) || ((profitAutoReinvest = strategyDetailsResponse.getProfitAutoReinvest()) != null && profitAutoReinvest.getEnabled());
            GridProfitAutoReinvestResponse profitAutoReinvest3 = strategyDetailsResponse.getProfitAutoReinvest();
            boolean z2 = profitAutoReinvest3 != null && profitAutoReinvest3.getEnabled();
            boolean z3 = (djBIcL().AubY() || djBIcL().AwvSrB() || strategyDetailsResponse.isHistory()) ? false : true;
            LinearLayoutCompat linearLayoutCompat = abstractC48457uSc.AuCTel;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(z ? 0 : 8);
            abstractC48457uSc.fJNWhG.setLabel(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDSqxTE));
            abstractC48457uSc.fJNWhG.setToggleState(z2);
            abstractC48457uSc.fJNWhG.setOnInfoClickListener(new Function0() { // from class: o.wCB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C52207wCw.DbNXlk(this.EZpvd);
                }
            });
            abstractC48457uSc.fJNWhG.setEnable(z3);
            if (z3) {
                abstractC48457uSc.fJNWhG.setOnToggleListener(new Function1() { // from class: o.wCD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C52207wCw.AEQbTJ(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
            } else {
                abstractC48457uSc.fJNWhG.setOnToggleListener(null);
            }
            LinearLayoutCompat linearLayoutCompat2 = abstractC48457uSc.fARcdN;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
            linearLayoutCompat2.setVisibility(z2 ? 0 : 8);
            if (z2) {
                AppCompatTextView appCompatTextView = abstractC48457uSc.fIwbmz;
                GridProfitAutoReinvestResponse profitAutoReinvest4 = strategyDetailsResponse.getProfitAutoReinvest();
                appCompatTextView.setText(pTA.formatTime$default(new Date(C33129mqd.valueOf(profitAutoReinvest4 != null ? profitAutoReinvest4.getStartTime() : null)), OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null));
            }
        }
    }

    public static final Unit DbNXlk(C52207wCw c52207wCw) {
        c52207wCw.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDSqxTE), C33070mpX.AYXKKw(C55688xof.Application.onQueueTitleChanged));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C52207wCw c52207wCw, boolean z) {
        c52207wCw.djBIcL().AEQbTJ(z);
        return Unit.INSTANCE;
    }

    public final void valueOf(StrategyDetailsResponse strategyDetailsResponse) {
        StrategyConfigInfo value;
        SmartEarnConfig earnConfig;
        java.lang.String strAYXKKw;
        AbstractC48457uSc abstractC48457uSc = this.EZpvd;
        if (abstractC48457uSc != null) {
            SmartEarnParam simpleEarn = strategyDetailsResponse.getSimpleEarn();
            boolean z = simpleEarn != null && simpleEarn.getEnabled();
            SmartEarnParam simpleEarn2 = strategyDetailsResponse.getSimpleEarn();
            boolean z2 = (simpleEarn2 != null && simpleEarn2.isEarnSupported()) || !((value = djBIcL().valueOf().getValue()) == null || (earnConfig = value.getEarnConfig()) == null || !earnConfig.isEarnSupported());
            boolean z3 = (djBIcL().AubY() || djBIcL().AwvSrB() || strategyDetailsResponse.isHistory()) ? false : true;
            LinearLayoutCompat linearLayoutCompat = abstractC48457uSc.zLjUOn;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(z2 ? 0 : 8);
            if (z2 && this.djBIcL) {
                this.djBIcL = false;
                BotOperatorViewModel botOperatorViewModelCopydefault = valueOf().copydefault();
                if (botOperatorViewModelCopydefault != null) {
                    botOperatorViewModelCopydefault.AEQbTJ(this.OLrzqt, new Function2() { // from class: o.wCz
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return C52207wCw.copydefault(this.copydefault, (TacticsData) obj, (SmartEarnParamsCheckUseCase.Result) obj2);
                        }
                    });
                }
            }
            AppCompatTextView appCompatTextView = abstractC48457uSc.zsXlph;
            if (z) {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.LongDef);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.Keep);
            }
            appCompatTextView.setText(strAYXKKw);
            if (z3) {
                java.lang.Integer numEZpvd = AEQbTJ().EZpvd(this.OLrzqt);
                AppCompatTextView appCompatTextView2 = abstractC48457uSc.zsXlph;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
                EZpvd(appCompatTextView2, true);
                AppCompatTextView appCompatTextView3 = abstractC48457uSc.zsXlph;
                appCompatTextView3.setOnClickListener(new DialogInterface(appCompatTextView3, 1000L, numEZpvd, this));
            } else {
                AEQbTJ().AEQbTJ(false);
                AppCompatTextView appCompatTextView4 = abstractC48457uSc.zsXlph;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
                EZpvd(appCompatTextView4, false);
                abstractC48457uSc.zsXlph.setOnClickListener(null);
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), null, null, 12, null) : null;
            SmartEarnParam simpleEarn3 = strategyDetailsResponse.getSimpleEarn();
            java.lang.String earnMinLimit = simpleEarn3 != null ? simpleEarn3.getEarnMinLimit() : null;
            SmartEarnParam simpleEarn4 = strategyDetailsResponse.getSimpleEarn();
            java.lang.String earnMaxLimit = simpleEarn4 != null ? simpleEarn4.getEarnMaxLimit() : null;
            SmartEarnParam simpleEarn5 = strategyDetailsResponse.getSimpleEarn();
            EarnType earnType = simpleEarn5 != null ? simpleEarn5.getEarnType() : null;
            LinearLayoutCompat linearLayoutCompat2 = abstractC48457uSc.hDKMBd;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
            linearLayoutCompat2.setVisibility(z ? 0 : 8);
            abstractC48457uSc.AuCTelauCTel.setText((!z || suggestedInstrument$default == null || earnMinLimit == null || earnMaxLimit == null || earnType == null) ? "--" : C56033xvF.EZpvd((InterfaceC56538yJb<java.lang.String>) C56547yJk.EZpvd(earnMinLimit, earnMaxLimit), earnType, suggestedInstrument$default));
        }
    }

    public static final Unit copydefault(C52207wCw c52207wCw, TacticsData tacticsData, SmartEarnParamsCheckUseCase.Result result) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        c52207wCw.AEQbTJ().AEQbTJ(result, c52207wCw.OLrzqt);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wCw$BroadcastReceiver */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class BroadcastReceiver implements Function2<TacticsData, SmartEarnParamsCheckUseCase.Result, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BroadcastReceiver() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(TacticsData tacticsData, SmartEarnParamsCheckUseCase.Result result) {
            EZpvd(tacticsData, result);
            return Unit.INSTANCE;
        }

        public final void EZpvd(TacticsData tacticsData, SmartEarnParamsCheckUseCase.Result result) {
            Intrinsics.checkNotNullParameter(tacticsData, "");
            C52207wCw.this.AEQbTJ().AEQbTJ(result, C52207wCw.this.OLrzqt);
            BotOperatorButtonDisposer.dispose$default(C52207wCw.this.valueOf(), "modify_active_grid_range", C52207wCw.this.OLrzqt, new Function0<Unit>() { // from class: o.wCw.BroadcastReceiver.1
                public final void EZpvd() {
                }

                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function0
                public /* synthetic */ Unit invoke() {
                    EZpvd();
                    return Unit.INSTANCE;
                }
            }, null, null, null, 56, null);
        }
    }

    public static final java.lang.String OLrzqt(StrategyDetailsResponse strategyDetailsResponse, java.lang.String str) {
        return C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), str, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void gEmmrt(StrategyDetailsResponse strategyDetailsResponse) {
        java.lang.String strOLrzqt;
        java.lang.String strOLrzqt2;
        AbstractC48457uSc abstractC48457uSc = this.EZpvd;
        if (abstractC48457uSc != null) {
            LinearLayoutCompat linearLayoutCompat = abstractC48457uSc.UeEOUB;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getOrderType(), (java.lang.Object) "grid") ? 0 : 8);
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi23);
            AppCompatTextView appCompatTextView = abstractC48457uSc.RcXXUw;
            TrailingConfig trailingUpConfig = strategyDetailsResponse.getTrailingUpConfig();
            if (trailingUpConfig == null) {
                strOLrzqt = strAYXKKw;
            } else {
                if (trailingUpConfig.getEnabled()) {
                    java.lang.String stopPx = trailingUpConfig.getStopPx();
                    if (stopPx == null) {
                        stopPx = "";
                    }
                    strOLrzqt = OLrzqt(strategyDetailsResponse, stopPx);
                } else {
                    strOLrzqt = strAYXKKw;
                }
                if (strOLrzqt == null) {
                }
            }
            appCompatTextView.setText(strOLrzqt);
            AppCompatTextView appCompatTextView2 = abstractC48457uSc.RJOkX;
            TrailingConfig trailingDownConfig = strategyDetailsResponse.getTrailingDownConfig();
            if (trailingDownConfig != null) {
                if (trailingDownConfig.getEnabled()) {
                    java.lang.String stopPx2 = trailingDownConfig.getStopPx();
                    strOLrzqt2 = OLrzqt(strategyDetailsResponse, stopPx2 != null ? stopPx2 : "");
                } else {
                    strOLrzqt2 = strAYXKKw;
                }
                if (strOLrzqt2 != null) {
                    strAYXKKw = strOLrzqt2;
                }
            }
            appCompatTextView2.setText(strAYXKKw);
        }
    }

    private final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        android.content.Context context = getContext();
        if (context != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                viewOnClickListenerC54939xaY.setTitle(str);
            }
            viewOnClickListenerC54939xaY.EZpvd(str2);
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), new View.OnClickListener() { // from class: o.wCC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C52207wCw.OLrzqt(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void EZpvd(android.widget.TextView textView, boolean z) {
        if (z) {
            textView.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, C33070mpX.KWHzl(C52761wXj.TaskDescription.DGOPHZDGOPHZ), (android.graphics.drawable.Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
    }

    public final void KWHzl(android.widget.TextView textView, boolean z) {
        int iCopydefault;
        if (z) {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.UlJrfe);
        }
        textView.setTextColor(iCopydefault);
        TextViewCompat.setCompoundDrawableTintList(textView, android.content.res.ColorStateList.valueOf(iCopydefault));
    }

    public final void copydefault(android.widget.TextView textView, boolean z, boolean z2) {
        if (z) {
            textView.setOnClickListener(null);
            EZpvd(textView, false);
            KWHzl(textView, false);
        } else if (z2) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.wCF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C52207wCw.copydefault(this.OLrzqt, view);
                }
            });
            EZpvd(textView, true);
            KWHzl(textView, false);
        } else {
            KWHzl(textView, true);
            EZpvd(textView, true);
            textView.setOnClickListener(new Context(textView, 1000L, this));
        }
    }

    public static final void copydefault(C52207wCw c52207wCw, android.view.View view) {
        android.content.Context contextRequireContext = c52207wCw.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.onCommand));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.HrFqwD));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), new View.OnClickListener() { // from class: o.wCA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C52207wCw.AEQbTJ(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX INFO: renamed from: o.wCw$ContentResolver */
    public static final class ContentResolver implements Function0<Unit> {
        public static final ContentResolver copydefault = new ContentResolver();

        public final void copydefault() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }
    }

    @Override // o.InterfaceC52662wTs
    public TradeLiveData<java.util.ArrayList<java.lang.Object>> OLrzqt() {
        TradeLiveData<java.util.ArrayList<java.lang.Object>> tradeLiveData = new TradeLiveData<>();
        tradeLiveData.setValue(yDY.copydefault(this.OLrzqt));
        return tradeLiveData;
    }

    @Override // o.InterfaceC52662wTs
    public void copydefault(@NotNull java.lang.String str, int i, boolean z) {
        NestedScrollView nestedScrollView;
        C55284xgz c55284xgzAEQbTJ;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC48457uSc abstractC48457uSc = this.EZpvd;
        if (abstractC48457uSc == null || (nestedScrollView = abstractC48457uSc.AYXKKw) == null || (c55284xgzAEQbTJ = C55284xgz.Companion.AEQbTJ(requireContext(), nestedScrollView, str)) == null) {
            return;
        }
        c55284xgzAEQbTJ.isConnected(i);
        c55284xgzAEQbTJ.hDKMBd();
    }

    @Override // o.InterfaceC52662wTs
    public void fARcdN() {
        TacticsDetailPresenter.queryBotDetails$default(djBIcL(), false, 1, null);
    }

    /* JADX INFO: renamed from: o.wCw$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        public final java.lang.String EZpvd;
        public final java.lang.Integer KWHzl;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = activity.OLrzqt;
            }
            if ((i & 4) != 0) {
                num = activity.KWHzl;
            }
            return activity.KWHzl(str, str2, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Activity(str, str2, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            int iHashCode2 = this.OLrzqt.hashCode();
            java.lang.Integer num = this.KWHzl;
            return (((iHashCode * 31) + iHashCode2) * 31) + (num == null ? 0 : num.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ParamItem(title=" + this.EZpvd + ", value=" + this.OLrzqt + ", color=" + this.KWHzl + ")";
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = str;
            this.OLrzqt = str2;
            this.KWHzl = num;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:1061) call: o.wCw.Activity.<init>(java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
        public /* synthetic */ Activity(java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : num);
        }
    }
}

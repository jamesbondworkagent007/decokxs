package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.core.os.BundleKt;
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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.tradingbot.impl.order.strategy.BotTradePresenter;
import com.okinc.tradingbot.impl.order.strategy.botTradeContainer.BotTradeContainerPresenter;
import com.okinc.tradingbot.impl.order.strategy.recommend.presenter.BotRecommendPresenter;
import com.okinc.tradingbot.impl.strategy.fragment.order.BotAIRecommendFragment$jumpToAiOrderDialog$1;
import com.okinc.tradingbot.impl.strategy.fragment.order.BotAIRecommendFragment$jumpToManualOrder$1;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.bot.BotRecommendDetailItem;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.biz.bot.StgyParam;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35966oKh;
import o.C48033uCm;
import o.C50143vDm;
import o.C50257vHs;
import o.C52761wXj;
import o.C52812wZg;
import o.C53229whZ;
import o.C55688xof;
import o.InterfaceC8104awT;
import o.vQE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wIG extends AbstractC54505xKx<AbstractC48361uOq, BotRecommendPresenter> {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final Function2<SmartRecommendResp, java.lang.Boolean, Unit> AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final int EZpvd = C48033uCm.Activity.hrNTAI;
    public final InterfaceC56387yDm KWHzl;
    public final C57584ylF copydefault;
    public final InterfaceC56387yDm djBIcL;

    public static final /* synthetic */ class LoaderManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(Function1 function1) {
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
        return this.EZpvd;
    }

    public wIG() {
        final Function0 function0 = new Function0() { // from class: o.wIY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wIG.AYXKKw(this.KWHzl);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.order.BotAIRecommendFragment$special$$inlined$viewModels$default$1
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BotTradeContainerPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.order.BotAIRecommendFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.order.BotAIRecommendFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.order.BotAIRecommendFragment$special$$inlined$viewModels$default$4
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BotTradePresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.order.BotAIRecommendFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.order.BotAIRecommendFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.order.BotAIRecommendFragment$special$$inlined$activityViewModels$default$3
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
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wIZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wIG.AhwBna(this.AEQbTJ);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.wIX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wIG.AEQbTJ();
            }
        });
        this.copydefault = new C57584ylF(2, C55298xhM.dpInt$default(12.0f, (android.content.Context) null, 1, (java.lang.Object) null), 0);
        this.AEQbTJ = new Function2() { // from class: o.wIW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return wIG.AEQbTJ(this.KWHzl, (SmartRecommendResp) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        };
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wIG.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final wIG EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            wIG wig = new wIG();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("algoOrdType", str);
            wig.setArguments(bundle);
            return wig;
        }
    }

    private final BotTradeContainerPresenter AYXKKw() {
        return (BotTradeContainerPresenter) this.AYXKKw.getValue();
    }

    public static final ViewModelStoreOwner AYXKKw(wIG wig) {
        androidx.fragment.app.Fragment parentFragment = wig.getParentFragment();
        return parentFragment != null ? parentFragment : wig;
    }

    public final BotTradePresenter gEmmrt() {
        return (BotTradePresenter) this.djBIcL.getValue();
    }

    public static final java.lang.String AhwBna(wIG wig) {
        java.lang.String string;
        android.os.Bundle arguments = wig.getArguments();
        return (arguments == null || (string = arguments.getString("algoOrdType")) == null) ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String valueOf() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    public static final InterfaceC49505upn AEQbTJ() {
        return (InterfaceC49505upn) C43251rlk.copydefault(InterfaceC49505upn.class);
    }

    public final InterfaceC49505upn copydefault() {
        return (InterfaceC49505upn) this.AhwBna.getValue();
    }

    public static final Unit AEQbTJ(wIG wig, SmartRecommendResp smartRecommendResp, boolean z) {
        Intrinsics.checkNotNullParameter(smartRecommendResp, "");
        if (z) {
            wig.OLrzqt(smartRecommendResp);
        } else {
            wig.KWHzl(smartRecommendResp);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        gGvvIC();
        java.lang.String strValueOf = valueOf();
        if (Intrinsics.EZpvd((java.lang.Object) strValueOf, (java.lang.Object) "contract_dca")) {
            C53549wnb c53549wnb = gGvvIC().copydefault;
            Intrinsics.checkNotNullExpressionValue(c53549wnb, "");
            c53549wnb.setVisibility(0);
            gGvvIC().copydefault.setTabSelectedCallBack(new Function1() { // from class: o.wIQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return wIG.AEQbTJ(this.copydefault, (java.lang.String) obj);
                }
            });
            C53549wnb.addTab$default(gGvvIC().copydefault, false, 1, null);
        } else if (Intrinsics.EZpvd((java.lang.Object) strValueOf, (java.lang.Object) "contract_grid")) {
            C53549wnb c53549wnb2 = gGvvIC().copydefault;
            Intrinsics.checkNotNullExpressionValue(c53549wnb2, "");
            c53549wnb2.setVisibility(0);
            gGvvIC().copydefault.setTabSelectedCallBack(new Function1() { // from class: o.wIS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return wIG.gEmmrt(this.copydefault, (java.lang.String) obj);
                }
            });
            C53549wnb c53549wnb3 = gGvvIC().copydefault;
            ParamBuilder value = finit().values().getValue();
            java.lang.String instType = value != null ? value.getInstType() : null;
            if (instType == null) {
                instType = "";
            }
            ParamBuilder value2 = finit().values().getValue();
            java.lang.String instId = value2 != null ? value2.getInstId() : null;
            BizInstrument bizInstrumentAhwBna = new C55887xsS(instType, instId != null ? instId : "").AhwBna();
            c53549wnb3.OLrzqt(true, bizInstrumentAhwBna != null ? Intrinsics.EZpvd(bizInstrumentAhwBna.isNegativeContract(), java.lang.Boolean.TRUE) : false);
        } else {
            C53549wnb c53549wnb4 = gGvvIC().copydefault;
            Intrinsics.checkNotNullExpressionValue(c53549wnb4, "");
            c53549wnb4.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = gGvvIC().KWHzl;
        Intrinsics.copydefault(linearLayout);
        wPQ.OLrzqt(linearLayout);
        linearLayout.addView(new android.view.View(getContext()), new LinearLayout.LayoutParams(-1, C57676yms.KWHzl(getContext())));
        C56028xvA.registerBotFragmentTrack$default(this, "BotAIRecommendFragment", new kotlin.Pair[0], null, 8, null);
    }

    public static final Unit AEQbTJ(wIG wig, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        wig.EZpvd(str);
        wig.fetchVPNInfo();
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(wIG wig, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        wig.EZpvd(str);
        wig.values();
        wig.AYXKKw().AEQbTJ().setValue(str);
        return Unit.INSTANCE;
    }

    private final void fetchVPNInfo() {
        AbstractC48361uOq abstractC48361uOq = (AbstractC48361uOq) gGvvIC();
        C53549wnb c53549wnb = abstractC48361uOq.copydefault;
        Intrinsics.checkNotNullExpressionValue(c53549wnb, "");
        java.util.List<SmartRecommendResp> list = null;
        java.lang.String strCopydefault = c53549wnb.getVisibility() == 0 ? abstractC48361uOq.copydefault.copydefault() : null;
        if (strCopydefault == null) {
            copydefault(((BotRecommendPresenter) dxcTrN()).AEQbTJ().getValue(), this.AEQbTJ);
            return;
        }
        java.util.List<SmartRecommendResp> value = ((BotRecommendPresenter) dxcTrN()).AEQbTJ().getValue();
        if (value != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : value) {
                StgyParam stgyParam = ((SmartRecommendResp) obj).getStgyParam();
                java.lang.String direction = stgyParam != null ? stgyParam.getDirection() : null;
                java.lang.String str = !java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "hedging")).booleanValue() ? strCopydefault : null;
                if (str == null) {
                    str = "short";
                }
                if (Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) str)) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        copydefault(list, this.AEQbTJ);
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ Function2 EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ SmartRecommendResp copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Function2 function2, SmartRecommendResp smartRecommendResp) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = function2;
            this.copydefault = smartRecommendResp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function2 function2 = this.EZpvd;
                if (function2 != null) {
                    function2.invoke(this.copydefault, java.lang.Boolean.TRUE);
                }
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ wIG copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, wIG wig) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = wig;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.copydefault.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.DPHNDa));
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C48033uCm.Fragment.DQzvGN));
                java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C55688xof.Application.QWSkGZ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new TaskDescription(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ SmartRecommendResp AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ Function2 KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, Function2 function2, SmartRecommendResp smartRecommendResp) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = function2;
            this.AEQbTJ = smartRecommendResp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function2 function2 = this.KWHzl;
                if (function2 != null) {
                    function2.invoke(this.AEQbTJ, java.lang.Boolean.FALSE);
                }
            }
        }
    }

    public final void OLrzqt(SmartRecommendResp smartRecommendResp) {
        if (!C56071xvr.gEmmrt.ejfBZ()) {
            EZpvd(smartRecommendResp);
            return;
        }
        java.lang.String algoOrdType = smartRecommendResp.getAlgoOrdType();
        if (Intrinsics.EZpvd((java.lang.Object) algoOrdType, (java.lang.Object) "grid") || Intrinsics.EZpvd((java.lang.Object) algoOrdType, (java.lang.Object) "spot_dca")) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BotAIRecommendFragment$jumpToManualOrder$1(this, smartRecommendResp, null), 3, null);
        } else {
            EZpvd(smartRecommendResp);
        }
    }

    public final void EZpvd(SmartRecommendResp smartRecommendResp) {
        djBIcL();
        getParentFragmentManager().setFragmentResult("copy_to_manual_data", BundleKt.bundleOf(C56390yDp.OLrzqt("bot_copy_req", BotRecommendPresenter.Companion.AEQbTJ(smartRecommendResp)), C56390yDp.OLrzqt("bot_copy_params", java.lang.Boolean.TRUE)));
    }

    public final void KWHzl(SmartRecommendResp smartRecommendResp) {
        InterfaceC8104awT interfaceC8104awT;
        if (C55697xoo.OLrzqt.isConnected()) {
            if (!C56071xvr.gEmmrt.ejfBZ()) {
                copydefault(smartRecommendResp);
                return;
            }
            java.lang.String algoOrdType = smartRecommendResp.getAlgoOrdType();
            if (Intrinsics.EZpvd((java.lang.Object) algoOrdType, (java.lang.Object) "grid") || Intrinsics.EZpvd((java.lang.Object) algoOrdType, (java.lang.Object) "spot_dca")) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BotAIRecommendFragment$jumpToAiOrderDialog$1(this, smartRecommendResp, null), 3, null);
                return;
            } else {
                copydefault(smartRecommendResp);
                return;
            }
        }
        android.content.Context context = getContext();
        if (context == null || (interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class)) == null) {
            return;
        }
        InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, context, null, 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [255=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void copydefault(SmartRecommendResp smartRecommendResp) {
        AEQbTJ(smartRecommendResp);
        java.lang.String strValueOf = valueOf();
        switch (strValueOf.hashCode()) {
            case -1831183611:
                if (strValueOf.equals("spot_dca")) {
                    C53229whZ.Application application = C53229whZ.Companion;
                    androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                    application.EZpvd(smartRecommendResp, parentFragmentManager);
                    break;
                }
                break;
            case -1402017003:
                if (strValueOf.equals("contract_dca")) {
                    C50143vDm.Activity activity = C50143vDm.Companion;
                    androidx.fragment.app.FragmentManager parentFragmentManager2 = getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager2, "");
                    activity.AEQbTJ(smartRecommendResp, parentFragmentManager2);
                    break;
                }
                break;
            case -512749997:
                if (strValueOf.equals("contract_grid")) {
                    C50257vHs.ActionBar actionBar = C50257vHs.Companion;
                    androidx.fragment.app.FragmentManager parentFragmentManager3 = getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager3, "");
                    actionBar.AEQbTJ(smartRecommendResp, parentFragmentManager3);
                    break;
                }
                break;
            case 3181382:
                if (strValueOf.equals("grid")) {
                    vQE.TaskDescription taskDescription = vQE.Companion;
                    androidx.fragment.app.FragmentManager parentFragmentManager4 = getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager4, "");
                    taskDescription.AEQbTJ(smartRecommendResp, parentFragmentManager4);
                    break;
                }
                break;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wIG */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refreshLayout$default(wIG wig, java.util.List list, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        wig.copydefault((java.util.List<SmartRecommendResp>) list, (Function2<? super SmartRecommendResp, ? super java.lang.Boolean, Unit>) function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(java.util.List<SmartRecommendResp> list, Function2<? super SmartRecommendResp, ? super java.lang.Boolean, Unit> function2) {
        java.lang.String lever;
        AbstractC48361uOq abstractC48361uOqGGvvIC = gGvvIC();
        if (list == null || list.isEmpty()) {
            android.widget.LinearLayout linearLayout = abstractC48361uOqGGvvIC.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
            C55173xeu c55173xeu = abstractC48361uOqGGvvIC.OLrzqt;
            c55173xeu.setVisibility(0);
            c55173xeu.setEmptyTypeImage(6);
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatTransportControlsBase));
            return;
        }
        abstractC48361uOqGGvvIC.OLrzqt.setVisibility(8);
        android.widget.LinearLayout linearLayout2 = abstractC48361uOqGGvvIC.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setVisibility(0);
        abstractC48361uOqGGvvIC.KWHzl.removeAllViews();
        final int scaledTouchSlop = android.view.ViewConfiguration.get(abstractC48361uOqGGvvIC.getRoot().getContext()).getScaledTouchSlop();
        boolean z = false;
        for (SmartRecommendResp smartRecommendResp : list) {
            if (smartRecommendResp.getIncludeIncompleteBacktest()) {
                z = true;
            }
            final AbstractC48469uSo abstractC48469uSoEZpvd = AbstractC48469uSo.EZpvd(android.view.LayoutInflater.from(abstractC48361uOqGGvvIC.KWHzl.getContext()), abstractC48361uOqGGvvIC.KWHzl, true);
            android.view.View root = abstractC48469uSoEZpvd.getRoot();
            root.setOnClickListener(new StateListAnimator(root, 1000L, function2, smartRecommendResp));
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) gGvvIC().copydefault.copydefault(), (java.lang.Object) "hedging");
            StgyParam stgyParam = smartRecommendResp.getStgyParam();
            java.lang.String direction = stgyParam != null ? stgyParam.getDirection() : null;
            if (direction == null) {
                direction = "";
            }
            StgyParam stgyParam2 = smartRecommendResp.getStgyParam();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (stgyParam2 != null ? stgyParam2.getLever() : null))) {
                StgyParam stgyParam3 = smartRecommendResp.getStgyParam();
                if (C33129mqd.AEQbTJ(stgyParam3 != null ? stgyParam3.getLever() : null, "0")) {
                    C55372xih c55372xih = abstractC48469uSoEZpvd.djBIcL;
                    Intrinsics.checkNotNullExpressionValue(c55372xih, "");
                    c55372xih.setVisibility(0);
                    C55251xgS[] c55251xgSArr = new C55251xgS[1];
                    android.content.Context context = abstractC48469uSoEZpvd.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    C55251xgS c55251xgS = new C55251xgS(context, null, 0, 6, null);
                    c55251xgS.setOKDSStyle(C56033xvF.valueOf(direction));
                    c55251xgS.setOKDSSize(-4);
                    c55251xgS.setTextAppearance(C52761wXj.LoaderManager.OBJEWx);
                    StgyParam stgyParam4 = smartRecommendResp.getStgyParam();
                    if (stgyParam4 == null || (lever = stgyParam4.getLever()) == null) {
                        lever = "";
                    }
                    c55251xgS.setText(C56033xvF.getBotLever$default(lever, false, 2, null));
                    c55251xgS.setTextColor(C56033xvF.getContractGridSideColor$default(direction, false, 2, null));
                    c55251xgS.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C56033xvF.getContractGridSideBgColor$default(direction, false, 2, null)));
                    c55251xgS.setIncludeFontPadding(false);
                    Unit unit = Unit.INSTANCE;
                    c55251xgSArr[0] = c55251xgS;
                    java.util.ArrayList arrayListCopydefault = yDY.copydefault(c55251xgSArr);
                    C55372xih c55372xih2 = abstractC48469uSoEZpvd.djBIcL;
                    java.util.Iterator it = arrayListCopydefault.iterator();
                    while (it.hasNext()) {
                        c55372xih2.addView((C55251xgS) it.next());
                    }
                    Intrinsics.copydefault(c55372xih2);
                }
            } else {
                C55372xih c55372xih3 = abstractC48469uSoEZpvd.djBIcL;
                Intrinsics.checkNotNullExpressionValue(c55372xih3, "");
                c55372xih3.setVisibility(8);
            }
            C55258xgZ c55258xgZ = abstractC48469uSoEZpvd.copydefault;
            if (zEZpvd) {
                c55258xgZ.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.DPHNDa));
                c55258xgZ.setHelperLabelType(0);
            } else {
                c55258xgZ.setText(smartRecommendResp.getRecommendTitle());
                c55258xgZ.setHelperLabelType(2);
            }
            C55258xgZ c55258xgZ2 = abstractC48469uSoEZpvd.copydefault;
            c55258xgZ2.setOnClickListener(new Activity(c55258xgZ2, 1000L, this));
            C59534zip c59534zip = new C59534zip();
            c59534zip.register(BotRecommendDetailItem.class, new vTR());
            RecyclerView recyclerView = abstractC48469uSoEZpvd.EZpvd;
            recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
            abstractC48469uSoEZpvd.EZpvd.removeItemDecoration(this.copydefault);
            abstractC48469uSoEZpvd.EZpvd.addItemDecoration(this.copydefault);
            abstractC48469uSoEZpvd.EZpvd.setAdapter(c59534zip);
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            abstractC48469uSoEZpvd.EZpvd.setOnTouchListener(new View.OnTouchListener() { // from class: o.wIP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    return wIG.AEQbTJ(floatRef, floatRef2, scaledTouchSlop, abstractC48469uSoEZpvd, view, motionEvent);
                }
            });
            java.util.List<BotRecommendDetailItem> detailItems = smartRecommendResp.getDetailItems();
            if (detailItems == null) {
                detailItems = yDY.AhwBna();
            }
            C33064mpR.OLrzqt(c59534zip, detailItems);
            android.widget.TextView textView = abstractC48469uSoEZpvd.OLrzqt;
            textView.setOnClickListener(new ActionBar(textView, 1000L, function2, smartRecommendResp));
        }
        if (z) {
            OKReminder oKReminder = abstractC48361uOqGGvvIC.AEQbTJ;
            oKReminder.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.DPhTBN));
            oKReminder.setStyle(0);
            oKReminder.setCloseIconVisibility(false);
            abstractC48361uOqGGvvIC.AEQbTJ.setVisibility(0);
            return;
        }
        abstractC48361uOqGGvvIC.AEQbTJ.setVisibility(8);
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.copydefault = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.copydefault.dismiss();
        }
    }

    public static final boolean AEQbTJ(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, int i, AbstractC48469uSo abstractC48469uSo, android.view.View view, android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            floatRef.element = motionEvent.getX();
            floatRef2.element = motionEvent.getY();
            return false;
        }
        if (actionMasked != 1) {
            return false;
        }
        float f = i;
        if (java.lang.Math.abs(motionEvent.getY() - floatRef2.element) >= f || java.lang.Math.abs(motionEvent.getX() - floatRef.element) >= f) {
            return false;
        }
        abstractC48469uSo.getRoot().performClick();
        return false;
    }

    @Override // o.AbstractC56129xww
    public void bt_() {
        super.bt_();
        showLoading();
        values();
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        TradeLiveData<java.lang.String> tradeLiveDataAEQbTJ = AYXKKw().AEQbTJ();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataAEQbTJ.observe(viewLifecycleOwner, new LoaderManager(new Function1() { // from class: o.wII
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wIG.AhwBna(this.EZpvd, (java.lang.String) obj);
            }
        }));
        C56111xwe<ParamBuilder> c56111xweValues = finit().values();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56111xweValues.observe(viewLifecycleOwner2, new LoaderManager(new Function1() { // from class: o.wIN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wIG.EZpvd(this.copydefault, (ParamBuilder) obj);
            }
        }));
        C56111xwe<java.lang.String> c56111xweAkhnZx = gEmmrt().AkhnZx().AkhnZx();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56111xweAkhnZx.observe(viewLifecycleOwner3, new LoaderManager(new Function1() { // from class: o.wIU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wIG.AYXKKw(this.KWHzl, (java.lang.String) obj);
            }
        }));
        C56111xwe<java.util.List<SmartRecommendResp>> c56111xweAEQbTJ = dxcTrN().AEQbTJ();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c56111xweAEQbTJ.observe(viewLifecycleOwner4, new LoaderManager(new Function1() { // from class: o.wIR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wIG.OLrzqt(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        dxcTrN().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.wIT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wIG.EZpvd(this.AEQbTJ, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit AhwBna(wIG wig, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        wig.gGvvIC().copydefault.setDirectionType(str);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(wIG wig, ParamBuilder paramBuilder) {
        wig.copydefault(paramBuilder != null ? paramBuilder.isSwitchCoin() : false);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(wIG wig, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "PULL_START")) {
            wig.values();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(wIG wig, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        wig.dismissLoading();
        wig.fetchVPNInfo();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) wig, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: F */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(final wIG wig, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) wig.dxcTrN().OLrzqt().bB_())) {
            wig.dismissLoading();
            AbstractC48361uOq abstractC48361uOqGGvvIC = wig.gGvvIC();
            android.widget.LinearLayout linearLayout = abstractC48361uOqGGvvIC.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
            C55173xeu c55173xeu = abstractC48361uOqGGvvIC.OLrzqt;
            Intrinsics.copydefault(c55173xeu);
            c55173xeu.setVisibility(0);
            c55173xeu.setEmptyTypeImage(8);
            c55173xeu.setTitle(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityApi19Impl));
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C35966oKh.TaskDescription.EZpvd));
            c55173xeu.setRetry(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultRegistry));
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.wIV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    wIG.copydefault(this.copydefault, view);
                }
            });
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) wig, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(wIG wig, android.view.View view) {
        wig.values();
    }

    private final void copydefault(boolean z) {
        if (z) {
            C53549wnb c53549wnb = gGvvIC().copydefault;
            ParamBuilder value = finit().values().getValue();
            java.lang.String instType = value != null ? value.getInstType() : null;
            if (instType == null) {
                instType = "";
            }
            ParamBuilder value2 = finit().values().getValue();
            java.lang.String instId = value2 != null ? value2.getInstId() : null;
            BizInstrument bizInstrumentAhwBna = new C55887xsS(instType, instId != null ? instId : "").AhwBna();
            c53549wnb.OLrzqt(true, bizInstrumentAhwBna != null ? Intrinsics.EZpvd(bizInstrumentAhwBna.isNegativeContract(), java.lang.Boolean.TRUE) : false);
            values();
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.tradingbot.impl.order.strategy.recommend.presenter.BotRecommendPresenter.queryRecommendList$default(com.okinc.tradingbot.impl.order.strategy.recommend.presenter.BotRecommendPresenter, java.lang.String, java.lang.String, boolean, int, java.lang.Object):void */
    private final void values() {
        if (Intrinsics.EZpvd((java.lang.Object) valueOf(), (java.lang.Object) "contract_grid")) {
            java.lang.String strCopydefault = gGvvIC().copydefault.copydefault();
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "hedging");
            BotRecommendPresenter botRecommendPresenterDxcTrN = dxcTrN();
            java.lang.String strValueOf = valueOf();
            if (zEZpvd) {
                strCopydefault = "short";
            }
            botRecommendPresenterDxcTrN.KWHzl(strValueOf, strCopydefault, zEZpvd);
            return;
        }
        BotRecommendPresenter.queryRecommendList$default(dxcTrN(), valueOf(), null, false, 6, null);
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        dismissLoading();
    }

    public final void djBIcL() {
        C32866mlf.onEvent$default("BotPlaceOrder_Manual_AdjustRecommendedParameters_Click", (TrackChannel[]) null, new Function1() { // from class: o.wIO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wIG.AEQbTJ(this.copydefault, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(wIG wig, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", wig.valueOf(), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final SmartRecommendResp smartRecommendResp) {
        C32866mlf.onEvent$default("BotPlaceOrder_Recommended_BotCard_Click", (TrackChannel[]) null, new Function1() { // from class: o.wIL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wIG.OLrzqt(this.AEQbTJ, smartRecommendResp, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(wIG wig, SmartRecommendResp smartRecommendResp, EventParamsList eventParamsList) {
        java.lang.String userRiskMode;
        java.lang.String direction;
        java.lang.String duration;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "source", "ai", false, 4, null);
        EventParamsList.put$default(eventParamsList, "bot_type", wig.valueOf(), false, 4, null);
        StgyParam stgyParam = smartRecommendResp.getStgyParam();
        EventParamsList.put$default(eventParamsList, "duration", (stgyParam == null || (duration = stgyParam.getDuration()) == null) ? "" : duration, false, 4, null);
        StgyParam stgyParam2 = smartRecommendResp.getStgyParam();
        EventParamsList.put$default(eventParamsList, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, (stgyParam2 == null || (direction = stgyParam2.getDirection()) == null) ? "" : direction, false, 4, null);
        StgyParam stgyParam3 = smartRecommendResp.getStgyParam();
        EventParamsList.put$default(eventParamsList, "riskmode", (stgyParam3 == null || (userRiskMode = stgyParam3.getUserRiskMode()) == null) ? "" : userRiskMode, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(final java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "hedging")) {
            AkhnZx();
        }
        C32866mlf.onEvent$default("BotPlaceOrder_Recommended_Direction_Click", (TrackChannel[]) null, new Function1() { // from class: o.wIM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wIG.KWHzl(this.copydefault, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(wIG wig, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", wig.valueOf(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "direction_type", str == null ? "" : str, false, 4, null);
        return Unit.INSTANCE;
    }

    private final void AkhnZx() {
        if (SPUtils.getBoolean("hedging_tab_tip", true)) {
            SPUtils.put("hedging_tab_tip", java.lang.Boolean.FALSE);
            android.content.Context context = getContext();
            if (context != null) {
                C52812wZg c52812wZg = new C52812wZg(context);
                C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(gGvvIC().copydefault.OLrzqt());
                stateListAnimator.EZpvd(1);
                stateListAnimator.AEQbTJ(C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
                stateListAnimator.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.fkESqH));
                stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C48033uCm.Fragment.Swccd));
                c52812wZg.AEQbTJ(stateListAnimator);
                c52812wZg.OLrzqt(1);
                C52794wYp c52794wYpAkhnZx = c52812wZg.AkhnZx();
                if (c52794wYpAkhnZx != null) {
                    c52794wYpAkhnZx.setVisibility(8);
                }
                c52812wZg.fARcdN();
                C52794wYp c52794wYpIsConnected = c52812wZg.isConnected();
                if (c52794wYpIsConnected != null) {
                    c52794wYpIsConnected.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.OEsIKP));
                }
            }
        }
    }
}

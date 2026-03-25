package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.planet.biz_plugin.future.data.FutureCustomizeType;
import com.okinc.planet.biz_plugin.future.data.FuturePositionBean;
import com.okinc.planet.biz_plugin.future.data.PluginFuturesMetadata;
import com.okinc.planet.biz_plugin.future.ui.FutureQuicklyFragment$observeViewModel$1;
import com.okinc.planet_api.PlanetFutureTypeEnum;
import com.okinc.tradeshare.api.TradeHisPositionPlanetBean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C45957tCn;
import o.C47501trL;
import o.tCW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tDx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45994tDx extends AbstractC32996moC {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public boolean AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public tWU AhwBna;
    public final C43316rmw EZpvd;
    public tOX KWHzl;
    public boolean copydefault;
    public Function1<? super tWW, Unit> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C47501trL.Application.TarCU;
    }

    public C45994tDx() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.planet.biz_plugin.future.ui.FutureQuicklyFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_plugin.future.ui.FutureQuicklyFragment$special$$inlined$viewModels$default$2
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C45957tCn.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_plugin.future.ui.FutureQuicklyFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_plugin.future.ui.FutureQuicklyFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_plugin.future.ui.FutureQuicklyFragment$special$$inlined$viewModels$default$5
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
        this.EZpvd = new C43316rmw();
    }

    /* JADX INFO: renamed from: o.tDx$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tDx.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.tDx$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C45994tDx newInstance$default(ActionBar actionBar, tWU twu, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                twu = null;
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            return actionBar.OLrzqt(twu, function1);
        }

        public final C45994tDx OLrzqt(tWU twu, Function1<? super tWW, Unit> function1) {
            C45994tDx c45994tDx = new C45994tDx();
            c45994tDx.AhwBna = twu;
            c45994tDx.djBIcL = function1;
            return c45994tDx;
        }
    }

    public final C45957tCn copydefault() {
        return (C45957tCn) this.AYXKKw.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        tOX toxKWHzl = tOX.KWHzl(view);
        this.EZpvd.register(FuturePositionBean.class, new tDF(new Function1() { // from class: o.tDy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45994tDx.EZpvd(this.OLrzqt, (FuturePositionBean) obj);
            }
        }));
        toxKWHzl.copydefault.setLayoutManager(C33047mpA.OLrzqt(getContext()));
        toxKWHzl.copydefault.setAdapter(this.EZpvd);
        toxKWHzl.copydefault.addOnScrollListener(new Activity());
        android.widget.TextView textView = toxKWHzl.OLrzqt;
        textView.setOnClickListener(new StateListAnimator(textView, 1000L, this, toxKWHzl));
        this.KWHzl = toxKWHzl;
    }

    public static final Unit EZpvd(final C45994tDx c45994tDx, final FuturePositionBean futurePositionBean) {
        Intrinsics.checkNotNullParameter(futurePositionBean, "");
        FragmentActivity fragmentActivityRequireActivity = c45994tDx.requireActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = fragmentActivityRequireActivity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivityRequireActivity : null;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.showLoading();
        }
        C32866mlf.onEvent$default("Feeds_Mid_PluginShortcut_Click", (TrackChannel[]) null, new Function1() { // from class: o.tDt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45994tDx.copydefault(futurePositionBean, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        c45994tDx.copydefault().EZpvd(futurePositionBean, new Function1() { // from class: o.tDu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45994tDx.AEQbTJ(this.KWHzl, (FuturePositionBean) obj);
            }
        }, new Function1() { // from class: o.tDC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45994tDx.OLrzqt(this.AEQbTJ, (java.lang.String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(FuturePositionBean futurePositionBean, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("plugin_type", "futures", true);
        eventParamsList.put("token", futurePositionBean.getTradePositionPlanetBean().getInstName(), false);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C45994tDx c45994tDx, FuturePositionBean futurePositionBean) {
        Intrinsics.checkNotNullParameter(futurePositionBean, "");
        FragmentActivity fragmentActivityRequireActivity = c45994tDx.requireActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = fragmentActivityRequireActivity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivityRequireActivity : null;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.dismissLoading();
        }
        PluginFuturesMetadata pluginFuturesMetadata = new PluginFuturesMetadata((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, PlanetFutureTypeEnum.CURRENT.getType(), futurePositionBean.getKlineList(), futurePositionBean.getBuySellMarkerList(), futurePositionBean.getTradePositionPlanetBean(), (TradeHisPositionPlanetBean) null, FutureCustomizeType.Future_Customize_PnlPercent.getValue(), 271, (DefaultConstructorMarker) null);
        pUU.EZpvd(c45994tDx.getTAG(), pluginFuturesMetadata.getInJsonString());
        tWU twu = c45994tDx.AhwBna;
        if (twu != null) {
            twu.AEQbTJ(pluginFuturesMetadata.getInJsonString());
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C45994tDx c45994tDx, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        FragmentActivity fragmentActivityRequireActivity = c45994tDx.requireActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = fragmentActivityRequireActivity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivityRequireActivity : null;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.tDx$Activity */
    public static final class Activity extends RecyclerView.OnScrollListener {
        public Activity() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (C45994tDx.this.copydefault || i != 1) {
                return;
            }
            C32866mlf.onEvent$default("Feeds_Mid_PluginShortcutScroll_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            C45994tDx.this.copydefault = true;
        }
    }

    /* JADX INFO: renamed from: o.tDx$Application */
    public static final class Application extends tWW {
        public Application() {
        }

        @Override // o.tWW
        public void copydefault(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            tWU twu = C45994tDx.this.AhwBna;
            if (twu != null) {
                twu.AEQbTJ(str);
            }
        }

        @Override // o.tWW
        public void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            tWU twu = C45994tDx.this.AhwBna;
            if (twu != null) {
                twu.copydefault(str);
            }
        }
    }

    /* JADX INFO: renamed from: o.tDx$TaskDescription */
    public static final class TaskDescription implements Function1<PluginFuturesMetadata, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(PluginFuturesMetadata pluginFuturesMetadata) {
            copydefault(pluginFuturesMetadata);
            return Unit.INSTANCE;
        }

        public final void copydefault(PluginFuturesMetadata pluginFuturesMetadata) {
            Intrinsics.checkNotNullParameter(pluginFuturesMetadata, "");
            pUU.EZpvd("zhouzhou", pluginFuturesMetadata);
            tWU twu = C45994tDx.this.AhwBna;
            if (twu != null) {
                twu.AEQbTJ(pluginFuturesMetadata.getInJsonString());
            }
        }
    }

    private final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FutureQuicklyFragment$observeViewModel$1(this, null), 3, null);
    }

    public final void OLrzqt(C45957tCn.TaskDescription taskDescription) {
        tOX tox = this.KWHzl;
        if (tox != null) {
            if (taskDescription.AEQbTJ()) {
                tox.AEQbTJ.setVisibility(8);
                return;
            }
            if (taskDescription.copydefault()) {
                tox.AEQbTJ.setVisibility(8);
                if (this.AEQbTJ) {
                    return;
                }
                this.AEQbTJ = true;
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
                return;
            }
            if (C33129mqd.KWHzl((java.util.Collection) taskDescription.KWHzl())) {
                tox.AEQbTJ.setVisibility(0);
                this.EZpvd.setItems(taskDescription.KWHzl());
                this.EZpvd.notifyDataSetChanged();
            } else {
                tox.AEQbTJ.setVisibility(8);
            }
            if (this.AEQbTJ) {
                return;
            }
            this.AEQbTJ = true;
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    /* JADX INFO: renamed from: o.tDx$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ tOX EZpvd;
        public final /* synthetic */ C45994tDx OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C45994tDx c45994tDx, tOX tox) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = c45994tDx;
            this.EZpvd = tox;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Feeds_Mid_PluginShortcutOpenMore_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                Function1 function1 = this.OLrzqt.djBIcL;
                if (function1 != null) {
                    function1.invoke(this.OLrzqt.new Application());
                    return;
                }
                tCW.StateListAnimator stateListAnimator = tCW.Companion;
                androidx.fragment.app.FragmentManager childFragmentManager = this.OLrzqt.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                stateListAnimator.OLrzqt(childFragmentManager, this.OLrzqt.new TaskDescription());
            }
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        EZpvd();
    }
}

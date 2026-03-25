package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.planet.biz_plugin.future.data.FutureHistoryBean;
import com.okinc.planet.biz_plugin.future.ui.FutureHistoryFragment$initView$1$4$1$2;
import com.okinc.planet.biz_plugin.future.ui.FutureHistoryFragment$observeViewModel$1;
import com.okinc.tradeshare.api.TradeHisPositionPlanetBean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C45948tCe;
import o.C47501trL;
import o.C52761wXj;
import o.tCQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tCO extends AbstractC32996moC {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public tOY AEQbTJ;
    public FutureHistoryBean AYXKKw;
    public final InterfaceC56387yDm EZpvd;
    public boolean KWHzl;
    public final C43316rmw OLrzqt;
    public final InterfaceC56387yDm gEmmrt;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C47501trL.Application.RXzakW;
    }

    public tCO() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.planet.biz_plugin.future.ui.FutureHistoryFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_plugin.future.ui.FutureHistoryFragment$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C45948tCe.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_plugin.future.ui.FutureHistoryFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_plugin.future.ui.FutureHistoryFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_plugin.future.ui.FutureHistoryFragment$special$$inlined$viewModels$default$5
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
        final Function0 function03 = new Function0() { // from class: o.tCM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tCO.OLrzqt(this.OLrzqt);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_plugin.future.ui.FutureHistoryFragment$special$$inlined$viewModels$default$6
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(tBY.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_plugin.future.ui.FutureHistoryFragment$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_plugin.future.ui.FutureHistoryFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_plugin.future.ui.FutureHistoryFragment$special$$inlined$viewModels$default$9
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
        this.OLrzqt = new C43316rmw();
        this.valueOf = -1;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tCO.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static final class FragmentManager implements View.OnLayoutChangeListener {
        public final /* synthetic */ FutureHistoryBean EZpvd;
        public final /* synthetic */ tCO KWHzl;
        public final /* synthetic */ tOY copydefault;

        public FragmentManager(tOY toy, tCO tco, FutureHistoryBean futureHistoryBean) {
            this.copydefault = toy;
            this.KWHzl = tco;
            this.EZpvd = futureHistoryBean;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            this.copydefault.valueOf.postDelayed(this.KWHzl.new ActionBar(this.EZpvd), 100L);
        }
    }

    public final C45948tCe EZpvd() {
        return (C45948tCe) this.gEmmrt.getValue();
    }

    public final tBY OLrzqt() {
        return (tBY) this.EZpvd.getValue();
    }

    public static final ViewModelStoreOwner OLrzqt(tCO tco) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = tco.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        final tOY toyAEQbTJ = tOY.AEQbTJ(view);
        toyAEQbTJ.gEmmrt.KWHzl.setText(C33070mpX.AYXKKw(C47501trL.Fragment.DaTmkG));
        this.OLrzqt.register(FutureHistoryBean.class, new tDA(new Function1() { // from class: o.tCN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tCO.EZpvd(this.copydefault, toyAEQbTJ, (FutureHistoryBean) obj);
            }
        }));
        toyAEQbTJ.valueOf.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView = toyAEQbTJ.valueOf;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        recyclerView.addItemDecoration(new StateListAnimator(this, contextRequireContext));
        toyAEQbTJ.valueOf.setAdapter(this.OLrzqt);
        toyAEQbTJ.valueOf.setItemAnimator(null);
        C54989xbV c54989xbV = toyAEQbTJ.AEQbTJ;
        c54989xbV.setOnClickListener(new TaskDescription(c54989xbV, 1000L, this));
        C52794wYp c52794wYp = toyAEQbTJ.OLrzqt.copydefault;
        c52794wYp.setOnClickListener(new Fragment(c52794wYp, 1000L, this));
        wYF wyf = toyAEQbTJ.EZpvd;
        wyf.setEnabled(false);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C47501trL.Fragment.fJNWhG));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(257);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new PendingIntent(c52794wYpCopydefault2, 1000L, this));
        }
        this.AEQbTJ = toyAEQbTJ;
    }

    public static final Unit EZpvd(final tCO tco, final tOY toy, FutureHistoryBean futureHistoryBean) {
        Intrinsics.checkNotNullParameter(futureHistoryBean, "");
        C32866mlf.onEvent$default("Feeds_Whole_PluginCardExpand_Click", (TrackChannel[]) null, new Function1() { // from class: o.tCK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tCO.OLrzqt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        tco.EZpvd().AEQbTJ(futureHistoryBean, new Function1() { // from class: o.tCL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tCO.AEQbTJ(toy, tco, (FutureHistoryBean) obj);
            }
        }, new Function1() { // from class: o.tCR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tCO.AEQbTJ((java.lang.String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("plugin_type", "historical_futures", true);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(tOY toy, tCO tco, FutureHistoryBean futureHistoryBean) {
        Intrinsics.checkNotNullParameter(futureHistoryBean, "");
        RecyclerView recyclerView = toy.valueOf;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.addOnLayoutChangeListener(new FragmentManager(toy, tco, futureHistoryBean));
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements java.lang.Runnable {
        public final /* synthetic */ FutureHistoryBean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(FutureHistoryBean futureHistoryBean) {
            this.copydefault = futureHistoryBean;
        }

        @Override // java.lang.Runnable
        public final void run() {
            tCO.this.KWHzl(this.copydefault);
        }
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static final class Activity implements Function1<EventParamsList, Unit> {
        public static final Activity KWHzl = new Activity();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("plugin_type", "historical_futures", true);
        }
    }

    private final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FutureHistoryFragment$observeViewModel$1(this, null), 3, null);
    }

    public final void EZpvd(C45948tCe.Application application) {
        java.lang.String strAYXKKw;
        tOY toy = this.AEQbTJ;
        if (toy != null) {
            int i = 0;
            if (application.djBIcL()) {
                toy.OLrzqt.getRoot().setVisibility(8);
                toy.KWHzl.setVisibility(8);
                toy.EZpvd.setVisibility(8);
                toy.gEmmrt.getRoot().setVisibility(8);
                toy.copydefault.setVisibility(0);
                return;
            }
            if (application.OLrzqt()) {
                toy.copydefault.setVisibility(8);
                toy.EZpvd.setVisibility(8);
                toy.gEmmrt.getRoot().setVisibility(8);
                toy.OLrzqt.getRoot().setVisibility(0);
                toy.KWHzl.setVisibility(8);
                if (this.KWHzl) {
                    return;
                }
                this.KWHzl = true;
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
                return;
            }
            if (C33129mqd.KWHzl((java.util.Collection) application.copydefault())) {
                toy.KWHzl.setVisibility(0);
                toy.gEmmrt.getRoot().setVisibility(8);
            } else {
                toy.KWHzl.setVisibility(8);
                toy.gEmmrt.getRoot().setVisibility(0);
            }
            toy.EZpvd.setVisibility(0);
            toy.OLrzqt.getRoot().setVisibility(8);
            toy.copydefault.setVisibility(8);
            if (application.AEQbTJ() != null) {
                C52794wYp c52794wYpCopydefault = toy.EZpvd.copydefault();
                if (c52794wYpCopydefault != null) {
                    c52794wYpCopydefault.setEnabled(true);
                }
            } else {
                C52794wYp c52794wYpCopydefault2 = toy.EZpvd.copydefault();
                if (c52794wYpCopydefault2 != null) {
                    c52794wYpCopydefault2.setEnabled(false);
                }
            }
            android.widget.TextView textViewEZpvd = toy.AEQbTJ.EZpvd();
            if (application.KWHzl() != null) {
                strAYXKKw = application.KWHzl();
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.aGOrKO);
            }
            textViewEZpvd.setText(strAYXKKw);
            java.util.List<?> items = this.OLrzqt.getItems();
            if (!(items instanceof java.util.List)) {
                items = null;
            }
            if (items == null) {
                items = yDY.AhwBna();
            }
            java.util.List<FutureHistoryBean> listEZpvd = application.EZpvd();
            this.OLrzqt.setItems(listEZpvd);
            int i2 = -1;
            if (items.isEmpty() || items.size() != listEZpvd.size()) {
                this.OLrzqt.notifyDataSetChanged();
                this.valueOf = -1;
            } else {
                int i3 = 0;
                for (java.lang.Object obj : listEZpvd) {
                    if (i3 < 0) {
                        yDY.AYXKKw();
                    }
                    FutureHistoryBean futureHistoryBean = (FutureHistoryBean) obj;
                    if (i3 < items.size()) {
                        FutureHistoryBean futureHistoryBean2 = (FutureHistoryBean) items.get(i3);
                        boolean z = !Intrinsics.EZpvd((java.lang.Object) futureHistoryBean2.getTradeHisPositionPlanetBean().getPosId(), (java.lang.Object) futureHistoryBean.getTradeHisPositionPlanetBean().getPosId());
                        boolean z2 = futureHistoryBean2.isSelect() != futureHistoryBean.isSelect();
                        boolean z3 = (z2 || z || futureHistoryBean2.getKlineList().size() == futureHistoryBean.getKlineList().size()) ? false : true;
                        boolean z4 = (z2 || z || futureHistoryBean2.isLoadingChatData() == futureHistoryBean.isLoadingChatData()) ? false : true;
                        if (z || z2) {
                            this.OLrzqt.notifyItemChanged(i3, "selection_changed");
                        } else if (z3 || z4) {
                            this.OLrzqt.notifyItemChanged(i3, "data_loaded");
                        }
                    }
                    i3++;
                }
                java.util.Iterator<FutureHistoryBean> it = listEZpvd.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (it.next().isSelect()) {
                        i2 = i;
                        break;
                    }
                    i++;
                }
                this.valueOf = i2;
            }
            if (this.KWHzl) {
                return;
            }
            this.KWHzl = true;
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ tCO copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, tCO tco) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = tco;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.EZpvd().gEmmrt();
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ tCO copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, tCO tco) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = tco;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Feeds_Btm_PluginCardConfirm_Click", (TrackChannel[]) null, Activity.KWHzl, 1, (java.lang.Object) null);
                FutureHistoryBean futureHistoryBeanAEQbTJ = this.copydefault.EZpvd().copydefault().getValue().AEQbTJ();
                if (futureHistoryBeanAEQbTJ == null) {
                    futureHistoryBeanAEQbTJ = this.copydefault.AYXKKw;
                }
                if (futureHistoryBeanAEQbTJ != null) {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.copydefault), null, null, new FutureHistoryFragment$initView$1$4$1$2(this.copydefault, futureHistoryBeanAEQbTJ, null), 3, null);
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ tCO AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, tCO tco) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = tco;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                tCQ.Activity activity = tCQ.Companion;
                androidx.fragment.app.FragmentManager childFragmentManager = this.AEQbTJ.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                activity.OLrzqt(childFragmentManager);
            }
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        KWHzl();
    }

    public final void KWHzl(FutureHistoryBean futureHistoryBean) {
        RecyclerView recyclerView;
        int i;
        TradeHisPositionPlanetBean tradeHisPositionPlanetBean;
        tOY toy = this.AEQbTJ;
        if (toy == null || (recyclerView = toy.valueOf) == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        java.util.List<?> items = this.OLrzqt.getItems();
        if (!(items instanceof java.util.List)) {
            items = null;
        }
        if (items != null) {
            i = 0;
            for (java.lang.Object obj : items) {
                FutureHistoryBean futureHistoryBean2 = obj instanceof FutureHistoryBean ? (FutureHistoryBean) obj : null;
                if (Intrinsics.EZpvd((java.lang.Object) ((futureHistoryBean2 == null || (tradeHisPositionPlanetBean = futureHistoryBean2.getTradeHisPositionPlanetBean()) == null) ? null : tradeHisPositionPlanetBean.getPosId()), (java.lang.Object) futureHistoryBean.getTradeHisPositionPlanetBean().getPosId())) {
                    break;
                } else {
                    i++;
                }
            }
            i = -1;
        } else {
            i = -1;
        }
        if (i == -1) {
            return;
        }
        android.view.View viewFindViewByPosition = linearLayoutManager.findViewByPosition(i);
        if (viewFindViewByPosition == null) {
            LoaderManager loaderManager = new LoaderManager(recyclerView.getContext());
            loaderManager.setTargetPosition(i);
            linearLayoutManager.startSmoothScroll(loaderManager);
            return;
        }
        int top = viewFindViewByPosition.getTop();
        int bottom = viewFindViewByPosition.getBottom();
        int height = recyclerView.getHeight();
        int paddingTop = recyclerView.getPaddingTop();
        int paddingBottom = height - recyclerView.getPaddingBottom();
        int itemCount = this.OLrzqt.getItemCount();
        boolean z = i == 0;
        boolean z2 = i == itemCount - 1;
        if (z) {
            int i2 = top - paddingTop;
            if (i2 < 0) {
                recyclerView.smoothScrollBy(0, i2, new android.view.animation.DecelerateInterpolator(1.5f), 400);
                return;
            }
            return;
        }
        if (z2) {
            int i3 = bottom - paddingBottom;
            if (i3 > 0) {
                recyclerView.smoothScrollBy(0, i3 + 40, new android.view.animation.DecelerateInterpolator(1.5f), 400);
                return;
            }
            return;
        }
        int iCopydefault = C56548yJl.copydefault(bottom - paddingBottom, 0);
        int iCopydefault2 = C56548yJl.copydefault(paddingTop - top, 0);
        if (iCopydefault > 0) {
            recyclerView.smoothScrollBy(0, iCopydefault + 80, new android.view.animation.DecelerateInterpolator(1.5f), 400);
        } else if (iCopydefault2 > 0) {
            recyclerView.smoothScrollBy(0, -(iCopydefault2 + 80), new android.view.animation.DecelerateInterpolator(1.5f), 400);
        }
    }

    public static final class LoaderManager extends LinearSmoothScroller {
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            return -1;
        }

        public LoaderManager(android.content.Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(android.util.DisplayMetrics displayMetrics) {
            Intrinsics.checkNotNullParameter(displayMetrics, "");
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public final class StateListAnimator extends RecyclerView.ItemDecoration {
        public final android.content.Context EZpvd;
        public final /* synthetic */ tCO KWHzl;

        public StateListAnimator(@NotNull tCO tco, android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            this.KWHzl = tco;
            this.EZpvd = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.top = this.EZpvd.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.zuBGHE);
            }
        }
    }
}

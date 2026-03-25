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
import com.okinc.planet.biz_plugin.future.data.FuturePositionBean;
import com.okinc.planet.biz_plugin.future.ui.FuturePositionFragment$initView$1$4$1$2;
import com.okinc.planet.biz_plugin.future.ui.FuturePositionFragment$observeViewModel$1;
import com.okinc.tradeshare.api.TradePositionPlanetBean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C45951tCh;
import o.C45989tDs;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tDn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45984tDn extends AbstractC32996moC {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public boolean AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public final C43316rmw EZpvd;
    public tOY KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public FuturePositionBean gEmmrt;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C47501trL.Application.RXzakW;
    }

    public C45984tDn() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.planet.biz_plugin.future.ui.FuturePositionFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_plugin.future.ui.FuturePositionFragment$special$$inlined$viewModels$default$2
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C45951tCh.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_plugin.future.ui.FuturePositionFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_plugin.future.ui.FuturePositionFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_plugin.future.ui.FuturePositionFragment$special$$inlined$viewModels$default$5
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
        final Function0 function03 = new Function0() { // from class: o.tDm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45984tDn.AEQbTJ(this.EZpvd);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_plugin.future.ui.FuturePositionFragment$special$$inlined$viewModels$default$6
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(tBY.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_plugin.future.ui.FuturePositionFragment$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_plugin.future.ui.FuturePositionFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_plugin.future.ui.FuturePositionFragment$special$$inlined$viewModels$default$9
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
        this.EZpvd = new C43316rmw();
        this.valueOf = -1;
    }

    /* JADX INFO: renamed from: o.tDn$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tDn.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.tDn$Dialog */
    public static final class Dialog implements View.OnLayoutChangeListener {
        public final /* synthetic */ FuturePositionBean AEQbTJ;
        public final /* synthetic */ tOY EZpvd;
        public final /* synthetic */ C45984tDn KWHzl;

        public Dialog(tOY toy, C45984tDn c45984tDn, FuturePositionBean futurePositionBean) {
            this.EZpvd = toy;
            this.KWHzl = c45984tDn;
            this.AEQbTJ = futurePositionBean;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            this.EZpvd.valueOf.postDelayed(this.KWHzl.new StateListAnimator(this.AEQbTJ), 100L);
        }
    }

    public final C45951tCh AEQbTJ() {
        return (C45951tCh) this.AhwBna.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tBY OLrzqt() {
        return (tBY) this.OLrzqt.getValue();
    }

    public static final ViewModelStoreOwner AEQbTJ(C45984tDn c45984tDn) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c45984tDn.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        final tOY toyAEQbTJ = tOY.AEQbTJ(view);
        toyAEQbTJ.gEmmrt.KWHzl.setText(C33070mpX.AYXKKw(C47501trL.Fragment.DaTmkG));
        this.EZpvd.register(FuturePositionBean.class, new tDH(new Function1() { // from class: o.tDq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45984tDn.AEQbTJ(this.OLrzqt, toyAEQbTJ, (FuturePositionBean) obj);
            }
        }));
        toyAEQbTJ.valueOf.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView = toyAEQbTJ.valueOf;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        recyclerView.addItemDecoration(new TaskDescription(this, contextRequireContext));
        toyAEQbTJ.valueOf.setAdapter(this.EZpvd);
        toyAEQbTJ.valueOf.setItemAnimator(null);
        C54989xbV c54989xbV = toyAEQbTJ.AEQbTJ;
        c54989xbV.setOnClickListener(new ActionBar(c54989xbV, 1000L, this));
        C52794wYp c52794wYp = toyAEQbTJ.OLrzqt.copydefault;
        c52794wYp.setOnClickListener(new PendingIntent(c52794wYp, 1000L, this));
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
            c52794wYpCopydefault2.setOnClickListener(new FragmentManager(c52794wYpCopydefault2, 1000L, this));
        }
        this.KWHzl = toyAEQbTJ;
    }

    public static final Unit AEQbTJ(final C45984tDn c45984tDn, final tOY toy, FuturePositionBean futurePositionBean) {
        Intrinsics.checkNotNullParameter(futurePositionBean, "");
        C32866mlf.onEvent$default("Feeds_Whole_PluginCardExpand_Click", (TrackChannel[]) null, new Function1() { // from class: o.tDl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45984tDn.copydefault((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        c45984tDn.AEQbTJ().KWHzl(futurePositionBean, new Function1() { // from class: o.tDj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45984tDn.copydefault(toy, c45984tDn, (FuturePositionBean) obj);
            }
        }, new Function1() { // from class: o.tDk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45984tDn.OLrzqt((java.lang.String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("plugin_type", "futures_position", true);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(tOY toy, C45984tDn c45984tDn, FuturePositionBean futurePositionBean) {
        Intrinsics.checkNotNullParameter(futurePositionBean, "");
        RecyclerView recyclerView = toy.valueOf;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.addOnLayoutChangeListener(new Dialog(toy, c45984tDn, futurePositionBean));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.tDn$StateListAnimator */
    public static final class StateListAnimator implements java.lang.Runnable {
        public final /* synthetic */ FuturePositionBean AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(FuturePositionBean futurePositionBean) {
            this.AEQbTJ = futurePositionBean;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C45984tDn.this.AEQbTJ(this.AEQbTJ);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.tDn$Application */
    public static final class Application implements Function1<EventParamsList, Unit> {
        public static final Application copydefault = new Application();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("plugin_type", "futures_position", true);
        }
    }

    private final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FuturePositionFragment$observeViewModel$1(this, null), 3, null);
    }

    public final void copydefault(C45951tCh.StateListAnimator stateListAnimator) {
        java.lang.String strAYXKKw;
        tOY toy = this.KWHzl;
        if (toy != null) {
            int i = 0;
            if (stateListAnimator.AhwBna()) {
                toy.OLrzqt.getRoot().setVisibility(8);
                toy.KWHzl.setVisibility(8);
                toy.EZpvd.setVisibility(8);
                toy.gEmmrt.getRoot().setVisibility(8);
                toy.copydefault.setVisibility(0);
                return;
            }
            if (stateListAnimator.OLrzqt()) {
                toy.copydefault.setVisibility(8);
                toy.EZpvd.setVisibility(8);
                toy.gEmmrt.getRoot().setVisibility(8);
                toy.OLrzqt.getRoot().setVisibility(0);
                toy.KWHzl.setVisibility(8);
                if (this.AEQbTJ) {
                    return;
                }
                this.AEQbTJ = true;
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
                return;
            }
            if (C33129mqd.KWHzl((java.util.Collection) stateListAnimator.EZpvd())) {
                toy.KWHzl.setVisibility(0);
                toy.gEmmrt.getRoot().setVisibility(8);
            } else {
                toy.KWHzl.setVisibility(8);
                toy.gEmmrt.getRoot().setVisibility(0);
            }
            toy.EZpvd.setVisibility(0);
            toy.OLrzqt.getRoot().setVisibility(8);
            toy.copydefault.setVisibility(8);
            if (stateListAnimator.AEQbTJ() != null) {
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
            if (stateListAnimator.copydefault() != null) {
                strAYXKKw = stateListAnimator.copydefault();
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.aGOrKO);
            }
            textViewEZpvd.setText(strAYXKKw);
            java.util.List<?> items = this.EZpvd.getItems();
            if (!(items instanceof java.util.List)) {
                items = null;
            }
            if (items == null) {
                items = yDY.AhwBna();
            }
            java.util.List<FuturePositionBean> listKWHzl = stateListAnimator.KWHzl();
            this.EZpvd.setItems(listKWHzl);
            int i2 = -1;
            if (items.isEmpty() || items.size() != listKWHzl.size()) {
                this.EZpvd.notifyDataSetChanged();
                this.valueOf = -1;
            } else {
                int i3 = 0;
                for (java.lang.Object obj : listKWHzl) {
                    if (i3 < 0) {
                        yDY.AYXKKw();
                    }
                    FuturePositionBean futurePositionBean = (FuturePositionBean) obj;
                    if (i3 < items.size()) {
                        FuturePositionBean futurePositionBean2 = (FuturePositionBean) items.get(i3);
                        boolean z = !Intrinsics.EZpvd((java.lang.Object) futurePositionBean2.getTradePositionPlanetBean().getPosId(), (java.lang.Object) futurePositionBean.getTradePositionPlanetBean().getPosId());
                        boolean z2 = futurePositionBean2.isSelect() != futurePositionBean.isSelect();
                        boolean z3 = (z2 || z || futurePositionBean2.getKlineList().size() == futurePositionBean.getKlineList().size()) ? false : true;
                        boolean z4 = (z2 || z || futurePositionBean2.isLoadingChatData() == futurePositionBean.isLoadingChatData()) ? false : true;
                        if (z || z2) {
                            this.EZpvd.notifyItemChanged(i3, "selection_changed");
                        } else if (z3 || z4) {
                            this.EZpvd.notifyItemChanged(i3, "data_loaded");
                        }
                    }
                    i3++;
                }
                java.util.Iterator<FuturePositionBean> it = listKWHzl.iterator();
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
            if (this.AEQbTJ) {
                return;
            }
            this.AEQbTJ = true;
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    /* JADX INFO: renamed from: o.tDn$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C45984tDn KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C45984tDn c45984tDn) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = c45984tDn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C45989tDs.ActionBar actionBar = C45989tDs.Companion;
                androidx.fragment.app.FragmentManager childFragmentManager = this.KWHzl.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                actionBar.copydefault(childFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.tDn$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C45984tDn copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C45984tDn c45984tDn) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = c45984tDn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Feeds_Btm_PluginCardConfirm_Click", (TrackChannel[]) null, Application.copydefault, 1, (java.lang.Object) null);
                FuturePositionBean futurePositionBeanAEQbTJ = this.copydefault.AEQbTJ().copydefault().getValue().AEQbTJ();
                if (futurePositionBeanAEQbTJ == null) {
                    futurePositionBeanAEQbTJ = this.copydefault.gEmmrt;
                }
                if (futurePositionBeanAEQbTJ != null) {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.copydefault), null, null, new FuturePositionFragment$initView$1$4$1$2(this.copydefault, futurePositionBeanAEQbTJ, null), 3, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.tDn$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C45984tDn OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C45984tDn c45984tDn) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = c45984tDn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.AEQbTJ().AhwBna();
            }
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        KWHzl();
    }

    public final void AEQbTJ(FuturePositionBean futurePositionBean) {
        RecyclerView recyclerView;
        int i;
        TradePositionPlanetBean tradePositionPlanetBean;
        tOY toy = this.KWHzl;
        if (toy == null || (recyclerView = toy.valueOf) == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        java.util.List<?> items = this.EZpvd.getItems();
        if (!(items instanceof java.util.List)) {
            items = null;
        }
        if (items != null) {
            i = 0;
            for (java.lang.Object obj : items) {
                FuturePositionBean futurePositionBean2 = obj instanceof FuturePositionBean ? (FuturePositionBean) obj : null;
                if (Intrinsics.EZpvd((java.lang.Object) ((futurePositionBean2 == null || (tradePositionPlanetBean = futurePositionBean2.getTradePositionPlanetBean()) == null) ? null : tradePositionPlanetBean.getPosId()), (java.lang.Object) futurePositionBean.getTradePositionPlanetBean().getPosId())) {
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
            Fragment fragment = new Fragment(recyclerView.getContext());
            fragment.setTargetPosition(i);
            linearLayoutManager.startSmoothScroll(fragment);
            return;
        }
        int top = viewFindViewByPosition.getTop();
        int bottom = viewFindViewByPosition.getBottom();
        int height = recyclerView.getHeight();
        int paddingTop = recyclerView.getPaddingTop();
        int paddingBottom = height - recyclerView.getPaddingBottom();
        int itemCount = this.EZpvd.getItemCount();
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

    /* JADX INFO: renamed from: o.tDn$Fragment */
    public static final class Fragment extends LinearSmoothScroller {
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            return -1;
        }

        public Fragment(android.content.Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(android.util.DisplayMetrics displayMetrics) {
            Intrinsics.checkNotNullParameter(displayMetrics, "");
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    /* JADX INFO: renamed from: o.tDn$TaskDescription */
    public final class TaskDescription extends RecyclerView.ItemDecoration {
        public final android.content.Context AEQbTJ;
        public final /* synthetic */ C45984tDn copydefault;

        public TaskDescription(@NotNull C45984tDn c45984tDn, android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            this.copydefault = c45984tDn;
            this.AEQbTJ = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.top = this.AEQbTJ.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.zuBGHE);
            }
        }
    }
}

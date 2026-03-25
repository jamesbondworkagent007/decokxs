package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean;
import com.okinc.planet.biz_plugin.spot.ui.SpotHoldingsBottomSheet$observeViewModel$1;
import com.okinc.tradeshare.api.TradeAssetPlanetBean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47501trL;
import o.C52761wXj;
import o.tDE;
import o.tDX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class tDW extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public tOV AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public Function1<? super SpotHoldingBean, Unit> AhwBna;
    public final C43316rmw KWHzl;
    public final boolean OLrzqt;
    public wYF copydefault;
    public int djBIcL;
    public SpotHoldingBean gEmmrt;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.valueOf;
    }

    public static final class Dialog implements View.OnLayoutChangeListener {
        public final /* synthetic */ tOV EZpvd;
        public final /* synthetic */ SpotHoldingBean OLrzqt;
        public final /* synthetic */ tDW copydefault;

        public Dialog(tOV tov, tDW tdw, SpotHoldingBean spotHoldingBean) {
            this.EZpvd = tov;
            this.copydefault = tdw;
            this.OLrzqt = spotHoldingBean;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            this.EZpvd.djBIcL.postDelayed(this.copydefault.new PendingIntent(this.OLrzqt), 100L);
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tDW.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tDW$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ tDW show$default(ActionBar actionBar, androidx.fragment.app.FragmentManager fragmentManager, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                function1 = null;
            }
            return actionBar.copydefault(fragmentManager, function1);
        }

        public final tDW copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, Function1<? super SpotHoldingBean, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            tDW tdw = new tDW();
            tdw.AhwBna = function1;
            tdw.show(fragmentManager, tDW.class.getSimpleName());
            return tdw;
        }
    }

    public tDW() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.planet.biz_plugin.spot.ui.SpotHoldingsBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_plugin.spot.ui.SpotHoldingsBottomSheet$special$$inlined$viewModels$default$2
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(tDE.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_plugin.spot.ui.SpotHoldingsBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_plugin.spot.ui.SpotHoldingsBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_plugin.spot.ui.SpotHoldingsBottomSheet$special$$inlined$viewModels$default$5
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
        this.djBIcL = -1;
        this.valueOf = true;
        this.OLrzqt = true;
        this.KWHzl = new C43316rmw();
    }

    public final tDE KWHzl() {
        return (tDE) this.AYXKKw.getValue();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        setDynamicFullScreen(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(6);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C47501trL.Fragment.invokespecialsiEkQe));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX));
        this.AEQbTJ = tOV.copydefault(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        EZpvd();
        AEQbTJ();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        android.view.Window window;
        super.onStart();
        android.app.Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(51);
        }
        android.view.View view = getView();
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.setFocusable(false);
            viewGroup.setFocusableInTouchMode(false);
            viewGroup.setDescendantFocusability(393216);
        }
    }

    private final void EZpvd() {
        final tOV tov = this.AEQbTJ;
        if (tov != null) {
            tov.AEQbTJ.KWHzl.setText(C33070mpX.AYXKKw(C47501trL.Fragment.ROgMPW));
            this.KWHzl.register(SpotHoldingBean.class, new C46008tEk(new Function1() { // from class: o.tEb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return tDW.OLrzqt(this.copydefault, tov, (SpotHoldingBean) obj);
                }
            }));
            tov.djBIcL.setLayoutManager(new LinearLayoutManager(requireContext()));
            RecyclerView recyclerView = tov.djBIcL;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            recyclerView.addItemDecoration(new TaskDescription(this, contextRequireContext));
            tov.djBIcL.setAdapter(this.KWHzl);
            tov.djBIcL.setItemAnimator(null);
            C54989xbV c54989xbV = tov.KWHzl;
            c54989xbV.setOnClickListener(new LoaderManager(c54989xbV, 1000L, this));
            C52794wYp c52794wYp = tov.copydefault.copydefault;
            c52794wYp.setOnClickListener(new FragmentManager(c52794wYp, 1000L, this));
        }
    }

    public static final Unit OLrzqt(final tDW tdw, final tOV tov, SpotHoldingBean spotHoldingBean) {
        Intrinsics.checkNotNullParameter(spotHoldingBean, "");
        C32866mlf.onEvent$default("Feeds_Whole_PluginCardExpand_Click", (TrackChannel[]) null, new Function1() { // from class: o.tDV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tDW.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) spotHoldingBean.getTradeAssetPlanetBean().getCostPrice())) {
            tdw.KWHzl().EZpvd(spotHoldingBean, new Function1() { // from class: o.tDZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return tDW.EZpvd(tov, tdw, (SpotHoldingBean) obj);
                }
            }, new Function1() { // from class: o.tDY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return tDW.OLrzqt((java.lang.String) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("plugin_type", "spot_position", true);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(tOV tov, tDW tdw, SpotHoldingBean spotHoldingBean) {
        Intrinsics.checkNotNullParameter(spotHoldingBean, "");
        RecyclerView recyclerView = tov.djBIcL;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.addOnLayoutChangeListener(new Dialog(tov, tdw, spotHoldingBean));
        return Unit.INSTANCE;
    }

    public static final class PendingIntent implements java.lang.Runnable {
        public final /* synthetic */ SpotHoldingBean EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(SpotHoldingBean spotHoldingBean) {
            this.EZpvd = spotHoldingBean;
        }

        @Override // java.lang.Runnable
        public final void run() {
            tDW.this.EZpvd(this.EZpvd);
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ tDW EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, tDW tdw) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = tdw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.KWHzl().AhwBna();
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ tDW OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, tDW tdw) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = tdw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                tDX.Application application = tDX.Companion;
                androidx.fragment.app.FragmentManager childFragmentManager = this.OLrzqt.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                application.KWHzl(childFragmentManager);
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ tDW EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, tDW tdw) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = tdw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Feeds_Btm_PluginCardConfirm_Click", (TrackChannel[]) null, Activity.AEQbTJ, 1, (java.lang.Object) null);
                SpotHoldingBean spotHoldingBeanCopydefault = this.EZpvd.KWHzl().KWHzl().getValue().copydefault();
                if (spotHoldingBeanCopydefault == null) {
                    spotHoldingBeanCopydefault = this.EZpvd.gEmmrt;
                }
                if (spotHoldingBeanCopydefault != null) {
                    Function1 function1 = this.EZpvd.AhwBna;
                    if (function1 != null) {
                        function1.invoke(spotHoldingBeanCopydefault);
                    }
                    this.EZpvd.dismissAllowingStateLoss();
                }
            }
        }
    }

    public static final Unit OLrzqt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    private final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SpotHoldingsBottomSheet$observeViewModel$1(this, null), 3, null);
    }

    public final void EZpvd(tDE.TaskDescription taskDescription) {
        C52794wYp c52794wYpCopydefault;
        java.lang.String strAYXKKw;
        C52794wYp c52794wYpCopydefault2;
        tOV tov = this.AEQbTJ;
        if (tov != null) {
            int i = 0;
            if (taskDescription.AhwBna()) {
                tov.copydefault.getRoot().setVisibility(8);
                tov.EZpvd.setVisibility(8);
                tov.AEQbTJ.getRoot().setVisibility(8);
                tov.OLrzqt.setVisibility(0);
                return;
            }
            if (taskDescription.EZpvd()) {
                tov.OLrzqt.setVisibility(8);
                tov.AEQbTJ.getRoot().setVisibility(8);
                wYF wyf = this.copydefault;
                if (wyf != null) {
                    wyf.setVisibility(8);
                }
                tov.copydefault.getRoot().setVisibility(0);
                tov.EZpvd.setVisibility(8);
                return;
            }
            if (C33129mqd.KWHzl((java.util.Collection) taskDescription.AEQbTJ())) {
                tov.EZpvd.setVisibility(0);
                tov.AEQbTJ.getRoot().setVisibility(8);
            } else {
                tov.EZpvd.setVisibility(8);
                tov.AEQbTJ.getRoot().setVisibility(0);
            }
            wYF wyf2 = this.copydefault;
            if (wyf2 != null) {
                wyf2.setVisibility(0);
            }
            tov.copydefault.getRoot().setVisibility(8);
            tov.OLrzqt.setVisibility(8);
            if (taskDescription.copydefault() != null) {
                wYF wyf3 = this.copydefault;
                if (wyf3 != null && (c52794wYpCopydefault2 = wyf3.copydefault()) != null) {
                    c52794wYpCopydefault2.setEnabled(true);
                }
            } else {
                wYF wyf4 = this.copydefault;
                if (wyf4 != null && (c52794wYpCopydefault = wyf4.copydefault()) != null) {
                    c52794wYpCopydefault.setEnabled(false);
                }
            }
            android.widget.TextView textViewEZpvd = tov.KWHzl.EZpvd();
            if (taskDescription.KWHzl() != null) {
                strAYXKKw = taskDescription.KWHzl();
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.Rtjmuc);
            }
            textViewEZpvd.setText(strAYXKKw);
            java.util.List<?> items = this.KWHzl.getItems();
            if (!(items instanceof java.util.List)) {
                items = null;
            }
            if (items == null) {
                items = yDY.AhwBna();
            }
            java.util.List<SpotHoldingBean> listOLrzqt = taskDescription.OLrzqt();
            this.KWHzl.setItems(listOLrzqt);
            int i2 = -1;
            if (items.isEmpty()) {
                this.KWHzl.notifyDataSetChanged();
                this.djBIcL = -1;
                return;
            }
            if (items.size() != listOLrzqt.size()) {
                this.KWHzl.notifyDataSetChanged();
                this.djBIcL = -1;
                return;
            }
            int i3 = 0;
            for (java.lang.Object obj : listOLrzqt) {
                if (i3 < 0) {
                    yDY.AYXKKw();
                }
                SpotHoldingBean spotHoldingBean = (SpotHoldingBean) obj;
                if (i3 < items.size()) {
                    SpotHoldingBean spotHoldingBean2 = (SpotHoldingBean) items.get(i3);
                    boolean z = !Intrinsics.EZpvd((java.lang.Object) spotHoldingBean2.getTradeAssetPlanetBean().getInstId(), (java.lang.Object) spotHoldingBean.getTradeAssetPlanetBean().getInstId());
                    boolean z2 = spotHoldingBean2.isSelect() != spotHoldingBean.isSelect();
                    boolean z3 = (z2 || z || spotHoldingBean2.getKlineList().size() == spotHoldingBean.getKlineList().size()) ? false : true;
                    boolean z4 = (z2 || z || spotHoldingBean2.isLoadingChatData() == spotHoldingBean.isLoadingChatData()) ? false : true;
                    if (z || z2) {
                        this.KWHzl.notifyItemChanged(i3, "selection_changed");
                    } else if (z3 || z4) {
                        this.KWHzl.notifyItemChanged(i3, "data_loaded");
                    }
                }
                i3++;
            }
            java.util.Iterator<SpotHoldingBean> it = listOLrzqt.iterator();
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
            this.djBIcL = i2;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AEQbTJ = null;
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setVisibility(0);
        this.copydefault = wyf;
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
            c52794wYpCopydefault2.setOnClickListener(new StateListAnimator(c52794wYpCopydefault2, 1000L, this));
        }
    }

    public static final class Activity implements Function1<EventParamsList, Unit> {
        public static final Activity AEQbTJ = new Activity();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            copydefault(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("plugin_type", "spot_position", true);
        }
    }

    public final void EZpvd(SpotHoldingBean spotHoldingBean) {
        RecyclerView recyclerView;
        int i;
        TradeAssetPlanetBean tradeAssetPlanetBean;
        tOV tov = this.AEQbTJ;
        if (tov == null || (recyclerView = tov.djBIcL) == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        java.util.List<?> items = this.KWHzl.getItems();
        if (!(items instanceof java.util.List)) {
            items = null;
        }
        if (items != null) {
            i = 0;
            for (java.lang.Object obj : items) {
                SpotHoldingBean spotHoldingBean2 = obj instanceof SpotHoldingBean ? (SpotHoldingBean) obj : null;
                if (Intrinsics.EZpvd((java.lang.Object) ((spotHoldingBean2 == null || (tradeAssetPlanetBean = spotHoldingBean2.getTradeAssetPlanetBean()) == null) ? null : tradeAssetPlanetBean.getInstId()), (java.lang.Object) spotHoldingBean.getTradeAssetPlanetBean().getInstId())) {
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
            Application application = new Application(recyclerView.getContext());
            application.setTargetPosition(i);
            linearLayoutManager.startSmoothScroll(application);
            return;
        }
        int top = viewFindViewByPosition.getTop();
        int bottom = viewFindViewByPosition.getBottom();
        int height = recyclerView.getHeight();
        int paddingTop = recyclerView.getPaddingTop();
        int paddingBottom = height - recyclerView.getPaddingBottom();
        int itemCount = this.KWHzl.getItemCount();
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

    public static final class Application extends LinearSmoothScroller {
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            return -1;
        }

        public Application(android.content.Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(android.util.DisplayMetrics displayMetrics) {
            Intrinsics.checkNotNullParameter(displayMetrics, "");
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public final class TaskDescription extends RecyclerView.ItemDecoration {
        public final android.content.Context OLrzqt;
        public final /* synthetic */ tDW copydefault;

        public TaskDescription(@NotNull tDW tdw, android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            this.copydefault = tdw;
            this.OLrzqt = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.top = this.OLrzqt.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.zuBGHE);
            }
        }
    }
}

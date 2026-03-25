package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardCardUIModel;
import com.okinc.business.market.features.address_tracker_sa.ui.recommendation.AddressTrackerRecommendationFragment$batchFollow$1;
import com.okinc.business.market.features.address_tracker_sa.ui.recommendation.AddressTrackerRecommendationFragment$checkLoginStatus$2;
import com.okinc.business.market.features.address_tracker_sa.ui.recommendation.AddressTrackerRecommendationFragment$handleLoginFlow$1;
import com.okinc.business.market.features.address_tracker_sa.ui.recommendation.AddressTrackerRecommendationViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C52761wXj;
import o.C6777aVl;
import o.jCJ;
import o.xWS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jDj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C25707jDj extends AbstractC25717jDt {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public C23496hzN AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public Function1<? super java.lang.Boolean, Unit> OLrzqt;
    public jCC copydefault;

    public C25707jDj() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.recommendation.AddressTrackerRecommendationFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.recommendation.AddressTrackerRecommendationFragment$special$$inlined$viewModels$default$2
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AddressTrackerRecommendationViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.recommendation.AddressTrackerRecommendationFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.recommendation.AddressTrackerRecommendationFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.recommendation.AddressTrackerRecommendationFragment$special$$inlined$viewModels$default$5
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
    }

    public final C23496hzN OLrzqt() {
        C23496hzN c23496hzN = this.AEQbTJ;
        Intrinsics.copydefault(c23496hzN);
        return c23496hzN;
    }

    public final AddressTrackerRecommendationViewModel valueOf() {
        return (AddressTrackerRecommendationViewModel) this.KWHzl.getValue();
    }

    public final AbstractC25769jFr djBIcL() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        Intrinsics.copydefault(componentRequireActivity, "");
        return ((InterfaceC25770jFs) componentRequireActivity).AYXKKw();
    }

    /* JADX INFO: renamed from: o.jDj$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jDj.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jDj$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C25707jDj newInstance$default(Application application, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            return application.copydefault(function1);
        }

        public final C25707jDj copydefault(Function1<? super java.lang.Boolean, Unit> function1) {
            C25707jDj c25707jDj = new C25707jDj();
            c25707jDj.OLrzqt = function1;
            return c25707jDj;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.AEQbTJ = C23496hzN.copydefault(layoutInflater, viewGroup, false);
        fetchVPNInfo();
        C52794wYp c52794wYp = OLrzqt().KWHzl;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
        OKReminder oKReminder = OLrzqt().gEmmrt;
        oKReminder.setStyle(0);
        oKReminder.setCloseIconVisibility(false);
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C23274hvD.ActionBar.QKVWgx);
        if (drawableKWHzl != null) {
            drawableKWHzl.setTint(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        } else {
            drawableKWHzl = null;
        }
        oKReminder.setLeadingIconVisibility(true);
        oKReminder.setLeadingIcon(drawableKWHzl);
        oKReminder.setMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.trackPipAnimationHintViewpositionInWindow));
        Intrinsics.copydefault(oKReminder);
        oKReminder.setVisibility(0);
        OLrzqt().EZpvd.setRetryClickListener(new View.OnClickListener() { // from class: o.jDm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C25707jDj.OLrzqt(this.EZpvd, view);
            }
        });
        OLrzqt().copydefault.setOKDSType(260);
        C52794wYp c52794wYp2 = OLrzqt().copydefault;
        c52794wYp2.setOnClickListener(new TaskDescription(c52794wYp2, 1000L, this));
        ConstraintLayout root = OLrzqt().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    /* JADX INFO: renamed from: o.jDj$Activity */
    public static final class Activity implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        public final void copydefault() {
            C25707jDj.this.AEQbTJ();
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }
    }

    public static final void OLrzqt(C25707jDj c25707jDj, android.view.View view) {
        c25707jDj.valueOf().KWHzl(c25707jDj.valueOf().OLrzqt().getValue().EZpvd());
    }

    private final void fetchVPNInfo() {
        C23496hzN c23496hzNOLrzqt = OLrzqt();
        c23496hzNOLrzqt.valueOf.addItemDecoration(new C57593ylO(C55298xhM.dpInt$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null), false, false));
        c23496hzNOLrzqt.valueOf.setItemAnimator(null);
        c23496hzNOLrzqt.valueOf.setLayoutManager(new LinearLayoutManager(requireContext()));
        this.copydefault = new jCC(new Function1() { // from class: o.jDn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25707jDj.EZpvd(this.OLrzqt, (jCJ) obj);
            }
        });
        c23496hzNOLrzqt.valueOf.setLayoutManager(new LinearLayoutManager(requireContext()));
        c23496hzNOLrzqt.valueOf.setAdapter(this.copydefault);
    }

    public static final Unit EZpvd(C25707jDj c25707jDj, jCJ jcj) {
        Intrinsics.checkNotNullParameter(jcj, "");
        if (jcj instanceof jCJ.ActionBar) {
            c25707jDj.KWHzl(((jCJ.ActionBar) jcj).AEQbTJ());
        } else if (jcj instanceof jCJ.Activity) {
            jBN.trackLeaderboardPageClick$default(jBN.copydefault, DexTrackEventParameter.LeaderBoardButtonName.ADDRESS_INFO_CARD, null, null, false, 14, null);
            c25707jDj.copydefault(((jCJ.Activity) jcj).AEQbTJ().getWalletAddress());
        } else if (jcj instanceof jCJ.TaskDescription) {
            c25707jDj.valueOf().copydefault(((jCJ.TaskDescription) jcj).copydefault());
            C32866mlf.onEvent$default("DEXMarket_Tracker_FollowingRecommended_Click", (TrackChannel[]) null, new Function1() { // from class: o.jDp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C25707jDj.AEQbTJ((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        } else if (!(jcj instanceof jCJ.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    private final void KWHzl(java.lang.String str) {
        java.lang.String message;
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(android.net.Uri.parse(str));
            android.content.Context context = getContext();
            if (context != null) {
                context.startActivity(intent);
            }
        } catch (java.lang.Exception e) {
            C6777aVl.TaskDescription taskDescription = C6777aVl.Companion;
            java.lang.Throwable cause = e.getCause();
            if (cause == null || (message = cause.getMessage()) == null) {
                message = "";
            }
            taskDescription.EZpvd(new java.lang.Exception("openSystemWebView:" + message + ">>>>>>>>" + str));
        }
    }

    private final void copydefault(java.lang.String str) {
        xWS xws;
        FragmentActivity activity = getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null || (xws = (xWS) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(xWS.class))) == null) {
            return;
        }
        xWS.Application.routeProfileAssetPage$default(xws, abstractActivityC33041mov, str, 0L, 4, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C25390ivn.collectOnViewLifecycle$default(this, valueOf().OLrzqt(), null, new StateListAnimator(), 2, null);
        valueOf().KWHzl(0);
    }

    /* JADX INFO: renamed from: o.jDj$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C25718jDu c25718jDu, Continuation<? super Unit> continuation) {
            C25707jDj.this.AEQbTJ(c25718jDu);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AEQbTJ = null;
    }

    /* JADX INFO: renamed from: o.jDj$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C25707jDj copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C25707jDj c25707jDj) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c25707jDj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C25707jDj c25707jDj = this.copydefault;
                c25707jDj.copydefault(c25707jDj.new Activity());
            }
        }
    }

    /* JADX INFO: renamed from: o.jDj$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C25707jDj copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C25707jDj c25707jDj) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = c25707jDj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C32866mlf.onEvent$default("DEXMarket_Tracker_EmptyViewAll_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                jFF jffOLrzqt = jFF.Companion.OLrzqt();
                androidx.fragment.app.FragmentManager parentFragmentManager = this.copydefault.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                jffOLrzqt.show(parentFragmentManager);
            }
        }
    }

    public final void AEQbTJ(C25718jDu c25718jDu) {
        boolean z = false;
        boolean z2 = (c25718jDu.copydefault() || c25718jDu.AEQbTJ() || c25718jDu.KWHzl()) ? false : true;
        C55173xeu c55173xeu = OLrzqt().EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(c25718jDu.KWHzl() ? 0 : 8);
        NestedScrollView nestedScrollView = OLrzqt().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
        nestedScrollView.setVisibility(z2 ? 0 : 8);
        C55113xdn c55113xdn = OLrzqt().AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(c25718jDu.copydefault() ? 0 : 8);
        if (c25718jDu.KWHzl()) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        if (z2) {
            C55113xdn c55113xdn2 = OLrzqt().AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
            c55113xdn2.setVisibility(8);
            jCC jcc = this.copydefault;
            if (jcc != null) {
                jcc.OLrzqt(c25718jDu.OLrzqt(), c25718jDu.EZpvd(), c25718jDu.OLrzqt().size(), null);
            }
            C52794wYp c52794wYp = OLrzqt().KWHzl;
            java.util.List<LeaderBoardCardUIModel> listOLrzqt = c25718jDu.OLrzqt();
            if (!(listOLrzqt instanceof java.util.Collection) || !listOLrzqt.isEmpty()) {
                java.util.Iterator<T> it = listOLrzqt.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((LeaderBoardCardUIModel) it.next()).isSelected()) {
                        z = true;
                        break;
                    }
                }
            }
            c52794wYp.setEnabled(z);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jDj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkLoginStatus$default(C25707jDj c25707jDj, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = new Function0() { // from class: o.jDg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C25707jDj.KWHzl();
                }
            };
        }
        c25707jDj.copydefault((Function0<Unit>) function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(Function0<Unit> function0) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AddressTrackerRecommendationFragment$checkLoginStatus$2(this, function0, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(Function0<Unit> function0) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AddressTrackerRecommendationFragment$handleLoginFlow$1(this, function0, null), 3, null);
    }

    public final void AEQbTJ() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AddressTrackerRecommendationFragment$batchFollow$1(this, null), 3, null);
    }
}

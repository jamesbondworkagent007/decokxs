package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.components.track.TrackChannel;
import com.okinc.planet.biz_content.leaderboard.PlanetFollowingFragment$initView$1$2$onAvatarClick$1;
import com.okinc.planet.biz_content.leaderboard.PlanetFollowingFragment$observeViewModel$1;
import com.okinc.planet.biz_content.leaderboard.bean.FollowingUser;
import com.okinc.planet.biz_home.feed_tab.FeedPage;
import com.okinc.planet.biz_home.root.PlanetSubPage;
import com.okinc.rxutils.RxBus;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47501trL;
import o.C47664tuQ;
import o.C47699tuz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ttx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47644ttx extends AbstractC32996moC {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public tNL AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public boolean KWHzl;
    public final InterfaceC56387yDm gEmmrt;
    public InterfaceC58217yxC valueOf;
    public final InterfaceC56387yDm values;
    public boolean copydefault = true;
    public int AYXKKw = 10;
    public int djBIcL = -1;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.ttw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C47644ttx.djBIcL(this.AEQbTJ);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C47501trL.Application.DAIeex;
    }

    public C47644ttx() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetFollowingFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetFollowingFragment$special$$inlined$viewModels$default$2
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C47665tuR.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetFollowingFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetFollowingFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetFollowingFragment$special$$inlined$viewModels$default$5
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
        final Function0 function03 = new Function0() { // from class: o.ttt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47644ttx.AhwBna(this.copydefault);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetFollowingFragment$special$$inlined$viewModels$default$6
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C47664tuQ.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetFollowingFragment$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetFollowingFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetFollowingFragment$special$$inlined$viewModels$default$9
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C47911tyz.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetFollowingFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetFollowingFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetFollowingFragment$special$$inlined$activityViewModels$default$3
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
    }

    /* JADX INFO: renamed from: o.ttx$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ttx.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    private final InterfaceC7298ahG valueOf() {
        return C7323ahf.KWHzl();
    }

    public final void copydefault(int i) {
        if (this.AYXKKw == i) {
            return;
        }
        int iCopydefault = C56548yJl.copydefault(i, 0);
        this.AYXKKw = iCopydefault;
        AEQbTJ().OLrzqt(iCopydefault, java.lang.Math.min(AEQbTJ().EZpvd().size(), iCopydefault) > 0);
    }

    public final C47699tuz AEQbTJ() {
        return (C47699tuz) this.OLrzqt.getValue();
    }

    public static final C47699tuz djBIcL(C47644ttx c47644ttx) {
        C47699tuz c47699tuz = new C47699tuz();
        c47699tuz.copydefault(c47644ttx.AYXKKw);
        return c47699tuz;
    }

    public final C47665tuR EZpvd() {
        return (C47665tuR) this.values.getValue();
    }

    public static final ViewModelStoreOwner AhwBna(C47644ttx c47644ttx) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c47644ttx.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    public final C47664tuQ OLrzqt() {
        return (C47664tuQ) this.gEmmrt.getValue();
    }

    public final C47911tyz KWHzl() {
        return (C47911tyz) this.AhwBna.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        tNL tnlEZpvd = tNL.EZpvd(view);
        this.AEQbTJ = tnlEZpvd;
        if (tnlEZpvd != null) {
            tnlEZpvd.copydefault.setMinFrame(1);
            tnlEZpvd.AEQbTJ.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
            tnlEZpvd.AEQbTJ.setAdapter(AEQbTJ());
            tnlEZpvd.AEQbTJ.addItemDecoration(new Activity(getResources().getDimensionPixelSize(C47501trL.StateListAnimator.copydefault)));
            AEQbTJ().copydefault(new StateListAnimator());
            AEQbTJ().AEQbTJ(new ActionBar());
            tnlEZpvd.AEQbTJ.setNestedScrollingEnabled(false);
        }
        AhwBna();
        djBIcL();
    }

    /* JADX INFO: renamed from: o.ttx$Activity */
    public static final class Activity extends RecyclerView.ItemDecoration {
        public final /* synthetic */ int OLrzqt;

        public Activity(int i) {
            this.OLrzqt = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            rect.right = childAdapterPosition == (adapter != null ? adapter.getItemCount() + (-1) : -1) ? 0 : this.OLrzqt;
        }
    }

    /* JADX INFO: renamed from: o.ttx$StateListAnimator */
    public static final class StateListAnimator implements C47699tuz.ActionBar {
        public StateListAnimator() {
        }

        @Override // o.C47699tuz.ActionBar
        public void KWHzl(FollowingUser followingUser, boolean z) {
            Intrinsics.checkNotNullParameter(followingUser, "");
            if (z) {
                C46374tRz.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(C47644ttx.this), null, null, new PlanetFollowingFragment$initView$1$2$onAvatarClick$1(C47644ttx.this, followingUser, null), 3, null);
                return;
            }
            C32866mlf.onEvent$default("orbit_page_following_profile_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            C46447tUr c46447tUr = C46447tUr.KWHzl;
            android.content.Context contextRequireContext = C47644ttx.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            java.lang.String authorId = followingUser.getAuthorId();
            C46447tUr.openPlanetUserProfilePage$default(c46447tUr, contextRequireContext, "", authorId == null ? "" : authorId, "", "", "", C56424yEw.KWHzl(), null, 128, null);
        }
    }

    /* JADX INFO: renamed from: o.ttx$ActionBar */
    public static final class ActionBar implements C47699tuz.Activity {
        public ActionBar() {
        }

        @Override // o.C47699tuz.Activity
        public void EZpvd() {
            C47644ttx.this.copydefault();
        }
    }

    public final void copydefault() {
        C32866mlf.onEvent$default("orbit_page_more_following_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        KWHzl().EZpvd(FeedPage.FOLLOWING.ordinal());
        KWHzl().EZpvd(PlanetSubPage.FEED);
    }

    public final void AYXKKw() {
        LottieAnimationView lottieAnimationView;
        android.widget.LinearLayout linearLayout;
        LottieAnimationView lottieAnimationView2;
        if (this.copydefault) {
            this.djBIcL = this.AYXKKw;
            if (OLrzqt().OLrzqt().getValue().AhwBna() && !OLrzqt().AEQbTJ()) {
                tNL tnl = this.AEQbTJ;
                if (tnl != null && (lottieAnimationView2 = tnl.copydefault) != null) {
                    lottieAnimationView2.setVisibility(0);
                }
                tNL tnl2 = this.AEQbTJ;
                if (tnl2 != null && (linearLayout = tnl2.EZpvd) != null) {
                    linearLayout.setVisibility(8);
                }
                tNL tnl3 = this.AEQbTJ;
                if (tnl3 != null && (lottieAnimationView = tnl3.copydefault) != null) {
                    lottieAnimationView.playAnimation();
                }
            }
            EZpvd().KWHzl(java.lang.Integer.valueOf(this.AYXKKw));
        }
    }

    public final void djBIcL() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C46187tLa.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.ttC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47644ttx.OLrzqt(this.copydefault, (C46187tLa) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ttz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C47644ttx.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.ttB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47644ttx.OLrzqt((java.lang.Throwable) obj);
            }
        };
        this.valueOf = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.tty
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C47644ttx.copydefault(function12, obj);
            }
        });
        InterfaceC7298ahG interfaceC7298ahGValueOf = valueOf();
        if (interfaceC7298ahGValueOf != null) {
            interfaceC7298ahGValueOf.EZpvd("follow_button_update_status_listener", new Application(), "follow_status_listener_following_fragment");
        }
        InterfaceC7298ahG interfaceC7298ahGValueOf2 = valueOf();
        if (interfaceC7298ahGValueOf2 != null) {
            interfaceC7298ahGValueOf2.EZpvd("MARKET_FEED_PROFILE_OPEN_RESULT_NOTIFICATION", new LoaderManager(), "profile_open_listener_following_fragment");
        }
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C47644ttx c47644ttx, C46187tLa c46187tLa) {
        c47644ttx.copydefault(c46187tLa.KWHzl(), c46187tLa.OLrzqt(), c46187tLa.copydefault(), c46187tLa.AEQbTJ());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o.ttx$Application */
    public static final class Application implements InterfaceC7835arN {
        @Override // o.InterfaceC8024aus
        public void OLrzqt() {
        }

        public Application() {
        }

        @Override // o.InterfaceC7835arN
        public boolean EZpvd(java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            pUU.EZpvd("mLuaMLSAdapterContainer", "following_follow");
            if (!(objArr.length == 0)) {
                java.lang.Object obj = objArr[0];
                if (obj instanceof java.util.Map) {
                    Intrinsics.copydefault(obj, "");
                    java.util.Map map = (java.util.Map) obj;
                    java.lang.Object obj2 = map.get("authorId");
                    java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                    java.lang.Object obj3 = map.get("isFollowing");
                    java.lang.Boolean bool = obj3 instanceof java.lang.Boolean ? (java.lang.Boolean) obj3 : null;
                    java.lang.Object obj4 = map.get("nickName");
                    java.lang.String str2 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
                    java.lang.Object obj5 = map.get("portrait");
                    java.lang.String str3 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
                    if (str != null && bool != null) {
                        C47644ttx.this.copydefault(str, bool.booleanValue(), str2, str3);
                    }
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: o.ttx$LoaderManager */
    public static final class LoaderManager implements InterfaceC7835arN {
        @Override // o.InterfaceC8024aus
        public void OLrzqt() {
        }

        public LoaderManager() {
        }

        @Override // o.InterfaceC7835arN
        public boolean EZpvd(java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            pUU.EZpvd("mLuaMLSAdapterContainer", "following_open");
            if (!(objArr.length == 0)) {
                java.lang.Object obj = objArr[0];
                if (obj instanceof java.util.Map) {
                    Intrinsics.copydefault(obj, "");
                    java.lang.Object obj2 = ((java.util.Map) obj).get("authorId");
                    java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                    if (str != null && str.length() != 0) {
                        C47644ttx.this.EZpvd().EZpvd(str);
                    }
                }
            }
            return true;
        }
    }

    public static /* synthetic */ void handleFollowEvent$default(C47644ttx c47644ttx, java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        c47644ttx.copydefault(str, z, str2, str3);
    }

    public final void copydefault(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3) {
        if (z) {
            EZpvd().OLrzqt(new FollowingUser(str, str3, str2, (java.lang.Integer) null, (java.lang.String) null, "1", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 472, (DefaultConstructorMarker) null));
        } else if (EZpvd().KWHzl(str)) {
            C47665tuR.refreshFollowingListAfterLastRemoval$default(EZpvd(), null, 1, null);
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.copydefault) {
            C47664tuQ.TaskDescription value = OLrzqt().OLrzqt().getValue();
            boolean z = this.AYXKKw > this.djBIcL;
            if (!value.EZpvd() || z) {
                this.djBIcL = this.AYXKKw;
                EZpvd().KWHzl(java.lang.Integer.valueOf(this.AYXKKw));
            }
        }
    }

    private final void AhwBna() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new PlanetFollowingFragment$observeViewModel$1(this, null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.valueOf = null;
        InterfaceC7298ahG interfaceC7298ahGValueOf = valueOf();
        if (interfaceC7298ahGValueOf != null) {
            interfaceC7298ahGValueOf.OLrzqt("follow_button_update_status_listener", "follow_status_listener_following_fragment");
        }
        InterfaceC7298ahG interfaceC7298ahGValueOf2 = valueOf();
        if (interfaceC7298ahGValueOf2 != null) {
            interfaceC7298ahGValueOf2.OLrzqt("MARKET_FEED_PROFILE_OPEN_RESULT_NOTIFICATION", "profile_open_listener_following_fragment");
        }
        this.AEQbTJ = null;
    }
}

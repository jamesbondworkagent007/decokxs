package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.planet.biz_content.leaderboard.PlanetTopOrbitersFragment$observeViewModel$1;
import com.okinc.planet.biz_content.leaderboard.bean.TopOrbiter;
import com.okinc.planet.biz_onboarding.OrbitEditProfileScenario;
import com.okinc.rxutils.RxBus;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47501trL;
import o.C47608ttN;
import o.C47651tuD;
import o.C47664tuQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ttN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47608ttN extends AbstractC32996moC {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public C46270tOc AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public InterfaceC58217yxC AhwBna;
    public boolean EZpvd;
    public final InterfaceC56387yDm gEmmrt;
    public boolean copydefault = true;
    public int djBIcL = 5;
    public int valueOf = -1;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.ttS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C47608ttN.gEmmrt(this.EZpvd);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C47501trL.Application.RdAHlO;
    }

    public C47608ttN() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetTopOrbitersFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetTopOrbitersFragment$special$$inlined$viewModels$default$2
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C47669tuV.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetTopOrbitersFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetTopOrbitersFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetTopOrbitersFragment$special$$inlined$viewModels$default$5
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
        final Function0 function03 = new Function0() { // from class: o.ttU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47608ttN.isConnected(this.EZpvd);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetTopOrbitersFragment$special$$inlined$viewModels$default$6
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C47664tuQ.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetTopOrbitersFragment$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetTopOrbitersFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetTopOrbitersFragment$special$$inlined$viewModels$default$9
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
    }

    /* JADX INFO: renamed from: o.ttN$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ttN.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    private final InterfaceC7298ahG KWHzl() {
        return C7323ahf.KWHzl();
    }

    public final void EZpvd(int i) {
        RecyclerView recyclerView;
        if (this.djBIcL != i) {
            this.djBIcL = C56548yJl.copydefault(i, 0);
            copydefault().OLrzqt(this.djBIcL);
            C46270tOc c46270tOc = this.AEQbTJ;
            if (c46270tOc == null || (recyclerView = c46270tOc.AEQbTJ) == null) {
                return;
            }
            recyclerView.post(new java.lang.Runnable() { // from class: o.ttW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C47608ttN.AEQbTJ(this.EZpvd);
                }
            });
        }
    }

    public static final void AEQbTJ(C47608ttN c47608ttN) {
        RecyclerView recyclerView;
        C46270tOc c46270tOc = c47608ttN.AEQbTJ;
        if (c46270tOc == null || (recyclerView = c46270tOc.AEQbTJ) == null) {
            return;
        }
        recyclerView.requestLayout();
    }

    public final C47651tuD copydefault() {
        return (C47651tuD) this.KWHzl.getValue();
    }

    public static final C47651tuD gEmmrt(C47608ttN c47608ttN) {
        C47651tuD c47651tuD = new C47651tuD();
        c47651tuD.OLrzqt(c47608ttN.djBIcL);
        return c47651tuD;
    }

    public final C47669tuV EZpvd() {
        return (C47669tuV) this.AYXKKw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C47664tuQ OLrzqt() {
        return (C47664tuQ) this.gEmmrt.getValue();
    }

    public static final ViewModelStoreOwner isConnected(C47608ttN c47608ttN) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c47608ttN.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C46270tOc c46270tOcCopydefault = C46270tOc.copydefault(view);
        this.AEQbTJ = c46270tOcCopydefault;
        if (c46270tOcCopydefault != null) {
            c46270tOcCopydefault.EZpvd.setContentDescription("topOrbiters");
            ConstraintLayout constraintLayout = c46270tOcCopydefault.EZpvd;
            constraintLayout.setOnClickListener(new Activity(constraintLayout, 1000L, this));
            c46270tOcCopydefault.OLrzqt.setMinFrame(1);
            c46270tOcCopydefault.AEQbTJ.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
            c46270tOcCopydefault.AEQbTJ.setAdapter(copydefault());
            int dimensionPixelSize = getResources().getDimensionPixelSize(C47501trL.StateListAnimator.djBIcL);
            c46270tOcCopydefault.AEQbTJ.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            c46270tOcCopydefault.AEQbTJ.setClipToPadding(false);
            c46270tOcCopydefault.AEQbTJ.addItemDecoration(new ActionBar(getResources().getDimensionPixelSize(C47501trL.StateListAnimator.KWHzl)));
            copydefault().KWHzl(new StateListAnimator());
            c46270tOcCopydefault.AEQbTJ.setNestedScrollingEnabled(false);
        }
        AYXKKw();
        AhwBna();
    }

    /* JADX INFO: renamed from: o.ttN$ActionBar */
    public static final class ActionBar extends RecyclerView.ItemDecoration {
        public final /* synthetic */ int OLrzqt;

        public ActionBar(int i) {
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

    /* JADX INFO: renamed from: o.ttN$StateListAnimator */
    public static final class StateListAnimator implements C47651tuD.Application {
        public StateListAnimator() {
        }

        public static final void AEQbTJ(final C52794wYp c52794wYp, final C47608ttN c47608ttN, final java.lang.String str, final TopOrbiter topOrbiter, final C47651tuD.TaskDescription taskDescription, final boolean z) {
            C32866mlf.onEvent$default("Orbit_Page_Toporbiter_Click", (TrackChannel[]) null, new Function1() { // from class: o.ttX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C47608ttN.StateListAnimator.OLrzqt(z, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            c52794wYp.OLrzqt(0L);
            c47608ttN.EZpvd().copydefault(z, str, new Function2() { // from class: o.tub
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C47608ttN.StateListAnimator.OLrzqt(c52794wYp, topOrbiter, c47608ttN, taskDescription, str, ((java.lang.Boolean) obj).booleanValue(), (OKServerException) obj2);
                }
            });
        }

        public static final Unit OLrzqt(boolean z, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "follow", z ? "followed" : "unfollow", false, 4, null);
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(C52794wYp c52794wYp, TopOrbiter topOrbiter, C47608ttN c47608ttN, C47651tuD.TaskDescription taskDescription, java.lang.String str, boolean z, OKServerException oKServerException) {
            java.lang.String strEZpvd;
            c52794wYp.fIwbmz();
            if (z) {
                topOrbiter.setHasFollowedThisUser(!topOrbiter.getHasFollowedThisUser());
                if (topOrbiter.getHasFollowedThisUser()) {
                    topOrbiter.setFollowStatus("1");
                    C55326xho.toastWithSuccessfulIcon$default(C33069mpW.copydefault(c47608ttN, C47501trL.Fragment.DztXDE, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("name", C33129mqd.gEmmrt(topOrbiter.getNickName())))), 0, 1, (java.lang.Object) null);
                    java.lang.Long followerCount = topOrbiter.getFollowerCount();
                    taskDescription.copydefault(java.lang.Long.valueOf((followerCount != null ? followerCount.longValue() : 0L) + 1));
                } else {
                    topOrbiter.setFollowStatus("0");
                    java.lang.Long followerCount2 = topOrbiter.getFollowerCount();
                    if ((followerCount2 != null ? followerCount2.longValue() : 0L) - 1 >= 0) {
                        java.lang.Long followerCount3 = topOrbiter.getFollowerCount();
                        jLongValue = (followerCount3 != null ? followerCount3.longValue() : 0L) - 1;
                    }
                    taskDescription.copydefault(java.lang.Long.valueOf(jLongValue));
                }
                RxBus.AEQbTJ(new C46187tLa(Intrinsics.EZpvd((java.lang.Object) topOrbiter.getFollowStatus(), (java.lang.Object) "1"), str, topOrbiter.getNickName(), topOrbiter.getPortrait(), "TopOrbit"));
                c52794wYp.setText(C33070mpX.AYXKKw(topOrbiter.getHasFollowedThisUser() ? C47501trL.Fragment.Hx : C47501trL.Fragment.DcMfJKfNUfqk));
            } else if (oKServerException != null && oKServerException.getCode() == 50034 && C46437tUh.OLrzqt.AEQbTJ()) {
                tKX tkxOLrzqt = tKX.Companion.OLrzqt();
                FragmentActivity fragmentActivityRequireActivity = c47608ttN.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                tKX.openProfileEditPage$default(tkxOLrzqt, fragmentActivityRequireActivity, OrbitEditProfileScenario.CompleteOrbiterProfile.KWHzl, true, null, 8, null);
            } else if (oKServerException != null && (strEZpvd = tRK.EZpvd(oKServerException)) != null) {
                C55326xho.toastWithFailedIcon$default(strEZpvd, 0, 1, (java.lang.Object) null);
            }
            return Unit.INSTANCE;
        }

        @Override // o.C47651tuD.Application
        public void OLrzqt(final C52794wYp c52794wYp, final java.lang.String str, final TopOrbiter topOrbiter, final C47651tuD.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(c52794wYp, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(topOrbiter, "");
            Intrinsics.checkNotNullParameter(taskDescription, "");
            if (topOrbiter.getHasFollowedThisUser()) {
                android.content.Context contextRequireContext = C47608ttN.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                final C47608ttN c47608ttN = C47608ttN.this;
                viewOnClickListenerC54939xaY.EZpvd(0);
                viewOnClickListenerC54939xaY.setTitle(C33069mpW.copydefault(C47501trL.Fragment.bindToGooglePlayService, C56423yEv.EZpvd(C56390yDp.OLrzqt("name", C33129mqd.gEmmrt(topOrbiter.getNickName())))));
                viewOnClickListenerC54939xaY.copydefault(C47501trL.Fragment.DfrfUJ);
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C47501trL.Fragment.fJNWhG), new View.OnClickListener() { // from class: o.ttV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C47608ttN.StateListAnimator.KWHzl(viewOnClickListenerC54939xaY, c52794wYp, c47608ttN, str, topOrbiter, taskDescription, view);
                    }
                });
                ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C33070mpX.AYXKKw(C47501trL.Fragment.ejfBZ), (View.OnClickListener) null, 2, (java.lang.Object) null);
                viewOnClickListenerC54939xaY.show();
                return;
            }
            if (C46388tSm.Companion.KWHzl().AYXKKw()) {
                tTY.EZpvd.copydefault(tUB.copydefault.EZpvd(), C33070mpX.AYXKKw(C47501trL.Fragment.call));
                return;
            }
            final tKX tkxOLrzqt = tKX.Companion.OLrzqt();
            FragmentActivity fragmentActivityRequireActivity = C47608ttN.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            final C47608ttN c47608ttN2 = C47608ttN.this;
            tkxOLrzqt.OLrzqt(fragmentActivityRequireActivity, null, true, new Function0() { // from class: o.ttY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C47608ttN.StateListAnimator.AEQbTJ(tkxOLrzqt, c47608ttN2, c52794wYp, str, topOrbiter, taskDescription);
                }
            });
        }

        public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, C52794wYp c52794wYp, C47608ttN c47608ttN, java.lang.String str, TopOrbiter topOrbiter, C47651tuD.TaskDescription taskDescription, android.view.View view) {
            AEQbTJ(c52794wYp, c47608ttN, str, topOrbiter, taskDescription, false);
            viewOnClickListenerC54939xaY.dismiss();
        }

        public static final Unit AEQbTJ(tKX tkx, final C47608ttN c47608ttN, final C52794wYp c52794wYp, final java.lang.String str, final TopOrbiter topOrbiter, final C47651tuD.TaskDescription taskDescription) {
            FragmentActivity fragmentActivityRequireActivity = c47608ttN.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            tKX.checkProfileModified$default(tkx, fragmentActivityRequireActivity, OrbitEditProfileScenario.CompleteOrbiterProfile.KWHzl, true, new Function0() { // from class: o.tua
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C47608ttN.StateListAnimator.AEQbTJ(c52794wYp, c47608ttN, str, topOrbiter, taskDescription);
                }
            }, null, 16, null);
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(C52794wYp c52794wYp, C47608ttN c47608ttN, java.lang.String str, TopOrbiter topOrbiter, C47651tuD.TaskDescription taskDescription) {
            AEQbTJ(c52794wYp, c47608ttN, str, topOrbiter, taskDescription, true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.ttN$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C47608ttN AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C47608ttN c47608ttN) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c47608ttN;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Orbit_Page_Moretoporbiter_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                C43056riA c43056riA = C43056riA.AEQbTJ;
                android.content.Context contextRequireContext = this.AEQbTJ.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                c43056riA.copydefault(contextRequireContext, "market", "/feed/topOrbiters", C56424yEw.gEmmrt(C56390yDp.OLrzqt("fromPage", "top_orbiter"), C56390yDp.OLrzqt("feedType", "")));
            }
        }
    }

    public final void AEQbTJ() {
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        RecyclerView recyclerView;
        ConstraintLayout constraintLayout;
        if (this.copydefault) {
            this.valueOf = this.djBIcL;
            if (OLrzqt().OLrzqt().getValue().AhwBna() && !OLrzqt().AYXKKw()) {
                C46270tOc c46270tOc = this.AEQbTJ;
                if (c46270tOc != null && (constraintLayout = c46270tOc.EZpvd) != null) {
                    constraintLayout.setVisibility(8);
                }
                C46270tOc c46270tOc2 = this.AEQbTJ;
                if (c46270tOc2 != null && (recyclerView = c46270tOc2.AEQbTJ) != null) {
                    recyclerView.setVisibility(8);
                }
                C46270tOc c46270tOc3 = this.AEQbTJ;
                if (c46270tOc3 != null && (lottieAnimationView2 = c46270tOc3.OLrzqt) != null) {
                    lottieAnimationView2.setVisibility(0);
                }
                C46270tOc c46270tOc4 = this.AEQbTJ;
                if (c46270tOc4 != null && (lottieAnimationView = c46270tOc4.OLrzqt) != null) {
                    lottieAnimationView.playAnimation();
                }
            }
            EZpvd().OLrzqt(java.lang.String.valueOf(this.djBIcL));
        }
    }

    private final void AhwBna() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C46187tLa.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.ttP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47608ttN.KWHzl(this.EZpvd, (C46187tLa) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ttO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C47608ttN.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.ttR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47608ttN.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        this.AhwBna = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ttT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C47608ttN.OLrzqt(function12, obj);
            }
        });
        InterfaceC7298ahG interfaceC7298ahGKWHzl = KWHzl();
        if (interfaceC7298ahGKWHzl != null) {
            interfaceC7298ahGKWHzl.EZpvd("follow_button_update_status_listener", new TaskDescription(), "follow_status_listener_topOrbit_fragment");
        }
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C47608ttN c47608ttN, C46187tLa c46187tLa) {
        if (!Intrinsics.EZpvd((java.lang.Object) c46187tLa.EZpvd(), (java.lang.Object) "TopOrbit")) {
            java.lang.String strKWHzl = c46187tLa.KWHzl();
            boolean zOLrzqt = c46187tLa.OLrzqt();
            java.util.List<TopOrbiter> list = (java.util.List) CollectionsKt___CollectionsKt.wlaJM(c47608ttN.EZpvd().KWHzl().getReplayCache());
            if (list != null) {
                for (TopOrbiter topOrbiter : list) {
                    if (Intrinsics.EZpvd((java.lang.Object) topOrbiter.getAuthorId(), (java.lang.Object) strKWHzl)) {
                        if (zOLrzqt) {
                            topOrbiter.setFollowStatus("1");
                            topOrbiter.setFollowerCount(java.lang.Long.valueOf(C33129mqd.valueOf(topOrbiter.getFollowerCount()) + 1));
                        } else {
                            topOrbiter.setFollowStatus("0");
                            topOrbiter.setFollowerCount(java.lang.Long.valueOf(C33129mqd.valueOf(topOrbiter.getFollowerCount()) - 1 >= 0 ? C33129mqd.valueOf(topOrbiter.getFollowerCount()) - 1 : 0L));
                        }
                    }
                }
                c47608ttN.copydefault().OLrzqt(list);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o.ttN$TaskDescription */
    public static final class TaskDescription implements InterfaceC7835arN {
        @Override // o.InterfaceC8024aus
        public void OLrzqt() {
        }

        public TaskDescription() {
        }

        @Override // o.InterfaceC7835arN
        public boolean EZpvd(java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            pUU.EZpvd("mLuaMLSAdapterContainer", "orbits_follow");
            if (!(objArr.length == 0)) {
                java.lang.Object obj = objArr[0];
                if (obj instanceof java.util.Map) {
                    Intrinsics.copydefault(obj, "");
                    java.util.Map map = (java.util.Map) obj;
                    java.lang.Object obj2 = map.get("authorId");
                    java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                    java.lang.Object obj3 = map.get("isFollowing");
                    java.lang.Boolean bool = obj3 instanceof java.lang.Boolean ? (java.lang.Boolean) obj3 : null;
                    java.util.List<TopOrbiter> list = (java.util.List) CollectionsKt___CollectionsKt.wlaJM(C47608ttN.this.EZpvd().KWHzl().getReplayCache());
                    if (list != null) {
                        C47608ttN c47608ttN = C47608ttN.this;
                        for (TopOrbiter topOrbiter : list) {
                            if (str != null && bool != null && Intrinsics.EZpvd((java.lang.Object) topOrbiter.getAuthorId(), (java.lang.Object) str)) {
                                if (bool.booleanValue()) {
                                    topOrbiter.setFollowStatus("1");
                                    topOrbiter.setFollowerCount(java.lang.Long.valueOf(C33129mqd.valueOf(topOrbiter.getFollowerCount()) + 1));
                                } else {
                                    topOrbiter.setFollowStatus("0");
                                    topOrbiter.setFollowerCount(java.lang.Long.valueOf(C33129mqd.valueOf(topOrbiter.getFollowerCount()) - 1 >= 0 ? C33129mqd.valueOf(topOrbiter.getFollowerCount()) - 1 : 0L));
                                }
                            }
                        }
                        c47608ttN.copydefault().OLrzqt(list);
                    }
                }
            }
            return true;
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.copydefault) {
            C47664tuQ.TaskDescription value = OLrzqt().OLrzqt().getValue();
            boolean z = this.djBIcL > this.valueOf;
            if (!value.OLrzqt() || z) {
                this.valueOf = this.djBIcL;
                EZpvd().OLrzqt(java.lang.String.valueOf(this.djBIcL));
            }
        }
    }

    private final void AYXKKw() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new PlanetTopOrbitersFragment$observeViewModel$1(this, null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        InterfaceC58217yxC interfaceC58217yxC = this.AhwBna;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.AhwBna = null;
    }
}

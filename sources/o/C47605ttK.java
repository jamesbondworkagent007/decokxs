package o;

import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.planet.biz_content.leaderboard.PlanetSpotlightFragment$observeViewModel$1;
import com.okinc.planet.biz_content.leaderboard.bean.SpotlightToken;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ttK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47605ttK extends AbstractC32996moC {
    public final Application AEQbTJ;
    public LinearLayoutManager AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public boolean EZpvd;
    public C46269tOb OLrzqt;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public boolean copydefault = true;
    public int valueOf = 3;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.ttL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C47605ttK.DbNXlk(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C47501trL.Application.dHguZz;
    }

    public C47605ttK() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetSpotlightFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetSpotlightFragment$special$$inlined$viewModels$default$2
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C47666tuS.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetSpotlightFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetSpotlightFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetSpotlightFragment$special$$inlined$viewModels$default$5
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
        final Function0 function03 = new Function0() { // from class: o.ttJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47605ttK.isConnected(this.KWHzl);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetSpotlightFragment$special$$inlined$viewModels$default$6
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C47664tuQ.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetSpotlightFragment$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetSpotlightFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetSpotlightFragment$special$$inlined$viewModels$default$9
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
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.ttI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47605ttK.copydefault();
            }
        });
        this.AEQbTJ = new Application();
    }

    public final void EZpvd(int i) {
        RecyclerView recyclerView;
        int iCopydefault = C56548yJl.copydefault(i, 0);
        if (this.valueOf != iCopydefault) {
            this.valueOf = iCopydefault;
            OLrzqt().EZpvd(this.valueOf);
            C46269tOb c46269tOb = this.OLrzqt;
            if (c46269tOb == null || (recyclerView = c46269tOb.EZpvd) == null) {
                return;
            }
            recyclerView.post(new java.lang.Runnable() { // from class: o.ttQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C47605ttK.AEQbTJ(this.EZpvd);
                }
            });
        }
    }

    public static final void AEQbTJ(C47605ttK c47605ttK) {
        RecyclerView recyclerView;
        C46269tOb c46269tOb = c47605ttK.OLrzqt;
        if (c46269tOb == null || (recyclerView = c46269tOb.EZpvd) == null) {
            return;
        }
        recyclerView.requestLayout();
    }

    public final C47650tuC OLrzqt() {
        return (C47650tuC) this.KWHzl.getValue();
    }

    public static final C47650tuC DbNXlk(C47605ttK c47605ttK) {
        C47650tuC c47650tuC = new C47650tuC();
        c47650tuC.EZpvd(c47605ttK.valueOf);
        return c47650tuC;
    }

    public final C47666tuS KWHzl() {
        return (C47666tuS) this.AhwBna.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C47664tuQ AhwBna() {
        return (C47664tuQ) this.gEmmrt.getValue();
    }

    public static final ViewModelStoreOwner isConnected(C47605ttK c47605ttK) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c47605ttK.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C47730tvd AYXKKw() {
        return (C47730tvd) this.djBIcL.getValue();
    }

    public static final C47730tvd copydefault() {
        return new C47730tvd();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C46269tOb c46269tObAEQbTJ = C46269tOb.AEQbTJ(view);
        this.OLrzqt = c46269tObAEQbTJ;
        if (c46269tObAEQbTJ != null) {
            c46269tObAEQbTJ.AEQbTJ.setContentDescription("spotlight");
            c46269tObAEQbTJ.copydefault.setMinFrame(1);
            RecyclerView recyclerView = c46269tObAEQbTJ.EZpvd;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 0, false);
            this.AYXKKw = linearLayoutManager;
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(OLrzqt());
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.addOnScrollListener(this.AEQbTJ);
        }
        DbNXlk();
    }

    /* JADX INFO: renamed from: o.ttK$Application */
    public static final class Application extends RecyclerView.OnScrollListener {
        public Application() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            pUU.KWHzl("qjf", "PlanetSpotlightFragment---onScrollStateChanged->");
            if (i == 0) {
                C47605ttK.this.valueOf();
            }
        }
    }

    public final void valueOf() {
        LinearLayoutManager linearLayoutManager = this.AYXKKw;
        if (linearLayoutManager == null) {
            return;
        }
        int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        pUU.KWHzl("qjf", "trackCompletelyVisibleItems: first=" + iFindFirstCompletelyVisibleItemPosition + ", last=" + iFindLastCompletelyVisibleItemPosition);
        if (iFindFirstCompletelyVisibleItemPosition == -1 || iFindLastCompletelyVisibleItemPosition == -1 || iFindFirstCompletelyVisibleItemPosition > iFindLastCompletelyVisibleItemPosition) {
            return;
        }
        while (true) {
            OLrzqt().copydefault(iFindFirstCompletelyVisibleItemPosition);
            if (iFindFirstCompletelyVisibleItemPosition == iFindLastCompletelyVisibleItemPosition) {
                return;
            } else {
                iFindFirstCompletelyVisibleItemPosition++;
            }
        }
    }

    /* JADX INFO: renamed from: o.ttK$TaskDescription */
    public static final class TaskDescription implements ViewTreeObserver.OnPreDrawListener {
        public TaskDescription() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            RecyclerView recyclerView;
            android.view.ViewTreeObserver viewTreeObserver;
            C46269tOb c46269tOb = C47605ttK.this.OLrzqt;
            if (c46269tOb != null && (recyclerView = c46269tOb.EZpvd) != null && (viewTreeObserver = recyclerView.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            C47605ttK.this.valueOf();
            return true;
        }
    }

    public final void djBIcL() {
        RecyclerView recyclerView;
        android.view.ViewTreeObserver viewTreeObserver;
        C46269tOb c46269tOb = this.OLrzqt;
        if (c46269tOb == null || (recyclerView = c46269tOb.EZpvd) == null || (viewTreeObserver = recyclerView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnPreDrawListener(new TaskDescription());
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.copydefault) {
            KWHzl().copydefault(java.lang.Integer.valueOf(this.valueOf));
            fetchVPNInfo();
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        isConnected();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        isConnected();
    }

    private final void DbNXlk() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new PlanetSpotlightFragment$observeViewModel$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchVPNInfo() {
        java.util.List<SpotlightToken> listKWHzl = OLrzqt().KWHzl();
        if (listKWHzl.isEmpty()) {
            return;
        }
        int i = this.valueOf;
        if (i > 0) {
            listKWHzl = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) listKWHzl, i);
        }
        if (!listKWHzl.isEmpty()) {
            AYXKKw().AEQbTJ(listKWHzl);
        }
    }

    private final void isConnected() {
        AYXKKw().AYXKKw();
    }

    public final void AEQbTJ() {
        isConnected();
    }

    public final java.lang.String KWHzl(long j) {
        java.lang.String str;
        Date date = new Date(j);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            str = new SimpleDateFormat("HH:mm", java.util.Locale.getDefault()).format(date);
        } else {
            str = new SimpleDateFormat("MMM dd HH:mm", java.util.Locale.ENGLISH).format(date);
        }
        return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C47501trL.Fragment.getLabel, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, str)));
    }

    public final void gEmmrt() {
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        RecyclerView recyclerView;
        ConstraintLayout constraintLayout;
        if (this.copydefault) {
            if (AhwBna().OLrzqt().getValue().AhwBna() && !AhwBna().EZpvd()) {
                C46269tOb c46269tOb = this.OLrzqt;
                if (c46269tOb != null && (constraintLayout = c46269tOb.AEQbTJ) != null) {
                    constraintLayout.setVisibility(8);
                }
                C46269tOb c46269tOb2 = this.OLrzqt;
                if (c46269tOb2 != null && (recyclerView = c46269tOb2.EZpvd) != null) {
                    recyclerView.setVisibility(8);
                }
                C46269tOb c46269tOb3 = this.OLrzqt;
                if (c46269tOb3 != null && (lottieAnimationView2 = c46269tOb3.copydefault) != null) {
                    lottieAnimationView2.setVisibility(0);
                }
                C46269tOb c46269tOb4 = this.OLrzqt;
                if (c46269tOb4 != null && (lottieAnimationView = c46269tOb4.copydefault) != null) {
                    lottieAnimationView.playAnimation();
                }
            }
            KWHzl().copydefault(java.lang.Integer.valueOf(this.valueOf));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        RecyclerView recyclerView;
        C46269tOb c46269tOb = this.OLrzqt;
        if (c46269tOb != null && (recyclerView = c46269tOb.EZpvd) != null) {
            recyclerView.removeOnScrollListener(this.AEQbTJ);
        }
        OLrzqt().AEQbTJ();
        this.AYXKKw = null;
        AYXKKw().AEQbTJ();
        this.OLrzqt = null;
        super.onDestroyView();
    }
}

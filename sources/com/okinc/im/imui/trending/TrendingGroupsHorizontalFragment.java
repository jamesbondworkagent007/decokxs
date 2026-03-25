package com.okinc.im.imui.trending;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.bean.TrendingGroupsCollectionComponentStatus;
import com.okinc.im.imui.conversationlist.TrendingGroupsListActivity;
import com.okinc.im.imui.trending.TrendingGroupsHorizontalFragment;
import com.okinc.im.imui.trending.viewmodel.TrendingGroupsHorizontalViewModel;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC37711oyw;
import o.C32866mlf;
import o.C33129mqd;
import o.C34168nTy;
import o.C35399nuc;
import o.C35743oCa;
import o.C37709oyu;
import o.C55296xhK;
import o.C55298xhM;
import o.C56390yDp;
import o.C56392yDr;
import o.C56524yIo;
import o.C7827arF;
import o.InterfaceC35243nre;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.nGS;
import o.nKK;
import o.oBX;
import o.oBZ;
import o.rVN;
import o.sDZ;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class TrendingGroupsHorizontalFragment extends AbstractC37711oyw implements oBX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int djBIcL = 8;
    public List<nGS> AYXKKw;
    public nKK AhwBna;
    public final int AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public final int fetchVPNInfo;
    public RecyclerView.ItemDecoration gEmmrt;
    public InterfaceC35243nre isConnected;

    @yCM
    public C34168nTy joinGroupEntryHelper;
    public C37709oyu valueOf;
    public final Set<Long> values;

    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.fetchVPNInfo;
    }

    public TrendingGroupsHorizontalFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.im.imui.trending.TrendingGroupsHorizontalFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.trending.TrendingGroupsHorizontalFragment$special$$inlined$viewModels$default$2
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TrendingGroupsHorizontalViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.trending.TrendingGroupsHorizontalFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.trending.TrendingGroupsHorizontalFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.trending.TrendingGroupsHorizontalFragment$special$$inlined$viewModels$default$5
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
        this.fetchVPNInfo = C35399nuc.Dialog.fHqPtx;
        this.AkhnZx = 10;
        this.values = new LinkedHashSet();
        this.AYXKKw = yDY.AhwBna();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.trending.TrendingGroupsHorizontalFragment.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C35743oCa OLrzqt(@NotNull oBZ obz, @NotNull InterfaceC35243nre interfaceC35243nre) {
            Intrinsics.checkNotNullParameter(obz, "");
            Intrinsics.checkNotNullParameter(interfaceC35243nre, "");
            TrendingGroupsHorizontalFragment trendingGroupsHorizontalFragment = new TrendingGroupsHorizontalFragment();
            trendingGroupsHorizontalFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("arg_max_group_count", obz.EZpvd())));
            trendingGroupsHorizontalFragment.isConnected = interfaceC35243nre;
            return new C35743oCa(trendingGroupsHorizontalFragment, trendingGroupsHorizontalFragment);
        }
    }

    public final C34168nTy gEmmrt() {
        C34168nTy c34168nTy = this.joinGroupEntryHelper;
        if (c34168nTy != null) {
            return c34168nTy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final nKK AhwBna() {
        nKK nkk = this.AhwBna;
        if (nkk != null) {
            return nkk;
        }
        throw new IllegalStateException("ViewBinding is not available. Ensure this property is accessed between onCreateView() and onDestroyView().");
    }

    public final TrendingGroupsHorizontalViewModel AYXKKw() {
        return (TrendingGroupsHorizontalViewModel) this.DbNXlk.getValue();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.AhwBna = nKK.copydefault(layoutInflater, viewGroup, false);
        ConstraintLayout root = AhwBna().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        if (sDZ.AEQbTJ.uzCIH()) {
            djBIcL();
            valueOf();
            TextView textView = AhwBna().KWHzl;
            textView.setOnClickListener(new Application(textView, 1000L, this));
            LottieAnimationView lottieAnimationView = AhwBna().AEQbTJ;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            lottieAnimationView.setAnimationFromUrl(C7827arF.EZpvd("lottie/im/trending_groups_loading.lottie", contextRequireContext, true));
            LottieAnimationView lottieAnimationView2 = AhwBna().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
            lottieAnimationView2.setVisibility(0);
            ConstraintLayout constraintLayout = AhwBna().copydefault;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(0);
            return;
        }
        LottieAnimationView lottieAnimationView3 = AhwBna().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView3, "");
        lottieAnimationView3.setVisibility(8);
        TextView textView2 = AhwBna().KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
    }

    private final void djBIcL() {
        this.valueOf = new C37709oyu(new Function2() { // from class: o.oyy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return TrendingGroupsHorizontalFragment.KWHzl(this.AEQbTJ, (nGS) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
        AhwBna().OLrzqt.setLayoutManager(new GridLayoutManager(requireContext(), 2, 0, false));
        RecyclerView recyclerView = AhwBna().OLrzqt;
        C37709oyu c37709oyu = this.valueOf;
        if (c37709oyu == null) {
            Intrinsics.gEmmrt("");
            c37709oyu = null;
        }
        recyclerView.setAdapter(c37709oyu);
        AhwBna().OLrzqt.setHasFixedSize(false);
        AhwBna().OLrzqt.setItemViewCacheSize(this.AkhnZx);
        AhwBna().OLrzqt.addOnScrollListener(new StateListAnimator());
    }

    public static final Unit KWHzl(TrendingGroupsHorizontalFragment trendingGroupsHorizontalFragment, nGS ngs, int i) {
        Intrinsics.checkNotNullParameter(ngs, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(trendingGroupsHorizontalFragment), null, null, new TrendingGroupsHorizontalFragment$setupRecyclerView$1$1(trendingGroupsHorizontalFragment, ngs, i, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator extends RecyclerView.OnScrollListener {
        public StateListAnimator() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            TrendingGroupsHorizontalFragment.this.KWHzl();
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ TrendingGroupsHorizontalFragment KWHzl;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, TrendingGroupsHorizontalFragment trendingGroupsHorizontalFragment) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = trendingGroupsHorizontalFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Orbit_Page_Moregroup_Click", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
                TrendingGroupsListActivity.StateListAnimator stateListAnimator = TrendingGroupsListActivity.Companion;
                Context contextRequireContext = this.KWHzl.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                this.KWHzl.startActivity(stateListAnimator.EZpvd(contextRequireContext));
            }
        }
    }

    @Override // o.oBX
    public void AEQbTJ(boolean z) {
        if (!isAdded() || this.AhwBna == null) {
            return;
        }
        this.values.clear();
        AYXKKw().copydefault(z);
    }

    private final void valueOf() {
        AYXKKw().OLrzqt().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.oyB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TrendingGroupsHorizontalFragment.copydefault(this.KWHzl, (TrendingGroupsHorizontalViewModel.Application) obj);
            }
        }));
    }

    public static final Unit copydefault(TrendingGroupsHorizontalFragment trendingGroupsHorizontalFragment, TrendingGroupsHorizontalViewModel.Application application) {
        if (trendingGroupsHorizontalFragment.AhwBna == null || !trendingGroupsHorizontalFragment.isAdded() || trendingGroupsHorizontalFragment.getView() == null) {
            return Unit.INSTANCE;
        }
        if (application instanceof TrendingGroupsHorizontalViewModel.Application.Activity) {
            LottieAnimationView lottieAnimationView = trendingGroupsHorizontalFragment.AhwBna().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
            lottieAnimationView.setVisibility(0);
            ConstraintLayout constraintLayout = trendingGroupsHorizontalFragment.AhwBna().copydefault;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(0);
        } else if (application instanceof TrendingGroupsHorizontalViewModel.Application.C0486Application) {
            LottieAnimationView lottieAnimationView2 = trendingGroupsHorizontalFragment.AhwBna().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
            lottieAnimationView2.setVisibility(8);
            ConstraintLayout constraintLayout2 = trendingGroupsHorizontalFragment.AhwBna().copydefault;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(0);
            trendingGroupsHorizontalFragment.EZpvd(((TrendingGroupsHorizontalViewModel.Application.C0486Application) application).OLrzqt());
            rVN.reportFullyDrawn$default((Fragment) trendingGroupsHorizontalFragment, true, (String) null, 2, (Object) null);
        } else if (application instanceof TrendingGroupsHorizontalViewModel.Application.StateListAnimator) {
            LottieAnimationView lottieAnimationView3 = trendingGroupsHorizontalFragment.AhwBna().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView3, "");
            lottieAnimationView3.setVisibility(8);
            ConstraintLayout constraintLayout3 = trendingGroupsHorizontalFragment.AhwBna().copydefault;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
            constraintLayout3.setVisibility(8);
            InterfaceC35243nre interfaceC35243nre = trendingGroupsHorizontalFragment.isConnected;
            if (interfaceC35243nre != null) {
                interfaceC35243nre.copydefault(TrendingGroupsCollectionComponentStatus.ERROR);
            }
            rVN.reportFullyDrawn$default((Fragment) trendingGroupsHorizontalFragment, false, (String) null, 2, (Object) null);
        } else {
            if (!Intrinsics.EZpvd(application, TrendingGroupsHorizontalViewModel.Application.TaskDescription.AEQbTJ)) {
                throw new NoWhenBranchMatchedException();
            }
            LottieAnimationView lottieAnimationView4 = trendingGroupsHorizontalFragment.AhwBna().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView4, "");
            lottieAnimationView4.setVisibility(8);
            ConstraintLayout constraintLayout4 = trendingGroupsHorizontalFragment.AhwBna().copydefault;
            Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
            constraintLayout4.setVisibility(8);
            InterfaceC35243nre interfaceC35243nre2 = trendingGroupsHorizontalFragment.isConnected;
            if (interfaceC35243nre2 != null) {
                interfaceC35243nre2.copydefault(TrendingGroupsCollectionComponentStatus.EMPTY);
            }
            rVN.reportFullyDrawn$default((Fragment) trendingGroupsHorizontalFragment, true, (String) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(List<nGS> list) {
        if (this.AhwBna == null || !isAdded() || getView() == null) {
            return;
        }
        if (!list.isEmpty()) {
            this.AYXKKw = list;
            RecyclerView.LayoutManager layoutManager = AhwBna().OLrzqt.getLayoutManager();
            C37709oyu c37709oyu = null;
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            if (gridLayoutManager != null) {
                int i = list.size() != 1 ? 2 : 1;
                if (gridLayoutManager.getSpanCount() != i) {
                    gridLayoutManager.setSpanCount(i);
                }
            }
            C37709oyu c37709oyu2 = this.valueOf;
            if (c37709oyu2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c37709oyu = c37709oyu2;
            }
            c37709oyu.copydefault(list);
            RecyclerView recyclerView = AhwBna().OLrzqt;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(0);
            TextView textView = AhwBna().KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            RecyclerView.ItemDecoration itemDecoration = this.gEmmrt;
            if (itemDecoration != null) {
                AhwBna().OLrzqt.removeItemDecoration(itemDecoration);
            }
            this.gEmmrt = new Activity();
            RecyclerView recyclerView2 = AhwBna().OLrzqt;
            RecyclerView.ItemDecoration itemDecoration2 = this.gEmmrt;
            Intrinsics.copydefault(itemDecoration2);
            recyclerView2.addItemDecoration(itemDecoration2);
            AhwBna().OLrzqt.post(new Runnable() { // from class: o.oyx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    TrendingGroupsHorizontalFragment.KWHzl(this.EZpvd);
                }
            });
            InterfaceC35243nre interfaceC35243nre = this.isConnected;
            if (interfaceC35243nre != null) {
                interfaceC35243nre.copydefault(TrendingGroupsCollectionComponentStatus.NORMAL);
                return;
            }
            return;
        }
        this.AYXKKw = yDY.AhwBna();
        RecyclerView recyclerView3 = AhwBna().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
        recyclerView3.setVisibility(8);
        TextView textView2 = AhwBna().KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
        InterfaceC35243nre interfaceC35243nre2 = this.isConnected;
        if (interfaceC35243nre2 != null) {
            interfaceC35243nre2.copydefault(TrendingGroupsCollectionComponentStatus.EMPTY);
        }
    }

    public static final class Activity extends RecyclerView.ItemDecoration {
        public Activity() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int iKWHzl;
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == -1) {
                return;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            int spanCount = gridLayoutManager != null ? gridLayoutManager.getSpanCount() : 2;
            if (childAdapterPosition % spanCount == spanCount - 1) {
                Context contextRequireContext = TrendingGroupsHorizontalFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                iKWHzl = C55298xhM.KWHzl(8.0f, contextRequireContext);
            } else {
                iKWHzl = 0;
            }
            rect.top = iKWHzl;
        }
    }

    public static final void KWHzl(final TrendingGroupsHorizontalFragment trendingGroupsHorizontalFragment) {
        if (trendingGroupsHorizontalFragment.AhwBna == null || !trendingGroupsHorizontalFragment.isAdded() || trendingGroupsHorizontalFragment.getView() == null) {
            return;
        }
        trendingGroupsHorizontalFragment.AhwBna().OLrzqt.requestLayout();
        trendingGroupsHorizontalFragment.AhwBna().OLrzqt.postDelayed(new Runnable() { // from class: o.oyA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                TrendingGroupsHorizontalFragment.AhwBna(this.KWHzl);
            }
        }, 100L);
    }

    public static final void AhwBna(TrendingGroupsHorizontalFragment trendingGroupsHorizontalFragment) {
        trendingGroupsHorizontalFragment.KWHzl();
    }

    public final void KWHzl() {
        int childAdapterPosition;
        if (this.AhwBna == null || !isAdded() || getView() == null) {
            return;
        }
        int childCount = AhwBna().OLrzqt.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = AhwBna().OLrzqt.getChildAt(i);
            if (childAt != null && (childAdapterPosition = AhwBna().OLrzqt.getChildAdapterPosition(childAt)) != -1 && childAdapterPosition < this.AYXKKw.size()) {
                nGS ngs = this.AYXKKw.get(childAdapterPosition);
                if (!this.values.contains(Long.valueOf(ngs.copydefault())) && EZpvd(childAt) >= 0.5f) {
                    copydefault(ngs, childAdapterPosition);
                    this.values.add(Long.valueOf(ngs.copydefault()));
                }
            }
        }
    }

    public final float EZpvd(View view) {
        AhwBna().OLrzqt.getGlobalVisibleRect(new Rect());
        view.getGlobalVisibleRect(new Rect());
        float width = view.getWidth();
        if (width <= 0.0f) {
            return 0.0f;
        }
        return Math.max(0, Math.min(r1.right, r0.right) - Math.max(r1.left, r0.left)) / width;
    }

    public final void copydefault(final nGS ngs, final int i) {
        C32866mlf.onEvent$default("Orbit_Page_Groupcard_View", (TrackChannel[]) null, new Function1() { // from class: o.oyC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TrendingGroupsHorizontalFragment.OLrzqt(i, ngs, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit OLrzqt(int i, nGS ngs, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "position", C33129mqd.gEmmrt(Integer.valueOf(i)), false, 4, null);
        EventParamsList.put$default(eventParamsList, "channel_id", C33129mqd.gEmmrt(Long.valueOf(ngs.copydefault())), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        TrendingGroupsHorizontalViewModel.fetchTrendingGroups$default(AYXKKw(), false, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.isConnected = null;
        this.AhwBna = null;
    }
}

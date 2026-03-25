package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.find_ui.ranking.dex.MarketHomeDexRankingFragment$setListener$2;
import com.okinc.find_ui.ranking.dex.viewmodel.MarketHomeDexViewModel;
import com.okinc.market.quotation.ui.AbsQuotationFragment;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import com.okinc.market.quotation.ui.model.dex.DexSortByEnum;
import com.okinc.okmarket.ui.market.quote.WrapContentLinearLayoutManager;
import com.okinc.rxutils.RxBus;
import java.util.Arrays;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.AbstractC58185ywX;
import o.C34953nmF;
import o.C34964nmQ;
import o.InterfaceC27808kEb;
import o.InterfaceC49361unB;
import o.InterfaceC49371unL;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.qXK;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nmF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34953nmF extends AbstractC34954nmG {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public C42786rcw AhwBna;
    public final InterfaceC56387yDm values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.zzQwtT;
    }

    public C34953nmF() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.find_ui.ranking.dex.MarketHomeDexRankingFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.find_ui.ranking.dex.MarketHomeDexRankingFragment$special$$inlined$viewModels$default$2
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketHomeDexViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.find_ui.ranking.dex.MarketHomeDexRankingFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.find_ui.ranking.dex.MarketHomeDexRankingFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.find_ui.ranking.dex.MarketHomeDexRankingFragment$special$$inlined$viewModels$default$5
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
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.nmM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34953nmF.valueOf();
            }
        });
    }

    public final MarketHomeDexViewModel fetchVPNInfo() {
        return (MarketHomeDexViewModel) this.values.getValue();
    }

    public static final C34963nmP valueOf() {
        return new C34963nmP();
    }

    public final C34963nmP gEmmrt() {
        return (C34963nmP) this.AYXKKw.getValue();
    }

    /* JADX INFO: renamed from: o.nmF$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nmF.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C42786rcw c42786rcwOLrzqt = C42786rcw.OLrzqt(view);
        Intrinsics.copydefault(c42786rcwOLrzqt);
        KWHzl(c42786rcwOLrzqt);
        this.AhwBna = c42786rcwOLrzqt;
    }

    public final void KWHzl(C42786rcw c42786rcw) {
        RecyclerView recyclerView = c42786rcw.AEQbTJ;
        recyclerView.setLayoutManager(new WrapContentLinearLayoutManager(recyclerView.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(gEmmrt());
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, fetchVPNInfo(), new MutablePropertyReference1Impl() { // from class: com.okinc.find_ui.ranking.dex.MarketHomeDexRankingFragment$setListener$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketHomeDexViewModel.StateListAnimator) obj).OLrzqt();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketHomeDexViewModel.StateListAnimator) obj).AEQbTJ((InterfaceC49371unL<? extends List<C34964nmQ>>) obj2);
            }
        }, null, new MarketHomeDexRankingFragment$setListener$2(this, null), 2, null);
        final java.lang.String[] strArr = {"event_home_page_refresh"};
        getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.find_ui.ranking.dex.MarketHomeDexRankingFragment$setListener$$inlined$repeatListenRxEventOnResume$1
            public InterfaceC58217yxC OLrzqt;

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                super.onResume(lifecycleOwner);
                String[] strArr2 = strArr;
                AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ((String[]) Arrays.copyOf(strArr2, strArr2.length));
                final C34953nmF c34953nmF = this;
                this.OLrzqt = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM(new Function1<String, Unit>() { // from class: com.okinc.find_ui.ranking.dex.MarketHomeDexRankingFragment$setListener$$inlined$repeatListenRxEventOnResume$1.5
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(String str) {
                        KWHzl(str);
                        return Unit.INSTANCE;
                    }

                    public final void KWHzl(String str) {
                        Intrinsics.copydefault((Object) str);
                        c34953nmF.AEQbTJ(new AbsQuotationFragment.SubscribeType.SubscribeBy("event_home_page_refresh"));
                    }
                }) { // from class: o.jSA.Activity
                    public final /* synthetic */ Function1 KWHzl;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.KWHzl = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.KWHzl.invoke(obj);
                    }
                }, new InterfaceC58227yxM(new Function1<Throwable, Unit>() { // from class: com.okinc.find_ui.ranking.dex.MarketHomeDexRankingFragment$setListener$$inlined$repeatListenRxEventOnResume$1.3
                    public final void OLrzqt(Throwable th) {
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(Throwable th) {
                        OLrzqt(th);
                        return Unit.INSTANCE;
                    }
                }) { // from class: o.jSA.Activity
                    public final /* synthetic */ Function1 KWHzl;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.KWHzl = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.KWHzl.invoke(obj);
                    }
                });
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                super.onPause(lifecycleOwner);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(InterfaceC49371unL<? extends java.util.List<? extends InterfaceC40516qYt>> interfaceC49371unL) {
        C35152npt root;
        C35152npt root2;
        C35152npt root3;
        C35152npt root4;
        if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
            C41298qoF.AEQbTJ.EZpvd(getTAG(), "updateContentListUI: " + interfaceC49371unL);
            C42786rcw c42786rcw = this.AhwBna;
            if (c42786rcw == null || (root4 = c42786rcw.getRoot()) == null) {
                return;
            }
            qXK.StateListAnimator.showLoadingState$default(root4, 0L, 1, null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL;
            java.lang.Object objCopydefault = activity.copydefault();
            if (!(!((java.util.List) objCopydefault).isEmpty())) {
                objCopydefault = null;
            }
            java.util.List list = (java.util.List) objCopydefault;
            if (list == null) {
                copydefault(new InterfaceC49371unL.TaskDescription(activity.copydefault()));
                return;
            }
            C41298qoF.AEQbTJ.EZpvd(getTAG(), "updateContentListUI: list size: " + list.size());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(list);
            if (list.size() >= 7) {
                arrayList.add(new C27622jyf());
            }
            AbstractC40521qYy.submitList$default(gEmmrt(), arrayList, null, 2, null);
            C42786rcw c42786rcw2 = this.AhwBna;
            if (c42786rcw2 != null && (root3 = c42786rcw2.getRoot()) != null) {
                root3.values();
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            C41298qoF.AEQbTJ.AEQbTJ(getTAG(), "updateContentListUI: error", ((InterfaceC49371unL.Application) interfaceC49371unL).AEQbTJ());
            C42786rcw c42786rcw3 = this.AhwBna;
            if (c42786rcw3 != null && (root2 = c42786rcw3.getRoot()) != null) {
                root2.copydefault(C33070mpX.AYXKKw(qZH.PendingIntent.DsL), C33070mpX.AYXKKw(qZH.PendingIntent.djSkpj), C33070mpX.AYXKKw(qZH.PendingIntent.fetchVPNInfo), new Function0() { // from class: o.nmJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C34953nmF.EZpvd(this.AEQbTJ);
                    }
                });
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription) {
            C41298qoF.AEQbTJ.EZpvd(getTAG(), "updateContentListUI: " + interfaceC49371unL);
            C42786rcw c42786rcw4 = this.AhwBna;
            if (c42786rcw4 != null && (root = c42786rcw4.getRoot()) != null) {
                qXK.StateListAnimator.showEmptyState$default(root, qZH.PendingIntent.getPostValueLengthLimit, 0, 0, 0, (Function0) null, 30, (java.lang.Object) null);
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        C41298qoF.AEQbTJ.EZpvd(getTAG(), "updateContentListUI: " + interfaceC49371unL);
    }

    public static final Unit EZpvd(C34953nmF c34953nmF) {
        AbsQuotationFragment.startSubscribeData$default(c34953nmF, null, 1, null);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.market.quotation.ui.AbsQuotationFragment
    public java.lang.Object OLrzqt(@NotNull AbsQuotationFragment.SubscribeType subscribeType, @NotNull Continuation<? super Unit> continuation) {
        return fetchVPNInfo().copydefault(DexChainGroupVo.Companion.copydefault(), DexPeriodEnum.ONE_DAY, C56390yDp.OLrzqt(DexSortByEnum.NONE, SortOrder.NONE), 7, continuation);
    }

    @Override // com.okinc.market.quotation.ui.AbsQuotationFragment, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        androidx.fragment.app.FragmentManager childFragmentManager;
        InterfaceC27808kEb interfaceC27808kEbEZpvd;
        super.onResume();
        rVN.copydefault(this);
        android.view.View view = getView();
        if (view != null && view.isShown() && view.isAttachedToWindow()) {
            if (view.getGlobalVisibleRect(new android.graphics.Rect()) && view.getHeight() > 0 && C33129mqd.copydefault(java.lang.Float.valueOf(r1.height() / view.getHeight()), java.lang.Float.valueOf(0.5f)) && (interfaceC27808kEbEZpvd = C27807kEa.EZpvd(this)) != null) {
                InterfaceC27808kEb.StateListAnimator.trackRankingModuleView$default(interfaceC27808kEbEZpvd, "cedefi", null, 2, null);
            }
        }
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        if (parentFragment == null || (childFragmentManager = parentFragment.getChildFragmentManager()) == null) {
            return;
        }
        childFragmentManager.setFragmentResultListener("REQUEST_CLICK_ARROW", this, new FragmentResultListener() { // from class: o.nmK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C34953nmF.copydefault(this.EZpvd, str, bundle);
            }
        });
    }

    public static final void copydefault(C34953nmF c34953nmF, java.lang.String str, android.os.Bundle bundle) {
        android.content.Context context;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (!Intrinsics.EZpvd((java.lang.Object) bundle.getString("type"), (java.lang.Object) "dex-rank") || (context = c34953nmF.getContext()) == null) {
            return;
        }
        sZQ.EZpvd.KWHzl(context);
    }

    @Override // com.okinc.market.quotation.ui.AbsQuotationFragment, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        androidx.fragment.app.FragmentManager childFragmentManager;
        super.onPause();
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        if (parentFragment == null || (childFragmentManager = parentFragment.getChildFragmentManager()) == null) {
            return;
        }
        childFragmentManager.clearFragmentResultListener("REQUEST_CLICK_ARROW");
    }
}

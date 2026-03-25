package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.invest_biz.data.bean.ProductJumpParam;
import com.okinc.business.invest_biz.data.usecase.DexEntranceProductQuery;
import com.okinc.business.invest_biz.ui.screens.dex_entrance.DexEntranceProductListFragment$triggerLoadMoreEvent$1;
import com.okinc.business.invest_biz.ui.screens.dex_entrance.DexEntranceProductListVM;
import com.okinc.business.invest_biz.ui.screens.dex_entrance.DexEntranceSortOrder;
import com.okinc.business.invest_biz.ui.screens.dex_entrance.DexEntranceSortType;
import com.okinc.uilab.view.OKSortTextView;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C25493ixk;
import o.C52761wXj;
import o.InterfaceC26463jcm;
import o.InterfaceC26469jcs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jaL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26330jaL extends AbstractC26405jbh {
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm valueOf;
    public static final /* synthetic */ yJA<java.lang.Object>[] copydefault = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(C26330jaL.class, "mBinding", "getMBinding()Lcom/okinc/business/invest_biz/databinding/FragmentDexEarnProductListBinding;", 0))};
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.jaR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C26330jaL.AhwBna(this.EZpvd);
        }
    });
    public final yIP KWHzl = C27589jxz.EZpvd(this);

    /* JADX INFO: renamed from: o.jaL$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKSortTextView.SortType.values().length];
            try {
                iArr[OKSortTextView.SortType.UP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKSortTextView.SortType.DOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C25493ixk.Activity.AuCTelauCTel;
    }

    /* JADX INFO: renamed from: o.jaL$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jaL.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C26330jaL copydefault(@NotNull DexEntranceProductQuery dexEntranceProductQuery) {
            Intrinsics.checkNotNullParameter(dexEntranceProductQuery, "");
            C26330jaL c26330jaL = new C26330jaL();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("product_query", dexEntranceProductQuery);
            bundle.putBoolean("KEY_WIDGET_MODE", false);
            c26330jaL.setArguments(bundle);
            return c26330jaL;
        }

        public final C26330jaL OLrzqt(long j, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C26330jaL c26330jaL = new C26330jaL();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("KEY_CHAIN_ID", j);
            bundle.putString("KEY_TOKEN_ADDRESS", str);
            bundle.putBoolean("KEY_WIDGET_MODE", true);
            c26330jaL.setArguments(bundle);
            return c26330jaL;
        }
    }

    public C26330jaL() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.screens.dex_entrance.DexEntranceProductListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.dex_entrance.DexEntranceProductListFragment$special$$inlined$viewModels$default$2
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DexEntranceProductListVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.dex_entrance.DexEntranceProductListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.dex_entrance.DexEntranceProductListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.dex_entrance.DexEntranceProductListFragment$special$$inlined$viewModels$default$5
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
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.jaO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26330jaL.fetchVPNInfo(this.EZpvd);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.jaN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C26330jaL.gEmmrt(this.OLrzqt));
            }
        });
    }

    public final C26454jcd KWHzl() {
        return (C26454jcd) this.AEQbTJ.getValue();
    }

    public static final android.app.Activity AYXKKw(C26330jaL c26330jaL) {
        FragmentActivity fragmentActivityRequireActivity = c26330jaL.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return fragmentActivityRequireActivity;
    }

    public static final C26454jcd AhwBna(final C26330jaL c26330jaL) {
        return new C26454jcd(new Function0() { // from class: o.jaM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26330jaL.AYXKKw(this.EZpvd);
            }
        }, new Function1() { // from class: o.jaI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26330jaL.EZpvd(this.EZpvd, (C26526jdw) obj);
            }
        }, c26330jaL.AYXKKw() ? 16 : null);
    }

    public static final Unit EZpvd(C26330jaL c26330jaL, C26526jdw c26526jdw) {
        Intrinsics.checkNotNullParameter(c26526jdw, "");
        DexEntranceProductQuery dexEntranceProductQueryOLrzqt = c26330jaL.OLrzqt();
        if (dexEntranceProductQueryOLrzqt == null) {
            dexEntranceProductQueryOLrzqt = c26330jaL.EZpvd().KWHzl();
        }
        if ((dexEntranceProductQueryOLrzqt != null ? java.lang.Integer.valueOf(dexEntranceProductQueryOLrzqt.getTabId()) : null) != null && c26330jaL.getActivity() != null) {
            int tabId = dexEntranceProductQueryOLrzqt.getTabId();
            ProductJumpParam productJumpParamOLrzqt = c26330jaL.EZpvd().OLrzqt(c26526jdw.AhwBna());
            FragmentActivity fragmentActivityRequireActivity = c26330jaL.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            C26452jcb.KWHzl(c26526jdw, tabId, productJumpParamOLrzqt, fragmentActivityRequireActivity, "dexentrance");
            c26330jaL.EZpvd().AEQbTJ(C33129mqd.valueOf(java.lang.Long.valueOf(dexEntranceProductQueryOLrzqt.getChainId())), dexEntranceProductQueryOLrzqt.getTabName());
        }
        return Unit.INSTANCE;
    }

    public final C23744iHs AEQbTJ() {
        return (C23744iHs) this.KWHzl.getValue(this, copydefault[0]);
    }

    public final void AEQbTJ(C23744iHs c23744iHs) {
        this.KWHzl.KWHzl(this, copydefault[0], c23744iHs);
    }

    /* JADX DEBUG: Possible override for method o.jbh.EZpvd()V */
    public final DexEntranceProductListVM EZpvd() {
        return (DexEntranceProductListVM) this.AhwBna.getValue();
    }

    public static final DexEntranceProductQuery fetchVPNInfo(C26330jaL c26330jaL) {
        android.os.Bundle arguments = c26330jaL.getArguments();
        DexEntranceProductQuery dexEntranceProductQuery = arguments != null ? (DexEntranceProductQuery) arguments.getParcelable("product_query") : null;
        if (dexEntranceProductQuery instanceof DexEntranceProductQuery) {
            return dexEntranceProductQuery;
        }
        return null;
    }

    public final DexEntranceProductQuery OLrzqt() {
        return (DexEntranceProductQuery) this.valueOf.getValue();
    }

    public static final boolean gEmmrt(C26330jaL c26330jaL) {
        android.os.Bundle arguments = c26330jaL.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("KEY_WIDGET_MODE");
        }
        return false;
    }

    public final boolean AYXKKw() {
        return ((java.lang.Boolean) this.OLrzqt.getValue()).booleanValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AEQbTJ(C23744iHs.EZpvd(view));
        C23744iHs c23744iHsAEQbTJ = AEQbTJ();
        KWHzl(c23744iHsAEQbTJ);
        EZpvd(c23744iHsAEQbTJ);
        valueOf();
        if (AYXKKw()) {
            EZpvd().AYXKKw();
        } else {
            EZpvd().OLrzqt(OLrzqt());
        }
        djBIcL();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (KWHzl().getItemCount() > 0) {
            AEQbTJ().getRoot().requestLayout();
        }
    }

    /* JADX INFO: renamed from: o.jaL$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC26469jcs interfaceC26469jcs, Continuation<? super Unit> continuation) {
            C26330jaL c26330jaL = C26330jaL.this;
            c26330jaL.AEQbTJ(c26330jaL.AEQbTJ(), interfaceC26469jcs);
            return Unit.INSTANCE;
        }
    }

    public final void valueOf() {
        StateFlow<InterfaceC26469jcs> stateFlowGEmmrt = EZpvd().gEmmrt();
        Lifecycle.State state = Lifecycle.State.CREATED;
        C27589jxz.EZpvd(this, stateFlowGEmmrt, state, new TaskDescription());
        C27589jxz.EZpvd(this, EZpvd().OLrzqt(), state, new Activity());
        C27589jxz.EZpvd(this, FlowKt.debounce(EZpvd().AEQbTJ(), 200L), state, new StateListAnimator());
    }

    /* JADX INFO: renamed from: o.jaL$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC26463jcm interfaceC26463jcm, Continuation<? super Unit> continuation) {
            C26330jaL c26330jaL = C26330jaL.this;
            c26330jaL.EZpvd(c26330jaL.AEQbTJ(), interfaceC26463jcm);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jaL$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(Unit unit, Continuation<? super Unit> continuation) {
            C26330jaL.this.EZpvd().AhwBna();
            return Unit.INSTANCE;
        }
    }

    public final void djBIcL() {
        java.lang.String property;
        C27385juG c27385juG = AEQbTJ().copydefault;
        java.lang.String str = "";
        Intrinsics.checkNotNullExpressionValue(c27385juG, "");
        c27385juG.setVisibility(AYXKKw() ^ true ? 0 : 8);
        AEQbTJ().copydefault.removeAllViews();
        final iJL ijlKWHzl = iJL.KWHzl(getLayoutInflater(), AEQbTJ().copydefault, true);
        Intrinsics.checkNotNullExpressionValue(ijlKWHzl, "");
        final OKSortTextView oKSortTextView = ijlKWHzl.KWHzl;
        oKSortTextView.setSortType(OKSortTextView.SortType.DOWN, true);
        oKSortTextView.setOnClickListener(new View.OnClickListener() { // from class: o.jaP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C26330jaL.copydefault(ijlKWHzl, oKSortTextView, this, view);
            }
        });
        final OKSortTextView oKSortTextView2 = ijlKWHzl.djBIcL;
        oKSortTextView2.setSortType(OKSortTextView.SortType.NONE, true);
        oKSortTextView2.setOnClickListener(new View.OnClickListener() { // from class: o.jaQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C26330jaL.AEQbTJ(ijlKWHzl, oKSortTextView2, this, view);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(AEQbTJ().getRoot(), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.jaV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return C26330jaL.copydefault(this.KWHzl, view, windowInsetsCompat);
            }
        });
        DexEntranceProductListVM dexEntranceProductListVMEZpvd = EZpvd();
        DexEntranceProductQuery dexEntranceProductQueryOLrzqt = OLrzqt();
        if (dexEntranceProductQueryOLrzqt != null && (property = dexEntranceProductQueryOLrzqt.getProperty()) != null) {
            str = property;
        }
        dexEntranceProductListVMEZpvd.EZpvd(str, DexEntranceSortOrder.DESC.getValue());
    }

    public static final void copydefault(iJL ijl, OKSortTextView oKSortTextView, C26330jaL c26330jaL, android.view.View view) {
        OKSortTextView.setSortType$default(ijl.djBIcL, OKSortTextView.SortType.NONE, false, 2, null);
        OKSortTextView.SortType sortTypeOLrzqt = oKSortTextView.OLrzqt();
        OKSortTextView.SortType sortType = OKSortTextView.SortType.DOWN;
        if (sortTypeOLrzqt == sortType) {
            OKSortTextView.setSortType$default(oKSortTextView, OKSortTextView.SortType.UP, false, 2, null);
        } else {
            OKSortTextView.setSortType$default(oKSortTextView, sortType, false, 2, null);
        }
        c26330jaL.EZpvd().EZpvd(DexEntranceSortType.RATE.getValue(), c26330jaL.OLrzqt(oKSortTextView.OLrzqt()));
    }

    public static final void AEQbTJ(iJL ijl, OKSortTextView oKSortTextView, C26330jaL c26330jaL, android.view.View view) {
        OKSortTextView.setSortType$default(ijl.KWHzl, OKSortTextView.SortType.NONE, false, 2, null);
        OKSortTextView.SortType sortTypeOLrzqt = oKSortTextView.OLrzqt();
        OKSortTextView.SortType sortType = OKSortTextView.SortType.DOWN;
        if (sortTypeOLrzqt == sortType) {
            OKSortTextView.setSortType$default(oKSortTextView, OKSortTextView.SortType.UP, false, 2, null);
        } else {
            OKSortTextView.setSortType$default(oKSortTextView, sortType, false, 2, null);
        }
        c26330jaL.EZpvd().EZpvd(DexEntranceSortType.TVL.getValue(), c26330jaL.OLrzqt(oKSortTextView.OLrzqt()));
    }

    public static final WindowInsetsCompat copydefault(C26330jaL c26330jaL, android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        RecyclerView recyclerView = c26330jaL.AEQbTJ().AYXKKw;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = c26330jaL.AEQbTJ().copydefault.getHeight();
            recyclerView.setLayoutParams(marginLayoutParams);
            return windowInsetsCompat;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void gEmmrt() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DexEntranceProductListFragment$triggerLoadMoreEvent$1(this, null), 3, null);
    }

    public final java.lang.String OLrzqt(OKSortTextView.SortType sortType) {
        int i = ActionBar.OLrzqt[sortType.ordinal()];
        if (i != 1) {
            return i != 2 ? "" : DexEntranceSortOrder.DESC.getValue();
        }
        return DexEntranceSortOrder.ASC.getValue();
    }

    public final void KWHzl(C23744iHs c23744iHs) {
        RecyclerView recyclerView = c23744iHs.AYXKKw;
        recyclerView.setAdapter(KWHzl());
        if (AYXKKw()) {
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setOverScrollMode(2);
        } else {
            copydefault(c23744iHs);
        }
        C33546myW c33546myW = c23744iHs.KWHzl;
        c33546myW.setNoMoreDataEffective(true);
        c33546myW.AhwBna(true);
        InterfaceC57927yre interfaceC57927yreIsConnected = c33546myW.isConnected();
        C27215jqw c27215jqw = interfaceC57927yreIsConnected instanceof C27215jqw ? (C27215jqw) interfaceC57927yreIsConnected : null;
        if (c27215jqw != null) {
            java.lang.String string = getString(C25493ixk.FragmentManager.fbC);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c27215jqw.setNoMoreText(string);
        }
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.jaJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C26330jaL.copydefault(this.copydefault, interfaceC57934yrl);
            }
        });
    }

    public static final void copydefault(C26330jaL c26330jaL, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c26330jaL.gEmmrt();
    }

    public static final void copydefault(C26330jaL c26330jaL, android.view.View view) {
        c26330jaL.EZpvd().djBIcL();
    }

    public final void EZpvd(C23744iHs c23744iHs) {
        c23744iHs.AEQbTJ.setRetryClickListener(new View.OnClickListener() { // from class: o.jaK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C26330jaL.copydefault(this.OLrzqt, view);
            }
        });
    }

    public final void AEQbTJ(C23744iHs c23744iHs, InterfaceC26469jcs interfaceC26469jcs) {
        OLrzqt(c23744iHs, interfaceC26469jcs, EZpvd().copydefault().OLrzqt());
        if (interfaceC26469jcs instanceof InterfaceC26469jcs.ActionBar) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            copydefault(c23744iHs, ((InterfaceC26469jcs.ActionBar) interfaceC26469jcs).OLrzqt());
        }
        if (interfaceC26469jcs instanceof InterfaceC26469jcs.TaskDescription) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    public final void copydefault(C23744iHs c23744iHs, C26468jcr c26468jcr) {
        if (c26468jcr.copydefault().isEmpty()) {
            return;
        }
        java.util.List<InterfaceC27436jvE> listCopydefault = c26468jcr.copydefault();
        if (AYXKKw()) {
            listCopydefault = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) listCopydefault, 5);
        }
        C27588jxy.AEQbTJ(KWHzl(), listCopydefault);
        c23744iHs.getRoot().requestLayout();
    }

    /* JADX INFO: renamed from: o.jaL$Fragment */
    public static final class Fragment extends RecyclerView.OnScrollListener {
        public final /* synthetic */ LinearLayoutManager KWHzl;

        public Fragment(LinearLayoutManager linearLayoutManager) {
            this.KWHzl = linearLayoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            if (C26330jaL.this.copydefault(this.KWHzl)) {
                C26330jaL.this.gEmmrt();
            }
        }
    }

    public final void copydefault(C23744iHs c23744iHs) {
        RecyclerView.LayoutManager layoutManager = c23744iHs.AYXKKw.getLayoutManager();
        Intrinsics.copydefault(layoutManager, "");
        c23744iHs.AYXKKw.addOnScrollListener(new Fragment((LinearLayoutManager) layoutManager));
    }

    public final void EZpvd(C23744iHs c23744iHs, InterfaceC26463jcm interfaceC26463jcm) {
        if (interfaceC26463jcm instanceof InterfaceC26463jcm.TaskDescription) {
            c23744iHs.KWHzl.valueOf();
            c23744iHs.KWHzl.KWHzl(EZpvd().copydefault().KWHzl());
        } else {
            if (!(interfaceC26463jcm instanceof InterfaceC26463jcm.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            c23744iHs.KWHzl.copydefault(false);
            C55328xhq.show$default(C55328xhq.OLrzqt, getString(C25493ixk.FragmentManager.DcMfJKfNLfdT), ContextCompat.getDrawable(requireContext(), C52761wXj.TaskDescription.dPkBzA), 0, (java.lang.Integer) null, 0, 0, 60, (java.lang.Object) null);
        }
    }

    public final void OLrzqt(C23744iHs c23744iHs, InterfaceC26469jcs interfaceC26469jcs, boolean z) {
        C33546myW c33546myW = c23744iHs.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        boolean z2 = interfaceC26469jcs instanceof InterfaceC26469jcs.ActionBar;
        int i = 8;
        c33546myW.setVisibility((!z2 || z) ? 8 : 0);
        C55173xeu c55173xeu = c23744iHs.AEQbTJ;
        Intrinsics.copydefault(c55173xeu);
        if ((z2 || (interfaceC26469jcs instanceof InterfaceC26469jcs.TaskDescription)) && z) {
            i = 0;
        }
        c55173xeu.setVisibility(i);
        c55173xeu.setEmptyTypeImage(KWHzl(interfaceC26469jcs));
        c55173xeu.setTitle(copydefault(interfaceC26469jcs));
        java.lang.String string = interfaceC26469jcs instanceof InterfaceC26469jcs.TaskDescription ? getString(C25493ixk.FragmentManager.AEQbTJ) : "";
        Intrinsics.copydefault((java.lang.Object) string);
        c55173xeu.setRetry(string);
        C55113xdn c55113xdn = c23744iHs.OLrzqt;
        if (interfaceC26469jcs instanceof InterfaceC26469jcs.StateListAnimator) {
            c55113xdn.KWHzl(100L);
        } else {
            c55113xdn.copydefault();
        }
    }

    public final java.lang.String copydefault(InterfaceC26469jcs interfaceC26469jcs) {
        if (interfaceC26469jcs instanceof InterfaceC26469jcs.TaskDescription) {
            return C43422row.OLrzqt();
        }
        java.lang.String string = getString(C25493ixk.FragmentManager.DcMfJKRKUgwx);
        Intrinsics.copydefault((java.lang.Object) string);
        return string;
    }

    public final int KWHzl(InterfaceC26469jcs interfaceC26469jcs) {
        return interfaceC26469jcs instanceof InterfaceC26469jcs.TaskDescription ? 8 : 7;
    }

    public final boolean copydefault(LinearLayoutManager linearLayoutManager) {
        RecyclerView.Adapter adapter = AEQbTJ().AYXKKw.getAdapter();
        return linearLayoutManager.findLastVisibleItemPosition() > (adapter != null ? adapter.getItemCount() : 0);
    }

    public final void AEQbTJ(DexEntranceProductQuery dexEntranceProductQuery) {
        java.lang.String property;
        java.lang.String order;
        EZpvd().OLrzqt(dexEntranceProductQuery);
        DexEntranceProductListVM dexEntranceProductListVMEZpvd = EZpvd();
        java.lang.String str = "";
        if (dexEntranceProductQuery == null || (property = dexEntranceProductQuery.getProperty()) == null) {
            property = "";
        }
        if (dexEntranceProductQuery != null && (order = dexEntranceProductQuery.getOrder()) != null) {
            str = order;
        }
        dexEntranceProductListVMEZpvd.EZpvd(property, str);
        EZpvd().djBIcL();
    }
}

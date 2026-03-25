package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.find_ui.ranking.dex.viewmodel.MarketHomeDexViewModel;
import com.okinc.market.discover.features.markets.card.dex.CardDexListFragment$setListener$2;
import com.okinc.market.discover.features.markets.card.dex.viewmodel.MarketCardDexListViewModel;
import com.okinc.market.quotation.ui.AbsQuotationFragment;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import com.okinc.market.quotation.ui.model.dex.DexSortByEnum;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.C34964nmQ;
import o.InterfaceC49361unB;
import o.InterfaceC49371unL;
import o.qXK;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pZZ extends AbstractC40585qai implements InterfaceC49363unD {
    public C42712rbb EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm gEmmrt;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.DWgRXt;
    }

    public pZZ() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.market.discover.features.markets.card.dex.CardDexListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.discover.features.markets.card.dex.CardDexListFragment$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCardDexListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.discover.features.markets.card.dex.CardDexListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.discover.features.markets.card.dex.CardDexListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.discover.features.markets.card.dex.CardDexListFragment$special$$inlined$viewModels$default$5
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
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qae
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pZZ.AEQbTJ();
            }
        });
    }

    public final MarketCardDexListViewModel AhwBna() {
        return (MarketCardDexListViewModel) this.gEmmrt.getValue();
    }

    public static final C40590qan AEQbTJ() {
        return new C40590qan();
    }

    public final C40590qan KWHzl() {
        return (C40590qan) this.KWHzl.getValue();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pZZ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.AbstractC40579qac, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        setTAG(super.getTAG() + "_Card");
        C42712rbb c42712rbbCopydefault = C42712rbb.copydefault(view);
        Intrinsics.copydefault(c42712rbbCopydefault);
        copydefault(c42712rbbCopydefault);
        this.EZpvd = c42712rbbCopydefault;
    }

    public final void copydefault(C42712rbb c42712rbb) {
        RecyclerView recyclerView = c42712rbb.EZpvd;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        super.copydefault(recyclerView);
        c42712rbb.EZpvd.setAdapter(KWHzl());
        qXK.StateListAnimator.showLoadingState$default(c42712rbb.OLrzqt, 0L, 1, null);
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, AhwBna(), new MutablePropertyReference1Impl() { // from class: com.okinc.market.discover.features.markets.card.dex.CardDexListFragment$setListener$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketHomeDexViewModel.StateListAnimator) obj).OLrzqt();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketHomeDexViewModel.StateListAnimator) obj).AEQbTJ((InterfaceC49371unL<? extends List<C34964nmQ>>) obj2);
            }
        }, null, new CardDexListFragment$setListener$2(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(InterfaceC49371unL<? extends java.util.List<C34964nmQ>> interfaceC49371unL) {
        C41303qoK c41303qoK;
        C41303qoK c41303qoK2;
        C41303qoK c41303qoK3;
        C41303qoK c41303qoK4;
        if (interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription) {
            C41298qoF.AEQbTJ.EZpvd(getTAG(), "updateContentListUI " + interfaceC49371unL);
            C42712rbb c42712rbb = this.EZpvd;
            if (c42712rbb != null && (c41303qoK4 = c42712rbb.OLrzqt) != null) {
                qXK.StateListAnimator.showEmptyState$default(c41303qoK4, qZH.PendingIntent.getPostValueLengthLimit, 0, 0, 0, (Function0) null, 30, (java.lang.Object) null);
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
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
                EZpvd(new InterfaceC49371unL.TaskDescription(activity.copydefault()));
                return;
            }
            C41298qoF.AEQbTJ.EZpvd(getTAG(), "updateContentListUI success " + list.size());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(list);
            arrayList.add(new C27622jyf());
            AbstractC40521qYy.submitList$default(KWHzl(), arrayList, null, 2, null);
            C42712rbb c42712rbb2 = this.EZpvd;
            if (c42712rbb2 != null && (c41303qoK3 = c42712rbb2.OLrzqt) != null) {
                c41303qoK3.values();
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
            C41298qoF.AEQbTJ.EZpvd(getTAG(), "updateContentListUI loading");
            C42712rbb c42712rbb3 = this.EZpvd;
            if (c42712rbb3 == null || (c41303qoK2 = c42712rbb3.OLrzqt) == null) {
                return;
            }
            qXK.StateListAnimator.showLoadingState$default(c41303qoK2, 0L, 1, null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            C41298qoF.w$default(C41298qoF.AEQbTJ, getTAG(), "updateContentListUI error " + interfaceC49371unL, null, 4, null);
            if (((InterfaceC49371unL.Application) interfaceC49371unL).AEQbTJ() instanceof CancellationException) {
                return;
            }
            C42712rbb c42712rbb4 = this.EZpvd;
            if (c42712rbb4 != null && (c41303qoK = c42712rbb4.OLrzqt) != null) {
                c41303qoK.copydefault(getString(qZH.PendingIntent.DsL), getString(qZH.PendingIntent.djSkpj), getString(qZH.PendingIntent.fetchVPNInfo), new Function0() { // from class: o.qaf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return pZZ.EZpvd(this.KWHzl);
                    }
                });
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        C41298qoF.AEQbTJ.EZpvd(getTAG(), "updateContentListUI unknown " + interfaceC49371unL);
    }

    public static final Unit EZpvd(pZZ pzz) {
        AbsQuotationFragment.startSubscribeData$default(pzz, null, 1, null);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.market.quotation.ui.AbsQuotationFragment
    public java.lang.Object OLrzqt(@NotNull AbsQuotationFragment.SubscribeType subscribeType, @NotNull Continuation<? super Unit> continuation) {
        return AhwBna().copydefault(DexChainGroupVo.Companion.copydefault(), DexPeriodEnum.ONE_DAY, C56390yDp.OLrzqt(DexSortByEnum.NONE, SortOrder.NONE), 6, continuation);
    }

    @Override // com.okinc.market.quotation.ui.AbsQuotationFragment, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        androidx.fragment.app.FragmentManager childFragmentManager;
        super.onResume();
        rVN.copydefault(this);
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        if (parentFragment == null || (childFragmentManager = parentFragment.getChildFragmentManager()) == null) {
            return;
        }
        childFragmentManager.setFragmentResultListener("REQUEST_CLICK_ARROW", this, new FragmentResultListener() { // from class: o.qag
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                pZZ.EZpvd(this.AEQbTJ, str, bundle);
            }
        });
    }

    public static final void EZpvd(pZZ pzz, java.lang.String str, android.os.Bundle bundle) {
        android.content.Context context;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (!Intrinsics.EZpvd((java.lang.Object) bundle.getString("type"), (java.lang.Object) "dex-rank") || (context = pzz.getContext()) == null) {
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

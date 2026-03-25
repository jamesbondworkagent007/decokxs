package o;

import android.view.View;
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
import com.okinc.buysell.api.BSCBuySellBaseCurrencyInfo;
import com.okinc.buysell.api.BSCEntranceParameters;
import com.okinc.buysell.api.BSCTargetTab;
import com.okinc.buysell.api.data.BSCOrderFrequency;
import com.okinc.buysell.api.data.BSCOrderType;
import com.okinc.buysell.api.data.OKPaymentSourceLegacy;
import com.okinc.buysell.ui.recurring.RecurringBuyPlanHostActivityViewModel;
import com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanListLegacyFragment$subscribeToUiState$1;
import com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanListLegacyViewModel;
import com.okinc.buysell.ui.recurring.list.RecurringBuyPlanListLegacyItemTemplate;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C31351lsQ;
import o.C55284xgz;
import o.InterfaceC31422lti;
import o.mDC;

/* JADX INFO: loaded from: classes15.dex */
public final class lRD extends AbstractC30240lRa<AbstractC31544lvy> implements lPL, InterfaceC31431ltr {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int gEmmrt = 8;
    public final C43316rmw AYXKKw;
    public boolean AhwBna;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lPL
    public void OLrzqt() {
        this.AhwBna = true;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0004: CHECK_CAST (o.lvy) (wrap:T:0x0000: INVOKE (r0v0 o.lRD) VIRTUAL call: o.mIi.isConnected():androidx.databinding.ViewDataBinding A[MD:():T extends androidx.databinding.ViewDataBinding (m), WRAPPED] (LINE:41)) */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC31544lvy OLrzqt(lRD lrd) {
        return (AbstractC31544lvy) lrd.isConnected();
    }

    public lRD() {
        super(C31351lsQ.ActionBar.RcXXUw);
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanListLegacyFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanListLegacyFragment$special$$inlined$viewModels$default$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RecurringBuyPlanListLegacyViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanListLegacyFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanListLegacyFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanListLegacyFragment$special$$inlined$viewModels$default$5
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RecurringBuyPlanHostActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanListLegacyFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanListLegacyFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanListLegacyFragment$special$$inlined$activityViewModels$default$3
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
        this.AYXKKw = new C43316rmw();
    }

    public RecurringBuyPlanListLegacyViewModel AkhnZx() {
        return (RecurringBuyPlanListLegacyViewModel) this.valueOf.getValue();
    }

    private final RecurringBuyPlanHostActivityViewModel fetchVPNInfo() {
        return (RecurringBuyPlanHostActivityViewModel) this.djBIcL.getValue();
    }

    @Override // o.InterfaceC31431ltr
    public void KWHzl() {
        AkhnZx().KWHzl();
    }

    @Override // o.AbstractC31907mIi
    public void djBIcL() {
        RecurringBuyPlanListLegacyViewModel recurringBuyPlanListLegacyViewModelAkhnZx = AkhnZx();
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("arg.base_currency") : null;
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string2 = arguments2 != null ? arguments2.getString("arg.quote_currency") : null;
        android.os.Bundle arguments3 = getArguments();
        recurringBuyPlanListLegacyViewModelAkhnZx.KWHzl(string, string2, arguments3 != null ? arguments3.getString("arg.status") : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC31907mIi
    public void gEmmrt() {
        ((AbstractC31544lvy) isConnected()).KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.lRH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lRD.EZpvd(this.EZpvd, view);
            }
        });
        ((AbstractC31544lvy) isConnected()).OLrzqt.setRetryClickListener(new View.OnClickListener() { // from class: o.lRG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lRD.AEQbTJ(this.AEQbTJ, view);
            }
        });
        ((AbstractC31544lvy) isConnected()).AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.lRE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lRD.AhwBna(this.copydefault, view);
            }
        });
        RecyclerView recyclerView = ((AbstractC31544lvy) isConnected()).djBIcL;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext(), 1, false);
        recyclerView.addItemDecoration(new C31703mAu(recyclerView.getResources().getDimensionPixelSize(mDC.Activity.EZpvd), 0));
        recyclerView.setLayoutManager(linearLayoutManager);
        C43316rmw c43316rmw = this.AYXKKw;
        c43316rmw.register(C30273lSg.class, new RecurringBuyPlanListLegacyItemTemplate(new Function1() { // from class: o.lRI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lRD.KWHzl(this.AEQbTJ, (C30273lSg) obj);
            }
        }));
        recyclerView.setAdapter(c43316rmw);
        recyclerView.addOnScrollListener(new StateListAnimator(linearLayoutManager, this));
        AkhnZx().AEQbTJ();
    }

    public static final void EZpvd(lRD lrd, android.view.View view) {
        RecurringBuyPlanHostActivityViewModel.onNavigateBack$default(lrd.fetchVPNInfo(), false, 1, null);
    }

    public static final void AEQbTJ(lRD lrd, android.view.View view) {
        FragmentActivity activity = lrd.getActivity();
        if (activity == null || !C43453rpa.AEQbTJ.KWHzl(activity)) {
            return;
        }
        lrd.AkhnZx().KWHzl();
    }

    public static final void AhwBna(lRD lrd, android.view.View view) {
        lrd.AkhnZx().OLrzqt("SimpleTrade_RecurringBuy_OrderListSetupRecurring_Click");
        FragmentActivity activity = lrd.getActivity();
        if (activity != null) {
            java.lang.String str = "BTC";
            java.lang.String str2 = "";
            BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            InterfaceC31422lti.ActionBar.goToBuySellConvertPage$default((InterfaceC31422lti) C43251rlk.copydefault(InterfaceC31422lti.class), activity, new BSCEntranceParameters(BSCTargetTab.BUY, str, str2, bSCBuySellBaseCurrencyInfo, str3, str4, str5, BSCOrderType.RECURRING, BSCOrderFrequency.WEEKLY, null, false, OKPaymentSourceLegacy.PAYMENT_INTERNAL_FLOW, null, null, null, false, 63096, null), false, 4, null);
        }
    }

    public static final Unit KWHzl(lRD lrd, C30273lSg c30273lSg) {
        Intrinsics.checkNotNullParameter(c30273lSg, "");
        lrd.AkhnZx().OLrzqt("SimpleTrade_RecurringBuy_OrderList_Click");
        lrd.fetchVPNInfo().copydefault(c30273lSg.djBIcL());
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator extends RecyclerView.OnScrollListener {
        public final /* synthetic */ LinearLayoutManager AEQbTJ;
        public final /* synthetic */ lRD copydefault;

        public StateListAnimator(LinearLayoutManager linearLayoutManager, lRD lrd) {
            this.AEQbTJ = linearLayoutManager;
            this.copydefault = lrd;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            if (this.AEQbTJ.findLastVisibleItemPosition() + 3 >= this.AEQbTJ.getItemCount()) {
                this.copydefault.AkhnZx().copydefault();
            }
        }
    }

    @Override // o.AbstractC31907mIi
    public void EZpvd() {
        DbNXlk();
        AkhnZx().EZpvd();
    }

    private final void DbNXlk() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new RecurringBuyPlanListLegacyFragment$subscribeToUiState$1(this, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void valueOf() {
        this.AhwBna = false;
        C55284xgz.Activity activity = C55284xgz.Companion;
        android.view.View root = ((AbstractC31544lvy) isConnected()).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        C55284xgz c55284xgzKWHzl = activity.KWHzl(root, C33070mpX.AYXKKw(C31351lsQ.Activity.getUserContextRegisteredStatus));
        if (c55284xgzKWHzl != null) {
            c55284xgzKWHzl.isConnected(3);
            c55284xgzKWHzl.djBIcL(0);
            c55284xgzKWHzl.hDKMBd();
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lRD.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final lRD EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            lRD lrd = new lRD();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("arg.base_currency", str);
            bundle.putString("arg.quote_currency", str2);
            bundle.putString("arg.status", str3);
            lrd.setArguments(bundle);
            return lrd;
        }
    }
}

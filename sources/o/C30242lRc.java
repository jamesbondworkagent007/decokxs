package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.buysell.api.BSCEntranceParameters;
import com.okinc.buysell.api.BSCTargetTab;
import com.okinc.buysell.ui.recurring.RecurringBuyErrorType;
import com.okinc.buysell.ui.recurring.RecurringBuyPlanHostActivityViewModel;
import com.okinc.buysell.ui.recurring.detail.bottomsheet.RecurringBuyPlanDetailConfirmationBottomSheet;
import com.okinc.buysell.ui.recurring.edit.model.RecurringFrequencyOption;
import com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanDetailLegacyViewModel;
import com.okinc.buysell.util.ABTestFeatureFlag;
import com.okinc.cruilib.view.listitem.share.OKCRTrend;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.service.BuySellOrderDetailParameters;
import com.okinc.okx.paymentapi.service.DepositWithdrawLandingPage;
import com.okinc.okx.paymentapi.service.DepositWithdrawPageParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.uilab.banner.OKAlertBanner;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.InterfaceC30225lQm;
import o.InterfaceC30234lQv;
import o.InterfaceC31422lti;
import o.InterfaceC33172mrT;
import o.InterfaceC47251tmX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lRc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C30242lRc extends lQX<AbstractC31541lvv> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int valueOf = 8;
    public RecurringBuyPlanDetailConfirmationBottomSheet AYXKKw;
    public C30231lQs AhwBna;
    public final C43316rmw djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;

    /* JADX INFO: renamed from: o.lRc$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.lRc$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RecurringBuyPlanDetailConfirmationBottomSheet.Companion.ConfirmationType.values().length];
            try {
                iArr[RecurringBuyPlanDetailConfirmationBottomSheet.Companion.ConfirmationType.PAUSE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringBuyPlanDetailConfirmationBottomSheet.Companion.ConfirmationType.CANCEL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    public C30242lRc() {
        super(C31351lsQ.ActionBar.aKErDB);
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanDetailLegacyFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanDetailLegacyFragment$special$$inlined$viewModels$default$2
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RecurringBuyPlanDetailLegacyViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanDetailLegacyFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanDetailLegacyFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanDetailLegacyFragment$special$$inlined$viewModels$default$5
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RecurringBuyPlanHostActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanDetailLegacyFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanDetailLegacyFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanDetailLegacyFragment$special$$inlined$activityViewModels$default$3
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
        this.djBIcL = new C43316rmw();
    }

    /* JADX DEBUG: Possible override for method o.lQX.AhwBna()V */
    public RecurringBuyPlanDetailLegacyViewModel AhwBna() {
        return (RecurringBuyPlanDetailLegacyViewModel) this.fetchVPNInfo.getValue();
    }

    private final RecurringBuyPlanHostActivityViewModel AYXKKw() {
        return (RecurringBuyPlanHostActivityViewModel) this.gEmmrt.getValue();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity == null || !C43453rpa.AEQbTJ.KWHzl(activity)) {
            return;
        }
        AhwBna().KWHzl(false);
    }

    @Override // o.AbstractC31907mIi, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C30231lQs c30231lQs = this.AhwBna;
        if (c30231lQs != null) {
            c30231lQs.dismissAllowingStateLoss();
        }
        super.onDestroyView();
    }

    @Override // o.AbstractC31907mIi
    public void djBIcL() {
        java.lang.String string;
        RecurringBuyPlanDetailLegacyViewModel recurringBuyPlanDetailLegacyViewModelAhwBna = AhwBna();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("arg.plan_id")) == null) {
            string = "";
        }
        android.os.Bundle arguments2 = getArguments();
        recurringBuyPlanDetailLegacyViewModelAhwBna.OLrzqt(string, arguments2 != null ? arguments2.getBoolean("arg.is_from_result_page") : false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC31907mIi
    public void gEmmrt() {
        ((AbstractC31541lvv) isConnected()).copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.lRe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30242lRc.valueOf(this.AEQbTJ, view);
            }
        });
        ((AbstractC31541lvv) isConnected()).djBIcL.OLrzqt(new InterfaceC57903yrG() { // from class: o.lRb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C30242lRc.EZpvd(this.copydefault, interfaceC57934yrl);
            }
        });
        ((AbstractC31541lvv) isConnected()).AhwBna.setRetryClickListener(new View.OnClickListener() { // from class: o.lRp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30242lRc.gEmmrt(this.AEQbTJ, view);
            }
        });
        ((AbstractC31541lvv) isConnected()).gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.lRs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30242lRc.isConnected(this.OLrzqt, view);
            }
        });
        ((AbstractC31541lvv) isConnected()).uzCIH.setOnClickListener(new View.OnClickListener() { // from class: o.lRr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30242lRc.AkhnZx(this.AEQbTJ, view);
            }
        });
        ((AbstractC31541lvv) isConnected()).gHZMYf.setOnClickListener(new View.OnClickListener() { // from class: o.lRq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30242lRc.DbNXlk(this.KWHzl, view);
            }
        });
        ((AbstractC31541lvv) isConnected()).hDKMBd.setOnClickListener(new View.OnClickListener() { // from class: o.lRx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30242lRc.values(this.AEQbTJ, view);
            }
        });
        RecyclerView recyclerView = ((AbstractC31541lvv) isConnected()).fARcdN;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        C43316rmw c43316rmw = this.djBIcL;
        c43316rmw.register(mHM.class, new mIX(new Function1() { // from class: o.lRv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30242lRc.AEQbTJ(this.EZpvd, (mHM) obj);
            }
        }));
        recyclerView.setAdapter(c43316rmw);
        AhwBna().AEQbTJ("SimpleTrade_RecurringBuy_PlanDetailsPage_View");
    }

    public static final void valueOf(C30242lRc c30242lRc, android.view.View view) {
        RecurringBuyPlanHostActivityViewModel.onNavigateBack$default(c30242lRc.AYXKKw(), false, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(C30242lRc c30242lRc, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c30242lRc.AhwBna().KWHzl(false);
        ((AbstractC31541lvv) c30242lRc.isConnected()).djBIcL.AEQbTJ();
    }

    public static final void gEmmrt(C30242lRc c30242lRc, android.view.View view) {
        FragmentActivity activity = c30242lRc.getActivity();
        if (activity == null || !C43453rpa.AEQbTJ.KWHzl(activity)) {
            return;
        }
        c30242lRc.AhwBna().KWHzl(true);
    }

    public static final void isConnected(C30242lRc c30242lRc, android.view.View view) {
        c30242lRc.KWHzl(RecurringBuyPlanDetailConfirmationBottomSheet.Companion.ConfirmationType.CANCEL);
    }

    public static final void AkhnZx(C30242lRc c30242lRc, android.view.View view) {
        c30242lRc.KWHzl(RecurringBuyPlanDetailConfirmationBottomSheet.Companion.ConfirmationType.PAUSE);
    }

    public static final void DbNXlk(C30242lRc c30242lRc, android.view.View view) {
        RecurringBuyPlanDetailLegacyViewModel.onPlanEvent$default(c30242lRc.AhwBna(), InterfaceC30225lQm.Application.EZpvd, null, null, 6, null);
    }

    public static final void values(C30242lRc c30242lRc, android.view.View view) {
        c30242lRc.AYXKKw().EZpvd(c30242lRc.AhwBna().copydefault());
        c30242lRc.AhwBna().EZpvd("View all");
    }

    public static final Unit AEQbTJ(C30242lRc c30242lRc, mHM mhm) {
        Intrinsics.checkNotNullParameter(mhm, "");
        InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class);
        android.content.Context contextRequireContext = c30242lRc.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        interfaceC47251tmX.copydefault(contextRequireContext, new BuySellOrderDetailParameters(TradeType.BUY, mhm.EZpvd(), OKPaymentSource.LITE_PORTFOLIO_TRANSACTION_HISTORY));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC31907mIi
    public void EZpvd() {
        AhwBna().AhwBna().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.lRw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30242lRc.AYXKKw(this.OLrzqt, (C32989mnw) obj);
            }
        }));
        AhwBna().OLrzqt().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.lRh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30242lRc.AhwBna(this.copydefault, (C32989mnw) obj);
            }
        }));
        AhwBna().AEQbTJ().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.lRg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30242lRc.valueOf(this.EZpvd, (C32989mnw) obj);
            }
        }));
        AhwBna().KWHzl().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.lRj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30242lRc.djBIcL(this.OLrzqt, (C32989mnw) obj);
            }
        }));
        AhwBna().valueOf().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.lRf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30242lRc.gEmmrt(this.copydefault, (C32989mnw) obj);
            }
        }));
        AhwBna().KWHzl(true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AYXKKw(C30242lRc c30242lRc, C32989mnw c32989mnw) {
        InterfaceC30234lQv interfaceC30234lQv = (InterfaceC30234lQv) c32989mnw.KWHzl();
        if (interfaceC30234lQv == null) {
            return Unit.INSTANCE;
        }
        if (interfaceC30234lQv instanceof InterfaceC30234lQv.ActionBar) {
            C33546myW c33546myW = ((AbstractC31541lvv) c30242lRc.isConnected()).djBIcL;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            c33546myW.setVisibility(0);
            C55113xdn c55113xdn = ((AbstractC31541lvv) c30242lRc.isConnected()).AkhnZx;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(8);
            C55173xeu c55173xeu = ((AbstractC31541lvv) c30242lRc.isConnected()).AhwBna;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(8);
            c30242lRc.KWHzl(((InterfaceC30234lQv.ActionBar) interfaceC30234lQv).OLrzqt());
        } else if (Intrinsics.EZpvd(interfaceC30234lQv, InterfaceC30234lQv.Activity.AEQbTJ)) {
            C55173xeu c55173xeu2 = ((AbstractC31541lvv) c30242lRc.isConnected()).AhwBna;
            Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
            c55173xeu2.setVisibility(0);
            C33546myW c33546myW2 = ((AbstractC31541lvv) c30242lRc.isConnected()).djBIcL;
            Intrinsics.checkNotNullExpressionValue(c33546myW2, "");
            c33546myW2.setVisibility(8);
            C55113xdn c55113xdn2 = ((AbstractC31541lvv) c30242lRc.isConnected()).AkhnZx;
            Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
            c55113xdn2.setVisibility(8);
        } else {
            if (!Intrinsics.EZpvd(interfaceC30234lQv, InterfaceC30234lQv.Application.AEQbTJ)) {
                throw new NoWhenBranchMatchedException();
            }
            C55113xdn c55113xdn3 = ((AbstractC31541lvv) c30242lRc.isConnected()).AkhnZx;
            Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
            c55113xdn3.setVisibility(0);
            C33546myW c33546myW3 = ((AbstractC31541lvv) c30242lRc.isConnected()).djBIcL;
            Intrinsics.checkNotNullExpressionValue(c33546myW3, "");
            c33546myW3.setVisibility(8);
            C55173xeu c55173xeu3 = ((AbstractC31541lvv) c30242lRc.isConnected()).AhwBna;
            Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
            c55173xeu3.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C30242lRc c30242lRc, C32989mnw c32989mnw) {
        if (((Unit) c32989mnw.KWHzl()) != null) {
            if (c30242lRc.AhwBna().gEmmrt()) {
                C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C31351lsQ.Activity.getUserContextRegisteredStatus), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
                InterfaceC33172mrT interfaceC33172mrT = (InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class);
                android.content.Context contextRequireContext = c30242lRc.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                InterfaceC33172mrT.TaskDescription.routeMain$default(interfaceC33172mrT, contextRequireContext, null, null, 6, null);
            } else {
                c30242lRc.AYXKKw().OLrzqt(true);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C30242lRc c30242lRc, C32989mnw c32989mnw) {
        if (((Unit) c32989mnw.KWHzl()) != null) {
            lTZ ltz = lTZ.KWHzl;
            android.content.Context contextRequireContext = c30242lRc.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            lTZ.showNotification$default(ltz, contextRequireContext, C33070mpX.AYXKKw(C31351lsQ.Activity.pauseLocationServices), 0, true, 0L, 20, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.lTZ.showNotification$default(o.lTZ, android.content.Context, java.lang.String, int, boolean, long, int, java.lang.Object):void */
    public static final Unit djBIcL(C30242lRc c30242lRc, C32989mnw c32989mnw) {
        if (((Unit) c32989mnw.KWHzl()) != null) {
            lTZ ltz = lTZ.KWHzl;
            android.content.Context contextRequireContext = c30242lRc.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            lTZ.showNotification$default(ltz, contextRequireContext, C33070mpX.AYXKKw(C31351lsQ.Activity.hOMIpD), 0, true, 0L, 20, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C30242lRc c30242lRc, C32989mnw c32989mnw) {
        if (((InterfaceC30225lQm) c32989mnw.KWHzl()) != null) {
            lTZ ltz = lTZ.KWHzl;
            android.content.Context contextRequireContext = c30242lRc.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            lTZ.showNotification$default(ltz, contextRequireContext, C33070mpX.AYXKKw(C31351lsQ.Activity.aVhqwO), 0, true, 0L, 20, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(lQE lqe) {
        OLrzqt(lqe.AEQbTJ());
        EZpvd(lqe.AYXKKw());
        KWHzl(lqe.copydefault());
        copydefault(lqe.OLrzqt());
        EZpvd(lqe.EZpvd());
        KWHzl(lqe.KWHzl());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(final C30236lQx c30236lQx) {
        AbstractC31541lvv abstractC31541lvv = (AbstractC31541lvv) isConnected();
        if (c30236lQx.gEmmrt()) {
            OKAlertBanner oKAlertBanner = abstractC31541lvv.KWHzl;
            Intrinsics.checkNotNullExpressionValue(oKAlertBanner, "");
            oKAlertBanner.setVisibility(0);
            abstractC31541lvv.KWHzl.gEmmrt().setText(c30236lQx.AYXKKw());
            abstractC31541lvv.KWHzl.KWHzl().setText(c30236lQx.AEQbTJ());
            if (c30236lQx.AhwBna()) {
                abstractC31541lvv.KWHzl.AEQbTJ().setVisibility(0);
                abstractC31541lvv.KWHzl.AEQbTJ().setText(c30236lQx.KWHzl());
                abstractC31541lvv.KWHzl.AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.lRy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C30242lRc.AEQbTJ(this.KWHzl, c30236lQx, view);
                    }
                });
                return;
            } else {
                abstractC31541lvv.KWHzl.AEQbTJ().setVisibility(8);
                if (Intrinsics.EZpvd((java.lang.Object) c30236lQx.EZpvd(), (java.lang.Object) RecurringBuyErrorType.PRICE_CHANGE.getValue())) {
                    abstractC31541lvv.EZpvd.setOKDSType(257);
                    return;
                } else {
                    abstractC31541lvv.EZpvd.setOKDSType(260);
                    return;
                }
            }
        }
        OKAlertBanner oKAlertBanner2 = abstractC31541lvv.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKAlertBanner2, "");
        oKAlertBanner2.setVisibility(8);
    }

    public static final void AEQbTJ(C30242lRc c30242lRc, C30236lQx c30236lQx, android.view.View view) {
        FragmentActivity activity = c30242lRc.getActivity();
        if (activity != null) {
            if (c30236lQx.OLrzqt()) {
                InterfaceC31422lti.ActionBar.goToBuySellConvertPage$default((InterfaceC31422lti) C43251rlk.copydefault(InterfaceC31422lti.class), activity, new BSCEntranceParameters(BSCTargetTab.BUY, c30236lQx.copydefault(), null, null, null, null, null, null, null, null, false, null, null, null, null, false, 65532, null), false, 4, null);
            } else {
                InterfaceC47251tmX.StateListAnimator.goToDepositWithdrawPage$default((InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class), activity, new DepositWithdrawPageParameters(new DepositWithdrawLandingPage.DepositPage(null, null, null, 7, null), OKPaymentSource.UNKNOWN_SOURCE), null, null, 12, null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(final lQB lqb) {
        java.lang.String strOLrzqt;
        AbstractC31541lvv abstractC31541lvv = (AbstractC31541lvv) isConnected();
        abstractC31541lvv.AYXKKw.setText(lqb.copydefault());
        android.view.View root = abstractC31541lvv.iwGUEr.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(lqb.djBIcL() ? 0 : 8);
        abstractC31541lvv.zsXlph.setText(lqb.AYXKKw());
        abstractC31541lvv.AuCTel.setText(lqb.EZpvd());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) lqb.OLrzqt())) {
            android.widget.ImageView imageView = abstractC31541lvv.zLjUOn;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            android.widget.ImageView imageView2 = abstractC31541lvv.zLjUOn;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            if (C33492mxV.OLrzqt()) {
                strOLrzqt = lqb.KWHzl();
            } else {
                strOLrzqt = lqb.OLrzqt();
            }
            C33054mpH.loadUrl$default(imageView2, strOLrzqt, null, 0, 0, 14, null);
        } else {
            android.widget.ImageView imageView3 = abstractC31541lvv.zLjUOn;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            imageView3.setVisibility(8);
        }
        C52794wYp c52794wYp = abstractC31541lvv.EZpvd;
        if (C30327lUg.AEQbTJ(ABTestFeatureFlag.RECURRING_BUY_EDIT_AMOUNT_AND_FREQUENCY)) {
            Intrinsics.copydefault(c52794wYp);
            c52794wYp.setVisibility(0);
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.lRt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C30242lRc.copydefault(lqb, this, view);
                }
            });
        } else {
            Intrinsics.copydefault(c52794wYp);
            c52794wYp.setVisibility(8);
        }
    }

    public static final void copydefault(final lQB lqb, final C30242lRc c30242lRc, android.view.View view) {
        lQD.Companion.copydefault(lqb.AEQbTJ(), new Function1() { // from class: o.lRi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30242lRc.EZpvd(lqb, c30242lRc, (java.lang.String) obj);
            }
        }).show(c30242lRc.getChildFragmentManager(), "EditAmountBottomSheet");
    }

    public static final Unit EZpvd(lQB lqb, C30242lRc c30242lRc, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) lqb.AEQbTJ().copydefault())) {
            c30242lRc.AhwBna().KWHzl(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(final C30238lQz c30238lQz) {
        AbstractC31541lvv abstractC31541lvv = (AbstractC31541lvv) isConnected();
        if (C30327lUg.AEQbTJ(ABTestFeatureFlag.RECURRING_BUY_EDIT_AMOUNT_AND_FREQUENCY)) {
            mIW miw = abstractC31541lvv.values;
            Intrinsics.copydefault(miw);
            miw.setVisibility(0);
            miw.setChipIcon(7);
            miw.setChipText(c30238lQz.EZpvd().getLabel());
            miw.setOnClickListener(new Function0() { // from class: o.lRl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C30242lRc.AEQbTJ(c30238lQz, this);
                }
            });
            android.widget.TextView textView = abstractC31541lvv.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            return;
        }
        mIW miw2 = abstractC31541lvv.values;
        Intrinsics.checkNotNullExpressionValue(miw2, "");
        miw2.setVisibility(8);
        android.widget.TextView textView2 = abstractC31541lvv.DbNXlk;
        Intrinsics.copydefault(textView2);
        textView2.setVisibility(0);
        textView2.setText(c30238lQz.EZpvd().getLabel());
    }

    public static final Unit AEQbTJ(C30238lQz c30238lQz, final C30242lRc c30242lRc) {
        lQN.Companion.copydefault(c30238lQz.OLrzqt(), c30238lQz.EZpvd(), new Function1() { // from class: o.lRk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30242lRc.copydefault(this.KWHzl, (RecurringFrequencyOption) obj);
            }
        }).show(c30242lRc.getChildFragmentManager(), "RecurringBuyFrequencyOptionBottomSheet");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C30242lRc c30242lRc, RecurringFrequencyOption recurringFrequencyOption) {
        Intrinsics.checkNotNullParameter(recurringFrequencyOption, "");
        c30242lRc.AhwBna().OLrzqt(recurringFrequencyOption.getFrequency());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(lQC lqc) {
        AbstractC31541lvv abstractC31541lvv = (AbstractC31541lvv) isConnected();
        abstractC31541lvv.OLrzqt.OLrzqt.setText(lqc.EZpvd().EZpvd());
        android.widget.TextView textView = abstractC31541lvv.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        copydefault(textView, lqc.EZpvd().OLrzqt());
        abstractC31541lvv.OLrzqt.KWHzl.setText(lqc.EZpvd().KWHzl());
        abstractC31541lvv.OLrzqt.copydefault.setImageResource(lqc.EZpvd().copydefault());
        abstractC31541lvv.valueOf.OLrzqt.setText(lqc.copydefault().EZpvd());
        android.widget.TextView textView2 = abstractC31541lvv.valueOf.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        copydefault(textView2, lqc.copydefault().OLrzqt());
        abstractC31541lvv.valueOf.KWHzl.setText(lqc.copydefault().KWHzl());
        abstractC31541lvv.valueOf.copydefault.setImageResource(lqc.copydefault().copydefault());
        abstractC31541lvv.QKVWgx.OLrzqt.setText(lqc.KWHzl().EZpvd());
        android.widget.TextView textView3 = abstractC31541lvv.QKVWgx.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        copydefault(textView3, lqc.KWHzl().OLrzqt());
        abstractC31541lvv.QKVWgx.KWHzl.setText(lqc.KWHzl().KWHzl());
        abstractC31541lvv.QKVWgx.copydefault.setImageResource(lqc.KWHzl().copydefault());
        abstractC31541lvv.AubY.OLrzqt.setText(lqc.OLrzqt().EZpvd());
        android.widget.TextView textView4 = abstractC31541lvv.AubY.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        copydefault(textView4, lqc.OLrzqt().OLrzqt());
        abstractC31541lvv.AubY.KWHzl.setText(lqc.OLrzqt().KWHzl());
        abstractC31541lvv.AubY.copydefault.setImageResource(lqc.OLrzqt().copydefault());
        android.widget.ImageView imageView = abstractC31541lvv.AubY.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
        abstractC31541lvv.AubY.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.lRo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30242lRc.djBIcL(this.OLrzqt, view);
            }
        });
    }

    public static final void djBIcL(C30242lRc c30242lRc, android.view.View view) {
        C30231lQs c30231lQs = c30242lRc.AhwBna;
        if (c30231lQs != null) {
            c30231lQs.dismissAllowingStateLoss();
        }
        C30231lQs c30231lQsKWHzl = C30231lQs.Companion.KWHzl();
        c30242lRc.AhwBna = c30231lQsKWHzl;
        if (c30231lQsKWHzl != null) {
            androidx.fragment.app.FragmentManager childFragmentManager = c30242lRc.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c30231lQsKWHzl.show(childFragmentManager);
        }
    }

    private final void copydefault(android.widget.TextView textView, lQA lqa) {
        if (lqa.EZpvd()) {
            OKCRTrend oKCRTrendAEQbTJ = lqa.AEQbTJ();
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView.setTextColor(C31932mJg.EZpvd(oKCRTrendAEQbTJ, context));
            return;
        }
        if (lqa.copydefault() != 0) {
            textView.setTextColor(C33070mpX.copydefault(lqa.copydefault()));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(C30237lQy c30237lQy) {
        ConstraintLayout constraintLayout = ((AbstractC31541lvv) isConnected()).hDKMBd;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(c30237lQy.OLrzqt() ? 0 : 8);
        C43316rmw c43316rmw = this.djBIcL;
        c43316rmw.setItems(c30237lQy.copydefault());
        c43316rmw.notifyDataSetChanged();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(C30235lQw c30235lQw) {
        AbstractC31541lvv abstractC31541lvv = (AbstractC31541lvv) isConnected();
        if (c30235lQw.EZpvd()) {
            ConstraintLayout constraintLayout = abstractC31541lvv.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(0);
            C52794wYp c52794wYp = abstractC31541lvv.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(c30235lQw.AEQbTJ() ? 0 : 8);
            C52794wYp c52794wYp2 = abstractC31541lvv.uzCIH;
            Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
            c52794wYp2.setVisibility(c30235lQw.OLrzqt() ? 0 : 8);
            C52794wYp c52794wYp3 = abstractC31541lvv.gHZMYf;
            Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
            c52794wYp3.setVisibility(c30235lQw.KWHzl() ? 0 : 8);
            return;
        }
        ConstraintLayout constraintLayout2 = abstractC31541lvv.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        constraintLayout2.setVisibility(8);
    }

    private final void KWHzl(final RecurringBuyPlanDetailConfirmationBottomSheet.Companion.ConfirmationType confirmationType) {
        RecurringBuyPlanDetailConfirmationBottomSheet recurringBuyPlanDetailConfirmationBottomSheet = this.AYXKKw;
        if (recurringBuyPlanDetailConfirmationBottomSheet != null) {
            recurringBuyPlanDetailConfirmationBottomSheet.dismissAllowingStateLoss();
        }
        RecurringBuyPlanDetailConfirmationBottomSheet recurringBuyPlanDetailConfirmationBottomSheetAEQbTJ = RecurringBuyPlanDetailConfirmationBottomSheet.Companion.AEQbTJ(confirmationType);
        recurringBuyPlanDetailConfirmationBottomSheetAEQbTJ.copydefault(new Function1() { // from class: o.lRn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30242lRc.copydefault(this.AEQbTJ, confirmationType, (RecurringBuyPlanDetailConfirmationBottomSheet.Companion.ConfirmationType) obj);
            }
        });
        recurringBuyPlanDetailConfirmationBottomSheetAEQbTJ.EZpvd(new Function1() { // from class: o.lRm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30242lRc.AEQbTJ(this.OLrzqt, (RecurringBuyPlanDetailConfirmationBottomSheet.Companion.ConfirmationType) obj);
            }
        });
        this.AYXKKw = recurringBuyPlanDetailConfirmationBottomSheetAEQbTJ;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        recurringBuyPlanDetailConfirmationBottomSheetAEQbTJ.show(childFragmentManager);
    }

    public static final Unit copydefault(C30242lRc c30242lRc, RecurringBuyPlanDetailConfirmationBottomSheet.Companion.ConfirmationType confirmationType, RecurringBuyPlanDetailConfirmationBottomSheet.Companion.ConfirmationType confirmationType2) {
        InterfaceC30225lQm interfaceC30225lQm;
        Intrinsics.checkNotNullParameter(confirmationType2, "");
        RecurringBuyPlanDetailConfirmationBottomSheet recurringBuyPlanDetailConfirmationBottomSheet = c30242lRc.AYXKKw;
        if (recurringBuyPlanDetailConfirmationBottomSheet != null) {
            recurringBuyPlanDetailConfirmationBottomSheet.dismissAllowingStateLoss();
        }
        RecurringBuyPlanDetailLegacyViewModel recurringBuyPlanDetailLegacyViewModelAhwBna = c30242lRc.AhwBna();
        int i = TaskDescription.AEQbTJ[confirmationType.ordinal()];
        if (i == 1) {
            interfaceC30225lQm = InterfaceC30225lQm.TaskDescription.AEQbTJ;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC30225lQm = InterfaceC30225lQm.ActionBar.AEQbTJ;
        }
        RecurringBuyPlanDetailLegacyViewModel.onPlanEvent$default(recurringBuyPlanDetailLegacyViewModelAhwBna, interfaceC30225lQm, null, null, 6, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C30242lRc c30242lRc, RecurringBuyPlanDetailConfirmationBottomSheet.Companion.ConfirmationType confirmationType) {
        Intrinsics.checkNotNullParameter(confirmationType, "");
        RecurringBuyPlanDetailConfirmationBottomSheet recurringBuyPlanDetailConfirmationBottomSheet = c30242lRc.AYXKKw;
        if (recurringBuyPlanDetailConfirmationBottomSheet != null) {
            recurringBuyPlanDetailConfirmationBottomSheet.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.lRc$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lRc.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C30242lRc OLrzqt(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            C30242lRc c30242lRc = new C30242lRc();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("arg.plan_id", str);
            bundle.putBoolean("arg.is_from_result_page", z);
            c30242lRc.setArguments(bundle);
            return c30242lRc;
        }
    }
}

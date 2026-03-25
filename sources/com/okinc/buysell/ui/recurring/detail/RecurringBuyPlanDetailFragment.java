package com.okinc.buysell.ui.recurring.detail;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.buysell.api.BSCEntranceParameters;
import com.okinc.buysell.api.BSCTargetTab;
import com.okinc.buysell.ui.paymentmethod.PaymentMethodSelectionViewModel;
import com.okinc.buysell.ui.paymentmethod.data.SelectPaymentMethodResult;
import com.okinc.buysell.ui.recurring.RecurringBuyErrorType;
import com.okinc.buysell.ui.recurring.RecurringBuyPlanHostActivityViewModel;
import com.okinc.buysell.ui.recurring.detail.RecurringBuyPlanDetailFragment;
import com.okinc.buysell.ui.recurring.detail.bottomsheet.RecurringBuyPlanDetailConfirmationBottomSheet;
import com.okinc.buysell.ui.recurring.detail.mapper.RecurringBuyPlanDetailUiMapper;
import com.okinc.buysell.ui.recurring.edit.model.RecurringFrequencyOption;
import com.okinc.buysell.util.ABTestFeatureFlag;
import com.okinc.cruilib.view.listitem.share.OKCRTrend;
import com.okinc.okpaymentapi.data.remote.model.management.Account;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.service.BuySellOrderDetailParameters;
import com.okinc.okx.paymentapi.service.DepositWithdrawLandingPage;
import com.okinc.okx.paymentapi.service.DepositWithdrawPageParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.uilab.banner.OKAlertBanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC31541lvv;
import o.AbstractC31584lwm;
import o.C29826lBt;
import o.C30231lQs;
import o.C30280lSn;
import o.C30327lUg;
import o.C31351lsQ;
import o.C31662lzj;
import o.C31932mJg;
import o.C32989mnw;
import o.C33054mpH;
import o.C33070mpX;
import o.C33129mqd;
import o.C33492mxV;
import o.C3764AsB;
import o.C3769AsG;
import o.C3812Asx;
import o.C3813Asy;
import o.C3814Asz;
import o.C3816AtA;
import o.C3817AtB;
import o.C3818AtC;
import o.C3819AtD;
import o.C3826AtK;
import o.C3843Atb;
import o.C3952Avg;
import o.C43251rlk;
import o.C43316rmw;
import o.C43453rpa;
import o.C52794wYp;
import o.C55328xhq;
import o.C56392yDr;
import o.C56403yEb;
import o.C56524yIo;
import o.InterfaceC31422lti;
import o.InterfaceC31430ltq;
import o.InterfaceC33172mrT;
import o.InterfaceC47251tmX;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC57903yrG;
import o.InterfaceC57934yrl;
import o.lMD;
import o.lPN;
import o.lQA;
import o.lQC;
import o.lQD;
import o.lQF;
import o.lQN;
import o.lQV;
import o.lTZ;
import o.mHA;
import o.mIW;
import o.yCM;
import uniffi.buy_sell.RecurringBuyPlanDetailStatusChangeType;

/* JADX INFO: loaded from: classes15.dex */
public final class RecurringBuyPlanDetailFragment extends lPN<AbstractC31541lvv> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AYXKKw;
    public String AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public C30231lQs DbNXlk;
    public final InterfaceC56387yDm fetchVPNInfo;
    public RecurringBuyPlanDetailConfirmationBottomSheet gEmmrt;
    public final C43316rmw isConnected;

    @yCM
    public RecurringBuyPlanDetailUiMapper uiMapper;
    public boolean valueOf;

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RecurringBuyPlanDetailConfirmationBottomSheet.Companion.ConfirmationType.values().length];
            try {
                iArr[RecurringBuyPlanDetailConfirmationBottomSheet.Companion.ConfirmationType.PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringBuyPlanDetailConfirmationBottomSheet.Companion.ConfirmationType.CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[RecurringBuyPlanDetailStatusChangeType.values().length];
            try {
                iArr2[RecurringBuyPlanDetailStatusChangeType.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[RecurringBuyPlanDetailStatusChangeType.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RecurringBuyPlanDetailStatusChangeType.CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RecurringBuyPlanDetailStatusChangeType.PLAN_UPDATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[RecurringBuyPlanDetailStatusChangeType.PLAN_UPDATE_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            copydefault = iArr2;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0004: CHECK_CAST (o.lvv) (wrap:T:0x0000: INVOKE (r0v0 com.okinc.buysell.ui.recurring.detail.RecurringBuyPlanDetailFragment) VIRTUAL call: o.mIi.isConnected():androidx.databinding.ViewDataBinding A[MD:():T extends androidx.databinding.ViewDataBinding (m), WRAPPED] (LINE:87)) */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC31541lvv KWHzl(RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment) {
        return (AbstractC31541lvv) recurringBuyPlanDetailFragment.isConnected();
    }

    public RecurringBuyPlanDetailFragment() {
        super(C31351lsQ.ActionBar.aKErDB);
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.buysell.ui.recurring.detail.RecurringBuyPlanDetailFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.recurring.detail.RecurringBuyPlanDetailFragment$special$$inlined$viewModels$default$2
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RecurringBuyPlanDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.recurring.detail.RecurringBuyPlanDetailFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.recurring.detail.RecurringBuyPlanDetailFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.recurring.detail.RecurringBuyPlanDetailFragment$special$$inlined$viewModels$default$5
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RecurringBuyPlanHostActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.recurring.detail.RecurringBuyPlanDetailFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.recurring.detail.RecurringBuyPlanDetailFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.recurring.detail.RecurringBuyPlanDetailFragment$special$$inlined$activityViewModels$default$3
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PaymentMethodSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.recurring.detail.RecurringBuyPlanDetailFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.recurring.detail.RecurringBuyPlanDetailFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.recurring.detail.RecurringBuyPlanDetailFragment$special$$inlined$activityViewModels$default$6
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
        this.isConnected = new C43316rmw();
        this.AhwBna = "";
    }

    public RecurringBuyPlanDetailViewModel AhwBna() {
        return (RecurringBuyPlanDetailViewModel) this.AkhnZx.getValue();
    }

    private final RecurringBuyPlanHostActivityViewModel values() {
        return (RecurringBuyPlanHostActivityViewModel) this.AYXKKw.getValue();
    }

    private final PaymentMethodSelectionViewModel DbNXlk() {
        return (PaymentMethodSelectionViewModel) this.fetchVPNInfo.getValue();
    }

    public final RecurringBuyPlanDetailUiMapper AYXKKw() {
        RecurringBuyPlanDetailUiMapper recurringBuyPlanDetailUiMapper = this.uiMapper;
        if (recurringBuyPlanDetailUiMapper != null) {
            return recurringBuyPlanDetailUiMapper;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractC31907mIi, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C30231lQs c30231lQs = this.DbNXlk;
        if (c30231lQs != null) {
            c30231lQs.dismissAllowingStateLoss();
        }
        super.onDestroyView();
    }

    @Override // o.AbstractC31907mIi
    public void djBIcL() {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("arg.plan_id")) == null) {
            string = "";
        }
        this.AhwBna = string;
        Bundle arguments2 = getArguments();
        this.valueOf = arguments2 != null ? arguments2.getBoolean("arg.is_from_result_page") : false;
        AhwBna().EZpvd(this.AhwBna, this.valueOf);
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
        ((AbstractC31541lvv) isConnected()).copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.lPT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                RecurringBuyPlanDetailFragment.valueOf(this.KWHzl, view);
            }
        });
        ((AbstractC31541lvv) isConnected()).djBIcL.OLrzqt(new InterfaceC57903yrG() { // from class: o.lQe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                RecurringBuyPlanDetailFragment.EZpvd(this.copydefault, interfaceC57934yrl);
            }
        });
        ((AbstractC31541lvv) isConnected()).AhwBna.setRetryClickListener(new View.OnClickListener() { // from class: o.lQf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                RecurringBuyPlanDetailFragment.djBIcL(this.KWHzl, view);
            }
        });
        ((AbstractC31541lvv) isConnected()).gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.lQd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                RecurringBuyPlanDetailFragment.AkhnZx(this.OLrzqt, view);
            }
        });
        ((AbstractC31541lvv) isConnected()).uzCIH.setOnClickListener(new View.OnClickListener() { // from class: o.lQh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                RecurringBuyPlanDetailFragment.values(this.KWHzl, view);
            }
        });
        ((AbstractC31541lvv) isConnected()).gHZMYf.setOnClickListener(new View.OnClickListener() { // from class: o.lQl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                RecurringBuyPlanDetailFragment.DbNXlk(this.OLrzqt, view);
            }
        });
        ((AbstractC31541lvv) isConnected()).hDKMBd.setOnClickListener(new View.OnClickListener() { // from class: o.lQi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                RecurringBuyPlanDetailFragment.fetchVPNInfo(this.AEQbTJ, view);
            }
        });
        RecyclerView recyclerView = ((AbstractC31541lvv) isConnected()).fARcdN;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        C43316rmw c43316rmw = this.isConnected;
        c43316rmw.register(C3952Avg.class, new C30280lSn(new Function1() { // from class: o.lQk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RecurringBuyPlanDetailFragment.copydefault(this.OLrzqt, (C3952Avg) obj);
            }
        }));
        recyclerView.setAdapter(c43316rmw);
    }

    public static final void valueOf(RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment, View view) {
        RecurringBuyPlanHostActivityViewModel.onNavigateBack$default(recurringBuyPlanDetailFragment.values(), false, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        recurringBuyPlanDetailFragment.AhwBna().EZpvd(false);
        ((AbstractC31541lvv) recurringBuyPlanDetailFragment.isConnected()).djBIcL.AEQbTJ();
    }

    public static final void djBIcL(RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment, View view) {
        FragmentActivity activity = recurringBuyPlanDetailFragment.getActivity();
        if (activity == null || !C43453rpa.AEQbTJ.KWHzl(activity)) {
            return;
        }
        recurringBuyPlanDetailFragment.AhwBna().EZpvd(true);
    }

    public static final void AkhnZx(RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment, View view) {
        recurringBuyPlanDetailFragment.copydefault(RecurringBuyPlanDetailConfirmationBottomSheet.Companion.ConfirmationType.CANCEL);
    }

    public static final void values(RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment, View view) {
        recurringBuyPlanDetailFragment.copydefault(RecurringBuyPlanDetailConfirmationBottomSheet.Companion.ConfirmationType.PAUSE);
    }

    public static final void DbNXlk(RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment, View view) {
        recurringBuyPlanDetailFragment.AhwBna().AYXKKw();
    }

    public static final void fetchVPNInfo(RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment, View view) {
        recurringBuyPlanDetailFragment.values().EZpvd(recurringBuyPlanDetailFragment.AhwBna);
        recurringBuyPlanDetailFragment.AhwBna().AhwBna();
    }

    public static final Unit copydefault(RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment, C3952Avg c3952Avg) {
        Intrinsics.checkNotNullParameter(c3952Avg, "");
        InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class);
        Context contextRequireContext = recurringBuyPlanDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        interfaceC47251tmX.copydefault(contextRequireContext, new BuySellOrderDetailParameters(TradeType.BUY, c3952Avg.AhwBna(), OKPaymentSource.LITE_PORTFOLIO_TRANSACTION_HISTORY));
        recurringBuyPlanDetailFragment.AhwBna().AEQbTJ(c3952Avg.AhwBna());
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AhwBna().copydefault();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        AhwBna().valueOf();
        super.onPause();
    }

    @Override // o.AbstractC31907mIi
    public void EZpvd() {
        AkhnZx();
        fetchVPNInfo();
        valueOf();
        AhwBna().EZpvd(true);
    }

    public final void valueOf() {
        DbNXlk().ejfBZ().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.lPX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RecurringBuyPlanDetailFragment.KWHzl(this.EZpvd, (SelectPaymentMethodResult) obj);
            }
        }));
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<InterfaceC31430ltq>> liveDataCopydefault = DbNXlk().copydefault();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataCopydefault, viewLifecycleOwner, new Function1() { // from class: o.lQg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RecurringBuyPlanDetailFragment.copydefault(this.OLrzqt, (InterfaceC31430ltq) obj);
            }
        });
        LiveData<C32989mnw<Pair<Channel, PaymentMethod>>> liveDataGEmmrt = DbNXlk().gEmmrt();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        mha.copydefault(liveDataGEmmrt, viewLifecycleOwner2, new Function1() { // from class: o.lQc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RecurringBuyPlanDetailFragment.AEQbTJ(this.KWHzl, (kotlin.Pair) obj);
            }
        });
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new RecurringBuyPlanDetailFragment$subscribeToPaymentMethodSelection$4(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment, SelectPaymentMethodResult selectPaymentMethodResult) {
        C3812Asx c3812AsxEZpvd;
        C3843Atb c3843AtbKWHzl;
        if (recurringBuyPlanDetailFragment.DbNXlk().zLjUOn() && selectPaymentMethodResult.isSuccess()) {
            recurringBuyPlanDetailFragment.DbNXlk().EZpvd(false);
            C3819AtD value = recurringBuyPlanDetailFragment.AhwBna().KWHzl().getValue();
            C3817AtB c3817AtBKWHzl = (value == null || (c3812AsxEZpvd = value.EZpvd()) == null || (c3843AtbKWHzl = c3812AsxEZpvd.KWHzl()) == null) ? null : c3843AtbKWHzl.KWHzl();
            if (c3817AtBKWHzl != null) {
                Account account = selectPaymentMethodResult.getPaymentMethod().getAccount();
                if (!Intrinsics.EZpvd((Object) (account != null ? account.getPaymentAccountId() : null), (Object) c3817AtBKWHzl.gEmmrt()) || !Intrinsics.EZpvd((Object) selectPaymentMethodResult.getChannel().getDepositPlatformCode(), (Object) C33129mqd.gEmmrt(Integer.valueOf(c3817AtBKWHzl.OLrzqt())))) {
                }
            } else {
                RecurringBuyPlanDetailViewModel recurringBuyPlanDetailViewModelAhwBna = recurringBuyPlanDetailFragment.AhwBna();
                Account account2 = selectPaymentMethodResult.getPaymentMethod().getAccount();
                recurringBuyPlanDetailViewModelAhwBna.copydefault(null, null, null, account2 != null ? account2.getPaymentAccountId() : null, selectPaymentMethodResult.getChannel().getDepositPlatformCode());
            }
        } else {
            recurringBuyPlanDetailFragment.DbNXlk().EZpvd(false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment, InterfaceC31430ltq interfaceC31430ltq) {
        Intrinsics.checkNotNullParameter(interfaceC31430ltq, "");
        recurringBuyPlanDetailFragment.AEQbTJ(interfaceC31430ltq);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        recurringBuyPlanDetailFragment.AhwBna().KWHzl((Channel) pair.component1(), (PaymentMethod) pair.component2());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(Channel channel, lMD<PaymentMethod, ? extends Exception> lmd) {
        if (lmd instanceof lMD.TaskDescription) {
            if (C31662lzj.EZpvd(channel)) {
                DbNXlk().AEQbTJ(InterfaceC31430ltq.Dialog.OLrzqt);
            } else {
                DbNXlk().AEQbTJ(InterfaceC31430ltq.ActionBar.copydefault);
            }
            AhwBna().EZpvd(false);
        } else {
            if (!(lmd instanceof lMD.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            if (C31662lzj.EZpvd(channel)) {
                DbNXlk().AEQbTJ(InterfaceC31430ltq.LoaderManager.EZpvd);
            } else {
                DbNXlk().AEQbTJ(new InterfaceC31430ltq.Application(((lMD.StateListAnimator) lmd).AEQbTJ().getMessage()));
            }
        }
        DbNXlk().OLrzqt();
    }

    public final void AkhnZx() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new RecurringBuyPlanDetailFragment$subscribeToUiState$1(this, null), 3, null);
    }

    public final void fetchVPNInfo() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new RecurringBuyPlanDetailFragment$subscribeToStatusChange$1(this, null), 3, null);
    }

    public final void KWHzl(C3843Atb c3843Atb) {
        copydefault(c3843Atb.AEQbTJ());
        copydefault(c3843Atb.AhwBna());
        AEQbTJ(c3843Atb.gEmmrt());
        AEQbTJ(c3843Atb.copydefault());
        OLrzqt(c3843Atb.OLrzqt());
        AEQbTJ(c3843Atb.EZpvd());
        copydefault(c3843Atb.KWHzl());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(final C3813Asy c3813Asy) {
        AbstractC31541lvv abstractC31541lvv = (AbstractC31541lvv) isConnected();
        if (c3813Asy.AYXKKw()) {
            OKAlertBanner oKAlertBanner = abstractC31541lvv.KWHzl;
            Intrinsics.checkNotNullExpressionValue(oKAlertBanner, "");
            oKAlertBanner.setVisibility(0);
            abstractC31541lvv.KWHzl.gEmmrt().setText(c3813Asy.AhwBna());
            abstractC31541lvv.KWHzl.KWHzl().setText(c3813Asy.OLrzqt());
            if (c3813Asy.djBIcL()) {
                abstractC31541lvv.KWHzl.AEQbTJ().setVisibility(0);
                abstractC31541lvv.KWHzl.AEQbTJ().setText(c3813Asy.EZpvd());
                abstractC31541lvv.KWHzl.AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.lQj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        RecurringBuyPlanDetailFragment.AEQbTJ(this.EZpvd, c3813Asy, view);
                    }
                });
                return;
            } else {
                abstractC31541lvv.KWHzl.AEQbTJ().setVisibility(8);
                if (Intrinsics.EZpvd((Object) c3813Asy.KWHzl(), (Object) RecurringBuyErrorType.PRICE_CHANGE.getValue())) {
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

    public static final void AEQbTJ(RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment, C3813Asy c3813Asy, View view) {
        FragmentActivity activity = recurringBuyPlanDetailFragment.getActivity();
        if (activity != null) {
            if (c3813Asy.copydefault()) {
                InterfaceC31422lti.ActionBar.goToBuySellConvertPage$default((InterfaceC31422lti) C43251rlk.copydefault(InterfaceC31422lti.class), activity, new BSCEntranceParameters(BSCTargetTab.BUY, c3813Asy.AEQbTJ(), null, null, null, null, null, null, null, null, false, null, null, null, null, false, 65532, null), false, 4, null);
            } else {
                InterfaceC47251tmX.StateListAnimator.goToDepositWithdrawPage$default((InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class), activity, new DepositWithdrawPageParameters(new DepositWithdrawLandingPage.DepositPage(null, null, null, 7, null), OKPaymentSource.UNKNOWN_SOURCE), null, null, 12, null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(final C3826AtK c3826AtK) {
        AbstractC31541lvv abstractC31541lvv = (AbstractC31541lvv) isConnected();
        abstractC31541lvv.AYXKKw.setText(c3826AtK.AhwBna());
        View root = abstractC31541lvv.iwGUEr.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(c3826AtK.valueOf() ? 0 : 8);
        abstractC31541lvv.AuCTel.setText(c3826AtK.AYXKKw());
        C52794wYp c52794wYp = abstractC31541lvv.EZpvd;
        if (C30327lUg.AEQbTJ(ABTestFeatureFlag.RECURRING_BUY_EDIT_AMOUNT_AND_FREQUENCY)) {
            Intrinsics.copydefault(c52794wYp);
            c52794wYp.setVisibility(0);
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.lQa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    RecurringBuyPlanDetailFragment.OLrzqt(c3826AtK, this, view);
                }
            });
        } else {
            Intrinsics.copydefault(c52794wYp);
            c52794wYp.setVisibility(8);
        }
    }

    public static final void OLrzqt(final C3826AtK c3826AtK, final RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment, View view) {
        lQD.Companion.copydefault(new lQV(c3826AtK.AEQbTJ(), c3826AtK.OLrzqt(), c3826AtK.gEmmrt(), c3826AtK.copydefault(), c3826AtK.EZpvd(), c3826AtK.KWHzl()), new Function1() { // from class: o.lPV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RecurringBuyPlanDetailFragment.KWHzl(c3826AtK, recurringBuyPlanDetailFragment, (java.lang.String) obj);
            }
        }).show(recurringBuyPlanDetailFragment.getChildFragmentManager(), "EditAmountBottomSheet");
    }

    public static final Unit KWHzl(C3826AtK c3826AtK, RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!Intrinsics.EZpvd((Object) str, (Object) c3826AtK.AEQbTJ())) {
            recurringBuyPlanDetailFragment.AhwBna().copydefault(null, str, null, (24 & 8) != 0 ? null : null, (24 & 16) != 0 ? null : null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(final C3764AsB c3764AsB) {
        AbstractC31541lvv abstractC31541lvv = (AbstractC31541lvv) isConnected();
        if (C30327lUg.AEQbTJ(ABTestFeatureFlag.RECURRING_BUY_EDIT_AMOUNT_AND_FREQUENCY)) {
            mIW miw = abstractC31541lvv.values;
            Intrinsics.copydefault(miw);
            miw.setVisibility(0);
            miw.setChipIcon(7);
            final RecurringFrequencyOption recurringFrequencyOptionCopydefault = copydefault(c3764AsB.AEQbTJ());
            miw.setChipText(recurringFrequencyOptionCopydefault.getLabel());
            miw.setOnClickListener(new Function0() { // from class: o.lPY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return RecurringBuyPlanDetailFragment.copydefault(c3764AsB, recurringFrequencyOptionCopydefault, this);
                }
            });
            TextView textView = abstractC31541lvv.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            return;
        }
        mIW miw2 = abstractC31541lvv.values;
        Intrinsics.checkNotNullExpressionValue(miw2, "");
        miw2.setVisibility(8);
        TextView textView2 = abstractC31541lvv.DbNXlk;
        Intrinsics.copydefault(textView2);
        textView2.setVisibility(0);
        textView2.setText(copydefault(c3764AsB.AEQbTJ()).getLabel());
    }

    public static final Unit copydefault(C3764AsB c3764AsB, RecurringFrequencyOption recurringFrequencyOption, final RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment) {
        List<C3769AsG> listKWHzl = c3764AsB.KWHzl();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        Iterator<T> it = listKWHzl.iterator();
        while (it.hasNext()) {
            arrayList.add(recurringBuyPlanDetailFragment.copydefault((C3769AsG) it.next()));
        }
        lQN.Companion.copydefault(arrayList, recurringFrequencyOption, new Function1() { // from class: o.lPS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RecurringBuyPlanDetailFragment.OLrzqt(this.copydefault, (RecurringFrequencyOption) obj);
            }
        }).show(recurringBuyPlanDetailFragment.getChildFragmentManager(), "RecurringBuyFrequencyOptionBottomSheet");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment, RecurringFrequencyOption recurringFrequencyOption) {
        Intrinsics.checkNotNullParameter(recurringFrequencyOption, "");
        recurringBuyPlanDetailFragment.AhwBna().copydefault(null, null, recurringFrequencyOption.getFrequency(), (24 & 8) != 0 ? null : null, (24 & 16) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(final C3817AtB c3817AtB) {
        String strAEQbTJ;
        String strAEQbTJ2;
        AbstractC31541lvv abstractC31541lvv = (AbstractC31541lvv) isConnected();
        if (C30327lUg.AEQbTJ(ABTestFeatureFlag.RECURRING_BUY_EDIT_PAYMENT_METHOD)) {
            abstractC31541lvv.AuCTelauCTel.setVisibility(0);
            abstractC31541lvv.zsXlph.setVisibility(8);
            abstractC31541lvv.zLjUOn.setVisibility(8);
            mIW miw = abstractC31541lvv.AuCTelauCTel;
            miw.setChipText(c3817AtB.AhwBna());
            if (C33492mxV.OLrzqt()) {
                strAEQbTJ2 = c3817AtB.KWHzl();
            } else {
                strAEQbTJ2 = c3817AtB.AEQbTJ();
            }
            miw.setChipImageUrl(strAEQbTJ2);
            miw.setOnClickListener(new Function0() { // from class: o.lQb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return RecurringBuyPlanDetailFragment.copydefault(this.AEQbTJ, c3817AtB);
                }
            });
            return;
        }
        abstractC31541lvv.AuCTelauCTel.setVisibility(8);
        abstractC31541lvv.zsXlph.setVisibility(0);
        abstractC31541lvv.zLjUOn.setVisibility(0);
        abstractC31541lvv.zsXlph.setText(c3817AtB.AhwBna());
        if (C33129mqd.OLrzqt((CharSequence) c3817AtB.AEQbTJ())) {
            ImageView imageView = abstractC31541lvv.zLjUOn;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            ImageView imageView2 = abstractC31541lvv.zLjUOn;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            if (C33492mxV.OLrzqt()) {
                strAEQbTJ = c3817AtB.KWHzl();
            } else {
                strAEQbTJ = c3817AtB.AEQbTJ();
            }
            C33054mpH.loadUrl$default(imageView2, strAEQbTJ, null, 0, 0, 14, null);
            return;
        }
        ImageView imageView3 = abstractC31541lvv.zLjUOn;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        imageView3.setVisibility(8);
    }

    public static final Unit copydefault(RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment, C3817AtB c3817AtB) {
        recurringBuyPlanDetailFragment.OLrzqt(c3817AtB);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(C3817AtB c3817AtB) {
        if (getParentFragmentManager().findFragmentByTag("PaymentSelectionBottomSheet") == null) {
            C29826lBt.Companion.EZpvd(AhwBna().copydefault(c3817AtB)).show(getParentFragmentManager(), "PaymentSelectionBottomSheet");
        }
    }

    public final RecurringFrequencyOption copydefault(C3769AsG c3769AsG) {
        return RecurringFrequencyOption.Companion.AEQbTJ(c3769AsG.copydefault(), c3769AsG.EZpvd(), c3769AsG.KWHzl(), c3769AsG.AEQbTJ());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(C3818AtC c3818AtC) {
        lQC lqcCopydefault = AYXKKw().copydefault(c3818AtC);
        AbstractC31541lvv abstractC31541lvv = (AbstractC31541lvv) isConnected();
        AbstractC31584lwm abstractC31584lwm = abstractC31541lvv.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(abstractC31584lwm, "");
        EZpvd(abstractC31584lwm, lqcCopydefault.EZpvd());
        AbstractC31584lwm abstractC31584lwm2 = abstractC31541lvv.valueOf;
        Intrinsics.checkNotNullExpressionValue(abstractC31584lwm2, "");
        EZpvd(abstractC31584lwm2, lqcCopydefault.copydefault());
        AbstractC31584lwm abstractC31584lwm3 = abstractC31541lvv.QKVWgx;
        Intrinsics.checkNotNullExpressionValue(abstractC31584lwm3, "");
        EZpvd(abstractC31584lwm3, lqcCopydefault.KWHzl());
        AbstractC31584lwm abstractC31584lwm4 = abstractC31541lvv.AubY;
        Intrinsics.checkNotNullExpressionValue(abstractC31584lwm4, "");
        EZpvd(abstractC31584lwm4, lqcCopydefault.OLrzqt());
        ImageView imageView = abstractC31541lvv.AubY.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
        abstractC31541lvv.AubY.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.lPU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                RecurringBuyPlanDetailFragment.AYXKKw(this.EZpvd, view);
            }
        });
    }

    public static final void AYXKKw(RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment, View view) {
        C30231lQs c30231lQs = recurringBuyPlanDetailFragment.DbNXlk;
        if (c30231lQs != null) {
            c30231lQs.dismissAllowingStateLoss();
        }
        C30231lQs c30231lQsKWHzl = C30231lQs.Companion.KWHzl();
        recurringBuyPlanDetailFragment.DbNXlk = c30231lQsKWHzl;
        if (c30231lQsKWHzl != null) {
            FragmentManager childFragmentManager = recurringBuyPlanDetailFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c30231lQsKWHzl.show(childFragmentManager);
        }
    }

    public final void EZpvd(AbstractC31584lwm abstractC31584lwm, lQF lqf) {
        abstractC31584lwm.OLrzqt.setText(lqf.EZpvd());
        TextView textView = abstractC31584lwm.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        EZpvd(textView, lqf.OLrzqt());
        abstractC31584lwm.KWHzl.setText(lqf.KWHzl());
        abstractC31584lwm.copydefault.setImageResource(lqf.copydefault());
    }

    public final void EZpvd(TextView textView, lQA lqa) {
        if (lqa.EZpvd()) {
            OKCRTrend oKCRTrendAEQbTJ = lqa.AEQbTJ();
            Context context = textView.getContext();
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
    public final void AEQbTJ(C3816AtA c3816AtA) {
        ConstraintLayout constraintLayout = ((AbstractC31541lvv) isConnected()).hDKMBd;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(c3816AtA.EZpvd() ? 0 : 8);
        C43316rmw c43316rmw = this.isConnected;
        c43316rmw.setItems(c3816AtA.AEQbTJ());
        c43316rmw.notifyDataSetChanged();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(C3814Asz c3814Asz) {
        AbstractC31541lvv abstractC31541lvv = (AbstractC31541lvv) isConnected();
        if (c3814Asz.copydefault()) {
            ConstraintLayout constraintLayout = abstractC31541lvv.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(0);
            C52794wYp c52794wYp = abstractC31541lvv.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(c3814Asz.OLrzqt() ? 0 : 8);
            C52794wYp c52794wYp2 = abstractC31541lvv.uzCIH;
            Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
            c52794wYp2.setVisibility(c3814Asz.EZpvd() ? 0 : 8);
            C52794wYp c52794wYp3 = abstractC31541lvv.gHZMYf;
            Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
            c52794wYp3.setVisibility(c3814Asz.AEQbTJ() ? 0 : 8);
            return;
        }
        ConstraintLayout constraintLayout2 = abstractC31541lvv.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        constraintLayout2.setVisibility(8);
    }

    public final void copydefault(final RecurringBuyPlanDetailConfirmationBottomSheet.Companion.ConfirmationType confirmationType) {
        RecurringBuyPlanDetailConfirmationBottomSheet recurringBuyPlanDetailConfirmationBottomSheet = this.gEmmrt;
        if (recurringBuyPlanDetailConfirmationBottomSheet != null) {
            recurringBuyPlanDetailConfirmationBottomSheet.dismissAllowingStateLoss();
        }
        RecurringBuyPlanDetailConfirmationBottomSheet recurringBuyPlanDetailConfirmationBottomSheetAEQbTJ = RecurringBuyPlanDetailConfirmationBottomSheet.Companion.AEQbTJ(confirmationType);
        recurringBuyPlanDetailConfirmationBottomSheetAEQbTJ.copydefault(new Function1() { // from class: o.lPW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RecurringBuyPlanDetailFragment.OLrzqt(this.EZpvd, confirmationType, (RecurringBuyPlanDetailConfirmationBottomSheet.Companion.ConfirmationType) obj);
            }
        });
        recurringBuyPlanDetailConfirmationBottomSheetAEQbTJ.EZpvd(new Function1() { // from class: o.lPZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RecurringBuyPlanDetailFragment.KWHzl(this.OLrzqt, (RecurringBuyPlanDetailConfirmationBottomSheet.Companion.ConfirmationType) obj);
            }
        });
        this.gEmmrt = recurringBuyPlanDetailConfirmationBottomSheetAEQbTJ;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        recurringBuyPlanDetailConfirmationBottomSheetAEQbTJ.show(childFragmentManager);
    }

    public static final Unit OLrzqt(RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment, RecurringBuyPlanDetailConfirmationBottomSheet.Companion.ConfirmationType confirmationType, RecurringBuyPlanDetailConfirmationBottomSheet.Companion.ConfirmationType confirmationType2) {
        Intrinsics.checkNotNullParameter(confirmationType2, "");
        RecurringBuyPlanDetailConfirmationBottomSheet recurringBuyPlanDetailConfirmationBottomSheet = recurringBuyPlanDetailFragment.gEmmrt;
        if (recurringBuyPlanDetailConfirmationBottomSheet != null) {
            recurringBuyPlanDetailConfirmationBottomSheet.dismissAllowingStateLoss();
        }
        int i = StateListAnimator.EZpvd[confirmationType.ordinal()];
        if (i == 1) {
            recurringBuyPlanDetailFragment.AhwBna().gEmmrt();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            recurringBuyPlanDetailFragment.AhwBna().EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment, RecurringBuyPlanDetailConfirmationBottomSheet.Companion.ConfirmationType confirmationType) {
        Intrinsics.checkNotNullParameter(confirmationType, "");
        RecurringBuyPlanDetailConfirmationBottomSheet recurringBuyPlanDetailConfirmationBottomSheet = recurringBuyPlanDetailFragment.gEmmrt;
        if (recurringBuyPlanDetailConfirmationBottomSheet != null) {
            recurringBuyPlanDetailConfirmationBottomSheet.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(RecurringBuyPlanDetailStatusChangeType recurringBuyPlanDetailStatusChangeType) {
        int i = StateListAnimator.copydefault[recurringBuyPlanDetailStatusChangeType.ordinal()];
        if (i == 1) {
            lTZ ltz = lTZ.KWHzl;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            lTZ.showNotification$default(ltz, contextRequireContext, C33070mpX.AYXKKw(C31351lsQ.Activity.hOMIpD), 0, true, 0L, 20, (Object) null);
        } else if (i == 2) {
            lTZ ltz2 = lTZ.KWHzl;
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            lTZ.showNotification$default(ltz2, contextRequireContext2, C33070mpX.AYXKKw(C31351lsQ.Activity.pauseLocationServices), 0, true, 0L, 20, (Object) null);
        } else if (i != 3) {
            if (i == 4) {
                lTZ ltz3 = lTZ.KWHzl;
                Context contextRequireContext3 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                lTZ.showNotification$default(ltz3, contextRequireContext3, C33070mpX.AYXKKw(C31351lsQ.Activity.aVhqwO), 0, true, 0L, 20, (Object) null);
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                lTZ ltz4 = lTZ.KWHzl;
                Context contextRequireContext4 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
                lTZ.showNotification$default(ltz4, contextRequireContext4, C33070mpX.AYXKKw(C31351lsQ.Activity.gGvvIC), 3, true, 0L, 16, (Object) null);
            }
        } else if (this.valueOf) {
            C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C31351lsQ.Activity.getUserContextRegisteredStatus), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
            InterfaceC33172mrT interfaceC33172mrT = (InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class);
            Context contextRequireContext5 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "");
            InterfaceC33172mrT.TaskDescription.routeMain$default(interfaceC33172mrT, contextRequireContext5, null, null, 6, null);
        } else {
            values().OLrzqt(true);
        }
        if (recurringBuyPlanDetailStatusChangeType == RecurringBuyPlanDetailStatusChangeType.CANCELED || recurringBuyPlanDetailStatusChangeType == RecurringBuyPlanDetailStatusChangeType.PLAN_UPDATE_ERROR) {
            return;
        }
        AhwBna().EZpvd(false);
    }

    private final void AEQbTJ(InterfaceC31430ltq interfaceC31430ltq) {
        Pair<String, Integer> pairEZpvd = DbNXlk().EZpvd(interfaceC31430ltq);
        String strComponent1 = pairEZpvd.component1();
        int iIntValue = pairEZpvd.component2().intValue();
        lTZ ltz = lTZ.KWHzl;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        lTZ.showNotification$default(ltz, contextRequireContext, strComponent1, iIntValue, true, 0L, 16, (Object) null);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.recurring.detail.RecurringBuyPlanDetailFragment.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}

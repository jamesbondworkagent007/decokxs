package com.okinc.business.invest_biz.ui.screens.token;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.invest_biz.data.bean.TokenInvestDetail;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.token.DefiRecommendTokenFragment;
import com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionProtocolModel;
import com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionProtocolViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.AbstractC26590jfG;
import o.C23737iHl;
import o.C26588jfE;
import o.C26591jfH;
import o.C26628jfs;
import o.C26656jgT;
import o.C27117jpD;
import o.C27508jwX;
import o.C27588jxy;
import o.C27589jxz;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC25466ixJ;
import o.InterfaceC56387yDm;
import o.iNB;
import o.rVN;
import o.wXQ;
import o.yCM;
import o.yIP;
import o.yJA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class DefiRecommendTokenFragment extends AbstractC26590jfG implements InterfaceC25466ixJ {
    public static final /* synthetic */ yJA<Object>[] AEQbTJ = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(DefiRecommendTokenFragment.class, "contentBinding", "getContentBinding()Lcom/okinc/business/invest_biz/databinding/DefiRecommendTokenLayoutBinding;", 0))};
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public InvestSubscriptionProtocolModel AhwBna = C26656jgT.copydefault.EZpvd();
    public final yIP EZpvd = C27589jxz.EZpvd(this);
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;

    @yCM
    public iNB viewModelFactory;

    public DefiRecommendTokenFragment() {
        final Function0 function0 = null;
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(InvestSubscriptionProtocolViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.token.DefiRecommendTokenFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.token.DefiRecommendTokenFragment$special$$inlined$activityViewModels$default$2
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.token.DefiRecommendTokenFragment$special$$inlined$activityViewModels$default$3
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
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.okinc.business.invest_biz.ui.screens.token.DefiRecommendTokenFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.token.DefiRecommendTokenFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C26591jfH.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.token.DefiRecommendTokenFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.token.DefiRecommendTokenFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.token.DefiRecommendTokenFragment$special$$inlined$viewModels$default$5
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
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.jft
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DefiRecommendTokenFragment.AhwBna(this.EZpvd);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.jfx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DefiRecommendTokenFragment.gEmmrt(this.OLrzqt);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.jfv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DefiRecommendTokenFragment.valueOf(this.EZpvd);
            }
        });
    }

    public final C23737iHl AYXKKw() {
        return (C23737iHl) this.EZpvd.getValue(this, AEQbTJ[0]);
    }

    public final void KWHzl(C23737iHl c23737iHl) {
        this.EZpvd.KWHzl(this, AEQbTJ[0], c23737iHl);
    }

    public final InvestSubscriptionProtocolViewModel djBIcL() {
        return (InvestSubscriptionProtocolViewModel) this.valueOf.getValue();
    }

    public final C26591jfH gEmmrt() {
        return (C26591jfH) this.AYXKKw.getValue();
    }

    public static final C26628jfs AhwBna(final DefiRecommendTokenFragment defiRecommendTokenFragment) {
        return new C26628jfs(new Function2() { // from class: o.jfA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return DefiRecommendTokenFragment.EZpvd(this.KWHzl, ((java.lang.Long) obj).longValue(), (TokenInvestDetail) obj2);
            }
        }, new Function2() { // from class: o.jfC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return DefiRecommendTokenFragment.EZpvd(this.copydefault, ((java.lang.Long) obj).longValue(), (java.lang.Long) obj2);
            }
        }, new Function0() { // from class: o.jfz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DefiRecommendTokenFragment.AYXKKw(this.EZpvd);
            }
        });
    }

    public final C26628jfs valueOf() {
        return (C26628jfs) this.KWHzl.getValue();
    }

    public static final Unit EZpvd(DefiRecommendTokenFragment defiRecommendTokenFragment, long j, TokenInvestDetail tokenInvestDetail) {
        if (tokenInvestDetail == null) {
            return Unit.INSTANCE;
        }
        defiRecommendTokenFragment.AEQbTJ(j, tokenInvestDetail);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(DefiRecommendTokenFragment defiRecommendTokenFragment, long j, Long l) {
        FragmentActivity activity = defiRecommendTokenFragment.getActivity();
        if (activity != null) {
            C27508jwX.startInvestDetailActivity$default(C27508jwX.AEQbTJ, activity, Long.valueOf(j), null, "investsubscribeentrance", l, true, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(DefiRecommendTokenFragment defiRecommendTokenFragment) {
        defiRecommendTokenFragment.gEmmrt().AEQbTJ();
        C27588jxy.AEQbTJ(defiRecommendTokenFragment.valueOf(), defiRecommendTokenFragment.gEmmrt().AEQbTJ(defiRecommendTokenFragment.AhwBna));
        return Unit.INSTANCE;
    }

    public final iNB AkhnZx() {
        iNB inb = this.viewModelFactory;
        if (inb != null) {
            return inb;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.token.DefiRecommendTokenFragment.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final DefiRecommendTokenFragment copydefault() {
            return new DefiRecommendTokenFragment();
        }
    }

    public final C27117jpD fetchVPNInfo() {
        return (C27117jpD) this.gEmmrt.getValue();
    }

    public static final C27117jpD gEmmrt(DefiRecommendTokenFragment defiRecommendTokenFragment) {
        return (C27117jpD) new ViewModelProvider(defiRecommendTokenFragment, defiRecommendTokenFragment.AkhnZx()).get(C27117jpD.class);
    }

    private final C26588jfE AuCTel() {
        return (C26588jfE) this.copydefault.getValue();
    }

    public static final C26588jfE valueOf(DefiRecommendTokenFragment defiRecommendTokenFragment) {
        return new C26588jfE(defiRecommendTokenFragment.fetchVPNInfo(), defiRecommendTokenFragment);
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setCloseVisibility(false);
        wxq.setStyle(0);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        KWHzl(C23737iHl.copydefault(LayoutInflater.from(requireContext())));
        constraintLayout.addView(AYXKKw().getRoot(), new ViewGroup.LayoutParams(-1, -2));
        if (this.AhwBna == null) {
            this.AhwBna = C26656jgT.copydefault.EZpvd();
        }
        AYXKKw().AEQbTJ.setAdapter(valueOf());
        C27588jxy.AEQbTJ(valueOf(), gEmmrt().AEQbTJ(this.AhwBna));
        rVN.reportFullyDrawn$default((Fragment) this, true, (String) null, 2, (Object) null);
    }

    public final void AEQbTJ(long j, TokenInvestDetail tokenInvestDetail) {
        AuCTel().copydefault(j, tokenInvestDetail, (68 & 4) != 0 ? false : false, (68 & 8) != 0 ? InvestPageSource.Default : InvestPageSource.SubscriptionCenter, (68 & 16) != 0 ? null : new Function1() { // from class: o.jfu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiRecommendTokenFragment.OLrzqt(this.KWHzl, (TransactionConfig) obj);
            }
        }, (68 & 32) != 0 ? null : new Function0() { // from class: o.jfw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DefiRecommendTokenFragment.djBIcL(this.EZpvd);
            }
        }, (68 & 64) != 0 ? false : false);
    }

    public static final Unit OLrzqt(DefiRecommendTokenFragment defiRecommendTokenFragment, TransactionConfig transactionConfig) {
        if (transactionConfig != null) {
            defiRecommendTokenFragment.djBIcL().copydefault(transactionConfig);
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(DefiRecommendTokenFragment defiRecommendTokenFragment) {
        defiRecommendTokenFragment.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Possible override for method o.jfG.KWHzl()V */
    @Override // o.InterfaceC25466ixJ
    public CoroutineScope KWHzl() {
        return LifecycleOwnerKt.getLifecycleScope(this);
    }

    @Override // o.InterfaceC25466ixJ
    public CoroutineScope AhwBna() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        return LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner);
    }

    @Override // o.InterfaceC25466ixJ
    public FragmentManager OLrzqt() {
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        return parentFragmentManager;
    }

    @Override // o.InterfaceC25466ixJ
    public Context AEQbTJ() {
        return getContext();
    }

    @Override // o.InterfaceC25466ixJ
    public AbstractActivityC33041mov EZpvd() {
        FragmentActivity activity = getActivity();
        if (activity instanceof AbstractActivityC33041mov) {
            return (AbstractActivityC33041mov) activity;
        }
        return null;
    }
}

package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.invest_biz.data.bean.NetworkFee;
import com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem;
import com.okinc.business.invest_biz.ui.screens.network_fee.view_model.InvestNetworkFeeSelectionViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.FlowCollector;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jdA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C26478jdA extends AbstractC26524jdu {
    public static final /* synthetic */ yJA<java.lang.Object>[] AhwBna = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(C26478jdA.class, "contentBinding", "getContentBinding()Lcom/okinc/business/invest_biz/databinding/LayoutInvestNetworkFeeBottomSheetBinding;", 0))};
    public static final ActionBar Companion = new ActionBar(null);
    public static final int djBIcL = 8;
    public final yIP AYXKKw = C27589jxz.EZpvd(this);
    public final InterfaceC56387yDm AkhnZx;
    public int fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final float valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public int getSoftInputStyle() {
        return this.fetchVPNInfo;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public void setSoftInputStyle(int i) {
        this.fetchVPNInfo = i;
    }

    public C26478jdA() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.screens.network_fee.InvestNetworkFeeSelectionBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.network_fee.InvestNetworkFeeSelectionBottomSheet$special$$inlined$viewModels$default$2
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(InvestNetworkFeeSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.network_fee.InvestNetworkFeeSelectionBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.network_fee.InvestNetworkFeeSelectionBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.network_fee.InvestNetworkFeeSelectionBottomSheet$special$$inlined$viewModels$default$5
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
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.jdy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26478jdA.KWHzl(this.OLrzqt);
            }
        });
        this.valueOf = 0.92f;
        this.fetchVPNInfo = 1;
    }

    /* JADX INFO: renamed from: o.jdA$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jdA.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C26478jdA newInstance$default(ActionBar actionBar, NetworkFee networkFee, InvestNetworkFeeItem investNetworkFeeItem, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                investNetworkFeeItem = null;
            }
            return actionBar.KWHzl(networkFee, investNetworkFeeItem);
        }

        public final C26478jdA KWHzl(@NotNull NetworkFee networkFee, InvestNetworkFeeItem investNetworkFeeItem) {
            Intrinsics.checkNotNullParameter(networkFee, "");
            C26478jdA c26478jdA = new C26478jdA();
            c26478jdA.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("key.networkFee", networkFee), C56390yDp.OLrzqt("key.selectedNetworkFee", investNetworkFeeItem)));
            return c26478jdA;
        }
    }

    public final C23812iKf AhwBna() {
        return (C23812iKf) this.AYXKKw.getValue(this, AhwBna[0]);
    }

    public final void EZpvd(C23812iKf c23812iKf) {
        this.AYXKKw.KWHzl(this, AhwBna[0], c23812iKf);
    }

    public final InvestNetworkFeeSelectionViewModel valueOf() {
        return (InvestNetworkFeeSelectionViewModel) this.AkhnZx.getValue();
    }

    public final C26525jdv AYXKKw() {
        return (C26525jdv) this.gEmmrt.getValue();
    }

    public static final C26525jdv KWHzl(final C26478jdA c26478jdA) {
        return new C26525jdv(new Function1() { // from class: o.jdC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26478jdA.EZpvd(this.AEQbTJ, (InvestNetworkFeeItem) obj);
            }
        }, new Function1() { // from class: o.jdE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26478jdA.OLrzqt(this.OLrzqt, (InvestNetworkFeeItem) obj);
            }
        });
    }

    public static final Unit EZpvd(C26478jdA c26478jdA, InvestNetworkFeeItem investNetworkFeeItem) {
        Intrinsics.checkNotNullParameter(investNetworkFeeItem, "");
        c26478jdA.KWHzl(investNetworkFeeItem);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C26478jdA c26478jdA, InvestNetworkFeeItem investNetworkFeeItem) {
        Intrinsics.checkNotNullParameter(investNetworkFeeItem, "");
        c26478jdA.valueOf().EZpvd(investNetworkFeeItem);
        c26478jdA.AEQbTJ();
        return Unit.INSTANCE;
    }

    public final void KWHzl(InvestNetworkFeeItem investNetworkFeeItem) {
        valueOf().KWHzl(investNetworkFeeItem, !investNetworkFeeItem.getSelected());
        AEQbTJ();
    }

    public final void AEQbTJ(InvestNetworkFeeItem investNetworkFeeItem) {
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC26481jdD interfaceC26481jdD = null;
        InterfaceC26481jdD interfaceC26481jdD2 = parentFragment instanceof InterfaceC26481jdD ? (InterfaceC26481jdD) parentFragment : null;
        if (interfaceC26481jdD2 == null) {
            KeyEventDispatcher.Component activity = getActivity();
            if (activity instanceof InterfaceC26481jdD) {
                interfaceC26481jdD = (InterfaceC26481jdD) activity;
            }
        } else {
            interfaceC26481jdD = interfaceC26481jdD2;
        }
        if (interfaceC26481jdD != null) {
            interfaceC26481jdD.EZpvd(investNetworkFeeItem);
        }
        dismissAllowingStateLoss();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setStyle(3);
        wxq.setTitle(C33070mpX.AYXKKw(C25493ixk.FragmentManager.EZpvd));
        wxq.setCloseVisibility(true);
        wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.jdF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C26478jdA.AEQbTJ(this.copydefault, view);
            }
        });
    }

    public static final void AEQbTJ(C26478jdA c26478jdA, android.view.View view) {
        c26478jdA.dismissAllowingStateLoss();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        EZpvd(C23812iKf.OLrzqt(android.view.LayoutInflater.from(requireContext())));
        constraintLayout.addView(AhwBna().getRoot(), new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C23812iKf c23812iKfAhwBna = AhwBna();
        c23812iKfAhwBna.KWHzl.setAdapter(AYXKKw());
        c23812iKfAhwBna.copydefault.setRetryClickListener(new View.OnClickListener() { // from class: o.jdx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C26478jdA.EZpvd(this.EZpvd, view2);
            }
        });
        C52794wYp c52794wYp = c23812iKfAhwBna.AEQbTJ;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        C27589jxz.collectOnViewLifecycle$default(this, valueOf().copydefault(), null, new Application(), 2, null);
        valueOf().EZpvd();
    }

    public static final void EZpvd(C26478jdA c26478jdA, android.view.View view) {
        c26478jdA.valueOf().EZpvd();
    }

    /* JADX INFO: renamed from: o.jdA$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C26486jdI c26486jdI, Continuation<? super Unit> continuation) {
            C26478jdA.this.KWHzl(c26486jdI);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ() {
        boolean z;
        InvestNetworkFeeItem investNetworkFeeItemKWHzl;
        C52794wYp c52794wYp = AhwBna().AEQbTJ;
        if (valueOf().KWHzl() == null || (investNetworkFeeItemKWHzl = valueOf().KWHzl()) == null) {
            z = false;
        } else {
            z = true;
            if (!investNetworkFeeItemKWHzl.isCustomGasPriceOK()) {
            }
        }
        c52794wYp.setEnabled(z);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        android.content.Context context = getContext();
        if (context != null) {
            C33054mpH.OLrzqt(context, AhwBna().KWHzl);
        }
    }

    public final void KWHzl(C26486jdI c26486jdI) {
        C23812iKf c23812iKfAhwBna = AhwBna();
        C55173xeu c55173xeu = c23812iKfAhwBna.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(c26486jdI.copydefault() != null ? 0 : 8);
        C55113xdn c55113xdn = c23812iKfAhwBna.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(c26486jdI.OLrzqt() ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat = c23812iKfAhwBna.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility((c26486jdI.OLrzqt() || c26486jdI.copydefault() != null) ? 8 : 0);
        if (!c26486jdI.AEQbTJ().isEmpty()) {
            RecyclerView recyclerView = c23812iKfAhwBna.KWHzl;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(c26486jdI.AEQbTJ().isEmpty() ^ true ? 0 : 8);
            AYXKKw().AEQbTJ(c26486jdI.AEQbTJ());
        }
        AEQbTJ();
    }

    /* JADX INFO: renamed from: o.jdA$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C26478jdA EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C26478jdA c26478jdA) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = c26478jdA;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                InvestNetworkFeeItem investNetworkFeeItemKWHzl = this.EZpvd.valueOf().KWHzl();
                if (investNetworkFeeItemKWHzl != null) {
                    this.EZpvd.AEQbTJ(investNetworkFeeItemKWHzl);
                }
            }
        }
    }
}

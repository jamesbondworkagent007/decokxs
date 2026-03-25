package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.invest_biz.data.contants.ApyType;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import com.okinc.business.invest_biz.mln.vm.DeFiMiniDetailsCacheBonsInfoViewModel;
import com.okinc.business.invest_biz.ui.screens.product_details.bonus_info.ProductDetailsBonusInfoViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.FlowCollector;
import o.C25493ixk;
import o.C27386juH;
import o.InterfaceC26500jdW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jdN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C26491jdN extends AbstractC26493jdP {
    public InterfaceC27395juQ djBIcL;
    public static final /* synthetic */ yJA<java.lang.Object>[] AYXKKw = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(C26491jdN.class, "contentBinding", "getContentBinding()Lcom/okinc/business/invest_biz/databinding/LayoutProtoductDetailsBonusInfoBinding;", 0))};
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AhwBna = 8;
    public final yIP gEmmrt = C27589jxz.EZpvd(this);
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.jdU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C26491jdN.KWHzl(this.copydefault);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.jdT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C26491jdN.OLrzqt(this.OLrzqt);
        }
    });

    public final void AEQbTJ(C23841iLh c23841iLh) {
        this.gEmmrt.KWHzl(this, AYXKKw[0], c23841iLh);
    }

    public final C23841iLh djBIcL() {
        return (C23841iLh) this.gEmmrt.getValue(this, AYXKKw[0]);
    }

    public final iOK valueOf() {
        return (iOK) this.values.getValue();
    }

    public static final iOK KWHzl(final C26491jdN c26491jdN) {
        final Function0 function0 = null;
        if (Intrinsics.EZpvd((java.lang.Object) c26491jdN.AYXKKw().copydefault(), (java.lang.Object) "bonus_source_from_lua")) {
            final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.screens.product_details.bonus_info.ProductDetailsBonusInfoBottomSheet$viewModel_delegate$lambda$0$$inlined$viewModels$default$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Fragment invoke() {
                    return c26491jdN;
                }
            };
            final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.product_details.bonus_info.ProductDetailsBonusInfoBottomSheet$viewModel_delegate$lambda$0$$inlined$viewModels$default$2
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
            return (iOK) FragmentViewModelLazyKt.createViewModelLazy(c26491jdN, C56524yIo.AEQbTJ(DeFiMiniDetailsCacheBonsInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.product_details.bonus_info.ProductDetailsBonusInfoBottomSheet$viewModel_delegate$lambda$0$$inlined$viewModels$default$3
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
            }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.product_details.bonus_info.ProductDetailsBonusInfoBottomSheet$viewModel_delegate$lambda$0$$inlined$viewModels$default$4
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
            }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.product_details.bonus_info.ProductDetailsBonusInfoBottomSheet$viewModel_delegate$lambda$0$$inlined$viewModels$default$5
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
                        defaultViewModelProviderFactory = c26491jdN.getDefaultViewModelProviderFactory();
                    }
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                    return defaultViewModelProviderFactory;
                }
            }).getValue();
        }
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.screens.product_details.bonus_info.ProductDetailsBonusInfoBottomSheet$viewModel_delegate$lambda$0$$inlined$viewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return c26491jdN;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.product_details.bonus_info.ProductDetailsBonusInfoBottomSheet$viewModel_delegate$lambda$0$$inlined$viewModels$default$7
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
        return (iOK) FragmentViewModelLazyKt.createViewModelLazy(c26491jdN, C56524yIo.AEQbTJ(ProductDetailsBonusInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.product_details.bonus_info.ProductDetailsBonusInfoBottomSheet$viewModel_delegate$lambda$0$$inlined$viewModels$default$8
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.product_details.bonus_info.ProductDetailsBonusInfoBottomSheet$viewModel_delegate$lambda$0$$inlined$viewModels$default$9
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
                Function0 function04 = function0;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.product_details.bonus_info.ProductDetailsBonusInfoBottomSheet$viewModel_delegate$lambda$0$$inlined$viewModels$default$10
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
                    defaultViewModelProviderFactory = c26491jdN.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }).getValue();
    }

    public final ProductDetailsByChain AYXKKw() {
        ProductDetailsByChain productDetailsByChain;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (productDetailsByChain = (ProductDetailsByChain) arguments.getParcelable("params.bonusInfo")) == null) {
            throw new java.lang.IllegalStateException("Must provide investmentId.".toString());
        }
        return productDetailsByChain;
    }

    /* JADX DEBUG: Possible override for method o.jdP.OLrzqt()V */
    public final C27388juJ OLrzqt() {
        return (C27388juJ) this.valueOf.getValue();
    }

    public static final C27388juJ OLrzqt(C26491jdN c26491jdN) {
        return new C27388juJ(c26491jdN.djBIcL);
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setCloseVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AEQbTJ(C23841iLh.copydefault(android.view.LayoutInflater.from(requireContext())));
        constraintLayout.addView(djBIcL().getRoot(), new ViewGroup.LayoutParams(-1, -2));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        gEmmrt();
        valueOf().EZpvd(AYXKKw().OLrzqt());
        C27589jxz.collectOnViewLifecycle$default(this, valueOf().KWHzl(), null, new TaskDescription(), 2, null);
    }

    /* JADX INFO: renamed from: o.jdN$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC26500jdW interfaceC26500jdW, Continuation<? super Unit> continuation) {
            C26491jdN.this.AEQbTJ(interfaceC26500jdW);
            return Unit.INSTANCE;
        }
    }

    private final void gEmmrt() {
        C23841iLh c23841iLhDjBIcL = djBIcL();
        RecyclerView recyclerView = c23841iLhDjBIcL.AkhnZx;
        recyclerView.setAdapter(OLrzqt());
        recyclerView.setHasFixedSize(true);
        C55173xeu c55173xeu = c23841iLhDjBIcL.AEQbTJ;
        java.lang.String string = getString(C25493ixk.FragmentManager.gBtXYZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setTitle(string);
        java.lang.String string2 = getString(C25493ixk.FragmentManager.fupbxE);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setRetry(string2);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.jdV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C26491jdN.AEQbTJ(this.KWHzl, view);
            }
        });
    }

    public static final void AEQbTJ(C26491jdN c26491jdN, android.view.View view) {
        c26491jdN.valueOf().EZpvd(c26491jdN.AYXKKw().OLrzqt());
    }

    public final void AEQbTJ(InterfaceC26500jdW interfaceC26500jdW) {
        C23841iLh c23841iLhDjBIcL = djBIcL();
        ConstraintLayout constraintLayout = c23841iLhDjBIcL.EZpvd;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        boolean z = interfaceC26500jdW instanceof InterfaceC26500jdW.StateListAnimator;
        constraintLayout.setVisibility(z ? 0 : 8);
        C55113xdn c55113xdn = c23841iLhDjBIcL.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(interfaceC26500jdW instanceof InterfaceC26500jdW.Activity ? 0 : 8);
        C55173xeu c55173xeu = c23841iLhDjBIcL.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(interfaceC26500jdW instanceof InterfaceC26500jdW.TaskDescription ? 0 : 8);
        if (z) {
            InterfaceC26500jdW.StateListAnimator stateListAnimator = (InterfaceC26500jdW.StateListAnimator) interfaceC26500jdW;
            EZpvd(stateListAnimator.OLrzqt());
            AbstractC27470jvm.setData$default(OLrzqt(), stateListAnimator.OLrzqt().EZpvd(), null, 2, null);
        }
    }

    public final void EZpvd(final C26502jdY c26502jdY) {
        C23841iLh c23841iLhDjBIcL = djBIcL();
        LinearLayoutCompat linearLayoutCompat = c23841iLhDjBIcL.AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(c26502jdY.gEmmrt() ? 0 : 8);
        c23841iLhDjBIcL.fARcdN.setText(c26502jdY.OLrzqt());
        copydefault(c26502jdY);
        OLrzqt(c26502jdY);
        C27386juH c27386juH = c23841iLhDjBIcL.KWHzl;
        C27386juH.setChartData$default(c27386juH, c26502jdY.copydefault(), 0.0f, 2, null);
        java.util.Iterator<T> it = c26502jdY.copydefault().iterator();
        double dAEQbTJ = AudioStats.AUDIO_AMPLITUDE_NONE;
        while (it.hasNext()) {
            dAEQbTJ += C33129mqd.AEQbTJ(java.lang.Float.valueOf(((C27390juL) it.next()).AEQbTJ()));
        }
        final C27390juL c27390juL = new C27390juL(C33129mqd.djBIcL(java.lang.Double.valueOf(dAEQbTJ)), c26502jdY.AhwBna(), 0, null, ApyType.TotalApy, 12, null);
        updateCurrentApy$default(this, c27390juL, c26502jdY, false, 4, null);
        c27386juH.setSelectionCallback(new C27386juH.Application() { // from class: o.jdR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C27386juH.Application
            public final void AEQbTJ(C27390juL c27390juL2) {
                C26491jdN.AEQbTJ(this.EZpvd, c27390juL, c26502jdY, c27390juL2);
            }
        });
        if (Intrinsics.EZpvd((java.lang.Object) C33129mqd.gEmmrt(java.lang.Float.valueOf(c27390juL.AEQbTJ())), (java.lang.Object) "0.0")) {
            android.widget.FrameLayout frameLayout = c23841iLhDjBIcL.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(8);
            c23841iLhDjBIcL.DbNXlk.setPaddingRelative(0, 0, 0, 0);
        }
    }

    public static final void AEQbTJ(C26491jdN c26491jdN, C27390juL c27390juL, C26502jdY c26502jdY, C27390juL c27390juL2) {
        if (c27390juL2 != null) {
            c26491jdN.EZpvd(c27390juL2, c26502jdY, true);
        } else {
            c26491jdN.EZpvd(c27390juL, c26502jdY, true);
        }
    }

    public static /* synthetic */ void updateCurrentApy$default(C26491jdN c26491jdN, C27390juL c27390juL, C26502jdY c26502jdY, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c26491jdN.EZpvd(c27390juL, c26502jdY, z);
    }

    public final void EZpvd(C27390juL c27390juL, C26502jdY c26502jdY, boolean z) {
        C23841iLh c23841iLhDjBIcL = djBIcL();
        c23841iLhDjBIcL.fetchVPNInfo.setTextValue(c27390juL.EZpvd());
        c23841iLhDjBIcL.fetchVPNInfo.setOnClickListener(null);
        c23841iLhDjBIcL.fetchVPNInfo.setHelperLabelType(2);
        c23841iLhDjBIcL.fetchVPNInfo.setClickable(false);
        c23841iLhDjBIcL.fetchVPNInfo.setFocusable(false);
        c23841iLhDjBIcL.fetchVPNInfo.setPadding(0, 0, 0, 0);
        c23841iLhDjBIcL.values.setText(C27492jwH.OLrzqt.EZpvd(C33129mqd.gEmmrt(java.lang.Float.valueOf(c27390juL.AEQbTJ()))));
        if (c26502jdY.gEmmrt() && z) {
            for (InterfaceC27436jvE interfaceC27436jvE : c26502jdY.EZpvd()) {
                if (interfaceC27436jvE instanceof InterfaceC27461jvd) {
                    InterfaceC27461jvd interfaceC27461jvd = (InterfaceC27461jvd) interfaceC27436jvE;
                    interfaceC27461jvd.AEQbTJ(c27390juL.copydefault() == ApyType.TotalApy || c27390juL.copydefault() == interfaceC27461jvd.EZpvd());
                }
            }
            C27588jxy.AEQbTJ(OLrzqt(), c26502jdY.EZpvd());
        }
    }

    /* JADX INFO: renamed from: o.jdN$StateListAnimator */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jdN.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C26491jdN newInstance$default(StateListAnimator stateListAnimator, ProductDetailsByChain productDetailsByChain, InterfaceC27395juQ interfaceC27395juQ, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                interfaceC27395juQ = null;
            }
            return stateListAnimator.EZpvd(productDetailsByChain, interfaceC27395juQ);
        }

        public final C26491jdN EZpvd(@NotNull ProductDetailsByChain productDetailsByChain, InterfaceC27395juQ interfaceC27395juQ) {
            Intrinsics.checkNotNullParameter(productDetailsByChain, "");
            C26491jdN c26491jdN = new C26491jdN();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("params.bonusInfo", productDetailsByChain);
            c26491jdN.setArguments(bundle);
            c26491jdN.djBIcL = interfaceC27395juQ;
            return c26491jdN;
        }
    }

    public final void OLrzqt(@NotNull C26502jdY c26502jdY) {
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(c26502jdY, "");
        C23841iLh c23841iLhDjBIcL = djBIcL();
        android.content.Context context = getContext();
        if (context != null && (string = context.getString(C25493ixk.FragmentManager.zsXlph)) != null) {
            str = string;
        }
        java.lang.String str2 = str + " " + c26502jdY.djBIcL();
        java.lang.String strKWHzl = c26502jdY.KWHzl();
        c23841iLhDjBIcL.ejfBZ.setText(str2);
        c23841iLhDjBIcL.AuCTel.setText(strKWHzl);
    }

    public final void copydefault(@NotNull C26502jdY c26502jdY) {
        Intrinsics.checkNotNullParameter(c26502jdY, "");
        long jAEQbTJ = c26502jdY.AEQbTJ();
        long jValueOf = c26502jdY.valueOf();
        C23841iLh c23841iLhDjBIcL = djBIcL();
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.widget.TextView textView = c23841iLhDjBIcL.isConnected;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        c27569jxf.copydefault(textView, jValueOf, jAEQbTJ, C55298xhM.dp2px$default(8.0f, null, 1, null), 6);
    }
}

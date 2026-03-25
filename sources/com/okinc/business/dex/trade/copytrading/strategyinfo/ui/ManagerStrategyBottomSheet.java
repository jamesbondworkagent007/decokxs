package com.okinc.business.dex.trade.copytrading.strategyinfo.ui;

import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dex.trade.copytrading.home.data.CopyTradingPnLResponse;
import com.okinc.business.dex.trade.copytrading.strategyinfo.ui.ManagerStrategyBottomSheet;
import com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel.StrategyBasicInfoViewModel;
import com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel.StrategyInfoViewModel;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C23274hvD;
import o.C23486hzD;
import o.C25352ivB;
import o.C25389ivm;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.ViewOnClickListenerC54939xaY;
import o.gSN;
import o.gTI;
import o.gXB;
import o.wXQ;
import o.yCM;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class ManagerStrategyBottomSheet extends gXB {
    public final InterfaceC56387yDm djBIcL;

    @yCM
    public gTI editStrategyNavigator;
    public final InterfaceC56387yDm gEmmrt;
    public final ActivityResultLauncher<gSN.Application> valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AYXKKw = 8;

    public ManagerStrategyBottomSheet() {
        final Function0 function0 = null;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(StrategyInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.ManagerStrategyBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.ManagerStrategyBottomSheet$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.ManagerStrategyBottomSheet$special$$inlined$activityViewModels$default$3
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(StrategyBasicInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.ManagerStrategyBottomSheet$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.ManagerStrategyBottomSheet$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.ManagerStrategyBottomSheet$special$$inlined$activityViewModels$default$6
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
        ActivityResultLauncher<gSN.Application> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new gSN(), new ActivityResultCallback() { // from class: o.gXF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ManagerStrategyBottomSheet.copydefault(this.EZpvd, (gSN.StateListAnimator) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.valueOf = activityResultLauncherRegisterForActivityResult;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.ManagerStrategyBottomSheet.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void KWHzl(@NotNull FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            new ManagerStrategyBottomSheet().show(fragmentManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StrategyInfoViewModel gEmmrt() {
        return (StrategyInfoViewModel) this.djBIcL.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StrategyBasicInfoViewModel djBIcL() {
        return (StrategyBasicInfoViewModel) this.gEmmrt.getValue();
    }

    /* JADX DEBUG: Possible override for method o.gXB.AEQbTJ()V */
    public final gTI AEQbTJ() {
        gTI gti = this.editStrategyNavigator;
        if (gti != null) {
            return gti;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final void copydefault(ManagerStrategyBottomSheet managerStrategyBottomSheet, gSN.StateListAnimator stateListAnimator) {
        if (Intrinsics.EZpvd((Object) (stateListAnimator != null ? stateListAnimator.OLrzqt() : null), (Object) managerStrategyBottomSheet.gEmmrt().AEQbTJ())) {
            StrategyBasicInfoViewModel.loadData$default(managerStrategyBottomSheet.djBIcL(), false, 1, null);
        }
        managerStrategyBottomSheet.dismissAllowingStateLoss();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.fMBJsc));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        C23486hzD c23486hzDOLrzqt = C23486hzD.OLrzqt(getLayoutInflater(), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(c23486hzDOLrzqt, "");
        c23486hzDOLrzqt.OLrzqt.setContentDescription("web3_dex_copytrading_manage_edit_btn");
        C25352ivB.setOnDoubleCheckClickListener$default(c23486hzDOLrzqt.OLrzqt, 0L, new Function1() { // from class: o.gXD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ManagerStrategyBottomSheet.AEQbTJ(this.KWHzl, (android.view.View) obj);
            }
        }, 1, null);
        C25352ivB.setOnDoubleCheckClickListener$default(c23486hzDOLrzqt.EZpvd, 0L, new Function1() { // from class: o.gXE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ManagerStrategyBottomSheet.EZpvd(this.AEQbTJ, (android.view.View) obj);
            }
        }, 1, null);
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass3(c23486hzDOLrzqt, null), 3, null);
    }

    public static final Unit AEQbTJ(ManagerStrategyBottomSheet managerStrategyBottomSheet, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        managerStrategyBottomSheet.gEmmrt().copydefault(TrackButtonName.EDIT_STRATEGY.getButtonName(), managerStrategyBottomSheet.djBIcL().AhwBna());
        gTI gtiAEQbTJ = managerStrategyBottomSheet.AEQbTJ();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(managerStrategyBottomSheet);
        ActivityResultLauncher<gSN.Application> activityResultLauncher = managerStrategyBottomSheet.valueOf;
        String strAEQbTJ = managerStrategyBottomSheet.gEmmrt().AEQbTJ();
        CopyTradingPnLResponse copyTradingPnLResponseEZpvd = managerStrategyBottomSheet.djBIcL().EZpvd();
        gtiAEQbTJ.KWHzl(lifecycleScope, activityResultLauncher, null, strAEQbTJ, copyTradingPnLResponseEZpvd != null ? copyTradingPnLResponseEZpvd.getTrackedWalletAddress() : null, DexTrackEventParameter.EditStrategyFrom.STRATEGY_PAGE);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final ManagerStrategyBottomSheet managerStrategyBottomSheet, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        managerStrategyBottomSheet.gEmmrt().copydefault(TrackButtonName.STOP_STRATEGY.getButtonName(), managerStrategyBottomSheet.djBIcL().AhwBna());
        FragmentActivity fragmentActivityRequireActivity = managerStrategyBottomSheet.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivityRequireActivity);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.FQNKFG));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.DFbvW));
        viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.UfveVb), new View.OnClickListener() { // from class: o.gXI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                ManagerStrategyBottomSheet.KWHzl(this.OLrzqt, viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.OEgNct), new View.OnClickListener() { // from class: o.gXJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                ManagerStrategyBottomSheet.copydefault(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
        managerStrategyBottomSheet.dismiss();
        return Unit.INSTANCE;
    }

    public static final void KWHzl(ManagerStrategyBottomSheet managerStrategyBottomSheet, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        managerStrategyBottomSheet.djBIcL().valueOf();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.ManagerStrategyBottomSheet$onCreateContent$3, reason: invalid class name */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ C23486hzD $binding;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C23486hzD c23486hzD, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$binding = c23486hzD;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ManagerStrategyBottomSheet.this.new AnonymousClass3(this.$binding, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow flowCombine = FlowKt.combine(ManagerStrategyBottomSheet.this.gEmmrt().copydefault(), ManagerStrategyBottomSheet.this.djBIcL().KWHzl(), new AnonymousClass1(null));
                final C23486hzD c23486hzD = this.$binding;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.ManagerStrategyBottomSheet.onCreateContent.3.3
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return AEQbTJ(((Boolean) obj2).booleanValue(), continuation);
                    }

                    public final Object AEQbTJ(boolean z, Continuation<? super Unit> continuation) {
                        c23486hzD.OLrzqt.setEnabled(z);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowCombine.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.ManagerStrategyBottomSheet$onCreateContent$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements yHO<Boolean, Boolean, Continuation<? super Boolean>, Object> {
            /* synthetic */ boolean Z$0;
            /* synthetic */ boolean Z$1;
            int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // o.yHO
            public /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
                return invoke(bool.booleanValue(), bool2.booleanValue(), continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(boolean z, boolean z2, Continuation<? super Boolean> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.Z$0 = z;
                anonymousClass1.Z$1 = z2;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return C56443yFo.KWHzl(this.Z$0 && this.Z$1);
            }
        }
    }
}

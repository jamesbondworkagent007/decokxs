package com.okinc.business.dex.trade.copytrading.strategyinfo.ui;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dex.trade.component.orderandposition.openorder.domain.model.ReminderType;
import com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyOpenOrderFragment;
import com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel.StrategyOpenOrderViewModel;
import com.okinc.uilab.reminder.OKReminder;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC20019gXx;
import o.C20064gZo;
import o.C22274hcK;
import o.C23274hvD;
import o.C33070mpX;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56402yEa;
import o.C56442yFn;
import o.C56524yIo;
import o.InterfaceC20068gZs;
import o.InterfaceC56387yDm;
import o.gLW;
import o.hBC;
import o.rVN;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class StrategyOpenOrderFragment extends AbstractC20019gXx {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm DbNXlk;

    @yCM
    public gLW walletModuleUiService;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ReminderType.values().length];
            try {
                iArr[ReminderType.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReminderType.NeedUpgradeSaVersion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReminderType.NeedRenewal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReminderType.Keep.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    public StrategyOpenOrderFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyOpenOrderFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyOpenOrderFragment$special$$inlined$viewModels$default$2
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(StrategyOpenOrderViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyOpenOrderFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyOpenOrderFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyOpenOrderFragment$special$$inlined$viewModels$default$5
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
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.gYg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(StrategyOpenOrderFragment.djBIcL(this.KWHzl));
            }
        });
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyOpenOrderFragment.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final StrategyOpenOrderFragment copydefault(boolean z) {
            StrategyOpenOrderFragment strategyOpenOrderFragment = new StrategyOpenOrderFragment();
            strategyOpenOrderFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("extra_universal_1", Boolean.valueOf(z))));
            return strategyOpenOrderFragment;
        }
    }

    /* JADX DEBUG: Possible override for method o.gXx.valueOf()V */
    public final StrategyOpenOrderViewModel valueOf() {
        return (StrategyOpenOrderViewModel) this.AkhnZx.getValue();
    }

    public final boolean isConnected() {
        return ((Boolean) this.DbNXlk.getValue()).booleanValue();
    }

    public static final boolean djBIcL(StrategyOpenOrderFragment strategyOpenOrderFragment) {
        Bundle arguments = strategyOpenOrderFragment.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("extra_universal_1");
        }
        return false;
    }

    public final gLW AhwBna() {
        gLW glw = this.walletModuleUiService;
        if (glw != null) {
            return glw;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        valueOf().OLrzqt(AEQbTJ().AEQbTJ(), isConnected());
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    @Override // o.AbstractC20011gXp, o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        valueOf().gEmmrt();
        KWHzl().copydefault(new Function1() { // from class: o.gYh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return StrategyOpenOrderFragment.OLrzqt(this.AEQbTJ, (C20064gZo) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass2(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass3(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass4(null), 3, null);
    }

    public static final Unit OLrzqt(StrategyOpenOrderFragment strategyOpenOrderFragment, C20064gZo c20064gZo) {
        Intrinsics.checkNotNullParameter(c20064gZo, "");
        strategyOpenOrderFragment.KWHzl(C56402yEa.EZpvd(c20064gZo.AYXKKw()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyOpenOrderFragment$setListener$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StrategyOpenOrderFragment.this.new AnonymousClass2(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<InterfaceC20068gZs> stateFlowCopydefault = StrategyOpenOrderFragment.this.valueOf().copydefault();
                final StrategyOpenOrderFragment strategyOpenOrderFragment = StrategyOpenOrderFragment.this;
                FlowCollector<? super InterfaceC20068gZs> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyOpenOrderFragment.setListener.2.2
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public final Object emit(InterfaceC20068gZs interfaceC20068gZs, Continuation<? super Unit> continuation) {
                        strategyOpenOrderFragment.AkhnZx();
                        strategyOpenOrderFragment.EZpvd(interfaceC20068gZs);
                        if ((interfaceC20068gZs instanceof InterfaceC20068gZs.StateListAnimator) || (interfaceC20068gZs instanceof InterfaceC20068gZs.ActionBar)) {
                            rVN.reportFullyDrawn$default((Fragment) strategyOpenOrderFragment, true, (String) null, 2, (Object) null);
                        } else if (interfaceC20068gZs instanceof InterfaceC20068gZs.Application) {
                            rVN.reportFullyDrawn$default((Fragment) strategyOpenOrderFragment, false, (String) null, 2, (Object) null);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowCopydefault.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyOpenOrderFragment$setListener$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StrategyOpenOrderFragment.this.new AnonymousClass3(continuation);
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
                SharedFlow<Pair<Boolean, List<String>>> sharedFlowAEQbTJ = StrategyOpenOrderFragment.this.valueOf().AEQbTJ();
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(StrategyOpenOrderFragment.this);
                this.label = 1;
                if (sharedFlowAEQbTJ.collect(anonymousClass4, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }

        /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyOpenOrderFragment$setListener$3$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ StrategyOpenOrderFragment EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(StrategyOpenOrderFragment strategyOpenOrderFragment) {
                this.EZpvd = strategyOpenOrderFragment;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public final Object emit(final Pair<Boolean, ? extends List<String>> pair, Continuation<? super Unit> continuation) {
                if (pair.getFirst().booleanValue()) {
                    C22274hcK c22274hcK = C22274hcK.OLrzqt;
                    FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    final StrategyOpenOrderFragment strategyOpenOrderFragment = this.EZpvd;
                    c22274hcK.KWHzl(fragmentActivityRequireActivity, new Function0() { // from class: o.gYl
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return StrategyOpenOrderFragment.AnonymousClass3.AnonymousClass4.EZpvd(strategyOpenOrderFragment, pair);
                        }
                    });
                } else {
                    C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.addPreRequisiteCollector, 0, 1, (Object) null);
                }
                return Unit.INSTANCE;
            }

            public static final Unit EZpvd(StrategyOpenOrderFragment strategyOpenOrderFragment, Pair pair) {
                strategyOpenOrderFragment.valueOf().KWHzl((List<String>) pair.getSecond());
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyOpenOrderFragment$setListener$4, reason: invalid class name */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StrategyOpenOrderFragment.this.new AnonymousClass4(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SharedFlow<Pair<Boolean, List<String>>> sharedFlowEZpvd = StrategyOpenOrderFragment.this.valueOf().EZpvd();
                C03304 c03304 = new C03304(StrategyOpenOrderFragment.this);
                this.label = 1;
                if (sharedFlowEZpvd.collect(c03304, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }

        /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyOpenOrderFragment$setListener$4$4, reason: invalid class name and collision with other inner class name */
        public static final class C03304<T> implements FlowCollector {
            public final /* synthetic */ StrategyOpenOrderFragment KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C03304(StrategyOpenOrderFragment strategyOpenOrderFragment) {
                this.KWHzl = strategyOpenOrderFragment;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public final Object emit(final Pair<Boolean, ? extends List<String>> pair, Continuation<? super Unit> continuation) {
                if (pair.getFirst().booleanValue()) {
                    C22274hcK c22274hcK = C22274hcK.OLrzqt;
                    FragmentActivity fragmentActivityRequireActivity = this.KWHzl.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    final StrategyOpenOrderFragment strategyOpenOrderFragment = this.KWHzl;
                    c22274hcK.KWHzl(fragmentActivityRequireActivity, new Function0() { // from class: o.gYm
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return StrategyOpenOrderFragment.AnonymousClass4.C03304.EZpvd(strategyOpenOrderFragment, pair);
                        }
                    });
                } else {
                    C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.addPreRequisiteCollector, 0, 1, (Object) null);
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit EZpvd(StrategyOpenOrderFragment strategyOpenOrderFragment, Pair pair) {
                strategyOpenOrderFragment.valueOf().copydefault((List<String>) pair.getSecond());
                return Unit.INSTANCE;
            }
        }
    }

    public final void AkhnZx() {
        OKReminder oKReminder;
        OKReminder oKReminder2;
        OKReminder oKReminder3;
        OKReminder oKReminder4;
        OKReminder oKReminder5;
        OKReminder oKReminder6;
        OKReminder oKReminder7;
        OKReminder oKReminder8;
        OKReminder oKReminder9;
        OKReminder oKReminder10;
        OKReminder oKReminder11;
        OKReminder oKReminder12;
        int i = ActionBar.copydefault[valueOf().KWHzl().ordinal()];
        if (i == 1) {
            hBC hbcFARcdN = fARcdN();
            if (hbcFARcdN == null || (oKReminder = hbcFARcdN.gEmmrt) == null) {
                return;
            }
            oKReminder.setVisibility(8);
            return;
        }
        if (i == 2) {
            hBC hbcFARcdN2 = fARcdN();
            if (hbcFARcdN2 != null && (oKReminder6 = hbcFARcdN2.gEmmrt) != null) {
                oKReminder6.setVisibility(0);
            }
            hBC hbcFARcdN3 = fARcdN();
            if (hbcFARcdN3 != null && (oKReminder5 = hbcFARcdN3.gEmmrt) != null) {
                oKReminder5.setMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.unregister));
            }
            hBC hbcFARcdN4 = fARcdN();
            if (hbcFARcdN4 != null && (oKReminder4 = hbcFARcdN4.gEmmrt) != null) {
                oKReminder4.setCloseIconVisibility(false);
            }
            hBC hbcFARcdN5 = fARcdN();
            if (hbcFARcdN5 != null && (oKReminder3 = hbcFARcdN5.gEmmrt) != null) {
                oKReminder3.setStyle(2);
            }
            hBC hbcFARcdN6 = fARcdN();
            if (hbcFARcdN6 == null || (oKReminder2 = hbcFARcdN6.gEmmrt) == null) {
                return;
            }
            oKReminder2.setPrimaryAction(C33070mpX.AYXKKw(C23274hvD.Fragment.QKDJJA), new Function0() { // from class: o.gYk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return StrategyOpenOrderFragment.AhwBna(this.OLrzqt);
                }
            });
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        hBC hbcFARcdN7 = fARcdN();
        if (hbcFARcdN7 != null && (oKReminder12 = hbcFARcdN7.gEmmrt) != null) {
            oKReminder12.setVisibility(0);
        }
        hBC hbcFARcdN8 = fARcdN();
        if (hbcFARcdN8 != null && (oKReminder11 = hbcFARcdN8.gEmmrt) != null) {
            oKReminder11.setVisibility(0);
        }
        hBC hbcFARcdN9 = fARcdN();
        if (hbcFARcdN9 != null && (oKReminder10 = hbcFARcdN9.gEmmrt) != null) {
            oKReminder10.setMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.fTEjYi));
        }
        hBC hbcFARcdN10 = fARcdN();
        if (hbcFARcdN10 != null && (oKReminder9 = hbcFARcdN10.gEmmrt) != null) {
            oKReminder9.setCloseIconVisibility(false);
        }
        hBC hbcFARcdN11 = fARcdN();
        if (hbcFARcdN11 != null && (oKReminder8 = hbcFARcdN11.gEmmrt) != null) {
            oKReminder8.setStyle(2);
        }
        hBC hbcFARcdN12 = fARcdN();
        if (hbcFARcdN12 == null || (oKReminder7 = hbcFARcdN12.gEmmrt) == null) {
            return;
        }
        oKReminder7.setPrimaryAction(C33070mpX.AYXKKw(C23274hvD.Fragment.QKDJJA), new Function0() { // from class: o.gYi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return StrategyOpenOrderFragment.valueOf(this.copydefault);
            }
        });
    }

    public static final Unit AhwBna(StrategyOpenOrderFragment strategyOpenOrderFragment) {
        gLW glwAhwBna = strategyOpenOrderFragment.AhwBna();
        FragmentActivity fragmentActivityRequireActivity = strategyOpenOrderFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        gLW.ActionBar.navigateToRenewOrReenableSA$default(glwAhwBna, fragmentActivityRequireActivity, false, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(StrategyOpenOrderFragment strategyOpenOrderFragment) {
        gLW glwAhwBna = strategyOpenOrderFragment.AhwBna();
        FragmentActivity fragmentActivityRequireActivity = strategyOpenOrderFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        gLW.ActionBar.navigateToRenewOrReenableSA$default(glwAhwBna, fragmentActivityRequireActivity, false, 2, null);
        return Unit.INSTANCE;
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        AkhnZx();
    }

    @Override // o.AbstractC20011gXp
    public void EZpvd() {
        valueOf().AYXKKw();
    }

    @Override // o.hTH
    public void DbNXlk() {
        StrategyOpenOrderViewModel.loadOpenOrders$default(valueOf(), false, 1, null);
    }

    @Override // o.AbstractC20011gXp
    public void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        valueOf().OLrzqt(str, isConnected());
        StrategyOpenOrderViewModel.loadOpenOrders$default(valueOf(), false, 1, null);
    }

    private final void KWHzl(List<String> list) {
        valueOf().copydefault(list);
    }
}

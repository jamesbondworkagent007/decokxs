package o;

import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingDefaultConfig;
import com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuySettingFragment$setListener$1$1;
import com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuySettingFragment$setListener$1$10;
import com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuySettingFragment$setListener$1$9$emit$1;
import com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuySettingFragment$startLoadData$1$1$1;
import com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel.CopyTradingBuyInputPanelViewModel;
import com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel.CopyTradingEditStrategyViewModel;
import com.okinc.business.dex.trade.copytrading.edit.ui.widget.BuySellConfigData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSettingsContract;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gTa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C19888gTa extends AbstractC19907gTt<C23504hzV> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final ActivityResultLauncher<AdvancedSettingsContract.Input> AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.QDqgQU;
    }

    public C19888gTa() {
        final Function0 function0 = null;
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CopyTradingBuyInputPanelViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuySettingFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuySettingFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuySettingFragment$special$$inlined$activityViewModels$default$3
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CopyTradingEditStrategyViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuySettingFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuySettingFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuySettingFragment$special$$inlined$activityViewModels$default$6
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
        ActivityResultLauncher<AdvancedSettingsContract.Input> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new AdvancedSettingsContract(), new ActivityResultCallback() { // from class: o.gSX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C19888gTa.copydefault(this.EZpvd, (AdvancedSettingsContract.Input) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AEQbTJ = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.gTa$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gTa.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C19888gTa EZpvd() {
            return new C19888gTa();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CopyTradingBuyInputPanelViewModel AYXKKw() {
        return (CopyTradingBuyInputPanelViewModel) this.KWHzl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CopyTradingEditStrategyViewModel valueOf() {
        return (CopyTradingEditStrategyViewModel) this.copydefault.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(C19888gTa c19888gTa, AdvancedSettingsContract.Input input) {
        C19923gUi c19923gUi;
        if (input == null) {
            return;
        }
        pUU.KWHzl(c19888gTa.getTAG(), "result: " + input);
        C23504hzV c23504hzV = (C23504hzV) c19888gTa.AEQbTJ();
        if (c23504hzV == null || (c19923gUi = c23504hzV.OLrzqt) == null || c19923gUi.KWHzl() == null) {
            return;
        }
        c19888gTa.AEQbTJ(new BuySellConfigData(Intrinsics.EZpvd((java.lang.Object) input.getRouterModeType(), (java.lang.Object) PresetRouteType.RouteTypeMev.getValue()), PresetRouteType.Companion.EZpvd(input.getRouterModeType()), input.getSlippageMode(), input.getSlippageValue(), PriorityFeeType.Companion.copydefault(input.getPriorityFeeType()), input.getPriorityValue()));
        c19888gTa.valueOf().EZpvd(input);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/View;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC7000aZw
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C23504hzV AEQbTJ(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C23504hzV c23504hzVEZpvd = C23504hzV.EZpvd(view);
        Intrinsics.checkNotNullExpressionValue(c23504hzVEZpvd, "");
        return c23504hzVEZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC7000aZw
    public void KWHzl() {
        C19923gUi c19923gUi;
        C23504hzV c23504hzV = (C23504hzV) AEQbTJ();
        if (c23504hzV == null || (c19923gUi = c23504hzV.OLrzqt) == null) {
            return;
        }
        c19923gUi.setMaxBuyAmount(AYXKKw().AYXKKw().getValue().getSecond());
        c19923gUi.setIsSkipHodling(AYXKKw().AhwBna().getValue().booleanValue());
        C19919gUe c19919gUeKWHzl = c19923gUi.KWHzl();
        c19919gUeKWHzl.setOnClickListener(new FragmentManager(c19919gUeKWHzl, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC
    public void setListener() {
        C19923gUi c19923gUi;
        super.setListener();
        C23504hzV c23504hzV = (C23504hzV) AEQbTJ();
        if (c23504hzV == null || (c19923gUi = c23504hzV.OLrzqt) == null) {
            return;
        }
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CopyTradingBuySettingFragment$setListener$1$1(this, c19923gUi, null), 3, null);
        c19923gUi.setOnMaxBuyChangedListener(new Function1() { // from class: o.gSZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19888gTa.AEQbTJ(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        c19923gUi.setOnInputChangeListener(new Function2() { // from class: o.gSW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C19888gTa.KWHzl(this.KWHzl, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
            }
        });
        c19923gUi.setOnSkipHodlingChangedListener(new Function1() { // from class: o.gTb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19888gTa.OLrzqt(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        c19923gUi.KWHzl(new Function0() { // from class: o.gTe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19888gTa.AhwBna(this.OLrzqt);
            }
        });
        c19923gUi.copydefault(new Function0() { // from class: o.gTf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19888gTa.gEmmrt(this.copydefault);
            }
        });
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().AhwBna(), null, new Activity(c19923gUi), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().fetchVPNInfo(), null, new Application(c19923gUi), 2, null);
        StateFlow<Result<gTC>> stateFlowFJNWhG = valueOf().fJNWhG();
        Lifecycle.State state = Lifecycle.State.CREATED;
        C25390ivn.AEQbTJ(this, stateFlowFJNWhG, state, new StateListAnimator());
        C25390ivn.AEQbTJ(this, FlowKt.combine(AYXKKw().djBIcL(), valueOf().fJNWhG(), new CopyTradingBuySettingFragment$setListener$1$10(null)), state, new TaskDescription(c19923gUi));
    }

    public static final Unit AEQbTJ(C19888gTa c19888gTa, boolean z) {
        c19888gTa.AYXKKw().copydefault(z);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C19888gTa c19888gTa, boolean z, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c19888gTa.AYXKKw().AEQbTJ(str, z);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C19888gTa c19888gTa, boolean z) {
        c19888gTa.AYXKKw().AEQbTJ(z);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C19888gTa c19888gTa) {
        CopyTradingEditStrategyViewModel.trackClickEvent$default(c19888gTa.valueOf(), TrackButtonName.MAX_BUY_EXPLAIN.getButtonName(), null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C19888gTa c19888gTa) {
        CopyTradingEditStrategyViewModel.trackClickEvent$default(c19888gTa.valueOf(), TrackButtonName.SKIP_HOLDINGS_EXPLAIN.getButtonName(), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.gTa$Activity */
    public static final class Activity<T> implements FlowCollector {
        public final /* synthetic */ C19923gUi EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(C19923gUi c19923gUi) {
            this.EZpvd = c19923gUi;
        }

        public final java.lang.Object KWHzl(boolean z, Continuation<? super Unit> continuation) {
            this.EZpvd.setIsSkipHodling(z);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return KWHzl(((java.lang.Boolean) obj).booleanValue(), continuation);
        }
    }

    /* JADX INFO: renamed from: o.gTa$Application */
    public static final class Application<T> implements FlowCollector {
        public final /* synthetic */ C19923gUi AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(C19923gUi c19923gUi) {
            this.AEQbTJ = c19923gUi;
        }

        public final java.lang.Object copydefault(boolean z, Continuation<? super Unit> continuation) {
            this.AEQbTJ.setMaxBuyVisible(z);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return copydefault(((java.lang.Boolean) obj).booleanValue(), continuation);
        }
    }

    /* JADX INFO: renamed from: o.gTa$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(Result<gTC> result, Continuation<? super Unit> continuation) throws java.lang.Throwable {
            CopyTradingBuySettingFragment$setListener$1$9$emit$1 copyTradingBuySettingFragment$setListener$1$9$emit$1;
            C19888gTa c19888gTa;
            StateListAnimator<T> stateListAnimator;
            if (continuation instanceof CopyTradingBuySettingFragment$setListener$1$9$emit$1) {
                copyTradingBuySettingFragment$setListener$1$9$emit$1 = (CopyTradingBuySettingFragment$setListener$1$9$emit$1) continuation;
                int i = copyTradingBuySettingFragment$setListener$1$9$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    copyTradingBuySettingFragment$setListener$1$9$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    copyTradingBuySettingFragment$setListener$1$9$emit$1 = new CopyTradingBuySettingFragment$setListener$1$9$emit$1(this, continuation);
                }
            }
            java.lang.Object obj = copyTradingBuySettingFragment$setListener$1$9$emit$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = copyTradingBuySettingFragment$setListener$1$9$emit$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                C19888gTa c19888gTa2 = C19888gTa.this;
                CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModelValueOf = c19888gTa2.valueOf();
                copyTradingBuySettingFragment$setListener$1$9$emit$1.L$0 = this;
                copyTradingBuySettingFragment$setListener$1$9$emit$1.L$1 = c19888gTa2;
                copyTradingBuySettingFragment$setListener$1$9$emit$1.label = 1;
                java.lang.Object buySellConfigData$default = CopyTradingEditStrategyViewModel.getBuySellConfigData$default(copyTradingEditStrategyViewModelValueOf, false, copyTradingBuySettingFragment$setListener$1$9$emit$1, 1, null);
                if (buySellConfigData$default == objCopydefault) {
                    return objCopydefault;
                }
                c19888gTa = c19888gTa2;
                obj = buySellConfigData$default;
                stateListAnimator = this;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c19888gTa = (C19888gTa) copyTradingBuySettingFragment$setListener$1$9$emit$1.L$1;
                stateListAnimator = (StateListAnimator) copyTradingBuySettingFragment$setListener$1$9$emit$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            BuySellConfigData buySellConfigData = (BuySellConfigData) obj;
            if (buySellConfigData == null) {
                return Unit.INSTANCE;
            }
            c19888gTa.AEQbTJ(buySellConfigData);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C19888gTa.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.gTa$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        public final /* synthetic */ C19923gUi AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(C19923gUi c19923gUi) {
            this.AEQbTJ = c19923gUi;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(kotlin.Pair<DexMultiTokenInfoBean, gTC> pair, Continuation<? super Unit> continuation) {
            CopyTradingDefaultConfig copyTradingDefaultConfigKWHzl;
            DexMultiTokenInfoBean dexMultiTokenInfoBeanComponent1 = pair.component1();
            gTC gtcComponent2 = pair.component2();
            C19923gUi c19923gUi = this.AEQbTJ;
            java.lang.String minBuyAmountUSD = (gtcComponent2 == null || (copyTradingDefaultConfigKWHzl = gtcComponent2.KWHzl()) == null) ? null : copyTradingDefaultConfigKWHzl.getMinBuyAmountUSD();
            if (minBuyAmountUSD == null) {
                minBuyAmountUSD = "";
            }
            c19923gUi.setMaxBuyTokenSymbol(dexMultiTokenInfoBeanComponent1, minBuyAmountUSD);
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = AYXKKw().copydefault();
        if (dexMultiTokenInfoBeanCopydefault != null) {
            AYXKKw().EZpvd(dexMultiTokenInfoBeanCopydefault);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(BuySellConfigData buySellConfigData) {
        C19923gUi c19923gUi;
        C19919gUe c19919gUeKWHzl;
        C23504hzV c23504hzV = (C23504hzV) AEQbTJ();
        if (c23504hzV == null || (c19923gUi = c23504hzV.OLrzqt) == null || (c19919gUeKWHzl = c19923gUi.KWHzl()) == null) {
            return;
        }
        c19919gUeKWHzl.setBuySellConfigData(buySellConfigData);
        c19919gUeKWHzl.setMevDisplay(buySellConfigData.KWHzl());
        c19919gUeKWHzl.setSlippageValue(buySellConfigData.AEQbTJ());
        c19919gUeKWHzl.setPriorityFeeValue(buySellConfigData.copydefault(), buySellConfigData.EZpvd());
    }

    /* JADX INFO: renamed from: o.gTa$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C19888gTa OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C19888gTa c19888gTa) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = c19888gTa;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                CopyTradingEditStrategyViewModel.trackClickEvent$default(this.OLrzqt.valueOf(), TrackButtonName.COPY_BUY_CONFIG.getButtonName(), null, 2, null);
                C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this.OLrzqt), null, null, new CopyTradingBuySettingFragment$startLoadData$1$1$1(this.OLrzqt, null), 3, null);
            }
        }
    }
}

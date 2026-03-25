package com.okinc.business.dex.trade.copytrading.strategyinfo.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dex.trade.copytrading.edit.data.model.KolInfo;
import com.okinc.business.dex.trade.copytrading.home.data.CopyTradingPnLResponse;
import com.okinc.business.dex.trade.copytrading.home.data.StrategyStatus;
import com.okinc.business.dex.trade.copytrading.home.ui.StrategyCellType;
import com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyBasicInfoFragment;
import com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel.StrategyBasicInfoViewModel;
import com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel.StrategyInfoViewModel;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC20007gXl;
import o.AbstractC20020gXy;
import o.C19971gWc;
import o.C19976gWh;
import o.C19981gWm;
import o.C22274hcK;
import o.C22359hdq;
import o.C23274hvD;
import o.C23322hvz;
import o.C25352ivB;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C52761wXj;
import o.C52794wYp;
import o.C55298xhM;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56423yEv;
import o.C56442yFn;
import o.C56524yIo;
import o.InterfaceC19969gWa;
import o.InterfaceC19970gWb;
import o.InterfaceC19982gWn;
import o.InterfaceC56387yDm;
import o.gSN;
import o.gTI;
import o.gWU;
import o.hBE;
import o.pTA;
import o.rVN;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class StrategyBasicInfoFragment extends AbstractC20020gXy<hBE> {
    public final ActivityResultLauncher<gSN.Application> AYXKKw;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.gXM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return StrategyBasicInfoFragment.OLrzqt(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm djBIcL;

    @yCM
    public gTI editStrategyNavigator;
    public final InterfaceC56387yDm gEmmrt;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[StrategyStatus.values().length];
            try {
                iArr[StrategyStatus.Pause.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StrategyStatus.SystemSuspended.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StrategyStatus.Active.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StrategyStatus.Done.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StrategyStatus.Expired.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StrategyStatus.Delete.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull hBE hbe, Bundle bundle) {
        Intrinsics.checkNotNullParameter(hbe, "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ hBE EZpvd(StrategyBasicInfoFragment strategyBasicInfoFragment) {
        return (hBE) strategyBasicInfoFragment.fARcdN();
    }

    public StrategyBasicInfoFragment() {
        final Function0 function0 = null;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(StrategyInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyBasicInfoFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyBasicInfoFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyBasicInfoFragment$special$$inlined$activityViewModels$default$3
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(StrategyBasicInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyBasicInfoFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyBasicInfoFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyBasicInfoFragment$special$$inlined$activityViewModels$default$6
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
        ActivityResultLauncher<gSN.Application> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new gSN(), new ActivityResultCallback() { // from class: o.gXN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                StrategyBasicInfoFragment.OLrzqt(this.EZpvd, (gSN.StateListAnimator) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AYXKKw = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StrategyInfoViewModel AhwBna() {
        return (StrategyInfoViewModel) this.djBIcL.getValue();
    }

    private final InterfaceC19969gWa valueOf() {
        return (InterfaceC19969gWa) this.AhwBna.getValue();
    }

    public static final C19971gWc OLrzqt(StrategyBasicInfoFragment strategyBasicInfoFragment) {
        return new C19971gWc(strategyBasicInfoFragment);
    }

    public final StrategyBasicInfoViewModel gEmmrt() {
        return (StrategyBasicInfoViewModel) this.gEmmrt.getValue();
    }

    /* JADX DEBUG: Possible override for method o.gXy.AEQbTJ()V */
    public final gTI AEQbTJ() {
        gTI gti = this.editStrategyNavigator;
        if (gti != null) {
            return gti;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final void OLrzqt(StrategyBasicInfoFragment strategyBasicInfoFragment, gSN.StateListAnimator stateListAnimator) {
        if (C33129mqd.OLrzqt((CharSequence) (stateListAnimator != null ? stateListAnimator.OLrzqt() : null))) {
            StrategyInfoViewModel strategyInfoViewModelAhwBna = strategyBasicInfoFragment.AhwBna();
            String strOLrzqt = stateListAnimator != null ? stateListAnimator.OLrzqt() : null;
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
            strategyInfoViewModelAhwBna.KWHzl(strOLrzqt);
        }
    }

    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        gEmmrt().EZpvd(AhwBna().AEQbTJ());
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public hBE OLrzqt(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hBE hbeCopydefault = hBE.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hbeCopydefault, "");
        return hbeCopydefault;
    }

    @Override // o.hTH
    public void DbNXlk() {
        StrategyBasicInfoViewModel.loadData$default(gEmmrt(), false, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC
    public void setListener() {
        C52794wYp c52794wYp;
        gEmmrt().gEmmrt();
        hBE hbe = (hBE) fARcdN();
        if (hbe != null && (c52794wYp = hbe.copydefault) != null) {
            C25352ivB.setOnDoubleCheckClickListener$default(c52794wYp, 0L, new Function1() { // from class: o.gXL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return StrategyBasicInfoFragment.OLrzqt(this.EZpvd, (android.view.View) obj);
                }
            }, 1, null);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass2(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass3(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass4(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass5(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass6(null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(StrategyBasicInfoFragment strategyBasicInfoFragment, View view) {
        C52794wYp c52794wYp;
        Intrinsics.checkNotNullParameter(view, "");
        hBE hbe = (hBE) strategyBasicInfoFragment.fARcdN();
        Object tag = (hbe == null || (c52794wYp = hbe.copydefault) == null) ? null : c52794wYp.getTag();
        StrategyStatus strategyStatus = tag instanceof StrategyStatus ? (StrategyStatus) tag : null;
        if (strategyStatus == null) {
            return Unit.INSTANCE;
        }
        switch (Activity.OLrzqt[strategyStatus.ordinal()]) {
            case 1:
            case 2:
                strategyBasicInfoFragment.AhwBna().copydefault(TrackButtonName.START_BUTTON.getButtonName(), "ONGOING_PAUSED_STRATEGY");
                strategyBasicInfoFragment.gEmmrt().copydefault();
                break;
            case 3:
                strategyBasicInfoFragment.AhwBna().copydefault(TrackButtonName.PAUSE_BUTTON.getButtonName(), "ONGOING_RUNNING_STRATEGY");
                strategyBasicInfoFragment.gEmmrt().djBIcL();
                break;
            case 4:
            case 5:
            case 6:
                strategyBasicInfoFragment.AhwBna().copydefault(TrackButtonName.COPY_AGAIN.getButtonName(), "HISTORY_STRATEGY");
                gTI gtiAEQbTJ = strategyBasicInfoFragment.AEQbTJ();
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(strategyBasicInfoFragment);
                ActivityResultLauncher<gSN.Application> activityResultLauncher = strategyBasicInfoFragment.AYXKKw;
                String strAEQbTJ = strategyBasicInfoFragment.AhwBna().AEQbTJ();
                CopyTradingPnLResponse copyTradingPnLResponseEZpvd = strategyBasicInfoFragment.gEmmrt().EZpvd();
                gtiAEQbTJ.EZpvd(lifecycleScope, activityResultLauncher, null, strAEQbTJ, copyTradingPnLResponseEZpvd != null ? copyTradingPnLResponseEZpvd.getTrackedWalletAddress() : null, DexTrackEventParameter.EditStrategyFrom.STRATEGY_PAGE, Integer.valueOf(strategyBasicInfoFragment.gEmmrt().AEQbTJ()));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyBasicInfoFragment$setListener$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StrategyBasicInfoFragment.this.new AnonymousClass2(continuation);
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
                SharedFlow<AbstractC20007gXl> sharedFlowAYXKKw = StrategyBasicInfoFragment.this.gEmmrt().AYXKKw();
                final StrategyBasicInfoFragment strategyBasicInfoFragment = StrategyBasicInfoFragment.this;
                FlowCollector<? super AbstractC20007gXl> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyBasicInfoFragment.setListener.2.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public final Object emit(AbstractC20007gXl abstractC20007gXl, Continuation<? super Unit> continuation) {
                        if (abstractC20007gXl instanceof AbstractC20007gXl.ActionBar) {
                            strategyBasicInfoFragment.OLrzqt((AbstractC20007gXl.ActionBar) abstractC20007gXl);
                        } else if (abstractC20007gXl instanceof AbstractC20007gXl.TaskDescription) {
                            strategyBasicInfoFragment.copydefault((AbstractC20007gXl.TaskDescription) abstractC20007gXl);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (sharedFlowAYXKKw.collect(flowCollector, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyBasicInfoFragment$setListener$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StrategyBasicInfoFragment.this.new AnonymousClass3(continuation);
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
                SharedFlow<Unit> sharedFlowKWHzl = StrategyBasicInfoFragment.this.AhwBna().KWHzl();
                final StrategyBasicInfoFragment strategyBasicInfoFragment = StrategyBasicInfoFragment.this;
                FlowCollector<? super Unit> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyBasicInfoFragment.setListener.3.5
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                        StrategyBasicInfoViewModel.loadData$default(strategyBasicInfoFragment.gEmmrt(), false, 1, null);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (sharedFlowKWHzl.collect(flowCollector, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyBasicInfoFragment$setListener$4, reason: invalid class name */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StrategyBasicInfoFragment.this.new AnonymousClass4(continuation);
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
                SharedFlow<String> sharedFlowOLrzqt = StrategyBasicInfoFragment.this.AhwBna().OLrzqt();
                final StrategyBasicInfoFragment strategyBasicInfoFragment = StrategyBasicInfoFragment.this;
                FlowCollector<? super String> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyBasicInfoFragment.setListener.4.1
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public final Object emit(String str, Continuation<? super Unit> continuation) {
                        strategyBasicInfoFragment.gEmmrt().EZpvd(str);
                        StrategyBasicInfoViewModel.loadData$default(strategyBasicInfoFragment.gEmmrt(), false, 1, null);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (sharedFlowOLrzqt.collect(flowCollector, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyBasicInfoFragment$setListener$5, reason: invalid class name */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StrategyBasicInfoFragment.this.new AnonymousClass5(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow<Boolean> flowCopydefault = StrategyBasicInfoFragment.this.AhwBna().copydefault();
                final StrategyBasicInfoFragment strategyBasicInfoFragment = StrategyBasicInfoFragment.this;
                FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyBasicInfoFragment.setListener.5.4
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return copydefault(((Boolean) obj2).booleanValue(), continuation);
                    }

                    public final Object copydefault(boolean z, Continuation<? super Unit> continuation) {
                        C52794wYp c52794wYp;
                        hBE hbeEZpvd = StrategyBasicInfoFragment.EZpvd(strategyBasicInfoFragment);
                        if (hbeEZpvd != null && (c52794wYp = hbeEZpvd.copydefault) != null) {
                            c52794wYp.setEnabled(z);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowCopydefault.collect(flowCollector, this) == objCopydefault) {
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
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyBasicInfoFragment$setListener$6, reason: invalid class name */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass6(Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StrategyBasicInfoFragment.this.new AnonymousClass6(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<gWU> stateFlowOLrzqt = StrategyBasicInfoFragment.this.gEmmrt().OLrzqt();
                final StrategyBasicInfoFragment strategyBasicInfoFragment = StrategyBasicInfoFragment.this;
                FlowCollector<? super gWU> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyBasicInfoFragment.setListener.6.2
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public final Object emit(gWU gwu, Continuation<? super Unit> continuation) {
                        C22359hdq c22359hdq;
                        strategyBasicInfoFragment.AhwBna().copydefault(gwu);
                        hBE hbeEZpvd = StrategyBasicInfoFragment.EZpvd(strategyBasicInfoFragment);
                        if (hbeEZpvd != null && (c22359hdq = hbeEZpvd.KWHzl) != null) {
                            c22359hdq.OLrzqt(gwu);
                        }
                        if (gwu instanceof gWU.Activity) {
                            rVN.reportFullyDrawn$default((Fragment) strategyBasicInfoFragment, true, (String) null, 2, (Object) null);
                            gWU.Activity activity = (gWU.Activity) gwu;
                            strategyBasicInfoFragment.OLrzqt(activity.OLrzqt());
                            strategyBasicInfoFragment.KWHzl(activity.OLrzqt().getStrategyStatus());
                        } else if (gwu instanceof gWU.Application) {
                            rVN.reportFullyDrawn$default((Fragment) strategyBasicInfoFragment, false, (String) null, 2, (Object) null);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowOLrzqt.collect(flowCollector, this) == objCopydefault) {
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

    public final void djBIcL() {
        AhwBna().copydefault(TrackButtonName.COPY_ADDRESS_FROM_ICON.getButtonName(), gEmmrt().AhwBna());
    }

    public final void copydefault(AbstractC20007gXl.TaskDescription taskDescription) {
        String name;
        int i = Activity.OLrzqt[taskDescription.KWHzl().ordinal()];
        if (i == 1) {
            int i2 = C23274hvD.Fragment.config;
            CopyTradingPnLResponse copyTradingPnLResponseEZpvd = gEmmrt().EZpvd();
            name = copyTradingPnLResponseEZpvd != null ? copyTradingPnLResponseEZpvd.getName() : null;
            C55326xho.toast$default(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("name", name != null ? name : ""))), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            return;
        }
        if (i == 3) {
            int i3 = C23274hvD.Fragment.pause;
            CopyTradingPnLResponse copyTradingPnLResponseEZpvd2 = gEmmrt().EZpvd();
            name = copyTradingPnLResponseEZpvd2 != null ? copyTradingPnLResponseEZpvd2.getName() : null;
            C55326xho.toast$default(C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt("name", name != null ? name : ""))), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            return;
        }
        if (i == 6) {
            int i4 = C23274hvD.Fragment.getLocation;
            CopyTradingPnLResponse copyTradingPnLResponseEZpvd3 = gEmmrt().EZpvd();
            name = copyTradingPnLResponseEZpvd3 != null ? copyTradingPnLResponseEZpvd3.getName() : null;
            C55326xho.toast$default(C33069mpW.copydefault(i4, C56423yEv.EZpvd(C56390yDp.OLrzqt("name", name != null ? name : ""))), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            return;
        }
        Unit unit = Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(final AbstractC20007gXl.ActionBar actionBar) {
        if (actionBar.EZpvd()) {
            C22274hcK c22274hcK = C22274hcK.OLrzqt;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c22274hcK.KWHzl(fragmentActivityRequireActivity, new Function0() { // from class: o.gXP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return StrategyBasicInfoFragment.OLrzqt(this.copydefault, actionBar);
                }
            });
            return;
        }
        if (actionBar.AEQbTJ() != null) {
            C25352ivB.AEQbTJ(actionBar.AEQbTJ());
            return;
        }
        if (C33129mqd.OLrzqt((CharSequence) actionBar.copydefault())) {
            String strCopydefault = actionBar.copydefault();
            if (strCopydefault != null) {
                C55326xho.toastWithFailedIcon$default(strCopydefault, 0, 1, (Object) null);
                return;
            }
            return;
        }
        C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.RihMUf, 0, 1, (Object) null);
    }

    public static final Unit OLrzqt(StrategyBasicInfoFragment strategyBasicInfoFragment, AbstractC20007gXl.ActionBar actionBar) {
        strategyBasicInfoFragment.gEmmrt().KWHzl(actionBar.KWHzl());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(StrategyStatus strategyStatus) {
        Triple triple;
        C52794wYp c52794wYp;
        Drawable drawableKWHzl;
        switch (Activity.OLrzqt[strategyStatus.ordinal()]) {
            case 1:
            case 2:
                triple = new Triple(Integer.valueOf(C52761wXj.TaskDescription.DGgkXd), C33070mpX.AYXKKw(C23274hvD.Fragment.gsvlRV), 259);
                break;
            case 3:
                triple = new Triple(Integer.valueOf(C52761wXj.TaskDescription.iRgjgR), C33070mpX.AYXKKw(C23274hvD.Fragment.QslYrK), 260);
                break;
            case 4:
            case 5:
            case 6:
                triple = new Triple(null, C33070mpX.AYXKKw(C23274hvD.Fragment.pXZxY), 259);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Integer num = (Integer) triple.component1();
        String str = (String) triple.component2();
        int iIntValue = ((Number) triple.component3()).intValue();
        hBE hbe = (hBE) fARcdN();
        if (hbe == null || (c52794wYp = hbe.copydefault) == null) {
            return;
        }
        c52794wYp.setTag(strategyStatus);
        if (num == null || (drawableKWHzl = C33070mpX.KWHzl(num.intValue())) == null) {
            drawableKWHzl = null;
        } else {
            drawableKWHzl.setBounds(0, 0, C55298xhM.dpInt$default(16, (Context) null, 1, (Object) null), C55298xhM.dpInt$default(16, (Context) null, 1, (Object) null));
        }
        c52794wYp.setCompoundDrawablesRelative(drawableKWHzl, null, null, null);
        c52794wYp.setText(str);
        c52794wYp.setOKDSType(iIntValue);
        TextViewCompat.setCompoundDrawableTintList(c52794wYp, ColorStateList.valueOf(c52794wYp.getCurrentTextColor()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(CopyTradingPnLResponse copyTradingPnLResponse) {
        Pair pairOLrzqt;
        String str;
        C19976gWh c19976gWh;
        int i = Activity.OLrzqt[copyTradingPnLResponse.getStrategyStatus().ordinal()];
        if (i == 4 || i == 5 || i == 6) {
            pairOLrzqt = C56390yDp.OLrzqt(StringsKt__StringNumberConversionsKt.getFieldNames(copyTradingPnLResponse.getStoppedTime()), StrategyCellType.ExpiredAt);
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(StringsKt__StringNumberConversionsKt.getFieldNames(copyTradingPnLResponse.getExpireTime()), StrategyCellType.ExpiresAfter);
        }
        Long l = (Long) pairOLrzqt.component1();
        StrategyCellType strategyCellType = (StrategyCellType) pairOLrzqt.component2();
        if (l != null) {
            l.longValue();
            str = pTA.format$default(new Date(l.longValue()), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null);
            if (str == null) {
                str = "--";
            }
        }
        C19981gWm c19981gWm = new C19981gWm(null, new InterfaceC19982gWn.ActionBar(str, null, null, null, null, 30, null), strategyCellType, null, 9, null);
        hBE hbe = (hBE) fARcdN();
        if (hbe == null || (c19976gWh = hbe.AEQbTJ) == null) {
            return;
        }
        C19981gWm[] c19981gWmArr = new C19981gWm[6];
        c19981gWmArr[0] = new C19981gWm(null, new InterfaceC19982gWn.ActionBar(copyTradingPnLResponse.getChainName(), null, null, null, null, 30, null), StrategyCellType.Network, null, 9, null);
        String trackedWalletAddress = copyTradingPnLResponse.getTrackedWalletAddress();
        KolInfo kolInfo = copyTradingPnLResponse.getKolInfo();
        c19981gWmArr[1] = new C19981gWm(null, new InterfaceC19982gWn.TaskDescription(trackedWalletAddress, kolInfo != null ? kolInfo.getName() : null, null, new InterfaceC19970gWb.ActionBar(copyTradingPnLResponse.getTrackedWalletAddress()), 4, null), StrategyCellType.From, null, 9, null);
        c19981gWmArr[2] = new C19981gWm(null, new InterfaceC19982gWn.Activity(C23322hvz.toLocalizedNumber$default((Number) Integer.valueOf(copyTradingPnLResponse.getBuyCount()), false, (RoundingMode) null, false, false, 15, (Object) null), C23322hvz.toLocalizedNumber$default((Number) Integer.valueOf(copyTradingPnLResponse.getSellCount()), false, (RoundingMode) null, false, false, 15, (Object) null)), StrategyCellType.Txns, null, 9, null);
        c19981gWmArr[3] = new C19981gWm(null, new InterfaceC19982gWn.Application(copyTradingPnLResponse.getBuyUsdValue(), copyTradingPnLResponse.getSellUsdValue()), StrategyCellType.BoughtSold, null, 9, null);
        c19981gWmArr[4] = new C19981gWm(null, new InterfaceC19982gWn.ActionBar(pTA.format$default(new Date(C33129mqd.valueOf(copyTradingPnLResponse.getCreateTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null), null, null, null, null, 30, null), StrategyCellType.CreateTime, null, 9, null);
        c19981gWmArr[5] = c19981gWm;
        c19976gWh.setData(yDY.gEmmrt(c19981gWmArr), valueOf());
    }

    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        gEmmrt().DbNXlk();
    }
}

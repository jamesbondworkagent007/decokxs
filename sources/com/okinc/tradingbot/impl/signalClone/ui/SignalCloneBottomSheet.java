package com.okinc.tradingbot.impl.signalClone.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.okinc.biz.TradeType;
import com.okinc.tradingbot.impl.signalClone.ui.SignalCloneBottomSheet;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.CoinRatioParam;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExtendedBusinessInfo;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.subscribe.StrategyDcaEditResp;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import o.C33070mpX;
import o.C33129mqd;
import o.C38307pTy;
import o.C43246rlf;
import o.C48033uCm;
import o.C48158uHc;
import o.C52020vxx;
import o.C52022vxz;
import o.C52559wPx;
import o.C52692wUv;
import o.C52794wYp;
import o.C53735wrB;
import o.C53736wrC;
import o.C53739wrF;
import o.C53740wrG;
import o.C53742wrI;
import o.C53743wrJ;
import o.C53784wry;
import o.C53826wsn;
import o.C55296xhK;
import o.C55688xof;
import o.C55846xre;
import o.C55887xsS;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.C56524yIo;
import o.C58114yvF;
import o.InterfaceC51009vet;
import o.InterfaceC56387yDm;
import o.ViewOnClickListenerC54939xaY;
import o.pUU;
import o.uLU;
import o.uSN;
import o.wXQ;
import o.wXX;
import o.wYE;
import o.wYF;
import o.xMR;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class SignalCloneBottomSheet extends wXX {
    public final InterfaceC56387yDm AYXKKw;
    public C52794wYp EZpvd;
    public final List<String> KWHzl;
    public final InterfaceC56387yDm OLrzqt;

    @yCM
    public C53784wry botOrderRequestModelUseCase;
    public final InterfaceC56387yDm copydefault;

    @yCM
    public CoroutineDispatcher defaultDispatcher;
    public uSN djBIcL;

    @yCM
    public C48158uHc fetchBalanceUseCase;

    @yCM
    public C53736wrC fetchCloneAlgoInfoUseCase;

    @yCM
    public C52020vxx fetchMinimumInvestAmountUseCase;

    @yCM
    public CoroutineDispatcher ioDispatcher;

    @yCM
    public C53735wrB placeBotOrderUseCase;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar implements Flow<String> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.signalClone.ui.SignalCloneBottomSheet$ActionBar$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                SignalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$2$2$1 signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$2$2$1;
                C53743wrJ c53743wrJKWHzl;
                if (continuation instanceof SignalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$2$2$1) {
                    signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$2$2$1 = (SignalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$2$2$1) continuation;
                    int i = signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$2$2$1 = new SignalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$2$2$1(this, continuation);
                    }
                }
                Object obj2 = signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$2$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    C53739wrF c53739wrF = (C53739wrF) ((uLU) obj).OLrzqt();
                    String strEZpvd = (c53739wrF == null || (c53743wrJKWHzl = c53739wrF.KWHzl()) == null) ? null : c53743wrJKWHzl.EZpvd();
                    signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(strEZpvd, signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$2$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public ActionBar(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator implements Flow<Pair<? extends String, ? extends String>> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.signalClone.ui.SignalCloneBottomSheet$StateListAnimator$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                SignalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$1$2$1 signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$1$2$1;
                C53743wrJ c53743wrJKWHzl;
                C53743wrJ c53743wrJKWHzl2;
                if (continuation instanceof SignalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$1$2$1) {
                    signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$1$2$1 = (SignalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$1$2$1) continuation;
                    int i = signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$1$2$1 = new SignalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    uLU ulu = (uLU) obj;
                    C53739wrF c53739wrF = (C53739wrF) ulu.OLrzqt();
                    String strKWHzl = null;
                    String strOLrzqt = (c53739wrF == null || (c53743wrJKWHzl2 = c53739wrF.KWHzl()) == null) ? null : c53743wrJKWHzl2.OLrzqt();
                    C53739wrF c53739wrF2 = (C53739wrF) ulu.OLrzqt();
                    if (c53739wrF2 != null && (c53743wrJKWHzl = c53739wrF2.KWHzl()) != null) {
                        strKWHzl = c53743wrJKWHzl.KWHzl();
                    }
                    Pair pairOLrzqt = C56390yDp.OLrzqt(strOLrzqt, strKWHzl);
                    signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(pairOLrzqt, signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public StateListAnimator(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Pair<? extends String, ? extends String>> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription implements Flow<uLU<? extends StrategyDetailsResponse>> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.signalClone.ui.SignalCloneBottomSheet$TaskDescription$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                SignalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$3$2$1 signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$3$2$1;
                StrategyDetailsResponse strategyDetailsResponse;
                uLU<T> uluAEQbTJ;
                if (continuation instanceof SignalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$3$2$1) {
                    signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$3$2$1 = (SignalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$3$2$1) continuation;
                    int i = signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$3$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$3$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$3$2$1 = new SignalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$3$2$1(this, continuation);
                    }
                }
                Object obj2 = signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$3$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$3$2$1.label;
                int i3 = 1;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    uLU ulu = (uLU) obj;
                    if (ulu instanceof uLU.Activity) {
                        uluAEQbTJ = uLU.Companion.KWHzl(((uLU.Activity) ulu).EZpvd());
                    } else if (ulu instanceof uLU.TaskDescription) {
                        uluAEQbTJ = uLU.Companion.EZpvd(((uLU.TaskDescription) ulu).AEQbTJ());
                    } else {
                        if (!(ulu instanceof uLU.ActionBar)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        uLU.StateListAnimator stateListAnimator = uLU.Companion;
                        Object objKWHzl = ((uLU.ActionBar) ulu).KWHzl();
                        if (objKWHzl == null || (strategyDetailsResponse = ((C53739wrF) objKWHzl).OLrzqt()) == null) {
                            strategyDetailsResponse = new StrategyDetailsResponse((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (ArrayList) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TrailingConfig) null, (TrailingConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (ExtendedBusinessInfo) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (List) null, (TacticsVoucherInfo) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (Long) null, (ArrayList) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnParam) null, (ArbitrageTotalPnlInfo) null, (Float) null, (String) null, false, (List) null, (String) null, (String) null, (GridProfitAutoReinvestResponse) null, (List) null, (StrategyProfitResponse) null, (String) null, (String) null, (String) null, (ProfitDetailResponse) null, (ProfitDetailResponse) null, (BalanceDetailInfoDto) null, (String) null, (BotVo) null, (StrategyDcaEditResp) null, (String) null, (String) null, (String) null, -1, -1, -1, -1, -1, -1, -1, 131071, (DefaultConstructorMarker) null);
                        }
                        uluAEQbTJ = stateListAnimator.AEQbTJ(strategyDetailsResponse);
                        i3 = 1;
                    }
                    signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$3$2$1.label = i3;
                    if (flowCollector.emit(uluAEQbTJ, signalCloneBottomSheet$onCreateContent$lambda$12$$inlined$map$3$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super uLU<? extends StrategyDetailsResponse>> flowCollector, Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public SignalCloneBottomSheet() {
        Function0 function0 = new Function0() { // from class: o.wsc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SignalCloneBottomSheet.isConnected(this.AEQbTJ);
            }
        };
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.okinc.tradingbot.impl.signalClone.ui.SignalCloneBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.signalClone.ui.SignalCloneBottomSheet$special$$inlined$viewModels$default$2
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
        final Function0 function03 = null;
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C53826wsn.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.signalClone.ui.SignalCloneBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.signalClone.ui.SignalCloneBottomSheet$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.wrZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SignalCloneBottomSheet.gEmmrt(this.copydefault);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.wsa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SignalCloneBottomSheet.AYXKKw(this.KWHzl);
            }
        });
        this.KWHzl = yDY.gEmmrt("grid", "spot_dca", "smart_portfolio", "recurring", "dcd_bot");
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.signalClone.ui.SignalCloneBottomSheet.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final SignalCloneBottomSheet copydefault(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            SignalCloneBottomSheet signalCloneBottomSheet = new SignalCloneBottomSheet();
            signalCloneBottomSheet.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("bot_algo_id", str), C56390yDp.OLrzqt("bot_ord_type", str2)));
            return signalCloneBottomSheet;
        }
    }

    public final CoroutineDispatcher AhwBna() {
        CoroutineDispatcher coroutineDispatcher = this.ioDispatcher;
        if (coroutineDispatcher != null) {
            return coroutineDispatcher;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final CoroutineDispatcher OLrzqt() {
        CoroutineDispatcher coroutineDispatcher = this.defaultDispatcher;
        if (coroutineDispatcher != null) {
            return coroutineDispatcher;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C48158uHc KWHzl() {
        C48158uHc c48158uHc = this.fetchBalanceUseCase;
        if (c48158uHc != null) {
            return c48158uHc;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C52020vxx valueOf() {
        C52020vxx c52020vxx = this.fetchMinimumInvestAmountUseCase;
        if (c52020vxx != null) {
            return c52020vxx;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C53735wrB gEmmrt() {
        C53735wrB c53735wrB = this.placeBotOrderUseCase;
        if (c53735wrB != null) {
            return c53735wrB;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C53736wrC EZpvd() {
        C53736wrC c53736wrC = this.fetchCloneAlgoInfoUseCase;
        if (c53736wrC != null) {
            return c53736wrC;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C53784wry AEQbTJ() {
        C53784wry c53784wry = this.botOrderRequestModelUseCase;
        if (c53784wry != null) {
            return c53784wry;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C53826wsn AYXKKw() {
        return (C53826wsn) this.AYXKKw.getValue();
    }

    public static final C53826wsn EZpvd(SignalCloneBottomSheet signalCloneBottomSheet, CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new C53826wsn(signalCloneBottomSheet.KWHzl(), signalCloneBottomSheet.valueOf(), signalCloneBottomSheet.EZpvd(), signalCloneBottomSheet.gEmmrt(), signalCloneBottomSheet.AhwBna(), signalCloneBottomSheet.OLrzqt());
    }

    private final String djBIcL() {
        return (String) this.OLrzqt.getValue();
    }

    public static final String gEmmrt(SignalCloneBottomSheet signalCloneBottomSheet) {
        Bundle arguments = signalCloneBottomSheet.getArguments();
        String string = arguments != null ? arguments.getString("bot_algo_id") : null;
        return string == null ? "" : string;
    }

    public final String copydefault() {
        return (String) this.copydefault.getValue();
    }

    public static final String AYXKKw(SignalCloneBottomSheet signalCloneBottomSheet) {
        Bundle arguments = signalCloneBottomSheet.getArguments();
        String string = arguments != null ? arguments.getString("bot_ord_type") : null;
        return string == null ? "" : string;
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ SignalCloneBottomSheet AEQbTJ;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(View view, long j, SignalCloneBottomSheet signalCloneBottomSheet) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = signalCloneBottomSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            StrategyDetailsResponse strategyDetailsResponseOLrzqt;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C53739wrF c53739wrFOLrzqt = this.AEQbTJ.AYXKKw().copydefault().getValue().OLrzqt();
                if (c53739wrFOLrzqt == null || (strategyDetailsResponseOLrzqt = c53739wrFOLrzqt.OLrzqt()) == null) {
                    return;
                }
                LifecycleOwner viewLifecycleOwner = this.AEQbTJ.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SignalCloneBottomSheet$onCreateContent$1$2$1(this.AEQbTJ, strategyDetailsResponseOLrzqt, null), 3, null);
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ SignalCloneBottomSheet KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(View view, long j, SignalCloneBottomSheet signalCloneBottomSheet) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = signalCloneBottomSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            StrategyDetailsResponse strategyDetailsResponseOLrzqt;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                pUU.KWHzl("SignalCloneBottomSheet", "On copy now clicked");
                this.KWHzl.getChildFragmentManager().clearFragmentResultListener("bot_order");
                C53739wrF c53739wrFOLrzqt = this.KWHzl.AYXKKw().copydefault().getValue().OLrzqt();
                if (c53739wrFOLrzqt == null || (strategyDetailsResponseOLrzqt = c53739wrFOLrzqt.OLrzqt()) == null) {
                    return;
                }
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.KWHzl), null, null, new SignalCloneBottomSheet$onFooterCreated$1$1(this.KWHzl, strategyDetailsResponseOLrzqt, null), 3, null);
            }
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return AYXKKw().copydefault().getValue() instanceof uLU.ActionBar;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ((InterfaceC51009vet) C58114yvF.OLrzqt(C43246rlf.OLrzqt.valueOf(), InterfaceC51009vet.class)).KWHzl(this);
        super.onAttach(context);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(getString(C48033uCm.Fragment.aWJMta));
        this.EZpvd = wyf.copydefault();
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(false);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new LoaderManager(c52794wYpCopydefault2, 1000L, this));
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AYXKKw().copydefault(new C53826wsn.StateListAnimator.C0993StateListAnimator(new C53736wrC.StateListAnimator(djBIcL())));
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        C53739wrF c53739wrFOLrzqt;
        super.onResume();
        if (AYXKKw().EZpvd().getValue().OLrzqt() == null || (c53739wrFOLrzqt = AYXKKw().copydefault().getValue().OLrzqt()) == null) {
            return;
        }
        pUU.KWHzl("SignalCloneBottomSheet", "Refreshing available balance");
        EZpvd(c53739wrFOLrzqt.OLrzqt());
    }

    public final void EZpvd(final StrategyDetailsResponse strategyDetailsResponse) {
        final C52020vxx.Activity activityCopydefault = C52022vxz.KWHzl.copydefault(strategyDetailsResponse);
        if (activityCopydefault == null) {
            return;
        }
        if (this.KWHzl.contains(strategyDetailsResponse.getOrderType())) {
        } else {
            AYXKKw().copydefault(new C53826wsn.StateListAnimator.TaskDescription(activityCopydefault, new C48158uHc.StateListAnimator(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), "cross", null, null, null, null, null, "net_mode", null, null, null, null, null, null, null, null, null, null, null, null, null, 4193904, null)));
        }
    }

    public static final Unit copydefault(StrategyDetailsResponse strategyDetailsResponse, SignalCloneBottomSheet signalCloneBottomSheet, C52020vxx.Activity activity, C55887xsS c55887xsS) {
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        String str = "cash";
        signalCloneBottomSheet.AYXKKw().copydefault(new C53826wsn.StateListAnimator.TaskDescription(activity, new C48158uHc.StateListAnimator(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), str, strategyDetailsResponse.getSourceCcy(), null, null, null, "buy", null, null, null, null, null, null, null, null, null, null, null, c55887xsS.OLrzqt(strategyDetailsResponse.getOrderType()), null, null, 3669872, null)));
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        uSN usnCopydefault = uSN.copydefault(LayoutInflater.from(constraintLayout.getContext()), constraintLayout, true);
        usnCopydefault.gEmmrt.setFm(getChildFragmentManager());
        usnCopydefault.OLrzqt.setContent(ComposableLambdaKt.composableLambdaInstance(151706315, true, new Application()));
        wYE wye = usnCopydefault.KWHzl;
        wye.setOnClickListener(new Dialog(wye, 1000L, this));
        Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new StateListAnimator(AYXKKw().copydefault()));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C52692wUv.flowAndCollectLatest$default(flowDistinctUntilChanged, viewLifecycleOwner, null, new SignalCloneBottomSheet$onCreateContent$1$4(this, null), 2, null);
        Flow flowDistinctUntilChanged2 = FlowKt.distinctUntilChanged(new ActionBar(AYXKKw().copydefault()));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C52692wUv.flowAndCollectLatest$default(flowDistinctUntilChanged2, viewLifecycleOwner2, null, new SignalCloneBottomSheet$onCreateContent$1$6(usnCopydefault, null), 2, null);
        Flow flowDistinctUntilChanged3 = FlowKt.distinctUntilChanged(new TaskDescription(AYXKKw().copydefault()));
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        C52692wUv.flowAndCollectLatest$default(flowDistinctUntilChanged3, viewLifecycleOwner3, null, new SignalCloneBottomSheet$onCreateContent$1$8(usnCopydefault, this, null), 2, null);
        StateFlow<uLU<C53740wrG>> stateFlowEZpvd = AYXKKw().EZpvd();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        C52692wUv.flowAndCollectLatest$default(stateFlowEZpvd, viewLifecycleOwner4, null, new SignalCloneBottomSheet$onCreateContent$1$9(this, null), 2, null);
        SharedFlow<C53826wsn.TaskDescription> sharedFlowFJNWhG = AYXKKw().fJNWhG();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        C52692wUv.flowAndCollectLatest$default(sharedFlowFJNWhG, viewLifecycleOwner5, null, new SignalCloneBottomSheet$onCreateContent$1$10(usnCopydefault, this, null), 2, null);
        this.djBIcL = usnCopydefault;
    }

    public static final class Application implements Function2<Composer, Integer, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, Integer num) {
            AEQbTJ(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(151706315, i, -1, "com.okinc.tradingbot.impl.signalClone.ui.SignalCloneBottomSheet.onCreateContent.<anonymous>.<anonymous> (SignalCloneBottomSheet.kt:387)");
                }
                StrategyDetailsResponse strategyDetailsResponse = null;
                byte b = 0;
                byte b2 = 0;
                State stateCollectAsState = SnapshotStateKt.collectAsState(SignalCloneBottomSheet.this.AYXKKw().copydefault(), uLU.StateListAnimator.loading$default(uLU.Companion, false, 1, null), null, composer, 0, 2);
                if (KWHzl(stateCollectAsState) instanceof uLU.ActionBar) {
                    composer.startReplaceableGroup(1760143782);
                    C53739wrF c53739wrFKWHzl = KWHzl(stateCollectAsState).KWHzl();
                    if (c53739wrFKWHzl == null) {
                        c53739wrFKWHzl = new C53739wrF(strategyDetailsResponse, b2 == true ? 1 : 0, 3, b == true ? 1 : 0);
                    }
                    C53739wrF c53739wrF = c53739wrFKWHzl;
                    composer.startReplaceableGroup(472425928);
                    boolean zChangedInstance = composer.changedInstance(SignalCloneBottomSheet.this);
                    final SignalCloneBottomSheet signalCloneBottomSheet = SignalCloneBottomSheet.this;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: o.wsi
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return SignalCloneBottomSheet.Application.copydefault(signalCloneBottomSheet, (java.lang.String) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function1 = (Function1) objRememberedValue;
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(472434637);
                    boolean zChangedInstance2 = composer.changedInstance(SignalCloneBottomSheet.this);
                    final SignalCloneBottomSheet signalCloneBottomSheet2 = SignalCloneBottomSheet.this;
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: o.wsf
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return SignalCloneBottomSheet.Application.KWHzl(signalCloneBottomSheet2, ((java.lang.Float) obj).floatValue());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    C53742wrI.AEQbTJ(null, c53739wrF, function1, (Function1) objRememberedValue2, composer, 0, 1);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(472444175);
                    SpacerKt.Spacer(SizeKt.m704height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m5414constructorimpl(60)), composer, 6);
                    composer.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final Unit copydefault(SignalCloneBottomSheet signalCloneBottomSheet, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            signalCloneBottomSheet.AYXKKw().copydefault(new C53826wsn.StateListAnimator.ActionBar(str));
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(SignalCloneBottomSheet signalCloneBottomSheet, float f) {
            signalCloneBottomSheet.AYXKKw().copydefault(new C53826wsn.StateListAnimator.PendingIntent(f));
            return Unit.INSTANCE;
        }

        private static final uLU<C53739wrF> KWHzl(State<? extends uLU<C53739wrF>> state) {
            return state.getValue();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.djBIcL = null;
        super.onDestroyView();
    }

    public final void copydefault(C53740wrG c53740wrG, StrategyDetailsResponse strategyDetailsResponse) {
        uSN usn;
        String strEZpvd = AYXKKw().EZpvd(strategyDetailsResponse.getOrderType(), strategyDetailsResponse.getSourceCcy());
        if (strEZpvd == null || strEZpvd.length() == 0 || (usn = this.djBIcL) == null) {
            return;
        }
        usn.AEQbTJ.setFooterAvaValue(AYXKKw().KWHzl(c53740wrG.copydefault(), strategyDetailsResponse, true));
    }

    public static /* synthetic */ Object buildOrderRequest$default(SignalCloneBottomSheet signalCloneBottomSheet, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return signalCloneBottomSheet.KWHzl(z, (Continuation<? super C53784wry.ActionBar>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(boolean z, Continuation<? super C53784wry.ActionBar> continuation) throws Throwable {
        SignalCloneBottomSheet$buildOrderRequest$1 signalCloneBottomSheet$buildOrderRequest$1;
        final StrategyDetailsResponse strategyDetailsResponseOLrzqt;
        C53743wrJ c53743wrJKWHzl;
        if (continuation instanceof SignalCloneBottomSheet$buildOrderRequest$1) {
            signalCloneBottomSheet$buildOrderRequest$1 = (SignalCloneBottomSheet$buildOrderRequest$1) continuation;
            int i = signalCloneBottomSheet$buildOrderRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                signalCloneBottomSheet$buildOrderRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                signalCloneBottomSheet$buildOrderRequest$1 = new SignalCloneBottomSheet$buildOrderRequest$1(this, continuation);
            }
        }
        Object objKWHzl = signalCloneBottomSheet$buildOrderRequest$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = signalCloneBottomSheet$buildOrderRequest$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C53739wrF c53739wrFOLrzqt = AYXKKw().copydefault().getValue().OLrzqt();
            String strKWHzl = null;
            if (c53739wrFOLrzqt == null || (strategyDetailsResponseOLrzqt = c53739wrFOLrzqt.OLrzqt()) == null) {
                return null;
            }
            StrategyBaseReq strategyBaseReq = new StrategyBaseReq(strategyDetailsResponseOLrzqt.getInstId(), (String) null, strategyDetailsResponseOLrzqt.getTdMode(), (String) null, (String) null, (String) null, (Boolean) null, strategyDetailsResponseOLrzqt.getOrdType(), (TradeType) null, (String) null, (Boolean) null, 1914, (DefaultConstructorMarker) null);
            C53784wry c53784wryAEQbTJ = AEQbTJ();
            C53739wrF c53739wrFOLrzqt2 = AYXKKw().copydefault().getValue().OLrzqt();
            if (c53739wrFOLrzqt2 != null && (c53743wrJKWHzl = c53739wrFOLrzqt2.KWHzl()) != null) {
                strKWHzl = c53743wrJKWHzl.KWHzl();
            }
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            C53784wry.Application application = new C53784wry.Application(strategyDetailsResponseOLrzqt, strategyBaseReq, strKWHzl, (String) AYXKKw().EZpvd(new Function1() { // from class: o.wrX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SignalCloneBottomSheet.OLrzqt(strategyDetailsResponseOLrzqt, (C55887xsS) obj);
                }
            }), z);
            signalCloneBottomSheet$buildOrderRequest$1.label = 1;
            objKWHzl = c53784wryAEQbTJ.KWHzl(application, signalCloneBottomSheet$buildOrderRequest$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        return (C53784wry.ActionBar) objKWHzl;
    }

    public static final String OLrzqt(StrategyDetailsResponse strategyDetailsResponse, C55887xsS c55887xsS) {
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        return c55887xsS.AEQbTJ(strategyDetailsResponse.getOrderType());
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void OLrzqt(List<CoinRatioParam> list) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.PlaybackStateCompatErrorCode);
        ArrayList arrayList = new ArrayList();
        for (CoinRatioParam coinRatioParam : list) {
            String ccy = coinRatioParam.getCcy();
            xMR xmr = xMR.copydefault;
            arrayList.add(new C55846xre(ccy, xMR.formatICUPercent$default(xmr, xmr.OLrzqt((Object) coinRatioParam.getRatio()), null, C38307pTy.Companion.copydefault(0), null, Double.valueOf(100.0d), null, 42, null)));
        }
        C52559wPx.KWHzl(viewOnClickListenerC54939xaY, arrayList);
        viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), new View.OnClickListener() { // from class: o.wsb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                SignalCloneBottomSheet.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void EZpvd(List<CoinRatioParam> list) {
        String str;
        String maxPrice;
        ArrayList arrayList = new ArrayList();
        for (CoinRatioParam coinRatioParam : list) {
            str = "";
            if (C33129mqd.OLrzqt((CharSequence) coinRatioParam.getMinPrice()) && C33129mqd.OLrzqt((CharSequence) coinRatioParam.getMaxPrice())) {
                xMR xmr = xMR.copydefault;
                String minPrice = coinRatioParam.getMinPrice();
                if (minPrice == null) {
                    minPrice = "";
                }
                String strCopydefault = xmr.copydefault(minPrice);
                String maxPrice2 = coinRatioParam.getMaxPrice();
                str = strCopydefault + " - " + xmr.copydefault(maxPrice2 != null ? maxPrice2 : "");
            } else if (C33129mqd.OLrzqt((CharSequence) coinRatioParam.getMinPrice()) && ((maxPrice = coinRatioParam.getMaxPrice()) == null || StringsKt__StringsKt.fARcdN((CharSequence) maxPrice))) {
                xMR xmr2 = xMR.copydefault;
                String minPrice2 = coinRatioParam.getMinPrice();
                str = "> " + xmr2.copydefault(minPrice2 != null ? minPrice2 : "");
            } else if (C33129mqd.OLrzqt((CharSequence) coinRatioParam.getMaxPrice())) {
                xMR xmr3 = xMR.copydefault;
                String maxPrice3 = coinRatioParam.getMaxPrice();
                str = "< " + xmr3.copydefault(maxPrice3 != null ? maxPrice3 : "");
            }
            C55846xre c55846xre = C33129mqd.OLrzqt((CharSequence) str) ? new C55846xre(coinRatioParam.getCcy(), str) : null;
            if (c55846xre != null) {
                arrayList.add(c55846xre);
            }
        }
        Context context = getContext();
        if (context == null) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.UlpNxW));
        C52559wPx.KWHzl(viewOnClickListenerC54939xaY, new ArrayList(arrayList));
        viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), new View.OnClickListener() { // from class: o.wsd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                SignalCloneBottomSheet.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final ViewModelProvider.Factory isConnected(final SignalCloneBottomSheet signalCloneBottomSheet) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C53826wsn.class), new Function1() { // from class: o.wrW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SignalCloneBottomSheet.EZpvd(this.AEQbTJ, (CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}

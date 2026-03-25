package com.okinc.tradingbot.impl.signalClone.ui;

import android.content.Context;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.lifecycle.WithLifecycleStateKt;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.ActivityC52122vzt;
import o.C53784wry;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class SignalCloneBottomSheet$onCreateContent$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StrategyDetailsResponse $algoInfo;
    int label;
    final /* synthetic */ SignalCloneBottomSheet this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCloneBottomSheet$onCreateContent$1$2$1(SignalCloneBottomSheet signalCloneBottomSheet, StrategyDetailsResponse strategyDetailsResponse, Continuation<? super SignalCloneBottomSheet$onCreateContent$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = signalCloneBottomSheet;
        this.$algoInfo = strategyDetailsResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignalCloneBottomSheet$onCreateContent$1$2$1(this.this$0, this.$algoInfo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignalCloneBottomSheet$onCreateContent$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SignalCloneBottomSheet signalCloneBottomSheet = this.this$0;
            this.label = 1;
            objKWHzl = signalCloneBottomSheet.KWHzl(true, (Continuation<? super C53784wry.ActionBar>) this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
        }
        C53784wry.ActionBar actionBar = (C53784wry.ActionBar) objKWHzl;
        final Parcelable parcelableEZpvd = actionBar != null ? actionBar.EZpvd() : null;
        final SignalCloneBottomSheet signalCloneBottomSheet2 = this.this$0;
        final StrategyDetailsResponse strategyDetailsResponse = this.$algoInfo;
        Lifecycle lifecycle = signalCloneBottomSheet2.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
        boolean zIsDispatchNeeded = immediate.isDispatchNeeded(getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                BotTradeData botTradeData = new BotTradeData(strategyDetailsResponse.getOrderType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), parcelableEZpvd, false, (String) null, strategyDetailsResponse.getInstFamily(), false, (List) null, 432, (DefaultConstructorMarker) null);
                ActivityC52122vzt.Application application = ActivityC52122vzt.Companion;
                Context contextRequireContext = signalCloneBottomSheet2.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                application.OLrzqt(contextRequireContext, botTradeData, (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : null, (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
                signalCloneBottomSheet2.dismissAllowingStateLoss();
                Unit unit = Unit.INSTANCE;
            }
        } else {
            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.okinc.tradingbot.impl.signalClone.ui.SignalCloneBottomSheet$onCreateContent$1$2$1$invokeSuspend$$inlined$withResumed$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Unit invoke() {
                    BotTradeData botTradeData2 = new BotTradeData(strategyDetailsResponse.getOrderType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), parcelableEZpvd, false, (String) null, strategyDetailsResponse.getInstFamily(), false, (List) null, 432, (DefaultConstructorMarker) null);
                    ActivityC52122vzt.Application application2 = ActivityC52122vzt.Companion;
                    Context contextRequireContext2 = signalCloneBottomSheet2.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                    application2.OLrzqt(contextRequireContext2, botTradeData2, (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : null, (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
                    signalCloneBottomSheet2.dismissAllowingStateLoss();
                    return Unit.INSTANCE;
                }
            };
            this.label = 2;
            if (WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, immediate, function0, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}

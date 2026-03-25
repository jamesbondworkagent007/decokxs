package com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet;

import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import me.relex.circleindicator.BuildConfig;
import o.C52680wUj;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbDetailsSheetViewModel$observeWebSocket$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SmartArbDetailsSheetViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbDetailsSheetViewModel$observeWebSocket$2$1(SmartArbDetailsSheetViewModel smartArbDetailsSheetViewModel, Continuation<? super SmartArbDetailsSheetViewModel$observeWebSocket$2$1> continuation) {
        super(2, continuation);
        this.this$0 = smartArbDetailsSheetViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmartArbDetailsSheetViewModel$observeWebSocket$2$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmartArbDetailsSheetViewModel$observeWebSocket$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class StateListAnimator implements Function1<List<? extends StrategyDetailsResponse>, StrategyDetailsResponse> {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX WARN: Type inference failed for: r2v1, types: [com.okinc.unify_trade.biz.StrategyDetailsResponse, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final StrategyDetailsResponse invoke(List<? extends StrategyDetailsResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return CollectionsKt___CollectionsKt.AuCTelauCTel(list);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C52680wUj c52680wUj = this.this$0.djBIcL;
            TacticsData tacticsDataAYXKKw = this.this$0.AYXKKw();
            String algoId = tacticsDataAYXKKw != null ? tacticsDataAYXKKw.getAlgoId() : null;
            if (algoId == null) {
                algoId = "";
            }
            SharedFlow sharedFlowInternalCreateWebSocket$default = C52680wUj.internalCreateWebSocket$default(c52680wUj, BuiltinSerializersKt.ListSerializer(StrategyDetailsResponse.Companion.serializer()), new WsArgV5("algo-smart-arbitrage", null, null, null, null, algoId, null, null, BuildConfig.VERSION_CODE, null), null, StateListAnimator.AEQbTJ, 4, null);
            final SmartArbDetailsSheetViewModel smartArbDetailsSheetViewModel = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet.SmartArbDetailsSheetViewModel$observeWebSocket$2$1.5
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final Object emit(StrategyDetailsResponse strategyDetailsResponse, Continuation<? super Unit> continuation) {
                    Object objEmit = smartArbDetailsSheetViewModel.KWHzl.emit(strategyDetailsResponse, continuation);
                    return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (sharedFlowInternalCreateWebSocket$default.collect(flowCollector, this) == objCopydefault) {
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

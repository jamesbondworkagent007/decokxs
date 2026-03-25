package com.okinc.tradingbot.impl.strategy.fragment.detail;

import com.okinc.unify_trade.biz.StrategyPositionResponse;
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
import o.vNB;

/* JADX INFO: loaded from: classes19.dex */
public final class DcaOngoingViewModel$startWs$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $algoId;
    int label;
    final /* synthetic */ DcaOngoingViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DcaOngoingViewModel$startWs$1$1$1(DcaOngoingViewModel dcaOngoingViewModel, String str, Continuation<? super DcaOngoingViewModel$startWs$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = dcaOngoingViewModel;
        this.$algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DcaOngoingViewModel$startWs$1$1$1(this.this$0, this.$algoId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DcaOngoingViewModel$startWs$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class Activity implements Function1<List<? extends StrategyPositionResponse>, StrategyPositionResponse> {
        public static final Activity OLrzqt = new Activity();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX WARN: Type inference failed for: r2v1, types: [com.okinc.unify_trade.biz.StrategyPositionResponse, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final StrategyPositionResponse invoke(List<? extends StrategyPositionResponse> list) {
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
            SharedFlow sharedFlowInternalCreateWebSocket$default = C52680wUj.internalCreateWebSocket$default(this.this$0.fARcdN, BuiltinSerializersKt.ListSerializer(StrategyPositionResponse.Companion.serializer()), new WsArgV5("dca-positions", null, null, "ANY", null, this.$algoId, null, null, BuildConfig.VERSION_CODE, null), null, Activity.OLrzqt, 4, null);
            final DcaOngoingViewModel dcaOngoingViewModel = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.DcaOngoingViewModel$startWs$1$1$1.3
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public final Object emit(StrategyPositionResponse strategyPositionResponse, Continuation<? super Unit> continuation) {
                    Object objEmit = dcaOngoingViewModel.EZpvd.emit(new vNB.TaskDescription(strategyPositionResponse), continuation);
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

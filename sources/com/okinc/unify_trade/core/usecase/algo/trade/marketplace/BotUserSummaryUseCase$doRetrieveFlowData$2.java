package com.okinc.unify_trade.core.usecase.algo.trade.marketplace;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BotUserSummaryData;
import com.okinc.unify_trade.biz.BotUserSummaryReq;
import com.okinc.unify_trade.core.usecase.algo.trade.marketplace.BotUserSummaryUseCase$doRetrieveFlowData$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.xAF;
import o.xAL;
import o.yDY;

/* JADX INFO: loaded from: classes12.dex */
public final class BotUserSummaryUseCase$doRetrieveFlowData$2 extends SuspendLambda implements Function2<ProducerScope<? super ResponseData<BotUserSummaryData>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ xAL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotUserSummaryUseCase$doRetrieveFlowData$2(xAL xal, Continuation<? super BotUserSummaryUseCase$doRetrieveFlowData$2> continuation) {
        super(2, continuation);
        this.this$0 = xal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotUserSummaryUseCase$doRetrieveFlowData$2 botUserSummaryUseCase$doRetrieveFlowData$2 = new BotUserSummaryUseCase$doRetrieveFlowData$2(this.this$0, continuation);
        botUserSummaryUseCase$doRetrieveFlowData$2.L$0 = obj;
        return botUserSummaryUseCase$doRetrieveFlowData$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super ResponseData<BotUserSummaryData>> producerScope, Continuation<? super Unit> continuation) {
        return ((BotUserSummaryUseCase$doRetrieveFlowData$2) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final ProducerScope producerScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            producerScope = (ProducerScope) this.L$0;
            xAL xal = this.this$0;
            Object[] objArr = new Object[1];
            BotUserSummaryReq botUserSummaryReq = xal.AEQbTJ;
            if (botUserSummaryReq == null) {
                Intrinsics.gEmmrt("");
                botUserSummaryReq = null;
            }
            objArr[0] = new xAF(botUserSummaryReq, C33129mqd.gEmmrt(C56443yFo.KWHzl(System.currentTimeMillis())), this.this$0.KWHzl) { // from class: com.okinc.unify_trade.core.usecase.algo.trade.marketplace.BotUserSummaryUseCase$doRetrieveFlowData$2.5
                @Override // o.xAF
                public void KWHzl(BotUserSummaryData botUserSummaryData) {
                    Intrinsics.checkNotNullParameter(botUserSummaryData, "");
                    producerScope.mo5769trySendJP2dKIU(new ResponseData<>(0, null, null, null, botUserSummaryData, null, 46, null));
                }

                @Override // o.xAF
                public void copydefault(String str) {
                    Intrinsics.checkNotNullParameter(str, "");
                    producerScope.mo5769trySendJP2dKIU(new ResponseData<>(-1, str, null, null, null, null, 60, null));
                }
            };
            xal.OLrzqt(yDY.copydefault(objArr));
            xAL xal2 = this.this$0;
            this.L$0 = producerScope;
            this.label = 1;
            if (xal2.copydefault(this) == objCopydefault) {
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
            producerScope = (ProducerScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        final xAL xal3 = this.this$0;
        Function0 function0 = new Function0() { // from class: o.xAK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BotUserSummaryUseCase$doRetrieveFlowData$2.invokeSuspend$lambda$0(xal3);
            }
        };
        this.L$0 = null;
        this.label = 2;
        if (ProduceKt.awaitClose(producerScope, function0, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(xAL xal) {
        xal.AYXKKw();
        return Unit.INSTANCE;
    }
}

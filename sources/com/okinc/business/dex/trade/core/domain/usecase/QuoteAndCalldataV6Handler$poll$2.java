package com.okinc.business.dex.trade.core.domain.usecase;

import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.gYO;
import o.gYP;
import o.gYS;
import o.gYW;

/* JADX INFO: loaded from: classes5.dex */
public final class QuoteAndCalldataV6Handler$poll$2 extends SuspendLambda implements Function2<FlowCollector<? super gYP>, Continuation<? super Unit>, Object> {
    final /* synthetic */ gYS $params;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ gYW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuoteAndCalldataV6Handler$poll$2(gYW gyw, gYS gys, Continuation<? super QuoteAndCalldataV6Handler$poll$2> continuation) {
        super(2, continuation);
        this.this$0 = gyw;
        this.$params = gys;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        QuoteAndCalldataV6Handler$poll$2 quoteAndCalldataV6Handler$poll$2 = new QuoteAndCalldataV6Handler$poll$2(this.this$0, this.$params, continuation);
        quoteAndCalldataV6Handler$poll$2.L$0 = obj;
        return quoteAndCalldataV6Handler$poll$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super gYP> flowCollector, Continuation<? super Unit> continuation) {
        return ((QuoteAndCalldataV6Handler$poll$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            gYO gyo = this.this$0.copydefault;
            Map<String, String> mapCopydefault = ((gYS.Application) this.$params).copydefault();
            V6QuoteAndCalldataRequest v6QuoteAndCalldataRequestOLrzqt = ((gYS.Application) this.$params).OLrzqt();
            this.L$0 = flowCollector;
            this.label = 1;
            obj = gyo.AEQbTJ(mapCopydefault, v6QuoteAndCalldataRequestOLrzqt, this);
            if (obj == objCopydefault) {
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
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        gYP.Application application = new gYP.Application((AbstractC43419rot) obj);
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(application, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}

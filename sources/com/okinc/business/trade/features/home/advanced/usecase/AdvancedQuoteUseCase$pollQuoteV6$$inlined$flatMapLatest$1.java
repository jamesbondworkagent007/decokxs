package com.okinc.business.trade.features.home.advanced.usecase;

import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteParams;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C28141kQk;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.gYS;
import o.gYX;
import o.kRE;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedQuoteUseCase$pollQuoteV6$$inlined$flatMapLatest$1 extends SuspendLambda implements yHO<FlowCollector<? super Result<? extends AdvancedQuoteAndCallData.V6>>, AdvancedQuoteParams, Continuation<? super Unit>, Object> {
    final /* synthetic */ C28141kQk $params$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ kRE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedQuoteUseCase$pollQuoteV6$$inlined$flatMapLatest$1(Continuation continuation, C28141kQk c28141kQk, kRE kre) {
        super(3, continuation);
        this.$params$inlined = c28141kQk;
        this.this$0 = kre;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super Result<? extends AdvancedQuoteAndCallData.V6>> flowCollector, AdvancedQuoteParams advancedQuoteParams, Continuation<? super Unit> continuation) {
        AdvancedQuoteUseCase$pollQuoteV6$$inlined$flatMapLatest$1 advancedQuoteUseCase$pollQuoteV6$$inlined$flatMapLatest$1 = new AdvancedQuoteUseCase$pollQuoteV6$$inlined$flatMapLatest$1(continuation, this.$params$inlined, this.this$0);
        advancedQuoteUseCase$pollQuoteV6$$inlined$flatMapLatest$1.L$0 = flowCollector;
        advancedQuoteUseCase$pollQuoteV6$$inlined$flatMapLatest$1.L$1 = advancedQuoteParams;
        return advancedQuoteUseCase$pollQuoteV6$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        FlowCollector flowCollector2;
        Map map;
        gYX gyx;
        FlowCollector flowCollector3;
        gYX gyx2;
        Flow flow;
        gYX gyx3;
        gYS application;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            AdvancedQuoteParams advancedQuoteParams = (AdvancedQuoteParams) this.L$1;
            if (advancedQuoteParams == null) {
                flow = FlowKt.flow(new AdvancedQuoteUseCase$pollQuoteV6$1$1(null));
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                if (FlowKt.emitAll(flowCollector, flow, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            boolean zBooleanValue = this.$params$inlined.OLrzqt().invoke().booleanValue();
            gYX gyx4 = this.this$0.EZpvd;
            if (!zBooleanValue || this.$params$inlined.copydefault()) {
                Map mapKWHzl = C56424yEw.KWHzl();
                kRE kre = this.this$0;
                AdvancedTradeType advancedTradeTypeKWHzl = this.$params$inlined.KWHzl();
                String strInvoke = this.$params$inlined.EZpvd().invoke();
                this.L$0 = flowCollector;
                this.L$1 = gyx4;
                this.L$2 = mapKWHzl;
                this.label = 2;
                Object objKWHzl = kre.KWHzl(advancedTradeTypeKWHzl, strInvoke, false, advancedQuoteParams, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                flowCollector2 = flowCollector;
                map = mapKWHzl;
                obj = objKWHzl;
                gyx = gyx4;
                application = new gYS.Application(map, (V6QuoteAndCalldataRequest) obj, false, 4, null);
                gyx3 = gyx;
                flowCollector = flowCollector2;
            } else {
                kRE kre2 = this.this$0;
                String strInvoke2 = this.$params$inlined.EZpvd().invoke();
                this.L$0 = flowCollector;
                this.L$1 = gyx4;
                this.label = 1;
                Object objOLrzqt = kre2.OLrzqt(strInvoke2, true, advancedQuoteParams, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                flowCollector3 = flowCollector;
                obj = objOLrzqt;
                gyx2 = gyx4;
                gYS.Activity activity = new gYS.Activity((V6QuoteRequest) obj);
                gyx3 = gyx2;
                flowCollector = flowCollector3;
                application = activity;
            }
        } else if (i == 1) {
            gyx2 = (gYX) this.L$1;
            flowCollector3 = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
            gYS.Activity activity2 = new gYS.Activity((V6QuoteRequest) obj);
            gyx3 = gyx2;
            flowCollector = flowCollector3;
            application = activity2;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            Map map2 = (Map) this.L$2;
            gyx = (gYX) this.L$1;
            flowCollector2 = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
            map = map2;
            application = new gYS.Application(map, (V6QuoteAndCalldataRequest) obj, false, 4, null);
            gyx3 = gyx;
            flowCollector = flowCollector2;
        }
        flow = new kRE.StateListAnimator(gYX.pollByStrategy$default(gyx3, application, 0L, 2, null), this.this$0);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 3;
        if (FlowKt.emitAll(flowCollector, flow, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}

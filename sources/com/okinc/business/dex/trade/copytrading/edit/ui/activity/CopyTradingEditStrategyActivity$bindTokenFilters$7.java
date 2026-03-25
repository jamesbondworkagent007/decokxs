package com.okinc.business.dex.trade.copytrading.edit.ui.activity;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C19933gUs;
import o.C23428hxz;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class CopyTradingEditStrategyActivity$bindTokenFilters$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C23428hxz $this_bindTokenFilters;
    int label;
    final /* synthetic */ CopyTradingEditStrategyActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyActivity$bindTokenFilters$7(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, C23428hxz c23428hxz, Continuation<? super CopyTradingEditStrategyActivity$bindTokenFilters$7> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingEditStrategyActivity;
        this.$this_bindTokenFilters = c23428hxz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingEditStrategyActivity$bindTokenFilters$7(this.this$0, this.$this_bindTokenFilters, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingEditStrategyActivity$bindTokenFilters$7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<DefiChainInfo> stateFlowGEmmrt = this.this$0.gEmmrt().gEmmrt();
            final C23428hxz c23428hxz = this.$this_bindTokenFilters;
            FlowCollector<? super DefiChainInfo> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity$bindTokenFilters$7.4
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                public final Object emit(DefiChainInfo defiChainInfo, Continuation<? super Unit> continuation) {
                    C19933gUs c19933gUsEZpvd = c23428hxz.DbNXlk.EZpvd();
                    String chainId = defiChainInfo != null ? defiChainInfo.getChainId() : null;
                    if (chainId == null) {
                        chainId = "";
                    }
                    c19933gUsEZpvd.KWHzl(chainId);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowGEmmrt.collect(flowCollector, this) == objCopydefault) {
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

package com.okinc.business.market.common.marketconfig.domain;

import com.okinc.business.market.data.model.MarketConfigData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27633jyq;
import o.C27635jys;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27636jyt;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketConfigUseCase$getMarketConfig$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MarketConfig>, Object> {
    final /* synthetic */ boolean $forceUpdate;
    Object L$0;
    int label;
    final /* synthetic */ C27633jyq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketConfigUseCase$getMarketConfig$2(C27633jyq c27633jyq, boolean z, Continuation<? super MarketConfigUseCase$getMarketConfig$2> continuation) {
        super(2, continuation);
        this.this$0 = c27633jyq;
        this.$forceUpdate = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketConfigUseCase$getMarketConfig$2(this.this$0, this.$forceUpdate, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MarketConfig> continuation) {
        return ((MarketConfigUseCase$getMarketConfig$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC27636jyt interfaceC27636jyt = this.this$0.OLrzqt;
            this.label = 1;
            obj = interfaceC27636jyt.copydefault(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                return C27635jys.AEQbTJ((MarketConfigData) obj, list);
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list2 = (List) obj;
        InterfaceC27636jyt interfaceC27636jyt2 = this.this$0.OLrzqt;
        boolean z = this.$forceUpdate;
        this.L$0 = list2;
        this.label = 2;
        Object objCopydefault2 = interfaceC27636jyt2.copydefault(z, this);
        if (objCopydefault2 == objCopydefault) {
            return objCopydefault;
        }
        list = list2;
        obj = objCopydefault2;
        return C27635jys.AEQbTJ((MarketConfigData) obj, list);
    }
}

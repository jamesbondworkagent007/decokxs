package com.okinc.business.defi.wallet.imported;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C18380fhM;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC18379fhL;

/* JADX INFO: loaded from: classes18.dex */
public final class SelectNetworkViewModel$walletNetworkList$1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends InterfaceC18379fhL>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C18380fhM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectNetworkViewModel$walletNetworkList$1(C18380fhM c18380fhM, Continuation<? super SelectNetworkViewModel$walletNetworkList$1> continuation) {
        super(2, continuation);
        this.this$0 = c18380fhM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SelectNetworkViewModel$walletNetworkList$1 selectNetworkViewModel$walletNetworkList$1 = new SelectNetworkViewModel$walletNetworkList$1(this.this$0, continuation);
        selectNetworkViewModel$walletNetworkList$1.L$0 = obj;
        return selectNetworkViewModel$walletNetworkList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super List<? extends InterfaceC18379fhL>> flowCollector, Continuation<? super Unit> continuation) {
        return ((SelectNetworkViewModel$walletNetworkList$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            C18380fhM c18380fhM = this.this$0;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = c18380fhM.OLrzqt(this);
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
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(obj, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}

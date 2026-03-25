package com.okinc.planet.biz_home.viewmodel;

import com.okinc.kyc.api.biz.bean.KycInfoListBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC37981pHw;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetRootViewModel$getPublisherData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetRootViewModel$getPublisherData$1(Continuation<? super PlanetRootViewModel$getPublisherData$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetRootViewModel$getPublisherData$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetRootViewModel$getPublisherData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC37981pHw interfaceC37981pHw;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            interfaceC37981pHw = (InterfaceC37981pHw) C43251rlk.copydefault(InterfaceC37981pHw.class);
            Flow<KycInfoListBean> flowEZpvd = interfaceC37981pHw.EZpvd();
            this.L$0 = interfaceC37981pHw;
            this.label = 1;
            obj = FlowKt.first(flowEZpvd, this);
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
            interfaceC37981pHw = (InterfaceC37981pHw) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (obj == null) {
            Flow<KycInfoListBean> flowAEQbTJ = interfaceC37981pHw.AEQbTJ();
            this.L$0 = null;
            this.label = 2;
            if (FlowKt.first(flowAEQbTJ, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}

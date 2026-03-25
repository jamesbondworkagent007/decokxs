package com.okinc.okimcore.channel.inhouse.impl;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMUtilityImpl$getUnreadCountByRelationIdFlow$1 extends SuspendLambda implements yHO<FlowCollector<? super Integer>, Throwable, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InHouseIMUtilityImpl$getUnreadCountByRelationIdFlow$1(Continuation<? super InHouseIMUtilityImpl$getUnreadCountByRelationIdFlow$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super Integer> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        InHouseIMUtilityImpl$getUnreadCountByRelationIdFlow$1 inHouseIMUtilityImpl$getUnreadCountByRelationIdFlow$1 = new InHouseIMUtilityImpl$getUnreadCountByRelationIdFlow$1(continuation);
        inHouseIMUtilityImpl$getUnreadCountByRelationIdFlow$1.L$0 = flowCollector;
        return inHouseIMUtilityImpl$getUnreadCountByRelationIdFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            this.label = 1;
            if (flowCollector.emit(null, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}

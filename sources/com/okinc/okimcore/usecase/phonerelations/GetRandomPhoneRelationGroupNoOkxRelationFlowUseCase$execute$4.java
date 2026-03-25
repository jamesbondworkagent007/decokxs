package com.okinc.okimcore.usecase.phonerelations;

import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C44517sSt;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$4 extends SuspendLambda implements Function2<Set<? extends String>, Continuation<? super Flow<? extends List<? extends PhoneRelationEntity>>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44517sSt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$4(C44517sSt c44517sSt, Continuation<? super GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$4> continuation) {
        super(2, continuation);
        this.this$0 = c44517sSt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$4 getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$4 = new GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$4(this.this$0, continuation);
        getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$4.L$0 = obj;
        return getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Set<? extends String> set, Continuation<? super Flow<? extends List<? extends PhoneRelationEntity>>> continuation) {
        return invoke2((Set<String>) set, (Continuation<? super Flow<? extends List<PhoneRelationEntity>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Set<String> set, Continuation<? super Flow<? extends List<PhoneRelationEntity>>> continuation) {
        return ((GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$4) create(set, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Set<String> set = (Set) this.L$0;
            pUU.KWHzl("GetRandomPhoneRelationGroupNoOkxRelation", "hashes: " + set);
            return FlowKt.distinctUntilChanged(this.this$0.OLrzqt.getPhoneRelationsNoOkxRelationByHashesAsFlow(set));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

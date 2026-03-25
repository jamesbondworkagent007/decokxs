package com.okinc.im.usecase.relationinfo;

import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import o.C35863oGm;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class ObserveRelationInfoByConversationIdUseCase$execute$2 extends SuspendLambda implements Function2<String, Continuation<? super Flow<? extends RelationInfo>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35863oGm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveRelationInfoByConversationIdUseCase$execute$2(C35863oGm c35863oGm, Continuation<? super ObserveRelationInfoByConversationIdUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = c35863oGm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ObserveRelationInfoByConversationIdUseCase$execute$2 observeRelationInfoByConversationIdUseCase$execute$2 = new ObserveRelationInfoByConversationIdUseCase$execute$2(this.this$0, continuation);
        observeRelationInfoByConversationIdUseCase$execute$2.L$0 = obj;
        return observeRelationInfoByConversationIdUseCase$execute$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(String str, Continuation<? super Flow<? extends RelationInfo>> continuation) {
        return invoke2(str, (Continuation<? super Flow<RelationInfo>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, Continuation<? super Flow<RelationInfo>> continuation) {
        return ((ObserveRelationInfoByConversationIdUseCase$execute$2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return this.this$0.AEQbTJ.KWHzl((String) this.L$0);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

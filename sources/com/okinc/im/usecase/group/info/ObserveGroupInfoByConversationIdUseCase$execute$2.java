package com.okinc.im.usecase.group.info;

import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import o.C56391yDq;
import o.C56442yFn;
import o.oDG;

/* JADX INFO: loaded from: classes8.dex */
public final class ObserveGroupInfoByConversationIdUseCase$execute$2 extends SuspendLambda implements Function2<String, Continuation<? super Flow<? extends GroupInfo>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ oDG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveGroupInfoByConversationIdUseCase$execute$2(oDG odg, Continuation<? super ObserveGroupInfoByConversationIdUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = odg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ObserveGroupInfoByConversationIdUseCase$execute$2 observeGroupInfoByConversationIdUseCase$execute$2 = new ObserveGroupInfoByConversationIdUseCase$execute$2(this.this$0, continuation);
        observeGroupInfoByConversationIdUseCase$execute$2.L$0 = obj;
        return observeGroupInfoByConversationIdUseCase$execute$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(String str, Continuation<? super Flow<? extends GroupInfo>> continuation) {
        return invoke2(str, (Continuation<? super Flow<GroupInfo>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, Continuation<? super Flow<GroupInfo>> continuation) {
        return ((ObserveGroupInfoByConversationIdUseCase$execute$2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return this.this$0.OLrzqt.AEQbTJ((String) this.L$0);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

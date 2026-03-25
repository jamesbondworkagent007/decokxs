package com.okinc.im.usecase.relationinfo;

import com.okinc.okimcore.model.im.AddContactMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35858oGh;
import o.C35859oGi;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class GetRelationInfoFromRemoteIfAddedContactUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RelationInfo>, Object> {
    final /* synthetic */ OKMessage $latestMessage;
    final /* synthetic */ String $relationId;
    int label;
    final /* synthetic */ C35858oGh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRelationInfoFromRemoteIfAddedContactUseCase$execute$2(OKMessage oKMessage, C35858oGh c35858oGh, String str, Continuation<? super GetRelationInfoFromRemoteIfAddedContactUseCase$execute$2> continuation) {
        super(2, continuation);
        this.$latestMessage = oKMessage;
        this.this$0 = c35858oGh;
        this.$relationId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetRelationInfoFromRemoteIfAddedContactUseCase$execute$2(this.$latestMessage, this.this$0, this.$relationId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RelationInfo> continuation) {
        return ((GetRelationInfoFromRemoteIfAddedContactUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!(this.$latestMessage.getContent() instanceof AddContactMessage)) {
                return null;
            }
            C35859oGi c35859oGi = this.this$0.KWHzl;
            String str = this.$relationId;
            this.label = 1;
            obj = c35859oGi.copydefault(str, null, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return (RelationInfo) obj;
    }
}

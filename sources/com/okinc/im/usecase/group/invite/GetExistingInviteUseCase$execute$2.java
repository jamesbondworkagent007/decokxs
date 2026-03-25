package com.okinc.im.usecase.group.invite;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC44398sOi;
import o.C56391yDq;
import o.C56442yFn;
import o.oDK;
import o.sIR;

/* JADX INFO: loaded from: classes8.dex */
public final class GetExistingInviteUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC44398sOi>, Object> {
    final /* synthetic */ long $channelId;
    int label;
    final /* synthetic */ oDK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetExistingInviteUseCase$execute$2(oDK odk, long j, Continuation<? super GetExistingInviteUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = odk;
        this.$channelId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetExistingInviteUseCase$execute$2(this.this$0, this.$channelId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC44398sOi> continuation) {
        return ((GetExistingInviteUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sIR sir = this.this$0.KWHzl;
            long j = this.$channelId;
            this.label = 1;
            obj = sir.OLrzqt(j, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}

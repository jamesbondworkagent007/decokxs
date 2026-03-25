package com.okinc.im.usecase.message;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.feature.message.repository.remote.IMMessageService;
import com.okinc.okimcore.model.remote.MessageReadInfo;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35807oEk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class GetMessageReadCountUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<MessageReadInfo>>, Object> {
    final /* synthetic */ long $channelId;
    final /* synthetic */ long $seq;
    int label;
    final /* synthetic */ C35807oEk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMessageReadCountUseCase$invoke$2(C35807oEk c35807oEk, long j, long j2, Continuation<? super GetMessageReadCountUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c35807oEk;
        this.$channelId = j;
        this.$seq = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetMessageReadCountUseCase$invoke$2(this.this$0, this.$channelId, this.$seq, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<MessageReadInfo>> continuation) {
        return ((GetMessageReadCountUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                IMMessageService iMMessageService = this.this$0.AEQbTJ;
                long j = this.$channelId;
                long j2 = this.$seq;
                this.label = 1;
                obj = iMMessageService.getReadCount(j, j2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return (ResponseData) obj;
        } catch (IOException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Network error";
            }
            return new ResponseData(-1, message, null, null, null, null, 44, null);
        }
    }
}

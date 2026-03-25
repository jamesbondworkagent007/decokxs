package com.okinc.okimcore.usecase;

import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44502sSe;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class MessagesUseCase$createResponseWithFetchedMessages$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C44502sSe.Application>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ List<Long> $missingMessageIds;
    final /* synthetic */ List<InHouseIMMessageEntity> $visibleMessages;
    int label;
    final /* synthetic */ C44502sSe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesUseCase$createResponseWithFetchedMessages$2(C44502sSe c44502sSe, String str, List<Long> list, List<InHouseIMMessageEntity> list2, Continuation<? super MessagesUseCase$createResponseWithFetchedMessages$2> continuation) {
        super(2, continuation);
        this.this$0 = c44502sSe;
        this.$channelId = str;
        this.$missingMessageIds = list;
        this.$visibleMessages = list2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessagesUseCase$createResponseWithFetchedMessages$2(this.this$0, this.$channelId, this.$missingMessageIds, this.$visibleMessages, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C44502sSe.Application> continuation) {
        return ((MessagesUseCase$createResponseWithFetchedMessages$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44502sSe c44502sSe = this.this$0;
            String str = this.$channelId;
            List<Long> list = this.$missingMessageIds;
            this.label = 1;
            obj = c44502sSe.KWHzl(str, (List<Long>) list, (Continuation<? super List<WSSendMessageDetailData>>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list2 = (List) obj;
        List listAEQbTJ = this.this$0.AEQbTJ((List<WSSendMessageDetailData>) list2);
        pUU.KWHzl("MessagesUseCase", "channelId is " + this.$channelId + ", Fetched " + list2.size() + " missing messages, " + listAEQbTJ.size() + " are visible.");
        return new C44502sSe.Application(this.$visibleMessages, list2, listAEQbTJ, this.$missingMessageIds);
    }
}

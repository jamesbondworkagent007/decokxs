package com.okinc.okimcore.usecase;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44124sEe;
import o.C44486sRp;
import o.C44502sSe;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class MessagesUseCase$loadMessagesWith$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C44502sSe.Application>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ long $maxSeq;
    final /* synthetic */ long $minSeq;
    int label;
    final /* synthetic */ C44502sSe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesUseCase$loadMessagesWith$2(C44502sSe c44502sSe, String str, long j, long j2, Continuation<? super MessagesUseCase$loadMessagesWith$2> continuation) {
        super(2, continuation);
        this.this$0 = c44502sSe;
        this.$channelId = str;
        this.$minSeq = j;
        this.$maxSeq = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessagesUseCase$loadMessagesWith$2(this.this$0, this.$channelId, this.$minSeq, this.$maxSeq, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C44502sSe.Application> continuation) {
        return ((MessagesUseCase$loadMessagesWith$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44486sRp c44486sRp = this.this$0.DbNXlk;
            String str = this.$channelId;
            long j = this.$minSeq;
            long j2 = this.$maxSeq;
            this.label = 1;
            obj = c44486sRp.OLrzqt(str, j, j2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return (C44502sSe.Application) obj;
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) obj;
        List listOLrzqt = this.this$0.OLrzqt((List<InHouseIMMessageEntity>) list);
        List listKWHzl = this.this$0.KWHzl((List<InHouseIMMessageEntity>) list, this.$minSeq, this.$maxSeq);
        boolean zEZpvd = this.this$0.fARcdN.EZpvd();
        if (listKWHzl.isEmpty() || !zEZpvd) {
            pUU.KWHzl("MessagesUseCase", "missingMessagesIds.isEmpty: " + listKWHzl.isEmpty() + ", isWebSocketConnected is " + zEZpvd);
            return this.this$0.EZpvd((List<InHouseIMMessageEntity>) listOLrzqt, (List<Long>) listKWHzl);
        }
        C44124sEe.imLogSync$default("loadMessagesWith:in-loop => channelId:" + this.$channelId + ", fromSeq:" + this.$maxSeq + ", toSeq:" + this.$minSeq + ", missingMessageIdSize:" + listKWHzl.size() + ",  missingMessageIds:" + listKWHzl, null, null, 6, null);
        C44502sSe c44502sSe = this.this$0;
        String str2 = this.$channelId;
        this.label = 2;
        obj = c44502sSe.KWHzl(str2, (List<InHouseIMMessageEntity>) listOLrzqt, (List<Long>) listKWHzl, (Continuation<? super C44502sSe.Application>) this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        return (C44502sSe.Application) obj;
    }
}

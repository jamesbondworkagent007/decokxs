package com.okinc.im.imui.livestream.usecase;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C36497ocA;
import o.C56391yDq;
import o.C56442yFn;
import o.sGI;

/* JADX INFO: loaded from: classes23.dex */
public final class FetchLivestreamChatRoomConversationUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InHouseIMConversationEntity>, Object> {
    final /* synthetic */ String $channelId;
    int label;
    final /* synthetic */ C36497ocA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchLivestreamChatRoomConversationUseCase$execute$2(C36497ocA c36497ocA, String str, Continuation<? super FetchLivestreamChatRoomConversationUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = c36497ocA;
        this.$channelId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FetchLivestreamChatRoomConversationUseCase$execute$2(this.this$0, this.$channelId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InHouseIMConversationEntity> continuation) {
        return ((FetchLivestreamChatRoomConversationUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sGI sgi = this.this$0.KWHzl;
            String str = this.$channelId;
            this.label = 1;
            obj = sgi.AhwBna(str, this);
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

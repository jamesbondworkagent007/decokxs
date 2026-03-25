package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageWithReactions;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44124sEe;
import o.C44302sKu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44228sIa;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerImpl$broadcastMessages$3$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currentUserId;
    final /* synthetic */ InHouseIMMessageWithReactions $message;
    final /* synthetic */ OKMessage $okMessage;
    int label;
    final /* synthetic */ C44302sKu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerImpl$broadcastMessages$3$4$1(InHouseIMMessageWithReactions inHouseIMMessageWithReactions, OKMessage oKMessage, String str, C44302sKu c44302sKu, Continuation<? super InHouseIMWebSocketSyncManagerImpl$broadcastMessages$3$4$1> continuation) {
        super(2, continuation);
        this.$message = inHouseIMMessageWithReactions;
        this.$okMessage = oKMessage;
        this.$currentUserId = str;
        this.this$0 = c44302sKu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMWebSocketSyncManagerImpl$broadcastMessages$3$4$1(this.$message, this.$okMessage, this.$currentUserId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMWebSocketSyncManagerImpl$broadcastMessages$3$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C44124sEe.imLogSync$default("broadcast messages => dispatch read message seq=" + this.$message.getImMessageEntity().getSeq() + ", okMessage=" + this.$okMessage + ", currentUserId=" + this.$currentUserId, null, this.$message.getImMessageEntity().getChannelId(), 2, null);
            InterfaceC44228sIa interfaceC44228sIaUzCIH = this.this$0.uzCIH();
            if (interfaceC44228sIaUzCIH != null) {
                interfaceC44228sIaUzCIH.OLrzqt(this.$okMessage);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

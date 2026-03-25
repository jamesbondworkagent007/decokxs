package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$broadcastMessages$2;
import com.okinc.okimcore.model.im.OKConversationType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44124sEe;
import o.C44302sKu;
import o.C44452sQi;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44291sKj;
import o.InterfaceC44293sKl;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerImpl$broadcastMessages$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ OKConversationType $conversationType;
    int label;
    final /* synthetic */ C44302sKu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerImpl$broadcastMessages$2(String str, C44302sKu c44302sKu, OKConversationType oKConversationType, Continuation<? super InHouseIMWebSocketSyncManagerImpl$broadcastMessages$2> continuation) {
        super(2, continuation);
        this.$channelId = str;
        this.this$0 = c44302sKu;
        this.$conversationType = oKConversationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMWebSocketSyncManagerImpl$broadcastMessages$2(this.$channelId, this.this$0, this.$conversationType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMWebSocketSyncManagerImpl$broadcastMessages$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C44124sEe.imLogSync$default("broadcast messages => dispatch refresh whole conversation", null, this.$channelId, 2, null);
            InterfaceC44293sKl interfaceC44293sKlFIwbmz = this.this$0.fIwbmz();
            final String str = this.$channelId;
            final OKConversationType oKConversationType = this.$conversationType;
            interfaceC44293sKlFIwbmz.copydefault(new Function1() { // from class: o.sKy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return InHouseIMWebSocketSyncManagerImpl$broadcastMessages$2.invokeSuspend$lambda$0(str, oKConversationType, (InterfaceC44291sKj) obj2);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(String str, OKConversationType oKConversationType, InterfaceC44291sKj interfaceC44291sKj) {
        interfaceC44291sKj.EZpvd(new C44452sQi(str, oKConversationType));
        return Unit.INSTANCE;
    }
}

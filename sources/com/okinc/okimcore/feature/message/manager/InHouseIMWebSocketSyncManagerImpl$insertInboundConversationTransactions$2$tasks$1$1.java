package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44124sEe;
import o.C44302sKu;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactions$2$tasks$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $id;
    final /* synthetic */ boolean $isNotifyUI;
    final /* synthetic */ List<WSSendMessageDetailData> $list;
    int label;
    final /* synthetic */ C44302sKu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactions$2$tasks$1$1(C44302sKu c44302sKu, String str, List<WSSendMessageDetailData> list, boolean z, Continuation<? super InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactions$2$tasks$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c44302sKu;
        this.$id = str;
        this.$list = list;
        this.$isNotifyUI = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactions$2$tasks$1$1(this.this$0, this.$id, this.$list, this.$isNotifyUI, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMWebSocketSyncManagerImpl$insertInboundConversationTransactions$2$tasks$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C44302sKu c44302sKu = this.this$0;
                String str = this.$id;
                List<WSSendMessageDetailData> list = this.$list;
                boolean z = this.$isNotifyUI;
                this.label = 1;
                if (c44302sKu.copydefault(str, list, z, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (Throwable th) {
            C44124sEe.imLogSync$default("insert incoming message failed => ", th, null, 4, null);
        }
        return Unit.INSTANCE;
    }
}

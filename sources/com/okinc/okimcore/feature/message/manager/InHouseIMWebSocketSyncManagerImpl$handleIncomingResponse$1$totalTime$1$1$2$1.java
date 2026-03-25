package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$handleIncomingResponse$1$totalTime$1$1$2$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44302sKu;
import o.C44467sQx;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44291sKj;
import o.InterfaceC44293sKl;
import o.sKD;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerImpl$handleIncomingResponse$1$totalTime$1$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKMessage $okMessage;
    int label;
    final /* synthetic */ C44302sKu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerImpl$handleIncomingResponse$1$totalTime$1$1$2$1(C44302sKu c44302sKu, OKMessage oKMessage, Continuation<? super InHouseIMWebSocketSyncManagerImpl$handleIncomingResponse$1$totalTime$1$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = c44302sKu;
        this.$okMessage = oKMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMWebSocketSyncManagerImpl$handleIncomingResponse$1$totalTime$1$1$2$1(this.this$0, this.$okMessage, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMWebSocketSyncManagerImpl$handleIncomingResponse$1$totalTime$1$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC44293sKl interfaceC44293sKlFIwbmz = this.this$0.fIwbmz();
            final OKMessage oKMessage = this.$okMessage;
            interfaceC44293sKlFIwbmz.copydefault(new Function1() { // from class: o.sKG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return InHouseIMWebSocketSyncManagerImpl$handleIncomingResponse$1$totalTime$1$1$2$1.invokeSuspend$lambda$0(oKMessage, (InterfaceC44291sKj) obj2);
                }
            });
            InterfaceC44293sKl interfaceC44293sKlFIwbmz2 = this.this$0.fIwbmz();
            sKD skd = interfaceC44293sKlFIwbmz2 instanceof sKD ? (sKD) interfaceC44293sKlFIwbmz2 : null;
            if (skd != null) {
                skd.copydefault(this.$okMessage);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(OKMessage oKMessage, InterfaceC44291sKj interfaceC44291sKj) {
        interfaceC44291sKj.KWHzl(new C44467sQx(oKMessage));
        return Unit.INSTANCE;
    }
}

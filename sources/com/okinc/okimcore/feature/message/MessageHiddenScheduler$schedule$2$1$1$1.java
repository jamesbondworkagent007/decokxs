package com.okinc.okimcore.feature.message;

import com.okinc.okimcore.feature.message.MessageHiddenScheduler$schedule$2$1$1$1;
import com.okinc.okimcore.model.im.OKConversationType;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44454sQk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44291sKj;
import o.InterfaceC44293sKl;
import o.pUU;
import o.sJW;

/* JADX INFO: loaded from: classes10.dex */
public final class MessageHiddenScheduler$schedule$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $actualMessagesIds;
    final /* synthetic */ String $channelId;
    final /* synthetic */ OKConversationType $conversationType;
    int label;
    final /* synthetic */ sJW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageHiddenScheduler$schedule$2$1$1$1(String str, List<String> list, sJW sjw, OKConversationType oKConversationType, Continuation<? super MessageHiddenScheduler$schedule$2$1$1$1> continuation) {
        super(2, continuation);
        this.$channelId = str;
        this.$actualMessagesIds = list;
        this.this$0 = sjw;
        this.$conversationType = oKConversationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageHiddenScheduler$schedule$2$1$1$1(this.$channelId, this.$actualMessagesIds, this.this$0, this.$conversationType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageHiddenScheduler$schedule$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("MessageHiddenScheduler", "[" + this.$channelId + "] notify actualMessagesIds=" + CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.$actualMessagesIds));
            InterfaceC44293sKl interfaceC44293sKl = this.this$0.EZpvd;
            final String str = this.$channelId;
            final List<String> list = this.$actualMessagesIds;
            final OKConversationType oKConversationType = this.$conversationType;
            interfaceC44293sKl.copydefault(new Function1() { // from class: o.sKc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return MessageHiddenScheduler$schedule$2$1$1$1.invokeSuspend$lambda$0(str, list, oKConversationType, (InterfaceC44291sKj) obj2);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(String str, List list, OKConversationType oKConversationType, InterfaceC44291sKj interfaceC44291sKj) {
        interfaceC44291sKj.OLrzqt(new C44454sQk(str, list, oKConversationType));
        return Unit.INSTANCE;
    }
}

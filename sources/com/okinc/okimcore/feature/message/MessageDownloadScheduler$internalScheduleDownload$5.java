package com.okinc.okimcore.feature.message;

import com.okinc.okimcore.feature.message.MessageDownloadScheduler$internalScheduleDownload$5;
import com.okinc.okimcore.model.im.OKMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC44291sKj;
import o.InterfaceC44293sKl;
import o.pUU;
import o.sJY;

/* JADX INFO: loaded from: classes10.dex */
public final class MessageDownloadScheduler$internalScheduleDownload$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ long $initialFromSeq;
    final /* synthetic */ List<OKMessage> $insertedMessages;
    final /* synthetic */ long $startSequence;
    int label;
    final /* synthetic */ sJY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageDownloadScheduler$internalScheduleDownload$5(String str, long j, long j2, List<OKMessage> list, sJY sjy, Continuation<? super MessageDownloadScheduler$internalScheduleDownload$5> continuation) {
        super(2, continuation);
        this.$channelId = str;
        this.$initialFromSeq = j;
        this.$startSequence = j2;
        this.$insertedMessages = list;
        this.this$0 = sjy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageDownloadScheduler$internalScheduleDownload$5(this.$channelId, this.$initialFromSeq, this.$startSequence, this.$insertedMessages, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageDownloadScheduler$internalScheduleDownload$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = this.$channelId;
            long j = this.$initialFromSeq;
            long j2 = this.$startSequence;
            List<OKMessage> list = this.$insertedMessages;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C56443yFo.KWHzl(((OKMessage) it.next()).getSeq()));
            }
            pUU.KWHzl("MessageDownloadScheduler", "internalScheduleDownload: [" + str + " " + j + "-" + j2 + "] notifyInsertedMessages=" + arrayList);
            InterfaceC44293sKl interfaceC44293sKl = this.this$0.fetchVPNInfo;
            final List<OKMessage> list2 = this.$insertedMessages;
            interfaceC44293sKl.copydefault(new Function1() { // from class: o.sJX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return MessageDownloadScheduler$internalScheduleDownload$5.invokeSuspend$lambda$1(list2, (InterfaceC44291sKj) obj2);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(List list, InterfaceC44291sKj interfaceC44291sKj) {
        interfaceC44291sKj.EZpvd((List<OKMessage>) list);
        return Unit.INSTANCE;
    }
}

package com.okinc.okimcore.feature.message;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.okimcore.feature.message.MessageUpdateScheduler$schedule$2$1$1$2;
import com.okinc.okimcore.model.im.OKMessage;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44291sKj;
import o.pUU;
import o.sJZ;
import o.sQA;

/* JADX INFO: loaded from: classes10.dex */
public final class MessageUpdateScheduler$schedule$2$1$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ List<OKMessage> $messages;
    int label;
    final /* synthetic */ sJZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageUpdateScheduler$schedule$2$1$1$2(List<OKMessage> list, String str, sJZ sjz, Continuation<? super MessageUpdateScheduler$schedule$2$1$1$2> continuation) {
        super(2, continuation);
        this.$messages = list;
        this.$channelId = str;
        this.this$0 = sjz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageUpdateScheduler$schedule$2$1$1$2(this.$messages, this.$channelId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageUpdateScheduler$schedule$2$1$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List<OKMessage> list = this.$messages;
            String str = this.$channelId;
            sJZ sjz = this.this$0;
            for (final OKMessage oKMessage : list) {
                pUU.KWHzl("MessageUpdateScheduler", "[" + str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + oKMessage.getSeq() + "] notify");
                sjz.OLrzqt.copydefault(new Function1() { // from class: o.sKb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return MessageUpdateScheduler$schedule$2$1$1$2.invokeSuspend$lambda$1$lambda$0(oKMessage, (InterfaceC44291sKj) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(OKMessage oKMessage, InterfaceC44291sKj interfaceC44291sKj) {
        interfaceC44291sKj.KWHzl(new sQA(oKMessage, null, 2, null));
        return Unit.INSTANCE;
    }
}

package com.okinc.im.imui.group.messages.recallnotification;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44461sQr;
import o.C56391yDq;
import o.C56442yFn;
import o.sKH;

/* JADX INFO: loaded from: classes16.dex */
public final class RecallNotificationDisplayTextHelper$getDisplayText$1$contactInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C44461sQr>, Object> {
    final /* synthetic */ OKMessage $message;
    final /* synthetic */ sKH $messageManager;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecallNotificationDisplayTextHelper$getDisplayText$1$contactInfo$1(sKH skh, OKMessage oKMessage, Continuation<? super RecallNotificationDisplayTextHelper$getDisplayText$1$contactInfo$1> continuation) {
        super(2, continuation);
        this.$messageManager = skh;
        this.$message = oKMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecallNotificationDisplayTextHelper$getDisplayText$1$contactInfo$1(this.$messageManager, this.$message, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C44461sQr> continuation) {
        return ((RecallNotificationDisplayTextHelper$getDisplayText$1$contactInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sKH skh = this.$messageManager;
            OKMessage oKMessage = this.$message;
            this.label = 1;
            obj = skh.OLrzqt(oKMessage, (String) null, this);
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

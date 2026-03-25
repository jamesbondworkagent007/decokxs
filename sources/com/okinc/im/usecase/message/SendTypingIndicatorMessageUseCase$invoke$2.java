package com.okinc.im.usecase.message;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKTypingIndicatorMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35821oEy;
import o.C56391yDq;
import o.C56442yFn;
import o.oCE;
import o.oED;

/* JADX INFO: loaded from: classes8.dex */
public final class SendTypingIndicatorMessageUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OKMessage>, Object> {
    final /* synthetic */ String $channelId;
    int label;
    final /* synthetic */ oED this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendTypingIndicatorMessageUseCase$invoke$2(oED oed, String str, Continuation<? super SendTypingIndicatorMessageUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = oed;
        this.$channelId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SendTypingIndicatorMessageUseCase$invoke$2(this.this$0, this.$channelId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OKMessage> continuation) {
        return ((SendTypingIndicatorMessageUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            oCE oce = this.this$0.copydefault;
            String str = this.$channelId;
            this.label = 1;
            obj = oce.OLrzqt(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        OKMessage oKMessageAEQbTJ = OKMessage.Companion.AEQbTJ(this.$channelId, ((OKConversation) obj).getConversationType(), OKTypingIndicatorMessage.CREATOR.obtain());
        C35821oEy c35821oEy = this.this$0.EZpvd;
        this.label = 2;
        obj = c35821oEy.EZpvd(oKMessageAEQbTJ, this);
        return obj == objCopydefault ? objCopydefault : obj;
    }
}

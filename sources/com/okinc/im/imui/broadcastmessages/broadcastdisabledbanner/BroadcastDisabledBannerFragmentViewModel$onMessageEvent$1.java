package com.okinc.im.imui.broadcastmessages.broadcastdisabledbanner;

import com.okinc.okimcore.model.im.OKMessage;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35386nuP;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class BroadcastDisabledBannerFragmentViewModel$onMessageEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<OKMessage> $messages;
    int label;
    final /* synthetic */ BroadcastDisabledBannerFragmentViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastDisabledBannerFragmentViewModel$onMessageEvent$1(BroadcastDisabledBannerFragmentViewModel broadcastDisabledBannerFragmentViewModel, List<OKMessage> list, Continuation<? super BroadcastDisabledBannerFragmentViewModel$onMessageEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = broadcastDisabledBannerFragmentViewModel;
        this.$messages = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BroadcastDisabledBannerFragmentViewModel$onMessageEvent$1(this.this$0, this.$messages, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BroadcastDisabledBannerFragmentViewModel$onMessageEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35386nuP c35386nuP = this.this$0.KWHzl;
            List<OKMessage> list = this.$messages;
            this.label = 1;
            if (c35386nuP.OLrzqt(list, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}

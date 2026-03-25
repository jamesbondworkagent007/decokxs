package com.okinc.okimcore.client;

import com.okinc.okimcore.model.im.inhouseim.ws.WSRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonElement;
import o.C56391yDq;
import o.C56442yFn;
import o.sED;

/* JADX INFO: loaded from: classes10.dex */
public final class WebSocketClient$sendWebSocketCommand$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super JsonElement>, Object> {
    final /* synthetic */ WSRequest $request;
    int label;
    final /* synthetic */ sED this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketClient$sendWebSocketCommand$2(sED sed, WSRequest wSRequest, Continuation<? super WebSocketClient$sendWebSocketCommand$2> continuation) {
        super(2, continuation);
        this.this$0 = sed;
        this.$request = wSRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebSocketClient$sendWebSocketCommand$2(this.this$0, this.$request, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super JsonElement> continuation) {
        return ((WebSocketClient$sendWebSocketCommand$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sED sed = this.this$0;
            WSRequest wSRequest = this.$request;
            this.label = 1;
            obj = sed.KWHzl(wSRequest, this);
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

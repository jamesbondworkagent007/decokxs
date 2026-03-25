package com.okinc.okimcore.client;

import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMResponse;
import com.okinc.okimcore.model.im.inhouseim.ws.WSRequest;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.serialization.json.JsonElement;
import o.C56391yDq;
import o.C56442yFn;
import o.sED;

/* JADX INFO: loaded from: classes10.dex */
public final class WebSocketClient$sendWebSocketCommandInternal$2$1 extends SuspendLambda implements Function2<InHouseIMResponse, Continuation<? super Unit>, Object> {
    final /* synthetic */ CancellableContinuation<JsonElement> $it;
    final /* synthetic */ WSRequest $request;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ sED this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlinx.serialization.json.JsonElement> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WebSocketClient$sendWebSocketCommandInternal$2$1(sED sed, WSRequest wSRequest, CancellableContinuation<? super JsonElement> cancellableContinuation, Continuation<? super WebSocketClient$sendWebSocketCommandInternal$2$1> continuation) {
        super(2, continuation);
        this.this$0 = sed;
        this.$request = wSRequest;
        this.$it = cancellableContinuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WebSocketClient$sendWebSocketCommandInternal$2$1 webSocketClient$sendWebSocketCommandInternal$2$1 = new WebSocketClient$sendWebSocketCommandInternal$2$1(this.this$0, this.$request, this.$it, continuation);
        webSocketClient$sendWebSocketCommandInternal$2$1.L$0 = obj;
        return webSocketClient$sendWebSocketCommandInternal$2$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InHouseIMResponse inHouseIMResponse, Continuation<? super Unit> continuation) {
        return ((WebSocketClient$sendWebSocketCommandInternal$2$1) create(inHouseIMResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InHouseIMResponse inHouseIMResponse = (InHouseIMResponse) this.L$0;
            sED sed = this.this$0;
            WSRequest wSRequest = this.$request;
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(sed.EZpvd(wSRequest, inHouseIMResponse));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            CancellableContinuation<JsonElement> cancellableContinuation = this.$it;
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                Result.Application application3 = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl((JsonElement) objM7377constructorimpl));
            }
            CancellableContinuation<JsonElement> cancellableContinuation2 = this.$it;
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                Result.Application application4 = Result.Companion;
                cancellableContinuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl)));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

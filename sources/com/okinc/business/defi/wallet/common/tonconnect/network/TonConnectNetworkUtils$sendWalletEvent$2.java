package com.okinc.business.defi.wallet.common.tonconnect.network;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C16066ecs;
import o.C56391yDq;
import o.C56442yFn;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class TonConnectNetworkUtils$sendWalletEvent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ String $base64Body;
    final /* synthetic */ String $dAppClientId;
    final /* synthetic */ String $publicKey;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C16066ecs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TonConnectNetworkUtils$sendWalletEvent$2(C16066ecs c16066ecs, String str, String str2, String str3, Continuation<? super TonConnectNetworkUtils$sendWalletEvent$2> continuation) {
        super(2, continuation);
        this.this$0 = c16066ecs;
        this.$publicKey = str;
        this.$dAppClientId = str2;
        this.$base64Body = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TonConnectNetworkUtils$sendWalletEvent$2 tonConnectNetworkUtils$sendWalletEvent$2 = new TonConnectNetworkUtils$sendWalletEvent$2(this.this$0, this.$publicKey, this.$dAppClientId, this.$base64Body, continuation);
        tonConnectNetworkUtils$sendWalletEvent$2.L$0 = obj;
        return tonConnectNetworkUtils$sendWalletEvent$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((TonConnectNetworkUtils$sendWalletEvent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Response responsePost$default;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C16066ecs c16066ecs = this.this$0;
            String str = this.$publicKey;
            String str2 = this.$dAppClientId;
            String str3 = this.$base64Body;
            try {
                Result.Application application = Result.Companion;
                MediaType mediaType = MediaType.Companion.get("text/plain");
                responsePost$default = C16066ecs.post$default(c16066ecs, c16066ecs.AEQbTJ(), c16066ecs.copydefault() + "/message?client_id=" + str + "&to=" + str2 + "&ttl=300", RequestBody.Companion.create(str3, mediaType), null, 4, null);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (!responsePost$default.isSuccessful()) {
                throw new Exception("Failed sending event: " + responsePost$default.code());
            }
            responsePost$default.close();
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            return Result.m7376boximpl(objM7377constructorimpl);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

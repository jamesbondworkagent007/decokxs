package com.okinc.network.util;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yFA;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes9.dex */
public final class ConnectionUtilsImpl$checkHttpConnectivity$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ OkHttpClient $client;
    final /* synthetic */ String $testUrl;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionUtilsImpl$checkHttpConnectivity$2(String str, OkHttpClient okHttpClient, Continuation<? super ConnectionUtilsImpl$checkHttpConnectivity$2> continuation) {
        super(2, continuation);
        this.$testUrl = str;
        this.$client = okHttpClient;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConnectionUtilsImpl$checkHttpConnectivity$2(this.$testUrl, this.$client, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((ConnectionUtilsImpl$checkHttpConnectivity$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zIsSuccessful;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                Response responseExecute = this.$client.newCall(new Request.Builder().url(this.$testUrl).get().build()).execute();
                String str = this.$testUrl;
                try {
                    zIsSuccessful = responseExecute.isSuccessful();
                    if (!zIsSuccessful) {
                        pUU.valueOf("ConnectionUtils", "checkHttpConnectivity, failed for " + str + ", response code: " + responseExecute.code());
                    }
                    yFA.copydefault(responseExecute, null);
                } finally {
                }
            } catch (Exception e) {
                pUU.valueOf("ConnectionUtils", "checkHttpConnectivity, failed for " + this.$testUrl + ", error: " + e);
                zIsSuccessful = false;
            }
            return C56443yFo.KWHzl(zIsSuccessful);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

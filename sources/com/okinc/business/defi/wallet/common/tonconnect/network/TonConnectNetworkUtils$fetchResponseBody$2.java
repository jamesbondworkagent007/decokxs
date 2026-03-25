package com.okinc.business.defi.wallet.common.tonconnect.network;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C16066ecs;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class TonConnectNetworkUtils$fetchResponseBody$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ C16066ecs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TonConnectNetworkUtils$fetchResponseBody$2(C16066ecs c16066ecs, String str, Continuation<? super TonConnectNetworkUtils$fetchResponseBody$2> continuation) {
        super(2, continuation);
        this.this$0 = c16066ecs;
        this.$url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TonConnectNetworkUtils$fetchResponseBody$2(this.this$0, this.$url, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((TonConnectNetworkUtils$fetchResponseBody$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        Response responseExecute;
        String str = "";
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Response response = null;
            Response response2 = null;
            try {
                responseExecute = this.this$0.AEQbTJ().newCall(this.this$0.AEQbTJ(this.$url).get().build()).execute();
                try {
                    ResponseBody responseBodyBody = responseExecute.body();
                    String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                    if (strString != null) {
                        str = strString;
                    }
                } catch (Exception e) {
                    e = e;
                    response2 = responseExecute;
                    try {
                        pUU.AEQbTJ("TonConnectNetworkUtils", "Failed to fetch response body", e);
                        if (response2 != null) {
                            responseExecute = response2;
                        }
                        return str;
                    } catch (Throwable th2) {
                        responseExecute = response2;
                        th = th2;
                        th = th;
                        response = responseExecute;
                        if (response != null) {
                            response.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    response = responseExecute;
                    if (response != null) {
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            } catch (Throwable th4) {
                th = th4;
                if (response != null) {
                }
                throw th;
            }
            responseExecute.close();
            return str;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

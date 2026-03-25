package o;

import androidx.work.WorkRequest;
import com.okinc.business.defi.wallet.common.tonconnect.network.SSEvent;
import com.okinc.business.defi.wallet.common.tonconnect.network.TonConnectNetworkUtils$fetchResponseBody$2;
import com.okinc.business.defi.wallet.common.tonconnect.network.TonConnectNetworkUtils$sendWalletEvent$1;
import com.okinc.business.defi.wallet.common.tonconnect.network.TonConnectNetworkUtils$sendWalletEvent$2;
import com.okinc.business.defi.wallet.common.tonconnect.network.TonConnectNetworkUtils$sse$1;
import com.okinc.business.defi.wallet.common.tonconnect.network.TonConnectNetworkUtils$sse$2;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt;
import kotlinx.serialization.json.Json;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ecs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16066ecs {
    public final C48787ucK AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final Json copydefault;

    public C16066ecs(@NotNull C48787ucK c48787ucK, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(c48787ucK, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(json, "");
        this.AEQbTJ = c48787ucK;
        this.OLrzqt = coroutineDispatcher;
        this.copydefault = json;
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.ecp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C16066ecs.KWHzl();
            }
        });
    }

    public final java.lang.String copydefault() {
        return C34703nhO.copydefault() ? valueOf() : (C34703nhO.AEQbTJ() && AhwBna()) ? djBIcL() : OLrzqt();
    }

    public final java.lang.String OLrzqt() {
        try {
            return this.AEQbTJ.copydefault("tonConnect.bridgeUrl", "https://www.okx.com/tonbridge/discover/rpc/bridge");
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("TonConnectNetworkUtils", "Error getting global bridge", e);
            return "https://www.okx.com/tonbridge/discover/rpc/bridge";
        }
    }

    public final java.lang.String djBIcL() {
        try {
            return this.AEQbTJ.copydefault("tonConnect.trBridgeUrl", "https://tr.okx.com/tonbridge/discover/rpc/bridge");
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("TonConnectNetworkUtils", "Error getting TR bridge", e);
            return "https://tr.okx.com/tonbridge/discover/rpc/bridge";
        }
    }

    public final java.lang.String valueOf() {
        try {
            return this.AEQbTJ.copydefault("tonConnect.walletBridgeUrl", "https://web3.okx.com/tonbridge/discover/rpc/bridge");
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("TonConnectNetworkUtils", "Error getting wallet bridge", e);
            return "https://web3.okx.com/tonbridge/discover/rpc/bridge";
        }
    }

    public final boolean AhwBna() {
        try {
            return this.AEQbTJ.copydefault("tonConnect.shouldUseTrValidation", false);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("TonConnectNetworkUtils", "Error getting tr validation var", e);
            return false;
        }
    }

    public final OkHttpClient AEQbTJ() {
        return (OkHttpClient) this.KWHzl.getValue();
    }

    public static final OkHttpClient KWHzl() {
        OkHttpClient.Builder builderRetryOnConnectionFailure = new OkHttpClient().newBuilder().retryOnConnectionFailure(false);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        return builderRetryOnConnectionFailure.connectTimeout(WorkRequest.MIN_BACKOFF_MILLIS, timeUnit).readTimeout(WorkRequest.MIN_BACKOFF_MILLIS, timeUnit).writeTimeout(WorkRequest.MIN_BACKOFF_MILLIS, timeUnit).callTimeout(WorkRequest.MIN_BACKOFF_MILLIS, timeUnit).build();
    }

    public final Flow<SSEvent> copydefault(@NotNull java.util.List<java.lang.String> list, java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return FlowKt.emptyFlow();
        }
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null);
        java.lang.String str2 = copydefault() + "/events?client_id=" + strJoinToString$default;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            str2 = str2 + "&last_event_id=" + str;
        }
        pUU.EZpvd("TonConnectNetworkUtils", "Listening to events, url " + str2);
        return OLrzqt(AEQbTJ(), str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<Unit>> continuation) {
        TonConnectNetworkUtils$sendWalletEvent$1 tonConnectNetworkUtils$sendWalletEvent$1;
        if (continuation instanceof TonConnectNetworkUtils$sendWalletEvent$1) {
            tonConnectNetworkUtils$sendWalletEvent$1 = (TonConnectNetworkUtils$sendWalletEvent$1) continuation;
            int i = tonConnectNetworkUtils$sendWalletEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tonConnectNetworkUtils$sendWalletEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                tonConnectNetworkUtils$sendWalletEvent$1 = new TonConnectNetworkUtils$sendWalletEvent$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = tonConnectNetworkUtils$sendWalletEvent$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tonConnectNetworkUtils$sendWalletEvent$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            TonConnectNetworkUtils$sendWalletEvent$2 tonConnectNetworkUtils$sendWalletEvent$2 = new TonConnectNetworkUtils$sendWalletEvent$2(this, str, str2, str3, null);
            tonConnectNetworkUtils$sendWalletEvent$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, tonConnectNetworkUtils$sendWalletEvent$2, tonConnectNetworkUtils$sendWalletEvent$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.String> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new TonConnectNetworkUtils$fetchResponseBody$2(this, str, null), continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ecs */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Response post$default(C16066ecs c16066ecs, OkHttpClient okHttpClient, java.lang.String str, RequestBody requestBody, android.util.ArrayMap arrayMap, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            arrayMap = null;
        }
        return c16066ecs.copydefault(okHttpClient, str, requestBody, arrayMap);
    }

    public final Response copydefault(OkHttpClient okHttpClient, java.lang.String str, RequestBody requestBody, android.util.ArrayMap<java.lang.String, java.lang.String> arrayMap) {
        Request.Builder builderAEQbTJ = AEQbTJ(str);
        builderAEQbTJ.post(requestBody);
        if (arrayMap != null) {
            for (Map.Entry<java.lang.String, java.lang.String> entry : arrayMap.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String value = entry.getValue();
                Intrinsics.copydefault((java.lang.Object) key);
                Intrinsics.copydefault((java.lang.Object) value);
                builderAEQbTJ.addHeader(key, value);
            }
        }
        return okHttpClient.newCall(builderAEQbTJ.build()).execute();
    }

    /* JADX DEBUG: Class process forced to load method for inline: kotlinx.coroutines.flow.FlowKt.retry$default(kotlinx.coroutines.flow.Flow, long, kotlin.jvm.functions.Function2, int, java.lang.Object):kotlinx.coroutines.flow.Flow */
    public final Flow<SSEvent> OLrzqt(OkHttpClient okHttpClient, java.lang.String str) {
        return FlowKt__ErrorsKt.retry$default(FlowKt.callbackFlow(new TonConnectNetworkUtils$sse$1(this, str, okHttpClient, null)), 0L, new TonConnectNetworkUtils$sse$2(null), 1, null);
    }

    public final Request.Builder AEQbTJ(java.lang.String str) {
        return new Request.Builder().url(str);
    }
}

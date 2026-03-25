package o;

import aws.smithy.kotlin.runtime.telemetry.trace.SpanStatus;
import java.net.InetSocketAddress;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import kotlin.time.TimeMark;
import o.C59462zhW;
import o.GY;
import o.InterfaceC5148Go;
import o.InterfaceC59524zif;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AJ extends EventListener {
    public final DE AEQbTJ;
    public final ConnectionPool AYXKKw;
    public TimeMark AhwBna;
    public boolean DbNXlk;
    public TimeMark EZpvd;
    public TimeMark KWHzl;
    public final InterfaceC5148Go OLrzqt;
    public final Dispatcher copydefault;
    public final FZ djBIcL;
    public final GU fetchVPNInfo;
    public final AK gEmmrt;
    public boolean isConnected;
    public long valueOf;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AJ(@NotNull ConnectionPool connectionPool, @NotNull DE de, @NotNull Dispatcher dispatcher, @NotNull AK ak, @NotNull Call call) {
        InterfaceC5148Go interfaceC5148GoOLrzqt;
        CoroutineContext coroutineContextEZpvd;
        CoroutineContext coroutineContextEZpvd2;
        Intrinsics.checkNotNullParameter(connectionPool, "");
        Intrinsics.checkNotNullParameter(de, "");
        Intrinsics.checkNotNullParameter(dispatcher, "");
        Intrinsics.checkNotNullParameter(ak, "");
        Intrinsics.checkNotNullParameter(call, "");
        this.AYXKKw = connectionPool;
        this.AEQbTJ = de;
        this.copydefault = dispatcher;
        this.gEmmrt = ak;
        C4409Bd c4409Bd = (C4409Bd) call.request().tag(C4409Bd.class);
        FZ fzOLrzqt = (c4409Bd == null || (coroutineContextEZpvd2 = c4409Bd.EZpvd()) == null || (fzOLrzqt = FX.KWHzl(coroutineContextEZpvd2)) == null) ? FZ.AYXKKw.OLrzqt() : fzOLrzqt;
        this.djBIcL = fzOLrzqt;
        this.fetchVPNInfo = GY.ActionBar.createSpan$default(fzOLrzqt.copydefault().EZpvd("aws.smithy.kotlin.runtime.http.engine.okhttp"), "HTTP", null, null, null, 14, null);
        C4409Bd c4409Bd2 = (C4409Bd) call.request().tag(C4409Bd.class);
        if (c4409Bd2 == null || (coroutineContextEZpvd = c4409Bd2.EZpvd()) == null) {
            InterfaceC5146Gm interfaceC5146GmKWHzl = InterfaceC5146Gm.EZpvd.KWHzl();
            java.lang.String strGEmmrt = C56524yIo.AEQbTJ(AU.class).gEmmrt();
            if (strGEmmrt == null) {
                throw new java.lang.IllegalArgumentException("getLogger<T> cannot be used on an anonymous object".toString());
            }
            interfaceC5148GoOLrzqt = interfaceC5146GmKWHzl.OLrzqt(strGEmmrt);
        } else {
            java.lang.String strGEmmrt2 = C56524yIo.AEQbTJ(AU.class).gEmmrt();
            if (strGEmmrt2 == null) {
                throw new java.lang.IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
            }
            interfaceC5148GoOLrzqt = C5141Gh.OLrzqt(coroutineContextEZpvd, strGEmmrt2);
            if (interfaceC5148GoOLrzqt == null) {
            }
        }
        this.OLrzqt = interfaceC5148GoOLrzqt;
        C59462zhW.Activity activity = C59462zhW.OLrzqt;
        this.valueOf = C59519zia.EZpvd(0, DurationUnit.SECONDS);
    }

    @Override // okhttp3.EventListener
    public void callStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
        this.EZpvd = InterfaceC59524zif.StateListAnimator.Application.copydefault(InterfaceC59524zif.StateListAnimator.AEQbTJ.EZpvd());
        this.gEmmrt.OLrzqt(this.copydefault.queuedCallsCount());
        this.gEmmrt.copydefault(this.copydefault.runningCallsCount());
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$callStart$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "call started";
            }
        }, 1, null);
    }

    @Override // okhttp3.EventListener
    public void dnsStart(@NotNull Call call, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = InterfaceC59524zif.StateListAnimator.Application.copydefault(InterfaceC59524zif.StateListAnimator.AEQbTJ.EZpvd());
        if (!this.DbNXlk) {
            TimeMark timeMark = this.EZpvd;
            if (timeMark != null) {
                this.valueOf = timeMark.copydefault();
                GF.m8550recordSecondsdWUq8MI$default(this.gEmmrt.djBIcL(), this.valueOf, null, null, 6, null);
                this.DbNXlk = true;
            } else {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
        }
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$dnsStart$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "dns query: domain=" + str;
            }
        }, 1, null);
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(@NotNull Call call, @NotNull final Connection connection) {
        long jOLrzqt;
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(connection, "");
        this.gEmmrt.AEQbTJ(this.AYXKKw.connectionCount());
        this.gEmmrt.KWHzl(this.AYXKKw.idleConnectionCount());
        TimeMark timeMark = this.EZpvd;
        if (timeMark == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        if (!this.DbNXlk) {
            this.DbNXlk = true;
            this.valueOf = timeMark.copydefault();
            GF.m8550recordSecondsdWUq8MI$default(this.gEmmrt.djBIcL(), this.valueOf, null, null, 6, null);
        }
        if (!this.isConnected) {
            this.isConnected = true;
            TimeMark timeMark2 = this.KWHzl;
            if (timeMark2 != null) {
                Intrinsics.copydefault(timeMark2);
                jOLrzqt = timeMark2.copydefault();
            } else {
                jOLrzqt = C59462zhW.OLrzqt(timeMark.copydefault(), this.valueOf);
            }
            GF.m8550recordSecondsdWUq8MI$default(this.gEmmrt.AEQbTJ(), jOLrzqt, null, null, 6, null);
        }
        final int iIdentityHashCode = java.lang.System.identityHashCode(connection);
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$connectionAcquired$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "connection acquired: conn(id=" + iIdentityHashCode + ")=" + connection + "; connPool: total=" + this.AYXKKw.connectionCount() + ", idle=" + this.AYXKKw.idleConnectionCount();
            }
        }, 1, null);
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(@NotNull Call call, @NotNull Request request) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(request, "");
        if (request.body() == null) {
            this.AhwBna = InterfaceC59524zif.StateListAnimator.Application.copydefault(InterfaceC59524zif.StateListAnimator.AEQbTJ.EZpvd());
        }
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$requestHeadersEnd$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "finished sending request headers";
            }
        }, 1, null);
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(@NotNull Call call, final long j) {
        Intrinsics.checkNotNullParameter(call, "");
        this.AhwBna = InterfaceC59524zif.StateListAnimator.Application.copydefault(InterfaceC59524zif.StateListAnimator.AEQbTJ.EZpvd());
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$requestBodyEnd$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "finished sending request body: bytesSent=" + j;
            }
        }, 1, null);
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(@NotNull Call call) {
        DT dtCopydefault;
        Intrinsics.checkNotNullParameter(call, "");
        TimeMark timeMark = this.AhwBna;
        if (timeMark != null) {
            long jCopydefault = timeMark.copydefault();
            GF.m8550recordSecondsdWUq8MI$default(this.gEmmrt.gEmmrt(), jCopydefault, null, null, 6, null);
            C4409Bd c4409Bd = (C4409Bd) call.request().tag(C4409Bd.class);
            if (c4409Bd != null && (dtCopydefault = c4409Bd.copydefault()) != null) {
                dtCopydefault.OLrzqt(C3815At.EZpvd.KWHzl(), C59462zhW.KWHzl(jCopydefault));
            }
        }
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$responseHeadersStart$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "response headers start";
            }
        }, 1, null);
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(response, "");
        ResponseBody responseBodyBody = response.body();
        final java.lang.Long lValueOf = responseBodyBody != null ? java.lang.Long.valueOf(responseBodyBody.contentLength()) : null;
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$responseHeadersEnd$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "response headers end: contentLengthHeader=" + lValueOf;
            }
        }, 1, null);
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(@NotNull Call call, @NotNull final Connection connection) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(connection, "");
        this.gEmmrt.AEQbTJ(this.AYXKKw.connectionCount());
        this.gEmmrt.KWHzl(this.AYXKKw.idleConnectionCount());
        final int iIdentityHashCode = java.lang.System.identityHashCode(connection);
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$connectionReleased$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "connection released: conn(id=" + iIdentityHashCode + ")=" + connection + "; connPool: total=" + this.AYXKKw.connectionCount() + ", idle=" + this.AYXKKw.idleConnectionCount();
            }
        }, 1, null);
    }

    @Override // okhttp3.EventListener
    public void callEnd(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
        this.gEmmrt.OLrzqt(this.copydefault.queuedCallsCount());
        this.gEmmrt.copydefault(this.copydefault.runningCallsCount());
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$callEnd$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "call complete";
            }
        }, 1, null);
        this.fetchVPNInfo.close();
    }

    @Override // okhttp3.EventListener
    public void callFailed(@NotNull Call call, @NotNull java.io.IOException iOException) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(iOException, "");
        this.gEmmrt.OLrzqt(this.copydefault.queuedCallsCount());
        this.gEmmrt.copydefault(this.copydefault.runningCallsCount());
        this.OLrzqt.AEQbTJ(iOException, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$callFailed$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "call failed";
            }
        });
        GX.AEQbTJ(this.fetchVPNInfo, iOException, true);
        this.fetchVPNInfo.KWHzl(SpanStatus.ERROR);
        this.fetchVPNInfo.close();
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(@NotNull Call call, @NotNull final java.lang.String str, @NotNull final java.util.List<? extends java.net.InetAddress> list) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$dnsEnd$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "dns resolved: domain=" + str + "; records=" + list;
            }
        }, 1, null);
    }

    @Override // okhttp3.EventListener
    public void proxySelectStart(@NotNull Call call, @NotNull final HttpUrl httpUrl) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(httpUrl, "");
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$proxySelectStart$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "proxy select start: url=" + httpUrl;
            }
        }, 1, null);
    }

    @Override // okhttp3.EventListener
    public void proxySelectEnd(@NotNull Call call, @NotNull final HttpUrl httpUrl, @NotNull final java.util.List<? extends java.net.Proxy> list) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(httpUrl, "");
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$proxySelectEnd$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "proxy select end: url=" + httpUrl + "; proxies=" + list;
            }
        }, 1, null);
    }

    @Override // okhttp3.EventListener
    public void connectStart(@NotNull Call call, @NotNull final InetSocketAddress inetSocketAddress, @NotNull final java.net.Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "");
        Intrinsics.checkNotNullParameter(proxy, "");
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$connectStart$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "starting connection: addr=" + inetSocketAddress + "; proxy=" + proxy;
            }
        }, 1, null);
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$secureConnectStart$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "initiating TLS connection";
            }
        }, 1, null);
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(@NotNull Call call, final Handshake handshake) {
        Intrinsics.checkNotNullParameter(call, "");
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$secureConnectEnd$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "TLS connect end: handshake=" + handshake;
            }
        }, 1, null);
    }

    @Override // okhttp3.EventListener
    public void connectEnd(@NotNull Call call, @NotNull final InetSocketAddress inetSocketAddress, @NotNull final java.net.Proxy proxy, final Protocol protocol) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "");
        Intrinsics.checkNotNullParameter(proxy, "");
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$connectEnd$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "connection established: addr=" + inetSocketAddress + "; proxy=" + proxy + "; protocol=" + protocol;
            }
        }, 1, null);
    }

    @Override // okhttp3.EventListener
    public void connectFailed(@NotNull Call call, @NotNull final InetSocketAddress inetSocketAddress, @NotNull final java.net.Proxy proxy, final Protocol protocol, @NotNull java.io.IOException iOException) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "");
        Intrinsics.checkNotNullParameter(proxy, "");
        Intrinsics.checkNotNullParameter(iOException, "");
        this.OLrzqt.AEQbTJ(iOException, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$connectFailed$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "connect failed: addr=" + inetSocketAddress + "; proxy=" + proxy + "; protocol=" + protocol;
            }
        });
        DE de = this.AEQbTJ;
        java.net.InetAddress address = inetSocketAddress.getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "");
        de.KWHzl(DF.copydefault(address));
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$requestHeadersStart$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "sending request headers";
            }
        }, 1, null);
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$requestBodyStart$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "sending request body";
            }
        }, 1, null);
    }

    @Override // okhttp3.EventListener
    public void requestFailed(@NotNull Call call, @NotNull java.io.IOException iOException) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(iOException, "");
        this.OLrzqt.AEQbTJ(iOException, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$requestFailed$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "request failed";
            }
        });
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$responseBodyStart$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "response body available";
            }
        }, 1, null);
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(@NotNull Call call, final long j) {
        Intrinsics.checkNotNullParameter(call, "");
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$responseBodyEnd$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "response body finished: bytesConsumed=" + j;
            }
        }, 1, null);
    }

    @Override // okhttp3.EventListener
    public void responseFailed(@NotNull Call call, @NotNull java.io.IOException iOException) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(iOException, "");
        this.OLrzqt.AEQbTJ(iOException, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$responseFailed$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "response failed";
            }
        });
    }

    @Override // okhttp3.EventListener
    public void canceled(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$canceled$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "call cancelled";
            }
        }, 1, null);
    }

    @Override // okhttp3.EventListener
    public void satisfactionFailure(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(response, "");
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$satisfactionFailure$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "cache satisfaction failure";
            }
        }, 1, null);
    }

    @Override // okhttp3.EventListener
    public void cacheConditionalHit(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(response, "");
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$cacheConditionalHit$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "cache conditional hit";
            }
        }, 1, null);
    }

    @Override // okhttp3.EventListener
    public void cacheHit(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(response, "");
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$cacheHit$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "cache hit";
            }
        }, 1, null);
    }

    @Override // okhttp3.EventListener
    public void cacheMiss(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
        InterfaceC5148Go.TaskDescription.trace$default(this.OLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.HttpEngineEventListener$cacheMiss$$inlined$trace$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "cache miss";
            }
        }, 1, null);
    }
}

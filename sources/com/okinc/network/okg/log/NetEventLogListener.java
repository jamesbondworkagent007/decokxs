package com.okinc.network.okg.log;

import android.content.Context;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.network.okg.dns.model.DOHProcessParam;
import com.okinc.network.okg.response.OKServerException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C43292rmY;
import o.C43346rnZ;
import o.C43365rns;
import o.C43412rom;
import o.C43453rpa;
import o.C43466rpn;
import o.C56444yFp;
import o.C59449zhJ;
import o.InterfaceC56445yFq;
import o.pUU;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class NetEventLogListener extends EventListener {
    public static final Companion Companion = new Companion(null);
    public static final int OLrzqt = 8;
    public long AEQbTJ;
    public String AYXKKw;
    public volatile String AhwBna;
    public String AkhnZx;
    public Response DbNXlk;
    public final CallChainEventListener EZpvd;
    public final String KWHzl;
    public long copydefault;
    public final Context djBIcL;
    public String gEmmrt;
    public Request isConnected;
    public NetEventData valueOf;
    public final Companion.RequestType values;

    public NetEventLogListener(@NotNull Context context, @NotNull Companion.RequestType requestType, long j, @NotNull HttpUrl httpUrl, long j2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(requestType, "");
        Intrinsics.checkNotNullParameter(httpUrl, "");
        this.djBIcL = context;
        this.values = requestType;
        this.KWHzl = "NetEventLogListener";
        this.AhwBna = "";
        this.AkhnZx = "";
        this.EZpvd = new CallChainEventListener();
        this.AkhnZx = httpUrl.encodedPath();
        this.AEQbTJ = j;
        this.copydefault = j2;
        NetEventData netEventData = new NetEventData("http", this.AkhnZx);
        this.valueOf = netEventData;
        netEventData.setDohType(DohTypeEnum.HTTP);
        this.valueOf.setDest_domain(httpUrl.host());
        this.gEmmrt = "";
        this.AYXKKw = "";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.log.NetEventLogListener.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static final class ActionBar implements EventListener.Factory {
            public final AtomicLong EZpvd = new AtomicLong(1);
            public final /* synthetic */ RequestType KWHzl;
            public final /* synthetic */ Context OLrzqt;

            public ActionBar(Context context, RequestType requestType) {
                this.OLrzqt = context;
                this.KWHzl = requestType;
            }

            @Override // okhttp3.EventListener.Factory
            public EventListener create(Call call) {
                Intrinsics.checkNotNullParameter(call, "");
                long andIncrement = this.EZpvd.getAndIncrement();
                Context applicationContext = this.OLrzqt.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                return new NetEventLogListener(applicationContext, this.KWHzl, andIncrement, call.request().url(), System.nanoTime());
            }
        }

        public final EventListener.Factory OLrzqt(@NotNull Context context, @NotNull RequestType requestType) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(requestType, "");
            return new ActionBar(context, requestType);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class RequestType {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ RequestType[] $VALUES;
            public static final RequestType NATIVE = new RequestType("NATIVE", 0, "native");
            public static final RequestType WEBVIEW = new RequestType("WEBVIEW", 1, "webview");
            private final String type;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ RequestType[] $values() {
                return new RequestType[]{NATIVE, WEBVIEW};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<RequestType> getEntries() {
                return $ENTRIES;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getType() {
                return this.type;
            }

            private RequestType(String str, int i, String str2) {
                this.type = str2;
            }

            static {
                RequestType[] requestTypeArr$values = $values();
                $VALUES = requestTypeArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(requestTypeArr$values);
            }

            public static RequestType valueOf(String str) {
                return (RequestType) Enum.valueOf(RequestType.class, str);
            }

            public static RequestType[] values() {
                return (RequestType[]) $VALUES.clone();
            }
        }
    }

    public final void KWHzl(String str) {
        double dNanoTime = (System.nanoTime() - this.copydefault) / 1.0E9d;
        if (C43466rpn.OLrzqt.AEQbTJ(this.AkhnZx)) {
            return;
        }
        if (C59449zhJ.AYXKKw(str, "callFailed", true) || C59449zhJ.AYXKKw(str, "callEnd", true)) {
            boolean zAYXKKw = C59449zhJ.AYXKKw(str, "callEnd", true);
            pUU.EZpvd(this.KWHzl, "recordEventLog: " + str + ", ip: " + this.AhwBna + ", exception: " + this.gEmmrt);
            C43346rnZ.KWHzl.OLrzqt(this.djBIcL, zAYXKKw, this.AhwBna, this.gEmmrt, String.valueOf(dNanoTime), String.valueOf(this.AEQbTJ), this.AYXKKw);
        }
    }

    @Override // okhttp3.EventListener
    public void callStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
        super.callStart(call);
        this.valueOf.callStart();
        this.valueOf.appendErrorAttribute(FirebaseAnalytics.Param.METHOD, call.request().method());
        this.valueOf.appendErrorAttribute("type", this.values.getType());
        KWHzl("callStart");
    }

    @Override // okhttp3.EventListener
    public void dnsStart(@NotNull Call call, @NotNull String str) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(str, "");
        super.dnsStart(call, str);
        this.EZpvd.dnsStart(call, str);
        KWHzl("dnsStart " + str);
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(@NotNull Call call, @NotNull String str, @NotNull List<? extends InetAddress> list) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        super.dnsEnd(call, str, list);
        this.valueOf.setDest_domain(str);
        KWHzl("dnsEnd " + str + " inetAddressList=" + list);
    }

    @Override // okhttp3.EventListener
    public void connectStart(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "");
        Intrinsics.checkNotNullParameter(proxy, "");
        super.connectStart(call, inetSocketAddress, proxy);
        this.valueOf.connectStart();
        KWHzl("connectStart inetSocketAddress=" + inetSocketAddress + " proxy=" + proxy);
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
        super.secureConnectStart(call);
        KWHzl("secureConnectStart");
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(@NotNull Call call, Handshake handshake) {
        Intrinsics.checkNotNullParameter(call, "");
        super.secureConnectEnd(call, handshake);
        KWHzl("secureConnectEnd");
    }

    @Override // okhttp3.EventListener
    public void connectEnd(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, Protocol protocol) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "");
        Intrinsics.checkNotNullParameter(proxy, "");
        super.connectEnd(call, inetSocketAddress, proxy, protocol);
        String hostAddress = inetSocketAddress.getAddress().getHostAddress();
        this.AhwBna = hostAddress != null ? hostAddress : "";
        this.valueOf.connectEnd();
        KWHzl("connectEnd inetSocketAddress=" + inetSocketAddress + " proxy=" + proxy + " protocol=" + protocol + " ip=" + this.AhwBna);
    }

    @Override // okhttp3.EventListener
    public void connectFailed(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, Protocol protocol, @NotNull IOException iOException) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "");
        Intrinsics.checkNotNullParameter(proxy, "");
        Intrinsics.checkNotNullParameter(iOException, "");
        super.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
        this.EZpvd.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
        InetAddress address = inetSocketAddress.getAddress();
        if (address != null) {
            String hostAddress = address.getHostAddress();
            String str = hostAddress != null ? hostAddress : "";
            if (C33129mqd.OLrzqt((CharSequence) str)) {
                if (this.AhwBna.length() != 0) {
                    str = this.AhwBna + "," + str;
                }
                this.AhwBna = str;
            }
        }
        KWHzl("connectFailed inetSocketAddress=" + inetSocketAddress + " proxy=" + proxy + " protocol=" + protocol + " exception=" + iOException);
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(@NotNull Call call, @NotNull Connection connection) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(connection, "");
        super.connectionAcquired(call, connection);
        this.EZpvd.connectionAcquired(call, connection);
        KWHzl("connectionAcquired");
        if (this.valueOf.isDestDomainInitValue()) {
            this.valueOf.setDest_domain(connection.route().address().url().host());
        }
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(@NotNull Call call, @NotNull Connection connection) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(connection, "");
        super.connectionReleased(call, connection);
        KWHzl("connectionReleased");
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
        super.requestHeadersStart(call);
        KWHzl("requestHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(@NotNull Call call, @NotNull Request request) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(request, "");
        super.requestHeadersEnd(call, request);
        this.isConnected = request;
        KWHzl("requestHeadersEnd");
        NetEventData netEventData = this.valueOf;
        DOHProcessParam dOHProcessParam = (DOHProcessParam) request.tag(DOHProcessParam.class);
        netEventData.setUseDoh((dOHProcessParam != null ? dOHProcessParam.getDohUrl() : null) != null);
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
        super.requestBodyStart(call);
        KWHzl("requestBodyStart");
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(@NotNull Call call, long j) {
        Intrinsics.checkNotNullParameter(call, "");
        super.requestBodyEnd(call, j);
        this.valueOf.appendErrorAttribute("request_size", String.valueOf(j));
        KWHzl("requestBodyEnd");
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
        super.responseHeadersStart(call);
        KWHzl("responseHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(response, "");
        super.responseHeadersEnd(call, response);
        this.DbNXlk = response;
        KWHzl("responseHeadersEnd");
        this.valueOf.setError_code(response.code() == 200 ? "0" : String.valueOf(response.code()));
        if (this.valueOf.isDestDomainInitValue()) {
            this.valueOf.setDest_domain(response.request().url().host());
        }
    }

    @Override // okhttp3.EventListener
    public void cacheConditionalHit(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(response, "");
        super.cacheConditionalHit(call, response);
        pUU.EZpvd(this.KWHzl, "cacheConditionalHit: " + call.request().url() + ", response: " + response);
    }

    @Override // okhttp3.EventListener
    public void cacheHit(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(response, "");
        super.cacheHit(call, response);
        pUU.EZpvd(this.KWHzl, "cacheHit: " + call.request().url() + ", response: " + response);
    }

    @Override // okhttp3.EventListener
    public void requestFailed(@NotNull Call call, @NotNull IOException iOException) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(iOException, "");
        super.requestFailed(call, iOException);
        AEQbTJ(call, OLrzqt(iOException));
        pUU.valueOf(this.KWHzl, "requestFailed: " + call.request().url() + ", exception: " + Log.getStackTraceString(iOException));
    }

    @Override // okhttp3.EventListener
    public void responseFailed(@NotNull Call call, @NotNull IOException iOException) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(iOException, "");
        super.responseFailed(call, iOException);
        IOException iOExceptionOLrzqt = OLrzqt(iOException);
        AEQbTJ(call, iOExceptionOLrzqt);
        pUU.EZpvd(this.KWHzl, "responseFailed: " + call.request().url() + ", exception: " + iOExceptionOLrzqt + ",before unwrap:" + Log.getStackTraceString(iOException));
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
        super.responseBodyStart(call);
        KWHzl("responseBodyStart");
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(@NotNull Call call, long j) {
        Intrinsics.checkNotNullParameter(call, "");
        super.responseBodyEnd(call, j);
        this.valueOf.appendErrorAttribute("compressed_response_size", String.valueOf(j));
        KWHzl("responseBodyEnd");
    }

    @Override // okhttp3.EventListener
    public void callEnd(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
        super.callEnd(call);
        EZpvd(call, this.DbNXlk);
        KWHzl("callEnd");
    }

    @Override // okhttp3.EventListener
    public void callFailed(@NotNull Call call, @NotNull IOException iOException) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(iOException, "");
        super.callFailed(call, iOException);
        IOException iOExceptionOLrzqt = OLrzqt(iOException);
        AEQbTJ(call, iOExceptionOLrzqt);
        KWHzl("callFailed exception=" + iOExceptionOLrzqt + ",before unwrap:" + iOException);
    }

    public final IOException OLrzqt(IOException iOException) {
        if (!(iOException instanceof OKServerException)) {
            return iOException;
        }
        OKServerException oKServerException = (OKServerException) iOException;
        return oKServerException.getOrigin() instanceof IOException ? (IOException) oKServerException.getOrigin() : iOException;
    }

    public final void AEQbTJ(Call call, IOException iOException) {
        this.gEmmrt = iOException.getClass().getSimpleName();
        String message = iOException.getMessage();
        if (message == null) {
            message = "";
        }
        this.AYXKKw = message;
        if (C43453rpa.AEQbTJ.KWHzl(this.djBIcL)) {
            if (KWHzl()) {
                OLrzqt(call, iOException);
                if (Intrinsics.EZpvd((Object) this.valueOf.getError_code(), (Object) "-20")) {
                    this.valueOf.appendErrorAttribute("ex", iOException.getClass().getSimpleName() + iOException.getMessage());
                }
            }
            EZpvd(call, null);
        }
    }

    public final void EZpvd(Call call, Response response) {
        String second;
        HttpUrl realUrl;
        if (this.valueOf.isCallEnd()) {
            pUU.EZpvd(this.KWHzl, "netEventEnd break cause request:" + this.valueOf.getUrl_path() + " has already tag as end!");
            return;
        }
        NetRequestExtraInfo netRequestExtraInfo = (NetRequestExtraInfo) KWHzl(response, NetRequestExtraInfo.class);
        if (netRequestExtraInfo != null) {
            this.valueOf.appendErrorAttribute("response_size", String.valueOf(netRequestExtraInfo.getDecompressedResponseSize()));
            this.valueOf.appendErrorAttribute("retryed_count", String.valueOf(netRequestExtraInfo.getRetryCount()));
        }
        Pair<String, String> pair = C43365rns.OLrzqt.AhwBna().get(call.request().url().encodedPath());
        DOHProcessParam dOHProcessParam = (DOHProcessParam) KWHzl(response, DOHProcessParam.class);
        if (dOHProcessParam == null || (second = dOHProcessParam.getSubdomainSite()) == null) {
            second = pair != null ? pair.getSecond() : "OKX_GLOBAL";
        }
        this.valueOf.appendErrorAttribute("siteCode", second);
        String strHost = (netRequestExtraInfo == null || (realUrl = netRequestExtraInfo.getRealUrl()) == null) ? null : realUrl.host();
        String first = pair != null ? pair.getFirst() : null;
        if (this.valueOf.isDestDomainInitValue() && first != null) {
            this.valueOf.setDest_domain(first);
        } else if (C33129mqd.OLrzqt((CharSequence) strHost)) {
            NetEventData netEventData = this.valueOf;
            Intrinsics.copydefault((Object) strHost);
            netEventData.setDest_domain(strHost);
        }
        this.valueOf.callEnd(response);
        C43292rmY c43292rmY = C43292rmY.OLrzqt;
        c43292rmY.fIwbmz().invoke(this.valueOf);
        if (!C43466rpn.OLrzqt.copydefault(this.AkhnZx) || KWHzl()) {
            return;
        }
        c43292rmY.hDKMBd().invoke(this.valueOf);
    }

    public final <T> T KWHzl(Response response, Class<T> cls) {
        Request request;
        T t = (response == null || (request = response.request()) == null) ? null : (T) request.tag(cls);
        if (t != null) {
            return t;
        }
        Request request2 = this.isConnected;
        T t2 = request2 != null ? (T) request2.tag(cls) : null;
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    public final boolean KWHzl() {
        return this.valueOf.isRespCodeNoChanged();
    }

    public final void OLrzqt(Call call, IOException iOException) {
        C43412rom c43412rom = C43412rom.OLrzqt;
        boolean zCopydefault = c43412rom.copydefault(iOException);
        this.valueOf.setError_code((zCopydefault || call.isCanceled()) ? "0" : c43412rom.OLrzqt(iOException));
        if (zCopydefault) {
            pUU.KWHzl(this.KWHzl, "report cancel request: " + this.AkhnZx);
            this.valueOf.appendErrorAttribute("extra_value", OtpEventTracker.OTP_EVENT_VALUE_CANCEL);
        }
    }
}

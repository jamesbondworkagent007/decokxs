package com.okinc.websocket.connection;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.gson.JsonObject;
import com.okinc.core.livelistener.OKWsConnectionState;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.log.NetEventData;
import com.okinc.rxutils.RxBus;
import com.okinc.websocket.bean.OKWSConnDataParseResult;
import com.okinc.websocket.connection.OKWSBaseConnection;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URL;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC58185ywX;
import o.C33129mqd;
import o.C33146mqu;
import o.C33149mqx;
import o.C33490mxT;
import o.C43292rmY;
import o.C43365rns;
import o.C43384roK;
import o.C43412rom;
import o.C56444yFp;
import o.C57553ykb;
import o.C57558ykg;
import o.C57569ykr;
import o.C57576yky;
import o.C59449zhJ;
import o.InterfaceC56445yFq;
import o.InterfaceC57564ykm;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.pUU;
import o.xVW;
import o.yDY;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.ws.WebSocketReader;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class OKWSBaseConnection extends WebSocketListener {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public volatile boolean AEQbTJ;
    public Response AYXKKw;
    public Request.Builder AhwBna;
    public WebSocket AkhnZx;
    public final InterfaceC57564ykm EZpvd;
    public final Handler KWHzl;
    public String copydefault;
    public String djBIcL;
    public final String fetchVPNInfo;
    public NetEventData gEmmrt;
    public InterfaceC58217yxC isConnected;
    public long valueOf;
    public WebSocketStatus values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copydefault;
    }

    public abstract Request EZpvd(@NotNull Request request);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.valueOf;
    }

    public abstract void KWHzl(@NotNull OKWsConnectionState oKWsConnectionState);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57564ykm OLrzqt() {
        return this.EZpvd;
    }

    public abstract void copydefault(@NotNull OKWSBaseConnection oKWSBaseConnection, @NotNull OKWSConnDataParseResult oKWSConnDataParseResult);

    public abstract void copydefault(boolean z);

    public OKWSBaseConnection(@NotNull InterfaceC57564ykm interfaceC57564ykm) {
        Intrinsics.checkNotNullParameter(interfaceC57564ykm, "");
        this.EZpvd = interfaceC57564ykm;
        this.values = WebSocketStatus.UNINITIALIZED;
        String strEZpvd = interfaceC57564ykm.EZpvd();
        this.fetchVPNInfo = strEZpvd;
        this.djBIcL = "";
        try {
            Request.Builder builderUrl = new Request.Builder().url(strEZpvd);
            String strCopydefault = xVW.copydefault();
            Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
            this.AhwBna = builderUrl.addHeader("devId", strCopydefault).addHeader("User-Agent", C43384roK.KWHzl.copydefault());
            this.djBIcL = new URL(EZpvd(strEZpvd)).getPath();
        } catch (Exception e) {
            e.printStackTrace();
            pUU.valueOf("OKWSBaseConnection", appendConnAndWebSocketInstanceInfo$default(this, "webSocket init request exception " + Unit.INSTANCE, null, 2, null));
        }
        this.KWHzl = new Handler(C57576yky.AEQbTJ.EZpvd(), new Handler.Callback() { // from class: o.ykn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                return OKWSBaseConnection.OLrzqt(this.OLrzqt, message);
            }
        });
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.websocket.connection.OKWSBaseConnection.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [96=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean OLrzqt(OKWSBaseConnection oKWSBaseConnection, Message message) {
        Intrinsics.checkNotNullParameter(message, "");
        int i = message.what;
        if (i == 256) {
            String string = message.getData().getString("type", "");
            if (string != null) {
                switch (string.hashCode()) {
                    case -991693602:
                        if (!string.equals("web_socket_failed")) {
                            pUU.copydefault("OKWSBaseConnection", appendConnAndWebSocketInstanceInfo$default(oKWSBaseConnection, "handle msg failed,unknown message type", null, 2, null));
                        } else {
                            oKWSBaseConnection.values = WebSocketStatus.FAILURE;
                            oKWSBaseConnection.KWHzl(OKWsConnectionState.FAILURE);
                            oKWSBaseConnection.OLrzqt(message.obj);
                            oKWSBaseConnection.copydefault();
                        }
                        break;
                    case 1156791083:
                        if (string.equals("web_socket_open")) {
                            oKWSBaseConnection.values = WebSocketStatus.CONNECTED;
                            oKWSBaseConnection.KWHzl(OKWsConnectionState.OPEN);
                            wsCallEnd$default(oKWSBaseConnection, null, 1, null);
                            break;
                        }
                        break;
                    case 1363784582:
                        if (string.equals("web_socket_message")) {
                            Object obj = message.obj;
                            if (obj != null && (obj instanceof OKWSConnDataParseResult)) {
                                Intrinsics.copydefault(obj, "");
                                OKWSConnDataParseResult oKWSConnDataParseResult = (OKWSConnDataParseResult) obj;
                                oKWSBaseConnection.copydefault(oKWSConnDataParseResult.getConnId());
                                oKWSBaseConnection.copydefault(oKWSBaseConnection, oKWSConnDataParseResult);
                            } else {
                                pUU.copydefault("OKWSBaseConnection", appendConnAndWebSocketInstanceInfo$default(oKWSBaseConnection, "MainThread: EventMessage error cause empty message.", null, 2, null));
                            }
                            break;
                        }
                        break;
                    case 1489593655:
                        if (string.equals("web_socket_close")) {
                            oKWSBaseConnection.values = WebSocketStatus.CLOSED;
                            oKWSBaseConnection.KWHzl(OKWsConnectionState.CLOSED);
                            oKWSBaseConnection.copydefault(false);
                            break;
                        }
                        break;
                }
            }
        } else if (i != 257) {
            pUU.copydefault("OKWSBaseConnection", appendConnAndWebSocketInstanceInfo$default(oKWSBaseConnection, "handle msg invalidate, msg what can't identify!", null, 2, null));
        } else {
            oKWSBaseConnection.fetchVPNInfo();
        }
        return true;
    }

    @Override // okhttp3.WebSocketListener
    public void onClosed(@NotNull WebSocket webSocket, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(webSocket, "");
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("OKWSBaseConnection", KWHzl("onClosed-->code:" + i + "---->reason:" + str + ", mConnId: " + this.copydefault, webSocket));
        if (this.AkhnZx == null || !copydefault(webSocket, "onClosed")) {
            InterfaceC58217yxC interfaceC58217yxC = this.isConnected;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            messageObtain.what = 256;
            bundle.putString("type", "web_socket_close");
            bundle.putString("data", i + " " + str);
            messageObtain.setData(bundle);
            this.KWHzl.sendMessage(messageObtain);
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onClosing(@NotNull WebSocket webSocket, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(webSocket, "");
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("OKWSBaseConnection", KWHzl("onClosing--=>code:" + i + "---->reason:" + str + ", mConnId: " + this.copydefault, webSocket));
    }

    @Override // okhttp3.WebSocketListener
    public void onFailure(@NotNull WebSocket webSocket, @NotNull Throwable th, Response response) {
        Intrinsics.checkNotNullParameter(webSocket, "");
        Intrinsics.checkNotNullParameter(th, "");
        pUU.valueOf("OKWSBaseConnection", KWHzl("onFailure, url: " + webSocket.request().url() + ", t: " + th + ", response: " + response + ", mConnId: " + this.copydefault, webSocket));
        this.AYXKKw = response;
        KWHzl(response, webSocket.request().url().encodedPath());
        if (!this.AEQbTJ) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 256;
            Bundle bundle = new Bundle();
            bundle.putString("type", "web_socket_failed");
            bundle.putString("data", th.getMessage());
            messageObtain.setData(bundle);
            messageObtain.obj = th;
            this.KWHzl.sendMessage(messageObtain);
        }
        copydefault(false);
    }

    public final void KWHzl(Response response, String str) {
        NetEventData netEventData = this.gEmmrt;
        if (netEventData != null && netEventData.isDestDomainInitValue()) {
            if (response != null) {
                netEventData.setDest_domain(response.request().url().host());
                return;
            }
            Pair<String, String> pair = C43365rns.OLrzqt.AhwBna().get(str);
            if (pair != null) {
                netEventData.setDest_domain(pair.getFirst());
            }
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(@NotNull WebSocket webSocket, @NotNull String str) {
        Intrinsics.checkNotNullParameter(webSocket, "");
        Intrinsics.checkNotNullParameter(str, "");
        super.onMessage(webSocket, str);
        KWHzl((Response) null, webSocket.request().url().encodedPath());
        if (copydefault(webSocket, "onMessage")) {
            return;
        }
        AEQbTJ(webSocket, str);
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(@NotNull WebSocket webSocket, @NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(webSocket, "");
        Intrinsics.checkNotNullParameter(byteString, "");
        super.onMessage(webSocket, byteString);
        KWHzl((Response) null, webSocket.request().url().encodedPath());
        if (copydefault(webSocket, "onMessage")) {
            return;
        }
        try {
            AEQbTJ(webSocket, C57576yky.AEQbTJ.AEQbTJ(byteString.toByteArray()));
        } catch (Exception e) {
            e.printStackTrace();
            pUU.copydefault("OKWSBaseConnection", appendConnAndWebSocketInstanceInfo$default(this, "onMessage exception->" + Unit.INSTANCE, null, 2, null));
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onOpen(@NotNull WebSocket webSocket, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(webSocket, "");
        Intrinsics.checkNotNullParameter(response, "");
        super.onOpen(webSocket, response);
        pUU.KWHzl("OKWSBaseConnection", KWHzl("onOpen-->url: " + this.fetchVPNInfo + ", response: " + response + ", mConnId:" + this.copydefault, webSocket));
        if (copydefault(webSocket, "onOpen")) {
            return;
        }
        this.AYXKKw = response;
        Message messageObtain = Message.obtain();
        messageObtain.what = 256;
        Bundle bundle = new Bundle();
        bundle.putString("type", "web_socket_open");
        messageObtain.setData(bundle);
        KWHzl(response, webSocket.request().url().encodedPath());
        this.KWHzl.sendMessage(messageObtain);
        DbNXlk();
    }

    public final boolean copydefault(WebSocket webSocket, String str) {
        if (!Intrinsics.EZpvd(webSocket, this.AkhnZx)) {
            pUU.EZpvd("OKWSBaseConnection", "webSocket " + str + " by a closed webSocket!");
        }
        return !Intrinsics.EZpvd(webSocket, this.AkhnZx);
    }

    public final void AYXKKw() {
        this.KWHzl.sendEmptyMessageDelayed(257, 5000L);
    }

    public final void AhwBna() {
        this.AEQbTJ = false;
        Request.Builder builder = this.AhwBna;
        if (builder == null) {
            pUU.valueOf("OKWSBaseConnection", appendConnAndWebSocketInstanceInfo$default(this, "initConnect----return cause url is invalidate: " + this.fetchVPNInfo, null, 2, null));
            return;
        }
        if (this.AkhnZx == null) {
            this.copydefault = null;
            this.KWHzl.removeMessages(256);
            Request requestEZpvd = EZpvd(builder.build());
            OkHttpClient okHttpClientOLrzqt = C57558ykg.AEQbTJ.OLrzqt(this.EZpvd);
            this.AkhnZx = okHttpClientOLrzqt.newWebSocket(requestEZpvd, this);
            int iRunningCallsCount = okHttpClientOLrzqt.dispatcher().runningCallsCount();
            int iQueuedCallsCount = okHttpClientOLrzqt.dispatcher().queuedCallsCount();
            pUU.KWHzl("OKWSBaseConnection", appendConnAndWebSocketInstanceInfo$default(this, "initConnect-->url:" + requestEZpvd.url() + ",running:" + iRunningCallsCount + ",queued:" + iQueuedCallsCount, null, 2, null));
            this.values = WebSocketStatus.PRE_CONNECTING;
            NetEventData netEventData = new NetEventData("ws", requestEZpvd.url().encodedPath());
            this.gEmmrt = netEventData;
            netEventData.setDohType(this.EZpvd.OLrzqt().getDnsDohType$OKNetwork_websocket());
            netEventData.setDest_domain(requestEZpvd.url().host());
            netEventData.callStart();
            gEmmrt();
        }
    }

    public final void gEmmrt() {
        InterfaceC58217yxC interfaceC58217yxC = this.isConnected;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("EVENT_COR_SITE_CHANGED");
        final Function1 function1 = new Function1() { // from class: o.ykl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKWSBaseConnection.copydefault(this.copydefault, (java.lang.String) obj);
            }
        };
        this.isConnected = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.yki
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                OKWSBaseConnection.EZpvd(function1, obj);
            }
        });
    }

    public static final void EZpvd(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(OKWSBaseConnection oKWSBaseConnection, String str) {
        if (oKWSBaseConnection.values == WebSocketStatus.CONNECTED) {
            pUU.KWHzl("OKWSBaseConnection", appendConnAndWebSocketInstanceInfo$default(oKWSBaseConnection, "listenCORConfigChanged, reconnect ws: " + oKWSBaseConnection.EZpvd.EZpvd(), null, 2, null));
            oKWSBaseConnection.copydefault();
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(WebSocket webSocket, String str) {
        pUU.EZpvd("OKWSBaseConnection", KWHzl("handleMessage, data: " + str, webSocket));
        if (AEQbTJ(str)) {
            return;
        }
        addReceiver$default(this, null, str, 1, null);
        OKWSConnDataParseResult oKWSConnDataParseResultCopydefault = this.EZpvd.copydefault(str);
        if (oKWSConnDataParseResultCopydefault != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = oKWSConnDataParseResultCopydefault;
            messageObtain.what = 256;
            Bundle bundle = new Bundle();
            bundle.putString("type", "web_socket_message");
            messageObtain.setData(bundle);
            this.KWHzl.sendMessage(messageObtain);
        }
    }

    public final boolean AEQbTJ(String str) {
        if (str == null) {
            return false;
        }
        JsonObject jsonObjectOLrzqt = C33490mxT.OLrzqt(str);
        int asInt = (jsonObjectOLrzqt == null || !jsonObjectOLrzqt.has("code")) ? 0 : jsonObjectOLrzqt.get("code").getAsInt();
        if (asInt != 30026 && asInt != 60014) {
            return false;
        }
        pUU.copydefault("OKWSBaseConnection", appendConnAndWebSocketInstanceInfo$default(this, "Requested too frequent, limit is exceeded, will reset connect!", null, 2, null));
        Message messageObtain = Message.obtain();
        messageObtain.what = 256;
        Bundle bundle = new Bundle();
        bundle.putString("type", "web_socket_failed");
        bundle.putString("data", "$60014 -- Requested too frequent");
        messageObtain.setData(bundle);
        this.KWHzl.sendMessage(messageObtain);
        return true;
    }

    public final boolean OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (djBIcL()) {
            addSender$default(this, null, str, 1, null);
            WebSocket webSocket = this.AkhnZx;
            zSend = webSocket != null ? webSocket.send(str) : false;
            if (StringsKt__StringsKt.AhwBna((CharSequence) str, (CharSequence) "token", true)) {
                str = "loginEvent";
            }
            pUU.KWHzl("OKWSBaseConnection", appendConnAndWebSocketInstanceInfo$default(this, "--send-channel-->" + str + ", result:" + zSend, null, 2, null));
        }
        return zSend;
    }

    public void EZpvd() {
        WebSocketStatus webSocketStatus = WebSocketStatus.UNINITIALIZED;
        this.values = webSocketStatus;
        this.AEQbTJ = true;
        this.KWHzl.removeMessages(257);
        this.KWHzl.removeMessages(256);
        if (yDY.gEmmrt(webSocketStatus, WebSocketStatus.PRE_CONNECTING, WebSocketStatus.CONNECTED).contains(this.values)) {
            WebSocket webSocket = this.AkhnZx;
            Boolean boolValueOf = webSocket != null ? Boolean.valueOf(webSocket.close(1000, EopTrackEvent.CLOSE)) : null;
            pUU.KWHzl("OKWSBaseConnection", appendConnAndWebSocketInstanceInfo$default(this, "try to close connection, result: " + boolValueOf + ", url: " + this.fetchVPNInfo + ", mConnId: " + this.copydefault, null, 2, null));
        }
        isConnected();
    }

    public final void isConnected() {
        this.AkhnZx = null;
        this.AYXKKw = null;
        this.gEmmrt = null;
        copydefault(false);
        C57553ykb.AEQbTJ.AEQbTJ(this);
    }

    public final void copydefault() {
        pUU.KWHzl("OKWSBaseConnection", appendConnAndWebSocketInstanceInfo$default(this, "destroyAndReconnect", null, 2, null));
        EZpvd();
        AYXKKw();
    }

    public void fetchVPNInfo() {
        this.KWHzl.removeMessages(257);
        if (StringsKt__StringsKt.fARcdN((CharSequence) this.fetchVPNInfo)) {
            String stackTraceString = Log.getStackTraceString(new IllegalArgumentException("Ws Url can not empty"));
            Intrinsics.checkNotNullExpressionValue(stackTraceString, "");
            pUU.copydefault("OKWSBaseConnection", appendConnAndWebSocketInstanceInfo$default(this, stackTraceString, null, 2, null));
        } else {
            AhwBna();
            C57553ykb.AEQbTJ.OLrzqt(this);
        }
    }

    public static /* synthetic */ void wsCallEnd$default(OKWSBaseConnection oKWSBaseConnection, Object obj, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: wsCallEnd");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        oKWSBaseConnection.OLrzqt(obj);
    }

    public final void OLrzqt(Object obj) {
        String strOLrzqt;
        NetEventData netEventData = this.gEmmrt;
        if (netEventData != null) {
            netEventData.callEnd(this.AYXKKw);
            if (obj == null || !(obj instanceof Throwable)) {
                strOLrzqt = "0";
            } else {
                pUU.valueOf("OKWSBaseConnection", appendConnAndWebSocketInstanceInfo$default(this, "url: " + this.fetchVPNInfo + ", =netEventData exception: " + obj, null, 2, null));
                strOLrzqt = C43412rom.OLrzqt.OLrzqt((Throwable) obj);
            }
            netEventData.setError_code(strOLrzqt);
            C43292rmY c43292rmY = C43292rmY.OLrzqt;
            c43292rmY.fIwbmz().invoke(netEventData);
            c43292rmY.hDKMBd().invoke(netEventData);
        }
    }

    public final boolean djBIcL() {
        return this.values == WebSocketStatus.CONNECTED;
    }

    public static /* synthetic */ void addSender$default(OKWSBaseConnection oKWSBaseConnection, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSender");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        oKWSBaseConnection.OLrzqt(str, str2);
    }

    public final void OLrzqt(String str, String str2) {
        if (C43292rmY.OLrzqt.AuCTelauCTel()) {
            RxBus.AEQbTJ(new C33146mqu(str, str2, this.djBIcL));
        }
    }

    public static /* synthetic */ void addReceiver$default(OKWSBaseConnection oKWSBaseConnection, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addReceiver");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        oKWSBaseConnection.EZpvd(str, str2);
    }

    public final void EZpvd(String str, String str2) {
        if (C43292rmY.OLrzqt.AuCTelauCTel()) {
            RxBus.AEQbTJ(new C33149mqx(str, str2, this.djBIcL));
        }
    }

    public final String EZpvd(String str) {
        if (C59449zhJ.AYXKKw(str, "ws:", true)) {
            String strSubstring = str.substring(3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            return "http:" + strSubstring;
        }
        if (!C59449zhJ.AYXKKw(str, "wss:", true)) {
            return str;
        }
        String strSubstring2 = str.substring(4);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        return "https:" + strSubstring2;
    }

    public final void copydefault(String str) {
        if (C33129mqd.OLrzqt((CharSequence) str)) {
            this.copydefault = str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class WebSocketStatus {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ WebSocketStatus[] $VALUES;
        public static final WebSocketStatus UNINITIALIZED = new WebSocketStatus("UNINITIALIZED", 0);
        public static final WebSocketStatus PRE_CONNECTING = new WebSocketStatus("PRE_CONNECTING", 1);
        public static final WebSocketStatus CONNECTED = new WebSocketStatus("CONNECTED", 2);
        public static final WebSocketStatus CLOSED = new WebSocketStatus("CLOSED", 3);
        public static final WebSocketStatus FAILURE = new WebSocketStatus("FAILURE", 4);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ WebSocketStatus[] $values() {
            return new WebSocketStatus[]{UNINITIALIZED, PRE_CONNECTING, CONNECTED, CLOSED, FAILURE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<WebSocketStatus> getEntries() {
            return $ENTRIES;
        }

        private WebSocketStatus(String str, int i) {
        }

        static {
            WebSocketStatus[] webSocketStatusArr$values = $values();
            $VALUES = webSocketStatusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(webSocketStatusArr$values);
        }

        public static WebSocketStatus valueOf(String str) {
            return (WebSocketStatus) Enum.valueOf(WebSocketStatus.class, str);
        }

        public static WebSocketStatus[] values() {
            return (WebSocketStatus[]) $VALUES.clone();
        }
    }

    public final void valueOf() {
        pUU.KWHzl("OKWSBaseConnection", appendConnAndWebSocketInstanceInfo$default(this, "onReadPong path: " + this.djBIcL + ", connId:" + this.copydefault, null, 2, null));
        this.valueOf = System.currentTimeMillis();
    }

    public final void DbNXlk() {
        Class<?> cls;
        if (!C43292rmY.OLrzqt.getFieldNames()) {
            pUU.KWHzl("OKWSBaseConnection", "replaceReaderCallBack returned cause config switch is closed!");
            return;
        }
        try {
            WebSocket webSocket = this.AkhnZx;
            if (webSocket != null) {
                Class<?> cls2 = webSocket.getClass();
                Class<?>[] interfaces = cls2.getInterfaces();
                Intrinsics.checkNotNullExpressionValue(interfaces, "");
                int length = interfaces.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        cls = null;
                        break;
                    }
                    cls = interfaces[i];
                    String name = cls.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "");
                    if (StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) "FrameCallback", false, 2, (Object) null)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (cls == null) {
                    return;
                }
                Field declaredField = cls2.getDeclaredField("reader");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(webSocket);
                final WebSocketReader.FrameCallback frameCallback = webSocket instanceof WebSocketReader.FrameCallback ? (WebSocketReader.FrameCallback) webSocket : null;
                if (frameCallback == null || obj == null) {
                    return;
                }
                Object objNewProxyInstance = Proxy.newProxyInstance(obj.getClass().getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: o.ykq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.reflect.InvocationHandler
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.reflect.Method method, java.lang.Object[] objArr) {
                        return OKWSBaseConnection.EZpvd(frameCallback, this, obj2, method, objArr);
                    }
                });
                Field declaredField2 = obj.getClass().getDeclaredField("frameCallback");
                declaredField2.setAccessible(true);
                declaredField2.set(obj, objNewProxyInstance);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            pUU.copydefault("OKWSBaseConnection", appendConnAndWebSocketInstanceInfo$default(this, "replaceReaderCallBack exception: " + Unit.INSTANCE, null, 2, null));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [567=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object EZpvd(WebSocketReader.FrameCallback frameCallback, OKWSBaseConnection oKWSBaseConnection, Object obj, Method method, Object[] objArr) throws IOException {
        if (objArr != null) {
            String name = method != null ? method.getName() : null;
            if (name != null) {
                switch (name.hashCode()) {
                    case -1170317597:
                        if (name.equals("onReadClose")) {
                            Object obj2 = objArr[0];
                            Intrinsics.copydefault(obj2, "");
                            int iIntValue = ((Integer) obj2).intValue();
                            Object obj3 = objArr[1];
                            Intrinsics.copydefault(obj3, "");
                            frameCallback.onReadClose(iIntValue, (String) obj3);
                        }
                        break;
                    case 694612530:
                        if (name.equals("onReadMessage")) {
                            Object obj4 = objArr[0];
                            if (!(obj4 instanceof String)) {
                                Intrinsics.copydefault(obj4, "");
                                frameCallback.onReadMessage((ByteString) obj4);
                            } else {
                                Intrinsics.copydefault(obj4, "");
                                frameCallback.onReadMessage((String) obj4);
                            }
                        }
                        break;
                    case 1902294823:
                        if (name.equals("onReadPing")) {
                            Object obj5 = objArr[0];
                            Intrinsics.copydefault(obj5, "");
                            frameCallback.onReadPing((ByteString) obj5);
                        }
                        break;
                    case 1902300589:
                        if (name.equals("onReadPong")) {
                            Object obj6 = objArr[0];
                            Intrinsics.copydefault(obj6, "");
                            frameCallback.onReadPong((ByteString) obj6);
                            oKWSBaseConnection.valueOf();
                        }
                        break;
                }
            }
        }
        return 0;
    }

    public static /* synthetic */ String appendConnAndWebSocketInstanceInfo$default(OKWSBaseConnection oKWSBaseConnection, String str, WebSocket webSocket, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendConnAndWebSocketInstanceInfo");
        }
        if ((i & 2) != 0) {
            webSocket = null;
        }
        return oKWSBaseConnection.KWHzl(str, webSocket);
    }

    public final String KWHzl(String str, WebSocket webSocket) {
        String str2;
        if (webSocket == null) {
            str2 = "";
        } else {
            str2 = ",websocket: " + C57569ykr.EZpvd(webSocket);
        }
        String strEZpvd = C57569ykr.EZpvd(this);
        WebSocket webSocket2 = this.AkhnZx;
        return str + ", conn: " + strEZpvd + ", mWebsocket: " + (webSocket2 != null ? C57569ykr.EZpvd(webSocket2) : null) + str2;
    }
}

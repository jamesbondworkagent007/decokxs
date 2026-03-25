package com.okinc.liveness.lca.data;

import com.google.gson.Gson;
import com.okinc.liveness.lca.debugtool.data.ColorEvent;
import com.okinc.liveness.lca.debugtool.data.LcaDebugInfo;
import com.okinc.liveness.lca.debugtool.data.VideoEvent;
import com.okinc.liveness.lca.exception.LcaAuthDecryptFailException;
import com.okinc.liveness.lca.exception.LcaAuthFailException;
import com.okinc.liveness.lca.exception.LcaAuthSignException;
import com.okinc.liveness.lca.exception.LcaDataObfuscationException;
import com.okinc.liveness.lca.exception.LcaJsonParseFailException;
import com.okinc.liveness.lca.exception.LcaSendTimeoutFailException;
import com.okinc.liveness.lca.exception.LcaSendVideoFailException;
import com.okinc.liveness.lca.exception.LcaSendVideoParamsEncryptException;
import com.okinc.liveness.lca.exception.LcaSendVideoParamsFailException;
import com.okinc.liveness.lca.exception.LcaSendVideoParamsInvalidException;
import com.okinc.liveness.lca.exception.LcaWebsocketFailException;
import com.okinc.liveness.lca.manager.LcaSdkManager;
import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.ok_kyc_core.data.lca.LcaObfuscateData;
import com.okinc.rxutils.RxBus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33149mqx;
import o.C42459rTq;
import o.C43292rmY;
import o.C43334rnN;
import o.C43337rnQ;
import o.C56390yDp;
import o.C56424yEw;
import o.C6777aVl;
import o.C6881aXj;
import o.C6893aXv;
import o.pUU;
import o.rTL;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaJwstWsRemote {
    private static final int NORMAL_CLOSURE_STATUS = 1000;
    private static final String TAG = "LcaJwstWsRemote";
    private static volatile LcaJwstWsRemote instance;
    private final OkHttpClient client;
    private LcaJwstCollectCallback collectCallback;
    private long connectionDuration;
    private long connectionStartTime;
    private final Gson gson;
    private boolean isWsClosed;
    private LcaJwstResultCallback resultCallback;
    private WebSocket webSocket;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.data.LcaJwstWsRemote.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LcaJwstWsRemote(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCollectCallback(@NotNull LcaJwstCollectCallback lcaJwstCollectCallback) {
        Intrinsics.checkNotNullParameter(lcaJwstCollectCallback, "");
        this.collectCallback = lcaJwstCollectCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setResultCallback(@NotNull LcaJwstResultCallback lcaJwstResultCallback) {
        Intrinsics.checkNotNullParameter(lcaJwstResultCallback, "");
        this.resultCallback = lcaJwstResultCallback;
    }

    private LcaJwstWsRemote() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderRetryOnConnectionFailure = builder.connectTimeout(15L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).retryOnConnectionFailure(true);
        DohTypeEnum dohTypeEnum = DohTypeEnum.V5;
        this.client = builderRetryOnConnectionFailure.addInterceptor(new C43334rnN(dohTypeEnum)).addInterceptor(new C6881aXj()).addInterceptor(new C6893aXv()).dns(new C43337rnQ(dohTypeEnum)).build();
        this.gson = new Gson();
        this.isWsClosed = true;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.data.LcaJwstWsRemote.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LcaJwstWsRemote getInstance() {
            LcaJwstWsRemote lcaJwstWsRemote = LcaJwstWsRemote.instance;
            if (lcaJwstWsRemote == null) {
                synchronized (this) {
                    lcaJwstWsRemote = LcaJwstWsRemote.instance;
                    if (lcaJwstWsRemote == null) {
                        lcaJwstWsRemote = new LcaJwstWsRemote(null);
                        Companion companion = LcaJwstWsRemote.Companion;
                        LcaJwstWsRemote.instance = lcaJwstWsRemote;
                    }
                }
            }
            return lcaJwstWsRemote;
        }
    }

    public final void connectWebsocket(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            LcaJwstCollectCallback lcaJwstCollectCallback = this.collectCallback;
            if (lcaJwstCollectCallback != null) {
                lcaJwstCollectCallback.onWebSocketError("URL cannot be blank");
                return;
            }
            return;
        }
        Request.Builder builderUrl = new Request.Builder().url(str);
        if (C42459rTq.KWHzl.fIwbmz() && str2 != null) {
            builderUrl.addHeader("Subdomain-Strategy", str2);
        }
        disconnect$default(this, null, 1, null);
        this.connectionStartTime = System.currentTimeMillis();
        this.webSocket = this.client.newWebSocket(builderUrl.build(), createWebSocketListener());
        this.isWsClosed = false;
    }

    private final WebSocketListener createWebSocketListener() {
        return new WebSocketListener() { // from class: com.okinc.liveness.lca.data.LcaJwstWsRemote.createWebSocketListener.1
            @Override // okhttp3.WebSocketListener
            public void onOpen(WebSocket webSocket, Response response) {
                Intrinsics.checkNotNullParameter(webSocket, "");
                Intrinsics.checkNotNullParameter(response, "");
                LcaJwstWsRemote.this.connectionDuration = System.currentTimeMillis() - LcaJwstWsRemote.this.connectionStartTime;
                pUU.KWHzl(LcaJwstWsRemote.TAG, "Lca liveness - WebSocket onOpen: " + response.message() + ", connection time: " + LcaJwstWsRemote.this.connectionDuration + " ms");
                LcaJwstCollectCallback lcaJwstCollectCallback = LcaJwstWsRemote.this.collectCallback;
                if (lcaJwstCollectCallback != null) {
                    lcaJwstCollectCallback.onWebSocketConnected(LcaJwstWsRemote.this.connectionDuration);
                }
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, String str) {
                Intrinsics.checkNotNullParameter(webSocket, "");
                Intrinsics.checkNotNullParameter(str, "");
                pUU.KWHzl(LcaJwstWsRemote.TAG, "Lca liveness - WebSocket onMessage: " + str);
                if (C43292rmY.OLrzqt.AuCTelauCTel()) {
                    RxBus.AEQbTJ(new C33149mqx(null, str, webSocket.request().url().encodedPath()));
                }
                LcaJwstWsRemote.this.handleWebSocketMessage(str);
            }

            @Override // okhttp3.WebSocketListener
            public void onFailure(WebSocket webSocket, Throwable th, Response response) {
                Intrinsics.checkNotNullParameter(webSocket, "");
                Intrinsics.checkNotNullParameter(th, "");
                String message = th.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                pUU.AEQbTJ(LcaJwstWsRemote.TAG, "Lca liveness - WebSocket onFailure after " + (System.currentTimeMillis() - LcaJwstWsRemote.this.connectionStartTime) + " ms: " + message, th);
                C6777aVl.Companion.EZpvd(new LcaWebsocketFailException(th.getMessage(), th.getCause()));
                LcaJwstCollectCallback lcaJwstCollectCallback = LcaJwstWsRemote.this.collectCallback;
                if (lcaJwstCollectCallback != null) {
                    lcaJwstCollectCallback.onWebSocketError(message);
                }
            }

            @Override // okhttp3.WebSocketListener
            public void onClosing(WebSocket webSocket, int i, String str) {
                Intrinsics.checkNotNullParameter(webSocket, "");
                Intrinsics.checkNotNullParameter(str, "");
                LcaJwstWsRemote.this.isWsClosed = true;
                LcaJwstWsCloseStatus lcaJwstWsCloseStatusFrom = LcaJwstWsCloseStatus.Companion.from(i, str);
                pUU.KWHzl(LcaJwstWsRemote.TAG, "Lca liveness - WebSocket onClosing: code=" + i + ", reason=" + str + ", strategy=" + lcaJwstWsCloseStatusFrom.getStrategy());
                LcaJwstCollectCallback lcaJwstCollectCallback = LcaJwstWsRemote.this.collectCallback;
                if (lcaJwstCollectCallback != null) {
                    lcaJwstCollectCallback.onWebSocketClosed(lcaJwstWsCloseStatusFrom);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleWebSocketMessage(String str) {
        LcaJwstCollectCallback lcaJwstCollectCallback;
        try {
            String str2 = "";
            if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "WSAuthResponseCommand", false, 2, (Object) null)) {
                try {
                    WSAuthResponseMsgData wSAuthResponseMsgData = (WSAuthResponseMsgData) rTL.OLrzqt.EZpvd(((WSAuthResponseMsg) this.gson.fromJson(str, WSAuthResponseMsg.class)).getData(), WSAuthResponseMsgData.class);
                    if (wSAuthResponseMsgData == null) {
                        pUU.copydefault(TAG, "Lca liveness - Auth response decrypt fail");
                        C6777aVl.Companion.EZpvd(new LcaAuthDecryptFailException("Auth response decrypt fail"));
                    } else if (!wSAuthResponseMsgData.getSuccess()) {
                        pUU.copydefault(TAG, "Lca liveness - Auth response fail");
                        C6777aVl.Companion.EZpvd(new LcaAuthFailException("Auth response fail"));
                    }
                    LcaJwstCollectCallback lcaJwstCollectCallback2 = this.collectCallback;
                    if (lcaJwstCollectCallback2 != null) {
                        lcaJwstCollectCallback2.onAuthResponse(wSAuthResponseMsgData);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    pUU.AEQbTJ(TAG, "Lca liveness - WSAuthResponseCommand response fail", e);
                    C6777aVl.Companion.EZpvd(new LcaJsonParseFailException(e.getMessage(), e.getCause()));
                    LcaJwstCollectCallback lcaJwstCollectCallback3 = this.collectCallback;
                    if (lcaJwstCollectCallback3 != null) {
                        String message = e.getMessage();
                        if (message != null) {
                            str2 = message;
                        }
                        lcaJwstCollectCallback3.onWebSocketError(str2);
                        return;
                    }
                    return;
                }
            }
            if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "WSLightCaptchaResultResponseCommand", false, 2, (Object) null)) {
                try {
                    WSVideoVerifyResultResponseMsg wSVideoVerifyResultResponseMsg = (WSVideoVerifyResultResponseMsg) this.gson.fromJson(str, WSVideoVerifyResultResponseMsg.class);
                    LcaJwstResultCallback lcaJwstResultCallback = this.resultCallback;
                    if (lcaJwstResultCallback != null) {
                        lcaJwstResultCallback.onLcaVideoVerifyResult(wSVideoVerifyResultResponseMsg.getData());
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    pUU.AEQbTJ(TAG, "WSLightCaptchaResultResponseCommand response fail", e2);
                    C6777aVl.Companion.EZpvd(new LcaJsonParseFailException(e2.getMessage(), e2.getCause()));
                    LcaJwstCollectCallback lcaJwstCollectCallback4 = this.collectCallback;
                    if (lcaJwstCollectCallback4 != null) {
                        String message2 = e2.getMessage();
                        if (message2 != null) {
                            str2 = message2;
                        }
                        lcaJwstCollectCallback4.onWebSocketError(str2);
                        return;
                    }
                    return;
                }
            }
            pUU.KWHzl(TAG, "Lca liveness - Unrecognized message format: " + str);
            return;
        } catch (Exception e3) {
            String str3 = "Error parsing message: " + e3.getMessage();
            pUU.AEQbTJ(TAG, str3, e3);
            C6777aVl.Companion.EZpvd(new LcaJsonParseFailException(e3.getMessage(), e3.getCause()));
            lcaJwstCollectCallback = this.collectCallback;
            if (lcaJwstCollectCallback == null) {
            }
        }
        String str32 = "Error parsing message: " + e3.getMessage();
        pUU.AEQbTJ(TAG, str32, e3);
        C6777aVl.Companion.EZpvd(new LcaJsonParseFailException(e3.getMessage(), e3.getCause()));
        lcaJwstCollectCallback = this.collectCallback;
        if (lcaJwstCollectCallback == null) {
            lcaJwstCollectCallback.onWebSocketError(str32);
        }
    }

    public final void sendAuthEvent(@NotNull String str, @NotNull String str2, boolean z, boolean z2) {
        String json;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (StringsKt__StringsKt.fARcdN((CharSequence) str) || StringsKt__StringsKt.fARcdN((CharSequence) str2)) {
            LcaJwstCollectCallback lcaJwstCollectCallback = this.collectCallback;
            if (lcaJwstCollectCallback != null) {
                lcaJwstCollectCallback.onWebSocketError("Invalid parameters for auth event");
                return;
            }
            return;
        }
        WSAuthRequestMsgData wSAuthRequestMsgData = new WSAuthRequestMsgData(str, str2, System.currentTimeMillis());
        if (z2) {
            rTL rtl = rTL.OLrzqt;
            LcaObfuscateData lcaObfuscateDataOLrzqt = rtl.OLrzqt(wSAuthRequestMsgData);
            if (lcaObfuscateDataOLrzqt == null) {
                LcaDataObfuscationException lcaDataObfuscationException = new LcaDataObfuscationException();
                pUU.copydefault(TAG, "Lca liveness - Obfuscate data fail");
                C6777aVl.Companion.EZpvd(lcaDataObfuscationException);
                LcaJwstCollectCallback lcaJwstCollectCallback2 = this.collectCallback;
                if (lcaJwstCollectCallback2 != null) {
                    String message = lcaDataObfuscationException.getMessage();
                    lcaJwstCollectCallback2.onWebSocketError(message != null ? message : "");
                    return;
                }
                return;
            }
            String json2 = this.gson.toJson(wSAuthRequestMsgData);
            Intrinsics.checkNotNullExpressionValue(json2, "");
            String strEZpvd = rtl.EZpvd(z, json2);
            if (StringsKt__StringsKt.fARcdN((CharSequence) strEZpvd)) {
                LcaAuthSignException lcaAuthSignException = new LcaAuthSignException();
                pUU.copydefault(TAG, "Lca liveness - Sign data fail");
                C6777aVl.Companion.EZpvd(lcaAuthSignException);
                LcaJwstCollectCallback lcaJwstCollectCallback3 = this.collectCallback;
                if (lcaJwstCollectCallback3 != null) {
                    String message2 = lcaAuthSignException.getMessage();
                    if (message2 == null) {
                        message2 = "";
                    }
                    lcaJwstCollectCallback3.onWebSocketError(message2);
                }
            }
            Unit unit = Unit.INSTANCE;
            json = this.gson.toJson(new WSAuthRequestMsgObfuscated(null, lcaObfuscateDataOLrzqt, strEZpvd, 1, null));
        } else {
            rTL rtl2 = rTL.OLrzqt;
            String json3 = this.gson.toJson(wSAuthRequestMsgData);
            Intrinsics.checkNotNullExpressionValue(json3, "");
            String strEZpvd2 = rtl2.EZpvd(z, json3);
            if (StringsKt__StringsKt.fARcdN((CharSequence) strEZpvd2)) {
                LcaAuthSignException lcaAuthSignException2 = new LcaAuthSignException();
                pUU.copydefault(TAG, "Lca liveness - Sign data fail");
                C6777aVl.Companion.EZpvd(lcaAuthSignException2);
                LcaJwstCollectCallback lcaJwstCollectCallback4 = this.collectCallback;
                if (lcaJwstCollectCallback4 != null) {
                    String message3 = lcaAuthSignException2.getMessage();
                    if (message3 == null) {
                        message3 = "";
                    }
                    lcaJwstCollectCallback4.onWebSocketError(message3);
                }
            }
            Unit unit2 = Unit.INSTANCE;
            json = this.gson.toJson(new WSAuthRequestMsgOriginal(null, wSAuthRequestMsgData, strEZpvd2, 1, null));
        }
        pUU.KWHzl(TAG, "Lca liveness - Sending auth request");
        WebSocket webSocket = this.webSocket;
        if (webSocket != null) {
            Intrinsics.copydefault((Object) json);
            webSocket.send(json);
        } else {
            if (this.isWsClosed) {
                return;
            }
            pUU.copydefault(TAG, "Lca liveness - Send auth fail by webSocket connection");
            LcaAuthFailException lcaAuthFailException = new LcaAuthFailException("Send auth fail by webSocket connection");
            C6777aVl.Companion.EZpvd(lcaAuthFailException);
            LcaJwstCollectCallback lcaJwstCollectCallback5 = this.collectCallback;
            if (lcaJwstCollectCallback5 != null) {
                String message4 = lcaAuthFailException.getMessage();
                lcaJwstCollectCallback5.onWebSocketError(message4 != null ? message4 : "");
            }
        }
    }

    public final void sendVideoSegmentEvent(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length == 0) {
            pUU.copydefault(TAG, "Lca liveness - Video segment data is empty");
            LcaSendVideoFailException lcaSendVideoFailException = new LcaSendVideoFailException("Send video segment fail by segment data empty");
            C6777aVl.Companion.EZpvd(lcaSendVideoFailException);
            LcaJwstCollectCallback lcaJwstCollectCallback = this.collectCallback;
            if (lcaJwstCollectCallback != null) {
                String message = lcaSendVideoFailException.getMessage();
                lcaJwstCollectCallback.onWebSocketError(message != null ? message : "");
                return;
            }
            return;
        }
        ByteString byteStringOf = ByteString.Companion.of(Arrays.copyOf(bArr, bArr.length));
        pUU.KWHzl(TAG, "Lca liveness - Sending video segment");
        WebSocket webSocket = this.webSocket;
        if (webSocket != null) {
            webSocket.send(byteStringOf);
            return;
        }
        if (this.isWsClosed) {
            return;
        }
        pUU.copydefault(TAG, "Lca liveness - Send video segment fail by webSocket connection");
        LcaSendVideoFailException lcaSendVideoFailException2 = new LcaSendVideoFailException("Send video segment fail by webSocket connection");
        C6777aVl.Companion.EZpvd(lcaSendVideoFailException2);
        LcaJwstCollectCallback lcaJwstCollectCallback2 = this.collectCallback;
        if (lcaJwstCollectCallback2 != null) {
            String message2 = lcaSendVideoFailException2.getMessage();
            lcaJwstCollectCallback2.onWebSocketError(message2 != null ? message2 : "");
        }
    }

    public final void sendFlashColorTimeoutEvent(long j) {
        if (j == 0) {
            pUU.copydefault(TAG, "Lca liveness - Timeout data is empty");
            LcaSendTimeoutFailException lcaSendTimeoutFailException = new LcaSendTimeoutFailException("Send timeout data event fail");
            C6777aVl.Companion.EZpvd(lcaSendTimeoutFailException);
            LcaJwstCollectCallback lcaJwstCollectCallback = this.collectCallback;
            if (lcaJwstCollectCallback != null) {
                String message = lcaSendTimeoutFailException.getMessage();
                lcaJwstCollectCallback.onWebSocketError(message != null ? message : "");
                return;
            }
            return;
        }
        LcaObfuscateData lcaObfuscateDataOLrzqt = rTL.OLrzqt.OLrzqt(new WSLightCaptchaFlashingStartEventRequestCommandData(j));
        if (lcaObfuscateDataOLrzqt == null) {
            pUU.copydefault(TAG, "Lca liveness - fail to encrypt final param");
            LcaSendVideoParamsEncryptException lcaSendVideoParamsEncryptException = new LcaSendVideoParamsEncryptException("final param encrypt failed");
            C6777aVl.Companion.EZpvd(lcaSendVideoParamsEncryptException);
            LcaJwstCollectCallback lcaJwstCollectCallback2 = this.collectCallback;
            if (lcaJwstCollectCallback2 != null) {
                String message2 = lcaSendVideoParamsEncryptException.getMessage();
                lcaJwstCollectCallback2.onFailEncryptFinalParam(message2 != null ? message2 : "");
                return;
            }
            return;
        }
        String json = this.gson.toJson(new WSLightCaptchaFlashingStartEventRequestCommand(null, lcaObfuscateDataOLrzqt, 1, null));
        LcaSdkManager.Companion companion = LcaSdkManager.Companion;
        Function1<LcaDebugInfo, Unit> debugInfoCallback = companion.getInstance().getDebugInfoCallback();
        if (debugInfoCallback != null) {
            debugInfoCallback.invoke(new LcaDebugInfo(json, null, null, null, 14, null));
        }
        if (companion.getInstance().getConfiguration().getDebugMode()) {
            pUU.EZpvd(TAG, "Lca liveness - Send timeout data params=" + json);
        }
        WebSocket webSocket = this.webSocket;
        if (webSocket != null) {
            Intrinsics.copydefault((Object) json);
            webSocket.send(json);
        } else {
            if (this.isWsClosed) {
                return;
            }
            pUU.copydefault(TAG, "Lca liveness - Send timeout fail by webSocket connection");
            LcaSendTimeoutFailException lcaSendTimeoutFailException2 = new LcaSendTimeoutFailException("Send timeout fail by webSocket connection");
            C6777aVl.Companion.EZpvd(lcaSendTimeoutFailException2);
            LcaJwstCollectCallback lcaJwstCollectCallback3 = this.collectCallback;
            if (lcaJwstCollectCallback3 != null) {
                String message3 = lcaSendTimeoutFailException2.getMessage();
                lcaJwstCollectCallback3.onWebSocketError(message3 != null ? message3 : "");
            }
        }
    }

    public final void sendFinalDescriptiveParams(long j, long j2, long j3, int i, int i2, long j4, @NotNull List<ColorEvent> list, @NotNull String str, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (j <= 0 || j2 <= 0 || i <= 0 || i2 <= 0 || j4 < 0 || list.isEmpty()) {
            LcaSendVideoParamsInvalidException lcaSendVideoParamsInvalidException = new LcaSendVideoParamsInvalidException("Final param invalid");
            Pair[] pairArr = new Pair[6];
            pairArr[0] = C56390yDp.OLrzqt("videoStartTimestamp", String.valueOf(j));
            pairArr[1] = C56390yDp.OLrzqt("videoEndTimestamp", String.valueOf(j2));
            pairArr[2] = C56390yDp.OLrzqt("farStartTimestamp", String.valueOf(j3));
            pairArr[3] = C56390yDp.OLrzqt("farStartIndex", String.valueOf(i));
            pairArr[4] = C56390yDp.OLrzqt("farCheckDuration", String.valueOf(j4));
            pairArr[5] = C56390yDp.OLrzqt("colorDisplayList", list.isEmpty() ? "empty" : String.valueOf(list.size()));
            Map<String, String> mapGEmmrt = C56424yEw.gEmmrt(pairArr);
            pUU.copydefault(TAG, "Lca liveness - Send video params fail by " + mapGEmmrt);
            C6777aVl.Companion.OLrzqt(lcaSendVideoParamsInvalidException, mapGEmmrt, Boolean.FALSE);
            LcaJwstCollectCallback lcaJwstCollectCallback = this.collectCallback;
            if (lcaJwstCollectCallback != null) {
                String message = lcaSendVideoParamsInvalidException.getMessage();
                lcaJwstCollectCallback.onInvalidFinalParam(message != null ? message : "");
                return;
            }
            return;
        }
        LcaObfuscateData lcaObfuscateDataOLrzqt = rTL.OLrzqt.OLrzqt(new WSLightCaptchaVideoParamsRequestMsgDescriptionData(generateEventDescription(j, j2, j3, i, i2, j4, list), str, map));
        if (lcaObfuscateDataOLrzqt == null) {
            pUU.copydefault(TAG, "Lca liveness - fail to encrypt final param");
            LcaSendVideoParamsEncryptException lcaSendVideoParamsEncryptException = new LcaSendVideoParamsEncryptException("final param encrypt failed");
            C6777aVl.Companion.EZpvd(lcaSendVideoParamsEncryptException);
            LcaJwstCollectCallback lcaJwstCollectCallback2 = this.collectCallback;
            if (lcaJwstCollectCallback2 != null) {
                String message2 = lcaSendVideoParamsEncryptException.getMessage();
                lcaJwstCollectCallback2.onFailEncryptFinalParam(message2 != null ? message2 : "");
                return;
            }
            return;
        }
        String json = this.gson.toJson(new WSLightCaptchaVideoParamsRequestMsg(null, lcaObfuscateDataOLrzqt, 1, null));
        LcaSdkManager.Companion companion = LcaSdkManager.Companion;
        Function1<LcaDebugInfo, Unit> debugInfoCallback = companion.getInstance().getDebugInfoCallback();
        if (debugInfoCallback != null) {
            debugInfoCallback.invoke(new LcaDebugInfo(json, null, null, null, 14, null));
        }
        if (companion.getInstance().getConfiguration().getDebugMode()) {
            pUU.EZpvd(TAG, "Lca liveness - colorDisplayList=" + list);
            pUU.EZpvd(TAG, "Lca liveness - Send video params=" + json);
        }
        WebSocket webSocket = this.webSocket;
        if (webSocket != null) {
            Intrinsics.copydefault((Object) json);
            webSocket.send(json);
        } else {
            if (this.isWsClosed) {
                return;
            }
            pUU.copydefault(TAG, "Lca liveness - Send video params fail by websocket connection");
            LcaSendVideoParamsFailException lcaSendVideoParamsFailException = new LcaSendVideoParamsFailException("Send video params fail by websocket connection");
            C6777aVl.Companion.EZpvd(lcaSendVideoParamsFailException);
            LcaJwstCollectCallback lcaJwstCollectCallback3 = this.collectCallback;
            if (lcaJwstCollectCallback3 != null) {
                String message3 = lcaSendVideoParamsFailException.getMessage();
                lcaJwstCollectCallback3.onWebSocketError(message3 != null ? message3 : "");
            }
        }
    }

    public static /* synthetic */ void disconnect$default(LcaJwstWsRemote lcaJwstWsRemote, LcaJwstWsCloseStatus lcaJwstWsCloseStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            lcaJwstWsCloseStatus = null;
        }
        lcaJwstWsRemote.disconnect(lcaJwstWsCloseStatus);
    }

    public final void disconnect(LcaJwstWsCloseStatus lcaJwstWsCloseStatus) {
        pUU.KWHzl(TAG, "Lca liveness - Emit disconnect | code: " + (lcaJwstWsCloseStatus != null ? Integer.valueOf(lcaJwstWsCloseStatus.getCode()) : null) + ", reason: " + (lcaJwstWsCloseStatus != null ? lcaJwstWsCloseStatus.getReason() : null));
        if (this.isWsClosed) {
            pUU.KWHzl(TAG, "Lca liveness - Emit disconnect, already closed");
            return;
        }
        this.isWsClosed = true;
        WebSocket webSocket = this.webSocket;
        if (webSocket != null) {
            webSocket.close(lcaJwstWsCloseStatus != null ? lcaJwstWsCloseStatus.getCode() : 1000, "Normal closure");
        }
        this.webSocket = null;
    }

    private final ArrayList<Object> generateEventDescription(long j, long j2, long j3, int i, int i2, long j4, List<ColorEvent> list) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(new VideoEvent(Long.valueOf(j), null, null, null, null, null, 62, null));
        arrayList.add(new VideoEvent(null, null, Long.valueOf(j3), Long.valueOf(j4), Integer.valueOf(i), Integer.valueOf(i2), 3, null));
        arrayList.addAll(list);
        arrayList.add(new VideoEvent(null, Long.valueOf(j2), null, null, null, null, 61, null));
        return arrayList;
    }
}

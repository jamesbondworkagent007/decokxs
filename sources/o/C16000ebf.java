package o;

import androidx.compose.material3.CalendarModelKt;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$ackAndSendPushData$1;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$awaitWsLoggedIn$2;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$batchFetchMessages$1;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$fetchMessages$1;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$getJwtToken$2;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$getOriginUrlWithTimeout$1;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$getOriginUrlWithTimeout$originUrl$1;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$handleSplitMessage$1;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$handleSplitMessage$2;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$loginWebSocket$1;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$onHandleIncomingSplitData$1;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$onNewDataReceived$1;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$publish$1;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$resumePendingMessages$2;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$sendMessage$1;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$sendMessage$2;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$sendPackageWithRetry$1;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$sendSplitPackage$1;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$startObservingDisconnectMessages$1;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$startObservingFetchSuccess$1;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$startObservingPushMessages$1;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$startObservingSplitMessagePushMessages$1;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$startObservingWsConnection$1;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$subscribe$1;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$unsubscribe$1;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$unsubscribe$2;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$webSocketService$2$1$1;
import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$webSocketService$2$2$1;
import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.CachedSplitData;
import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data;
import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.DisconnectedTopic;
import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcMessage;
import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse;
import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.SplitMessage;
import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.SplitMessageCache;
import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.core.livelistener.OKWsConnectionState;
import com.okinc.websocket.connection.OKWsDoh;
import com.reown.android.push.notifications.PushMessagingService;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongUnaryOperator;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.JsonPrimitive;
import o.C59462zhW;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ebf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16000ebf {
    public final C16015ebu AEQbTJ;
    public final MutableStateFlow<java.lang.Boolean> AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final MutableSharedFlow<RpcResponse.FetchSuccess> AkhnZx;
    public final C16009ebo AuCTel;
    public final C16011ebq DbNXlk;
    public final kotlinx.coroutines.channels.Channel<Data> EZpvd;
    public final kotlinx.coroutines.channels.Channel<Data> KWHzl;
    public final kotlinx.coroutines.channels.Channel<Data> OLrzqt;
    public final MutableSharedFlow<DisconnectedTopic> copydefault;
    public final C15975ebG djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public final CoroutineScope fARcdN;
    public final MutableSharedFlow<RpcResponse.Push> fIwbmz;
    public final MutableSharedFlow<RpcResponse> fJNWhG;
    public final C48787ucK fetchVPNInfo;
    public final CoroutineDispatcher gEmmrt;
    public final MutableSharedFlow<OKWsConnectionState> getNewProxyInstance;
    public final ConcurrentHashMap<java.lang.String, CachedSplitData[]> isConnected;
    public final java.lang.String uzCIH;
    public AtomicLong valueOf;
    public final SharedFlow<DisconnectedTopic> values;

    public static final long AEQbTJ(long j, long j2) {
        return j <= j2 ? 1 + j2 : j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kotlinx.coroutines.channels.Channel<Data> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<DisconnectedTopic> djBIcL() {
        return this.values;
    }

    public C16000ebf(@NotNull C16015ebu c16015ebu, @NotNull C15975ebG c15975ebG, @NotNull C16011ebq c16011ebq, @NotNull C16009ebo c16009ebo, @NotNull C48787ucK c48787ucK, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(c16015ebu, "");
        Intrinsics.checkNotNullParameter(c15975ebG, "");
        Intrinsics.checkNotNullParameter(c16011ebq, "");
        Intrinsics.checkNotNullParameter(c16009ebo, "");
        Intrinsics.checkNotNullParameter(c48787ucK, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.AEQbTJ = c16015ebu;
        this.djBIcL = c15975ebG;
        this.DbNXlk = c16011ebq;
        this.AuCTel = c16009ebo;
        this.fetchVPNInfo = c48787ucK;
        this.gEmmrt = coroutineDispatcher;
        this.fARcdN = coroutineScope;
        this.uzCIH = C43292rmY.OLrzqt.AxsJAY() + values();
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.ebd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C16000ebf.copydefault();
            }
        });
        this.ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.ebg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C16000ebf.fIwbmz(this.OLrzqt);
            }
        });
        this.fJNWhG = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AkhnZx = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.fIwbmz = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        MutableSharedFlow<DisconnectedTopic> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.values = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.getNewProxyInstance = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.EZpvd = ChannelKt.Channel$default(-2, null, null, 6, null);
        this.KWHzl = ChannelKt.Channel$default(-2, null, null, 6, null);
        this.isConnected = new ConcurrentHashMap<>();
        this.OLrzqt = ChannelKt.Channel$default(1, BufferOverflow.DROP_OLDEST, null, 4, null);
        AuCTel();
        ejfBZ();
        AkhnZx();
        fARcdN();
        DbNXlk();
        this.valueOf = new AtomicLong(java.lang.System.currentTimeMillis());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0021: CONSTRUCTOR 
  (r10v0 o.ebu)
  (r11v0 o.ebG)
  (r12v0 o.ebq)
  (r13v0 o.ebo)
  (r14v0 o.ucK)
  (r15v0 kotlinx.coroutines.CoroutineDispatcher)
  (wrap:kotlinx.coroutines.CoroutineScope:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0016: INVOKE 
  (wrap:kotlin.coroutines.CoroutineContext:0x000e: INVOKE 
  (wrap:kotlinx.coroutines.CompletableJob:0x0006: INVOKE 
  (wrap:kotlinx.coroutines.Job:?: CAST (kotlinx.coroutines.Job) (null kotlinx.coroutines.Job))
  (1 int)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (null java.lang.Object))
 STATIC call: kotlinx.coroutines.SupervisorKt.SupervisorJob$default(kotlinx.coroutines.Job, int, java.lang.Object):kotlinx.coroutines.CompletableJob A[MD:(kotlinx.coroutines.Job, int, java.lang.Object):kotlinx.coroutines.CompletableJob (m), WRAPPED] (LINE:85))
  (wrap:kotlinx.coroutines.CoroutineDispatcher:0x000a: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getDefault():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED])
 INTERFACE call: kotlin.coroutines.CoroutineContext.plus(kotlin.coroutines.CoroutineContext):kotlin.coroutines.CoroutineContext A[MD:(kotlin.coroutines.CoroutineContext):kotlin.coroutines.CoroutineContext (m), WRAPPED] (LINE:85))
 STATIC call: kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlin.coroutines.CoroutineContext):kotlinx.coroutines.CoroutineScope A[MD:(kotlin.coroutines.CoroutineContext):kotlinx.coroutines.CoroutineScope (m), WRAPPED] (LINE:85)) : (r16v0 kotlinx.coroutines.CoroutineScope))
 A[MD:(o.ebu, o.ebG, o.ebq, o.ebo, o.ucK, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineScope):void (m)] (LINE:78) call: o.ebf.<init>(o.ebu, o.ebG, o.ebq, o.ebo, o.ucK, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineScope):void type: THIS */
    public /* synthetic */ C16000ebf(C16015ebu c16015ebu, C15975ebG c15975ebG, C16011ebq c16011ebq, C16009ebo c16009ebo, C48787ucK c48787ucK, CoroutineDispatcher coroutineDispatcher, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c16015ebu, c15975ebG, c16011ebq, c16009ebo, c48787ucK, coroutineDispatcher, (i & 64) != 0 ? CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getDefault())) : coroutineScope);
    }

    public final java.lang.String values() {
        try {
            return this.fetchVPNInfo.copydefault("okxConnectConfiguration.webSocketUrlPath", "/ws/v1/wallet-connect-relay");
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("OKXConnectNetworkUtils", "Error getting webSocketUrl", e);
            return "/ws/v1/wallet-connect-relay";
        }
    }

    public final long valueOf() {
        try {
            return this.fetchVPNInfo.OLrzqt("okxConnectConfiguration.timeToLiveInMs", 300000L);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("OKXConnectNetworkUtils", "Error getting ttlInMillis", e);
            return 300000L;
        }
    }

    public final long AYXKKw() {
        try {
            return this.fetchVPNInfo.OLrzqt("okxConnectConfiguration.timeToLiveForDisconnectInMs", CalendarModelKt.MillisecondsIn24Hours);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("OKXConnectNetworkUtils", "Error getting ttlForDisconnectInMillis", e);
            return CalendarModelKt.MillisecondsIn24Hours;
        }
    }

    public final long gEmmrt() {
        try {
            return this.fetchVPNInfo.OLrzqt("okxConnectConfiguration.requestTimeoutInSeconds", 10L);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("OKXConnectNetworkUtils", "Error getting timeoutDelayInMillis", e);
            return 10L;
        }
    }

    public final int EZpvd() {
        try {
            return this.fetchVPNInfo.AEQbTJ("okxConnectConfiguration.chunkedMessageLength", 63000);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("OKXConnectNetworkUtils", "Error getting chunkedMessageLength", e);
            return 63000;
        }
    }

    public final Json KWHzl() {
        return (Json) this.AhwBna.getValue();
    }

    public static final Json copydefault() {
        return JsonKt.Json$default(null, new Function1() { // from class: o.ebe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16000ebf.EZpvd((JsonBuilder) obj);
            }
        }, 1, null);
    }

    public static final Unit EZpvd(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    public final AbstractC57572yku fetchVPNInfo() {
        return (AbstractC57572yku) this.ejfBZ.getValue();
    }

    public static final AbstractC57572yku fIwbmz(final C16000ebf c16000ebf) {
        return C57554ykc.Companion.OLrzqt(new C57573ykv(new C57571ykt(c16000ebf.uzCIH, null, false, OKWsDoh.DEXPRI, 2, null)), new Function1() { // from class: o.ebj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16000ebf.KWHzl(this.KWHzl, (OKWsConnectionState) obj);
            }
        }, new Function2() { // from class: o.ebk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C16000ebf.KWHzl(this.EZpvd, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
            }
        });
    }

    public static final Unit KWHzl(C16000ebf c16000ebf, OKWsConnectionState oKWsConnectionState) {
        Intrinsics.checkNotNullParameter(oKWsConnectionState, "");
        pUU.KWHzl("OKXConnectNetworkUtils", "New connection state: " + oKWsConnectionState);
        BuildersKt__Builders_commonKt.launch$default(c16000ebf.fARcdN, null, null, new OKXConnectNetworkUtils$webSocketService$2$1$1(c16000ebf, oKWsConnectionState, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C16000ebf c16000ebf, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        pUU.KWHzl("OKXConnectNetworkUtils", "New message: " + oKIncomingData.getOriginMsg());
        BuildersKt__Builders_commonKt.launch$default(c16000ebf.fARcdN, null, null, new OKXConnectNetworkUtils$webSocketService$2$2$1(c16000ebf, oKIncomingData, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void fIwbmz() {
        if (fetchVPNInfo().KWHzl()) {
            return;
        }
        fetchVPNInfo().AhwBna();
        pUU.KWHzl("OKXConnectNetworkUtils", "Start websocket");
    }

    public final java.lang.Object EZpvd(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.gEmmrt, new OKXConnectNetworkUtils$awaitWsLoggedIn$2(this, null), continuation);
    }

    /* JADX INFO: renamed from: subscribe-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8598subscribeBWLJW6A$default(C16000ebf c16000ebf, java.lang.String str, boolean z, boolean z2, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return c16000ebf.EZpvd(str, z, z2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        OKXConnectNetworkUtils$subscribe$1 oKXConnectNetworkUtils$subscribe$1;
        java.lang.Object objKWHzl;
        C16000ebf c16000ebf;
        if (continuation instanceof OKXConnectNetworkUtils$subscribe$1) {
            oKXConnectNetworkUtils$subscribe$1 = (OKXConnectNetworkUtils$subscribe$1) continuation;
            int i = oKXConnectNetworkUtils$subscribe$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKXConnectNetworkUtils$subscribe$1.label = i - Integer.MIN_VALUE;
            } else {
                oKXConnectNetworkUtils$subscribe$1 = new OKXConnectNetworkUtils$subscribe$1(this, continuation);
            }
        }
        java.lang.Object obj = oKXConnectNetworkUtils$subscribe$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKXConnectNetworkUtils$subscribe$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder, PushMessagingService.KEY_TOPIC, str);
            if (z2) {
                JsonElementBuildersKt.put(jsonObjectBuilder, "withInternalData", C56443yFo.KWHzl(true));
            }
            Unit unit = Unit.INSTANCE;
            RpcMessage rpcMessage = new RpcMessage((java.lang.String) null, (java.lang.String) null, "subscribe", jsonObjectBuilder.build(), 3, (DefaultConstructorMarker) null);
            oKXConnectNetworkUtils$subscribe$1.L$0 = this;
            oKXConnectNetworkUtils$subscribe$1.L$1 = str;
            oKXConnectNetworkUtils$subscribe$1.Z$0 = z;
            oKXConnectNetworkUtils$subscribe$1.Z$1 = z2;
            oKXConnectNetworkUtils$subscribe$1.label = 1;
            objKWHzl = KWHzl(rpcMessage, true, (Continuation<? super Result<Unit>>) oKXConnectNetworkUtils$subscribe$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c16000ebf = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = oKXConnectNetworkUtils$subscribe$1.Z$1;
            z = oKXConnectNetworkUtils$subscribe$1.Z$0;
            str = (java.lang.String) oKXConnectNetworkUtils$subscribe$1.L$1;
            c16000ebf = (C16000ebf) oKXConnectNetworkUtils$subscribe$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            if (z) {
                c16000ebf.OLrzqt(str, z2);
            }
        }
        return objKWHzl;
    }

    public static /* synthetic */ Job fetchMessages$default(C16000ebf c16000ebf, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c16000ebf.OLrzqt(str, z);
    }

    public final Job OLrzqt(java.lang.String str, boolean z) {
        return BuildersKt__Builders_commonKt.launch$default(this.fARcdN, this.gEmmrt, null, new OKXConnectNetworkUtils$fetchMessages$1(this, str, z, null), 2, null);
    }

    public final Job EZpvd(java.util.List<java.lang.String> list) {
        return BuildersKt__Builders_commonKt.launch$default(this.fARcdN, this.gEmmrt, null, new OKXConnectNetworkUtils$batchFetchMessages$1(this, list, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        OKXConnectNetworkUtils$getOriginUrlWithTimeout$1 oKXConnectNetworkUtils$getOriginUrlWithTimeout$1;
        JsonElement jsonElement;
        JsonPrimitive jsonPrimitive;
        java.lang.String content;
        ByteString byteStringDecodeBase64;
        if (continuation instanceof OKXConnectNetworkUtils$getOriginUrlWithTimeout$1) {
            oKXConnectNetworkUtils$getOriginUrlWithTimeout$1 = (OKXConnectNetworkUtils$getOriginUrlWithTimeout$1) continuation;
            int i = oKXConnectNetworkUtils$getOriginUrlWithTimeout$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKXConnectNetworkUtils$getOriginUrlWithTimeout$1.label = i - Integer.MIN_VALUE;
            } else {
                oKXConnectNetworkUtils$getOriginUrlWithTimeout$1 = new OKXConnectNetworkUtils$getOriginUrlWithTimeout$1(this, continuation);
            }
        }
        java.lang.Object objM7403withTimeoutOrNullKLykuaI = oKXConnectNetworkUtils$getOriginUrlWithTimeout$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKXConnectNetworkUtils$getOriginUrlWithTimeout$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objM7403withTimeoutOrNullKLykuaI);
            C59462zhW.Activity activity = C59462zhW.OLrzqt;
            long jAEQbTJ = C59519zia.AEQbTJ(gEmmrt(), DurationUnit.SECONDS);
            OKXConnectNetworkUtils$getOriginUrlWithTimeout$originUrl$1 oKXConnectNetworkUtils$getOriginUrlWithTimeout$originUrl$1 = new OKXConnectNetworkUtils$getOriginUrlWithTimeout$originUrl$1(this, null);
            oKXConnectNetworkUtils$getOriginUrlWithTimeout$1.label = 1;
            objM7403withTimeoutOrNullKLykuaI = TimeoutKt.m7403withTimeoutOrNullKLykuaI(jAEQbTJ, oKXConnectNetworkUtils$getOriginUrlWithTimeout$originUrl$1, oKXConnectNetworkUtils$getOriginUrlWithTimeout$1);
            if (objM7403withTimeoutOrNullKLykuaI == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objM7403withTimeoutOrNullKLykuaI);
        }
        Data data = (Data) objM7403withTimeoutOrNullKLykuaI;
        if (data == null || (jsonElement = (JsonElement) JsonElementKt.getJsonObject(C33489mxS.KWHzl.AEQbTJ().parseToJsonElement(data.getMessage())).get((java.lang.Object) "ivur-igbfft-ptjip")) == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null || (content = jsonPrimitive.getContent()) == null || (byteStringDecodeBase64 = ByteString.Companion.decodeBase64(content)) == null) {
            return null;
        }
        return byteStringDecodeBase64.utf8();
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.eaT.copydefault(com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data, kotlin.coroutines.Continuation<? super kotlin.Unit>):java.lang.Object] */
    /* JADX INFO: renamed from: publish-hUnOzRk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8597publishhUnOzRk$default(C16000ebf c16000ebf, java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, Continuation continuation, int i, java.lang.Object obj) {
        return c16000ebf.KWHzl(str, str2, (28 & 4) != 0 ? false : z, (28 & 8) != 0 ? true : z2, (28 & 16) != 0 ? false : z3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, boolean z3, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        OKXConnectNetworkUtils$publish$1 oKXConnectNetworkUtils$publish$1;
        RpcMessage rpcMessage;
        boolean z4;
        C16000ebf c16000ebf;
        boolean z5;
        if (continuation instanceof OKXConnectNetworkUtils$publish$1) {
            oKXConnectNetworkUtils$publish$1 = (OKXConnectNetworkUtils$publish$1) continuation;
            int i = oKXConnectNetworkUtils$publish$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKXConnectNetworkUtils$publish$1.label = i - Integer.MIN_VALUE;
            } else {
                oKXConnectNetworkUtils$publish$1 = new OKXConnectNetworkUtils$publish$1(this, continuation);
            }
        }
        java.lang.Object obj = oKXConnectNetworkUtils$publish$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKXConnectNetworkUtils$publish$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!z && z3 && OLrzqt(str2)) {
                pUU.KWHzl("OKXConnectNetworkUtils", "publish message size too large, need split message");
                pUU.KWHzl("OKXConnectNetworkUtils", "originalString: " + str2);
                oKXConnectNetworkUtils$publish$1.label = 1;
                java.lang.Object objCopydefault2 = copydefault(str, str2, oKXConnectNetworkUtils$publish$1);
                return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
            }
            pUU.KWHzl("OKXConnectNetworkUtils", "publish message size no need to split message");
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder2, PushMessagingService.KEY_TOPIC, str);
            JsonElementBuildersKt.put(jsonObjectBuilder2, "message", str2);
            JsonElementBuildersKt.put(jsonObjectBuilder2, RemoteMessageConst.TTL, C56443yFo.KWHzl(z ? AYXKKw() : valueOf()));
            Unit unit = Unit.INSTANCE;
            jsonObjectBuilder.put("message", jsonObjectBuilder2.build());
            rpcMessage = new RpcMessage((java.lang.String) null, (java.lang.String) null, "publish", jsonObjectBuilder.build(), 3, (DefaultConstructorMarker) null);
            if (z) {
                JsonObjectBuilder jsonObjectBuilder3 = new JsonObjectBuilder();
                JsonObjectBuilder jsonObjectBuilder4 = new JsonObjectBuilder();
                JsonElementBuildersKt.put(jsonObjectBuilder4, PushMessagingService.KEY_TOPIC, str);
                JsonElementBuildersKt.put(jsonObjectBuilder4, RemoteMessageConst.TTL, C56443yFo.KWHzl(AYXKKw()));
                jsonObjectBuilder3.put("message", jsonObjectBuilder4.build());
                RpcMessage rpcMessage2 = new RpcMessage((java.lang.String) null, (java.lang.String) null, "disconnect", jsonObjectBuilder3.build(), 3, (DefaultConstructorMarker) null);
                oKXConnectNetworkUtils$publish$1.L$0 = this;
                oKXConnectNetworkUtils$publish$1.L$1 = rpcMessage;
                z4 = z2;
                oKXConnectNetworkUtils$publish$1.Z$0 = z4;
                oKXConnectNetworkUtils$publish$1.label = 2;
                if (KWHzl(rpcMessage2, true, (Continuation<? super Result<Unit>>) oKXConnectNetworkUtils$publish$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                z4 = z2;
            }
            c16000ebf = this;
            z5 = z4;
        } else {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(obj);
                return ((Result) obj).m7386unboximpl();
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return ((Result) obj).m7386unboximpl();
            }
            z5 = oKXConnectNetworkUtils$publish$1.Z$0;
            rpcMessage = (RpcMessage) oKXConnectNetworkUtils$publish$1.L$1;
            c16000ebf = (C16000ebf) oKXConnectNetworkUtils$publish$1.L$0;
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        oKXConnectNetworkUtils$publish$1.L$0 = null;
        oKXConnectNetworkUtils$publish$1.L$1 = null;
        oKXConnectNetworkUtils$publish$1.label = 3;
        java.lang.Object objKWHzl = c16000ebf.KWHzl(rpcMessage, z5, oKXConnectNetworkUtils$publish$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    public final boolean OLrzqt(java.lang.String str) {
        return str.length() > EZpvd();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.lang.String str, java.lang.String str2, Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        OKXConnectNetworkUtils$handleSplitMessage$1 oKXConnectNetworkUtils$handleSplitMessage$1;
        if (continuation instanceof OKXConnectNetworkUtils$handleSplitMessage$1) {
            oKXConnectNetworkUtils$handleSplitMessage$1 = (OKXConnectNetworkUtils$handleSplitMessage$1) continuation;
            int i = oKXConnectNetworkUtils$handleSplitMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKXConnectNetworkUtils$handleSplitMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                oKXConnectNetworkUtils$handleSplitMessage$1 = new OKXConnectNetworkUtils$handleSplitMessage$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = oKXConnectNetworkUtils$handleSplitMessage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKXConnectNetworkUtils$handleSplitMessage$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            OKXConnectNetworkUtils$handleSplitMessage$2 oKXConnectNetworkUtils$handleSplitMessage$2 = new OKXConnectNetworkUtils$handleSplitMessage$2(this, str2, str, null);
            oKXConnectNetworkUtils$handleSplitMessage$1.label = 1;
            objWithContext = BuildersKt.withContext(io2, oKXConnectNetworkUtils$handleSplitMessage$2, oKXConnectNetworkUtils$handleSplitMessage$1);
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

    /* JADX WARN: Removed duplicated region for block: B:30:0x00af A[Catch: Exception -> 0x00de, TryCatch #0 {Exception -> 0x00de, blocks: (B:28:0x00a9, B:30:0x00af, B:33:0x00c3, B:17:0x005f, B:20:0x0074), top: B:50:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d8 -> B:47:0x0110). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0105 -> B:46:0x0109). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(SplitMessageCache splitMessageCache, int i, Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        OKXConnectNetworkUtils$sendPackageWithRetry$1 oKXConnectNetworkUtils$sendPackageWithRetry$1;
        C16000ebf c16000ebf;
        int i2;
        int i3;
        C16000ebf c16000ebf2;
        SplitMessageCache splitMessageCache2;
        int i4;
        int i5;
        char c;
        int i6;
        int i7;
        SplitMessageCache splitMessageCache3;
        C16000ebf c16000ebf3;
        OKXConnectNetworkUtils$sendPackageWithRetry$1 oKXConnectNetworkUtils$sendPackageWithRetry$12;
        int i8;
        java.lang.Object objM7386unboximpl;
        C16000ebf c16000ebf4;
        SplitMessageCache splitMessageCache4;
        if (continuation instanceof OKXConnectNetworkUtils$sendPackageWithRetry$1) {
            oKXConnectNetworkUtils$sendPackageWithRetry$1 = (OKXConnectNetworkUtils$sendPackageWithRetry$1) continuation;
            int i9 = oKXConnectNetworkUtils$sendPackageWithRetry$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                oKXConnectNetworkUtils$sendPackageWithRetry$1.label = i9 - Integer.MIN_VALUE;
                c16000ebf = this;
            } else {
                c16000ebf = this;
                oKXConnectNetworkUtils$sendPackageWithRetry$1 = new OKXConnectNetworkUtils$sendPackageWithRetry$1(c16000ebf, continuation);
            }
        }
        java.lang.Object obj = oKXConnectNetworkUtils$sendPackageWithRetry$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i10 = oKXConnectNetworkUtils$sendPackageWithRetry$1.label;
        try {
        } catch (java.lang.Exception unused) {
            int i11 = i2;
            i2 = i10;
            i3 = i11;
            if (i2 != 2) {
                return C56443yFo.KWHzl(false);
            }
            oKXConnectNetworkUtils$sendPackageWithRetry$1.L$0 = c16000ebf2;
            oKXConnectNetworkUtils$sendPackageWithRetry$1.L$1 = splitMessageCache2;
            oKXConnectNetworkUtils$sendPackageWithRetry$1.I$0 = i4;
            oKXConnectNetworkUtils$sendPackageWithRetry$1.I$1 = i5;
            oKXConnectNetworkUtils$sendPackageWithRetry$1.I$2 = i3;
            c = 3;
            oKXConnectNetworkUtils$sendPackageWithRetry$1.label = 3;
            if (DelayKt.delay(500L, oKXConnectNetworkUtils$sendPackageWithRetry$1) == objCopydefault) {
                return objCopydefault;
            }
            i6 = i5;
            i7 = i4;
            splitMessageCache3 = splitMessageCache2;
            c16000ebf3 = c16000ebf2;
        }
        if (i10 == 0) {
            C56391yDq.AEQbTJ(obj);
            splitMessageCache4 = splitMessageCache;
            oKXConnectNetworkUtils$sendPackageWithRetry$12 = oKXConnectNetworkUtils$sendPackageWithRetry$1;
            c16000ebf4 = c16000ebf;
            i5 = 3;
            i2 = 0;
            i8 = i;
            if (i2 >= i5) {
            }
        } else if (i10 == 1) {
            i10 = oKXConnectNetworkUtils$sendPackageWithRetry$1.I$3;
            i2 = oKXConnectNetworkUtils$sendPackageWithRetry$1.I$2;
            i5 = oKXConnectNetworkUtils$sendPackageWithRetry$1.I$1;
            i4 = oKXConnectNetworkUtils$sendPackageWithRetry$1.I$0;
            splitMessageCache2 = (SplitMessageCache) oKXConnectNetworkUtils$sendPackageWithRetry$1.L$1;
            c16000ebf2 = (C16000ebf) oKXConnectNetworkUtils$sendPackageWithRetry$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
            if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            }
            int i12 = i3;
            oKXConnectNetworkUtils$sendPackageWithRetry$12 = oKXConnectNetworkUtils$sendPackageWithRetry$1;
            i8 = i7;
            i5 = i6;
            i2 = i12;
            i2++;
            splitMessageCache4 = splitMessageCache3;
            c16000ebf4 = c16000ebf3;
            if (i2 >= i5) {
            }
        } else if (i10 == 2) {
            int i13 = oKXConnectNetworkUtils$sendPackageWithRetry$1.I$3;
            i2 = oKXConnectNetworkUtils$sendPackageWithRetry$1.I$2;
            i5 = oKXConnectNetworkUtils$sendPackageWithRetry$1.I$1;
            i4 = oKXConnectNetworkUtils$sendPackageWithRetry$1.I$0;
            splitMessageCache2 = (SplitMessageCache) oKXConnectNetworkUtils$sendPackageWithRetry$1.L$1;
            c16000ebf2 = (C16000ebf) oKXConnectNetworkUtils$sendPackageWithRetry$1.L$0;
            C56391yDq.AEQbTJ(obj);
            oKXConnectNetworkUtils$sendPackageWithRetry$12 = oKXConnectNetworkUtils$sendPackageWithRetry$1;
            i8 = i4;
            splitMessageCache3 = splitMessageCache2;
            c16000ebf3 = c16000ebf2;
            c = 3;
            i2++;
            splitMessageCache4 = splitMessageCache3;
            c16000ebf4 = c16000ebf3;
            if (i2 >= i5) {
            }
        } else {
            if (i10 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = oKXConnectNetworkUtils$sendPackageWithRetry$1.I$2;
            i6 = oKXConnectNetworkUtils$sendPackageWithRetry$1.I$1;
            i7 = oKXConnectNetworkUtils$sendPackageWithRetry$1.I$0;
            splitMessageCache3 = (SplitMessageCache) oKXConnectNetworkUtils$sendPackageWithRetry$1.L$1;
            c16000ebf3 = (C16000ebf) oKXConnectNetworkUtils$sendPackageWithRetry$1.L$0;
            C56391yDq.AEQbTJ(obj);
            c = 3;
            int i122 = i3;
            oKXConnectNetworkUtils$sendPackageWithRetry$12 = oKXConnectNetworkUtils$sendPackageWithRetry$1;
            i8 = i7;
            i5 = i6;
            i2 = i122;
            i2++;
            splitMessageCache4 = splitMessageCache3;
            c16000ebf4 = c16000ebf3;
            if (i2 >= i5) {
                try {
                } catch (java.lang.Exception unused2) {
                    splitMessageCache2 = splitMessageCache4;
                    c16000ebf2 = c16000ebf4;
                    i4 = i8;
                    oKXConnectNetworkUtils$sendPackageWithRetry$1 = oKXConnectNetworkUtils$sendPackageWithRetry$12;
                    i3 = i2;
                    if (i2 != 2) {
                    }
                }
                oKXConnectNetworkUtils$sendPackageWithRetry$12.L$0 = c16000ebf4;
                oKXConnectNetworkUtils$sendPackageWithRetry$12.L$1 = splitMessageCache4;
                oKXConnectNetworkUtils$sendPackageWithRetry$12.I$0 = i8;
                oKXConnectNetworkUtils$sendPackageWithRetry$12.I$1 = i5;
                oKXConnectNetworkUtils$sendPackageWithRetry$12.I$2 = i2;
                oKXConnectNetworkUtils$sendPackageWithRetry$12.I$3 = i2;
                oKXConnectNetworkUtils$sendPackageWithRetry$12.label = 1;
                java.lang.Object objOLrzqt = c16000ebf4.OLrzqt(splitMessageCache4, i8, true, (Continuation<? super Result<Unit>>) oKXConnectNetworkUtils$sendPackageWithRetry$12);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                c16000ebf2 = c16000ebf4;
                i4 = i8;
                oKXConnectNetworkUtils$sendPackageWithRetry$1 = oKXConnectNetworkUtils$sendPackageWithRetry$12;
                i10 = i2;
                splitMessageCache2 = splitMessageCache4;
                objM7386unboximpl = objOLrzqt;
                if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    c16000ebf2.AuCTel.OLrzqt(splitMessageCache2.getTopic(), splitMessageCache2.getPackageGroupId(), i4);
                    return C56443yFo.KWHzl(true);
                }
                if (i10 < 2) {
                    oKXConnectNetworkUtils$sendPackageWithRetry$1.L$0 = c16000ebf2;
                    oKXConnectNetworkUtils$sendPackageWithRetry$1.L$1 = splitMessageCache2;
                    oKXConnectNetworkUtils$sendPackageWithRetry$1.I$0 = i4;
                    oKXConnectNetworkUtils$sendPackageWithRetry$1.I$1 = i5;
                    oKXConnectNetworkUtils$sendPackageWithRetry$1.I$2 = i2;
                    oKXConnectNetworkUtils$sendPackageWithRetry$1.I$3 = i10;
                    oKXConnectNetworkUtils$sendPackageWithRetry$1.label = 2;
                    if (DelayKt.delay(500L, oKXConnectNetworkUtils$sendPackageWithRetry$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                oKXConnectNetworkUtils$sendPackageWithRetry$12 = oKXConnectNetworkUtils$sendPackageWithRetry$1;
                i8 = i4;
                splitMessageCache3 = splitMessageCache2;
                c16000ebf3 = c16000ebf2;
                c = 3;
                i2++;
                splitMessageCache4 = splitMessageCache3;
                c16000ebf4 = c16000ebf3;
                if (i2 >= i5) {
                    return C56443yFo.KWHzl(false);
                }
                int i1222 = i3;
                oKXConnectNetworkUtils$sendPackageWithRetry$12 = oKXConnectNetworkUtils$sendPackageWithRetry$1;
                i8 = i7;
                i5 = i6;
                i2 = i1222;
                i2++;
                splitMessageCache4 = splitMessageCache3;
                c16000ebf4 = c16000ebf3;
                if (i2 >= i5) {
                }
            }
        }
    }

    public final java.lang.Object OLrzqt(java.util.List<java.lang.String> list, Continuation<? super Job> continuation) {
        return BuildersKt__Builders_commonKt.launch$default(this.fARcdN, this.gEmmrt, null, new OKXConnectNetworkUtils$resumePendingMessages$2(this, list, null), 2, null);
    }

    public final java.lang.Object AEQbTJ(java.lang.String str, Continuation<? super Unit> continuation) {
        this.AuCTel.EZpvd(str);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(SplitMessageCache splitMessageCache, int i, boolean z, Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        OKXConnectNetworkUtils$sendSplitPackage$1 oKXConnectNetworkUtils$sendSplitPackage$1;
        if (continuation instanceof OKXConnectNetworkUtils$sendSplitPackage$1) {
            oKXConnectNetworkUtils$sendSplitPackage$1 = (OKXConnectNetworkUtils$sendSplitPackage$1) continuation;
            int i2 = oKXConnectNetworkUtils$sendSplitPackage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oKXConnectNetworkUtils$sendSplitPackage$1.label = i2 - Integer.MIN_VALUE;
            } else {
                oKXConnectNetworkUtils$sendSplitPackage$1 = new OKXConnectNetworkUtils$sendSplitPackage$1(this, continuation);
            }
        }
        java.lang.Object obj = oKXConnectNetworkUtils$sendSplitPackage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = oKXConnectNetworkUtils$sendSplitPackage$1.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        java.lang.String str = splitMessageCache.getPackages().get(i);
        Json jsonKWHzl = KWHzl();
        SplitMessage splitMessage = new SplitMessage(2, splitMessageCache.getTotalCount(), splitMessageCache.getPackageGroupId(), i, str);
        jsonKWHzl.getSerializersModule();
        java.lang.String strEncodeToString = jsonKWHzl.encodeToString(SplitMessage.Companion.serializer(), splitMessage);
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder2, PushMessagingService.KEY_TOPIC, splitMessageCache.getTopic());
        JsonElementBuildersKt.put(jsonObjectBuilder2, "message", strEncodeToString);
        JsonElementBuildersKt.put(jsonObjectBuilder2, RemoteMessageConst.TTL, C56443yFo.KWHzl(valueOf()));
        Unit unit = Unit.INSTANCE;
        jsonObjectBuilder.put("message", jsonObjectBuilder2.build());
        RpcMessage rpcMessage = new RpcMessage((java.lang.String) null, (java.lang.String) null, "publish", jsonObjectBuilder.build(), 3, (DefaultConstructorMarker) null);
        oKXConnectNetworkUtils$sendSplitPackage$1.label = 1;
        java.lang.Object objKWHzl = KWHzl(rpcMessage, z, oKXConnectNetworkUtils$sendSplitPackage$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    public final java.util.List<java.lang.String> AEQbTJ(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (str.length() > 0) {
            int iMin = java.lang.Math.min(EZpvd(), str.length());
            java.lang.String strSubstring = str.substring(0, iMin);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            arrayList.add(strSubstring);
            str = str.substring(iMin);
            Intrinsics.checkNotNullExpressionValue(str, "");
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        OKXConnectNetworkUtils$unsubscribe$1 oKXConnectNetworkUtils$unsubscribe$1;
        if (continuation instanceof OKXConnectNetworkUtils$unsubscribe$1) {
            oKXConnectNetworkUtils$unsubscribe$1 = (OKXConnectNetworkUtils$unsubscribe$1) continuation;
            int i = oKXConnectNetworkUtils$unsubscribe$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKXConnectNetworkUtils$unsubscribe$1.label = i - Integer.MIN_VALUE;
            } else {
                oKXConnectNetworkUtils$unsubscribe$1 = new OKXConnectNetworkUtils$unsubscribe$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = oKXConnectNetworkUtils$unsubscribe$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKXConnectNetworkUtils$unsubscribe$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.gEmmrt;
            OKXConnectNetworkUtils$unsubscribe$2 oKXConnectNetworkUtils$unsubscribe$2 = new OKXConnectNetworkUtils$unsubscribe$2(this, str, null);
            oKXConnectNetworkUtils$unsubscribe$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, oKXConnectNetworkUtils$unsubscribe$2, oKXConnectNetworkUtils$unsubscribe$1);
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

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcMessage.copy$default(com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcMessage, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject, int, java.lang.Object):com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcMessage */
    public final RpcMessage KWHzl(RpcMessage rpcMessage) {
        final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        this.valueOf.updateAndGet(new LongUnaryOperator() { // from class: o.ebc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.LongUnaryOperator
            public final long applyAsLong(long j) {
                return C16000ebf.AEQbTJ(jCurrentTimeMillis, j);
            }
        });
        return RpcMessage.copy$default(rpcMessage, null, java.lang.String.valueOf(this.valueOf), null, null, 13, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(RpcMessage rpcMessage, boolean z, Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        OKXConnectNetworkUtils$sendMessage$1 oKXConnectNetworkUtils$sendMessage$1;
        if (continuation instanceof OKXConnectNetworkUtils$sendMessage$1) {
            oKXConnectNetworkUtils$sendMessage$1 = (OKXConnectNetworkUtils$sendMessage$1) continuation;
            int i = oKXConnectNetworkUtils$sendMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKXConnectNetworkUtils$sendMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                oKXConnectNetworkUtils$sendMessage$1 = new OKXConnectNetworkUtils$sendMessage$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = oKXConnectNetworkUtils$sendMessage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKXConnectNetworkUtils$sendMessage$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.gEmmrt;
            OKXConnectNetworkUtils$sendMessage$2 oKXConnectNetworkUtils$sendMessage$2 = new OKXConnectNetworkUtils$sendMessage$2(this, rpcMessage, z, null);
            oKXConnectNetworkUtils$sendMessage$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, oKXConnectNetworkUtils$sendMessage$2, oKXConnectNetworkUtils$sendMessage$1);
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

    public final Job AuCTel() {
        return BuildersKt__Builders_commonKt.launch$default(this.fARcdN, null, null, new OKXConnectNetworkUtils$startObservingWsConnection$1(this, null), 3, null);
    }

    public final Job ejfBZ() {
        return BuildersKt__Builders_commonKt.launch$default(this.fARcdN, null, null, new OKXConnectNetworkUtils$startObservingPushMessages$1(this, null), 3, null);
    }

    public final Job AkhnZx() {
        return BuildersKt__Builders_commonKt.launch$default(this.fARcdN, null, null, new OKXConnectNetworkUtils$startObservingDisconnectMessages$1(this, null), 3, null);
    }

    public final Job fARcdN() {
        return BuildersKt__Builders_commonKt.launch$default(this.fARcdN, null, null, new OKXConnectNetworkUtils$startObservingSplitMessagePushMessages$1(this, null), 3, null);
    }

    public final Job DbNXlk() {
        return BuildersKt__Builders_commonKt.launch$default(this.fARcdN, null, null, new OKXConnectNetworkUtils$startObservingFetchSuccess$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(Data data, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKXConnectNetworkUtils$onNewDataReceived$1 oKXConnectNetworkUtils$onNewDataReceived$1;
        C16000ebf c16000ebf;
        if (continuation instanceof OKXConnectNetworkUtils$onNewDataReceived$1) {
            oKXConnectNetworkUtils$onNewDataReceived$1 = (OKXConnectNetworkUtils$onNewDataReceived$1) continuation;
            int i = oKXConnectNetworkUtils$onNewDataReceived$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKXConnectNetworkUtils$onNewDataReceived$1.label = i - Integer.MIN_VALUE;
            } else {
                oKXConnectNetworkUtils$onNewDataReceived$1 = new OKXConnectNetworkUtils$onNewDataReceived$1(this, continuation);
            }
        }
        java.lang.Object obj = oKXConnectNetworkUtils$onNewDataReceived$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKXConnectNetworkUtils$onNewDataReceived$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (Intrinsics.EZpvd(data.isInternalData(), C56443yFo.KWHzl(true))) {
                pUU.KWHzl("OKXConnectNetworkUtils", "isInternalData true, " + data);
                kotlinx.coroutines.channels.Channel<Data> channel = this.OLrzqt;
                oKXConnectNetworkUtils$onNewDataReceived$1.L$0 = this;
                oKXConnectNetworkUtils$onNewDataReceived$1.L$1 = data;
                oKXConnectNetworkUtils$onNewDataReceived$1.label = 1;
                if (channel.send(data, oKXConnectNetworkUtils$onNewDataReceived$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (AEQbTJ(data)) {
                    kotlinx.coroutines.channels.Channel<Data> channel2 = this.KWHzl;
                    oKXConnectNetworkUtils$onNewDataReceived$1.label = 2;
                    if (channel2.send(data, oKXConnectNetworkUtils$onNewDataReceived$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                pUU.KWHzl("OKXConnectNetworkUtils", "isInternalData false, " + data);
                kotlinx.coroutines.channels.Channel<Data> channel3 = this.EZpvd;
                oKXConnectNetworkUtils$onNewDataReceived$1.L$0 = this;
                oKXConnectNetworkUtils$onNewDataReceived$1.L$1 = data;
                oKXConnectNetworkUtils$onNewDataReceived$1.label = 3;
                if (channel3.send(data, oKXConnectNetworkUtils$onNewDataReceived$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
            c16000ebf = this;
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder, "messageId", data.getMessageId());
            JsonElementBuildersKt.put(jsonObjectBuilder, PushMessagingService.KEY_TOPIC, data.getTopic());
            Unit unit = Unit.INSTANCE;
            RpcMessage rpcMessage = new RpcMessage((java.lang.String) null, (java.lang.String) null, "receive", jsonObjectBuilder.build(), 3, (DefaultConstructorMarker) null);
            pUU.KWHzl("OKXConnectNetworkUtils", "onNewDataReceived " + rpcMessage);
            AbstractC57572yku abstractC57572ykuFetchVPNInfo = c16000ebf.fetchVPNInfo();
            Json jsonKWHzl = c16000ebf.KWHzl();
            jsonKWHzl.getSerializersModule();
            abstractC57572ykuFetchVPNInfo.copydefault(jsonKWHzl.encodeToString(RpcMessage.Companion.serializer(), rpcMessage));
            return unit;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            if (i2 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        data = (Data) oKXConnectNetworkUtils$onNewDataReceived$1.L$1;
        c16000ebf = (C16000ebf) oKXConnectNetworkUtils$onNewDataReceived$1.L$0;
        C56391yDq.AEQbTJ(obj);
        JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder2, "messageId", data.getMessageId());
        JsonElementBuildersKt.put(jsonObjectBuilder2, PushMessagingService.KEY_TOPIC, data.getTopic());
        Unit unit2 = Unit.INSTANCE;
        RpcMessage rpcMessage2 = new RpcMessage((java.lang.String) null, (java.lang.String) null, "receive", jsonObjectBuilder2.build(), 3, (DefaultConstructorMarker) null);
        pUU.KWHzl("OKXConnectNetworkUtils", "onNewDataReceived " + rpcMessage2);
        AbstractC57572yku abstractC57572ykuFetchVPNInfo2 = c16000ebf.fetchVPNInfo();
        Json jsonKWHzl2 = c16000ebf.KWHzl();
        jsonKWHzl2.getSerializersModule();
        abstractC57572ykuFetchVPNInfo2.copydefault(jsonKWHzl2.encodeToString(RpcMessage.Companion.serializer(), rpcMessage2));
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Data data, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKXConnectNetworkUtils$onHandleIncomingSplitData$1 oKXConnectNetworkUtils$onHandleIncomingSplitData$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        java.lang.String packageGroupId;
        C16000ebf c16000ebf;
        if (continuation instanceof OKXConnectNetworkUtils$onHandleIncomingSplitData$1) {
            oKXConnectNetworkUtils$onHandleIncomingSplitData$1 = (OKXConnectNetworkUtils$onHandleIncomingSplitData$1) continuation;
            int i = oKXConnectNetworkUtils$onHandleIncomingSplitData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKXConnectNetworkUtils$onHandleIncomingSplitData$1.label = i - Integer.MIN_VALUE;
            } else {
                oKXConnectNetworkUtils$onHandleIncomingSplitData$1 = new OKXConnectNetworkUtils$onHandleIncomingSplitData$1(this, continuation);
            }
        }
        java.lang.Object obj = oKXConnectNetworkUtils$onHandleIncomingSplitData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKXConnectNetworkUtils$onHandleIncomingSplitData$1.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("OKXConnectNetworkUtils", "onHandleIncomingSplitData " + data);
            Result.Application application2 = Result.Companion;
            SplitMessage splitMessage = (SplitMessage) KWHzl().decodeFromString(SplitMessage.Companion.serializer(), data.getMessage());
            if (C33129mqd.copydefault(C56443yFo.AEQbTJ(splitMessage.getProtocolVersion()), C56443yFo.AEQbTJ(2))) {
                CachedSplitData cachedSplitData = new CachedSplitData(data.getMessageId(), data.getTopic(), splitMessage, data.getPublishedAt());
                packageGroupId = cachedSplitData.getMessage().getPackageGroupId();
                int packageIndex = cachedSplitData.getMessage().getPackageIndex();
                int totalCount = cachedSplitData.getMessage().getTotalCount();
                ConcurrentHashMap<java.lang.String, CachedSplitData[]> concurrentHashMap = this.isConnected;
                CachedSplitData[] cachedSplitDataArr = concurrentHashMap.get(packageGroupId);
                if (cachedSplitDataArr == null) {
                    cachedSplitDataArr = new CachedSplitData[totalCount];
                    for (int i3 = 0; i3 < totalCount; i3++) {
                        cachedSplitDataArr[i3] = null;
                    }
                    CachedSplitData[] cachedSplitDataArrPutIfAbsent = concurrentHashMap.putIfAbsent(packageGroupId, cachedSplitDataArr);
                    if (cachedSplitDataArrPutIfAbsent != null) {
                        cachedSplitDataArr = cachedSplitDataArrPutIfAbsent;
                    }
                }
                CachedSplitData[] cachedSplitDataArr2 = cachedSplitDataArr;
                if (cachedSplitDataArr2.length > packageIndex) {
                    cachedSplitDataArr2[packageIndex] = cachedSplitData;
                    Intrinsics.copydefault(cachedSplitDataArr2);
                    for (CachedSplitData cachedSplitData2 : cachedSplitDataArr2) {
                        if (cachedSplitData2 == null) {
                            break;
                        }
                    }
                    pUU.KWHzl("OKXConnectNetworkUtils", "onHandleIncomingSplitData: collected all the split messages");
                    oKXConnectNetworkUtils$onHandleIncomingSplitData$1.L$0 = this;
                    oKXConnectNetworkUtils$onHandleIncomingSplitData$1.L$1 = packageGroupId;
                    oKXConnectNetworkUtils$onHandleIncomingSplitData$1.label = 1;
                    if (OLrzqt(cachedSplitDataArr2, oKXConnectNetworkUtils$onHandleIncomingSplitData$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    c16000ebf = this;
                }
            } else {
                pUU.KWHzl("OKXConnectNetworkUtils", "onHandleIncomingSplitData version not support- " + splitMessage.getProtocolVersion());
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("OKXConnectNetworkUtils", "Error onHandleIncomingSplitData - " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        packageGroupId = (java.lang.String) oKXConnectNetworkUtils$onHandleIncomingSplitData$1.L$1;
        c16000ebf = (C16000ebf) oKXConnectNetworkUtils$onHandleIncomingSplitData$1.L$0;
        C56391yDq.AEQbTJ(obj);
        c16000ebf.isConnected.remove(packageGroupId);
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    public final boolean AEQbTJ(Data data) {
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) data.getMessage(), (java.lang.CharSequence) "package_group_id", false, 2, (java.lang.Object) null) && StringsKt__StringsKt.contains$default((java.lang.CharSequence) data.getMessage(), (java.lang.CharSequence) "protocol_version", false, 2, (java.lang.Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00fb -> B:30:0x00fe). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull CachedSplitData[] cachedSplitDataArr, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKXConnectNetworkUtils$ackAndSendPushData$1 oKXConnectNetworkUtils$ackAndSendPushData$1;
        C16000ebf c16000ebf;
        CachedSplitData[] cachedSplitDataArr2;
        C16000ebf c16000ebf2;
        java.util.Iterator it;
        if (continuation instanceof OKXConnectNetworkUtils$ackAndSendPushData$1) {
            oKXConnectNetworkUtils$ackAndSendPushData$1 = (OKXConnectNetworkUtils$ackAndSendPushData$1) continuation;
            int i = oKXConnectNetworkUtils$ackAndSendPushData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKXConnectNetworkUtils$ackAndSendPushData$1.label = i - Integer.MIN_VALUE;
            } else {
                oKXConnectNetworkUtils$ackAndSendPushData$1 = new OKXConnectNetworkUtils$ackAndSendPushData$1(this, continuation);
            }
        }
        java.lang.Object obj = oKXConnectNetworkUtils$ackAndSendPushData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKXConnectNetworkUtils$ackAndSendPushData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            CachedSplitData cachedSplitData = (CachedSplitData) yDV.AubY(cachedSplitDataArr);
            if (cachedSplitData == null) {
                return Unit.INSTANCE;
            }
            java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(yDV.getFieldNames(cachedSplitDataArr), "", null, null, 0, null, new Function1() { // from class: o.ebh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C16000ebf.AEQbTJ((CachedSplitData) obj2);
                }
            }, 30, null);
            pUU.KWHzl("OKXConnectNetworkUtils", "merge all the split messages and mock the push data");
            kotlinx.coroutines.channels.Channel<Data> channel = this.EZpvd;
            Data data = new Data(cachedSplitData.getMessageId(), cachedSplitData.getTopic(), strJoinToString$default, C56443yFo.KWHzl(false), cachedSplitData.getPublishedAt());
            oKXConnectNetworkUtils$ackAndSendPushData$1.L$0 = this;
            oKXConnectNetworkUtils$ackAndSendPushData$1.L$1 = cachedSplitDataArr;
            oKXConnectNetworkUtils$ackAndSendPushData$1.label = 1;
            if (channel.send(data, oKXConnectNetworkUtils$ackAndSendPushData$1) == objCopydefault) {
                return objCopydefault;
            }
            c16000ebf = this;
            cachedSplitDataArr2 = cachedSplitDataArr;
        } else if (i2 == 1) {
            cachedSplitDataArr2 = (CachedSplitData[]) oKXConnectNetworkUtils$ackAndSendPushData$1.L$1;
            c16000ebf = (C16000ebf) oKXConnectNetworkUtils$ackAndSendPushData$1.L$0;
            C56391yDq.AEQbTJ(obj);
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CachedSplitData cachedSplitData2 = (CachedSplitData) oKXConnectNetworkUtils$ackAndSendPushData$1.L$2;
            it = (java.util.Iterator) oKXConnectNetworkUtils$ackAndSendPushData$1.L$1;
            c16000ebf2 = (C16000ebf) oKXConnectNetworkUtils$ackAndSendPushData$1.L$0;
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
            pUU.KWHzl("OKXConnectNetworkUtils", "send receive ack: " + cachedSplitData2.getMessage().getPackageIndex() + ", " + cachedSplitData2.getMessageId() + ", " + cachedSplitData2.getTopic());
            if (it.hasNext()) {
                cachedSplitData2 = (CachedSplitData) it.next();
                JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                JsonElementBuildersKt.put(jsonObjectBuilder, "messageId", cachedSplitData2.getMessageId());
                JsonElementBuildersKt.put(jsonObjectBuilder, PushMessagingService.KEY_TOPIC, cachedSplitData2.getTopic());
                Unit unit = Unit.INSTANCE;
                RpcMessage rpcMessage = new RpcMessage((java.lang.String) null, (java.lang.String) null, "receive", jsonObjectBuilder.build(), 3, (DefaultConstructorMarker) null);
                oKXConnectNetworkUtils$ackAndSendPushData$1.L$0 = c16000ebf2;
                oKXConnectNetworkUtils$ackAndSendPushData$1.L$1 = it;
                oKXConnectNetworkUtils$ackAndSendPushData$1.L$2 = cachedSplitData2;
                oKXConnectNetworkUtils$ackAndSendPushData$1.label = 2;
                if (c16000ebf2.KWHzl(rpcMessage, false, (Continuation<? super Result<Unit>>) oKXConnectNetworkUtils$ackAndSendPushData$1) == objCopydefault) {
                    return objCopydefault;
                }
                pUU.KWHzl("OKXConnectNetworkUtils", "send receive ack: " + cachedSplitData2.getMessage().getPackageIndex() + ", " + cachedSplitData2.getMessageId() + ", " + cachedSplitData2.getTopic());
                if (it.hasNext()) {
                    return Unit.INSTANCE;
                }
            }
        }
        c16000ebf2 = c16000ebf;
        it = yDV.getFieldNames(cachedSplitDataArr2).iterator();
        if (it.hasNext()) {
        }
    }

    public static final java.lang.CharSequence AEQbTJ(CachedSplitData cachedSplitData) {
        Intrinsics.checkNotNullParameter(cachedSplitData, "");
        return cachedSplitData.getMessage().getContent();
    }

    public final Job isConnected() {
        return BuildersKt__Builders_commonKt.launch$default(this.fARcdN, this.gEmmrt, null, new OKXConnectNetworkUtils$loginWebSocket$1(this, null), 2, null);
    }

    public final java.lang.Object AEQbTJ(Continuation<? super java.lang.String> continuation) {
        return BuildersKt.withContext(this.gEmmrt, new OKXConnectNetworkUtils$getJwtToken$2(this, null), continuation);
    }

    public final long AhwBna() {
        return gEmmrt();
    }

    public final void fJNWhG() {
        java.lang.Boolean value;
        MutableStateFlow<java.lang.Boolean> mutableStateFlow = this.AYXKKw;
        do {
            value = mutableStateFlow.getValue();
            value.booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, java.lang.Boolean.FALSE));
        fetchVPNInfo().djBIcL();
        pUU.KWHzl("OKXConnectNetworkUtils", "Stop websocket");
    }
}

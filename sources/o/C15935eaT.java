package o;

import com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$addDAppSession$1;
import com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$cancelConnecting$1;
import com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$connectToDApp$2;
import com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$connectToDAppAndSign$2;
import com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$disconnectDApp$1;
import com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$getDAppSessionsByWalletId$2;
import com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$notifySessionConnecting$1;
import com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$onHandleDisconnect$1;
import com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$onHandleSessionInfoData$1;
import com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$rejectRequestNotInWallet$1;
import com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$removeDAppSession$1;
import com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$removeDAppSessions$1;
import com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$removeExpiredSessions$1;
import com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$startDisconnectListener$1;
import com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$startPushDataListener$1;
import com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$startWebSocketIfSessionExists$1;
import com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$subscribeFetchAndGetSessionInfo$1;
import com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$subscribeFetchAndGetSessionInfo$sessionInfo$1;
import com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$unsubscribe$1;
import com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$validateConnectRequest$2;
import com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession;
import com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException;
import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest;
import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest;
import com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent;
import com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletResponse;
import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data;
import com.okinc.business.defi.wallet.common.tonconnect.ValidateCanConnectResult;
import com.okinc.wallet.core.sign.ton.X25519KeyPair;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.JsonPrimitive;
import o.C13754dXa;
import o.C59462zhW;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eaT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15935eaT {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public DAppConnectRequest AEQbTJ;
    public final CoroutineScope AYXKKw;
    public final Flow<C16061ecn> AhwBna;
    public final C16011ebq AkhnZx;
    public final C54819xWm DbNXlk;
    public final MutableSharedFlow<C16061ecn> KWHzl;
    public final C16013ebs OLrzqt;
    public final C16015ebu copydefault;
    public final C15974ebF djBIcL;
    public final MutableSharedFlow<DAppConnectRequest> ejfBZ;
    public final ConcurrentHashMap<java.lang.String, java.lang.String> fARcdN;
    public final C48787ucK fIwbmz;
    public final yDQ<java.lang.String> fJNWhG;
    public final C16000ebf fetchVPNInfo;
    public final Json gEmmrt;
    public java.lang.String isConnected;
    public final CoroutineDispatcher valueOf;
    public final InterfaceC33171mrS values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentHashMap<java.lang.String, java.lang.String> EZpvd() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<C16061ecn> KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DAppConnectRequest copydefault() {
        return this.AEQbTJ;
    }

    public C15935eaT(@NotNull C16015ebu c16015ebu, @NotNull C54819xWm c54819xWm, @NotNull InterfaceC33171mrS interfaceC33171mrS, @NotNull C16011ebq c16011ebq, @NotNull C16013ebs c16013ebs, @NotNull C15974ebF c15974ebF, @NotNull C16000ebf c16000ebf, @NotNull C48787ucK c48787ucK, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c16015ebu, "");
        Intrinsics.checkNotNullParameter(c54819xWm, "");
        Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
        Intrinsics.checkNotNullParameter(c16011ebq, "");
        Intrinsics.checkNotNullParameter(c16013ebs, "");
        Intrinsics.checkNotNullParameter(c15974ebF, "");
        Intrinsics.checkNotNullParameter(c16000ebf, "");
        Intrinsics.checkNotNullParameter(c48787ucK, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = c16015ebu;
        this.DbNXlk = c54819xWm;
        this.values = interfaceC33171mrS;
        this.AkhnZx = c16011ebq;
        this.OLrzqt = c16013ebs;
        this.djBIcL = c15974ebF;
        this.fetchVPNInfo = c16000ebf;
        this.fIwbmz = c48787ucK;
        this.valueOf = coroutineDispatcher;
        this.AYXKKw = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
        this.gEmmrt = JsonKt.Json$default(null, new Function1() { // from class: o.eaU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15935eaT.OLrzqt((JsonBuilder) obj);
            }
        }, 1, null);
        MutableSharedFlow<C16061ecn> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.AhwBna = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.ejfBZ = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.fJNWhG = new yDQ<>(50);
        this.fARcdN = new ConcurrentHashMap<>();
        gEmmrt();
        djBIcL();
        AhwBna();
        valueOf();
        AYXKKw();
    }

    /* JADX INFO: renamed from: o.eaT$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eaT.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C15935eaT getInstance$default(ActionBar actionBar, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return actionBar.KWHzl(context);
        }

        public final C15935eaT KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).fJNWhG();
        }
    }

    public static final Unit OLrzqt(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.eaT$Activity */
    public static final class Activity implements InterfaceC54816xWj {
        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
        }

        public Activity() {
        }

        @Override // o.InterfaceC54816xWj
        public void OLrzqt(android.app.Activity activity) {
            pUU.KWHzl("OKXConnectManager", "onAppEnterForegroundIdle");
            C15935eaT.this.valueOf();
        }
    }

    public final void AhwBna() {
        this.DbNXlk.AEQbTJ(new Activity());
    }

    public final Job valueOf() {
        return BuildersKt__Builders_commonKt.launch$default(this.AYXKKw, null, null, new OKXConnectManager$startWebSocketIfSessionExists$1(this, null), 3, null);
    }

    public final void values() {
        this.fetchVPNInfo.fJNWhG();
    }

    public final Job gEmmrt() {
        return BuildersKt__Builders_commonKt.launch$default(this.AYXKKw, null, null, new OKXConnectManager$startPushDataListener$1(this, null), 3, null);
    }

    public final Job djBIcL() {
        return BuildersKt__Builders_commonKt.launch$default(this.AYXKKw, null, null, new OKXConnectManager$startDisconnectListener$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095 A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:13:0x002e, B:43:0x00bf, B:29:0x007e, B:30:0x008e, B:32:0x0095, B:36:0x00a8, B:38:0x00ac, B:40:0x00b2, B:23:0x0051, B:25:0x006d), top: B:53:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKXConnectManager$onHandleDisconnect$1 oKXConnectManager$onHandleDisconnect$1;
        java.lang.String str2;
        java.lang.Throwable th;
        java.lang.Object objM7377constructorimpl;
        java.lang.Object obj;
        C15935eaT c15935eaT;
        java.util.Iterator it;
        java.lang.Object next;
        DAppSession dAppSession;
        java.lang.String clientId;
        if (continuation instanceof OKXConnectManager$onHandleDisconnect$1) {
            oKXConnectManager$onHandleDisconnect$1 = (OKXConnectManager$onHandleDisconnect$1) continuation;
            int i = oKXConnectManager$onHandleDisconnect$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKXConnectManager$onHandleDisconnect$1.label = i - Integer.MIN_VALUE;
            } else {
                oKXConnectManager$onHandleDisconnect$1 = new OKXConnectManager$onHandleDisconnect$1(this, continuation);
            }
        }
        java.lang.Object obj2 = oKXConnectManager$onHandleDisconnect$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKXConnectManager$onHandleDisconnect$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj2);
                Result.Application application = Result.Companion;
                pUU.KWHzl("OKXConnectManager", "onHandleDisconnect " + str);
                if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                    C16011ebq c16011ebq = this.AkhnZx;
                    oKXConnectManager$onHandleDisconnect$1.L$0 = str;
                    oKXConnectManager$onHandleDisconnect$1.L$1 = this;
                    oKXConnectManager$onHandleDisconnect$1.label = 1;
                    java.lang.Object objOLrzqt = c16011ebq.OLrzqt(oKXConnectManager$onHandleDisconnect$1);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    obj = objOLrzqt;
                    c15935eaT = this;
                    it = C56403yEb.QOLQEE(((java.util.Map) obj).values()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    dAppSession = (DAppSession) next;
                    if (dAppSession != null) {
                        oKXConnectManager$onHandleDisconnect$1.L$0 = str;
                        oKXConnectManager$onHandleDisconnect$1.L$1 = null;
                        oKXConnectManager$onHandleDisconnect$1.label = 2;
                        if (c15935eaT.AhwBna(clientId, oKXConnectManager$onHandleDisconnect$1) == objCopydefault) {
                        }
                    }
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } else if (i2 == 1) {
                C15935eaT c15935eaT2 = (C15935eaT) oKXConnectManager$onHandleDisconnect$1.L$1;
                str2 = (java.lang.String) oKXConnectManager$onHandleDisconnect$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj2);
                    c15935eaT = c15935eaT2;
                    str = str2;
                    obj = obj2;
                    it = C56403yEb.QOLQEE(((java.util.Map) obj).values()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((DAppSession) next).getTopic())) {
                            break;
                        }
                    }
                    dAppSession = (DAppSession) next;
                    if (dAppSession != null && (clientId = dAppSession.getClientId()) != null) {
                        oKXConnectManager$onHandleDisconnect$1.L$0 = str;
                        oKXConnectManager$onHandleDisconnect$1.L$1 = null;
                        oKXConnectManager$onHandleDisconnect$1.label = 2;
                        if (c15935eaT.AhwBna(clientId, oKXConnectManager$onHandleDisconnect$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    str = str2;
                }
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) oKXConnectManager$onHandleDisconnect$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            }
        } catch (java.lang.Throwable th3) {
            str2 = str;
            th = th3;
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("OKXConnectManager", "onHandleDisconnect failed for " + str, thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.copy$default(com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest, int, java.lang.String, java.lang.String, com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo, java.lang.String, java.util.Set, java.lang.String, java.lang.Integer, int, java.lang.Object):com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100 A[Catch: all -> 0x012a, CancellationException -> 0x0146, TryCatch #2 {CancellationException -> 0x0146, all -> 0x012a, blocks: (B:12:0x002d, B:47:0x00fa, B:49:0x0100, B:50:0x0118, B:17:0x003d, B:19:0x0057, B:21:0x005d, B:23:0x006b, B:25:0x0071, B:27:0x0077, B:29:0x007f, B:32:0x0087, B:34:0x0095, B:36:0x009b, B:38:0x00a1, B:40:0x00ab, B:42:0x00d3, B:52:0x011d, B:54:0x0123), top: B:65:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Data data, Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        OKXConnectManager$onHandleSessionInfoData$1 oKXConnectManager$onHandleSessionInfoData$1;
        java.lang.Object objM7377constructorimpl;
        JsonPrimitive jsonPrimitive;
        java.lang.String content;
        ByteString byteStringDecodeBase64;
        java.lang.String strUtf8;
        java.lang.Object objKWHzl;
        java.lang.Object obj;
        JsonPrimitive jsonPrimitive2;
        java.lang.String content2;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof OKXConnectManager$onHandleSessionInfoData$1) {
            oKXConnectManager$onHandleSessionInfoData$1 = (OKXConnectManager$onHandleSessionInfoData$1) continuation;
            int i = oKXConnectManager$onHandleSessionInfoData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKXConnectManager$onHandleSessionInfoData$1.label = i - Integer.MIN_VALUE;
            } else {
                oKXConnectManager$onHandleSessionInfoData$1 = new OKXConnectManager$onHandleSessionInfoData$1(this, continuation);
            }
        }
        java.lang.Object obj2 = oKXConnectManager$onHandleSessionInfoData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKXConnectManager$onHandleSessionInfoData$1.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            Result.Application application2 = Result.Companion;
            DAppRequest dAppRequest = (DAppRequest) this.gEmmrt.decodeFromString(DAppRequest.Companion.serializer(), data.getMessage());
            if (dAppRequest.isSessionInfo() && dAppRequest.getParams() != null) {
                JsonElement jsonElement = (JsonElement) dAppRequest.getParams().get((java.lang.Object) "sessionInfo");
                if (jsonElement != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) != null && (content = jsonPrimitive.getContent()) != null && (byteStringDecodeBase64 = ByteString.Companion.decodeBase64(content)) != null && (strUtf8 = byteStringDecodeBase64.utf8()) != null) {
                    JsonElement jsonElement2 = (JsonElement) dAppRequest.getParams().get((java.lang.Object) "protocolVersion");
                    java.lang.Integer numAEQbTJ = (jsonElement2 == null || (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement2)) == null || (content2 = jsonPrimitive2.getContent()) == null) ? null : C56443yFo.AEQbTJ(java.lang.Integer.parseInt(content2));
                    pUU.KWHzl("OKXConnectManager", "hexCipher: " + strUtf8 + ", newProtocolVersion: " + numAEQbTJ);
                    objKWHzl = this.OLrzqt.KWHzl(strUtf8);
                    if (Result.m7384isSuccessimpl(objKWHzl)) {
                        DAppConnectRequest dAppConnectRequest = (DAppConnectRequest) objKWHzl;
                        MutableSharedFlow<DAppConnectRequest> mutableSharedFlow = this.ejfBZ;
                        DAppConnectRequest dAppConnectRequestCopy = dAppConnectRequest.copy((127 & 1) != 0 ? dAppConnectRequest.protocolVer : 0, (127 & 2) != 0 ? dAppConnectRequest.topic : null, (127 & 4) != 0 ? dAppConnectRequest.clientId : null, (127 & 8) != 0 ? dAppConnectRequest.dAppInfo : null, (127 & 16) != 0 ? dAppConnectRequest.requestId : null, (127 & 32) != 0 ? dAppConnectRequest.requests : null, (127 & 64) != 0 ? dAppConnectRequest.redirect : null, (127 & 128) != 0 ? dAppConnectRequest.newProtocolVersion : numAEQbTJ);
                        oKXConnectManager$onHandleSessionInfoData$1.L$0 = objKWHzl;
                        oKXConnectManager$onHandleSessionInfoData$1.label = 1;
                        if (mutableSharedFlow.emit(dAppConnectRequestCopy, oKXConnectManager$onHandleSessionInfoData$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        obj = objKWHzl;
                    }
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.AEQbTJ("OKXConnectManager", "Failed to decode connect request - " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
                    }
                    return C56443yFo.KWHzl(true);
                }
                return C56443yFo.KWHzl(false);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                pUU.KWHzl("OKXConnectManager", "Not a sessioninfo data");
            }
            return C56443yFo.KWHzl(false);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj = oKXConnectManager$onHandleSessionInfoData$1.L$0;
        C56391yDq.AEQbTJ(obj2);
        objKWHzl = obj;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return C56443yFo.KWHzl(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [265=37] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:820:0x19a3
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final java.lang.Object copydefault(com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r70, kotlin.coroutines.Continuation<? super kotlin.Unit> r71) {
        /*
            r69 = this;
            r1 = r69
            r2 = r70
            r3 = r71
            boolean r4 = r3 instanceof com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$onHandleIncomingData$1
            if (r4 == 0) goto L19
            r4 = r3
            com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$onHandleIncomingData$1 r4 = (com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$onHandleIncomingData$1) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L19
            int r5 = r5 + r6
            r4.label = r5
            goto L1e
        L19:
            com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$onHandleIncomingData$1 r4 = new com.okinc.business.defi.wallet.common.okxconnect.OKXConnectManager$onHandleIncomingData$1
            r4.<init>(r1, r3)
        L1e:
            java.lang.Object r3 = r4.result
            java.lang.Object r15 = o.C56437yFi.OLrzqt()
            int r5 = r4.label
            r12 = 1
            java.lang.String r16 = ""
            java.lang.String r10 = "message"
            java.lang.String r9 = " of "
            java.lang.String r8 = "OKXConnectManager"
            switch(r5) {
                case 0: goto L74b;
                case 1: goto L735;
                case 2: goto L720;
                case 3: goto L717;
                case 4: goto L6fe;
                case 5: goto L6f9;
                case 6: goto L6db;
                case 7: goto L6ae;
                case 8: goto L681;
                case 9: goto L654;
                case 10: goto L627;
                case 11: goto L5fa;
                case 12: goto L5ce;
                case 13: goto L5a2;
                case 14: goto L574;
                case 15: goto L547;
                case 16: goto L51a;
                case 17: goto L4ed;
                case 18: goto L4c0;
                case 19: goto L493;
                case 20: goto L467;
                case 21: goto L43a;
                case 22: goto L40e;
                case 23: goto L3e2;
                case 24: goto L3b5;
                case 25: goto L389;
                case 26: goto L35d;
                case 27: goto L330;
                case 28: goto L303;
                case 29: goto L2d7;
                case 30: goto L2aa;
                case 31: goto L27e;
                case 32: goto L251;
                case 33: goto L223;
                case 34: goto L1f6;
                case 35: goto L1c9;
                case 36: goto L19c;
                case 37: goto L16f;
                case 38: goto L142;
                case 39: goto L116;
                case 40: goto Lea;
                case 41: goto Lbe;
                case 42: goto L91;
                case 43: goto L68;
                case 44: goto L4f;
                case 45: goto L3a;
                case 46: goto L717;
                default: goto L32;
            }
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            java.lang.Object r2 = r4.L$2
            java.lang.Object r5 = r4.L$1
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r5 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r5
            java.lang.Object r6 = r4.L$0
            java.lang.String r6 = (java.lang.String) r6
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            r66 = r8
            r67 = r9
            r13 = r15
            r1 = 0
            goto L213a
        L4f:
            java.lang.Object r2 = r4.L$3
            java.lang.Object r5 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r5 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r5
            java.lang.Object r6 = r4.L$1
            o.eaT r6 = (o.C15935eaT) r6
            java.lang.Object r7 = r4.L$0
            java.lang.String r7 = (java.lang.String) r7
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            r66 = r8
            r67 = r9
            r13 = r15
            r1 = 0
            goto L2107
        L68:
            java.lang.Object r2 = r4.L$4
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$3
            kotlin.jvm.internal.Ref$BooleanRef r5 = (kotlin.jvm.internal.Ref.BooleanRef) r5
            java.lang.Object r6 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$1
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r10 = r4.L$0
            java.lang.String r10 = (java.lang.String) r10
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r1 = r2
            r2 = r3
            r3 = r6
            r14 = r7
            r65 = r8
            r26 = r9
            r13 = r15
            r15 = r10
            goto L2099
        L91:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r13 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r13 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r13
            java.lang.Object r11 = r4.L$1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r25 = r8
            r26 = r9
            r45 = r10
            goto L131d
        Lbe:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r1 = r8
            r26 = r9
            r19 = r10
            goto Lf76
        Lea:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r1 = r8
            r26 = r9
            r19 = r10
            goto Lc3e
        L116:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r1 = r8
            r26 = r9
            r19 = r10
            goto Leeb
        L142:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r58 = r8
            r26 = r9
            r19 = r10
            goto L1d46
        L16f:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r42 = r8
            r26 = r9
            r39 = r10
            goto L11b9
        L19c:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r58 = r8
            r26 = r9
            r19 = r10
            goto L1dc1
        L1c9:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r25 = r8
            r26 = r9
            r39 = r10
            goto L10a0
        L1f6:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r34 = r8
            r26 = r9
            r19 = r10
            goto Le5d
        L223:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r60 = r8
            r26 = r9
            r1 = r15
            r15 = r13
            r13 = r10
            goto L1f2c
        L251:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r25 = r8
            r26 = r9
            r19 = r10
            goto La9b
        L27e:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r25 = r8
            r26 = r9
            r12 = r10
            goto L18ca
        L2aa:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r25 = r8
            r26 = r9
            r49 = r10
            goto L172c
        L2d7:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r1 = r8
            r26 = r9
            r19 = r10
            goto Lbc0
        L303:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r25 = r8
            r26 = r9
            r49 = r10
            goto L15c9
        L330:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r42 = r8
            r26 = r9
            r39 = r10
            goto L113f
        L35d:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r1 = r8
            r26 = r9
            r53 = r10
            goto L197c
        L389:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r1 = r8
            r26 = r9
            r45 = r10
            goto L13fb
        L3b5:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r34 = r8
            r26 = r9
            r19 = r10
            goto Ldd9
        L3e2:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r1 = r8
            r26 = r9
            r19 = r10
            goto Lb37
        L40e:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r14 = r4.L$1
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r13 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r13 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r13
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r1 = r8
            r26 = r9
            r49 = r10
            goto L165e
        L43a:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r25 = r8
            r26 = r9
            r39 = r10
            goto L1021
        L467:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r1 = r8
            r26 = r9
            r45 = r10
            goto L1274
        L493:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r25 = r8
            r26 = r9
            r45 = r10
            goto L149e
        L4c0:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r54 = r8
            r26 = r9
            r19 = r10
            goto L1c10
        L4ed:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r25 = r8
            r26 = r9
            r19 = r10
            goto Lcd5
        L51a:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r25 = r8
            r26 = r9
            r19 = r10
            goto L1b1d
        L547:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r25 = r8
            r26 = r9
            r53 = r10
            goto L1a30
        L574:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r60 = r8
            r26 = r9
            r63 = r10
            r1 = r15
            goto L1e7b
        L5a2:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r25 = r8
            r26 = r9
            r1 = r10
            goto L9ed
        L5ce:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r25 = r8
            r26 = r9
            r12 = r10
            goto L1549
        L5fa:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r25 = r8
            r26 = r9
            r49 = r10
            goto L182f
        L627:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r25 = r8
            r26 = r9
            r49 = r10
            goto L17ab
        L654:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r25 = r8
            r26 = r9
            r19 = r10
            goto Ld53
        L681:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r54 = r8
            r26 = r9
            r19 = r10
            goto L1cba
        L6ae:
            java.lang.Object r2 = r4.L$6
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r4.L$5
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r6
            java.lang.Object r7 = r4.L$3
            o.eaT r7 = (o.C15935eaT) r7
            java.lang.Object r11 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r11 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r11
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r14 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r14
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            kotlin.Result r3 = (kotlin.Result) r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.m7386unboximpl()     // Catch: java.lang.Throwable -> L71c
            r25 = r8
            r26 = r9
            r45 = r10
            goto L1382
        L6db:
            java.lang.Object r2 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r2 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r2
            java.lang.Object r5 = r4.L$3
            o.eaT r5 = (o.C15935eaT) r5
            java.lang.Object r6 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r6
            java.lang.Object r7 = r4.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r11 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r11 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r11
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            r3 = r5
            r14 = r7
            r7 = r11
            r13 = 0
        L6f6:
            r11 = r6
            goto L8f7
        L6f9:
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            goto L8c2
        L6fe:
            java.lang.Object r2 = r4.L$4
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r2 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r2
            java.lang.Object r5 = r4.L$3
            o.eaT r5 = (o.C15935eaT) r5
            java.lang.Object r6 = r4.L$2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r6
            java.lang.Object r7 = r4.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r11 = r4.L$0
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r11 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r11
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            goto L8a1
        L717:
            o.C56391yDq.AEQbTJ(r3)     // Catch: java.lang.Throwable -> L71c
            goto L880
        L71c:
            r0 = move-exception
            r1 = r0
            goto L9a9
        L720:
            java.lang.Object r2 = r4.L$2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r4.L$1
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r5 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r5
            java.lang.Object r6 = r4.L$0
            o.eaT r6 = (o.C15935eaT) r6
            o.C56391yDq.AEQbTJ(r3)
            r7 = r2
            r11 = r5
            r5 = r6
            r14 = 2
            goto L7bb
        L735:
            java.lang.Object r2 = r4.L$2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r4.L$1
            com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data r5 = (com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data) r5
            java.lang.Object r6 = r4.L$0
            o.eaT r6 = (o.C15935eaT) r6
            o.C56391yDq.AEQbTJ(r3)
            r68 = r3
            r3 = r2
            r2 = r5
            r5 = r68
            goto L79a
        L74b:
            o.C56391yDq.AEQbTJ(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "onHandleIncomingData "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            o.pUU.KWHzl(r8, r3)
            java.lang.String r3 = r70.getMessageId()
            o.yDQ<java.lang.String> r5 = r1.fJNWhG
            boolean r5 = r5.contains(r3)
            if (r5 == 0) goto L785
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Request already handled: "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            o.pUU.copydefault(r8, r2)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L785:
            o.yDQ<java.lang.String> r5 = r1.fJNWhG
            r5.add(r3)
            r4.L$0 = r1
            r4.L$1 = r2
            r4.L$2 = r3
            r4.label = r12
            java.lang.Object r5 = r1.OLrzqt(r2, r4)
            if (r5 != r15) goto L799
            return r15
        L799:
            r6 = r1
        L79a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L7a5
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L7a5:
            o.ebq r5 = r6.AkhnZx
            r4.L$0 = r6
            r4.L$1 = r2
            r4.L$2 = r3
            r14 = 2
            r4.label = r14
            java.lang.Object r5 = r5.OLrzqt(r4)
            if (r5 != r15) goto L7b7
            return r15
        L7b7:
            r11 = r2
            r7 = r3
            r3 = r5
            r5 = r6
        L7bb:
            java.util.Map r3 = (java.util.Map) r3
            java.util.Collection r2 = r3.values()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = kotlin.collections.CollectionsKt.djBIcL(r2)
            java.util.Iterator r2 = r2.iterator()
        L7cb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L7e7
            java.lang.Object r3 = r2.next()
            r6 = r3
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r6
            java.lang.String r13 = r11.getTopic()
            java.lang.String r6 = r6.getTopic()
            boolean r6 = kotlin.jvm.internal.Intrinsics.EZpvd(r13, r6)
            if (r6 == 0) goto L7cb
            goto L7e8
        L7e7:
            r3 = 0
        L7e8:
            r6 = r3
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession r6 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) r6
            if (r6 == 0) goto L21e3
            kotlin.Result$Application r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L21b3
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r2 = r6.getDAppInfo()     // Catch: java.lang.Throwable -> L21b3
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L21b3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21b3
            r3.<init>()     // Catch: java.lang.Throwable -> L21b3
            java.lang.String r13 = "New request received from "
            r3.append(r13)     // Catch: java.lang.Throwable -> L21b3
            r3.append(r2)     // Catch: java.lang.Throwable -> L21b3
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L21b3
            o.pUU.KWHzl(r8, r2)     // Catch: java.lang.Throwable -> L21b3
            r5.EZpvd(r6)     // Catch: java.lang.Throwable -> L21b3
            okio.ByteString$Companion r2 = okio.ByteString.Companion     // Catch: java.lang.Throwable -> L21b3
            java.lang.String r3 = r11.getMessage()     // Catch: java.lang.Throwable -> L21b3
            okio.ByteString r2 = r2.decodeBase64(r3)     // Catch: java.lang.Throwable -> L21b3
            if (r2 == 0) goto L21af
            java.lang.String r2 = r2.utf8()     // Catch: java.lang.Throwable -> L21b3
            if (r2 != 0) goto L822
            goto L21af
        L822:
            com.okinc.wallet.core.sign.ton.X25519KeyPair r3 = r6.getKeyPair()     // Catch: java.lang.Throwable -> L21b3
            java.lang.String r3 = r3.getPrvKey()     // Catch: java.lang.Throwable -> L21b3
            java.lang.String r13 = r6.getClientId()     // Catch: java.lang.Throwable -> L21b3
            java.lang.String r2 = r5.KWHzl(r2, r3, r13)     // Catch: java.lang.Throwable -> L21b3
            kotlinx.serialization.json.Json r3 = r5.gEmmrt     // Catch: java.lang.Throwable -> L21b3
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest$Companion r13 = com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest.Companion     // Catch: java.lang.Throwable -> L21b3
            kotlinx.serialization.KSerializer r13 = r13.serializer()     // Catch: java.lang.Throwable -> L21b3
            java.lang.Object r2 = r3.decodeFromString(r13, r2)     // Catch: java.lang.Throwable -> L21b3
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest r2 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest) r2     // Catch: java.lang.Throwable -> L21b3
            java.lang.String r3 = r2.getMethod()     // Catch: java.lang.Throwable -> L21b3
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21b3
            r13.<init>()     // Catch: java.lang.Throwable -> L21b3
            java.lang.String r14 = "Start handling request "
            r13.append(r14)     // Catch: java.lang.Throwable -> L21b3
            r13.append(r7)     // Catch: java.lang.Throwable -> L21b3
            java.lang.String r14 = ", "
            r13.append(r14)     // Catch: java.lang.Throwable -> L21b3
            r13.append(r3)     // Catch: java.lang.Throwable -> L21b3
            java.lang.String r3 = r13.toString()     // Catch: java.lang.Throwable -> L21b3
            o.pUU.KWHzl(r8, r3)     // Catch: java.lang.Throwable -> L21b3
            boolean r3 = r2.isDisconnect()     // Catch: java.lang.Throwable -> L21b3
            if (r3 == 0) goto L883
            java.lang.String r2 = "Disconnect event received"
            o.pUU.KWHzl(r8, r2)     // Catch: java.lang.Throwable -> L71c
            java.lang.String r2 = r6.getClientId()     // Catch: java.lang.Throwable -> L71c
            r3 = 0
            r4.L$0 = r3     // Catch: java.lang.Throwable -> L71c
            r4.L$1 = r3     // Catch: java.lang.Throwable -> L71c
            r4.L$2 = r3     // Catch: java.lang.Throwable -> L71c
            r3 = 3
            r4.label = r3     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r2 = r5.AhwBna(r2, r4)     // Catch: java.lang.Throwable -> L71c
            if (r2 != r15) goto L880
            return r15
        L880:
            r5 = r8
            goto L2192
        L883:
            o.mrS r3 = r5.values     // Catch: java.lang.Throwable -> L21b3
            boolean r3 = r3.fIwbmz()     // Catch: java.lang.Throwable -> L21b3
            if (r3 != 0) goto L8c5
            r4.L$0 = r11     // Catch: java.lang.Throwable -> L71c
            r4.L$1 = r7     // Catch: java.lang.Throwable -> L71c
            r4.L$2 = r6     // Catch: java.lang.Throwable -> L71c
            r4.L$3 = r5     // Catch: java.lang.Throwable -> L71c
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L71c
            r3 = 4
            r4.label = r3     // Catch: java.lang.Throwable -> L71c
            r13 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r13, r4)     // Catch: java.lang.Throwable -> L71c
            if (r3 != r15) goto L8a1
            return r15
        L8a1:
            o.mrS r3 = r5.values     // Catch: java.lang.Throwable -> L71c
            boolean r3 = r3.fIwbmz()     // Catch: java.lang.Throwable -> L71c
            if (r3 != 0) goto L8c5
            java.lang.String r3 = r11.getTopic()     // Catch: java.lang.Throwable -> L71c
            r13 = 0
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L71c
            r4.L$1 = r13     // Catch: java.lang.Throwable -> L71c
            r4.L$2 = r13     // Catch: java.lang.Throwable -> L71c
            r4.L$3 = r13     // Catch: java.lang.Throwable -> L71c
            r4.L$4 = r13     // Catch: java.lang.Throwable -> L71c
            r7 = 5
            r4.label = r7     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r2 = r5.KWHzl(r3, r2, r6, r4)     // Catch: java.lang.Throwable -> L71c
            if (r2 != r15) goto L8c2
            return r15
        L8c2:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L71c
            return r2
        L8c5:
            r13 = 0
            java.lang.Boolean r3 = r6.getHasCosmosChainConnected()     // Catch: java.lang.Throwable -> L21b3
            java.lang.Boolean r14 = o.C56443yFo.KWHzl(r12)     // Catch: java.lang.Throwable -> L21b3
            boolean r3 = kotlin.jvm.internal.Intrinsics.EZpvd(r3, r14)     // Catch: java.lang.Throwable -> L21b3
            if (r3 == 0) goto L8f2
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r3 = r5.fARcdN     // Catch: java.lang.Throwable -> L71c
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L71c
            if (r3 == 0) goto L8f2
            o.ebs r3 = r5.OLrzqt     // Catch: java.lang.Throwable -> L71c
            r4.L$0 = r11     // Catch: java.lang.Throwable -> L71c
            r4.L$1 = r7     // Catch: java.lang.Throwable -> L71c
            r4.L$2 = r6     // Catch: java.lang.Throwable -> L71c
            r4.L$3 = r5     // Catch: java.lang.Throwable -> L71c
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L71c
            r14 = 6
            r4.label = r14     // Catch: java.lang.Throwable -> L71c
            java.lang.Object r3 = r3.OLrzqt(r4)     // Catch: java.lang.Throwable -> L71c
            if (r3 != r15) goto L8f2
            return r15
        L8f2:
            r3 = r5
            r14 = r7
            r7 = r11
            goto L6f6
        L8f7:
            kotlin.Result$Application r5 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L940
            com.okinc.business.defi.wallet.common.okxconnect.track.ConnectEventTracking r19 = com.okinc.business.defi.wallet.common.okxconnect.track.ConnectEventTracking.AEQbTJ     // Catch: java.lang.Throwable -> L940
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r5 = r11.getDAppInfo()     // Catch: java.lang.Throwable -> L940
            java.lang.String r20 = r5.getUrl()     // Catch: java.lang.Throwable -> L940
            java.lang.String r21 = r2.getMethod()     // Catch: java.lang.Throwable -> L940
            java.lang.String r5 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L940
            if (r5 == 0) goto L922
            o.dcu$Application r6 = o.InterfaceC13987dcu.Companion     // Catch: java.lang.Throwable -> L940
            o.dcu r5 = r6.AEQbTJ(r5)     // Catch: java.lang.Throwable -> L940
            if (r5 == 0) goto L922
            long r5 = r5.OLrzqt()     // Catch: java.lang.Throwable -> L940
            java.lang.Long r5 = o.C56443yFo.KWHzl(r5)     // Catch: java.lang.Throwable -> L940
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L940
            goto L923
        L922:
            r5 = r13
        L923:
            if (r5 != 0) goto L928
            r22 = r16
            goto L92a
        L928:
            r22 = r5
        L92a:
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r5 = r11.getDAppInfo()     // Catch: java.lang.Throwable -> L940
            java.lang.String r23 = r5.getName()     // Catch: java.lang.Throwable -> L940
            com.okinc.business.defi.wallet.common.okxconnect.track.ConnectEventTracking$Source r24 = com.okinc.business.defi.wallet.common.okxconnect.track.ConnectEventTracking.Source.OKX_CONNECT     // Catch: java.lang.Throwable -> L940
            java.lang.Object r5 = r19.EZpvd(r20, r21, r22, r23, r24)     // Catch: java.lang.Throwable -> L940
            kotlin.Result r5 = kotlin.Result.m7376boximpl(r5)     // Catch: java.lang.Throwable -> L940
            kotlin.Result.m7377constructorimpl(r5)     // Catch: java.lang.Throwable -> L940
            goto L94b
        L940:
            r0 = move-exception
            r5 = r0
            kotlin.Result$Application r6 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L21b3
            java.lang.Object r5 = o.C56391yDq.EZpvd(r5)     // Catch: java.lang.Throwable -> L21b3
            kotlin.Result.m7377constructorimpl(r5)     // Catch: java.lang.Throwable -> L21b3
        L94b:
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Throwable -> L21b3
            r6.<init>()     // Catch: java.lang.Throwable -> L21b3
            kotlin.jvm.internal.Ref$BooleanRef r5 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch: java.lang.Throwable -> L21b3
            r5.<init>()     // Catch: java.lang.Throwable -> L21b3
            r5.element = r12     // Catch: java.lang.Throwable -> L21b3
            java.lang.String r12 = r2.getMethod()     // Catch: java.lang.Throwable -> L21b3
            int r19 = r12.hashCode()     // Catch: java.lang.Throwable -> L21b3
            switch(r19) {
                case -2021880892: goto L1ea3;
                case -1958497392: goto L1df0;
                case -1876451729: goto L1d5e;
                case -1538798741: goto L1cd4;
                case -1520355510: goto L1c25;
                case -1212757090: goto L1b6d;
                case -1073453553: goto L1a8b;
                case -853054576: goto L19ad;
                case -782293348: goto L18eb;
                case -506050796: goto L1845;
                case -120530073: goto L17cc;
                case 27131247: goto L1742;
                case 121277795: goto L16b0;
                case 163513124: goto L15d9;
                case 415930075: goto L1551;
                case 581195868: goto L14b8;
                case 626434135: goto L1412;
                case 664035650: goto L138b;
                case 907795424: goto L1340;
                case 923236155: goto L12ad;
                case 1105274258: goto L11d3;
                case 1111854747: goto L115a;
                case 1164367187: goto L10b6;
                case 1312032127: goto L103b;
                case 1402426418: goto Lf84;
                case 1412595372: goto Lf04;
                case 1478090914: goto Le75;
                case 1712087454: goto Ldf6;
                case 1793479862: goto Ld6b;
                case 1865879792: goto Lce9;
                case 1879569638: goto Lc4c;
                case 1900613984: goto Lbcc;
                case 2000558504: goto Lb49;
                case 2035559074: goto Laab;
                case 2071636776: goto La0f;
                case 2099305388: goto L973;
                default: goto L962;
            }
        L962:
            r70 = r2
            r27 = r5
            r2 = r6
            r60 = r8
            r26 = r9
            r13 = r10
            r17 = r11
            r1 = r15
            r15 = r14
            r14 = r7
            goto L1f57
        L973:
            java.lang.String r13 = "eth_signTypedData_v4"
            boolean r12 = r12.equals(r13)     // Catch: java.lang.Throwable -> La0a
            if (r12 != 0) goto L97c
            goto L962
        L97c:
            kotlinx.serialization.json.JsonObject r12 = r2.getParams()     // Catch: java.lang.Throwable -> La0a
            if (r12 == 0) goto L9f7
            o.ebF r13 = r3.djBIcL     // Catch: java.lang.Throwable -> La0a
            java.lang.String r18 = r11.getWalletId()     // Catch: java.lang.Throwable -> La0a
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r20 = r11.getDAppInfo()     // Catch: java.lang.Throwable -> La0a
            java.lang.String r21 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> La0a
            if (r21 != 0) goto L994
            r21 = r16
        L994:
            java.lang.String r1 = "typedDataJson"
            java.lang.Object r1 = r12.get(r1)     // Catch: java.lang.Throwable -> La0a
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1     // Catch: java.lang.Throwable -> La0a
            if (r1 == 0) goto L9ac
            kotlinx.serialization.json.JsonPrimitive r1 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(r1)     // Catch: java.lang.Throwable -> L71c
            if (r1 == 0) goto L9ac
            java.lang.String r1 = r1.getContent()     // Catch: java.lang.Throwable -> L71c
            goto L9ad
        L9a9:
            r5 = r8
            goto L21b7
        L9ac:
            r1 = 0
        L9ad:
            if (r1 != 0) goto L9b1
            r1 = r16
        L9b1:
            r4.L$0 = r7     // Catch: java.lang.Throwable -> La0a
            r4.L$1 = r14     // Catch: java.lang.Throwable -> La0a
            r4.L$2 = r11     // Catch: java.lang.Throwable -> La0a
            r4.L$3 = r3     // Catch: java.lang.Throwable -> La0a
            r4.L$4 = r2     // Catch: java.lang.Throwable -> La0a
            r4.L$5 = r6     // Catch: java.lang.Throwable -> La0a
            r4.L$6 = r5     // Catch: java.lang.Throwable -> La0a
            r12 = 13
            r4.label = r12     // Catch: java.lang.Throwable -> La0a
            r12 = r5
            r5 = r13
            r13 = r6
            r6 = r18
            r22 = r13
            r13 = r7
            r7 = r20
            r25 = r8
            r8 = r21
            r26 = r9
            r9 = r1
            r1 = r10
            r10 = r14
            r70 = r11
            r11 = r4
            java.lang.Object r5 = r5.AEQbTJ(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1388
            if (r5 != r15) goto L9e0
            return r15
        L9e0:
            r11 = r70
            r6 = r2
            r7 = r3
            r3 = r5
            r2 = r12
            r5 = r22
            r68 = r14
            r14 = r13
            r13 = r68
        L9ed:
            kotlin.Result r3 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L1388
            r53 = r1
            r1 = r25
            goto L1980
        L9f7:
            r12 = r5
            r22 = r6
            r13 = r7
            r26 = r9
            r70 = r11
            r17 = r70
            r60 = r8
            r1 = r15
            r11 = 0
            r13 = r10
            r15 = r14
            r14 = r12
            goto L1f5e
        La0a:
            r0 = move-exception
            r25 = r8
            goto L173f
        La0f:
            r22 = r6
            r13 = r7
            r25 = r8
            r26 = r9
            r1 = r10
            r70 = r11
            r11 = r5
            java.lang.String r5 = "tron_signMessage"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L1388
            if (r5 != 0) goto La2c
            r20 = r70
            r19 = r1
            r27 = r11
            r1 = r22
            goto Labf
        La2c:
            kotlinx.serialization.json.JsonObject r5 = r2.getParams()     // Catch: java.lang.Throwable -> L1388
            if (r5 == 0) goto Laa1
            o.ebF r6 = r3.djBIcL     // Catch: java.lang.Throwable -> L1388
            java.lang.String r7 = r70.getWalletId()     // Catch: java.lang.Throwable -> L1388
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r8 = r70.getDAppInfo()     // Catch: java.lang.Throwable -> L1388
            java.lang.String r9 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L1388
            if (r9 != 0) goto La44
            r9 = r16
        La44:
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Throwable -> L1388
            kotlinx.serialization.json.JsonElement r5 = (kotlinx.serialization.json.JsonElement) r5     // Catch: java.lang.Throwable -> L1388
            if (r5 == 0) goto La57
            kotlinx.serialization.json.JsonPrimitive r5 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(r5)     // Catch: java.lang.Throwable -> L1388
            if (r5 == 0) goto La57
            java.lang.String r5 = r5.getContent()     // Catch: java.lang.Throwable -> L1388
            goto La58
        La57:
            r5 = 0
        La58:
            if (r5 != 0) goto La5d
            r10 = r16
            goto La5e
        La5d:
            r10 = r5
        La5e:
            com.okinc.business.defi.api.bean.TronSignMethodVersion r12 = com.okinc.business.defi.api.bean.TronSignMethodVersion.V1     // Catch: java.lang.Throwable -> L1388
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L1388
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L1388
            r5 = r70
            r4.L$2 = r5     // Catch: java.lang.Throwable -> L1388
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L1388
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L1388
            r19 = r1
            r1 = r22
            r4.L$5 = r1     // Catch: java.lang.Throwable -> L1388
            r4.L$6 = r11     // Catch: java.lang.Throwable -> L1388
            r70 = r5
            r5 = 32
            r4.label = r5     // Catch: java.lang.Throwable -> L1388
            r20 = r70
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r12
            r12 = r11
            r11 = r14
            r27 = r12
            r12 = r4
            java.lang.Object r5 = r5.OLrzqt(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L1388
            if (r5 != r15) goto La8e
            return r15
        La8e:
            r6 = r2
            r7 = r3
            r3 = r5
            r11 = r20
            r2 = r27
            r5 = r1
            r68 = r14
            r14 = r13
            r13 = r68
        La9b:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L1388
            goto Lcd9
        Laa1:
            r19 = r1
            r27 = r11
            r39 = r19
            r1 = r22
            goto L1031
        Laab:
            r27 = r5
            r1 = r6
            r13 = r7
            r25 = r8
            r26 = r9
            r19 = r10
            r20 = r11
            java.lang.String r5 = "sui_signAndExecuteTransactionBlock"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L140b
            if (r5 != 0) goto Laca
        Labf:
            r11 = r20
            r10 = r25
            r68 = r13
            r13 = r1
            r1 = r68
            goto L1b7e
        Laca:
            java.lang.String r5 = "Start onSuiSignAndExecuteTransactionBlock"
            r12 = r25
            o.pUU.KWHzl(r12, r5)     // Catch: java.lang.Throwable -> L1988
            kotlinx.serialization.json.JsonObject r5 = r2.getParams()     // Catch: java.lang.Throwable -> L1988
            if (r5 == 0) goto Lb40
            o.ebF r6 = r3.djBIcL     // Catch: java.lang.Throwable -> L1988
            java.lang.String r7 = r20.getWalletId()     // Catch: java.lang.Throwable -> L1988
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r8 = r20.getDAppInfo()     // Catch: java.lang.Throwable -> L1988
            java.lang.String r9 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L1988
            if (r9 != 0) goto Lae9
            r9 = r16
        Lae9:
            kotlinx.serialization.json.Json r10 = r3.gEmmrt     // Catch: java.lang.Throwable -> L1988
            r10.getSerializersModule()     // Catch: java.lang.Throwable -> L1988
            kotlinx.serialization.json.JsonObject$Companion r11 = kotlinx.serialization.json.JsonObject.Companion     // Catch: java.lang.Throwable -> L1988
            kotlinx.serialization.KSerializer r11 = r11.serializer()     // Catch: java.lang.Throwable -> L1988
            java.lang.String r10 = r10.encodeToString(r11, r5)     // Catch: java.lang.Throwable -> L1988
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L1988
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L1988
            r11 = r20
            r4.L$2 = r11     // Catch: java.lang.Throwable -> L1988
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L1988
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L1988
            r4.L$5 = r1     // Catch: java.lang.Throwable -> L1988
            r5 = r27
            r4.L$6 = r5     // Catch: java.lang.Throwable -> L1988
            r27 = r5
            r5 = 23
            r4.label = r5     // Catch: java.lang.Throwable -> L1988
            r18 = 1
            r28 = r27
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r18
            r70 = r11
            r11 = r14
            r22 = r1
            r1 = r12
            r12 = r4
            java.lang.Object r5 = r5.OLrzqt(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lb3d
            if (r5 != r15) goto Lb29
            return r15
        Lb29:
            r11 = r70
            r6 = r2
            r7 = r3
            r3 = r5
            r5 = r22
            r2 = r28
            r68 = r14
            r14 = r13
            r13 = r68
        Lb37:
            kotlin.Result r3 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> Lb3d
            goto Lf7a
        Lb3d:
            r0 = move-exception
            goto L140e
        Lb40:
            r22 = r1
            r1 = r12
            r49 = r19
            r70 = r20
            goto L15d5
        Lb49:
            r28 = r5
            r22 = r6
            r13 = r7
            r1 = r8
            r26 = r9
            r19 = r10
            r70 = r11
            java.lang.String r5 = "btc_inscribeTransfer"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> Lb3d
            if (r5 != 0) goto Lb6a
            r17 = r70
            r60 = r1
            r70 = r2
            r1 = r15
            r2 = r22
            r27 = r28
            goto Lfa1
        Lb6a:
            java.lang.String r5 = "Start onBtcInscribeTransfer"
            o.pUU.KWHzl(r1, r5)     // Catch: java.lang.Throwable -> Lb3d
            kotlinx.serialization.json.JsonObject r9 = r2.getParams()     // Catch: java.lang.Throwable -> Lb3d
            if (r9 == 0) goto Lbc6
            o.ebF r5 = r3.djBIcL     // Catch: java.lang.Throwable -> Lb3d
            java.lang.String r6 = r70.getWalletId()     // Catch: java.lang.Throwable -> Lb3d
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = r70.getDAppInfo()     // Catch: java.lang.Throwable -> Lb3d
            java.lang.String r8 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> Lb3d
            if (r8 != 0) goto Lb87
            r8 = r16
        Lb87:
            r4.L$0 = r13     // Catch: java.lang.Throwable -> Lb3d
            r4.L$1 = r14     // Catch: java.lang.Throwable -> Lb3d
            r12 = r70
            r4.L$2 = r12     // Catch: java.lang.Throwable -> Lb3d
            r4.L$3 = r3     // Catch: java.lang.Throwable -> Lb3d
            r4.L$4 = r2     // Catch: java.lang.Throwable -> Lb3d
            r11 = r22
            r4.L$5 = r11     // Catch: java.lang.Throwable -> Lb3d
            r10 = r28
            r4.L$6 = r10     // Catch: java.lang.Throwable -> Lb3d
            r27 = r10
            r10 = 29
            r4.label = r10     // Catch: java.lang.Throwable -> Lb3d
            r10 = 13
            r29 = r27
            r30 = r11
            r11 = r14
            r70 = r12
            r12 = r4
            java.lang.Object r5 = r5.KWHzl(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lb3d
            if (r5 != r15) goto Lbb2
            return r15
        Lbb2:
            r11 = r70
            r6 = r2
            r7 = r3
            r3 = r5
            r2 = r29
            r5 = r30
            r68 = r14
            r14 = r13
            r13 = r68
        Lbc0:
            kotlin.Result r3 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> Lb3d
            goto Lf7a
        Lbc6:
            r49 = r19
            r50 = r28
            goto L1697
        Lbcc:
            r29 = r5
            r30 = r6
            r13 = r7
            r1 = r8
            r26 = r9
            r19 = r10
            r70 = r11
            java.lang.String r5 = "cosmos_signArbitrary"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> Lb3d
            if (r5 != 0) goto Lbed
            r17 = r70
            r60 = r1
            r70 = r2
            r1 = r15
            r27 = r29
            r2 = r30
            goto Lfa1
        Lbed:
            java.lang.String r5 = "Start cosmos signArbitrary"
            o.pUU.KWHzl(r1, r5)     // Catch: java.lang.Throwable -> Lb3d
            kotlinx.serialization.json.JsonObject r9 = r2.getParams()     // Catch: java.lang.Throwable -> Lb3d
            if (r9 == 0) goto Lc44
            o.ebF r5 = r3.djBIcL     // Catch: java.lang.Throwable -> Lb3d
            java.lang.String r6 = r70.getWalletId()     // Catch: java.lang.Throwable -> Lb3d
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = r70.getDAppInfo()     // Catch: java.lang.Throwable -> Lb3d
            java.lang.String r8 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> Lb3d
            if (r8 != 0) goto Lc0a
            r8 = r16
        Lc0a:
            r4.L$0 = r13     // Catch: java.lang.Throwable -> Lb3d
            r4.L$1 = r14     // Catch: java.lang.Throwable -> Lb3d
            r12 = r70
            r4.L$2 = r12     // Catch: java.lang.Throwable -> Lb3d
            r4.L$3 = r3     // Catch: java.lang.Throwable -> Lb3d
            r4.L$4 = r2     // Catch: java.lang.Throwable -> Lb3d
            r11 = r30
            r4.L$5 = r11     // Catch: java.lang.Throwable -> Lb3d
            r10 = r29
            r4.L$6 = r10     // Catch: java.lang.Throwable -> Lb3d
            r27 = r10
            r10 = 40
            r4.label = r10     // Catch: java.lang.Throwable -> Lb3d
            r31 = r27
            r10 = r14
            r32 = r11
            r11 = r4
            java.lang.Object r5 = r5.AEQbTJ(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lb3d
            if (r5 != r15) goto Lc31
            return r15
        Lc31:
            r6 = r2
            r7 = r3
            r3 = r5
            r11 = r12
            r2 = r31
            r5 = r32
            r68 = r14
            r14 = r13
            r13 = r68
        Lc3e:
            kotlin.Result r3 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> Lb3d
            goto Lf7a
        Lc44:
            r49 = r19
            r50 = r29
            r22 = r30
            goto L1697
        Lc4c:
            r31 = r5
            r32 = r6
            r13 = r7
            r1 = r8
            r26 = r9
            r19 = r10
            java.lang.String r5 = "solana_signTransaction"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L1a86
            if (r5 != 0) goto Lc6b
            r60 = r1
            r70 = r2
            r17 = r11
            r1 = r15
            r27 = r31
            r2 = r32
            goto Lfa1
        Lc6b:
            java.lang.String r5 = "Start onSolSignTransaction"
            o.pUU.KWHzl(r1, r5)     // Catch: java.lang.Throwable -> L1a86
            kotlinx.serialization.json.JsonObject r5 = r2.getParams()     // Catch: java.lang.Throwable -> L1a86
            if (r5 == 0) goto Lcdd
            o.ebF r6 = r3.djBIcL     // Catch: java.lang.Throwable -> L1a86
            java.lang.String r7 = r11.getWalletId()     // Catch: java.lang.Throwable -> L1a86
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r8 = r11.getDAppInfo()     // Catch: java.lang.Throwable -> L1a86
            java.lang.String r9 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L1a86
            if (r9 != 0) goto Lc88
            r9 = r16
        Lc88:
            kotlinx.serialization.json.Json r10 = r3.gEmmrt     // Catch: java.lang.Throwable -> L1a86
            r10.getSerializersModule()     // Catch: java.lang.Throwable -> L1a86
            kotlinx.serialization.json.JsonObject$Companion r12 = kotlinx.serialization.json.JsonObject.Companion     // Catch: java.lang.Throwable -> L1a86
            kotlinx.serialization.KSerializer r12 = r12.serializer()     // Catch: java.lang.Throwable -> L1a86
            java.lang.String r10 = r10.encodeToString(r12, r5)     // Catch: java.lang.Throwable -> L1a86
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L1a86
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L1a86
            r4.L$2 = r11     // Catch: java.lang.Throwable -> L1a86
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L1a86
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L1a86
            r12 = r32
            r4.L$5 = r12     // Catch: java.lang.Throwable -> L1a86
            r5 = r31
            r4.L$6 = r5     // Catch: java.lang.Throwable -> L1a86
            r27 = r5
            r5 = 17
            r4.label = r5     // Catch: java.lang.Throwable -> L1a86
            r18 = 0
            r25 = r1
            r1 = r27
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r18
            r70 = r11
            r11 = r14
            r1 = r12
            r12 = r4
            java.lang.Object r5 = r5.AEQbTJ(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L1388
            if (r5 != r15) goto Lcc8
            return r15
        Lcc8:
            r11 = r70
            r6 = r2
            r7 = r3
            r3 = r5
            r2 = r27
            r5 = r1
            r68 = r14
            r14 = r13
            r13 = r68
        Lcd5:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L1388
        Lcd9:
            r49 = r19
            goto L1833
        Lcdd:
            r25 = r1
            r70 = r11
            r49 = r19
            r50 = r31
            r22 = r32
            goto L1697
        Lce9:
            r27 = r5
            r1 = r6
            r13 = r7
            r25 = r8
            r26 = r9
            r19 = r10
            r70 = r11
            java.lang.String r5 = "wallet_switchEthereumChain"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L1388
            if (r5 != 0) goto Ld05
            r17 = r70
            r70 = r2
            r60 = r25
            goto Le91
        Ld05:
            o.ebF r5 = r3.djBIcL     // Catch: java.lang.Throwable -> L1388
            java.lang.String r6 = r70.getWalletId()     // Catch: java.lang.Throwable -> L1388
            kotlinx.serialization.json.JsonObject r7 = r2.getParams()     // Catch: java.lang.Throwable -> L1388
            if (r7 == 0) goto Ld26
            java.lang.String r8 = "chainId"
            java.lang.Object r7 = r7.get(r8)     // Catch: java.lang.Throwable -> L1388
            kotlinx.serialization.json.JsonElement r7 = (kotlinx.serialization.json.JsonElement) r7     // Catch: java.lang.Throwable -> L1388
            if (r7 == 0) goto Ld26
            kotlinx.serialization.json.JsonPrimitive r7 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(r7)     // Catch: java.lang.Throwable -> L1388
            if (r7 == 0) goto Ld26
            java.lang.String r11 = r7.getContent()     // Catch: java.lang.Throwable -> L1388
            goto Ld27
        Ld26:
            r11 = 0
        Ld27:
            if (r11 != 0) goto Ld2b
            r11 = r16
        Ld2b:
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L1388
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L1388
            r10 = r70
            r4.L$2 = r10     // Catch: java.lang.Throwable -> L1388
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L1388
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L1388
            r4.L$5 = r1     // Catch: java.lang.Throwable -> L1388
            r9 = r27
            r4.L$6 = r9     // Catch: java.lang.Throwable -> L1388
            r7 = 9
            r4.label = r7     // Catch: java.lang.Throwable -> L1388
            java.lang.Object r5 = r5.copydefault(r6, r11, r4)     // Catch: java.lang.Throwable -> L1388
            if (r5 != r15) goto Ld48
            return r15
        Ld48:
            r6 = r2
            r7 = r3
            r3 = r5
            r2 = r9
            r11 = r10
            r5 = r1
            r68 = r14
            r14 = r13
            r13 = r68
        Ld53:
            boolean r1 = kotlin.Result.m7384isSuccessimpl(r3)     // Catch: java.lang.Throwable -> L1388
            if (r1 == 0) goto Ld65
            r1 = r3
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L1388
            boolean r8 = o.C33129mqd.OLrzqt(r1)     // Catch: java.lang.Throwable -> L1388
            if (r8 == 0) goto Ld65
            r7.OLrzqt(r11, r1)     // Catch: java.lang.Throwable -> L1388
        Ld65:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L1388
            goto Lcd9
        Ld6b:
            r1 = r6
            r13 = r7
            r25 = r8
            r26 = r9
            r19 = r10
            r10 = r11
            r9 = r5
            java.lang.String r5 = "btc_send"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> Ldf0
            if (r5 != 0) goto Ld84
            r48 = r9
            r11 = r10
            r49 = r19
            goto L15eb
        Ld84:
            java.lang.String r5 = "Start onBtcSend"
            r12 = r25
            o.pUU.KWHzl(r12, r5)     // Catch: java.lang.Throwable -> Ldec
            kotlinx.serialization.json.JsonObject r11 = r2.getParams()     // Catch: java.lang.Throwable -> Ldec
            if (r11 == 0) goto Lde1
            o.ebF r5 = r3.djBIcL     // Catch: java.lang.Throwable -> Ldec
            java.lang.String r6 = r10.getWalletId()     // Catch: java.lang.Throwable -> Ldec
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = r10.getDAppInfo()     // Catch: java.lang.Throwable -> Ldec
            java.lang.String r8 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> Ldec
            if (r8 != 0) goto Lda3
            r8 = r16
        Lda3:
            r4.L$0 = r13     // Catch: java.lang.Throwable -> Ldec
            r4.L$1 = r14     // Catch: java.lang.Throwable -> Ldec
            r4.L$2 = r10     // Catch: java.lang.Throwable -> Ldec
            r4.L$3 = r3     // Catch: java.lang.Throwable -> Ldec
            r4.L$4 = r2     // Catch: java.lang.Throwable -> Ldec
            r4.L$5 = r1     // Catch: java.lang.Throwable -> Ldec
            r4.L$6 = r9     // Catch: java.lang.Throwable -> Ldec
            r27 = r9
            r9 = 24
            r4.label = r9     // Catch: java.lang.Throwable -> Ldec
            r18 = 7
            r33 = r27
            r9 = r11
            r11 = r10
            r10 = r18
            r70 = r11
            r11 = r14
            r34 = r12
            r12 = r4
            java.lang.Object r5 = r5.KWHzl(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lddf
            if (r5 != r15) goto Ldcc
            return r15
        Ldcc:
            r11 = r70
            r6 = r2
            r7 = r3
            r3 = r5
            r2 = r33
            r5 = r1
            r68 = r14
            r14 = r13
            r13 = r68
        Ldd9:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> Lddf
            goto Le61
        Lddf:
            r0 = move-exception
            goto Ldf3
        Lde1:
            r22 = r1
            r50 = r9
            r70 = r10
            r1 = r12
            r49 = r19
            goto L1697
        Ldec:
            r0 = move-exception
            r34 = r12
            goto Ldf3
        Ldf0:
            r0 = move-exception
            r34 = r25
        Ldf3:
            r1 = r0
            goto Le71
        Ldf6:
            r33 = r5
            r1 = r6
            r13 = r7
            r34 = r8
            r26 = r9
            r19 = r10
            r70 = r11
            java.lang.String r5 = "tron_signAndSendTransaction"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> Lddf
            if (r5 != 0) goto Le14
            r17 = r70
            r70 = r2
            r27 = r33
            r60 = r34
            goto Le91
        Le14:
            kotlinx.serialization.json.JsonObject r9 = r2.getParams()     // Catch: java.lang.Throwable -> Lddf
            if (r9 == 0) goto Le67
            o.ebF r5 = r3.djBIcL     // Catch: java.lang.Throwable -> Lddf
            java.lang.String r6 = r70.getWalletId()     // Catch: java.lang.Throwable -> Lddf
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = r70.getDAppInfo()     // Catch: java.lang.Throwable -> Lddf
            java.lang.String r8 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> Lddf
            if (r8 != 0) goto Le2c
            r8 = r16
        Le2c:
            r4.L$0 = r13     // Catch: java.lang.Throwable -> Lddf
            r4.L$1 = r14     // Catch: java.lang.Throwable -> Lddf
            r12 = r70
            r4.L$2 = r12     // Catch: java.lang.Throwable -> Lddf
            r4.L$3 = r3     // Catch: java.lang.Throwable -> Lddf
            r4.L$4 = r2     // Catch: java.lang.Throwable -> Lddf
            r4.L$5 = r1     // Catch: java.lang.Throwable -> Lddf
            r11 = r33
            r4.L$6 = r11     // Catch: java.lang.Throwable -> Lddf
            r10 = 34
            r4.label = r10     // Catch: java.lang.Throwable -> Lddf
            r10 = 1
            r35 = r11
            r11 = r14
            r70 = r12
            r12 = r4
            java.lang.Object r5 = r5.EZpvd(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lddf
            if (r5 != r15) goto Le50
            return r15
        Le50:
            r11 = r70
            r6 = r2
            r7 = r3
            r3 = r5
            r2 = r35
            r5 = r1
            r68 = r14
            r14 = r13
            r13 = r68
        Le5d:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> Lddf
        Le61:
            r3 = r7
            r7 = r14
            r58 = r34
            goto L1cc2
        Le67:
            r22 = r1
            r49 = r19
            r50 = r33
            r1 = r34
            goto L1697
        Le71:
            r5 = r34
            goto L21b7
        Le75:
            r35 = r5
            r1 = r6
            r13 = r7
            r34 = r8
            r26 = r9
            r19 = r10
            r70 = r11
            java.lang.String r5 = "aptos_signAndSubmitTransaction"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> Leff
            if (r5 != 0) goto Le95
            r17 = r70
            r70 = r2
            r60 = r34
            r27 = r35
        Le91:
            r2 = r1
            r1 = r15
            goto Lfa1
        Le95:
            java.lang.String r5 = "Start onAptosSignAndSubmitTransaction"
            r12 = r34
            o.pUU.KWHzl(r12, r5)     // Catch: java.lang.Throwable -> L1988
            kotlinx.serialization.json.JsonObject r9 = r2.getParams()     // Catch: java.lang.Throwable -> L1988
            if (r9 == 0) goto Lef1
            o.ebF r5 = r3.djBIcL     // Catch: java.lang.Throwable -> L1988
            java.lang.String r6 = r70.getWalletId()     // Catch: java.lang.Throwable -> L1988
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = r70.getDAppInfo()     // Catch: java.lang.Throwable -> L1988
            java.lang.String r8 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L1988
            if (r8 != 0) goto Leb4
            r8 = r16
        Leb4:
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L1988
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L1988
            r11 = r70
            r4.L$2 = r11     // Catch: java.lang.Throwable -> L1988
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L1988
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L1988
            r4.L$5 = r1     // Catch: java.lang.Throwable -> L1988
            r10 = r35
            r4.L$6 = r10     // Catch: java.lang.Throwable -> L1988
            r27 = r10
            r10 = 39
            r4.label = r10     // Catch: java.lang.Throwable -> L1988
            r10 = 1
            r36 = r27
            r70 = r11
            r11 = r14
            r22 = r1
            r1 = r12
            r12 = r4
            java.lang.Object r5 = r5.KWHzl(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lb3d
            if (r5 != r15) goto Ledd
            return r15
        Ledd:
            r11 = r70
            r6 = r2
            r7 = r3
            r3 = r5
            r5 = r22
            r2 = r36
            r68 = r14
            r14 = r13
            r13 = r68
        Leeb:
            kotlin.Result r3 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> Lb3d
            goto Lf7a
        Lef1:
            r22 = r1
            r1 = r12
            r49 = r19
            r50 = r35
            goto L1697
        Lefa:
            r0 = move-exception
            r1 = r34
            goto L140e
        Leff:
            r0 = move-exception
            r1 = r34
            goto L1287
        Lf04:
            r36 = r5
            r22 = r6
            r13 = r7
            r1 = r8
            r26 = r9
            r19 = r10
            r70 = r11
            java.lang.String r5 = "cosmos_signAmino"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> Lb3d
            if (r5 != 0) goto Lf25
            r17 = r70
            r60 = r1
            r70 = r2
            r1 = r15
            r2 = r22
            r27 = r36
            goto Lfa1
        Lf25:
            java.lang.String r5 = "Start cosmos signAmino"
            o.pUU.KWHzl(r1, r5)     // Catch: java.lang.Throwable -> Lb3d
            kotlinx.serialization.json.JsonObject r9 = r2.getParams()     // Catch: java.lang.Throwable -> Lb3d
            if (r9 == 0) goto Lf7e
            o.ebF r5 = r3.djBIcL     // Catch: java.lang.Throwable -> Lb3d
            java.lang.String r6 = r70.getWalletId()     // Catch: java.lang.Throwable -> Lb3d
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = r70.getDAppInfo()     // Catch: java.lang.Throwable -> Lb3d
            java.lang.String r8 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> Lb3d
            if (r8 != 0) goto Lf42
            r8 = r16
        Lf42:
            r4.L$0 = r13     // Catch: java.lang.Throwable -> Lb3d
            r4.L$1 = r14     // Catch: java.lang.Throwable -> Lb3d
            r12 = r70
            r4.L$2 = r12     // Catch: java.lang.Throwable -> Lb3d
            r4.L$3 = r3     // Catch: java.lang.Throwable -> Lb3d
            r4.L$4 = r2     // Catch: java.lang.Throwable -> Lb3d
            r11 = r22
            r4.L$5 = r11     // Catch: java.lang.Throwable -> Lb3d
            r10 = r36
            r4.L$6 = r10     // Catch: java.lang.Throwable -> Lb3d
            r27 = r10
            r10 = 41
            r4.label = r10     // Catch: java.lang.Throwable -> Lb3d
            r37 = r27
            r10 = r14
            r38 = r11
            r11 = r4
            java.lang.Object r5 = r5.KWHzl(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lb3d
            if (r5 != r15) goto Lf69
            return r15
        Lf69:
            r6 = r2
            r7 = r3
            r3 = r5
            r11 = r12
            r2 = r37
            r5 = r38
            r68 = r14
            r14 = r13
            r13 = r68
        Lf76:
            kotlin.Result r3 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> Lb3d
        Lf7a:
            r53 = r19
            goto L1980
        Lf7e:
            r49 = r19
            r50 = r36
            goto L1697
        Lf84:
            r37 = r5
            r38 = r6
            r13 = r7
            r1 = r8
            r26 = r9
            r19 = r10
            java.lang.String r5 = "sui_signPersonalMessage"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L1a86
            if (r5 != 0) goto Lfa7
            r60 = r1
            r70 = r2
            r17 = r11
            r1 = r15
            r27 = r37
            r2 = r38
        Lfa1:
            r15 = r14
            r14 = r13
            r13 = r19
            goto L1f57
        Lfa7:
            java.lang.String r5 = "Start onSuiSignPersonalMessage"
            o.pUU.KWHzl(r1, r5)     // Catch: java.lang.Throwable -> L1a86
            kotlinx.serialization.json.JsonObject r5 = r2.getParams()     // Catch: java.lang.Throwable -> L1a86
            if (r5 == 0) goto L1027
            o.ebF r6 = r3.djBIcL     // Catch: java.lang.Throwable -> L1a86
            java.lang.String r7 = r11.getWalletId()     // Catch: java.lang.Throwable -> L1a86
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r8 = r11.getDAppInfo()     // Catch: java.lang.Throwable -> L1a86
            java.lang.String r9 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L1a86
            if (r9 != 0) goto Lfc4
            r9 = r16
        Lfc4:
            r12 = r19
            java.lang.Object r5 = r5.get(r12)     // Catch: java.lang.Throwable -> L1a86
            kotlinx.serialization.json.JsonElement r5 = (kotlinx.serialization.json.JsonElement) r5     // Catch: java.lang.Throwable -> L1a86
            if (r5 == 0) goto Lfd9
            kotlinx.serialization.json.JsonPrimitive r5 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(r5)     // Catch: java.lang.Throwable -> Lb3d
            if (r5 == 0) goto Lfd9
            java.lang.String r5 = r5.getContent()     // Catch: java.lang.Throwable -> Lb3d
            goto Lfda
        Lfd9:
            r5 = 0
        Lfda:
            if (r5 != 0) goto Lfdf
            r10 = r16
            goto Lfe0
        Lfdf:
            r10 = r5
        Lfe0:
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L1a86
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L1a86
            r4.L$2 = r11     // Catch: java.lang.Throwable -> L1a86
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L1a86
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L1a86
            r5 = r38
            r4.L$5 = r5     // Catch: java.lang.Throwable -> L1a86
            r25 = r1
            r1 = r37
            r4.L$6 = r1     // Catch: java.lang.Throwable -> L1388
            r22 = r5
            r5 = 21
            r4.label = r5     // Catch: java.lang.Throwable -> L1388
            r18 = 1
            r27 = r1
            r1 = r22
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r18
            r70 = r11
            r11 = r14
            r39 = r12
            r12 = r4
            java.lang.Object r5 = r5.EZpvd(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L1388
            if (r5 != r15) goto L1014
            return r15
        L1014:
            r11 = r70
            r6 = r2
            r7 = r3
            r3 = r5
            r2 = r27
            r5 = r1
            r68 = r14
            r14 = r13
            r13 = r68
        L1021:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L1388
            goto L10a4
        L1027:
            r25 = r1
            r70 = r11
            r39 = r19
            r27 = r37
            r1 = r38
        L1031:
            r22 = r1
            r1 = r25
            r50 = r27
            r49 = r39
            goto L1697
        L103b:
            r27 = r5
            r1 = r6
            r13 = r7
            r25 = r8
            r26 = r9
            r39 = r10
            r70 = r11
            java.lang.String r5 = "tron_signTransaction"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L1388
            if (r5 != 0) goto L1057
            r17 = r70
            r70 = r2
            r60 = r25
            goto L11ed
        L1057:
            kotlinx.serialization.json.JsonObject r9 = r2.getParams()     // Catch: java.lang.Throwable -> L1388
            if (r9 == 0) goto L10ac
            o.ebF r5 = r3.djBIcL     // Catch: java.lang.Throwable -> L1388
            java.lang.String r6 = r70.getWalletId()     // Catch: java.lang.Throwable -> L1388
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = r70.getDAppInfo()     // Catch: java.lang.Throwable -> L1388
            java.lang.String r8 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L1388
            if (r8 != 0) goto L106f
            r8 = r16
        L106f:
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L1388
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L1388
            r12 = r70
            r4.L$2 = r12     // Catch: java.lang.Throwable -> L1388
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L1388
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L1388
            r4.L$5 = r1     // Catch: java.lang.Throwable -> L1388
            r11 = r27
            r4.L$6 = r11     // Catch: java.lang.Throwable -> L1388
            r10 = 35
            r4.label = r10     // Catch: java.lang.Throwable -> L1388
            r10 = 0
            r40 = r11
            r11 = r14
            r70 = r12
            r12 = r4
            java.lang.Object r5 = r5.EZpvd(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L1388
            if (r5 != r15) goto L1093
            return r15
        L1093:
            r11 = r70
            r6 = r2
            r7 = r3
            r3 = r5
            r2 = r40
            r5 = r1
            r68 = r14
            r14 = r13
            r13 = r68
        L10a0:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L1388
        L10a4:
            r3 = r7
            r7 = r14
            r58 = r25
            r19 = r39
            goto L1cc2
        L10ac:
            r22 = r1
            r1 = r25
            r44 = r27
            r45 = r39
            goto L1292
        L10b6:
            r40 = r5
            r1 = r6
            r13 = r7
            r25 = r8
            r26 = r9
            r39 = r10
            r70 = r11
            java.lang.String r5 = "btc_signPsbts"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L1154
            if (r5 != 0) goto L10d4
            r17 = r70
            r70 = r2
            r60 = r25
            r27 = r40
            goto L11ed
        L10d4:
            java.lang.String r5 = "Start onBtcSignPsbts"
            r12 = r25
            o.pUU.KWHzl(r12, r5)     // Catch: java.lang.Throwable -> L1150
            kotlinx.serialization.json.JsonObject r5 = r2.getParams()     // Catch: java.lang.Throwable -> L1150
            if (r5 == 0) goto L1147
            o.ebF r6 = r3.djBIcL     // Catch: java.lang.Throwable -> L1150
            java.lang.String r7 = r70.getWalletId()     // Catch: java.lang.Throwable -> L1150
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r8 = r70.getDAppInfo()     // Catch: java.lang.Throwable -> L1150
            java.lang.String r9 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L1150
            if (r9 != 0) goto L10f3
            r9 = r16
        L10f3:
            kotlinx.serialization.json.Json r10 = r3.gEmmrt     // Catch: java.lang.Throwable -> L1150
            r10.getSerializersModule()     // Catch: java.lang.Throwable -> L1150
            kotlinx.serialization.json.JsonObject$Companion r11 = kotlinx.serialization.json.JsonObject.Companion     // Catch: java.lang.Throwable -> L1150
            kotlinx.serialization.KSerializer r11 = r11.serializer()     // Catch: java.lang.Throwable -> L1150
            java.lang.String r10 = r10.encodeToString(r11, r5)     // Catch: java.lang.Throwable -> L1150
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L1150
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L1150
            r11 = r70
            r4.L$2 = r11     // Catch: java.lang.Throwable -> L1150
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L1150
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L1150
            r4.L$5 = r1     // Catch: java.lang.Throwable -> L1150
            r5 = r40
            r4.L$6 = r5     // Catch: java.lang.Throwable -> L1150
            r27 = r5
            r5 = 27
            r4.label = r5     // Catch: java.lang.Throwable -> L1150
            java.lang.String r18 = "btc_psbts"
            r41 = r27
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r18
            r70 = r11
            r11 = r14
            r42 = r12
            r12 = r4
            java.lang.Object r5 = r5.AEQbTJ(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L1145
            if (r5 != r15) goto L1132
            return r15
        L1132:
            r11 = r70
            r6 = r2
            r7 = r3
            r3 = r5
            r2 = r41
            r5 = r1
            r68 = r14
            r14 = r13
            r13 = r68
        L113f:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L1145
            goto L11bd
        L1145:
            r0 = move-exception
            goto L1157
        L1147:
            r22 = r1
            r1 = r12
            r45 = r39
            r44 = r40
            goto L1292
        L1150:
            r0 = move-exception
            r42 = r12
            goto L1157
        L1154:
            r0 = move-exception
            r42 = r25
        L1157:
            r1 = r0
            goto L11cf
        L115a:
            r41 = r5
            r1 = r6
            r13 = r7
            r42 = r8
            r26 = r9
            r39 = r10
            r70 = r11
            java.lang.String r5 = "starknet_sendTransaction"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L1145
            if (r5 != 0) goto L1174
            r11 = r70
            r43 = r41
            goto L11e5
        L1174:
            kotlinx.serialization.json.JsonObject r9 = r2.getParams()     // Catch: java.lang.Throwable -> L1145
            if (r9 == 0) goto L11c5
            o.ebF r5 = r3.djBIcL     // Catch: java.lang.Throwable -> L1145
            java.lang.String r6 = r70.getWalletId()     // Catch: java.lang.Throwable -> L1145
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = r70.getDAppInfo()     // Catch: java.lang.Throwable -> L1145
            java.lang.String r8 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L1145
            if (r8 != 0) goto L118c
            r8 = r16
        L118c:
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L1145
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L1145
            r12 = r70
            r4.L$2 = r12     // Catch: java.lang.Throwable -> L1145
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L1145
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L1145
            r4.L$5 = r1     // Catch: java.lang.Throwable -> L1145
            r11 = r41
            r4.L$6 = r11     // Catch: java.lang.Throwable -> L1145
            r10 = 37
            r4.label = r10     // Catch: java.lang.Throwable -> L1145
            r10 = r14
            r43 = r11
            r11 = r4
            java.lang.Object r5 = r5.copydefault(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1145
            if (r5 != r15) goto L11ad
            return r15
        L11ad:
            r6 = r2
            r7 = r3
            r3 = r5
            r11 = r12
            r2 = r43
            r5 = r1
            r68 = r14
            r14 = r13
            r13 = r68
        L11b9:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L1145
        L11bd:
            r3 = r7
            r7 = r14
            r19 = r39
            r58 = r42
            goto L1cc2
        L11c5:
            r22 = r1
            r45 = r39
            r44 = r41
            r1 = r42
            goto L1292
        L11cf:
            r5 = r42
            goto L21b7
        L11d3:
            r43 = r5
            r1 = r6
            r13 = r7
            r42 = r8
            r26 = r9
            r39 = r10
            java.lang.String r5 = "sui_signMessage"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L12a5
            if (r5 != 0) goto L11f5
        L11e5:
            r70 = r2
            r17 = r11
            r60 = r42
            r27 = r43
        L11ed:
            r2 = r1
            r1 = r15
            r15 = r14
            r14 = r13
            r13 = r39
            goto L1f57
        L11f5:
            java.lang.String r5 = "Start onSuiSignMessage"
            r12 = r42
            o.pUU.KWHzl(r12, r5)     // Catch: java.lang.Throwable -> L12a2
            kotlinx.serialization.json.JsonObject r5 = r2.getParams()     // Catch: java.lang.Throwable -> L12a2
            if (r5 == 0) goto L1289
            o.ebF r6 = r3.djBIcL     // Catch: java.lang.Throwable -> L12a2
            java.lang.String r7 = r11.getWalletId()     // Catch: java.lang.Throwable -> L12a2
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r8 = r11.getDAppInfo()     // Catch: java.lang.Throwable -> L12a2
            java.lang.String r9 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L12a2
            if (r9 != 0) goto L1214
            r9 = r16
        L1214:
            r10 = r39
            java.lang.Object r5 = r5.get(r10)     // Catch: java.lang.Throwable -> L12a2
            kotlinx.serialization.json.JsonElement r5 = (kotlinx.serialization.json.JsonElement) r5     // Catch: java.lang.Throwable -> L12a2
            if (r5 == 0) goto L122c
            kotlinx.serialization.json.JsonPrimitive r5 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(r5)     // Catch: java.lang.Throwable -> L1229
            if (r5 == 0) goto L122c
            java.lang.String r5 = r5.getContent()     // Catch: java.lang.Throwable -> L1229
            goto L122d
        L1229:
            r0 = move-exception
            goto L1f95
        L122c:
            r5 = 0
        L122d:
            if (r5 != 0) goto L1232
            r18 = r16
            goto L1234
        L1232:
            r18 = r5
        L1234:
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L12a2
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L12a2
            r4.L$2 = r11     // Catch: java.lang.Throwable -> L12a2
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L12a2
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L12a2
            r4.L$5 = r1     // Catch: java.lang.Throwable -> L12a2
            r5 = r43
            r4.L$6 = r5     // Catch: java.lang.Throwable -> L12a2
            r27 = r5
            r5 = 20
            r4.label = r5     // Catch: java.lang.Throwable -> L12a2
            r19 = 0
            r44 = r27
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r18
            r45 = r10
            r10 = r19
            r70 = r11
            r11 = r14
            r22 = r1
            r1 = r12
            r12 = r4
            java.lang.Object r5 = r5.EZpvd(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L1286
            if (r5 != r15) goto L1266
            return r15
        L1266:
            r11 = r70
            r6 = r2
            r7 = r3
            r3 = r5
            r5 = r22
            r2 = r44
            r68 = r14
            r14 = r13
            r13 = r68
        L1274:
            kotlin.Result r3 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L1286
            r58 = r1
            r1 = r2
            r2 = r6
            r19 = r45
            r6 = r5
            r5 = r11
            r11 = r3
            r3 = r7
            r7 = r14
            r14 = r13
            goto L1dc9
        L1286:
            r0 = move-exception
        L1287:
            r2 = r0
            goto L12a9
        L1289:
            r22 = r1
            r70 = r11
            r1 = r12
            r45 = r39
            r44 = r43
        L1292:
            r17 = r70
            r60 = r1
            r7 = r13
            r1 = r15
            r6 = r22
            r13 = r45
            r11 = 0
            r15 = r14
            r14 = r44
            goto L1f5e
        L12a2:
            r0 = move-exception
            r1 = r12
            goto L1287
        L12a5:
            r0 = move-exception
            r1 = r42
            goto L1287
        L12a9:
            r5 = r1
            r1 = r2
            goto L21b7
        L12ad:
            r44 = r5
            r22 = r6
            r13 = r7
            r1 = r8
            r26 = r9
            r45 = r10
            r70 = r11
            java.lang.String r5 = "cosmos_signDirect"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L133b
            if (r5 != 0) goto L12ce
            r17 = r70
            r60 = r1
            r70 = r2
            r1 = r15
            r2 = r22
            r27 = r44
            goto L14d7
        L12ce:
            java.lang.String r5 = "Start cosmos signDirect"
            o.pUU.KWHzl(r1, r5)     // Catch: java.lang.Throwable -> L133b
            kotlinx.serialization.json.JsonObject r9 = r2.getParams()     // Catch: java.lang.Throwable -> L133b
            if (r9 == 0) goto L1331
            o.ebF r5 = r3.djBIcL     // Catch: java.lang.Throwable -> L133b
            java.lang.String r6 = r70.getWalletId()     // Catch: java.lang.Throwable -> L133b
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = r70.getDAppInfo()     // Catch: java.lang.Throwable -> L133b
            java.lang.String r8 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L133b
            if (r8 != 0) goto L12eb
            r8 = r16
        L12eb:
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L133b
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L133b
            r12 = r70
            r4.L$2 = r12     // Catch: java.lang.Throwable -> L133b
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L133b
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L133b
            r11 = r22
            r4.L$5 = r11     // Catch: java.lang.Throwable -> L133b
            r10 = r44
            r4.L$6 = r10     // Catch: java.lang.Throwable -> L133b
            r27 = r10
            r10 = 42
            r4.label = r10     // Catch: java.lang.Throwable -> L133b
            r25 = r1
            r1 = r27
            r10 = r14
            r46 = r11
            r11 = r4
            java.lang.Object r5 = r5.OLrzqt(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1388
            if (r5 != r15) goto L1314
            return r15
        L1314:
            r6 = r2
            r7 = r3
            r3 = r5
            r11 = r14
            r5 = r46
            r2 = r1
            r14 = r13
            r13 = r12
        L131d:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L1388
            r3 = r7
            r17 = r13
            r7 = r14
            r60 = r25
            r13 = r45
            r14 = r2
            r2 = r6
            r6 = r5
            r68 = r11
            r11 = r1
            goto L1dd2
        L1331:
            r25 = r1
            r1 = r22
            r27 = r44
            r12 = r45
            goto L18d9
        L133b:
            r0 = move-exception
            r25 = r1
            goto L173f
        L1340:
            r1 = r5
            r46 = r6
            r13 = r7
            r25 = r8
            r26 = r9
            r45 = r10
            java.lang.String r5 = "sync_all_addresses"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L1388
            if (r5 != 0) goto L1355
            r10 = r46
            goto L139c
        L1355:
            r5 = 0
            r1.element = r5     // Catch: java.lang.Throwable -> L1388
            o.ebF r5 = r3.djBIcL     // Catch: java.lang.Throwable -> L1388
            java.lang.String r6 = r11.getWalletId()     // Catch: java.lang.Throwable -> L1388
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L1388
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L1388
            r4.L$2 = r11     // Catch: java.lang.Throwable -> L1388
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L1388
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L1388
            r10 = r46
            r4.L$5 = r10     // Catch: java.lang.Throwable -> L1388
            r4.L$6 = r1     // Catch: java.lang.Throwable -> L1388
            r7 = 7
            r4.label = r7     // Catch: java.lang.Throwable -> L1388
            java.lang.Object r5 = r5.EZpvd(r6, r4)     // Catch: java.lang.Throwable -> L1388
            if (r5 != r15) goto L1378
            return r15
        L1378:
            r6 = r2
            r7 = r3
            r3 = r5
            r5 = r10
            r2 = r1
            r68 = r14
            r14 = r13
            r13 = r68
        L1382:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L1388
            goto L14a2
        L1388:
            r0 = move-exception
            goto L173f
        L138b:
            r1 = r5
            r13 = r7
            r25 = r8
            r26 = r9
            r45 = r10
            r10 = r6
            java.lang.String r5 = "btc_sendInscription"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L140b
            if (r5 != 0) goto L13a8
        L139c:
            r27 = r1
            r70 = r2
            r2 = r10
            r17 = r11
            r1 = r15
            r60 = r25
            goto L14d7
        L13a8:
            java.lang.String r5 = "Start onBtcSendInscription"
            r12 = r25
            o.pUU.KWHzl(r12, r5)     // Catch: java.lang.Throwable -> L199f
            kotlinx.serialization.json.JsonObject r9 = r2.getParams()     // Catch: java.lang.Throwable -> L199f
            if (r9 == 0) goto L1403
            o.ebF r5 = r3.djBIcL     // Catch: java.lang.Throwable -> L199f
            java.lang.String r6 = r11.getWalletId()     // Catch: java.lang.Throwable -> L199f
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = r11.getDAppInfo()     // Catch: java.lang.Throwable -> L199f
            java.lang.String r8 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L199f
            if (r8 != 0) goto L13c7
            r8 = r16
        L13c7:
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L199f
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L199f
            r4.L$2 = r11     // Catch: java.lang.Throwable -> L199f
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L199f
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L199f
            r4.L$5 = r10     // Catch: java.lang.Throwable -> L199f
            r4.L$6 = r1     // Catch: java.lang.Throwable -> L199f
            r22 = r10
            r10 = 25
            r4.label = r10     // Catch: java.lang.Throwable -> L199f
            r10 = 10
            r27 = r1
            r1 = r22
            r70 = r11
            r11 = r14
            r1 = r12
            r12 = r4
            java.lang.Object r5 = r5.KWHzl(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lb3d
            if (r5 != r15) goto L13ed
            return r15
        L13ed:
            r11 = r70
            r6 = r2
            r7 = r3
            r3 = r5
            r5 = r22
            r2 = r27
            r68 = r14
            r14 = r13
            r13 = r68
        L13fb:
            kotlin.Result r3 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> Lb3d
            r53 = r45
            goto L1980
        L1403:
            r47 = r10
            r70 = r11
            r25 = r12
            goto L14b0
        L140b:
            r0 = move-exception
            r1 = r25
        L140e:
            r5 = r1
        L140f:
            r1 = r0
            goto L21b7
        L1412:
            r27 = r5
            r22 = r6
            r13 = r7
            r1 = r8
            r26 = r9
            r45 = r10
            r70 = r11
            java.lang.String r5 = "solana_signAndSendTransaction"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L1a86
            if (r5 != 0) goto L1431
            r17 = r70
            r60 = r1
            r70 = r2
            r1 = r15
            r2 = r22
            goto L14d7
        L1431:
            java.lang.String r5 = "Start onSolSignAndSendTransaction"
            o.pUU.KWHzl(r1, r5)     // Catch: java.lang.Throwable -> L1a86
            kotlinx.serialization.json.JsonObject r5 = r2.getParams()     // Catch: java.lang.Throwable -> L1a86
            if (r5 == 0) goto L14aa
            o.ebF r6 = r3.djBIcL     // Catch: java.lang.Throwable -> L1a86
            java.lang.String r7 = r70.getWalletId()     // Catch: java.lang.Throwable -> L1a86
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r8 = r70.getDAppInfo()     // Catch: java.lang.Throwable -> L1a86
            java.lang.String r9 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L1a86
            if (r9 != 0) goto L144e
            r9 = r16
        L144e:
            kotlinx.serialization.json.Json r10 = r3.gEmmrt     // Catch: java.lang.Throwable -> L1a86
            r10.getSerializersModule()     // Catch: java.lang.Throwable -> L1a86
            kotlinx.serialization.json.JsonObject$Companion r11 = kotlinx.serialization.json.JsonObject.Companion     // Catch: java.lang.Throwable -> L1a86
            kotlinx.serialization.KSerializer r11 = r11.serializer()     // Catch: java.lang.Throwable -> L1a86
            java.lang.String r10 = r10.encodeToString(r11, r5)     // Catch: java.lang.Throwable -> L1a86
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L1a86
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L1a86
            r12 = r70
            r4.L$2 = r12     // Catch: java.lang.Throwable -> L1a86
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L1a86
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L1a86
            r11 = r22
            r4.L$5 = r11     // Catch: java.lang.Throwable -> L1a86
            r5 = r27
            r4.L$6 = r5     // Catch: java.lang.Throwable -> L1a86
            r27 = r5
            r5 = 19
            r4.label = r5     // Catch: java.lang.Throwable -> L1a86
            r18 = 1
            r25 = r1
            r1 = r27
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r18
            r47 = r11
            r11 = r14
            r70 = r12
            r12 = r4
            java.lang.Object r5 = r5.AEQbTJ(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L1388
            if (r5 != r15) goto L1491
            return r15
        L1491:
            r11 = r70
            r6 = r2
            r7 = r3
            r3 = r5
            r5 = r47
            r2 = r1
            r68 = r14
            r14 = r13
            r13 = r68
        L149e:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L1388
        L14a2:
            r3 = r7
            r7 = r14
            r58 = r25
            r19 = r45
            goto L1cc2
        L14aa:
            r25 = r1
            r47 = r22
            r1 = r27
        L14b0:
            r27 = r1
            r12 = r45
            r1 = r47
            goto L18d9
        L14b8:
            r1 = r5
            r47 = r6
            r13 = r7
            r25 = r8
            r26 = r9
            r45 = r10
            r70 = r11
            java.lang.String r5 = "personal_sign"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L1388
            if (r5 != 0) goto L14dd
            r17 = r70
            r27 = r1
            r70 = r2
            r1 = r15
            r60 = r25
            r2 = r47
        L14d7:
            r15 = r14
            r14 = r13
            r13 = r45
            goto L1f57
        L14dd:
            kotlinx.serialization.json.JsonObject r5 = r2.getParams()     // Catch: java.lang.Throwable -> L1388
            if (r5 == 0) goto L14b0
            o.ebF r6 = r3.djBIcL     // Catch: java.lang.Throwable -> L1388
            java.lang.String r7 = r70.getWalletId()     // Catch: java.lang.Throwable -> L1388
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r8 = r70.getDAppInfo()     // Catch: java.lang.Throwable -> L1388
            java.lang.String r9 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L1388
            if (r9 != 0) goto L14f5
            r9 = r16
        L14f5:
            r12 = r45
            java.lang.Object r5 = r5.get(r12)     // Catch: java.lang.Throwable -> L1388
            kotlinx.serialization.json.JsonElement r5 = (kotlinx.serialization.json.JsonElement) r5     // Catch: java.lang.Throwable -> L1388
            if (r5 == 0) goto L150a
            kotlinx.serialization.json.JsonPrimitive r5 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(r5)     // Catch: java.lang.Throwable -> L1388
            if (r5 == 0) goto L150a
            java.lang.String r11 = r5.getContent()     // Catch: java.lang.Throwable -> L1388
            goto L150b
        L150a:
            r11 = 0
        L150b:
            if (r11 != 0) goto L150f
            r11 = r16
        L150f:
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L1388
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L1388
            r10 = r70
            r4.L$2 = r10     // Catch: java.lang.Throwable -> L1388
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L1388
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L1388
            r5 = r47
            r4.L$5 = r5     // Catch: java.lang.Throwable -> L1388
            r4.L$6 = r1     // Catch: java.lang.Throwable -> L1388
            r22 = r5
            r5 = 12
            r4.label = r5     // Catch: java.lang.Throwable -> L1388
            r27 = r1
            r1 = r22
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r11
            r11 = r10
            r10 = r14
            r70 = r11
            r11 = r4
            java.lang.Object r5 = r5.EZpvd(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1388
            if (r5 != r15) goto L153c
            return r15
        L153c:
            r11 = r70
            r6 = r2
            r7 = r3
            r3 = r5
            r2 = r27
            r5 = r1
            r68 = r14
            r14 = r13
            r13 = r68
        L1549:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L1388
            r49 = r12
            goto L1833
        L1551:
            r27 = r5
            r1 = r6
            r13 = r7
            r25 = r8
            r26 = r9
            r70 = r11
            r11 = r10
            java.lang.String r5 = "btc_signAndPushPsbt"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L1388
            if (r5 != 0) goto L156c
            r49 = r11
            r48 = r27
            r11 = r70
            goto L15eb
        L156c:
            kotlinx.serialization.json.JsonObject r5 = r2.getParams()     // Catch: java.lang.Throwable -> L1388
            if (r5 == 0) goto L15cf
            o.ebF r6 = r3.djBIcL     // Catch: java.lang.Throwable -> L1388
            java.lang.String r7 = r70.getWalletId()     // Catch: java.lang.Throwable -> L1388
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r8 = r70.getDAppInfo()     // Catch: java.lang.Throwable -> L1388
            java.lang.String r9 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L1388
            if (r9 != 0) goto L1584
            r9 = r16
        L1584:
            kotlinx.serialization.json.Json r10 = r3.gEmmrt     // Catch: java.lang.Throwable -> L1388
            r10.getSerializersModule()     // Catch: java.lang.Throwable -> L1388
            kotlinx.serialization.json.JsonObject$Companion r12 = kotlinx.serialization.json.JsonObject.Companion     // Catch: java.lang.Throwable -> L1388
            kotlinx.serialization.KSerializer r12 = r12.serializer()     // Catch: java.lang.Throwable -> L1388
            java.lang.String r10 = r10.encodeToString(r12, r5)     // Catch: java.lang.Throwable -> L1388
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L1388
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L1388
            r12 = r70
            r4.L$2 = r12     // Catch: java.lang.Throwable -> L1388
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L1388
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L1388
            r4.L$5 = r1     // Catch: java.lang.Throwable -> L1388
            r5 = r27
            r4.L$6 = r5     // Catch: java.lang.Throwable -> L1388
            r27 = r5
            r5 = 28
            r4.label = r5     // Catch: java.lang.Throwable -> L1388
            r48 = r27
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r14
            r49 = r11
            r11 = r4
            java.lang.Object r5 = r5.OLrzqt(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1388
            if (r5 != r15) goto L15bd
            return r15
        L15bd:
            r6 = r2
            r7 = r3
            r3 = r5
            r11 = r12
            r2 = r48
            r5 = r1
            r68 = r14
            r14 = r13
            r13 = r68
        L15c9:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L1388
            goto L1833
        L15cf:
            r49 = r11
            r22 = r1
            r1 = r25
        L15d5:
            r50 = r27
            goto L1697
        L15d9:
            r48 = r5
            r1 = r6
            r13 = r7
            r25 = r8
            r26 = r9
            r49 = r10
            java.lang.String r5 = "sui_signTransactionBlock"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L16ab
            if (r5 != 0) goto L15f7
        L15eb:
            r70 = r2
            r17 = r11
            r60 = r25
            r27 = r48
            r2 = r1
            r1 = r15
            goto L16cf
        L15f7:
            java.lang.String r5 = "Start onSuiSignTransactionBlock"
            r12 = r25
            o.pUU.KWHzl(r12, r5)     // Catch: java.lang.Throwable -> L16a7
            kotlinx.serialization.json.JsonObject r5 = r2.getParams()     // Catch: java.lang.Throwable -> L16a7
            if (r5 == 0) goto L1690
            o.ebF r6 = r3.djBIcL     // Catch: java.lang.Throwable -> L16a7
            java.lang.String r7 = r11.getWalletId()     // Catch: java.lang.Throwable -> L16a7
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r8 = r11.getDAppInfo()     // Catch: java.lang.Throwable -> L16a7
            java.lang.String r9 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L16a7
            if (r9 != 0) goto L1616
            r9 = r16
        L1616:
            kotlinx.serialization.json.Json r10 = r3.gEmmrt     // Catch: java.lang.Throwable -> L16a7
            r10.getSerializersModule()     // Catch: java.lang.Throwable -> L16a7
            kotlinx.serialization.json.JsonObject$Companion r19 = kotlinx.serialization.json.JsonObject.Companion     // Catch: java.lang.Throwable -> L16a7
            r25 = r12
            kotlinx.serialization.KSerializer r12 = r19.serializer()     // Catch: java.lang.Throwable -> L16ab
            java.lang.String r10 = r10.encodeToString(r12, r5)     // Catch: java.lang.Throwable -> L16ab
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L16ab
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L16ab
            r4.L$2 = r11     // Catch: java.lang.Throwable -> L16ab
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L16ab
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L16ab
            r4.L$5 = r1     // Catch: java.lang.Throwable -> L16ab
            r12 = r48
            r4.L$6 = r12     // Catch: java.lang.Throwable -> L16ab
            r5 = 22
            r4.label = r5     // Catch: java.lang.Throwable -> L16ab
            r19 = 0
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r19
            r70 = r11
            r11 = r14
            r22 = r1
            r50 = r12
            r1 = r25
            r12 = r4
            java.lang.Object r5 = r5.OLrzqt(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L168d
            if (r5 != r15) goto L1655
            return r15
        L1655:
            r11 = r70
            r6 = r2
            r7 = r3
            r3 = r5
            r5 = r22
            r2 = r50
        L165e:
            boolean r8 = kotlin.Result.m7384isSuccessimpl(r3)     // Catch: java.lang.Throwable -> L168d
            if (r8 == 0) goto L1678
            kotlin.Result$Application r8 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L168d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L168d
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1678 java.lang.Throwable -> L168d
            r8.<init>(r3)     // Catch: java.lang.Exception -> L1678 java.lang.Throwable -> L168d
            java.lang.String r9 = "signatures"
            org.json.JSONArray r8 = r8.getJSONArray(r9)     // Catch: java.lang.Exception -> L1678 java.lang.Throwable -> L168d
            r9 = 0
            java.lang.String r3 = r8.optString(r9)     // Catch: java.lang.Exception -> L1678 java.lang.Throwable -> L168d
        L1678:
            java.lang.Object r3 = kotlin.Result.m7377constructorimpl(r3)     // Catch: java.lang.Throwable -> L168d
            kotlin.Result r3 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L168d
            r58 = r1
            r1 = r2
            r2 = r6
            r19 = r49
            r6 = r5
            r5 = r11
            r11 = r3
            r3 = r7
            r7 = r13
            goto L1dc9
        L168d:
            r0 = move-exception
            goto L1287
        L1690:
            r22 = r1
            r70 = r11
            r1 = r12
            r50 = r48
        L1697:
            r17 = r70
            r60 = r1
            r7 = r13
            r1 = r15
            r6 = r22
            r13 = r49
            r11 = 0
            r15 = r14
            r14 = r50
            goto L1f5e
        L16a7:
            r0 = move-exception
            r1 = r12
            goto L1287
        L16ab:
            r0 = move-exception
            r1 = r25
            goto L1287
        L16b0:
            r50 = r5
            r22 = r6
            r13 = r7
            r1 = r8
            r26 = r9
            r49 = r10
            r70 = r11
            java.lang.String r5 = "btc_sendRunes"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L173c
            if (r5 != 0) goto L16d5
            r17 = r70
            r60 = r1
            r70 = r2
            r1 = r15
            r2 = r22
            r27 = r50
        L16cf:
            r15 = r14
            r14 = r13
            r13 = r49
            goto L1f57
        L16d5:
            java.lang.String r5 = "Start onBtcSendRunes"
            o.pUU.KWHzl(r1, r5)     // Catch: java.lang.Throwable -> L173c
            kotlinx.serialization.json.JsonObject r9 = r2.getParams()     // Catch: java.lang.Throwable -> L173c
            if (r9 == 0) goto L1732
            o.ebF r5 = r3.djBIcL     // Catch: java.lang.Throwable -> L173c
            java.lang.String r6 = r70.getWalletId()     // Catch: java.lang.Throwable -> L173c
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = r70.getDAppInfo()     // Catch: java.lang.Throwable -> L173c
            java.lang.String r8 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L173c
            if (r8 != 0) goto L16f2
            r8 = r16
        L16f2:
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L173c
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L173c
            r12 = r70
            r4.L$2 = r12     // Catch: java.lang.Throwable -> L173c
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L173c
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L173c
            r11 = r22
            r4.L$5 = r11     // Catch: java.lang.Throwable -> L173c
            r10 = r50
            r4.L$6 = r10     // Catch: java.lang.Throwable -> L173c
            r27 = r10
            r10 = 30
            r4.label = r10     // Catch: java.lang.Throwable -> L173c
            r10 = 14
            r25 = r1
            r1 = r27
            r51 = r11
            r11 = r14
            r70 = r12
            r12 = r4
            java.lang.Object r5 = r5.KWHzl(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L17c3
            if (r5 != r15) goto L171f
            return r15
        L171f:
            r11 = r70
            r6 = r2
            r7 = r3
            r3 = r5
            r5 = r51
            r2 = r1
            r68 = r14
            r14 = r13
            r13 = r68
        L172c:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L17c3
            goto L1833
        L1732:
            r25 = r1
            r1 = r22
            r12 = r49
            r27 = r50
            goto L18d9
        L173c:
            r0 = move-exception
            r25 = r1
        L173f:
            r1 = r0
            goto L18e7
        L1742:
            r1 = r5
            r51 = r6
            r13 = r7
            r25 = r8
            r26 = r9
            r49 = r10
            r70 = r11
            java.lang.String r5 = "wallet_addEthereumChain"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L17c3
            if (r5 != 0) goto L175c
            r11 = r70
            r10 = r51
            goto L1856
        L175c:
            kotlinx.serialization.json.JsonObject r5 = r2.getParams()     // Catch: java.lang.Throwable -> L17c3
            if (r5 == 0) goto L17c6
            o.ebF r6 = r3.djBIcL     // Catch: java.lang.Throwable -> L17c3
            java.lang.String r7 = r70.getWalletId()     // Catch: java.lang.Throwable -> L17c3
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r8 = r70.getDAppInfo()     // Catch: java.lang.Throwable -> L17c3
            kotlinx.serialization.json.Json r9 = r3.gEmmrt     // Catch: java.lang.Throwable -> L17c3
            r9.getSerializersModule()     // Catch: java.lang.Throwable -> L17c3
            com.okinc.business.defi.biz.walletconnect.WalletAddEthereumChain$Companion r10 = com.okinc.business.defi.biz.walletconnect.WalletAddEthereumChain.Companion     // Catch: java.lang.Throwable -> L17c3
            kotlinx.serialization.KSerializer r10 = r10.serializer()     // Catch: java.lang.Throwable -> L17c3
            java.lang.Object r5 = r9.decodeFromJsonElement(r10, r5)     // Catch: java.lang.Throwable -> L17c3
            r9 = r5
            com.okinc.business.defi.biz.walletconnect.WalletAddEthereumChain r9 = (com.okinc.business.defi.biz.walletconnect.WalletAddEthereumChain) r9     // Catch: java.lang.Throwable -> L17c3
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L17c3
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L17c3
            r11 = r70
            r4.L$2 = r11     // Catch: java.lang.Throwable -> L17c3
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L17c3
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L17c3
            r12 = r51
            r4.L$5 = r12     // Catch: java.lang.Throwable -> L17c3
            r4.L$6 = r1     // Catch: java.lang.Throwable -> L17c3
            r5 = 10
            r4.label = r5     // Catch: java.lang.Throwable -> L17c3
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r14
            r10 = r4
            java.lang.Object r5 = r5.OLrzqt(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L17c3
            if (r5 != r15) goto L17a1
            return r15
        L17a1:
            r6 = r2
            r7 = r3
            r3 = r5
            r5 = r12
            r2 = r1
            r68 = r14
            r14 = r13
            r13 = r68
        L17ab:
            boolean r1 = kotlin.Result.m7384isSuccessimpl(r3)     // Catch: java.lang.Throwable -> L17c3
            if (r1 == 0) goto L17bd
            r1 = r3
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L17c3
            boolean r8 = o.C33129mqd.OLrzqt(r1)     // Catch: java.lang.Throwable -> L17c3
            if (r8 == 0) goto L17bd
            r7.OLrzqt(r11, r1)     // Catch: java.lang.Throwable -> L17c3
        L17bd:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L17c3
            goto L1833
        L17c3:
            r0 = move-exception
            goto L173f
        L17c6:
            r11 = r70
            r12 = r51
            goto L183c
        L17cc:
            r1 = r5
            r13 = r7
            r25 = r8
            r26 = r9
            r49 = r10
            r10 = r6
            java.lang.String r5 = "wallet_watchAsset"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L17c3
            if (r5 != 0) goto L17df
            goto L1856
        L17df:
            kotlinx.serialization.json.JsonObject r5 = r2.getParams()     // Catch: java.lang.Throwable -> L17c3
            if (r5 == 0) goto L183b
            o.ebF r6 = r3.djBIcL     // Catch: java.lang.Throwable -> L17c3
            java.lang.String r7 = r11.getWalletId()     // Catch: java.lang.Throwable -> L17c3
            java.lang.String r8 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L17c3
            if (r8 != 0) goto L17f3
            r8 = r16
        L17f3:
            kotlinx.serialization.json.Json r9 = r3.gEmmrt     // Catch: java.lang.Throwable -> L17c3
            r9.getSerializersModule()     // Catch: java.lang.Throwable -> L17c3
            com.okinc.business.defi.biz.walletconnect.WalletWatchAsset$Companion r12 = com.okinc.business.defi.biz.walletconnect.WalletWatchAsset.Companion     // Catch: java.lang.Throwable -> L17c3
            kotlinx.serialization.KSerializer r12 = r12.serializer()     // Catch: java.lang.Throwable -> L17c3
            java.lang.Object r5 = r9.decodeFromJsonElement(r12, r5)     // Catch: java.lang.Throwable -> L17c3
            r9 = r5
            com.okinc.business.defi.biz.walletconnect.WalletWatchAsset r9 = (com.okinc.business.defi.biz.walletconnect.WalletWatchAsset) r9     // Catch: java.lang.Throwable -> L17c3
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L17c3
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L17c3
            r4.L$2 = r11     // Catch: java.lang.Throwable -> L17c3
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L17c3
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L17c3
            r4.L$5 = r10     // Catch: java.lang.Throwable -> L17c3
            r4.L$6 = r1     // Catch: java.lang.Throwable -> L17c3
            r5 = 11
            r4.label = r5     // Catch: java.lang.Throwable -> L17c3
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r14
            r12 = r10
            r10 = r4
            java.lang.Object r5 = r5.AEQbTJ(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L17c3
            if (r5 != r15) goto L1825
            return r15
        L1825:
            r6 = r2
            r7 = r3
            r3 = r5
            r5 = r12
            r2 = r1
            r68 = r14
            r14 = r13
            r13 = r68
        L182f:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L17c3
        L1833:
            r3 = r7
            r7 = r14
            r58 = r25
            r19 = r49
            goto L1cc2
        L183b:
            r12 = r10
        L183c:
            r27 = r1
            r70 = r11
            r1 = r12
        L1841:
            r12 = r49
            goto L18d9
        L1845:
            r1 = r5
            r13 = r7
            r25 = r8
            r26 = r9
            r49 = r10
            r10 = r6
            java.lang.String r5 = "aptos_signMessage"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L17c3
            if (r5 != 0) goto L1862
        L1856:
            r27 = r1
            r70 = r2
            r2 = r10
            r17 = r11
            r1 = r15
            r60 = r25
            goto L16cf
        L1862:
            kotlinx.serialization.json.JsonObject r5 = r2.getParams()     // Catch: java.lang.Throwable -> L17c3
            if (r5 == 0) goto L18d2
            o.ebF r6 = r3.djBIcL     // Catch: java.lang.Throwable -> L17c3
            java.lang.String r7 = r11.getWalletId()     // Catch: java.lang.Throwable -> L17c3
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r8 = r11.getDAppInfo()     // Catch: java.lang.Throwable -> L17c3
            java.lang.String r9 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L17c3
            if (r9 != 0) goto L187a
            r9 = r16
        L187a:
            r12 = r49
            java.lang.Object r5 = r5.get(r12)     // Catch: java.lang.Throwable -> L17c3
            kotlinx.serialization.json.JsonElement r5 = (kotlinx.serialization.json.JsonElement) r5     // Catch: java.lang.Throwable -> L17c3
            if (r5 == 0) goto L188f
            kotlinx.serialization.json.JsonPrimitive r5 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(r5)     // Catch: java.lang.Throwable -> L17c3
            if (r5 == 0) goto L188f
            java.lang.String r5 = r5.getContent()     // Catch: java.lang.Throwable -> L17c3
            goto L1890
        L188f:
            r5 = 0
        L1890:
            if (r5 != 0) goto L1895
            r18 = r16
            goto L1897
        L1895:
            r18 = r5
        L1897:
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L17c3
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L17c3
            r4.L$2 = r11     // Catch: java.lang.Throwable -> L17c3
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L17c3
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L17c3
            r4.L$5 = r10     // Catch: java.lang.Throwable -> L17c3
            r4.L$6 = r1     // Catch: java.lang.Throwable -> L17c3
            r5 = 31
            r4.label = r5     // Catch: java.lang.Throwable -> L17c3
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r18
            r27 = r1
            r1 = r10
            r10 = r14
            r70 = r11
            r11 = r4
            java.lang.Object r5 = r5.copydefault(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L17c3
            if (r5 != r15) goto L18bd
            return r15
        L18bd:
            r11 = r70
            r6 = r2
            r7 = r3
            r3 = r5
            r2 = r27
            r5 = r1
            r68 = r14
            r14 = r13
            r13 = r68
        L18ca:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L17c3
            r53 = r12
            goto L1a6f
        L18d2:
            r27 = r1
            r1 = r10
            r70 = r11
            goto L1841
        L18d9:
            r17 = r70
            r6 = r1
            r7 = r13
            r1 = r15
            r60 = r25
            r11 = 0
            r13 = r12
            r15 = r14
            r14 = r27
            goto L1f5e
        L18e7:
            r5 = r25
            goto L21b7
        L18eb:
            r27 = r5
            r1 = r6
            r13 = r7
            r25 = r8
            r26 = r9
            r70 = r11
            r11 = r10
            java.lang.String r5 = "btc_signMessage"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L19a8
            if (r5 != 0) goto L190b
            r17 = r70
            r70 = r2
            r60 = r25
            r2 = r1
            r1 = r15
            r15 = r14
            r14 = r13
            r13 = r11
            goto L1f57
        L190b:
            java.lang.String r5 = "Start onBtcSignMessage"
            r12 = r25
            o.pUU.KWHzl(r12, r5)     // Catch: java.lang.Throwable -> L199f
            kotlinx.serialization.json.JsonObject r5 = r2.getParams()     // Catch: java.lang.Throwable -> L199f
            if (r5 == 0) goto L198c
            o.ebF r6 = r3.djBIcL     // Catch: java.lang.Throwable -> L199f
            java.lang.String r7 = r70.getWalletId()     // Catch: java.lang.Throwable -> L199f
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r8 = r70.getDAppInfo()     // Catch: java.lang.Throwable -> L199f
            java.lang.String r9 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L199f
            if (r9 != 0) goto L192a
            r9 = r16
        L192a:
            kotlinx.serialization.json.Json r10 = r3.gEmmrt     // Catch: java.lang.Throwable -> L199f
            r10.getSerializersModule()     // Catch: java.lang.Throwable -> L199f
            kotlinx.serialization.json.JsonObject$Companion r18 = kotlinx.serialization.json.JsonObject.Companion     // Catch: java.lang.Throwable -> L199f
            r19 = r11
            kotlinx.serialization.KSerializer r11 = r18.serializer()     // Catch: java.lang.Throwable -> L1988
            java.lang.String r10 = r10.encodeToString(r11, r5)     // Catch: java.lang.Throwable -> L1988
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L1988
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L1988
            r11 = r70
            r4.L$2 = r11     // Catch: java.lang.Throwable -> L1988
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L1988
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L1988
            r4.L$5 = r1     // Catch: java.lang.Throwable -> L1988
            r5 = r27
            r4.L$6 = r5     // Catch: java.lang.Throwable -> L1988
            r27 = r5
            r5 = 26
            r4.label = r5     // Catch: java.lang.Throwable -> L1988
            java.lang.String r18 = "btc_message"
            r52 = r27
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r18
            r70 = r11
            r53 = r19
            r11 = r14
            r22 = r1
            r1 = r12
            r12 = r4
            java.lang.Object r5 = r5.AEQbTJ(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lb3d
            if (r5 != r15) goto L196e
            return r15
        L196e:
            r11 = r70
            r6 = r2
            r7 = r3
            r3 = r5
            r5 = r22
            r2 = r52
            r68 = r14
            r14 = r13
            r13 = r68
        L197c:
            kotlin.Result r3 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> Lb3d
        L1980:
            r60 = r1
            r1 = r15
            r15 = r13
            r13 = r53
            goto L1f30
        L1988:
            r0 = move-exception
            r1 = r12
            goto L140e
        L198c:
            r22 = r1
            r52 = r27
            r17 = r70
            r60 = r12
            r7 = r13
            r1 = r15
            r6 = r22
            r13 = r11
            r15 = r14
            r14 = r52
            r11 = 0
            goto L1f5e
        L199f:
            r0 = move-exception
            r1 = r12
            goto L1287
        L19a3:
            r0 = move-exception
            r1 = r25
            goto L1287
        L19a8:
            r0 = move-exception
            r1 = r25
            goto L1287
        L19ad:
            r52 = r5
            r22 = r6
            r13 = r7
            r1 = r8
            r26 = r9
            r53 = r10
            r70 = r11
            java.lang.String r5 = "kaia_signTransaction"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L1a86
            if (r5 != 0) goto L19d2
            r17 = r70
            r60 = r1
            r70 = r2
            r1 = r15
            r2 = r22
            r27 = r52
            r15 = r14
            r14 = r13
            r13 = r53
            goto L1f57
        L19d2:
            kotlinx.serialization.json.JsonObject r9 = r2.getParams()     // Catch: java.lang.Throwable -> L1a86
            if (r9 == 0) goto L1a77
            java.lang.String r5 = "Start kaiaSignTransaction"
            o.pUU.KWHzl(r1, r5)     // Catch: java.lang.Throwable -> L1a86
            o.ebF r5 = r3.djBIcL     // Catch: java.lang.Throwable -> L1a86
            java.lang.String r6 = r70.getWalletId()     // Catch: java.lang.Throwable -> L1a86
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = r70.getDAppInfo()     // Catch: java.lang.Throwable -> L1a86
            java.lang.String r8 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L1a86
            if (r8 != 0) goto L19ef
            r8 = r16
        L19ef:
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L1a86
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L1a86
            r12 = r70
            r4.L$2 = r12     // Catch: java.lang.Throwable -> L1a86
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L1a86
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L1a86
            r11 = r22
            r4.L$5 = r11     // Catch: java.lang.Throwable -> L1a86
            r10 = r52
            r4.L$6 = r10     // Catch: java.lang.Throwable -> L1a86
            r27 = r10
            r10 = 15
            r4.label = r10     // Catch: java.lang.Throwable -> L1a86
            r18 = 0
            java.lang.String r19 = "tx_sign"
            r25 = r1
            r1 = r27
            r10 = r14
            r20 = r11
            r11 = r18
            r70 = r12
            r12 = r19
            r1 = r13
            r22 = r20
            r13 = r4
            java.lang.Object r5 = r5.EZpvd(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L1388
            if (r5 != r15) goto L1a25
            return r15
        L1a25:
            r11 = r70
            r6 = r2
            r7 = r3
            r3 = r5
            r13 = r14
            r5 = r22
            r2 = r27
            r14 = r1
        L1a30:
            boolean r1 = kotlin.Result.m7384isSuccessimpl(r3)     // Catch: java.lang.Throwable -> L1388
            if (r1 == 0) goto L1a67
            kotlin.Result$Application r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L1388
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1388
            boolean r1 = o.C33129mqd.OLrzqt(r3)     // Catch: java.lang.Throwable -> L1388
            if (r1 == 0) goto L1a60
            kotlinx.serialization.json.JsonObjectBuilder r1 = new kotlinx.serialization.json.JsonObjectBuilder     // Catch: java.lang.Throwable -> L1388
            r1.<init>()     // Catch: java.lang.Throwable -> L1388
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1388
            r8.<init>()     // Catch: java.lang.Throwable -> L1388
            java.lang.String r9 = "0x"
            r8.append(r9)     // Catch: java.lang.Throwable -> L1388
            r8.append(r3)     // Catch: java.lang.Throwable -> L1388
            java.lang.String r3 = "raw"
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L1388
            kotlinx.serialization.json.JsonElementBuildersKt.put(r1, r3, r8)     // Catch: java.lang.Throwable -> L1388
            kotlinx.serialization.json.JsonObject r1 = r1.build()     // Catch: java.lang.Throwable -> L1388
            goto L1a62
        L1a60:
            r1 = r16
        L1a62:
            java.lang.Object r1 = kotlin.Result.m7377constructorimpl(r1)     // Catch: java.lang.Throwable -> L1388
            goto L1a6b
        L1a67:
            java.lang.Object r1 = kotlin.Result.m7377constructorimpl(r3)     // Catch: java.lang.Throwable -> L1388
        L1a6b:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r1)     // Catch: java.lang.Throwable -> L1388
        L1a6f:
            r3 = r7
            r7 = r14
            r58 = r25
            r19 = r53
            goto L1cc2
        L1a77:
            r25 = r1
            r1 = r13
            r12 = r70
            r13 = r22
            r58 = r25
            r59 = r52
            r19 = r53
            goto L1ddd
        L1a86:
            r0 = move-exception
            r25 = r1
            goto L173f
        L1a8b:
            r27 = r5
            r22 = r6
            r1 = r7
            r25 = r8
            r26 = r9
            r53 = r10
            r70 = r11
            java.lang.String r5 = "solana_signMessage"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L1b5c
            if (r5 != 0) goto L1ab2
            r17 = r70
            r70 = r2
            r2 = r22
            r60 = r25
            r13 = r53
        L1aaa:
            r68 = r14
            r14 = r1
            r1 = r15
            r15 = r68
            goto L1f57
        L1ab2:
            kotlinx.serialization.json.JsonObject r5 = r2.getParams()     // Catch: java.lang.Throwable -> L1b5c
            if (r5 == 0) goto L1b61
            o.ebF r6 = r3.djBIcL     // Catch: java.lang.Throwable -> L1b5c
            java.lang.String r7 = r70.getWalletId()     // Catch: java.lang.Throwable -> L1b5c
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r8 = r70.getDAppInfo()     // Catch: java.lang.Throwable -> L1b5c
            java.lang.String r9 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L1b5c
            if (r9 != 0) goto L1aca
            r9 = r16
        L1aca:
            r13 = r53
            java.lang.Object r5 = r5.get(r13)     // Catch: java.lang.Throwable -> L1b5c
            kotlinx.serialization.json.JsonElement r5 = (kotlinx.serialization.json.JsonElement) r5     // Catch: java.lang.Throwable -> L1b5c
            if (r5 == 0) goto L1adf
            kotlinx.serialization.json.JsonPrimitive r5 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(r5)     // Catch: java.lang.Throwable -> L1388
            if (r5 == 0) goto L1adf
            java.lang.String r11 = r5.getContent()     // Catch: java.lang.Throwable -> L1388
            goto L1ae0
        L1adf:
            r11 = 0
        L1ae0:
            if (r11 != 0) goto L1ae4
            r11 = r16
        L1ae4:
            r4.L$0 = r1     // Catch: java.lang.Throwable -> L1b5c
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L1b5c
            r12 = r70
            r4.L$2 = r12     // Catch: java.lang.Throwable -> L1b5c
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L1b5c
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L1b5c
            r10 = r22
            r4.L$5 = r10     // Catch: java.lang.Throwable -> L1b5c
            r5 = r27
            r4.L$6 = r5     // Catch: java.lang.Throwable -> L1b5c
            r27 = r5
            r5 = 16
            r4.label = r5     // Catch: java.lang.Throwable -> L1b5c
            r19 = r13
            r13 = r27
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r11
            r11 = r10
            r10 = r14
            r27 = r13
            r13 = r11
            r11 = r4
            java.lang.Object r5 = r5.KWHzl(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1b5c
            if (r5 != r15) goto L1b14
            return r15
        L1b14:
            r6 = r2
            r7 = r3
            r3 = r5
            r11 = r12
            r5 = r13
            r13 = r14
            r2 = r27
            r14 = r1
        L1b1d:
            boolean r1 = kotlin.Result.m7384isSuccessimpl(r3)     // Catch: java.lang.Throwable -> L1b5c
            if (r1 == 0) goto L1b4b
            kotlin.Result$Application r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L1b5c
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1b5c
            kotlinx.serialization.json.Json r1 = r7.gEmmrt     // Catch: java.lang.Throwable -> L1388 java.lang.Exception -> L1b3f
            r1.getSerializersModule()     // Catch: java.lang.Throwable -> L1388 java.lang.Exception -> L1b3f
            com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaWCSignResult$Companion r8 = com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaWCSignResult.Companion     // Catch: java.lang.Throwable -> L1388 java.lang.Exception -> L1b3f
            kotlinx.serialization.KSerializer r8 = r8.serializer()     // Catch: java.lang.Throwable -> L1388 java.lang.Exception -> L1b3f
            java.lang.Object r1 = r1.decodeFromString(r8, r3)     // Catch: java.lang.Throwable -> L1388 java.lang.Exception -> L1b3f
            com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaWCSignResult r1 = (com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaWCSignResult) r1     // Catch: java.lang.Throwable -> L1388 java.lang.Exception -> L1b3f
            java.lang.String r3 = r1.getSignature()     // Catch: java.lang.Throwable -> L1388 java.lang.Exception -> L1b3f
            r10 = r25
            goto L1b46
        L1b3f:
            java.lang.String r1 = "Failed to decode SolanaWCSignResult"
            r10 = r25
            o.pUU.copydefault(r10, r1)     // Catch: java.lang.Throwable -> L1b5a
        L1b46:
            java.lang.Object r1 = kotlin.Result.m7377constructorimpl(r3)     // Catch: java.lang.Throwable -> L1b5a
            goto L1b51
        L1b4b:
            r10 = r25
            java.lang.Object r1 = kotlin.Result.m7377constructorimpl(r3)     // Catch: java.lang.Throwable -> L1b5a
        L1b51:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r1)     // Catch: java.lang.Throwable -> L1b5a
            r3 = r7
            r58 = r10
            goto L1dc6
        L1b5a:
            r0 = move-exception
            goto L1b5f
        L1b5c:
            r0 = move-exception
            r10 = r25
        L1b5f:
            r1 = r0
            goto L1ba5
        L1b61:
            r13 = r22
            r19 = r53
            r12 = r70
            r58 = r25
        L1b69:
            r59 = r27
            goto L1ddd
        L1b6d:
            r27 = r5
            r13 = r6
            r1 = r7
            r26 = r9
            r19 = r10
            r10 = r8
            java.lang.String r5 = "solana_signAllTransactions"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L1c1a
            if (r5 != 0) goto L1b89
        L1b7e:
            r70 = r2
            r60 = r10
            r17 = r11
            r2 = r13
            r13 = r19
            goto L1aaa
        L1b89:
            java.lang.String r5 = "Start onSolSignAllTransactions"
            o.pUU.KWHzl(r10, r5)     // Catch: java.lang.Throwable -> L1c1a
            kotlinx.serialization.json.JsonObject r5 = r2.getParams()     // Catch: java.lang.Throwable -> L1c1a
            if (r5 == 0) goto L1c20
            java.lang.String r6 = "transactions"
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> L1c1a
            kotlinx.serialization.json.JsonElement r5 = (kotlinx.serialization.json.JsonElement) r5     // Catch: java.lang.Throwable -> L1c1a
            if (r5 == 0) goto L1ba8
            kotlinx.serialization.json.JsonArray r5 = kotlinx.serialization.json.JsonElementKt.getJsonArray(r5)     // Catch: java.lang.Throwable -> L1b5a
            if (r5 != 0) goto L1bb1
            goto L1ba8
        L1ba5:
            r5 = r10
            goto L21b7
        L1ba8:
            kotlinx.serialization.json.JsonArray r5 = new kotlinx.serialization.json.JsonArray     // Catch: java.lang.Throwable -> L1c1a
            java.util.List r6 = kotlin.collections.CollectionsKt.EZpvd()     // Catch: java.lang.Throwable -> L1c1a
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L1c1a
        L1bb1:
            kotlinx.serialization.json.Json r6 = r3.gEmmrt     // Catch: java.lang.Throwable -> L1c1a
            kotlinx.serialization.json.JsonObjectBuilder r7 = new kotlinx.serialization.json.JsonObjectBuilder     // Catch: java.lang.Throwable -> L1c1a
            r7.<init>()     // Catch: java.lang.Throwable -> L1c1a
            java.lang.String r8 = "array"
            r7.put(r8, r5)     // Catch: java.lang.Throwable -> L1c1a
            kotlinx.serialization.json.JsonObject r5 = r7.build()     // Catch: java.lang.Throwable -> L1c1a
            r6.getSerializersModule()     // Catch: java.lang.Throwable -> L1c1a
            kotlinx.serialization.json.JsonObject$Companion r7 = kotlinx.serialization.json.JsonObject.Companion     // Catch: java.lang.Throwable -> L1c1a
            kotlinx.serialization.KSerializer r7 = r7.serializer()     // Catch: java.lang.Throwable -> L1c1a
            java.lang.String r9 = r6.encodeToString(r7, r5)     // Catch: java.lang.Throwable -> L1c1a
            o.ebF r5 = r3.djBIcL     // Catch: java.lang.Throwable -> L1c1a
            java.lang.String r6 = r11.getWalletId()     // Catch: java.lang.Throwable -> L1c1a
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = r11.getDAppInfo()     // Catch: java.lang.Throwable -> L1c1a
            java.lang.String r8 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L1c1a
            if (r8 != 0) goto L1be0
            r8 = r16
        L1be0:
            r4.L$0 = r1     // Catch: java.lang.Throwable -> L1c1a
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L1c1a
            r4.L$2 = r11     // Catch: java.lang.Throwable -> L1c1a
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L1c1a
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L1c1a
            r4.L$5 = r13     // Catch: java.lang.Throwable -> L1c1a
            r12 = r27
            r4.L$6 = r12     // Catch: java.lang.Throwable -> L1c1a
            r25 = r10
            r10 = 18
            r4.label = r10     // Catch: java.lang.Throwable -> L1c16
            r10 = 0
            r54 = r25
            r70 = r11
            r11 = r14
            r55 = r12
            r12 = r4
            java.lang.Object r5 = r5.AEQbTJ(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L1ccd
            if (r5 != r15) goto L1c06
            return r15
        L1c06:
            r11 = r70
            r6 = r2
            r7 = r3
            r3 = r5
            r5 = r13
            r13 = r14
            r2 = r55
            r14 = r1
        L1c10:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L1ccd
            goto L1cbe
        L1c16:
            r0 = move-exception
            r54 = r25
            goto L1c1d
        L1c1a:
            r0 = move-exception
            r54 = r10
        L1c1d:
            r1 = r0
            goto L1cd0
        L1c20:
            r58 = r10
            r12 = r11
            goto L1b69
        L1c25:
            r55 = r5
            r13 = r6
            r1 = r7
            r54 = r8
            r26 = r9
            r19 = r10
            r70 = r11
            java.lang.String r5 = "ton_sendTransaction"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L1ccd
            if (r5 != 0) goto L1c46
            r17 = r70
            r70 = r2
            r2 = r13
            r13 = r19
            r60 = r54
            r27 = r55
            goto L1aaa
        L1c46:
            o.ebF r5 = r3.djBIcL     // Catch: java.lang.Throwable -> L1ccd
            java.lang.String r6 = r70.getWalletId()     // Catch: java.lang.Throwable -> L1ccd
            java.lang.String r7 = r2.getMethod()     // Catch: java.lang.Throwable -> L1ccd
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppWrapper$DAppInteractionWrapper r8 = new com.okinc.business.defi.wallet.common.okxconnect.model.DAppWrapper$DAppInteractionWrapper     // Catch: java.lang.Throwable -> L1ccd
            kotlinx.serialization.json.JsonObject r9 = r2.getParams()     // Catch: java.lang.Throwable -> L1ccd
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ccd
            r10.<init>()     // Catch: java.lang.Throwable -> L1ccd
            java.lang.String r11 = "{\"params\": [ "
            r10.append(r11)     // Catch: java.lang.Throwable -> L1ccd
            r10.append(r9)     // Catch: java.lang.Throwable -> L1ccd
            java.lang.String r9 = " ] }"
            r10.append(r9)     // Catch: java.lang.Throwable -> L1ccd
            java.lang.String r33 = r10.toString()     // Catch: java.lang.Throwable -> L1ccd
            java.lang.String r29 = "607"
            r30 = 0
            r31 = 0
            r32 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 1006(0x3ee, float:1.41E-42)
            r40 = 0
            r28 = r8
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch: java.lang.Throwable -> L1ccd
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r9 = r70.getDAppInfo()     // Catch: java.lang.Throwable -> L1ccd
            r4.L$0 = r1     // Catch: java.lang.Throwable -> L1ccd
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L1ccd
            r12 = r70
            r4.L$2 = r12     // Catch: java.lang.Throwable -> L1ccd
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L1ccd
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L1ccd
            r4.L$5 = r13     // Catch: java.lang.Throwable -> L1ccd
            r11 = r55
            r4.L$6 = r11     // Catch: java.lang.Throwable -> L1ccd
            r10 = 8
            r4.label = r10     // Catch: java.lang.Throwable -> L1ccd
            java.lang.String r10 = "okx_connect"
            r56 = r11
            r11 = r14
            r70 = r12
            r12 = r4
            java.lang.Object r5 = r5.OLrzqt(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L1ccd
            if (r5 != r15) goto L1cb0
            return r15
        L1cb0:
            r11 = r70
            r6 = r2
            r7 = r3
            r3 = r5
            r5 = r13
            r13 = r14
            r2 = r56
            r14 = r1
        L1cba:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L1ccd
        L1cbe:
            r3 = r7
            r7 = r14
            r58 = r54
        L1cc2:
            r14 = r13
            r68 = r11
            r11 = r1
            r1 = r2
            r2 = r6
            r6 = r5
            r5 = r68
            goto L1dc9
        L1ccd:
            r0 = move-exception
            goto L1c1d
        L1cd0:
            r5 = r54
            goto L21b7
        L1cd4:
            r56 = r5
            r13 = r6
            r1 = r7
            r54 = r8
            r26 = r9
            r19 = r10
            r70 = r11
            java.lang.String r5 = "aptos_signTransaction"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L1d58
            if (r5 != 0) goto L1cf5
            r17 = r70
            r70 = r2
            r2 = r13
            r13 = r19
            r60 = r54
            r27 = r56
            goto L1aaa
        L1cf5:
            java.lang.String r5 = "Start onAptosSignTransaction"
            r12 = r54
            o.pUU.KWHzl(r12, r5)     // Catch: java.lang.Throwable -> L1d54
            kotlinx.serialization.json.JsonObject r9 = r2.getParams()     // Catch: java.lang.Throwable -> L1d54
            if (r9 == 0) goto L1d4c
            o.ebF r5 = r3.djBIcL     // Catch: java.lang.Throwable -> L1d54
            java.lang.String r6 = r70.getWalletId()     // Catch: java.lang.Throwable -> L1d54
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = r70.getDAppInfo()     // Catch: java.lang.Throwable -> L1d54
            java.lang.String r8 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L1d54
            if (r8 != 0) goto L1d14
            r8 = r16
        L1d14:
            r4.L$0 = r1     // Catch: java.lang.Throwable -> L1d54
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L1d54
            r11 = r70
            r4.L$2 = r11     // Catch: java.lang.Throwable -> L1d54
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L1d54
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L1d54
            r4.L$5 = r13     // Catch: java.lang.Throwable -> L1d54
            r10 = r56
            r4.L$6 = r10     // Catch: java.lang.Throwable -> L1d54
            r27 = r10
            r10 = 38
            r4.label = r10     // Catch: java.lang.Throwable -> L1d54
            r10 = 0
            r57 = r27
            r70 = r11
            r11 = r14
            r58 = r12
            r12 = r4
            java.lang.Object r5 = r5.KWHzl(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L1dd7
            if (r5 != r15) goto L1d3c
            return r15
        L1d3c:
            r11 = r70
            r6 = r2
            r7 = r3
            r3 = r5
            r5 = r13
            r13 = r14
            r2 = r57
            r14 = r1
        L1d46:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L1dd7
            goto L1dc5
        L1d4c:
            r58 = r12
            r12 = r70
            r59 = r56
            goto L1ddd
        L1d54:
            r0 = move-exception
            r58 = r12
            goto L1d5b
        L1d58:
            r0 = move-exception
            r58 = r54
        L1d5b:
            r1 = r0
            goto L1dec
        L1d5e:
            r57 = r5
            r13 = r6
            r1 = r7
            r58 = r8
            r26 = r9
            r19 = r10
            r70 = r11
            java.lang.String r5 = "starknet_signMessage"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L1dd7
            if (r5 != 0) goto L1d7f
            r17 = r70
            r70 = r2
            r2 = r13
            r13 = r19
            r27 = r57
            r60 = r58
            goto L1aaa
        L1d7f:
            kotlinx.serialization.json.JsonObject r9 = r2.getParams()     // Catch: java.lang.Throwable -> L1dd7
            if (r9 == 0) goto L1dd9
            o.ebF r5 = r3.djBIcL     // Catch: java.lang.Throwable -> L1dd7
            java.lang.String r6 = r70.getWalletId()     // Catch: java.lang.Throwable -> L1dd7
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = r70.getDAppInfo()     // Catch: java.lang.Throwable -> L1dd7
            java.lang.String r8 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L1dd7
            if (r8 != 0) goto L1d97
            r8 = r16
        L1d97:
            r4.L$0 = r1     // Catch: java.lang.Throwable -> L1dd7
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L1dd7
            r12 = r70
            r4.L$2 = r12     // Catch: java.lang.Throwable -> L1dd7
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L1dd7
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L1dd7
            r4.L$5 = r13     // Catch: java.lang.Throwable -> L1dd7
            r11 = r57
            r4.L$6 = r11     // Catch: java.lang.Throwable -> L1dd7
            r10 = 36
            r4.label = r10     // Catch: java.lang.Throwable -> L1dd7
            r10 = r14
            r59 = r11
            r11 = r4
            java.lang.Object r5 = r5.EZpvd(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1dd7
            if (r5 != r15) goto L1db8
            return r15
        L1db8:
            r6 = r2
            r7 = r3
            r3 = r5
            r11 = r12
            r5 = r13
            r13 = r14
            r2 = r59
            r14 = r1
        L1dc1:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L1dd7
        L1dc5:
            r3 = r7
        L1dc6:
            r7 = r14
            goto L1cc2
        L1dc9:
            r17 = r5
            r13 = r19
            r60 = r58
            r68 = r14
            r14 = r1
        L1dd2:
            r1 = r15
            r15 = r68
            goto L1f5e
        L1dd7:
            r0 = move-exception
            goto L1d5b
        L1dd9:
            r12 = r70
            r59 = r57
        L1ddd:
            r7 = r1
            r17 = r12
            r6 = r13
            r1 = r15
            r13 = r19
            r60 = r58
            r11 = 0
            r15 = r14
            r14 = r59
            goto L1f5e
        L1dec:
            r5 = r58
            goto L21b7
        L1df0:
            r59 = r5
            r13 = r6
            r1 = r7
            r58 = r8
            r26 = r9
            r19 = r10
            java.lang.String r5 = "eth_sendTransaction"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L1e8a
            if (r5 != 0) goto L1e0f
            r70 = r2
            r17 = r11
            r2 = r13
            r13 = r19
            r60 = r58
            r27 = r59
            goto L1aaa
        L1e0f:
            kotlinx.serialization.json.JsonObject r9 = r2.getParams()     // Catch: java.lang.Throwable -> L1e8a
            if (r9 == 0) goto L1e90
            java.lang.String r5 = "Start onEthSendTransaction"
            r12 = r58
            o.pUU.KWHzl(r12, r5)     // Catch: java.lang.Throwable -> L1e86
            o.ebF r5 = r3.djBIcL     // Catch: java.lang.Throwable -> L1e86
            java.lang.String r6 = r11.getWalletId()     // Catch: java.lang.Throwable -> L1e86
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = r11.getDAppInfo()     // Catch: java.lang.Throwable -> L1e86
            java.lang.String r8 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L1e86
            if (r8 != 0) goto L1e2e
            r8 = r16
        L1e2e:
            r4.L$0 = r1     // Catch: java.lang.Throwable -> L1e86
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L1e86
            r4.L$2 = r11     // Catch: java.lang.Throwable -> L1e86
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L1e86
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L1e86
            r4.L$5 = r13     // Catch: java.lang.Throwable -> L1e86
            r10 = r59
            r4.L$6 = r10     // Catch: java.lang.Throwable -> L1e86
            r27 = r10
            r10 = 14
            r4.label = r10     // Catch: java.lang.Throwable -> L1e86
            r18 = 0
            r20 = 0
            r21 = 96
            r22 = 0
            r23 = r27
            r10 = r14
            r70 = r11
            r11 = r18
            r60 = r12
            r12 = r20
            r61 = r13
            r63 = r19
            r62 = r23
            r13 = r4
            r64 = r14
            r14 = r21
            r17 = r1
            r1 = r15
            r15 = r22
            java.lang.Object r5 = o.C15974ebF.m8585onEthSendTransactioneH_QyT8$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L1e84
            if (r5 != r1) goto L1e6e
            return r1
        L1e6e:
            r11 = r70
            r6 = r2
            r7 = r3
            r3 = r5
            r14 = r17
            r5 = r61
            r2 = r62
            r13 = r64
        L1e7b:
            kotlin.Result r3 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L1e84
            r15 = r13
            r13 = r63
            goto L1f30
        L1e84:
            r0 = move-exception
            goto L1e8d
        L1e86:
            r0 = move-exception
            r60 = r12
            goto L1e8d
        L1e8a:
            r0 = move-exception
            r60 = r58
        L1e8d:
            r1 = r0
            goto L1f41
        L1e90:
            r17 = r1
            r1 = r15
            r60 = r58
            r70 = r2
            r2 = r13
            r15 = r14
            r14 = r17
            r13 = r19
            r27 = r59
            r17 = r11
            goto L1f57
        L1ea3:
            r62 = r5
            r61 = r6
            r17 = r7
            r60 = r8
            r26 = r9
            r63 = r10
            r70 = r11
            r64 = r14
            r1 = r15
            java.lang.String r5 = "tron_signMessageV2"
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L1f54
            if (r5 != 0) goto L1ebe
            goto L1f45
        L1ebe:
            kotlinx.serialization.json.JsonObject r5 = r2.getParams()     // Catch: java.lang.Throwable -> L1f54
            if (r5 == 0) goto L1f45
            o.ebF r6 = r3.djBIcL     // Catch: java.lang.Throwable -> L1e84
            java.lang.String r7 = r70.getWalletId()     // Catch: java.lang.Throwable -> L1e84
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r8 = r70.getDAppInfo()     // Catch: java.lang.Throwable -> L1e84
            java.lang.String r9 = r2.getCaipChainId()     // Catch: java.lang.Throwable -> L1e84
            if (r9 != 0) goto L1ed6
            r9 = r16
        L1ed6:
            r13 = r63
            java.lang.Object r5 = r5.get(r13)     // Catch: java.lang.Throwable -> L1e84
            kotlinx.serialization.json.JsonElement r5 = (kotlinx.serialization.json.JsonElement) r5     // Catch: java.lang.Throwable -> L1e84
            if (r5 == 0) goto L1eeb
            kotlinx.serialization.json.JsonPrimitive r5 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(r5)     // Catch: java.lang.Throwable -> L1e84
            if (r5 == 0) goto L1eeb
            java.lang.String r11 = r5.getContent()     // Catch: java.lang.Throwable -> L1e84
            goto L1eec
        L1eeb:
            r11 = 0
        L1eec:
            if (r11 != 0) goto L1ef0
            r11 = r16
        L1ef0:
            com.okinc.business.defi.api.bean.TronSignMethodVersion r10 = com.okinc.business.defi.api.bean.TronSignMethodVersion.V2     // Catch: java.lang.Throwable -> L1e84
            r14 = r17
            r4.L$0 = r14     // Catch: java.lang.Throwable -> L1e84
            r15 = r64
            r4.L$1 = r15     // Catch: java.lang.Throwable -> L1e84
            r12 = r70
            r4.L$2 = r12     // Catch: java.lang.Throwable -> L1e84
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L1e84
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L1e84
            r5 = r61
            r4.L$5 = r5     // Catch: java.lang.Throwable -> L1e84
            r70 = r2
            r2 = r62
            r4.L$6 = r2     // Catch: java.lang.Throwable -> L1e84
            r27 = r2
            r2 = 33
            r4.label = r2     // Catch: java.lang.Throwable -> L1e84
            r2 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r11
            r11 = r15
            r17 = r12
            r12 = r4
            java.lang.Object r5 = r5.OLrzqt(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L1e84
            if (r5 != r1) goto L1f23
            return r1
        L1f23:
            r6 = r70
            r7 = r3
            r3 = r5
            r11 = r17
            r5 = r2
            r2 = r27
        L1f2c:
            kotlin.Result r3 = kotlin.Result.m7376boximpl(r3)     // Catch: java.lang.Throwable -> L1e84
        L1f30:
            r68 = r3
            r3 = r2
            r2 = r6
            r6 = r5
            r5 = r11
            r11 = r68
            r17 = r5
            r68 = r14
            r14 = r3
            r3 = r7
            r7 = r68
            goto L1f5e
        L1f41:
            r5 = r60
            goto L21b7
        L1f45:
            r14 = r17
            r27 = r62
            r13 = r63
            r15 = r64
            r17 = r70
            r70 = r2
            r2 = r61
            goto L1f57
        L1f54:
            r0 = move-exception
            goto L1e8d
        L1f57:
            r6 = r2
            r7 = r14
            r14 = r27
            r11 = 0
            r2 = r70
        L1f5e:
            if (r11 == 0) goto L1f97
            java.lang.Object r11 = r11.m7386unboximpl()     // Catch: java.lang.Throwable -> L1f92
            java.lang.Throwable r5 = kotlin.Result.m7380exceptionOrNullimpl(r11)     // Catch: java.lang.Throwable -> L1f92
            if (r5 == 0) goto L1f87
            java.lang.String r8 = r5.getMessage()     // Catch: java.lang.Throwable -> L1f92
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f92
            r9.<init>()     // Catch: java.lang.Throwable -> L1f92
            java.lang.String r10 = "Failed to handle the request - "
            r9.append(r10)     // Catch: java.lang.Throwable -> L1f92
            r9.append(r8)     // Catch: java.lang.Throwable -> L1f92
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Throwable -> L1f92
            r12 = r60
            o.pUU.AEQbTJ(r12, r8, r5)     // Catch: java.lang.Throwable -> L1f90
            r6.element = r5     // Catch: java.lang.Throwable -> L1f90
            goto L1f89
        L1f87:
            r12 = r60
        L1f89:
            boolean r5 = kotlin.Result.m7383isFailureimpl(r11)     // Catch: java.lang.Throwable -> L1f90
            if (r5 == 0) goto L1f9a
            goto L1f99
        L1f90:
            r0 = move-exception
            goto L1f95
        L1f92:
            r0 = move-exception
            r12 = r60
        L1f95:
            r1 = r0
            goto L1fea
        L1f97:
            r12 = r60
        L1f99:
            r11 = 0
        L1f9a:
            kotlin.jvm.internal.Ref$BooleanRef r10 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch: java.lang.Throwable -> L21ab
            r10.<init>()     // Catch: java.lang.Throwable -> L21ab
            boolean r5 = r11 instanceof java.lang.String     // Catch: java.lang.Throwable -> L21ab
            if (r5 == 0) goto L1fb3
            r5 = r11
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: java.lang.Throwable -> L1f90
            boolean r5 = o.C33129mqd.OLrzqt(r5)     // Catch: java.lang.Throwable -> L1f90
            r10.element = r5     // Catch: java.lang.Throwable -> L1f90
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L1f90
            kotlinx.serialization.json.JsonPrimitive r5 = kotlinx.serialization.json.JsonElementKt.JsonPrimitive(r11)     // Catch: java.lang.Throwable -> L1f90
            goto L1fc2
        L1fb3:
            boolean r5 = r11 instanceof kotlinx.serialization.json.JsonElement     // Catch: java.lang.Throwable -> L21ab
            if (r5 == 0) goto L1fbe
            r5 = 1
            r10.element = r5     // Catch: java.lang.Throwable -> L1f90
            r5 = r11
            kotlinx.serialization.json.JsonElement r5 = (kotlinx.serialization.json.JsonElement) r5     // Catch: java.lang.Throwable -> L1f90
            goto L1fc2
        L1fbe:
            kotlinx.serialization.json.JsonPrimitive r5 = kotlinx.serialization.json.JsonElementKt.JsonPrimitive(r16)     // Catch: java.lang.Throwable -> L21ab
        L1fc2:
            boolean r8 = r10.element     // Catch: java.lang.Throwable -> L21ab
            if (r8 == 0) goto L1fed
            kotlinx.serialization.json.Json r6 = r3.gEmmrt     // Catch: java.lang.Throwable -> L1f90
            com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletResponse$Success r8 = new com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletResponse$Success     // Catch: java.lang.Throwable -> L1f90
            java.lang.String r9 = r2.getRequestId()     // Catch: java.lang.Throwable -> L1f90
            java.lang.String r11 = r2.getMethod()     // Catch: java.lang.Throwable -> L1f90
            r8.<init>(r9, r11, r5)     // Catch: java.lang.Throwable -> L1f90
            r6.getSerializersModule()     // Catch: java.lang.Throwable -> L1f90
            com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletResponse$Success$Companion r5 = com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletResponse.Success.Companion     // Catch: java.lang.Throwable -> L1f90
            kotlinx.serialization.KSerializer r5 = r5.serializer()     // Catch: java.lang.Throwable -> L1f90
            java.lang.String r5 = r6.encodeToString(r5, r8)     // Catch: java.lang.Throwable -> L1f90
            r18 = r1
            r70 = r10
            r25 = r12
            r10 = 0
            goto L2031
        L1fea:
            r5 = r12
            goto L21b7
        L1fed:
            kotlinx.serialization.json.Json r5 = r3.gEmmrt     // Catch: java.lang.Throwable -> L21ab
            com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletResponse$Error r8 = new com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletResponse$Error     // Catch: java.lang.Throwable -> L21ab
            java.lang.String r9 = r2.getRequestId()     // Catch: java.lang.Throwable -> L21ab
            java.lang.String r11 = r2.getMethod()     // Catch: java.lang.Throwable -> L21ab
            r25 = r12
            T r12 = r6.element     // Catch: java.lang.Throwable -> L21a6
            r18 = r1
            boolean r1 = r12 instanceof com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException     // Catch: java.lang.Throwable -> L21a6
            if (r1 == 0) goto L2007
            r1 = r12
            com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException r1 = (com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException) r1     // Catch: java.lang.Throwable -> L1388
            goto L2008
        L2007:
            r1 = 0
        L2008:
            if (r1 != 0) goto L201e
            T r1 = r6.element     // Catch: java.lang.Throwable -> L1388
            if (r1 == 0) goto L2011
            com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException$ErrorType r1 = com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException.ErrorType.UNKNOWN     // Catch: java.lang.Throwable -> L1388
            goto L2013
        L2011:
            com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException$ErrorType r1 = com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException.ErrorType.USER_REJECTED     // Catch: java.lang.Throwable -> L1388
        L2013:
            com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException r6 = new com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException     // Catch: java.lang.Throwable -> L1388
            r70 = r10
            r10 = 0
            r12 = 2
            r6.<init>(r1, r10, r12, r10)     // Catch: java.lang.Throwable -> L1388
            r1 = r6
            goto L2021
        L201e:
            r70 = r10
            r10 = 0
        L2021:
            r8.<init>(r9, r11, r1)     // Catch: java.lang.Throwable -> L21a6
            r5.getSerializersModule()     // Catch: java.lang.Throwable -> L21a6
            com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletResponse$Error$Companion r1 = com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletResponse.Error.Companion     // Catch: java.lang.Throwable -> L21a6
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch: java.lang.Throwable -> L21a6
            java.lang.String r5 = r5.encodeToString(r1, r8)     // Catch: java.lang.Throwable -> L21a6
        L2031:
            com.okinc.wallet.core.sign.ton.X25519KeyPair r1 = r17.getKeyPair()     // Catch: java.lang.Throwable -> L21a6
            java.lang.String r1 = r1.getPrvKey()     // Catch: java.lang.Throwable -> L21a6
            java.lang.String r6 = r17.getClientId()     // Catch: java.lang.Throwable -> L21a6
            java.lang.String r1 = r3.AEQbTJ(r5, r1, r6)     // Catch: java.lang.Throwable -> L21a6
            kotlinx.serialization.json.Json r5 = r3.gEmmrt     // Catch: java.lang.Throwable -> L21a6
            kotlinx.serialization.json.JsonObjectBuilder r6 = new kotlinx.serialization.json.JsonObjectBuilder     // Catch: java.lang.Throwable -> L21a6
            r6.<init>()     // Catch: java.lang.Throwable -> L21a6
            kotlinx.serialization.json.JsonElementBuildersKt.put(r6, r13, r1)     // Catch: java.lang.Throwable -> L21a6
            kotlinx.serialization.json.JsonObject r1 = r6.build()     // Catch: java.lang.Throwable -> L21a6
            r5.getSerializersModule()     // Catch: java.lang.Throwable -> L21a6
            kotlinx.serialization.json.JsonObject$Companion r6 = kotlinx.serialization.json.JsonObject.Companion     // Catch: java.lang.Throwable -> L21a6
            kotlinx.serialization.KSerializer r6 = r6.serializer()     // Catch: java.lang.Throwable -> L21a6
            java.lang.String r1 = r5.encodeToString(r6, r1)     // Catch: java.lang.Throwable -> L21a6
            o.ebf r5 = r3.fetchVPNInfo     // Catch: java.lang.Throwable -> L21a6
            java.lang.String r6 = r7.getTopic()     // Catch: java.lang.Throwable -> L21a6
            boolean r11 = r17.isSupportSplitData()     // Catch: java.lang.Throwable -> L21a6
            r4.L$0 = r15     // Catch: java.lang.Throwable -> L21a6
            r4.L$1 = r3     // Catch: java.lang.Throwable -> L21a6
            r4.L$2 = r2     // Catch: java.lang.Throwable -> L21a6
            r4.L$3 = r14     // Catch: java.lang.Throwable -> L21a6
            r12 = r70
            r4.L$4 = r12     // Catch: java.lang.Throwable -> L21a6
            r4.L$5 = r10     // Catch: java.lang.Throwable -> L21a6
            r4.L$6 = r10     // Catch: java.lang.Throwable -> L21a6
            r7 = 43
            r4.label = r7     // Catch: java.lang.Throwable -> L21a6
            r8 = 0
            r9 = 0
            r13 = 4
            r17 = 0
            r7 = r1
            r1 = r12
            r12 = r10
            r10 = r11
            r11 = r4
            r65 = r25
            r12 = r13
            r13 = r17
            java.lang.Object r5 = o.C16000ebf.m8597publishhUnOzRk$default(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L21a1
            r13 = r18
            if (r5 != r13) goto L2092
            return r13
        L2092:
            r68 = r3
            r3 = r2
            r2 = r5
            r5 = r14
            r14 = r68
        L2099:
            boolean r6 = kotlin.Result.m7384isSuccessimpl(r2)     // Catch: java.lang.Throwable -> L21a1
            if (r6 == 0) goto L214b
            r6 = r2
            kotlin.Unit r6 = (kotlin.Unit) r6     // Catch: java.lang.Throwable -> L2147
            java.lang.String r6 = r3.getMethod()     // Catch: java.lang.Throwable -> L2147
            boolean r1 = r1.element     // Catch: java.lang.Throwable -> L2147
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2147
            r7.<init>()     // Catch: java.lang.Throwable -> L2147
            java.lang.String r8 = "Informed request "
            r7.append(r8)     // Catch: java.lang.Throwable -> L2147
            r7.append(r15)     // Catch: java.lang.Throwable -> L2147
            r12 = r26
            r7.append(r12)     // Catch: java.lang.Throwable -> L2147
            r7.append(r6)     // Catch: java.lang.Throwable -> L2147
            java.lang.String r6 = ", isSuccess - "
            r7.append(r6)     // Catch: java.lang.Throwable -> L2147
            r7.append(r1)     // Catch: java.lang.Throwable -> L2147
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> L2147
            r11 = r65
            o.pUU.KWHzl(r11, r1)     // Catch: java.lang.Throwable -> L2143
            boolean r1 = r5.element     // Catch: java.lang.Throwable -> L2143
            if (r1 == 0) goto L210a
            o.xhq r1 = o.C55328xhq.OLrzqt     // Catch: java.lang.Throwable -> L2143
            boolean r1 = r1.EZpvd()     // Catch: java.lang.Throwable -> L2143
            if (r1 != 0) goto L210a
            o.ebF r5 = r14.djBIcL     // Catch: java.lang.Throwable -> L2143
            int r6 = o.C13754dXa.FragmentManager.ComponentActivityReportFullyDrawnExecutorApi16ImplExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L2143
            r4.L$0 = r15     // Catch: java.lang.Throwable -> L2143
            r4.L$1 = r14     // Catch: java.lang.Throwable -> L2143
            r4.L$2 = r3     // Catch: java.lang.Throwable -> L2143
            r4.L$3 = r2     // Catch: java.lang.Throwable -> L2143
            r1 = 0
            r4.L$4 = r1     // Catch: java.lang.Throwable -> L2143
            r7 = 44
            r4.label = r7     // Catch: java.lang.Throwable -> L2143
            r7 = 0
            r8 = 0
            r9 = 0
            r17 = 14
            r18 = 0
            r10 = r4
            r66 = r11
            r11 = r17
            r67 = r12
            r12 = r18
            java.lang.Object r5 = o.C15974ebF.displayToast$default(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L213d
            if (r5 != r13) goto L2104
            return r13
        L2104:
            r5 = r3
            r6 = r14
            r7 = r15
        L2107:
            r14 = r6
            r6 = r7
            goto L2111
        L210a:
            r66 = r11
            r67 = r12
            r1 = 0
            r5 = r3
            r6 = r15
        L2111:
            java.lang.String r3 = r5.getRedirect()     // Catch: java.lang.Throwable -> L213d
            boolean r3 = o.C33129mqd.OLrzqt(r3)     // Catch: java.lang.Throwable -> L213d
            if (r3 == 0) goto L213a
            o.ebs r3 = r14.OLrzqt     // Catch: java.lang.Throwable -> L213d
            java.lang.String r7 = r5.getRedirect()     // Catch: java.lang.Throwable -> L213d
            if (r7 != 0) goto L2125
            r7 = r16
        L2125:
            r4.L$0 = r6     // Catch: java.lang.Throwable -> L213d
            r4.L$1 = r5     // Catch: java.lang.Throwable -> L213d
            r4.L$2 = r2     // Catch: java.lang.Throwable -> L213d
            r4.L$3 = r1     // Catch: java.lang.Throwable -> L213d
            r4.L$4 = r1     // Catch: java.lang.Throwable -> L213d
            r8 = 45
            r4.label = r8     // Catch: java.lang.Throwable -> L213d
            java.lang.Object r3 = r3.OLrzqt(r7, r4)     // Catch: java.lang.Throwable -> L213d
            if (r3 != r13) goto L213a
            return r13
        L213a:
            r3 = r5
            r15 = r6
            goto L2150
        L213d:
            r0 = move-exception
        L213e:
            r1 = r0
            r5 = r66
            goto L21b7
        L2143:
            r0 = move-exception
            r66 = r11
            goto L213e
        L2147:
            r0 = move-exception
            r66 = r65
            goto L213e
        L214b:
            r67 = r26
            r66 = r65
            r1 = 0
        L2150:
            java.lang.Throwable r2 = kotlin.Result.m7380exceptionOrNullimpl(r2)     // Catch: java.lang.Throwable -> L219c
            if (r2 == 0) goto L2179
            java.lang.String r3 = r3.getMethod()     // Catch: java.lang.Throwable -> L219c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L219c
            r5.<init>()     // Catch: java.lang.Throwable -> L219c
            java.lang.String r6 = "Failed to inform request "
            r5.append(r6)     // Catch: java.lang.Throwable -> L219c
            r5.append(r15)     // Catch: java.lang.Throwable -> L219c
            r6 = r67
            r5.append(r6)     // Catch: java.lang.Throwable -> L219c
            r5.append(r3)     // Catch: java.lang.Throwable -> L219c
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L219c
            r5 = r66
            o.pUU.AEQbTJ(r5, r3, r2)     // Catch: java.lang.Throwable -> L2199
            goto L217b
        L2179:
            r5 = r66
        L217b:
            r4.L$0 = r1     // Catch: java.lang.Throwable -> L2199
            r4.L$1 = r1     // Catch: java.lang.Throwable -> L2199
            r4.L$2 = r1     // Catch: java.lang.Throwable -> L2199
            r4.L$3 = r1     // Catch: java.lang.Throwable -> L2199
            r4.L$4 = r1     // Catch: java.lang.Throwable -> L2199
            r1 = 46
            r4.label = r1     // Catch: java.lang.Throwable -> L2199
            r1 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r1, r4)     // Catch: java.lang.Throwable -> L2199
            if (r1 != r13) goto L2192
            return r13
        L2192:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2199
            java.lang.Object r1 = kotlin.Result.m7377constructorimpl(r1)     // Catch: java.lang.Throwable -> L2199
            goto L21c1
        L2199:
            r0 = move-exception
            goto L140f
        L219c:
            r0 = move-exception
            r5 = r66
            goto L140f
        L21a1:
            r0 = move-exception
            r5 = r65
            goto L140f
        L21a6:
            r0 = move-exception
            r5 = r25
            goto L140f
        L21ab:
            r0 = move-exception
            r5 = r12
            goto L140f
        L21af:
            r5 = r8
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2199
            return r1
        L21b3:
            r0 = move-exception
            r5 = r8
            goto L140f
        L21b7:
            kotlin.Result$Application r2 = kotlin.Result.Companion
            java.lang.Object r1 = o.C56391yDq.EZpvd(r1)
            java.lang.Object r1 = kotlin.Result.m7377constructorimpl(r1)
        L21c1:
            java.lang.Throwable r2 = kotlin.Result.m7380exceptionOrNullimpl(r1)
            if (r2 == 0) goto L21df
            java.lang.String r3 = r2.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Error handling event - "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            o.pUU.AEQbTJ(r5, r3, r2)
        L21df:
            kotlin.Result.m7376boximpl(r1)
            goto L21eb
        L21e3:
            r5 = r8
            java.lang.String r1 = "Session could not be found"
            o.pUU.copydefault(r5, r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L21eb:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C15935eaT.copydefault(com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Job AYXKKw() {
        return BuildersKt__Builders_commonKt.launch$default(this.AYXKKw, null, null, new OKXConnectManager$removeExpiredSessions$1(this, null), 3, null);
    }

    public final boolean AEQbTJ(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        return this.OLrzqt.EZpvd(bundle);
    }

    public final java.util.List<C10854bwM> copydefault(@NotNull java.util.List<java.lang.String> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        return this.OLrzqt.OLrzqt(list, z);
    }

    public static /* synthetic */ java.util.List getWalletSupportedChainMetas$default(C15935eaT c15935eaT, DAppConnectRequest dAppConnectRequest, AbstractC12782ctV abstractC12782ctV, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dAppConnectRequest = null;
        }
        return c15935eaT.OLrzqt(dAppConnectRequest, abstractC12782ctV);
    }

    public final java.util.List<C10854bwM> OLrzqt(DAppConnectRequest dAppConnectRequest, @NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (dAppConnectRequest == null && (dAppConnectRequest = this.AEQbTJ) == null) {
            return yDY.AhwBna();
        }
        if (this.OLrzqt.OLrzqt(dAppConnectRequest, abstractC12782ctV)) {
            return this.OLrzqt.KWHzl(dAppConnectRequest, abstractC12782ctV);
        }
        return copydefault(dAppConnectRequest.getRequestedCaipChains(), dAppConnectRequest.getHasLegacyTonRequest());
    }

    public static /* synthetic */ java.lang.Object getConnectAndSignData$default(C15935eaT c15935eaT, DAppConnectRequest dAppConnectRequest, AbstractC12782ctV abstractC12782ctV, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dAppConnectRequest = null;
        }
        return c15935eaT.copydefault(dAppConnectRequest, abstractC12782ctV, (Continuation<? super C15937eaV>) continuation);
    }

    public final java.lang.Object copydefault(DAppConnectRequest dAppConnectRequest, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull Continuation<? super C15937eaV> continuation) {
        if (dAppConnectRequest == null && (dAppConnectRequest = this.AEQbTJ) == null) {
            return null;
        }
        return this.OLrzqt.EZpvd(dAppConnectRequest, abstractC12782ctV, continuation);
    }

    public final java.lang.Object copydefault(@NotNull C15937eaV c15937eaV, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull Continuation<? super WalletEvent> continuation) {
        DAppConnectRequest dAppConnectRequest = this.AEQbTJ;
        if (dAppConnectRequest == null) {
            return null;
        }
        return this.OLrzqt.KWHzl(abstractC12782ctV, dAppConnectRequest, c15937eaV, continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull WalletEvent walletEvent, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.valueOf, new OKXConnectManager$connectToDAppAndSign$2(this, walletEvent, abstractC12782ctV, null), continuation);
    }

    public static /* synthetic */ void cancelConnecting$default(C15935eaT c15935eaT, OKXConnectException.ErrorType errorType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            errorType = OKXConnectException.ErrorType.USER_REJECTED;
        }
        c15935eaT.KWHzl(errorType);
    }

    public final void KWHzl(@NotNull OKXConnectException.ErrorType errorType) {
        X25519KeyPair x25519KeyPairOLrzqt;
        Intrinsics.checkNotNullParameter(errorType, "");
        pUU.KWHzl("OKXConnectManager", "User cancelled connecting");
        DAppConnectRequest dAppConnectRequest = this.AEQbTJ;
        if (dAppConnectRequest == null || (x25519KeyPairOLrzqt = OLrzqt()) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.AYXKKw, null, null, new OKXConnectManager$cancelConnecting$1(dAppConnectRequest, errorType, this, x25519KeyPairOLrzqt, null), 3, null);
    }

    public static /* synthetic */ Job removeDAppSessions$default(C15935eaT c15935eaT, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c15935eaT.OLrzqt(str);
    }

    public final Job OLrzqt(java.lang.String str) {
        return BuildersKt__Builders_commonKt.launch$default(this.AYXKKw, null, null, new OKXConnectManager$removeDAppSessions$1(this, str, null), 3, null);
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull AbstractC12782ctV abstractC12782ctV, boolean z, @NotNull java.lang.String str2, @NotNull Continuation<? super ValidateCanConnectResult> continuation) {
        return BuildersKt.withContext(this.valueOf, new OKXConnectManager$validateConnectRequest$2(str, this, z, str2, abstractC12782ctV, null), continuation);
    }

    public final boolean EZpvd(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        DAppConnectRequest dAppConnectRequest = this.AEQbTJ;
        if (dAppConnectRequest != null) {
            return this.OLrzqt.OLrzqt(dAppConnectRequest, abstractC12782ctV);
        }
        return false;
    }

    public final java.lang.Object AEQbTJ(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.valueOf, new OKXConnectManager$connectToDApp$2(this, abstractC12782ctV, null), continuation);
    }

    public final java.lang.Object OLrzqt(java.lang.String str, Continuation<? super Unit> continuation) {
        java.lang.Object objOLrzqt;
        return (str == null || (objOLrzqt = this.OLrzqt.OLrzqt(str, continuation)) != C56442yFn.copydefault()) ? Unit.INSTANCE : objOLrzqt;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0167 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKXConnectManager$disconnectDApp$1 oKXConnectManager$disconnectDApp$1;
        java.lang.String str2;
        C15935eaT c15935eaT;
        java.lang.Object next;
        java.lang.String str3;
        java.lang.Object objM7386unboximpl;
        C15935eaT c15935eaT2;
        DAppSession dAppSession;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        java.lang.String clientId;
        if (continuation instanceof OKXConnectManager$disconnectDApp$1) {
            oKXConnectManager$disconnectDApp$1 = (OKXConnectManager$disconnectDApp$1) continuation;
            int i = oKXConnectManager$disconnectDApp$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKXConnectManager$disconnectDApp$1.label = i - Integer.MIN_VALUE;
            } else {
                oKXConnectManager$disconnectDApp$1 = new OKXConnectManager$disconnectDApp$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = oKXConnectManager$disconnectDApp$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKXConnectManager$disconnectDApp$1.label;
        int i3 = 3;
        java.lang.String str4 = null;
        byte b = 0;
        byte b2 = 0;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            C16011ebq c16011ebq = this.AkhnZx;
            oKXConnectManager$disconnectDApp$1.L$0 = this;
            str2 = str;
            oKXConnectManager$disconnectDApp$1.L$1 = str2;
            oKXConnectManager$disconnectDApp$1.label = 1;
            objOLrzqt = c16011ebq.OLrzqt(oKXConnectManager$disconnectDApp$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c15935eaT = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objOLrzqt);
                    return Unit.INSTANCE;
                }
                dAppSession = (DAppSession) oKXConnectManager$disconnectDApp$1.L$2;
                str3 = (java.lang.String) oKXConnectManager$disconnectDApp$1.L$1;
                c15935eaT2 = (C15935eaT) oKXConnectManager$disconnectDApp$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                objM7386unboximpl = ((Result) objOLrzqt).m7386unboximpl();
                if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    pUU.KWHzl("OKXConnectManager", "ClientId " + str3 + " disconnected");
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("OKXConnectManager", "ClientId " + str3 + " failed to disconnect", thM7380exceptionOrNullimpl);
                }
                clientId = dAppSession.getClientId();
                oKXConnectManager$disconnectDApp$1.L$0 = null;
                oKXConnectManager$disconnectDApp$1.L$1 = null;
                oKXConnectManager$disconnectDApp$1.L$2 = null;
                oKXConnectManager$disconnectDApp$1.label = 3;
                if (c15935eaT2.AhwBna(clientId, oKXConnectManager$disconnectDApp$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            str2 = (java.lang.String) oKXConnectManager$disconnectDApp$1.L$1;
            C15935eaT c15935eaT3 = (C15935eaT) oKXConnectManager$disconnectDApp$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            c15935eaT = c15935eaT3;
        }
        java.lang.String str5 = str2;
        java.util.Iterator it = C56403yEb.QOLQEE(((java.util.Map) objOLrzqt).values()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) ((DAppSession) next).getClientId())) {
                break;
            }
        }
        DAppSession dAppSession2 = (DAppSession) next;
        if (dAppSession2 != null) {
            Json json = c15935eaT.gEmmrt;
            WalletEvent.Disconnect disconnect = new WalletEvent.Disconnect(str4, (java.lang.String) (b2 == true ? 1 : 0), i3, (DefaultConstructorMarker) (b == true ? 1 : 0));
            json.getSerializersModule();
            java.lang.String strAEQbTJ = c15935eaT.AEQbTJ(json.encodeToString(WalletEvent.Disconnect.Companion.serializer(), disconnect), dAppSession2.getKeyPair().getPrvKey(), dAppSession2.getClientId());
            Json json2 = c15935eaT.gEmmrt;
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder, "message", strAEQbTJ);
            JsonObject jsonObjectBuild = jsonObjectBuilder.build();
            json2.getSerializersModule();
            java.lang.String strEncodeToString = json2.encodeToString(JsonObject.Companion.serializer(), jsonObjectBuild);
            C16000ebf c16000ebf = c15935eaT.fetchVPNInfo;
            java.lang.String topic = dAppSession2.getTopic();
            oKXConnectManager$disconnectDApp$1.L$0 = c15935eaT;
            oKXConnectManager$disconnectDApp$1.L$1 = str5;
            oKXConnectManager$disconnectDApp$1.L$2 = dAppSession2;
            oKXConnectManager$disconnectDApp$1.label = 2;
            java.lang.Object objKWHzl = c16000ebf.KWHzl(topic, strEncodeToString, (28 & 4) != 0 ? false : true, (28 & 8) != 0, (28 & 16) != 0 ? false : false, oKXConnectManager$disconnectDApp$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            str3 = str5;
            objM7386unboximpl = objKWHzl;
            c15935eaT2 = c15935eaT;
            dAppSession = dAppSession2;
            if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            clientId = dAppSession.getClientId();
            oKXConnectManager$disconnectDApp$1.L$0 = null;
            oKXConnectManager$disconnectDApp$1.L$1 = null;
            oKXConnectManager$disconnectDApp$1.L$2 = null;
            oKXConnectManager$disconnectDApp$1.label = 3;
            if (c15935eaT2.AhwBna(clientId, oKXConnectManager$disconnectDApp$1) == objCopydefault) {
            }
        }
        return Unit.INSTANCE;
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<DAppSession>> continuation) {
        return BuildersKt.withContext(this.valueOf, new OKXConnectManager$getDAppSessionsByWalletId$2(this, str, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.lang.String str, DAppRequest dAppRequest, DAppSession dAppSession, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKXConnectManager$rejectRequestNotInWallet$1 oKXConnectManager$rejectRequestNotInWallet$1;
        DAppRequest dAppRequest2;
        DAppSession dAppSession2;
        C15935eaT c15935eaT;
        java.lang.String str2;
        java.lang.Object objKWHzl;
        DAppRequest dAppRequest3;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof OKXConnectManager$rejectRequestNotInWallet$1) {
            oKXConnectManager$rejectRequestNotInWallet$1 = (OKXConnectManager$rejectRequestNotInWallet$1) continuation;
            int i = oKXConnectManager$rejectRequestNotInWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKXConnectManager$rejectRequestNotInWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                oKXConnectManager$rejectRequestNotInWallet$1 = new OKXConnectManager$rejectRequestNotInWallet$1(this, continuation);
            }
        }
        java.lang.Object obj = oKXConnectManager$rejectRequestNotInWallet$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKXConnectManager$rejectRequestNotInWallet$1.label;
        int i3 = 2;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C15974ebF c15974ebF = this.djBIcL;
            int i4 = C13754dXa.FragmentManager.cancel;
            oKXConnectManager$rejectRequestNotInWallet$1.L$0 = this;
            oKXConnectManager$rejectRequestNotInWallet$1.L$1 = str;
            dAppRequest2 = dAppRequest;
            oKXConnectManager$rejectRequestNotInWallet$1.L$2 = dAppRequest2;
            dAppSession2 = dAppSession;
            oKXConnectManager$rejectRequestNotInWallet$1.L$3 = dAppSession2;
            oKXConnectManager$rejectRequestNotInWallet$1.label = 1;
            if (C15974ebF.displayToast$default(c15974ebF, i4, false, false, false, oKXConnectManager$rejectRequestNotInWallet$1, 14, null) == objCopydefault) {
                return objCopydefault;
            }
            c15935eaT = this;
            str2 = str;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dAppRequest3 = (DAppRequest) oKXConnectManager$rejectRequestNotInWallet$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                if (Result.m7384isSuccessimpl(objKWHzl)) {
                    pUU.KWHzl("OKXConnectManager", "rejectRequestNotInWallet succeeded " + dAppRequest3.getRequestId() + " of " + dAppRequest3.getMethod());
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("OKXConnectManager", "rejectRequestNotInWallet failed " + dAppRequest3.getRequestId() + " of " + dAppRequest3.getMethod(), thM7380exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
            DAppSession dAppSession3 = (DAppSession) oKXConnectManager$rejectRequestNotInWallet$1.L$3;
            DAppRequest dAppRequest4 = (DAppRequest) oKXConnectManager$rejectRequestNotInWallet$1.L$2;
            java.lang.String str3 = (java.lang.String) oKXConnectManager$rejectRequestNotInWallet$1.L$1;
            c15935eaT = (C15935eaT) oKXConnectManager$rejectRequestNotInWallet$1.L$0;
            C56391yDq.AEQbTJ(obj);
            dAppSession2 = dAppSession3;
            dAppRequest2 = dAppRequest4;
            str2 = str3;
        }
        Json json = c15935eaT.gEmmrt;
        WalletResponse.Error error = new WalletResponse.Error(dAppRequest2.getRequestId(), dAppRequest2.getMethod(), new OKXConnectException(OKXConnectException.ErrorType.NOT_IN_WALLET, (java.lang.String) null, i3, (DefaultConstructorMarker) (0 == true ? 1 : 0)));
        json.getSerializersModule();
        java.lang.String strAEQbTJ = c15935eaT.AEQbTJ(json.encodeToString(WalletResponse.Error.Companion.serializer(), error), dAppSession2.getKeyPair().getPrvKey(), dAppSession2.getClientId());
        Json json2 = c15935eaT.gEmmrt;
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, "message", strAEQbTJ);
        JsonObject jsonObjectBuild = jsonObjectBuilder.build();
        json2.getSerializersModule();
        java.lang.String strEncodeToString = json2.encodeToString(JsonObject.Companion.serializer(), jsonObjectBuild);
        C16000ebf c16000ebf = c15935eaT.fetchVPNInfo;
        oKXConnectManager$rejectRequestNotInWallet$1.L$0 = dAppRequest2;
        oKXConnectManager$rejectRequestNotInWallet$1.L$1 = null;
        oKXConnectManager$rejectRequestNotInWallet$1.L$2 = null;
        oKXConnectManager$rejectRequestNotInWallet$1.L$3 = null;
        oKXConnectManager$rejectRequestNotInWallet$1.label = 2;
        objKWHzl = c16000ebf.KWHzl(str2, strEncodeToString, (28 & 4) != 0 ? false : false, (28 & 8) != 0, (28 & 16) != 0 ? false : false, oKXConnectManager$rejectRequestNotInWallet$1);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        dAppRequest3 = dAppRequest2;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKXConnectManager$notifySessionConnecting$1 oKXConnectManager$notifySessionConnecting$1;
        java.lang.Object objM7386unboximpl;
        java.lang.String str2;
        if (continuation instanceof OKXConnectManager$notifySessionConnecting$1) {
            oKXConnectManager$notifySessionConnecting$1 = (OKXConnectManager$notifySessionConnecting$1) continuation;
            int i = oKXConnectManager$notifySessionConnecting$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKXConnectManager$notifySessionConnecting$1.label = i - Integer.MIN_VALUE;
            } else {
                oKXConnectManager$notifySessionConnecting$1 = new OKXConnectManager$notifySessionConnecting$1(this, continuation);
            }
        }
        OKXConnectManager$notifySessionConnecting$1 oKXConnectManager$notifySessionConnecting$12 = oKXConnectManager$notifySessionConnecting$1;
        java.lang.Object obj = oKXConnectManager$notifySessionConnecting$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKXConnectManager$notifySessionConnecting$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Json json = this.gEmmrt;
            WalletEvent.SessionConnecting sessionConnecting = new WalletEvent.SessionConnecting((java.lang.String) null, (java.lang.String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            json.getSerializersModule();
            java.lang.String strEncodeToString = json.encodeToString(WalletEvent.SessionConnecting.Companion.serializer(), sessionConnecting);
            Json json2 = this.gEmmrt;
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder, "message", strEncodeToString);
            JsonObject jsonObjectBuild = jsonObjectBuilder.build();
            json2.getSerializersModule();
            java.lang.String strEncodeToString2 = json2.encodeToString(JsonObject.Companion.serializer(), jsonObjectBuild);
            C16000ebf c16000ebf = this.fetchVPNInfo;
            oKXConnectManager$notifySessionConnecting$12.L$0 = strEncodeToString2;
            oKXConnectManager$notifySessionConnecting$12.label = 1;
            java.lang.Object objKWHzl = c16000ebf.KWHzl(str, strEncodeToString2, (28 & 4) != 0 ? false : false, (28 & 8) != 0, (28 & 16) != 0 ? false : false, oKXConnectManager$notifySessionConnecting$12);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            objM7386unboximpl = objKWHzl;
            str2 = strEncodeToString2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (java.lang.String) oKXConnectManager$notifySessionConnecting$12.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            pUU.KWHzl("OKXConnectManager", "notifySessionConnecting succeeded " + str2);
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("OKXConnectManager", "notifySessionConnecting failed " + str2, thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    public final X25519KeyPair OLrzqt() {
        return this.copydefault.OLrzqt();
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return ByteString.Companion.decodeHex(this.copydefault.KWHzl(str, str2, str3)).base64();
    }

    public final java.lang.String KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return this.copydefault.EZpvd(str, str2, str3);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ebf.subscribe-BWLJW6A$default(o.ebf, java.lang.String, boolean, boolean, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.lang.String str, DAppSession dAppSession, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKXConnectManager$addDAppSession$1 oKXConnectManager$addDAppSession$1;
        C15935eaT c15935eaT;
        if (continuation instanceof OKXConnectManager$addDAppSession$1) {
            oKXConnectManager$addDAppSession$1 = (OKXConnectManager$addDAppSession$1) continuation;
            int i = oKXConnectManager$addDAppSession$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKXConnectManager$addDAppSession$1.label = i - Integer.MIN_VALUE;
            } else {
                oKXConnectManager$addDAppSession$1 = new OKXConnectManager$addDAppSession$1(this, continuation);
            }
        }
        java.lang.Object obj = oKXConnectManager$addDAppSession$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKXConnectManager$addDAppSession$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C16000ebf c16000ebf = this.fetchVPNInfo;
            java.lang.String topic = dAppSession.getTopic();
            oKXConnectManager$addDAppSession$1.L$0 = this;
            oKXConnectManager$addDAppSession$1.L$1 = str;
            oKXConnectManager$addDAppSession$1.L$2 = dAppSession;
            oKXConnectManager$addDAppSession$1.label = 1;
            if (C16000ebf.m8598subscribeBWLJW6A$default(c16000ebf, topic, false, false, oKXConnectManager$addDAppSession$1, 6, null) == objCopydefault) {
                return objCopydefault;
            }
            c15935eaT = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            dAppSession = (DAppSession) oKXConnectManager$addDAppSession$1.L$2;
            str = (java.lang.String) oKXConnectManager$addDAppSession$1.L$1;
            c15935eaT = (C15935eaT) oKXConnectManager$addDAppSession$1.L$0;
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        c15935eaT.AkhnZx.OLrzqt(str, dAppSession);
        MutableSharedFlow<C16061ecn> mutableSharedFlow = c15935eaT.KWHzl;
        C16061ecn c16061ecn = new C16061ecn(dAppSession.getClientId(), true);
        oKXConnectManager$addDAppSession$1.L$0 = null;
        oKXConnectManager$addDAppSession$1.L$1 = null;
        oKXConnectManager$addDAppSession$1.L$2 = null;
        oKXConnectManager$addDAppSession$1.label = 2;
        if (mutableSharedFlow.emit(c16061ecn, oKXConnectManager$addDAppSession$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object gEmmrt(java.lang.String str, Continuation<? super DAppConnectRequest> continuation) throws java.lang.Throwable {
        OKXConnectManager$subscribeFetchAndGetSessionInfo$1 oKXConnectManager$subscribeFetchAndGetSessionInfo$1;
        C15935eaT c15935eaT;
        if (continuation instanceof OKXConnectManager$subscribeFetchAndGetSessionInfo$1) {
            oKXConnectManager$subscribeFetchAndGetSessionInfo$1 = (OKXConnectManager$subscribeFetchAndGetSessionInfo$1) continuation;
            int i = oKXConnectManager$subscribeFetchAndGetSessionInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKXConnectManager$subscribeFetchAndGetSessionInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                oKXConnectManager$subscribeFetchAndGetSessionInfo$1 = new OKXConnectManager$subscribeFetchAndGetSessionInfo$1(this, continuation);
            }
        }
        java.lang.Object objM7403withTimeoutOrNullKLykuaI = oKXConnectManager$subscribeFetchAndGetSessionInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKXConnectManager$subscribeFetchAndGetSessionInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objM7403withTimeoutOrNullKLykuaI);
            C16000ebf c16000ebf = this.fetchVPNInfo;
            oKXConnectManager$subscribeFetchAndGetSessionInfo$1.L$0 = this;
            oKXConnectManager$subscribeFetchAndGetSessionInfo$1.label = 1;
            if (c16000ebf.EZpvd(str, true, true, oKXConnectManager$subscribeFetchAndGetSessionInfo$1) == objCopydefault) {
                return objCopydefault;
            }
            c15935eaT = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    DAppConnectRequest dAppConnectRequest = (DAppConnectRequest) oKXConnectManager$subscribeFetchAndGetSessionInfo$1.L$0;
                    C56391yDq.AEQbTJ(objM7403withTimeoutOrNullKLykuaI);
                    return dAppConnectRequest;
                }
                c15935eaT = (C15935eaT) oKXConnectManager$subscribeFetchAndGetSessionInfo$1.L$0;
                C56391yDq.AEQbTJ(objM7403withTimeoutOrNullKLykuaI);
                DAppConnectRequest dAppConnectRequest2 = (DAppConnectRequest) objM7403withTimeoutOrNullKLykuaI;
                MutableSharedFlow<DAppConnectRequest> mutableSharedFlow = c15935eaT.ejfBZ;
                oKXConnectManager$subscribeFetchAndGetSessionInfo$1.L$0 = dAppConnectRequest2;
                oKXConnectManager$subscribeFetchAndGetSessionInfo$1.label = 3;
                return mutableSharedFlow.emit(null, oKXConnectManager$subscribeFetchAndGetSessionInfo$1) != objCopydefault ? objCopydefault : dAppConnectRequest2;
            }
            c15935eaT = (C15935eaT) oKXConnectManager$subscribeFetchAndGetSessionInfo$1.L$0;
            C56391yDq.AEQbTJ(objM7403withTimeoutOrNullKLykuaI);
            ((Result) objM7403withTimeoutOrNullKLykuaI).m7386unboximpl();
        }
        C59462zhW.Activity activity = C59462zhW.OLrzqt;
        long jAEQbTJ = C59519zia.AEQbTJ(c15935eaT.fetchVPNInfo.AhwBna(), DurationUnit.SECONDS);
        OKXConnectManager$subscribeFetchAndGetSessionInfo$sessionInfo$1 oKXConnectManager$subscribeFetchAndGetSessionInfo$sessionInfo$1 = new OKXConnectManager$subscribeFetchAndGetSessionInfo$sessionInfo$1(c15935eaT, null);
        oKXConnectManager$subscribeFetchAndGetSessionInfo$1.L$0 = c15935eaT;
        oKXConnectManager$subscribeFetchAndGetSessionInfo$1.label = 2;
        objM7403withTimeoutOrNullKLykuaI = TimeoutKt.m7403withTimeoutOrNullKLykuaI(jAEQbTJ, oKXConnectManager$subscribeFetchAndGetSessionInfo$sessionInfo$1, oKXConnectManager$subscribeFetchAndGetSessionInfo$1);
        if (objM7403withTimeoutOrNullKLykuaI == objCopydefault) {
            return objCopydefault;
        }
        DAppConnectRequest dAppConnectRequest22 = (DAppConnectRequest) objM7403withTimeoutOrNullKLykuaI;
        MutableSharedFlow<DAppConnectRequest> mutableSharedFlow2 = c15935eaT.ejfBZ;
        oKXConnectManager$subscribeFetchAndGetSessionInfo$1.L$0 = dAppConnectRequest22;
        oKXConnectManager$subscribeFetchAndGetSessionInfo$1.label = 3;
        if (mutableSharedFlow2.emit(null, oKXConnectManager$subscribeFetchAndGetSessionInfo$1) != objCopydefault) {
        }
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(this.AYXKKw, null, null, new OKXConnectManager$unsubscribe$1(this, str, null), 3, null);
    }

    public final void OLrzqt(DAppSession dAppSession, java.lang.String str) {
        if (!EZpvd(str) || dAppSession.getConnectedCaipChains().contains(str)) {
            return;
        }
        DAppSession dAppSessionCopy = dAppSession.copy((2047 & 1) != 0 ? dAppSession.clientId : null, (2047 & 2) != 0 ? dAppSession.topic : null, (2047 & 4) != 0 ? dAppSession.walletId : null, (2047 & 8) != 0 ? dAppSession.keyPair : null, (2047 & 16) != 0 ? dAppSession.dAppInfo : null, (2047 & 32) != 0 ? dAppSession.isTonConnected : false, (2047 & 64) != 0 ? dAppSession.connectedCaipChains : CollectionsKt___CollectionsKt.copydefault((java.util.Collection<? extends java.lang.String>) dAppSession.getConnectedCaipChains(), str), (2047 & 128) != 0 ? dAppSession.hasCosmosChainConnected : null, (2047 & 256) != 0 ? dAppSession.redirect : null, (2047 & 512) != 0 ? dAppSession.timestamp : 0L, (2047 & 1024) != 0 ? dAppSession.protocalVersion : null, (2047 & 2048) != 0 ? dAppSession.lastActiveTimestamp : null);
        this.AkhnZx.copydefault(dAppSessionCopy.getWalletId(), dAppSessionCopy);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession.copy$default(com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession, java.lang.String, java.lang.String, java.lang.String, com.okinc.wallet.core.sign.ton.X25519KeyPair, com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo, boolean, java.util.List, java.lang.Boolean, java.lang.String, long, java.lang.Integer, java.lang.Long, int, java.lang.Object):com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession */
    public final void EZpvd(DAppSession dAppSession) {
        DAppSession dAppSessionCopy = dAppSession.copy((2047 & 1) != 0 ? dAppSession.clientId : null, (2047 & 2) != 0 ? dAppSession.topic : null, (2047 & 4) != 0 ? dAppSession.walletId : null, (2047 & 8) != 0 ? dAppSession.keyPair : null, (2047 & 16) != 0 ? dAppSession.dAppInfo : null, (2047 & 32) != 0 ? dAppSession.isTonConnected : false, (2047 & 64) != 0 ? dAppSession.connectedCaipChains : null, (2047 & 128) != 0 ? dAppSession.hasCosmosChainConnected : null, (2047 & 256) != 0 ? dAppSession.redirect : null, (2047 & 512) != 0 ? dAppSession.timestamp : 0L, (2047 & 1024) != 0 ? dAppSession.protocalVersion : null, (2047 & 2048) != 0 ? dAppSession.lastActiveTimestamp : java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        this.AkhnZx.copydefault(dAppSessionCopy.getWalletId(), dAppSessionCopy);
    }

    public final boolean EZpvd(java.lang.String str) {
        java.util.List listAhwBna;
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() < 2) {
            listSplit$default = null;
        }
        java.lang.String strJoinToString$default = (listSplit$default == null || (listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) listSplit$default, 2)) == null) ? null : CollectionsKt___CollectionsKt.joinToString$default(listAhwBna, ":", null, null, 0, null, null, 62, null);
        return (strJoinToString$default != null ? InterfaceC13987dcu.Companion.AEQbTJ(strJoinToString$default) : null) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AhwBna(java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKXConnectManager$removeDAppSession$1 oKXConnectManager$removeDAppSession$1;
        C15935eaT c15935eaT;
        java.lang.Object next;
        java.lang.Object objEZpvd;
        MutableSharedFlow<C16061ecn> mutableSharedFlow;
        C16061ecn c16061ecn;
        C15935eaT c15935eaT2;
        if (continuation instanceof OKXConnectManager$removeDAppSession$1) {
            oKXConnectManager$removeDAppSession$1 = (OKXConnectManager$removeDAppSession$1) continuation;
            int i = oKXConnectManager$removeDAppSession$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKXConnectManager$removeDAppSession$1.label = i - Integer.MIN_VALUE;
            } else {
                oKXConnectManager$removeDAppSession$1 = new OKXConnectManager$removeDAppSession$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = oKXConnectManager$removeDAppSession$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKXConnectManager$removeDAppSession$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            C16011ebq c16011ebq = this.AkhnZx;
            oKXConnectManager$removeDAppSession$1.L$0 = this;
            oKXConnectManager$removeDAppSession$1.L$1 = str;
            oKXConnectManager$removeDAppSession$1.label = 1;
            objOLrzqt = c16011ebq.OLrzqt(oKXConnectManager$removeDAppSession$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c15935eaT = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c15935eaT2 = (C15935eaT) oKXConnectManager$removeDAppSession$1.L$0;
                        C56391yDq.AEQbTJ(objOLrzqt);
                        if (C56403yEb.QOLQEE(((java.util.Map) objOLrzqt).values()).isEmpty()) {
                            c15935eaT2.values();
                        }
                        return Unit.INSTANCE;
                    }
                    c15935eaT2 = (C15935eaT) oKXConnectManager$removeDAppSession$1.L$0;
                    C56391yDq.AEQbTJ(objOLrzqt);
                    C16011ebq c16011ebq2 = c15935eaT2.AkhnZx;
                    oKXConnectManager$removeDAppSession$1.L$0 = c15935eaT2;
                    oKXConnectManager$removeDAppSession$1.label = 4;
                    objOLrzqt = c16011ebq2.OLrzqt(oKXConnectManager$removeDAppSession$1);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    if (C56403yEb.QOLQEE(((java.util.Map) objOLrzqt).values()).isEmpty()) {
                    }
                    return Unit.INSTANCE;
                }
                str = (java.lang.String) oKXConnectManager$removeDAppSession$1.L$1;
                c15935eaT = (C15935eaT) oKXConnectManager$removeDAppSession$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                objEZpvd = ((Result) objOLrzqt).m7386unboximpl();
                Result.m7376boximpl(objEZpvd);
                c15935eaT.AkhnZx.OLrzqt(str);
                mutableSharedFlow = c15935eaT.KWHzl;
                c16061ecn = new C16061ecn(str, false);
                oKXConnectManager$removeDAppSession$1.L$0 = c15935eaT;
                oKXConnectManager$removeDAppSession$1.L$1 = null;
                oKXConnectManager$removeDAppSession$1.label = 3;
                if (mutableSharedFlow.emit(c16061ecn, oKXConnectManager$removeDAppSession$1) != objCopydefault) {
                    return objCopydefault;
                }
                c15935eaT2 = c15935eaT;
                C16011ebq c16011ebq22 = c15935eaT2.AkhnZx;
                oKXConnectManager$removeDAppSession$1.L$0 = c15935eaT2;
                oKXConnectManager$removeDAppSession$1.label = 4;
                objOLrzqt = c16011ebq22.OLrzqt(oKXConnectManager$removeDAppSession$1);
                if (objOLrzqt == objCopydefault) {
                }
                if (C56403yEb.QOLQEE(((java.util.Map) objOLrzqt).values()).isEmpty()) {
                }
                return Unit.INSTANCE;
            }
            str = (java.lang.String) oKXConnectManager$removeDAppSession$1.L$1;
            c15935eaT = (C15935eaT) oKXConnectManager$removeDAppSession$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        java.util.Iterator it = C56403yEb.QOLQEE(((java.util.Map) objOLrzqt).values()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            DAppSession dAppSession = (DAppSession) next;
            if (Intrinsics.EZpvd((java.lang.Object) dAppSession.getClientId(), (java.lang.Object) str) && C33129mqd.OLrzqt((java.lang.CharSequence) dAppSession.getTopic())) {
                break;
            }
        }
        DAppSession dAppSession2 = (DAppSession) next;
        java.lang.String topic = dAppSession2 != null ? dAppSession2.getTopic() : null;
        if (topic != null) {
            C16000ebf c16000ebf = c15935eaT.fetchVPNInfo;
            oKXConnectManager$removeDAppSession$1.L$0 = c15935eaT;
            oKXConnectManager$removeDAppSession$1.L$1 = str;
            oKXConnectManager$removeDAppSession$1.label = 2;
            objEZpvd = c16000ebf.EZpvd(topic, oKXConnectManager$removeDAppSession$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            Result.m7376boximpl(objEZpvd);
        }
        c15935eaT.AkhnZx.OLrzqt(str);
        mutableSharedFlow = c15935eaT.KWHzl;
        c16061ecn = new C16061ecn(str, false);
        oKXConnectManager$removeDAppSession$1.L$0 = c15935eaT;
        oKXConnectManager$removeDAppSession$1.L$1 = null;
        oKXConnectManager$removeDAppSession$1.label = 3;
        if (mutableSharedFlow.emit(c16061ecn, oKXConnectManager$removeDAppSession$1) != objCopydefault) {
        }
    }
}

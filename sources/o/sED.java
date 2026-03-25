package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.core.livelistener.OKWsConnectionState;
import com.okinc.core.util.SPUtils;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.client.WebSocketClient$establishConnection$2$1$1;
import com.okinc.okimcore.client.WebSocketClient$onReceiveData$1;
import com.okinc.okimcore.client.WebSocketClient$ping$1;
import com.okinc.okimcore.client.WebSocketClient$pingInternal$1;
import com.okinc.okimcore.client.WebSocketClient$sendWebSocketCommand$1;
import com.okinc.okimcore.client.WebSocketClient$sendWebSocketCommand$2;
import com.okinc.okimcore.client.WebSocketClient$sendWebSocketCommand$3;
import com.okinc.okimcore.client.WebSocketClient$sendWebSocketCommandInternal$2$1;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMResponse;
import com.okinc.okimcore.model.im.inhouseim.ws.WSPing;
import com.okinc.okimcore.model.im.inhouseim.ws.WSRequest;
import com.okinc.okuser.data.Token;
import com.okinc.websocket.connection.OKWsDoh;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.serialization.json.JsonElement;
import o.AbstractC43419rot;
import o.C59462zhW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class sED {
    public static final long AEQbTJ;
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public static final long copydefault;
    public Job AYXKKw;
    public final CoroutineDispatcher AhwBna;
    public Function1<? super java.lang.String, Unit> AkhnZx;
    public java.util.Map<java.lang.String, Function2<InHouseIMResponse, Continuation<? super Unit>, java.lang.Object>> EZpvd;
    public OKWsConnectionState KWHzl;
    public CoroutineScope djBIcL;
    public AbstractC57572yku fetchVPNInfo;
    public Function1<? super OKWsConnectionState, Unit> gEmmrt;
    public final Semaphore isConnected;
    public Function1<? super InHouseIMResponse, Unit> valueOf;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKWsConnectionState.values().length];
            try {
                iArr[OKWsConnectionState.CLOSED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKWsConnectionState.OPEN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OKWsConnectionState.FAILURE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AYXKKw() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function1<? super InHouseIMResponse, Unit> function1) {
        this.valueOf = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKWsConnectionState KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function1<? super OKWsConnectionState, Unit> function1) {
        this.gEmmrt = function1;
    }

    public final long copydefault() {
        return 2000L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function1<? super java.lang.String, Unit> function1) {
        this.AkhnZx = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, Function2<InHouseIMResponse, Continuation<? super Unit>, java.lang.Object>> gEmmrt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC57572yku valueOf() {
        return this.fetchVPNInfo;
    }

    @yCM
    public sED(@NotNull Semaphore semaphore) {
        Intrinsics.checkNotNullParameter(semaphore, "");
        this.isConnected = semaphore;
        this.KWHzl = OKWsConnectionState.CLOSED;
        this.AhwBna = sDN.copydefault.copydefault().limitedParallelism(1);
        this.EZpvd = new LinkedHashMap();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sED.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    static {
        C59462zhW.Activity activity = C59462zhW.OLrzqt;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        AEQbTJ = C59462zhW.gEmmrt(C59519zia.EZpvd(15, durationUnit));
        copydefault = C59462zhW.gEmmrt(C59519zia.EZpvd(20, durationUnit));
    }

    public final void copydefault(@NotNull OKWsConnectionState oKWsConnectionState) {
        Intrinsics.checkNotNullParameter(oKWsConnectionState, "");
        if (this.KWHzl != oKWsConnectionState) {
            this.KWHzl = oKWsConnectionState;
            Function1<? super OKWsConnectionState, Unit> function1 = this.gEmmrt;
            if (function1 != null) {
                function1.invoke(oKWsConnectionState);
            }
        }
    }

    public static final class ActionBar {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.AEQbTJ;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = actionBar.EZpvd;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = actionBar.OLrzqt;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = actionBar.AYXKKw;
            }
            java.lang.String str9 = str5;
            if ((i & 32) != 0) {
                z = actionBar.copydefault;
            }
            return actionBar.copydefault(str, str6, str7, str8, str9, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new ActionBar(str, str2, str3, str4, str5, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) actionBar.AYXKKw) && this.copydefault == actionBar.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.KWHzl;
            return ((((((((((str == null ? 0 : str.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "WebSocketConnectionConfig(nonLoginImToken=" + this.KWHzl + ", domainUrl=" + this.AEQbTJ + ", userToken=" + this.EZpvd + ", userId=" + this.OLrzqt + ", username=" + this.AYXKKw + ", isLoggedIn=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean valueOf() {
            return this.copydefault;
        }

        public ActionBar(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.KWHzl = str;
            this.AEQbTJ = str2;
            this.EZpvd = str3;
            this.OLrzqt = str4;
            this.AYXKKw = str5;
            this.copydefault = z;
        }
    }

    public final boolean AhwBna() {
        CoroutineScope coroutineScope = this.djBIcL;
        return coroutineScope != null && CoroutineScopeKt.isActive(coroutineScope);
    }

    public final boolean djBIcL() {
        CoroutineScope coroutineScope;
        Job job;
        return this.KWHzl == OKWsConnectionState.OPEN && (coroutineScope = this.djBIcL) != null && CoroutineScopeKt.isActive(coroutineScope) && (job = this.AYXKKw) != null && job.isActive();
    }

    public final ActionBar OLrzqt() {
        boolean zValues = C44157sFk.gEmmrt().values();
        java.lang.String str = zValues ? "/ws/v1/im" : "/ws/v1/im/an";
        java.lang.String strCopydefault = copydefault(zValues);
        java.lang.String strAEQbTJ = !zValues ? sFM.copydefault.AEQbTJ() : null;
        java.lang.String str2 = strCopydefault + str;
        Token tokenAhwBna = C44157sFk.gEmmrt().AhwBna();
        java.lang.String value = tokenAhwBna != null ? tokenAhwBna.getValue() : null;
        return new ActionBar(strAEQbTJ, str2, value == null ? "" : value, C44157sFk.EZpvd(), C44157sFk.gEmmrt().AYXKKw(), zValues);
    }

    public final java.lang.String copydefault(boolean z) {
        sFM sfm;
        java.lang.String strOLrzqt;
        boolean zAhwBna = C34703nhO.AhwBna(C43246rlf.OLrzqt.valueOf());
        boolean z2 = SPUtils.getBoolean("ModifyIMAPIKeyActivity_KEY_IM_WEB_SOCKET_PRE_RELEASE_TOGGLE", false);
        boolean z3 = SPUtils.getBoolean("KEY_CUSTOM_WS_DOMAIN_TOGGLE", false);
        java.lang.String string = SPUtils.getString("KEY_CUSTOM_WS_DOMAIN_VALUE", "");
        if (zAhwBna && z3 && string != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string)) {
            return string;
        }
        if (zAhwBna && z2) {
            return "wss://wspribeta.okex.org";
        }
        if (z || (strOLrzqt = (sfm = sFM.copydefault).OLrzqt()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt)) {
            return C43292rmY.OLrzqt.zuBGHE();
        }
        return "wss://" + sfm.OLrzqt();
    }

    public final C57571ykt OLrzqt(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        java.lang.String strAEQbTJ = actionBar.AEQbTJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.lang.String strEZpvd = actionBar.EZpvd();
        if (strEZpvd != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd)) {
            C44124sEe.imLogTokenOperation$default("Non-login token exists...", null, 2, null);
            linkedHashMap.put("im-token", actionBar.EZpvd());
        }
        if (actionBar.valueOf()) {
            linkedHashMap.put("Authorization", actionBar.KWHzl());
        }
        return new C57571ykt(strAEQbTJ, linkedHashMap, true, OKWsDoh.V5);
    }

    public final C57573ykv AEQbTJ(@NotNull C57571ykt c57571ykt) {
        Intrinsics.checkNotNullParameter(c57571ykt, "");
        return new C57573ykv(c57571ykt);
    }

    public final Job fetchVPNInfo() {
        return BuildersKt__Builders_commonKt.launch$default(C44157sFk.getOrThrow$default(this.djBIcL, (java.lang.String) null, 1, (java.lang.Object) null), null, null, new WebSocketClient$ping$1(this, null), 3, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|2|(2:4|(1:6)(1:7))(0)|8|(1:68)|(3:(1:(1:(1:(2:15|16))(4:17|18|44|(1:46)))(13:20|21|22|74|36|(5:38|39|72|40|(1:42)(3:43|44|(0)))(7:47|48|49|59|(2:61|(1:65))|66|67)|50|54|58|59|(0)|66|67))|23|24)(4:28|70|29|(1:31)(1:32))|33|(1:35)|22|74|36|(0)(0)|50|54|58|59|(0)|66|67) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ce, code lost:
    
        r16 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091 A[Catch: all -> 0x00cd, TRY_LEAVE, TryCatch #3 {all -> 0x00cd, blocks: (B:36:0x0089, B:38:0x0091), top: B:74:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00bd -> B:33:0x007c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WebSocketClient$pingInternal$1 webSocketClient$pingInternal$1;
        sED sed;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        sED sed2;
        sED sed3;
        sED sed4;
        long jAYXKKw;
        if (continuation instanceof WebSocketClient$pingInternal$1) {
            webSocketClient$pingInternal$1 = (WebSocketClient$pingInternal$1) continuation;
            int i = webSocketClient$pingInternal$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketClient$pingInternal$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketClient$pingInternal$1 = new WebSocketClient$pingInternal$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = webSocketClient$pingInternal$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = webSocketClient$pingInternal$1.label;
        int i3 = 1;
        try {
        } catch (java.lang.Throwable th) {
            th = th;
            sed = sed3;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    sed2 = (sED) webSocketClient$pingInternal$1.L$1;
                    sed3 = (sED) webSocketClient$pingInternal$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    sED sed5 = sed3;
                    if (((java.lang.Boolean) objEZpvd).booleanValue()) {
                        sed4 = sed5;
                        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                        sed = sed4;
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl != null) {
                            pUU.KWHzl(thM7380exceptionOrNullimpl);
                            if ((thM7380exceptionOrNullimpl instanceof TimeoutCancellationException) && sed.KWHzl == OKWsConnectionState.OPEN) {
                                sed.copydefault(OKWsConnectionState.CLOSED);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    try {
                        WSPing wSPing = new WSPing(null, i3, 0 == true ? 1 : 0);
                        webSocketClient$pingInternal$1.L$0 = sed5;
                        webSocketClient$pingInternal$1.L$1 = sed2;
                        webSocketClient$pingInternal$1.label = 3;
                        if (sendWebSocketCommand$default(sed2, wSPing, 0L, webSocketClient$pingInternal$1, 2, null) == objCopydefault) {
                            return objCopydefault;
                        }
                        sed3 = sed4;
                        jAYXKKw = sed2.AYXKKw();
                        webSocketClient$pingInternal$1.L$0 = sed3;
                        webSocketClient$pingInternal$1.L$1 = sed2;
                        webSocketClient$pingInternal$1.label = 4;
                        if (DelayKt.delay(jAYXKKw, webSocketClient$pingInternal$1) == objCopydefault) {
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                    sed4 = sed5;
                    th = th2;
                    sed = sed4;
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i2 == 3) {
                    sed2 = (sED) webSocketClient$pingInternal$1.L$1;
                    sed3 = (sED) webSocketClient$pingInternal$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    jAYXKKw = sed2.AYXKKw();
                    webSocketClient$pingInternal$1.L$0 = sed3;
                    webSocketClient$pingInternal$1.L$1 = sed2;
                    webSocketClient$pingInternal$1.label = 4;
                    if (DelayKt.delay(jAYXKKw, webSocketClient$pingInternal$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            sed2 = (sED) webSocketClient$pingInternal$1.L$1;
            sed3 = (sED) webSocketClient$pingInternal$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        } else {
            C56391yDq.AEQbTJ(objEZpvd);
            try {
                Result.Application application2 = Result.Companion;
                long jCopydefault = copydefault();
                webSocketClient$pingInternal$1.L$0 = this;
                webSocketClient$pingInternal$1.L$1 = this;
                webSocketClient$pingInternal$1.label = 1;
                if (DelayKt.delay(jCopydefault, webSocketClient$pingInternal$1) == objCopydefault) {
                    return objCopydefault;
                }
                sed2 = this;
                sed3 = sed2;
            } catch (java.lang.Throwable th3) {
                th = th3;
                sed = this;
            }
        }
        webSocketClient$pingInternal$1.L$0 = sed3;
        webSocketClient$pingInternal$1.L$1 = sed2;
        webSocketClient$pingInternal$1.label = 2;
        objEZpvd = sed2.EZpvd(webSocketClient$pingInternal$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        sED sed52 = sed3;
        if (((java.lang.Boolean) objEZpvd).booleanValue()) {
        }
        th = th2;
        sed = sed4;
        Result.Application application3 = Result.Companion;
        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    public final JsonElement EZpvd(@NotNull WSRequest wSRequest, @NotNull InHouseIMResponse inHouseIMResponse) {
        AbstractC43419rot actionBar;
        Intrinsics.checkNotNullParameter(wSRequest, "");
        Intrinsics.checkNotNullParameter(inHouseIMResponse, "");
        this.EZpvd.remove(wSRequest.djBIcL());
        try {
            int iKWHzl = inHouseIMResponse.KWHzl();
            java.lang.String strCopydefault = inHouseIMResponse.copydefault();
            ResponseData responseData = new ResponseData(iKWHzl, strCopydefault == null ? "" : strCopydefault, null, null, inHouseIMResponse.OLrzqt(), null, 44, null);
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            C44124sEe.imLogSync$default("web socket response[" + wSRequest.djBIcL() + "] => success", null, null, 6, null);
        }
        if (actionBar instanceof AbstractC43419rot.ActionBar) {
            OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl();
            sEF sef = sEF.OLrzqt;
            EventData eventDataAEQbTJ = sef.AEQbTJ();
            eventDataAEQbTJ.setMsg("[In-House] Cannot get web socket response");
            eventDataAEQbTJ.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt("path", EopTrackEvent.KEY_RESULT_FAILED)));
            sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
            C44124sEe.imLogSync$default("web socket response[" + wSRequest.djBIcL() + "] => failed", oKServerException, null, 4, null);
        }
        return (JsonElement) actionBar.AEQbTJ();
    }

    public final void EZpvd(@NotNull WSRequest wSRequest) {
        Intrinsics.checkNotNullParameter(wSRequest, "");
        this.EZpvd.remove(wSRequest.djBIcL());
        C44124sEe.imLogSync$default("web socket response[" + wSRequest.djBIcL() + "] => removed callback because of coroutine cancelled", null, null, 6, null);
    }

    public static final class StateListAnimator implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ WSRequest EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(WSRequest wSRequest) {
            this.EZpvd = wSRequest;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            KWHzl(th);
            return Unit.INSTANCE;
        }

        public final void KWHzl(java.lang.Throwable th) {
            sED.this.EZpvd(this.EZpvd);
        }
    }

    public static /* synthetic */ java.lang.Object sendWebSocketCommand$default(sED sed, WSRequest wSRequest, long j, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = copydefault;
        }
        return sed.KWHzl(wSRequest, j, continuation);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:26:0x0063 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x0025 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.okinc.okimcore.model.im.inhouseim.ws.WSRequest] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [o.sED] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [o.sED] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.okinc.okimcore.model.im.inhouseim.ws.WSRequest, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, o.sED] */
    /* JADX WARN: Type inference failed for: r9v8, types: [o.sED] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull WSRequest wSRequest, long j, @NotNull Continuation<? super JsonElement> continuation) throws java.lang.Throwable {
        WebSocketClient$sendWebSocketCommand$1 webSocketClient$sendWebSocketCommand$1;
        ?? r2;
        java.lang.Throwable th;
        long j2;
        ?? r10;
        ?? r9;
        if (continuation instanceof WebSocketClient$sendWebSocketCommand$1) {
            webSocketClient$sendWebSocketCommand$1 = (WebSocketClient$sendWebSocketCommand$1) continuation;
            int i = webSocketClient$sendWebSocketCommand$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketClient$sendWebSocketCommand$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketClient$sendWebSocketCommand$1 = new WebSocketClient$sendWebSocketCommand$1(this, continuation);
            }
        }
        java.lang.Object objWithTimeout = webSocketClient$sendWebSocketCommand$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = webSocketClient$sendWebSocketCommand$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithTimeout);
                try {
                    Semaphore semaphore = this.isConnected;
                    webSocketClient$sendWebSocketCommand$1.L$0 = this;
                    webSocketClient$sendWebSocketCommand$1.L$1 = wSRequest;
                    webSocketClient$sendWebSocketCommand$1.J$0 = j;
                    webSocketClient$sendWebSocketCommand$1.label = 1;
                    if (semaphore.acquire(webSocketClient$sendWebSocketCommand$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    j2 = j;
                    r10 = wSRequest;
                    r9 = this;
                    WebSocketClient$sendWebSocketCommand$2 webSocketClient$sendWebSocketCommand$2 = new WebSocketClient$sendWebSocketCommand$2(r9, r10, null);
                    webSocketClient$sendWebSocketCommand$1.L$0 = r9;
                    webSocketClient$sendWebSocketCommand$1.L$1 = null;
                    webSocketClient$sendWebSocketCommand$1.label = 2;
                    objWithTimeout = TimeoutKt.withTimeout(j2, webSocketClient$sendWebSocketCommand$2, webSocketClient$sendWebSocketCommand$1);
                    wSRequest = r9;
                    if (objWithTimeout == objCopydefault) {
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    r2 = this;
                    sEF sef = sEF.OLrzqt;
                    EventData eventDataAEQbTJ = sef.AEQbTJ();
                    eventDataAEQbTJ.setMsg("[In-House] Cannot get web socket response");
                    eventDataAEQbTJ.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt("path", "timeout")));
                    sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
                    throw th;
                }
            } else if (i2 == 1) {
                long j3 = webSocketClient$sendWebSocketCommand$1.J$0;
                WSRequest wSRequest2 = (WSRequest) webSocketClient$sendWebSocketCommand$1.L$1;
                r2 = (sED) webSocketClient$sendWebSocketCommand$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objWithTimeout);
                    j2 = j3;
                    r10 = wSRequest2;
                    r9 = r2;
                    WebSocketClient$sendWebSocketCommand$2 webSocketClient$sendWebSocketCommand$22 = new WebSocketClient$sendWebSocketCommand$2(r9, r10, null);
                    webSocketClient$sendWebSocketCommand$1.L$0 = r9;
                    webSocketClient$sendWebSocketCommand$1.L$1 = null;
                    webSocketClient$sendWebSocketCommand$1.label = 2;
                    objWithTimeout = TimeoutKt.withTimeout(j2, webSocketClient$sendWebSocketCommand$22, webSocketClient$sendWebSocketCommand$1);
                    wSRequest = r9;
                    if (objWithTimeout == objCopydefault) {
                        return objCopydefault;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    try {
                        sEF sef2 = sEF.OLrzqt;
                        EventData eventDataAEQbTJ2 = sef2.AEQbTJ();
                        eventDataAEQbTJ2.setMsg("[In-House] Cannot get web socket response");
                        eventDataAEQbTJ2.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt("path", "timeout")));
                        sef2.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ2);
                        throw th;
                    } catch (java.lang.Throwable th4) {
                        NonCancellable nonCancellable = NonCancellable.INSTANCE;
                        WebSocketClient$sendWebSocketCommand$3 webSocketClient$sendWebSocketCommand$3 = new WebSocketClient$sendWebSocketCommand$3(r2, null);
                        webSocketClient$sendWebSocketCommand$1.L$0 = th4;
                        webSocketClient$sendWebSocketCommand$1.L$1 = null;
                        webSocketClient$sendWebSocketCommand$1.label = 4;
                        if (BuildersKt.withContext(nonCancellable, webSocketClient$sendWebSocketCommand$3, webSocketClient$sendWebSocketCommand$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        throw th4;
                    }
                }
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        JsonElement jsonElement = (JsonElement) webSocketClient$sendWebSocketCommand$1.L$0;
                        C56391yDq.AEQbTJ(objWithTimeout);
                        return jsonElement;
                    }
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Throwable th5 = (java.lang.Throwable) webSocketClient$sendWebSocketCommand$1.L$0;
                    C56391yDq.AEQbTJ(objWithTimeout);
                    throw th5;
                }
                sED sed = (sED) webSocketClient$sendWebSocketCommand$1.L$0;
                C56391yDq.AEQbTJ(objWithTimeout);
                wSRequest = sed;
            }
            JsonElement jsonElement2 = (JsonElement) objWithTimeout;
            NonCancellable nonCancellable2 = NonCancellable.INSTANCE;
            WebSocketClient$sendWebSocketCommand$3 webSocketClient$sendWebSocketCommand$32 = new WebSocketClient$sendWebSocketCommand$3(wSRequest, null);
            webSocketClient$sendWebSocketCommand$1.L$0 = jsonElement2;
            webSocketClient$sendWebSocketCommand$1.label = 3;
            return BuildersKt.withContext(nonCancellable2, webSocketClient$sendWebSocketCommand$32, webSocketClient$sendWebSocketCommand$1) == objCopydefault ? objCopydefault : jsonElement2;
        } catch (java.lang.Throwable th6) {
            r2 = wSRequest;
            th = th6;
        }
    }

    public final void AEQbTJ(@NotNull OKWsConnectionState oKWsConnectionState) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(oKWsConnectionState, "");
        C44124sEe.imLogSync$default("establishConnection:onConnectionStateChanged => OKWsConnectionState: " + oKWsConnectionState.name(), null, null, 6, null);
        OKWsConnectionState oKWsConnectionState2 = this.KWHzl;
        if (oKWsConnectionState != oKWsConnectionState2) {
            copydefault(oKWsConnectionState);
            C44124sEe.imLogSync$default("establishConnection:onConnectionStateChanged => connectionStateBefore=" + oKWsConnectionState2 + ", connectionState=" + oKWsConnectionState, null, null, 6, null);
            if (oKWsConnectionState == OKWsConnectionState.OPEN && this.AYXKKw == null) {
                try {
                    Result.Application application = Result.Companion;
                    this.AYXKKw = fetchVPNInfo();
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    C44124sEe.imLogSync$default("establishConnection:onConnectionStateChanged launch ping success", null, null, 6, null);
                }
                java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    C44124sEe.imLogSync$default("establishConnection:onConnectionStateChanged launch ping failed", thM7380exceptionOrNullimpl, null, 4, null);
                }
            }
            int i = TaskDescription.AEQbTJ[oKWsConnectionState.ordinal()];
            if (i == 1) {
                C44500sSc.AEQbTJ.copydefault(this.fetchVPNInfo);
            } else if (i == 2) {
                C44500sSc.AEQbTJ.AEQbTJ(this.fetchVPNInfo);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                C44500sSc.AEQbTJ.OLrzqt(this.fetchVPNInfo);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull OKIncomingData oKIncomingData, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        WebSocketClient$onReceiveData$1 webSocketClient$onReceiveData$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        InHouseIMResponse inHouseIMResponse;
        sED sed;
        if (continuation instanceof WebSocketClient$onReceiveData$1) {
            webSocketClient$onReceiveData$1 = (WebSocketClient$onReceiveData$1) continuation;
            int i = webSocketClient$onReceiveData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketClient$onReceiveData$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketClient$onReceiveData$1 = new WebSocketClient$onReceiveData$1(this, continuation);
            }
        }
        java.lang.Object obj = webSocketClient$onReceiveData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = webSocketClient$onReceiveData$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            java.lang.String originMsg = oKIncomingData.getOriginMsg();
            if (originMsg == null) {
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    C44124sEe.imLogSync$default("establishConnection:onReceiveData", thM7380exceptionOrNullimpl, null, 4, null);
                }
                return objM7377constructorimpl;
            }
            inHouseIMResponse = (InHouseIMResponse) sHW.copydefault().KWHzl().decodeFromString(InHouseIMResponse.Companion.serializer(), originMsg);
            Function2<InHouseIMResponse, Continuation<? super Unit>, java.lang.Object> function2 = this.EZpvd.get(inHouseIMResponse.AEQbTJ());
            if (function2 != null) {
                webSocketClient$onReceiveData$1.L$0 = this;
                webSocketClient$onReceiveData$1.L$1 = inHouseIMResponse;
                webSocketClient$onReceiveData$1.label = 1;
                if (function2.invoke(inHouseIMResponse, webSocketClient$onReceiveData$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
            sed = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            inHouseIMResponse = (InHouseIMResponse) webSocketClient$onReceiveData$1.L$1;
            sed = (sED) webSocketClient$onReceiveData$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Function1<? super InHouseIMResponse, Unit> function1 = sed.valueOf;
        if (function1 != null) {
            function1.invoke(inHouseIMResponse);
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return objM7377constructorimpl;
    }

    public final void EZpvd() {
        C44124sEe.imLogSync$default("establishConnection => hasScope=" + (this.djBIcL != null), null, null, 6, null);
        if (this.djBIcL == null) {
            ActionBar actionBarOLrzqt = OLrzqt();
            java.lang.String strAEQbTJ = actionBarOLrzqt.AEQbTJ();
            java.lang.String strCopydefault = actionBarOLrzqt.copydefault();
            java.lang.String strOLrzqt = actionBarOLrzqt.OLrzqt();
            boolean zValueOf = actionBarOLrzqt.valueOf();
            C44124sEe.imLogSync$default("establishConnection => nonLoginImToken=" + actionBarOLrzqt.EZpvd(), null, null, 6, null);
            C44124sEe.imLogSync$default("establishConnection => domainUrl=" + strAEQbTJ, null, null, 6, null);
            C44124sEe.imLogSync$default("establishConnection => userId=" + strCopydefault, null, null, 6, null);
            C44124sEe.imLogSync$default("establishConnection => username=" + strOLrzqt, null, null, 6, null);
            C44124sEe.imLogSync$default("establishConnection => isLoggedIn=" + zValueOf, null, null, 6, null);
            AbstractC57572yku abstractC57572ykuOLrzqt = C57554ykc.Companion.OLrzqt(AEQbTJ(OLrzqt(actionBarOLrzqt)), new Function1() { // from class: o.sEE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return sED.copydefault(this.OLrzqt, (OKWsConnectionState) obj);
                }
            }, new Function2() { // from class: o.sEB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return sED.OLrzqt(this.EZpvd, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
                }
            });
            abstractC57572ykuOLrzqt.AhwBna();
            this.fetchVPNInfo = abstractC57572ykuOLrzqt;
            C44500sSc.AEQbTJ.KWHzl(abstractC57572ykuOLrzqt);
            Function1<? super java.lang.String, Unit> function1 = this.AkhnZx;
            if (function1 != null) {
                AbstractC57572yku abstractC57572yku = this.fetchVPNInfo;
                function1.invoke(abstractC57572yku != null ? java.lang.Integer.toHexString(abstractC57572yku.hashCode()) : null);
            }
            this.djBIcL = CoroutineScopeKt.CoroutineScope(this.AhwBna.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null)));
            return;
        }
        C44124sEe.imLogSync$default("establishConnection => already connected", null, null, 6, null);
    }

    public static final Unit copydefault(sED sed, OKWsConnectionState oKWsConnectionState) {
        Intrinsics.checkNotNullParameter(oKWsConnectionState, "");
        sed.AEQbTJ(oKWsConnectionState);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(sED sed, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(BuildersKt__Builders_commonKt.launch$default(C44157sFk.getOrThrow$default(sed.djBIcL, (java.lang.String) null, 1, (java.lang.Object) null), null, null, new WebSocketClient$establishConnection$2$1$1(sed, oKIncomingData, null), 3, null));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44124sEe.imLogSync$default("establishConnection: handle incoming message failed", thM7380exceptionOrNullimpl, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        C44124sEe.imLogSync$default("destroyConnection => hasScope=" + (this.djBIcL != null), null, null, 6, null);
        CoroutineScope coroutineScope = this.djBIcL;
        if (coroutineScope != null) {
            copydefault(OKWsConnectionState.CLOSED);
            this.EZpvd.clear();
            AbstractC57572yku abstractC57572yku = this.fetchVPNInfo;
            if (abstractC57572yku != null) {
                abstractC57572yku.djBIcL();
            }
            Function1<? super java.lang.String, Unit> function1 = this.AkhnZx;
            if (function1 != null) {
                AbstractC57572yku abstractC57572yku2 = this.fetchVPNInfo;
                function1.invoke(abstractC57572yku2 != null ? java.lang.Integer.toHexString(abstractC57572yku2.hashCode()) : null);
            }
            C44500sSc.AEQbTJ.EZpvd(this.fetchVPNInfo);
            this.fetchVPNInfo = null;
            Job job = this.AYXKKw;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.AYXKKw = null;
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
            this.djBIcL = null;
            return;
        }
        C44124sEe.imLogSync$default("destroyConnection => not connected yet", null, null, 6, null);
    }

    public final java.lang.Object EZpvd(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C56443yFo.KWHzl(JobKt.isActive(continuation.getContext()));
    }

    public final java.lang.Object KWHzl(@NotNull WSRequest wSRequest, @NotNull Continuation<? super JsonElement> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        java.lang.String strKWHzl = wSRequest.KWHzl();
        C44124sEe.imLogSync$default("web socket request[" + wSRequest.djBIcL() + "] => " + wSRequest, null, null, 6, null);
        gEmmrt().put(wSRequest.djBIcL(), new WebSocketClient$sendWebSocketCommandInternal$2$1(this, wSRequest, cancellableContinuationImpl, null));
        AbstractC57572yku abstractC57572ykuValueOf = valueOf();
        if (abstractC57572ykuValueOf != null) {
            abstractC57572ykuValueOf.copydefault(strKWHzl);
        }
        cancellableContinuationImpl.invokeOnCancellation(new StateListAnimator(wSRequest));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }
}

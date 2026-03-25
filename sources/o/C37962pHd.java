package o;

import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventPushPo;
import com.okinc.kline.features.kline.indexcomponents.data.model.IndexComponentsResp;
import com.okinc.kline.features.kline.indexcomponents.data.model.IndexComponentsWsPushPo;
import com.okinc.kline.ws.KLineWsManager$createSimplifiedWsListener$2;
import com.okinc.kline.ws.KLineWsManager$createWsListener$1;
import com.okinc.kline.ws.OriginalResponse;
import com.okinc.unified.di.KlineTradeModule;
import com.okinc.unify_trade.biz.subscribe.BizKLineData;
import com.okinc.websocket.connection.OKWsDoh;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ContextKt;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pHd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class C37962pHd {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final CoroutineScope AEQbTJ;
    public final CoroutineDispatcher EZpvd;

    @yCM
    public C37962pHd(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = coroutineDispatcher;
        this.AEQbTJ = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher).plus(new StateListAnimator(CoroutineExceptionHandler.Key)));
    }

    /* JADX INFO: renamed from: o.pHd$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pHd.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C37962pHd EZpvd() {
            C37962pHd c37962pHdInvokespecialROgMPW;
            synchronized (this) {
                c37962pHdInvokespecialROgMPW = ((KlineTradeModule.ActionBar) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), KlineTradeModule.ActionBar.class)).invokespecialROgMPW();
            }
            return c37962pHdInvokespecialROgMPW;
        }
    }

    /* JADX INFO: renamed from: o.pHd$StateListAnimator */
    public static final class StateListAnimator extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public StateListAnimator(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            C43296rmc.copydefault("KLineWsManager", "Unhandled exception", th);
        }
    }

    public final SharedFlow<java.util.List<BizKLineData>> AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(str, new Function1() { // from class: o.pHh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37962pHd.gEmmrt((java.lang.String) obj);
            }
        }, new Function0() { // from class: o.pHf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37962pHd.EZpvd();
            }
        });
    }

    public static final java.util.List gEmmrt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Json jsonKWHzl = C43284rmQ.KWHzl();
        jsonKWHzl.getSerializersModule();
        java.util.List<java.util.List<java.lang.String>> listKWHzl = ((OriginalResponse) jsonKWHzl.decodeFromString(OriginalResponse.Companion.serializer(), str)).KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        java.util.Iterator<T> it = listKWHzl.iterator();
        while (it.hasNext()) {
            java.util.List list = (java.util.List) it.next();
            arrayList.add(new BizKLineData((java.lang.String) list.get(0), (java.lang.String) list.get(1), (java.lang.String) list.get(2), (java.lang.String) list.get(3), (java.lang.String) list.get(4), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 224, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }

    public static final java.util.List EZpvd() {
        return yDY.AhwBna();
    }

    public final SharedFlow<java.util.List<IndexComponentsResp>> valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AEQbTJ("index-components-3s", yDY.copydefault(new WsArgV5("index-components-3s", str, null, null, null, null, null, null, 252, null)), new Function1() { // from class: o.pHj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37962pHd.OLrzqt((java.lang.String) obj);
            }
        });
    }

    public static final java.util.List OLrzqt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Json jsonKWHzl = C43284rmQ.KWHzl();
        jsonKWHzl.getSerializersModule();
        return ((IndexComponentsWsPushPo) jsonKWHzl.decodeFromString(IndexComponentsWsPushPo.Companion.serializer(), str)).getData();
    }

    public final SharedFlow<java.util.List<MarketEventPushPo.EventItem>> AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AEQbTJ("big-event-signals", yDY.copydefault(new WsArgV5("big-event-signals", str, null, null, null, null, null, null, 252, null)), new Function1() { // from class: o.pHi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37962pHd.EZpvd((java.lang.String) obj);
            }
        });
    }

    public static final java.util.List EZpvd(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Json jsonKWHzl = C43284rmQ.KWHzl();
        jsonKWHzl.getSerializersModule();
        return ((MarketEventPushPo) jsonKWHzl.decodeFromString(MarketEventPushPo.Companion.serializer(), str)).getData();
    }

    public static final java.util.List OLrzqt() {
        return yDY.AhwBna();
    }

    public static /* synthetic */ SharedFlow createSimplifiedWsListener$default(C37962pHd c37962pHd, java.lang.String str, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: o.pHb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C37962pHd.OLrzqt();
                }
            };
        }
        return c37962pHd.KWHzl(str, function1, function0);
    }

    public final <T> SharedFlow<java.util.List<T>> KWHzl(java.lang.String str, Function1<? super java.lang.String, ? extends java.util.List<? extends T>> function1, Function0<? extends java.util.List<? extends T>> function0) {
        return FlowKt__ShareKt.shareIn$default(FlowKt__ContextKt.buffer$default(FlowKt.callbackFlow(new KLineWsManager$createSimplifiedWsListener$2(this, str, function0, function1, null)), Integer.MAX_VALUE, null, 2, null), this.AEQbTJ, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), 0, 4, null);
    }

    public static /* synthetic */ C57573ykv createV5SimplifiedConnection$default(C37962pHd c37962pHd, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c37962pHd.EZpvd(str, z);
    }

    public final C57573ykv EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("KLineWsManager", "domainUrl: " + str + " disconnectWhenBackground = " + z);
        return new C57573ykv(new C57571ykt(C43292rmY.OLrzqt.zuBGHE() + str, null, z, OKWsDoh.V5, 2, null));
    }

    public final <T> SharedFlow<java.util.List<T>> AEQbTJ(java.lang.String str, java.util.ArrayList<? extends InterfaceC57559ykh> arrayList, Function1<? super java.lang.String, ? extends java.util.List<? extends T>> function1) {
        return FlowKt__ShareKt.shareIn$default(FlowKt__ContextKt.buffer$default(FlowKt.callbackFlow(new KLineWsManager$createWsListener$1(str, arrayList, function1, null)), Integer.MAX_VALUE, null, 2, null), this.AEQbTJ, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), 0, 4, null);
    }
}

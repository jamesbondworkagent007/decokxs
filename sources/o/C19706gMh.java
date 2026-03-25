package o;

import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsOriginData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.WsMarketOrderInfo;
import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gMh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@yCR
public final class C19706gMh {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final java.util.ArrayList<AbstractC57556yke> AEQbTJ = new java.util.ArrayList<>();
    public final ConcurrentHashMap<java.lang.String, Function1<TeeWsOriginData, Unit>> valueOf = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<java.lang.String, Function1<WsMarketOrderInfo, Unit>> copydefault = new ConcurrentHashMap<>();
    public final android.os.Handler OLrzqt = new android.os.Handler(android.os.Looper.getMainLooper());
    public final Json KWHzl = JsonKt.Json$default(null, new Function1() { // from class: o.gMo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C19706gMh.EZpvd((JsonBuilder) obj);
        }
    }, 1, null);

    /* JADX INFO: renamed from: o.gMh$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gMh.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @yCM
    public C19706gMh() {
    }

    public final C57567ykp EZpvd() {
        return ((InterfaceC9859bdY) C43251rlk.copydefault(InterfaceC9859bdY.class)).values();
    }

    public final void OLrzqt() {
        this.AEQbTJ.add(OLrzqt(new Function1() { // from class: o.gMl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19706gMh.EZpvd(this.OLrzqt, (WsMarketOrderInfo) obj);
            }
        }));
        this.AEQbTJ.add(KWHzl(new Function1() { // from class: o.gMn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19706gMh.EZpvd(this.AEQbTJ, (TeeWsOriginData) obj);
            }
        }));
        java.util.Iterator<T> it = this.AEQbTJ.iterator();
        while (it.hasNext()) {
            ((AbstractC57556yke) it.next()).AhwBna();
        }
    }

    public static final Unit EZpvd(final C19706gMh c19706gMh, final WsMarketOrderInfo wsMarketOrderInfo) {
        Intrinsics.checkNotNullParameter(wsMarketOrderInfo, "");
        c19706gMh.OLrzqt.post(new java.lang.Runnable() { // from class: o.gMg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C19706gMh.AEQbTJ(this.OLrzqt, wsMarketOrderInfo);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C19706gMh c19706gMh, WsMarketOrderInfo wsMarketOrderInfo) {
        java.util.Collection<Function1<WsMarketOrderInfo, Unit>> collectionValues = c19706gMh.copydefault.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        java.util.Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(wsMarketOrderInfo);
        }
    }

    public static final Unit EZpvd(final C19706gMh c19706gMh, final TeeWsOriginData teeWsOriginData) {
        Intrinsics.checkNotNullParameter(teeWsOriginData, "");
        c19706gMh.OLrzqt.post(new java.lang.Runnable() { // from class: o.gMi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C19706gMh.copydefault(this.OLrzqt, teeWsOriginData);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void copydefault(C19706gMh c19706gMh, TeeWsOriginData teeWsOriginData) {
        java.util.Collection<Function1<TeeWsOriginData, Unit>> collectionValues = c19706gMh.valueOf.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        java.util.Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(teeWsOriginData);
        }
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull Function1<? super TeeWsOriginData, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (this.valueOf.containsKey(str)) {
            C31200lpY.OLrzqt("duplicate bindKey:" + str);
        }
        this.valueOf.put(str, function1);
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf.remove(str);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull Function1<? super WsMarketOrderInfo, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (this.copydefault.containsKey(str)) {
            C31200lpY.OLrzqt("duplicate bindKey:" + str);
        }
        this.copydefault.put(str, function1);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.remove(str);
    }

    public final AbstractC57556yke KWHzl(final Function1<? super TeeWsOriginData, Unit> function1) {
        return C57554ykc.Companion.AEQbTJ("tee-strategy-openorder", EZpvd(), yDY.copydefault(new WsArgV5("tee-strategy-openorder", null, null, null, null, null, null, null, 254, null)), new Function2() { // from class: o.gMm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C19706gMh.copydefault(this.copydefault, function1, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
            }
        });
    }

    public static final Unit copydefault(C19706gMh c19706gMh, Function1 function1, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        try {
            Result.Application application = Result.Companion;
            java.lang.Object payload = oKIncomingData.getPayload();
            java.lang.String str = payload instanceof java.lang.String ? (java.lang.String) payload : null;
            if (str == null || str.length() == 0) {
                C43296rmc.EZpvd("WsManager", "tee-strategy-openorder receive empty");
            } else {
                TeeWsOriginData teeWsOriginData = (TeeWsOriginData) c19706gMh.KWHzl.decodeFromString(TeeWsOriginData.Companion.serializer(), str);
                if (teeWsOriginData.getType() != TeeWsOriginData.EventType.Toast) {
                    function1.invoke(teeWsOriginData);
                } else {
                    gMI.KWHzl.KWHzl(teeWsOriginData);
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            java.lang.String message = thM7380exceptionOrNullimpl.getMessage();
            C43296rmc.copydefault("WsManager", message != null ? message : "", thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        jsonBuilder.setUseArrayPolymorphism(true);
        jsonBuilder.setCoerceInputValues(true);
        return Unit.INSTANCE;
    }

    public final AbstractC57556yke OLrzqt(final Function1<? super WsMarketOrderInfo, Unit> function1) {
        return C57554ykc.Companion.AEQbTJ("dex-across-order-info", EZpvd(), yDY.copydefault(new WsArgV5("dex-across-order-info", null, null, null, null, null, null, null, 254, null)), new Function2() { // from class: o.gMk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C19706gMh.EZpvd(this.AEQbTJ, function1, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
            }
        });
    }

    public static final Unit EZpvd(C19706gMh c19706gMh, Function1 function1, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        try {
            Result.Application application = Result.Companion;
            java.lang.Object payload = oKIncomingData.getPayload();
            java.lang.String str = payload instanceof java.lang.String ? (java.lang.String) payload : null;
            if (str != null) {
                function1.invoke((WsMarketOrderInfo) c19706gMh.KWHzl.decodeFromString(WsMarketOrderInfo.Companion.serializer(), str));
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            java.lang.String message = thM7380exceptionOrNullimpl.getMessage();
            C43296rmc.copydefault("WsManager", message != null ? message : "", thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        java.util.Iterator<T> it = this.AEQbTJ.iterator();
        while (it.hasNext()) {
            ((AbstractC57556yke) it.next()).djBIcL();
        }
        this.valueOf.clear();
        this.copydefault.clear();
        this.AEQbTJ.clear();
    }
}

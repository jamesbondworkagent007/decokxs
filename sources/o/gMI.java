package o;

import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsOriginData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastType;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class gMI {
    public static final gMI KWHzl = new gMI();
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.gMK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return gMI.AEQbTJ();
        }
    });
    public static final android.os.Handler AEQbTJ = new android.os.Handler(android.os.Looper.getMainLooper());
    public static final int EZpvd = 8;

    private gMI() {
    }

    public final java.util.Map<TeeWsToastType, gMJ> KWHzl() {
        return (java.util.Map) OLrzqt.getValue();
    }

    public static final java.util.Map AEQbTJ() {
        java.util.List listGEmmrt = yDY.gEmmrt(new C19716gMr(), new C19714gMp(), new gMG(), new gMD(), new gMP(), new gMR(), new gMQ(), new C19724gMz(), new gMH(), new C19719gMu(), new C19718gMt(), new gMC(), new C19723gMy(), new gMU());
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listGEmmrt, 10)), 16));
        for (java.lang.Object obj : listGEmmrt) {
            linkedHashMap.put(((gMJ) obj).AEQbTJ(), obj);
        }
        return linkedHashMap;
    }

    public final void KWHzl(@NotNull TeeWsOriginData teeWsOriginData) {
        final TeeWsToastData teeWsToastData;
        Intrinsics.checkNotNullParameter(teeWsOriginData, "");
        JsonObject data = teeWsOriginData.getData();
        if (data == null || (teeWsToastData = (TeeWsToastData) C43284rmQ.KWHzl().decodeFromJsonElement(TeeWsToastData.Companion.serializer(), data)) == null) {
            return;
        }
        if (yDV.valueOf(new TeeWsToastType[]{TeeWsToastType.CreateStrategyOrderSuccess, TeeWsToastType.UpdateStrategyOrderSuccess}, teeWsToastData.getType())) {
            AEQbTJ.postDelayed(new java.lang.Runnable() { // from class: o.gME
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    gMI.EZpvd(teeWsToastData);
                }
            }, 200L);
        } else {
            AEQbTJ.post(new java.lang.Runnable() { // from class: o.gMF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    gMI.OLrzqt(teeWsToastData);
                }
            });
        }
    }

    public static final void EZpvd(TeeWsToastData teeWsToastData) {
        KWHzl.copydefault(teeWsToastData);
    }

    public static final void OLrzqt(TeeWsToastData teeWsToastData) {
        KWHzl.copydefault(teeWsToastData);
    }

    public final void copydefault(TeeWsToastData teeWsToastData) {
        gML gmlAEQbTJ;
        Unit unit;
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null) {
            return;
        }
        try {
            Result.Application application = Result.Companion;
            if (teeWsToastData.isOldVersion()) {
                return;
            }
            gMA gma = new gMA(activityAEQbTJ, teeWsToastData);
            gMJ gmj = KWHzl().get(teeWsToastData.getType());
            if (gmj == null || (gmlAEQbTJ = gmj.AEQbTJ(gma)) == null) {
                return;
            }
            C55097xdX c55097xdXAEQbTJ = gma.AEQbTJ(gmlAEQbTJ);
            if (teeWsToastData.getType() == TeeWsToastType.TradeSuccess && teeWsToastData.hasSurplus() && C22416heu.zsXlph()) {
                C25353ivC.EZpvd(c55097xdXAEQbTJ, teeWsToastData.getSurplusAmount(), teeWsToastData.getFromTokenSymbol(), teeWsToastData.getToTokenSymbol());
            }
            c55097xdXAEQbTJ.setCloseBtnShow(false);
            C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdXAEQbTJ, 3000L, 0, 0, 0, 28, null);
            Function0<Unit> function0KWHzl = gmlAEQbTJ.KWHzl();
            if (function0KWHzl != null) {
                function0KWHzl.invoke();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m7377constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}

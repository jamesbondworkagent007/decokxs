package o;

import com.okinc.base.utils.commmon.ThreadUtils;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcRouteConst;
import com.reown.android.pulse.model.ConnectionMethod;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yhg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57399yhg {
    public static final C57399yhg AEQbTJ = new C57399yhg();
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.yhk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C57399yhg.KWHzl();
        }
    });
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.yhl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C57399yhg.copydefault();
        }
    });
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String[] copydefault() {
        return new java.lang.String[]{"back", EopTrackEvent.CLOSE, "copy", "getClientInfo", "getSpecialToken", "getDeviceID", "getTmpToken", "getWeexConfig", OtcRouteConst.MAIN_ROUTE_NAV, "openBrowser", "setting", "clearCookie", "getSpecialToken", "setNavigationHeader", "setStatusBarTheme"};
    }

    private C57399yhg() {
    }

    public final ExecutorService AEQbTJ() {
        return (ExecutorService) KWHzl.getValue();
    }

    public static final ExecutorService KWHzl() {
        return ThreadUtils.copydefault();
    }

    public final java.lang.String[] gEmmrt() {
        return (java.lang.String[]) copydefault.getValue();
    }

    public static final void KWHzl(@NotNull final com.okinc.jsbridge.Message message) {
        Intrinsics.checkNotNullParameter(message, "");
        AEQbTJ.AEQbTJ().submit(new java.lang.Runnable() { // from class: o.yhf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57399yhg.AEQbTJ(message);
            }
        });
    }

    public static final void AEQbTJ(com.okinc.jsbridge.Message message) {
        final java.lang.String str;
        final java.lang.String str2 = yDV.valueOf(AEQbTJ.gEmmrt(), message.method) ? "defined" : ConnectionMethod.UNDEFINED;
        if (Intrinsics.EZpvd((java.lang.Object) message.method, (java.lang.Object) OtcRouteConst.MAIN_ROUTE_NAV)) {
            str = message.data;
        } else {
            str = message.method;
        }
        java.util.Set<java.lang.String> stringSet = SPUtils.getStringSet("JsPath", new androidx.collection.ArraySet(0, 1, null), "JsBridgeUsed");
        if (stringSet.contains(str)) {
            return;
        }
        stringSet.add(str);
        SPUtils.putStringSet("JsPath", stringSet, "JsBridgeUsed");
        C32866mlf.EZpvd("app_js_handler", new TrackChannel[]{TrackChannel.OKStatistics}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.yhi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57399yhg.KWHzl(str, str2, (EventParamsList) obj);
            }
        });
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        Intrinsics.copydefault((java.lang.Object) str);
        eventParamsList.put("path", str, false);
        eventParamsList.put("status", str2, true);
        return Unit.INSTANCE;
    }
}

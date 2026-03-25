package o;

import com.okinc.okrisk.OKRiskDeviceFingerprintService$profile$1;
import com.okinc.okrisk.OKRiskDeviceFingerprintService$submitRiskPayload$1;
import com.okinc.okrisk.OKRiskLibrarySource;
import com.okinc.okrisk.service.DeviceProfileRemoteConfig;
import com.okinc.okrisk.signals.p0.SyncSignal;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.thq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47005thq {
    public static final C47005thq KWHzl = new C47005thq();
    public static final CoroutineScope AEQbTJ = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
    public static volatile SyncSignal copydefault = new SyncSignal();
    public static final java.util.List<SyncSignal.SignalKey> OLrzqt = yDY.gEmmrt(SyncSignal.SignalKey.APP_AVAILABLE_MEMORY, SyncSignal.SignalKey.APP_TOTAL_MEMORY, SyncSignal.SignalKey.BATTERY_CHARGING_METHOD, SyncSignal.SignalKey.BATTERY_LEVEL, SyncSignal.SignalKey.BATTERY_STATUS, SyncSignal.SignalKey.BATTERY_TEMPERATURE, SyncSignal.SignalKey.BATTERY_VOLTAGE, SyncSignal.SignalKey.BOOT_TIME, SyncSignal.SignalKey.BSSID, SyncSignal.SignalKey.CARRIER_NAME, SyncSignal.SignalKey.CURRENT_TIME_UTC, SyncSignal.SignalKey.DEFAULT_TIME_ZONE_OFFSET, SyncSignal.SignalKey.DISK_SPACE, SyncSignal.SignalKey.AVAILABLE_MEMORY, SyncSignal.SignalKey.IPV6_ADDRESSES, SyncSignal.SignalKey.LOW_MEMORY, SyncSignal.SignalKey.NETWORK_COUNTRY_ISO, SyncSignal.SignalKey.NETWORK_OPERATOR, SyncSignal.SignalKey.NETWORK_TYPE, SyncSignal.SignalKey.PRIVATE_IP, SyncSignal.SignalKey.RUNNING_PROCESSES, SyncSignal.SignalKey.SCALED_DENSITY, SyncSignal.SignalKey.SCREEN_HEIGHT, SyncSignal.SignalKey.SCREEN_WIDTH, SyncSignal.SignalKey.SSID, SyncSignal.SignalKey.TIME_STAMP, SyncSignal.SignalKey.TIME_ZONE, SyncSignal.SignalKey.UP_TIME, SyncSignal.SignalKey.USER_AGENT, SyncSignal.SignalKey.VPN_INFO, SyncSignal.SignalKey.PROXY_INFO, SyncSignal.SignalKey.KEYBOARD_CONNECTED, SyncSignal.SignalKey.USER_TOKEN, SyncSignal.SignalKey.PUBLIC_KEY, SyncSignal.SignalKey.CREATION_TIME);
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SyncSignal AEQbTJ() {
        return copydefault;
    }

    private C47005thq() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.thq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void profile$default(C47005thq c47005thq, java.util.Map map, OKRiskLibrarySource oKRiskLibrarySource, InterfaceC47027tiL interfaceC47027tiL, java.lang.String str, CoroutineScope coroutineScope, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = new LinkedHashMap();
        }
        if ((i & 2) != 0) {
            oKRiskLibrarySource = OKRiskLibrarySource.UNKNOWN;
        }
        c47005thq.KWHzl(map, oKRiskLibrarySource, (i & 4) != 0 ? null : interfaceC47027tiL, (i & 8) != 0 ? null : str, (i & 16) == 0 ? coroutineScope : null);
    }

    public final void KWHzl(java.util.Map<java.lang.String, java.lang.String> map, @NotNull OKRiskLibrarySource oKRiskLibrarySource, InterfaceC47027tiL interfaceC47027tiL, java.lang.String str, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(oKRiskLibrarySource, "");
        pUU.KWHzl("OKRiskDeviceFingerprintService", "func profile is called " + oKRiskLibrarySource);
        C47220tlt.log$default(C47220tlt.KWHzl, oKRiskLibrarySource.getTag(), "profileInHouseSignals START " + oKRiskLibrarySource, java.lang.String.valueOf(java.lang.System.currentTimeMillis()), null, 8, null);
        if (coroutineScope == null) {
            coroutineScope = GlobalScope.INSTANCE;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new OKRiskDeviceFingerprintService$profile$1(map, oKRiskLibrarySource, interfaceC47027tiL, null), 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.thq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void collect$default(C47005thq c47005thq, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = new LinkedHashMap();
        }
        c47005thq.EZpvd(map);
    }

    public final void EZpvd(java.util.Map<java.lang.String, java.lang.String> map) {
        DeviceProfileRemoteConfig deviceProfileRemoteConfig = new DeviceProfileRemoteConfig(new java.util.ArrayList(), null, 0, 0, 0, 0, null, WebSocketProtocol.PAYLOAD_SHORT, null);
        DeviceProfileRemoteConfig deviceProfileRemoteConfig2 = (DeviceProfileRemoteConfig) C48787ucK.AEQbTJ.EZpvd("fingerprintConfig", DeviceProfileRemoteConfig.class);
        if (deviceProfileRemoteConfig2 != null) {
            deviceProfileRemoteConfig = deviceProfileRemoteConfig2;
        }
        for (SyncSignal.SignalKey signalKey : SyncSignal.SignalKey.values()) {
            copydefault.OLrzqt(C32979mnm.EZpvd.OLrzqt(), signalKey, OLrzqt, deviceProfileRemoteConfig);
        }
        if (!deviceProfileRemoteConfig.getEmuList().isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.Iterator<java.lang.String> it = deviceProfileRemoteConfig.getEmuList().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                java.lang.String next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                sb.append(C47130tkI.AEQbTJ.EZpvd(next));
            }
            copydefault.copydefault().put("emuList", sb.toString());
        }
        if (map != null) {
            for (Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                copydefault.copydefault().put(entry.getKey(), entry.getValue());
            }
        }
        copydefault.copydefault().put("checksum", copydefault(copydefault.copydefault()));
    }

    public static /* synthetic */ void submitRiskPayload$default(C47005thq c47005thq, java.lang.String str, java.util.Map map, CoroutineScope coroutineScope, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            coroutineScope = null;
        }
        c47005thq.AEQbTJ(str, map, coroutineScope);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (coroutineScope == null) {
            coroutineScope = AEQbTJ;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new OKRiskDeviceFingerprintService$submitRiskPayload$1(str, map, null), 2, null);
    }

    public final java.lang.String copydefault(java.util.Map<java.lang.String, java.lang.String> map) {
        return C47128tkG.KWHzl.copydefault(map);
    }
}

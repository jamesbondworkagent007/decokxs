package o;

import android.app.ActivityManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import androidx.camera.video.AudioStats;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aWo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6833aWo {
    public static volatile long AhwBna;
    public static final C6833aWo AEQbTJ = new C6833aWo();
    public static final java.lang.Object gEmmrt = new java.lang.Object();
    public static final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.aWy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6833aWo.AkhnZx();
        }
    });
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.aWu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6833aWo.AYXKKw();
        }
    });
    public static final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.aWA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6833aWo.fetchVPNInfo();
        }
    });
    public static final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.aWB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6833aWo.isConnected();
        }
    });
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.aWD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6833aWo.valueOf();
        }
    });
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.aWt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C6833aWo.values());
        }
    });
    public static final int EZpvd = 8;

    private C6833aWo() {
    }

    public static final ActivityManager.MemoryInfo AkhnZx() {
        return new ActivityManager.MemoryInfo();
    }

    public final ActivityManager.MemoryInfo AuCTel() {
        return (ActivityManager.MemoryInfo) djBIcL.getValue();
    }

    public static final android.app.ActivityManager AYXKKw() {
        return C6832aWn.AEQbTJ();
    }

    public final android.app.ActivityManager ejfBZ() {
        return (android.app.ActivityManager) OLrzqt.getValue();
    }

    public static final java.io.File fetchVPNInfo() {
        return new java.io.File("/proc/self/status");
    }

    public final java.io.File hDKMBd() {
        return (java.io.File) AYXKKw.getValue();
    }

    public static final java.io.File isConnected() {
        return new java.io.File("/proc/meminfo");
    }

    public final java.io.File fARcdN() {
        return (java.io.File) valueOf.getValue();
    }

    public final ActivityManager.MemoryInfo DbNXlk() {
        C6795aWC.AEQbTJ("Monitor.Device", (Function0<Unit>) new Function0() { // from class: o.aWx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6833aWo.AhwBna();
            }
        });
        return AuCTel();
    }

    public static final Unit AhwBna() {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (jCurrentTimeMillis - AhwBna >= 1000) {
            synchronized (gEmmrt) {
                if (jCurrentTimeMillis - AhwBna >= 1000) {
                    C6833aWo c6833aWo = AEQbTJ;
                    c6833aWo.ejfBZ().getMemoryInfo(c6833aWo.AuCTel());
                    AhwBna = jCurrentTimeMillis;
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    public final ActionBar iwGUEr() {
        java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
        return new ActionBar(runtime.maxMemory(), runtime.totalMemory(), runtime.freeMemory());
    }

    public final void gEmmrt(final java.util.Map<java.lang.String, java.lang.String> map) {
        C6795aWC.AEQbTJ("Monitor.Device", (Function0<Unit>) new Function0() { // from class: o.aWw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6833aWo.AYXKKw(map);
            }
        });
    }

    public static final Unit AYXKKw(final java.util.Map map) {
        final Ref.LongRef longRef = new Ref.LongRef();
        final Ref.LongRef longRef2 = new Ref.LongRef();
        C6795aWC.forEachLineQuietly$default(AEQbTJ.fARcdN(), null, new Function1() { // from class: o.aWs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6833aWo.copydefault(longRef, map, longRef2, (java.lang.String) obj);
            }
        }, 1, null);
        long j = longRef.element;
        if (j > 0) {
            map.put("system_rate", java.lang.String.valueOf((longRef2.element * 1.0f) / j));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Ref.LongRef longRef, java.util.Map map, Ref.LongRef longRef2, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C59449zhJ.startsWith$default(str, "MemTotal", false, 2, null)) {
            long jKWHzl = C6795aWC.KWHzl(C6795aWC.OLrzqt, str);
            longRef.element = jKWHzl;
            map.put("system_total_mem", java.lang.String.valueOf(jKWHzl));
        } else if (C59449zhJ.startsWith$default(str, "MemFree", false, 2, null)) {
            map.put("system_free_mem", java.lang.String.valueOf(C6795aWC.KWHzl(C6795aWC.copydefault, str)));
        } else if (C59449zhJ.startsWith$default(str, "MemAvailable", false, 2, null)) {
            long jKWHzl2 = C6795aWC.KWHzl(C6795aWC.KWHzl, str);
            longRef2.element = jKWHzl2;
            map.put("system_avail_mem", java.lang.String.valueOf(jKWHzl2));
        } else if (C59449zhJ.startsWith$default(str, "CmaTotal", false, 2, null)) {
            map.put("system_cma_total", java.lang.String.valueOf(C6795aWC.KWHzl(C6795aWC.EZpvd, str)));
        }
        return Unit.INSTANCE;
    }

    public final void djBIcL(final java.util.Map<java.lang.String, java.lang.String> map) {
        C6795aWC.AEQbTJ("Monitor.Device", (Function0<Unit>) new Function0() { // from class: o.aWq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6833aWo.AEQbTJ(map);
            }
        });
    }

    public static final Unit AEQbTJ(final java.util.Map map) {
        C6795aWC.forEachLineQuietly$default(AEQbTJ.hDKMBd(), null, new Function1() { // from class: o.aWv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6833aWo.KWHzl(map, (java.lang.String) obj);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.util.Map map, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C59449zhJ.startsWith$default(str, "VmSize", false, 2, null)) {
            map.put("process_status_vm_size", java.lang.String.valueOf(C6795aWC.KWHzl(C6795aWC.AhwBna, str)));
        } else if (C59449zhJ.startsWith$default(str, "VmRSS", false, 2, null)) {
            map.put("process_status_vm_rss", java.lang.String.valueOf(C6795aWC.KWHzl(C6795aWC.AEQbTJ, str)));
        } else if (C59449zhJ.startsWith$default(str, "Threads", false, 2, null)) {
            map.put("process_status_thread", java.lang.String.valueOf(C6795aWC.KWHzl(C6795aWC.djBIcL, str)));
        }
        return Unit.INSTANCE;
    }

    public final java.util.Map<java.lang.String, java.lang.String> fIwbmz() {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        C6795aWC.AEQbTJ("Monitor.Device", (Function0<Unit>) new Function0() { // from class: o.aWl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6833aWo.copydefault(linkedHashMap);
            }
        });
        return linkedHashMap;
    }

    public static final Unit copydefault(java.util.Map map) {
        C6833aWo c6833aWo = AEQbTJ;
        c6833aWo.gEmmrt(map);
        c6833aWo.djBIcL(map);
        ActivityManager.MemoryInfo memoryInfoDbNXlk = c6833aWo.DbNXlk();
        map.put("low_memory", java.lang.String.valueOf(memoryInfoDbNXlk.lowMemory));
        map.put("totalMem", java.lang.String.valueOf(memoryInfoDbNXlk.totalMem / 1024.0d));
        map.put("availMem", (memoryInfoDbNXlk.availMem / 1024.0d) + " ");
        map.put("threshold", java.lang.String.valueOf(((double) memoryInfoDbNXlk.threshold) / 1024.0d));
        map.put("java_heap_rate", java.lang.String.valueOf(c6833aWo.iwGUEr().OLrzqt()));
        map.put("java_heap_max", java.lang.String.valueOf(r0.AEQbTJ() / 1024.0d));
        map.put("java_heap_free", java.lang.String.valueOf(r0.copydefault() / 1024.0d));
        map.put("java_heap_total", java.lang.String.valueOf(r0.KWHzl() / 1024.0d));
        map.put("java_heap_used", java.lang.String.valueOf(r0.valueOf() / 1024.0d));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("══ Memory Snapshot ══════════════════════");
        sb.append('\n');
        sb.append("Java     : max=" + map.get("java_heap_max") + "kB used=" + map.get("java_heap_used") + "kB rate=" + map.get("java_heap_rate"));
        sb.append('\n');
        sb.append("Process  : VmSize=" + map.get("process_status_vm_size") + "kB VmRSS=" + map.get("process_status_vm_rss") + "kB Threads=" + map.get("process_status_thread"));
        sb.append('\n');
        sb.append("System   : Total=" + map.get("system_total_mem") + "kB Free=" + map.get("system_free_mem") + "kB Avail=" + map.get("system_avail_mem") + "kB rate=" + map.get("system_rate"));
        sb.append('\n');
        sb.append("Android  : lowMem=" + map.get("low_memory") + " threshold=" + map.get("threshold") + "kB");
        pUU.KWHzl("Monitor.Device", sb.toString());
        return Unit.INSTANCE;
    }

    public final C6844aWz fJNWhG() {
        return (C6844aWz) KWHzl.getValue();
    }

    public static final C6844aWz valueOf() {
        C6833aWo c6833aWo = AEQbTJ;
        double d = c6833aWo.DbNXlk().totalMem / 1048576.0d;
        try {
            java.lang.String str = android.os.Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(str, "");
            java.lang.String str2 = android.os.Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            java.lang.String str3 = android.os.Build.DEVICE;
            Intrinsics.checkNotNullExpressionValue(str3, "");
            java.lang.String str4 = android.os.Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(str4, "");
            boolean zIsLowRamDevice = c6833aWo.ejfBZ().isLowRamDevice();
            java.lang.String[] strArr = android.os.Build.SUPPORTED_ABIS;
            Intrinsics.checkNotNullExpressionValue(strArr, "");
            java.lang.String str5 = (java.lang.String) yDV.zsXlph(strArr);
            java.lang.String str6 = str5 == null ? "" : str5;
            java.lang.String str7 = Build.VERSION.RELEASE;
            Intrinsics.checkNotNullExpressionValue(str7, "");
            int i = Build.VERSION.SDK_INT;
            java.lang.String str8 = android.os.Build.ID;
            Intrinsics.checkNotNullExpressionValue(str8, "");
            java.lang.String string = java.util.Locale.getDefault().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            java.lang.String id = TimeZone.getDefault().getID();
            Intrinsics.checkNotNullExpressionValue(id, "");
            return new C6844aWz(str, str2, str3, str4, d, zIsLowRamDevice, str6, null, str7, i, str8, null, null, 0, false, string, id, TimeZone.getDefault().getOffset(java.lang.System.currentTimeMillis()) / 60000, null, null, 817280, null);
        } catch (java.lang.Throwable th) {
            pUU.copydefault("Monitor.Device", "deviceSpecs: " + th);
            return new C6844aWz(null, null, null, null, d, false, null, null, null, 0, null, null, null, 0, false, null, null, 0, null, null, 1048559, null);
        }
    }

    public final C6844aWz AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            android.content.Context applicationContext = context.getApplicationContext();
            java.lang.Object systemService = applicationContext.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            android.util.DisplayMetrics displayMetrics = applicationContext.getResources().getDisplayMetrics();
            C6844aWz c6844aWzFJNWhG = fJNWhG();
            boolean zAhwBna = C34703nhO.AhwBna(applicationContext);
            java.lang.String strKWHzl = C34703nhO.KWHzl(applicationContext);
            Intrinsics.checkNotNullExpressionValue(strKWHzl, "");
            int iCopydefault = C34703nhO.copydefault(applicationContext);
            java.lang.String strValueOf = C34703nhO.valueOf(applicationContext);
            java.lang.String str = strValueOf == null ? "" : strValueOf;
            java.lang.String str2 = displayMetrics.widthPixels + "x" + displayMetrics.heightPixels;
            java.lang.String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
            java.lang.String str3 = networkOperatorName == null ? "" : networkOperatorName;
            java.lang.String networkCountryIso = telephonyManager != null ? telephonyManager.getNetworkCountryIso() : null;
            return c6844aWzFJNWhG.AEQbTJ((231295 & 1) != 0 ? c6844aWzFJNWhG.OLrzqt : null, (231295 & 2) != 0 ? c6844aWzFJNWhG.djBIcL : null, (231295 & 4) != 0 ? c6844aWzFJNWhG.AEQbTJ : null, (231295 & 8) != 0 ? c6844aWzFJNWhG.gEmmrt : null, (231295 & 16) != 0 ? c6844aWzFJNWhG.fIwbmz : AudioStats.AUDIO_AMPLITUDE_NONE, (231295 & 32) != 0 ? c6844aWzFJNWhG.AYXKKw : false, (231295 & 64) != 0 ? c6844aWzFJNWhG.EZpvd : null, (231295 & 128) != 0 ? c6844aWzFJNWhG.AkhnZx : str2, (231295 & 256) != 0 ? c6844aWzFJNWhG.fetchVPNInfo : null, (231295 & 512) != 0 ? c6844aWzFJNWhG.DbNXlk : 0, (231295 & 1024) != 0 ? c6844aWzFJNWhG.values : null, (231295 & 2048) != 0 ? c6844aWzFJNWhG.isConnected : strKWHzl, (231295 & 4096) != 0 ? c6844aWzFJNWhG.ejfBZ : str, (231295 & 8192) != 0 ? c6844aWzFJNWhG.AuCTel : iCopydefault, (231295 & 16384) != 0 ? c6844aWzFJNWhG.AhwBna : zAhwBna, (231295 & 32768) != 0 ? c6844aWzFJNWhG.valueOf : null, (231295 & 65536) != 0 ? c6844aWzFJNWhG.fARcdN : null, (231295 & 131072) != 0 ? c6844aWzFJNWhG.fJNWhG : 0, (231295 & 262144) != 0 ? c6844aWzFJNWhG.copydefault : str3, (231295 & 524288) != 0 ? c6844aWzFJNWhG.KWHzl : networkCountryIso == null ? "" : networkCountryIso);
        } catch (java.lang.Throwable th) {
            pUU.copydefault("Monitor.Device", "getFullSpecs: " + th);
            return fJNWhG();
        }
    }

    public final boolean uzCIH() {
        return ((java.lang.Boolean) copydefault.getValue()).booleanValue();
    }

    public static final boolean values() {
        return AEQbTJ.fJNWhG().ejfBZ() || C54807xWa.AEQbTJ();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.aWo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logBasicInfo$default(C6833aWo c6833aWo, android.content.Context context, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        c6833aWo.KWHzl(context, (Function0<? extends java.util.Map<java.lang.String, java.lang.String>>) function0);
    }

    public final void KWHzl(@NotNull final android.content.Context context, final Function0<? extends java.util.Map<java.lang.String, java.lang.String>> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        C6795aWC.AEQbTJ("Monitor.Device", (Function0<Unit>) new Function0() { // from class: o.aWp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6833aWo.EZpvd(context, function0);
            }
        });
    }

    public static final Unit EZpvd(android.content.Context context, Function0 function0) {
        java.util.Map map;
        C6833aWo c6833aWo = AEQbTJ;
        C6844aWz c6844aWzAEQbTJ = c6833aWo.AEQbTJ(context);
        java.lang.String strOLrzqt = c6844aWzAEQbTJ.OLrzqt();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt)) {
            strOLrzqt = "N/A";
        }
        java.lang.String strAEQbTJ = c6844aWzAEQbTJ.AEQbTJ();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)) {
            strAEQbTJ = "N/A";
        }
        java.lang.String strKWHzl = c6844aWzAEQbTJ.KWHzl();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl)) {
            strKWHzl = "N/A";
        }
        java.lang.String strValues = c6844aWzAEQbTJ.values();
        java.lang.String str = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strValues) ? "N/A" : strValues;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("══ Device Info ════════════════════════════");
        sb.append('\n');
        sb.append("App         : " + c6844aWzAEQbTJ.djBIcL() + " | version=" + c6844aWzAEQbTJ.fIwbmz() + "/" + c6844aWzAEQbTJ.fetchVPNInfo() + " | site=" + C34703nhO.OLrzqt() + " | debug=" + c6844aWzAEQbTJ.fJNWhG());
        sb.append('\n');
        sb.append("Device      : " + c6844aWzAEQbTJ.gEmmrt() + " " + c6844aWzAEQbTJ.valueOf() + " (" + c6844aWzAEQbTJ.EZpvd() + ")");
        sb.append('\n');
        sb.append("System      : Android " + c6844aWzAEQbTJ.AhwBna() + " (SDK " + c6844aWzAEQbTJ.AkhnZx() + ") | ABI=" + c6844aWzAEQbTJ.copydefault() + " | PID=" + android.os.Process.myPid());
        sb.append('\n');
        java.lang.String strAYXKKw = c6844aWzAEQbTJ.AYXKKw();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("Display     : ");
        sb2.append(strAYXKKw);
        sb.append(sb2.toString());
        sb.append('\n');
        sb.append("Network     : carrier=" + strOLrzqt + " | country=" + strAEQbTJ);
        sb.append('\n');
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.String str2 = java.lang.String.format(java.util.Locale.US, "%.2fMB", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(c6844aWzAEQbTJ.DbNXlk())}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        sb.append("Memory      : total=" + str2 + " lowRam=" + c6844aWzAEQbTJ.ejfBZ() + " lowEnd=" + c6833aWo.uzCIH());
        sb.append('\n');
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append("Locale      : ");
        sb3.append(strKWHzl);
        sb.append(sb3.toString());
        sb.append('\n');
        sb.append("Timezone    : " + str + " (offset " + c6844aWzAEQbTJ.isConnected() + "min)");
        sb.append('\n');
        if (function0 != null && (map = (java.util.Map) function0.invoke()) != null) {
            if (!(!map.isEmpty())) {
                map = null;
            }
            if (map != null) {
                sb.append("LastSession : " + CollectionsKt___CollectionsKt.joinToString$default(map.entrySet(), ", ", null, null, 0, null, new Function1() { // from class: o.aWr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C6833aWo.EZpvd((Map.Entry) obj);
                    }
                }, 30, null));
            }
        }
        pUU.KWHzl("Monitor.Device", sb.toString());
        return Unit.INSTANCE;
    }

    public static final java.lang.CharSequence EZpvd(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        return entry.getKey() + ContainerUtils.KEY_VALUE_DELIMITER + entry.getValue();
    }

    public final void AEQbTJ(long j, long j2, double d, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        long j3;
        boolean z;
        Intrinsics.checkNotNullParameter(function1, "");
        ActivityManager.MemoryInfo memoryInfoDbNXlk = DbNXlk();
        long j4 = memoryInfoDbNXlk.availMem - memoryInfoDbNXlk.threshold;
        if (memoryInfoDbNXlk.lowMemory || j4 < j2) {
            j3 = j;
            z = false;
        } else {
            j3 = j;
            z = true;
        }
        long jCopydefault = C56548yJl.copydefault((long) (j3 * d), 1L);
        long jEZpvd = iwGUEr().EZpvd();
        boolean z2 = jEZpvd >= jCopydefault;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("sysDeltaMB=" + (j4 / 1048576.0d) + " | ");
        sb.append("thresholdMB=" + (((double) memoryInfoDbNXlk.threshold) / 1048576.0d) + " | ");
        sb.append("availMB=" + (((double) memoryInfoDbNXlk.availMem) / 1048576.0d) + " | ");
        sb.append("headRoomMB=" + (((double) jEZpvd) / 1048576.0d) + " | ");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("needMB=");
        sb2.append(((double) jCopydefault) / 1048576.0d);
        sb.append(sb2.toString());
        java.lang.String string = sb.toString();
        boolean z3 = z && z2;
        if (!z3) {
            pUU.copydefault("Monitor.Device", "heavy alloc: " + string);
        }
        function1.invoke(java.lang.Boolean.valueOf(z3));
    }

    /* JADX INFO: renamed from: o.aWo$ActionBar */
    public static final class ActionBar {
        public long AEQbTJ;
        public long KWHzl;
        public long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(0L, 0L, 0L, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long valueOf() {
            return this.AEQbTJ - this.copydefault;
        }

        public ActionBar(long j, long j2, long j3) {
            this.KWHzl = j;
            this.AEQbTJ = j2;
            this.copydefault = j3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r7v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r9v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r11v0 long))
 A[MD:(long, long, long):void (m)] (LINE:398) call: o.aWo.ActionBar.<init>(long, long, long):void type: THIS */
        public /* synthetic */ ActionBar(long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3);
        }

        public final float OLrzqt() {
            if (this.KWHzl > 0) {
                return valueOf() / this.KWHzl;
            }
            return 0.0f;
        }

        public final long EZpvd() {
            return C56548yJl.copydefault(this.KWHzl - valueOf(), 0L);
        }
    }
}

package o;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.network.okg.log.NetEventAnalysisParamProxy;
import com.okinc.network.okg.log.NetEventData;
import java.security.MessageDigest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rnZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43346rnZ {
    public static long OLrzqt;
    public static final C43346rnZ KWHzl = new C43346rnZ();
    public static volatile boolean EZpvd = true;
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault(long j) {
        return j - OLrzqt <= 3600000;
    }

    private C43346rnZ() {
    }

    public final java.lang.String AEQbTJ() {
        boolean zAEQbTJ = C43371rny.OLrzqt.AEQbTJ();
        boolean zAhwBna = C43396roW.EZpvd().AhwBna();
        return (zAEQbTJ || zAhwBna) ? (zAEQbTJ || !zAhwBna) ? (!zAEQbTJ || zAhwBna) ? "3" : "2" : "1" : "0";
    }

    public final void OLrzqt(@NotNull android.content.Context context, boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        if (C43453rpa.AEQbTJ.KWHzl(context) && C43292rmY.OLrzqt.AuCTel()) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (copydefault(jCurrentTimeMillis)) {
                OLrzqt = jCurrentTimeMillis;
                if (z) {
                    AEQbTJ(str);
                } else {
                    copydefault(str, str2, str3, str4, str5);
                }
            }
        }
    }

    public final void AEQbTJ(java.lang.String str) {
        java.util.ArrayList<NetEventAnalysisParamProxy> arrayList = new java.util.ArrayList<>();
        arrayList.add(new NetEventAnalysisParamProxy("code", "0", true));
        arrayList.add(new NetEventAnalysisParamProxy("ip", str, false));
        arrayList.add(new NetEventAnalysisParamProxy("proxy", AEQbTJ(), true));
        Function2<java.lang.String, java.util.ArrayList<NetEventAnalysisParamProxy>, Unit> function2AubY = C43292rmY.OLrzqt.AubY();
        if (function2AubY != null) {
            function2AubY.invoke("doh_event", arrayList);
        }
    }

    public final void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "CustomCanceledException")) {
            pUU.valueOf("netLogReport", "网络请求Canceled，不上报");
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "InterruptedIOException")) {
            pUU.valueOf("netLogReport", "InterruptedIOException，不上报");
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "ConnectException")) {
            pUU.valueOf("netLogReport", "无网络，不上报");
            return;
        }
        java.util.ArrayList<NetEventAnalysisParamProxy> arrayList = new java.util.ArrayList<>();
        arrayList.add(new NetEventAnalysisParamProxy("code", str2, true));
        arrayList.add(new NetEventAnalysisParamProxy("region", EZpvd ? "0" : "1", true));
        arrayList.add(new NetEventAnalysisParamProxy("ip", str, false));
        arrayList.add(new NetEventAnalysisParamProxy("proxy", AEQbTJ(), true));
        arrayList.add(new NetEventAnalysisParamProxy("index", str4, false));
        arrayList.add(new NetEventAnalysisParamProxy(CrashHianalyticsData.TIME, str3, false));
        arrayList.add(new NetEventAnalysisParamProxy(EopTrackEvent.KEY_ERROR_MSG_HUMP, str5, false));
        Function2<java.lang.String, java.util.ArrayList<NetEventAnalysisParamProxy>, Unit> function2AubY = C43292rmY.OLrzqt.AubY();
        if (function2AubY != null) {
            function2AubY.invoke("doh_event", arrayList);
        }
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, DohTypeEnum dohTypeEnum) {
        Intrinsics.checkNotNullParameter(str, "");
        if (dohTypeEnum == null) {
            dohTypeEnum = DohTypeEnum.HTTP;
        }
        java.util.ArrayList<java.lang.String> arrayListKWHzl = C43372rnz.copydefault.KWHzl(dohTypeEnum, str);
        if (arrayListKWHzl.isEmpty()) {
            return "";
        }
        java.lang.String str2 = arrayListKWHzl.get(0);
        Intrinsics.copydefault((java.lang.Object) str2);
        return str2;
    }

    public final java.lang.String KWHzl(@NotNull NetEventData netEventData) {
        Intrinsics.checkNotNullParameter(netEventData, "");
        return EZpvd(netEventData.getDest_domain(), netEventData.getDohType());
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        MessageDigest messageDigest;
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        try {
            messageDigest = MessageDigest.getInstance("SHA-1");
        } catch (java.security.NoSuchAlgorithmException e) {
            e.printStackTrace();
            messageDigest = null;
        }
        Intrinsics.copydefault(messageDigest);
        return android.util.Base64.encodeToString(messageDigest.digest(bytes), 2);
    }

    public final java.lang.String AEQbTJ(@NotNull NetEventData netEventData) {
        Intrinsics.checkNotNullParameter(netEventData, "");
        return KWHzl(netEventData.getDest_domain(), netEventData.getDohType());
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, DohTypeEnum dohTypeEnum) {
        java.lang.String host$default;
        Intrinsics.checkNotNullParameter(str, "");
        if (dohTypeEnum == null) {
            dohTypeEnum = DohTypeEnum.HTTP;
        }
        C43372rnz c43372rnz = C43372rnz.copydefault;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c43372rnz.EZpvd(dohTypeEnum))) {
            host$default = C43372rnz.getHost$default(c43372rnz, dohTypeEnum, false, null, 4, null);
            java.lang.String strEZpvd = c43372rnz.EZpvd(dohTypeEnum, true);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd)) {
                Intrinsics.copydefault((java.lang.Object) strEZpvd);
                host$default = strEZpvd;
            }
        } else {
            host$default = null;
        }
        return host$default == null ? str : host$default;
    }
}

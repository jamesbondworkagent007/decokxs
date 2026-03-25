package o;

import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.core.util.SPUtils;
import com.okinc.impact.net.AppOpenReq;
import com.okinc.impact.net.OKImpactResponse;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oJI extends AbstractC43215rlA implements kOG {
    private static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public InterfaceC58217yxC OLrzqt;
    public final ConcurrentHashMap<java.lang.String, java.lang.String> copydefault = new ConcurrentHashMap<>();

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oJI.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.kOG
    public void KWHzl() {
        if (EZpvd()) {
            return;
        }
        if (copydefault()) {
            AEQbTJ();
        } else {
            OLrzqt();
        }
    }

    @Override // o.kOG
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "okg.sjv.io", false, 2, (java.lang.Object) null)) {
            copydefault(str);
        }
    }

    @Override // o.kOG
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C43246rlf.OLrzqt.valueOf().getSharedPreferences("invite_attribution", 0).edit().putString("affiliate_channelId", str).apply();
        pUU.EZpvd("growth_impact", "save affiliate channel id success:: " + str);
    }

    @Override // o.kOG
    public void EZpvd(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (!map.isEmpty()) {
            SPUtils.put("koc_utm_values", C33488mxR.KWHzl().toJson(map));
        }
        pUU.EZpvd("growth_impact", "save koc baggage values  success");
    }

    public final boolean EZpvd() {
        return SPUtils.getBoolean("impact_post_install", false);
    }

    public final void OLrzqt() {
        SPUtils.put("impact_post_install", java.lang.Boolean.TRUE);
    }

    public final void AEQbTJ() {
        InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(C33024moe.KWHzl((AbstractC58185ywX) oJM.Companion.AEQbTJ().EZpvd()), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.oJN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oJI.KWHzl(this.copydefault, (OKImpactResponse) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.oJP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                oJI.djBIcL(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.oJQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oJI.AEQbTJ(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        this.OLrzqt = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.oJO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                oJI.AYXKKw(function12, obj);
            }
        });
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(oJI oji, OKImpactResponse oKImpactResponse) {
        oji.OLrzqt();
        Intrinsics.copydefault(oKImpactResponse);
        oji.OLrzqt(oKImpactResponse);
        oji.OLrzqt = null;
        pUU.EZpvd("growth_impact", "upload install api success");
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(oJI oji, java.lang.Throwable th) {
        pUU.EZpvd("growth_impact", "upload install api failed " + (th != null ? th.getMessage() : null));
        oji.OLrzqt = null;
        return Unit.INSTANCE;
    }

    public final void copydefault(final java.lang.String str) {
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(C33024moe.KWHzl((AbstractC58185ywX) oJM.Companion.AEQbTJ().OLrzqt(new AppOpenReq(str))), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.oJK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oJI.AEQbTJ(this.copydefault, str, (OKImpactResponse) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.oJL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                oJI.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.oJH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oJI.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.oJJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                oJI.valueOf(function12, obj);
            }
        });
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(oJI oji, java.lang.String str, OKImpactResponse oKImpactResponse) {
        Intrinsics.copydefault(oKImpactResponse);
        oji.OLrzqt(oKImpactResponse);
        pUU.EZpvd("growth_impact", "upload page load api success url:" + str);
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        pUU.EZpvd("growth_impact", "upload page load api failed " + (th != null ? th.getMessage() : null));
        return Unit.INSTANCE;
    }

    public final boolean copydefault() {
        try {
            android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - applicationOLrzqt.getPackageManager().getPackageInfo(applicationOLrzqt.getPackageName(), 0).firstInstallTime;
            if (jCurrentTimeMillis >= 0) {
                return jCurrentTimeMillis < java.util.concurrent.TimeUnit.MINUTES.toMillis(30L);
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public final void OLrzqt(OKImpactResponse oKImpactResponse) {
        java.lang.String strJoinToString$default;
        java.util.Map<java.lang.String, java.lang.String> headers = oKImpactResponse.getHeaders();
        if (headers == null || headers.isEmpty()) {
            strJoinToString$default = "";
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(headers.size());
            for (Map.Entry<java.lang.String, java.lang.String> entry : headers.entrySet()) {
                arrayList.add(entry.getKey() + ContainerUtils.KEY_VALUE_DELIMITER + entry.getValue());
            }
            strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
        }
        EZpvd(strJoinToString$default);
        pUU.EZpvd("growth_impact", "save baggage success:: " + strJoinToString$default);
        java.lang.String channelId = oKImpactResponse.getChannelId();
        java.lang.String str = channelId != null ? channelId : "";
        C43246rlf.OLrzqt.valueOf().getSharedPreferences("invite_attribution", 0).edit().putString("impactChannelId", str).apply();
        pUU.EZpvd("growth_impact", "save handle id success:: " + str);
    }

    public final void EZpvd(java.lang.String str) {
        SPUtils.put("impact_okts_baggage", str);
    }
}

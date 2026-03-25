package o;

import com.just.agentweb.DefaultWebClient;
import com.okinc.network.okg.core.ThreadPoolType;
import com.okinc.network.proxy.SafeProxySelector;
import java.net.UnknownHostException;
import kotlin.Triple;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Dns;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rnx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43370rnx {
    public static final int AEQbTJ;
    public static final OkHttpClient.Builder KWHzl;
    public static final C43370rnx copydefault = new C43370rnx();

    private C43370rnx() {
    }

    static {
        OkHttpClient.Builder builderAddInterceptor = new OkHttpClient.Builder().dispatcher(C43357rnk.KWHzl.copydefault(ThreadPoolType.DOH)).addInterceptor(new C43335rnO(1, new Function1() { // from class: o.rnw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C43370rnx.AEQbTJ((java.lang.String) obj));
            }
        }));
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        KWHzl = builderAddInterceptor.callTimeout(5L, timeUnit).readTimeout(5L, timeUnit).proxySelector(new SafeProxySelector(null, 1, null));
        AEQbTJ = 8;
    }

    public static final boolean AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "okx", false, 2, (java.lang.Object) null);
    }

    public static /* synthetic */ boolean checkHostHttpCanConn$OKNetwork_network$default(C43370rnx c43370rnx, java.lang.String str, java.util.ArrayList arrayList, java.lang.String str2, OkHttpClient.Builder builder, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            builder = KWHzl;
        }
        return c43370rnx.KWHzl(str, arrayList, str2, builder);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final boolean KWHzl(@NotNull java.lang.String str, @NotNull java.util.ArrayList<java.lang.String> arrayList, @NotNull java.lang.String str2, @NotNull OkHttpClient.Builder builder) {
        Triple triple;
        java.lang.String str3;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(builder, "");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str4 = str2 + "_HttpCheck";
        java.lang.String str5 = DefaultWebClient.HTTPS_SCHEME + str + "/isavailable";
        java.lang.String strCopydefault = C43384roK.KWHzl.copydefault();
        pUU.KWHzl(str4, "checkHostHttpCanConn, start. url: " + str5 + ", dnsIps:" + arrayList + ", ua: " + strCopydefault);
        builder.dns(new TaskDescription(arrayList, str, str4));
        OkHttpClient okHttpClientBuild = C43398roY.copydefault.AEQbTJ(builder).build();
        Request.Builder builderUrl = new Request.Builder().url(str5);
        java.lang.String strCopydefault2 = xVW.copydefault();
        Intrinsics.checkNotNullExpressionValue(strCopydefault2, "");
        try {
            Response responseExecute = okHttpClientBuild.newCall(builderUrl.addHeader("devId", strCopydefault2).addHeader("user-agent", strCopydefault).build()).execute();
            try {
                if (responseExecute.body() != null && responseExecute.code() == 200) {
                    triple = new Triple(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(responseExecute.code()), null);
                } else {
                    triple = new Triple(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(responseExecute.code()), null);
                }
                yFA.copydefault(responseExecute, null);
            } finally {
            }
        } catch (java.lang.Exception e) {
            triple = new Triple(java.lang.Boolean.FALSE, -1, e);
        }
        boolean zBooleanValue = ((java.lang.Boolean) triple.component1()).booleanValue();
        int iIntValue = ((java.lang.Number) triple.component2()).intValue();
        java.lang.Exception exc = (java.lang.Exception) triple.component3();
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis() - jCurrentTimeMillis;
        if (zBooleanValue) {
            pUU.KWHzl(str4, "checkHostHttpCanConn success. url: " + str5 + ", ips:" + arrayList + ", cost:" + jCurrentTimeMillis2);
        } else {
            if (exc != null) {
                str3 = "exception:" + exc;
            } else {
                str3 = "responseCode:" + iIntValue;
            }
            pUU.KWHzl(str4, "checkHostHttpCanConn fail. url: " + str5 + ", ips:" + arrayList + ", " + str3 + ", cost:" + jCurrentTimeMillis2);
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: o.rnx$TaskDescription */
    public static final class TaskDescription implements Dns {
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ java.util.ArrayList<java.lang.String> KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;

        public TaskDescription(java.util.ArrayList<java.lang.String> arrayList, java.lang.String str, java.lang.String str2) {
            this.KWHzl = arrayList;
            this.EZpvd = str;
            this.OLrzqt = str2;
        }

        @Override // okhttp3.Dns
        public java.util.List<java.net.InetAddress> lookup(java.lang.String str) throws UnknownHostException {
            Intrinsics.checkNotNullParameter(str, "");
            if ((!this.KWHzl.isEmpty()) && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.EZpvd)) {
                if (!C43365rns.OLrzqt.OLrzqt(this.KWHzl)) {
                    pUU.valueOf(this.OLrzqt, "checkHostHttpCanConn host = " + str + " dnsIp = " + this.KWHzl);
                    Dns dns = Dns.SYSTEM;
                    java.lang.String str2 = this.KWHzl.get(0);
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    return dns.lookup(str2);
                }
                pUU.KWHzl(this.OLrzqt, "checkHostHttpCanConn DNS working ip = " + this.KWHzl + " host = " + str);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator<java.lang.String> it = this.KWHzl.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "");
                while (it.hasNext()) {
                    java.lang.String next = it.next();
                    Intrinsics.checkNotNullExpressionValue(next, "");
                    java.net.InetAddress[] allByName = java.net.InetAddress.getAllByName(next);
                    Intrinsics.checkNotNullExpressionValue(allByName, "");
                    arrayList.addAll(yDT.fIwbmz(allByName));
                }
                return arrayList;
            }
            pUU.valueOf(this.OLrzqt, "DNS invalidate，host = " + str);
            return Dns.SYSTEM.lookup(str);
        }
    }
}

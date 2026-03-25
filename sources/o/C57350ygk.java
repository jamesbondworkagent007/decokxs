package o;

import androidx.core.os.EnvironmentCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.reflect.TypeToken;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.dns.DomainsUtils;
import com.okinc.network.okg.dns.model.DoHChain;
import com.okinc.network.okg.log.NetEventLogListener;
import com.okinc.network.okg.unifieddomain.DomainType;
import com.okinc.okuser.data.Token;
import com.okinc.web.WebDohOOMError2;
import com.okinc.web.WebStringEnum;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import o.C57348ygi;
import okhttp3.Cache;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ygk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57350ygk {
    public java.lang.String AhwBna;
    public SubdomainStrategy fARcdN;
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public static java.lang.String EZpvd = "";
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.ygs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C57350ygk.KWHzl();
        }
    });
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.ygr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C57350ygk.valueOf(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.ygt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C57350ygk.AhwBna(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm AuCTel = C56392yDr.copydefault(new Function0() { // from class: o.ygq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C57350ygk.AYXKKw(this.KWHzl);
        }
    });
    public final C34787niz ejfBZ = new C34787niz();
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.ygp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C57350ygk.AEQbTJ();
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.ygu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C57350ygk.djBIcL(this.copydefault);
        }
    });
    public final java.lang.String AEQbTJ = "AJAXINTERCEPT";
    public final java.lang.String OLrzqt = "_file_tag";
    public boolean AkhnZx = true;
    public ConcurrentHashMap<java.lang.String, java.lang.String> fetchVPNInfo = new ConcurrentHashMap<>();
    public ConcurrentHashMap<java.lang.String, android.net.Uri> fIwbmz = new ConcurrentHashMap<>();
    public java.lang.String fJNWhG = ExifInterface.GPS_MEASUREMENT_IN_PROGRESS;
    public boolean isConnected = true;
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl = new java.util.HashMap();
    public final java.util.Map<java.lang.String, java.lang.String> gEmmrt = new java.util.HashMap();

    /* JADX INFO: renamed from: o.ygk$StateListAnimator */
    public static final class StateListAnimator extends TypeToken<java.util.HashMap<java.lang.String, java.lang.String>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(java.lang.String str) {
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(SubdomainStrategy subdomainStrategy) {
        this.fARcdN = subdomainStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.AkhnZx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.isConnected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fJNWhG = str;
    }

    /* JADX INFO: renamed from: o.ygk$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ygk.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final android.webkit.CookieManager AhwBna() {
        return (android.webkit.CookieManager) this.DbNXlk.getValue();
    }

    public static final android.webkit.CookieManager KWHzl() {
        pUU.KWHzl("WEB_DNS", "get cookieManager");
        return android.webkit.CookieManager.getInstance();
    }

    public final C57346ygg gEmmrt() {
        return (C57346ygg) this.values.getValue();
    }

    public static final java.lang.String gEmmrt(C57350ygk c57350ygk) {
        java.lang.String str = c57350ygk.AhwBna;
        return str == null ? C57354ygo.OLrzqt.KWHzl().invoke() : str;
    }

    public static final C57346ygg valueOf(final C57350ygk c57350ygk) {
        Function0 function0 = new Function0() { // from class: o.ygv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C57350ygk.gEmmrt(this.EZpvd);
            }
        };
        android.webkit.CookieManager cookieManagerAhwBna = c57350ygk.AhwBna();
        Intrinsics.checkNotNullExpressionValue(cookieManagerAhwBna, "");
        return new C57346ygg(function0, cookieManagerAhwBna);
    }

    public final OkHttpClient.Builder EZpvd() {
        return (OkHttpClient.Builder) this.AYXKKw.getValue();
    }

    public static final OkHttpClient.Builder AhwBna(C57350ygk c57350ygk) {
        return new OkHttpClient.Builder().cache(new Cache(new java.io.File(C32979mnm.EZpvd.OLrzqt().getCacheDir(), "web_doh_cache"), 10485760L)).eventListenerFactory(NetEventLogListener.Companion.OLrzqt(C43292rmY.OLrzqt.DbNXlk(), NetEventLogListener.Companion.RequestType.WEBVIEW)).dns(new C43336rnP()).cookieJar(c57350ygk.gEmmrt()).followRedirects(false);
    }

    public final OkHttpClient fetchVPNInfo() {
        return (OkHttpClient) this.AuCTel.getValue();
    }

    public static final OkHttpClient AYXKKw(C57350ygk c57350ygk) {
        OkHttpClient.Builder builderAEQbTJ = C43398roY.copydefault.AEQbTJ(c57350ygk.EZpvd().addInterceptor(new C57349ygj()).addInterceptor(new C6886aXo()).addInterceptor(C43341rnU.EZpvd).addInterceptor(new C43400roa()).addInterceptor(C6851aXF.EZpvd).addInterceptor(new C57347ygh()));
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        java.lang.Object objBuild = builderAEQbTJ.connectTimeout(60L, timeUnit).readTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).build();
        java.util.Iterator<T> it = C57309yfw.AEQbTJ.djBIcL().iterator();
        while (it.hasNext()) {
            objBuild = ((Function1) it.next()).invoke(objBuild);
        }
        return (OkHttpClient) objBuild;
    }

    public final OkHttpClient.Builder AYXKKw() {
        return (OkHttpClient.Builder) this.djBIcL.getValue();
    }

    public static final OkHttpClient.Builder AEQbTJ() {
        return new OkHttpClient.Builder().cache(new Cache(new java.io.File(C32979mnm.EZpvd.OLrzqt().getCacheDir(), "web_cdn_cache"), 10485760L)).eventListenerFactory(NetEventLogListener.Companion.OLrzqt(C43292rmY.OLrzqt.DbNXlk(), NetEventLogListener.Companion.RequestType.WEBVIEW));
    }

    public final OkHttpClient valueOf() {
        return (OkHttpClient) this.valueOf.getValue();
    }

    public static final OkHttpClient djBIcL(C57350ygk c57350ygk) {
        OkHttpClient.Builder builderAEQbTJ = C43398roY.copydefault.AEQbTJ(c57350ygk.AYXKKw());
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        java.lang.Object objBuild = builderAEQbTJ.connectTimeout(60L, timeUnit).readTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).build();
        java.util.Iterator<T> it = C57309yfw.AEQbTJ.djBIcL().iterator();
        while (it.hasNext()) {
            objBuild = ((Function1) it.next()).invoke(objBuild);
        }
        return (OkHttpClient) objBuild;
    }

    public final void djBIcL(java.lang.String str) {
        this.fARcdN = C57354ygo.OLrzqt.EZpvd(str);
    }

    public final boolean AEQbTJ(@NotNull android.net.Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        return this.fIwbmz.containsValue(uri);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull android.net.Uri uri) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(uri, "");
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "/", false, 2, (java.lang.Object) null)) {
            java.lang.String strSubstring = str.substring(StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) str, "/", 0, false, 6, (java.lang.Object) null) + 1, str.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            pUU.valueOf("WEB_DNS", "addFilePath fileName = " + strSubstring + " path = " + str);
            this.fetchVPNInfo.put(strSubstring, str);
            this.fIwbmz.put(strSubstring, uri);
            return;
        }
        pUU.valueOf("WEB_DNS", "addFilePath path = " + str);
        this.fetchVPNInfo.put(str, str);
        this.fIwbmz.put(str, uri);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.fetchVPNInfo.get(str);
    }

    public final android.net.Uri copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.fIwbmz.get(str);
    }

    public final java.lang.String copydefault(android.content.Context context) {
        if (!android.text.TextUtils.isEmpty(EZpvd)) {
            return EZpvd;
        }
        java.io.File file = new java.io.File(OLrzqt(context), "doh-web-cache");
        try {
            if (!file.exists()) {
                file.mkdirs();
            }
        } catch (java.lang.Throwable unused) {
            pUU.copydefault("WEB_DNS", "create dir exception");
        }
        pUU.valueOf("WEB_DNS", "path:" + file.getAbsolutePath());
        java.lang.String absolutePath = file.getAbsolutePath();
        EZpvd = absolutePath;
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        return absolutePath;
    }

    public final java.lang.String OLrzqt(android.content.Context context) {
        java.io.File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null || !Intrinsics.EZpvd((java.lang.Object) "mounted", (java.lang.Object) EnvironmentCompat.getStorageState(externalCacheDir))) {
            return null;
        }
        return externalCacheDir.getAbsolutePath();
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final java.io.File copydefault(android.content.Context context, android.net.Uri uri, java.lang.String str) throws java.io.IOException {
        java.io.File file = new java.io.File(copydefault(context), str);
        try {
            java.io.InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                Intrinsics.copydefault(inputStreamOpenInputStream);
                OLrzqt(inputStreamOpenInputStream, file);
                Unit unit = Unit.INSTANCE;
                yFA.copydefault(inputStreamOpenInputStream, null);
            } finally {
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("WEB_DNS", "getFileFromUri " + e);
        }
        pUU.copydefault("WEB_DNS", "getFileFromUri success fileName=" + str);
        return file;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void OLrzqt(java.io.InputStream inputStream, java.io.File file) {
        java.io.FileOutputStream fileOutputStream;
        byte[] bArr;
        if (file != null) {
            try {
                fileOutputStream = new java.io.FileOutputStream(file);
                try {
                    bArr = new byte[4096];
                } finally {
                }
            } catch (java.lang.Exception e) {
                pUU.copydefault("WEB_DNS", "createFileFromStream " + e);
                return;
            }
            while (true) {
                int i = inputStream.read(bArr);
                if (i > 0) {
                    fileOutputStream.write(bArr, 0, i);
                } else {
                    fileOutputStream.flush();
                    Unit unit = Unit.INSTANCE;
                    yFA.copydefault(fileOutputStream, null);
                    return;
                }
                pUU.copydefault("WEB_DNS", "createFileFromStream " + e);
                return;
            }
        }
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        java.util.List<java.lang.String> listSplit;
        java.lang.String[] strArr;
        if (str == null || (listSplit = new Regex(";").split(str, 0)) == null || (strArr = (java.lang.String[]) listSplit.toArray(new java.lang.String[0])) == null) {
            return null;
        }
        return strArr[0];
    }

    public final java.lang.String djBIcL() {
        return "env/" + (C34703nhO.AhwBna(C32979mnm.EZpvd.OLrzqt()) ? "D" : com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW) + this.fJNWhG + "1";
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [370=4] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0160 A[Catch: Exception -> 0x0054, OutOfMemoryError -> 0x0058, TryCatch #0 {OutOfMemoryError -> 0x0058, blocks: (B:4:0x0015, B:7:0x0024, B:10:0x002b, B:16:0x005b, B:18:0x0092, B:23:0x00a2, B:24:0x00b6, B:27:0x00c1, B:29:0x00d7, B:31:0x00dd, B:33:0x010c, B:36:0x0145, B:38:0x0160, B:35:0x0130, B:40:0x0171, B:42:0x0181, B:43:0x0189, B:45:0x0195, B:49:0x019e, B:51:0x01a4, B:53:0x01aa, B:54:0x01ad, B:56:0x01b1, B:58:0x01b7, B:60:0x01c2, B:67:0x0220, B:69:0x022c, B:71:0x0246, B:70:0x0243, B:72:0x024b, B:74:0x026d, B:77:0x0274, B:80:0x027b, B:82:0x0281, B:84:0x02b4, B:85:0x02bc, B:87:0x02c2, B:89:0x02d9, B:91:0x0305, B:94:0x030e, B:96:0x0314, B:99:0x031a, B:101:0x032a, B:103:0x035a, B:105:0x0361, B:107:0x036f, B:109:0x0377, B:110:0x037f, B:112:0x0391, B:115:0x0398, B:117:0x03a3, B:119:0x03ab, B:120:0x03b3, B:122:0x03cd, B:124:0x03e6, B:125:0x03ea, B:147:0x0436, B:149:0x0445, B:150:0x0450, B:152:0x047a, B:153:0x0482, B:155:0x048e, B:156:0x04b3, B:160:0x04bb, B:162:0x04e5, B:164:0x04ec, B:166:0x04f4, B:168:0x04fa, B:169:0x050a, B:171:0x0510, B:172:0x0526, B:174:0x0537, B:177:0x053e, B:163:0x04e9, B:127:0x03ef, B:130:0x03f8, B:132:0x03fe, B:133:0x0402, B:134:0x0408, B:137:0x0412, B:138:0x0416, B:141:0x0420, B:142:0x0424, B:145:0x042e, B:123:0x03d4, B:62:0x01d5, B:65:0x020c), top: B:188:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.webkit.WebResourceResponse copydefault(final C57314ygA c57314ygA) {
        java.lang.OutOfMemoryError outOfMemoryError;
        java.lang.String strInvoke;
        java.lang.String str;
        java.lang.String str2;
        boolean z;
        java.lang.String str3;
        RequestBody requestBodyCreate;
        java.util.Iterator it;
        java.lang.String str4;
        java.lang.Boolean boolValueOf;
        java.lang.String name;
        C57348ygi.Application applicationKWHzl;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String lowerCase;
        java.lang.String str8 = "OPTIONS";
        java.lang.String str9 = "okb_fixed_domain";
        java.lang.String str10 = "User-Agent";
        try {
            try {
            } catch (java.lang.Exception e) {
                java.lang.String string = c57314ygA.getUrl().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                pUU.AEQbTJ("WEB_DNS", string, e);
                java.lang.String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                final java.lang.String str11 = message;
                C32866mlf.EZpvd("okweb_request_error", new TrackChannel[]{TrackChannel.OKStatistics}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ygl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C57350ygk.copydefault(c57314ygA, e, str11, (EventParamsList) obj);
                    }
                });
                java.lang.String string2 = java.nio.charset.Charset.defaultCharset().toString();
                java.util.Map mapKWHzl = C56424yEw.KWHzl();
                java.nio.charset.Charset charsetDefaultCharset = java.nio.charset.Charset.defaultCharset();
                Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "");
                byte[] bytes = str11.getBytes(charsetDefaultCharset);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                return new android.webkit.WebResourceResponse("text/plain", string2, 503, str11, mapKWHzl, new java.io.ByteArrayInputStream(bytes));
            }
        } catch (java.lang.OutOfMemoryError e2) {
            outOfMemoryError = e2;
        }
        try {
            java.lang.String string3 = c57314ygA.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "");
            if (!C43341rnU.EZpvd(string3) && !C57354ygo.AEQbTJ(string3)) {
                pUU.valueOf("WEB_DNS", "不拦截 " + string3 + " " + c57314ygA.getMethod() + " " + c57314ygA.KWHzl());
                return null;
            }
            pUU.valueOf("WEB_DNS", string3 + " " + c57314ygA.getMethod() + " " + c57314ygA.KWHzl());
            Request.Builder builder = new Request.Builder();
            builder.url(string3);
            java.util.Map<java.lang.String, java.lang.String> requestHeaders = c57314ygA.getRequestHeaders();
            Function1<WebStringEnum, java.lang.String> function1Values = C57309yfw.AEQbTJ.values();
            if (function1Values == null || (strInvoke = function1Values.invoke(WebStringEnum.FIXED_LINK_SHARE)) == null) {
                strInvoke = "";
            }
            java.lang.String str12 = requestHeaders.get("User-Agent");
            builder.header("okb_fixed_domain", strInvoke);
            Intrinsics.copydefault(requestHeaders);
            java.util.Iterator<Map.Entry<java.lang.String, java.lang.String>> it2 = requestHeaders.entrySet().iterator();
            java.lang.String value = "";
            while (true) {
                str = "content-type";
                str2 = str9;
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<java.lang.String, java.lang.String> next = it2.next();
                java.lang.String str13 = strInvoke;
                if (C59449zhJ.gEmmrt(next.getKey(), str10, true) && C57354ygo.OLrzqt(string3)) {
                    java.lang.String value2 = next.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "");
                    str7 = string3;
                    str5 = str8;
                    str6 = str10;
                    if (!C59449zhJ.startsWith$default(value2, C57309yfw.AEQbTJ.AYXKKw() + "-", false, 2, null)) {
                        str12 = C43384roK.KWHzl.valueOf() + " " + ((java.lang.Object) next.getValue());
                    }
                    java.lang.String key = next.getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "");
                    java.util.Locale locale = java.util.Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    lowerCase = key.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (!Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "content-type")) {
                        value = next.getValue();
                    }
                    str9 = str2;
                    string3 = str7;
                    strInvoke = str13;
                    str8 = str5;
                    str10 = str6;
                } else {
                    str5 = str8;
                    str6 = str10;
                    str7 = string3;
                }
                java.lang.String key2 = next.getKey();
                Intrinsics.checkNotNullExpressionValue(key2, "");
                java.lang.String value3 = next.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "");
                builder.header(key2, value3);
                java.lang.String key3 = next.getKey();
                Intrinsics.checkNotNullExpressionValue(key3, "");
                java.util.Locale locale2 = java.util.Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale2, "");
                lowerCase = key3.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (!Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "content-type")) {
                }
                str9 = str2;
                string3 = str7;
                strInvoke = str13;
                str8 = str5;
                str10 = str6;
            }
            java.lang.String str14 = str8;
            java.lang.String str15 = str10;
            java.lang.String str16 = strInvoke;
            java.lang.String strCopydefault = xVW.copydefault();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strCopydefault)) {
                Intrinsics.copydefault((java.lang.Object) strCopydefault);
                builder.header("Devid", strCopydefault);
            }
            Token tokenAhwBna = C43292rmY.OLrzqt.AwvSrB().AhwBna();
            java.lang.String value4 = tokenAhwBna != null ? tokenAhwBna.getValue() : null;
            if (value4 == null) {
                value4 = "";
            }
            if (!requestHeaders.containsKey("Authorization") && C33129mqd.OLrzqt((java.lang.CharSequence) value4)) {
                builder.addHeader("Authorization", value4);
            }
            if (this.fARcdN != null && !requestHeaders.containsKey("Subdomain-Strategy")) {
                builder.addHeader("Subdomain-Strategy", java.lang.String.valueOf(this.fARcdN));
            }
            if (str12 == null || (!C59449zhJ.startsWith$default(str12, C43384roK.KWHzl.AEQbTJ(), false, 2, null))) {
                pUU.KWHzl("WEB_DNS", "replace ua -- method: " + c57314ygA.getMethod() + ", url: " + c57314ygA.getUrl() + ", ua = " + ((java.lang.Object) str12));
                java.lang.String strValueOf = C43384roK.KWHzl.valueOf();
                java.lang.String str17 = str12;
                if (str17 == null) {
                    str17 = "";
                }
                str12 = strValueOf + " " + str17;
            }
            if (str12 != null) {
                builder.header(str15, C34703nhO.AhwBna(C32979mnm.EZpvd.OLrzqt()) ? ((java.lang.Object) str12) + " " + djBIcL() : str12);
            }
            builder.header("Cache-Control", "no-cache");
            java.lang.String method = c57314ygA.getMethod();
            Intrinsics.checkNotNullExpressionValue(method, "");
            java.util.Locale locale3 = java.util.Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale3, "");
            java.lang.String upperCase = method.toUpperCase(locale3);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (!Intrinsics.EZpvd((java.lang.Object) "GET", (java.lang.Object) upperCase)) {
                java.lang.String strKWHzl = c57314ygA.KWHzl();
                if (strKWHzl == null) {
                    strKWHzl = "";
                }
                java.lang.String strEZpvd = c57314ygA.EZpvd();
                if (strEZpvd == null) {
                    strEZpvd = "";
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd)) {
                    java.lang.reflect.Type type = new StateListAnimator().getType();
                    Intrinsics.checkNotNullExpressionValue(type, "");
                    java.util.HashMap map = (java.util.HashMap) C33490mxT.EZpvd(strEZpvd, type);
                    pUU.valueOf("WEB_DNS", "formMap = " + map);
                    MultipartBody.Builder builder2 = new MultipartBody.Builder(null, 1, null);
                    builder2.setType(MultipartBody.FORM);
                    if (map != null) {
                        java.util.Iterator it3 = map.entrySet().iterator();
                        while (it3.hasNext()) {
                            Map.Entry entry = (Map.Entry) it3.next();
                            if (C59449zhJ.endsWith$default((java.lang.String) entry.getValue(), this.OLrzqt, false, 2, null)) {
                                java.lang.String strSubstring = ((java.lang.String) entry.getValue()).substring(0, StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) entry.getValue(), this.OLrzqt, 0, false, 6, (java.lang.Object) null));
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                                java.lang.String strKWHzl2 = KWHzl(strSubstring);
                                java.io.File file = strKWHzl2 != null ? new java.io.File(strKWHzl2) : null;
                                java.lang.String str18 = (strKWHzl2 == null || (applicationKWHzl = C57348ygi.KWHzl(strKWHzl2)) == null) ? null : applicationKWHzl.AEQbTJ;
                                if (file != null) {
                                    boolValueOf = java.lang.Boolean.valueOf(file.canRead());
                                    it = it3;
                                } else {
                                    it = it3;
                                    boolValueOf = null;
                                }
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                str4 = str;
                                sb.append("fileName = ");
                                sb.append(strSubstring);
                                sb.append(" filePath = ");
                                sb.append(strKWHzl2);
                                sb.append(" mimeType = ");
                                sb.append(str18);
                                sb.append(" canRead=");
                                sb.append(boolValueOf);
                                pUU.valueOf("WEB_DNS", sb.toString());
                                if (file == null || !file.canRead()) {
                                    android.net.Uri uriCopydefault = copydefault(strSubstring);
                                    android.app.Application applicationValueOf = C43246rlf.OLrzqt.valueOf();
                                    java.lang.String str19 = (java.lang.String) entry.getKey();
                                    if (file == null || (name = file.getName()) == null) {
                                        name = strSubstring;
                                    }
                                    RequestBody.Companion companion = RequestBody.Companion;
                                    Intrinsics.copydefault(uriCopydefault);
                                    builder2.addFormDataPart(str19, name, companion.create(copydefault(applicationValueOf, uriCopydefault, strSubstring), str18 != null ? MediaType.Companion.parse(str18) : null));
                                } else {
                                    builder2.addFormDataPart((java.lang.String) entry.getKey(), file.getName(), RequestBody.Companion.create(file, str18 != null ? MediaType.Companion.parse(str18) : null));
                                }
                            } else {
                                it = it3;
                                str4 = str;
                                builder2.addFormDataPart((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                            }
                            it3 = it;
                            str = str4;
                        }
                    }
                    str3 = str;
                    requestBodyCreate = builder2.build();
                } else {
                    str3 = "content-type";
                    requestBodyCreate = RequestBody.Companion.create(strKWHzl, MediaType.Companion.parse(value));
                }
                switch (upperCase.hashCode()) {
                    case -531492226:
                        z = true;
                        if (upperCase.equals(str14)) {
                            builder.method(str14, null);
                        }
                        break;
                    case 79599:
                        z = true;
                        if (upperCase.equals("PUT")) {
                            builder.put(requestBodyCreate);
                        }
                        break;
                    case 2461856:
                        z = true;
                        if (upperCase.equals("POST")) {
                            builder.post(requestBodyCreate);
                        }
                        break;
                    case 2012838315:
                        if (!upperCase.equals("DELETE")) {
                            break;
                        } else {
                            if (C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl)) {
                                builder.delete(requestBodyCreate);
                            } else {
                                z = true;
                                Request.Builder.delete$default(builder, null, 1, null);
                            }
                            break;
                        }
                    default:
                        z = true;
                        break;
                }
            } else {
                z = true;
                str3 = "content-type";
            }
            C57354ygo c57354ygo = C57354ygo.OLrzqt;
            android.net.Uri url = c57314ygA.getUrl();
            Intrinsics.checkNotNullExpressionValue(url, "");
            if (c57354ygo.KWHzl(url)) {
                builder.tag(DoHChain.class, DomainsUtils.INSTANCE.getWeb3HttpMain());
            }
            builder.tag(TaskDescription.class, new TaskDescription(c57314ygA.isForMainFrame()));
            Response responseExecute = fetchVPNInfo().newCall(builder.build()).execute();
            Headers headers = responseExecute.headers();
            java.lang.String strDisplayName = headers.get("content-encoding");
            if (strDisplayName == null) {
                strDisplayName = java.nio.charset.Charset.defaultCharset().displayName();
            }
            java.lang.String str20 = str3;
            java.lang.String strEZpvd2 = EZpvd(headers.get(str20));
            if (strEZpvd2 == null) {
                pUU.valueOf("WEB_DNS", c57314ygA.getUrl() + " content-type=" + headers.get(str20) + " mime=null");
                strEZpvd2 = "";
            }
            if (responseExecute.networkResponse() != null) {
                z = false;
            }
            java.lang.String str21 = c57314ygA.getUrl() + " code=" + responseExecute.code() + ", isFromCache=" + z;
            if (responseExecute.isSuccessful()) {
                pUU.valueOf("WEB_DNS", str21);
            } else {
                pUU.copydefault("WEB_DNS", str21);
            }
            ResponseBody responseBodyBody = responseExecute.body();
            android.webkit.WebResourceResponse webResourceResponse = new android.webkit.WebResourceResponse(strEZpvd2, strDisplayName, responseBodyBody != null ? responseBodyBody.byteStream() : null);
            java.util.HashMap map2 = new java.util.HashMap();
            for (Header header : Util.toHeaderList(headers)) {
                map2.put(header.name.utf8(), header.value.utf8());
            }
            map2.put(str2, str16);
            webResourceResponse.setStatusCodeAndReasonPhrase(responseExecute.code(), C33129mqd.OLrzqt((java.lang.CharSequence) responseExecute.message()) ? responseExecute.message() : "empty");
            webResourceResponse.setResponseHeaders(map2);
            return webResourceResponse;
        } catch (java.lang.OutOfMemoryError e3) {
            outOfMemoryError = e3;
            long j = 1024;
            float fFreeMemory = (java.lang.Runtime.getRuntime().freeMemory() / j) / 1024.0f;
            float f = (java.lang.Runtime.getRuntime().totalMemory() / j) / 1024.0f;
            float fMaxMemory = (java.lang.Runtime.getRuntime().maxMemory() / j) / 1024.0f;
            pUU.copydefault("WEB_DNS", c57314ygA.getUrl() + " free=" + fFreeMemory + " total=" + f + " max=" + fMaxMemory + " oom=" + outOfMemoryError);
            C6777aVl.Companion.EZpvd(new WebDohOOMError2("url=" + c57314ygA.getUrl() + " free=" + fFreeMemory + " total=" + f + " max=" + fMaxMemory + " oom=" + outOfMemoryError));
            android.net.Uri url2 = c57314ygA.getUrl();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(url2);
            sb2.append(" return null");
            pUU.copydefault("WEB_DNS", sb2.toString());
            return null;
        }
    }

    public static final Unit copydefault(C57314ygA c57314ygA, java.lang.Exception exc, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String string = c57314ygA.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        EventParamsList.put$default(eventParamsList, "url", string, false, 4, null);
        java.lang.String simpleName = exc.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        EventParamsList.put$default(eventParamsList, "exception", simpleName, false, 4, null);
        EventParamsList.put$default(eventParamsList, "msg", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final android.webkit.WebResourceResponse KWHzl(@NotNull android.webkit.WebView webView, @NotNull android.webkit.WebResourceRequest webResourceRequest) {
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(webResourceRequest, "");
        java.lang.String strAEQbTJ = null;
        if (!C34704nhP.copydefault.copydefault() || !this.AkhnZx) {
            return null;
        }
        android.net.Uri url = webResourceRequest.getUrl();
        if (copydefault(webResourceRequest)) {
            strAEQbTJ = AEQbTJ(webResourceRequest);
            strEZpvd = EZpvd(webResourceRequest);
            url = copydefault(webResourceRequest, this.AEQbTJ);
        } else {
            java.lang.String method = webResourceRequest.getMethod();
            Intrinsics.checkNotNullExpressionValue(method, "");
            java.lang.String upperCase = method.toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) "POST")) {
                pUU.valueOf("WEB_DNS", "The request is not xhr, 不拦截 " + url + " " + webResourceRequest.getMethod());
                return null;
            }
            strEZpvd = null;
        }
        android.webkit.WebResourceResponse webResourceResponseCopydefault = copydefault(new C57314ygA(webResourceRequest, strAEQbTJ, url, strEZpvd));
        if (webResourceResponseCopydefault == null) {
            return KWHzl(webResourceRequest);
        }
        android.content.Context context = webView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        java.lang.String string = url.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String method2 = webResourceRequest.getMethod();
        Intrinsics.checkNotNullExpressionValue(method2, "");
        return AEQbTJ(webResourceResponseCopydefault, context, string, method2);
    }

    public final android.webkit.WebResourceResponse KWHzl(@NotNull android.webkit.WebResourceRequest webResourceRequest) {
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(webResourceRequest, "");
        if (!Intrinsics.EZpvd((java.lang.Object) webResourceRequest.getMethod(), (java.lang.Object) "GET")) {
            return null;
        }
        java.lang.String string2 = webResourceRequest.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        if (this.ejfBZ.AEQbTJ()) {
            HttpUrl httpUrl = HttpUrl.Companion.parse(string2);
            if (httpUrl == null) {
                return null;
            }
            string = C43385roL.Companion.EZpvd().copydefault(DomainType.CDN, httpUrl).toString();
        } else {
            string = string2;
        }
        if (Intrinsics.EZpvd((java.lang.Object) string2, (java.lang.Object) string)) {
            return null;
        }
        try {
            pUU.EZpvd("WEB_DNS", "replaceStaticHost: " + string2 + " -> " + string);
            Request.Builder builder = new Request.Builder().get();
            builder.url(string);
            java.util.Map<java.lang.String, java.lang.String> requestHeaders = webResourceRequest.getRequestHeaders();
            Intrinsics.checkNotNullExpressionValue(requestHeaders, "");
            for (Map.Entry<java.lang.String, java.lang.String> entry : requestHeaders.entrySet()) {
                java.lang.String key = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "");
                java.lang.String value = entry.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                builder.header(key, value);
            }
            Response responseExecute = valueOf().newCall(builder.build()).execute();
            if (!responseExecute.isSuccessful()) {
                return null;
            }
            Headers headers = responseExecute.headers();
            java.lang.String strDisplayName = headers.get("content-encoding");
            if (strDisplayName == null) {
                strDisplayName = java.nio.charset.Charset.defaultCharset().displayName();
            }
            java.lang.String strEZpvd = EZpvd(headers.get("content-type"));
            if (strEZpvd == null) {
                pUU.valueOf("WEB_DNS", webResourceRequest.getUrl() + " content-type=" + headers.get("content-type") + " mime=null");
            } else {
                str = strEZpvd;
            }
            ResponseBody responseBodyBody = responseExecute.body();
            android.webkit.WebResourceResponse webResourceResponse = new android.webkit.WebResourceResponse(str, strDisplayName, responseBodyBody != null ? responseBodyBody.byteStream() : null);
            java.util.HashMap map = new java.util.HashMap();
            for (Header header : Util.toHeaderList(headers)) {
                map.put(header.name.utf8(), header.value.utf8());
            }
            webResourceResponse.setStatusCodeAndReasonPhrase(responseExecute.code(), C33129mqd.OLrzqt((java.lang.CharSequence) responseExecute.message()) ? responseExecute.message() : "empty");
            webResourceResponse.setResponseHeaders(map);
            return webResourceResponse;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("WEB_DNS", "replaceStaticHost error", e);
            return null;
        }
    }

    public final void copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.put(str, str2);
    }

    public final void EZpvd(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt.put(str, str2);
    }

    public final java.lang.String AEQbTJ(android.webkit.WebResourceRequest webResourceRequest) {
        if (webResourceRequest.getMethod().equals("OPTIONS")) {
            return null;
        }
        return OLrzqt(OLrzqt(webResourceRequest));
    }

    public final java.lang.String EZpvd(android.webkit.WebResourceRequest webResourceRequest) {
        return AEQbTJ(OLrzqt(webResourceRequest));
    }

    public final boolean copydefault(android.webkit.WebResourceRequest webResourceRequest) {
        java.lang.String string = webResourceRequest.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) string, (java.lang.CharSequence) this.AEQbTJ, false, 2, (java.lang.Object) null);
    }

    public final java.lang.String[] KWHzl(android.webkit.WebResourceRequest webResourceRequest, java.lang.String str) {
        java.lang.String string = webResourceRequest.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return (java.lang.String[]) new Regex(str).split(string, 0).toArray(new java.lang.String[0]);
    }

    public final java.lang.String OLrzqt(android.webkit.WebResourceRequest webResourceRequest) {
        return KWHzl(webResourceRequest, this.AEQbTJ)[1];
    }

    public final android.net.Uri copydefault(android.webkit.WebResourceRequest webResourceRequest, java.lang.String str) {
        java.lang.String strSubstring = KWHzl(webResourceRequest, str)[0];
        if (StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) strSubstring, '?', false, 2, (java.lang.Object) null) || StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) strSubstring, '&', false, 2, (java.lang.Object) null)) {
            strSubstring = strSubstring.substring(0, StringsKt__StringsKt.fIwbmz((java.lang.CharSequence) strSubstring));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        }
        return android.net.Uri.parse(strSubstring);
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        java.lang.String str2 = this.KWHzl.get(str);
        this.KWHzl.remove(str);
        return str2;
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        java.lang.String str2 = this.gEmmrt.get(str);
        this.gEmmrt.remove(str);
        return str2;
    }

    public final android.webkit.WebResourceResponse AEQbTJ(android.webkit.WebResourceResponse webResourceResponse, android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String encoding = webResourceResponse.getEncoding();
        java.lang.String mimeType = webResourceResponse.getMimeType();
        Intrinsics.copydefault((java.lang.Object) mimeType);
        java.lang.String str3 = StringsKt__StringsKt.contains$default((java.lang.CharSequence) mimeType, (java.lang.CharSequence) "text/html", false, 2, (java.lang.Object) null) ? "text/html" : mimeType;
        java.io.InputStream data = webResourceResponse.getData();
        Intrinsics.copydefault(data);
        Intrinsics.copydefault((java.lang.Object) str3);
        Intrinsics.copydefault((java.lang.Object) encoding);
        android.webkit.WebResourceResponse webResourceResponse2 = new android.webkit.WebResourceResponse(str3, encoding, KWHzl(context, data, str3, encoding, str, str2));
        webResourceResponse2.setStatusCodeAndReasonPhrase(webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
        webResourceResponse2.setResponseHeaders(webResourceResponse.getResponseHeaders());
        return webResourceResponse2;
    }

    public final java.io.InputStream KWHzl(android.content.Context context, java.io.InputStream inputStream, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        try {
            if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "text/html", false, 2, (java.lang.Object) null) || !C59449zhJ.gEmmrt(str4, "GET", true)) {
                return inputStream;
            }
            java.lang.String strAEQbTJ = C57345ygf.AEQbTJ(context, C57354ygo.KWHzl(inputStream));
            Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
            java.nio.charset.Charset charsetForName = java.nio.charset.Charset.forName(str2);
            Intrinsics.checkNotNullExpressionValue(charsetForName, "");
            byte[] bytes = strAEQbTJ.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            return new java.io.ByteArrayInputStream(bytes);
        } catch (java.lang.Exception e) {
            pUU.copydefault("Web_DNS", "html注入异常 " + e);
            byte[] bytes2 = e.toString().getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "");
            return new java.io.ByteArrayInputStream(bytes2);
        } catch (java.lang.OutOfMemoryError e2) {
            long j = 1024;
            float fFreeMemory = (java.lang.Runtime.getRuntime().freeMemory() / j) / 1024.0f;
            float f = (java.lang.Runtime.getRuntime().totalMemory() / j) / 1024.0f;
            float fMaxMemory = (java.lang.Runtime.getRuntime().maxMemory() / j) / 1024.0f;
            pUU.copydefault("WEB_DNS", "inject free=" + fFreeMemory + " total=" + f + " max=" + fMaxMemory + " oom=" + e2);
            C6777aVl.Companion.EZpvd(new WebDohOOMError2("inject url=" + str3 + " free=" + fFreeMemory + " total=" + f + " max=" + fMaxMemory + " oom=" + e2));
            byte[] bytes3 = e2.toString().getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes3, "");
            return new java.io.ByteArrayInputStream(bytes3);
        }
    }

    /* JADX INFO: renamed from: o.ygk$TaskDescription */
    public static final class TaskDescription {
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(false, 1, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = taskDescription.OLrzqt;
            }
            return taskDescription.OLrzqt(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(boolean z) {
            return new TaskDescription(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && this.OLrzqt == ((TaskDescription) obj).OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InterceptorExtra(isForMainFrame=" + this.OLrzqt + ")";
        }

        public TaskDescription(boolean z) {
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:727) call: o.ygk.TaskDescription.<init>(boolean):void type: THIS */
        public /* synthetic */ TaskDescription(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }
}

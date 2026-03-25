package o;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.okinc.network.model.CallChainExtraInfo;
import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.network.okg.dns.DomainsUtils;
import com.okinc.network.okg.dns.model.DoHChain;
import com.okinc.network.okg.log.NetRequestExtraInfo;
import com.okinc.network.okg.request.tag.NonOKXRequest;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.tag.RequestTagEnum;
import com.okinc.okex.safety.NativeApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineExceptionHandler;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rpn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43466rpn {
    public static final C43466rpn OLrzqt = new C43466rpn();
    public static volatile java.lang.String AEQbTJ = "0";
    public static final java.util.Set<java.lang.String> AhwBna = yEE.AhwBna("/umd/app/metric/report", "/umd/app/metric/latency", "/umd/app/metric/apm/event", "/umd/app/metric/event");
    public static final Regex gEmmrt = new Regex("^/apmfe.*");
    public static final CoroutineExceptionHandler KWHzl = new TaskDescription(CoroutineExceptionHandler.Key);
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.rpm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43466rpn.EZpvd();
        }
    });
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        AEQbTJ = z ? "1" : "2";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineExceptionHandler OLrzqt() {
        return KWHzl;
    }

    public final boolean copydefault(boolean z) {
        return false;
    }

    public final boolean gEmmrt() {
        return false;
    }

    private C43466rpn() {
    }

    /* JADX INFO: renamed from: o.rpn$TaskDescription */
    public static final class TaskDescription extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public TaskDescription(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull java.lang.Throwable th) {
            pUU.OLrzqt("OKNetworkUtils", "catch coroutine exception.", th);
        }
    }

    public static /* synthetic */ java.lang.String getWebViewReplaceHost$OKNetwork_network$default(C43466rpn c43466rpn, java.lang.String str, DoHChain doHChain, boolean z, java.lang.String str2, boolean z2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        java.lang.String str3 = str2;
        if ((i & 16) != 0) {
            z2 = false;
        }
        return c43466rpn.copydefault(str, doHChain, z, str3, z2);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, DoHChain doHChain, boolean z, java.lang.String str2, boolean z2) {
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        if (z2) {
            java.lang.String strCopydefault2 = C43372rnz.copydefault.copydefault(DomainsUtils.INSTANCE.getOkxHttpMain(), false, (java.lang.String) null);
            if (strCopydefault2 == null || strCopydefault2.length() == 0) {
                pUU.copydefault("WEB_DNS_Log", "webview gets empty host for okx http");
                return "";
            }
            return C43363rnq.Companion.copydefault().AEQbTJ(strCopydefault2);
        }
        java.lang.String strCopydefault3 = C43368rnv.copydefault.copydefault(!z);
        if (strCopydefault3 != null && strCopydefault3.length() != 0) {
            return strCopydefault3;
        }
        if (doHChain == null) {
            return str;
        }
        if (Intrinsics.EZpvd(doHChain, DomainsUtils.INSTANCE.getOkxHttpMain())) {
            strCopydefault = C43372rnz.copydefault.copydefault(doHChain, z, str2);
        } else {
            strCopydefault = C43372rnz.copydefault.copydefault(doHChain, false, (java.lang.String) null);
        }
        return strCopydefault == null ? "" : strCopydefault;
    }

    public final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            java.lang.String host = new java.net.URL(str).getHost();
            C43363rnq c43363rnqCopydefault = C43363rnq.Companion.copydefault();
            Intrinsics.copydefault((java.lang.Object) host);
            boolean zEZpvd = c43363rnqCopydefault.EZpvd(host);
            java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) C43372rnz.copydefault.djBIcL());
            if (zEZpvd) {
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listFJNWhG, 10));
                java.util.Iterator it = listFJNWhG.iterator();
                while (it.hasNext()) {
                    arrayList.add(C43363rnq.Companion.copydefault().AEQbTJ((java.lang.String) it.next()));
                }
                listFJNWhG.addAll(arrayList);
            }
            return listFJNWhG.contains(host);
        } catch (java.lang.Throwable th) {
            pUU.copydefault("OKNetworkUtils", "isWebViewNeedReplaceHost error, url: " + str + ", " + th);
            return false;
        }
    }

    public final boolean EZpvd(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        try {
            return jsonObject.get("_cIsFromCache").getAsBoolean();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AhwBna.contains(str);
    }

    public final boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (AEQbTJ(str) || gEmmrt.matches(str)) ? false : true;
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        java.lang.String strAEQbTJ = C43367rnu.AEQbTJ(str, str2);
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
        return strAEQbTJ;
    }

    public final java.lang.String KWHzl() {
        return NativeApi.getDohRsaPrivacy();
    }

    public final boolean AEQbTJ(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "");
        java.lang.String strHeader = request.header("na-req-tag");
        return Intrinsics.EZpvd((java.lang.Object) (strHeader != null ? strHeader : ""), (java.lang.Object) RequestTagEnum.WEB3.getTag());
    }

    public final boolean AEQbTJ(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        return chain.request().tag(NonOKXRequest.class) != null;
    }

    public final void OLrzqt(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "");
        NetRequestExtraInfo netRequestExtraInfo = (NetRequestExtraInfo) request.tag(NetRequestExtraInfo.class);
        if (netRequestExtraInfo != null) {
            netRequestExtraInfo.setRetryCount(netRequestExtraInfo.getRetryCount() + 1);
        }
    }

    public final java.lang.String KWHzl(@NotNull Response response) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(response, "");
        ResponseBody responseBodyBody = response.body();
        java.lang.Long lValueOf = responseBodyBody != null ? java.lang.Long.valueOf(responseBodyBody.contentLength()) : null;
        java.lang.String strCopydefault = copydefault(response);
        if (lValueOf != null) {
            str = lValueOf + "-byte body";
        }
        java.lang.String strHeader = response.request().header("x-id");
        java.lang.String strMethod = response.request().method();
        return response.code() + ", " + response.request().url().encodedPath() + "(" + str + "), " + strMethod + ", xid: " + strHeader + ", cloudId: " + strCopydefault;
    }

    public final java.lang.String EZpvd(@NotNull Interceptor.Chain chain) {
        java.net.InetAddress connectIP;
        Intrinsics.checkNotNullParameter(chain, "");
        CallChainExtraInfo callChainExtraInfo = (CallChainExtraInfo) chain.call().request().tag(CallChainExtraInfo.class);
        java.lang.String hostAddress = (callChainExtraInfo == null || (connectIP = callChainExtraInfo.getConnectIP()) == null) ? null : connectIP.getHostAddress();
        if (hostAddress != null && hostAddress.length() != 0) {
            return hostAddress;
        }
        try {
            Call call = chain.call();
            Intrinsics.copydefault(call, "");
            RealConnection connection = ((RealCall) call).getConnection();
            if (connection != null) {
                return connection.route().socketAddress().getAddress().getHostAddress();
            }
        } catch (java.lang.Exception unused) {
        }
        return null;
    }

    public final java.lang.String copydefault(Response response) {
        java.lang.String strHeader$default = Response.header$default(response, "cf-ray", null, 2, null);
        java.lang.String strHeader$default2 = Response.header$default(response, "x-amz-cf-id", null, 2, null);
        return strHeader$default == null ? strHeader$default2 == null ? "" : strHeader$default2 : strHeader$default;
    }

    public final DohTypeEnum OLrzqt(@NotNull DoHChain doHChain) {
        Intrinsics.checkNotNullParameter(doHChain, "");
        if (Intrinsics.EZpvd((java.lang.Object) doHChain.getHolder().toString(), (java.lang.Object) DomainsUtils.HOLDER_OKX_HTTP_MAIN)) {
            return DohTypeEnum.HTTP;
        }
        if (Intrinsics.EZpvd((java.lang.Object) doHChain.getHolder().toString(), (java.lang.Object) DomainsUtils.HOLDER_OKX_WS_V5)) {
            return DohTypeEnum.V5;
        }
        if (Intrinsics.EZpvd((java.lang.Object) doHChain.getHolder().toString(), (java.lang.Object) DomainsUtils.HOLDER_WEB3_WS_DEX)) {
            return DohTypeEnum.DEXPRI;
        }
        return null;
    }

    public final boolean KWHzl(@NotNull HttpUrl httpUrl) {
        Intrinsics.checkNotNullParameter(httpUrl, "");
        java.lang.String strHost = httpUrl.host();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator itAEQbTJ = yDX.AEQbTJ(C43372rnz.copydefault.DbNXlk());
        while (itAEQbTJ.hasNext()) {
            arrayList.add(((DoHChain) itAEQbTJ.next()).getHolder().getHost());
        }
        if (arrayList.contains(strHost)) {
            return false;
        }
        C43292rmY c43292rmY = C43292rmY.OLrzqt;
        java.util.List listGEmmrt = yDY.gEmmrt(c43292rmY.fJNWhG(), c43292rmY.zuBGHE(), c43292rmY.AxsJAY());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = listGEmmrt.iterator();
        while (it.hasNext()) {
            android.net.Uri uri = android.net.Uri.parse((java.lang.String) it.next());
            Intrinsics.checkNotNullExpressionValue(uri, "");
            java.lang.String host = uri.getHost();
            if (host != null) {
                arrayList2.add(host);
            }
        }
        return !arrayList2.contains(strHost);
    }

    /* JADX INFO: renamed from: o.rpn$Application */
    public static final class Application implements InterfaceC54816xWj {
        public final /* synthetic */ Function0<Unit> copydefault;

        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
        }

        public Application(Function0<Unit> function0) {
            this.copydefault = function0;
        }

        @Override // o.InterfaceC54816xWj
        public void EZpvd() {
            C54819xWm.KWHzl().KWHzl(this);
            this.copydefault.invoke();
        }
    }

    public final void AEQbTJ(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        C54819xWm.KWHzl().AEQbTJ(new Application(function0));
    }

    public final java.lang.String KWHzl(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "");
        HttpUrl httpUrlUrl = request.url();
        java.lang.String strEncodedPath = httpUrlUrl.encodedPath();
        java.lang.String strEncodedQuery = httpUrlUrl.encodedQuery();
        if (strEncodedQuery == null || strEncodedQuery.length() == 0) {
            return strEncodedPath;
        }
        return strEncodedPath + "?" + strEncodedQuery;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (th instanceof OKServerException) {
            OKServerException oKServerException = (OKServerException) th;
            sb.append("OKServerException{code:" + oKServerException.getCode() + ", httpCode:" + oKServerException.getHttpCode() + ", origin:" + oKServerException.getOrigin() + "}");
        } else {
            sb.append(th.toString());
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final boolean OLrzqt(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        return chain.call().isCanceled();
    }

    public final Gson valueOf() {
        return (Gson) EZpvd.getValue();
    }

    public static final Gson EZpvd() {
        return new GsonBuilder().setExclusionStrategies(new StateListAnimator()).create();
    }

    /* JADX INFO: renamed from: o.rpn$StateListAnimator */
    public static final class StateListAnimator implements ExclusionStrategy {
        @Override // com.google.gson.ExclusionStrategy
        public boolean shouldSkipClass(java.lang.Class<?> cls) {
            return false;
        }

        @Override // com.google.gson.ExclusionStrategy
        public boolean shouldSkipField(FieldAttributes fieldAttributes) {
            java.lang.String name;
            return (fieldAttributes == null || (name = fieldAttributes.getName()) == null || !C59449zhJ.startsWith$default(name, "_", false, 2, null)) ? false : true;
        }
    }
}

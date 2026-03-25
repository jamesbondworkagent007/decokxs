package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.just.agentweb.DefaultWebClient;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.dns.DomainsUtils;
import com.okinc.network.okg.dns.model.DoHChain;
import com.okinc.rxutils.RxBus;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C57350ygk;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ygj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57349ygj implements Interceptor {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.ygj$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ygj.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) throws java.io.IOException {
        java.lang.Object objM7377constructorimpl;
        java.lang.String str;
        java.lang.Object obj;
        java.lang.Object objM7377constructorimpl2;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        java.lang.String strHost = request.url().host();
        Response responseProceed = chain.proceed(request);
        int iCode = responseProceed.code();
        java.lang.String str3 = responseProceed.headers().get("content-type");
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = "";
        int i = 0;
        boolean z = false;
        Request requestBuild = request;
        int iCode2 = iCode;
        Response responseProceed2 = responseProceed;
        while (300 <= iCode2 && iCode2 < 400 && i < 20) {
            i++;
            java.lang.String str5 = responseProceed2.headers().get("Location");
            if (str5 == null && (str5 = responseProceed2.headers().get("location")) == null) {
                break;
            }
            pUU.valueOf("WEB_DNS", "retry " + i + ", code: " + iCode2 + ", redirect to " + ((java.lang.Object) str5));
            if (!C59449zhJ.startsWith$default(str5, DefaultWebClient.HTTP_SCHEME, false, 2, null) && !C59449zhJ.startsWith$default(str5, DefaultWebClient.HTTPS_SCHEME, false, 2, null)) {
                str5 = requestBuild.url().scheme() + "://" + requestBuild.url().host() + ((java.lang.Object) str5);
            }
            z = responseProceed2.isRedirect() && Intrinsics.EZpvd((java.lang.Object) Response.header$default(responseProceed2, "ok-web3-page", null, 2, null), (java.lang.Object) "1");
            HttpUrl.Builder builderNewBuilder = HttpUrl.Companion.get(str5).newBuilder();
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(android.net.Uri.parse(str5));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            android.net.Uri uri = (android.net.Uri) objM7377constructorimpl;
            boolean z2 = uri != null && C57354ygo.OLrzqt.KWHzl(uri);
            if (z || z2 || !C43341rnU.EZpvd(str5)) {
                str = str2;
            } else {
                builderNewBuilder.host(strHost);
                java.lang.String strHost2 = requestBuild.url().host();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                str = str2;
                sb.append("modify host to ");
                sb.append(strHost2);
                pUU.valueOf("WEB_DNS", sb.toString());
            }
            java.lang.String strEncodedFragment = requestBuild.url().encodedFragment();
            if (strEncodedFragment != null) {
                obj = null;
                if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) str5, (java.lang.CharSequence) ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER, false, 2, (java.lang.Object) null)) {
                    builderNewBuilder.fragment(strEncodedFragment);
                }
            } else {
                obj = null;
            }
            HttpUrl httpUrlBuild = builderNewBuilder.build();
            java.lang.String string = httpUrlBuild.toString();
            Request.Builder builderNewBuilder2 = chain.request().newBuilder();
            builderNewBuilder2.url(httpUrlBuild);
            try {
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(android.net.Uri.parse(string));
            } catch (java.lang.Throwable th2) {
                Result.Application application4 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
            }
            android.net.Uri uri2 = (android.net.Uri) (Result.m7383isFailureimpl(objM7377constructorimpl2) ? obj : objM7377constructorimpl2);
            if (uri2 != null && C57354ygo.OLrzqt.KWHzl(uri2)) {
                builderNewBuilder2.tag(DoHChain.class, DomainsUtils.INSTANCE.getWeb3HttpMain());
            }
            if (z) {
                builderNewBuilder2.header("Subdomain-Strategy", SubdomainStrategy.Global.INSTANCE.toString());
            }
            requestBuild = builderNewBuilder2.build();
            responseProceed2.close();
            responseProceed2 = chain.proceed(requestBuild);
            iCode2 = responseProceed2.code();
            str4 = string;
            str2 = str;
        }
        java.lang.String str6 = str2;
        java.lang.String str7 = responseProceed2.headers().get("content-type");
        java.lang.String str8 = str7 == null ? str6 : str7;
        C57350ygk.TaskDescription taskDescription = (C57350ygk.TaskDescription) requestBuild.tag(C57350ygk.TaskDescription.class);
        if (taskDescription != null && taskDescription.EZpvd() && str4.length() > 0 && AEQbTJ(str3) && AEQbTJ(str8) && !OLrzqt(str4)) {
            java.util.Map mapEZpvd = z ? C56423yEv.EZpvd(C56390yDp.OLrzqt("Subdomain-Strategy", SubdomainStrategy.Global.INSTANCE.toString())) : null;
            pUU.valueOf("WEB_DNS", "WebLoadEvent: " + ((java.lang.Object) str4));
            RxBus.AEQbTJ(new C6818aWZ(str4, mapEZpvd));
        }
        return responseProceed2;
    }

    public final boolean OLrzqt(java.lang.String str) {
        return C59449zhJ.endsWith$default(str, ".png", false, 2, null) || C59449zhJ.endsWith$default(str, ".jpg", false, 2, null) || C59449zhJ.endsWith$default(str, ".jpeg", false, 2, null) || C59449zhJ.endsWith$default(str, ".gif", false, 2, null);
    }

    public final boolean AEQbTJ(java.lang.String str) {
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "text/html", false, 2, (java.lang.Object) null);
    }
}

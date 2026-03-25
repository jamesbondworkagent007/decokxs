package o;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okex.common.bean.RegionDetails;
import com.okinc.okex.common.bean.SiteInfoBean;
import com.okinc.okex.common.net.interceptors.HandleWrongSiteInterceptor$intercept$1;
import com.okinc.okex.common.net.interceptors.HandleWrongSiteInterceptor$intercept$2;
import com.okinc.okex.common.net.interceptors.HandleWrongSiteInterceptor$switchSiteAndRetry$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.snR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C45311snR implements Interceptor {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.snR$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.snR.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:39:0x0044 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, okhttp3.Interceptor$Chain] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r3v1, types: [okhttp3.Interceptor$Chain] */
    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) throws java.io.IOException {
        JsonElement jsonElement;
        JsonElement jsonElement2;
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        java.lang.String string = request.url().toString();
        boolean z = C45306snM.AEQbTJ(request, InterfaceC45308snO.class) != null;
        pUU.KWHzl("SupportHandleWrongSiteInterceptor", "[" + string + "]: isHandleWrongSite=" + z);
        if (!z) {
            return chain.proceed(request);
        }
        try {
            if (C45309snP.copydefault.OLrzqt() != null) {
                chain = (Response) BuildersKt__BuildersKt.runBlocking$default(null, new HandleWrongSiteInterceptor$intercept$1(request, chain, null), 1, null);
            } else {
                chain = chain.proceed(request);
            }
            return chain;
        } catch (OKServerException e) {
            JsonObject response = e.getResponse();
            java.lang.Integer numValueOf = (response == null || (jsonElement2 = response.get("error_code")) == null) ? null : java.lang.Integer.valueOf(jsonElement2.getAsInt());
            JsonObject asJsonObject = (response == null || (jsonElement = response.get("data")) == null) ? null : jsonElement.getAsJsonObject();
            if (response == null || numValueOf == null || numValueOf.intValue() != 8507 || asJsonObject == null) {
                throw e;
            }
            pUU.KWHzl("SupportHandleWrongSiteInterceptor", "[" + string + "]: errorCode=" + numValueOf + ", switch site and retry");
            C45309snP c45309snP = C45309snP.copydefault;
            c45309snP.copydefault(asJsonObject);
            return (Response) BuildersKt__BuildersKt.runBlocking$default(null, new HandleWrongSiteInterceptor$intercept$2(this, chain, request, c45309snP.OLrzqt(), null), 1, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [81=5, 79=4] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(Interceptor.Chain chain, Request request, SiteInfoBean siteInfoBean, Continuation<? super Response> continuation) throws java.lang.Throwable {
        HandleWrongSiteInterceptor$switchSiteAndRetry$1 handleWrongSiteInterceptor$switchSiteAndRetry$1;
        java.lang.Object objM7377constructorimpl;
        RegionDetails regionDetails;
        if (continuation instanceof HandleWrongSiteInterceptor$switchSiteAndRetry$1) {
            handleWrongSiteInterceptor$switchSiteAndRetry$1 = (HandleWrongSiteInterceptor$switchSiteAndRetry$1) continuation;
            int i = handleWrongSiteInterceptor$switchSiteAndRetry$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                handleWrongSiteInterceptor$switchSiteAndRetry$1.label = i - Integer.MIN_VALUE;
            } else {
                handleWrongSiteInterceptor$switchSiteAndRetry$1 = new HandleWrongSiteInterceptor$switchSiteAndRetry$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = handleWrongSiteInterceptor$switchSiteAndRetry$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = handleWrongSiteInterceptor$switchSiteAndRetry$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C45309snP c45309snP = C45309snP.copydefault;
            handleWrongSiteInterceptor$switchSiteAndRetry$1.L$0 = this;
            handleWrongSiteInterceptor$switchSiteAndRetry$1.L$1 = chain;
            handleWrongSiteInterceptor$switchSiteAndRetry$1.L$2 = request;
            handleWrongSiteInterceptor$switchSiteAndRetry$1.L$3 = siteInfoBean;
            handleWrongSiteInterceptor$switchSiteAndRetry$1.label = 1;
            objKWHzl = c45309snP.KWHzl(siteInfoBean, handleWrongSiteInterceptor$switchSiteAndRetry$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            siteInfoBean = (SiteInfoBean) handleWrongSiteInterceptor$switchSiteAndRetry$1.L$3;
            request = (Request) handleWrongSiteInterceptor$switchSiteAndRetry$1.L$2;
            chain = (Interceptor.Chain) handleWrongSiteInterceptor$switchSiteAndRetry$1.L$1;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        SubdomainStrategy subdomainStrategy = (SubdomainStrategy) objKWHzl;
        HttpUrl httpUrlUrl = request.url();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("[");
        sb.append(httpUrlUrl);
        sb.append("]: newStrategy=");
        sb.append(subdomainStrategy);
        java.lang.String string = sb.toString();
        pUU.KWHzl("SupportHandleWrongSiteInterceptor", string);
        Request.Builder builderNewBuilder = request.newBuilder();
        builderNewBuilder.header("Subdomain-Strategy", subdomainStrategy.toString());
        Request requestBuild = builderNewBuilder.build();
        java.lang.String userSite = null;
        try {
            Response responseProceed = chain.proceed(requestBuild);
            try {
                Result.Application application = Result.Companion;
                C45309snP c45309snP2 = C45309snP.copydefault;
                if (siteInfoBean != null && (regionDetails = siteInfoBean.getRegionDetails()) != null) {
                    userSite = regionDetails.getUserSite();
                }
                c45309snP2.copydefault(userSite);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.copydefault("SupportHandleWrongSiteInterceptor", "[" + request.url() + "]: failed to clear site info: " + C56379yDe.AEQbTJ(thM7380exceptionOrNullimpl));
            }
            return responseProceed;
        } finally {
        }
    }
}

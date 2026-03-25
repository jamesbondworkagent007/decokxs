package o;

import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.okimcore.feature.core.interceptors.IMSiteInfo;
import com.okinc.okimcore.feature.core.interceptors.SubdomainStrategyInterceptor$intercept$1;
import com.okinc.okimcore.feature.core.interceptors.SubdomainStrategyInterceptor$intercept$siteInfo$1$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sIc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44230sIc implements Interceptor {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.sIc$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sIc.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, SGET, INVOKE, INVOKE, MOVE_EXCEPTION, THROW, SGET, SGET, INVOKE, SGET, INVOKE, MOVE_EXCEPTION, THROW, IF, INVOKE, THROW, IF] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) throws java.lang.InterruptedException {
        java.lang.Object objM7377constructorimpl;
        IMSiteInfo iMSiteInfo;
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        java.lang.String string = request.url().toString();
        sKU skuAuCTel = sDZ.AEQbTJ.AuCTel();
        if (C44157sFk.gEmmrt().values()) {
            iMSiteInfo = null;
        } else {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl((IMSiteInfo) BuildersKt__BuildersKt.runBlocking$default(null, new SubdomainStrategyInterceptor$intercept$siteInfo$1$1(skuAuCTel, request, null), 1, null));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            iMSiteInfo = (IMSiteInfo) objM7377constructorimpl;
        }
        pUU.KWHzl("SubdomainStrategyInterceptor", "[" + string + "]: siteInfo=" + iMSiteInfo);
        java.lang.String userSite = iMSiteInfo != null ? iMSiteInfo.getUserSite() : null;
        java.lang.String domain = iMSiteInfo != null ? iMSiteInfo.getDomain() : null;
        java.lang.String wsDomain = iMSiteInfo != null ? iMSiteInfo.getWsDomain() : null;
        java.lang.String wsDexDomain = iMSiteInfo != null ? iMSiteInfo.getWsDexDomain() : null;
        if (userSite != null && userSite.length() != 0 && domain != null && domain.length() != 0 && wsDomain != null && wsDomain.length() != 0 && wsDexDomain != null && wsDexDomain.length() != 0) {
            BuildersKt__BuildersKt.runBlocking$default(null, new SubdomainStrategyInterceptor$intercept$1(userSite, domain, wsDomain, wsDexDomain, null), 1, null);
        }
        SubdomainStrategy subdomainStrategyCopydefault = iMSiteInfo != null ? C44229sIb.copydefault(iMSiteInfo) : null;
        pUU.KWHzl("SubdomainStrategyInterceptor", "[" + string + "]: newStrategy=" + subdomainStrategyCopydefault);
        Request.Builder builderNewBuilder = request.newBuilder();
        if (subdomainStrategyCopydefault != null) {
            builderNewBuilder.header("Subdomain-Strategy", subdomainStrategyCopydefault.toString());
        }
        try {
            Response responseProceed = chain.proceed(builderNewBuilder.build());
            if (userSite != null && userSite.length() != 0) {
                try {
                    Result.Application application3 = Result.Companion;
                    C43372rnz.copydefault.KWHzl(userSite);
                    Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (java.lang.Throwable th2) {
                    Result.Application application4 = Result.Companion;
                    Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                }
            }
            return responseProceed;
        } finally {
        }
    }
}

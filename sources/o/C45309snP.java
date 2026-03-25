package o;

import com.google.gson.JsonObject;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.okex.common.bean.RegionDetails;
import com.okinc.okex.common.bean.SiteInfoBean;
import com.okinc.okex.common.net.interceptors.SiteHelper$getSite$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.snP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C45309snP {
    public static SiteInfoBean EZpvd;
    public static final C45309snP copydefault = new C45309snP();
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SiteInfoBean OLrzqt() {
        return EZpvd;
    }

    private C45309snP() {
    }

    public final void copydefault(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            Result.Application application = Result.Companion;
            C43372rnz.copydefault.KWHzl(str);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final void copydefault(@NotNull JsonObject jsonObject) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(jsonObject, "");
        try {
            Result.Application application = Result.Companion;
            java.lang.String string = jsonObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            Json.Default r0 = Json.Default;
            r0.getSerializersModule();
            objM7377constructorimpl = Result.m7377constructorimpl((SiteInfoBean) r0.decodeFromString(SiteInfoBean.Companion.serializer(), string));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        final java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44760scx.copydefault("Could not parse region details", new Function1() { // from class: o.snS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45309snP.copydefault(thM7380exceptionOrNullimpl, (C44761scy) obj);
                }
            });
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        EZpvd = (SiteInfoBean) objM7377constructorimpl;
    }

    public static final Unit copydefault(java.lang.Throwable th, C44761scy c44761scy) {
        Intrinsics.checkNotNullParameter(c44761scy, "");
        c44761scy.KWHzl(th);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(SiteInfoBean siteInfoBean, @NotNull Continuation<? super SubdomainStrategy> continuation) throws java.lang.Throwable {
        SiteHelper$getSite$1 siteHelper$getSite$1;
        java.lang.Object objAEQbTJ;
        java.lang.String str;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof SiteHelper$getSite$1) {
            siteHelper$getSite$1 = (SiteHelper$getSite$1) continuation;
            int i = siteHelper$getSite$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                siteHelper$getSite$1.label = i - Integer.MIN_VALUE;
            } else {
                siteHelper$getSite$1 = new SiteHelper$getSite$1(this, continuation);
            }
        }
        SiteHelper$getSite$1 siteHelper$getSite$12 = siteHelper$getSite$1;
        java.lang.Object obj = siteHelper$getSite$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = siteHelper$getSite$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            RegionDetails regionDetails = siteInfoBean != null ? siteInfoBean.getRegionDetails() : null;
            java.lang.String userSite = regionDetails != null ? regionDetails.getUserSite() : null;
            java.lang.String domain = regionDetails != null ? regionDetails.getDomain() : null;
            java.lang.String wsDomain = regionDetails != null ? regionDetails.getWsDomain() : null;
            java.lang.String wsDexDomain = regionDetails != null ? regionDetails.getWsDexDomain() : null;
            if (regionDetails == null) {
                return SubdomainStrategy.Global.INSTANCE;
            }
            if (C34703nhO.AEQbTJ()) {
                return SubdomainStrategy.Global.INSTANCE;
            }
            if (userSite == null || userSite.length() == 0) {
                return SubdomainStrategy.Global.INSTANCE;
            }
            if (domain == null || domain.length() == 0) {
                return SubdomainStrategy.Global.INSTANCE;
            }
            if (wsDomain == null || wsDomain.length() == 0) {
                return SubdomainStrategy.Global.INSTANCE;
            }
            if (wsDexDomain == null || wsDexDomain.length() == 0) {
                return SubdomainStrategy.Global.INSTANCE;
            }
            if (Intrinsics.EZpvd((java.lang.Object) userSite, (java.lang.Object) "OKX_GLOBAL")) {
                return SubdomainStrategy.Global.INSTANCE;
            }
            C43372rnz c43372rnz = C43372rnz.copydefault;
            siteHelper$getSite$12.L$0 = userSite;
            siteHelper$getSite$12.label = 1;
            objAEQbTJ = c43372rnz.AEQbTJ(userSite, domain, wsDomain, wsDexDomain, (16 & 16) != 0 ? 10000L : 0L, siteHelper$getSite$12);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            str = userSite;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) siteHelper$getSite$12.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(new SubdomainStrategy.Subdomain(str));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            objM7377constructorimpl = Result.m7377constructorimpl(objAEQbTJ);
        }
        C56391yDq.AEQbTJ(objM7377constructorimpl);
        return (SubdomainStrategy) objM7377constructorimpl;
    }
}

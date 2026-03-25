package o;

import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.okimcore.feature.core.interceptors.IMSiteInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sIb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44229sIb {
    public static final SubdomainStrategy copydefault(@NotNull IMSiteInfo iMSiteInfo) {
        Intrinsics.checkNotNullParameter(iMSiteInfo, "");
        if (C34703nhO.AEQbTJ()) {
            return SubdomainStrategy.Global.INSTANCE;
        }
        java.lang.String userSite = iMSiteInfo.getUserSite();
        if (userSite == null || userSite.length() == 0) {
            return SubdomainStrategy.Global.INSTANCE;
        }
        java.lang.String domain = iMSiteInfo.getDomain();
        if (domain == null || domain.length() == 0) {
            return SubdomainStrategy.Global.INSTANCE;
        }
        java.lang.String wsDomain = iMSiteInfo.getWsDomain();
        if (wsDomain == null || wsDomain.length() == 0) {
            return SubdomainStrategy.Global.INSTANCE;
        }
        java.lang.String wsDexDomain = iMSiteInfo.getWsDexDomain();
        if (wsDexDomain == null || wsDexDomain.length() == 0) {
            return SubdomainStrategy.Global.INSTANCE;
        }
        return Intrinsics.EZpvd((java.lang.Object) iMSiteInfo.getUserSite(), (java.lang.Object) "OKX_GLOBAL") ? SubdomainStrategy.Global.INSTANCE : new SubdomainStrategy.Subdomain(iMSiteInfo.getUserSite());
    }
}

package o;

import com.okinc.network.okg.config.NetworkStringEnum;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.network.okg.dns.executor.OKDohConfig;
import com.okinc.network.okg.dns.model.DOHProcessParam;
import com.okinc.network.okg.dns.model.DoHChain;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rnU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43341rnU implements Interceptor {
    public static final C43341rnU EZpvd = new C43341rnU();

    private C43341rnU() {
    }

    public static final boolean EZpvd(@NotNull java.lang.String str) {
        java.lang.String strAEQbTJ;
        java.lang.String cORHost$OKNetwork_network$default;
        java.lang.String strInvoke;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        try {
            java.lang.String host = new java.net.URL(str).getHost();
            Function1<NetworkStringEnum, java.lang.String> function1ZsXlph = C43292rmY.OLrzqt.zsXlph();
            if (function1ZsXlph != null && (strInvoke = function1ZsXlph.invoke(NetworkStringEnum.IDAUTH_LINK)) != null) {
                str2 = strInvoke;
            }
            if (str2.length() > 0 && !C59449zhJ.startsWith$default(str2, "www.", false, 2, null)) {
                str2 = "www." + str2;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (C43347rna.EZpvd.EZpvd() && (cORHost$OKNetwork_network$default = C43372rnz.getCORHost$OKNetwork_network$default(C43372rnz.copydefault, DohTypeEnum.HTTP, null, 2, null)) != null) {
                linkedHashSet.add(cORHost$OKNetwork_network$default);
            }
            C43372rnz c43372rnz = C43372rnz.copydefault;
            java.lang.String strFetchVPNInfo = c43372rnz.fetchVPNInfo();
            if (strFetchVPNInfo != null && (strAEQbTJ = c43372rnz.AEQbTJ(DohTypeEnum.HTTP, strFetchVPNInfo)) != null) {
                linkedHashSet.add(strAEQbTJ);
            }
            if (!Intrinsics.EZpvd((java.lang.Object) host, (java.lang.Object) str2)) {
                if (!Intrinsics.EZpvd((java.lang.Object) ("www." + host), (java.lang.Object) str2) && !C43324rnD.AEQbTJ.EZpvd().contains(host)) {
                    C43363rnq c43363rnqCopydefault = C43363rnq.Companion.copydefault();
                    Intrinsics.copydefault((java.lang.Object) host);
                    if (!c43363rnqCopydefault.EZpvd(host) && !Intrinsics.EZpvd((java.lang.Object) OKDohConfig.Companion.KWHzl(DohTypeEnum.HTTP), (java.lang.Object) host) && !C43466rpn.OLrzqt.EZpvd(str) && !linkedHashSet.contains(host) && !Intrinsics.EZpvd((java.lang.Object) host, (java.lang.Object) C33081mpi.OLrzqt.EZpvd())) {
                        if (!C43368rnv.copydefault.copydefault().contains(host)) {
                            return false;
                        }
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return true;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        if (!C43371rny.OLrzqt.KWHzl()) {
            return chain.proceed(chain.request());
        }
        Request request = chain.request();
        HttpUrl httpUrlUrl = request.url();
        java.lang.String string = httpUrlUrl.toString();
        java.lang.String strHost = httpUrlUrl.host();
        if (!EZpvd(string)) {
            pUU.valueOf("WEB_DNS_Log", "no need to intercept. url:" + string);
            return chain.proceed(chain.request());
        }
        Request.Builder builderNewBuilder = request.newBuilder();
        boolean zEZpvd = C43363rnq.Companion.copydefault().EZpvd(strHost);
        kotlin.Pair<java.lang.Boolean, java.lang.String> pairCopydefault = copydefault(request.header("Subdomain-Strategy"), zEZpvd);
        DoHChain doHChain = (DoHChain) request.tag(DoHChain.class);
        java.lang.String strAEQbTJ = AEQbTJ(doHChain, C33081mpi.OLrzqt.EZpvd(), pairCopydefault, strHost, zEZpvd);
        DoHChain doHChainCopydefault = copydefault(strAEQbTJ);
        pUU.EZpvd("WEB_DNS_Log", "webview config preferDoHChain: " + (doHChain != null ? doHChain.getNetType() : null) + ", " + (doHChain != null ? doHChain.getHolder() : null) + ", " + (doHChain != null ? doHChain.getTarget() : null));
        java.lang.String strCopydefault = C43466rpn.OLrzqt.copydefault(strAEQbTJ, doHChainCopydefault, pairCopydefault.getFirst().booleanValue(), pairCopydefault.getSecond(), zEZpvd);
        if (pairCopydefault.getFirst().booleanValue() && strCopydefault.length() == 0) {
            pUU.valueOf("WEB_DNS_Log", "host:" + strHost + ". no cor host. pls call [setCORDomain] first");
        }
        DOHProcessParam dOHProcessParam = new DOHProcessParam();
        dOHProcessParam.setRequestUrlIsCORHost(pairCopydefault.getFirst().booleanValue());
        dOHProcessParam.setRequestUrl(httpUrlUrl.newBuilder().host(strAEQbTJ).build());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strCopydefault)) {
            java.lang.String strReplaceFirst$default = C59449zhJ.replaceFirst$default(string, strHost, strCopydefault, false, 4, (java.lang.Object) null);
            dOHProcessParam.setDohUrl(request.url().newBuilder().host(strCopydefault).build());
            builderNewBuilder.url(new java.net.URL(strReplaceFirst$default));
            builderNewBuilder.header("Host", strCopydefault);
            builderNewBuilder.header("change", "1");
            pUU.valueOf("WEB_DNS_Log", "modify host " + strCopydefault + " originalUrl=" + string + ", newUrl:" + strReplaceFirst$default);
        } else {
            pUU.valueOf("WEB_DNS_Log", "skip to replace host newHost = " + strCopydefault + " host = " + strHost);
        }
        builderNewBuilder.tag(DOHProcessParam.class, dOHProcessParam);
        return chain.proceed(builderNewBuilder.build());
    }

    public final DoHChain copydefault(java.lang.String str) {
        java.util.Iterator itAEQbTJ = yDX.AEQbTJ(C43372rnz.copydefault.DbNXlk());
        while (itAEQbTJ.hasNext()) {
            DoHChain doHChain = (DoHChain) itAEQbTJ.next();
            if (Intrinsics.EZpvd((java.lang.Object) doHChain.getTarget().getHost(), (java.lang.Object) str)) {
                return doHChain;
            }
        }
        pUU.valueOf("WEB_DNS_Log", "webview has no dohChain for " + str);
        return null;
    }

    public final java.lang.String AEQbTJ(DoHChain doHChain, java.lang.String str, kotlin.Pair<java.lang.Boolean, java.lang.String> pair, java.lang.String str2, boolean z) {
        if (z) {
            return C43363rnq.Companion.copydefault().AEQbTJ(OKDohConfig.Companion.KWHzl(DohTypeEnum.HTTP));
        }
        if (doHChain != null) {
            return doHChain.getTarget().getHost();
        }
        if (str != null) {
            return str;
        }
        if (pair.getFirst().booleanValue()) {
            java.lang.String strAEQbTJ = C43372rnz.copydefault.AEQbTJ(DohTypeEnum.HTTP, pair.getSecond());
            return strAEQbTJ == null ? str2 : strAEQbTJ;
        }
        return OKDohConfig.Companion.KWHzl(DohTypeEnum.HTTP);
    }

    public final kotlin.Pair<java.lang.Boolean, java.lang.String> copydefault(java.lang.String str, boolean z) {
        if (z) {
            return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, null);
        }
        C43347rna c43347rna = C43347rna.EZpvd;
        SubdomainStrategy subdomainStrategyOLrzqt = c43347rna.OLrzqt(DohTypeEnum.HTTP, str);
        if (subdomainStrategyOLrzqt instanceof SubdomainStrategy.Subdomain) {
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ((SubdomainStrategy.Subdomain) subdomainStrategyOLrzqt).AEQbTJ());
        }
        if (subdomainStrategyOLrzqt instanceof SubdomainStrategy.Global) {
            return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, null);
        }
        if (!(subdomainStrategyOLrzqt instanceof SubdomainStrategy.Auto)) {
            throw new NoWhenBranchMatchedException();
        }
        if (C43292rmY.OLrzqt.AwvSrB().values()) {
            return C56390yDp.OLrzqt(java.lang.Boolean.valueOf(c43347rna.EZpvd()), null);
        }
        java.lang.String strFetchVPNInfo = C43372rnz.copydefault.fetchVPNInfo();
        if (strFetchVPNInfo != null) {
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, strFetchVPNInfo);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, null);
    }
}

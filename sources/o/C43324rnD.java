package o;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.network.okg.dns.WebViewConfig;
import com.okinc.network.okg.dns.executor.OKDohConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rnD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43324rnD {
    public static final C43324rnD AEQbTJ = new C43324rnD();
    public static java.util.HashSet<java.lang.String> copydefault = yEE.djBIcL("www.okx.com", "web3.okx.com", "okx.com");
    public static final int KWHzl = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashSet<java.lang.String> EZpvd() {
        return copydefault;
    }

    private C43324rnD() {
    }

    public final boolean KWHzl() {
        java.lang.String string = SPUtils.getString("sp_web_doh_config_locale", MultiTransferSignData.DEFAULT_INTERVAL);
        WebViewConfig webViewConfigSSMYrx = C43292rmY.OLrzqt.sSMYrx();
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) webViewConfigSSMYrx.getDohOpen(), (java.lang.Object) "0");
        copydefault.addAll(webViewConfigSSMYrx.getWhitelist());
        java.lang.String string2 = copydefault.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        pUU.valueOf("hostWhiteList", string2);
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != 48) {
                if (iHashCode != 49) {
                    if (iHashCode == 1444) {
                        string.equals(MultiTransferSignData.DEFAULT_INTERVAL);
                    }
                } else if (string.equals("1")) {
                    return true;
                }
            } else if (string.equals("0")) {
                return false;
            }
        }
        return true ^ zEZpvd;
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, SubdomainStrategy subdomainStrategy) {
        java.lang.String string;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        try {
            android.net.Uri uri = android.net.Uri.parse(str);
            boolean zOLrzqt = OLrzqt(str, uri.getHost());
            if (zOLrzqt) {
                C43363rnq c43363rnqCopydefault = C43363rnq.Companion.copydefault();
                java.lang.String host = uri.getHost();
                if (host != null) {
                    str2 = host;
                }
                java.lang.String strOLrzqt = OLrzqt(subdomainStrategy, c43363rnqCopydefault.EZpvd(str2));
                if (strOLrzqt == null) {
                    string = str;
                } else {
                    string = uri.buildUpon().authority(strOLrzqt).build().toString();
                    Intrinsics.copydefault((java.lang.Object) string);
                }
            } else {
                string = str;
            }
            pUU.KWHzl("WebDohManager", "getWebViewDisplayUrl,success. result:" + string + ". needReplace:" + zOLrzqt + ", fullUrl:" + str + ", strategy:" + subdomainStrategy);
            return string;
        } catch (java.lang.Exception e) {
            pUU.OLrzqt("WebDohManager", "getWebViewDisplayUrl", e);
            return str;
        }
    }

    public final java.lang.String OLrzqt(SubdomainStrategy subdomainStrategy, boolean z) {
        C33081mpi c33081mpi = C33081mpi.OLrzqt;
        if (c33081mpi.EZpvd() != null) {
            return c33081mpi.EZpvd();
        }
        kotlin.Pair<java.lang.Boolean, java.lang.String> pairCopydefault = C43341rnU.EZpvd.copydefault(subdomainStrategy != null ? subdomainStrategy.toString() : null, z);
        if (pairCopydefault.getFirst().booleanValue()) {
            return C43372rnz.copydefault.AEQbTJ(DohTypeEnum.HTTP, pairCopydefault.getSecond());
        }
        return OKDohConfig.Companion.KWHzl(DohTypeEnum.HTTP);
    }

    public final boolean OLrzqt(java.lang.String str, java.lang.String str2) {
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) C43372rnz.copydefault.EZpvd(DohTypeEnum.HTTP))) {
            return true;
        }
        if (str2 == null || str2.length() == 0 || C43363rnq.Companion.copydefault().EZpvd(str2)) {
            return false;
        }
        return C43341rnU.EZpvd(str);
    }
}

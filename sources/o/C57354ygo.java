package o;

import android.os.Build;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.bean.HostConfig;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ygo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57354ygo {
    public static final C57354ygo OLrzqt = new C57354ygo();
    public static final Function0<java.lang.String> copydefault = new Function0() { // from class: o.ygn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C57354ygo.OLrzqt();
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<java.lang.String> KWHzl() {
        return copydefault;
    }

    private C57354ygo() {
    }

    public static final byte[] KWHzl(@NotNull java.io.InputStream inputStream) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(inputStream, "");
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "");
                return byteArray;
            }
        }
    }

    public static final boolean OLrzqt(java.lang.String str) {
        if (str != null && str.length() != 0) {
            try {
                java.net.URI uri = new java.net.URI(str);
                java.lang.String host = uri.getHost();
                java.lang.String scheme = uri.getScheme();
                if (C43466rpn.OLrzqt.EZpvd(str) || AEQbTJ(str)) {
                    return true;
                }
                java.util.HashSet hashSet = new java.util.HashSet();
                hashSet.add(C33070mpX.AYXKKw(C32113mPz.LoaderManager.AEQbTJ));
                java.util.HashSet<java.lang.String> hashSet2 = new java.util.HashSet();
                if (C34704nhP.copydefault.copydefault()) {
                    hashSet.add("okexcomweb.bafang.com");
                    hashSet.add("okx.com");
                    hashSet2.add(".okx.com");
                }
                HostConfig hostConfig = (HostConfig) C48787ucK.AEQbTJ.EZpvd("hostConfig", HostConfig.class);
                if (hostConfig != null) {
                    pUU.valueOf("WebUtils", "hostConfig = " + hostConfig.getConfig());
                    hashSet.addAll(hostConfig.getConfig());
                }
                if (!C33129mqd.OLrzqt((java.lang.CharSequence) host)) {
                    return false;
                }
                if (!hashSet.contains(host)) {
                    if (hashSet2.isEmpty()) {
                        return false;
                    }
                    for (java.lang.String str2 : hashSet2) {
                        Intrinsics.copydefault((java.lang.Object) host);
                        if (C59449zhJ.endsWith$default(host, str2, false, 2, null)) {
                        }
                    }
                    return false;
                }
                return Intrinsics.EZpvd((java.lang.Object) scheme, (java.lang.Object) "https") || Intrinsics.EZpvd((java.lang.Object) scheme, (java.lang.Object) "http");
            } catch (java.lang.Exception e) {
                pUU.valueOf("WebUtils", "e = " + e);
            }
        }
        return false;
    }

    public final boolean KWHzl(java.lang.String str, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (str != null && str.length() != 0) {
            try {
                java.lang.String host = new java.net.URI(str).getHost();
                if (!C33129mqd.OLrzqt((java.lang.CharSequence) host)) {
                    return false;
                }
                if (!list.contains(host)) {
                    if (list.isEmpty()) {
                        return false;
                    }
                    for (java.lang.String str2 : list) {
                        Intrinsics.copydefault((java.lang.Object) host);
                        if (C59449zhJ.endsWith$default(host, JwtUtilsKt.JWT_DELIMITER + str2, false, 2, null)) {
                        }
                    }
                    return false;
                }
                return true;
            } catch (java.lang.Exception e) {
                pUU.valueOf("WebUtils", "e = " + e);
            }
        }
        return false;
    }

    public final void KWHzl(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        if (C43308rmo.KWHzl(application) || Build.VERSION.SDK_INT < 28) {
            return;
        }
        try {
            java.lang.String processName = android.app.Application.getProcessName();
            android.webkit.WebView.setDataDirectorySuffix(processName);
            pUU.KWHzl("WebUtils", "setWebViewDirectorySuffix: " + processName);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("WebUtils", "setWebViewDirectorySuffix:", e);
        }
    }

    public static final java.lang.String OLrzqt() {
        return C33070mpX.AYXKKw(C32113mPz.LoaderManager.AEQbTJ);
    }

    public final SubdomainStrategy EZpvd(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) "Global", (java.lang.Object) str)) {
            return SubdomainStrategy.Global.INSTANCE;
        }
        return new SubdomainStrategy.Subdomain(str);
    }

    public final boolean KWHzl(@NotNull android.net.Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        return Intrinsics.EZpvd((java.lang.Object) uri.getHost(), (java.lang.Object) "web3.okx.com");
    }

    public static final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            java.lang.String host = new java.net.URI(str).getHost();
            java.lang.String host2 = new java.net.URI(C43292rmY.OLrzqt.fJNWhG()).getHost();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) host)) {
                return Intrinsics.EZpvd((java.lang.Object) host, (java.lang.Object) host2);
            }
            return false;
        } catch (java.lang.Exception e) {
            pUU.valueOf("WebUtils", "e = " + e);
            return false;
        }
    }
}

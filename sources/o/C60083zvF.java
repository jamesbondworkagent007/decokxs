package o;

import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: renamed from: o.zvF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60083zvF {
    static {
        if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }

    private C60083zvF() {
    }

    public static java.lang.String AEQbTJ(java.lang.String str) {
        java.lang.String strKWHzl = C60088zvK.KWHzl(str);
        if (strKWHzl.length() < 128) {
            strKWHzl = C60090zvM.AEQbTJ(128 - strKWHzl.length()) + strKWHzl;
        }
        return C60086zvI.copydefault(strKWHzl).substring(r3.length() - 40);
    }
}

package o;

import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.net.IDN;
import org.apache.http.conn.util.DomainType;

/* JADX INFO: renamed from: o.zkB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59600zkB {
    public final java.util.Map<java.lang.String, DomainType> KWHzl;
    public final java.util.Map<java.lang.String, DomainType> OLrzqt;

    public static boolean AEQbTJ(java.util.Map<java.lang.String, DomainType> map, java.lang.String str, DomainType domainType) {
        DomainType domainType2;
        if (map == null || (domainType2 = map.get(str)) == null) {
            return false;
        }
        return domainType == null || domainType2.equals(domainType);
    }

    public final boolean AEQbTJ(java.lang.String str, DomainType domainType) {
        return AEQbTJ(this.OLrzqt, str, domainType);
    }

    public final boolean KWHzl(java.lang.String str, DomainType domainType) {
        return AEQbTJ(this.KWHzl, str, domainType);
    }

    public java.lang.String EZpvd(java.lang.String str, DomainType domainType) {
        if (str == null || str.startsWith(JwtUtilsKt.JWT_DELIMITER)) {
            return null;
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        java.lang.String str2 = null;
        while (lowerCase != null) {
            if (!KWHzl(IDN.toUnicode(lowerCase), domainType)) {
                if (AEQbTJ(IDN.toUnicode(lowerCase), domainType)) {
                    break;
                }
                int iIndexOf = lowerCase.indexOf(46);
                java.lang.String strSubstring = iIndexOf != -1 ? lowerCase.substring(iIndexOf + 1) : null;
                if (strSubstring != null) {
                    if (AEQbTJ("*." + IDN.toUnicode(strSubstring), domainType)) {
                        break;
                    }
                }
                if (iIndexOf != -1) {
                    str2 = lowerCase;
                }
                lowerCase = strSubstring;
            } else {
                return lowerCase;
            }
        }
        return str2;
    }

    public boolean EZpvd(java.lang.String str) {
        return copydefault(str, null);
    }

    public boolean copydefault(java.lang.String str, DomainType domainType) {
        if (str == null) {
            return false;
        }
        if (str.startsWith(JwtUtilsKt.JWT_DELIMITER)) {
            str = str.substring(1);
        }
        return EZpvd(str, domainType) == null;
    }
}

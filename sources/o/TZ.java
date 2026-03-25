package o;

import com.fasterxml.jackson.core.Base64Variant;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes21.dex */
public final class TZ {
    public static final Base64Variant AEQbTJ;
    public static final Base64Variant KWHzl;
    public static final Base64Variant OLrzqt;
    public static final Base64Variant copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Base64Variant AEQbTJ() {
        return AEQbTJ;
    }

    static {
        Base64Variant base64Variant = new Base64Variant("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        copydefault = base64Variant;
        AEQbTJ = new Base64Variant(base64Variant, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);
        KWHzl = new Base64Variant(base64Variant, "PEM", true, '=', 64);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb.setCharAt(sb.indexOf(Marker.ANY_NON_NULL_MARKER), '-');
        sb.setCharAt(sb.indexOf("/"), '_');
        OLrzqt = new Base64Variant("MODIFIED-FOR-URL", sb.toString(), false, (char) 0, Integer.MAX_VALUE);
    }

    public static Base64Variant AEQbTJ(java.lang.String str) throws java.lang.IllegalArgumentException {
        java.lang.String str2;
        Base64Variant base64Variant = copydefault;
        if (base64Variant._name.equals(str)) {
            return base64Variant;
        }
        Base64Variant base64Variant2 = AEQbTJ;
        if (base64Variant2._name.equals(str)) {
            return base64Variant2;
        }
        Base64Variant base64Variant3 = KWHzl;
        if (base64Variant3._name.equals(str)) {
            return base64Variant3;
        }
        Base64Variant base64Variant4 = OLrzqt;
        if (base64Variant4._name.equals(str)) {
            return base64Variant4;
        }
        if (str == null) {
            str2 = "<null>";
        } else {
            str2 = "'" + str + "'";
        }
        throw new java.lang.IllegalArgumentException("No Base64Variant with name " + str2);
    }
}

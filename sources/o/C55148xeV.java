package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.huawei.hms.framework.common.ContainerUtils;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.xeV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55148xeV {
    public static java.util.Map<java.lang.String, java.lang.String> KWHzl;
    public static Pattern copydefault = Pattern.compile("(&[a-z]*;|&#x?([a-f]|[A-F]|[0-9])*;|[\\s\n]+)");
    public static Pattern EZpvd = Pattern.compile("(&[a-z]*;|&#x?([a-f]|[A-F]|[0-9])*;)");

    static {
        java.util.HashMap map = new java.util.HashMap();
        KWHzl = map;
        map.put("&nbsp;", " ");
        KWHzl.put("&amp;", ContainerUtils.FIELD_DELIMITER);
        KWHzl.put("&quot;", ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        KWHzl.put("&cent;", "¢");
        KWHzl.put("&lt;", "<");
        KWHzl.put("&gt;", ">");
        KWHzl.put("&sect;", "§");
        KWHzl.put("&ldquo;", "“");
        KWHzl.put("&rdquo;", "”");
        KWHzl.put("&lsquo;", "‘");
        KWHzl.put("&rsquo;", "’");
        KWHzl.put("&ndash;", "–");
        KWHzl.put("&mdash;", "—");
        KWHzl.put("&horbar;", "―");
    }

    public static java.lang.String OLrzqt(java.lang.String str, boolean z) {
        Matcher matcher;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.String strReplace = str.replace("\n", "");
        java.util.HashMap map = new java.util.HashMap(KWHzl);
        if (z) {
            matcher = EZpvd.matcher(strReplace);
        } else {
            matcher = copydefault.matcher(strReplace);
            map.put("", " ");
            map.put("\n", " ");
        }
        while (matcher.find()) {
            try {
                matcher.appendReplacement(stringBuffer, KWHzl(matcher, map));
            } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static java.lang.String KWHzl(Matcher matcher, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.Integer numValueOf;
        java.lang.String strTrim = matcher.group(0).trim();
        java.lang.String str = map.get(strTrim);
        if (str != null) {
            return str;
        }
        if (strTrim.startsWith("&#")) {
            try {
                if (strTrim.startsWith("&#x")) {
                    numValueOf = java.lang.Integer.decode(EIP1271Verifier.hexPrefix + strTrim.substring(3, strTrim.length() - 1));
                } else {
                    numValueOf = java.lang.Integer.valueOf(java.lang.Integer.parseInt(strTrim.substring(2, strTrim.length() - 1)));
                }
                return "" + ((char) numValueOf.intValue());
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return "";
    }
}

package o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.mKm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C31965mKm {
    public static java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (str2.contains("timeout")) {
            sb.append("ping: cannot resolve " + str + ": Timeout");
        } else if (str2.contains("unknown")) {
            sb.append("ping: cannot resolve " + str + ": Unknown host");
        } else {
            KWHzl(str2, sb);
        }
        return sb.toString();
    }

    public static void KWHzl(java.lang.String str, java.lang.StringBuilder sb) {
        java.lang.String strEZpvd = EZpvd(str);
        java.util.List<java.lang.String> listKWHzl = KWHzl(str);
        java.util.List<java.lang.String> listCopydefault = copydefault(str);
        java.util.List<java.lang.String> listAEQbTJ = AEQbTJ(str);
        java.util.List<java.lang.String> listOLrzqt = OLrzqt(str);
        int size = listAEQbTJ.size();
        int i = 0;
        while (true) {
            int i2 = size - 1;
            if (i < i2) {
                sb.append(listKWHzl.get(i) + "bytes from " + strEZpvd + ": icmp_seq=#" + listOLrzqt.get(i) + " ttl=" + listCopydefault.get(i) + " time=" + listAEQbTJ.get(i) + "ms\n");
                i++;
            } else {
                sb.append(listKWHzl.get(i2) + "bytes from " + strEZpvd + ": icmp_seq=#" + listOLrzqt.get(i2) + " ttl=" + listCopydefault.get(i2) + " time=" + listAEQbTJ.get(i2) + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
                return;
            }
        }
    }

    public static java.util.List<java.lang.String> AEQbTJ(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        Matcher matcher = Pattern.compile("(?<==)([\\.0-9\\s]+)(?=ms)").matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.group().toString().trim());
        }
        return arrayList;
    }

    public static java.util.List<java.lang.String> KWHzl(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        Matcher matcher = Pattern.compile("(?<=\\D)([\\s0-9]+)(?=bytes)").matcher(str);
        while (matcher.find()) {
            java.lang.String strTrim = matcher.group().toString().trim();
            if (matcher.group().toString().trim().matches("\\d+")) {
                arrayList.add(strTrim);
            }
        }
        return arrayList;
    }

    public static java.util.List<java.lang.String> copydefault(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        Matcher matcher = Pattern.compile("(?<=ttl=)([0-9]+)(?=\\s)").matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.group().toString().trim());
        }
        return arrayList;
    }

    public static java.lang.String EZpvd(java.lang.String str) {
        Matcher matcher = Pattern.compile("(?<=\\()([\\d]+\\.)+[\\d]+(?=\\))").matcher(str);
        java.lang.String strTrim = null;
        while (matcher.find()) {
            strTrim = matcher.group().toString().trim();
        }
        return strTrim;
    }

    public static java.util.List<java.lang.String> OLrzqt(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        Matcher matcher = Pattern.compile("(?<=icmp_seq=)([0-9]+)(?=\\s)").matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.group().toString().trim());
        }
        return arrayList;
    }
}

package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: o.zps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59899zps {
    public static java.lang.String AEQbTJ = "${";
    public static java.lang.String KWHzl = "}";
    public java.lang.String copydefault;
    public java.util.Map<java.lang.String, java.lang.String> OLrzqt = new LinkedHashMap();
    public java.util.List<InterfaceC59834zoX> EZpvd = new java.util.ArrayList();
    public boolean djBIcL = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return (this.OLrzqt == null && this.EZpvd == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Map<java.lang.String, java.lang.String> copydefault() {
        return this.OLrzqt;
    }

    public java.util.Map<java.lang.String, java.lang.String> OLrzqt(java.util.Map<java.lang.String, java.lang.String> map) {
        boolean zEZpvd = EZpvd();
        boolean zOLrzqt = OLrzqt();
        if (!zOLrzqt && zEZpvd) {
            return map;
        }
        LinkedHashMap linkedHashMap = zEZpvd ? new LinkedHashMap(map) : new LinkedHashMap();
        if (zOLrzqt) {
            for (Map.Entry<java.lang.String, java.lang.String> entry : copydefault().entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String value = entry.getValue();
                if (value == null) {
                    linkedHashMap.remove(key);
                } else {
                    linkedHashMap.put(key, copydefault(value, map));
                }
            }
            for (InterfaceC59834zoX interfaceC59834zoX : this.EZpvd) {
                for (Map.Entry<java.lang.String, java.lang.String> entry2 : map.entrySet()) {
                    java.lang.String key2 = entry2.getKey();
                    if (interfaceC59834zoX.OLrzqt(key2, entry2.getValue())) {
                        java.lang.String strEZpvd = interfaceC59834zoX.EZpvd();
                        if (strEZpvd == null) {
                            linkedHashMap.remove(key2);
                        } else {
                            linkedHashMap.put(key2, copydefault(strEZpvd, map));
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public java.lang.String copydefault(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        if (str == null) {
            return str;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        int iIndexOf = str.indexOf(AEQbTJ);
        int iIndexOf2 = -1;
        while (iIndexOf >= 0 && iIndexOf < str.length()) {
            stringBuffer.append(str.substring(iIndexOf2 + 1, iIndexOf));
            iIndexOf2 = str.indexOf(KWHzl, iIndexOf);
            if (iIndexOf2 > iIndexOf) {
                java.lang.String str2 = map != null ? map.get(str.substring(AEQbTJ.length() + iIndexOf, iIndexOf2).toLowerCase()) : "";
                stringBuffer.append(str2 != null ? str2.toString() : "");
            }
            iIndexOf = str.indexOf(AEQbTJ, java.lang.Math.max(KWHzl.length() + iIndexOf2, iIndexOf + 1));
        }
        stringBuffer.append(str.substring(iIndexOf2 + 1));
        return stringBuffer.toString();
    }
}

package o;

import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;

/* JADX INFO: renamed from: o.acm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7065acm {
    public static java.lang.String OLrzqt(java.lang.String str, ULocale uLocale, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return OLrzqt((ICUResourceBundle) UResourceBundle.copydefault(str, uLocale.getBaseName()), str2, (java.lang.String) null, str3, str4);
    }

    public static java.lang.String OLrzqt(ICUResourceBundle iCUResourceBundle, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String strOLrzqt;
        java.lang.String strAEQbTJ = null;
        while (true) {
            try {
                ICUResourceBundle iCUResourceBundleGEmmrt = iCUResourceBundle.gEmmrt(str);
                if (iCUResourceBundleGEmmrt != null) {
                    ICUResourceBundle iCUResourceBundleGEmmrt2 = str2 != null ? iCUResourceBundleGEmmrt.gEmmrt(str2) : iCUResourceBundleGEmmrt;
                    if (iCUResourceBundleGEmmrt2 != null && (strAEQbTJ = iCUResourceBundleGEmmrt2.AEQbTJ(str3)) != null) {
                        break;
                    }
                    if (str2 == null) {
                        if (str.equals("Countries")) {
                            strOLrzqt = C7064acl.copydefault(str3);
                        } else {
                            strOLrzqt = str.equals("Languages") ? C7064acl.OLrzqt(str3) : null;
                        }
                        if (strOLrzqt != null && (strAEQbTJ = iCUResourceBundleGEmmrt.AEQbTJ(strOLrzqt)) != null) {
                            break;
                        }
                    }
                    java.lang.String strAEQbTJ2 = iCUResourceBundleGEmmrt.AEQbTJ("Fallback");
                    if (strAEQbTJ2 == null) {
                        return str4;
                    }
                    if (strAEQbTJ2.length() == 0) {
                        strAEQbTJ2 = "root";
                    }
                    if (strAEQbTJ2.equals(iCUResourceBundleGEmmrt.fetchVPNInfo().getName())) {
                        return str4;
                    }
                    iCUResourceBundle = (ICUResourceBundle) UResourceBundle.copydefault(iCUResourceBundle.EZpvd(), strAEQbTJ2);
                } else {
                    return str4;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return (strAEQbTJ == null || strAEQbTJ.length() <= 0) ? str4 : strAEQbTJ;
    }
}

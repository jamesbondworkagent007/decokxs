package o;

import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.util.ICUUncheckedIOException;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import java.util.MissingResourceException;

/* JADX INFO: renamed from: o.acY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7051acY {
    private C7051acY() {
    }

    /* JADX INFO: renamed from: o.acY$StateListAnimator */
    public static final class StateListAnimator {
        private StateListAnimator() {
        }

        public static java.lang.String EZpvd(java.lang.String str) {
            int i = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                if ('A' > cCharAt || cCharAt > 'Z') {
                    i++;
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
                    sb.append((java.lang.CharSequence) str, 0, i);
                    sb.append((char) (cCharAt + ' '));
                    while (true) {
                        i++;
                        if (i < str.length()) {
                            char cCharAt2 = str.charAt(i);
                            if ('A' <= cCharAt2 && cCharAt2 <= 'Z') {
                                cCharAt2 = (char) (cCharAt2 + ' ');
                            }
                            sb.append(cCharAt2);
                        } else {
                            return sb.toString();
                        }
                    }
                }
            }
            return str;
        }
    }

    public static final UResourceBundle OLrzqt(UResourceBundle uResourceBundle, java.lang.String str) {
        return ((ICUResourceBundle) uResourceBundle).gEmmrt(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: com.ibm.icu.util.ULocale */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: com.ibm.icu.util.ULocale */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: com.ibm.icu.util.ULocale */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b0  */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, com.ibm.icu.util.ULocale] */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, com.ibm.icu.util.ULocale] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, com.ibm.icu.util.ULocale] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, com.ibm.icu.util.ULocale, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C7108adc OLrzqt(ULocale uLocale, C7255agQ<ULocale> c7255agQ) {
        ?? r4;
        ULocale uLocale2;
        java.lang.String strAEQbTJ;
        C7108adc c7108adcOLrzqt = C7109add.OLrzqt();
        java.lang.String name = uLocale.getName();
        if (name.length() != 0 && !name.equals("root")) {
            try {
                ICUResourceBundle iCUResourceBundleOLrzqt = ICUResourceBundle.OLrzqt("com/ibm/icu/impl/data/icudt68b/coll", uLocale, ICUResourceBundle.OpenType.LOCALE_ROOT);
                ULocale uLocaleFetchVPNInfo = iCUResourceBundleOLrzqt.fetchVPNInfo();
                java.lang.String name2 = uLocaleFetchVPNInfo.getName();
                if (name2.length() != 0) {
                    r4 = uLocaleFetchVPNInfo;
                    if (name2.equals("root")) {
                        r4 = ULocale.ROOT;
                    }
                }
                c7255agQ.copydefault = r4;
                try {
                    UResourceBundle uResourceBundleIsConnected = iCUResourceBundleOLrzqt.isConnected("collations");
                    if (uResourceBundleIsConnected == null) {
                        return c7108adcOLrzqt;
                    }
                    java.lang.String keywordValue = uLocale.getKeywordValue("collation");
                    java.lang.String strAEQbTJ2 = ((ICUResourceBundle) uResourceBundleIsConnected).AEQbTJ("default");
                    if (strAEQbTJ2 == null) {
                        strAEQbTJ2 = "standard";
                    }
                    java.lang.String strEZpvd = (keywordValue == null || keywordValue.equals("default")) ? strAEQbTJ2 : StateListAnimator.EZpvd(keywordValue);
                    UResourceBundle uResourceBundleOLrzqt = OLrzqt(uResourceBundleIsConnected, strEZpvd);
                    if (uResourceBundleOLrzqt == null && strEZpvd.length() > 6 && strEZpvd.startsWith("search")) {
                        uResourceBundleOLrzqt = OLrzqt(uResourceBundleIsConnected, "search");
                        strEZpvd = "search";
                    }
                    if (uResourceBundleOLrzqt == null && !strEZpvd.equals(strAEQbTJ2)) {
                        uResourceBundleOLrzqt = OLrzqt(uResourceBundleIsConnected, strAEQbTJ2);
                        strEZpvd = strAEQbTJ2;
                    }
                    if (uResourceBundleOLrzqt == null && !strEZpvd.equals("standard")) {
                        uResourceBundleOLrzqt = OLrzqt(uResourceBundleIsConnected, "standard");
                        strEZpvd = "standard";
                    }
                    if (uResourceBundleOLrzqt == null) {
                        return c7108adcOLrzqt;
                    }
                    ULocale uLocaleFetchVPNInfo2 = uResourceBundleOLrzqt.fetchVPNInfo();
                    java.lang.String name3 = uLocaleFetchVPNInfo2.getName();
                    if (name3.length() != 0) {
                        uLocale2 = uLocaleFetchVPNInfo2;
                        if (name3.equals("root")) {
                            uLocale2 = ULocale.ROOT;
                            if (strEZpvd.equals("standard")) {
                                return c7108adcOLrzqt;
                            }
                        }
                    }
                    C7108adc c7108adc = new C7108adc(c7108adcOLrzqt.AhwBna);
                    c7108adc.copydefault = uLocale2;
                    try {
                        C7050acX.EZpvd(c7108adcOLrzqt, uResourceBundleOLrzqt.isConnected("%%CollationBin").ejfBZ(), c7108adc);
                        try {
                            c7108adc.EZpvd(uResourceBundleOLrzqt.isConnected("Sequence"));
                        } catch (MissingResourceException unused) {
                        }
                        if (!strEZpvd.equals(strAEQbTJ2)) {
                            c7255agQ.copydefault = r4.setKeywordValue("collation", strEZpvd);
                        }
                        if (!uLocale2.equals(r4) && (strAEQbTJ = ((ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b/coll", uLocale2)).AEQbTJ("collations/default")) != null) {
                            strAEQbTJ2 = strAEQbTJ;
                        }
                        if (!strEZpvd.equals(strAEQbTJ2)) {
                            c7108adc.copydefault = c7108adc.copydefault.setKeywordValue("collation", strEZpvd);
                        }
                        return c7108adc;
                    } catch (java.io.IOException e) {
                        throw new ICUUncheckedIOException("Failed to load collation tailoring data for locale:" + uLocale2 + " type:" + strEZpvd, e);
                    }
                } catch (MissingResourceException unused2) {
                    return c7108adcOLrzqt;
                }
            } catch (MissingResourceException unused3) {
                c7255agQ.copydefault = ULocale.ROOT;
                return c7108adcOLrzqt;
            }
        }
        c7255agQ.copydefault = ULocale.ROOT;
        return c7108adcOLrzqt;
    }
}

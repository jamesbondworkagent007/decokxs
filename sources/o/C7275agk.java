package o;

import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import java.util.MissingResourceException;

/* JADX INFO: renamed from: o.agk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7275agk {
    public static final java.lang.String[] AEQbTJ = {"native", "traditional", "finance"};
    public static final C7275agk EZpvd = AEQbTJ("latn");
    public static AbstractC7013abN<java.lang.String, C7275agk, Activity> KWHzl = new AbstractC7078acz<java.lang.String, C7275agk, Activity>() { // from class: o.agk.2
        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.AbstractC7013abN
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public C7275agk copydefault(java.lang.String str, Activity activity) {
            return C7275agk.AEQbTJ(activity);
        }
    };
    public static AbstractC7013abN<java.lang.String, C7275agk, java.lang.Void> OLrzqt = new AbstractC7078acz<java.lang.String, C7275agk, java.lang.Void>() { // from class: o.agk.1
        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.AbstractC7013abN
        public C7275agk copydefault(java.lang.String str, java.lang.Void r2) {
            return C7275agk.AEQbTJ(str);
        }
    };
    public int valueOf = 10;
    public boolean copydefault = false;
    public java.lang.String AYXKKw = "0123456789";
    public java.lang.String djBIcL = "latn";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.copydefault;
    }

    public static C7275agk AEQbTJ(java.lang.String str, int i, boolean z, java.lang.String str2) {
        if (i < 2) {
            throw new java.lang.IllegalArgumentException("Invalid radix for numbering system");
        }
        if (!z && (str2.codePointCount(0, str2.length()) != i || !copydefault(str2))) {
            throw new java.lang.IllegalArgumentException("Invalid digit string for numbering system");
        }
        C7275agk c7275agk = new C7275agk();
        c7275agk.valueOf = i;
        c7275agk.copydefault = z;
        c7275agk.AYXKKw = str2;
        c7275agk.djBIcL = str;
        return c7275agk;
    }

    public static C7275agk EZpvd(ULocale uLocale) {
        java.lang.String keywordValue = uLocale.getKeywordValue("numbers");
        java.lang.String str = "default";
        boolean z = false;
        if (keywordValue != null) {
            java.lang.String[] strArr = AEQbTJ;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                if (keywordValue.equals(strArr[i])) {
                    break;
                }
                i++;
            }
        } else {
            keywordValue = "default";
        }
        if (z) {
            C7275agk c7275agkOLrzqt = OLrzqt(keywordValue);
            if (c7275agkOLrzqt != null) {
                return c7275agkOLrzqt;
            }
        } else {
            str = keywordValue;
        }
        return KWHzl.AEQbTJ(uLocale.getBaseName() + "@numbers=" + str, new Activity(uLocale, str));
    }

    /* JADX INFO: renamed from: o.agk$Activity */
    public static class Activity {
        public final java.lang.String EZpvd;
        public final ULocale OLrzqt;

        public Activity(ULocale uLocale, java.lang.String str) {
            this.OLrzqt = uLocale;
            this.EZpvd = str;
        }
    }

    public static C7275agk AEQbTJ(Activity activity) {
        java.lang.String strDjBIcL;
        try {
            ICUResourceBundle iCUResourceBundleValueOf = ((ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b", activity.OLrzqt)).valueOf("NumberElements");
            java.lang.String str = activity.EZpvd;
            while (true) {
                try {
                    strDjBIcL = iCUResourceBundleValueOf.djBIcL(str);
                    break;
                } catch (MissingResourceException unused) {
                    if (!str.equals("native") && !str.equals("finance")) {
                        if (!str.equals("traditional")) {
                            strDjBIcL = null;
                            break;
                        }
                        str = "native";
                    } else {
                        str = "default";
                    }
                }
            }
            C7275agk c7275agkOLrzqt = strDjBIcL != null ? OLrzqt(strDjBIcL) : null;
            return c7275agkOLrzqt == null ? new C7275agk() : c7275agkOLrzqt;
        } catch (MissingResourceException unused2) {
            return new C7275agk();
        }
    }

    public static C7275agk OLrzqt(java.lang.String str) {
        return OLrzqt.AEQbTJ(str, null);
    }

    public static C7275agk AEQbTJ(java.lang.String str) {
        try {
            UResourceBundle uResourceBundleIsConnected = UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "numberingSystems").isConnected("numberingSystems").isConnected(str);
            return AEQbTJ(str, uResourceBundleIsConnected.isConnected("radix").fIwbmz(), uResourceBundleIsConnected.isConnected("algorithmic").fIwbmz() == 1, uResourceBundleIsConnected.getString("desc"));
        } catch (MissingResourceException unused) {
            return null;
        }
    }

    public static boolean copydefault(java.lang.String str) {
        return str.codePointCount(0, str.length()) == 10;
    }
}

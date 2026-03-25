package o;

import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.text.PluralRules;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.MissingResourceException;
import java.util.TreeMap;

/* JADX INFO: renamed from: o.acs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7071acs extends PluralRules.Activity {
    public static final C7071acs copydefault = new C7071acs();
    public java.util.Map<java.lang.String, java.lang.String> AEQbTJ;
    public final java.util.Map<java.lang.String, PluralRules> EZpvd = new java.util.HashMap();
    public java.util.Map<java.lang.String, java.lang.String> KWHzl;
    public java.util.Map<java.lang.String, ULocale> OLrzqt;

    private C7071acs() {
    }

    public ULocale[] AEQbTJ() {
        java.util.Set<java.lang.String> setKeySet = EZpvd(PluralRules.PluralType.CARDINAL).keySet();
        LinkedHashSet linkedHashSet = new LinkedHashSet(setKeySet.size());
        java.util.Iterator<java.lang.String> it = setKeySet.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(ULocale.createCanonical(it.next()));
        }
        return (ULocale[]) linkedHashSet.toArray(new ULocale[0]);
    }

    public ULocale EZpvd(ULocale uLocale, boolean[] zArr) {
        if (zArr != null && zArr.length > 0) {
            zArr[0] = EZpvd(PluralRules.PluralType.CARDINAL).containsKey(ULocale.canonicalize(uLocale.getBaseName()));
        }
        java.lang.String strKWHzl = KWHzl(uLocale, PluralRules.PluralType.CARDINAL);
        if (strKWHzl == null || strKWHzl.trim().length() == 0) {
            return ULocale.ROOT;
        }
        ULocale uLocale2 = copydefault().get(strKWHzl);
        return uLocale2 == null ? ULocale.ROOT : uLocale2;
    }

    public final java.util.Map<java.lang.String, java.lang.String> EZpvd(PluralRules.PluralType pluralType) {
        KWHzl();
        return pluralType == PluralRules.PluralType.CARDINAL ? this.AEQbTJ : this.KWHzl;
    }

    public final java.util.Map<java.lang.String, ULocale> copydefault() {
        KWHzl();
        return this.OLrzqt;
    }

    public final void KWHzl() {
        int i;
        boolean z;
        java.util.Map<java.lang.String, java.lang.String> mapEmptyMap;
        java.util.Map<java.lang.String, java.lang.String> mapEmptyMap2;
        java.util.Map<java.lang.String, ULocale> mapEmptyMap3;
        synchronized (this) {
            z = this.AEQbTJ != null;
        }
        if (z) {
            return;
        }
        try {
            UResourceBundle uResourceBundleOLrzqt = OLrzqt();
            UResourceBundle uResourceBundleIsConnected = uResourceBundleOLrzqt.isConnected("locales");
            mapEmptyMap = new TreeMap<>();
            mapEmptyMap3 = new java.util.HashMap<>();
            for (int i2 = 0; i2 < uResourceBundleIsConnected.fARcdN(); i2++) {
                UResourceBundle uResourceBundleKWHzl = uResourceBundleIsConnected.KWHzl(i2);
                java.lang.String strAEQbTJ = uResourceBundleKWHzl.AEQbTJ();
                java.lang.String strIntern = uResourceBundleKWHzl.getFieldNames().intern();
                mapEmptyMap.put(strAEQbTJ, strIntern);
                if (!mapEmptyMap3.containsKey(strIntern)) {
                    mapEmptyMap3.put(strIntern, new ULocale(strAEQbTJ));
                }
            }
            UResourceBundle uResourceBundleIsConnected2 = uResourceBundleOLrzqt.isConnected("locales_ordinals");
            mapEmptyMap2 = new TreeMap<>();
            for (i = 0; i < uResourceBundleIsConnected2.fARcdN(); i++) {
                UResourceBundle uResourceBundleKWHzl2 = uResourceBundleIsConnected2.KWHzl(i);
                mapEmptyMap2.put(uResourceBundleKWHzl2.AEQbTJ(), uResourceBundleKWHzl2.getFieldNames().intern());
            }
        } catch (MissingResourceException unused) {
            mapEmptyMap = Collections.emptyMap();
            mapEmptyMap2 = Collections.emptyMap();
            mapEmptyMap3 = Collections.emptyMap();
        }
        synchronized (this) {
            if (this.AEQbTJ == null) {
                this.AEQbTJ = mapEmptyMap;
                this.KWHzl = mapEmptyMap2;
                this.OLrzqt = mapEmptyMap3;
            }
        }
    }

    public java.lang.String KWHzl(ULocale uLocale, PluralRules.PluralType pluralType) {
        java.lang.String str;
        int iLastIndexOf;
        java.util.Map<java.lang.String, java.lang.String> mapEZpvd = EZpvd(pluralType);
        java.lang.String strCanonicalize = ULocale.canonicalize(uLocale.getBaseName());
        while (true) {
            str = mapEZpvd.get(strCanonicalize);
            if (str != null || (iLastIndexOf = strCanonicalize.lastIndexOf("_")) == -1) {
                break;
            }
            strCanonicalize = strCanonicalize.substring(0, iLastIndexOf);
        }
        return str;
    }

    public PluralRules OLrzqt(ULocale uLocale, PluralRules.PluralType pluralType) {
        boolean zContainsKey;
        PluralRules pluralRulesNewInternal;
        java.lang.String strKWHzl = KWHzl(uLocale, pluralType);
        if (strKWHzl == null || strKWHzl.trim().length() == 0) {
            return null;
        }
        java.lang.String strOLrzqt = C7158aeZ.OLrzqt(uLocale);
        java.lang.String str = strKWHzl + "/" + strOLrzqt;
        synchronized (this.EZpvd) {
            zContainsKey = this.EZpvd.containsKey(str);
            pluralRulesNewInternal = zContainsKey ? this.EZpvd.get(str) : null;
        }
        if (!zContainsKey) {
            try {
                UResourceBundle uResourceBundleIsConnected = OLrzqt().isConnected("rules").isConnected(strKWHzl);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                for (int i = 0; i < uResourceBundleIsConnected.fARcdN(); i++) {
                    UResourceBundle uResourceBundleKWHzl = uResourceBundleIsConnected.KWHzl(i);
                    if (i > 0) {
                        sb.append("; ");
                    }
                    sb.append(uResourceBundleKWHzl.AEQbTJ());
                    sb.append(": ");
                    sb.append(uResourceBundleKWHzl.getFieldNames());
                }
                pluralRulesNewInternal = PluralRules.newInternal(sb.toString(), C7158aeZ.KWHzl(strOLrzqt));
            } catch (java.text.ParseException | MissingResourceException unused) {
            }
            synchronized (this.EZpvd) {
                if (this.EZpvd.containsKey(str)) {
                    pluralRulesNewInternal = this.EZpvd.get(str);
                } else {
                    this.EZpvd.put(str, pluralRulesNewInternal);
                }
            }
        }
        return pluralRulesNewInternal;
    }

    public UResourceBundle OLrzqt() throws MissingResourceException {
        return ICUResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "plurals", ICUResourceBundle.AEQbTJ, true);
    }

    public PluralRules copydefault(ULocale uLocale, PluralRules.PluralType pluralType) {
        PluralRules pluralRulesOLrzqt = OLrzqt(uLocale, pluralType);
        return pluralRulesOLrzqt == null ? PluralRules.DEFAULT : pluralRulesOLrzqt;
    }
}

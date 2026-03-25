package o;

import com.ibm.icu.impl.CurrencyData;
import com.ibm.icu.util.ULocale;

/* JADX INFO: renamed from: o.afT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7205afT {
    public abstract java.util.Map<java.lang.String, java.lang.String> AEQbTJ();

    public abstract java.lang.String EZpvd(java.lang.String str);

    public abstract java.lang.String KWHzl(java.lang.String str);

    public abstract java.lang.String OLrzqt(java.lang.String str);

    public abstract java.lang.String OLrzqt(java.lang.String str, java.lang.String str2);

    public abstract java.util.Map<java.lang.String, java.lang.String> OLrzqt();

    public abstract java.lang.String copydefault(java.lang.String str);

    public abstract java.lang.String valueOf(java.lang.String str);

    public static AbstractC7205afT KWHzl(ULocale uLocale) {
        return CurrencyData.KWHzl.OLrzqt(uLocale, true);
    }

    @java.lang.Deprecated
    public AbstractC7205afT() {
    }
}

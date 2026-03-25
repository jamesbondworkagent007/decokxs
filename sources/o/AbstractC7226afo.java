package o;

import com.ibm.icu.util.Currency;

/* JADX INFO: renamed from: o.afo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7226afo extends AbstractC7236afy {
    public AbstractC7236afy EZpvd(Currency currency) {
        if (currency != null) {
            return AbstractC7236afy.EZpvd(this, currency);
        }
        throw new java.lang.IllegalArgumentException("Currency must not be null");
    }
}

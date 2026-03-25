package o;

import com.ibm.icu.number.NumberRangeFormatter;
import com.ibm.icu.util.ULocale;
import o.AbstractC7186afA;

/* JADX INFO: renamed from: o.afA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC7186afA<T extends AbstractC7186afA<?>> {
    public volatile C7213afb AEQbTJ;
    public final java.lang.Object EZpvd;
    public final int KWHzl;
    public final AbstractC7186afA<?> copydefault;

    public AbstractC7186afA(AbstractC7186afA<?> abstractC7186afA, int i, java.lang.Object obj) {
        this.copydefault = abstractC7186afA;
        this.KWHzl = i;
        this.EZpvd = obj;
    }

    public C7213afb EZpvd() {
        if (this.AEQbTJ != null) {
            return this.AEQbTJ;
        }
        C7213afb c7213afb = new C7213afb();
        for (AbstractC7186afA abstractC7186afA = this; abstractC7186afA != null; abstractC7186afA = abstractC7186afA.copydefault) {
            switch (abstractC7186afA.KWHzl) {
                case 0:
                    break;
                case 1:
                    if (c7213afb.copydefault == null) {
                        c7213afb.copydefault = (ULocale) abstractC7186afA.EZpvd;
                    }
                    break;
                case 2:
                    if (c7213afb.AEQbTJ == null) {
                        c7213afb.AEQbTJ = (C7187afB) abstractC7186afA.EZpvd;
                    }
                    break;
                case 3:
                    if (c7213afb.KWHzl == null) {
                        c7213afb.KWHzl = (C7187afB) abstractC7186afA.EZpvd;
                    }
                    break;
                case 4:
                    if (c7213afb.AYXKKw == -1) {
                        c7213afb.AYXKKw = ((java.lang.Boolean) abstractC7186afA.EZpvd).booleanValue() ? 1 : 0;
                    }
                    break;
                case 5:
                    if (c7213afb.EZpvd == null) {
                        c7213afb.EZpvd = (NumberRangeFormatter.RangeCollapse) abstractC7186afA.EZpvd;
                    }
                    break;
                case 6:
                    if (c7213afb.OLrzqt == null) {
                        c7213afb.OLrzqt = (NumberRangeFormatter.RangeIdentityFallback) abstractC7186afA.EZpvd;
                    }
                    break;
                default:
                    throw new java.lang.AssertionError("Unknown key: " + abstractC7186afA.KWHzl);
            }
        }
        C7187afB c7187afB = c7213afb.AEQbTJ;
        if (c7187afB != null) {
            c7187afB.AEQbTJ().copydefault = c7213afb.copydefault;
        }
        C7187afB c7187afB2 = c7213afb.KWHzl;
        if (c7187afB2 != null) {
            c7187afB2.AEQbTJ().copydefault = c7213afb.copydefault;
        }
        this.AEQbTJ = c7213afb;
        return c7213afb;
    }

    public int hashCode() {
        return EZpvd().hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof AbstractC7186afA)) {
            return EZpvd().equals(((AbstractC7186afA) obj).EZpvd());
        }
        return false;
    }
}

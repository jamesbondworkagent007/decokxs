package o;

import com.ibm.icu.impl.number.Padder;
import com.ibm.icu.number.NumberFormatter;
import com.ibm.icu.number.NumberSkeletonImpl;
import com.ibm.icu.text.DecimalFormatSymbols;
import com.ibm.icu.util.MeasureUnit;
import com.ibm.icu.util.ULocale;
import java.math.RoundingMode;
import o.AbstractC7229afr;

/* JADX INFO: renamed from: o.afr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7229afr<T extends AbstractC7229afr<?>> {
    public final java.lang.Object AYXKKw;
    public volatile C7168aej AhwBna;
    public final AbstractC7229afr<?> OLrzqt;
    public final int copydefault;

    public abstract T AEQbTJ(int i, java.lang.Object obj);

    public AbstractC7229afr(AbstractC7229afr<?> abstractC7229afr, int i, java.lang.Object obj) {
        this.OLrzqt = abstractC7229afr;
        this.copydefault = i;
        this.AYXKKw = obj;
    }

    public T OLrzqt(C7230afs c7230afs) {
        return (T) AEQbTJ(2, c7230afs);
    }

    public T KWHzl(MeasureUnit measureUnit) {
        return (T) AEQbTJ(3, measureUnit);
    }

    public T AEQbTJ(MeasureUnit measureUnit) {
        return (T) AEQbTJ(15, measureUnit);
    }

    public T KWHzl(AbstractC7236afy abstractC7236afy) {
        return (T) AEQbTJ(4, abstractC7236afy);
    }

    public T OLrzqt(RoundingMode roundingMode) {
        return (T) AEQbTJ(5, roundingMode);
    }

    public T EZpvd(NumberFormatter.GroupingStrategy groupingStrategy) {
        return (T) AEQbTJ(6, groupingStrategy);
    }

    public T KWHzl(C7228afq c7228afq) {
        return (T) AEQbTJ(8, c7228afq);
    }

    public T OLrzqt(DecimalFormatSymbols decimalFormatSymbols) {
        return (T) AEQbTJ(9, (DecimalFormatSymbols) decimalFormatSymbols.clone());
    }

    public T copydefault(NumberFormatter.UnitWidth unitWidth) {
        return (T) AEQbTJ(10, unitWidth);
    }

    public T KWHzl(NumberFormatter.SignDisplay signDisplay) {
        return (T) AEQbTJ(11, signDisplay);
    }

    public T OLrzqt(C7235afx c7235afx) {
        return (T) AEQbTJ(13, c7235afx);
    }

    @java.lang.Deprecated
    public T OLrzqt(C7168aej c7168aej) {
        return (T) AEQbTJ(0, c7168aej);
    }

    public java.lang.String EZpvd() {
        return NumberSkeletonImpl.copydefault(AEQbTJ());
    }

    public C7168aej AEQbTJ() {
        if (this.AhwBna != null) {
            return this.AhwBna;
        }
        C7168aej c7168aej = new C7168aej();
        for (AbstractC7229afr abstractC7229afr = this; abstractC7229afr != null; abstractC7229afr = abstractC7229afr.OLrzqt) {
            switch (abstractC7229afr.copydefault) {
                case 0:
                    c7168aej.EZpvd((C7168aej) abstractC7229afr.AYXKKw);
                    break;
                case 1:
                    if (c7168aej.copydefault == null) {
                        c7168aej.copydefault = (ULocale) abstractC7229afr.AYXKKw;
                    }
                    break;
                case 2:
                    if (c7168aej.AYXKKw == null) {
                        c7168aej.AYXKKw = (C7230afs) abstractC7229afr.AYXKKw;
                    }
                    break;
                case 3:
                    if (c7168aej.ejfBZ == null) {
                        c7168aej.ejfBZ = (MeasureUnit) abstractC7229afr.AYXKKw;
                    }
                    break;
                case 4:
                    if (c7168aej.valueOf == null) {
                        c7168aej.valueOf = (AbstractC7236afy) abstractC7229afr.AYXKKw;
                    }
                    break;
                case 5:
                    if (c7168aej.gEmmrt == null) {
                        c7168aej.gEmmrt = (RoundingMode) abstractC7229afr.AYXKKw;
                    }
                    break;
                case 6:
                    if (c7168aej.EZpvd == null) {
                        c7168aej.EZpvd = abstractC7229afr.AYXKKw;
                    }
                    break;
                case 7:
                    if (c7168aej.djBIcL == null) {
                        c7168aej.djBIcL = (Padder) abstractC7229afr.AYXKKw;
                    }
                    break;
                case 8:
                    if (c7168aej.OLrzqt == null) {
                        c7168aej.OLrzqt = (C7228afq) abstractC7229afr.AYXKKw;
                    }
                    break;
                case 9:
                    if (c7168aej.fetchVPNInfo == null) {
                        c7168aej.fetchVPNInfo = abstractC7229afr.AYXKKw;
                    }
                    break;
                case 10:
                    if (c7168aej.fIwbmz == null) {
                        c7168aej.fIwbmz = (NumberFormatter.UnitWidth) abstractC7229afr.AYXKKw;
                    }
                    break;
                case 11:
                    if (c7168aej.AkhnZx == null) {
                        c7168aej.AkhnZx = (NumberFormatter.SignDisplay) abstractC7229afr.AYXKKw;
                    }
                    break;
                case 12:
                    if (c7168aej.KWHzl == null) {
                        c7168aej.KWHzl = (NumberFormatter.DecimalSeparatorDisplay) abstractC7229afr.AYXKKw;
                    }
                    break;
                case 13:
                    if (c7168aej.isConnected == null) {
                        c7168aej.isConnected = (C7235afx) abstractC7229afr.AYXKKw;
                    }
                    break;
                case 14:
                    if (c7168aej.values == null) {
                        c7168aej.values = (java.lang.Long) abstractC7229afr.AYXKKw;
                    }
                    break;
                case 15:
                    if (c7168aej.AhwBna == null) {
                        c7168aej.AhwBna = (MeasureUnit) abstractC7229afr.AYXKKw;
                    }
                    break;
                case 16:
                    if (c7168aej.fARcdN == null) {
                        c7168aej.fARcdN = (java.lang.String) abstractC7229afr.AYXKKw;
                    }
                    break;
                default:
                    throw new java.lang.AssertionError("Unknown key: " + abstractC7229afr.copydefault);
            }
        }
        this.AhwBna = c7168aej;
        return c7168aej;
    }

    public int hashCode() {
        return AEQbTJ().hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof AbstractC7229afr)) {
            return AEQbTJ().equals(((AbstractC7229afr) obj).AEQbTJ());
        }
        return false;
    }
}

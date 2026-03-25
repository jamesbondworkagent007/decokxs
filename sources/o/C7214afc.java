package o;

import com.ibm.icu.impl.units.MeasureUnitImpl;
import com.ibm.icu.impl.units.UnitConverter;
import com.ibm.icu.util.MeasureUnit;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;

/* JADX INFO: renamed from: o.afc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7214afc {
    public static final BigDecimal AEQbTJ;
    public static final BigDecimal OLrzqt;
    public java.util.ArrayList<MeasureUnitImpl> EZpvd;
    public java.util.ArrayList<MeasureUnit> KWHzl;
    public java.util.ArrayList<UnitConverter> copydefault;

    static {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(java.lang.Math.ulp(1.0d));
        AEQbTJ = bigDecimalValueOf;
        OLrzqt = BigDecimal.valueOf(1L).add(bigDecimalValueOf);
    }

    public C7214afc(MeasureUnitImpl measureUnitImpl, MeasureUnitImpl measureUnitImpl2, C7218afg c7218afg) {
        this.EZpvd = measureUnitImpl2.EZpvd();
        this.KWHzl = new java.util.ArrayList<>(this.EZpvd.size());
        java.util.Iterator<MeasureUnitImpl> it = this.EZpvd.iterator();
        while (it.hasNext()) {
            this.KWHzl.add(it.next().AEQbTJ());
        }
        Collections.sort(this.EZpvd, Collections.reverseOrder(new MeasureUnitImpl.StateListAnimator(c7218afg)));
        this.copydefault = new java.util.ArrayList<>();
        int size = this.EZpvd.size();
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                this.copydefault.add(new UnitConverter(measureUnitImpl, this.EZpvd.get(i), c7218afg));
            } else {
                this.copydefault.add(new UnitConverter(this.EZpvd.get(i - 1), this.EZpvd.get(i), c7218afg));
            }
        }
    }

    public boolean OLrzqt(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return this.copydefault.get(0).AEQbTJ(bigDecimal).multiply(OLrzqt).compareTo(bigDecimal2) >= 0;
    }

    public java.util.List<C7254agP> OLrzqt(BigDecimal bigDecimal, AbstractC7236afy abstractC7236afy) {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.copydefault.size());
        BigDecimal bigDecimalNegate = BigDecimal.ONE;
        if (bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
            bigDecimal = bigDecimal.abs();
            bigDecimalNegate = bigDecimalNegate.negate();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(this.copydefault.size() - 1);
        int size = this.copydefault.size();
        for (int i = 0; i < size; i++) {
            bigDecimal = this.copydefault.get(i).AEQbTJ(bigDecimal);
            if (i < size - 1) {
                BigDecimal scale = bigDecimal.multiply(OLrzqt).setScale(0, RoundingMode.FLOOR);
                arrayList2.add(scale);
                bigDecimal = bigDecimal.subtract(scale);
                BigDecimal bigDecimal2 = BigDecimal.ZERO;
                if (bigDecimal.compareTo(bigDecimal2) == -1) {
                    bigDecimal = bigDecimal2;
                }
            } else {
                if (abstractC7236afy == null) {
                    break;
                }
                C7167aei c7167aei = new C7167aei(bigDecimal);
                abstractC7236afy.AEQbTJ(c7167aei);
                bigDecimal = c7167aei.AhwBna();
                if (i == 0) {
                    break;
                }
                BigDecimal scale2 = this.copydefault.get(i).OLrzqt(bigDecimal).multiply(OLrzqt).setScale(0, RoundingMode.FLOOR);
                if (scale2.compareTo(BigDecimal.ZERO) <= 0) {
                    break;
                }
                bigDecimal = bigDecimal.subtract(this.copydefault.get(i).AEQbTJ(scale2));
                int i2 = i - 1;
                arrayList2.set(i2, ((BigDecimal) arrayList2.get(i2)).add(scale2));
                while (i2 > 0) {
                    BigDecimal scale3 = this.copydefault.get(i2).OLrzqt((BigDecimal) arrayList2.get(i2)).multiply(OLrzqt).setScale(0, RoundingMode.FLOOR);
                    if (scale3.compareTo(BigDecimal.ZERO) <= 0) {
                        break;
                    }
                    arrayList2.set(i2, ((BigDecimal) arrayList2.get(i2)).subtract(this.copydefault.get(i2).AEQbTJ(scale3)));
                    int i3 = i2 - 1;
                    arrayList2.set(i3, ((BigDecimal) arrayList2.get(i3)).add(scale3));
                    i2--;
                }
            }
        }
        int size2 = this.copydefault.size();
        for (int i4 = 0; i4 < size2; i4++) {
            if (i4 < size2 - 1) {
                arrayList.add(new C7254agP(((BigDecimal) arrayList2.get(i4)).multiply(bigDecimalNegate), this.EZpvd.get(i4).AEQbTJ()));
            } else {
                arrayList.add(new C7254agP(bigDecimal.multiply(bigDecimalNegate), this.EZpvd.get(i4).AEQbTJ()));
            }
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            for (int i6 = i5; i6 < arrayList.size(); i6++) {
                if (((C7254agP) arrayList.get(i6)).EZpvd().equals(this.KWHzl.get(i5)) && i6 != i5) {
                    C7254agP c7254agP = (C7254agP) arrayList.get(i6);
                    arrayList.set(i6, arrayList.get(i5));
                    arrayList.set(i5, c7254agP);
                }
            }
        }
        return arrayList;
    }

    public java.lang.String toString() {
        return "ComplexUnitsConverter [unitConverters_=" + this.copydefault + ", units_=" + this.EZpvd + "]";
    }
}

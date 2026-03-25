package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kBk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27735kBk {
    public static final <T> java.util.List<C27730kBf<T>> EZpvd(int i, int i2, int i3, int i4, @NotNull java.util.List<C27726kBb<T>> list) {
        int i5;
        int iIntValue;
        java.lang.Number numberValueOf;
        java.lang.Number numberValueOf2;
        java.util.ArrayList arrayList;
        int i6;
        int i7;
        double dAEQbTJ;
        double dAEQbTJ2;
        double d;
        double dAEQbTJ3;
        java.util.List<C27726kBb<T>> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "");
        if (list.isEmpty()) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Double.valueOf(C33129mqd.AEQbTJ(java.lang.Double.valueOf(((C27726kBb) it.next()).EZpvd()))));
        }
        java.util.Iterator<T> it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
        }
        T next = it2.next();
        while (it2.hasNext()) {
            next = (T) java.lang.Double.valueOf(next.doubleValue() + ((java.lang.Number) it2.next()).doubleValue());
        }
        double dDoubleValue = next.doubleValue();
        int iIntValue2 = i2;
        boolean z = i > iIntValue2;
        java.util.ArrayList<C27726kBb> arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        int size = list.size();
        int i8 = i;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        int i9 = 0;
        double d5 = 1.0d;
        double d6 = dDoubleValue;
        int i10 = i3;
        int i11 = i4;
        while (i9 < size) {
            C27726kBb<T> c27726kBb = list2.get(i9);
            int i12 = size;
            int i13 = z ? i8 : iIntValue2;
            int i14 = i9;
            int i15 = z ? iIntValue2 : i8;
            int i16 = i10;
            int i17 = i11;
            double dMin = java.lang.Math.min(C33129mqd.AEQbTJ(java.lang.Double.valueOf(c27726kBb.EZpvd())), d2);
            int i18 = iIntValue2;
            boolean z2 = z;
            double dMax = java.lang.Math.max(C33129mqd.AEQbTJ(java.lang.Double.valueOf(c27726kBb.EZpvd())), d3);
            double dEZpvd = d4 + c27726kBb.EZpvd();
            java.util.ArrayList arrayList5 = arrayList4;
            double d7 = i13;
            double d8 = (dEZpvd / d6) * d7;
            double d9 = i15;
            double d10 = d8 / ((dMax / dEZpvd) * d9);
            double d11 = d6;
            if (d10 < 1.0d) {
                i5 = 1;
                d10 = ((double) 1) / d10;
            } else {
                i5 = 1;
            }
            double d12 = d8 / ((dMin / dEZpvd) * d9);
            if (d12 < 1.0d) {
                d12 = ((double) i5) / d12;
            }
            if (d5 >= java.lang.Math.max(d10, d12)) {
                arrayList3.add(c27726kBb);
                double dEZpvd2 = d4 + c27726kBb.EZpvd();
                double dMax2 = java.lang.Math.max(d3, C33129mqd.AEQbTJ(java.lang.Double.valueOf(c27726kBb.EZpvd())));
                double dMin2 = java.lang.Math.min(d2, C33129mqd.AEQbTJ(java.lang.Double.valueOf(c27726kBb.EZpvd())));
                double d13 = 1;
                double dAbs = java.lang.Math.abs(((((c27726kBb.EZpvd() + dEZpvd2) / d11) * d7) / ((dMax2 / (c27726kBb.EZpvd() + dEZpvd2)) * d9)) - d13);
                if (dAbs < 1.0d) {
                    dAbs = d13 / dAbs;
                }
                double dAbs2 = java.lang.Math.abs(((((c27726kBb.EZpvd() + dEZpvd2) / d11) * d7) / ((dMin2 / (dEZpvd2 + c27726kBb.EZpvd())) * d9)) - d13);
                if (dAbs2 < 1.0d) {
                    dAbs2 = d13 / dAbs2;
                }
                double dMax3 = java.lang.Math.max(dAbs, dAbs2);
                dAEQbTJ = dMax2;
                dAEQbTJ3 = dEZpvd2;
                arrayList = arrayList5;
                z = z2;
                d6 = d11;
                i10 = i16;
                i11 = i17;
                dAEQbTJ2 = dMin2;
                iIntValue = i8;
                iIntValue2 = i18;
                d = dMax3;
            } else {
                if (z2) {
                    iIntValue = i8;
                    numberValueOf = java.lang.Double.valueOf(((double) iIntValue) * (d4 / d11));
                } else {
                    iIntValue = i8;
                    numberValueOf = java.lang.Integer.valueOf(iIntValue);
                }
                if (z2) {
                    numberValueOf2 = java.lang.Integer.valueOf(i18);
                    iIntValue2 = i18;
                } else {
                    iIntValue2 = i18;
                    numberValueOf2 = java.lang.Double.valueOf(((double) iIntValue2) * (d4 / d11));
                }
                int i19 = 0;
                int i20 = 0;
                for (C27726kBb c27726kBb2 : arrayList3) {
                    double dEZpvd3 = ((double) (((float) c27726kBb2.EZpvd()) * (z2 ? iIntValue2 : iIntValue))) / d4;
                    java.util.ArrayList arrayList6 = arrayList5;
                    arrayList6.add(new C27730kBf(i16 + i19, i17 + i20, z2 ? numberValueOf.floatValue() : (float) dEZpvd3, z2 ? (float) dEZpvd3 : numberValueOf2.floatValue(), c27726kBb2.KWHzl()));
                    int i21 = (int) dEZpvd3;
                    if (z2) {
                        i20 += i21;
                    } else {
                        i19 += i21;
                    }
                    arrayList5 = arrayList6;
                }
                arrayList = arrayList5;
                if (z2) {
                    int iIntValue3 = numberValueOf.intValue();
                    iIntValue -= numberValueOf.intValue();
                    i7 = i16 + iIntValue3;
                    i6 = i17;
                } else {
                    int iIntValue4 = numberValueOf2.intValue();
                    iIntValue2 -= numberValueOf2.intValue();
                    i6 = i17 + iIntValue4;
                    i7 = i16;
                }
                arrayList3.clear();
                arrayList3.add(c27726kBb);
                boolean z3 = iIntValue > iIntValue2;
                d6 = d11 - d4;
                dAEQbTJ = C33129mqd.AEQbTJ(java.lang.Double.valueOf(c27726kBb.EZpvd()));
                dAEQbTJ2 = C33129mqd.AEQbTJ(java.lang.Double.valueOf(c27726kBb.EZpvd()));
                int i22 = i7;
                int i23 = i6;
                double dAEQbTJ4 = ((C33129mqd.AEQbTJ(java.lang.Double.valueOf(c27726kBb.EZpvd())) / d6) * ((double) (z3 ? iIntValue : iIntValue2))) / ((double) (z3 ? iIntValue2 : iIntValue));
                if (dAEQbTJ4 < 1.0d) {
                    dAEQbTJ4 = ((double) 1) / dAEQbTJ4;
                }
                i11 = i23;
                z = z3;
                d = dAEQbTJ4;
                dAEQbTJ3 = C33129mqd.AEQbTJ(java.lang.Double.valueOf(c27726kBb.EZpvd()));
                i10 = i22;
            }
            i9 = i14 + 1;
            list2 = list;
            i8 = iIntValue;
            d2 = dAEQbTJ2;
            d4 = dAEQbTJ3;
            d5 = d;
            double d14 = dAEQbTJ;
            arrayList4 = arrayList;
            d3 = d14;
            size = i12;
        }
        int i24 = i10;
        int i25 = i11;
        boolean z4 = z;
        java.util.ArrayList arrayList7 = arrayList4;
        double d15 = (z4 ? i8 : iIntValue2) * (d4 / d6);
        int i26 = 0;
        int i27 = 0;
        for (C27726kBb c27726kBb3 : arrayList3) {
            double dDjBIcL = ((double) (C33129mqd.djBIcL(java.lang.Double.valueOf(c27726kBb3.EZpvd())) * (z4 ? iIntValue2 : r5))) / d4;
            arrayList7.add(new C27730kBf(i24 + i26, i25 + i27, C33129mqd.djBIcL(z4 ? java.lang.Double.valueOf(d15) : java.lang.Double.valueOf(dDjBIcL)), C33129mqd.djBIcL(z4 ? java.lang.Double.valueOf(dDjBIcL) : java.lang.Double.valueOf(d15)), c27726kBb3.KWHzl()));
            int i28 = (int) dDjBIcL;
            if (z4) {
                i27 += i28;
            } else {
                i26 += i28;
            }
        }
        return arrayList7;
    }
}

package o;

import com.ibm.icu.util.ICUException;

/* JADX INFO: renamed from: o.acy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7077acy {
    public static final java.util.Comparator<int[]> OLrzqt = new java.util.Comparator<int[]>() { // from class: o.acy.4
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            int iMin = java.lang.Math.min(iArr.length, iArr2.length);
            for (int i = 0; i < iMin; i++) {
                int i2 = iArr[i] - iArr2[i];
                if (i2 != 0) {
                    return i2;
                }
            }
            return iArr.length - iArr2.length;
        }
    };

    public static java.util.Collection<java.lang.String> AEQbTJ(java.lang.String str, java.lang.String str2, boolean z, java.util.Collection<java.lang.String> collection) {
        if (str == null || str2 == null) {
            throw new ICUException("Range must have 2 valid strings");
        }
        int[] iArrCopydefault = C7219afh.copydefault(str);
        int[] iArrCopydefault2 = C7219afh.copydefault(str2);
        int length = iArrCopydefault.length - iArrCopydefault2.length;
        if (z && length != 0) {
            throw new ICUException("Range must have equal-length strings");
        }
        if (length < 0) {
            throw new ICUException("Range must have start-length ≥ end-length");
        }
        if (iArrCopydefault2.length == 0) {
            throw new ICUException("Range must have end-length > 0");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.appendCodePoint(iArrCopydefault[i]);
        }
        EZpvd(0, length, iArrCopydefault, iArrCopydefault2, sb, collection);
        return collection;
    }

    public static void EZpvd(int i, int i2, int[] iArr, int[] iArr2, java.lang.StringBuilder sb, java.util.Collection<java.lang.String> collection) {
        int i3 = iArr[i + i2];
        int i4 = iArr2[i];
        if (i3 > i4) {
            throw new ICUException("Range must have xᵢ ≤ yᵢ for each index i");
        }
        boolean z = i == iArr2.length - 1;
        int length = sb.length();
        for (int i5 = i3; i5 <= i4; i5++) {
            sb.appendCodePoint(i5);
            if (z) {
                collection.add(sb.toString());
            } else {
                EZpvd(i + 1, i2, iArr, iArr2, sb, collection);
            }
            sb.setLength(length);
        }
    }
}

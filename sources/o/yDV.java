package o;

import androidx.camera.video.AudioStats;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yDV extends yDT {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class Activity<T> implements java.lang.Iterable<T>, InterfaceC56535yIz {
        public final /* synthetic */ java.lang.Object[] KWHzl;

        public Activity(java.lang.Object[] objArr) {
            this.KWHzl = objArr;
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<T> iterator() {
            return yHX.EZpvd(this.KWHzl);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class ActionBar<T> implements Sequence<T> {
        public final /* synthetic */ java.lang.Object[] EZpvd;

        public ActionBar(java.lang.Object[] objArr) {
            this.EZpvd = objArr;
        }

        @Override // kotlin.sequences.Sequence
        public java.util.Iterator<T> iterator() {
            return yHX.EZpvd(this.EZpvd);
        }
    }

    public static <T> boolean valueOf(@NotNull T[] tArr, T t) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return gEmmrt(tArr, t) >= 0;
    }

    public static boolean KWHzl(@NotNull byte[] bArr, byte b) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return copydefault(bArr, b) >= 0;
    }

    public static boolean EZpvd(@NotNull short[] sArr, short s) {
        Intrinsics.checkNotNullParameter(sArr, "");
        return KWHzl(sArr, s) >= 0;
    }

    public static boolean AYXKKw(@NotNull int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return AhwBna(iArr, i) >= 0;
    }

    public static boolean OLrzqt(@NotNull long[] jArr, long j) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return KWHzl(jArr, j) >= 0;
    }

    public static boolean AEQbTJ(@NotNull char[] cArr, char c) {
        Intrinsics.checkNotNullParameter(cArr, "");
        return copydefault(cArr, c) >= 0;
    }

    public static <T> T AuCTelauCTel(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    public static int fJNWhG(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[0];
    }

    public static float AYXKKw(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[0];
    }

    public static <T> T zsXlph(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static java.lang.Byte gEmmrt(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length == 0) {
            return null;
        }
        return java.lang.Byte.valueOf(bArr[0]);
    }

    public static java.lang.Float gEmmrt(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        if (fArr.length == 0) {
            return null;
        }
        return java.lang.Float.valueOf(fArr[0]);
    }

    public static <T> T gEmmrt(@NotNull T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "");
        if (i < 0 || i >= tArr.length) {
            return null;
        }
        return tArr[i];
    }

    public static java.lang.Byte AEQbTJ(@NotNull byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        if (i < 0 || i >= bArr.length) {
            return null;
        }
        return java.lang.Byte.valueOf(bArr[i]);
    }

    public static java.lang.Integer gEmmrt(@NotNull int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "");
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return java.lang.Integer.valueOf(iArr[i]);
    }

    public static <T> int gEmmrt(@NotNull T[] tArr, T t) {
        Intrinsics.checkNotNullParameter(tArr, "");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (Intrinsics.EZpvd(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int copydefault(@NotNull byte[] bArr, byte b) {
        Intrinsics.checkNotNullParameter(bArr, "");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (b == bArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int KWHzl(@NotNull short[] sArr, short s) {
        Intrinsics.checkNotNullParameter(sArr, "");
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            if (s == sArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int AhwBna(@NotNull int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static int KWHzl(@NotNull long[] jArr, long j) {
        Intrinsics.checkNotNullParameter(jArr, "");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int copydefault(@NotNull char[] cArr, char c) {
        Intrinsics.checkNotNullParameter(cArr, "");
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            if (c == cArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static <T> T AubY(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[zLjUOn(tArr)];
    }

    public static int iwGUEr(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[getNewProxyInstance(iArr)];
    }

    public static <T> int djBIcL(@NotNull T[] tArr, T t) {
        Intrinsics.checkNotNullParameter(tArr, "");
        if (t == null) {
            int length = tArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (tArr[length] == null) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i2 = length2 - 1;
                if (Intrinsics.EZpvd(t, tArr[length2])) {
                    return length2;
                }
                if (i2 < 0) {
                    return -1;
                }
                length2 = i2;
            }
        }
    }

    public static int djBIcL(@NotNull byte[] bArr, byte b) {
        Intrinsics.checkNotNullParameter(bArr, "");
        int length = bArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (b == bArr[length]) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }

    public static int valueOf(@NotNull int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "");
        int length = iArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i2 = length - 1;
            if (i == iArr[length]) {
                return length;
            }
            if (i2 < 0) {
                return -1;
            }
            length = i2;
        }
    }

    public static int gEmmrt(@NotNull long[] jArr, long j) {
        Intrinsics.checkNotNullParameter(jArr, "");
        int length = jArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (j == jArr[length]) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }

    public static <T> T wlaJM(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    public static java.lang.Integer uzCIH(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        if (iArr.length == 0) {
            return null;
        }
        return java.lang.Integer.valueOf(iArr[iArr.length - 1]);
    }

    public static <T> T sSMYrx(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return tArr[0];
        }
        throw new java.lang.IllegalArgumentException("Array has more than one element.");
    }

    public static char EZpvd(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new java.lang.IllegalArgumentException("Array has more than one element.");
    }

    public static <T> T AxsJAY(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.yJi.EZpvd(int, int):int */
    public static <T> java.util.List<T> AYXKKw(@NotNull T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "");
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        return djBIcL(tArr, C56548yJl.copydefault(tArr.length - i, 0));
    }

    public static <T> java.util.List<T> valueOf(@NotNull T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "");
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        return AhwBna(tArr, C56548yJl.copydefault(tArr.length - i, 0));
    }

    public static <T> java.util.List<T> getFieldNames(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return (java.util.List) AEQbTJ(tArr, new java.util.ArrayList());
    }

    public static final <C extends java.util.Collection<? super T>, T> C AEQbTJ(@NotNull T[] tArr, @NotNull C c) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(c, "");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    public static <T> java.util.List<T> KWHzl(@NotNull T[] tArr, @NotNull kotlin.ranges.IntRange intRange) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(intRange, "");
        return intRange.isEmpty() ? yDY.AhwBna() : yDT.fIwbmz(yDT.copydefault(tArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1));
    }

    public static <T> T[] AEQbTJ(@NotNull T[] tArr, @NotNull kotlin.ranges.IntRange intRange) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(intRange, "");
        return intRange.isEmpty() ? (T[]) yDT.copydefault(tArr, 0, 0) : (T[]) yDT.copydefault(tArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1);
    }

    public static byte[] EZpvd(@NotNull byte[] bArr, @NotNull kotlin.ranges.IntRange intRange) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(intRange, "");
        return intRange.isEmpty() ? new byte[0] : yDT.AEQbTJ(bArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1);
    }

    public static <T> java.util.List<T> AhwBna(@NotNull T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "");
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return yDY.AhwBna();
        }
        if (i >= tArr.length) {
            return AwvSrB(tArr);
        }
        if (i == 1) {
            return C56402yEa.EZpvd(tArr[0]);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        int i2 = 0;
        for (T t : tArr) {
            arrayList.add(t);
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    public static java.util.List<java.lang.Byte> KWHzl(@NotNull byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return yDY.AhwBna();
        }
        if (i >= bArr.length) {
            return AkhnZx(bArr);
        }
        if (i == 1) {
            return C56402yEa.EZpvd(java.lang.Byte.valueOf(bArr[0]));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        int i2 = 0;
        for (byte b : bArr) {
            arrayList.add(java.lang.Byte.valueOf(b));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    public static final <T> java.util.List<T> djBIcL(@NotNull T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "");
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return yDY.AhwBna();
        }
        int length = tArr.length;
        if (i >= length) {
            return AwvSrB(tArr);
        }
        if (i == 1) {
            return C56402yEa.EZpvd(tArr[length - 1]);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = length - i; i2 < length; i2++) {
            arrayList.add(tArr[i2]);
        }
        return arrayList;
    }

    public static java.util.List<java.lang.Float> KWHzl(@NotNull float[] fArr, int i) {
        Intrinsics.checkNotNullParameter(fArr, "");
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return yDY.AhwBna();
        }
        int length = fArr.length;
        if (i >= length) {
            return AkhnZx(fArr);
        }
        if (i == 1) {
            return C56402yEa.EZpvd(java.lang.Float.valueOf(fArr[length - 1]));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = length - i; i2 < length; i2++) {
            arrayList.add(java.lang.Float.valueOf(fArr[i2]));
        }
        return arrayList;
    }

    public static void AhwBna(@NotNull int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "");
        yDG.Companion.copydefault(i, i2, iArr.length);
        int i3 = (i + i2) / 2;
        if (i == i3) {
            return;
        }
        int i4 = i2 - 1;
        while (i < i3) {
            int i5 = iArr[i];
            iArr[i] = iArr[i4];
            iArr[i4] = i5;
            i4--;
            i++;
        }
    }

    public static void djBIcL(@NotNull long[] jArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        yDG.Companion.copydefault(i, i2, jArr.length);
        int i3 = (i + i2) / 2;
        if (i == i3) {
            return;
        }
        int i4 = i2 - 1;
        while (i < i3) {
            long j = jArr[i];
            jArr[i] = jArr[i4];
            jArr[i4] = j;
            i4--;
            i++;
        }
    }

    public static final void EZpvd(@NotNull float[] fArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(fArr, "");
        yDG.Companion.copydefault(i, i2, fArr.length);
        int i3 = (i + i2) / 2;
        if (i == i3) {
            return;
        }
        int i4 = i2 - 1;
        while (i < i3) {
            float f = fArr[i];
            fArr[i] = fArr[i4];
            fArr[i4] = f;
            i4--;
            i++;
        }
    }

    public static void AuCTelauCTel(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        AEQbTJ(iArr, kotlin.random.Random.Default);
    }

    public static final void AEQbTJ(@NotNull int[] iArr, @NotNull kotlin.random.Random random) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(random, "");
        for (int newProxyInstance = getNewProxyInstance(iArr); newProxyInstance > 0; newProxyInstance--) {
            int iNextInt = random.nextInt(newProxyInstance + 1);
            int i = iArr[newProxyInstance];
            iArr[newProxyInstance] = iArr[iNextInt];
            iArr[iNextInt] = i;
        }
    }

    public static final <T> T[] EZpvd(@NotNull T[] tArr, @NotNull java.util.Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) java.util.Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(tArr2, "");
        yDT.AEQbTJ(tArr2, comparator);
        return tArr2;
    }

    public static <T> java.util.List<T> KWHzl(@NotNull T[] tArr, @NotNull java.util.Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return yDT.fIwbmz(EZpvd((java.lang.Object[]) tArr, (java.util.Comparator) comparator));
    }

    public static kotlin.ranges.IntRange isConnected(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new kotlin.ranges.IntRange(0, DbNXlk(bArr));
    }

    public static kotlin.ranges.IntRange KWHzl(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        return new kotlin.ranges.IntRange(0, OLrzqt(sArr));
    }

    public static kotlin.ranges.IntRange getFieldNames(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return new kotlin.ranges.IntRange(0, getNewProxyInstance(iArr));
    }

    public static <T> int zLjUOn(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return tArr.length - 1;
    }

    public static int DbNXlk(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return bArr.length - 1;
    }

    public static int OLrzqt(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        return sArr.length - 1;
    }

    public static int getNewProxyInstance(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return iArr.length - 1;
    }

    public static int copydefault(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return jArr.length - 1;
    }

    public static int valueOf(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        return fArr.length - 1;
    }

    public static void AYXKKw(@NotNull int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "");
        yDT.gEmmrt(iArr, i, i2);
        AhwBna(iArr, i, i2);
    }

    public static void AhwBna(@NotNull long[] jArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        yDT.valueOf(jArr, i, i2);
        djBIcL(jArr, i, i2);
    }

    public static void OLrzqt(@NotNull float[] fArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(fArr, "");
        yDT.AEQbTJ(fArr, i, i2);
        EZpvd(fArr, i, i2);
    }

    public static int[] KWHzl(@NotNull java.lang.Integer[] numArr) {
        Intrinsics.checkNotNullParameter(numArr, "");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public static final <T, C extends java.util.Collection<? super T>> C KWHzl(@NotNull T[] tArr, @NotNull C c) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(c, "");
        for (T t : tArr) {
            c.add(t);
        }
        return c;
    }

    public static final <C extends java.util.Collection<? super java.lang.Integer>> C EZpvd(@NotNull int[] iArr, @NotNull C c) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(c, "");
        for (int i : iArr) {
            c.add(java.lang.Integer.valueOf(i));
        }
        return c;
    }

    public static <T> java.util.HashSet<T> zuBGHE(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return (java.util.HashSet) KWHzl((java.lang.Object[]) tArr, new java.util.HashSet(C56423yEv.copydefault(tArr.length)));
    }

    public static <T> java.util.List<T> AwvSrB(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        int length = tArr.length;
        if (length == 0) {
            return yDY.AhwBna();
        }
        if (length == 1) {
            return C56402yEa.EZpvd(tArr[0]);
        }
        return gHZMYf(tArr);
    }

    public static java.util.List<java.lang.Byte> AkhnZx(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        int length = bArr.length;
        if (length == 0) {
            return yDY.AhwBna();
        }
        if (length == 1) {
            return C56402yEa.EZpvd(java.lang.Byte.valueOf(bArr[0]));
        }
        return fetchVPNInfo(bArr);
    }

    public static java.util.List<java.lang.Short> AYXKKw(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        int length = sArr.length;
        if (length == 0) {
            return yDY.AhwBna();
        }
        if (length == 1) {
            return C56402yEa.EZpvd(java.lang.Short.valueOf(sArr[0]));
        }
        return AhwBna(sArr);
    }

    public static java.util.List<java.lang.Integer> wlaJM(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        int length = iArr.length;
        if (length == 0) {
            return yDY.AhwBna();
        }
        if (length == 1) {
            return C56402yEa.EZpvd(java.lang.Integer.valueOf(iArr[0]));
        }
        return sSMYrx(iArr);
    }

    public static java.util.List<java.lang.Long> OLrzqt(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        int length = jArr.length;
        if (length == 0) {
            return yDY.AhwBna();
        }
        if (length == 1) {
            return C56402yEa.EZpvd(java.lang.Long.valueOf(jArr[0]));
        }
        return KWHzl(jArr);
    }

    public static java.util.List<java.lang.Float> AkhnZx(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        int length = fArr.length;
        if (length == 0) {
            return yDY.AhwBna();
        }
        if (length == 1) {
            return C56402yEa.EZpvd(java.lang.Float.valueOf(fArr[0]));
        }
        return isConnected(fArr);
    }

    public static java.util.List<java.lang.Double> copydefault(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "");
        int length = dArr.length;
        if (length == 0) {
            return yDY.AhwBna();
        }
        if (length == 1) {
            return C56402yEa.EZpvd(java.lang.Double.valueOf(dArr[0]));
        }
        return KWHzl(dArr);
    }

    public static java.util.List<java.lang.Boolean> AEQbTJ(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "");
        int length = zArr.length;
        if (length == 0) {
            return yDY.AhwBna();
        }
        if (length == 1) {
            return C56402yEa.EZpvd(java.lang.Boolean.valueOf(zArr[0]));
        }
        return copydefault(zArr);
    }

    public static java.util.List<java.lang.Character> AEQbTJ(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        int length = cArr.length;
        if (length == 0) {
            return yDY.AhwBna();
        }
        if (length == 1) {
            return C56402yEa.EZpvd(java.lang.Character.valueOf(cArr[0]));
        }
        return OLrzqt(cArr);
    }

    public static <T> java.util.List<T> gHZMYf(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return new java.util.ArrayList(yDY.djBIcL(tArr));
    }

    public static java.util.List<java.lang.Byte> fetchVPNInfo(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(java.lang.Byte.valueOf(b));
        }
        return arrayList;
    }

    public static final java.util.List<java.lang.Short> AhwBna(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(sArr.length);
        for (short s : sArr) {
            arrayList.add(java.lang.Short.valueOf(s));
        }
        return arrayList;
    }

    public static java.util.List<java.lang.Integer> sSMYrx(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(java.lang.Integer.valueOf(i));
        }
        return arrayList;
    }

    public static final java.util.List<java.lang.Long> KWHzl(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(java.lang.Long.valueOf(j));
        }
        return arrayList;
    }

    public static final java.util.List<java.lang.Float> isConnected(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(java.lang.Float.valueOf(f));
        }
        return arrayList;
    }

    public static final java.util.List<java.lang.Double> KWHzl(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(java.lang.Double.valueOf(d));
        }
        return arrayList;
    }

    public static final java.util.List<java.lang.Boolean> copydefault(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(java.lang.Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static final java.util.List<java.lang.Character> OLrzqt(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(cArr.length);
        for (char c : cArr) {
            arrayList.add(java.lang.Character.valueOf(c));
        }
        return arrayList;
    }

    public static <T> java.util.Set<T> QOLQEE(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        int length = tArr.length;
        if (length == 0) {
            return yEE.copydefault();
        }
        if (length == 1) {
            return yED.AEQbTJ(tArr[0]);
        }
        return (java.util.Set) KWHzl((java.lang.Object[]) tArr, new LinkedHashSet(C56423yEv.copydefault(tArr.length)));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.yEB.copydefault(java.lang.Object):java.util.Set */
    public static java.util.Set<java.lang.Integer> AxsJAY(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        int length = iArr.length;
        if (length == 0) {
            return yEE.copydefault();
        }
        if (length == 1) {
            return yED.AEQbTJ(java.lang.Integer.valueOf(iArr[0]));
        }
        return (java.util.Set) EZpvd(iArr, new LinkedHashSet(C56423yEv.copydefault(iArr.length)));
    }

    public static <T> java.lang.Iterable<IndexedValue<T>> ORxRYg(@NotNull final T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return new C56417yEp(new Function0() { // from class: o.yDW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return yDV.QKVWgx(tArr);
            }
        });
    }

    public static final java.util.Iterator QKVWgx(java.lang.Object[] objArr) {
        return yHX.EZpvd(objArr);
    }

    public static java.util.List<java.lang.Integer> fARcdN(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(AwvSrB(iArr));
    }

    public static <T> java.util.Set<T> KWHzl(@NotNull T[] tArr, @NotNull java.lang.Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        java.util.Set<T> setOcIXYQ = OcIXYQ(tArr);
        C56406yEe.AYXKKw(setOcIXYQ, iterable);
        return setOcIXYQ;
    }

    public static final <T> java.util.Set<T> OcIXYQ(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return (java.util.Set) KWHzl((java.lang.Object[]) tArr, new LinkedHashSet(C56423yEv.copydefault(tArr.length)));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.yEt.KWHzl(int):int */
    public static final java.util.Set<java.lang.Integer> AwvSrB(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return (java.util.Set) EZpvd(iArr, new LinkedHashSet(C56423yEv.copydefault(iArr.length)));
    }

    public static int zLjUOn(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i = iArr[0];
        int newProxyInstance = getNewProxyInstance(iArr);
        int i2 = 1;
        if (1 <= newProxyInstance) {
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == newProxyInstance) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public static java.lang.Integer hDKMBd(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int newProxyInstance = getNewProxyInstance(iArr);
        int i2 = 1;
        if (1 <= newProxyInstance) {
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == newProxyInstance) {
                    break;
                }
                i2++;
            }
        }
        return java.lang.Integer.valueOf(i);
    }

    public static java.lang.Float DbNXlk(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        if (fArr.length == 0) {
            return null;
        }
        float fMax = fArr[0];
        int iValueOf = valueOf(fArr);
        int i = 1;
        if (1 <= iValueOf) {
            while (true) {
                fMax = java.lang.Math.max(fMax, fArr[i]);
                if (i == iValueOf) {
                    break;
                }
                i++;
            }
        }
        return java.lang.Float.valueOf(fMax);
    }

    public static java.lang.Integer zsXlph(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int newProxyInstance = getNewProxyInstance(iArr);
        int i2 = 1;
        if (1 <= newProxyInstance) {
            while (true) {
                int i3 = iArr[i2];
                if (i > i3) {
                    i = i3;
                }
                if (i2 == newProxyInstance) {
                    break;
                }
                i2++;
            }
        }
        return java.lang.Integer.valueOf(i);
    }

    /* JADX DEBUG: Class process forced to load method for inline: kotlin.text.StringsKt.OLrzqt(java.lang.Appendable, java.lang.Object, kotlin.jvm.functions.Function1):void */
    public static final <T, A extends java.lang.Appendable> A KWHzl(@NotNull T[] tArr, @NotNull A a2, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, int i, @NotNull java.lang.CharSequence charSequence4, Function1<? super T, ? extends java.lang.CharSequence> function1) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(a2, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        a2.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C59440zhA.copydefault(a2, t, function1);
        }
        if (i >= 0 && i2 > i) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final <A extends java.lang.Appendable> A copydefault(@NotNull byte[] bArr, @NotNull A a2, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, int i, @NotNull java.lang.CharSequence charSequence4, Function1<? super java.lang.Byte, ? extends java.lang.CharSequence> function1) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(a2, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        a2.append(charSequence2);
        int i2 = 0;
        for (byte b : bArr) {
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (function1 != null) {
                a2.append(function1.invoke(java.lang.Byte.valueOf(b)));
            } else {
                a2.append(java.lang.String.valueOf((int) b));
            }
        }
        if (i >= 0 && i2 > i) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final <A extends java.lang.Appendable> A AEQbTJ(@NotNull short[] sArr, @NotNull A a2, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, int i, @NotNull java.lang.CharSequence charSequence4, Function1<? super java.lang.Short, ? extends java.lang.CharSequence> function1) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(sArr, "");
        Intrinsics.checkNotNullParameter(a2, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        a2.append(charSequence2);
        int i2 = 0;
        for (short s : sArr) {
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (function1 != null) {
                a2.append(function1.invoke(java.lang.Short.valueOf(s)));
            } else {
                a2.append(java.lang.String.valueOf((int) s));
            }
        }
        if (i >= 0 && i2 > i) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final <A extends java.lang.Appendable> A AEQbTJ(@NotNull int[] iArr, @NotNull A a2, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, int i, @NotNull java.lang.CharSequence charSequence4, Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> function1) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(a2, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        a2.append(charSequence2);
        int i2 = 0;
        for (int i3 : iArr) {
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (function1 != null) {
                a2.append(function1.invoke(java.lang.Integer.valueOf(i3)));
            } else {
                a2.append(java.lang.String.valueOf(i3));
            }
        }
        if (i >= 0 && i2 > i) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final <A extends java.lang.Appendable> A EZpvd(@NotNull long[] jArr, @NotNull A a2, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, int i, @NotNull java.lang.CharSequence charSequence4, Function1<? super java.lang.Long, ? extends java.lang.CharSequence> function1) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(a2, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        a2.append(charSequence2);
        int i2 = 0;
        for (long j : jArr) {
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (function1 != null) {
                a2.append(function1.invoke(java.lang.Long.valueOf(j)));
            } else {
                a2.append(java.lang.String.valueOf(j));
            }
        }
        if (i >= 0 && i2 > i) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final <A extends java.lang.Appendable> A EZpvd(@NotNull float[] fArr, @NotNull A a2, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, int i, @NotNull java.lang.CharSequence charSequence4, Function1<? super java.lang.Float, ? extends java.lang.CharSequence> function1) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(fArr, "");
        Intrinsics.checkNotNullParameter(a2, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        a2.append(charSequence2);
        int i2 = 0;
        for (float f : fArr) {
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (function1 != null) {
                a2.append(function1.invoke(java.lang.Float.valueOf(f)));
            } else {
                a2.append(java.lang.String.valueOf(f));
            }
        }
        if (i >= 0 && i2 > i) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final <A extends java.lang.Appendable> A KWHzl(@NotNull double[] dArr, @NotNull A a2, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, int i, @NotNull java.lang.CharSequence charSequence4, Function1<? super java.lang.Double, ? extends java.lang.CharSequence> function1) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(dArr, "");
        Intrinsics.checkNotNullParameter(a2, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        a2.append(charSequence2);
        int i2 = 0;
        for (double d : dArr) {
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (function1 != null) {
                a2.append(function1.invoke(java.lang.Double.valueOf(d)));
            } else {
                a2.append(java.lang.String.valueOf(d));
            }
        }
        if (i >= 0 && i2 > i) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final <A extends java.lang.Appendable> A OLrzqt(@NotNull boolean[] zArr, @NotNull A a2, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, int i, @NotNull java.lang.CharSequence charSequence4, Function1<? super java.lang.Boolean, ? extends java.lang.CharSequence> function1) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(zArr, "");
        Intrinsics.checkNotNullParameter(a2, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        a2.append(charSequence2);
        int i2 = 0;
        for (boolean z : zArr) {
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (function1 != null) {
                a2.append(function1.invoke(java.lang.Boolean.valueOf(z)));
            } else {
                a2.append(java.lang.String.valueOf(z));
            }
        }
        if (i >= 0 && i2 > i) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final <A extends java.lang.Appendable> A copydefault(@NotNull char[] cArr, @NotNull A a2, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, int i, @NotNull java.lang.CharSequence charSequence4, Function1<? super java.lang.Character, ? extends java.lang.CharSequence> function1) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(cArr, "");
        Intrinsics.checkNotNullParameter(a2, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        a2.append(charSequence2);
        int i2 = 0;
        for (char c : cArr) {
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (function1 != null) {
                a2.append(function1.invoke(java.lang.Character.valueOf(c)));
            } else {
                a2.append(c);
            }
        }
        if (i >= 0 && i2 > i) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static /* synthetic */ java.lang.String joinToString$default(java.lang.Object[] objArr, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        java.lang.CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        java.lang.CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        java.lang.CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return OLrzqt(objArr, charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    public static final <T> java.lang.String OLrzqt(@NotNull T[] tArr, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, int i, @NotNull java.lang.CharSequence charSequence4, Function1<? super T, ? extends java.lang.CharSequence> function1) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        return ((java.lang.StringBuilder) KWHzl(tArr, new java.lang.StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
    }

    public static /* synthetic */ java.lang.String joinToString$default(byte[] bArr, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        java.lang.CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        java.lang.CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        java.lang.CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return AEQbTJ(bArr, charSequence, charSequence5, charSequence6, i3, charSequence7, (Function1<? super java.lang.Byte, ? extends java.lang.CharSequence>) function1);
    }

    public static final java.lang.String AEQbTJ(@NotNull byte[] bArr, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, int i, @NotNull java.lang.CharSequence charSequence4, Function1<? super java.lang.Byte, ? extends java.lang.CharSequence> function1) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        return ((java.lang.StringBuilder) copydefault(bArr, new java.lang.StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
    }

    public static /* synthetic */ java.lang.String joinToString$default(short[] sArr, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        java.lang.CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        java.lang.CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        java.lang.CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return EZpvd(sArr, charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    public static final java.lang.String EZpvd(@NotNull short[] sArr, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, int i, @NotNull java.lang.CharSequence charSequence4, Function1<? super java.lang.Short, ? extends java.lang.CharSequence> function1) {
        Intrinsics.checkNotNullParameter(sArr, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        return ((java.lang.StringBuilder) AEQbTJ(sArr, new java.lang.StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
    }

    public static /* synthetic */ java.lang.String joinToString$default(int[] iArr, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        java.lang.CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        java.lang.CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        java.lang.CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return AEQbTJ(iArr, charSequence, charSequence5, charSequence6, i3, charSequence7, (Function1<? super java.lang.Integer, ? extends java.lang.CharSequence>) function1);
    }

    public static final java.lang.String AEQbTJ(@NotNull int[] iArr, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, int i, @NotNull java.lang.CharSequence charSequence4, Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> function1) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        return ((java.lang.StringBuilder) AEQbTJ(iArr, new java.lang.StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
    }

    public static /* synthetic */ java.lang.String joinToString$default(long[] jArr, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        java.lang.CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        java.lang.CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        java.lang.CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return copydefault(jArr, charSequence, charSequence5, charSequence6, i3, charSequence7, (Function1<? super java.lang.Long, ? extends java.lang.CharSequence>) function1);
    }

    public static final java.lang.String copydefault(@NotNull long[] jArr, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, int i, @NotNull java.lang.CharSequence charSequence4, Function1<? super java.lang.Long, ? extends java.lang.CharSequence> function1) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        return ((java.lang.StringBuilder) EZpvd(jArr, new java.lang.StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
    }

    public static /* synthetic */ java.lang.String joinToString$default(float[] fArr, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        java.lang.CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        java.lang.CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        java.lang.CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return copydefault(fArr, charSequence, charSequence5, charSequence6, i3, charSequence7, (Function1<? super java.lang.Float, ? extends java.lang.CharSequence>) function1);
    }

    public static final java.lang.String copydefault(@NotNull float[] fArr, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, int i, @NotNull java.lang.CharSequence charSequence4, Function1<? super java.lang.Float, ? extends java.lang.CharSequence> function1) {
        Intrinsics.checkNotNullParameter(fArr, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        return ((java.lang.StringBuilder) EZpvd(fArr, new java.lang.StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
    }

    public static /* synthetic */ java.lang.String joinToString$default(double[] dArr, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        java.lang.CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        java.lang.CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        java.lang.CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return AEQbTJ(dArr, charSequence, charSequence5, charSequence6, i3, charSequence7, (Function1<? super java.lang.Double, ? extends java.lang.CharSequence>) function1);
    }

    public static final java.lang.String AEQbTJ(@NotNull double[] dArr, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, int i, @NotNull java.lang.CharSequence charSequence4, Function1<? super java.lang.Double, ? extends java.lang.CharSequence> function1) {
        Intrinsics.checkNotNullParameter(dArr, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        return ((java.lang.StringBuilder) KWHzl(dArr, new java.lang.StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
    }

    public static /* synthetic */ java.lang.String joinToString$default(boolean[] zArr, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        java.lang.CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        java.lang.CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        java.lang.CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return KWHzl(zArr, charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    public static final java.lang.String KWHzl(@NotNull boolean[] zArr, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, int i, @NotNull java.lang.CharSequence charSequence4, Function1<? super java.lang.Boolean, ? extends java.lang.CharSequence> function1) {
        Intrinsics.checkNotNullParameter(zArr, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        return ((java.lang.StringBuilder) OLrzqt(zArr, new java.lang.StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
    }

    public static /* synthetic */ java.lang.String joinToString$default(char[] cArr, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        java.lang.CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        java.lang.CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        java.lang.CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return copydefault(cArr, charSequence, charSequence5, charSequence6, i3, charSequence7, (Function1<? super java.lang.Character, ? extends java.lang.CharSequence>) function1);
    }

    public static final java.lang.String copydefault(@NotNull char[] cArr, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, int i, @NotNull java.lang.CharSequence charSequence4, Function1<? super java.lang.Character, ? extends java.lang.CharSequence> function1) {
        Intrinsics.checkNotNullParameter(cArr, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        return ((java.lang.StringBuilder) copydefault(cArr, new java.lang.StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
    }

    public static <T> java.lang.Iterable<T> uzCIH(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return tArr.length == 0 ? yDY.AhwBna() : new Activity(tArr);
    }

    public static <T> Sequence<T> getNewProxyInstance(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return tArr.length == 0 ? C59405zgS.OLrzqt() : new ActionBar(tArr);
    }

    public static double AhwBna(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        double d = AudioStats.AUDIO_AMPLITUDE_NONE;
        int i = 0;
        for (float f : fArr) {
            d += (double) f;
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / ((double) i);
    }

    public static int AubY(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    public static <T, R> java.util.List<kotlin.Pair<T, R>> AEQbTJ(@NotNull T[] tArr, @NotNull R[] rArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(rArr, "");
        int iMin = java.lang.Math.min(tArr.length, rArr.length);
        java.util.ArrayList arrayList = new java.util.ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(C56390yDp.OLrzqt(tArr[i], rArr[i]));
        }
        return arrayList;
    }

    public static <T, R> java.util.List<kotlin.Pair<T, R>> OLrzqt(@NotNull T[] tArr, @NotNull java.lang.Iterable<? extends R> iterable) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        int length = tArr.length;
        java.util.ArrayList arrayList = new java.util.ArrayList(java.lang.Math.min(C56403yEb.AYXKKw(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(C56390yDp.OLrzqt(tArr[i], r));
            i++;
        }
        return arrayList;
    }
}

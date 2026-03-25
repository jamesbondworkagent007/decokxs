package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yDT extends yDN {
    public static <T> java.util.List<T> fIwbmz(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        java.util.List<T> listAEQbTJ = yDS.AEQbTJ(tArr);
        Intrinsics.checkNotNullExpressionValue(listAEQbTJ, "");
        return listAEQbTJ;
    }

    public static final class ActionBar extends yDG<java.lang.Byte> implements java.util.RandomAccess {
        public final /* synthetic */ byte[] copydefault;

        public ActionBar(byte[] bArr) {
            this.copydefault = bArr;
        }

        @Override // o.AbstractC56400yDz, java.util.Collection, java.util.List
        public final boolean contains(java.lang.Object obj) {
            if (obj instanceof java.lang.Byte) {
                return OLrzqt(((java.lang.Number) obj).byteValue());
            }
            return false;
        }

        @Override // o.yDG, java.util.List
        public final int indexOf(java.lang.Object obj) {
            if (obj instanceof java.lang.Byte) {
                return KWHzl(((java.lang.Number) obj).byteValue());
            }
            return -1;
        }

        @Override // o.yDG, java.util.List
        public final int lastIndexOf(java.lang.Object obj) {
            if (obj instanceof java.lang.Byte) {
                return EZpvd(((java.lang.Number) obj).byteValue());
            }
            return -1;
        }

        @Override // o.yDG, o.AbstractC56400yDz
        public int getSize() {
            return this.copydefault.length;
        }

        @Override // o.AbstractC56400yDz, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.copydefault.length == 0;
        }

        public boolean OLrzqt(byte b) {
            return yDV.KWHzl(this.copydefault, b);
        }

        /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
        @Override // o.yDG, java.util.List
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public java.lang.Byte get(int i) {
            return java.lang.Byte.valueOf(this.copydefault[i]);
        }

        public int KWHzl(byte b) {
            return yDV.copydefault(this.copydefault, b);
        }

        public int EZpvd(byte b) {
            return yDV.djBIcL(this.copydefault, b);
        }
    }

    public static java.util.List<java.lang.Byte> valueOf(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new ActionBar(bArr);
    }

    public static final class TaskDescription extends yDG<java.lang.Integer> implements java.util.RandomAccess {
        public final /* synthetic */ int[] EZpvd;

        public TaskDescription(int[] iArr) {
            this.EZpvd = iArr;
        }

        @Override // o.AbstractC56400yDz, java.util.Collection, java.util.List
        public final boolean contains(java.lang.Object obj) {
            if (obj instanceof java.lang.Integer) {
                return copydefault(((java.lang.Number) obj).intValue());
            }
            return false;
        }

        @Override // o.yDG, java.util.List
        public final int indexOf(java.lang.Object obj) {
            if (obj instanceof java.lang.Integer) {
                return EZpvd(((java.lang.Number) obj).intValue());
            }
            return -1;
        }

        @Override // o.yDG, java.util.List
        public final int lastIndexOf(java.lang.Object obj) {
            if (obj instanceof java.lang.Integer) {
                return KWHzl(((java.lang.Number) obj).intValue());
            }
            return -1;
        }

        @Override // o.yDG, o.AbstractC56400yDz
        public int getSize() {
            return this.EZpvd.length;
        }

        @Override // o.AbstractC56400yDz, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.EZpvd.length == 0;
        }

        public boolean copydefault(int i) {
            return yDV.AYXKKw(this.EZpvd, i);
        }

        /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
        @Override // o.yDG, java.util.List
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public java.lang.Integer get(int i) {
            return java.lang.Integer.valueOf(this.EZpvd[i]);
        }

        public int EZpvd(int i) {
            return yDV.AhwBna(this.EZpvd, i);
        }

        public int KWHzl(int i) {
            return yDV.valueOf(this.EZpvd, i);
        }
    }

    public static java.util.List<java.lang.Integer> AuCTel(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return new TaskDescription(iArr);
    }

    public static /* synthetic */ int binarySearch$default(java.lang.Object[] objArr, java.lang.Object obj, java.util.Comparator comparator, int i, int i2, int i3, java.lang.Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        return copydefault(objArr, obj, (java.util.Comparator<? super java.lang.Object>) comparator, i, i2);
    }

    public static final <T> int copydefault(@NotNull T[] tArr, T t, @NotNull java.util.Comparator<? super T> comparator, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return java.util.Arrays.binarySearch(tArr, i, i2, t, comparator);
    }

    public static /* synthetic */ int binarySearch$default(java.lang.Object[] objArr, java.lang.Object obj, int i, int i2, int i3, java.lang.Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        return KWHzl(objArr, obj, i, i2);
    }

    public static final <T> int KWHzl(@NotNull T[] tArr, T t, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return java.util.Arrays.binarySearch(tArr, i, i2, t);
    }

    public static /* synthetic */ int binarySearch$default(byte[] bArr, byte b, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return AEQbTJ(bArr, b, i, i2);
    }

    public static final int AEQbTJ(@NotNull byte[] bArr, byte b, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return java.util.Arrays.binarySearch(bArr, i, i2, b);
    }

    public static /* synthetic */ int binarySearch$default(short[] sArr, short s, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length;
        }
        return OLrzqt(sArr, s, i, i2);
    }

    public static final int OLrzqt(@NotNull short[] sArr, short s, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "");
        return java.util.Arrays.binarySearch(sArr, i, i2, s);
    }

    public static /* synthetic */ int binarySearch$default(int[] iArr, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        return AEQbTJ(iArr, i, i2, i3);
    }

    public static final int AEQbTJ(@NotNull int[] iArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return java.util.Arrays.binarySearch(iArr, i2, i3, i);
    }

    public static /* synthetic */ int binarySearch$default(long[] jArr, long j, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        return EZpvd(jArr, j, i, i2);
    }

    public static final int EZpvd(@NotNull long[] jArr, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return java.util.Arrays.binarySearch(jArr, i, i2, j);
    }

    public static /* synthetic */ int binarySearch$default(float[] fArr, float f, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length;
        }
        return EZpvd(fArr, f, i, i2);
    }

    public static final int EZpvd(@NotNull float[] fArr, float f, int i, int i2) {
        Intrinsics.checkNotNullParameter(fArr, "");
        return java.util.Arrays.binarySearch(fArr, i, i2, f);
    }

    public static /* synthetic */ int binarySearch$default(double[] dArr, double d, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length;
        }
        return OLrzqt(dArr, d, i, i2);
    }

    public static final int OLrzqt(@NotNull double[] dArr, double d, int i, int i2) {
        Intrinsics.checkNotNullParameter(dArr, "");
        return java.util.Arrays.binarySearch(dArr, i, i2, d);
    }

    public static /* synthetic */ int binarySearch$default(char[] cArr, char c, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        return copydefault(cArr, c, i, i2);
    }

    public static final int copydefault(@NotNull char[] cArr, char c, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "");
        return java.util.Arrays.binarySearch(cArr, i, i2, c);
    }

    public static /* synthetic */ java.lang.Object[] copyInto$default(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return AEQbTJ(objArr, objArr2, i, i2, i3);
    }

    public static <T> T[] AEQbTJ(@NotNull T[] tArr, @NotNull T[] tArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(tArr2, "");
        java.lang.System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    public static /* synthetic */ byte[] copyInto$default(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        return copydefault(bArr, bArr2, i, i2, i3);
    }

    public static byte[] copydefault(@NotNull byte[] bArr, @NotNull byte[] bArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        java.lang.System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    public static /* synthetic */ short[] copyInto$default(short[] sArr, short[] sArr2, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sArr.length;
        }
        return copydefault(sArr, sArr2, i, i2, i3);
    }

    public static short[] copydefault(@NotNull short[] sArr, @NotNull short[] sArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sArr, "");
        Intrinsics.checkNotNullParameter(sArr2, "");
        java.lang.System.arraycopy(sArr, i2, sArr2, i, i3 - i2);
        return sArr2;
    }

    public static /* synthetic */ int[] copyInto$default(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        return copydefault(iArr, iArr2, i, i2, i3);
    }

    public static int[] copydefault(@NotNull int[] iArr, @NotNull int[] iArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(iArr2, "");
        java.lang.System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
        return iArr2;
    }

    public static /* synthetic */ long[] copyInto$default(long[] jArr, long[] jArr2, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = jArr.length;
        }
        return AEQbTJ(jArr, jArr2, i, i2, i3);
    }

    public static long[] AEQbTJ(@NotNull long[] jArr, @NotNull long[] jArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(jArr2, "");
        java.lang.System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
        return jArr2;
    }

    public static /* synthetic */ float[] copyInto$default(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length;
        }
        return AEQbTJ(fArr, fArr2, i, i2, i3);
    }

    public static float[] AEQbTJ(@NotNull float[] fArr, @NotNull float[] fArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(fArr, "");
        Intrinsics.checkNotNullParameter(fArr2, "");
        java.lang.System.arraycopy(fArr, i2, fArr2, i, i3 - i2);
        return fArr2;
    }

    public static /* synthetic */ double[] copyInto$default(double[] dArr, double[] dArr2, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = dArr.length;
        }
        return copydefault(dArr, dArr2, i, i2, i3);
    }

    public static final double[] copydefault(@NotNull double[] dArr, @NotNull double[] dArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(dArr, "");
        Intrinsics.checkNotNullParameter(dArr2, "");
        java.lang.System.arraycopy(dArr, i2, dArr2, i, i3 - i2);
        return dArr2;
    }

    public static /* synthetic */ boolean[] copyInto$default(boolean[] zArr, boolean[] zArr2, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = zArr.length;
        }
        return EZpvd(zArr, zArr2, i, i2, i3);
    }

    public static final boolean[] EZpvd(@NotNull boolean[] zArr, @NotNull boolean[] zArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(zArr, "");
        Intrinsics.checkNotNullParameter(zArr2, "");
        java.lang.System.arraycopy(zArr, i2, zArr2, i, i3 - i2);
        return zArr2;
    }

    public static /* synthetic */ char[] copyInto$default(char[] cArr, char[] cArr2, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = cArr.length;
        }
        return AEQbTJ(cArr, cArr2, i, i2, i3);
    }

    public static char[] AEQbTJ(@NotNull char[] cArr, @NotNull char[] cArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(cArr, "");
        Intrinsics.checkNotNullParameter(cArr2, "");
        java.lang.System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
        return cArr2;
    }

    public static <T> T[] copydefault(@NotNull T[] tArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "");
        yDO.AEQbTJ(i2, tArr.length);
        T[] tArr2 = (T[]) java.util.Arrays.copyOfRange(tArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(tArr2, "");
        return tArr2;
    }

    public static byte[] AEQbTJ(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        yDO.AEQbTJ(i2, bArr.length);
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOfRange, "");
        return bArrCopyOfRange;
    }

    public static int[] copydefault(@NotNull int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "");
        yDO.AEQbTJ(i2, iArr.length);
        int[] iArrCopyOfRange = java.util.Arrays.copyOfRange(iArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOfRange, "");
        return iArrCopyOfRange;
    }

    public static long[] AEQbTJ(@NotNull long[] jArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        yDO.AEQbTJ(i2, jArr.length);
        long[] jArrCopyOfRange = java.util.Arrays.copyOfRange(jArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOfRange, "");
        return jArrCopyOfRange;
    }

    public static /* synthetic */ void fill$default(java.lang.Object[] objArr, java.lang.Object obj, int i, int i2, int i3, java.lang.Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        copydefault(objArr, obj, i, i2);
    }

    public static <T> void copydefault(@NotNull T[] tArr, T t, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "");
        java.util.Arrays.fill(tArr, i, i2, t);
    }

    public static /* synthetic */ void fill$default(byte[] bArr, byte b, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        EZpvd(bArr, b, i, i2);
    }

    public static void EZpvd(@NotNull byte[] bArr, byte b, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        java.util.Arrays.fill(bArr, i, i2, b);
    }

    public static /* synthetic */ void fill$default(short[] sArr, short s, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length;
        }
        EZpvd(sArr, s, i, i2);
    }

    public static void EZpvd(@NotNull short[] sArr, short s, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "");
        java.util.Arrays.fill(sArr, i, i2, s);
    }

    public static /* synthetic */ void fill$default(int[] iArr, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        EZpvd(iArr, i, i2, i3);
    }

    public static void EZpvd(@NotNull int[] iArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "");
        java.util.Arrays.fill(iArr, i2, i3, i);
    }

    public static /* synthetic */ void fill$default(long[] jArr, long j, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        AEQbTJ(jArr, j, i, i2);
    }

    public static void AEQbTJ(@NotNull long[] jArr, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        java.util.Arrays.fill(jArr, i, i2, j);
    }

    public static /* synthetic */ void fill$default(float[] fArr, float f, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length;
        }
        AEQbTJ(fArr, f, i, i2);
    }

    public static final void AEQbTJ(@NotNull float[] fArr, float f, int i, int i2) {
        Intrinsics.checkNotNullParameter(fArr, "");
        java.util.Arrays.fill(fArr, i, i2, f);
    }

    public static /* synthetic */ void fill$default(double[] dArr, double d, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length;
        }
        KWHzl(dArr, d, i, i2);
    }

    public static final void KWHzl(@NotNull double[] dArr, double d, int i, int i2) {
        Intrinsics.checkNotNullParameter(dArr, "");
        java.util.Arrays.fill(dArr, i, i2, d);
    }

    public static /* synthetic */ void fill$default(boolean[] zArr, boolean z, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = zArr.length;
        }
        EZpvd(zArr, z, i, i2);
    }

    public static final void EZpvd(@NotNull boolean[] zArr, boolean z, int i, int i2) {
        Intrinsics.checkNotNullParameter(zArr, "");
        java.util.Arrays.fill(zArr, i, i2, z);
    }

    public static /* synthetic */ void fill$default(char[] cArr, char c, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        AEQbTJ(cArr, c, i, i2);
    }

    public static void AEQbTJ(@NotNull char[] cArr, char c, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "");
        java.util.Arrays.fill(cArr, i, i2, c);
    }

    public static <T> T[] EZpvd(@NotNull T[] tArr, T t) {
        Intrinsics.checkNotNullParameter(tArr, "");
        int length = tArr.length;
        T[] tArr2 = (T[]) java.util.Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t;
        Intrinsics.copydefault(tArr2);
        return tArr2;
    }

    public static int[] djBIcL(@NotNull int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "");
        int length = iArr.length;
        int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i;
        Intrinsics.copydefault(iArrCopyOf);
        return iArrCopyOf;
    }

    public static float[] AEQbTJ(@NotNull float[] fArr, float f) {
        Intrinsics.checkNotNullParameter(fArr, "");
        int length = fArr.length;
        float[] fArrCopyOf = java.util.Arrays.copyOf(fArr, length + 1);
        fArrCopyOf[length] = f;
        Intrinsics.copydefault(fArrCopyOf);
        return fArrCopyOf;
    }

    public static <T> T[] EZpvd(@NotNull T[] tArr, @NotNull T[] tArr2) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(tArr2, "");
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) java.util.Arrays.copyOf(tArr, length + length2);
        java.lang.System.arraycopy(tArr2, 0, tArr3, length, length2);
        Intrinsics.copydefault(tArr3);
        return tArr3;
    }

    public static byte[] copydefault(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, length + length2);
        java.lang.System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        Intrinsics.copydefault(bArrCopyOf);
        return bArrCopyOf;
    }

    public static int[] EZpvd(@NotNull int[] iArr, @NotNull int[] iArr2) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(iArr2, "");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, length + length2);
        java.lang.System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        Intrinsics.copydefault(iArrCopyOf);
        return iArrCopyOf;
    }

    public static float[] KWHzl(@NotNull float[] fArr, @NotNull float[] fArr2) {
        Intrinsics.checkNotNullParameter(fArr, "");
        Intrinsics.checkNotNullParameter(fArr2, "");
        int length = fArr.length;
        int length2 = fArr2.length;
        float[] fArrCopyOf = java.util.Arrays.copyOf(fArr, length + length2);
        java.lang.System.arraycopy(fArr2, 0, fArrCopyOf, length, length2);
        Intrinsics.copydefault(fArrCopyOf);
        return fArrCopyOf;
    }

    public static void ejfBZ(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        if (iArr.length > 1) {
            java.util.Arrays.sort(iArr);
        }
    }

    public static <T> void hDKMBd(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        if (tArr.length > 1) {
            java.util.Arrays.sort(tArr);
        }
    }

    public static /* synthetic */ void sort$default(java.lang.Comparable[] comparableArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = comparableArr.length;
        }
        OLrzqt(comparableArr, i, i2);
    }

    public static final <T extends java.lang.Comparable<? super T>> void OLrzqt(@NotNull T[] tArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "");
        java.util.Arrays.sort(tArr, i, i2);
    }

    public static /* synthetic */ void sort$default(byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        KWHzl(bArr, i, i2);
    }

    public static final void KWHzl(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        java.util.Arrays.sort(bArr, i, i2);
    }

    public static /* synthetic */ void sort$default(short[] sArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = sArr.length;
        }
        OLrzqt(sArr, i, i2);
    }

    public static final void OLrzqt(@NotNull short[] sArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "");
        java.util.Arrays.sort(sArr, i, i2);
    }

    public static /* synthetic */ void sort$default(int[] iArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = iArr.length;
        }
        gEmmrt(iArr, i, i2);
    }

    public static void gEmmrt(@NotNull int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "");
        java.util.Arrays.sort(iArr, i, i2);
    }

    public static /* synthetic */ void sort$default(long[] jArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = jArr.length;
        }
        valueOf(jArr, i, i2);
    }

    public static void valueOf(@NotNull long[] jArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        java.util.Arrays.sort(jArr, i, i2);
    }

    public static /* synthetic */ void sort$default(float[] fArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = fArr.length;
        }
        AEQbTJ(fArr, i, i2);
    }

    public static void AEQbTJ(@NotNull float[] fArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(fArr, "");
        java.util.Arrays.sort(fArr, i, i2);
    }

    public static /* synthetic */ void sort$default(double[] dArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = dArr.length;
        }
        AEQbTJ(dArr, i, i2);
    }

    public static final void AEQbTJ(@NotNull double[] dArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(dArr, "");
        java.util.Arrays.sort(dArr, i, i2);
    }

    public static /* synthetic */ void sort$default(char[] cArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        EZpvd(cArr, i, i2);
    }

    public static final void EZpvd(@NotNull char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "");
        java.util.Arrays.sort(cArr, i, i2);
    }

    public static /* synthetic */ void sort$default(java.lang.Object[] objArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = objArr.length;
        }
        EZpvd(objArr, i, i2);
    }

    public static final <T> void EZpvd(@NotNull T[] tArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "");
        java.util.Arrays.sort(tArr, i, i2);
    }

    public static final <T> void AEQbTJ(@NotNull T[] tArr, @NotNull java.util.Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        if (tArr.length > 1) {
            java.util.Arrays.sort(tArr, comparator);
        }
    }

    public static /* synthetic */ void sortWith$default(java.lang.Object[] objArr, java.util.Comparator comparator, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        KWHzl(objArr, comparator, i, i2);
    }

    public static <T> void KWHzl(@NotNull T[] tArr, @NotNull java.util.Comparator<? super T> comparator, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        java.util.Arrays.sort(tArr, i, i2, comparator);
    }

    public static java.lang.Byte[] AYXKKw(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        java.lang.Byte[] bArr2 = new java.lang.Byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = java.lang.Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }
}

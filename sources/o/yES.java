package o;

import com.google.common.primitives.UnsignedBytes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yES {

    public static final class Activity extends yDG<C56396yDv> implements java.util.RandomAccess {
        public final /* synthetic */ long[] copydefault;

        public Activity(long[] jArr) {
            this.copydefault = jArr;
        }

        @Override // o.AbstractC56400yDz, java.util.Collection, java.util.List
        public final boolean contains(java.lang.Object obj) {
            if (obj instanceof C56396yDv) {
                return AEQbTJ(((C56396yDv) obj).OLrzqt());
            }
            return false;
        }

        @Override // o.yDG, java.util.List
        public /* synthetic */ java.lang.Object get(int i) {
            return C56396yDv.KWHzl(EZpvd(i));
        }

        @Override // o.yDG, java.util.List
        public final int indexOf(java.lang.Object obj) {
            if (obj instanceof C56396yDv) {
                return copydefault(((C56396yDv) obj).OLrzqt());
            }
            return -1;
        }

        @Override // o.yDG, java.util.List
        public final int lastIndexOf(java.lang.Object obj) {
            if (obj instanceof C56396yDv) {
                return OLrzqt(((C56396yDv) obj).OLrzqt());
            }
            return -1;
        }

        @Override // o.yDG, o.AbstractC56400yDz
        public int getSize() {
            return C56394yDt.copydefault(this.copydefault);
        }

        @Override // o.AbstractC56400yDz, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return C56394yDt.AEQbTJ(this.copydefault);
        }

        public boolean AEQbTJ(long j) {
            return C56394yDt.KWHzl(this.copydefault, j);
        }

        public long EZpvd(int i) {
            return C56394yDt.copydefault(this.copydefault, i);
        }

        public int copydefault(long j) {
            return yDV.KWHzl(this.copydefault, j);
        }

        public int OLrzqt(long j) {
            return yDV.gEmmrt(this.copydefault, j);
        }
    }

    public static final java.util.List<C56396yDv> OLrzqt(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return new Activity(jArr);
    }

    /* JADX INFO: renamed from: binarySearch-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ int m8805binarySearch2fe2U9s$default(int[] iArr, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = C56397yDw.KWHzl(iArr);
        }
        return OLrzqt(iArr, i, i2, i3);
    }

    public static final int OLrzqt(@NotNull int[] iArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "");
        yDG.Companion.copydefault(i2, i3, C56397yDw.KWHzl(iArr));
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int iKWHzl = C56399yDy.KWHzl(iArr[i5], i);
            if (iKWHzl < 0) {
                i2 = i5 + 1;
            } else {
                if (iKWHzl <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: binarySearch-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ int m8807binarySearchK6DWlUc$default(long[] jArr, long j, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = C56394yDt.copydefault(jArr);
        }
        return copydefault(jArr, j, i, i2);
    }

    public static final int copydefault(@NotNull long[] jArr, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        yDG.Companion.copydefault(i, i2, C56394yDt.copydefault(jArr));
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iAEQbTJ = C56399yDy.AEQbTJ(jArr[i4], j);
            if (iAEQbTJ < 0) {
                i = i4 + 1;
            } else {
                if (iAEQbTJ <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: binarySearch-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ int m8808binarySearchWpHrYlw$default(byte[] bArr, byte b, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = C56398yDx.OLrzqt(bArr);
        }
        return copydefault(bArr, b, i, i2);
    }

    public static final int copydefault(@NotNull byte[] bArr, byte b, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        yDG.Companion.copydefault(i, i2, C56398yDx.OLrzqt(bArr));
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iKWHzl = C56399yDy.KWHzl((int) bArr[i4], b & UnsignedBytes.MAX_VALUE);
            if (iKWHzl < 0) {
                i = i4 + 1;
            } else {
                if (iKWHzl <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: binarySearch-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ int m8806binarySearchEtDCXyQ$default(short[] sArr, short s, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = yDA.OLrzqt(sArr);
        }
        return EZpvd(sArr, s, i, i2);
    }

    public static final int EZpvd(@NotNull short[] sArr, short s, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "");
        yDG.Companion.copydefault(i, i2, yDA.OLrzqt(sArr));
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iKWHzl = C56399yDy.KWHzl((int) sArr[i4], 65535 & s);
            if (iKWHzl < 0) {
                i = i4 + 1;
            } else {
                if (iKWHzl <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }
}

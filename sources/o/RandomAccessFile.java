package o;

import aws.smithy.kotlin.runtime.util.OsFamily;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class RandomAccessFile {
    public final java.lang.String EZpvd;
    public final OsFamily OLrzqt;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OsFamily.values().length];
            try {
                iArr[OsFamily.Unknown.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RandomAccessFile copy$default(RandomAccessFile randomAccessFile, OsFamily osFamily, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            osFamily = randomAccessFile.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = randomAccessFile.EZpvd;
        }
        return randomAccessFile.AEQbTJ(osFamily, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RandomAccessFile AEQbTJ(@NotNull OsFamily osFamily, java.lang.String str) {
        Intrinsics.checkNotNullParameter(osFamily, "");
        return new RandomAccessFile(osFamily, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RandomAccessFile)) {
            return false;
        }
        RandomAccessFile randomAccessFile = (RandomAccessFile) obj;
        return this.OLrzqt == randomAccessFile.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) randomAccessFile.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        java.lang.String str = this.EZpvd;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public RandomAccessFile(@NotNull OsFamily osFamily, java.lang.String str) {
        Intrinsics.checkNotNullParameter(osFamily, "");
        this.OLrzqt = osFamily;
        this.EZpvd = str;
    }

    public java.lang.String toString() {
        return Reader.AEQbTJ("os", StateListAnimator.EZpvd[this.OLrzqt.ordinal()] == 1 ? "other" : this.OLrzqt.toString(), this.EZpvd);
    }
}

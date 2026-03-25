package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes2.dex */
public final class HR {
    public static final Activity AEQbTJ = new Activity(null);
    public static final char[] EZpvd;
    public static final Random.Default KWHzl;
    public static final long OLrzqt;
    public static final long copydefault;
    public static final long djBIcL;
    public static final long valueOf;
    public final long AYXKKw;
    public final java.lang.String AhwBna;
    public final long gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HR copy$default(HR hr, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = hr.gEmmrt;
        }
        if ((i & 2) != 0) {
            j2 = hr.AYXKKw;
        }
        return hr.OLrzqt(j, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HR OLrzqt(long j, long j2) {
        return new HR(j, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HR)) {
            return false;
        }
        HR hr = (HR) obj;
        return this.gEmmrt == hr.gEmmrt && this.AYXKKw == hr.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Long.hashCode(this.gEmmrt) * 31) + java.lang.Long.hashCode(this.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return this.AhwBna;
    }

    public HR(long j, long j2) {
        this.gEmmrt = j;
        this.AYXKKw = j2;
        this.AhwBna = AEQbTJ.EZpvd(j, j2);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.HR.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final HR AEQbTJ() {
            long jNextLong = HR.KWHzl.nextLong();
            long j = HR.valueOf;
            long j2 = HR.djBIcL;
            long jNextLong2 = HR.KWHzl.nextLong();
            long j3 = HR.OLrzqt;
            return new HR((jNextLong & (~j)) | j2, ((~j3) & jNextLong2) | HR.copydefault);
        }

        public final java.lang.String EZpvd(long j, long j2) {
            char[] cArr = new char[36];
            KWHzl(j, 0, cArr, 0, 4);
            cArr[8] = '-';
            KWHzl(j, 4, cArr, 9, 2);
            cArr[13] = '-';
            KWHzl(j, 6, cArr, 14, 2);
            cArr[18] = '-';
            KWHzl(j2, 0, cArr, 19, 2);
            cArr[23] = '-';
            KWHzl(j2, 2, cArr, 24, 6);
            return C59449zhJ.copydefault(cArr);
        }

        public final void KWHzl(long j, int i, char[] cArr, int i2, int i3) {
            int i4 = 64 - (i * 8);
            int i5 = 0;
            while (i5 < i3 * 2) {
                i4 -= 4;
                cArr[i2] = HR.EZpvd[(int) ((j >> i4) & 15)];
                i5++;
                i2++;
            }
        }
    }

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "");
        EZpvd = charArray;
        KWHzl = kotlin.random.Random.Default;
        valueOf = ((long) 61440) & BodyPartID.bodyIdMax;
        djBIcL = ((long) 16384) & BodyPartID.bodyIdMax;
        OLrzqt = -4611686018427387904L;
        copydefault = Long.MIN_VALUE;
    }
}

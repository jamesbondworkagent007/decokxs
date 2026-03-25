package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.yJf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56542yJf implements java.lang.Iterable<java.lang.Long>, InterfaceC56535yIz {
    public static final Activity KWHzl = new Activity(null);
    public final long AEQbTJ;
    public final long EZpvd;
    public final long OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isEmpty() {
        long j = this.OLrzqt;
        long j2 = this.AEQbTJ;
        long j3 = this.EZpvd;
        return j <= 0 ? j2 < j3 : j2 > j3;
    }

    public C56542yJf(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new java.lang.IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new java.lang.IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.AEQbTJ = j;
        this.EZpvd = C56453yFy.copydefault(j, j2, j3);
        this.OLrzqt = j3;
    }

    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public AbstractC56422yEu iterator() {
        return new C56543yJg(this.AEQbTJ, this.EZpvd, this.OLrzqt);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C56542yJf) {
            if (!isEmpty() || !((C56542yJf) obj).isEmpty()) {
                C56542yJf c56542yJf = (C56542yJf) obj;
                if (this.AEQbTJ != c56542yJf.AEQbTJ || this.EZpvd != c56542yJf.EZpvd || this.OLrzqt != c56542yJf.OLrzqt) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = 31;
        long j2 = this.AEQbTJ;
        long j3 = this.EZpvd;
        long j4 = this.OLrzqt;
        return (int) ((j * (((j2 ^ (j2 >>> 32)) * j) + (j3 ^ (j3 >>> 32)))) + ((j4 >>> 32) ^ j4));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        long j;
        if (this.OLrzqt > 0) {
            sb = new java.lang.StringBuilder();
            sb.append(this.AEQbTJ);
            sb.append("..");
            sb.append(this.EZpvd);
            sb.append(" step ");
            j = this.OLrzqt;
        } else {
            sb = new java.lang.StringBuilder();
            sb.append(this.AEQbTJ);
            sb.append(" downTo ");
            sb.append(this.EZpvd);
            sb.append(" step ");
            j = -this.OLrzqt;
        }
        sb.append(j);
        return sb.toString();
    }

    /* JADX INFO: renamed from: o.yJf$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yJf.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}

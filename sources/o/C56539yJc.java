package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.yJc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56539yJc implements java.lang.Iterable<java.lang.Integer>, InterfaceC56535yIz {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final int EZpvd;
    public final int OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isEmpty() {
        return this.EZpvd <= 0 ? this.copydefault < this.OLrzqt : this.copydefault > this.OLrzqt;
    }

    public C56539yJc(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new java.lang.IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new java.lang.IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.copydefault = i;
        this.OLrzqt = C56453yFy.EZpvd(i, i2, i3);
        this.EZpvd = i3;
    }

    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public AbstractC56415yEn iterator() {
        return new C56541yJe(this.copydefault, this.OLrzqt, this.EZpvd);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C56539yJc) {
            if (!isEmpty() || !((C56539yJc) obj).isEmpty()) {
                C56539yJc c56539yJc = (C56539yJc) obj;
                if (this.copydefault != c56539yJc.copydefault || this.OLrzqt != c56539yJc.OLrzqt || this.EZpvd != c56539yJc.EZpvd) {
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
        return (((this.copydefault * 31) + this.OLrzqt) * 31) + this.EZpvd;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        int i;
        if (this.EZpvd > 0) {
            sb = new java.lang.StringBuilder();
            sb.append(this.copydefault);
            sb.append("..");
            sb.append(this.OLrzqt);
            sb.append(" step ");
            i = this.EZpvd;
        } else {
            sb = new java.lang.StringBuilder();
            sb.append(this.copydefault);
            sb.append(" downTo ");
            sb.append(this.OLrzqt);
            sb.append(" step ");
            i = -this.EZpvd;
        }
        sb.append(i);
        return sb.toString();
    }

    /* JADX INFO: renamed from: o.yJc$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yJc.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C56539yJc EZpvd(int i, int i2, int i3) {
            return new C56539yJc(i, i2, i3);
        }
    }
}

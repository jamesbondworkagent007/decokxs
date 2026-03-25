package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class yIT implements java.lang.Iterable<java.lang.Character>, InterfaceC56535yIz {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public final int AEQbTJ;
    public final char OLrzqt;
    public final char copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final char KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final char copydefault() {
        return this.OLrzqt;
    }

    public yIT(char c, char c2, int i) {
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Step must be non-zero.");
        }
        if (i == Integer.MIN_VALUE) {
            throw new java.lang.IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.copydefault = c;
        this.OLrzqt = (char) C56453yFy.EZpvd((int) c, (int) c2, i);
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public yDZ iterator() {
        return new yIV(this.copydefault, this.OLrzqt, this.AEQbTJ);
    }

    public boolean isEmpty() {
        return this.AEQbTJ <= 0 ? Intrinsics.copydefault((int) this.copydefault, (int) this.OLrzqt) < 0 : Intrinsics.copydefault((int) this.copydefault, (int) this.OLrzqt) > 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof yIT) {
            if (!isEmpty() || !((yIT) obj).isEmpty()) {
                yIT yit = (yIT) obj;
                if (this.copydefault != yit.copydefault || this.OLrzqt != yit.OLrzqt || this.AEQbTJ != yit.AEQbTJ) {
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
        return (((this.copydefault * 31) + this.OLrzqt) * 31) + this.AEQbTJ;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        int i;
        if (this.AEQbTJ > 0) {
            sb = new java.lang.StringBuilder();
            sb.append(this.copydefault);
            sb.append("..");
            sb.append(this.OLrzqt);
            sb.append(" step ");
            i = this.AEQbTJ;
        } else {
            sb = new java.lang.StringBuilder();
            sb.append(this.copydefault);
            sb.append(" downTo ");
            sb.append(this.OLrzqt);
            sb.append(" step ");
            i = -this.AEQbTJ;
        }
        sb.append(i);
        return sb.toString();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yIT.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}

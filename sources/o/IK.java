package o;

import co.nstant.in.cbor.model.MajorType;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class IK extends C5211Iz {
    public final long AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long KWHzl() {
        return this.AEQbTJ;
    }

    public IK(long j) {
        super(MajorType.TAG);
        this.AEQbTJ = j;
    }

    @Override // o.C5211Iz
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof IK) {
            IK ik = (IK) obj;
            if (super.equals(obj) && this.AEQbTJ == ik.AEQbTJ) {
                return true;
            }
        }
        return false;
    }

    @Override // o.C5211Iz
    public int hashCode() {
        return super.hashCode() ^ Objects.hashCode(java.lang.Long.valueOf(this.AEQbTJ));
    }

    public java.lang.String toString() {
        return "Tag(" + this.AEQbTJ + ")";
    }
}

package o;

import co.nstant.in.cbor.model.MajorType;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class IF extends C5211Iz {
    public final java.math.BigInteger KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.math.BigInteger KWHzl() {
        return this.KWHzl;
    }

    public IF(MajorType majorType, java.math.BigInteger bigInteger) {
        super(majorType);
        Objects.requireNonNull(bigInteger);
        this.KWHzl = bigInteger;
    }

    @Override // o.C5211Iz
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof IF) {
            IF r0 = (IF) obj;
            if (super.equals(obj) && this.KWHzl.equals(r0.KWHzl)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.C5211Iz
    public int hashCode() {
        return super.hashCode() ^ this.KWHzl.hashCode();
    }

    public java.lang.String toString() {
        return this.KWHzl.toString();
    }
}

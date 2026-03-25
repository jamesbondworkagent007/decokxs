package o;

import co.nstant.in.cbor.model.SpecialType;
import java.util.Objects;

/* JADX INFO: renamed from: o.Ix, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5209Ix extends II {
    public final double AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public double AEQbTJ() {
        return this.AEQbTJ;
    }

    public C5209Ix(double d) {
        super(SpecialType.IEEE_754_DOUBLE_PRECISION_FLOAT);
        this.AEQbTJ = d;
    }

    @Override // o.II, o.C5211Iz
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C5209Ix) {
            C5209Ix c5209Ix = (C5209Ix) obj;
            if (super.equals(obj) && this.AEQbTJ == c5209Ix.AEQbTJ) {
                return true;
            }
        }
        return false;
    }

    @Override // o.II, o.C5211Iz
    public int hashCode() {
        return super.hashCode() ^ Objects.hashCode(java.lang.Double.valueOf(this.AEQbTJ));
    }

    @Override // o.II
    public java.lang.String toString() {
        return java.lang.String.valueOf(this.AEQbTJ);
    }
}

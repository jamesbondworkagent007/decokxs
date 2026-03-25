package o;

import co.nstant.in.cbor.model.MajorType;
import co.nstant.in.cbor.model.SpecialType;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class II extends C5211Iz {
    public static final II AYXKKw = new II(SpecialType.BREAK);
    public final SpecialType AhwBna;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpecialType OLrzqt() {
        return this.AhwBna;
    }

    public II(SpecialType specialType) {
        super(MajorType.SPECIAL);
        Objects.requireNonNull(specialType);
        this.AhwBna = specialType;
    }

    @Override // o.C5211Iz
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof II) {
            II ii = (II) obj;
            if (super.equals(obj) && this.AhwBna == ii.AhwBna) {
                return true;
            }
        }
        return false;
    }

    @Override // o.C5211Iz
    public int hashCode() {
        return super.hashCode() ^ Objects.hashCode(this.AhwBna);
    }

    public java.lang.String toString() {
        return this.AhwBna.name();
    }
}

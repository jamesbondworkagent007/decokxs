package o;

import co.nstant.in.cbor.model.SpecialType;
import java.util.Objects;

/* JADX INFO: renamed from: o.Ir, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5203Ir extends II {
    public final float AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float EZpvd() {
        return this.AEQbTJ;
    }

    public C5203Ir(SpecialType specialType, float f) {
        super(specialType);
        this.AEQbTJ = f;
    }

    @Override // o.II, o.C5211Iz
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C5203Ir) {
            C5203Ir c5203Ir = (C5203Ir) obj;
            if (super.equals(obj) && this.AEQbTJ == c5203Ir.AEQbTJ) {
                return true;
            }
        }
        return false;
    }

    @Override // o.II, o.C5211Iz
    public int hashCode() {
        return super.hashCode() ^ Objects.hashCode(java.lang.Float.valueOf(this.AEQbTJ));
    }
}

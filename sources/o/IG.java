package o;

import co.nstant.in.cbor.model.SimpleValueType;
import co.nstant.in.cbor.model.SpecialType;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class IG extends II {
    public static final IG AEQbTJ = new IG(SimpleValueType.FALSE);
    public static final IG EZpvd = new IG(SimpleValueType.TRUE);
    public static final IG KWHzl = new IG(SimpleValueType.NULL);
    public static final IG OLrzqt = new IG(SimpleValueType.UNDEFINED);
    public final SimpleValueType gEmmrt;
    public final int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimpleValueType KWHzl() {
        return this.gEmmrt;
    }

    public IG(SimpleValueType simpleValueType) {
        super(SpecialType.SIMPLE_VALUE);
        this.valueOf = simpleValueType.getValue();
        this.gEmmrt = simpleValueType;
    }

    public IG(int i) {
        super(i <= 23 ? SpecialType.SIMPLE_VALUE : SpecialType.SIMPLE_VALUE_NEXT_BYTE);
        this.valueOf = i;
        this.gEmmrt = SimpleValueType.ofByte(i);
    }

    @Override // o.II, o.C5211Iz
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof IG) {
            IG ig = (IG) obj;
            if (super.equals(obj) && this.valueOf == ig.valueOf) {
                return true;
            }
        }
        return false;
    }

    @Override // o.II, o.C5211Iz
    public int hashCode() {
        return super.hashCode() ^ Objects.hashCode(java.lang.Integer.valueOf(this.valueOf));
    }

    @Override // o.II
    public java.lang.String toString() {
        return this.gEmmrt.toString();
    }
}

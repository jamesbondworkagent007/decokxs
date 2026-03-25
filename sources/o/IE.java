package o;

import co.nstant.in.cbor.model.MajorType;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class IE extends C5208Iw {
    public final java.util.List<C5211Iz> AEQbTJ;
    public final LinkedHashMap<C5211Iz, C5211Iz> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Collection<C5211Iz> KWHzl() {
        return this.AEQbTJ;
    }

    @Override // o.C5208Iw
    public /* bridge */ /* synthetic */ C5208Iw AEQbTJ(boolean z) {
        return super.AEQbTJ(z);
    }

    @Override // o.C5208Iw
    public /* bridge */ /* synthetic */ boolean OLrzqt() {
        return super.OLrzqt();
    }

    public IE() {
        super(MajorType.MAP);
        this.AEQbTJ = new LinkedList();
        this.KWHzl = new LinkedHashMap<>();
    }

    public IE(int i) {
        super(MajorType.MAP);
        this.AEQbTJ = new LinkedList();
        this.KWHzl = new LinkedHashMap<>(i);
    }

    public IE EZpvd(C5211Iz c5211Iz, C5211Iz c5211Iz2) {
        if (this.KWHzl.put(c5211Iz, c5211Iz2) == null) {
            this.AEQbTJ.add(c5211Iz);
        }
        return this;
    }

    public C5211Iz copydefault(C5211Iz c5211Iz) {
        return this.KWHzl.get(c5211Iz);
    }

    @Override // o.C5208Iw, o.C5211Iz
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof IE) {
            IE ie = (IE) obj;
            if (super.equals(obj) && this.KWHzl.equals(ie.KWHzl)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.C5208Iw, o.C5211Iz
    public int hashCode() {
        return super.hashCode() ^ this.KWHzl.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (OLrzqt()) {
            sb.append("{_ ");
        } else {
            sb.append("{ ");
        }
        for (C5211Iz c5211Iz : this.AEQbTJ) {
            sb.append(c5211Iz);
            sb.append(": ");
            sb.append(this.KWHzl.get(c5211Iz));
            sb.append(", ");
        }
        if (sb.toString().endsWith(", ")) {
            sb.setLength(sb.length() - 2);
        }
        sb.append(" }");
        return sb.toString();
    }
}

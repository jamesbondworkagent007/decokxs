package o;

import co.nstant.in.cbor.model.MajorType;

/* JADX INFO: renamed from: o.It, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5205It extends C5208Iw {
    public final java.util.ArrayList<C5211Iz> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<C5211Iz> AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.C5208Iw
    public /* bridge */ /* synthetic */ C5208Iw AEQbTJ(boolean z) {
        return super.AEQbTJ(z);
    }

    @Override // o.C5208Iw
    public /* bridge */ /* synthetic */ boolean OLrzqt() {
        return super.OLrzqt();
    }

    public C5205It() {
        super(MajorType.ARRAY);
        this.KWHzl = new java.util.ArrayList<>();
    }

    public C5205It(int i) {
        super(MajorType.ARRAY);
        this.KWHzl = new java.util.ArrayList<>(i);
    }

    public C5205It EZpvd(C5211Iz c5211Iz) {
        this.KWHzl.add(c5211Iz);
        return this;
    }

    @Override // o.C5208Iw, o.C5211Iz
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C5205It) {
            C5205It c5205It = (C5205It) obj;
            if (super.equals(obj) && this.KWHzl.equals(c5205It.KWHzl)) {
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        if (OLrzqt()) {
            sb.append("_ ");
        }
        sb.append(java.util.Arrays.toString(this.KWHzl.toArray()).substring(1));
        return sb.toString();
    }
}

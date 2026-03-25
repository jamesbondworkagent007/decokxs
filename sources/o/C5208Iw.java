package o;

import co.nstant.in.cbor.model.MajorType;
import java.util.Objects;

/* JADX INFO: renamed from: o.Iw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5208Iw extends C5211Iz {
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5208Iw AEQbTJ(boolean z) {
        this.OLrzqt = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.OLrzqt;
    }

    public C5208Iw(MajorType majorType) {
        super(majorType);
        this.OLrzqt = false;
    }

    @Override // o.C5211Iz
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C5208Iw) {
            C5208Iw c5208Iw = (C5208Iw) obj;
            if (super.equals(obj) && this.OLrzqt == c5208Iw.OLrzqt) {
                return true;
            }
        }
        return false;
    }

    @Override // o.C5211Iz
    public int hashCode() {
        return super.hashCode() ^ Objects.hashCode(java.lang.Boolean.valueOf(this.OLrzqt));
    }
}

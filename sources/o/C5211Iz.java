package o;

import co.nstant.in.cbor.model.MajorType;
import java.util.Objects;

/* JADX INFO: renamed from: o.Iz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5211Iz {
    public final MajorType copydefault;
    public IK djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MajorType copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IK djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gEmmrt() {
        return this.djBIcL != null;
    }

    public C5211Iz(MajorType majorType) {
        this.copydefault = majorType;
        Objects.requireNonNull(majorType, "majorType is null");
    }

    public void EZpvd(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("tag number must be 0 or greater");
        }
        this.djBIcL = new IK(j);
    }

    public void EZpvd(IK ik) {
        Objects.requireNonNull(ik, "tag is null");
        this.djBIcL = ik;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof C5211Iz)) {
            return false;
        }
        C5211Iz c5211Iz = (C5211Iz) obj;
        IK ik = this.djBIcL;
        return ik != null ? ik.equals(c5211Iz.djBIcL) && this.copydefault == c5211Iz.copydefault : c5211Iz.djBIcL == null && this.copydefault == c5211Iz.copydefault;
    }

    public int hashCode() {
        return Objects.hash(this.copydefault, this.djBIcL);
    }

    public void OLrzqt(boolean z, java.lang.String str) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }
}

package o;

import co.nstant.in.cbor.model.MajorType;

/* JADX INFO: renamed from: o.Iy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5210Iy extends C5208Iw {
    public final byte[] EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] KWHzl() {
        byte[] bArr = this.EZpvd;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // o.C5208Iw
    public /* bridge */ /* synthetic */ C5208Iw AEQbTJ(boolean z) {
        return super.AEQbTJ(z);
    }

    @Override // o.C5208Iw
    public /* bridge */ /* synthetic */ boolean OLrzqt() {
        return super.OLrzqt();
    }

    public C5210Iy(byte[] bArr) {
        super(MajorType.BYTE_STRING);
        if (bArr == null) {
            this.EZpvd = null;
        } else {
            this.EZpvd = bArr;
        }
    }

    @Override // o.C5208Iw, o.C5211Iz
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C5210Iy) {
            C5210Iy c5210Iy = (C5210Iy) obj;
            if (super.equals(obj) && java.util.Arrays.equals(this.EZpvd, c5210Iy.EZpvd)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.C5208Iw, o.C5211Iz
    public int hashCode() {
        return super.hashCode() ^ java.util.Arrays.hashCode(this.EZpvd);
    }
}

package o;

import co.nstant.in.cbor.CborException;
import co.nstant.in.cbor.model.MajorType;

/* JADX INFO: renamed from: o.Ij, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C5195Ij extends AbstractC5197Il<C5210Iy> {
    public C5195Ij(HS hs, java.io.OutputStream outputStream) {
        super(hs, outputStream);
    }

    public void KWHzl(C5210Iy c5210Iy) throws CborException {
        byte[] bArrKWHzl = c5210Iy.KWHzl();
        if (c5210Iy.OLrzqt()) {
            copydefault(MajorType.BYTE_STRING);
            if (bArrKWHzl != null) {
                KWHzl(new C5210Iy(bArrKWHzl));
                return;
            }
            return;
        }
        if (bArrKWHzl == null) {
            this.AEQbTJ.EZpvd(IG.KWHzl);
        } else {
            EZpvd(MajorType.BYTE_STRING, bArrKWHzl.length);
            AEQbTJ(bArrKWHzl);
        }
    }
}

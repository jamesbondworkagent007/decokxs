package o;

import co.nstant.in.cbor.CborException;
import co.nstant.in.cbor.model.MajorType;

/* JADX INFO: loaded from: classes2.dex */
public class HZ extends HV<C5210Iy> {
    public HZ(HU hu, java.io.InputStream inputStream) {
        super(hu, inputStream);
    }

    public C5210Iy KWHzl(int i) throws CborException {
        long jEZpvd = EZpvd(i);
        if (jEZpvd == -1) {
            if (this.OLrzqt.copydefault()) {
                return KWHzl();
            }
            C5210Iy c5210Iy = new C5210Iy(null);
            c5210Iy.AEQbTJ(true);
            return c5210Iy;
        }
        return KWHzl(jEZpvd);
    }

    public final C5210Iy KWHzl() throws CborException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        while (true) {
            C5211Iz c5211IzAEQbTJ = this.OLrzqt.AEQbTJ();
            if (c5211IzAEQbTJ == null) {
                throw new CborException("Unexpected end of stream");
            }
            MajorType majorTypeCopydefault = c5211IzAEQbTJ.copydefault();
            if (!II.AYXKKw.equals(c5211IzAEQbTJ)) {
                if (majorTypeCopydefault == MajorType.BYTE_STRING) {
                    byte[] bArrKWHzl = ((C5210Iy) c5211IzAEQbTJ).KWHzl();
                    if (bArrKWHzl != null) {
                        byteArrayOutputStream.write(bArrKWHzl, 0, bArrKWHzl.length);
                    }
                } else {
                    throw new CborException("Unexpected major type " + majorTypeCopydefault);
                }
            } else {
                return new C5210Iy(byteArrayOutputStream.toByteArray());
            }
        }
    }

    public final C5210Iy KWHzl(long j) throws CborException {
        return new C5210Iy(copydefault(j));
    }
}

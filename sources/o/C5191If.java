package o;

import co.nstant.in.cbor.CborException;
import co.nstant.in.cbor.model.MajorType;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: o.If, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5191If extends HV<IJ> {
    public C5191If(HU hu, java.io.InputStream inputStream) {
        super(hu, inputStream);
    }

    public IJ OLrzqt(int i) throws CborException {
        long jEZpvd = EZpvd(i);
        if (jEZpvd == -1) {
            if (this.OLrzqt.valueOf()) {
                return KWHzl();
            }
            IJ ij = new IJ(null);
            ij.AEQbTJ(true);
            return ij;
        }
        return KWHzl(jEZpvd);
    }

    public final IJ KWHzl() throws CborException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        while (true) {
            C5211Iz c5211IzAEQbTJ = this.OLrzqt.AEQbTJ();
            if (c5211IzAEQbTJ == null) {
                throw new CborException("Unexpected end of stream");
            }
            MajorType majorTypeCopydefault = c5211IzAEQbTJ.copydefault();
            if (!II.AYXKKw.equals(c5211IzAEQbTJ)) {
                if (majorTypeCopydefault == MajorType.UNICODE_STRING) {
                    byte[] bytes = ((IJ) c5211IzAEQbTJ).toString().getBytes(StandardCharsets.UTF_8);
                    byteArrayOutputStream.write(bytes, 0, bytes.length);
                } else {
                    throw new CborException("Unexpected major type " + majorTypeCopydefault);
                }
            } else {
                return new IJ(new java.lang.String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8));
            }
        }
    }

    public final IJ KWHzl(long j) throws CborException {
        return new IJ(new java.lang.String(copydefault(j), StandardCharsets.UTF_8));
    }
}

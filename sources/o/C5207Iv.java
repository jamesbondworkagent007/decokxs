package o;

import co.nstant.in.cbor.CborException;
import co.nstant.in.cbor.model.MajorType;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: o.Iv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C5207Iv extends AbstractC5197Il<IJ> {
    public C5207Iv(HS hs, java.io.OutputStream outputStream) {
        super(hs, outputStream);
    }

    public void EZpvd(IJ ij) throws CborException {
        java.lang.String strAEQbTJ = ij.AEQbTJ();
        if (ij.OLrzqt()) {
            copydefault(MajorType.UNICODE_STRING);
            if (strAEQbTJ != null) {
                EZpvd(new IJ(strAEQbTJ));
                return;
            }
            return;
        }
        if (strAEQbTJ == null) {
            this.AEQbTJ.EZpvd(IG.KWHzl);
            return;
        }
        byte[] bytes = strAEQbTJ.getBytes(StandardCharsets.UTF_8);
        EZpvd(MajorType.UNICODE_STRING, bytes.length);
        AEQbTJ(bytes);
    }
}

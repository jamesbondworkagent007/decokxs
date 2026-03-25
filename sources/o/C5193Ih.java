package o;

import co.nstant.in.cbor.CborException;
import co.nstant.in.cbor.model.MajorType;

/* JADX INFO: renamed from: o.Ih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C5193Ih extends AbstractC5197Il<C5205It> {
    public C5193Ih(HS hs, java.io.OutputStream outputStream) {
        super(hs, outputStream);
    }

    public void KWHzl(C5205It c5205It) throws CborException {
        java.util.List<C5211Iz> listAEQbTJ = c5205It.AEQbTJ();
        if (c5205It.OLrzqt()) {
            copydefault(MajorType.ARRAY);
        } else {
            EZpvd(MajorType.ARRAY, listAEQbTJ.size());
        }
        java.util.Iterator<C5211Iz> it = listAEQbTJ.iterator();
        while (it.hasNext()) {
            this.AEQbTJ.EZpvd(it.next());
        }
    }
}

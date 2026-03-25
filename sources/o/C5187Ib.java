package o;

import co.nstant.in.cbor.CborException;

/* JADX INFO: renamed from: o.Ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5187Ib extends HV<C5205It> {
    public C5187Ib(HU hu, java.io.InputStream inputStream) {
        super(hu, inputStream);
    }

    public C5205It KWHzl(int i) throws CborException {
        long jEZpvd = EZpvd(i);
        if (jEZpvd == -1) {
            return KWHzl();
        }
        return KWHzl(jEZpvd);
    }

    public final C5205It KWHzl() throws CborException {
        C5205It c5205It = new C5205It();
        c5205It.AEQbTJ(true);
        if (this.OLrzqt.KWHzl()) {
            while (true) {
                C5211Iz c5211IzAEQbTJ = this.OLrzqt.AEQbTJ();
                if (c5211IzAEQbTJ == null) {
                    throw new CborException("Unexpected end of stream");
                }
                II ii = II.AYXKKw;
                if (ii.equals(c5211IzAEQbTJ)) {
                    c5205It.EZpvd(ii);
                    break;
                }
                c5205It.EZpvd(c5211IzAEQbTJ);
            }
        }
        return c5205It;
    }

    public final C5205It KWHzl(long j) throws CborException {
        C5205It c5205It = new C5205It(OLrzqt(j));
        for (long j2 = 0; j2 < j; j2++) {
            C5211Iz c5211IzAEQbTJ = this.OLrzqt.AEQbTJ();
            if (c5211IzAEQbTJ == null) {
                throw new CborException("Unexpected end of stream");
            }
            c5205It.EZpvd(c5211IzAEQbTJ);
        }
        return c5205It;
    }
}

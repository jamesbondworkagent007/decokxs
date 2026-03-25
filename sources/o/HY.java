package o;

import co.nstant.in.cbor.CborException;

/* JADX INFO: loaded from: classes2.dex */
public class HY extends HV<IE> {
    public HY(HU hu, java.io.InputStream inputStream) {
        super(hu, inputStream);
    }

    public IE OLrzqt(int i) throws CborException {
        long jEZpvd = EZpvd(i);
        if (jEZpvd == -1) {
            return KWHzl();
        }
        return EZpvd(jEZpvd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        throw new co.nstant.in.cbor.CborException("Unexpected end of stream");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IE KWHzl() throws CborException {
        IE ie = new IE();
        ie.AEQbTJ(true);
        if (this.OLrzqt.djBIcL()) {
            while (true) {
                C5211Iz c5211IzAEQbTJ = this.OLrzqt.AEQbTJ();
                if (II.AYXKKw.equals(c5211IzAEQbTJ)) {
                    break;
                }
                C5211Iz c5211IzAEQbTJ2 = this.OLrzqt.AEQbTJ();
                if (c5211IzAEQbTJ == null || c5211IzAEQbTJ2 == null) {
                    break;
                }
                if (this.OLrzqt.AhwBna() && ie.copydefault(c5211IzAEQbTJ) != null) {
                    throw new CborException("Duplicate key found in map");
                }
                ie.EZpvd(c5211IzAEQbTJ, c5211IzAEQbTJ2);
            }
        }
        return ie;
    }

    public final IE EZpvd(long j) throws CborException {
        IE ie = new IE(OLrzqt(j));
        for (long j2 = 0; j2 < j; j2++) {
            C5211Iz c5211IzAEQbTJ = this.OLrzqt.AEQbTJ();
            C5211Iz c5211IzAEQbTJ2 = this.OLrzqt.AEQbTJ();
            if (c5211IzAEQbTJ == null || c5211IzAEQbTJ2 == null) {
                throw new CborException("Unexpected end of stream");
            }
            if (this.OLrzqt.AhwBna() && ie.copydefault(c5211IzAEQbTJ) != null) {
                throw new CborException("Duplicate key found in map");
            }
            ie.EZpvd(c5211IzAEQbTJ, c5211IzAEQbTJ2);
        }
        return ie;
    }
}

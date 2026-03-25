package o;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.yJg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56543yJg extends AbstractC56422yEu {
    public final long AEQbTJ;
    public long KWHzl;
    public boolean OLrzqt;
    public final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.OLrzqt;
    }

    public C56543yJg(long j, long j2, long j3) {
        this.AEQbTJ = j3;
        this.copydefault = j2;
        boolean z = j3 <= 0 ? j >= j2 : j <= j2;
        this.OLrzqt = z;
        this.KWHzl = z ? j : j2;
    }

    @Override // o.AbstractC56422yEu
    public long nextLong() {
        long j = this.KWHzl;
        if (j != this.copydefault) {
            this.KWHzl = this.AEQbTJ + j;
        } else {
            if (!this.OLrzqt) {
                throw new NoSuchElementException();
            }
            this.OLrzqt = false;
        }
        return j;
    }
}

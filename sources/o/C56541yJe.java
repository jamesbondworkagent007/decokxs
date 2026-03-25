package o;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.yJe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56541yJe extends AbstractC56415yEn {
    public final int AEQbTJ;
    public final int EZpvd;
    public boolean KWHzl;
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.KWHzl;
    }

    public C56541yJe(int i, int i2, int i3) {
        this.AEQbTJ = i3;
        this.EZpvd = i2;
        boolean z = i3 <= 0 ? i >= i2 : i <= i2;
        this.KWHzl = z;
        this.OLrzqt = z ? i : i2;
    }

    @Override // o.AbstractC56415yEn
    public int nextInt() {
        int i = this.OLrzqt;
        if (i != this.EZpvd) {
            this.OLrzqt = this.AEQbTJ + i;
        } else {
            if (!this.KWHzl) {
                throw new NoSuchElementException();
            }
            this.KWHzl = false;
        }
        return i;
    }
}

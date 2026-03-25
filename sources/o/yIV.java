package o;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class yIV extends yDZ {
    public boolean AEQbTJ;
    public final int EZpvd;
    public final int KWHzl;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.AEQbTJ;
    }

    public yIV(char c, char c2, int i) {
        this.KWHzl = i;
        this.EZpvd = c2;
        boolean z = i <= 0 ? Intrinsics.copydefault((int) c, (int) c2) >= 0 : Intrinsics.copydefault((int) c, (int) c2) <= 0;
        this.AEQbTJ = z;
        this.copydefault = z ? c : c2;
    }

    @Override // o.yDZ
    public char copydefault() {
        int i = this.copydefault;
        if (i != this.EZpvd) {
            this.copydefault = this.KWHzl + i;
        } else {
            if (!this.AEQbTJ) {
                throw new NoSuchElementException();
            }
            this.AEQbTJ = false;
        }
        return (char) i;
    }
}

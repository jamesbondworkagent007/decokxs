package o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.znN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59771znN {
    public final int EZpvd;
    public int KWHzl;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.KWHzl >= this.EZpvd;
    }

    public C59771znN(int i, int i2) {
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException("Lower bound cannot be negative");
        }
        if (i > i2) {
            throw new java.lang.IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
        this.copydefault = i;
        this.EZpvd = i2;
        this.KWHzl = i;
    }

    public void EZpvd(int i) {
        if (i < this.copydefault) {
            throw new java.lang.IndexOutOfBoundsException("pos: " + i + " < lowerBound: " + this.copydefault);
        }
        if (i <= this.EZpvd) {
            this.KWHzl = i;
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("pos: " + i + " > upperBound: " + this.EZpvd);
    }

    public java.lang.String toString() {
        return AbstractJsonLexerKt.BEGIN_LIST + java.lang.Integer.toString(this.copydefault) + '>' + java.lang.Integer.toString(this.KWHzl) + '>' + java.lang.Integer.toString(this.EZpvd) + AbstractJsonLexerKt.END_LIST;
    }
}

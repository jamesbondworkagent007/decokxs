package o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.zoL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C59822zoL {
    public final int AEQbTJ;
    public final int EZpvd;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return this.copydefault >= this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int copydefault() {
        return this.copydefault;
    }

    public C59822zoL(int i, int i2) {
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException("Lower bound cannot be negative");
        }
        if (i > i2) {
            throw new java.lang.IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
        this.AEQbTJ = i;
        this.EZpvd = i2;
        this.copydefault = i;
    }

    public void EZpvd(int i) {
        if (i < this.AEQbTJ) {
            throw new java.lang.IndexOutOfBoundsException("pos: " + i + " < lowerBound: " + this.AEQbTJ);
        }
        if (i <= this.EZpvd) {
            this.copydefault = i;
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("pos: " + i + " > upperBound: " + this.EZpvd);
    }

    public java.lang.String toString() {
        return AbstractJsonLexerKt.BEGIN_LIST + java.lang.Integer.toString(this.AEQbTJ) + '>' + java.lang.Integer.toString(this.copydefault) + '>' + java.lang.Integer.toString(this.EZpvd) + AbstractJsonLexerKt.END_LIST;
    }
}

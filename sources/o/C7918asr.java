package o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.asr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C7918asr implements java.lang.Cloneable {
    public long[] EZpvd;
    public int KWHzl;
    public int[] OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault() {
        this.KWHzl = 0;
    }

    public C7918asr() {
        this(10);
    }

    public C7918asr(int i) {
        if (i == 0) {
            this.OLrzqt = C7920ast.KWHzl;
            this.EZpvd = C7920ast.OLrzqt;
        } else {
            this.EZpvd = new long[i];
            this.OLrzqt = new int[i];
        }
        this.KWHzl = 0;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C7918asr clone() {
        try {
            C7918asr c7918asr = (C7918asr) super.clone();
            try {
                c7918asr.OLrzqt = (int[]) this.OLrzqt.clone();
                c7918asr.EZpvd = (long[]) this.EZpvd.clone();
                return c7918asr;
            } catch (java.lang.CloneNotSupportedException unused) {
                return c7918asr;
            }
        } catch (java.lang.CloneNotSupportedException unused2) {
            return null;
        }
    }

    public void copydefault(int i) {
        int[] iArr = this.OLrzqt;
        java.lang.System.arraycopy(iArr, 0, iArr, 0, i);
        long[] jArr = this.EZpvd;
        java.lang.System.arraycopy(jArr, 0, jArr, 0, i);
        this.KWHzl = i;
    }

    public void EZpvd(int i, long j) {
        int iAEQbTJ = C7920ast.AEQbTJ(this.OLrzqt, this.KWHzl, i);
        if (iAEQbTJ >= 0) {
            this.EZpvd[iAEQbTJ] = j;
            return;
        }
        int i2 = ~iAEQbTJ;
        this.OLrzqt = C7920ast.EZpvd(this.OLrzqt, this.KWHzl, i2, i);
        this.EZpvd = C7920ast.copydefault(this.EZpvd, this.KWHzl, i2, j);
        this.KWHzl++;
    }

    public int EZpvd(int i) {
        return this.OLrzqt[i];
    }

    public long AEQbTJ(int i) {
        return this.EZpvd[i];
    }

    public int OLrzqt(int i) {
        return C7920ast.AEQbTJ(this.OLrzqt, this.KWHzl, i);
    }

    public java.lang.String toString() {
        if (OLrzqt() <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.KWHzl * 28);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        for (int i = 0; i < this.KWHzl; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(EZpvd(i));
            sb.append('=');
            sb.append(AEQbTJ(i));
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}

package o;

import java.text.ParsePosition;

/* JADX INFO: renamed from: o.agq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7281agq extends AbstractC7276agl {
    public final double KWHzl;
    public final boolean OLrzqt;

    @Override // o.AbstractC7276agl
    public double EZpvd(double d, double d2) {
        return d / d2;
    }

    @Override // o.AbstractC7276agl
    public char KWHzl() {
        return '<';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC7276agl
    public double KWHzl(double d) {
        return this.KWHzl;
    }

    public C7281agq(int i, double d, C7279ago c7279ago, java.lang.String str) {
        super(i, c7279ago, KWHzl(str));
        this.KWHzl = d;
        this.OLrzqt = str.endsWith("<<");
    }

    public static java.lang.String KWHzl(java.lang.String str) {
        return str.endsWith("<<") ? str.substring(0, str.length() - 1) : str;
    }

    @Override // o.AbstractC7276agl
    public boolean equals(java.lang.Object obj) {
        if (super.equals(obj)) {
            C7281agq c7281agq = (C7281agq) obj;
            if (this.KWHzl == c7281agq.KWHzl && this.OLrzqt == c7281agq.OLrzqt) {
                return true;
            }
        }
        return false;
    }

    @Override // o.AbstractC7276agl
    public void EZpvd(double d, java.lang.StringBuilder sb, int i, int i2) {
        int length;
        C7279ago c7279ago;
        double dAEQbTJ = AEQbTJ(d);
        if (!this.OLrzqt || this.AYXKKw == null) {
            length = i;
        } else {
            long j = (long) dAEQbTJ;
            int length2 = sb.length();
            while (true) {
                long j2 = j * 10;
                if (j2 >= this.KWHzl) {
                    break;
                }
                sb.insert(i + this.gEmmrt, ' ');
                this.AYXKKw.AEQbTJ(0L, sb, i + this.gEmmrt, i2);
                j = j2;
            }
            length = i + (sb.length() - length2);
        }
        if (dAEQbTJ == java.lang.Math.floor(dAEQbTJ) && (c7279ago = this.AYXKKw) != null) {
            c7279ago.AEQbTJ((long) dAEQbTJ, sb, this.gEmmrt + length, i2);
            return;
        }
        C7279ago c7279ago2 = this.AYXKKw;
        if (c7279ago2 != null) {
            c7279ago2.KWHzl(dAEQbTJ, sb, length + this.gEmmrt, i2);
        } else {
            sb.insert(length + this.gEmmrt, this.copydefault.format(dAEQbTJ));
        }
    }

    @Override // o.AbstractC7276agl
    public long OLrzqt(long j) {
        return java.lang.Math.round(j * this.KWHzl);
    }

    @Override // o.AbstractC7276agl
    public double AEQbTJ(double d) {
        return java.lang.Math.round(d * this.KWHzl);
    }

    @Override // o.AbstractC7276agl
    public java.lang.Number KWHzl(java.lang.String str, ParsePosition parsePosition, double d, double d2, boolean z, int i) {
        int i2;
        java.lang.String str2;
        if (this.OLrzqt) {
            ParsePosition parsePosition2 = new ParsePosition(1);
            java.lang.String strSubstring = str;
            i2 = 0;
            while (strSubstring.length() > 0 && parsePosition2.getIndex() != 0) {
                parsePosition2.setIndex(0);
                this.AYXKKw.OLrzqt(strSubstring, parsePosition2, 1.0d, i).intValue();
                if (parsePosition2.getIndex() == 0) {
                    break;
                }
                i2++;
                parsePosition.setIndex(parsePosition.getIndex() + parsePosition2.getIndex());
                strSubstring = strSubstring.substring(parsePosition2.getIndex());
                while (strSubstring.length() > 0 && strSubstring.charAt(0) == ' ') {
                    strSubstring = strSubstring.substring(1);
                    parsePosition.setIndex(parsePosition.getIndex() + 1);
                }
            }
            java.lang.String strSubstring2 = str.substring(parsePosition.getIndex());
            parsePosition.setIndex(0);
            str2 = strSubstring2;
        } else {
            i2 = 0;
            str2 = str;
        }
        java.lang.Number numberKWHzl = super.KWHzl(str2, parsePosition, this.OLrzqt ? 1.0d : d, d2, false, i);
        if (!this.OLrzqt) {
            return numberKWHzl;
        }
        long jLongValue = numberKWHzl.longValue();
        long j = 1;
        while (j <= jLongValue) {
            j *= 10;
        }
        while (i2 > 0) {
            j *= 10;
            i2--;
        }
        return new java.lang.Double(jLongValue / j);
    }
}

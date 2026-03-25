package o;

import androidx.camera.video.AudioStats;
import java.text.ParsePosition;

/* JADX INFO: renamed from: o.agb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7266agb extends AbstractC7276agl {
    public final boolean KWHzl;
    public final boolean OLrzqt;

    @Override // o.AbstractC7276agl
    public double EZpvd(double d, double d2) {
        return d + d2;
    }

    @Override // o.AbstractC7276agl
    public char KWHzl() {
        return '>';
    }

    @Override // o.AbstractC7276agl
    public double KWHzl(double d) {
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    @Override // o.AbstractC7276agl
    public long OLrzqt(long j) {
        return 0L;
    }

    public C7266agb(int i, C7279ago c7279ago, java.lang.String str) {
        C7279ago c7279ago2;
        super(i, c7279ago, str);
        if (str.equals(">>") || str.equals(">>>") || c7279ago == (c7279ago2 = this.AYXKKw)) {
            this.KWHzl = true;
            this.OLrzqt = !str.equals(">>>");
        } else {
            this.KWHzl = false;
            this.OLrzqt = true;
            c7279ago2.EZpvd();
        }
    }

    @Override // o.AbstractC7276agl
    public void EZpvd(double d, java.lang.StringBuilder sb, int i, int i2) {
        if (!this.KWHzl) {
            super.EZpvd(d, sb, i, i2);
            return;
        }
        C7167aei c7167aei = new C7167aei(d);
        c7167aei.djBIcL();
        boolean z = false;
        for (int iKWHzl = c7167aei.KWHzl(); iKWHzl < 0; iKWHzl++) {
            if (z && this.OLrzqt) {
                sb.insert(this.gEmmrt + i, ' ');
            } else {
                z = true;
            }
            this.AYXKKw.AEQbTJ(c7167aei.EZpvd(iKWHzl), sb, i + this.gEmmrt, i2);
        }
    }

    @Override // o.AbstractC7276agl
    public double AEQbTJ(double d) {
        return d - java.lang.Math.floor(d);
    }

    @Override // o.AbstractC7276agl
    public java.lang.Number KWHzl(java.lang.String str, ParsePosition parsePosition, double d, double d2, boolean z, int i) {
        java.lang.Number number;
        if (!this.KWHzl) {
            return super.KWHzl(str, parsePosition, d, AudioStats.AUDIO_AMPLITUDE_NONE, z, i);
        }
        ParsePosition parsePosition2 = new ParsePosition(1);
        C7167aei c7167aei = new C7167aei();
        java.lang.String strSubstring = str;
        int i2 = 0;
        while (strSubstring.length() > 0 && parsePosition2.getIndex() != 0) {
            parsePosition2.setIndex(0);
            int iIntValue = this.AYXKKw.OLrzqt(strSubstring, parsePosition2, 10.0d, i).intValue();
            if (z && parsePosition2.getIndex() == 0 && (number = this.AYXKKw.AhwBna.getDecimalFormat().parse(strSubstring, parsePosition2)) != null) {
                iIntValue = number.intValue();
            }
            if (parsePosition2.getIndex() != 0) {
                c7167aei.EZpvd((byte) iIntValue, 0, true);
                i2++;
                parsePosition.setIndex(parsePosition.getIndex() + parsePosition2.getIndex());
                strSubstring = strSubstring.substring(parsePosition2.getIndex());
                while (strSubstring.length() > 0 && strSubstring.charAt(0) == ' ') {
                    strSubstring = strSubstring.substring(1);
                    parsePosition.setIndex(parsePosition.getIndex() + 1);
                }
            }
        }
        c7167aei.AEQbTJ(-i2);
        return new java.lang.Double(EZpvd(c7167aei.fIwbmz(), d));
    }
}

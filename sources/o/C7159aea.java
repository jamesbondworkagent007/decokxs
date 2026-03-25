package o;

import com.ibm.icu.text.DecimalFormatSymbols;
import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.text.UnicodeSet;

/* JADX INFO: renamed from: o.aea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7159aea extends C7161aec {
    public final java.lang.String AYXKKw;
    public final UnicodeSet DbNXlk;
    public final UnicodeSet fetchVPNInfo;
    public final java.lang.String values;
    public static final UnicodeSet djBIcL = new UnicodeSet("[:digit:]").AYXKKw();
    public static final UnicodeSet AhwBna = new UnicodeSet("[[:^S:]&[:^Z:]]").AYXKKw();

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C7159aea(C7020abU c7020abU, C7020abU c7020abU2, boolean z, boolean z2, DecimalFormatSymbols decimalFormatSymbols) {
        super(c7020abU, c7020abU2, z, z2);
        if (c7020abU.length() <= 0 || c7020abU.EZpvd(c7020abU.length() - 1) != NumberFormat.Field.CURRENCY) {
            this.DbNXlk = null;
            this.AYXKKw = null;
        } else {
            if (OLrzqt(decimalFormatSymbols, (short) 0, (byte) 0).AEQbTJ(c7020abU.copydefault())) {
                UnicodeSet unicodeSetOLrzqt = OLrzqt(decimalFormatSymbols, (short) 1, (byte) 0);
                this.DbNXlk = unicodeSetOLrzqt;
                unicodeSetOLrzqt.AYXKKw();
                this.AYXKKw = AEQbTJ(decimalFormatSymbols, (byte) 0);
            }
        }
        if (c7020abU2.length() > 0 && c7020abU2.EZpvd(0) == NumberFormat.Field.CURRENCY) {
            if (OLrzqt(decimalFormatSymbols, (short) 0, (byte) 1).AEQbTJ(c7020abU2.KWHzl())) {
                UnicodeSet unicodeSetOLrzqt2 = OLrzqt(decimalFormatSymbols, (short) 1, (byte) 1);
                this.fetchVPNInfo = unicodeSetOLrzqt2;
                unicodeSetOLrzqt2.AYXKKw();
                this.values = AEQbTJ(decimalFormatSymbols, (byte) 1);
                return;
            }
        }
        this.fetchVPNInfo = null;
        this.values = null;
    }

    @Override // o.C7161aec, com.ibm.icu.impl.number.Modifier
    public int AEQbTJ(C7020abU c7020abU, int i, int i2) {
        UnicodeSet unicodeSet;
        UnicodeSet unicodeSet2;
        int i3 = i2 - i;
        int iCopydefault = (i3 <= 0 || (unicodeSet2 = this.DbNXlk) == null || !unicodeSet2.AEQbTJ(c7020abU.OLrzqt(i))) ? 0 : c7020abU.copydefault(i, this.AYXKKw, (java.lang.Object) null);
        if (i3 > 0 && (unicodeSet = this.fetchVPNInfo) != null && unicodeSet.AEQbTJ(c7020abU.KWHzl(i2))) {
            iCopydefault += c7020abU.copydefault(i2 + iCopydefault, this.values, (java.lang.Object) null);
        }
        return iCopydefault + super.AEQbTJ(c7020abU, i, i2 + iCopydefault);
    }

    public static int AEQbTJ(C7020abU c7020abU, int i, int i2, int i3, int i4, DecimalFormatSymbols decimalFormatSymbols) {
        int iAEQbTJ = 0;
        boolean z = i2 > 0;
        boolean z2 = i4 > 0;
        boolean z3 = (i3 - i) - i2 > 0;
        if (z && z3) {
            iAEQbTJ = AEQbTJ(c7020abU, i + i2, (byte) 0, decimalFormatSymbols);
        }
        return (z2 && z3) ? iAEQbTJ + AEQbTJ(c7020abU, i3 + iAEQbTJ, (byte) 1, decimalFormatSymbols) : iAEQbTJ;
    }

    public static int AEQbTJ(C7020abU c7020abU, int i, byte b, DecimalFormatSymbols decimalFormatSymbols) {
        java.lang.Object objEZpvd;
        if (b == 0) {
            objEZpvd = c7020abU.EZpvd(i - 1);
        } else {
            objEZpvd = c7020abU.EZpvd(i);
        }
        if (objEZpvd != NumberFormat.Field.CURRENCY) {
            return 0;
        }
        if (!OLrzqt(decimalFormatSymbols, (short) 0, b).AEQbTJ(b == 0 ? c7020abU.KWHzl(i) : c7020abU.OLrzqt(i))) {
            return 0;
        }
        if (OLrzqt(decimalFormatSymbols, (short) 1, b).AEQbTJ(b == 0 ? c7020abU.OLrzqt(i) : c7020abU.KWHzl(i))) {
            return c7020abU.copydefault(i, AEQbTJ(decimalFormatSymbols, b), (java.lang.Object) null);
        }
        return 0;
    }

    public static UnicodeSet OLrzqt(DecimalFormatSymbols decimalFormatSymbols, short s, byte b) {
        java.lang.String patternForCurrencySpacing = decimalFormatSymbols.getPatternForCurrencySpacing(s == 0 ? 0 : 1, b == 1);
        return patternForCurrencySpacing.equals("[:digit:]") ? djBIcL : patternForCurrencySpacing.equals("[[:^S:]&[:^Z:]]") ? AhwBna : new UnicodeSet(patternForCurrencySpacing);
    }

    public static java.lang.String AEQbTJ(DecimalFormatSymbols decimalFormatSymbols, byte b) {
        return decimalFormatSymbols.getPatternForCurrencySpacing(2, b == 1);
    }
}

package o;

import com.ibm.icu.util.MeasureUnit;

/* JADX INFO: renamed from: o.agP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7254agP {
    public final java.lang.Number AEQbTJ;
    public final MeasureUnit EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MeasureUnit EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Number OLrzqt() {
        return this.AEQbTJ;
    }

    public C7254agP(java.lang.Number number, MeasureUnit measureUnit) {
        if (number == null || measureUnit == null) {
            throw new java.lang.NullPointerException("Number and MeasureUnit must not be null");
        }
        this.AEQbTJ = number;
        this.EZpvd = measureUnit;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7254agP)) {
            return false;
        }
        C7254agP c7254agP = (C7254agP) obj;
        return this.EZpvd.equals(c7254agP.EZpvd) && KWHzl(this.AEQbTJ, c7254agP.AEQbTJ);
    }

    public static boolean KWHzl(java.lang.Number number, java.lang.Number number2) {
        return number.equals(number2) || number.doubleValue() == number2.doubleValue();
    }

    public int hashCode() {
        return (java.lang.Double.valueOf(this.AEQbTJ.doubleValue()).hashCode() * 31) + this.EZpvd.hashCode();
    }

    public java.lang.String toString() {
        return this.AEQbTJ.toString() + ' ' + this.EZpvd.toString();
    }
}

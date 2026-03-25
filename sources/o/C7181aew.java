package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.ibm.icu.impl.number.DecimalFormatProperties;

/* JADX INFO: renamed from: o.aew, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7181aew implements InterfaceC7102adW {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;

    @Override // o.InterfaceC7102adW
    public boolean EZpvd() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7102adW
    public java.lang.String KWHzl(int i) {
        boolean z = (i & 256) != 0;
        boolean z2 = (i & 512) != 0;
        return (z && z2) ? this.copydefault : z ? this.AEQbTJ : z2 ? this.EZpvd : this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7102adW
    public boolean KWHzl() {
        return this.OLrzqt;
    }

    public static InterfaceC7102adW OLrzqt(DecimalFormatProperties decimalFormatProperties) {
        if (decimalFormatProperties.getCurrencyPluralInfo() == null) {
            return new C7181aew(decimalFormatProperties);
        }
        return new C7160aeb(decimalFormatProperties.getCurrencyPluralInfo(), decimalFormatProperties);
    }

    public C7181aew(DecimalFormatProperties decimalFormatProperties) {
        java.lang.String strOLrzqt = C7105adZ.OLrzqt(decimalFormatProperties.getPositivePrefix());
        java.lang.String strOLrzqt2 = C7105adZ.OLrzqt(decimalFormatProperties.getPositiveSuffix());
        java.lang.String strOLrzqt3 = C7105adZ.OLrzqt(decimalFormatProperties.getNegativePrefix());
        java.lang.String strOLrzqt4 = C7105adZ.OLrzqt(decimalFormatProperties.getNegativeSuffix());
        java.lang.String positivePrefixPattern = decimalFormatProperties.getPositivePrefixPattern();
        java.lang.String positiveSuffixPattern = decimalFormatProperties.getPositiveSuffixPattern();
        java.lang.String negativePrefixPattern = decimalFormatProperties.getNegativePrefixPattern();
        java.lang.String negativeSuffixPattern = decimalFormatProperties.getNegativeSuffixPattern();
        if (strOLrzqt != null) {
            this.AEQbTJ = strOLrzqt;
        } else if (positivePrefixPattern != null) {
            this.AEQbTJ = positivePrefixPattern;
        } else {
            this.AEQbTJ = "";
        }
        if (strOLrzqt2 != null) {
            this.KWHzl = strOLrzqt2;
        } else if (positiveSuffixPattern != null) {
            this.KWHzl = positiveSuffixPattern;
        } else {
            this.KWHzl = "";
        }
        if (strOLrzqt3 != null) {
            this.copydefault = strOLrzqt3;
        } else if (negativePrefixPattern != null) {
            this.copydefault = negativePrefixPattern;
        } else {
            java.lang.String str = "-";
            if (positivePrefixPattern != null) {
                str = "-" + positivePrefixPattern;
            }
            this.copydefault = str;
        }
        if (strOLrzqt4 != null) {
            this.EZpvd = strOLrzqt4;
        } else if (negativeSuffixPattern != null) {
            this.EZpvd = negativeSuffixPattern;
        } else {
            this.EZpvd = positiveSuffixPattern != null ? positiveSuffixPattern : "";
        }
        this.OLrzqt = C7105adZ.EZpvd(positivePrefixPattern) || C7105adZ.EZpvd(positiveSuffixPattern) || C7105adZ.EZpvd(negativePrefixPattern) || C7105adZ.EZpvd(negativeSuffixPattern);
    }

    @Override // o.InterfaceC7102adW
    public char OLrzqt(int i, int i2) {
        return KWHzl(i).charAt(i2);
    }

    @Override // o.InterfaceC7102adW
    public int OLrzqt(int i) {
        return KWHzl(i).length();
    }

    @Override // o.InterfaceC7102adW
    public boolean AEQbTJ() {
        return C7105adZ.OLrzqt(this.AEQbTJ, -2) || C7105adZ.OLrzqt(this.KWHzl, -2);
    }

    @Override // o.InterfaceC7102adW
    public boolean OLrzqt() {
        if (this.EZpvd != this.KWHzl || this.copydefault.length() != this.AEQbTJ.length() + 1) {
            return true;
        }
        java.lang.String str = this.copydefault;
        java.lang.String str2 = this.AEQbTJ;
        return (str.regionMatches(1, str2, 0, str2.length()) && this.copydefault.charAt(0) == '-') ? false : true;
    }

    @Override // o.InterfaceC7102adW
    public boolean copydefault() {
        return C7105adZ.OLrzqt(this.copydefault, -1) || C7105adZ.OLrzqt(this.EZpvd, -1);
    }

    @Override // o.InterfaceC7102adW
    public boolean copydefault(int i) {
        return C7105adZ.OLrzqt(this.AEQbTJ, i) || C7105adZ.OLrzqt(this.KWHzl, i) || C7105adZ.OLrzqt(this.copydefault, i) || C7105adZ.OLrzqt(this.EZpvd, i);
    }

    public java.lang.String toString() {
        return super.toString() + " {" + this.AEQbTJ + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + this.KWHzl + ";" + this.copydefault + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + this.EZpvd + "}";
    }
}

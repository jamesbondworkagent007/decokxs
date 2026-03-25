package o;

import com.ibm.icu.impl.number.Modifier;
import java.text.Format;

/* JADX INFO: renamed from: o.aed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7162aed implements Modifier {
    public static final C7162aed KWHzl = new C7162aed();
    public final java.lang.String EZpvd = "";
    public final java.lang.String OLrzqt = "";
    public final Format.Field copydefault = null;
    public final boolean AEQbTJ = false;

    @Override // com.ibm.icu.impl.number.Modifier
    public int AEQbTJ(C7020abU c7020abU, int i, int i2) {
        return c7020abU.copydefault(i2, this.OLrzqt, this.copydefault) + c7020abU.copydefault(i, this.EZpvd, this.copydefault);
    }

    @Override // com.ibm.icu.impl.number.Modifier
    public int OLrzqt() {
        return this.EZpvd.length();
    }

    @Override // com.ibm.icu.impl.number.Modifier
    public int AEQbTJ() {
        java.lang.String str = this.EZpvd;
        int iCodePointCount = str.codePointCount(0, str.length());
        java.lang.String str2 = this.OLrzqt;
        return iCodePointCount + str2.codePointCount(0, str2.length());
    }

    public java.lang.String toString() {
        return java.lang.String.format("<ConstantAffixModifier prefix:'%s' suffix:'%s'>", this.EZpvd, this.OLrzqt);
    }
}

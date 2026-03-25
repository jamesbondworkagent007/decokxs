package o;

import com.ibm.icu.impl.FormattedValueStringBuilderImpl;
import com.ibm.icu.text.PluralRules;
import com.ibm.icu.util.MeasureUnit;
import java.text.AttributedCharacterIterator;

/* JADX INFO: renamed from: o.afn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7225afn implements InterfaceC7269age {
    public final InterfaceC7163aee AEQbTJ;
    public final C7020abU KWHzl;
    public final MeasureUnit OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @java.lang.Deprecated
    public PluralRules.TaskDescription EZpvd() {
        return this.AEQbTJ;
    }

    public C7225afn(C7020abU c7020abU, InterfaceC7163aee interfaceC7163aee, MeasureUnit measureUnit) {
        this.KWHzl = c7020abU;
        this.AEQbTJ = interfaceC7163aee;
        this.OLrzqt = measureUnit;
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
        return this.KWHzl.toString();
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.KWHzl.length();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.KWHzl.charAt(i);
    }

    @Override // java.lang.CharSequence
    public java.lang.CharSequence subSequence(int i, int i2) {
        return this.KWHzl.OLrzqt(i, i2);
    }

    public AttributedCharacterIterator OLrzqt() {
        return FormattedValueStringBuilderImpl.OLrzqt(this.KWHzl, null);
    }
}

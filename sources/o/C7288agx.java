package o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.agx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7288agx {
    public final java.lang.String copydefault;

    public C7288agx(java.lang.String str) {
        this.copydefault = str;
    }

    public static C7288agx OLrzqt(java.lang.CharSequence charSequence, int i, int i2) {
        return new C7288agx(C7028acB.OLrzqt(charSequence, new java.lang.StringBuilder(), i, i2));
    }

    public int EZpvd() {
        return C7028acB.EZpvd(this.copydefault);
    }

    public java.lang.String EZpvd(java.lang.CharSequence... charSequenceArr) {
        return C7028acB.EZpvd(this.copydefault, charSequenceArr);
    }

    public java.lang.StringBuilder EZpvd(java.lang.StringBuilder sb, int[] iArr, java.lang.CharSequence... charSequenceArr) {
        return C7028acB.copydefault(this.copydefault, sb, iArr, charSequenceArr);
    }

    public java.lang.String toString() {
        int iEZpvd = EZpvd();
        java.lang.String[] strArr = new java.lang.String[iEZpvd];
        for (int i = 0; i < iEZpvd; i++) {
            strArr[i] = "{" + i + AbstractJsonLexerKt.END_OBJ;
        }
        return EZpvd(new java.lang.StringBuilder(), null, strArr).toString();
    }
}

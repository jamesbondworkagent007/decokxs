package o;

import com.ibm.icu.impl.number.Modifier;

/* JADX INFO: renamed from: o.aec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7161aec implements Modifier {
    public final boolean AEQbTJ;
    public final char[] EZpvd;
    public final java.lang.Object[] KWHzl;
    public final Modifier.TaskDescription OLrzqt;
    public final boolean copydefault;
    public final java.lang.Object[] gEmmrt;
    public final char[] valueOf;

    public C7161aec(C7020abU c7020abU, C7020abU c7020abU2, boolean z, boolean z2) {
        this(c7020abU, c7020abU2, z, z2, null);
    }

    public C7161aec(C7020abU c7020abU, C7020abU c7020abU2, boolean z, boolean z2, Modifier.TaskDescription taskDescription) {
        this.EZpvd = c7020abU.AYXKKw();
        this.valueOf = c7020abU2.AYXKKw();
        this.KWHzl = c7020abU.gEmmrt();
        this.gEmmrt = c7020abU2.gEmmrt();
        this.AEQbTJ = z;
        this.copydefault = z2;
        this.OLrzqt = taskDescription;
    }

    @Override // com.ibm.icu.impl.number.Modifier
    public int AEQbTJ(C7020abU c7020abU, int i, int i2) {
        int iCopydefault = c7020abU.copydefault(i, this.EZpvd, this.KWHzl);
        if (this.AEQbTJ) {
            iCopydefault += c7020abU.copydefault(i + iCopydefault, i2 + iCopydefault, "", 0, 0, null);
        }
        return iCopydefault + c7020abU.copydefault(i2 + iCopydefault, this.valueOf, this.gEmmrt);
    }

    @Override // com.ibm.icu.impl.number.Modifier
    public int OLrzqt() {
        return this.EZpvd.length;
    }

    @Override // com.ibm.icu.impl.number.Modifier
    public int AEQbTJ() {
        char[] cArr = this.EZpvd;
        int iCodePointCount = java.lang.Character.codePointCount(cArr, 0, cArr.length);
        char[] cArr2 = this.valueOf;
        return iCodePointCount + java.lang.Character.codePointCount(cArr2, 0, cArr2.length);
    }

    public java.lang.String toString() {
        C7020abU c7020abU = new C7020abU();
        AEQbTJ(c7020abU, 0, 0);
        int iOLrzqt = OLrzqt();
        return java.lang.String.format("<ConstantMultiFieldModifier prefix:'%s' suffix:'%s'>", c7020abU.subSequence(0, iOLrzqt), c7020abU.subSequence(iOLrzqt, c7020abU.length()));
    }
}

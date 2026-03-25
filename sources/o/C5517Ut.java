package o;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.io.ContentReference;

/* JADX INFO: renamed from: o.Ut, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5517Ut {
    public char[] AEQbTJ;
    public byte[] AYXKKw;
    public char[] AhwBna;
    public JsonEncoding EZpvd;
    public final ContentReference KWHzl;
    public byte[] OLrzqt;
    public final C5536Vm copydefault;
    public final boolean djBIcL;

    @java.lang.Deprecated
    public final java.lang.Object gEmmrt;
    public char[] valueOf;
    public byte[] values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(JsonEncoding jsonEncoding) {
        this.EZpvd = jsonEncoding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JsonEncoding gEmmrt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ContentReference valueOf() {
        return this.KWHzl;
    }

    public C5517Ut(C5536Vm c5536Vm, ContentReference contentReference, boolean z) {
        this.copydefault = c5536Vm;
        this.KWHzl = contentReference;
        this.gEmmrt = contentReference.getRawContent();
        this.djBIcL = z;
    }

    public C5544Vu djBIcL() {
        return new C5544Vu(this.copydefault);
    }

    public byte[] AEQbTJ() {
        KWHzl((java.lang.Object) this.AYXKKw);
        byte[] bArrAEQbTJ = this.copydefault.AEQbTJ(0);
        this.AYXKKw = bArrAEQbTJ;
        return bArrAEQbTJ;
    }

    public byte[] copydefault() {
        KWHzl((java.lang.Object) this.values);
        byte[] bArrAEQbTJ = this.copydefault.AEQbTJ(1);
        this.values = bArrAEQbTJ;
        return bArrAEQbTJ;
    }

    public byte[] KWHzl() {
        KWHzl((java.lang.Object) this.OLrzqt);
        byte[] bArrAEQbTJ = this.copydefault.AEQbTJ(3);
        this.OLrzqt = bArrAEQbTJ;
        return bArrAEQbTJ;
    }

    public char[] OLrzqt() {
        KWHzl((java.lang.Object) this.AhwBna);
        char[] cArrKWHzl = this.copydefault.KWHzl(0);
        this.AhwBna = cArrKWHzl;
        return cArrKWHzl;
    }

    public char[] EZpvd(int i) {
        KWHzl((java.lang.Object) this.AhwBna);
        char[] cArrCopydefault = this.copydefault.copydefault(0, i);
        this.AhwBna = cArrCopydefault;
        return cArrCopydefault;
    }

    public char[] EZpvd() {
        KWHzl((java.lang.Object) this.AEQbTJ);
        char[] cArrKWHzl = this.copydefault.KWHzl(1);
        this.AEQbTJ = cArrKWHzl;
        return cArrKWHzl;
    }

    public char[] AEQbTJ(int i) {
        KWHzl((java.lang.Object) this.valueOf);
        char[] cArrCopydefault = this.copydefault.copydefault(3, i);
        this.valueOf = cArrCopydefault;
        return cArrCopydefault;
    }

    public void copydefault(byte[] bArr) {
        if (bArr != null) {
            EZpvd(bArr, this.AYXKKw);
            this.AYXKKw = null;
            this.copydefault.EZpvd(0, bArr);
        }
    }

    public void KWHzl(byte[] bArr) {
        if (bArr != null) {
            EZpvd(bArr, this.values);
            this.values = null;
            this.copydefault.EZpvd(1, bArr);
        }
    }

    public void AEQbTJ(byte[] bArr) {
        if (bArr != null) {
            EZpvd(bArr, this.OLrzqt);
            this.OLrzqt = null;
            this.copydefault.EZpvd(3, bArr);
        }
    }

    public void EZpvd(char[] cArr) {
        if (cArr != null) {
            copydefault(cArr, this.AhwBna);
            this.AhwBna = null;
            this.copydefault.KWHzl(0, cArr);
        }
    }

    public void KWHzl(char[] cArr) {
        if (cArr != null) {
            copydefault(cArr, this.AEQbTJ);
            this.AEQbTJ = null;
            this.copydefault.KWHzl(1, cArr);
        }
    }

    public void copydefault(char[] cArr) {
        if (cArr != null) {
            copydefault(cArr, this.valueOf);
            this.valueOf = null;
            this.copydefault.KWHzl(3, cArr);
        }
    }

    public final void KWHzl(java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    public final void EZpvd(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw AYXKKw();
        }
    }

    public final void copydefault(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw AYXKKw();
        }
    }

    public final java.lang.IllegalArgumentException AYXKKw() {
        return new java.lang.IllegalArgumentException("Trying to release buffer smaller than original");
    }
}

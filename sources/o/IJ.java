package o;

import co.nstant.in.cbor.model.MajorType;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class IJ extends C5208Iw {
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        java.lang.String str = this.EZpvd;
        return str == null ? AbstractJsonLexerKt.NULL : str;
    }

    @Override // o.C5208Iw
    public /* bridge */ /* synthetic */ C5208Iw AEQbTJ(boolean z) {
        return super.AEQbTJ(z);
    }

    @Override // o.C5208Iw
    public /* bridge */ /* synthetic */ boolean OLrzqt() {
        return super.OLrzqt();
    }

    public IJ(java.lang.String str) {
        super(MajorType.UNICODE_STRING);
        this.EZpvd = str;
    }

    @Override // o.C5208Iw, o.C5211Iz
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IJ) || !super.equals(obj)) {
            return false;
        }
        IJ ij = (IJ) obj;
        java.lang.String str = this.EZpvd;
        if (str == null) {
            return ij.EZpvd == null;
        }
        return str.equals(ij.EZpvd);
    }

    @Override // o.C5208Iw, o.C5211Iz
    public int hashCode() {
        if (this.EZpvd != null) {
            return super.hashCode() + this.EZpvd.hashCode();
        }
        return 0;
    }
}

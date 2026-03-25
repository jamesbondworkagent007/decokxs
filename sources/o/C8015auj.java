package o;

import com.fasterxml.jackson.core.JsonPointer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.auj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8015auj {
    public final boolean AEQbTJ;
    public boolean EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;
    public byte[] djBIcL;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AYXKKw() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(byte[] bArr) {
        this.djBIcL = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.djBIcL != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean valueOf() {
        return this.AEQbTJ;
    }

    public C8015auj(java.lang.String str, java.lang.String str2, boolean z) {
        this(str, str2, z, str2.startsWith("file://android_asset/"));
    }

    public C8015auj(java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
        this.EZpvd = false;
        this.KWHzl = str;
        this.OLrzqt = str2;
        this.valueOf = true;
        this.copydefault = z;
        this.AEQbTJ = z2;
    }

    public int OLrzqt() {
        byte[] bArr = this.djBIcL;
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    public java.lang.String KWHzl() {
        if (this.AEQbTJ && this.OLrzqt.startsWith("file://android_asset/")) {
            return this.OLrzqt.substring(21);
        }
        return this.OLrzqt;
    }

    public java.lang.String copydefault(java.lang.String str) {
        return EZpvd(str, KWHzl(".lua"));
    }

    public java.lang.String EZpvd(java.lang.String str) {
        return EZpvd(str, KWHzl(".luab"));
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        java.io.File file = new java.io.File(str, str2);
        java.io.File parentFile = file.getParentFile();
        if (!parentFile.isDirectory()) {
            parentFile.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        java.lang.String str2 = this.KWHzl;
        if (str2.indexOf(46) >= 0) {
            if (str2.endsWith(".lua")) {
                return str != ".lua" ? C60048zuX.OLrzqt(str2, '.', JsonPointer.SEPARATOR).replace("/lua", str) : str2;
            }
            return C60048zuX.OLrzqt(str2, '.', JsonPointer.SEPARATOR) + str;
        }
        return str2 + str;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ScriptFile{chunkName='");
        sb.append(this.KWHzl);
        sb.append('\'');
        sb.append(", has sourceData=");
        sb.append(this.djBIcL != null);
        sb.append(", compiled=");
        sb.append(this.EZpvd);
        sb.append(", isMain=");
        sb.append(this.copydefault);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}

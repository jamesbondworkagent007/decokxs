package o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class SC {
    public java.lang.Class<?> AEQbTJ;
    public java.lang.Class<?> KWHzl;
    public java.lang.Class<?> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@androidx.annotation.NonNull java.lang.Class<?> cls, @androidx.annotation.NonNull java.lang.Class<?> cls2, @androidx.annotation.Nullable java.lang.Class<?> cls3) {
        this.AEQbTJ = cls;
        this.OLrzqt = cls2;
        this.KWHzl = cls3;
    }

    public SC() {
    }

    public SC(@androidx.annotation.NonNull java.lang.Class<?> cls, @androidx.annotation.NonNull java.lang.Class<?> cls2, @androidx.annotation.Nullable java.lang.Class<?> cls3) {
        OLrzqt(cls, cls2, cls3);
    }

    public java.lang.String toString() {
        return "MultiClassKey{first=" + this.AEQbTJ + ", second=" + this.OLrzqt + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SC sc = (SC) obj;
        return this.AEQbTJ.equals(sc.AEQbTJ) && this.OLrzqt.equals(sc.OLrzqt) && SI.AEQbTJ(this.KWHzl, sc.KWHzl);
    }

    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        java.lang.Class<?> cls = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (cls != null ? cls.hashCode() : 0);
    }
}

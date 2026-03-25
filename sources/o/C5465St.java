package o;

import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.St, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5465St implements NH {
    public final java.lang.Object KWHzl;

    public C5465St(@androidx.annotation.NonNull java.lang.Object obj) {
        this.KWHzl = SE.OLrzqt(obj);
    }

    public java.lang.String toString() {
        return "ObjectKey{object=" + this.KWHzl + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // o.NH
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C5465St) {
            return this.KWHzl.equals(((C5465St) obj).KWHzl);
        }
        return false;
    }

    @Override // o.NH
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    @Override // o.NH
    public void AEQbTJ(@androidx.annotation.NonNull MessageDigest messageDigest) {
        messageDigest.update(this.KWHzl.toString().getBytes(NH.AEQbTJ));
    }
}

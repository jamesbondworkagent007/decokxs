package o;

import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5356Oo implements NH {
    public final NH OLrzqt;
    public final NH copydefault;

    public C5356Oo(NH nh, NH nh2) {
        this.copydefault = nh;
        this.OLrzqt = nh2;
    }

    @Override // o.NH
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C5356Oo) {
            C5356Oo c5356Oo = (C5356Oo) obj;
            if (this.copydefault.equals(c5356Oo.copydefault) && this.OLrzqt.equals(c5356Oo.OLrzqt)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.NH
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    public java.lang.String toString() {
        return "DataCacheKey{sourceKey=" + this.copydefault + ", signature=" + this.OLrzqt + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // o.NH
    public void AEQbTJ(@androidx.annotation.NonNull MessageDigest messageDigest) {
        this.copydefault.AEQbTJ(messageDigest);
        this.OLrzqt.AEQbTJ(messageDigest);
    }
}

package o;

import com.amplifyframework.core.model.ModelIdentifier;
import java.util.Objects;

/* JADX INFO: renamed from: o.zvl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60104zvl {
    public final java.lang.String KWHzl;
    public final java.lang.Object copydefault;

    public C60104zvl(java.lang.String str, java.lang.Object obj) {
        this.KWHzl = str;
        this.copydefault = obj;
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(this.KWHzl) + "=\"" + java.lang.String.valueOf(this.copydefault) + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C60104zvl c60104zvl = (C60104zvl) obj;
        return Objects.equals(this.KWHzl, c60104zvl.KWHzl) && Objects.equals(this.copydefault, c60104zvl.copydefault);
    }

    public int hashCode() {
        return Objects.hash(this.KWHzl, this.copydefault);
    }
}

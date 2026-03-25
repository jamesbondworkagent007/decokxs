package o;

import androidx.collection.SimpleArrayMap;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class NM implements NH {
    public final androidx.collection.ArrayMap<NJ<?>, java.lang.Object> copydefault = new SB();

    public void AEQbTJ(@androidx.annotation.NonNull NM nm) {
        this.copydefault.putAll((SimpleArrayMap<? extends NJ<?>, ? extends java.lang.Object>) nm.copydefault);
    }

    public <T> NM copydefault(@androidx.annotation.NonNull NJ<T> nj, @androidx.annotation.NonNull T t) {
        this.copydefault.put(nj, t);
        return this;
    }

    public NM EZpvd(@androidx.annotation.NonNull NJ<?> nj) {
        this.copydefault.remove(nj);
        return this;
    }

    public <T> T OLrzqt(@androidx.annotation.NonNull NJ<T> nj) {
        return this.copydefault.containsKey(nj) ? (T) this.copydefault.get(nj) : nj.copydefault();
    }

    @Override // o.NH
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof NM) {
            return this.copydefault.equals(((NM) obj).copydefault);
        }
        return false;
    }

    @Override // o.NH
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    @Override // o.NH
    public void AEQbTJ(@androidx.annotation.NonNull MessageDigest messageDigest) {
        for (int i = 0; i < this.copydefault.size(); i++) {
            AEQbTJ(this.copydefault.keyAt(i), this.copydefault.valueAt(i), messageDigest);
        }
    }

    public java.lang.String toString() {
        return "Options{values=" + this.copydefault + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void AEQbTJ(@androidx.annotation.NonNull NJ<T> nj, @androidx.annotation.NonNull java.lang.Object obj, @androidx.annotation.NonNull MessageDigest messageDigest) {
        nj.OLrzqt(obj, messageDigest);
    }
}

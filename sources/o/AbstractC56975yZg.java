package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yZg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56975yZg<T> {
    public final T EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public T KWHzl() {
        return this.EZpvd;
    }

    public abstract AbstractC59233zdF OLrzqt(@NotNull yNP ynp);

    public AbstractC56975yZg(T t) {
        this.EZpvd = t;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            T tKWHzl = KWHzl();
            AbstractC56975yZg abstractC56975yZg = obj instanceof AbstractC56975yZg ? (AbstractC56975yZg) obj : null;
            if (!Intrinsics.EZpvd(tKWHzl, abstractC56975yZg != null ? abstractC56975yZg.KWHzl() : null)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        T tKWHzl = KWHzl();
        if (tKWHzl != null) {
            return tKWHzl.hashCode();
        }
        return 0;
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(KWHzl());
    }
}

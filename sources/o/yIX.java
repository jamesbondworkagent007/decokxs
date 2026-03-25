package o;

import java.lang.Comparable;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC56538yJb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yIX<T extends java.lang.Comparable<? super T>> implements InterfaceC56538yJb<T> {
    public final T EZpvd;
    public final T copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56538yJb
    public T getEndInclusive() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56538yJb
    public T getStart() {
        return this.EZpvd;
    }

    public yIX(@NotNull T t, @NotNull T t2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(t2, "");
        this.EZpvd = t;
        this.copydefault = t2;
    }

    @Override // o.InterfaceC56538yJb
    public boolean contains(@NotNull T t) {
        return InterfaceC56538yJb.StateListAnimator.KWHzl(this, t);
    }

    @Override // o.InterfaceC56538yJb
    public boolean isEmpty() {
        return InterfaceC56538yJb.StateListAnimator.AEQbTJ(this);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof yIX) {
            if (!isEmpty() || !((yIX) obj).isEmpty()) {
                yIX yix = (yIX) obj;
                if (!Intrinsics.EZpvd(getStart(), yix.getStart()) || !Intrinsics.EZpvd(getEndInclusive(), yix.getEndInclusive())) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + getEndInclusive().hashCode();
    }

    public java.lang.String toString() {
        return getStart() + ".." + getEndInclusive();
    }
}

package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yIK<T> implements yIP<java.lang.Object, T> {
    public T EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yIP
    public void KWHzl(java.lang.Object obj, @NotNull yJA<?> yja, @NotNull T t) {
        Intrinsics.checkNotNullParameter(yja, "");
        Intrinsics.checkNotNullParameter(t, "");
        this.EZpvd = t;
    }

    @Override // o.yIP, o.yIO
    public T getValue(java.lang.Object obj, @NotNull yJA<?> yja) {
        Intrinsics.checkNotNullParameter(yja, "");
        T t = this.EZpvd;
        if (t != null) {
            return t;
        }
        throw new java.lang.IllegalStateException("Property " + yja.getName() + " should be initialized before get.");
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("NotNullProperty(");
        if (this.EZpvd != null) {
            str = "value=" + this.EZpvd;
        } else {
            str = "value not initialized yet";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}

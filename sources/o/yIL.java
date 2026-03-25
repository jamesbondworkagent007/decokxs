package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yIL<V> implements yIP<java.lang.Object, V> {
    public V OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull yJA<?> yja, V v, V v2) {
        Intrinsics.checkNotNullParameter(yja, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault(@NotNull yJA<?> yja, V v, V v2) {
        Intrinsics.checkNotNullParameter(yja, "");
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yIP, o.yIO
    public V getValue(java.lang.Object obj, @NotNull yJA<?> yja) {
        Intrinsics.checkNotNullParameter(yja, "");
        return this.OLrzqt;
    }

    public yIL(V v) {
        this.OLrzqt = v;
    }

    @Override // o.yIP
    public void KWHzl(java.lang.Object obj, @NotNull yJA<?> yja, V v) {
        Intrinsics.checkNotNullParameter(yja, "");
        V v2 = this.OLrzqt;
        if (copydefault(yja, v2, v)) {
            this.OLrzqt = v;
            AEQbTJ(yja, v2, v);
        }
    }

    public java.lang.String toString() {
        return "ObservableProperty(value=" + this.OLrzqt + ')';
    }
}

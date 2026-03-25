package o;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yJX<V> extends yJM<V> {
    public volatile C56566yKc<V> AEQbTJ;

    public yJX(@NotNull Function1<? super java.lang.Class<?>, ? extends V> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = new C56566yKc<>(function1);
    }

    @Override // o.yJM
    public V KWHzl(@NotNull java.lang.Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        C56566yKc<V> c56566yKc = this.AEQbTJ;
        V v = (V) ((SoftReference) c56566yKc.get(cls)).get();
        if (v != null) {
            return v;
        }
        c56566yKc.remove(cls);
        V v2 = (V) ((SoftReference) c56566yKc.get(cls)).get();
        return v2 != null ? v2 : c56566yKc.AEQbTJ.invoke(cls);
    }
}

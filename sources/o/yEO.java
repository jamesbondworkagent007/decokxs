package o;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yEO<E extends Map.Entry<? extends K, ? extends V>, K, V> extends yDM<E> {
    public abstract boolean OLrzqt(@NotNull Map.Entry<? extends K, ? extends V> entry);

    public boolean KWHzl(Map.Entry<?, ?> entry) {
        return super.remove(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof Map.Entry) {
            return AEQbTJ((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        if (obj instanceof Map.Entry) {
            return KWHzl((Map.Entry) obj);
        }
        return false;
    }

    public final boolean AEQbTJ(@NotNull E e) {
        Intrinsics.checkNotNullParameter(e, "");
        return OLrzqt(e);
    }
}

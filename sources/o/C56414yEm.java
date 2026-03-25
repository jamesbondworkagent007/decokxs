package o;

import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yEm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56414yEm<T> implements java.util.Iterator<IndexedValue<? extends T>>, InterfaceC56535yIz {
    public int EZpvd;
    public final java.util.Iterator<T> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Iterator<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C56414yEm(@NotNull java.util.Iterator<? extends T> it) {
        Intrinsics.checkNotNullParameter(it, "");
        this.OLrzqt = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.OLrzqt.hasNext();
    }

    /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public final IndexedValue<T> next() {
        int i = this.EZpvd;
        this.EZpvd = i + 1;
        if (i < 0) {
            yDY.AYXKKw();
        }
        return new IndexedValue<>(i, this.OLrzqt.next());
    }
}

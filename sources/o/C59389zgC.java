package o;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zgC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59389zgC<T> implements Sequence<T> {
    public final AtomicReference<Sequence<T>> copydefault;

    public C59389zgC(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        this.copydefault = new AtomicReference<>(sequence);
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<T> iterator() {
        Sequence<T> andSet = this.copydefault.getAndSet(null);
        if (andSet == null) {
            throw new java.lang.IllegalStateException("This sequence can be consumed only once.");
        }
        return andSet.iterator();
    }
}

package o;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mpQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33063mpQ<T, V> implements yIO<T, V> {
    public final Function2<T, yJA<?>, V> EZpvd;
    public java.lang.Object KWHzl;

    /* JADX INFO: renamed from: o.mpQ$TaskDescription */
    public static final class TaskDescription {
        public static final TaskDescription AEQbTJ = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super T, ? super o.yJA<?>, ? extends V> */
    /* JADX WARN: Multi-variable type inference failed */
    public C33063mpQ(@NotNull Function2<? super T, ? super yJA<?>, ? extends V> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.EZpvd = function2;
        this.KWHzl = TaskDescription.AEQbTJ;
    }

    @Override // o.yIO
    public V getValue(T t, @NotNull yJA<?> yja) {
        Intrinsics.checkNotNullParameter(yja, "");
        if (Intrinsics.EZpvd(this.KWHzl, TaskDescription.AEQbTJ)) {
            this.KWHzl = this.EZpvd.invoke(t, yja);
        }
        return (V) this.KWHzl;
    }
}

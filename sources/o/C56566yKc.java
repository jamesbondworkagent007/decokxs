package o;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yKc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56566yKc<V> extends ClassValue<SoftReference<V>> {
    public final Function1<java.lang.Class<?>, V> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Class<?>, ? extends V> */
    /* JADX WARN: Multi-variable type inference failed */
    public C56566yKc(@NotNull Function1<? super java.lang.Class<?>, ? extends V> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: computeValue(Ljava/lang/Class;)Ljava/lang/Object; */
    @Override // java.lang.ClassValue
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public SoftReference<V> computeValue(@NotNull java.lang.Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        return new SoftReference<>(this.AEQbTJ.invoke(cls));
    }
}

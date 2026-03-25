package o;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yKe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56568yKe<V> extends yJM<V> {
    public final ConcurrentHashMap<java.lang.Class<?>, V> OLrzqt;
    public final Function1<java.lang.Class<?>, V> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Class<?>, ? extends V> */
    /* JADX WARN: Multi-variable type inference failed */
    public C56568yKe(@NotNull Function1<? super java.lang.Class<?>, ? extends V> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
        this.OLrzqt = new ConcurrentHashMap<>();
    }

    @Override // o.yJM
    public V KWHzl(@NotNull java.lang.Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        ConcurrentHashMap<java.lang.Class<?>, V> concurrentHashMap = this.OLrzqt;
        V v = (V) concurrentHashMap.get(cls);
        if (v != null) {
            return v;
        }
        V vInvoke = this.copydefault.invoke(cls);
        V v2 = (V) concurrentHashMap.putIfAbsent(cls, vInvoke);
        return v2 == null ? vInvoke : v2;
    }
}

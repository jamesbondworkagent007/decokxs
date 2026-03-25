package o;

import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yEp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56417yEp<T> implements java.lang.Iterable<IndexedValue<? extends T>>, InterfaceC56535yIz {
    public final Function0<java.util.Iterator<T>> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function0<? extends java.util.Iterator<? extends T>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C56417yEp(@NotNull Function0<? extends java.util.Iterator<? extends T>> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = function0;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<IndexedValue<T>> iterator() {
        return new C56414yEm(this.OLrzqt.invoke());
    }
}

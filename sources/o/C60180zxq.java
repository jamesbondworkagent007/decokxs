package o;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.InternalException;

/* JADX INFO: renamed from: o.zxq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60180zxq<T> {
    public static final int $stable = 8;
    public final ConcurrentHashMap<java.lang.Long, T> KWHzl = new ConcurrentHashMap<>();
    public final AtomicLong OLrzqt = new AtomicLong(1);

    public final int EZpvd() {
        return this.KWHzl.size();
    }

    public final long EZpvd(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        long andAdd = this.OLrzqt.getAndAdd(2L);
        this.KWHzl.put(java.lang.Long.valueOf(andAdd), t);
        return andAdd;
    }

    public final long OLrzqt(long j) throws InternalException {
        T t = this.KWHzl.get(java.lang.Long.valueOf(j));
        if (t == null) {
            throw new InternalException("UniffiHandleMap.clone: Invalid handle");
        }
        return EZpvd(t);
    }

    public final T copydefault(long j) throws InternalException {
        T t = this.KWHzl.get(java.lang.Long.valueOf(j));
        if (t != null) {
            return t;
        }
        throw new InternalException("UniffiHandleMap.get: Invalid handle");
    }

    public final T AEQbTJ(long j) throws InternalException {
        T tRemove = this.KWHzl.remove(java.lang.Long.valueOf(j));
        if (tRemove != null) {
            return tRemove;
        }
        throw new InternalException("UniffiHandleMap: Invalid handle");
    }
}

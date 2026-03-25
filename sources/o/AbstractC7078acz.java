package o;

import com.ibm.icu.impl.CacheValue;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: o.acz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7078acz<K, V, D> extends AbstractC7013abN<K, V, D> {
    public ConcurrentHashMap<K, java.lang.Object> copydefault = new ConcurrentHashMap<>();

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC7013abN
    public final V AEQbTJ(K k, D d) {
        V v = (V) this.copydefault.get(k);
        if (v != 0) {
            if (!(v instanceof CacheValue)) {
                return v;
            }
            CacheValue cacheValue = (CacheValue) v;
            if (cacheValue.KWHzl()) {
                return null;
            }
            V v2 = (V) cacheValue.AEQbTJ();
            return v2 != null ? v2 : (V) cacheValue.KWHzl(copydefault(k, d));
        }
        V vCopydefault = copydefault(k, d);
        V v3 = (V) this.copydefault.putIfAbsent(k, (vCopydefault == null || !CacheValue.copydefault()) ? CacheValue.EZpvd(vCopydefault) : vCopydefault);
        return v3 == 0 ? vCopydefault : !(v3 instanceof CacheValue) ? v3 : (V) ((CacheValue) v3).KWHzl(vCopydefault);
    }
}

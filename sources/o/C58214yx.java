package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.yx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C58214yx<K, V> implements Map.Entry<K, V>, InterfaceC56535yIz {
    public final K AEQbTJ;
    public final V KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.yx */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C58214yx copy$default(C58214yx c58214yx, java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3) {
        if ((i & 1) != 0) {
            obj = c58214yx.AEQbTJ;
        }
        if ((i & 2) != 0) {
            obj2 = c58214yx.KWHzl;
        }
        return c58214yx.EZpvd(obj, obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58214yx<K, V> EZpvd(K k, V v) {
        return new C58214yx<>(k, v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58214yx)) {
            return false;
        }
        C58214yx c58214yx = (C58214yx) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c58214yx.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c58214yx.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map.Entry
    public K getKey() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map.Entry
    public V getValue() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map.Entry
    public int hashCode() {
        K k = this.AEQbTJ;
        int iHashCode = k == null ? 0 : k.hashCode();
        V v = this.KWHzl;
        return (iHashCode * 31) + (v != null ? v.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Entry(key=" + this.AEQbTJ + ", value=" + this.KWHzl + ')';
    }

    public C58214yx(K k, V v) {
        this.AEQbTJ = k;
        this.KWHzl = v;
    }
}

package o;

import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yDD<K, V> implements java.util.Map<K, V>, InterfaceC56535yIz {
    public static final ActionBar Companion = new ActionBar(null);
    private volatile java.util.Set<? extends K> _keys;
    private volatile java.util.Collection<? extends V> _values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract java.util.Set getEntries();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public V put(K k, V v) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public V remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.util.Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final java.util.Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final java.util.Collection<V> values() {
        return getValues();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return implFindEntry(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        java.util.Set<Map.Entry<K, V>> setEntrySet = entrySet();
        if (!(setEntrySet instanceof java.util.Collection) || !setEntrySet.isEmpty()) {
            java.util.Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd(((Map.Entry) it.next()).getValue(), obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean containsEntry$kotlin_stdlib(Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        java.lang.Object key = entry.getKey();
        java.lang.Object value = entry.getValue();
        Intrinsics.copydefault(this, "");
        V v = get(key);
        if (!Intrinsics.EZpvd(value, v)) {
            return false;
        }
        if (v != null) {
            return true;
        }
        Intrinsics.copydefault(this, "");
        return containsKey(key);
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        if (size() != map.size()) {
            return false;
        }
        java.util.Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof java.util.Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!containsEntry$kotlin_stdlib((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(java.lang.Object obj) {
        Map.Entry<K, V> entryImplFindEntry = implFindEntry(obj);
        if (entryImplFindEntry != null) {
            return entryImplFindEntry.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public int getSize() {
        return entrySet().size();
    }

    public static final class StateListAnimator extends yDI<K> {
        public final /* synthetic */ yDD<K, V> AEQbTJ;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yDD<K, ? extends V> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(yDD<K, ? extends V> ydd) {
            this.AEQbTJ = ydd;
        }

        @Override // o.AbstractC56400yDz, java.util.Collection, java.util.List
        public boolean contains(java.lang.Object obj) {
            return this.AEQbTJ.containsKey(obj);
        }

        public static final class ActionBar implements java.util.Iterator<K>, InterfaceC56535yIz {
            public final /* synthetic */ java.util.Iterator<Map.Entry<K, V>> OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.Iterator
            public void remove() {
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Iterator<? extends java.util.Map$Entry<? extends K, ? extends V>> */
            /* JADX WARN: Multi-variable type inference failed */
            public ActionBar(java.util.Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.OLrzqt = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.OLrzqt.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return this.OLrzqt.next().getKey();
            }
        }

        @Override // o.yDI, o.AbstractC56400yDz, java.util.Collection, java.lang.Iterable, java.util.List
        public java.util.Iterator<K> iterator() {
            return new ActionBar(this.AEQbTJ.entrySet().iterator());
        }

        @Override // o.AbstractC56400yDz
        public int getSize() {
            return this.AEQbTJ.size();
        }
    }

    public java.util.Set<K> getKeys() {
        if (this._keys == null) {
            this._keys = new StateListAnimator(this);
        }
        java.util.Set<? extends K> set = this._keys;
        Intrinsics.copydefault(set);
        return set;
    }

    public static final java.lang.CharSequence toString$lambda$2(yDD ydd, Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        return ydd.toString(entry);
    }

    public java.lang.String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(entrySet(), ", ", "{", "}", 0, null, new Function1() { // from class: o.yDE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return yDD.toString$lambda$2(this.copydefault, (Map.Entry) obj);
            }
        }, 24, null);
    }

    public final java.lang.String toString(Map.Entry<? extends K, ? extends V> entry) {
        return toString(entry.getKey()) + '=' + toString(entry.getValue());
    }

    public final java.lang.String toString(java.lang.Object obj) {
        return obj == this ? "(this Map)" : java.lang.String.valueOf(obj);
    }

    public static final class Application extends AbstractC56400yDz<V> {
        public final /* synthetic */ yDD<K, V> AEQbTJ;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yDD<K, ? extends V> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(yDD<K, ? extends V> ydd) {
            this.AEQbTJ = ydd;
        }

        @Override // o.AbstractC56400yDz, java.util.Collection, java.util.List
        public boolean contains(java.lang.Object obj) {
            return this.AEQbTJ.containsValue(obj);
        }

        public static final class TaskDescription implements java.util.Iterator<V>, InterfaceC56535yIz {
            public final /* synthetic */ java.util.Iterator<Map.Entry<K, V>> KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.Iterator
            public void remove() {
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Iterator<? extends java.util.Map$Entry<? extends K, ? extends V>> */
            /* JADX WARN: Multi-variable type inference failed */
            public TaskDescription(java.util.Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.KWHzl = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.KWHzl.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return this.KWHzl.next().getValue();
            }
        }

        @Override // o.AbstractC56400yDz, java.util.Collection, java.lang.Iterable, java.util.List
        public java.util.Iterator<V> iterator() {
            return new TaskDescription(this.AEQbTJ.entrySet().iterator());
        }

        @Override // o.AbstractC56400yDz
        public int getSize() {
            return this.AEQbTJ.size();
        }
    }

    public java.util.Collection<V> getValues() {
        if (this._values == null) {
            this._values = new Application(this);
        }
        java.util.Collection<? extends V> collection = this._values;
        Intrinsics.copydefault(collection);
        return collection;
    }

    public final Map.Entry<K, V> implFindEntry(K k) {
        java.lang.Object next;
        java.util.Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd(((Map.Entry) next).getKey(), k)) {
                break;
            }
        }
        return (Map.Entry) next;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yDD.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}

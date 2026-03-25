package o;

import androidx.collection.SimpleArrayMap;

/* JADX INFO: loaded from: classes2.dex */
public final class SB<K, V> extends androidx.collection.ArrayMap<K, V> {
    public int AEQbTJ;

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public void clear() {
        this.AEQbTJ = 0;
        super.clear();
    }

    @Override // androidx.collection.SimpleArrayMap
    public V setValueAt(int i, V v) {
        this.AEQbTJ = 0;
        return (V) super.setValueAt(i, v);
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V put(K k, V v) {
        this.AEQbTJ = 0;
        return (V) super.put(k, v);
    }

    @Override // androidx.collection.SimpleArrayMap
    public void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this.AEQbTJ = 0;
        super.putAll(simpleArrayMap);
    }

    @Override // androidx.collection.SimpleArrayMap
    public V removeAt(int i) {
        this.AEQbTJ = 0;
        return (V) super.removeAt(i);
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public int hashCode() {
        if (this.AEQbTJ == 0) {
            this.AEQbTJ = super.hashCode();
        }
        return this.AEQbTJ;
    }
}

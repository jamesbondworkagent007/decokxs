package o;

import java.util.Map;

/* JADX INFO: renamed from: o.aYK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6909aYK implements InterfaceC6911aYM {
    public java.util.Map<java.lang.String, java.lang.String> KWHzl = new androidx.collection.ArrayMap();

    public C6909aYK() {
    }

    public C6909aYK(java.util.Map<java.lang.String, java.lang.String> map) {
        putAll(map);
    }

    @Override // java.util.Map
    public int size() {
        return this.KWHzl.size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.KWHzl.isEmpty();
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.KWHzl.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        return this.KWHzl.containsValue(obj);
    }

    /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.String get(java.lang.Object obj) {
        return this.KWHzl.get(obj);
    }

    /* JADX DEBUG: Method merged with bridge method: put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.String put(java.lang.String str, java.lang.String str2) {
        return this.KWHzl.put(str, str2);
    }

    /* JADX DEBUG: Method merged with bridge method: remove(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.lang.String remove(java.lang.Object obj) {
        return this.KWHzl.remove(obj);
    }

    @Override // java.util.Map
    public void putAll(@androidx.annotation.NonNull java.util.Map<? extends java.lang.String, ? extends java.lang.String> map) {
        this.KWHzl.putAll(map);
    }

    @Override // java.util.Map
    public void clear() {
        this.KWHzl.clear();
    }

    @Override // java.util.Map
    public java.util.Set<java.lang.String> keySet() {
        return this.KWHzl.keySet();
    }

    @Override // java.util.Map
    public java.util.Collection<java.lang.String> values() {
        return this.KWHzl.values();
    }

    @Override // java.util.Map
    public java.util.Set<Map.Entry<java.lang.String, java.lang.String>> entrySet() {
        return this.KWHzl.entrySet();
    }

    @Override // o.InterfaceC6910aYL
    public java.lang.String format() {
        return C6946aYv.KWHzl(this);
    }
}

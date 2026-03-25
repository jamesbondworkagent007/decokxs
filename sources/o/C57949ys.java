package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.yIG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C57949ys<Value> implements java.util.Map<java.lang.String, Value>, yIG {
    public final java.util.Map<C58161yw, Value> KWHzl = new LinkedHashMap();

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return EZpvd((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final java.util.Set<Map.Entry<java.lang.String, Value>> entrySet() {
        return EZpvd();
    }

    @Override // java.util.Map
    public final Value get(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return OLrzqt((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final java.util.Set<java.lang.String> keySet() {
        return OLrzqt();
    }

    @Override // java.util.Map
    public final Value remove(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return copydefault((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return AEQbTJ();
    }

    @Override // java.util.Map
    public final java.util.Collection<Value> values() {
        return copydefault();
    }

    public int AEQbTJ() {
        return this.KWHzl.size();
    }

    public boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.containsKey(C58055yu.copydefault(str));
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        return this.KWHzl.containsValue(obj);
    }

    public Value OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.get(C58055yu.copydefault(str));
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.KWHzl.isEmpty();
    }

    public java.util.Set<Map.Entry<java.lang.String, Value>> EZpvd() {
        java.util.Set<Map.Entry<C58161yw, Value>> setEntrySet = this.KWHzl.entrySet();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(setEntrySet, 10));
        java.util.Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new StateListAnimator(((C58161yw) entry.getKey()).copydefault(), entry.getValue()));
        }
        return CollectionsKt___CollectionsKt.DXXBbs(arrayList);
    }

    public java.util.Set<java.lang.String> OLrzqt() {
        java.util.Set<C58161yw> setKeySet = this.KWHzl.keySet();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(setKeySet, 10));
        java.util.Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((C58161yw) it.next()).copydefault());
        }
        return CollectionsKt___CollectionsKt.DXXBbs(arrayList);
    }

    public java.util.Collection<Value> copydefault() {
        return this.KWHzl.values();
    }

    @Override // java.util.Map
    public void clear() {
        this.KWHzl.clear();
    }

    /* JADX DEBUG: Method merged with bridge method: put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public Value put(@NotNull java.lang.String str, Value value) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.put(C58055yu.copydefault(str), value);
    }

    @Override // java.util.Map
    public void putAll(@NotNull java.util.Map<? extends java.lang.String, ? extends Value> map) {
        Intrinsics.checkNotNullParameter(map, "");
        for (Map.Entry<? extends java.lang.String, ? extends Value> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Value copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.remove(C58055yu.copydefault(str));
    }

    /* JADX INFO: renamed from: o.ys$StateListAnimator */
    public static final class StateListAnimator<Key, Value> implements Map.Entry<Key, Value>, yIG.Activity {
        public Value AEQbTJ;
        public final Key EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void EZpvd(Value value) {
            this.AEQbTJ = value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Map.Entry
        public Key getKey() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Map.Entry
        public Value getValue() {
            return this.AEQbTJ;
        }

        public StateListAnimator(Key key, Value value) {
            this.EZpvd = key;
            this.AEQbTJ = value;
        }

        @Override // java.util.Map.Entry
        public Value setValue(Value value) {
            EZpvd(value);
            return getValue();
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Key key = getKey();
            Intrinsics.copydefault(key);
            int iHashCode = key.hashCode();
            Value value = getValue();
            Intrinsics.copydefault(value);
            return iHashCode + 527 + value.hashCode();
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object obj) {
            if (obj != null && (obj instanceof Map.Entry)) {
                Map.Entry entry = (Map.Entry) obj;
                if (Intrinsics.EZpvd(entry.getKey(), getKey()) && Intrinsics.EZpvd(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:Key:INVOKE), 61, (wrap:Value:INVOKE) */
        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }
}

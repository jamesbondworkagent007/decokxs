package com.reown.android.internal.utils;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yIG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableMap<K, V> implements Map<K, V>, yIG {
    public final Map<K, V> map;
    public final Function1<Map<K, ? extends V>, Unit> onChange;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public void clear() {
        this.map.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.map.containsValue(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public V get(Object obj) {
        return this.map.get(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Set<Map.Entry<K, V>> getEntries() {
        return this.map.entrySet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Set<K> getKeys() {
        return this.map.keySet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getSize() {
        return this.map.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Collection<V> getValues() {
        return this.map.values();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.Map<K, ? extends V>, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ObservableMap(@NotNull Map<K, V> map, @NotNull Function1<? super Map<K, ? extends V>, Unit> function1) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.map = map;
        this.onChange = function1;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return getValues();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:4) call: java.util.LinkedHashMap.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.Map))
  (r2v0 kotlin.jvm.functions.Function1)
 A[MD:(java.util.Map<K, V>, kotlin.jvm.functions.Function1<? super java.util.Map<K, ? extends V>, kotlin.Unit>):void (m)] (LINE:3) call: com.reown.android.internal.utils.ObservableMap.<init>(java.util.Map, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ ObservableMap(Map map, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map, function1);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Map
    public V put(K k, V v) {
        V vPut = this.map.put(k, v);
        this.onChange.invoke((Map<K, ? extends V>) this.map);
        return vPut;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Map
    public V remove(Object obj) {
        V vRemove = this.map.remove(obj);
        this.onChange.invoke((Map<K, ? extends V>) this.map);
        return vRemove;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.map.putAll(map);
        Unit unit = Unit.INSTANCE;
        this.onChange.invoke((Map<K, ? extends V>) this.map);
    }
}

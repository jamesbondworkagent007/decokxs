package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.IO;
import o.IR;
import o.IS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class IR<K, V> implements java.util.Map<K, V>, yIG {
    public final java.lang.Object AEQbTJ;
    public final java.util.Map<K, V> copydefault;

    @Override // java.util.Map
    public final java.util.Set<Map.Entry<K, V>> entrySet() {
        return copydefault();
    }

    @Override // java.util.Map
    public final java.util.Set<K> keySet() {
        return EZpvd();
    }

    @Override // java.util.Map
    public final int size() {
        return OLrzqt();
    }

    @Override // java.util.Map
    public final java.util.Collection<V> values() {
        return KWHzl();
    }

    public IR(java.lang.Object obj, @NotNull java.util.Map<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.copydefault = map;
        this.AEQbTJ = obj == null ? this : obj;
    }

    public IR() {
        this(null, new LinkedHashMap());
    }

    public int OLrzqt() {
        java.lang.Integer numInvoke;
        java.lang.Object obj = this.AEQbTJ;
        Function0<java.lang.Integer> function0 = new Function0<java.lang.Integer>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap$size$1
            final /* synthetic */ IR<K, V> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(this.this$0.copydefault.size());
            }
        };
        synchronized (obj) {
            numInvoke = function0.invoke();
        }
        return numInvoke.intValue();
    }

    public java.util.Set<Map.Entry<K, V>> copydefault() {
        IS<Map.Entry<K, V>> isInvoke;
        java.lang.Object obj = this.AEQbTJ;
        Function0<IS<Map.Entry<K, V>>> function0 = new Function0<IS<Map.Entry<K, V>>>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap$entries$1
            final /* synthetic */ IR<K, V> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final IS<Map.Entry<K, V>> invoke() {
                IR<K, V> ir = this.this$0;
                return new IS<>(ir, ir.copydefault.entrySet());
            }
        };
        synchronized (obj) {
            isInvoke = function0.invoke();
        }
        return isInvoke;
    }

    public java.util.Set<K> EZpvd() {
        IS<K> isInvoke;
        java.lang.Object obj = this.AEQbTJ;
        Function0<IS<K>> function0 = new Function0<IS<K>>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap$keys$1
            final /* synthetic */ IR<K, V> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final IS<K> invoke() {
                IR<K, V> ir = this.this$0;
                return new IS<>(ir, ir.copydefault.keySet());
            }
        };
        synchronized (obj) {
            isInvoke = function0.invoke();
        }
        return isInvoke;
    }

    public java.util.Collection<V> KWHzl() {
        IO<V> ioInvoke;
        java.lang.Object obj = this.AEQbTJ;
        Function0<IO<V>> function0 = new Function0<IO<V>>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap$values$1
            final /* synthetic */ IR<K, V> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final IO<V> invoke() {
                IR<K, V> ir = this.this$0;
                return new IO<>(ir, ir.copydefault.values());
            }
        };
        synchronized (obj) {
            ioInvoke = function0.invoke();
        }
        return ioInvoke;
    }

    @Override // java.util.Map
    public boolean containsKey(final java.lang.Object obj) {
        java.lang.Boolean boolInvoke;
        java.lang.Object obj2 = this.AEQbTJ;
        Function0<java.lang.Boolean> function0 = new Function0<java.lang.Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap$containsKey$1
            final /* synthetic */ IR<K, V> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.copydefault.containsKey(obj));
            }
        };
        synchronized (obj2) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.Map
    public boolean containsValue(final java.lang.Object obj) {
        java.lang.Boolean boolInvoke;
        java.lang.Object obj2 = this.AEQbTJ;
        Function0<java.lang.Boolean> function0 = new Function0<java.lang.Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap$containsValue$1
            final /* synthetic */ IR<K, V> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.copydefault.containsValue(obj));
            }
        };
        synchronized (obj2) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.Map
    public V get(final java.lang.Object obj) {
        V vInvoke;
        java.lang.Object obj2 = this.AEQbTJ;
        Function0<V> function0 = new Function0<V>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap$get$1
            final /* synthetic */ IR<K, V> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final V invoke() {
                return (V) this.this$0.copydefault.get(obj);
            }
        };
        synchronized (obj2) {
            vInvoke = function0.invoke();
        }
        return vInvoke;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        java.lang.Boolean boolInvoke;
        java.lang.Object obj = this.AEQbTJ;
        Function0<java.lang.Boolean> function0 = new Function0<java.lang.Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap$isEmpty$1
            final /* synthetic */ IR<K, V> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.copydefault.isEmpty());
            }
        };
        synchronized (obj) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.Map
    public void clear() {
        java.lang.Object obj = this.AEQbTJ;
        Function0<Unit> function0 = new Function0<Unit>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap$clear$1
            final /* synthetic */ IR<K, V> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.copydefault.clear();
            }
        };
        synchronized (obj) {
            function0.invoke();
        }
    }

    @Override // java.util.Map
    public V put(final K k, final V v) {
        V vInvoke;
        java.lang.Object obj = this.AEQbTJ;
        Function0<V> function0 = new Function0<V>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap$put$1
            final /* synthetic */ IR<K, V> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final V invoke() {
                return (V) this.this$0.copydefault.put(k, v);
            }
        };
        synchronized (obj) {
            vInvoke = function0.invoke();
        }
        return vInvoke;
    }

    @Override // java.util.Map
    public void putAll(@NotNull final java.util.Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj = this.AEQbTJ;
        Function0<Unit> function0 = new Function0<Unit>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap$putAll$1
            final /* synthetic */ IR<K, V> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<? extends K, ? extends V> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.copydefault.putAll(map);
            }
        };
        synchronized (obj) {
            function0.invoke();
        }
    }

    @Override // java.util.Map
    public V remove(final java.lang.Object obj) {
        V vInvoke;
        java.lang.Object obj2 = this.AEQbTJ;
        Function0<V> function0 = new Function0<V>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap$remove$1
            final /* synthetic */ IR<K, V> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final V invoke() {
                return (V) this.this$0.copydefault.remove(obj);
            }
        };
        synchronized (obj2) {
            vInvoke = function0.invoke();
        }
        return vInvoke;
    }
}

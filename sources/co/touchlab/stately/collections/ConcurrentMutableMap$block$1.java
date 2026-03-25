package co.touchlab.stately.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o.IR;
import o.IT;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes21.dex */
public final class ConcurrentMutableMap$block$1<R> extends Lambda implements Function0<R> {
    final /* synthetic */ Function1<Map<K, V>, R> $f;
    final /* synthetic */ IR<K, V> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.Map<K, V>, ? extends R> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConcurrentMutableMap$block$1(IR<K, V> ir, Function1<? super Map<K, V>, ? extends R> function1) {
        super(0);
        this.this$0 = ir;
        this.$f = function1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function0
    public final R invoke() {
        IT it = new IT(this.this$0.copydefault);
        R rInvoke = this.$f.invoke(it);
        it.EZpvd(new LinkedHashMap());
        return rInvoke;
    }
}

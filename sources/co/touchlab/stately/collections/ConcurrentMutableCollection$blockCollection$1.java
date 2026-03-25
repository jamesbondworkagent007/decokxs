package co.touchlab.stately.collections;

import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o.IO;
import o.IU;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes2.dex */
public final class ConcurrentMutableCollection$blockCollection$1<R> extends Lambda implements Function0<R> {
    final /* synthetic */ Function1<Collection<E>, R> $f;
    final /* synthetic */ IO<E> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.Collection<E>, ? extends R> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConcurrentMutableCollection$blockCollection$1(IO<E> io2, Function1<? super Collection<E>, ? extends R> function1) {
        super(0);
        this.this$0 = io2;
        this.$f = function1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function0
    public final R invoke() {
        IU iu = new IU(this.this$0.EZpvd);
        R rInvoke = this.$f.invoke(iu);
        iu.EZpvd(null);
        return rInvoke;
    }
}

package co.touchlab.stately.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o.IS;
import o.IY;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes2.dex */
public final class ConcurrentMutableSet$block$1<R> extends Lambda implements Function0<R> {
    final /* synthetic */ Function1<Set<E>, R> $f;
    final /* synthetic */ IS<E> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.Set<E>, ? extends R> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConcurrentMutableSet$block$1(IS<E> is, Function1<? super Set<E>, ? extends R> function1) {
        super(0);
        this.this$0 = is;
        this.$f = function1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function0
    public final R invoke() {
        IY iy = new IY(this.this$0.copydefault);
        R rInvoke = this.$f.invoke(iy);
        iy.KWHzl(new LinkedHashSet());
        return rInvoke;
    }
}

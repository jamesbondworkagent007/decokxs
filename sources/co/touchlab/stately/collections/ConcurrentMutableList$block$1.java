package co.touchlab.stately.collections;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o.IP;
import o.IQ;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes2.dex */
public final class ConcurrentMutableList$block$1<R> extends Lambda implements Function0<R> {
    final /* synthetic */ Function1<List<E>, R> $f;
    final /* synthetic */ IP<E> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.List<E>, ? extends R> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConcurrentMutableList$block$1(IP<E> ip, Function1<? super List<E>, ? extends R> function1) {
        super(0);
        this.this$0 = ip;
        this.$f = function1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function0
    public final R invoke() {
        IQ iq = new IQ(this.this$0.AEQbTJ);
        R rInvoke = this.$f.invoke(iq);
        iq.AEQbTJ(new ArrayList());
        return rInvoke;
    }
}

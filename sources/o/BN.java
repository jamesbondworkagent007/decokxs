package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BN<Output> implements CG<BP<C5036Cg>, Output> {
    public final CG<BP<C5036Cg>, Output> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.CG<? super o.BP<o.Cg>, ? extends Output> */
    /* JADX WARN: Multi-variable type inference failed */
    public BN(@NotNull CG<? super BP<C5036Cg>, ? extends Output> cg) {
        Intrinsics.checkNotNullParameter(cg, "");
        this.AEQbTJ = cg;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.CG
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object OLrzqt(@NotNull BP<C5036Cg> bp, @NotNull Continuation<? super Output> continuation) {
        return this.AEQbTJ.OLrzqt(bp, continuation);
    }
}

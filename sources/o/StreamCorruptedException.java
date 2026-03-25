package o;

import aws.smithy.kotlin.runtime.io.middleware.Phase;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class StreamCorruptedException<O> implements BM<O> {
    public java.lang.Integer AEQbTJ;
    public int KWHzl;

    @Override // o.BM
    public void OLrzqt(@NotNull BY<?, O> by) {
        Intrinsics.checkNotNullParameter(by, "");
        this.AEQbTJ = java.lang.Integer.valueOf(by.copydefault().valueOf().copydefault().EZpvd());
        Phase.register$default(by.copydefault().KWHzl(), this, (Phase.Order) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lo/CG;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC5075Dt
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public <H extends CG<? super BP<C5036Cg>, ? extends O>> java.lang.Object EZpvd(@NotNull BP<C5036Cg> bp, @NotNull H h, @NotNull Continuation<? super O> continuation) {
        this.KWHzl++;
        C5034Ce.EZpvd(bp.EZpvd(), "amz-sdk-invocation-id", C5030Ca.OLrzqt(bp.OLrzqt()));
        EZpvd(bp, this.KWHzl);
        return h.OLrzqt(bp, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(BP<C5036Cg> bp, int i) {
        java.lang.String str;
        java.lang.Integer num = this.AEQbTJ;
        if (num != null) {
            str = "; max=" + num.intValue();
            if (str == null) {
                str = "";
            }
        }
        C5034Ce.EZpvd(bp.EZpvd(), "amz-sdk-request", "attempt=" + i + str);
    }
}

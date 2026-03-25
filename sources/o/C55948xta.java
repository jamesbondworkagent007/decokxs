package o;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55948xta implements InterfaceC54501xKt<C55804xqp<TickersData>, java.lang.String> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.String KWHzl(@NotNull C55804xqp<TickersData> c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        return c55804xqp.copydefault().getLast();
    }
}

package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yZc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56971yZc extends AbstractC56975yZg<java.util.List<? extends AbstractC56975yZg<?>>> {
    public final Function1<yNP, AbstractC59233zdF> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.yNP, ? extends o.zdF> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C56971yZc(@NotNull java.util.List<? extends AbstractC56975yZg<?>> list, @NotNull Function1<? super yNP, ? extends AbstractC59233zdF> function1) {
        super(list);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    @Override // o.AbstractC56975yZg
    public AbstractC59233zdF OLrzqt(@NotNull yNP ynp) {
        Intrinsics.checkNotNullParameter(ynp, "");
        AbstractC59233zdF abstractC59233zdFInvoke = this.KWHzl.invoke(ynp);
        if (!AbstractC56640yMw.OLrzqt(abstractC59233zdFInvoke) && !AbstractC56640yMw.AYXKKw(abstractC59233zdFInvoke)) {
            AbstractC56640yMw.AuCTel(abstractC59233zdFInvoke);
        }
        return abstractC59233zdFInvoke;
    }
}

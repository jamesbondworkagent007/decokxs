package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ztJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59981ztJ<T> extends AbstractC59982ztK<T> {
    @Override // o.AbstractC59982ztK
    public boolean OLrzqt(C59985ztN c59985ztN) {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59981ztJ(@NotNull C59978ztG<T> c59978ztG) {
        super(c59978ztG);
        Intrinsics.checkNotNullParameter(c59978ztG, "");
    }

    @Override // o.AbstractC59982ztK
    public void copydefault(C60060zuj c60060zuj) {
        Function1<T, Unit> function1EZpvd = OLrzqt().KWHzl().EZpvd();
        if (function1EZpvd != null) {
            function1EZpvd.invoke(null);
        }
    }

    @Override // o.AbstractC59982ztK
    public T AEQbTJ(@NotNull C59985ztN c59985ztN) {
        Intrinsics.checkNotNullParameter(c59985ztN, "");
        return KWHzl(c59985ztN);
    }
}

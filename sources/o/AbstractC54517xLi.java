package o;

import io.reactivex.BackpressureStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xLi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC54517xLi {
    public abstract void copydefault(Function1<? super java.lang.Boolean, Unit> function1);

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xLi */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void init$default(AbstractC54517xLi abstractC54517xLi, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
        }
        if ((i & 1) != 0) {
            function1 = null;
        }
        abstractC54517xLi.copydefault(function1);
    }

    public final <T> AbstractC58185ywX<T> EZpvd(@NotNull InterfaceC58187ywZ<T> interfaceC58187ywZ) {
        Intrinsics.checkNotNullParameter(interfaceC58187ywZ, "");
        AbstractC58185ywX<T> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(interfaceC58187ywZ, BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public final <T> AbstractC58185ywX<T> OLrzqt(@NotNull InterfaceC58187ywZ<T> interfaceC58187ywZ) {
        Intrinsics.checkNotNullParameter(interfaceC58187ywZ, "");
        AbstractC58185ywX<T> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(interfaceC58187ywZ, BackpressureStrategy.BUFFER).copydefault(C58266yxz.OLrzqt()).KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }
}

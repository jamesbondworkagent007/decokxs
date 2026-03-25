package o;

import io.reactivex.BackpressureStrategy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class gIZ {
    public static final <T> AbstractC58185ywX<T> EZpvd(@NotNull InterfaceC58187ywZ<T> interfaceC58187ywZ) {
        Intrinsics.checkNotNullParameter(interfaceC58187ywZ, "");
        AbstractC58185ywX<T> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(interfaceC58187ywZ, BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }
}

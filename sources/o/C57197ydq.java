package o;

import io.reactivex.BackpressureStrategy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ydq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57197ydq {
    public static final <T> AbstractC58185ywX<T> KWHzl(@NotNull InterfaceC58187ywZ<T> interfaceC58187ywZ) {
        Intrinsics.checkNotNullParameter(interfaceC58187ywZ, "");
        AbstractC58185ywX<T> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(interfaceC58187ywZ, BackpressureStrategy.BUFFER).copydefault(C58266yxz.OLrzqt()).KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }
}

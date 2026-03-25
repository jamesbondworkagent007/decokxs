package o;

import androidx.lifecycle.Lifecycle;
import io.reactivex.BackpressureStrategy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xUR {
    public static final <T> AbstractC58185ywX<T> KWHzl(@NotNull InterfaceC58187ywZ<T> interfaceC58187ywZ) {
        Intrinsics.checkNotNullParameter(interfaceC58187ywZ, "");
        AbstractC58185ywX<T> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(interfaceC58187ywZ, BackpressureStrategy.BUFFER).copydefault(C58266yxz.OLrzqt()).KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static /* synthetic */ AbstractC58185ywX bindToLifecycle$default(AbstractC58185ywX abstractC58185ywX, InterfaceC58151yvq interfaceC58151yvq, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC58151yvq = null;
        }
        return OLrzqt(abstractC58185ywX, interfaceC58151yvq);
    }

    public static final <T> AbstractC58185ywX<T> OLrzqt(@NotNull AbstractC58185ywX<T> abstractC58185ywX, InterfaceC58151yvq<Lifecycle.Event> interfaceC58151yvq) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        if (interfaceC58151yvq == null) {
            return abstractC58185ywX;
        }
        AbstractC58185ywX<T> abstractC58185ywX2 = (AbstractC58185ywX<T>) abstractC58185ywX.EZpvd(interfaceC58151yvq.EZpvd());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywX2, "");
        return abstractC58185ywX2;
    }
}

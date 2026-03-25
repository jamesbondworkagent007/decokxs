package o;

import com.okinc.business.invest_biz.data.contants.PoolProtocolType;
import com.okinc.business.invest_biz.data.contants.ProductType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iFf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23677iFf {
    public static final boolean OLrzqt(@NotNull C23673iFb c23673iFb) {
        Intrinsics.checkNotNullParameter(c23673iFb, "");
        return c23673iFb.EZpvd().AYXKKw() == ProductType.Farm && c23673iFb.EZpvd().djBIcL() == PoolProtocolType.V3;
    }

    public static final boolean KWHzl(@NotNull C23673iFb c23673iFb) {
        Intrinsics.checkNotNullParameter(c23673iFb, "");
        return c23673iFb.EZpvd().djBIcL() == PoolProtocolType.V3;
    }
}

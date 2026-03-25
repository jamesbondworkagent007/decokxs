package o;

import com.okinc.business.invest_biz.data.bean.response.HealthRate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iEa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23645iEa {
    @yCM
    public C23645iEa() {
    }

    public final iEJ KWHzl(@NotNull HealthRate healthRate) {
        Intrinsics.checkNotNullParameter(healthRate, "");
        return new iEJ(healthRate.copydefault(), healthRate.KWHzl());
    }
}

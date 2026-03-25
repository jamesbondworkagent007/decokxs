package o;

import com.okinc.business.invest_biz.data.repository.defi_dashboard.model.ProtocolParams;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iEs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23663iEs {
    public static final java.lang.String AEQbTJ(@NotNull ProtocolParams protocolParams) {
        Intrinsics.checkNotNullParameter(protocolParams, "");
        return KWHzl(protocolParams.OLrzqt(), protocolParams.AEQbTJ());
    }

    public static final java.lang.String KWHzl(long j, long j2) {
        return "cacheKey:" + j + j2;
    }
}

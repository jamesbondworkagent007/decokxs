package o;

import com.okinc.business.invest_biz.data.bean.response.ProtocolRewards;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iEw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23667iEw {
    @yCM
    public C23667iEw() {
    }

    public final iEF EZpvd(@NotNull ProtocolRewards protocolRewards) {
        Intrinsics.checkNotNullParameter(protocolRewards, "");
        return new iEF(protocolRewards.KWHzl(), protocolRewards.copydefault(), protocolRewards.OLrzqt());
    }
}

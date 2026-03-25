package o;

import com.okinc.business.invest_biz.data.bean.response.HealthRate;
import com.okinc.business.invest_biz.data.bean.response.Points;
import com.okinc.business.invest_biz.data.bean.response.ProtocolExtraData;
import com.okinc.business.invest_biz.data.bean.response.ProtocolRewards;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iEn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23658iEn {
    public final C23645iEa AEQbTJ;
    public final C23667iEw EZpvd;
    public final C23649iEe OLrzqt;
    public final C23651iEg copydefault;

    @yCM
    public C23658iEn(@NotNull C23645iEa c23645iEa, @NotNull C23649iEe c23649iEe, @NotNull C23667iEw c23667iEw, @NotNull C23651iEg c23651iEg) {
        Intrinsics.checkNotNullParameter(c23645iEa, "");
        Intrinsics.checkNotNullParameter(c23649iEe, "");
        Intrinsics.checkNotNullParameter(c23667iEw, "");
        Intrinsics.checkNotNullParameter(c23651iEg, "");
        this.AEQbTJ = c23645iEa;
        this.OLrzqt = c23649iEe;
        this.EZpvd = c23667iEw;
        this.copydefault = c23651iEg;
    }

    public final iEL copydefault(@NotNull ProtocolExtraData protocolExtraData) {
        Intrinsics.checkNotNullParameter(protocolExtraData, "");
        HealthRate healthRateAEQbTJ = protocolExtraData.AEQbTJ();
        iEJ iejKWHzl = healthRateAEQbTJ != null ? this.AEQbTJ.KWHzl(healthRateAEQbTJ) : null;
        Points pointsEZpvd = protocolExtraData.EZpvd();
        iEH iehEZpvd = pointsEZpvd != null ? this.OLrzqt.EZpvd(pointsEZpvd) : null;
        ProtocolRewards protocolRewardsCopydefault = protocolExtraData.copydefault();
        return new iEL(iejKWHzl, iehEZpvd, protocolRewardsCopydefault != null ? this.EZpvd.EZpvd(protocolRewardsCopydefault) : null, this.copydefault.KWHzl(protocolExtraData.KWHzl()));
    }
}

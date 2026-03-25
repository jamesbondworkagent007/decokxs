package o;

import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iyc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25538iyc {
    public final InvestTipInfoVo AEQbTJ;
    public final int EZpvd;
    public final InvestTokenWithAmount KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25538iyc copy$default(C25538iyc c25538iyc, InvestTokenWithAmount investTokenWithAmount, int i, boolean z, InvestTipInfoVo investTipInfoVo, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            investTokenWithAmount = c25538iyc.KWHzl;
        }
        if ((i2 & 2) != 0) {
            i = c25538iyc.EZpvd;
        }
        if ((i2 & 4) != 0) {
            z = c25538iyc.copydefault;
        }
        if ((i2 & 8) != 0) {
            investTipInfoVo = c25538iyc.AEQbTJ;
        }
        return c25538iyc.EZpvd(investTokenWithAmount, i, z, investTipInfoVo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25538iyc EZpvd(@NotNull InvestTokenWithAmount investTokenWithAmount, int i, boolean z, InvestTipInfoVo investTipInfoVo) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        return new C25538iyc(investTokenWithAmount, i, z, investTipInfoVo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25538iyc)) {
            return false;
        }
        C25538iyc c25538iyc = (C25538iyc) obj;
        return Intrinsics.EZpvd(this.KWHzl, c25538iyc.KWHzl) && this.EZpvd == c25538iyc.EZpvd && this.copydefault == c25538iyc.copydefault && Intrinsics.EZpvd(this.AEQbTJ, c25538iyc.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = java.lang.Integer.hashCode(this.EZpvd);
        int iHashCode3 = java.lang.Boolean.hashCode(this.copydefault);
        InvestTipInfoVo investTipInfoVo = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (investTipInfoVo == null ? 0 : investTipInfoVo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestRedeemWith(investWithTokenInfo=" + this.KWHzl + ", tokenPrecision=" + this.EZpvd + ", isSupportSwap=" + this.copydefault + ", redeemAllTip=" + this.AEQbTJ + ")";
    }

    public C25538iyc(@NotNull InvestTokenWithAmount investTokenWithAmount, int i, boolean z, InvestTipInfoVo investTipInfoVo) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        this.KWHzl = investTokenWithAmount;
        this.EZpvd = i;
        this.copydefault = z;
        this.AEQbTJ = investTipInfoVo;
    }
}

package o;

import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexlogic.bean.PrioritySelectionBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kRb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28159kRb {
    public final kQU AEQbTJ;
    public final C28161kRd EZpvd;
    public final kQZ OLrzqt;

    @yCM
    public C28159kRb(@NotNull kQU kqu, @NotNull kQZ kqz, @NotNull C28161kRd c28161kRd) {
        Intrinsics.checkNotNullParameter(kqu, "");
        Intrinsics.checkNotNullParameter(kqz, "");
        Intrinsics.checkNotNullParameter(c28161kRd, "");
        this.AEQbTJ = kqu;
        this.OLrzqt = kqz;
        this.EZpvd = c28161kRd;
    }

    public final java.util.List<PrioritySelectionBean> KWHzl(boolean z, int i, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, boolean z2, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            return this.AEQbTJ.AEQbTJ(i, mevInfoBean, nonMevPriorityFeeInfo, z2, str);
        }
        return this.OLrzqt.copydefault(i, mevInfoBean, nonMevPriorityFeeInfo, z2, str);
    }

    public final java.lang.String OLrzqt(boolean z, boolean z2, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo) {
        if (z) {
            return this.AEQbTJ.copydefault(z2, mevInfoBean, nonMevPriorityFeeInfo);
        }
        return this.OLrzqt.AEQbTJ(z2, mevInfoBean, nonMevPriorityFeeInfo);
    }

    public final java.lang.String KWHzl(boolean z, boolean z2, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo) {
        if (z) {
            return this.AEQbTJ.AEQbTJ(z2, mevInfoBean, nonMevPriorityFeeInfo);
        }
        return this.OLrzqt.OLrzqt(z2, mevInfoBean, nonMevPriorityFeeInfo);
    }

    public final java.lang.String EZpvd(boolean z, boolean z2, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo) {
        if (z) {
            return this.AEQbTJ.KWHzl(z2, mevInfoBean, nonMevPriorityFeeInfo);
        }
        return this.OLrzqt.copydefault(z2, mevInfoBean, nonMevPriorityFeeInfo);
    }

    public final java.lang.String copydefault(boolean z, boolean z2, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo) {
        if (z) {
            return this.AEQbTJ.OLrzqt(z2, mevInfoBean, nonMevPriorityFeeInfo);
        }
        return this.OLrzqt.KWHzl(z2, mevInfoBean, nonMevPriorityFeeInfo);
    }

    public final java.lang.String AEQbTJ(boolean z, boolean z2, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo) {
        if (z) {
            return this.AEQbTJ.EZpvd(z2, mevInfoBean, nonMevPriorityFeeInfo);
        }
        return this.OLrzqt.EZpvd(z2, mevInfoBean, nonMevPriorityFeeInfo);
    }

    public final java.lang.String djBIcL(boolean z, boolean z2, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo) {
        if (z) {
            return this.AEQbTJ.AYXKKw(z2, mevInfoBean, nonMevPriorityFeeInfo);
        }
        return this.OLrzqt.AhwBna(z2, mevInfoBean, nonMevPriorityFeeInfo);
    }

    public static /* synthetic */ java.lang.String getPriorityFeeByPriorityType$default(C28159kRb c28159kRb, boolean z, int i, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, boolean z2, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 32) != 0) {
            str = "";
        }
        return c28159kRb.OLrzqt(z, i, mevInfoBean, nonMevPriorityFeeInfo, z2, str);
    }

    public final java.lang.String OLrzqt(boolean z, int i, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, boolean z2, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (i == PriorityFeeType.PriorityMarket.getValue()) {
            return OLrzqt(z, z2, mevInfoBean, nonMevPriorityFeeInfo);
        }
        if (i == PriorityFeeType.PriorityFast.getValue()) {
            return KWHzl(z, z2, mevInfoBean, nonMevPriorityFeeInfo);
        }
        return i == PriorityFeeType.PriorityTurbo.getValue() ? EZpvd(z, z2, mevInfoBean, nonMevPriorityFeeInfo) : str;
    }

    public static /* synthetic */ java.lang.String getPriorityFeeUsdByPriorityType$default(C28159kRb c28159kRb, boolean z, int i, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, boolean z2, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 32) != 0) {
            str = "";
        }
        return c28159kRb.copydefault(z, i, mevInfoBean, nonMevPriorityFeeInfo, z2, str);
    }

    public final java.lang.String copydefault(boolean z, int i, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, boolean z2, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (i == PriorityFeeType.PriorityMarket.getValue()) {
            return copydefault(z, z2, mevInfoBean, nonMevPriorityFeeInfo);
        }
        if (i == PriorityFeeType.PriorityFast.getValue()) {
            return AEQbTJ(z, z2, mevInfoBean, nonMevPriorityFeeInfo);
        }
        return i == PriorityFeeType.PriorityTurbo.getValue() ? djBIcL(z, z2, mevInfoBean, nonMevPriorityFeeInfo) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[PHI: r1
  0x0036: PHI (r1v7 java.lang.String) = (r1v4 java.lang.String), (r1v8 java.lang.String) binds: [B:13:0x0032, B:9:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String OLrzqt(boolean z, int i, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, boolean z2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        java.lang.String maxBaseFee;
        java.lang.String str5;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (i != PriorityFeeType.PriorityCustom.getValue()) {
            return copydefault(z, i, mevInfoBean, nonMevPriorityFeeInfo, z2, str4);
        }
        if (z) {
            if (z2) {
                maxBaseFee = mevInfoBean != null ? mevInfoBean.getMaxBaseFee() : null;
                str5 = maxBaseFee == null ? "" : maxBaseFee;
            } else {
                maxBaseFee = nonMevPriorityFeeInfo != null ? nonMevPriorityFeeInfo.getMaxBaseFee() : null;
                if (maxBaseFee == null) {
                }
            }
            return this.AEQbTJ.AEQbTJ(str4, str, str2, str3, str5);
        }
        return this.OLrzqt.EZpvd(str4, str, str2, str3);
    }
}

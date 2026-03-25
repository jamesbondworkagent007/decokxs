package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gLL implements gLN {
    public final gLI AEQbTJ;
    public final gLH EZpvd;
    public DefiChainInfo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final gLN OLrzqt(boolean z) {
        return z ? this.EZpvd : this.AEQbTJ;
    }

    @yCM
    public gLL(@NotNull gLH glh, @NotNull gLI gli) {
        Intrinsics.checkNotNullParameter(glh, "");
        Intrinsics.checkNotNullParameter(gli, "");
        this.EZpvd = glh;
        this.AEQbTJ = gli;
    }

    public final boolean KWHzl() {
        DefiChainInfo defiChainInfo = this.copydefault;
        if (defiChainInfo != null) {
            return defiChainInfo.getSupportEip1559();
        }
        return false;
    }

    @Override // o.gLN
    public java.lang.String EZpvd(boolean z, @NotNull LimitFeeData limitFeeData) {
        Intrinsics.checkNotNullParameter(limitFeeData, "");
        return OLrzqt(KWHzl()).EZpvd(z, limitFeeData);
    }

    @Override // o.gLN
    public java.lang.String copydefault(int i, boolean z, @NotNull LimitFeeData limitFeeData, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(limitFeeData, "");
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt(KWHzl()).copydefault(i, z, limitFeeData, str);
    }

    @Override // o.gLN
    public java.lang.String OLrzqt(int i, boolean z, @NotNull LimitFeeData limitFeeData, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(limitFeeData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return OLrzqt(KWHzl()).OLrzqt(i, z, limitFeeData, str, str2, str3, str4);
    }

    @Override // o.gLN
    public java.lang.String AEQbTJ(int i, boolean z, @NotNull LimitFeeData limitFeeData, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(limitFeeData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return OLrzqt(KWHzl()).AEQbTJ(i, z, limitFeeData, str, str2, str3);
    }

    @Override // o.gLN
    public kotlin.Pair<PriorityFeeType, java.lang.String> EZpvd() {
        return OLrzqt(KWHzl()).EZpvd();
    }

    @Override // o.gLN
    public void EZpvd(kotlin.Pair<? extends PriorityFeeType, java.lang.String> pair) {
        OLrzqt(KWHzl()).EZpvd(pair);
    }

    @Override // o.gLN
    public void EZpvd(@NotNull DefiChainInfo defiChainInfo) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        this.copydefault = defiChainInfo;
        OLrzqt(defiChainInfo.getSupportEip1559()).EZpvd(defiChainInfo);
    }

    public final void OLrzqt() {
        this.EZpvd.EZpvd((kotlin.Pair<? extends PriorityFeeType, java.lang.String>) null);
        this.AEQbTJ.EZpvd((kotlin.Pair<? extends PriorityFeeType, java.lang.String>) null);
    }
}

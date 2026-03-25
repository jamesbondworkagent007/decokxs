package o;

import com.okinc.business.dexlogic.MemeChainType;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.trade.features.home.domain.model.ChainBizType;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gLJ {
    public final gLM AEQbTJ;
    public final gLL EZpvd;
    public final kUH KWHzl;
    public final C19700gMb copydefault;

    @yCM
    public gLJ(@NotNull gLL gll, @NotNull gLM glm, @NotNull kUH kuh, @NotNull C19700gMb c19700gMb) {
        Intrinsics.checkNotNullParameter(gll, "");
        Intrinsics.checkNotNullParameter(glm, "");
        Intrinsics.checkNotNullParameter(kuh, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        this.EZpvd = gll;
        this.AEQbTJ = glm;
        this.KWHzl = kuh;
        this.copydefault = c19700gMb;
    }

    public final gLN copydefault(java.lang.String str) {
        java.lang.Object next;
        java.util.Iterator<T> it = this.KWHzl.AEQbTJ(ChainBizType.Limit).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((DefiChainInfo) next).getChainId(), (java.lang.Object) str)) {
                break;
            }
        }
        DefiChainInfo defiChainInfo = (DefiChainInfo) next;
        if (Intrinsics.EZpvd((java.lang.Object) (defiChainInfo != null ? defiChainInfo.getNetworkFeeType() : null), (java.lang.Object) MemeChainType.MemeChainTypeSol.getValue())) {
            this.AEQbTJ.EZpvd(defiChainInfo);
            return this.AEQbTJ;
        }
        if (defiChainInfo != null) {
            this.EZpvd.EZpvd(defiChainInfo);
        }
        return this.EZpvd;
    }

    public final kotlin.Pair<PriorityFeeType, java.lang.String> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault(str).EZpvd();
    }

    public final void EZpvd(@NotNull java.lang.String str, kotlin.Pair<? extends PriorityFeeType, java.lang.String> pair) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(str).EZpvd(pair);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull LimitFeeData limitFeeData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(limitFeeData, "");
        return copydefault(str).EZpvd(z, limitFeeData);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, int i, boolean z, @NotNull LimitFeeData limitFeeData, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(limitFeeData, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return copydefault(str).copydefault(i, z, limitFeeData, str2);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, int i, boolean z, @NotNull LimitFeeData limitFeeData, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(limitFeeData, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return copydefault(str).AEQbTJ(i, z, limitFeeData, str2, str3, str4);
    }

    public final void OLrzqt() {
        this.AEQbTJ.EZpvd((kotlin.Pair<? extends PriorityFeeType, java.lang.String>) null);
        this.EZpvd.OLrzqt();
    }
}

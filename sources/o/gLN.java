package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface gLN {
    java.lang.String AEQbTJ(int i, boolean z, @NotNull LimitFeeData limitFeeData, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

    java.lang.String EZpvd(boolean z, @NotNull LimitFeeData limitFeeData);

    kotlin.Pair<PriorityFeeType, java.lang.String> EZpvd();

    void EZpvd(@NotNull DefiChainInfo defiChainInfo);

    void EZpvd(kotlin.Pair<? extends PriorityFeeType, java.lang.String> pair);

    java.lang.String OLrzqt(int i, boolean z, @NotNull LimitFeeData limitFeeData, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4);

    java.lang.String copydefault(int i, boolean z, @NotNull LimitFeeData limitFeeData, @NotNull java.lang.String str);

    public static final class TaskDescription {
        public static /* synthetic */ java.lang.String getPriorityFeeByPriorityType$default(gLN gln, int i, boolean z, LimitFeeData limitFeeData, java.lang.String str, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPriorityFeeByPriorityType");
            }
            if ((i2 & 8) != 0) {
                str = "";
            }
            return gln.copydefault(i, z, limitFeeData, str);
        }

        public static /* synthetic */ java.lang.String getPriorityFeeUsd$default(gLN gln, int i, boolean z, LimitFeeData limitFeeData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i2, java.lang.Object obj) {
            if (obj == null) {
                return gln.OLrzqt(i, z, limitFeeData, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? "" : str4);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPriorityFeeUsd");
        }
    }
}

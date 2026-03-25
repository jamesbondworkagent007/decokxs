package com.okinc.business.trade.features.home.meme.usecase.transaction;

import com.okinc.business.dex.trade.core.domain.model.FeeInfo;
import com.okinc.business.dex.trade.core.domain.model.NetworkFeeInfo;
import com.okinc.business.dex.trade.core.domain.model.PriorityFee;
import com.okinc.business.dexlogic.MemeChainType;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C28310kWr;
import o.InterfaceC30984llU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeV6FeeCalculationUseCase {
    public final C28310kWr KWHzl;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MemeChainType.values().length];
            try {
                iArr[MemeChainType.MemeChainTypeSol.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MemeChainType.MemeChainTypeEVM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MemeChainType.MemeChainTypeOther.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    @yCM
    public MemeV6FeeCalculationUseCase(@NotNull C28310kWr c28310kWr) {
        Intrinsics.checkNotNullParameter(c28310kWr, "");
        this.KWHzl = c28310kWr;
    }

    public static final class FeeCalculationParams {
        public static final int $stable = 8;
        private final String chainId;
        private final DefiChainInfo currentChainInfo;
        private final boolean isOpenMev;
        private final String priorityFeeValue;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FeeCalculationParams copy$default(FeeCalculationParams feeCalculationParams, String str, boolean z, String str2, DefiChainInfo defiChainInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                str = feeCalculationParams.chainId;
            }
            if ((i & 2) != 0) {
                z = feeCalculationParams.isOpenMev;
            }
            if ((i & 4) != 0) {
                str2 = feeCalculationParams.priorityFeeValue;
            }
            if ((i & 8) != 0) {
                defiChainInfo = feeCalculationParams.currentChainInfo;
            }
            return feeCalculationParams.copy(str, z, str2, defiChainInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component2() {
            return this.isOpenMev;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.priorityFeeValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DefiChainInfo component4() {
            return this.currentChainInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FeeCalculationParams copy(@NotNull String str, boolean z, @NotNull String str2, DefiChainInfo defiChainInfo) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new FeeCalculationParams(str, z, str2, defiChainInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeeCalculationParams)) {
                return false;
            }
            FeeCalculationParams feeCalculationParams = (FeeCalculationParams) obj;
            return Intrinsics.EZpvd((Object) this.chainId, (Object) feeCalculationParams.chainId) && this.isOpenMev == feeCalculationParams.isOpenMev && Intrinsics.EZpvd((Object) this.priorityFeeValue, (Object) feeCalculationParams.priorityFeeValue) && Intrinsics.EZpvd(this.currentChainInfo, feeCalculationParams.currentChainInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DefiChainInfo getCurrentChainInfo() {
            return this.currentChainInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPriorityFeeValue() {
            return this.priorityFeeValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.chainId.hashCode();
            int iHashCode2 = Boolean.hashCode(this.isOpenMev);
            int iHashCode3 = this.priorityFeeValue.hashCode();
            DefiChainInfo defiChainInfo = this.currentChainInfo;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (defiChainInfo == null ? 0 : defiChainInfo.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isOpenMev() {
            return this.isOpenMev;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FeeCalculationParams(chainId=" + this.chainId + ", isOpenMev=" + this.isOpenMev + ", priorityFeeValue=" + this.priorityFeeValue + ", currentChainInfo=" + this.currentChainInfo + ")";
        }

        public FeeCalculationParams(@NotNull String str, boolean z, @NotNull String str2, DefiChainInfo defiChainInfo) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.chainId = str;
            this.isOpenMev = z;
            this.priorityFeeValue = str2;
            this.currentChainInfo = defiChainInfo;
        }
    }

    public static /* synthetic */ String getPriorityFee$default(MemeV6FeeCalculationUseCase memeV6FeeCalculationUseCase, FeeCalculationParams feeCalculationParams, InterfaceC30984llU interfaceC30984llU, int i, String str, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = "";
        }
        return memeV6FeeCalculationUseCase.AEQbTJ(feeCalculationParams, interfaceC30984llU, i, str);
    }

    public final String AEQbTJ(@NotNull FeeCalculationParams feeCalculationParams, @NotNull InterfaceC30984llU interfaceC30984llU, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(feeCalculationParams, "");
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.AEQbTJ(i, interfaceC30984llU, feeCalculationParams.isOpenMev(), str);
    }

    public final String copydefault(@NotNull FeeCalculationParams feeCalculationParams, @NotNull InterfaceC30984llU interfaceC30984llU, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(feeCalculationParams, "");
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.OLrzqt(i, interfaceC30984llU, feeCalculationParams.isOpenMev(), str);
    }

    public final String KWHzl(@NotNull FeeCalculationParams feeCalculationParams, @NotNull MemeChainType memeChainType, NetworkFeeInfo networkFeeInfo) {
        int i;
        FeeInfo base;
        FeeInfo base2;
        FeeInfo base3;
        FeeInfo base4;
        Intrinsics.checkNotNullParameter(feeCalculationParams, "");
        Intrinsics.checkNotNullParameter(memeChainType, "");
        if (networkFeeInfo == null || (i = TaskDescription.KWHzl[memeChainType.ordinal()]) == 1) {
            return "";
        }
        String fee = null;
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (feeCalculationParams.isOpenMev()) {
                PriorityFee defaultMev = networkFeeInfo.getDefaultMev();
                if (defaultMev != null && (base4 = defaultMev.getBase()) != null) {
                    fee = base4.getFee();
                }
                if (fee == null) {
                    return "";
                }
            } else {
                PriorityFee normal = networkFeeInfo.getNormal();
                if (normal != null && (base3 = normal.getBase()) != null) {
                    fee = base3.getFee();
                }
                if (fee == null) {
                    return "";
                }
            }
            return fee;
        }
        DefiChainInfo currentChainInfo = feeCalculationParams.getCurrentChainInfo();
        if (currentChainInfo != null && currentChainInfo.getSupportEip1559()) {
            if (feeCalculationParams.isOpenMev()) {
                PriorityFee defaultMev2 = networkFeeInfo.getDefaultMev();
                if (defaultMev2 != null && (base2 = defaultMev2.getBase()) != null) {
                    fee = base2.getFee();
                }
                if (fee == null) {
                    return "";
                }
            } else {
                PriorityFee normal2 = networkFeeInfo.getNormal();
                if (normal2 != null && (base = normal2.getBase()) != null) {
                    fee = base.getFee();
                }
                if (fee == null) {
                    return "";
                }
            }
            return fee;
        }
        return feeCalculationParams.getPriorityFeeValue();
    }
}

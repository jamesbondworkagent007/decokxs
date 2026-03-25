package com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean;

import kotlin.jvm.internal.Intrinsics;
import o.C10854bwM;
import o.C8491bDi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class CosmosFeeItemInfo extends C8491bDi {
    public static final int $stable = 0;
    private final GasLimit gasLimit;
    private final GasPrice gasPrice;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasLimit getGasLimit() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasPrice getGasPrice() {
        return this.gasPrice;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CosmosFeeItemInfo(int i, @NotNull C10854bwM c10854bwM, @NotNull String str, @NotNull String str2, @NotNull GasPrice gasPrice, @NotNull GasLimit gasLimit) {
        super(c10854bwM, str, "", "", str2, i);
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(gasPrice, "");
        Intrinsics.checkNotNullParameter(gasLimit, "");
        this.gasPrice = gasPrice;
        this.gasLimit = gasLimit;
    }

    public static final class GasPrice {
        public static final int $stable = 0;
        private final String gasPrice;
        private final String minLimitGasPrice;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getGasPrice() {
            return this.gasPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMinLimitGasPrice() {
            return this.minLimitGasPrice;
        }

        public GasPrice(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.gasPrice = str;
            this.minLimitGasPrice = str2;
        }
    }

    public static final class GasLimit {
        public static final int $stable = 0;
        private final String gasLimit;
        private final String minLimitGasLimit;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getGasLimit() {
            return this.gasLimit;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMinLimitGasLimit() {
            return this.minLimitGasLimit;
        }

        public GasLimit(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.gasLimit = str;
            this.minLimitGasLimit = str2;
        }
    }
}

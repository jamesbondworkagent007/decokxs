package com.okinc.business.defi.biz.net.bean;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class CeDefiPreCreateOrderReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String accountId;
    private final int accountType;
    private final String bizExtraData;
    private final String chainIndex;
    private final CeDefiSolGas gasFeeInfo;
    private final CeDefiEvmGasLimit gasLimit;
    private final CeDefiEvmGasPrice gasPrice;
    private final int projectId;
    private final String toAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiEvmGasLimit component4() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiEvmGasPrice component5() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiSolGas component6() {
        return this.gasFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.bizExtraData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiPreCreateOrderReq copy(@NotNull String str, @NotNull String str2, int i, CeDefiEvmGasLimit ceDefiEvmGasLimit, CeDefiEvmGasPrice ceDefiEvmGasPrice, CeDefiSolGas ceDefiSolGas, int i2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new CeDefiPreCreateOrderReq(str, str2, i, ceDefiEvmGasLimit, ceDefiEvmGasPrice, ceDefiSolGas, i2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CeDefiPreCreateOrderReq)) {
            return false;
        }
        CeDefiPreCreateOrderReq ceDefiPreCreateOrderReq = (CeDefiPreCreateOrderReq) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) ceDefiPreCreateOrderReq.chainIndex) && Intrinsics.EZpvd((Object) this.toAddress, (Object) ceDefiPreCreateOrderReq.toAddress) && this.projectId == ceDefiPreCreateOrderReq.projectId && Intrinsics.EZpvd(this.gasLimit, ceDefiPreCreateOrderReq.gasLimit) && Intrinsics.EZpvd(this.gasPrice, ceDefiPreCreateOrderReq.gasPrice) && Intrinsics.EZpvd(this.gasFeeInfo, ceDefiPreCreateOrderReq.gasFeeInfo) && this.accountType == ceDefiPreCreateOrderReq.accountType && Intrinsics.EZpvd((Object) this.accountId, (Object) ceDefiPreCreateOrderReq.accountId) && Intrinsics.EZpvd((Object) this.bizExtraData, (Object) ceDefiPreCreateOrderReq.bizExtraData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAccountType() {
        return this.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizExtraData() {
        return this.bizExtraData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiSolGas getGasFeeInfo() {
        return this.gasFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiEvmGasLimit getGasLimit() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiEvmGasPrice getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProjectId() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAddress() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainIndex.hashCode();
        int iHashCode2 = this.toAddress.hashCode();
        int iHashCode3 = Integer.hashCode(this.projectId);
        CeDefiEvmGasLimit ceDefiEvmGasLimit = this.gasLimit;
        int iHashCode4 = ceDefiEvmGasLimit == null ? 0 : ceDefiEvmGasLimit.hashCode();
        CeDefiEvmGasPrice ceDefiEvmGasPrice = this.gasPrice;
        int iHashCode5 = ceDefiEvmGasPrice == null ? 0 : ceDefiEvmGasPrice.hashCode();
        CeDefiSolGas ceDefiSolGas = this.gasFeeInfo;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (ceDefiSolGas != null ? ceDefiSolGas.hashCode() : 0)) * 31) + Integer.hashCode(this.accountType)) * 31) + this.accountId.hashCode()) * 31) + this.bizExtraData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CeDefiPreCreateOrderReq(chainIndex=" + this.chainIndex + ", toAddress=" + this.toAddress + ", projectId=" + this.projectId + ", gasLimit=" + this.gasLimit + ", gasPrice=" + this.gasPrice + ", gasFeeInfo=" + this.gasFeeInfo + ", accountType=" + this.accountType + ", accountId=" + this.accountId + ", bizExtraData=" + this.bizExtraData + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CeDefiPreCreateOrderReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CeDefiPreCreateOrderReq> serializer() {
            return CeDefiPreCreateOrderReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CeDefiPreCreateOrderReq(int i, String str, String str2, int i2, CeDefiEvmGasLimit ceDefiEvmGasLimit, CeDefiEvmGasPrice ceDefiEvmGasPrice, CeDefiSolGas ceDefiSolGas, int i3, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i, FrameMetricsAggregator.EVERY_DURATION, CeDefiPreCreateOrderReq$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = str;
        this.toAddress = str2;
        this.projectId = i2;
        this.gasLimit = ceDefiEvmGasLimit;
        this.gasPrice = ceDefiEvmGasPrice;
        this.gasFeeInfo = ceDefiSolGas;
        this.accountType = i3;
        this.accountId = str3;
        this.bizExtraData = str4;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CeDefiPreCreateOrderReq ceDefiPreCreateOrderReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, ceDefiPreCreateOrderReq.chainIndex);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, ceDefiPreCreateOrderReq.toAddress);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, ceDefiPreCreateOrderReq.projectId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, CeDefiEvmGasLimit$$serializer.INSTANCE, ceDefiPreCreateOrderReq.gasLimit);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, CeDefiEvmGasPrice$$serializer.INSTANCE, ceDefiPreCreateOrderReq.gasPrice);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, CeDefiSolGas$$serializer.INSTANCE, ceDefiPreCreateOrderReq.gasFeeInfo);
        compositeEncoder.encodeIntElement(serialDescriptor, 6, ceDefiPreCreateOrderReq.accountType);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, ceDefiPreCreateOrderReq.accountId);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, ceDefiPreCreateOrderReq.bizExtraData);
    }

    public CeDefiPreCreateOrderReq(@NotNull String str, @NotNull String str2, int i, CeDefiEvmGasLimit ceDefiEvmGasLimit, CeDefiEvmGasPrice ceDefiEvmGasPrice, CeDefiSolGas ceDefiSolGas, int i2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.chainIndex = str;
        this.toAddress = str2;
        this.projectId = i;
        this.gasLimit = ceDefiEvmGasLimit;
        this.gasPrice = ceDefiEvmGasPrice;
        this.gasFeeInfo = ceDefiSolGas;
        this.accountType = i2;
        this.accountId = str3;
        this.bizExtraData = str4;
    }

    @Serializable
    public static final class CeDefiPreCreateOrderReqBizExtraData {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final Integer gasPayType;
        private final CeDefiPreCreateOrderReqBizExtraDataGasToken gasToken;
        private final String toAddress;
        private final String tokenAddress;
        private final String tokenAmount;
        private final int transferType;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CeDefiPreCreateOrderReqBizExtraData copy$default(CeDefiPreCreateOrderReqBizExtraData ceDefiPreCreateOrderReqBizExtraData, String str, String str2, int i, String str3, Integer num, CeDefiPreCreateOrderReqBizExtraDataGasToken ceDefiPreCreateOrderReqBizExtraDataGasToken, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = ceDefiPreCreateOrderReqBizExtraData.tokenAddress;
            }
            if ((i2 & 2) != 0) {
                str2 = ceDefiPreCreateOrderReqBizExtraData.toAddress;
            }
            String str4 = str2;
            if ((i2 & 4) != 0) {
                i = ceDefiPreCreateOrderReqBizExtraData.transferType;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                str3 = ceDefiPreCreateOrderReqBizExtraData.tokenAmount;
            }
            String str5 = str3;
            if ((i2 & 16) != 0) {
                num = ceDefiPreCreateOrderReqBizExtraData.gasPayType;
            }
            Integer num2 = num;
            if ((i2 & 32) != 0) {
                ceDefiPreCreateOrderReqBizExtraDataGasToken = ceDefiPreCreateOrderReqBizExtraData.gasToken;
            }
            return ceDefiPreCreateOrderReqBizExtraData.copy(str, str4, i3, str5, num2, ceDefiPreCreateOrderReqBizExtraDataGasToken);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.toAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component3() {
            return this.transferType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.tokenAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component5() {
            return this.gasPayType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CeDefiPreCreateOrderReqBizExtraDataGasToken component6() {
            return this.gasToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CeDefiPreCreateOrderReqBizExtraData copy(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, Integer num, @NotNull CeDefiPreCreateOrderReqBizExtraDataGasToken ceDefiPreCreateOrderReqBizExtraDataGasToken) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(ceDefiPreCreateOrderReqBizExtraDataGasToken, "");
            return new CeDefiPreCreateOrderReqBizExtraData(str, str2, i, str3, num, ceDefiPreCreateOrderReqBizExtraDataGasToken);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CeDefiPreCreateOrderReqBizExtraData)) {
                return false;
            }
            CeDefiPreCreateOrderReqBizExtraData ceDefiPreCreateOrderReqBizExtraData = (CeDefiPreCreateOrderReqBizExtraData) obj;
            return Intrinsics.EZpvd((Object) this.tokenAddress, (Object) ceDefiPreCreateOrderReqBizExtraData.tokenAddress) && Intrinsics.EZpvd((Object) this.toAddress, (Object) ceDefiPreCreateOrderReqBizExtraData.toAddress) && this.transferType == ceDefiPreCreateOrderReqBizExtraData.transferType && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) ceDefiPreCreateOrderReqBizExtraData.tokenAmount) && Intrinsics.EZpvd(this.gasPayType, ceDefiPreCreateOrderReqBizExtraData.gasPayType) && Intrinsics.EZpvd(this.gasToken, ceDefiPreCreateOrderReqBizExtraData.gasToken);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getGasPayType() {
            return this.gasPayType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CeDefiPreCreateOrderReqBizExtraDataGasToken getGasToken() {
            return this.gasToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getToAddress() {
            return this.toAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenAddress() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenAmount() {
            return this.tokenAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTransferType() {
            return this.transferType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.tokenAddress.hashCode();
            int iHashCode2 = this.toAddress.hashCode();
            int iHashCode3 = Integer.hashCode(this.transferType);
            int iHashCode4 = this.tokenAmount.hashCode();
            Integer num = this.gasPayType;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.gasToken.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CeDefiPreCreateOrderReqBizExtraData(tokenAddress=" + this.tokenAddress + ", toAddress=" + this.toAddress + ", transferType=" + this.transferType + ", tokenAmount=" + this.tokenAmount + ", gasPayType=" + this.gasPayType + ", gasToken=" + this.gasToken + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CeDefiPreCreateOrderReq.CeDefiPreCreateOrderReqBizExtraData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<CeDefiPreCreateOrderReqBizExtraData> serializer() {
                return CeDefiPreCreateOrderReq$CeDefiPreCreateOrderReqBizExtraData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ CeDefiPreCreateOrderReqBizExtraData(int i, String str, String str2, int i2, String str3, Integer num, CeDefiPreCreateOrderReqBizExtraDataGasToken ceDefiPreCreateOrderReqBizExtraDataGasToken, SerializationConstructorMarker serializationConstructorMarker) {
            if (63 != (i & 63)) {
                PluginExceptionsKt.throwMissingFieldException(i, 63, CeDefiPreCreateOrderReq$CeDefiPreCreateOrderReqBizExtraData$$serializer.INSTANCE.getDescriptor());
            }
            this.tokenAddress = str;
            this.toAddress = str2;
            this.transferType = i2;
            this.tokenAmount = str3;
            this.gasPayType = num;
            this.gasToken = ceDefiPreCreateOrderReqBizExtraDataGasToken;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CeDefiPreCreateOrderReqBizExtraData ceDefiPreCreateOrderReqBizExtraData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, ceDefiPreCreateOrderReqBizExtraData.tokenAddress);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, ceDefiPreCreateOrderReqBizExtraData.toAddress);
            compositeEncoder.encodeIntElement(serialDescriptor, 2, ceDefiPreCreateOrderReqBizExtraData.transferType);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, ceDefiPreCreateOrderReqBizExtraData.tokenAmount);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, ceDefiPreCreateOrderReqBizExtraData.gasPayType);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, CeDefiPreCreateOrderReq$CeDefiPreCreateOrderReqBizExtraData$CeDefiPreCreateOrderReqBizExtraDataGasToken$$serializer.INSTANCE, ceDefiPreCreateOrderReqBizExtraData.gasToken);
        }

        public CeDefiPreCreateOrderReqBizExtraData(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, Integer num, @NotNull CeDefiPreCreateOrderReqBizExtraDataGasToken ceDefiPreCreateOrderReqBizExtraDataGasToken) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(ceDefiPreCreateOrderReqBizExtraDataGasToken, "");
            this.tokenAddress = str;
            this.toAddress = str2;
            this.transferType = i;
            this.tokenAmount = str3;
            this.gasPayType = num;
            this.gasToken = ceDefiPreCreateOrderReqBizExtraDataGasToken;
        }

        @Serializable
        public static final class CeDefiPreCreateOrderReqBizExtraDataGasToken {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);
            private final String feeTokenCoinTypeNo;
            private final Integer paymasterName;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ CeDefiPreCreateOrderReqBizExtraDataGasToken copy$default(CeDefiPreCreateOrderReqBizExtraDataGasToken ceDefiPreCreateOrderReqBizExtraDataGasToken, Integer num, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = ceDefiPreCreateOrderReqBizExtraDataGasToken.paymasterName;
                }
                if ((i & 2) != 0) {
                    str = ceDefiPreCreateOrderReqBizExtraDataGasToken.feeTokenCoinTypeNo;
                }
                return ceDefiPreCreateOrderReqBizExtraDataGasToken.copy(num, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Integer component1() {
                return this.paymasterName;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.feeTokenCoinTypeNo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CeDefiPreCreateOrderReqBizExtraDataGasToken copy(Integer num, String str) {
                return new CeDefiPreCreateOrderReqBizExtraDataGasToken(num, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CeDefiPreCreateOrderReqBizExtraDataGasToken)) {
                    return false;
                }
                CeDefiPreCreateOrderReqBizExtraDataGasToken ceDefiPreCreateOrderReqBizExtraDataGasToken = (CeDefiPreCreateOrderReqBizExtraDataGasToken) obj;
                return Intrinsics.EZpvd(this.paymasterName, ceDefiPreCreateOrderReqBizExtraDataGasToken.paymasterName) && Intrinsics.EZpvd((Object) this.feeTokenCoinTypeNo, (Object) ceDefiPreCreateOrderReqBizExtraDataGasToken.feeTokenCoinTypeNo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getFeeTokenCoinTypeNo() {
                return this.feeTokenCoinTypeNo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Integer getPaymasterName() {
                return this.paymasterName;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                Integer num = this.paymasterName;
                int iHashCode = num == null ? 0 : num.hashCode();
                String str = this.feeTokenCoinTypeNo;
                return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "CeDefiPreCreateOrderReqBizExtraDataGasToken(paymasterName=" + this.paymasterName + ", feeTokenCoinTypeNo=" + this.feeTokenCoinTypeNo + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CeDefiPreCreateOrderReq.CeDefiPreCreateOrderReqBizExtraData.CeDefiPreCreateOrderReqBizExtraDataGasToken.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<CeDefiPreCreateOrderReqBizExtraDataGasToken> serializer() {
                    return CeDefiPreCreateOrderReq$CeDefiPreCreateOrderReqBizExtraData$CeDefiPreCreateOrderReqBizExtraDataGasToken$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ CeDefiPreCreateOrderReqBizExtraDataGasToken(int i, Integer num, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 3, CeDefiPreCreateOrderReq$CeDefiPreCreateOrderReqBizExtraData$CeDefiPreCreateOrderReqBizExtraDataGasToken$$serializer.INSTANCE.getDescriptor());
                }
                this.paymasterName = num;
                this.feeTokenCoinTypeNo = str;
            }

            public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CeDefiPreCreateOrderReqBizExtraDataGasToken ceDefiPreCreateOrderReqBizExtraDataGasToken, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, ceDefiPreCreateOrderReqBizExtraDataGasToken.paymasterName);
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, ceDefiPreCreateOrderReqBizExtraDataGasToken.feeTokenCoinTypeNo);
            }

            public CeDefiPreCreateOrderReqBizExtraDataGasToken(Integer num, String str) {
                this.paymasterName = num;
                this.feeTokenCoinTypeNo = str;
            }
        }
    }
}

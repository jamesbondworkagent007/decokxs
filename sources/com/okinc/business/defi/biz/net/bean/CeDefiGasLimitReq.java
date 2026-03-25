package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class CeDefiGasLimitReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String accountId;
    private final int accountType;
    private final String bizExtraData;
    private final String chainIndex;
    private final int projectId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CeDefiGasLimitReq copy$default(CeDefiGasLimitReq ceDefiGasLimitReq, String str, int i, int i2, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = ceDefiGasLimitReq.accountId;
        }
        if ((i3 & 2) != 0) {
            i = ceDefiGasLimitReq.accountType;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = ceDefiGasLimitReq.projectId;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str2 = ceDefiGasLimitReq.chainIndex;
        }
        String str4 = str2;
        if ((i3 & 16) != 0) {
            str3 = ceDefiGasLimitReq.bizExtraData;
        }
        return ceDefiGasLimitReq.copy(str, i4, i5, str4, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.bizExtraData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiGasLimitReq copy(@NotNull String str, int i, int i2, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CeDefiGasLimitReq(str, i, i2, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CeDefiGasLimitReq)) {
            return false;
        }
        CeDefiGasLimitReq ceDefiGasLimitReq = (CeDefiGasLimitReq) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) ceDefiGasLimitReq.accountId) && this.accountType == ceDefiGasLimitReq.accountType && this.projectId == ceDefiGasLimitReq.projectId && Intrinsics.EZpvd((Object) this.chainIndex, (Object) ceDefiGasLimitReq.chainIndex) && Intrinsics.EZpvd((Object) this.bizExtraData, (Object) ceDefiGasLimitReq.bizExtraData);
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
    public final int getProjectId() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.accountId.hashCode() * 31) + Integer.hashCode(this.accountType)) * 31) + Integer.hashCode(this.projectId)) * 31) + this.chainIndex.hashCode()) * 31) + this.bizExtraData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CeDefiGasLimitReq(accountId=" + this.accountId + ", accountType=" + this.accountType + ", projectId=" + this.projectId + ", chainIndex=" + this.chainIndex + ", bizExtraData=" + this.bizExtraData + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CeDefiGasLimitReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CeDefiGasLimitReq> serializer() {
            return CeDefiGasLimitReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CeDefiGasLimitReq(int i, String str, int i2, int i3, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, CeDefiGasLimitReq$$serializer.INSTANCE.getDescriptor());
        }
        this.accountId = str;
        this.accountType = i2;
        this.projectId = i3;
        this.chainIndex = str2;
        this.bizExtraData = str3;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CeDefiGasLimitReq ceDefiGasLimitReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, ceDefiGasLimitReq.accountId);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, ceDefiGasLimitReq.accountType);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, ceDefiGasLimitReq.projectId);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, ceDefiGasLimitReq.chainIndex);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, ceDefiGasLimitReq.bizExtraData);
    }

    public CeDefiGasLimitReq(@NotNull String str, int i, int i2, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.accountId = str;
        this.accountType = i;
        this.projectId = i2;
        this.chainIndex = str2;
        this.bizExtraData = str3;
    }

    @Serializable
    public static final class CeDefiGasLimitReqBizExtraData {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String toAddress;
        private final String tokenAddress;
        private final String tokenAmount;
        private final int transferType;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CeDefiGasLimitReqBizExtraData copy$default(CeDefiGasLimitReqBizExtraData ceDefiGasLimitReqBizExtraData, String str, String str2, int i, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = ceDefiGasLimitReqBizExtraData.tokenAddress;
            }
            if ((i2 & 2) != 0) {
                str2 = ceDefiGasLimitReqBizExtraData.toAddress;
            }
            if ((i2 & 4) != 0) {
                i = ceDefiGasLimitReqBizExtraData.transferType;
            }
            if ((i2 & 8) != 0) {
                str3 = ceDefiGasLimitReqBizExtraData.tokenAmount;
            }
            return ceDefiGasLimitReqBizExtraData.copy(str, str2, i, str3);
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
        public final CeDefiGasLimitReqBizExtraData copy(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new CeDefiGasLimitReqBizExtraData(str, str2, i, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CeDefiGasLimitReqBizExtraData)) {
                return false;
            }
            CeDefiGasLimitReqBizExtraData ceDefiGasLimitReqBizExtraData = (CeDefiGasLimitReqBizExtraData) obj;
            return Intrinsics.EZpvd((Object) this.tokenAddress, (Object) ceDefiGasLimitReqBizExtraData.tokenAddress) && Intrinsics.EZpvd((Object) this.toAddress, (Object) ceDefiGasLimitReqBizExtraData.toAddress) && this.transferType == ceDefiGasLimitReqBizExtraData.transferType && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) ceDefiGasLimitReqBizExtraData.tokenAmount);
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
            return (((((this.tokenAddress.hashCode() * 31) + this.toAddress.hashCode()) * 31) + Integer.hashCode(this.transferType)) * 31) + this.tokenAmount.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CeDefiGasLimitReqBizExtraData(tokenAddress=" + this.tokenAddress + ", toAddress=" + this.toAddress + ", transferType=" + this.transferType + ", tokenAmount=" + this.tokenAmount + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CeDefiGasLimitReq.CeDefiGasLimitReqBizExtraData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<CeDefiGasLimitReqBizExtraData> serializer() {
                return CeDefiGasLimitReq$CeDefiGasLimitReqBizExtraData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ CeDefiGasLimitReqBizExtraData(int i, String str, String str2, int i2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i, 15, CeDefiGasLimitReq$CeDefiGasLimitReqBizExtraData$$serializer.INSTANCE.getDescriptor());
            }
            this.tokenAddress = str;
            this.toAddress = str2;
            this.transferType = i2;
            this.tokenAmount = str3;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CeDefiGasLimitReqBizExtraData ceDefiGasLimitReqBizExtraData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, ceDefiGasLimitReqBizExtraData.tokenAddress);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, ceDefiGasLimitReqBizExtraData.toAddress);
            compositeEncoder.encodeIntElement(serialDescriptor, 2, ceDefiGasLimitReqBizExtraData.transferType);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, ceDefiGasLimitReqBizExtraData.tokenAmount);
        }

        public CeDefiGasLimitReqBizExtraData(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.tokenAddress = str;
            this.toAddress = str2;
            this.transferType = i;
            this.tokenAmount = str3;
        }
    }
}

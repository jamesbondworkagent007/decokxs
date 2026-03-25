package com.okinc.business.defi.biz.core.dapp.interaction.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class EvmSignInfo {
    private String chainId;
    private final String facetBlackHoleAddress;
    private String gasLimit;
    private EvmSignInfoGasPrice gasPrice;
    private final Boolean isFacet;
    private Boolean needExtFee;
    private String reserveFeeRatio;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EvmSignInfo copy$default(EvmSignInfo evmSignInfo, String str, String str2, Boolean bool, EvmSignInfoGasPrice evmSignInfoGasPrice, String str3, Boolean bool2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = evmSignInfo.gasLimit;
        }
        if ((i & 2) != 0) {
            str2 = evmSignInfo.chainId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            bool = evmSignInfo.needExtFee;
        }
        Boolean bool3 = bool;
        if ((i & 8) != 0) {
            evmSignInfoGasPrice = evmSignInfo.gasPrice;
        }
        EvmSignInfoGasPrice evmSignInfoGasPrice2 = evmSignInfoGasPrice;
        if ((i & 16) != 0) {
            str3 = evmSignInfo.reserveFeeRatio;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            bool2 = evmSignInfo.isFacet;
        }
        Boolean bool4 = bool2;
        if ((i & 64) != 0) {
            str4 = evmSignInfo.facetBlackHoleAddress;
        }
        return evmSignInfo.copy(str, str5, bool3, evmSignInfoGasPrice2, str6, bool4, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.needExtFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EvmSignInfoGasPrice component4() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.reserveFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.isFacet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.facetBlackHoleAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EvmSignInfo copy(String str, String str2, Boolean bool, EvmSignInfoGasPrice evmSignInfoGasPrice, String str3, Boolean bool2, String str4) {
        return new EvmSignInfo(str, str2, bool, evmSignInfoGasPrice, str3, bool2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvmSignInfo)) {
            return false;
        }
        EvmSignInfo evmSignInfo = (EvmSignInfo) obj;
        return Intrinsics.EZpvd((Object) this.gasLimit, (Object) evmSignInfo.gasLimit) && Intrinsics.EZpvd((Object) this.chainId, (Object) evmSignInfo.chainId) && Intrinsics.EZpvd(this.needExtFee, evmSignInfo.needExtFee) && Intrinsics.EZpvd(this.gasPrice, evmSignInfo.gasPrice) && Intrinsics.EZpvd((Object) this.reserveFeeRatio, (Object) evmSignInfo.reserveFeeRatio) && Intrinsics.EZpvd(this.isFacet, evmSignInfo.isFacet) && Intrinsics.EZpvd((Object) this.facetBlackHoleAddress, (Object) evmSignInfo.facetBlackHoleAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFacetBlackHoleAddress() {
        return this.facetBlackHoleAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasLimit() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EvmSignInfoGasPrice getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getNeedExtFee() {
        return this.needExtFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReserveFeeRatio() {
        return this.reserveFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.gasLimit;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.chainId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.needExtFee;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        EvmSignInfoGasPrice evmSignInfoGasPrice = this.gasPrice;
        int iHashCode4 = evmSignInfoGasPrice == null ? 0 : evmSignInfoGasPrice.hashCode();
        String str3 = this.reserveFeeRatio;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        Boolean bool2 = this.isFacet;
        int iHashCode6 = bool2 == null ? 0 : bool2.hashCode();
        String str4 = this.facetBlackHoleAddress;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isFacet() {
        return this.isFacet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(String str) {
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasLimit(String str) {
        this.gasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasPrice(EvmSignInfoGasPrice evmSignInfoGasPrice) {
        this.gasPrice = evmSignInfoGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedExtFee(Boolean bool) {
        this.needExtFee = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReserveFeeRatio(String str) {
        this.reserveFeeRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EvmSignInfo(gasLimit=" + this.gasLimit + ", chainId=" + this.chainId + ", needExtFee=" + this.needExtFee + ", gasPrice=" + this.gasPrice + ", reserveFeeRatio=" + this.reserveFeeRatio + ", isFacet=" + this.isFacet + ", facetBlackHoleAddress=" + this.facetBlackHoleAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.dapp.interaction.bean.EvmSignInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EvmSignInfo> serializer() {
            return EvmSignInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EvmSignInfo(int i, String str, String str2, Boolean bool, EvmSignInfoGasPrice evmSignInfoGasPrice, String str3, Boolean bool2, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (9 != (i & 9)) {
            PluginExceptionsKt.throwMissingFieldException(i, 9, EvmSignInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.gasLimit = str;
        if ((i & 2) == 0) {
            this.chainId = null;
        } else {
            this.chainId = str2;
        }
        if ((i & 4) == 0) {
            this.needExtFee = Boolean.FALSE;
        } else {
            this.needExtFee = bool;
        }
        this.gasPrice = evmSignInfoGasPrice;
        if ((i & 16) == 0) {
            this.reserveFeeRatio = null;
        } else {
            this.reserveFeeRatio = str3;
        }
        if ((i & 32) == 0) {
            this.isFacet = Boolean.FALSE;
        } else {
            this.isFacet = bool2;
        }
        if ((i & 64) == 0) {
            this.facetBlackHoleAddress = null;
        } else {
            this.facetBlackHoleAddress = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EvmSignInfo evmSignInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, evmSignInfo.gasLimit);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || evmSignInfo.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, evmSignInfo.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(evmSignInfo.needExtFee, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, evmSignInfo.needExtFee);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, EvmSignInfoGasPrice$$serializer.INSTANCE, evmSignInfo.gasPrice);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || evmSignInfo.reserveFeeRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, evmSignInfo.reserveFeeRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(evmSignInfo.isFacet, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, evmSignInfo.isFacet);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && evmSignInfo.facetBlackHoleAddress == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, evmSignInfo.facetBlackHoleAddress);
    }

    public EvmSignInfo(String str, String str2, Boolean bool, EvmSignInfoGasPrice evmSignInfoGasPrice, String str3, Boolean bool2, String str4) {
        this.gasLimit = str;
        this.chainId = str2;
        this.needExtFee = bool;
        this.gasPrice = evmSignInfoGasPrice;
        this.reserveFeeRatio = str3;
        this.isFacet = bool2;
        this.facetBlackHoleAddress = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002d: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000e: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r13v0 java.lang.Boolean))
  (r14v0 com.okinc.business.defi.biz.core.dapp.interaction.bean.EvmSignInfoGasPrice)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001e: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r16v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.business.defi.biz.core.dapp.interaction.bean.EvmSignInfoGasPrice, java.lang.String, java.lang.Boolean, java.lang.String):void (m)] (LINE:14) call: com.okinc.business.defi.biz.core.dapp.interaction.bean.EvmSignInfo.<init>(java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.business.defi.biz.core.dapp.interaction.bean.EvmSignInfoGasPrice, java.lang.String, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ EvmSignInfo(String str, String str2, Boolean bool, EvmSignInfoGasPrice evmSignInfoGasPrice, String str3, Boolean bool2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Boolean.FALSE : bool, evmSignInfoGasPrice, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? Boolean.FALSE : bool2, (i & 64) != 0 ? null : str4);
    }
}

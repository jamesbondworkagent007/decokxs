package com.okinc.business.web3pay.lib.features.uop.model;

import com.okinc.business.web3pay.lib.core.model.GasLimit;
import com.okinc.business.web3pay.lib.core.model.GasLimit$$serializer;
import com.okinc.business.web3pay.lib.core.model.GasPrice;
import com.okinc.business.web3pay.lib.core.model.GasPrice$$serializer;
import com.okinc.business.web3pay.lib.core.model.GasToken;
import com.okinc.business.web3pay.lib.core.model.GasToken$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CreateConvertUopRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String bidPx;
    private final String chainIndex;
    private final GasLimit gasLimit;
    private final GasPrice gasPrice;
    private final GasToken gasToken;
    private final int projectId;
    private final String quoteId;
    private final String toAddress;
    private final String toTokenCoinTypeNo;
    private final String tokenAddress;
    private final String tokenAmount;
    private final String tokenCoinTypeNo;
    private final int tokenDecimal;
    private final String travelRuleId;
    private final String usdAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasToken component11() {
        return this.gasToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasLimit component12() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasPrice component13() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.toTokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.bidPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateConvertUopRequest copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, String str6, @NotNull String str7, @NotNull String str8, int i2, GasToken gasToken, GasLimit gasLimit, GasPrice gasPrice, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new CreateConvertUopRequest(str, i, str2, str3, str4, str5, str6, str7, str8, i2, gasToken, gasLimit, gasPrice, str9, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateConvertUopRequest)) {
            return false;
        }
        CreateConvertUopRequest createConvertUopRequest = (CreateConvertUopRequest) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) createConvertUopRequest.chainIndex) && this.projectId == createConvertUopRequest.projectId && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) createConvertUopRequest.tokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) createConvertUopRequest.tokenAmount) && Intrinsics.EZpvd((Object) this.toTokenCoinTypeNo, (Object) createConvertUopRequest.toTokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.quoteId, (Object) createConvertUopRequest.quoteId) && Intrinsics.EZpvd((Object) this.bidPx, (Object) createConvertUopRequest.bidPx) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) createConvertUopRequest.usdAmount) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) createConvertUopRequest.tokenAddress) && this.tokenDecimal == createConvertUopRequest.tokenDecimal && Intrinsics.EZpvd(this.gasToken, createConvertUopRequest.gasToken) && Intrinsics.EZpvd(this.gasLimit, createConvertUopRequest.gasLimit) && Intrinsics.EZpvd(this.gasPrice, createConvertUopRequest.gasPrice) && Intrinsics.EZpvd((Object) this.toAddress, (Object) createConvertUopRequest.toAddress) && Intrinsics.EZpvd((Object) this.travelRuleId, (Object) createConvertUopRequest.travelRuleId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBidPx() {
        return this.bidPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasLimit getGasLimit() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasPrice getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasToken getGasToken() {
        return this.gasToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProjectId() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteId() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAddress() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenCoinTypeNo() {
        return this.toTokenCoinTypeNo;
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
    public final String getTokenCoinTypeNo() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTokenDecimal() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTravelRuleId() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdAmount() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainIndex.hashCode();
        int iHashCode2 = Integer.hashCode(this.projectId);
        int iHashCode3 = this.tokenCoinTypeNo.hashCode();
        int iHashCode4 = this.tokenAmount.hashCode();
        int iHashCode5 = this.toTokenCoinTypeNo.hashCode();
        String str = this.quoteId;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.bidPx;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        int iHashCode8 = this.usdAmount.hashCode();
        int iHashCode9 = this.tokenAddress.hashCode();
        int iHashCode10 = Integer.hashCode(this.tokenDecimal);
        GasToken gasToken = this.gasToken;
        int iHashCode11 = gasToken == null ? 0 : gasToken.hashCode();
        GasLimit gasLimit = this.gasLimit;
        int iHashCode12 = gasLimit == null ? 0 : gasLimit.hashCode();
        GasPrice gasPrice = this.gasPrice;
        int iHashCode13 = gasPrice == null ? 0 : gasPrice.hashCode();
        String str3 = this.toAddress;
        int iHashCode14 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.travelRuleId;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str4 == null ? 0 : str4.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateConvertUopRequest(chainIndex=" + this.chainIndex + ", projectId=" + this.projectId + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", tokenAmount=" + this.tokenAmount + ", toTokenCoinTypeNo=" + this.toTokenCoinTypeNo + ", quoteId=" + this.quoteId + ", bidPx=" + this.bidPx + ", usdAmount=" + this.usdAmount + ", tokenAddress=" + this.tokenAddress + ", tokenDecimal=" + this.tokenDecimal + ", gasToken=" + this.gasToken + ", gasLimit=" + this.gasLimit + ", gasPrice=" + this.gasPrice + ", toAddress=" + this.toAddress + ", travelRuleId=" + this.travelRuleId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.uop.model.CreateConvertUopRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateConvertUopRequest> serializer() {
            return CreateConvertUopRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateConvertUopRequest(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i3, GasToken gasToken, GasLimit gasLimit, GasPrice gasPrice, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if (927 != (i & 927)) {
            PluginExceptionsKt.throwMissingFieldException(i, 927, CreateConvertUopRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = str;
        this.projectId = i2;
        this.tokenCoinTypeNo = str2;
        this.tokenAmount = str3;
        this.toTokenCoinTypeNo = str4;
        if ((i & 32) == 0) {
            this.quoteId = null;
        } else {
            this.quoteId = str5;
        }
        if ((i & 64) == 0) {
            this.bidPx = null;
        } else {
            this.bidPx = str6;
        }
        this.usdAmount = str7;
        this.tokenAddress = str8;
        this.tokenDecimal = i3;
        if ((i & 1024) == 0) {
            this.gasToken = null;
        } else {
            this.gasToken = gasToken;
        }
        if ((i & 2048) == 0) {
            this.gasLimit = null;
        } else {
            this.gasLimit = gasLimit;
        }
        if ((i & 4096) == 0) {
            this.gasPrice = null;
        } else {
            this.gasPrice = gasPrice;
        }
        if ((i & 8192) == 0) {
            this.toAddress = null;
        } else {
            this.toAddress = str9;
        }
        if ((i & 16384) == 0) {
            this.travelRuleId = null;
        } else {
            this.travelRuleId = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(CreateConvertUopRequest createConvertUopRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, createConvertUopRequest.chainIndex);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, createConvertUopRequest.projectId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, createConvertUopRequest.tokenCoinTypeNo);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, createConvertUopRequest.tokenAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, createConvertUopRequest.toTokenCoinTypeNo);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || createConvertUopRequest.quoteId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, createConvertUopRequest.quoteId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || createConvertUopRequest.bidPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, createConvertUopRequest.bidPx);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, createConvertUopRequest.usdAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, createConvertUopRequest.tokenAddress);
        compositeEncoder.encodeIntElement(serialDescriptor, 9, createConvertUopRequest.tokenDecimal);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || createConvertUopRequest.gasToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, GasToken$$serializer.INSTANCE, createConvertUopRequest.gasToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || createConvertUopRequest.gasLimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, GasLimit$$serializer.INSTANCE, createConvertUopRequest.gasLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || createConvertUopRequest.gasPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, GasPrice$$serializer.INSTANCE, createConvertUopRequest.gasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || createConvertUopRequest.toAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, createConvertUopRequest.toAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && createConvertUopRequest.travelRuleId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, createConvertUopRequest.travelRuleId);
    }

    public CreateConvertUopRequest(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, String str6, @NotNull String str7, @NotNull String str8, int i2, GasToken gasToken, GasLimit gasLimit, GasPrice gasPrice, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.chainIndex = str;
        this.projectId = i;
        this.tokenCoinTypeNo = str2;
        this.tokenAmount = str3;
        this.toTokenCoinTypeNo = str4;
        this.quoteId = str5;
        this.bidPx = str6;
        this.usdAmount = str7;
        this.tokenAddress = str8;
        this.tokenDecimal = i2;
        this.gasToken = gasToken;
        this.gasLimit = gasLimit;
        this.gasPrice = gasPrice;
        this.toAddress = str9;
        this.travelRuleId = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0050: CONSTRUCTOR 
  (r20v0 java.lang.String)
  (r21v0 int)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r35v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 int)
  (wrap:com.okinc.business.web3pay.lib.core.model.GasToken:?: TERNARY null = ((wrap:int:0x0013: ARITH (r35v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.lib.core.model.GasToken) : (r30v0 com.okinc.business.web3pay.lib.core.model.GasToken))
  (wrap:com.okinc.business.web3pay.lib.core.model.GasLimit:?: TERNARY null = ((wrap:int:0x001b: ARITH (r35v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.lib.core.model.GasLimit) : (r31v0 com.okinc.business.web3pay.lib.core.model.GasLimit))
  (wrap:com.okinc.business.web3pay.lib.core.model.GasPrice:?: TERNARY null = ((wrap:int:0x0023: ARITH (r35v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.lib.core.model.GasPrice) : (r32v0 com.okinc.business.web3pay.lib.core.model.GasPrice))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r35v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r35v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.okinc.business.web3pay.lib.core.model.GasToken, com.okinc.business.web3pay.lib.core.model.GasLimit, com.okinc.business.web3pay.lib.core.model.GasPrice, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.business.web3pay.lib.features.uop.model.CreateConvertUopRequest.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.okinc.business.web3pay.lib.core.model.GasToken, com.okinc.business.web3pay.lib.core.model.GasLimit, com.okinc.business.web3pay.lib.core.model.GasPrice, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CreateConvertUopRequest(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, GasToken gasToken, GasLimit gasLimit, GasPrice gasPrice, String str9, String str10, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, str4, (i3 & 32) != 0 ? null : str5, (i3 & 64) != 0 ? null : str6, str7, str8, i2, (i3 & 1024) != 0 ? null : gasToken, (i3 & 2048) != 0 ? null : gasLimit, (i3 & 4096) != 0 ? null : gasPrice, (i3 & 8192) != 0 ? null : str9, (i3 & 16384) != 0 ? null : str10);
    }
}

package com.okinc.business.invest_biz.data.bean.request;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestSubscriptionReceiveReq {
    private final String accountId;
    private final String address;
    private final String inputAmount;
    private final String inputTokenAddress;
    private final Integer investmentCategory;
    private final long investmentId;
    private final Boolean isSingle;
    private String slippage;
    private final Long stakeId;
    private final Integer tickLower;
    private final Integer tickUpper;
    private final String tokenDecimal;
    private final String tokenId;
    private final Integer transactionType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @SerialName("accountId")
    public static /* synthetic */ void getAccountId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.tickUpper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.investmentCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component13() {
        return this.transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component14() {
        return this.stakeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.inputAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.inputTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.isSingle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.tickLower;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestSubscriptionReceiveReq copy(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, @NotNull String str5, Boolean bool, @NotNull String str6, Integer num, Integer num2, String str7, Integer num3, Integer num4, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new InvestSubscriptionReceiveReq(str, str2, j, str3, str4, str5, bool, str6, num, num2, str7, num3, num4, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestSubscriptionReceiveReq)) {
            return false;
        }
        InvestSubscriptionReceiveReq investSubscriptionReceiveReq = (InvestSubscriptionReceiveReq) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) investSubscriptionReceiveReq.accountId) && Intrinsics.EZpvd((Object) this.inputAmount, (Object) investSubscriptionReceiveReq.inputAmount) && this.investmentId == investSubscriptionReceiveReq.investmentId && Intrinsics.EZpvd((Object) this.inputTokenAddress, (Object) investSubscriptionReceiveReq.inputTokenAddress) && Intrinsics.EZpvd((Object) this.address, (Object) investSubscriptionReceiveReq.address) && Intrinsics.EZpvd((Object) this.tokenDecimal, (Object) investSubscriptionReceiveReq.tokenDecimal) && Intrinsics.EZpvd(this.isSingle, investSubscriptionReceiveReq.isSingle) && Intrinsics.EZpvd((Object) this.slippage, (Object) investSubscriptionReceiveReq.slippage) && Intrinsics.EZpvd(this.tickLower, investSubscriptionReceiveReq.tickLower) && Intrinsics.EZpvd(this.tickUpper, investSubscriptionReceiveReq.tickUpper) && Intrinsics.EZpvd((Object) this.tokenId, (Object) investSubscriptionReceiveReq.tokenId) && Intrinsics.EZpvd(this.investmentCategory, investSubscriptionReceiveReq.investmentCategory) && Intrinsics.EZpvd(this.transactionType, investSubscriptionReceiveReq.transactionType) && Intrinsics.EZpvd(this.stakeId, investSubscriptionReceiveReq.stakeId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInputAmount() {
        return this.inputAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInputTokenAddress() {
        return this.inputTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInvestmentCategory() {
        return this.investmentCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getStakeId() {
        return this.stakeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTickLower() {
        return this.tickLower;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTickUpper() {
        return this.tickUpper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenDecimal() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenId() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTransactionType() {
        return this.transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountId.hashCode();
        int iHashCode2 = this.inputAmount.hashCode();
        int iHashCode3 = Long.hashCode(this.investmentId);
        int iHashCode4 = this.inputTokenAddress.hashCode();
        int iHashCode5 = this.address.hashCode();
        int iHashCode6 = this.tokenDecimal.hashCode();
        Boolean bool = this.isSingle;
        int iHashCode7 = bool == null ? 0 : bool.hashCode();
        int iHashCode8 = this.slippage.hashCode();
        Integer num = this.tickLower;
        int iHashCode9 = num == null ? 0 : num.hashCode();
        Integer num2 = this.tickUpper;
        int iHashCode10 = num2 == null ? 0 : num2.hashCode();
        String str = this.tokenId;
        int iHashCode11 = str == null ? 0 : str.hashCode();
        Integer num3 = this.investmentCategory;
        int iHashCode12 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.transactionType;
        int iHashCode13 = num4 == null ? 0 : num4.hashCode();
        Long l = this.stakeId;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (l != null ? l.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isSingle() {
        return this.isSingle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slippage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestSubscriptionReceiveReq(accountId=" + this.accountId + ", inputAmount=" + this.inputAmount + ", investmentId=" + this.investmentId + ", inputTokenAddress=" + this.inputTokenAddress + ", address=" + this.address + ", tokenDecimal=" + this.tokenDecimal + ", isSingle=" + this.isSingle + ", slippage=" + this.slippage + ", tickLower=" + this.tickLower + ", tickUpper=" + this.tickUpper + ", tokenId=" + this.tokenId + ", investmentCategory=" + this.investmentCategory + ", transactionType=" + this.transactionType + ", stakeId=" + this.stakeId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionReceiveReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestSubscriptionReceiveReq> serializer() {
            return InvestSubscriptionReceiveReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestSubscriptionReceiveReq(int i, String str, String str2, long j, String str3, String str4, String str5, Boolean bool, String str6, Integer num, Integer num2, String str7, Integer num3, Integer num4, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, InvestSubscriptionReceiveReq$$serializer.INSTANCE.getDescriptor());
        }
        this.accountId = str;
        this.inputAmount = str2;
        this.investmentId = j;
        this.inputTokenAddress = str3;
        this.address = str4;
        this.tokenDecimal = str5;
        if ((i & 64) == 0) {
            this.isSingle = null;
        } else {
            this.isSingle = bool;
        }
        this.slippage = (i & 128) == 0 ? "" : str6;
        if ((i & 256) == 0) {
            this.tickLower = null;
        } else {
            this.tickLower = num;
        }
        if ((i & 512) == 0) {
            this.tickUpper = null;
        } else {
            this.tickUpper = num2;
        }
        if ((i & 1024) == 0) {
            this.tokenId = null;
        } else {
            this.tokenId = str7;
        }
        if ((i & 2048) == 0) {
            this.investmentCategory = null;
        } else {
            this.investmentCategory = num3;
        }
        if ((i & 4096) == 0) {
            this.transactionType = null;
        } else {
            this.transactionType = num4;
        }
        if ((i & 8192) == 0) {
            this.stakeId = null;
        } else {
            this.stakeId = l;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestSubscriptionReceiveReq investSubscriptionReceiveReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, investSubscriptionReceiveReq.accountId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, investSubscriptionReceiveReq.inputAmount);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, investSubscriptionReceiveReq.investmentId);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, investSubscriptionReceiveReq.inputTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, investSubscriptionReceiveReq.address);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, investSubscriptionReceiveReq.tokenDecimal);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investSubscriptionReceiveReq.isSingle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, investSubscriptionReceiveReq.isSingle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) investSubscriptionReceiveReq.slippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, investSubscriptionReceiveReq.slippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || investSubscriptionReceiveReq.tickLower != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, investSubscriptionReceiveReq.tickLower);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || investSubscriptionReceiveReq.tickUpper != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, investSubscriptionReceiveReq.tickUpper);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || investSubscriptionReceiveReq.tokenId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, investSubscriptionReceiveReq.tokenId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || investSubscriptionReceiveReq.investmentCategory != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, investSubscriptionReceiveReq.investmentCategory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || investSubscriptionReceiveReq.transactionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, investSubscriptionReceiveReq.transactionType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && investSubscriptionReceiveReq.stakeId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, LongSerializer.INSTANCE, investSubscriptionReceiveReq.stakeId);
    }

    public InvestSubscriptionReceiveReq(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, @NotNull String str5, Boolean bool, @NotNull String str6, Integer num, Integer num2, String str7, Integer num3, Integer num4, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.accountId = str;
        this.inputAmount = str2;
        this.investmentId = j;
        this.inputTokenAddress = str3;
        this.address = str4;
        this.tokenDecimal = str5;
        this.isSingle = bool;
        this.slippage = str6;
        this.tickLower = num;
        this.tickUpper = num2;
        this.tokenId = str7;
        this.investmentCategory = num3;
        this.transactionType = num4;
        this.stakeId = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0056: CONSTRUCTOR 
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 long)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r27v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r35v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0015: ARITH (r35v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r29v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r30v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r35v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002d: ARITH (r35v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r32v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0036: ARITH (r35v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r33v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x003f: ARITH (r35v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r34v0 java.lang.Long))
 A[MD:(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Long):void (m)] (LINE:11) call: com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionReceiveReq.<init>(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Long):void type: THIS */
    public /* synthetic */ InvestSubscriptionReceiveReq(String str, String str2, long j, String str3, String str4, String str5, Boolean bool, String str6, Integer num, Integer num2, String str7, Integer num3, Integer num4, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, str4, str5, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? null : num, (i & 512) != 0 ? null : num2, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : num3, (i & 4096) != 0 ? null : num4, (i & 8192) != 0 ? null : l);
    }
}

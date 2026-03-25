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
public final class InvestRedeemReceiveReq {
    private final String accountId;
    private final String address;
    private final String inputTokenAmount;
    private final int investmentCategory;
    private final long investmentId;
    private final Boolean isSingle;
    private final String outputTokenAddress;
    private final String outputTokenDecimal;
    private final String pubkey;
    private final String redeemId;
    private final Boolean redeemNeedUnbond;
    private final String redeemPercent;
    private String slippage;
    private final Long stakeId;
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
    public final String component10() {
        return this.redeemId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component11() {
        return this.transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.redeemPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component13() {
        return this.redeemNeedUnbond;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.pubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component15() {
        return this.stakeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.inputTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.investmentCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.outputTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.outputTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.isSingle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestRedeemReceiveReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, int i, String str4, String str5, Boolean bool, @NotNull String str6, @NotNull String str7, Integer num, @NotNull String str8, Boolean bool2, String str9, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new InvestRedeemReceiveReq(str, str2, str3, j, i, str4, str5, bool, str6, str7, num, str8, bool2, str9, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestRedeemReceiveReq)) {
            return false;
        }
        InvestRedeemReceiveReq investRedeemReceiveReq = (InvestRedeemReceiveReq) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) investRedeemReceiveReq.accountId) && Intrinsics.EZpvd((Object) this.address, (Object) investRedeemReceiveReq.address) && Intrinsics.EZpvd((Object) this.inputTokenAmount, (Object) investRedeemReceiveReq.inputTokenAmount) && this.investmentId == investRedeemReceiveReq.investmentId && this.investmentCategory == investRedeemReceiveReq.investmentCategory && Intrinsics.EZpvd((Object) this.outputTokenAddress, (Object) investRedeemReceiveReq.outputTokenAddress) && Intrinsics.EZpvd((Object) this.outputTokenDecimal, (Object) investRedeemReceiveReq.outputTokenDecimal) && Intrinsics.EZpvd(this.isSingle, investRedeemReceiveReq.isSingle) && Intrinsics.EZpvd((Object) this.slippage, (Object) investRedeemReceiveReq.slippage) && Intrinsics.EZpvd((Object) this.redeemId, (Object) investRedeemReceiveReq.redeemId) && Intrinsics.EZpvd(this.transactionType, investRedeemReceiveReq.transactionType) && Intrinsics.EZpvd((Object) this.redeemPercent, (Object) investRedeemReceiveReq.redeemPercent) && Intrinsics.EZpvd(this.redeemNeedUnbond, investRedeemReceiveReq.redeemNeedUnbond) && Intrinsics.EZpvd((Object) this.pubkey, (Object) investRedeemReceiveReq.pubkey) && Intrinsics.EZpvd(this.stakeId, investRedeemReceiveReq.stakeId);
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
    public final String getInputTokenAmount() {
        return this.inputTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getInvestmentCategory() {
        return this.investmentCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOutputTokenAddress() {
        return this.outputTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOutputTokenDecimal() {
        return this.outputTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPubkey() {
        return this.pubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRedeemId() {
        return this.redeemId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getRedeemNeedUnbond() {
        return this.redeemNeedUnbond;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRedeemPercent() {
        return this.redeemPercent;
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
    public final Integer getTransactionType() {
        return this.transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountId.hashCode();
        int iHashCode2 = this.address.hashCode();
        int iHashCode3 = this.inputTokenAmount.hashCode();
        int iHashCode4 = Long.hashCode(this.investmentId);
        int iHashCode5 = Integer.hashCode(this.investmentCategory);
        String str = this.outputTokenAddress;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.outputTokenDecimal;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.isSingle;
        int iHashCode8 = bool == null ? 0 : bool.hashCode();
        int iHashCode9 = this.slippage.hashCode();
        int iHashCode10 = this.redeemId.hashCode();
        Integer num = this.transactionType;
        int iHashCode11 = num == null ? 0 : num.hashCode();
        int iHashCode12 = this.redeemPercent.hashCode();
        Boolean bool2 = this.redeemNeedUnbond;
        int iHashCode13 = bool2 == null ? 0 : bool2.hashCode();
        String str3 = this.pubkey;
        int iHashCode14 = str3 == null ? 0 : str3.hashCode();
        Long l = this.stakeId;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (l == null ? 0 : l.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBoostTrade() {
        return this.stakeId != null;
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
        return "InvestRedeemReceiveReq(accountId=" + this.accountId + ", address=" + this.address + ", inputTokenAmount=" + this.inputTokenAmount + ", investmentId=" + this.investmentId + ", investmentCategory=" + this.investmentCategory + ", outputTokenAddress=" + this.outputTokenAddress + ", outputTokenDecimal=" + this.outputTokenDecimal + ", isSingle=" + this.isSingle + ", slippage=" + this.slippage + ", redeemId=" + this.redeemId + ", transactionType=" + this.transactionType + ", redeemPercent=" + this.redeemPercent + ", redeemNeedUnbond=" + this.redeemNeedUnbond + ", pubkey=" + this.pubkey + ", stakeId=" + this.stakeId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.InvestRedeemReceiveReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestRedeemReceiveReq> serializer() {
            return InvestRedeemReceiveReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestRedeemReceiveReq(int i, String str, String str2, String str3, long j, int i2, String str4, String str5, Boolean bool, String str6, String str7, Integer num, String str8, Boolean bool2, String str9, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, InvestRedeemReceiveReq$$serializer.INSTANCE.getDescriptor());
        }
        this.accountId = str;
        this.address = str2;
        this.inputTokenAmount = str3;
        this.investmentId = j;
        this.investmentCategory = i2;
        if ((i & 32) == 0) {
            this.outputTokenAddress = "";
        } else {
            this.outputTokenAddress = str4;
        }
        if ((i & 64) == 0) {
            this.outputTokenDecimal = "";
        } else {
            this.outputTokenDecimal = str5;
        }
        if ((i & 128) == 0) {
            this.isSingle = null;
        } else {
            this.isSingle = bool;
        }
        if ((i & 256) == 0) {
            this.slippage = "";
        } else {
            this.slippage = str6;
        }
        if ((i & 512) == 0) {
            this.redeemId = "";
        } else {
            this.redeemId = str7;
        }
        if ((i & 1024) == 0) {
            this.transactionType = null;
        } else {
            this.transactionType = num;
        }
        if ((i & 2048) == 0) {
            this.redeemPercent = "";
        } else {
            this.redeemPercent = str8;
        }
        if ((i & 4096) == 0) {
            this.redeemNeedUnbond = null;
        } else {
            this.redeemNeedUnbond = bool2;
        }
        if ((i & 8192) == 0) {
            this.pubkey = null;
        } else {
            this.pubkey = str9;
        }
        if ((i & 16384) == 0) {
            this.stakeId = null;
        } else {
            this.stakeId = l;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestRedeemReceiveReq investRedeemReceiveReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, investRedeemReceiveReq.accountId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, investRedeemReceiveReq.address);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, investRedeemReceiveReq.inputTokenAmount);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, investRedeemReceiveReq.investmentId);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, investRedeemReceiveReq.investmentCategory);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) investRedeemReceiveReq.outputTokenAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, investRedeemReceiveReq.outputTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investRedeemReceiveReq.outputTokenDecimal, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, investRedeemReceiveReq.outputTokenDecimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || investRedeemReceiveReq.isSingle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, investRedeemReceiveReq.isSingle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) investRedeemReceiveReq.slippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, investRedeemReceiveReq.slippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) investRedeemReceiveReq.redeemId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, investRedeemReceiveReq.redeemId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || investRedeemReceiveReq.transactionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, investRedeemReceiveReq.transactionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) investRedeemReceiveReq.redeemPercent, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, investRedeemReceiveReq.redeemPercent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || investRedeemReceiveReq.redeemNeedUnbond != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, investRedeemReceiveReq.redeemNeedUnbond);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || investRedeemReceiveReq.pubkey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, investRedeemReceiveReq.pubkey);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && investRedeemReceiveReq.stakeId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, LongSerializer.INSTANCE, investRedeemReceiveReq.stakeId);
    }

    public InvestRedeemReceiveReq(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, int i, String str4, String str5, Boolean bool, @NotNull String str6, @NotNull String str7, Integer num, @NotNull String str8, Boolean bool2, String str9, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.accountId = str;
        this.address = str2;
        this.inputTokenAmount = str3;
        this.investmentId = j;
        this.investmentCategory = i;
        this.outputTokenAddress = str4;
        this.outputTokenDecimal = str5;
        this.isSingle = bool;
        this.slippage = str6;
        this.redeemId = str7;
        this.transactionType = num;
        this.redeemPercent = str8;
        this.redeemNeedUnbond = bool2;
        this.pubkey = str9;
        this.stakeId = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0065: CONSTRUCTOR 
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 long)
  (r26v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r37v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r37v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r29v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r37v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r37v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002d: ARITH (r37v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r32v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r37v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003e: ARITH (r37v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r34v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r37v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0050: ARITH (r37v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r36v0 java.lang.Long))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Long):void (m)] (LINE:10) call: com.okinc.business.invest_biz.data.bean.request.InvestRedeemReceiveReq.<init>(java.lang.String, java.lang.String, java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Long):void type: THIS */
    public /* synthetic */ InvestRedeemReceiveReq(String str, String str2, String str3, long j, int i, String str4, String str5, Boolean bool, String str6, String str7, Integer num, String str8, Boolean bool2, String str9, Long l, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j, i, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? null : bool, (i2 & 256) != 0 ? "" : str6, (i2 & 512) != 0 ? "" : str7, (i2 & 1024) != 0 ? null : num, (i2 & 2048) != 0 ? "" : str8, (i2 & 4096) != 0 ? null : bool2, (i2 & 8192) != 0 ? null : str9, (i2 & 16384) != 0 ? null : l);
    }
}

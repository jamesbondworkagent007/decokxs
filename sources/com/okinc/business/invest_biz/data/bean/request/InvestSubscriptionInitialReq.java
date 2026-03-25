package com.okinc.business.invest_biz.data.bean.request;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestSubscriptionInitialReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String accountId;
    private final String address;
    private final String inputTokenAddress;
    private final Integer investmentCategory;
    private final long investmentId;
    private final boolean isSingle;
    private final Long stakeId;
    private final String tokenId;
    private final Integer transactionType;

    @SerialName("accountId")
    public static /* synthetic */ void getAccountId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isSingle;
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
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.investmentCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component9() {
        return this.stakeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestSubscriptionInitialReq copy(long j, @NotNull String str, boolean z, @NotNull String str2, @NotNull String str3, String str4, Integer num, Integer num2, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new InvestSubscriptionInitialReq(j, str, z, str2, str3, str4, num, num2, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestSubscriptionInitialReq)) {
            return false;
        }
        InvestSubscriptionInitialReq investSubscriptionInitialReq = (InvestSubscriptionInitialReq) obj;
        return this.investmentId == investSubscriptionInitialReq.investmentId && Intrinsics.EZpvd((Object) this.accountId, (Object) investSubscriptionInitialReq.accountId) && this.isSingle == investSubscriptionInitialReq.isSingle && Intrinsics.EZpvd((Object) this.inputTokenAddress, (Object) investSubscriptionInitialReq.inputTokenAddress) && Intrinsics.EZpvd((Object) this.address, (Object) investSubscriptionInitialReq.address) && Intrinsics.EZpvd((Object) this.tokenId, (Object) investSubscriptionInitialReq.tokenId) && Intrinsics.EZpvd(this.investmentCategory, investSubscriptionInitialReq.investmentCategory) && Intrinsics.EZpvd(this.transactionType, investSubscriptionInitialReq.transactionType) && Intrinsics.EZpvd(this.stakeId, investSubscriptionInitialReq.stakeId);
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
    public final Long getStakeId() {
        return this.stakeId;
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
        int iHashCode = Long.hashCode(this.investmentId);
        int iHashCode2 = this.accountId.hashCode();
        int iHashCode3 = Boolean.hashCode(this.isSingle);
        int iHashCode4 = this.inputTokenAddress.hashCode();
        int iHashCode5 = this.address.hashCode();
        String str = this.tokenId;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        Integer num = this.investmentCategory;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        Integer num2 = this.transactionType;
        int iHashCode8 = num2 == null ? 0 : num2.hashCode();
        Long l = this.stakeId;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (l != null ? l.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSingle() {
        return this.isSingle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestSubscriptionInitialReq(investmentId=" + this.investmentId + ", accountId=" + this.accountId + ", isSingle=" + this.isSingle + ", inputTokenAddress=" + this.inputTokenAddress + ", address=" + this.address + ", tokenId=" + this.tokenId + ", investmentCategory=" + this.investmentCategory + ", transactionType=" + this.transactionType + ", stakeId=" + this.stakeId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionInitialReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestSubscriptionInitialReq> serializer() {
            return InvestSubscriptionInitialReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestSubscriptionInitialReq(int i, long j, String str, boolean z, String str2, String str3, String str4, Integer num, Integer num2, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if (27 != (i & 27)) {
            PluginExceptionsKt.throwMissingFieldException(i, 27, InvestSubscriptionInitialReq$$serializer.INSTANCE.getDescriptor());
        }
        this.investmentId = j;
        this.accountId = str;
        if ((i & 4) == 0) {
            this.isSingle = true;
        } else {
            this.isSingle = z;
        }
        this.inputTokenAddress = str2;
        this.address = str3;
        if ((i & 32) == 0) {
            this.tokenId = null;
        } else {
            this.tokenId = str4;
        }
        if ((i & 64) == 0) {
            this.investmentCategory = null;
        } else {
            this.investmentCategory = num;
        }
        if ((i & 128) == 0) {
            this.transactionType = null;
        } else {
            this.transactionType = num2;
        }
        if ((i & 256) == 0) {
            this.stakeId = null;
        } else {
            this.stakeId = l;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestSubscriptionInitialReq investSubscriptionInitialReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, investSubscriptionInitialReq.investmentId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, investSubscriptionInitialReq.accountId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !investSubscriptionInitialReq.isSingle) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, investSubscriptionInitialReq.isSingle);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, investSubscriptionInitialReq.inputTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, investSubscriptionInitialReq.address);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investSubscriptionInitialReq.tokenId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, investSubscriptionInitialReq.tokenId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investSubscriptionInitialReq.investmentCategory != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, investSubscriptionInitialReq.investmentCategory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || investSubscriptionInitialReq.transactionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, investSubscriptionInitialReq.transactionType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && investSubscriptionInitialReq.stakeId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, investSubscriptionInitialReq.stakeId);
    }

    public InvestSubscriptionInitialReq(long j, @NotNull String str, boolean z, @NotNull String str2, @NotNull String str3, String str4, Integer num, Integer num2, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.investmentId = j;
        this.accountId = str;
        this.isSingle = z;
        this.inputTokenAddress = str2;
        this.address = str3;
        this.tokenId = str4;
        this.investmentCategory = num;
        this.transactionType = num2;
        this.stakeId = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (r14v0 long)
  (r16v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r17v0 boolean))
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0014: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r21v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001c: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r22v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0024: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r23v0 java.lang.Long))
 A[MD:(long, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Long):void (m)] (LINE:31) call: com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionInitialReq.<init>(long, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Long):void type: THIS */
    public /* synthetic */ InvestSubscriptionInitialReq(long j, String str, boolean z, String str2, String str3, String str4, Integer num, Integer num2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, (i & 4) != 0 ? true : z, str2, str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : l);
    }
}

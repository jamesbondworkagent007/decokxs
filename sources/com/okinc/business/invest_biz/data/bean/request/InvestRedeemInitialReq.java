package com.okinc.business.invest_biz.data.bean.request;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestRedeemInitialReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String address;
    private final int investmentCategory;
    private final long investmentId;
    private final boolean isSingle;
    private final String outputTokenAddress;
    private final String pubkey;
    private final String redeemId;
    private final Integer transactionType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.outputTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isSingle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.investmentCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.pubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.redeemId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestRedeemInitialReq copy(long j, @NotNull String str, @NotNull String str2, boolean z, int i, Integer num, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new InvestRedeemInitialReq(j, str, str2, z, i, num, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestRedeemInitialReq)) {
            return false;
        }
        InvestRedeemInitialReq investRedeemInitialReq = (InvestRedeemInitialReq) obj;
        return this.investmentId == investRedeemInitialReq.investmentId && Intrinsics.EZpvd((Object) this.address, (Object) investRedeemInitialReq.address) && Intrinsics.EZpvd((Object) this.outputTokenAddress, (Object) investRedeemInitialReq.outputTokenAddress) && this.isSingle == investRedeemInitialReq.isSingle && this.investmentCategory == investRedeemInitialReq.investmentCategory && Intrinsics.EZpvd(this.transactionType, investRedeemInitialReq.transactionType) && Intrinsics.EZpvd((Object) this.pubkey, (Object) investRedeemInitialReq.pubkey) && Intrinsics.EZpvd((Object) this.redeemId, (Object) investRedeemInitialReq.redeemId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
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
    public final String getPubkey() {
        return this.pubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRedeemId() {
        return this.redeemId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTransactionType() {
        return this.transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.investmentId);
        int iHashCode2 = this.address.hashCode();
        int iHashCode3 = this.outputTokenAddress.hashCode();
        int iHashCode4 = Boolean.hashCode(this.isSingle);
        int iHashCode5 = Integer.hashCode(this.investmentCategory);
        Integer num = this.transactionType;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        String str = this.pubkey;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.redeemId;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSingle() {
        return this.isSingle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestRedeemInitialReq(investmentId=" + this.investmentId + ", address=" + this.address + ", outputTokenAddress=" + this.outputTokenAddress + ", isSingle=" + this.isSingle + ", investmentCategory=" + this.investmentCategory + ", transactionType=" + this.transactionType + ", pubkey=" + this.pubkey + ", redeemId=" + this.redeemId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.InvestRedeemInitialReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestRedeemInitialReq> serializer() {
            return InvestRedeemInitialReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestRedeemInitialReq(int i, long j, String str, String str2, boolean z, int i2, Integer num, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (23 != (i & 23)) {
            PluginExceptionsKt.throwMissingFieldException(i, 23, InvestRedeemInitialReq$$serializer.INSTANCE.getDescriptor());
        }
        this.investmentId = j;
        this.address = str;
        this.outputTokenAddress = str2;
        if ((i & 8) == 0) {
            this.isSingle = true;
        } else {
            this.isSingle = z;
        }
        this.investmentCategory = i2;
        if ((i & 32) == 0) {
            this.transactionType = null;
        } else {
            this.transactionType = num;
        }
        if ((i & 64) == 0) {
            this.pubkey = null;
        } else {
            this.pubkey = str3;
        }
        if ((i & 128) == 0) {
            this.redeemId = null;
        } else {
            this.redeemId = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestRedeemInitialReq investRedeemInitialReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, investRedeemInitialReq.investmentId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, investRedeemInitialReq.address);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, investRedeemInitialReq.outputTokenAddress);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !investRedeemInitialReq.isSingle) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, investRedeemInitialReq.isSingle);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 4, investRedeemInitialReq.investmentCategory);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investRedeemInitialReq.transactionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, investRedeemInitialReq.transactionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investRedeemInitialReq.pubkey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, investRedeemInitialReq.pubkey);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && investRedeemInitialReq.redeemId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, investRedeemInitialReq.redeemId);
    }

    public InvestRedeemInitialReq(long j, @NotNull String str, @NotNull String str2, boolean z, int i, Integer num, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.investmentId = j;
        this.address = str;
        this.outputTokenAddress = str2;
        this.isSingle = z;
        this.investmentCategory = i;
        this.transactionType = num;
        this.pubkey = str3;
        this.redeemId = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (r13v0 long)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r17v0 boolean))
  (r18v0 int)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r19v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String, boolean, int, java.lang.Integer, java.lang.String, java.lang.String):void (m)] (LINE:33) call: com.okinc.business.invest_biz.data.bean.request.InvestRedeemInitialReq.<init>(long, java.lang.String, java.lang.String, boolean, int, java.lang.Integer, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestRedeemInitialReq(long j, String str, String str2, boolean z, int i, Integer num, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, (i2 & 8) != 0 ? true : z, i, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : str4);
    }
}

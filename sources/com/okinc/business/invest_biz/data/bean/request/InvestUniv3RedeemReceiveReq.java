package com.okinc.business.invest_biz.data.bean.request;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestUniv3RedeemReceiveReq {
    private final String accountId;
    private final String address;
    private Long chainId;
    private final long investmentId;
    private final Boolean isSingle;
    private boolean openZap;
    private final String outputTokenAddress;
    private final String outputTokenDecimal;
    private final String redeemPercent;
    private String slippage;
    private final String tokenId;
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
    public final Long component10() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.openZap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.redeemPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.isSingle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.outputTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.outputTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUniv3RedeemReceiveReq copy(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, Boolean bool, String str5, String str6, @NotNull String str7, Long l, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new InvestUniv3RedeemReceiveReq(str, str2, j, str3, str4, bool, str5, str6, str7, l, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestUniv3RedeemReceiveReq)) {
            return false;
        }
        InvestUniv3RedeemReceiveReq investUniv3RedeemReceiveReq = (InvestUniv3RedeemReceiveReq) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) investUniv3RedeemReceiveReq.accountId) && Intrinsics.EZpvd((Object) this.address, (Object) investUniv3RedeemReceiveReq.address) && this.investmentId == investUniv3RedeemReceiveReq.investmentId && Intrinsics.EZpvd((Object) this.redeemPercent, (Object) investUniv3RedeemReceiveReq.redeemPercent) && Intrinsics.EZpvd((Object) this.tokenId, (Object) investUniv3RedeemReceiveReq.tokenId) && Intrinsics.EZpvd(this.isSingle, investUniv3RedeemReceiveReq.isSingle) && Intrinsics.EZpvd((Object) this.outputTokenAddress, (Object) investUniv3RedeemReceiveReq.outputTokenAddress) && Intrinsics.EZpvd((Object) this.outputTokenDecimal, (Object) investUniv3RedeemReceiveReq.outputTokenDecimal) && Intrinsics.EZpvd((Object) this.slippage, (Object) investUniv3RedeemReceiveReq.slippage) && Intrinsics.EZpvd(this.chainId, investUniv3RedeemReceiveReq.chainId) && this.openZap == investUniv3RedeemReceiveReq.openZap;
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
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getOpenZap() {
        return this.openZap;
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
    public final String getRedeemPercent() {
        return this.redeemPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenId() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountId.hashCode();
        int iHashCode2 = this.address.hashCode();
        int iHashCode3 = Long.hashCode(this.investmentId);
        int iHashCode4 = this.redeemPercent.hashCode();
        int iHashCode5 = this.tokenId.hashCode();
        Boolean bool = this.isSingle;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        String str = this.outputTokenAddress;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.outputTokenDecimal;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        int iHashCode9 = this.slippage.hashCode();
        Long l = this.chainId;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (l != null ? l.hashCode() : 0)) * 31) + Boolean.hashCode(this.openZap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isSingle() {
        return this.isSingle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(Long l) {
        this.chainId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenZap(boolean z) {
        this.openZap = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slippage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUniv3RedeemReceiveReq(accountId=" + this.accountId + ", address=" + this.address + ", investmentId=" + this.investmentId + ", redeemPercent=" + this.redeemPercent + ", tokenId=" + this.tokenId + ", isSingle=" + this.isSingle + ", outputTokenAddress=" + this.outputTokenAddress + ", outputTokenDecimal=" + this.outputTokenDecimal + ", slippage=" + this.slippage + ", chainId=" + this.chainId + ", openZap=" + this.openZap + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.InvestUniv3RedeemReceiveReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUniv3RedeemReceiveReq> serializer() {
            return InvestUniv3RedeemReceiveReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestUniv3RedeemReceiveReq(int i, String str, String str2, long j, String str3, String str4, Boolean bool, String str5, String str6, String str7, Long l, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, InvestUniv3RedeemReceiveReq$$serializer.INSTANCE.getDescriptor());
        }
        this.accountId = str;
        this.address = str2;
        this.investmentId = j;
        this.redeemPercent = str3;
        this.tokenId = str4;
        if ((i & 32) == 0) {
            this.isSingle = null;
        } else {
            this.isSingle = bool;
        }
        if ((i & 64) == 0) {
            this.outputTokenAddress = "";
        } else {
            this.outputTokenAddress = str5;
        }
        if ((i & 128) == 0) {
            this.outputTokenDecimal = "";
        } else {
            this.outputTokenDecimal = str6;
        }
        if ((i & 256) == 0) {
            this.slippage = "";
        } else {
            this.slippage = str7;
        }
        if ((i & 512) == 0) {
            this.chainId = 0L;
        } else {
            this.chainId = l;
        }
        if ((i & 1024) == 0) {
            this.openZap = false;
        } else {
            this.openZap = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUniv3RedeemReceiveReq investUniv3RedeemReceiveReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, investUniv3RedeemReceiveReq.accountId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, investUniv3RedeemReceiveReq.address);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, investUniv3RedeemReceiveReq.investmentId);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, investUniv3RedeemReceiveReq.redeemPercent);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, investUniv3RedeemReceiveReq.tokenId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investUniv3RedeemReceiveReq.isSingle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, investUniv3RedeemReceiveReq.isSingle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investUniv3RedeemReceiveReq.outputTokenAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, investUniv3RedeemReceiveReq.outputTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) investUniv3RedeemReceiveReq.outputTokenDecimal, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, investUniv3RedeemReceiveReq.outputTokenDecimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) investUniv3RedeemReceiveReq.slippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, investUniv3RedeemReceiveReq.slippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || (l = investUniv3RedeemReceiveReq.chainId) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, investUniv3RedeemReceiveReq.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || investUniv3RedeemReceiveReq.openZap) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 10, investUniv3RedeemReceiveReq.openZap);
        }
    }

    public InvestUniv3RedeemReceiveReq(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, Boolean bool, String str5, String str6, @NotNull String str7, Long l, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.accountId = str;
        this.address = str2;
        this.investmentId = j;
        this.redeemPercent = str3;
        this.tokenId = str4;
        this.isSingle = bool;
        this.outputTokenAddress = str5;
        this.outputTokenDecimal = str6;
        this.slippage = str7;
        this.chainId = l;
        this.openZap = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0047: CONSTRUCTOR 
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 long)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r22v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0025: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r26v0 java.lang.Long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0033: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r27v0 boolean))
 A[MD:(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, boolean):void (m)] (LINE:9) call: com.okinc.business.invest_biz.data.bean.request.InvestUniv3RedeemReceiveReq.<init>(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, boolean):void type: THIS */
    public /* synthetic */ InvestUniv3RedeemReceiveReq(String str, String str2, long j, String str3, String str4, Boolean bool, String str5, String str6, String str7, Long l, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, str4, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? 0L : l, (i & 1024) != 0 ? false : z);
    }
}

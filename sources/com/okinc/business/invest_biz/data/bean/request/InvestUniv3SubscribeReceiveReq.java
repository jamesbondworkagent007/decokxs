package com.okinc.business.invest_biz.data.bean.request;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestUniv3SubscribeReceiveReq {
    private final String accountId;
    private final String address;
    private final String inputAmount;
    private final String inputTokenAddress;
    private List<InvestUniv3SubscribeInputToken> inputTokenList;
    private final long investmentId;
    private final Boolean isSingle;
    private Boolean openZap;
    private String slippage;
    private int tickLower;
    private int tickUpper;
    private final String tokenDecimal;
    private final String tokenId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(InvestUniv3SubscribeInputToken$$serializer.INSTANCE)};

    @SerialName("accountId")
    public static /* synthetic */ void getAccountId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component12() {
        return this.openZap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUniv3SubscribeInputToken> component13() {
        return this.inputTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.inputAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.inputTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.isSingle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.tickLower;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.tickUpper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUniv3SubscribeReceiveReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, Boolean bool, int i, int i2, String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, Boolean bool2, @NotNull List<InvestUniv3SubscribeInputToken> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new InvestUniv3SubscribeReceiveReq(str, str2, str3, j, bool, i, i2, str4, str5, str6, str7, bool2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestUniv3SubscribeReceiveReq)) {
            return false;
        }
        InvestUniv3SubscribeReceiveReq investUniv3SubscribeReceiveReq = (InvestUniv3SubscribeReceiveReq) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) investUniv3SubscribeReceiveReq.address) && Intrinsics.EZpvd((Object) this.inputAmount, (Object) investUniv3SubscribeReceiveReq.inputAmount) && Intrinsics.EZpvd((Object) this.inputTokenAddress, (Object) investUniv3SubscribeReceiveReq.inputTokenAddress) && this.investmentId == investUniv3SubscribeReceiveReq.investmentId && Intrinsics.EZpvd(this.isSingle, investUniv3SubscribeReceiveReq.isSingle) && this.tickLower == investUniv3SubscribeReceiveReq.tickLower && this.tickUpper == investUniv3SubscribeReceiveReq.tickUpper && Intrinsics.EZpvd((Object) this.tokenId, (Object) investUniv3SubscribeReceiveReq.tokenId) && Intrinsics.EZpvd((Object) this.tokenDecimal, (Object) investUniv3SubscribeReceiveReq.tokenDecimal) && Intrinsics.EZpvd((Object) this.accountId, (Object) investUniv3SubscribeReceiveReq.accountId) && Intrinsics.EZpvd((Object) this.slippage, (Object) investUniv3SubscribeReceiveReq.slippage) && Intrinsics.EZpvd(this.openZap, investUniv3SubscribeReceiveReq.openZap) && Intrinsics.EZpvd(this.inputTokenList, investUniv3SubscribeReceiveReq.inputTokenList);
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
    public final List<InvestUniv3SubscribeInputToken> getInputTokenList() {
        return this.inputTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getOpenZap() {
        return this.openZap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTickLower() {
        return this.tickLower;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTickUpper() {
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
    public int hashCode() {
        int iHashCode = this.address.hashCode();
        int iHashCode2 = this.inputAmount.hashCode();
        int iHashCode3 = this.inputTokenAddress.hashCode();
        int iHashCode4 = Long.hashCode(this.investmentId);
        Boolean bool = this.isSingle;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        int iHashCode6 = Integer.hashCode(this.tickLower);
        int iHashCode7 = Integer.hashCode(this.tickUpper);
        String str = this.tokenId;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        int iHashCode9 = this.tokenDecimal.hashCode();
        int iHashCode10 = this.accountId.hashCode();
        int iHashCode11 = this.slippage.hashCode();
        Boolean bool2 = this.openZap;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (bool2 != null ? bool2.hashCode() : 0)) * 31) + this.inputTokenList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isSingle() {
        return this.isSingle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputTokenList(@NotNull List<InvestUniv3SubscribeInputToken> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.inputTokenList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenZap(Boolean bool) {
        this.openZap = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slippage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTickLower(int i) {
        this.tickLower = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTickUpper(int i) {
        this.tickUpper = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUniv3SubscribeReceiveReq(address=" + this.address + ", inputAmount=" + this.inputAmount + ", inputTokenAddress=" + this.inputTokenAddress + ", investmentId=" + this.investmentId + ", isSingle=" + this.isSingle + ", tickLower=" + this.tickLower + ", tickUpper=" + this.tickUpper + ", tokenId=" + this.tokenId + ", tokenDecimal=" + this.tokenDecimal + ", accountId=" + this.accountId + ", slippage=" + this.slippage + ", openZap=" + this.openZap + ", inputTokenList=" + this.inputTokenList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.InvestUniv3SubscribeReceiveReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUniv3SubscribeReceiveReq> serializer() {
            return InvestUniv3SubscribeReceiveReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestUniv3SubscribeReceiveReq(int i, String str, String str2, String str3, long j, Boolean bool, int i2, int i3, String str4, String str5, String str6, String str7, Boolean bool2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (879 != (i & 879)) {
            PluginExceptionsKt.throwMissingFieldException(i, 879, InvestUniv3SubscribeReceiveReq$$serializer.INSTANCE.getDescriptor());
        }
        this.address = str;
        this.inputAmount = str2;
        this.inputTokenAddress = str3;
        this.investmentId = j;
        this.isSingle = (i & 16) == 0 ? null : bool;
        this.tickLower = i2;
        this.tickUpper = i3;
        if ((i & 128) == 0) {
            this.tokenId = "";
        } else {
            this.tokenId = str4;
        }
        this.tokenDecimal = str5;
        this.accountId = str6;
        if ((i & 1024) == 0) {
            this.slippage = "";
        } else {
            this.slippage = str7;
        }
        this.openZap = (i & 2048) == 0 ? Boolean.FALSE : bool2;
        this.inputTokenList = (i & 4096) == 0 ? yDY.AhwBna() : list;
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUniv3SubscribeReceiveReq investUniv3SubscribeReceiveReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, investUniv3SubscribeReceiveReq.address);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, investUniv3SubscribeReceiveReq.inputAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, investUniv3SubscribeReceiveReq.inputTokenAddress);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, investUniv3SubscribeReceiveReq.investmentId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investUniv3SubscribeReceiveReq.isSingle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, investUniv3SubscribeReceiveReq.isSingle);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 5, investUniv3SubscribeReceiveReq.tickLower);
        compositeEncoder.encodeIntElement(serialDescriptor, 6, investUniv3SubscribeReceiveReq.tickUpper);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) investUniv3SubscribeReceiveReq.tokenId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, investUniv3SubscribeReceiveReq.tokenId);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, investUniv3SubscribeReceiveReq.tokenDecimal);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, investUniv3SubscribeReceiveReq.accountId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) investUniv3SubscribeReceiveReq.slippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, investUniv3SubscribeReceiveReq.slippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(investUniv3SubscribeReceiveReq.openZap, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, investUniv3SubscribeReceiveReq.openZap);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd(investUniv3SubscribeReceiveReq.inputTokenList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], investUniv3SubscribeReceiveReq.inputTokenList);
    }

    public InvestUniv3SubscribeReceiveReq(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, Boolean bool, int i, int i2, String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, Boolean bool2, @NotNull List<InvestUniv3SubscribeInputToken> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.address = str;
        this.inputAmount = str2;
        this.inputTokenAddress = str3;
        this.investmentId = j;
        this.isSingle = bool;
        this.tickLower = i;
        this.tickUpper = i2;
        this.tokenId = str4;
        this.tokenDecimal = str5;
        this.accountId = str6;
        this.slippage = str7;
        this.openZap = bool2;
        this.inputTokenList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0046: CONSTRUCTOR 
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 long)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (r24v0 int)
  (r25v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0023: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r30v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0027: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:23)) : (r31v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, long, java.lang.Boolean, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.List<com.okinc.business.invest_biz.data.bean.request.InvestUniv3SubscribeInputToken>):void (m)] (LINE:9) call: com.okinc.business.invest_biz.data.bean.request.InvestUniv3SubscribeReceiveReq.<init>(java.lang.String, java.lang.String, java.lang.String, long, java.lang.Boolean, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.List):void type: THIS */
    public /* synthetic */ InvestUniv3SubscribeReceiveReq(String str, String str2, String str3, long j, Boolean bool, int i, int i2, String str4, String str5, String str6, String str7, Boolean bool2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j, (i3 & 16) != 0 ? null : bool, i, i2, (i3 & 128) != 0 ? "" : str4, str5, str6, (i3 & 1024) != 0 ? "" : str7, (i3 & 2048) != 0 ? Boolean.FALSE : bool2, (i3 & 4096) != 0 ? yDY.AhwBna() : list);
    }
}

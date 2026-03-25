package com.okinc.business.invest_biz.data.bean.request;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class InvestUniv3SubscribeInitialReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String accountId;
    private final String address;
    private final String inputTokenAddress;
    private final long investmentId;
    private final Boolean isSingle;
    private final boolean openZap;
    private final String tokenId;

    @SerialName("accountId")
    public static /* synthetic */ void getAccountId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.inputTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.isSingle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.openZap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUniv3SubscribeInitialReq copy(@NotNull String str, @NotNull String str2, long j, Boolean bool, String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new InvestUniv3SubscribeInitialReq(str, str2, j, bool, str3, str4, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestUniv3SubscribeInitialReq)) {
            return false;
        }
        InvestUniv3SubscribeInitialReq investUniv3SubscribeInitialReq = (InvestUniv3SubscribeInitialReq) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) investUniv3SubscribeInitialReq.address) && Intrinsics.EZpvd((Object) this.inputTokenAddress, (Object) investUniv3SubscribeInitialReq.inputTokenAddress) && this.investmentId == investUniv3SubscribeInitialReq.investmentId && Intrinsics.EZpvd(this.isSingle, investUniv3SubscribeInitialReq.isSingle) && Intrinsics.EZpvd((Object) this.tokenId, (Object) investUniv3SubscribeInitialReq.tokenId) && Intrinsics.EZpvd((Object) this.accountId, (Object) investUniv3SubscribeInitialReq.accountId) && this.openZap == investUniv3SubscribeInitialReq.openZap;
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
    public final long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getOpenZap() {
        return this.openZap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenId() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.address.hashCode();
        int iHashCode2 = this.inputTokenAddress.hashCode();
        int iHashCode3 = Long.hashCode(this.investmentId);
        Boolean bool = this.isSingle;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        String str = this.tokenId;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.accountId.hashCode()) * 31) + Boolean.hashCode(this.openZap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isSingle() {
        return this.isSingle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUniv3SubscribeInitialReq(address=" + this.address + ", inputTokenAddress=" + this.inputTokenAddress + ", investmentId=" + this.investmentId + ", isSingle=" + this.isSingle + ", tokenId=" + this.tokenId + ", accountId=" + this.accountId + ", openZap=" + this.openZap + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.InvestUniv3SubscribeInitialReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUniv3SubscribeInitialReq> serializer() {
            return InvestUniv3SubscribeInitialReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestUniv3SubscribeInitialReq(int i, String str, String str2, long j, Boolean bool, String str3, String str4, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (39 != (i & 39)) {
            PluginExceptionsKt.throwMissingFieldException(i, 39, InvestUniv3SubscribeInitialReq$$serializer.INSTANCE.getDescriptor());
        }
        this.address = str;
        this.inputTokenAddress = str2;
        this.investmentId = j;
        if ((i & 8) == 0) {
            this.isSingle = null;
        } else {
            this.isSingle = bool;
        }
        if ((i & 16) == 0) {
            this.tokenId = "";
        } else {
            this.tokenId = str3;
        }
        this.accountId = str4;
        if ((i & 64) == 0) {
            this.openZap = false;
        } else {
            this.openZap = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUniv3SubscribeInitialReq investUniv3SubscribeInitialReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, investUniv3SubscribeInitialReq.address);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, investUniv3SubscribeInitialReq.inputTokenAddress);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, investUniv3SubscribeInitialReq.investmentId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investUniv3SubscribeInitialReq.isSingle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, investUniv3SubscribeInitialReq.isSingle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) investUniv3SubscribeInitialReq.tokenId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, investUniv3SubscribeInitialReq.tokenId);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, investUniv3SubscribeInitialReq.accountId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investUniv3SubscribeInitialReq.openZap) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, investUniv3SubscribeInitialReq.openZap);
        }
    }

    public InvestUniv3SubscribeInitialReq(@NotNull String str, @NotNull String str2, long j, Boolean bool, String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.address = str;
        this.inputTokenAddress = str2;
        this.investmentId = j;
        this.isSingle = bool;
        this.tokenId = str3;
        this.accountId = str4;
        this.openZap = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0021: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 long)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r15v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r19v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (r17v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r19v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
 A[MD:(java.lang.String, java.lang.String, long, java.lang.Boolean, java.lang.String, java.lang.String, boolean):void (m)] (LINE:36) call: com.okinc.business.invest_biz.data.bean.request.InvestUniv3SubscribeInitialReq.<init>(java.lang.String, java.lang.String, long, java.lang.Boolean, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ InvestUniv3SubscribeInitialReq(String str, String str2, long j, Boolean bool, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? "" : str3, str4, (i & 64) != 0 ? false : z);
    }
}

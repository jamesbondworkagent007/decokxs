package com.okinc.business.invest_biz.data.bean.request;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestUniv3RedeemInitialReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String address;
    private final long investmentId;
    private final boolean isSingle;
    private final boolean openZap;
    private final String outputTokenAddress;
    private final String tokenId;

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
    public final String component5() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.openZap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUniv3RedeemInitialReq copy(long j, @NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new InvestUniv3RedeemInitialReq(j, str, str2, z, str3, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestUniv3RedeemInitialReq)) {
            return false;
        }
        InvestUniv3RedeemInitialReq investUniv3RedeemInitialReq = (InvestUniv3RedeemInitialReq) obj;
        return this.investmentId == investUniv3RedeemInitialReq.investmentId && Intrinsics.EZpvd((Object) this.address, (Object) investUniv3RedeemInitialReq.address) && Intrinsics.EZpvd((Object) this.outputTokenAddress, (Object) investUniv3RedeemInitialReq.outputTokenAddress) && this.isSingle == investUniv3RedeemInitialReq.isSingle && Intrinsics.EZpvd((Object) this.tokenId, (Object) investUniv3RedeemInitialReq.tokenId) && this.openZap == investUniv3RedeemInitialReq.openZap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
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
    public final String getTokenId() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Long.hashCode(this.investmentId) * 31) + this.address.hashCode()) * 31) + this.outputTokenAddress.hashCode()) * 31) + Boolean.hashCode(this.isSingle)) * 31) + this.tokenId.hashCode()) * 31) + Boolean.hashCode(this.openZap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSingle() {
        return this.isSingle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUniv3RedeemInitialReq(investmentId=" + this.investmentId + ", address=" + this.address + ", outputTokenAddress=" + this.outputTokenAddress + ", isSingle=" + this.isSingle + ", tokenId=" + this.tokenId + ", openZap=" + this.openZap + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.InvestUniv3RedeemInitialReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUniv3RedeemInitialReq> serializer() {
            return InvestUniv3RedeemInitialReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestUniv3RedeemInitialReq(int i, long j, String str, String str2, boolean z, String str3, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (23 != (i & 23)) {
            PluginExceptionsKt.throwMissingFieldException(i, 23, InvestUniv3RedeemInitialReq$$serializer.INSTANCE.getDescriptor());
        }
        this.investmentId = j;
        this.address = str;
        this.outputTokenAddress = str2;
        if ((i & 8) == 0) {
            this.isSingle = true;
        } else {
            this.isSingle = z;
        }
        this.tokenId = str3;
        if ((i & 32) == 0) {
            this.openZap = false;
        } else {
            this.openZap = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUniv3RedeemInitialReq investUniv3RedeemInitialReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, investUniv3RedeemInitialReq.investmentId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, investUniv3RedeemInitialReq.address);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, investUniv3RedeemInitialReq.outputTokenAddress);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !investUniv3RedeemInitialReq.isSingle) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, investUniv3RedeemInitialReq.isSingle);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, investUniv3RedeemInitialReq.tokenId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investUniv3RedeemInitialReq.openZap) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, investUniv3RedeemInitialReq.openZap);
        }
    }

    public InvestUniv3RedeemInitialReq(long j, @NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.investmentId = j;
        this.address = str;
        this.outputTokenAddress = str2;
        this.isSingle = z;
        this.tokenId = str3;
        this.openZap = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (r10v0 long)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r14v0 boolean))
  (r15v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
 A[MD:(long, java.lang.String, java.lang.String, boolean, java.lang.String, boolean):void (m)] (LINE:26) call: com.okinc.business.invest_biz.data.bean.request.InvestUniv3RedeemInitialReq.<init>(long, java.lang.String, java.lang.String, boolean, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ InvestUniv3RedeemInitialReq(long j, String str, String str2, boolean z, String str3, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, (i & 8) != 0 ? true : z, str3, (i & 32) != 0 ? false : z2);
    }
}

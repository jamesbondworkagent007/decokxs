package com.okinc.business.invest_biz.data.bean;

import com.okinc.business.invest_biz.data.contants.ProductType;
import com.okinc.business.invest_biz.data.contants.ProtocolType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TokenInvestDetail {
    public final long chainId;
    public final InvestDetailPagePromptInformation detailPagePromptInformation;
    public final long investmentId;
    public final ProductType productType;
    public final ProtocolType protocolType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, ProductType.Companion.serializer(), ProtocolType.Companion.serializer(), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenInvestDetail() {
        this(0L, 0L, (ProductType) null, (ProtocolType) null, (InvestDetailPagePromptInformation) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInvestDetail AEQbTJ(long j, long j2, @NotNull ProductType productType, @NotNull ProtocolType protocolType, InvestDetailPagePromptInformation investDetailPagePromptInformation) {
        Intrinsics.checkNotNullParameter(productType, "");
        Intrinsics.checkNotNullParameter(protocolType, "");
        return new TokenInvestDetail(j, j2, productType, protocolType, investDetailPagePromptInformation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProtocolType AYXKKw() {
        return this.protocolType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestDetailPagePromptInformation OLrzqt() {
        return this.detailPagePromptInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductType copydefault() {
        return this.productType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenInvestDetail)) {
            return false;
        }
        TokenInvestDetail tokenInvestDetail = (TokenInvestDetail) obj;
        return this.investmentId == tokenInvestDetail.investmentId && this.chainId == tokenInvestDetail.chainId && this.productType == tokenInvestDetail.productType && this.protocolType == tokenInvestDetail.protocolType && Intrinsics.EZpvd(this.detailPagePromptInformation, tokenInvestDetail.detailPagePromptInformation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.investmentId);
        int iHashCode2 = Long.hashCode(this.chainId);
        int iHashCode3 = this.productType.hashCode();
        int iHashCode4 = this.protocolType.hashCode();
        InvestDetailPagePromptInformation investDetailPagePromptInformation = this.detailPagePromptInformation;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (investDetailPagePromptInformation == null ? 0 : investDetailPagePromptInformation.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenInvestDetail(investmentId=" + this.investmentId + ", chainId=" + this.chainId + ", productType=" + this.productType + ", protocolType=" + this.protocolType + ", detailPagePromptInformation=" + this.detailPagePromptInformation + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.TokenInvestDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenInvestDetail> serializer() {
            return TokenInvestDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenInvestDetail(int i, long j, long j2, ProductType productType, ProtocolType protocolType, InvestDetailPagePromptInformation investDetailPagePromptInformation, SerializationConstructorMarker serializationConstructorMarker) {
        this.investmentId = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.chainId = 1L;
        } else {
            this.chainId = j2;
        }
        if ((i & 4) == 0) {
            this.productType = ProductType.Save;
        } else {
            this.productType = productType;
        }
        if ((i & 8) == 0) {
            this.protocolType = ProtocolType.Unknown;
        } else {
            this.protocolType = protocolType;
        }
        if ((i & 16) == 0) {
            this.detailPagePromptInformation = null;
        } else {
            this.detailPagePromptInformation = investDetailPagePromptInformation;
        }
    }

    public static final /* synthetic */ void OLrzqt(TokenInvestDetail tokenInvestDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tokenInvestDetail.investmentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, tokenInvestDetail.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tokenInvestDetail.chainId != 1) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, tokenInvestDetail.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tokenInvestDetail.productType != ProductType.Save) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], tokenInvestDetail.productType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || tokenInvestDetail.protocolType != ProtocolType.Unknown) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], tokenInvestDetail.protocolType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && tokenInvestDetail.detailPagePromptInformation == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, InvestDetailPagePromptInformation$$serializer.INSTANCE, tokenInvestDetail.detailPagePromptInformation);
    }

    public TokenInvestDetail(long j, long j2, @NotNull ProductType productType, @NotNull ProtocolType protocolType, InvestDetailPagePromptInformation investDetailPagePromptInformation) {
        Intrinsics.checkNotNullParameter(productType, "");
        Intrinsics.checkNotNullParameter(protocolType, "");
        this.investmentId = j;
        this.chainId = j2;
        this.productType = productType;
        this.protocolType = protocolType;
        this.detailPagePromptInformation = investDetailPagePromptInformation;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002d: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r15v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r8v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r15v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (1 long) : (r10v0 long))
  (wrap:com.okinc.business.invest_biz.data.contants.ProductType:?: TERNARY null = ((wrap:int:0x0010: ARITH (r15v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0014: SGET  A[WRAPPED] (LINE:586) com.okinc.business.invest_biz.data.contants.ProductType.Save com.okinc.business.invest_biz.data.contants.ProductType) : (r12v0 com.okinc.business.invest_biz.data.contants.ProductType))
  (wrap:com.okinc.business.invest_biz.data.contants.ProtocolType:?: TERNARY null = ((wrap:int:0x0018: ARITH (r15v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001c: SGET  A[WRAPPED] (LINE:588) com.okinc.business.invest_biz.data.contants.ProtocolType.Unknown com.okinc.business.invest_biz.data.contants.ProtocolType) : (r13v0 com.okinc.business.invest_biz.data.contants.ProtocolType))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestDetailPagePromptInformation:?: TERNARY null = ((wrap:int:0x0020: ARITH (r15v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestDetailPagePromptInformation) : (r14v0 com.okinc.business.invest_biz.data.bean.InvestDetailPagePromptInformation))
 A[MD:(long, long, com.okinc.business.invest_biz.data.contants.ProductType, com.okinc.business.invest_biz.data.contants.ProtocolType, com.okinc.business.invest_biz.data.bean.InvestDetailPagePromptInformation):void (m)] (LINE:582) call: com.okinc.business.invest_biz.data.bean.TokenInvestDetail.<init>(long, long, com.okinc.business.invest_biz.data.contants.ProductType, com.okinc.business.invest_biz.data.contants.ProtocolType, com.okinc.business.invest_biz.data.bean.InvestDetailPagePromptInformation):void type: THIS */
    public /* synthetic */ TokenInvestDetail(long j, long j2, ProductType productType, ProtocolType protocolType, InvestDetailPagePromptInformation investDetailPagePromptInformation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 1L : j2, (i & 4) != 0 ? ProductType.Save : productType, (i & 8) != 0 ? ProtocolType.Unknown : protocolType, (i & 16) != 0 ? null : investDetailPagePromptInformation);
    }
}

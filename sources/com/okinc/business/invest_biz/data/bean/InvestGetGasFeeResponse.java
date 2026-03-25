package com.okinc.business.invest_biz.data.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestGetGasFeeResponse {
    public final AllGasFeeVo allGasFee;
    public final ClaimableBalanceVO claimableBalance;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestGetGasFeeResponse() {
        this((AllGasFeeVo) null, (ClaimableBalanceVO) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestGetGasFeeResponse copy$default(InvestGetGasFeeResponse investGetGasFeeResponse, AllGasFeeVo allGasFeeVo, ClaimableBalanceVO claimableBalanceVO, int i, Object obj) {
        if ((i & 1) != 0) {
            allGasFeeVo = investGetGasFeeResponse.allGasFee;
        }
        if ((i & 2) != 0) {
            claimableBalanceVO = investGetGasFeeResponse.claimableBalance;
        }
        return investGetGasFeeResponse.EZpvd(allGasFeeVo, claimableBalanceVO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestGetGasFeeResponse EZpvd(AllGasFeeVo allGasFeeVo, ClaimableBalanceVO claimableBalanceVO) {
        return new InvestGetGasFeeResponse(allGasFeeVo, claimableBalanceVO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AllGasFeeVo KWHzl() {
        return this.allGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClaimableBalanceVO OLrzqt() {
        return this.claimableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestGetGasFeeResponse)) {
            return false;
        }
        InvestGetGasFeeResponse investGetGasFeeResponse = (InvestGetGasFeeResponse) obj;
        return Intrinsics.EZpvd(this.allGasFee, investGetGasFeeResponse.allGasFee) && Intrinsics.EZpvd(this.claimableBalance, investGetGasFeeResponse.claimableBalance);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        AllGasFeeVo allGasFeeVo = this.allGasFee;
        int iHashCode = allGasFeeVo == null ? 0 : allGasFeeVo.hashCode();
        ClaimableBalanceVO claimableBalanceVO = this.claimableBalance;
        return (iHashCode * 31) + (claimableBalanceVO != null ? claimableBalanceVO.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestGetGasFeeResponse(allGasFee=" + this.allGasFee + ", claimableBalance=" + this.claimableBalance + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestGetGasFeeResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestGetGasFeeResponse> serializer() {
            return InvestGetGasFeeResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestGetGasFeeResponse(int i, AllGasFeeVo allGasFeeVo, ClaimableBalanceVO claimableBalanceVO, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.allGasFee = null;
        } else {
            this.allGasFee = allGasFeeVo;
        }
        if ((i & 2) == 0) {
            this.claimableBalance = null;
        } else {
            this.claimableBalance = claimableBalanceVO;
        }
    }

    public static final /* synthetic */ void EZpvd(InvestGetGasFeeResponse investGetGasFeeResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investGetGasFeeResponse.allGasFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, AllGasFeeVo$$serializer.INSTANCE, investGetGasFeeResponse.allGasFee);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && investGetGasFeeResponse.claimableBalance == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, ClaimableBalanceVO$$serializer.INSTANCE, investGetGasFeeResponse.claimableBalance);
    }

    public InvestGetGasFeeResponse(AllGasFeeVo allGasFeeVo, ClaimableBalanceVO claimableBalanceVO) {
        this.allGasFee = allGasFeeVo;
        this.claimableBalance = claimableBalanceVO;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.AllGasFeeVo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.AllGasFeeVo) : (r2v0 com.okinc.business.invest_biz.data.bean.AllGasFeeVo))
  (wrap:com.okinc.business.invest_biz.data.bean.ClaimableBalanceVO:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.ClaimableBalanceVO) : (r3v0 com.okinc.business.invest_biz.data.bean.ClaimableBalanceVO))
 A[MD:(com.okinc.business.invest_biz.data.bean.AllGasFeeVo, com.okinc.business.invest_biz.data.bean.ClaimableBalanceVO):void (m)] (LINE:1027) call: com.okinc.business.invest_biz.data.bean.InvestGetGasFeeResponse.<init>(com.okinc.business.invest_biz.data.bean.AllGasFeeVo, com.okinc.business.invest_biz.data.bean.ClaimableBalanceVO):void type: THIS */
    public /* synthetic */ InvestGetGasFeeResponse(AllGasFeeVo allGasFeeVo, ClaimableBalanceVO claimableBalanceVO, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : allGasFeeVo, (i & 2) != 0 ? null : claimableBalanceVO);
    }
}

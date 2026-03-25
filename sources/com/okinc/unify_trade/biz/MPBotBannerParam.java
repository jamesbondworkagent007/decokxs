package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class MPBotBannerParam {
    private MPBotBannerCard card;
    private MPBotEventResult event;
    private final LossInsuranceBean lossInsurance;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MPBotBannerParam() {
        this((MPBotEventResult) null, (MPBotBannerCard) null, (LossInsuranceBean) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MPBotBannerParam copy$default(MPBotBannerParam mPBotBannerParam, MPBotEventResult mPBotEventResult, MPBotBannerCard mPBotBannerCard, LossInsuranceBean lossInsuranceBean, int i, Object obj) {
        if ((i & 1) != 0) {
            mPBotEventResult = mPBotBannerParam.event;
        }
        if ((i & 2) != 0) {
            mPBotBannerCard = mPBotBannerParam.card;
        }
        if ((i & 4) != 0) {
            lossInsuranceBean = mPBotBannerParam.lossInsurance;
        }
        return mPBotBannerParam.copy(mPBotEventResult, mPBotBannerCard, lossInsuranceBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MPBotEventResult component1() {
        return this.event;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MPBotBannerCard component2() {
        return this.card;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LossInsuranceBean component3() {
        return this.lossInsurance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MPBotBannerParam copy(MPBotEventResult mPBotEventResult, MPBotBannerCard mPBotBannerCard, LossInsuranceBean lossInsuranceBean) {
        return new MPBotBannerParam(mPBotEventResult, mPBotBannerCard, lossInsuranceBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MPBotBannerParam)) {
            return false;
        }
        MPBotBannerParam mPBotBannerParam = (MPBotBannerParam) obj;
        return Intrinsics.EZpvd(this.event, mPBotBannerParam.event) && Intrinsics.EZpvd(this.card, mPBotBannerParam.card) && Intrinsics.EZpvd(this.lossInsurance, mPBotBannerParam.lossInsurance);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MPBotBannerCard getCard() {
        return this.card;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MPBotEventResult getEvent() {
        return this.event;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LossInsuranceBean getLossInsurance() {
        return this.lossInsurance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        MPBotEventResult mPBotEventResult = this.event;
        int iHashCode = mPBotEventResult == null ? 0 : mPBotEventResult.hashCode();
        MPBotBannerCard mPBotBannerCard = this.card;
        int iHashCode2 = mPBotBannerCard == null ? 0 : mPBotBannerCard.hashCode();
        LossInsuranceBean lossInsuranceBean = this.lossInsurance;
        return (((iHashCode * 31) + iHashCode2) * 31) + (lossInsuranceBean != null ? lossInsuranceBean.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCard(MPBotBannerCard mPBotBannerCard) {
        this.card = mPBotBannerCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEvent(MPBotEventResult mPBotEventResult) {
        this.event = mPBotEventResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MPBotBannerParam(event=" + this.event + ", card=" + this.card + ", lossInsurance=" + this.lossInsurance + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.MPBotBannerParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MPBotBannerParam> serializer() {
            return MPBotBannerParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MPBotBannerParam(int i, MPBotEventResult mPBotEventResult, MPBotBannerCard mPBotBannerCard, LossInsuranceBean lossInsuranceBean, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.event = null;
        } else {
            this.event = mPBotEventResult;
        }
        if ((i & 2) == 0) {
            this.card = null;
        } else {
            this.card = mPBotBannerCard;
        }
        if ((i & 4) == 0) {
            this.lossInsurance = null;
        } else {
            this.lossInsurance = lossInsuranceBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MPBotBannerParam mPBotBannerParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || mPBotBannerParam.event != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, MPBotEventResult$$serializer.INSTANCE, mPBotBannerParam.event);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || mPBotBannerParam.card != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, MPBotBannerCard$$serializer.INSTANCE, mPBotBannerParam.card);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && mPBotBannerParam.lossInsurance == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LossInsuranceBean$$serializer.INSTANCE, mPBotBannerParam.lossInsurance);
    }

    public MPBotBannerParam(MPBotEventResult mPBotEventResult, MPBotBannerCard mPBotBannerCard, LossInsuranceBean lossInsuranceBean) {
        this.event = mPBotEventResult;
        this.card = mPBotBannerCard;
        this.lossInsurance = lossInsuranceBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.MPBotEventResult:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.MPBotEventResult) : (r2v0 com.okinc.unify_trade.biz.MPBotEventResult))
  (wrap:com.okinc.unify_trade.biz.MPBotBannerCard:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.MPBotBannerCard) : (r3v0 com.okinc.unify_trade.biz.MPBotBannerCard))
  (wrap:com.okinc.unify_trade.biz.LossInsuranceBean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.LossInsuranceBean) : (r4v0 com.okinc.unify_trade.biz.LossInsuranceBean))
 A[MD:(com.okinc.unify_trade.biz.MPBotEventResult, com.okinc.unify_trade.biz.MPBotBannerCard, com.okinc.unify_trade.biz.LossInsuranceBean):void (m)] (LINE:2879) call: com.okinc.unify_trade.biz.MPBotBannerParam.<init>(com.okinc.unify_trade.biz.MPBotEventResult, com.okinc.unify_trade.biz.MPBotBannerCard, com.okinc.unify_trade.biz.LossInsuranceBean):void type: THIS */
    public /* synthetic */ MPBotBannerParam(MPBotEventResult mPBotEventResult, MPBotBannerCard mPBotBannerCard, LossInsuranceBean lossInsuranceBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : mPBotEventResult, (i & 2) != 0 ? null : mPBotBannerCard, (i & 4) != 0 ? null : lossInsuranceBean);
    }
}

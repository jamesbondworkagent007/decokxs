package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SmartArbitrageReq implements Parcelable {
    private String arbType;
    private StrategyConfigInfo config;
    private final EstimatedStakingVo estimatedAutoStaking;
    private final EstimatedStakingVo estimatedStaking;
    private String instFamily;
    private ArbInvestDetailsBean investDetails;
    private Float leveragePrincipal;
    private PlaceOrderCondition openCondition;
    private String openPosSlippage;
    private String smartArbiStakingApy;
    private String totalAmt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SmartArbitrageReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SmartArbitrageReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartArbitrageReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SmartArbitrageReq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ArbInvestDetailsBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : PlaceOrderCondition.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : EstimatedStakingVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EstimatedStakingVo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StrategyConfigInfo.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartArbitrageReq[] newArray(int i) {
            return new SmartArbitrageReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmartArbitrageReq() {
        this((String) null, (String) null, (String) null, (ArbInvestDetailsBean) null, (Float) null, (PlaceOrderCondition) null, (String) null, (EstimatedStakingVo) null, (EstimatedStakingVo) null, (StrategyConfigInfo) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyConfigInfo component10() {
        return this.config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.openPosSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.totalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.arbType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbInvestDetailsBean component4() {
        return this.investDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component5() {
        return this.leveragePrincipal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlaceOrderCondition component6() {
        return this.openCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.smartArbiStakingApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstimatedStakingVo component8() {
        return this.estimatedStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstimatedStakingVo component9() {
        return this.estimatedAutoStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartArbitrageReq copy(String str, @NotNull String str2, String str3, ArbInvestDetailsBean arbInvestDetailsBean, Float f, PlaceOrderCondition placeOrderCondition, String str4, EstimatedStakingVo estimatedStakingVo, EstimatedStakingVo estimatedStakingVo2, StrategyConfigInfo strategyConfigInfo, String str5) {
        Intrinsics.checkNotNullParameter(str2, "");
        return new SmartArbitrageReq(str, str2, str3, arbInvestDetailsBean, f, placeOrderCondition, str4, estimatedStakingVo, estimatedStakingVo2, strategyConfigInfo, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartArbitrageReq)) {
            return false;
        }
        SmartArbitrageReq smartArbitrageReq = (SmartArbitrageReq) obj;
        return Intrinsics.EZpvd((Object) this.instFamily, (Object) smartArbitrageReq.instFamily) && Intrinsics.EZpvd((Object) this.totalAmt, (Object) smartArbitrageReq.totalAmt) && Intrinsics.EZpvd((Object) this.arbType, (Object) smartArbitrageReq.arbType) && Intrinsics.EZpvd(this.investDetails, smartArbitrageReq.investDetails) && Intrinsics.EZpvd(this.leveragePrincipal, smartArbitrageReq.leveragePrincipal) && Intrinsics.EZpvd(this.openCondition, smartArbitrageReq.openCondition) && Intrinsics.EZpvd((Object) this.smartArbiStakingApy, (Object) smartArbitrageReq.smartArbiStakingApy) && Intrinsics.EZpvd(this.estimatedStaking, smartArbitrageReq.estimatedStaking) && Intrinsics.EZpvd(this.estimatedAutoStaking, smartArbitrageReq.estimatedAutoStaking) && Intrinsics.EZpvd(this.config, smartArbitrageReq.config) && Intrinsics.EZpvd((Object) this.openPosSlippage, (Object) smartArbitrageReq.openPosSlippage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbType() {
        return this.arbType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyConfigInfo getConfig() {
        return this.config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstimatedStakingVo getEstimatedAutoStaking() {
        return this.estimatedAutoStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstimatedStakingVo getEstimatedStaking() {
        return this.estimatedStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFamily() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbInvestDetailsBean getInvestDetails() {
        return this.investDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getLeveragePrincipal() {
        return this.leveragePrincipal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlaceOrderCondition getOpenCondition() {
        return this.openCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenPosSlippage() {
        return this.openPosSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSmartArbiStakingApy() {
        return this.smartArbiStakingApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAmt() {
        return this.totalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.instFamily;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.totalAmt.hashCode();
        String str2 = this.arbType;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        ArbInvestDetailsBean arbInvestDetailsBean = this.investDetails;
        int iHashCode4 = arbInvestDetailsBean == null ? 0 : arbInvestDetailsBean.hashCode();
        Float f = this.leveragePrincipal;
        int iHashCode5 = f == null ? 0 : f.hashCode();
        PlaceOrderCondition placeOrderCondition = this.openCondition;
        int iHashCode6 = placeOrderCondition == null ? 0 : placeOrderCondition.hashCode();
        String str3 = this.smartArbiStakingApy;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        EstimatedStakingVo estimatedStakingVo = this.estimatedStaking;
        int iHashCode8 = estimatedStakingVo == null ? 0 : estimatedStakingVo.hashCode();
        EstimatedStakingVo estimatedStakingVo2 = this.estimatedAutoStaking;
        int iHashCode9 = estimatedStakingVo2 == null ? 0 : estimatedStakingVo2.hashCode();
        StrategyConfigInfo strategyConfigInfo = this.config;
        int iHashCode10 = strategyConfigInfo == null ? 0 : strategyConfigInfo.hashCode();
        String str4 = this.openPosSlippage;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArbType(String str) {
        this.arbType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConfig(StrategyConfigInfo strategyConfigInfo) {
        this.config = strategyConfigInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstFamily(String str) {
        this.instFamily = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestDetails(ArbInvestDetailsBean arbInvestDetailsBean) {
        this.investDetails = arbInvestDetailsBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeveragePrincipal(Float f) {
        this.leveragePrincipal = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenCondition(PlaceOrderCondition placeOrderCondition) {
        this.openCondition = placeOrderCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenPosSlippage(String str) {
        this.openPosSlippage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSmartArbiStakingApy(String str) {
        this.smartArbiStakingApy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartArbitrageReq(instFamily=" + this.instFamily + ", totalAmt=" + this.totalAmt + ", arbType=" + this.arbType + ", investDetails=" + this.investDetails + ", leveragePrincipal=" + this.leveragePrincipal + ", openCondition=" + this.openCondition + ", smartArbiStakingApy=" + this.smartArbiStakingApy + ", estimatedStaking=" + this.estimatedStaking + ", estimatedAutoStaking=" + this.estimatedAutoStaking + ", config=" + this.config + ", openPosSlippage=" + this.openPosSlippage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instFamily);
        parcel.writeString(this.totalAmt);
        parcel.writeString(this.arbType);
        ArbInvestDetailsBean arbInvestDetailsBean = this.investDetails;
        if (arbInvestDetailsBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            arbInvestDetailsBean.writeToParcel(parcel, i);
        }
        Float f = this.leveragePrincipal;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        PlaceOrderCondition placeOrderCondition = this.openCondition;
        if (placeOrderCondition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            placeOrderCondition.writeToParcel(parcel, i);
        }
        parcel.writeString(this.smartArbiStakingApy);
        EstimatedStakingVo estimatedStakingVo = this.estimatedStaking;
        if (estimatedStakingVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            estimatedStakingVo.writeToParcel(parcel, i);
        }
        EstimatedStakingVo estimatedStakingVo2 = this.estimatedAutoStaking;
        if (estimatedStakingVo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            estimatedStakingVo2.writeToParcel(parcel, i);
        }
        StrategyConfigInfo strategyConfigInfo = this.config;
        if (strategyConfigInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strategyConfigInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.openPosSlippage);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SmartArbitrageReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SmartArbitrageReq> serializer() {
            return SmartArbitrageReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SmartArbitrageReq(int i, String str, String str2, String str3, ArbInvestDetailsBean arbInvestDetailsBean, Float f, PlaceOrderCondition placeOrderCondition, String str4, EstimatedStakingVo estimatedStakingVo, EstimatedStakingVo estimatedStakingVo2, StrategyConfigInfo strategyConfigInfo, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instFamily = null;
        } else {
            this.instFamily = str;
        }
        if ((i & 2) == 0) {
            this.totalAmt = "";
        } else {
            this.totalAmt = str2;
        }
        if ((i & 4) == 0) {
            this.arbType = null;
        } else {
            this.arbType = str3;
        }
        if ((i & 8) == 0) {
            this.investDetails = null;
        } else {
            this.investDetails = arbInvestDetailsBean;
        }
        if ((i & 16) == 0) {
            this.leveragePrincipal = null;
        } else {
            this.leveragePrincipal = f;
        }
        if ((i & 32) == 0) {
            this.openCondition = null;
        } else {
            this.openCondition = placeOrderCondition;
        }
        if ((i & 64) == 0) {
            this.smartArbiStakingApy = "";
        } else {
            this.smartArbiStakingApy = str4;
        }
        this.estimatedStaking = (i & 128) == 0 ? new EstimatedStakingVo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : estimatedStakingVo;
        this.estimatedAutoStaking = (i & 256) == 0 ? new EstimatedStakingVo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : estimatedStakingVo2;
        if ((i & 512) == 0) {
            this.config = null;
        } else {
            this.config = strategyConfigInfo;
        }
        if ((i & 1024) == 0) {
            this.openPosSlippage = null;
        } else {
            this.openPosSlippage = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SmartArbitrageReq smartArbitrageReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || smartArbitrageReq.instFamily != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, smartArbitrageReq.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) smartArbitrageReq.totalAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, smartArbitrageReq.totalAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || smartArbitrageReq.arbType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, smartArbitrageReq.arbType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || smartArbitrageReq.investDetails != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, ArbInvestDetailsBean$$serializer.INSTANCE, smartArbitrageReq.investDetails);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || smartArbitrageReq.leveragePrincipal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, FloatSerializer.INSTANCE, smartArbitrageReq.leveragePrincipal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || smartArbitrageReq.openCondition != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, PlaceOrderCondition$$serializer.INSTANCE, smartArbitrageReq.openCondition);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) smartArbitrageReq.smartArbiStakingApy, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, smartArbitrageReq.smartArbiStakingApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(smartArbitrageReq.estimatedStaking, new EstimatedStakingVo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, EstimatedStakingVo$$serializer.INSTANCE, smartArbitrageReq.estimatedStaking);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(smartArbitrageReq.estimatedAutoStaking, new EstimatedStakingVo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, EstimatedStakingVo$$serializer.INSTANCE, smartArbitrageReq.estimatedAutoStaking);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || smartArbitrageReq.config != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StrategyConfigInfo$$serializer.INSTANCE, smartArbitrageReq.config);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && smartArbitrageReq.openPosSlippage == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, smartArbitrageReq.openPosSlippage);
    }

    public SmartArbitrageReq(String str, @NotNull String str2, String str3, ArbInvestDetailsBean arbInvestDetailsBean, Float f, PlaceOrderCondition placeOrderCondition, String str4, EstimatedStakingVo estimatedStakingVo, EstimatedStakingVo estimatedStakingVo2, StrategyConfigInfo strategyConfigInfo, String str5) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.instFamily = str;
        this.totalAmt = str2;
        this.arbType = str3;
        this.investDetails = arbInvestDetailsBean;
        this.leveragePrincipal = f;
        this.openCondition = placeOrderCondition;
        this.smartArbiStakingApy = str4;
        this.estimatedStaking = estimatedStakingVo;
        this.estimatedAutoStaking = estimatedStakingVo2;
        this.config = strategyConfigInfo;
        this.openPosSlippage = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ad: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.ArbInvestDetailsBean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.ArbInvestDetailsBean) : (r22v0 com.okinc.unify_trade.biz.ArbInvestDetailsBean))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0025: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r23v0 java.lang.Float))
  (wrap:com.okinc.unify_trade.biz.PlaceOrderCondition:?: TERNARY null = ((wrap:int:0x002d: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.PlaceOrderCondition) : (r24v0 com.okinc.unify_trade.biz.PlaceOrderCondition))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r30v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (""))
  (wrap:com.okinc.unify_trade.biz.EstimatedStakingVo:?: TERNARY null = ((wrap:int:0x003c: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005b: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:547) call: com.okinc.unify_trade.biz.EstimatedStakingVo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r26v0 com.okinc.unify_trade.biz.EstimatedStakingVo))
  (wrap:com.okinc.unify_trade.biz.EstimatedStakingVo:?: TERNARY null = ((wrap:int:0x0061: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0080: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:548) call: com.okinc.unify_trade.biz.EstimatedStakingVo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r27v0 com.okinc.unify_trade.biz.EstimatedStakingVo))
  (wrap:com.okinc.unify_trade.biz.StrategyConfigInfo:?: TERNARY null = ((wrap:int:0x0086: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.StrategyConfigInfo) : (r28v0 com.okinc.unify_trade.biz.StrategyConfigInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008e: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.ArbInvestDetailsBean, java.lang.Float, com.okinc.unify_trade.biz.PlaceOrderCondition, java.lang.String, com.okinc.unify_trade.biz.EstimatedStakingVo, com.okinc.unify_trade.biz.EstimatedStakingVo, com.okinc.unify_trade.biz.StrategyConfigInfo, java.lang.String):void (m)] (LINE:539) call: com.okinc.unify_trade.biz.SmartArbitrageReq.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.ArbInvestDetailsBean, java.lang.Float, com.okinc.unify_trade.biz.PlaceOrderCondition, java.lang.String, com.okinc.unify_trade.biz.EstimatedStakingVo, com.okinc.unify_trade.biz.EstimatedStakingVo, com.okinc.unify_trade.biz.StrategyConfigInfo, java.lang.String):void type: THIS */
    public /* synthetic */ SmartArbitrageReq(String str, String str2, String str3, ArbInvestDetailsBean arbInvestDetailsBean, Float f, PlaceOrderCondition placeOrderCondition, String str4, EstimatedStakingVo estimatedStakingVo, EstimatedStakingVo estimatedStakingVo2, StrategyConfigInfo strategyConfigInfo, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : arbInvestDetailsBean, (i & 16) != 0 ? null : f, (i & 32) != 0 ? null : placeOrderCondition, (i & 64) == 0 ? str4 : "", (i & 128) != 0 ? new EstimatedStakingVo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : estimatedStakingVo, (i & 256) != 0 ? new EstimatedStakingVo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : estimatedStakingVo2, (i & 512) != 0 ? null : strategyConfigInfo, (i & 1024) == 0 ? str5 : null);
    }
}

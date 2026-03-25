package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SmartArbitrageVo implements Parcelable {
    private final String autoStakingPos;
    private final String autoStakingPosUsdt;
    private final ProfitDetailResponse autoStakingProfit;
    private final CostVo closeCost;
    private final String enlargedAmt;
    private final List<EstimatedApyVo> estimatedApyList;
    private final String interestDebt;
    private final String minimalPaybackDays;
    private final PlaceOrderCondition openCondition;
    private final CostVo openCost;
    private final String stakePosUsdt;
    private final String totalReturnedAmt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SmartArbitrageVo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(EstimatedApyVo$$serializer.INSTANCE), null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<SmartArbitrageVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartArbitrageVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Parcelable.Creator<CostVo> creator = CostVo.CREATOR;
            CostVo costVoCreateFromParcel = creator.createFromParcel(parcel);
            CostVo costVoCreateFromParcel2 = creator.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(EstimatedApyVo.CREATOR.createFromParcel(parcel));
            }
            return new SmartArbitrageVo(string, string2, string3, costVoCreateFromParcel, costVoCreateFromParcel2, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : PlaceOrderCondition.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ProfitDetailResponse.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartArbitrageVo[] newArray(int i) {
            return new SmartArbitrageVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmartArbitrageVo() {
        this((String) null, (String) null, (String) null, (CostVo) null, (CostVo) null, (List) null, (String) null, (PlaceOrderCondition) null, (ProfitDetailResponse) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.enlargedAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.autoStakingPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.autoStakingPosUsdt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.stakePosUsdt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.interestDebt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.minimalPaybackDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CostVo component4() {
        return this.openCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CostVo component5() {
        return this.closeCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EstimatedApyVo> component6() {
        return this.estimatedApyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.totalReturnedAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlaceOrderCondition component8() {
        return this.openCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse component9() {
        return this.autoStakingProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartArbitrageVo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull CostVo costVo, @NotNull CostVo costVo2, @NotNull List<EstimatedApyVo> list, @NotNull String str4, PlaceOrderCondition placeOrderCondition, ProfitDetailResponse profitDetailResponse, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(costVo, "");
        Intrinsics.checkNotNullParameter(costVo2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new SmartArbitrageVo(str, str2, str3, costVo, costVo2, list, str4, placeOrderCondition, profitDetailResponse, str5, str6, str7);
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
        if (!(obj instanceof SmartArbitrageVo)) {
            return false;
        }
        SmartArbitrageVo smartArbitrageVo = (SmartArbitrageVo) obj;
        return Intrinsics.EZpvd((Object) this.enlargedAmt, (Object) smartArbitrageVo.enlargedAmt) && Intrinsics.EZpvd((Object) this.interestDebt, (Object) smartArbitrageVo.interestDebt) && Intrinsics.EZpvd((Object) this.minimalPaybackDays, (Object) smartArbitrageVo.minimalPaybackDays) && Intrinsics.EZpvd(this.openCost, smartArbitrageVo.openCost) && Intrinsics.EZpvd(this.closeCost, smartArbitrageVo.closeCost) && Intrinsics.EZpvd(this.estimatedApyList, smartArbitrageVo.estimatedApyList) && Intrinsics.EZpvd((Object) this.totalReturnedAmt, (Object) smartArbitrageVo.totalReturnedAmt) && Intrinsics.EZpvd(this.openCondition, smartArbitrageVo.openCondition) && Intrinsics.EZpvd(this.autoStakingProfit, smartArbitrageVo.autoStakingProfit) && Intrinsics.EZpvd((Object) this.autoStakingPos, (Object) smartArbitrageVo.autoStakingPos) && Intrinsics.EZpvd((Object) this.autoStakingPosUsdt, (Object) smartArbitrageVo.autoStakingPosUsdt) && Intrinsics.EZpvd((Object) this.stakePosUsdt, (Object) smartArbitrageVo.stakePosUsdt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoStakingPos() {
        return this.autoStakingPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoStakingPosUsdt() {
        return this.autoStakingPosUsdt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse getAutoStakingProfit() {
        return this.autoStakingProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CostVo getCloseCost() {
        return this.closeCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnlargedAmt() {
        return this.enlargedAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EstimatedApyVo> getEstimatedApyList() {
        return this.estimatedApyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInterestDebt() {
        return this.interestDebt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinimalPaybackDays() {
        return this.minimalPaybackDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlaceOrderCondition getOpenCondition() {
        return this.openCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CostVo getOpenCost() {
        return this.openCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStakePosUsdt() {
        return this.stakePosUsdt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalReturnedAmt() {
        return this.totalReturnedAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.enlargedAmt.hashCode();
        int iHashCode2 = this.interestDebt.hashCode();
        int iHashCode3 = this.minimalPaybackDays.hashCode();
        int iHashCode4 = this.openCost.hashCode();
        int iHashCode5 = this.closeCost.hashCode();
        int iHashCode6 = this.estimatedApyList.hashCode();
        int iHashCode7 = this.totalReturnedAmt.hashCode();
        PlaceOrderCondition placeOrderCondition = this.openCondition;
        int iHashCode8 = placeOrderCondition == null ? 0 : placeOrderCondition.hashCode();
        ProfitDetailResponse profitDetailResponse = this.autoStakingProfit;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (profitDetailResponse != null ? profitDetailResponse.hashCode() : 0)) * 31) + this.autoStakingPos.hashCode()) * 31) + this.autoStakingPosUsdt.hashCode()) * 31) + this.stakePosUsdt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartArbitrageVo(enlargedAmt=" + this.enlargedAmt + ", interestDebt=" + this.interestDebt + ", minimalPaybackDays=" + this.minimalPaybackDays + ", openCost=" + this.openCost + ", closeCost=" + this.closeCost + ", estimatedApyList=" + this.estimatedApyList + ", totalReturnedAmt=" + this.totalReturnedAmt + ", openCondition=" + this.openCondition + ", autoStakingProfit=" + this.autoStakingProfit + ", autoStakingPos=" + this.autoStakingPos + ", autoStakingPosUsdt=" + this.autoStakingPosUsdt + ", stakePosUsdt=" + this.stakePosUsdt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.enlargedAmt);
        parcel.writeString(this.interestDebt);
        parcel.writeString(this.minimalPaybackDays);
        this.openCost.writeToParcel(parcel, i);
        this.closeCost.writeToParcel(parcel, i);
        List<EstimatedApyVo> list = this.estimatedApyList;
        parcel.writeInt(list.size());
        Iterator<EstimatedApyVo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.totalReturnedAmt);
        PlaceOrderCondition placeOrderCondition = this.openCondition;
        if (placeOrderCondition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            placeOrderCondition.writeToParcel(parcel, i);
        }
        ProfitDetailResponse profitDetailResponse = this.autoStakingProfit;
        if (profitDetailResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            profitDetailResponse.writeToParcel(parcel, i);
        }
        parcel.writeString(this.autoStakingPos);
        parcel.writeString(this.autoStakingPosUsdt);
        parcel.writeString(this.stakePosUsdt);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SmartArbitrageVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SmartArbitrageVo> serializer() {
            return SmartArbitrageVo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SmartArbitrageVo(int i, String str, String str2, String str3, CostVo costVo, CostVo costVo2, List list, String str4, PlaceOrderCondition placeOrderCondition, ProfitDetailResponse profitDetailResponse, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.enlargedAmt = "";
        } else {
            this.enlargedAmt = str;
        }
        if ((i & 2) == 0) {
            this.interestDebt = "";
        } else {
            this.interestDebt = str2;
        }
        if ((i & 4) == 0) {
            this.minimalPaybackDays = "";
        } else {
            this.minimalPaybackDays = str3;
        }
        this.openCost = (i & 8) == 0 ? new CostVo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : costVo;
        this.closeCost = (i & 16) == 0 ? new CostVo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : costVo2;
        this.estimatedApyList = (i & 32) == 0 ? yDY.AhwBna() : list;
        if ((i & 64) == 0) {
            this.totalReturnedAmt = "";
        } else {
            this.totalReturnedAmt = str4;
        }
        if ((i & 128) == 0) {
            this.openCondition = null;
        } else {
            this.openCondition = placeOrderCondition;
        }
        if ((i & 256) == 0) {
            this.autoStakingProfit = null;
        } else {
            this.autoStakingProfit = profitDetailResponse;
        }
        if ((i & 512) == 0) {
            this.autoStakingPos = "";
        } else {
            this.autoStakingPos = str5;
        }
        if ((i & 1024) == 0) {
            this.autoStakingPosUsdt = "";
        } else {
            this.autoStakingPosUsdt = str6;
        }
        if ((i & 2048) == 0) {
            this.stakePosUsdt = "";
        } else {
            this.stakePosUsdt = str7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [55=4] */
    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SmartArbitrageVo smartArbitrageVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) smartArbitrageVo.enlargedAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, smartArbitrageVo.enlargedAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) smartArbitrageVo.interestDebt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, smartArbitrageVo.interestDebt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) smartArbitrageVo.minimalPaybackDays, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, smartArbitrageVo.minimalPaybackDays);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(smartArbitrageVo.openCost, new CostVo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, CostVo$$serializer.INSTANCE, smartArbitrageVo.openCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(smartArbitrageVo.closeCost, new CostVo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, CostVo$$serializer.INSTANCE, smartArbitrageVo.closeCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(smartArbitrageVo.estimatedApyList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], smartArbitrageVo.estimatedApyList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) smartArbitrageVo.totalReturnedAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, smartArbitrageVo.totalReturnedAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || smartArbitrageVo.openCondition != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, PlaceOrderCondition$$serializer.INSTANCE, smartArbitrageVo.openCondition);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || smartArbitrageVo.autoStakingProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, ProfitDetailResponse$$serializer.INSTANCE, smartArbitrageVo.autoStakingProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) smartArbitrageVo.autoStakingPos, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, smartArbitrageVo.autoStakingPos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) smartArbitrageVo.autoStakingPosUsdt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, smartArbitrageVo.autoStakingPosUsdt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd((Object) smartArbitrageVo.stakePosUsdt, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, smartArbitrageVo.stakePosUsdt);
    }

    public SmartArbitrageVo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull CostVo costVo, @NotNull CostVo costVo2, @NotNull List<EstimatedApyVo> list, @NotNull String str4, PlaceOrderCondition placeOrderCondition, ProfitDetailResponse profitDetailResponse, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(costVo, "");
        Intrinsics.checkNotNullParameter(costVo2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.enlargedAmt = str;
        this.interestDebt = str2;
        this.minimalPaybackDays = str3;
        this.openCost = costVo;
        this.closeCost = costVo2;
        this.estimatedApyList = list;
        this.totalReturnedAmt = str4;
        this.openCondition = placeOrderCondition;
        this.autoStakingProfit = profitDetailResponse;
        this.autoStakingPos = str5;
        this.autoStakingPosUsdt = str6;
        this.stakePosUsdt = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.CostVo:?: TERNARY null = ((wrap:int:0x001c: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002b: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:62) call: com.okinc.unify_trade.biz.CostVo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r19v0 com.okinc.unify_trade.biz.CostVo))
  (wrap:com.okinc.unify_trade.biz.CostVo:?: TERNARY null = ((wrap:int:0x0031: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0040: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:63) call: com.okinc.unify_trade.biz.CostVo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r20v0 com.okinc.unify_trade.biz.CostVo))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0046: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:64)) : (r21v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.PlaceOrderCondition:?: TERNARY null = ((wrap:int:0x0059: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.PlaceOrderCondition) : (r23v0 com.okinc.unify_trade.biz.PlaceOrderCondition))
  (wrap:com.okinc.unify_trade.biz.ProfitDetailResponse:?: TERNARY null = ((wrap:int:0x0062: ARITH (r28v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r24v0 com.okinc.unify_trade.biz.ProfitDetailResponse) : (null com.okinc.unify_trade.biz.ProfitDetailResponse))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0069: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0071: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0079: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.CostVo, com.okinc.unify_trade.biz.CostVo, java.util.List<com.okinc.unify_trade.biz.EstimatedApyVo>, java.lang.String, com.okinc.unify_trade.biz.PlaceOrderCondition, com.okinc.unify_trade.biz.ProfitDetailResponse, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:58) call: com.okinc.unify_trade.biz.SmartArbitrageVo.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.CostVo, com.okinc.unify_trade.biz.CostVo, java.util.List, java.lang.String, com.okinc.unify_trade.biz.PlaceOrderCondition, com.okinc.unify_trade.biz.ProfitDetailResponse, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SmartArbitrageVo(String str, String str2, String str3, CostVo costVo, CostVo costVo2, List list, String str4, PlaceOrderCondition placeOrderCondition, ProfitDetailResponse profitDetailResponse, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? new CostVo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : costVo, (i & 16) != 0 ? new CostVo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : costVo2, (i & 32) != 0 ? yDY.AhwBna() : list, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? null : placeOrderCondition, (i & 256) == 0 ? profitDetailResponse : null, (i & 512) != 0 ? "" : str5, (i & 1024) != 0 ? "" : str6, (i & 2048) == 0 ? str7 : "");
    }
}

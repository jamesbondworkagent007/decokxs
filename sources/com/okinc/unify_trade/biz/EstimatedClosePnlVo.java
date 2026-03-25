package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class EstimatedClosePnlVo implements Parcelable {
    public static final int $stable = 0;
    private final CostVo estimatedCloseCost;
    private final GainVo estimatedCloseGain;
    private final String interestAmt;
    private final CostVo openCost;
    private final String totalPnl;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EstimatedClosePnlVo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EstimatedClosePnlVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EstimatedClosePnlVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EstimatedClosePnlVo(parcel.readString(), parcel.readInt() == 0 ? null : GainVo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : CostVo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CostVo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EstimatedClosePnlVo[] newArray(int i) {
            return new EstimatedClosePnlVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EstimatedClosePnlVo() {
        this((String) null, (GainVo) null, (String) null, (CostVo) null, (CostVo) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EstimatedClosePnlVo copy$default(EstimatedClosePnlVo estimatedClosePnlVo, String str, GainVo gainVo, String str2, CostVo costVo, CostVo costVo2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = estimatedClosePnlVo.totalPnl;
        }
        if ((i & 2) != 0) {
            gainVo = estimatedClosePnlVo.estimatedCloseGain;
        }
        GainVo gainVo2 = gainVo;
        if ((i & 4) != 0) {
            str2 = estimatedClosePnlVo.interestAmt;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            costVo = estimatedClosePnlVo.openCost;
        }
        CostVo costVo3 = costVo;
        if ((i & 16) != 0) {
            costVo2 = estimatedClosePnlVo.estimatedCloseCost;
        }
        return estimatedClosePnlVo.copy(str, gainVo2, str3, costVo3, costVo2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GainVo component2() {
        return this.estimatedCloseGain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.interestAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CostVo component4() {
        return this.openCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CostVo component5() {
        return this.estimatedCloseCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstimatedClosePnlVo copy(@NotNull String str, GainVo gainVo, @NotNull String str2, CostVo costVo, CostVo costVo2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new EstimatedClosePnlVo(str, gainVo, str2, costVo, costVo2);
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
        if (!(obj instanceof EstimatedClosePnlVo)) {
            return false;
        }
        EstimatedClosePnlVo estimatedClosePnlVo = (EstimatedClosePnlVo) obj;
        return Intrinsics.EZpvd((Object) this.totalPnl, (Object) estimatedClosePnlVo.totalPnl) && Intrinsics.EZpvd(this.estimatedCloseGain, estimatedClosePnlVo.estimatedCloseGain) && Intrinsics.EZpvd((Object) this.interestAmt, (Object) estimatedClosePnlVo.interestAmt) && Intrinsics.EZpvd(this.openCost, estimatedClosePnlVo.openCost) && Intrinsics.EZpvd(this.estimatedCloseCost, estimatedClosePnlVo.estimatedCloseCost);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CostVo getEstimatedCloseCost() {
        return this.estimatedCloseCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GainVo getEstimatedCloseGain() {
        return this.estimatedCloseGain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInterestAmt() {
        return this.interestAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CostVo getOpenCost() {
        return this.openCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.totalPnl.hashCode();
        GainVo gainVo = this.estimatedCloseGain;
        int iHashCode2 = gainVo == null ? 0 : gainVo.hashCode();
        int iHashCode3 = this.interestAmt.hashCode();
        CostVo costVo = this.openCost;
        int iHashCode4 = costVo == null ? 0 : costVo.hashCode();
        CostVo costVo2 = this.estimatedCloseCost;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (costVo2 != null ? costVo2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EstimatedClosePnlVo(totalPnl=" + this.totalPnl + ", estimatedCloseGain=" + this.estimatedCloseGain + ", interestAmt=" + this.interestAmt + ", openCost=" + this.openCost + ", estimatedCloseCost=" + this.estimatedCloseCost + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.totalPnl);
        GainVo gainVo = this.estimatedCloseGain;
        if (gainVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gainVo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.interestAmt);
        CostVo costVo = this.openCost;
        if (costVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            costVo.writeToParcel(parcel, i);
        }
        CostVo costVo2 = this.estimatedCloseCost;
        if (costVo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            costVo2.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.EstimatedClosePnlVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EstimatedClosePnlVo> serializer() {
            return EstimatedClosePnlVo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EstimatedClosePnlVo(int i, String str, GainVo gainVo, String str2, CostVo costVo, CostVo costVo2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.totalPnl = "";
        } else {
            this.totalPnl = str;
        }
        if ((i & 2) == 0) {
            this.estimatedCloseGain = null;
        } else {
            this.estimatedCloseGain = gainVo;
        }
        if ((i & 4) == 0) {
            this.interestAmt = "";
        } else {
            this.interestAmt = str2;
        }
        if ((i & 8) == 0) {
            this.openCost = null;
        } else {
            this.openCost = costVo;
        }
        if ((i & 16) == 0) {
            this.estimatedCloseCost = null;
        } else {
            this.estimatedCloseCost = costVo2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(EstimatedClosePnlVo estimatedClosePnlVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) estimatedClosePnlVo.totalPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, estimatedClosePnlVo.totalPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || estimatedClosePnlVo.estimatedCloseGain != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, GainVo$$serializer.INSTANCE, estimatedClosePnlVo.estimatedCloseGain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) estimatedClosePnlVo.interestAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, estimatedClosePnlVo.interestAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || estimatedClosePnlVo.openCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, CostVo$$serializer.INSTANCE, estimatedClosePnlVo.openCost);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && estimatedClosePnlVo.estimatedCloseCost == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, CostVo$$serializer.INSTANCE, estimatedClosePnlVo.estimatedCloseCost);
    }

    public EstimatedClosePnlVo(@NotNull String str, GainVo gainVo, @NotNull String str2, CostVo costVo, CostVo costVo2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.totalPnl = str;
        this.estimatedCloseGain = gainVo;
        this.interestAmt = str2;
        this.openCost = costVo;
        this.estimatedCloseCost = costVo2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.GainVo:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.GainVo) : (r6v0 com.okinc.unify_trade.biz.GainVo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r10v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:com.okinc.unify_trade.biz.CostVo:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.CostVo) : (r8v0 com.okinc.unify_trade.biz.CostVo))
  (wrap:com.okinc.unify_trade.biz.CostVo:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.CostVo) : (r9v0 com.okinc.unify_trade.biz.CostVo))
 A[MD:(java.lang.String, com.okinc.unify_trade.biz.GainVo, java.lang.String, com.okinc.unify_trade.biz.CostVo, com.okinc.unify_trade.biz.CostVo):void (m)] (LINE:4464) call: com.okinc.unify_trade.biz.EstimatedClosePnlVo.<init>(java.lang.String, com.okinc.unify_trade.biz.GainVo, java.lang.String, com.okinc.unify_trade.biz.CostVo, com.okinc.unify_trade.biz.CostVo):void type: THIS */
    public /* synthetic */ EstimatedClosePnlVo(String str, GainVo gainVo, String str2, CostVo costVo, CostVo costVo2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : gainVo, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? null : costVo, (i & 16) != 0 ? null : costVo2);
    }
}

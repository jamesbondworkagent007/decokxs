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
public final class EstimatedStakingVo implements Parcelable {
    public static final int $stable = 0;
    private final String baseCcy;
    private final String nextStakingBaseProfit;
    private final String stakeBaseCcy;
    private final String stakingTotalBaseAmt;
    private final String stakingTotalUsdtAmt;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EstimatedStakingVo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EstimatedStakingVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EstimatedStakingVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EstimatedStakingVo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EstimatedStakingVo[] newArray(int i) {
            return new EstimatedStakingVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EstimatedStakingVo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EstimatedStakingVo copy$default(EstimatedStakingVo estimatedStakingVo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = estimatedStakingVo.stakingTotalBaseAmt;
        }
        if ((i & 2) != 0) {
            str2 = estimatedStakingVo.nextStakingBaseProfit;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = estimatedStakingVo.baseCcy;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = estimatedStakingVo.stakeBaseCcy;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = estimatedStakingVo.stakingTotalUsdtAmt;
        }
        return estimatedStakingVo.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.stakingTotalBaseAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nextStakingBaseProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.baseCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.stakeBaseCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.stakingTotalUsdtAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstimatedStakingVo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new EstimatedStakingVo(str, str2, str3, str4, str5);
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
        if (!(obj instanceof EstimatedStakingVo)) {
            return false;
        }
        EstimatedStakingVo estimatedStakingVo = (EstimatedStakingVo) obj;
        return Intrinsics.EZpvd((Object) this.stakingTotalBaseAmt, (Object) estimatedStakingVo.stakingTotalBaseAmt) && Intrinsics.EZpvd((Object) this.nextStakingBaseProfit, (Object) estimatedStakingVo.nextStakingBaseProfit) && Intrinsics.EZpvd((Object) this.baseCcy, (Object) estimatedStakingVo.baseCcy) && Intrinsics.EZpvd((Object) this.stakeBaseCcy, (Object) estimatedStakingVo.stakeBaseCcy) && Intrinsics.EZpvd((Object) this.stakingTotalUsdtAmt, (Object) estimatedStakingVo.stakingTotalUsdtAmt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCcy() {
        return this.baseCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextStakingBaseProfit() {
        return this.nextStakingBaseProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStakeBaseCcy() {
        return this.stakeBaseCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStakingTotalBaseAmt() {
        return this.stakingTotalBaseAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStakingTotalUsdtAmt() {
        return this.stakingTotalUsdtAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.stakingTotalBaseAmt.hashCode() * 31) + this.nextStakingBaseProfit.hashCode()) * 31) + this.baseCcy.hashCode()) * 31) + this.stakeBaseCcy.hashCode()) * 31) + this.stakingTotalUsdtAmt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EstimatedStakingVo(stakingTotalBaseAmt=" + this.stakingTotalBaseAmt + ", nextStakingBaseProfit=" + this.nextStakingBaseProfit + ", baseCcy=" + this.baseCcy + ", stakeBaseCcy=" + this.stakeBaseCcy + ", stakingTotalUsdtAmt=" + this.stakingTotalUsdtAmt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.stakingTotalBaseAmt);
        parcel.writeString(this.nextStakingBaseProfit);
        parcel.writeString(this.baseCcy);
        parcel.writeString(this.stakeBaseCcy);
        parcel.writeString(this.stakingTotalUsdtAmt);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.EstimatedStakingVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EstimatedStakingVo> serializer() {
            return EstimatedStakingVo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EstimatedStakingVo(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.stakingTotalBaseAmt = "";
        } else {
            this.stakingTotalBaseAmt = str;
        }
        if ((i & 2) == 0) {
            this.nextStakingBaseProfit = "";
        } else {
            this.nextStakingBaseProfit = str2;
        }
        if ((i & 4) == 0) {
            this.baseCcy = "";
        } else {
            this.baseCcy = str3;
        }
        if ((i & 8) == 0) {
            this.stakeBaseCcy = "";
        } else {
            this.stakeBaseCcy = str4;
        }
        if ((i & 16) == 0) {
            this.stakingTotalUsdtAmt = "";
        } else {
            this.stakingTotalUsdtAmt = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(EstimatedStakingVo estimatedStakingVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) estimatedStakingVo.stakingTotalBaseAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, estimatedStakingVo.stakingTotalBaseAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) estimatedStakingVo.nextStakingBaseProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, estimatedStakingVo.nextStakingBaseProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) estimatedStakingVo.baseCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, estimatedStakingVo.baseCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) estimatedStakingVo.stakeBaseCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, estimatedStakingVo.stakeBaseCcy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) estimatedStakingVo.stakingTotalUsdtAmt, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, estimatedStakingVo.stakingTotalUsdtAmt);
    }

    public EstimatedStakingVo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.stakingTotalBaseAmt = str;
        this.nextStakingBaseProfit = str2;
        this.baseCcy = str3;
        this.stakeBaseCcy = str4;
        this.stakingTotalUsdtAmt = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:5553) call: com.okinc.unify_trade.biz.EstimatedStakingVo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EstimatedStakingVo(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}

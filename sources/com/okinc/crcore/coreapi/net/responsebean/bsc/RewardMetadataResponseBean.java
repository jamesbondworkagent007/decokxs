package com.okinc.crcore.coreapi.net.responsebean.bsc;

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

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class RewardMetadataResponseBean implements Parcelable {
    public static final int $stable = 0;
    private final String rewardAmount;
    private final String rewardSettlementCurrency;
    private final String rewardUnit;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<RewardMetadataResponseBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RewardMetadataResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardMetadataResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RewardMetadataResponseBean(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardMetadataResponseBean[] newArray(int i) {
            return new RewardMetadataResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RewardMetadataResponseBean() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RewardMetadataResponseBean copy$default(RewardMetadataResponseBean rewardMetadataResponseBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardMetadataResponseBean.rewardAmount;
        }
        if ((i & 2) != 0) {
            str2 = rewardMetadataResponseBean.rewardUnit;
        }
        if ((i & 4) != 0) {
            str3 = rewardMetadataResponseBean.rewardSettlementCurrency;
        }
        return rewardMetadataResponseBean.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.rewardAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.rewardUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.rewardSettlementCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RewardMetadataResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new RewardMetadataResponseBean(str, str2, str3);
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
        if (!(obj instanceof RewardMetadataResponseBean)) {
            return false;
        }
        RewardMetadataResponseBean rewardMetadataResponseBean = (RewardMetadataResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.rewardAmount, (Object) rewardMetadataResponseBean.rewardAmount) && Intrinsics.EZpvd((Object) this.rewardUnit, (Object) rewardMetadataResponseBean.rewardUnit) && Intrinsics.EZpvd((Object) this.rewardSettlementCurrency, (Object) rewardMetadataResponseBean.rewardSettlementCurrency);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRewardAmount() {
        return this.rewardAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRewardSettlementCurrency() {
        return this.rewardSettlementCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRewardUnit() {
        return this.rewardUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.rewardAmount.hashCode() * 31) + this.rewardUnit.hashCode()) * 31) + this.rewardSettlementCurrency.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RewardMetadataResponseBean(rewardAmount=" + this.rewardAmount + ", rewardUnit=" + this.rewardUnit + ", rewardSettlementCurrency=" + this.rewardSettlementCurrency + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.rewardAmount);
        parcel.writeString(this.rewardUnit);
        parcel.writeString(this.rewardSettlementCurrency);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.RewardMetadataResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RewardMetadataResponseBean> serializer() {
            return RewardMetadataResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RewardMetadataResponseBean(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.rewardAmount = "";
        } else {
            this.rewardAmount = str;
        }
        if ((i & 2) == 0) {
            this.rewardUnit = "";
        } else {
            this.rewardUnit = str2;
        }
        if ((i & 4) == 0) {
            this.rewardSettlementCurrency = "";
        } else {
            this.rewardSettlementCurrency = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(RewardMetadataResponseBean rewardMetadataResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) rewardMetadataResponseBean.rewardAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, rewardMetadataResponseBean.rewardAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) rewardMetadataResponseBean.rewardUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, rewardMetadataResponseBean.rewardUnit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) rewardMetadataResponseBean.rewardSettlementCurrency, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, rewardMetadataResponseBean.rewardSettlementCurrency);
    }

    public RewardMetadataResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.rewardAmount = str;
        this.rewardUnit = str2;
        this.rewardSettlementCurrency = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:103) call: com.okinc.crcore.coreapi.net.responsebean.bsc.RewardMetadataResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RewardMetadataResponseBean(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}

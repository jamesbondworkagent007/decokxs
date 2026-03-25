package com.okinc.referral.bean;

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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class ReferralRewardParam implements Parcelable {
    private String boxCurrency;
    private String boxValue;
    private String depositRequirement;
    private String fixedRewardValue;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ReferralRewardParam> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<ReferralRewardParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReferralRewardParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ReferralRewardParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReferralRewardParam[] newArray(int i) {
            return new ReferralRewardParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ReferralRewardParam() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ReferralRewardParam copy$default(ReferralRewardParam referralRewardParam, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = referralRewardParam.boxValue;
        }
        if ((i & 2) != 0) {
            str2 = referralRewardParam.boxCurrency;
        }
        if ((i & 4) != 0) {
            str3 = referralRewardParam.fixedRewardValue;
        }
        if ((i & 8) != 0) {
            str4 = referralRewardParam.depositRequirement;
        }
        return referralRewardParam.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.boxValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.boxCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fixedRewardValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.depositRequirement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReferralRewardParam copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new ReferralRewardParam(str, str2, str3, str4);
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
        if (!(obj instanceof ReferralRewardParam)) {
            return false;
        }
        ReferralRewardParam referralRewardParam = (ReferralRewardParam) obj;
        return Intrinsics.EZpvd((Object) this.boxValue, (Object) referralRewardParam.boxValue) && Intrinsics.EZpvd((Object) this.boxCurrency, (Object) referralRewardParam.boxCurrency) && Intrinsics.EZpvd((Object) this.fixedRewardValue, (Object) referralRewardParam.fixedRewardValue) && Intrinsics.EZpvd((Object) this.depositRequirement, (Object) referralRewardParam.depositRequirement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBoxCurrency() {
        return this.boxCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBoxValue() {
        return this.boxValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositRequirement() {
        return this.depositRequirement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFixedRewardValue() {
        return this.fixedRewardValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.boxValue.hashCode() * 31) + this.boxCurrency.hashCode()) * 31) + this.fixedRewardValue.hashCode()) * 31) + this.depositRequirement.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBoxCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.boxCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBoxValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.boxValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositRequirement(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.depositRequirement = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFixedRewardValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fixedRewardValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReferralRewardParam(boxValue=" + this.boxValue + ", boxCurrency=" + this.boxCurrency + ", fixedRewardValue=" + this.fixedRewardValue + ", depositRequirement=" + this.depositRequirement + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.boxValue);
        parcel.writeString(this.boxCurrency);
        parcel.writeString(this.fixedRewardValue);
        parcel.writeString(this.depositRequirement);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.referral.bean.ReferralRewardParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReferralRewardParam> serializer() {
            return ReferralRewardParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReferralRewardParam(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.boxValue = "";
        } else {
            this.boxValue = str;
        }
        if ((i & 2) == 0) {
            this.boxCurrency = "";
        } else {
            this.boxCurrency = str2;
        }
        if ((i & 4) == 0) {
            this.fixedRewardValue = "";
        } else {
            this.fixedRewardValue = str3;
        }
        if ((i & 8) == 0) {
            this.depositRequirement = "";
        } else {
            this.depositRequirement = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKReferral_referral_api(ReferralRewardParam referralRewardParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) referralRewardParam.boxValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, referralRewardParam.boxValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) referralRewardParam.boxCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, referralRewardParam.boxCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) referralRewardParam.fixedRewardValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, referralRewardParam.fixedRewardValue);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) referralRewardParam.depositRequirement, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, referralRewardParam.depositRequirement);
    }

    public ReferralRewardParam(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.boxValue = str;
        this.boxCurrency = str2;
        this.fixedRewardValue = str3;
        this.depositRequirement = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:17) call: com.okinc.referral.bean.ReferralRewardParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ReferralRewardParam(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}

package com.okinc.business.finance_api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class EarnRedeemInfo implements Parcelable {
    private String available;
    private boolean eligibility;
    private String unit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EarnRedeemInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EarnRedeemInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnRedeemInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EarnRedeemInfo(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnRedeemInfo[] newArray(int i) {
            return new EarnRedeemInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EarnRedeemInfo() {
        this((String) null, (String) null, false, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EarnRedeemInfo copy$default(EarnRedeemInfo earnRedeemInfo, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = earnRedeemInfo.available;
        }
        if ((i & 2) != 0) {
            str2 = earnRedeemInfo.unit;
        }
        if ((i & 4) != 0) {
            z = earnRedeemInfo.eligibility;
        }
        return earnRedeemInfo.copy(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.available;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.eligibility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnRedeemInfo copy(String str, String str2, boolean z) {
        return new EarnRedeemInfo(str, str2, z);
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
        if (!(obj instanceof EarnRedeemInfo)) {
            return false;
        }
        EarnRedeemInfo earnRedeemInfo = (EarnRedeemInfo) obj;
        return Intrinsics.EZpvd((Object) this.available, (Object) earnRedeemInfo.available) && Intrinsics.EZpvd((Object) this.unit, (Object) earnRedeemInfo.unit) && this.eligibility == earnRedeemInfo.eligibility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailable() {
        return this.available;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEligibility() {
        return this.eligibility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.available;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.unit;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.eligibility);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailable(String str) {
        this.available = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEligibility(boolean z) {
        this.eligibility = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnit(String str) {
        this.unit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarnRedeemInfo(available=" + this.available + ", unit=" + this.unit + ", eligibility=" + this.eligibility + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.available);
        parcel.writeString(this.unit);
        parcel.writeInt(this.eligibility ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.finance_api.bean.EarnRedeemInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EarnRedeemInfo> serializer() {
            return EarnRedeemInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EarnRedeemInfo(int i, String str, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.available = null;
        } else {
            this.available = str;
        }
        if ((i & 2) == 0) {
            this.unit = null;
        } else {
            this.unit = str2;
        }
        if ((i & 4) == 0) {
            this.eligibility = false;
        } else {
            this.eligibility = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKFinance_finance_api(EarnRedeemInfo earnRedeemInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || earnRedeemInfo.available != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, earnRedeemInfo.available);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || earnRedeemInfo.unit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, earnRedeemInfo.unit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || earnRedeemInfo.eligibility) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, earnRedeemInfo.eligibility);
        }
    }

    public EarnRedeemInfo(String str, String str2, boolean z) {
        this.available = str;
        this.unit = str2;
        this.eligibility = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:11) call: com.okinc.business.finance_api.bean.EarnRedeemInfo.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ EarnRedeemInfo(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }
}

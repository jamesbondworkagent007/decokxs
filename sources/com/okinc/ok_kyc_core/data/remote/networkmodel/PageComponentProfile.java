package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class PageComponentProfile implements Parcelable {
    public static final int $stable = 0;
    private final String certificateType;
    private final String countryOfResidence;
    private final Integer maxLevel;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PageComponentProfile> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PageComponentProfile> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PageComponentProfile createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PageComponentProfile(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PageComponentProfile[] newArray(int i) {
            return new PageComponentProfile[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PageComponentProfile() {
        this((Integer) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PageComponentProfile copy$default(PageComponentProfile pageComponentProfile, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = pageComponentProfile.maxLevel;
        }
        if ((i & 2) != 0) {
            str = pageComponentProfile.countryOfResidence;
        }
        if ((i & 4) != 0) {
            str2 = pageComponentProfile.certificateType;
        }
        return pageComponentProfile.copy(num, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.maxLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.countryOfResidence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.certificateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PageComponentProfile copy(Integer num, String str, String str2) {
        return new PageComponentProfile(num, str, str2);
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
        if (!(obj instanceof PageComponentProfile)) {
            return false;
        }
        PageComponentProfile pageComponentProfile = (PageComponentProfile) obj;
        return Intrinsics.EZpvd(this.maxLevel, pageComponentProfile.maxLevel) && Intrinsics.EZpvd((Object) this.countryOfResidence, (Object) pageComponentProfile.countryOfResidence) && Intrinsics.EZpvd((Object) this.certificateType, (Object) pageComponentProfile.certificateType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCertificateType() {
        return this.certificateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCountryOfResidence() {
        return this.countryOfResidence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMaxLevel() {
        return this.maxLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.maxLevel;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.countryOfResidence;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.certificateType;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PageComponentProfile(maxLevel=" + this.maxLevel + ", countryOfResidence=" + this.countryOfResidence + ", certificateType=" + this.certificateType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.maxLevel;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.countryOfResidence);
        parcel.writeString(this.certificateType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PageComponentProfile> serializer() {
            return PageComponentProfile$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PageComponentProfile(int i, Integer num, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.maxLevel = (i & 1) == 0 ? -1 : num;
        if ((i & 2) == 0) {
            this.countryOfResidence = null;
        } else {
            this.countryOfResidence = str;
        }
        if ((i & 4) == 0) {
            this.certificateType = "";
        } else {
            this.certificateType = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(PageComponentProfile pageComponentProfile, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (num = pageComponentProfile.maxLevel) == null || num.intValue() != -1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, pageComponentProfile.maxLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || pageComponentProfile.countryOfResidence != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, pageComponentProfile.countryOfResidence);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) pageComponentProfile.certificateType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, pageComponentProfile.certificateType);
    }

    public PageComponentProfile(Integer num, String str, String str2) {
        this.maxLevel = num;
        this.countryOfResidence = str;
        this.certificateType = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r1v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String):void (m)] (LINE:98) call: com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile.<init>(java.lang.Integer, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PageComponentProfile(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1 : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? "" : str2);
    }
}

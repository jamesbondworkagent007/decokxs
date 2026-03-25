package com.okinc.ok_kyc_core.data.remote.networkmodel;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class VerificationPayload implements Parcelable {
    public static final int $stable = 0;
    private final String address;
    private final String darkLogoUrl;
    private final String logoUrl;
    private final String messageModel;
    private final String subCurrencyId;
    private final String title;
    private final String url;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<VerificationPayload> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<VerificationPayload> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VerificationPayload createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VerificationPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VerificationPayload[] newArray(int i) {
            return new VerificationPayload[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VerificationPayload() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VerificationPayload copy$default(VerificationPayload verificationPayload, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verificationPayload.address;
        }
        if ((i & 2) != 0) {
            str2 = verificationPayload.messageModel;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = verificationPayload.subCurrencyId;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = verificationPayload.title;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = verificationPayload.url;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = verificationPayload.logoUrl;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = verificationPayload.darkLogoUrl;
        }
        return verificationPayload.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.messageModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.logoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.darkLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerificationPayload copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new VerificationPayload(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof VerificationPayload)) {
            return false;
        }
        VerificationPayload verificationPayload = (VerificationPayload) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) verificationPayload.address) && Intrinsics.EZpvd((Object) this.messageModel, (Object) verificationPayload.messageModel) && Intrinsics.EZpvd((Object) this.subCurrencyId, (Object) verificationPayload.subCurrencyId) && Intrinsics.EZpvd((Object) this.title, (Object) verificationPayload.title) && Intrinsics.EZpvd((Object) this.url, (Object) verificationPayload.url) && Intrinsics.EZpvd((Object) this.logoUrl, (Object) verificationPayload.logoUrl) && Intrinsics.EZpvd((Object) this.darkLogoUrl, (Object) verificationPayload.darkLogoUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDarkLogoUrl() {
        return this.darkLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessageModel() {
        return this.messageModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.messageModel;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.subCurrencyId;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.title;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.url;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.logoUrl;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.darkLogoUrl;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VerificationPayload(address=" + this.address + ", messageModel=" + this.messageModel + ", subCurrencyId=" + this.subCurrencyId + ", title=" + this.title + ", url=" + this.url + ", logoUrl=" + this.logoUrl + ", darkLogoUrl=" + this.darkLogoUrl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeString(this.messageModel);
        parcel.writeString(this.subCurrencyId);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeString(this.logoUrl);
        parcel.writeString(this.darkLogoUrl);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.VerificationPayload.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VerificationPayload> serializer() {
            return VerificationPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VerificationPayload(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.address = null;
        } else {
            this.address = str;
        }
        if ((i & 2) == 0) {
            this.messageModel = null;
        } else {
            this.messageModel = str2;
        }
        if ((i & 4) == 0) {
            this.subCurrencyId = null;
        } else {
            this.subCurrencyId = str3;
        }
        if ((i & 8) == 0) {
            this.title = null;
        } else {
            this.title = str4;
        }
        if ((i & 16) == 0) {
            this.url = null;
        } else {
            this.url = str5;
        }
        if ((i & 32) == 0) {
            this.logoUrl = null;
        } else {
            this.logoUrl = str6;
        }
        if ((i & 64) == 0) {
            this.darkLogoUrl = null;
        } else {
            this.darkLogoUrl = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(VerificationPayload verificationPayload, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || verificationPayload.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, verificationPayload.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || verificationPayload.messageModel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, verificationPayload.messageModel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || verificationPayload.subCurrencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, verificationPayload.subCurrencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || verificationPayload.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, verificationPayload.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || verificationPayload.url != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, verificationPayload.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || verificationPayload.logoUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, verificationPayload.logoUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && verificationPayload.darkLogoUrl == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, verificationPayload.darkLogoUrl);
    }

    public VerificationPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.address = str;
        this.messageModel = str2;
        this.subCurrencyId = str3;
        this.title = str4;
        this.url = str5;
        this.logoUrl = str6;
        this.darkLogoUrl = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1639) call: com.okinc.ok_kyc_core.data.remote.networkmodel.VerificationPayload.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ VerificationPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}

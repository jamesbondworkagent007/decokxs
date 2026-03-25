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

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class SelectPopUpChoiceData implements Parcelable {
    private final String badge;
    private final CTAButton cta;
    private final String image;
    private final String subtitle;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SelectPopUpChoiceData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SelectPopUpChoiceData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectPopUpChoiceData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SelectPopUpChoiceData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CTAButton.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectPopUpChoiceData[] newArray(int i) {
            return new SelectPopUpChoiceData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SelectPopUpChoiceData() {
        this((String) null, (String) null, (String) null, (String) null, (CTAButton) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SelectPopUpChoiceData copy$default(SelectPopUpChoiceData selectPopUpChoiceData, String str, String str2, String str3, String str4, CTAButton cTAButton, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectPopUpChoiceData.image;
        }
        if ((i & 2) != 0) {
            str2 = selectPopUpChoiceData.title;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = selectPopUpChoiceData.subtitle;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = selectPopUpChoiceData.badge;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            cTAButton = selectPopUpChoiceData.cta;
        }
        return selectPopUpChoiceData.copy(str, str5, str6, str7, cTAButton);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.badge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton component5() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelectPopUpChoiceData copy(String str, String str2, String str3, String str4, CTAButton cTAButton) {
        return new SelectPopUpChoiceData(str, str2, str3, str4, cTAButton);
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
        if (!(obj instanceof SelectPopUpChoiceData)) {
            return false;
        }
        SelectPopUpChoiceData selectPopUpChoiceData = (SelectPopUpChoiceData) obj;
        return Intrinsics.EZpvd((Object) this.image, (Object) selectPopUpChoiceData.image) && Intrinsics.EZpvd((Object) this.title, (Object) selectPopUpChoiceData.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) selectPopUpChoiceData.subtitle) && Intrinsics.EZpvd((Object) this.badge, (Object) selectPopUpChoiceData.badge) && Intrinsics.EZpvd(this.cta, selectPopUpChoiceData.cta);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBadge() {
        return this.badge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImage() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.image;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.title;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.subtitle;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.badge;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        CTAButton cTAButton = this.cta;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (cTAButton != null ? cTAButton.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SelectPopUpChoiceData(image=" + this.image + ", title=" + this.title + ", subtitle=" + this.subtitle + ", badge=" + this.badge + ", cta=" + this.cta + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.image);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.badge);
        CTAButton cTAButton = this.cta;
        if (cTAButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButton.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.SelectPopUpChoiceData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SelectPopUpChoiceData> serializer() {
            return SelectPopUpChoiceData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SelectPopUpChoiceData(int i, String str, String str2, String str3, String str4, CTAButton cTAButton, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.image = "";
        } else {
            this.image = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str3;
        }
        if ((i & 8) == 0) {
            this.badge = "";
        } else {
            this.badge = str4;
        }
        if ((i & 16) == 0) {
            this.cta = null;
        } else {
            this.cta = cTAButton;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(SelectPopUpChoiceData selectPopUpChoiceData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) selectPopUpChoiceData.image, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, selectPopUpChoiceData.image);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) selectPopUpChoiceData.title, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, selectPopUpChoiceData.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) selectPopUpChoiceData.subtitle, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, selectPopUpChoiceData.subtitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) selectPopUpChoiceData.badge, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, selectPopUpChoiceData.badge);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && selectPopUpChoiceData.cta == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, CTAButton$$serializer.INSTANCE, selectPopUpChoiceData.cta);
    }

    public SelectPopUpChoiceData(String str, String str2, String str3, String str4, CTAButton cTAButton) {
        this.image = str;
        this.title = str2;
        this.subtitle = str3;
        this.badge = str4;
        this.cta = cTAButton;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton) : (r8v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton):void (m)] (LINE:4887) call: com.okinc.ok_kyc_core.data.remote.networkmodel.SelectPopUpChoiceData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton):void type: THIS */
    public /* synthetic */ SelectPopUpChoiceData(String str, String str2, String str3, String str4, CTAButton cTAButton, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? null : cTAButton);
    }
}

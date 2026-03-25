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
public final class SelectPopUpChoice implements Parcelable {
    private final String badge;
    private final CTAButtonAppModel cta;
    private final String image;
    private final String subTitle;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SelectPopUpChoice> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SelectPopUpChoice> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectPopUpChoice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SelectPopUpChoice(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CTAButtonAppModel.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectPopUpChoice[] newArray(int i) {
            return new SelectPopUpChoice[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SelectPopUpChoice() {
        this((String) null, (String) null, (String) null, (String) null, (CTAButtonAppModel) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SelectPopUpChoice copy$default(SelectPopUpChoice selectPopUpChoice, String str, String str2, String str3, String str4, CTAButtonAppModel cTAButtonAppModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectPopUpChoice.image;
        }
        if ((i & 2) != 0) {
            str2 = selectPopUpChoice.title;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = selectPopUpChoice.subTitle;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = selectPopUpChoice.badge;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            cTAButtonAppModel = selectPopUpChoice.cta;
        }
        return selectPopUpChoice.copy(str, str5, str6, str7, cTAButtonAppModel);
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
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.badge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel component5() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelectPopUpChoice copy(String str, String str2, String str3, String str4, CTAButtonAppModel cTAButtonAppModel) {
        return new SelectPopUpChoice(str, str2, str3, str4, cTAButtonAppModel);
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
        if (!(obj instanceof SelectPopUpChoice)) {
            return false;
        }
        SelectPopUpChoice selectPopUpChoice = (SelectPopUpChoice) obj;
        return Intrinsics.EZpvd((Object) this.image, (Object) selectPopUpChoice.image) && Intrinsics.EZpvd((Object) this.title, (Object) selectPopUpChoice.title) && Intrinsics.EZpvd((Object) this.subTitle, (Object) selectPopUpChoice.subTitle) && Intrinsics.EZpvd((Object) this.badge, (Object) selectPopUpChoice.badge) && Intrinsics.EZpvd(this.cta, selectPopUpChoice.cta);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBadge() {
        return this.badge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImage() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubTitle() {
        return this.subTitle;
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
        String str3 = this.subTitle;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.badge;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        CTAButtonAppModel cTAButtonAppModel = this.cta;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (cTAButtonAppModel != null ? cTAButtonAppModel.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SelectPopUpChoice(image=" + this.image + ", title=" + this.title + ", subTitle=" + this.subTitle + ", badge=" + this.badge + ", cta=" + this.cta + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.image);
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        parcel.writeString(this.badge);
        CTAButtonAppModel cTAButtonAppModel = this.cta;
        if (cTAButtonAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButtonAppModel.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.SelectPopUpChoice.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SelectPopUpChoice> serializer() {
            return SelectPopUpChoice$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SelectPopUpChoice(int i, String str, String str2, String str3, String str4, CTAButtonAppModel cTAButtonAppModel, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.subTitle = "";
        } else {
            this.subTitle = str3;
        }
        if ((i & 8) == 0) {
            this.badge = "";
        } else {
            this.badge = str4;
        }
        if ((i & 16) == 0) {
            this.cta = null;
        } else {
            this.cta = cTAButtonAppModel;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(SelectPopUpChoice selectPopUpChoice, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) selectPopUpChoice.image, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, selectPopUpChoice.image);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) selectPopUpChoice.title, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, selectPopUpChoice.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) selectPopUpChoice.subTitle, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, selectPopUpChoice.subTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) selectPopUpChoice.badge, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, selectPopUpChoice.badge);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && selectPopUpChoice.cta == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, CTAButtonAppModel$$serializer.INSTANCE, selectPopUpChoice.cta);
    }

    public SelectPopUpChoice(String str, String str2, String str3, String str4, CTAButtonAppModel cTAButtonAppModel) {
        this.image = str;
        this.title = str2;
        this.subTitle = str3;
        this.badge = str4;
        this.cta = cTAButtonAppModel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel) : (r8v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel):void (m)] (LINE:4898) call: com.okinc.ok_kyc_core.data.remote.networkmodel.SelectPopUpChoice.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel):void type: THIS */
    public /* synthetic */ SelectPopUpChoice(String str, String str2, String str3, String str4, CTAButtonAppModel cTAButtonAppModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? null : cTAButtonAppModel);
    }
}

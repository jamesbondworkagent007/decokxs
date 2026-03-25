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
public final class CtaListItem implements Parcelable {
    private final String content;
    private final String contentColor;
    private final CTAButtonAppModel cta;
    private final String eventTrackingName;
    private final boolean isConfidential;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CtaListItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CtaListItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaListItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CtaListItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CTAButtonAppModel.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaListItem[] newArray(int i) {
            return new CtaListItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CtaListItem() {
        this((String) null, (String) null, (String) null, (CTAButtonAppModel) null, (String) null, false, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CtaListItem copy$default(CtaListItem ctaListItem, String str, String str2, String str3, CTAButtonAppModel cTAButtonAppModel, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ctaListItem.title;
        }
        if ((i & 2) != 0) {
            str2 = ctaListItem.content;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = ctaListItem.contentColor;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            cTAButtonAppModel = ctaListItem.cta;
        }
        CTAButtonAppModel cTAButtonAppModel2 = cTAButtonAppModel;
        if ((i & 16) != 0) {
            str4 = ctaListItem.eventTrackingName;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            z = ctaListItem.isConfidential;
        }
        return ctaListItem.copy(str, str5, str6, cTAButtonAppModel2, str7, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.contentColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel component4() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.eventTrackingName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isConfidential;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaListItem copy(String str, String str2, String str3, CTAButtonAppModel cTAButtonAppModel, String str4, boolean z) {
        return new CtaListItem(str, str2, str3, cTAButtonAppModel, str4, z);
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
        if (!(obj instanceof CtaListItem)) {
            return false;
        }
        CtaListItem ctaListItem = (CtaListItem) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) ctaListItem.title) && Intrinsics.EZpvd((Object) this.content, (Object) ctaListItem.content) && Intrinsics.EZpvd((Object) this.contentColor, (Object) ctaListItem.contentColor) && Intrinsics.EZpvd(this.cta, ctaListItem.cta) && Intrinsics.EZpvd((Object) this.eventTrackingName, (Object) ctaListItem.eventTrackingName) && this.isConfidential == ctaListItem.isConfidential;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContentColor() {
        return this.contentColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEventTrackingName() {
        return this.eventTrackingName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.title;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.content;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.contentColor;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        CTAButtonAppModel cTAButtonAppModel = this.cta;
        int iHashCode4 = cTAButtonAppModel == null ? 0 : cTAButtonAppModel.hashCode();
        String str4 = this.eventTrackingName;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + Boolean.hashCode(this.isConfidential);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConfidential() {
        return this.isConfidential;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CtaListItem(title=" + this.title + ", content=" + this.content + ", contentColor=" + this.contentColor + ", cta=" + this.cta + ", eventTrackingName=" + this.eventTrackingName + ", isConfidential=" + this.isConfidential + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.contentColor);
        CTAButtonAppModel cTAButtonAppModel = this.cta;
        if (cTAButtonAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButtonAppModel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.eventTrackingName);
        parcel.writeInt(this.isConfidential ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaListItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CtaListItem> serializer() {
            return CtaListItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CtaListItem(int i, String str, String str2, String str3, CTAButtonAppModel cTAButtonAppModel, String str4, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.content = null;
        } else {
            this.content = str2;
        }
        if ((i & 4) == 0) {
            this.contentColor = null;
        } else {
            this.contentColor = str3;
        }
        if ((i & 8) == 0) {
            this.cta = null;
        } else {
            this.cta = cTAButtonAppModel;
        }
        if ((i & 16) == 0) {
            this.eventTrackingName = "";
        } else {
            this.eventTrackingName = str4;
        }
        if ((i & 32) == 0) {
            this.isConfidential = false;
        } else {
            this.isConfidential = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CtaListItem ctaListItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) ctaListItem.title, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, ctaListItem.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || ctaListItem.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, ctaListItem.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || ctaListItem.contentColor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, ctaListItem.contentColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || ctaListItem.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, CTAButtonAppModel$$serializer.INSTANCE, ctaListItem.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) ctaListItem.eventTrackingName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, ctaListItem.eventTrackingName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || ctaListItem.isConfidential) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, ctaListItem.isConfidential);
        }
    }

    public CtaListItem(String str, String str2, String str3, CTAButtonAppModel cTAButtonAppModel, String str4, boolean z) {
        this.title = str;
        this.content = str2;
        this.contentColor = str3;
        this.cta = cTAButtonAppModel;
        this.eventTrackingName = str4;
        this.isConfidential = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel:?: TERNARY null = ((wrap:int:0x0018: ARITH (r11v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r8v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel) : (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, java.lang.String, boolean):void (m)] (LINE:4482) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaListItem.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ CtaListItem(String str, String str2, String str3, CTAButtonAppModel cTAButtonAppModel, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? cTAButtonAppModel : null, (i & 16) == 0 ? str4 : "", (i & 32) != 0 ? false : z);
    }
}

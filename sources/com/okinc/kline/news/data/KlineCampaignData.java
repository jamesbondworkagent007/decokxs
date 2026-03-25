package com.okinc.kline.news.data;

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

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class KlineCampaignData implements Parcelable {
    private final String activeId;
    private final String flashType;
    private final String language;
    private String seoDescription;
    private String seoTitle;
    private final String urlSlug;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<KlineCampaignData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<KlineCampaignData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlineCampaignData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new KlineCampaignData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlineCampaignData[] newArray(int i) {
            return new KlineCampaignData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KlineCampaignData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KlineCampaignData copy$default(KlineCampaignData klineCampaignData, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = klineCampaignData.activeId;
        }
        if ((i & 2) != 0) {
            str2 = klineCampaignData.urlSlug;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = klineCampaignData.language;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = klineCampaignData.seoTitle;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = klineCampaignData.seoDescription;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = klineCampaignData.flashType;
        }
        return klineCampaignData.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.activeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.urlSlug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.seoTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.seoDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.flashType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineCampaignData copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new KlineCampaignData(str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof KlineCampaignData)) {
            return false;
        }
        KlineCampaignData klineCampaignData = (KlineCampaignData) obj;
        return Intrinsics.EZpvd((Object) this.activeId, (Object) klineCampaignData.activeId) && Intrinsics.EZpvd((Object) this.urlSlug, (Object) klineCampaignData.urlSlug) && Intrinsics.EZpvd((Object) this.language, (Object) klineCampaignData.language) && Intrinsics.EZpvd((Object) this.seoTitle, (Object) klineCampaignData.seoTitle) && Intrinsics.EZpvd((Object) this.seoDescription, (Object) klineCampaignData.seoDescription) && Intrinsics.EZpvd((Object) this.flashType, (Object) klineCampaignData.flashType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActiveId() {
        return this.activeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFlashType() {
        return this.flashType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSeoDescription() {
        return this.seoDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSeoTitle() {
        return this.seoTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrlSlug() {
        return this.urlSlug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.activeId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.urlSlug;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.language;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.seoTitle;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.seoDescription;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.flashType;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSeoDescription(String str) {
        this.seoDescription = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSeoTitle(String str) {
        this.seoTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KlineCampaignData(activeId=" + this.activeId + ", urlSlug=" + this.urlSlug + ", language=" + this.language + ", seoTitle=" + this.seoTitle + ", seoDescription=" + this.seoDescription + ", flashType=" + this.flashType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.activeId);
        parcel.writeString(this.urlSlug);
        parcel.writeString(this.language);
        parcel.writeString(this.seoTitle);
        parcel.writeString(this.seoDescription);
        parcel.writeString(this.flashType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.news.data.KlineCampaignData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KlineCampaignData> serializer() {
            return KlineCampaignData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KlineCampaignData(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.activeId = null;
        } else {
            this.activeId = str;
        }
        if ((i & 2) == 0) {
            this.urlSlug = null;
        } else {
            this.urlSlug = str2;
        }
        if ((i & 4) == 0) {
            this.language = null;
        } else {
            this.language = str3;
        }
        if ((i & 8) == 0) {
            this.seoTitle = null;
        } else {
            this.seoTitle = str4;
        }
        if ((i & 16) == 0) {
            this.seoDescription = null;
        } else {
            this.seoDescription = str5;
        }
        if ((i & 32) == 0) {
            this.flashType = null;
        } else {
            this.flashType = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKKLine_kline_impl(KlineCampaignData klineCampaignData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || klineCampaignData.activeId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, klineCampaignData.activeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || klineCampaignData.urlSlug != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, klineCampaignData.urlSlug);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || klineCampaignData.language != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, klineCampaignData.language);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || klineCampaignData.seoTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, klineCampaignData.seoTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || klineCampaignData.seoDescription != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, klineCampaignData.seoDescription);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && klineCampaignData.flashType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, klineCampaignData.flashType);
    }

    public KlineCampaignData(String str, String str2, String str3, String str4, String str5, String str6) {
        this.activeId = str;
        this.urlSlug = str2;
        this.language = str3;
        this.seoTitle = str4;
        this.seoDescription = str5;
        this.flashType = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:18) call: com.okinc.kline.news.data.KlineCampaignData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ KlineCampaignData(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}

package com.okinc.dexkline.market.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.okinc.dexkline.market.common.constants.StringBooleanType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class TagExtraData implements Parcelable {
    public static final int $stable = 0;

    @SerializedName("deepLink")
    private final String eventDeeplink;

    @SerializedName("link")
    private final String eventLink;

    @SerializedName("isLinkInternal")
    private final StringBooleanType isEventInternal;

    @SerializedName("kolTwitterImageFullPath")
    private final String kolAvatarUrl;

    @SerializedName("kolTwitterLink")
    private final String kolLink;

    @SerializedName("name")
    private final String name;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TagExtraData> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, StringBooleanType.Companion.serializer()};

    public static final class Creator implements Parcelable.Creator<TagExtraData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TagExtraData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TagExtraData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), StringBooleanType.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TagExtraData[] newArray(int i) {
            return new TagExtraData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TagExtraData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (StringBooleanType) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TagExtraData copy$default(TagExtraData tagExtraData, String str, String str2, String str3, String str4, String str5, StringBooleanType stringBooleanType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tagExtraData.name;
        }
        if ((i & 2) != 0) {
            str2 = tagExtraData.kolAvatarUrl;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = tagExtraData.kolLink;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = tagExtraData.eventDeeplink;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = tagExtraData.eventLink;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            stringBooleanType = tagExtraData.isEventInternal;
        }
        return tagExtraData.EZpvd(str, str6, str7, str8, str9, stringBooleanType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.eventLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StringBooleanType AYXKKw() {
        return this.isEventInternal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagExtraData EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull StringBooleanType stringBooleanType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(stringBooleanType, "");
        return new TagExtraData(str, str2, str3, str4, str5, stringBooleanType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.eventDeeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.kolAvatarUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.kolLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagExtraData)) {
            return false;
        }
        TagExtraData tagExtraData = (TagExtraData) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) tagExtraData.name) && Intrinsics.EZpvd((Object) this.kolAvatarUrl, (Object) tagExtraData.kolAvatarUrl) && Intrinsics.EZpvd((Object) this.kolLink, (Object) tagExtraData.kolLink) && Intrinsics.EZpvd((Object) this.eventDeeplink, (Object) tagExtraData.eventDeeplink) && Intrinsics.EZpvd((Object) this.eventLink, (Object) tagExtraData.eventLink) && this.isEventInternal == tagExtraData.isEventInternal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.name.hashCode() * 31) + this.kolAvatarUrl.hashCode()) * 31) + this.kolLink.hashCode()) * 31) + this.eventDeeplink.hashCode()) * 31) + this.eventLink.hashCode()) * 31) + this.isEventInternal.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TagExtraData(name=" + this.name + ", kolAvatarUrl=" + this.kolAvatarUrl + ", kolLink=" + this.kolLink + ", eventDeeplink=" + this.eventDeeplink + ", eventLink=" + this.eventLink + ", isEventInternal=" + this.isEventInternal + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.name);
        parcel.writeString(this.kolAvatarUrl);
        parcel.writeString(this.kolLink);
        parcel.writeString(this.eventDeeplink);
        parcel.writeString(this.eventLink);
        parcel.writeString(this.isEventInternal.name());
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.data.model.TagExtraData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TagExtraData> serializer() {
            return TagExtraData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TagExtraData(int i, String str, String str2, String str3, String str4, String str5, StringBooleanType stringBooleanType, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.kolAvatarUrl = "";
        } else {
            this.kolAvatarUrl = str2;
        }
        if ((i & 4) == 0) {
            this.kolLink = "";
        } else {
            this.kolLink = str3;
        }
        if ((i & 8) == 0) {
            this.eventDeeplink = "";
        } else {
            this.eventDeeplink = str4;
        }
        if ((i & 16) == 0) {
            this.eventLink = "";
        } else {
            this.eventLink = str5;
        }
        if ((i & 32) == 0) {
            this.isEventInternal = StringBooleanType.FALSE;
        } else {
            this.isEventInternal = stringBooleanType;
        }
    }

    public static final /* synthetic */ void copydefault(TagExtraData tagExtraData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tagExtraData.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tagExtraData.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tagExtraData.kolAvatarUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tagExtraData.kolAvatarUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tagExtraData.kolLink, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tagExtraData.kolLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tagExtraData.eventDeeplink, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tagExtraData.eventDeeplink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tagExtraData.eventLink, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tagExtraData.eventLink);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && tagExtraData.isEventInternal == StringBooleanType.FALSE) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], tagExtraData.isEventInternal);
    }

    public TagExtraData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull StringBooleanType stringBooleanType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(stringBooleanType, "");
        this.name = str;
        this.kolAvatarUrl = str2;
        this.kolLink = str3;
        this.eventDeeplink = str4;
        this.eventLink = str5;
        this.isEventInternal = stringBooleanType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:com.okinc.dexkline.market.common.constants.StringBooleanType:?: TERNARY null = ((wrap:int:0x0024: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.dexkline.market.common.constants.StringBooleanType:0x0028: SGET  A[WRAPPED] (LINE:30) com.okinc.dexkline.market.common.constants.StringBooleanType.FALSE com.okinc.dexkline.market.common.constants.StringBooleanType) : (r10v0 com.okinc.dexkline.market.common.constants.StringBooleanType))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.dexkline.market.common.constants.StringBooleanType):void (m)] (LINE:12) call: com.okinc.dexkline.market.data.model.TagExtraData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.dexkline.market.common.constants.StringBooleanType):void type: THIS */
    public /* synthetic */ TagExtraData(String str, String str2, String str3, String str4, String str5, StringBooleanType stringBooleanType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? StringBooleanType.FALSE : stringBooleanType);
    }
}

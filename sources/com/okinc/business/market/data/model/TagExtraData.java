package com.okinc.business.market.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.okinc.business.market.common.constants.StringBooleanType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TagExtraData implements Parcelable {
    public static final int $stable = 0;

    @SerializedName("b")
    private final String belong;

    @SerializedName("deepLink")
    private final String eventDeeplink;

    @SerializedName("link")
    private final String eventLink;

    @SerializedName("iconText")
    private final String iconText;

    @SerializedName("isLinkInternal")
    private final StringBooleanType isEventInternal;

    @SerializedName("kolTwitterImageFullPath")
    private final String kolAvatarUrl;

    @SerializedName("kolTwitterLink")
    private final String kolLink;

    @SerializedName("name")
    private final String name;

    @SerializedName(TtmlNode.TAG_P)
    private final String rwaPlatform;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TagExtraData> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, StringBooleanType.Companion.serializer(), null, null, null};

    public static final class Creator implements Parcelable.Creator<TagExtraData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TagExtraData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TagExtraData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), StringBooleanType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
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
        this((String) null, (String) null, (String) null, (String) null, (String) null, (StringBooleanType) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.eventDeeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StringBooleanType AYXKKw() {
        return this.isEventInternal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.belong;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.iconText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagExtraData copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull StringBooleanType stringBooleanType, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(stringBooleanType, "");
        return new TagExtraData(str, str2, str3, str4, str5, stringBooleanType, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.eventLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.kolLink;
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
        return Intrinsics.EZpvd((Object) this.name, (Object) tagExtraData.name) && Intrinsics.EZpvd((Object) this.kolAvatarUrl, (Object) tagExtraData.kolAvatarUrl) && Intrinsics.EZpvd((Object) this.kolLink, (Object) tagExtraData.kolLink) && Intrinsics.EZpvd((Object) this.eventDeeplink, (Object) tagExtraData.eventDeeplink) && Intrinsics.EZpvd((Object) this.eventLink, (Object) tagExtraData.eventLink) && this.isEventInternal == tagExtraData.isEventInternal && Intrinsics.EZpvd((Object) this.iconText, (Object) tagExtraData.iconText) && Intrinsics.EZpvd((Object) this.rwaPlatform, (Object) tagExtraData.rwaPlatform) && Intrinsics.EZpvd((Object) this.belong, (Object) tagExtraData.belong);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.kolAvatarUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.name.hashCode();
        int iHashCode2 = this.kolAvatarUrl.hashCode();
        int iHashCode3 = this.kolLink.hashCode();
        int iHashCode4 = this.eventDeeplink.hashCode();
        int iHashCode5 = this.eventLink.hashCode();
        int iHashCode6 = this.isEventInternal.hashCode();
        String str = this.iconText;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.rwaPlatform;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.belong;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TagExtraData(name=" + this.name + ", kolAvatarUrl=" + this.kolAvatarUrl + ", kolLink=" + this.kolLink + ", eventDeeplink=" + this.eventDeeplink + ", eventLink=" + this.eventLink + ", isEventInternal=" + this.isEventInternal + ", iconText=" + this.iconText + ", rwaPlatform=" + this.rwaPlatform + ", belong=" + this.belong + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.rwaPlatform;
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
        parcel.writeString(this.iconText);
        parcel.writeString(this.rwaPlatform);
        parcel.writeString(this.belong);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.TagExtraData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TagExtraData> serializer() {
            return TagExtraData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TagExtraData(int i, String str, String str2, String str3, String str4, String str5, StringBooleanType stringBooleanType, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
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
        if ((i & 64) == 0) {
            this.iconText = null;
        } else {
            this.iconText = str6;
        }
        if ((i & 128) == 0) {
            this.rwaPlatform = null;
        } else {
            this.rwaPlatform = str7;
        }
        if ((i & 256) == 0) {
            this.belong = null;
        } else {
            this.belong = str8;
        }
    }

    public static final /* synthetic */ void KWHzl(TagExtraData tagExtraData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
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
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || tagExtraData.isEventInternal != StringBooleanType.FALSE) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], tagExtraData.isEventInternal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || tagExtraData.iconText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, tagExtraData.iconText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || tagExtraData.rwaPlatform != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, tagExtraData.rwaPlatform);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && tagExtraData.belong == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, tagExtraData.belong);
    }

    public TagExtraData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull StringBooleanType stringBooleanType, String str6, String str7, String str8) {
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
        this.iconText = str6;
        this.rwaPlatform = str7;
        this.belong = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0056: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.String) : (""))
  (wrap:com.okinc.business.market.common.constants.StringBooleanType:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002a: SGET  A[WRAPPED] (LINE:30) com.okinc.business.market.common.constants.StringBooleanType.FALSE com.okinc.business.market.common.constants.StringBooleanType) : (r16v0 com.okinc.business.market.common.constants.StringBooleanType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.StringBooleanType, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.business.market.data.model.TagExtraData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.StringBooleanType, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TagExtraData(String str, String str2, String str3, String str4, String str5, StringBooleanType stringBooleanType, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? StringBooleanType.FALSE : stringBooleanType, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) == 0 ? str8 : null);
    }
}

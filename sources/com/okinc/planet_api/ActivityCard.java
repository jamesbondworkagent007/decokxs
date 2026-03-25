package com.okinc.planet_api;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ActivityCard implements Parcelable {
    public static final int $stable = 0;
    private final String activityId;
    private final String deeplink;
    private final String description;
    private final ActivityCardImage image;
    private final String linkUrl;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ActivityCard> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ActivityCard> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActivityCard createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ActivityCard(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ActivityCardImage.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActivityCard[] newArray(int i) {
            return new ActivityCard[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ActivityCard() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (ActivityCardImage) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ActivityCard copy$default(ActivityCard activityCard, String str, String str2, String str3, String str4, String str5, ActivityCardImage activityCardImage, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityCard.activityId;
        }
        if ((i & 2) != 0) {
            str2 = activityCard.linkUrl;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = activityCard.deeplink;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = activityCard.title;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = activityCard.description;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            activityCardImage = activityCard.image;
        }
        return activityCard.copy(str, str6, str7, str8, str9, activityCardImage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.activityId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.linkUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityCardImage component6() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityCard copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, ActivityCardImage activityCardImage) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new ActivityCard(str, str2, str3, str4, str5, activityCardImage);
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
        if (!(obj instanceof ActivityCard)) {
            return false;
        }
        ActivityCard activityCard = (ActivityCard) obj;
        return Intrinsics.EZpvd((Object) this.activityId, (Object) activityCard.activityId) && Intrinsics.EZpvd((Object) this.linkUrl, (Object) activityCard.linkUrl) && Intrinsics.EZpvd((Object) this.deeplink, (Object) activityCard.deeplink) && Intrinsics.EZpvd((Object) this.title, (Object) activityCard.title) && Intrinsics.EZpvd((Object) this.description, (Object) activityCard.description) && Intrinsics.EZpvd(this.image, activityCard.image);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivityId() {
        return this.activityId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityCardImage getImage() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.activityId.hashCode();
        int iHashCode2 = this.linkUrl.hashCode();
        int iHashCode3 = this.deeplink.hashCode();
        int iHashCode4 = this.title.hashCode();
        int iHashCode5 = this.description.hashCode();
        ActivityCardImage activityCardImage = this.image;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (activityCardImage == null ? 0 : activityCardImage.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ActivityCard(activityId=" + this.activityId + ", linkUrl=" + this.linkUrl + ", deeplink=" + this.deeplink + ", title=" + this.title + ", description=" + this.description + ", image=" + this.image + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.activityId);
        parcel.writeString(this.linkUrl);
        parcel.writeString(this.deeplink);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        ActivityCardImage activityCardImage = this.image;
        if (activityCardImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            activityCardImage.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet_api.ActivityCard.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ActivityCard> serializer() {
            return ActivityCard$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ActivityCard(int i, String str, String str2, String str3, String str4, String str5, ActivityCardImage activityCardImage, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.activityId = "";
        } else {
            this.activityId = str;
        }
        if ((i & 2) == 0) {
            this.linkUrl = "";
        } else {
            this.linkUrl = str2;
        }
        if ((i & 4) == 0) {
            this.deeplink = "";
        } else {
            this.deeplink = str3;
        }
        if ((i & 8) == 0) {
            this.title = "";
        } else {
            this.title = str4;
        }
        if ((i & 16) == 0) {
            this.description = "";
        } else {
            this.description = str5;
        }
        if ((i & 32) == 0) {
            this.image = null;
        } else {
            this.image = activityCardImage;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_api(ActivityCard activityCard, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) activityCard.activityId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, activityCard.activityId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) activityCard.linkUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, activityCard.linkUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) activityCard.deeplink, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, activityCard.deeplink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) activityCard.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, activityCard.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) activityCard.description, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, activityCard.description);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && activityCard.image == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, ActivityCardImage$$serializer.INSTANCE, activityCard.image);
    }

    public ActivityCard(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, ActivityCardImage activityCardImage) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.activityId = str;
        this.linkUrl = str2;
        this.deeplink = str3;
        this.title = str4;
        this.description = str5;
        this.image = activityCardImage;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:com.okinc.planet_api.ActivityCardImage:?: TERNARY null = ((wrap:int:0x0024: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.planet_api.ActivityCardImage) : (r10v0 com.okinc.planet_api.ActivityCardImage))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.planet_api.ActivityCardImage):void (m)] (LINE:64) call: com.okinc.planet_api.ActivityCard.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.planet_api.ActivityCardImage):void type: THIS */
    public /* synthetic */ ActivityCard(String str, String str2, String str3, String str4, String str5, ActivityCardImage activityCardImage, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? null : activityCardImage);
    }
}

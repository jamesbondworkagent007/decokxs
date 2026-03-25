package com.okinc.business.defi.wallet.mine.search.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class TagExtra implements Parcelable {
    public static final int $stable = 0;

    @SerializedName("deepLink")
    private final String eventDeeplink;

    @SerializedName("link")
    private final String eventLink;

    @SerializedName("kolTwitterImage")
    private final String kolTwitterImage;

    @SerializedName("kolTwitterImageFullPath")
    private final String kolTwitterImageFullPath;

    @SerializedName("kolTwitterLink")
    private final String kolTwitterLink;

    @SerializedName("name")
    private final String name;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TagExtra> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TagExtra> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TagExtra createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TagExtra(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TagExtra[] newArray(int i) {
            return new TagExtra[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TagExtra() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TagExtra copy$default(TagExtra tagExtra, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tagExtra.name;
        }
        if ((i & 2) != 0) {
            str2 = tagExtra.kolTwitterLink;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = tagExtra.kolTwitterImage;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = tagExtra.kolTwitterImageFullPath;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = tagExtra.eventDeeplink;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = tagExtra.eventLink;
        }
        return tagExtra.KWHzl(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.eventDeeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagExtra KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new TagExtra(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.kolTwitterLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.eventLink;
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
        if (!(obj instanceof TagExtra)) {
            return false;
        }
        TagExtra tagExtra = (TagExtra) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) tagExtra.name) && Intrinsics.EZpvd((Object) this.kolTwitterLink, (Object) tagExtra.kolTwitterLink) && Intrinsics.EZpvd((Object) this.kolTwitterImage, (Object) tagExtra.kolTwitterImage) && Intrinsics.EZpvd((Object) this.kolTwitterImageFullPath, (Object) tagExtra.kolTwitterImageFullPath) && Intrinsics.EZpvd((Object) this.eventDeeplink, (Object) tagExtra.eventDeeplink) && Intrinsics.EZpvd((Object) this.eventLink, (Object) tagExtra.eventLink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.name.hashCode() * 31) + this.kolTwitterLink.hashCode()) * 31) + this.kolTwitterImage.hashCode()) * 31) + this.kolTwitterImageFullPath.hashCode()) * 31) + this.eventDeeplink.hashCode()) * 31) + this.eventLink.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TagExtra(name=" + this.name + ", kolTwitterLink=" + this.kolTwitterLink + ", kolTwitterImage=" + this.kolTwitterImage + ", kolTwitterImageFullPath=" + this.kolTwitterImageFullPath + ", eventDeeplink=" + this.eventDeeplink + ", eventLink=" + this.eventLink + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.name);
        parcel.writeString(this.kolTwitterLink);
        parcel.writeString(this.kolTwitterImage);
        parcel.writeString(this.kolTwitterImageFullPath);
        parcel.writeString(this.eventDeeplink);
        parcel.writeString(this.eventLink);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.data.model.TagExtra.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TagExtra> serializer() {
            return TagExtra$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TagExtra(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.kolTwitterLink = "";
        } else {
            this.kolTwitterLink = str2;
        }
        if ((i & 4) == 0) {
            this.kolTwitterImage = "";
        } else {
            this.kolTwitterImage = str3;
        }
        if ((i & 8) == 0) {
            this.kolTwitterImageFullPath = "";
        } else {
            this.kolTwitterImageFullPath = str4;
        }
        if ((i & 16) == 0) {
            this.eventDeeplink = "";
        } else {
            this.eventDeeplink = str5;
        }
        if ((i & 32) == 0) {
            this.eventLink = "";
        } else {
            this.eventLink = str6;
        }
    }

    public static final /* synthetic */ void copydefault(TagExtra tagExtra, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tagExtra.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tagExtra.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tagExtra.kolTwitterLink, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tagExtra.kolTwitterLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tagExtra.kolTwitterImage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tagExtra.kolTwitterImage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tagExtra.kolTwitterImageFullPath, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tagExtra.kolTwitterImageFullPath);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tagExtra.eventDeeplink, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tagExtra.eventDeeplink);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) tagExtra.eventLink, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, tagExtra.eventLink);
    }

    public TagExtra(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.name = str;
        this.kolTwitterLink = str2;
        this.kolTwitterImage = str3;
        this.kolTwitterImageFullPath = str4;
        this.eventDeeplink = str5;
        this.eventLink = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.business.defi.wallet.mine.search.data.model.TagExtra.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TagExtra(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}

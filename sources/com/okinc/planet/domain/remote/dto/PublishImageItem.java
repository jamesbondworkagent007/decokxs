package com.okinc.planet.domain.remote.dto;

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
public final class PublishImageItem implements Parcelable {
    public static final int $stable = 0;
    public final String displayUrl;
    public final String fileSize;
    public final String height;
    public final String srcKey;
    public final String url;
    public final String width;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PublishImageItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PublishImageItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PublishImageItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PublishImageItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PublishImageItem[] newArray(int i) {
            return new PublishImageItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PublishImageItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PublishImageItem copy$default(PublishImageItem publishImageItem, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = publishImageItem.url;
        }
        if ((i & 2) != 0) {
            str2 = publishImageItem.displayUrl;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = publishImageItem.width;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = publishImageItem.height;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = publishImageItem.srcKey;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = publishImageItem.fileSize;
        }
        return publishImageItem.KWHzl(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.fileSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PublishImageItem KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new PublishImageItem(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.displayUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.width;
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
        if (!(obj instanceof PublishImageItem)) {
            return false;
        }
        PublishImageItem publishImageItem = (PublishImageItem) obj;
        return Intrinsics.EZpvd((Object) this.url, (Object) publishImageItem.url) && Intrinsics.EZpvd((Object) this.displayUrl, (Object) publishImageItem.displayUrl) && Intrinsics.EZpvd((Object) this.width, (Object) publishImageItem.width) && Intrinsics.EZpvd((Object) this.height, (Object) publishImageItem.height) && Intrinsics.EZpvd((Object) this.srcKey, (Object) publishImageItem.srcKey) && Intrinsics.EZpvd((Object) this.fileSize, (Object) publishImageItem.fileSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.url.hashCode() * 31) + this.displayUrl.hashCode()) * 31) + this.width.hashCode()) * 31) + this.height.hashCode()) * 31) + this.srcKey.hashCode()) * 31) + this.fileSize.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PublishImageItem(url=" + this.url + ", displayUrl=" + this.displayUrl + ", width=" + this.width + ", height=" + this.height + ", srcKey=" + this.srcKey + ", fileSize=" + this.fileSize + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.url);
        parcel.writeString(this.displayUrl);
        parcel.writeString(this.width);
        parcel.writeString(this.height);
        parcel.writeString(this.srcKey);
        parcel.writeString(this.fileSize);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.remote.dto.PublishImageItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PublishImageItem> serializer() {
            return PublishImageItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PublishImageItem(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.url = "";
        } else {
            this.url = str;
        }
        if ((i & 2) == 0) {
            this.displayUrl = "";
        } else {
            this.displayUrl = str2;
        }
        if ((i & 4) == 0) {
            this.width = "";
        } else {
            this.width = str3;
        }
        if ((i & 8) == 0) {
            this.height = "";
        } else {
            this.height = str4;
        }
        if ((i & 16) == 0) {
            this.srcKey = "";
        } else {
            this.srcKey = str5;
        }
        if ((i & 32) == 0) {
            this.fileSize = "";
        } else {
            this.fileSize = str6;
        }
    }

    public static final /* synthetic */ void EZpvd(PublishImageItem publishImageItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) publishImageItem.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, publishImageItem.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) publishImageItem.displayUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, publishImageItem.displayUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) publishImageItem.width, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, publishImageItem.width);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) publishImageItem.height, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, publishImageItem.height);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) publishImageItem.srcKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, publishImageItem.srcKey);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) publishImageItem.fileSize, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, publishImageItem.fileSize);
    }

    public PublishImageItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.url = str;
        this.displayUrl = str2;
        this.width = str3;
        this.height = str4;
        this.srcKey = str5;
        this.fileSize = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:29) call: com.okinc.planet.domain.remote.dto.PublishImageItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PublishImageItem(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}

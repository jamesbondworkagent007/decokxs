package com.okinc.share.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C33489mxS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class WebShareParams implements Parcelable {
    public static final int TYPE_IMAGE = 2;
    public static final int TYPE_TEXT = 1;
    public static final int TYPE_WEBPAGE = 0;
    private String body;
    private String imageUrl;
    private String linkUrl;
    private String subtitle;
    private String title;
    private int type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WebShareParams> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<WebShareParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WebShareParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WebShareParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WebShareParams[] newArray(int i) {
            return new WebShareParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WebShareParams() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 0, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WebShareParams copy$default(WebShareParams webShareParams, String str, String str2, String str3, String str4, String str5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = webShareParams.body;
        }
        if ((i2 & 2) != 0) {
            str2 = webShareParams.imageUrl;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = webShareParams.linkUrl;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = webShareParams.title;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            str5 = webShareParams.subtitle;
        }
        String str9 = str5;
        if ((i2 & 32) != 0) {
            i = webShareParams.type;
        }
        return webShareParams.copy(str, str6, str7, str8, str9, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.body;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.linkUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebShareParams copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new WebShareParams(str, str2, str3, str4, str5, i);
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
        if (!(obj instanceof WebShareParams)) {
            return false;
        }
        WebShareParams webShareParams = (WebShareParams) obj;
        return Intrinsics.EZpvd((Object) this.body, (Object) webShareParams.body) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) webShareParams.imageUrl) && Intrinsics.EZpvd((Object) this.linkUrl, (Object) webShareParams.linkUrl) && Intrinsics.EZpvd((Object) this.title, (Object) webShareParams.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) webShareParams.subtitle) && this.type == webShareParams.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBody() {
        return this.body;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLinkUrl() {
        return this.linkUrl;
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
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.body.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.linkUrl.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + Integer.hashCode(this.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBody(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.body = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinkUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.linkUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubtitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subtitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.type = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WebShareParams(body=" + this.body + ", imageUrl=" + this.imageUrl + ", linkUrl=" + this.linkUrl + ", title=" + this.title + ", subtitle=" + this.subtitle + ", type=" + this.type + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.body);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.linkUrl);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeInt(this.type);
    }

    public /* synthetic */ WebShareParams(int i, String str, String str2, String str3, String str4, String str5, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.body = "";
        } else {
            this.body = str;
        }
        if ((i & 2) == 0) {
            this.imageUrl = "";
        } else {
            this.imageUrl = str2;
        }
        if ((i & 4) == 0) {
            this.linkUrl = "";
        } else {
            this.linkUrl = str3;
        }
        if ((i & 8) == 0) {
            this.title = "";
        } else {
            this.title = str4;
        }
        if ((i & 16) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str5;
        }
        if ((i & 32) == 0) {
            this.type = 0;
        } else {
            this.type = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKShare_sdk_share_impl(WebShareParams webShareParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) webShareParams.body, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, webShareParams.body);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) webShareParams.imageUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, webShareParams.imageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) webShareParams.linkUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, webShareParams.linkUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) webShareParams.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, webShareParams.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) webShareParams.subtitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, webShareParams.subtitle);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && webShareParams.type == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 5, webShareParams.type);
    }

    public WebShareParams(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.body = str;
        this.imageUrl = str2;
        this.linkUrl = str3;
        this.title = str4;
        this.subtitle = str5;
        this.type = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0024: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:17) call: com.okinc.share.bean.WebShareParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ WebShareParams(String str, String str2, String str3, String str4, String str5, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) == 0 ? str5 : "", (i2 & 32) != 0 ? 0 : i);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.WebShareParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<WebShareParams> serializer() {
            return WebShareParams$$serializer.INSTANCE;
        }

        public final WebShareParams OLrzqt(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                return (WebShareParams) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) WebShareParams.Companion.serializer(), str);
            } catch (Exception unused) {
                return null;
            }
        }
    }
}

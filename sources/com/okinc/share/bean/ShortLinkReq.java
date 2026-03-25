package com.okinc.share.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ShortLinkReq implements Parcelable {
    private boolean attachChannelCode;
    private String deeplink;
    private String originalLink;
    private Integer redirectBehavior;
    private String shareFrom;
    private String utmScene;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ShortLinkReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ShortLinkReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShortLinkReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ShortLinkReq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShortLinkReq[] newArray(int i) {
            return new ShortLinkReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ShortLinkReq copy$default(ShortLinkReq shortLinkReq, String str, String str2, String str3, boolean z, Integer num, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shortLinkReq.originalLink;
        }
        if ((i & 2) != 0) {
            str2 = shortLinkReq.shareFrom;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = shortLinkReq.deeplink;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            z = shortLinkReq.attachChannelCode;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            num = shortLinkReq.redirectBehavior;
        }
        Integer num2 = num;
        if ((i & 32) != 0) {
            str4 = shortLinkReq.utmScene;
        }
        return shortLinkReq.copy(str, str5, str6, z2, num2, str4);
    }

    @SerialName("contentScene")
    public static /* synthetic */ void getShareFrom$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.originalLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.shareFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.attachChannelCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.redirectBehavior;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.utmScene;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShortLinkReq copy(@NotNull String str, String str2, String str3, boolean z, Integer num, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ShortLinkReq(str, str2, str3, z, num, str4);
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
        if (!(obj instanceof ShortLinkReq)) {
            return false;
        }
        ShortLinkReq shortLinkReq = (ShortLinkReq) obj;
        return Intrinsics.EZpvd((Object) this.originalLink, (Object) shortLinkReq.originalLink) && Intrinsics.EZpvd((Object) this.shareFrom, (Object) shortLinkReq.shareFrom) && Intrinsics.EZpvd((Object) this.deeplink, (Object) shortLinkReq.deeplink) && this.attachChannelCode == shortLinkReq.attachChannelCode && Intrinsics.EZpvd(this.redirectBehavior, shortLinkReq.redirectBehavior) && Intrinsics.EZpvd((Object) this.utmScene, (Object) shortLinkReq.utmScene);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAttachChannelCode() {
        return this.attachChannelCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginalLink() {
        return this.originalLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRedirectBehavior() {
        return this.redirectBehavior;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShareFrom() {
        return this.shareFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUtmScene() {
        return this.utmScene;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.originalLink.hashCode();
        String str = this.shareFrom;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.deeplink;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = Boolean.hashCode(this.attachChannelCode);
        Integer num = this.redirectBehavior;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        String str3 = this.utmScene;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttachChannelCode(boolean z) {
        this.attachChannelCode = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeeplink(String str) {
        this.deeplink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginalLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.originalLink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRedirectBehavior(Integer num) {
        this.redirectBehavior = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShareFrom(String str) {
        this.shareFrom = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUtmScene(String str) {
        this.utmScene = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ShortLinkReq(originalLink=" + this.originalLink + ", shareFrom=" + this.shareFrom + ", deeplink=" + this.deeplink + ", attachChannelCode=" + this.attachChannelCode + ", redirectBehavior=" + this.redirectBehavior + ", utmScene=" + this.utmScene + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.originalLink);
        parcel.writeString(this.shareFrom);
        parcel.writeString(this.deeplink);
        parcel.writeInt(this.attachChannelCode ? 1 : 0);
        Integer num = this.redirectBehavior;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.utmScene);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.ShortLinkReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ShortLinkReq> serializer() {
            return ShortLinkReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ShortLinkReq(int i, String str, String str2, String str3, boolean z, Integer num, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (25 != (i & 25)) {
            PluginExceptionsKt.throwMissingFieldException(i, 25, ShortLinkReq$$serializer.INSTANCE.getDescriptor());
        }
        this.originalLink = str;
        if ((i & 2) == 0) {
            this.shareFrom = null;
        } else {
            this.shareFrom = str2;
        }
        if ((i & 4) == 0) {
            this.deeplink = null;
        } else {
            this.deeplink = str3;
        }
        this.attachChannelCode = z;
        this.redirectBehavior = num;
        if ((i & 32) == 0) {
            this.utmScene = null;
        } else {
            this.utmScene = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKShare_sdk_share_impl(ShortLinkReq shortLinkReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, shortLinkReq.originalLink);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || shortLinkReq.shareFrom != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, shortLinkReq.shareFrom);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || shortLinkReq.deeplink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, shortLinkReq.deeplink);
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, shortLinkReq.attachChannelCode);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, shortLinkReq.redirectBehavior);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && shortLinkReq.utmScene == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, shortLinkReq.utmScene);
    }

    public ShortLinkReq(@NotNull String str, String str2, String str3, boolean z, Integer num, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.originalLink = str;
        this.shareFrom = str2;
        this.deeplink = str3;
        this.attachChannelCode = z;
        this.redirectBehavior = num;
        this.utmScene = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (r13v0 boolean)
  (r14v0 java.lang.Integer)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.String):void (m)] (LINE:30) call: com.okinc.share.bean.ShortLinkReq.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ ShortLinkReq(String str, String str2, String str3, boolean z, Integer num, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, z, num, (i & 32) != 0 ? null : str4);
    }
}

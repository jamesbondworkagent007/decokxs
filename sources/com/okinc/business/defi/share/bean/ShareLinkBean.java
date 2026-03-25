package com.okinc.business.defi.share.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class ShareLinkBean implements Parcelable, java.io.Serializable {
    private final String deepLink;
    private String shortLink;
    private long timestamp;
    private final String universalLink;
    private final String webUrl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ShareLinkBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ShareLinkBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareLinkBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ShareLinkBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareLinkBean[] newArray(int i) {
            return new ShareLinkBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ShareLinkBean() {
        this((String) null, (String) null, (String) null, (String) null, 0L, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ShareLinkBean copy$default(ShareLinkBean shareLinkBean, String str, String str2, String str3, String str4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareLinkBean.webUrl;
        }
        if ((i & 2) != 0) {
            str2 = shareLinkBean.deepLink;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = shareLinkBean.universalLink;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = shareLinkBean.shortLink;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            j = shareLinkBean.timestamp;
        }
        return shareLinkBean.copy(str, str5, str6, str7, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.webUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.deepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.universalLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.shortLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareLinkBean copy(String str, String str2, String str3, String str4, long j) {
        return new ShareLinkBean(str, str2, str3, str4, j);
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
        if (!(obj instanceof ShareLinkBean)) {
            return false;
        }
        ShareLinkBean shareLinkBean = (ShareLinkBean) obj;
        return Intrinsics.EZpvd((Object) this.webUrl, (Object) shareLinkBean.webUrl) && Intrinsics.EZpvd((Object) this.deepLink, (Object) shareLinkBean.deepLink) && Intrinsics.EZpvd((Object) this.universalLink, (Object) shareLinkBean.universalLink) && Intrinsics.EZpvd((Object) this.shortLink, (Object) shareLinkBean.shortLink) && this.timestamp == shareLinkBean.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeepLink() {
        return this.deepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShortLink() {
        return this.shortLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUniversalLink() {
        return this.universalLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWebUrl() {
        return this.webUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.webUrl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.deepLink;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.universalLink;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.shortLink;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + Long.hashCode(this.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShortLink(String str) {
        this.shortLink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ShareLinkBean(webUrl=" + this.webUrl + ", deepLink=" + this.deepLink + ", universalLink=" + this.universalLink + ", shortLink=" + this.shortLink + ", timestamp=" + this.timestamp + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.webUrl);
        parcel.writeString(this.deepLink);
        parcel.writeString(this.universalLink);
        parcel.writeString(this.shortLink);
        parcel.writeLong(this.timestamp);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.share.bean.ShareLinkBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ShareLinkBean> serializer() {
            return ShareLinkBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ShareLinkBean(int i, String str, String str2, String str3, String str4, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.webUrl = "";
        } else {
            this.webUrl = str;
        }
        if ((i & 2) == 0) {
            this.deepLink = "";
        } else {
            this.deepLink = str2;
        }
        if ((i & 4) == 0) {
            this.universalLink = "";
        } else {
            this.universalLink = str3;
        }
        if ((i & 8) == 0) {
            this.shortLink = "";
        } else {
            this.shortLink = str4;
        }
        if ((i & 16) == 0) {
            this.timestamp = 0L;
        } else {
            this.timestamp = j;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ShareLinkBean shareLinkBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) shareLinkBean.webUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, shareLinkBean.webUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) shareLinkBean.deepLink, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, shareLinkBean.deepLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) shareLinkBean.universalLink, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, shareLinkBean.universalLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) shareLinkBean.shortLink, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, shareLinkBean.shortLink);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && shareLinkBean.timestamp == 0) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 4, shareLinkBean.timestamp);
    }

    public ShareLinkBean(String str, String str2, String str3, String str4, long j) {
        this.webUrl = str;
        this.deepLink = str2;
        this.universalLink = str3;
        this.shortLink = str4;
        this.timestamp = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r8v0 long))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void (m)] (LINE:12) call: com.okinc.business.defi.share.bean.ShareLinkBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void type: THIS */
    public /* synthetic */ ShareLinkBean(String str, String str2, String str3, String str4, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? 0L : j);
    }

    public final String getFinalShareLink() {
        if (!TextUtils.isEmpty(this.shortLink)) {
            String str = this.shortLink;
            Intrinsics.copydefault((Object) str);
            return str;
        }
        if (!TextUtils.isEmpty(this.universalLink)) {
            String str2 = this.universalLink;
            Intrinsics.copydefault((Object) str2);
            return str2;
        }
        if (TextUtils.isEmpty(this.webUrl)) {
            return "https://web3.okx.com/download";
        }
        String str3 = this.webUrl;
        Intrinsics.copydefault((Object) str3);
        return str3;
    }
}

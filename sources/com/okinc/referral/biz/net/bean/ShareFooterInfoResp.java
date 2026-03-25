package com.okinc.referral.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.referral.bean.ReferralFooterInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ShareFooterInfoResp implements Parcelable {
    public static final int $stable = 0;
    private final String channelName;
    private final String downloadUrl;
    private final String inviteeShareText;
    private final String inviterShareText;
    private final Integer layoutType;
    private final String shareUrl;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ShareFooterInfoResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ShareFooterInfoResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareFooterInfoResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ShareFooterInfoResp(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareFooterInfoResp[] newArray(int i) {
            return new ShareFooterInfoResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ShareFooterInfoResp() {
        this((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ShareFooterInfoResp copy$default(ShareFooterInfoResp shareFooterInfoResp, String str, Integer num, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareFooterInfoResp.downloadUrl;
        }
        if ((i & 2) != 0) {
            num = shareFooterInfoResp.layoutType;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            str2 = shareFooterInfoResp.shareUrl;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = shareFooterInfoResp.channelName;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = shareFooterInfoResp.inviterShareText;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = shareFooterInfoResp.inviteeShareText;
        }
        return shareFooterInfoResp.copy(str, num2, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.downloadUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.layoutType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.shareUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.channelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.inviterShareText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.inviteeShareText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareFooterInfoResp copy(String str, Integer num, String str2, String str3, String str4, String str5) {
        return new ShareFooterInfoResp(str, num, str2, str3, str4, str5);
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
        if (!(obj instanceof ShareFooterInfoResp)) {
            return false;
        }
        ShareFooterInfoResp shareFooterInfoResp = (ShareFooterInfoResp) obj;
        return Intrinsics.EZpvd((Object) this.downloadUrl, (Object) shareFooterInfoResp.downloadUrl) && Intrinsics.EZpvd(this.layoutType, shareFooterInfoResp.layoutType) && Intrinsics.EZpvd((Object) this.shareUrl, (Object) shareFooterInfoResp.shareUrl) && Intrinsics.EZpvd((Object) this.channelName, (Object) shareFooterInfoResp.channelName) && Intrinsics.EZpvd((Object) this.inviterShareText, (Object) shareFooterInfoResp.inviterShareText) && Intrinsics.EZpvd((Object) this.inviteeShareText, (Object) shareFooterInfoResp.inviteeShareText);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelName() {
        return this.channelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInviteeShareText() {
        return this.inviteeShareText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInviterShareText() {
        return this.inviterShareText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getLayoutType() {
        return this.layoutType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShareUrl() {
        return this.shareUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.downloadUrl;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.layoutType;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.shareUrl;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.channelName;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.inviterShareText;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.inviteeShareText;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ShareFooterInfoResp(downloadUrl=" + this.downloadUrl + ", layoutType=" + this.layoutType + ", shareUrl=" + this.shareUrl + ", channelName=" + this.channelName + ", inviterShareText=" + this.inviterShareText + ", inviteeShareText=" + this.inviteeShareText + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.downloadUrl);
        Integer num = this.layoutType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.shareUrl);
        parcel.writeString(this.channelName);
        parcel.writeString(this.inviterShareText);
        parcel.writeString(this.inviteeShareText);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.referral.biz.net.bean.ShareFooterInfoResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ShareFooterInfoResp> serializer() {
            return ShareFooterInfoResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ShareFooterInfoResp(int i, String str, Integer num, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.downloadUrl = null;
        } else {
            this.downloadUrl = str;
        }
        if ((i & 2) == 0) {
            this.layoutType = null;
        } else {
            this.layoutType = num;
        }
        if ((i & 4) == 0) {
            this.shareUrl = null;
        } else {
            this.shareUrl = str2;
        }
        if ((i & 8) == 0) {
            this.channelName = null;
        } else {
            this.channelName = str3;
        }
        if ((i & 16) == 0) {
            this.inviterShareText = null;
        } else {
            this.inviterShareText = str4;
        }
        if ((i & 32) == 0) {
            this.inviteeShareText = null;
        } else {
            this.inviteeShareText = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKReferral_referral_impl(ShareFooterInfoResp shareFooterInfoResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || shareFooterInfoResp.downloadUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, shareFooterInfoResp.downloadUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || shareFooterInfoResp.layoutType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, shareFooterInfoResp.layoutType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || shareFooterInfoResp.shareUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, shareFooterInfoResp.shareUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || shareFooterInfoResp.channelName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, shareFooterInfoResp.channelName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || shareFooterInfoResp.inviterShareText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, shareFooterInfoResp.inviterShareText);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && shareFooterInfoResp.inviteeShareText == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, shareFooterInfoResp.inviteeShareText);
    }

    public ShareFooterInfoResp(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.downloadUrl = str;
        this.layoutType = num;
        this.shareUrl = str2;
        this.channelName = str3;
        this.inviterShareText = str4;
        this.inviteeShareText = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r7v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.referral.biz.net.bean.ShareFooterInfoResp.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ShareFooterInfoResp(String str, Integer num, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }

    public final ReferralFooterInfo resolveReferralFooterInfo() {
        return new ReferralFooterInfo(this.layoutType, this.downloadUrl, this.shareUrl, this.channelName, this.inviterShareText, this.inviteeShareText);
    }
}

package com.okinc.share.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
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
public final class ShareFooterInfo implements Parcelable {
    public static final int $stable = 0;
    private final String downloadUrl;
    private final String inviteeShareText;
    private final String inviterShareText;
    private final Integer layoutType;
    private final String referralCode;
    private final String shareUrl;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ShareFooterInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ShareFooterInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareFooterInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ShareFooterInfo(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareFooterInfo[] newArray(int i) {
            return new ShareFooterInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ShareFooterInfo copy$default(ShareFooterInfo shareFooterInfo, Integer num, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            num = shareFooterInfo.layoutType;
        }
        if ((i & 2) != 0) {
            str = shareFooterInfo.downloadUrl;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = shareFooterInfo.shareUrl;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = shareFooterInfo.referralCode;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = shareFooterInfo.inviterShareText;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = shareFooterInfo.inviteeShareText;
        }
        return shareFooterInfo.copy(num, str6, str7, str8, str9, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.layoutType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.downloadUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.shareUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.referralCode;
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
    public final ShareFooterInfo copy(Integer num, String str, String str2, String str3, String str4, String str5) {
        return new ShareFooterInfo(num, str, str2, str3, str4, str5);
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
        if (!(obj instanceof ShareFooterInfo)) {
            return false;
        }
        ShareFooterInfo shareFooterInfo = (ShareFooterInfo) obj;
        return Intrinsics.EZpvd(this.layoutType, shareFooterInfo.layoutType) && Intrinsics.EZpvd((Object) this.downloadUrl, (Object) shareFooterInfo.downloadUrl) && Intrinsics.EZpvd((Object) this.shareUrl, (Object) shareFooterInfo.shareUrl) && Intrinsics.EZpvd((Object) this.referralCode, (Object) shareFooterInfo.referralCode) && Intrinsics.EZpvd((Object) this.inviterShareText, (Object) shareFooterInfo.inviterShareText) && Intrinsics.EZpvd((Object) this.inviteeShareText, (Object) shareFooterInfo.inviteeShareText);
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
    public final String getReferralCode() {
        return this.referralCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShareUrl() {
        return this.shareUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.layoutType;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.downloadUrl;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.shareUrl;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.referralCode;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.inviterShareText;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.inviteeShareText;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ShareFooterInfo(layoutType=" + this.layoutType + ", downloadUrl=" + this.downloadUrl + ", shareUrl=" + this.shareUrl + ", referralCode=" + this.referralCode + ", inviterShareText=" + this.inviterShareText + ", inviteeShareText=" + this.inviteeShareText + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.layoutType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.downloadUrl);
        parcel.writeString(this.shareUrl);
        parcel.writeString(this.referralCode);
        parcel.writeString(this.inviterShareText);
        parcel.writeString(this.inviteeShareText);
    }

    public /* synthetic */ ShareFooterInfo(int i, Integer num, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, ShareFooterInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.layoutType = num;
        this.downloadUrl = str;
        this.shareUrl = str2;
        this.referralCode = str3;
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

    public static final /* synthetic */ void write$Self$OKShare_share_api(ShareFooterInfo shareFooterInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, shareFooterInfo.layoutType);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, shareFooterInfo.downloadUrl);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, shareFooterInfo.shareUrl);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, shareFooterInfo.referralCode);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || shareFooterInfo.inviterShareText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, shareFooterInfo.inviterShareText);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && shareFooterInfo.inviteeShareText == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, shareFooterInfo.inviteeShareText);
    }

    public ShareFooterInfo(Integer num, String str, String str2, String str3, String str4, String str5) {
        this.layoutType = num;
        this.downloadUrl = str;
        this.shareUrl = str2;
        this.referralCode = str3;
        this.inviterShareText = str4;
        this.inviteeShareText = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (r10v0 java.lang.Integer)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:17) call: com.okinc.share.bean.ShareFooterInfo.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ShareFooterInfo(Integer num, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.ShareFooterInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ShareFooterInfo> serializer() {
            return ShareFooterInfo$$serializer.INSTANCE;
        }

        public final LayoutType AEQbTJ(ShareFooterInfo shareFooterInfo) {
            Integer layoutType;
            if (shareFooterInfo != null && (layoutType = shareFooterInfo.getLayoutType()) != null) {
                LayoutType layoutTypeValueOf = LayoutType.CREATOR.valueOf(layoutType.intValue());
                if (layoutTypeValueOf != null) {
                    return layoutTypeValueOf;
                }
            }
            return LayoutType.TYPE1;
        }
    }
}

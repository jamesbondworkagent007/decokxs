package com.okinc.biz.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.share.bean.ShareType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareInfo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ShareInfo> CREATOR = new Creator();
    private String shareImageUrl;
    private String shareLink;
    private String shareText;
    private String shareTitle;
    private Integer shareType;
    private String trackingData;

    public static final class Creator implements Parcelable.Creator<ShareInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ShareInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareInfo[] newArray(int i) {
            return new ShareInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ShareInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ShareInfo copy$default(ShareInfo shareInfo, String str, String str2, String str3, String str4, String str5, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareInfo.shareLink;
        }
        if ((i & 2) != 0) {
            str2 = shareInfo.shareImageUrl;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = shareInfo.shareTitle;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = shareInfo.shareText;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = shareInfo.trackingData;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            num = shareInfo.shareType;
        }
        return shareInfo.copy(str, str6, str7, str8, str9, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.shareLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.shareImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.shareTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.shareText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.trackingData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.shareType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareInfo copy(String str, String str2, String str3, String str4, String str5, Integer num) {
        return new ShareInfo(str, str2, str3, str4, str5, num);
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
        if (!(obj instanceof ShareInfo)) {
            return false;
        }
        ShareInfo shareInfo = (ShareInfo) obj;
        return Intrinsics.EZpvd((Object) this.shareLink, (Object) shareInfo.shareLink) && Intrinsics.EZpvd((Object) this.shareImageUrl, (Object) shareInfo.shareImageUrl) && Intrinsics.EZpvd((Object) this.shareTitle, (Object) shareInfo.shareTitle) && Intrinsics.EZpvd((Object) this.shareText, (Object) shareInfo.shareText) && Intrinsics.EZpvd((Object) this.trackingData, (Object) shareInfo.trackingData) && Intrinsics.EZpvd(this.shareType, shareInfo.shareType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShareImageUrl() {
        return this.shareImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShareLink() {
        return this.shareLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShareText() {
        return this.shareText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShareTitle() {
        return this.shareTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getShareType() {
        return this.shareType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackingData() {
        return this.trackingData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.shareLink;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.shareImageUrl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.shareTitle;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.shareText;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.trackingData;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        Integer num = this.shareType;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShareImageUrl(String str) {
        this.shareImageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShareLink(String str) {
        this.shareLink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShareText(String str) {
        this.shareText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShareTitle(String str) {
        this.shareTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShareType(Integer num) {
        this.shareType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrackingData(String str) {
        this.trackingData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ShareInfo(shareLink=" + this.shareLink + ", shareImageUrl=" + this.shareImageUrl + ", shareTitle=" + this.shareTitle + ", shareText=" + this.shareText + ", trackingData=" + this.trackingData + ", shareType=" + this.shareType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.shareLink);
        parcel.writeString(this.shareImageUrl);
        parcel.writeString(this.shareTitle);
        parcel.writeString(this.shareText);
        parcel.writeString(this.trackingData);
        Integer num = this.shareType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public ShareInfo(String str, String str2, String str3, String str4, String str5, Integer num) {
        this.shareLink = str;
        this.shareImageUrl = str2;
        this.shareTitle = str3;
        this.shareText = str4;
        this.trackingData = str5;
        this.shareType = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0023: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Integer:0x002d: INVOKE 
  (wrap:int:0x0029: INVOKE 
  (wrap:com.okinc.share.bean.ShareType:0x0027: SGET  A[WRAPPED] (LINE:15) com.okinc.share.bean.ShareType.SHARE_WEBPAGE com.okinc.share.bean.ShareType)
 VIRTUAL call: com.okinc.share.bean.ShareType.getType():int A[MD:():int (m), WRAPPED] (LINE:15))
 STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:15)) : (r10v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:10) call: com.okinc.biz.bean.ShareInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ ShareInfo(String str, String str2, String str3, String str4, String str5, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? str5 : null, (i & 32) != 0 ? Integer.valueOf(ShareType.SHARE_WEBPAGE.getType()) : num);
    }
}

package com.okinc.web.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonArray;
import com.google.gson.annotations.SerializedName;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WebShareInfo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WebShareInfo> CREATOR = new Creator();
    private String shareImageUrl;

    @SerializedName("linkUrl")
    private String shareLink;

    @SerializedName("body")
    private String shareText;

    @SerializedName("title")
    private String shareTitle;
    private int shareType;

    @SerializedName("trackingData")
    private String trackingData;
    private JsonArray unifiedMultiShareConfigJson;

    public static final class Creator implements Parcelable.Creator<WebShareInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WebShareInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WebShareInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), null, 64, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WebShareInfo[] newArray(int i) {
            return new WebShareInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WebShareInfo() {
        this(null, null, null, null, null, 0, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WebShareInfo(String str) {
        this(str, null, null, null, null, 0, null, WebSocketProtocol.PAYLOAD_SHORT, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WebShareInfo(String str, String str2) {
        this(str, str2, null, null, null, 0, null, 124, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WebShareInfo(String str, String str2, String str3) {
        this(str, str2, str3, null, null, 0, null, 120, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WebShareInfo(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null, 0, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WebShareInfo(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, 0, null, 96, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WebShareInfo(String str, String str2, String str3, String str4, String str5, int i) {
        this(str, str2, str3, str4, str5, i, null, 64, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WebShareInfo copy$default(WebShareInfo webShareInfo, String str, String str2, String str3, String str4, String str5, int i, JsonArray jsonArray, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = webShareInfo.shareLink;
        }
        if ((i2 & 2) != 0) {
            str2 = webShareInfo.shareImageUrl;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = webShareInfo.shareTitle;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = webShareInfo.shareText;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            str5 = webShareInfo.trackingData;
        }
        String str9 = str5;
        if ((i2 & 32) != 0) {
            i = webShareInfo.shareType;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            jsonArray = webShareInfo.unifiedMultiShareConfigJson;
        }
        return webShareInfo.copy(str, str6, str7, str8, str9, i3, jsonArray);
    }

    public static /* synthetic */ void getUnifiedMultiShareConfigJson$annotations() {
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
    public final int component6() {
        return this.shareType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray component7() {
        return this.unifiedMultiShareConfigJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebShareInfo copy(String str, String str2, String str3, String str4, String str5, int i, JsonArray jsonArray) {
        return new WebShareInfo(str, str2, str3, str4, str5, i, jsonArray);
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
        if (!(obj instanceof WebShareInfo)) {
            return false;
        }
        WebShareInfo webShareInfo = (WebShareInfo) obj;
        return Intrinsics.EZpvd((Object) this.shareLink, (Object) webShareInfo.shareLink) && Intrinsics.EZpvd((Object) this.shareImageUrl, (Object) webShareInfo.shareImageUrl) && Intrinsics.EZpvd((Object) this.shareTitle, (Object) webShareInfo.shareTitle) && Intrinsics.EZpvd((Object) this.shareText, (Object) webShareInfo.shareText) && Intrinsics.EZpvd((Object) this.trackingData, (Object) webShareInfo.trackingData) && this.shareType == webShareInfo.shareType && Intrinsics.EZpvd(this.unifiedMultiShareConfigJson, webShareInfo.unifiedMultiShareConfigJson);
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
    public final int getShareType() {
        return this.shareType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackingData() {
        return this.trackingData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray getUnifiedMultiShareConfigJson() {
        return this.unifiedMultiShareConfigJson;
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
        int iHashCode6 = Integer.hashCode(this.shareType);
        JsonArray jsonArray = this.unifiedMultiShareConfigJson;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (jsonArray != null ? jsonArray.hashCode() : 0);
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
    public final void setShareType(int i) {
        this.shareType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrackingData(String str) {
        this.trackingData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnifiedMultiShareConfigJson(JsonArray jsonArray) {
        this.unifiedMultiShareConfigJson = jsonArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WebShareInfo(shareLink=" + this.shareLink + ", shareImageUrl=" + this.shareImageUrl + ", shareTitle=" + this.shareTitle + ", shareText=" + this.shareText + ", trackingData=" + this.trackingData + ", shareType=" + this.shareType + ", unifiedMultiShareConfigJson=" + this.unifiedMultiShareConfigJson + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.shareLink);
        parcel.writeString(this.shareImageUrl);
        parcel.writeString(this.shareTitle);
        parcel.writeString(this.shareText);
        parcel.writeString(this.trackingData);
        parcel.writeInt(this.shareType);
    }

    public WebShareInfo(String str, String str2, String str3, String str4, String str5, int i, JsonArray jsonArray) {
        this.shareLink = str;
        this.shareImageUrl = str2;
        this.shareTitle = str3;
        this.shareText = str4;
        this.trackingData = str5;
        this.shareType = i;
        this.unifiedMultiShareConfigJson = jsonArray;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:int:0x0029: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (4 int) : (r12v0 int))
  (wrap:com.google.gson.JsonArray:?: TERNARY null = ((wrap:int:0x002a: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.google.gson.JsonArray) : (r13v0 com.google.gson.JsonArray))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.google.gson.JsonArray):void (m)] (LINE:12) call: com.okinc.web.bean.WebShareInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.google.gson.JsonArray):void type: THIS */
    public /* synthetic */ WebShareInfo(String str, String str2, String str3, String str4, String str5, int i, JsonArray jsonArray, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? 4 : i, (i2 & 64) != 0 ? null : jsonArray);
    }
}

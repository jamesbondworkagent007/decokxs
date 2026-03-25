package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ShareData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ShareData> CREATOR = new Creator();
    private Map<String, String> additionalParams;
    private final String altDataTitle;
    private String altDataValue;
    private String avatar;
    private String botDataTitle1;
    private String botDataTitle2;
    private String botDataValue1;
    private String botDataValue2;
    private String mainDataTitle;
    private String mainDataValue;
    private String nickName;
    private final String pnlUnit;
    private String priceUnit;
    private String qrCode;
    private String tradeTag;

    public static final class Creator implements Parcelable.Creator<ShareData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareData createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                int i2 = 0;
                while (i2 != i) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                    i2++;
                    i = i;
                }
            }
            return new ShareData(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, linkedHashMap, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareData[] newArray(int i) {
            return new ShareData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ShareData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mainDataTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tradeTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component13() {
        return this.additionalParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.qrCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.pnlUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.mainDataValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.altDataTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.altDataValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.priceUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.botDataTitle1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.botDataValue1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.botDataTitle2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.botDataValue2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, String str7, String str8, String str9, String str10, String str11, @NotNull String str12, Map<String, String> map, String str13, String str14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str12, "");
        return new ShareData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, map, str13, str14);
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
        if (!(obj instanceof ShareData)) {
            return false;
        }
        ShareData shareData = (ShareData) obj;
        return Intrinsics.EZpvd((Object) this.mainDataTitle, (Object) shareData.mainDataTitle) && Intrinsics.EZpvd((Object) this.mainDataValue, (Object) shareData.mainDataValue) && Intrinsics.EZpvd((Object) this.altDataTitle, (Object) shareData.altDataTitle) && Intrinsics.EZpvd((Object) this.altDataValue, (Object) shareData.altDataValue) && Intrinsics.EZpvd((Object) this.priceUnit, (Object) shareData.priceUnit) && Intrinsics.EZpvd((Object) this.botDataTitle1, (Object) shareData.botDataTitle1) && Intrinsics.EZpvd((Object) this.botDataValue1, (Object) shareData.botDataValue1) && Intrinsics.EZpvd((Object) this.botDataTitle2, (Object) shareData.botDataTitle2) && Intrinsics.EZpvd((Object) this.botDataValue2, (Object) shareData.botDataValue2) && Intrinsics.EZpvd((Object) this.avatar, (Object) shareData.avatar) && Intrinsics.EZpvd((Object) this.nickName, (Object) shareData.nickName) && Intrinsics.EZpvd((Object) this.tradeTag, (Object) shareData.tradeTag) && Intrinsics.EZpvd(this.additionalParams, shareData.additionalParams) && Intrinsics.EZpvd((Object) this.qrCode, (Object) shareData.qrCode) && Intrinsics.EZpvd((Object) this.pnlUnit, (Object) shareData.pnlUnit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getAdditionalParams() {
        return this.additionalParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAltDataTitle() {
        return this.altDataTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAltDataValue() {
        return this.altDataValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBotDataTitle1() {
        return this.botDataTitle1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBotDataTitle2() {
        return this.botDataTitle2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBotDataValue1() {
        return this.botDataValue1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBotDataValue2() {
        return this.botDataValue2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMainDataTitle() {
        return this.mainDataTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMainDataValue() {
        return this.mainDataValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlUnit() {
        return this.pnlUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceUnit() {
        return this.priceUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQrCode() {
        return this.qrCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeTag() {
        return this.tradeTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.mainDataTitle.hashCode();
        int iHashCode2 = this.mainDataValue.hashCode();
        int iHashCode3 = this.altDataTitle.hashCode();
        int iHashCode4 = this.altDataValue.hashCode();
        int iHashCode5 = this.priceUnit.hashCode();
        String str = this.botDataTitle1;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.botDataValue1;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.botDataTitle2;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.botDataValue2;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.avatar;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.nickName;
        int iHashCode11 = str6 == null ? 0 : str6.hashCode();
        int iHashCode12 = this.tradeTag.hashCode();
        Map<String, String> map = this.additionalParams;
        int iHashCode13 = map == null ? 0 : map.hashCode();
        String str7 = this.qrCode;
        int iHashCode14 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.pnlUnit;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str8 == null ? 0 : str8.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdditionalParams(Map<String, String> map) {
        this.additionalParams = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAltDataValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.altDataValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvatar(String str) {
        this.avatar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBotDataTitle1(String str) {
        this.botDataTitle1 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBotDataTitle2(String str) {
        this.botDataTitle2 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBotDataValue1(String str) {
        this.botDataValue1 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBotDataValue2(String str) {
        this.botDataValue2 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMainDataTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mainDataTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMainDataValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mainDataValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNickName(String str) {
        this.nickName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.priceUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQrCode(String str) {
        this.qrCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradeTag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ShareData(mainDataTitle=" + this.mainDataTitle + ", mainDataValue=" + this.mainDataValue + ", altDataTitle=" + this.altDataTitle + ", altDataValue=" + this.altDataValue + ", priceUnit=" + this.priceUnit + ", botDataTitle1=" + this.botDataTitle1 + ", botDataValue1=" + this.botDataValue1 + ", botDataTitle2=" + this.botDataTitle2 + ", botDataValue2=" + this.botDataValue2 + ", avatar=" + this.avatar + ", nickName=" + this.nickName + ", tradeTag=" + this.tradeTag + ", additionalParams=" + this.additionalParams + ", qrCode=" + this.qrCode + ", pnlUnit=" + this.pnlUnit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.mainDataTitle);
        parcel.writeString(this.mainDataValue);
        parcel.writeString(this.altDataTitle);
        parcel.writeString(this.altDataValue);
        parcel.writeString(this.priceUnit);
        parcel.writeString(this.botDataTitle1);
        parcel.writeString(this.botDataValue1);
        parcel.writeString(this.botDataTitle2);
        parcel.writeString(this.botDataValue2);
        parcel.writeString(this.avatar);
        parcel.writeString(this.nickName);
        parcel.writeString(this.tradeTag);
        Map<String, String> map = this.additionalParams;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeString(this.qrCode);
        parcel.writeString(this.pnlUnit);
    }

    public ShareData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, String str7, String str8, String str9, String str10, String str11, @NotNull String str12, Map<String, String> map, String str13, String str14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.mainDataTitle = str;
        this.mainDataValue = str2;
        this.altDataTitle = str3;
        this.altDataValue = str4;
        this.priceUnit = str5;
        this.botDataTitle1 = str6;
        this.botDataValue1 = str7;
        this.botDataTitle2 = str8;
        this.botDataValue2 = str9;
        this.avatar = str10;
        this.nickName = str11;
        this.tradeTag = str12;
        this.additionalParams = map;
        this.qrCode = str13;
        this.pnlUnit = str14;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a5: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: INVOKE (wrap:int:0x0006: SGET  A[WRAPPED] o.xof.Application.ITrustedWebActivityCallbackStubProxy int) STATIC call: o.mpX.AYXKKw(int):java.lang.String A[MD:(int):java.lang.String (m), WRAPPED] (LINE:538)) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001f: INVOKE (wrap:int:0x001d: SGET  A[WRAPPED] o.xof.Application.getCurrent int) STATIC call: o.mpX.AYXKKw(int):java.lang.String A[MD:(int):java.lang.String (m), WRAPPED] (LINE:540)) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005f: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0067: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r28v0 java.lang.String) : (""))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x006e: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r29v0 java.util.Map))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007e: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, java.lang.String, java.lang.String):void (m)] (LINE:537) call: com.okinc.unify_trade.bot.data.ShareData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ShareData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Map map, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C33070mpX.AYXKKw(C55688xof.Application.ITrustedWebActivityCallbackStubProxy) : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C33070mpX.AYXKKw(C55688xof.Application.getCurrent) : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) == 0 ? str12 : "", (i & 4096) != 0 ? null : map, (i & 8192) != 0 ? null : str13, (i & 16384) == 0 ? str14 : null);
    }
}

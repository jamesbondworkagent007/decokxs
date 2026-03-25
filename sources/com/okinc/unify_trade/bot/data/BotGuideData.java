package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class BotGuideData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotGuideData> CREATOR = new Creator();
    private String botName;
    private String botType;
    private String copyType;
    private List<BotGuideItem> guideItemList;
    private BotGuideLinkItem guideLink;
    private String guideTitle;
    private String picNightUrl;
    private String picUrl;
    private int titleAppearance;
    private String videoUrl;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<BotGuideData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotGuideData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(BotGuideItem.CREATOR.createFromParcel(parcel));
            }
            return new BotGuideData(string, string2, string3, string4, arrayList, BotGuideLinkItem.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotGuideData[] newArray(int i) {
            return new BotGuideData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotGuideData() {
        this(null, null, null, null, null, null, null, 0, null, null, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.botName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.picNightUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.picUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.videoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.botType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BotGuideItem> component5() {
        return this.guideItemList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotGuideLinkItem component6() {
        return this.guideLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.copyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.titleAppearance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.guideTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotGuideData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<BotGuideItem> list, @NotNull BotGuideLinkItem botGuideLinkItem, @NotNull String str5, int i, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(botGuideLinkItem, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new BotGuideData(str, str2, str3, str4, list, botGuideLinkItem, str5, i, str6, str7);
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
        if (!(obj instanceof BotGuideData)) {
            return false;
        }
        BotGuideData botGuideData = (BotGuideData) obj;
        return Intrinsics.EZpvd((Object) this.botName, (Object) botGuideData.botName) && Intrinsics.EZpvd((Object) this.picUrl, (Object) botGuideData.picUrl) && Intrinsics.EZpvd((Object) this.videoUrl, (Object) botGuideData.videoUrl) && Intrinsics.EZpvd((Object) this.botType, (Object) botGuideData.botType) && Intrinsics.EZpvd(this.guideItemList, botGuideData.guideItemList) && Intrinsics.EZpvd(this.guideLink, botGuideData.guideLink) && Intrinsics.EZpvd((Object) this.copyType, (Object) botGuideData.copyType) && this.titleAppearance == botGuideData.titleAppearance && Intrinsics.EZpvd((Object) this.guideTitle, (Object) botGuideData.guideTitle) && Intrinsics.EZpvd((Object) this.picNightUrl, (Object) botGuideData.picNightUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBotName() {
        return this.botName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBotType() {
        return this.botType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCopyType() {
        return this.copyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BotGuideItem> getGuideItemList() {
        return this.guideItemList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotGuideLinkItem getGuideLink() {
        return this.guideLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGuideTitle() {
        return this.guideTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPicNightUrl() {
        return this.picNightUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPicUrl() {
        return this.picUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleAppearance() {
        return this.titleAppearance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.botName.hashCode() * 31) + this.picUrl.hashCode()) * 31) + this.videoUrl.hashCode()) * 31) + this.botType.hashCode()) * 31) + this.guideItemList.hashCode()) * 31) + this.guideLink.hashCode()) * 31) + this.copyType.hashCode()) * 31) + Integer.hashCode(this.titleAppearance)) * 31) + this.guideTitle.hashCode()) * 31) + this.picNightUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBotName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.botName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBotType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.botType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCopyType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copyType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGuideItemList(@NotNull List<BotGuideItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.guideItemList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGuideLink(@NotNull BotGuideLinkItem botGuideLinkItem) {
        Intrinsics.checkNotNullParameter(botGuideLinkItem, "");
        this.guideLink = botGuideLinkItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGuideTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.guideTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPicNightUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.picNightUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPicUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.picUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleAppearance(int i) {
        this.titleAppearance = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVideoUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.videoUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotGuideData(botName=" + this.botName + ", picUrl=" + this.picUrl + ", videoUrl=" + this.videoUrl + ", botType=" + this.botType + ", guideItemList=" + this.guideItemList + ", guideLink=" + this.guideLink + ", copyType=" + this.copyType + ", titleAppearance=" + this.titleAppearance + ", guideTitle=" + this.guideTitle + ", picNightUrl=" + this.picNightUrl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.botName);
        parcel.writeString(this.picUrl);
        parcel.writeString(this.videoUrl);
        parcel.writeString(this.botType);
        List<BotGuideItem> list = this.guideItemList;
        parcel.writeInt(list.size());
        Iterator<BotGuideItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        this.guideLink.writeToParcel(parcel, i);
        parcel.writeString(this.copyType);
        parcel.writeInt(this.titleAppearance);
        parcel.writeString(this.guideTitle);
        parcel.writeString(this.picNightUrl);
    }

    public BotGuideData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<BotGuideItem> list, @NotNull BotGuideLinkItem botGuideLinkItem, @NotNull String str5, int i, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(botGuideLinkItem, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.botName = str;
        this.picUrl = str2;
        this.videoUrl = str3;
        this.botType = str4;
        this.guideItemList = list;
        this.guideLink = botGuideLinkItem;
        this.copyType = str5;
        this.titleAppearance = i;
        this.guideTitle = str6;
        this.picNightUrl = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0024: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:964)) : (r16v0 java.util.List))
  (wrap:com.okinc.unify_trade.bot.data.BotGuideLinkItem:?: TERNARY null = ((wrap:int:0x002b: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: CONSTRUCTOR (null java.lang.String), (null java.lang.String), (3 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:965) call: com.okinc.unify_trade.bot.data.BotGuideLinkItem.<init>(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r17v0 com.okinc.unify_trade.bot.data.BotGuideLinkItem))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("non_profit_sharing") : (r18v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0042: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0046: SGET  A[WRAPPED] o.mPz.Dialog.QOLQEE int) : (r19v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.bot.data.BotGuideItem>, com.okinc.unify_trade.bot.data.BotGuideLinkItem, java.lang.String, int, java.lang.String, java.lang.String):void (m)] (LINE:959) call: com.okinc.unify_trade.bot.data.BotGuideData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.unify_trade.bot.data.BotGuideLinkItem, java.lang.String, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BotGuideData(String str, String str2, String str3, String str4, List list, BotGuideLinkItem botGuideLinkItem, String str5, int i, String str6, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? yDY.AhwBna() : list, (i2 & 32) != 0 ? new BotGuideLinkItem(null, null, 3, null) : botGuideLinkItem, (i2 & 64) != 0 ? "non_profit_sharing" : str5, (i2 & 128) != 0 ? C32113mPz.Dialog.QOLQEE : i, (i2 & 256) != 0 ? "" : str6, (i2 & 512) == 0 ? str7 : "");
    }
}

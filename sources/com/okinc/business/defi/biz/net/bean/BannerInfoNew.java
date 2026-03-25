package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class BannerInfoNew implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BannerInfoNew> CREATOR = new Creator();
    private final String campaignContent;
    private final String campaignTitle;
    private final String dayLogo;
    private final int id;
    private final int isBackup;
    private final Integer maxClickNum;
    private final String nightLogo;
    private final String subTitle;
    private final Integer supportMode;
    private final String title;
    private final String titleName;
    private final String url;
    private final String urlTitle;
    private final int urlType;
    private final List<Integer> walletType;

    public static final class Creator implements Parcelable.Creator<BannerInfoNew> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BannerInfoNew createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new BannerInfoNew(i, string, string2, string3, string4, string5, string6, i2, arrayList, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BannerInfoNew[] newArray(int i) {
            return new BannerInfoNew[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.isBackup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.titleName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.campaignContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.campaignTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component14() {
        return this.supportMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component15() {
        return this.maxClickNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.urlTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.dayLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.nightLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.urlType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component9() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerInfoNew copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i2, @NotNull List<Integer> list, int i3, @NotNull String str7, @NotNull String str8, @NotNull String str9, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new BannerInfoNew(i, str, str2, str3, str4, str5, str6, i2, list, i3, str7, str8, str9, num, num2);
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
        if (!(obj instanceof BannerInfoNew)) {
            return false;
        }
        BannerInfoNew bannerInfoNew = (BannerInfoNew) obj;
        return this.id == bannerInfoNew.id && Intrinsics.EZpvd((Object) this.title, (Object) bannerInfoNew.title) && Intrinsics.EZpvd((Object) this.subTitle, (Object) bannerInfoNew.subTitle) && Intrinsics.EZpvd((Object) this.urlTitle, (Object) bannerInfoNew.urlTitle) && Intrinsics.EZpvd((Object) this.dayLogo, (Object) bannerInfoNew.dayLogo) && Intrinsics.EZpvd((Object) this.nightLogo, (Object) bannerInfoNew.nightLogo) && Intrinsics.EZpvd((Object) this.url, (Object) bannerInfoNew.url) && this.urlType == bannerInfoNew.urlType && Intrinsics.EZpvd(this.walletType, bannerInfoNew.walletType) && this.isBackup == bannerInfoNew.isBackup && Intrinsics.EZpvd((Object) this.titleName, (Object) bannerInfoNew.titleName) && Intrinsics.EZpvd((Object) this.campaignContent, (Object) bannerInfoNew.campaignContent) && Intrinsics.EZpvd((Object) this.campaignTitle, (Object) bannerInfoNew.campaignTitle) && Intrinsics.EZpvd(this.supportMode, bannerInfoNew.supportMode) && Intrinsics.EZpvd(this.maxClickNum, bannerInfoNew.maxClickNum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCampaignContent() {
        return this.campaignContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCampaignTitle() {
        return this.campaignTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDayLogo() {
        return this.dayLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMaxClickNum() {
        return this.maxClickNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNightLogo() {
        return this.nightLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSupportMode() {
        return this.supportMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitleName() {
        return this.titleName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrlTitle() {
        return this.urlTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUrlType() {
        return this.urlType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getWalletType() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id);
        int iHashCode2 = this.title.hashCode();
        int iHashCode3 = this.subTitle.hashCode();
        int iHashCode4 = this.urlTitle.hashCode();
        int iHashCode5 = this.dayLogo.hashCode();
        int iHashCode6 = this.nightLogo.hashCode();
        int iHashCode7 = this.url.hashCode();
        int iHashCode8 = Integer.hashCode(this.urlType);
        int iHashCode9 = this.walletType.hashCode();
        int iHashCode10 = Integer.hashCode(this.isBackup);
        int iHashCode11 = this.titleName.hashCode();
        int iHashCode12 = this.campaignContent.hashCode();
        int iHashCode13 = this.campaignTitle.hashCode();
        Integer num = this.supportMode;
        int iHashCode14 = num == null ? 0 : num.hashCode();
        Integer num2 = this.maxClickNum;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (num2 == null ? 0 : num2.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isBackup() {
        return this.isBackup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BannerInfoNew(id=" + this.id + ", title=" + this.title + ", subTitle=" + this.subTitle + ", urlTitle=" + this.urlTitle + ", dayLogo=" + this.dayLogo + ", nightLogo=" + this.nightLogo + ", url=" + this.url + ", urlType=" + this.urlType + ", walletType=" + this.walletType + ", isBackup=" + this.isBackup + ", titleName=" + this.titleName + ", campaignContent=" + this.campaignContent + ", campaignTitle=" + this.campaignTitle + ", supportMode=" + this.supportMode + ", maxClickNum=" + this.maxClickNum + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        parcel.writeString(this.urlTitle);
        parcel.writeString(this.dayLogo);
        parcel.writeString(this.nightLogo);
        parcel.writeString(this.url);
        parcel.writeInt(this.urlType);
        List<Integer> list = this.walletType;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
        parcel.writeInt(this.isBackup);
        parcel.writeString(this.titleName);
        parcel.writeString(this.campaignContent);
        parcel.writeString(this.campaignTitle);
        Integer num = this.supportMode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.maxClickNum;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public BannerInfoNew(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i2, @NotNull List<Integer> list, int i3, @NotNull String str7, @NotNull String str8, @NotNull String str9, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.id = i;
        this.title = str;
        this.subTitle = str2;
        this.urlTitle = str3;
        this.dayLogo = str4;
        this.nightLogo = str5;
        this.url = str6;
        this.urlType = i2;
        this.walletType = list;
        this.isBackup = i3;
        this.titleName = str7;
        this.campaignContent = str8;
        this.campaignTitle = str9;
        this.supportMode = num;
        this.maxClickNum = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002d: CONSTRUCTOR 
  (r18v0 int)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 int)
  (r26v0 java.util.List)
  (r27v0 int)
  (r28v0 java.lang.String)
  (r29v0 java.lang.String)
  (r30v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r31v0 java.lang.Integer))
  (r32v0 java.lang.Integer)
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.util.List<java.lang.Integer>, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer):void (m)] (LINE:17) call: com.okinc.business.defi.biz.net.bean.BannerInfoNew.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.util.List, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ BannerInfoNew(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, List list, int i3, String str7, String str8, String str9, Integer num, Integer num2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, str4, str5, str6, i2, list, i3, str7, str8, str9, (i4 & 8192) != 0 ? -1 : num, num2);
    }
}

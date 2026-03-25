package com.okinc.kline.news.data.po;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineFlashContentPo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<KlineFlashContentPo> CREATOR = new Creator();

    @SerializedName("author")
    private final KlineFlashAuthorPo author;

    @SerializedName("content")
    private final String content;

    @SerializedName("contentId")
    private final String contentId;

    @SerializedName("enTitle")
    private final String enTitle;

    @SerializedName("formatType")
    private final Integer formatType;

    @SerializedName("publishTime")
    private final String publishTime;

    @SerializedName("title")
    private final String title;

    @SerializedName("translatedContent")
    private final String translatedContent;

    @SerializedName("translatedTitle")
    private final String translatedTitle;

    public static final class Creator implements Parcelable.Creator<KlineFlashContentPo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlineFlashContentPo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new KlineFlashContentPo(parcel.readInt() == 0 ? null : KlineFlashAuthorPo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlineFlashContentPo[] newArray(int i) {
            return new KlineFlashContentPo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineFlashAuthorPo component1() {
        return this.author;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.contentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.formatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.translatedContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.translatedTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.enTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.publishTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineFlashContentPo copy(KlineFlashAuthorPo klineFlashAuthorPo, String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new KlineFlashContentPo(klineFlashAuthorPo, str, num, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof KlineFlashContentPo)) {
            return false;
        }
        KlineFlashContentPo klineFlashContentPo = (KlineFlashContentPo) obj;
        return Intrinsics.EZpvd(this.author, klineFlashContentPo.author) && Intrinsics.EZpvd((Object) this.contentId, (Object) klineFlashContentPo.contentId) && Intrinsics.EZpvd(this.formatType, klineFlashContentPo.formatType) && Intrinsics.EZpvd((Object) this.content, (Object) klineFlashContentPo.content) && Intrinsics.EZpvd((Object) this.translatedContent, (Object) klineFlashContentPo.translatedContent) && Intrinsics.EZpvd((Object) this.title, (Object) klineFlashContentPo.title) && Intrinsics.EZpvd((Object) this.translatedTitle, (Object) klineFlashContentPo.translatedTitle) && Intrinsics.EZpvd((Object) this.enTitle, (Object) klineFlashContentPo.enTitle) && Intrinsics.EZpvd((Object) this.publishTime, (Object) klineFlashContentPo.publishTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineFlashAuthorPo getAuthor() {
        return this.author;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContentId() {
        return this.contentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnTitle() {
        return this.enTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFormatType() {
        return this.formatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublishTime() {
        return this.publishTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTranslatedContent() {
        return this.translatedContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTranslatedTitle() {
        return this.translatedTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        KlineFlashAuthorPo klineFlashAuthorPo = this.author;
        int iHashCode = klineFlashAuthorPo == null ? 0 : klineFlashAuthorPo.hashCode();
        String str = this.contentId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.formatType;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str2 = this.content;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.translatedContent;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.title;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.translatedTitle;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.enTitle;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.publishTime;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KlineFlashContentPo(author=" + this.author + ", contentId=" + this.contentId + ", formatType=" + this.formatType + ", content=" + this.content + ", translatedContent=" + this.translatedContent + ", title=" + this.title + ", translatedTitle=" + this.translatedTitle + ", enTitle=" + this.enTitle + ", publishTime=" + this.publishTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        KlineFlashAuthorPo klineFlashAuthorPo = this.author;
        if (klineFlashAuthorPo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            klineFlashAuthorPo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.contentId);
        Integer num = this.formatType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.content);
        parcel.writeString(this.translatedContent);
        parcel.writeString(this.title);
        parcel.writeString(this.translatedTitle);
        parcel.writeString(this.enTitle);
        parcel.writeString(this.publishTime);
    }

    public KlineFlashContentPo(KlineFlashAuthorPo klineFlashAuthorPo, String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.author = klineFlashAuthorPo;
        this.contentId = str;
        this.formatType = num;
        this.content = str2;
        this.translatedContent = str3;
        this.title = str4;
        this.translatedTitle = str5;
        this.enTitle = str6;
        this.publishTime = str7;
    }

    public KlineFlashContentPo() {
        this(new KlineFlashAuthorPo(), "", -1, "", "", "", "", "", "");
    }
}

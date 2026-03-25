package com.okinc.kline.news.data.po;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineFlashAuthorPo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<KlineFlashAuthorPo> CREATOR = new Creator();

    @SerializedName("authorId")
    private final String authorId;

    @SerializedName("nickName")
    private final String nickName;

    @SerializedName("portrait")
    private final String portrait;

    @SerializedName("type")
    private final Integer type;

    public static final class Creator implements Parcelable.Creator<KlineFlashAuthorPo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlineFlashAuthorPo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new KlineFlashAuthorPo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlineFlashAuthorPo[] newArray(int i) {
            return new KlineFlashAuthorPo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KlineFlashAuthorPo copy$default(KlineFlashAuthorPo klineFlashAuthorPo, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = klineFlashAuthorPo.authorId;
        }
        if ((i & 2) != 0) {
            str2 = klineFlashAuthorPo.portrait;
        }
        if ((i & 4) != 0) {
            str3 = klineFlashAuthorPo.nickName;
        }
        if ((i & 8) != 0) {
            num = klineFlashAuthorPo.type;
        }
        return klineFlashAuthorPo.copy(str, str2, str3, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.authorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineFlashAuthorPo copy(String str, String str2, String str3, Integer num) {
        return new KlineFlashAuthorPo(str, str2, str3, num);
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
        if (!(obj instanceof KlineFlashAuthorPo)) {
            return false;
        }
        KlineFlashAuthorPo klineFlashAuthorPo = (KlineFlashAuthorPo) obj;
        return Intrinsics.EZpvd((Object) this.authorId, (Object) klineFlashAuthorPo.authorId) && Intrinsics.EZpvd((Object) this.portrait, (Object) klineFlashAuthorPo.portrait) && Intrinsics.EZpvd((Object) this.nickName, (Object) klineFlashAuthorPo.nickName) && Intrinsics.EZpvd(this.type, klineFlashAuthorPo.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuthorId() {
        return this.authorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPortrait() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.authorId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.portrait;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.nickName;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.type;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KlineFlashAuthorPo(authorId=" + this.authorId + ", portrait=" + this.portrait + ", nickName=" + this.nickName + ", type=" + this.type + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.authorId);
        parcel.writeString(this.portrait);
        parcel.writeString(this.nickName);
        Integer num = this.type;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public KlineFlashAuthorPo(String str, String str2, String str3, Integer num) {
        this.authorId = str;
        this.portrait = str2;
        this.nickName = str3;
        this.type = num;
    }

    public KlineFlashAuthorPo() {
        this("", "", "", -1);
    }
}

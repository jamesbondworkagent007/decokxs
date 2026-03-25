package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class RecommendCardData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecommendCardData> CREATOR = new Creator();
    private String benefit;
    private String benefitColor;
    private String description;
    private final List<DistributeItem> distributeList;
    private final String label1;
    private String label2;
    private String summary;
    private final String tag;
    private final String title;
    private String userCount;

    public static final class Creator implements Parcelable.Creator<RecommendCardData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendCardData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(DistributeItem.CREATOR.createFromParcel(parcel));
            }
            return new RecommendCardData(string, string2, string3, string4, string5, string6, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendCardData[] newArray(int i) {
            return new RecommendCardData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.summary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.label1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.label2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.benefit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.benefitColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DistributeItem> component7() {
        return this.distributeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.userCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendCardData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<DistributeItem> list, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
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
        return new RecommendCardData(str, str2, str3, str4, str5, str6, list, str7, str8, str9);
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
        if (!(obj instanceof RecommendCardData)) {
            return false;
        }
        RecommendCardData recommendCardData = (RecommendCardData) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) recommendCardData.title) && Intrinsics.EZpvd((Object) this.tag, (Object) recommendCardData.tag) && Intrinsics.EZpvd((Object) this.label1, (Object) recommendCardData.label1) && Intrinsics.EZpvd((Object) this.label2, (Object) recommendCardData.label2) && Intrinsics.EZpvd((Object) this.benefit, (Object) recommendCardData.benefit) && Intrinsics.EZpvd((Object) this.benefitColor, (Object) recommendCardData.benefitColor) && Intrinsics.EZpvd(this.distributeList, recommendCardData.distributeList) && Intrinsics.EZpvd((Object) this.userCount, (Object) recommendCardData.userCount) && Intrinsics.EZpvd((Object) this.description, (Object) recommendCardData.description) && Intrinsics.EZpvd((Object) this.summary, (Object) recommendCardData.summary);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBenefit() {
        return this.benefit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBenefitColor() {
        return this.benefitColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DistributeItem> getDistributeList() {
        return this.distributeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabel1() {
        return this.label1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabel2() {
        return this.label2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSummary() {
        return this.summary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserCount() {
        return this.userCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.title.hashCode() * 31) + this.tag.hashCode()) * 31) + this.label1.hashCode()) * 31) + this.label2.hashCode()) * 31) + this.benefit.hashCode()) * 31) + this.benefitColor.hashCode()) * 31) + this.distributeList.hashCode()) * 31) + this.userCount.hashCode()) * 31) + this.description.hashCode()) * 31) + this.summary.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBenefit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.benefit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBenefitColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.benefitColor = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.description = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLabel2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.label2 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSummary(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.summary = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserCount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userCount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecommendCardData(title=" + this.title + ", tag=" + this.tag + ", label1=" + this.label1 + ", label2=" + this.label2 + ", benefit=" + this.benefit + ", benefitColor=" + this.benefitColor + ", distributeList=" + this.distributeList + ", userCount=" + this.userCount + ", description=" + this.description + ", summary=" + this.summary + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.tag);
        parcel.writeString(this.label1);
        parcel.writeString(this.label2);
        parcel.writeString(this.benefit);
        parcel.writeString(this.benefitColor);
        List<DistributeItem> list = this.distributeList;
        parcel.writeInt(list.size());
        Iterator<DistributeItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.userCount);
        parcel.writeString(this.description);
        parcel.writeString(this.summary);
    }

    public RecommendCardData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<DistributeItem> list, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
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
        this.title = str;
        this.tag = str2;
        this.label1 = str3;
        this.label2 = str4;
        this.benefit = str5;
        this.benefitColor = str6;
        this.distributeList = list;
        this.userCount = str7;
        this.description = str8;
        this.summary = str9;
    }
}

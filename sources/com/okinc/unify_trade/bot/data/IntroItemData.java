package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class IntroItemData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<IntroItemData> CREATOR = new Creator();
    private String description;
    private final List<DistributeItem> distributeList;
    private final String label1;
    private String label2;
    private final String title;
    private String userCount;

    public static final class Creator implements Parcelable.Creator<IntroItemData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntroItemData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(DistributeItem.CREATOR.createFromParcel(parcel));
            }
            return new IntroItemData(string, string2, string3, arrayList, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntroItemData[] newArray(int i) {
            return new IntroItemData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.unify_trade.bot.data.IntroItemData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntroItemData copy$default(IntroItemData introItemData, String str, String str2, String str3, List list, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = introItemData.title;
        }
        if ((i & 2) != 0) {
            str2 = introItemData.label1;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = introItemData.label2;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            list = introItemData.distributeList;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            str4 = introItemData.userCount;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = introItemData.description;
        }
        return introItemData.copy(str, str6, str7, list2, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.label1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.label2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DistributeItem> component4() {
        return this.distributeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.userCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IntroItemData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<DistributeItem> list, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new IntroItemData(str, str2, str3, list, str4, str5);
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
        if (!(obj instanceof IntroItemData)) {
            return false;
        }
        IntroItemData introItemData = (IntroItemData) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) introItemData.title) && Intrinsics.EZpvd((Object) this.label1, (Object) introItemData.label1) && Intrinsics.EZpvd((Object) this.label2, (Object) introItemData.label2) && Intrinsics.EZpvd(this.distributeList, introItemData.distributeList) && Intrinsics.EZpvd((Object) this.userCount, (Object) introItemData.userCount) && Intrinsics.EZpvd((Object) this.description, (Object) introItemData.description);
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
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserCount() {
        return this.userCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.title.hashCode() * 31) + this.label1.hashCode()) * 31) + this.label2.hashCode()) * 31) + this.distributeList.hashCode()) * 31) + this.userCount.hashCode()) * 31) + this.description.hashCode();
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
    public final void setUserCount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userCount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IntroItemData(title=" + this.title + ", label1=" + this.label1 + ", label2=" + this.label2 + ", distributeList=" + this.distributeList + ", userCount=" + this.userCount + ", description=" + this.description + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.label1);
        parcel.writeString(this.label2);
        List<DistributeItem> list = this.distributeList;
        parcel.writeInt(list.size());
        Iterator<DistributeItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.userCount);
        parcel.writeString(this.description);
    }

    public IntroItemData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<DistributeItem> list, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.title = str;
        this.label1 = str2;
        this.label2 = str3;
        this.distributeList = list;
        this.userCount = str4;
        this.description = str5;
    }
}

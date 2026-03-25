package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class DescListItem implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DescListItem> CREATOR = new Creator();
    private final String desc;
    private final String highLightLogic;
    private final String text;

    public static final class Creator implements Parcelable.Creator<DescListItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DescListItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DescListItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DescListItem[] newArray(int i) {
            return new DescListItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DescListItem copy$default(DescListItem descListItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = descListItem.text;
        }
        if ((i & 2) != 0) {
            str2 = descListItem.desc;
        }
        if ((i & 4) != 0) {
            str3 = descListItem.highLightLogic;
        }
        return descListItem.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.highLightLogic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DescListItem copy(String str, String str2, String str3) {
        return new DescListItem(str, str2, str3);
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
        if (!(obj instanceof DescListItem)) {
            return false;
        }
        DescListItem descListItem = (DescListItem) obj;
        return Intrinsics.EZpvd((Object) this.text, (Object) descListItem.text) && Intrinsics.EZpvd((Object) this.desc, (Object) descListItem.desc) && Intrinsics.EZpvd((Object) this.highLightLogic, (Object) descListItem.highLightLogic);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHighLightLogic() {
        return this.highLightLogic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.text;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.desc;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.highLightLogic;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DescListItem(text=" + this.text + ", desc=" + this.desc + ", highLightLogic=" + this.highLightLogic + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.text);
        parcel.writeString(this.desc);
        parcel.writeString(this.highLightLogic);
    }

    public DescListItem(String str, String str2, String str3) {
        this.text = str;
        this.desc = str2;
        this.highLightLogic = str3;
    }
}

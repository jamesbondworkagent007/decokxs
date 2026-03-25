package com.okinc.core.ok_app.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class TabBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TabBean> CREATOR = new Creator();
    private String contentDescription;
    private int id;
    private int tabName;

    public static final class Creator implements Parcelable.Creator<TabBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TabBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TabBean(parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TabBean[] newArray(int i) {
            return new TabBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TabBean copy$default(TabBean tabBean, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = tabBean.tabName;
        }
        if ((i3 & 2) != 0) {
            i2 = tabBean.id;
        }
        if ((i3 & 4) != 0) {
            str = tabBean.contentDescription;
        }
        return tabBean.copy(i, i2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.tabName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.contentDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TabBean copy(@StringRes int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TabBean(i, i2, str);
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
        if (!(obj instanceof TabBean)) {
            return false;
        }
        TabBean tabBean = (TabBean) obj;
        return this.tabName == tabBean.tabName && this.id == tabBean.id && Intrinsics.EZpvd((Object) this.contentDescription, (Object) tabBean.contentDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTabName() {
        return this.tabName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.tabName) * 31) + Integer.hashCode(this.id)) * 31) + this.contentDescription.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContentDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contentDescription = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(int i) {
        this.id = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTabName(int i) {
        this.tabName = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TabBean(tabName=" + this.tabName + ", id=" + this.id + ", contentDescription=" + this.contentDescription + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.tabName);
        parcel.writeInt(this.id);
        parcel.writeString(this.contentDescription);
    }

    public TabBean(@StringRes int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tabName = i;
        this.id = i2;
        this.contentDescription = str;
    }
}

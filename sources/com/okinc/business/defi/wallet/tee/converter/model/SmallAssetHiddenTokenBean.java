package com.okinc.business.defi.wallet.tee.converter.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class SmallAssetHiddenTokenBean implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SmallAssetHiddenTokenBean> CREATOR = new Creator();
    private final String iconUrl;
    private final String tokenAmount;
    private final String tokenSymbol;

    public static final class Creator implements Parcelable.Creator<SmallAssetHiddenTokenBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmallAssetHiddenTokenBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SmallAssetHiddenTokenBean(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmallAssetHiddenTokenBean[] newArray(int i) {
            return new SmallAssetHiddenTokenBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SmallAssetHiddenTokenBean copy$default(SmallAssetHiddenTokenBean smallAssetHiddenTokenBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = smallAssetHiddenTokenBean.iconUrl;
        }
        if ((i & 2) != 0) {
            str2 = smallAssetHiddenTokenBean.tokenSymbol;
        }
        if ((i & 4) != 0) {
            str3 = smallAssetHiddenTokenBean.tokenAmount;
        }
        return smallAssetHiddenTokenBean.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmallAssetHiddenTokenBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SmallAssetHiddenTokenBean(str, str2, str3);
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
        if (!(obj instanceof SmallAssetHiddenTokenBean)) {
            return false;
        }
        SmallAssetHiddenTokenBean smallAssetHiddenTokenBean = (SmallAssetHiddenTokenBean) obj;
        return Intrinsics.EZpvd((Object) this.iconUrl, (Object) smallAssetHiddenTokenBean.iconUrl) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) smallAssetHiddenTokenBean.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) smallAssetHiddenTokenBean.tokenAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAmount() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.iconUrl.hashCode() * 31) + this.tokenSymbol.hashCode()) * 31) + this.tokenAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmallAssetHiddenTokenBean(iconUrl=" + this.iconUrl + ", tokenSymbol=" + this.tokenSymbol + ", tokenAmount=" + this.tokenAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.tokenAmount);
    }

    public SmallAssetHiddenTokenBean(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.iconUrl = str;
        this.tokenSymbol = str2;
        this.tokenAmount = str3;
    }
}

package com.okinc.business.defi.wallet.home.walletconnect;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletConnectedData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<WalletConnectedData> CREATOR = new Creator();
    private final int connectType;
    private final String iconUrl;
    private final String name;
    private final String topicOrClientId;
    private final String url;

    public static final class Creator implements Parcelable.Creator<WalletConnectedData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletConnectedData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WalletConnectedData(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletConnectedData[] newArray(int i) {
            return new WalletConnectedData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletConnectedData copy$default(WalletConnectedData walletConnectedData, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = walletConnectedData.connectType;
        }
        if ((i2 & 2) != 0) {
            str = walletConnectedData.iconUrl;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = walletConnectedData.name;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = walletConnectedData.url;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = walletConnectedData.topicOrClientId;
        }
        return walletConnectedData.copy(i, str5, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.connectType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.topicOrClientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletConnectedData copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new WalletConnectedData(i, str, str2, str3, str4);
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
        if (!(obj instanceof WalletConnectedData)) {
            return false;
        }
        WalletConnectedData walletConnectedData = (WalletConnectedData) obj;
        return this.connectType == walletConnectedData.connectType && Intrinsics.EZpvd((Object) this.iconUrl, (Object) walletConnectedData.iconUrl) && Intrinsics.EZpvd((Object) this.name, (Object) walletConnectedData.name) && Intrinsics.EZpvd((Object) this.url, (Object) walletConnectedData.url) && Intrinsics.EZpvd((Object) this.topicOrClientId, (Object) walletConnectedData.topicOrClientId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getConnectType() {
        return this.connectType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopicOrClientId() {
        return this.topicOrClientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Integer.hashCode(this.connectType) * 31) + this.iconUrl.hashCode()) * 31) + this.name.hashCode()) * 31) + this.url.hashCode()) * 31) + this.topicOrClientId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletConnectedData(connectType=" + this.connectType + ", iconUrl=" + this.iconUrl + ", name=" + this.name + ", url=" + this.url + ", topicOrClientId=" + this.topicOrClientId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.connectType);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.name);
        parcel.writeString(this.url);
        parcel.writeString(this.topicOrClientId);
    }

    public WalletConnectedData(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.connectType = i;
        this.iconUrl = str;
        this.name = str2;
        this.url = str3;
        this.topicOrClientId = str4;
    }
}

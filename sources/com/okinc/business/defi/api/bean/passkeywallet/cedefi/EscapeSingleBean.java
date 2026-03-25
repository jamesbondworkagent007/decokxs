package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class EscapeSingleBean implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<EscapeSingleBean> CREATOR = new Creator();
    private final String accountId;
    private final String timestamp;
    private final String walletName;

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<EscapeSingleBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeSingleBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EscapeSingleBean(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeSingleBean[] newArray(int i) {
            return new EscapeSingleBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EscapeSingleBean copy$default(EscapeSingleBean escapeSingleBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = escapeSingleBean.timestamp;
        }
        if ((i & 2) != 0) {
            str2 = escapeSingleBean.walletName;
        }
        if ((i & 4) != 0) {
            str3 = escapeSingleBean.accountId;
        }
        return escapeSingleBean.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.walletName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapeSingleBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new EscapeSingleBean(str, str2, str3);
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
        if (!(obj instanceof EscapeSingleBean)) {
            return false;
        }
        EscapeSingleBean escapeSingleBean = (EscapeSingleBean) obj;
        return Intrinsics.EZpvd((Object) this.timestamp, (Object) escapeSingleBean.timestamp) && Intrinsics.EZpvd((Object) this.walletName, (Object) escapeSingleBean.walletName) && Intrinsics.EZpvd((Object) this.accountId, (Object) escapeSingleBean.accountId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletName() {
        return this.walletName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.timestamp.hashCode() * 31) + this.walletName.hashCode()) * 31) + this.accountId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapeSingleBean(timestamp=" + this.timestamp + ", walletName=" + this.walletName + ", accountId=" + this.accountId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.timestamp);
        parcel.writeString(this.walletName);
        parcel.writeString(this.accountId);
    }

    public EscapeSingleBean(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.timestamp = str;
        this.walletName = str2;
        this.accountId = str3;
    }
}

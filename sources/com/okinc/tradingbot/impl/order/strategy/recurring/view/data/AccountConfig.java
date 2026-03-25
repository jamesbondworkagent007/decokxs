package com.okinc.tradingbot.impl.order.strategy.recurring.view.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.tradingbot.impl.balance.dto.AccountType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class AccountConfig implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AccountConfig> CREATOR = new Creator();
    private String available;
    private final AccountType id;
    private boolean select;
    private final String title;

    public static final class Creator implements Parcelable.Creator<AccountConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AccountConfig(AccountType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountConfig[] newArray(int i) {
            return new AccountConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AccountConfig copy$default(AccountConfig accountConfig, AccountType accountType, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            accountType = accountConfig.id;
        }
        if ((i & 2) != 0) {
            str = accountConfig.title;
        }
        if ((i & 4) != 0) {
            str2 = accountConfig.available;
        }
        if ((i & 8) != 0) {
            z = accountConfig.select;
        }
        return accountConfig.copy(accountType, str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountType component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.available;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.select;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountConfig copy(@NotNull AccountType accountType, @NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(accountType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AccountConfig(accountType, str, str2, z);
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
        if (!(obj instanceof AccountConfig)) {
            return false;
        }
        AccountConfig accountConfig = (AccountConfig) obj;
        return this.id == accountConfig.id && Intrinsics.EZpvd((Object) this.title, (Object) accountConfig.title) && Intrinsics.EZpvd((Object) this.available, (Object) accountConfig.available) && this.select == accountConfig.select;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailable() {
        return this.available;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountType getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSelect() {
        return this.select;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.available.hashCode()) * 31) + Boolean.hashCode(this.select);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailable(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.available = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelect(boolean z) {
        this.select = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountConfig(id=" + this.id + ", title=" + this.title + ", available=" + this.available + ", select=" + this.select + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.id.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.available);
        parcel.writeInt(this.select ? 1 : 0);
    }

    public AccountConfig(@NotNull AccountType accountType, @NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(accountType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.id = accountType;
        this.title = str;
        this.available = str2;
        this.select = z;
    }
}

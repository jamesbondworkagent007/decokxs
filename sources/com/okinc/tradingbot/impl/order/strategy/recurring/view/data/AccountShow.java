package com.okinc.tradingbot.impl.order.strategy.recurring.view.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.tradingbot.impl.balance.dto.AccountType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class AccountShow implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AccountShow> CREATOR = new Creator();
    private String available;
    private final AccountType id;
    private boolean select;
    private final String title;

    public static final class Creator implements Parcelable.Creator<AccountShow> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountShow createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AccountShow(AccountType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountShow[] newArray(int i) {
            return new AccountShow[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AccountShow copy$default(AccountShow accountShow, AccountType accountType, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            accountType = accountShow.id;
        }
        if ((i & 2) != 0) {
            str = accountShow.title;
        }
        if ((i & 4) != 0) {
            str2 = accountShow.available;
        }
        if ((i & 8) != 0) {
            z = accountShow.select;
        }
        return accountShow.copy(accountType, str, str2, z);
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
    public final AccountShow copy(@NotNull AccountType accountType, @NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(accountType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AccountShow(accountType, str, str2, z);
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
        if (!(obj instanceof AccountShow)) {
            return false;
        }
        AccountShow accountShow = (AccountShow) obj;
        return this.id == accountShow.id && Intrinsics.EZpvd((Object) this.title, (Object) accountShow.title) && Intrinsics.EZpvd((Object) this.available, (Object) accountShow.available) && this.select == accountShow.select;
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
        return "AccountShow(id=" + this.id + ", title=" + this.title + ", available=" + this.available + ", select=" + this.select + ")";
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

    public AccountShow(@NotNull AccountType accountType, @NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(accountType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.id = accountType;
        this.title = str;
        this.available = str2;
        this.select = z;
    }
}

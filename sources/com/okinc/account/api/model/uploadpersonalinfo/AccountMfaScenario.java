package com.okinc.account.api.model.uploadpersonalinfo;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class AccountMfaScenario implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AccountMfaScenario[] $VALUES;
    public static final Parcelable.Creator<AccountMfaScenario> CREATOR;
    public static final AccountMfaScenario IsNonAuth = new AccountMfaScenario("IsNonAuth", 0);
    public static final AccountMfaScenario IsPartialAuth = new AccountMfaScenario("IsPartialAuth", 1);
    public static final AccountMfaScenario IsPostLogin = new AccountMfaScenario("IsPostLogin", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AccountMfaScenario[] $values() {
        return new AccountMfaScenario[]{IsNonAuth, IsPartialAuth, IsPostLogin};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AccountMfaScenario> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private AccountMfaScenario(String str, int i) {
    }

    static {
        AccountMfaScenario[] accountMfaScenarioArr$values = $values();
        $VALUES = accountMfaScenarioArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(accountMfaScenarioArr$values);
        CREATOR = new Parcelable.Creator<AccountMfaScenario>() { // from class: com.okinc.account.api.model.uploadpersonalinfo.AccountMfaScenario.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountMfaScenario createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return AccountMfaScenario.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountMfaScenario[] newArray(int i) {
                return new AccountMfaScenario[i];
            }
        };
    }

    public static AccountMfaScenario valueOf(String str) {
        return (AccountMfaScenario) Enum.valueOf(AccountMfaScenario.class, str);
    }

    public static AccountMfaScenario[] values() {
        return (AccountMfaScenario[]) $VALUES.clone();
    }
}

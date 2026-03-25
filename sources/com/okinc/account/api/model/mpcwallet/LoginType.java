package com.okinc.account.api.model.mpcwallet;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class LoginType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LoginType[] $VALUES;
    public static final Parcelable.Creator<LoginType> CREATOR;
    public static final LoginType PHONE = new LoginType("PHONE", 0);
    public static final LoginType EMAIL = new LoginType("EMAIL", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LoginType[] $values() {
        return new LoginType[]{PHONE, EMAIL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LoginType> getEntries() {
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

    private LoginType(String str, int i) {
    }

    static {
        LoginType[] loginTypeArr$values = $values();
        $VALUES = loginTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(loginTypeArr$values);
        CREATOR = new Parcelable.Creator<LoginType>() { // from class: com.okinc.account.api.model.mpcwallet.LoginType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LoginType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return LoginType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LoginType[] newArray(int i) {
                return new LoginType[i];
            }
        };
    }

    public static LoginType valueOf(String str) {
        return (LoginType) Enum.valueOf(LoginType.class, str);
    }

    public static LoginType[] values() {
        return (LoginType[]) $VALUES.clone();
    }
}

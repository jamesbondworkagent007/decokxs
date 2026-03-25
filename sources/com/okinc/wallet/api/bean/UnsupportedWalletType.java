package com.okinc.wallet.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class UnsupportedWalletType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UnsupportedWalletType[] $VALUES;
    public static final Parcelable.Creator<UnsupportedWalletType> CREATOR;
    public static final UnsupportedWalletType HardwareWallet = new UnsupportedWalletType("HardwareWallet", 0);
    public static final UnsupportedWalletType MPCWallet = new UnsupportedWalletType("MPCWallet", 1);
    public static final UnsupportedWalletType PrivateKeyWallet = new UnsupportedWalletType("PrivateKeyWallet", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UnsupportedWalletType[] $values() {
        return new UnsupportedWalletType[]{HardwareWallet, MPCWallet, PrivateKeyWallet};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UnsupportedWalletType> getEntries() {
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

    private UnsupportedWalletType(String str, int i) {
    }

    static {
        UnsupportedWalletType[] unsupportedWalletTypeArr$values = $values();
        $VALUES = unsupportedWalletTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(unsupportedWalletTypeArr$values);
        CREATOR = new Parcelable.Creator<UnsupportedWalletType>() { // from class: com.okinc.wallet.api.bean.UnsupportedWalletType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnsupportedWalletType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return UnsupportedWalletType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnsupportedWalletType[] newArray(int i) {
                return new UnsupportedWalletType[i];
            }
        };
    }

    public static UnsupportedWalletType valueOf(String str) {
        return (UnsupportedWalletType) Enum.valueOf(UnsupportedWalletType.class, str);
    }

    public static UnsupportedWalletType[] values() {
        return (UnsupportedWalletType[]) $VALUES.clone();
    }
}

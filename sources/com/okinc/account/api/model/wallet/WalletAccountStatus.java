package com.okinc.account.api.model.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class WalletAccountStatus implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WalletAccountStatus[] $VALUES;
    public static final Parcelable.Creator<WalletAccountStatus> CREATOR;
    public static final WalletAccountStatus NOT_AVAILABLE_ON_THIS_DEVICE = new WalletAccountStatus("NOT_AVAILABLE_ON_THIS_DEVICE", 0);
    public static final WalletAccountStatus BOUND_TO_ANOTHER_DEVICE = new WalletAccountStatus("BOUND_TO_ANOTHER_DEVICE", 1);
    public static final WalletAccountStatus NOT_BOUND = new WalletAccountStatus("NOT_BOUND", 2);
    public static final WalletAccountStatus BOUND = new WalletAccountStatus("BOUND", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WalletAccountStatus[] $values() {
        return new WalletAccountStatus[]{NOT_AVAILABLE_ON_THIS_DEVICE, BOUND_TO_ANOTHER_DEVICE, NOT_BOUND, BOUND};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WalletAccountStatus> getEntries() {
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

    private WalletAccountStatus(String str, int i) {
    }

    static {
        WalletAccountStatus[] walletAccountStatusArr$values = $values();
        $VALUES = walletAccountStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(walletAccountStatusArr$values);
        CREATOR = new Parcelable.Creator<WalletAccountStatus>() { // from class: com.okinc.account.api.model.wallet.WalletAccountStatus.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WalletAccountStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return WalletAccountStatus.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WalletAccountStatus[] newArray(int i) {
                return new WalletAccountStatus[i];
            }
        };
    }

    public static WalletAccountStatus valueOf(String str) {
        return (WalletAccountStatus) Enum.valueOf(WalletAccountStatus.class, str);
    }

    public static WalletAccountStatus[] values() {
        return (WalletAccountStatus[]) $VALUES.clone();
    }
}

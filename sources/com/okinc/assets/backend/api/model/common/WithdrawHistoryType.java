package com.okinc.assets.backend.api.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawHistoryType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WithdrawHistoryType[] $VALUES;
    public static final Parcelable.Creator<WithdrawHistoryType> CREATOR;
    private final String fromSource;
    public static final WithdrawHistoryType SELECT_CRYPTO_PAGE = new WithdrawHistoryType("SELECT_CRYPTO_PAGE", 0, "select_crypto_page");
    public static final WithdrawHistoryType ADDRESSWITHDRAW_PAGE = new WithdrawHistoryType("ADDRESSWITHDRAW_PAGE", 1, "addresswithdraw_page");
    public static final WithdrawHistoryType INNERWITHDRAW_PAGE = new WithdrawHistoryType("INNERWITHDRAW_PAGE", 2, "innerwithdraw_page");
    public static final WithdrawHistoryType OTHER = new WithdrawHistoryType("OTHER", 3, "other");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WithdrawHistoryType[] $values() {
        return new WithdrawHistoryType[]{SELECT_CRYPTO_PAGE, ADDRESSWITHDRAW_PAGE, INNERWITHDRAW_PAGE, OTHER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WithdrawHistoryType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromSource() {
        return this.fromSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private WithdrawHistoryType(String str, int i, String str2) {
        this.fromSource = str2;
    }

    static {
        WithdrawHistoryType[] withdrawHistoryTypeArr$values = $values();
        $VALUES = withdrawHistoryTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(withdrawHistoryTypeArr$values);
        CREATOR = new Parcelable.Creator<WithdrawHistoryType>() { // from class: com.okinc.assets.backend.api.model.common.WithdrawHistoryType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithdrawHistoryType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return WithdrawHistoryType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithdrawHistoryType[] newArray(int i) {
                return new WithdrawHistoryType[i];
            }
        };
    }

    public static WithdrawHistoryType valueOf(String str) {
        return (WithdrawHistoryType) Enum.valueOf(WithdrawHistoryType.class, str);
    }

    public static WithdrawHistoryType[] values() {
        return (WithdrawHistoryType[]) $VALUES.clone();
    }
}

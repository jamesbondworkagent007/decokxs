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
public final class RechargeHistoryType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RechargeHistoryType[] $VALUES;
    public static final Parcelable.Creator<RechargeHistoryType> CREATOR;
    private final String fromSource;
    public static final RechargeHistoryType ASSET_SELECT_CRYPTO_PAGE = new RechargeHistoryType("ASSET_SELECT_CRYPTO_PAGE", 0, "asset_select_crypto_page");
    public static final RechargeHistoryType ASSET_DEPOSIT_PAGE = new RechargeHistoryType("ASSET_DEPOSIT_PAGE", 1, "asset_deposit_page");
    public static final RechargeHistoryType OTHER = new RechargeHistoryType("OTHER", 2, "other");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RechargeHistoryType[] $values() {
        return new RechargeHistoryType[]{ASSET_SELECT_CRYPTO_PAGE, ASSET_DEPOSIT_PAGE, OTHER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RechargeHistoryType> getEntries() {
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

    private RechargeHistoryType(String str, int i, String str2) {
        this.fromSource = str2;
    }

    static {
        RechargeHistoryType[] rechargeHistoryTypeArr$values = $values();
        $VALUES = rechargeHistoryTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(rechargeHistoryTypeArr$values);
        CREATOR = new Parcelable.Creator<RechargeHistoryType>() { // from class: com.okinc.assets.backend.api.model.common.RechargeHistoryType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RechargeHistoryType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return RechargeHistoryType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RechargeHistoryType[] newArray(int i) {
                return new RechargeHistoryType[i];
            }
        };
    }

    public static RechargeHistoryType valueOf(String str) {
        return (RechargeHistoryType) Enum.valueOf(RechargeHistoryType.class, str);
    }

    public static RechargeHistoryType[] values() {
        return (RechargeHistoryType[]) $VALUES.clone();
    }
}

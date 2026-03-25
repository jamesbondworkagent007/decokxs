package com.okinc.fiat.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class CoinType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CoinType[] $VALUES;
    public static final CoinType COIN_TYPE_BUY = new CoinType("COIN_TYPE_BUY", 0);
    public static final CoinType COIN_TYPE_SELL = new CoinType("COIN_TYPE_SELL", 1);
    public static final Parcelable.Creator<CoinType> CREATOR;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CoinType[] $values() {
        return new CoinType[]{COIN_TYPE_BUY, COIN_TYPE_SELL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CoinType> getEntries() {
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

    private CoinType(String str, int i) {
    }

    static {
        CoinType[] coinTypeArr$values = $values();
        $VALUES = coinTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(coinTypeArr$values);
        CREATOR = new Parcelable.Creator<CoinType>() { // from class: com.okinc.fiat.api.bean.CoinType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CoinType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return CoinType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CoinType[] newArray(int i) {
                return new CoinType[i];
            }
        };
    }

    public static CoinType valueOf(String str) {
        return (CoinType) Enum.valueOf(CoinType.class, str);
    }

    public static CoinType[] values() {
        return (CoinType[]) $VALUES.clone();
    }
}

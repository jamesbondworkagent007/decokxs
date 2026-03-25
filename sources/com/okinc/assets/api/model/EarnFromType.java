package com.okinc.assets.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class EarnFromType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EarnFromType[] $VALUES;
    public static final Parcelable.Creator<EarnFromType> CREATOR;
    private final String from;
    public static final EarnFromType HOME_ALL = new EarnFromType("HOME_ALL", 0, "home_all");
    public static final EarnFromType HOME_COMMON = new EarnFromType("HOME_COMMON", 1, "home_common");
    public static final EarnFromType FUNDING_CRYPTO = new EarnFromType("FUNDING_CRYPTO", 2, "funding_crypto");
    public static final EarnFromType FUNDING_CASH = new EarnFromType("FUNDING_CASH", 3, "funding_cash");
    public static final EarnFromType TRADING_CRYPTO = new EarnFromType("TRADING_CRYPTO", 4, "trading_crypto");
    public static final EarnFromType TRADING_CASH = new EarnFromType("TRADING_CASH", 5, "trading_cash");
    public static final EarnFromType OTHER = new EarnFromType("OTHER", 6, "other");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EarnFromType[] $values() {
        return new EarnFromType[]{HOME_ALL, HOME_COMMON, FUNDING_CRYPTO, FUNDING_CASH, TRADING_CRYPTO, TRADING_CASH, OTHER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EarnFromType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private EarnFromType(String str, int i, String str2) {
        this.from = str2;
    }

    static {
        EarnFromType[] earnFromTypeArr$values = $values();
        $VALUES = earnFromTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(earnFromTypeArr$values);
        CREATOR = new Parcelable.Creator<EarnFromType>() { // from class: com.okinc.assets.api.model.EarnFromType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EarnFromType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return EarnFromType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EarnFromType[] newArray(int i) {
                return new EarnFromType[i];
            }
        };
    }

    public static EarnFromType valueOf(String str) {
        return (EarnFromType) Enum.valueOf(EarnFromType.class, str);
    }

    public static EarnFromType[] values() {
        return (EarnFromType[]) $VALUES.clone();
    }
}

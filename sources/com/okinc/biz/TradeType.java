package com.okinc.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class TradeType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TradeType[] $VALUES;
    public static final Parcelable.Creator<TradeType> CREATOR;
    public static final TradeType BUY_OPEN = new TradeType("BUY_OPEN", 0);
    public static final TradeType SELL_CLOSE = new TradeType("SELL_CLOSE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TradeType[] $values() {
        return new TradeType[]{BUY_OPEN, SELL_CLOSE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TradeType> getEntries() {
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

    private TradeType(String str, int i) {
    }

    static {
        TradeType[] tradeTypeArr$values = $values();
        $VALUES = tradeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tradeTypeArr$values);
        CREATOR = new Parcelable.Creator<TradeType>() { // from class: com.okinc.biz.TradeType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TradeType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return TradeType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TradeType[] newArray(int i) {
                return new TradeType[i];
            }
        };
    }

    public static TradeType valueOf(String str) {
        return (TradeType) Enum.valueOf(TradeType.class, str);
    }

    public static TradeType[] values() {
        return (TradeType[]) $VALUES.clone();
    }
}

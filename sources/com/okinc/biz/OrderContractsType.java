package com.okinc.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class OrderContractsType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OrderContractsType[] $VALUES;
    public static final Parcelable.Creator<OrderContractsType> CREATOR;
    public static final OrderContractsType UNDERLYING_ORDER = new OrderContractsType("UNDERLYING_ORDER", 0);
    public static final OrderContractsType ADVANCED_DELEGATION = new OrderContractsType("ADVANCED_DELEGATION", 1);
    public static final OrderContractsType LARGE_RESOLUTION = new OrderContractsType("LARGE_RESOLUTION", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OrderContractsType[] $values() {
        return new OrderContractsType[]{UNDERLYING_ORDER, ADVANCED_DELEGATION, LARGE_RESOLUTION};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OrderContractsType> getEntries() {
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

    private OrderContractsType(String str, int i) {
    }

    static {
        OrderContractsType[] orderContractsTypeArr$values = $values();
        $VALUES = orderContractsTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(orderContractsTypeArr$values);
        CREATOR = new Parcelable.Creator<OrderContractsType>() { // from class: com.okinc.biz.OrderContractsType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OrderContractsType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return OrderContractsType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OrderContractsType[] newArray(int i) {
                return new OrderContractsType[i];
            }
        };
    }

    public static OrderContractsType valueOf(String str) {
        return (OrderContractsType) Enum.valueOf(OrderContractsType.class, str);
    }

    public static OrderContractsType[] values() {
        return (OrderContractsType[]) $VALUES.clone();
    }
}

package com.okinc.business.dex.trade.order.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class OrderListPageType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OrderListPageType[] $VALUES;
    public static final Parcelable.Creator<OrderListPageType> CREATOR;
    public static final OrderListPageType OpenOrder = new OrderListPageType("OpenOrder", 0);
    public static final OrderListPageType History = new OrderListPageType("History", 1);
    public static final OrderListPageType Trades = new OrderListPageType("Trades", 2);
    public static final OrderListPageType Bridge = new OrderListPageType("Bridge", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OrderListPageType[] $values() {
        return new OrderListPageType[]{OpenOrder, History, Trades, Bridge};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OrderListPageType> getEntries() {
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

    private OrderListPageType(String str, int i) {
    }

    static {
        OrderListPageType[] orderListPageTypeArr$values = $values();
        $VALUES = orderListPageTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(orderListPageTypeArr$values);
        CREATOR = new Parcelable.Creator<OrderListPageType>() { // from class: com.okinc.business.dex.trade.order.domain.model.OrderListPageType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OrderListPageType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return OrderListPageType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OrderListPageType[] newArray(int i) {
                return new OrderListPageType[i];
            }
        };
    }

    public static OrderListPageType valueOf(String str) {
        return (OrderListPageType) Enum.valueOf(OrderListPageType.class, str);
    }

    public static OrderListPageType[] values() {
        return (OrderListPageType[]) $VALUES.clone();
    }
}

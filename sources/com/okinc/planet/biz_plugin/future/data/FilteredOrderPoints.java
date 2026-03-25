package com.okinc.planet.biz_plugin.future.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.tradeshare.api.TradeHisPositionHisOrderPlanetBean;
import com.okinc.tradeshare.api.TradeHisPositionHisOrderPlanetBean$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class FilteredOrderPoints implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<TradeHisPositionHisOrderPlanetBean> buyOrders;
    private final List<TradeHisPositionHisOrderPlanetBean> sellOrders;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FilteredOrderPoints> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<FilteredOrderPoints> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilteredOrderPoints createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(FilteredOrderPoints.class.getClassLoader()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(parcel.readParcelable(FilteredOrderPoints.class.getClassLoader()));
            }
            return new FilteredOrderPoints(arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilteredOrderPoints[] newArray(int i) {
            return new FilteredOrderPoints[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.planet.biz_plugin.future.data.FilteredOrderPoints */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilteredOrderPoints copy$default(FilteredOrderPoints filteredOrderPoints, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = filteredOrderPoints.buyOrders;
        }
        if ((i & 2) != 0) {
            list2 = filteredOrderPoints.sellOrders;
        }
        return filteredOrderPoints.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeHisPositionHisOrderPlanetBean> component1() {
        return this.buyOrders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeHisPositionHisOrderPlanetBean> component2() {
        return this.sellOrders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FilteredOrderPoints copy(@NotNull List<TradeHisPositionHisOrderPlanetBean> list, @NotNull List<TradeHisPositionHisOrderPlanetBean> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new FilteredOrderPoints(list, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilteredOrderPoints)) {
            return false;
        }
        FilteredOrderPoints filteredOrderPoints = (FilteredOrderPoints) obj;
        return Intrinsics.EZpvd(this.buyOrders, filteredOrderPoints.buyOrders) && Intrinsics.EZpvd(this.sellOrders, filteredOrderPoints.sellOrders);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeHisPositionHisOrderPlanetBean> getBuyOrders() {
        return this.buyOrders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeHisPositionHisOrderPlanetBean> getSellOrders() {
        return this.sellOrders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.buyOrders.hashCode() * 31) + this.sellOrders.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FilteredOrderPoints(buyOrders=" + this.buyOrders + ", sellOrders=" + this.sellOrders + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<TradeHisPositionHisOrderPlanetBean> list = this.buyOrders;
        parcel.writeInt(list.size());
        Iterator<TradeHisPositionHisOrderPlanetBean> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        List<TradeHisPositionHisOrderPlanetBean> list2 = this.sellOrders;
        parcel.writeInt(list2.size());
        Iterator<TradeHisPositionHisOrderPlanetBean> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_plugin.future.data.FilteredOrderPoints.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FilteredOrderPoints> serializer() {
            return FilteredOrderPoints$$serializer.INSTANCE;
        }
    }

    static {
        TradeHisPositionHisOrderPlanetBean$$serializer tradeHisPositionHisOrderPlanetBean$$serializer = TradeHisPositionHisOrderPlanetBean$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(tradeHisPositionHisOrderPlanetBean$$serializer), new ArrayListSerializer(tradeHisPositionHisOrderPlanetBean$$serializer)};
    }

    public /* synthetic */ FilteredOrderPoints(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, FilteredOrderPoints$$serializer.INSTANCE.getDescriptor());
        }
        this.buyOrders = list;
        this.sellOrders = list2;
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(FilteredOrderPoints filteredOrderPoints, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], filteredOrderPoints.buyOrders);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], filteredOrderPoints.sellOrders);
    }

    public FilteredOrderPoints(@NotNull List<TradeHisPositionHisOrderPlanetBean> list, @NotNull List<TradeHisPositionHisOrderPlanetBean> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.buyOrders = list;
        this.sellOrders = list2;
    }
}

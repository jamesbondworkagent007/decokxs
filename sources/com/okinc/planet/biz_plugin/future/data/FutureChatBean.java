package com.okinc.planet.biz_plugin.future.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.tradeshare.api.TradeHisPositionHisOrderPlanetBean;
import com.okinc.tradeshare.api.TradeHisPositionHisOrderPlanetBean$$serializer;
import com.okinc.tradeshare.api.TradeTickerChartEntry;
import com.okinc.tradeshare.api.TradeTickerChartEntry$$serializer;
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
public final class FutureChatBean implements Parcelable {
    private final List<TradeHisPositionHisOrderPlanetBean> buySellMarkerList;
    private final List<TradeTickerChartEntry> klineList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FutureChatBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(TradeTickerChartEntry$$serializer.INSTANCE), new ArrayListSerializer(TradeHisPositionHisOrderPlanetBean$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<FutureChatBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FutureChatBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(FutureChatBean.class.getClassLoader()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(parcel.readParcelable(FutureChatBean.class.getClassLoader()));
            }
            return new FutureChatBean(arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FutureChatBean[] newArray(int i) {
            return new FutureChatBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.planet.biz_plugin.future.data.FutureChatBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FutureChatBean copy$default(FutureChatBean futureChatBean, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = futureChatBean.klineList;
        }
        if ((i & 2) != 0) {
            list2 = futureChatBean.buySellMarkerList;
        }
        return futureChatBean.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeTickerChartEntry> component1() {
        return this.klineList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeHisPositionHisOrderPlanetBean> component2() {
        return this.buySellMarkerList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FutureChatBean copy(@NotNull List<TradeTickerChartEntry> list, @NotNull List<TradeHisPositionHisOrderPlanetBean> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new FutureChatBean(list, list2);
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
        if (!(obj instanceof FutureChatBean)) {
            return false;
        }
        FutureChatBean futureChatBean = (FutureChatBean) obj;
        return Intrinsics.EZpvd(this.klineList, futureChatBean.klineList) && Intrinsics.EZpvd(this.buySellMarkerList, futureChatBean.buySellMarkerList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeHisPositionHisOrderPlanetBean> getBuySellMarkerList() {
        return this.buySellMarkerList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeTickerChartEntry> getKlineList() {
        return this.klineList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.klineList.hashCode() * 31) + this.buySellMarkerList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FutureChatBean(klineList=" + this.klineList + ", buySellMarkerList=" + this.buySellMarkerList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<TradeTickerChartEntry> list = this.klineList;
        parcel.writeInt(list.size());
        Iterator<TradeTickerChartEntry> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        List<TradeHisPositionHisOrderPlanetBean> list2 = this.buySellMarkerList;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_plugin.future.data.FutureChatBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FutureChatBean> serializer() {
            return FutureChatBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FutureChatBean(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, FutureChatBean$$serializer.INSTANCE.getDescriptor());
        }
        this.klineList = list;
        this.buySellMarkerList = list2;
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(FutureChatBean futureChatBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], futureChatBean.klineList);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], futureChatBean.buySellMarkerList);
    }

    public FutureChatBean(@NotNull List<TradeTickerChartEntry> list, @NotNull List<TradeHisPositionHisOrderPlanetBean> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.klineList = list;
        this.buySellMarkerList = list2;
    }
}

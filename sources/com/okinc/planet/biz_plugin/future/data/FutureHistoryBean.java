package com.okinc.planet.biz_plugin.future.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.tradeshare.api.TradeHisPositionHisOrderPlanetBean;
import com.okinc.tradeshare.api.TradeHisPositionHisOrderPlanetBean$$serializer;
import com.okinc.tradeshare.api.TradeHisPositionPlanetBean;
import com.okinc.tradeshare.api.TradeHisPositionPlanetBean$$serializer;
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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class FutureHistoryBean implements Parcelable {
    private final List<TradeHisPositionHisOrderPlanetBean> buySellMarkerList;
    private final boolean isLoadingChatData;
    private final boolean isSelect;
    private final List<TradeTickerChartEntry> klineList;
    private final String pluginDataTime;
    private final TradeHisPositionPlanetBean tradeHisPositionPlanetBean;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FutureHistoryBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(TradeTickerChartEntry$$serializer.INSTANCE), new ArrayListSerializer(TradeHisPositionHisOrderPlanetBean$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<FutureHistoryBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FutureHistoryBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            TradeHisPositionPlanetBean tradeHisPositionPlanetBean = (TradeHisPositionPlanetBean) parcel.readParcelable(FutureHistoryBean.class.getClassLoader());
            boolean z = parcel.readInt() != 0;
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(FutureHistoryBean.class.getClassLoader()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(parcel.readParcelable(FutureHistoryBean.class.getClassLoader()));
            }
            return new FutureHistoryBean(tradeHisPositionPlanetBean, z, string, arrayList, arrayList2, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FutureHistoryBean[] newArray(int i) {
            return new FutureHistoryBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.planet.biz_plugin.future.data.FutureHistoryBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FutureHistoryBean copy$default(FutureHistoryBean futureHistoryBean, TradeHisPositionPlanetBean tradeHisPositionPlanetBean, boolean z, String str, List list, List list2, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            tradeHisPositionPlanetBean = futureHistoryBean.tradeHisPositionPlanetBean;
        }
        if ((i & 2) != 0) {
            z = futureHistoryBean.isSelect;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            str = futureHistoryBean.pluginDataTime;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            list = futureHistoryBean.klineList;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = futureHistoryBean.buySellMarkerList;
        }
        List list4 = list2;
        if ((i & 32) != 0) {
            z2 = futureHistoryBean.isLoadingChatData;
        }
        return futureHistoryBean.copy(tradeHisPositionPlanetBean, z3, str2, list3, list4, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeHisPositionPlanetBean component1() {
        return this.tradeHisPositionPlanetBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pluginDataTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeTickerChartEntry> component4() {
        return this.klineList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeHisPositionHisOrderPlanetBean> component5() {
        return this.buySellMarkerList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isLoadingChatData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FutureHistoryBean copy(@NotNull TradeHisPositionPlanetBean tradeHisPositionPlanetBean, boolean z, @NotNull String str, @NotNull List<TradeTickerChartEntry> list, @NotNull List<TradeHisPositionHisOrderPlanetBean> list2, boolean z2) {
        Intrinsics.checkNotNullParameter(tradeHisPositionPlanetBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new FutureHistoryBean(tradeHisPositionPlanetBean, z, str, list, list2, z2);
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
        if (!(obj instanceof FutureHistoryBean)) {
            return false;
        }
        FutureHistoryBean futureHistoryBean = (FutureHistoryBean) obj;
        return Intrinsics.EZpvd(this.tradeHisPositionPlanetBean, futureHistoryBean.tradeHisPositionPlanetBean) && this.isSelect == futureHistoryBean.isSelect && Intrinsics.EZpvd((Object) this.pluginDataTime, (Object) futureHistoryBean.pluginDataTime) && Intrinsics.EZpvd(this.klineList, futureHistoryBean.klineList) && Intrinsics.EZpvd(this.buySellMarkerList, futureHistoryBean.buySellMarkerList) && this.isLoadingChatData == futureHistoryBean.isLoadingChatData;
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
    public final String getPluginDataTime() {
        return this.pluginDataTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeHisPositionPlanetBean getTradeHisPositionPlanetBean() {
        return this.tradeHisPositionPlanetBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.tradeHisPositionPlanetBean.hashCode() * 31) + Boolean.hashCode(this.isSelect)) * 31) + this.pluginDataTime.hashCode()) * 31) + this.klineList.hashCode()) * 31) + this.buySellMarkerList.hashCode()) * 31) + Boolean.hashCode(this.isLoadingChatData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLoadingChatData() {
        return this.isLoadingChatData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelect() {
        return this.isSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FutureHistoryBean(tradeHisPositionPlanetBean=" + this.tradeHisPositionPlanetBean + ", isSelect=" + this.isSelect + ", pluginDataTime=" + this.pluginDataTime + ", klineList=" + this.klineList + ", buySellMarkerList=" + this.buySellMarkerList + ", isLoadingChatData=" + this.isLoadingChatData + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.tradeHisPositionPlanetBean, i);
        parcel.writeInt(this.isSelect ? 1 : 0);
        parcel.writeString(this.pluginDataTime);
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
        parcel.writeInt(this.isLoadingChatData ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_plugin.future.data.FutureHistoryBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FutureHistoryBean> serializer() {
            return FutureHistoryBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FutureHistoryBean(int i, TradeHisPositionPlanetBean tradeHisPositionPlanetBean, boolean z, String str, List list, List list2, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, FutureHistoryBean$$serializer.INSTANCE.getDescriptor());
        }
        this.tradeHisPositionPlanetBean = tradeHisPositionPlanetBean;
        if ((i & 2) == 0) {
            this.isSelect = false;
        } else {
            this.isSelect = z;
        }
        if ((i & 4) == 0) {
            this.pluginDataTime = String.valueOf(System.currentTimeMillis());
        } else {
            this.pluginDataTime = str;
        }
        if ((i & 8) == 0) {
            this.klineList = yDY.AhwBna();
        } else {
            this.klineList = list;
        }
        if ((i & 16) == 0) {
            this.buySellMarkerList = yDY.AhwBna();
        } else {
            this.buySellMarkerList = list2;
        }
        if ((i & 32) == 0) {
            this.isLoadingChatData = false;
        } else {
            this.isLoadingChatData = z2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [11=4] */
    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(FutureHistoryBean futureHistoryBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, TradeHisPositionPlanetBean$$serializer.INSTANCE, futureHistoryBean.tradeHisPositionPlanetBean);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || futureHistoryBean.isSelect) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, futureHistoryBean.isSelect);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) futureHistoryBean.pluginDataTime, (Object) String.valueOf(System.currentTimeMillis()))) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, futureHistoryBean.pluginDataTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(futureHistoryBean.klineList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], futureHistoryBean.klineList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(futureHistoryBean.buySellMarkerList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], futureHistoryBean.buySellMarkerList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || futureHistoryBean.isLoadingChatData) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, futureHistoryBean.isLoadingChatData);
        }
    }

    public FutureHistoryBean(@NotNull TradeHisPositionPlanetBean tradeHisPositionPlanetBean, boolean z, @NotNull String str, @NotNull List<TradeTickerChartEntry> list, @NotNull List<TradeHisPositionHisOrderPlanetBean> list2, boolean z2) {
        Intrinsics.checkNotNullParameter(tradeHisPositionPlanetBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.tradeHisPositionPlanetBean = tradeHisPositionPlanetBean;
        this.isSelect = z;
        this.pluginDataTime = str;
        this.klineList = list;
        this.buySellMarkerList = list2;
        this.isLoadingChatData = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0037: CONSTRUCTOR 
  (r7v0 com.okinc.tradeshare.api.TradeHisPositionPlanetBean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: INVOKE (wrap:long:0x000c: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:17)) STATIC call: java.lang.String.valueOf(long):java.lang.String A[MD:(long):java.lang.String (c), WRAPPED] (LINE:17)) : (r9v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:18)) : (r10v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0020: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0024: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:19)) : (r11v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002a: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r12v0 boolean) : false)
 A[MD:(com.okinc.tradeshare.api.TradeHisPositionPlanetBean, boolean, java.lang.String, java.util.List<com.okinc.tradeshare.api.TradeTickerChartEntry>, java.util.List<com.okinc.tradeshare.api.TradeHisPositionHisOrderPlanetBean>, boolean):void (m)] (LINE:14) call: com.okinc.planet.biz_plugin.future.data.FutureHistoryBean.<init>(com.okinc.tradeshare.api.TradeHisPositionPlanetBean, boolean, java.lang.String, java.util.List, java.util.List, boolean):void type: THIS */
    public /* synthetic */ FutureHistoryBean(TradeHisPositionPlanetBean tradeHisPositionPlanetBean, boolean z, String str, List list, List list2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tradeHisPositionPlanetBean, (i & 2) != 0 ? false : z, (i & 4) != 0 ? String.valueOf(System.currentTimeMillis()) : str, (i & 8) != 0 ? yDY.AhwBna() : list, (i & 16) != 0 ? yDY.AhwBna() : list2, (i & 32) == 0 ? z2 : false);
    }
}

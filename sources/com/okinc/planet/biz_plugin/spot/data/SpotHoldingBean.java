package com.okinc.planet.biz_plugin.spot.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.tradeshare.api.TradeAssetPlanetBean;
import com.okinc.tradeshare.api.TradeAssetPlanetBean$$serializer;
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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class SpotHoldingBean implements Parcelable {
    private final boolean isLoadingChatData;
    private final boolean isSelect;
    private final List<TradeTickerChartEntry> klineList;
    private final String pluginDataTime;
    private final TradeAssetPlanetBean tradeAssetPlanetBean;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SpotHoldingBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(TradeTickerChartEntry$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<SpotHoldingBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotHoldingBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            TradeAssetPlanetBean tradeAssetPlanetBean = (TradeAssetPlanetBean) parcel.readParcelable(SpotHoldingBean.class.getClassLoader());
            boolean z = parcel.readInt() != 0;
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(SpotHoldingBean.class.getClassLoader()));
            }
            return new SpotHoldingBean(tradeAssetPlanetBean, z, string, arrayList, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotHoldingBean[] newArray(int i) {
            return new SpotHoldingBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpotHoldingBean copy$default(SpotHoldingBean spotHoldingBean, TradeAssetPlanetBean tradeAssetPlanetBean, boolean z, String str, List list, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            tradeAssetPlanetBean = spotHoldingBean.tradeAssetPlanetBean;
        }
        if ((i & 2) != 0) {
            z = spotHoldingBean.isSelect;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            str = spotHoldingBean.pluginDataTime;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            list = spotHoldingBean.klineList;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            z2 = spotHoldingBean.isLoadingChatData;
        }
        return spotHoldingBean.copy(tradeAssetPlanetBean, z3, str2, list2, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeAssetPlanetBean component1() {
        return this.tradeAssetPlanetBean;
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
    public final boolean component5() {
        return this.isLoadingChatData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotHoldingBean copy(@NotNull TradeAssetPlanetBean tradeAssetPlanetBean, boolean z, @NotNull String str, @NotNull List<TradeTickerChartEntry> list, boolean z2) {
        Intrinsics.checkNotNullParameter(tradeAssetPlanetBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SpotHoldingBean(tradeAssetPlanetBean, z, str, list, z2);
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
        if (!(obj instanceof SpotHoldingBean)) {
            return false;
        }
        SpotHoldingBean spotHoldingBean = (SpotHoldingBean) obj;
        return Intrinsics.EZpvd(this.tradeAssetPlanetBean, spotHoldingBean.tradeAssetPlanetBean) && this.isSelect == spotHoldingBean.isSelect && Intrinsics.EZpvd((Object) this.pluginDataTime, (Object) spotHoldingBean.pluginDataTime) && Intrinsics.EZpvd(this.klineList, spotHoldingBean.klineList) && this.isLoadingChatData == spotHoldingBean.isLoadingChatData;
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
    public final TradeAssetPlanetBean getTradeAssetPlanetBean() {
        return this.tradeAssetPlanetBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.tradeAssetPlanetBean.hashCode() * 31) + Boolean.hashCode(this.isSelect)) * 31) + this.pluginDataTime.hashCode()) * 31) + this.klineList.hashCode()) * 31) + Boolean.hashCode(this.isLoadingChatData);
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
        return "SpotHoldingBean(tradeAssetPlanetBean=" + this.tradeAssetPlanetBean + ", isSelect=" + this.isSelect + ", pluginDataTime=" + this.pluginDataTime + ", klineList=" + this.klineList + ", isLoadingChatData=" + this.isLoadingChatData + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.tradeAssetPlanetBean, i);
        parcel.writeInt(this.isSelect ? 1 : 0);
        parcel.writeString(this.pluginDataTime);
        List<TradeTickerChartEntry> list = this.klineList;
        parcel.writeInt(list.size());
        Iterator<TradeTickerChartEntry> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeInt(this.isLoadingChatData ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotHoldingBean> serializer() {
            return SpotHoldingBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotHoldingBean(int i, TradeAssetPlanetBean tradeAssetPlanetBean, boolean z, String str, List list, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (9 != (i & 9)) {
            PluginExceptionsKt.throwMissingFieldException(i, 9, SpotHoldingBean$$serializer.INSTANCE.getDescriptor());
        }
        this.tradeAssetPlanetBean = tradeAssetPlanetBean;
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
        this.klineList = list;
        if ((i & 16) == 0) {
            this.isLoadingChatData = false;
        } else {
            this.isLoadingChatData = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(SpotHoldingBean spotHoldingBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, TradeAssetPlanetBean$$serializer.INSTANCE, spotHoldingBean.tradeAssetPlanetBean);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || spotHoldingBean.isSelect) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, spotHoldingBean.isSelect);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) spotHoldingBean.pluginDataTime, (Object) String.valueOf(System.currentTimeMillis()))) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, spotHoldingBean.pluginDataTime);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], spotHoldingBean.klineList);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || spotHoldingBean.isLoadingChatData) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, spotHoldingBean.isLoadingChatData);
        }
    }

    public SpotHoldingBean(@NotNull TradeAssetPlanetBean tradeAssetPlanetBean, boolean z, @NotNull String str, @NotNull List<TradeTickerChartEntry> list, boolean z2) {
        Intrinsics.checkNotNullParameter(tradeAssetPlanetBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.tradeAssetPlanetBean = tradeAssetPlanetBean;
        this.isSelect = z;
        this.pluginDataTime = str;
        this.klineList = list;
        this.isLoadingChatData = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 com.okinc.tradeshare.api.TradeAssetPlanetBean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:java.lang.String:0x0014: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0010: INVOKE (wrap:long:0x000c: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:16)) STATIC call: java.lang.String.valueOf(long):java.lang.String A[MD:(long):java.lang.String (c), WRAPPED] (LINE:16)) : (r10v0 java.lang.String))
  (r11v0 java.util.List)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
 A[MD:(com.okinc.tradeshare.api.TradeAssetPlanetBean, boolean, java.lang.String, java.util.List<com.okinc.tradeshare.api.TradeTickerChartEntry>, boolean):void (m)] (LINE:13) call: com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean.<init>(com.okinc.tradeshare.api.TradeAssetPlanetBean, boolean, java.lang.String, java.util.List, boolean):void type: THIS */
    public /* synthetic */ SpotHoldingBean(TradeAssetPlanetBean tradeAssetPlanetBean, boolean z, String str, List list, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tradeAssetPlanetBean, (i & 2) != 0 ? false : z, (i & 4) != 0 ? String.valueOf(System.currentTimeMillis()) : str, list, (i & 16) != 0 ? false : z2);
    }
}

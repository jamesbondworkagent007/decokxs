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
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import o.C43284rmQ;
import o.C56391yDq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PluginSpotMetadata implements Parcelable {
    public static final int $stable = 0;
    private final List<TradeTickerChartEntry> chartTicker;
    private final String coinName;
    private final String displayType;
    private final String pluginDataTime;
    private final String pnl;
    private final String pnlRatio;
    private final TradeAssetPlanetBean spotInfo;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PluginSpotMetadata> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(TradeTickerChartEntry$$serializer.INSTANCE), null, null};
    private static final PluginSpotMetadata Empty = new PluginSpotMetadata((String) null, (String) null, (String) null, (String) null, (List) null, (TradeAssetPlanetBean) null, (String) null, 127, (DefaultConstructorMarker) null);

    public static final class Creator implements Parcelable.Creator<PluginSpotMetadata> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PluginSpotMetadata createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(parcel.readParcelable(PluginSpotMetadata.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new PluginSpotMetadata(string, string2, string3, string4, arrayList, (TradeAssetPlanetBean) parcel.readParcelable(PluginSpotMetadata.class.getClassLoader()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PluginSpotMetadata[] newArray(int i) {
            return new PluginSpotMetadata[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PluginSpotMetadata() {
        this((String) null, (String) null, (String) null, (String) null, (List) null, (TradeAssetPlanetBean) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.planet.biz_plugin.spot.data.PluginSpotMetadata */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PluginSpotMetadata copy$default(PluginSpotMetadata pluginSpotMetadata, String str, String str2, String str3, String str4, List list, TradeAssetPlanetBean tradeAssetPlanetBean, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pluginSpotMetadata.coinName;
        }
        if ((i & 2) != 0) {
            str2 = pluginSpotMetadata.pluginDataTime;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = pluginSpotMetadata.pnl;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = pluginSpotMetadata.pnlRatio;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            list = pluginSpotMetadata.chartTicker;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            tradeAssetPlanetBean = pluginSpotMetadata.spotInfo;
        }
        TradeAssetPlanetBean tradeAssetPlanetBean2 = tradeAssetPlanetBean;
        if ((i & 64) != 0) {
            str5 = pluginSpotMetadata.displayType;
        }
        return pluginSpotMetadata.copy(str, str6, str7, str8, list2, tradeAssetPlanetBean2, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pluginDataTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeTickerChartEntry> component5() {
        return this.chartTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeAssetPlanetBean component6() {
        return this.spotInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.displayType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PluginSpotMetadata copy(String str, String str2, String str3, String str4, List<TradeTickerChartEntry> list, TradeAssetPlanetBean tradeAssetPlanetBean, String str5) {
        return new PluginSpotMetadata(str, str2, str3, str4, list, tradeAssetPlanetBean, str5);
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
        if (!(obj instanceof PluginSpotMetadata)) {
            return false;
        }
        PluginSpotMetadata pluginSpotMetadata = (PluginSpotMetadata) obj;
        return Intrinsics.EZpvd((Object) this.coinName, (Object) pluginSpotMetadata.coinName) && Intrinsics.EZpvd((Object) this.pluginDataTime, (Object) pluginSpotMetadata.pluginDataTime) && Intrinsics.EZpvd((Object) this.pnl, (Object) pluginSpotMetadata.pnl) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) pluginSpotMetadata.pnlRatio) && Intrinsics.EZpvd(this.chartTicker, pluginSpotMetadata.chartTicker) && Intrinsics.EZpvd(this.spotInfo, pluginSpotMetadata.spotInfo) && Intrinsics.EZpvd((Object) this.displayType, (Object) pluginSpotMetadata.displayType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeTickerChartEntry> getChartTicker() {
        return this.chartTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinName() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayType() {
        return this.displayType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPluginDataTime() {
        return this.pluginDataTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeAssetPlanetBean getSpotInfo() {
        return this.spotInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.coinName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.pluginDataTime;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.pnl;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.pnlRatio;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        List<TradeTickerChartEntry> list = this.chartTicker;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        TradeAssetPlanetBean tradeAssetPlanetBean = this.spotInfo;
        int iHashCode6 = tradeAssetPlanetBean == null ? 0 : tradeAssetPlanetBean.hashCode();
        String str5 = this.displayType;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PluginSpotMetadata(coinName=" + this.coinName + ", pluginDataTime=" + this.pluginDataTime + ", pnl=" + this.pnl + ", pnlRatio=" + this.pnlRatio + ", chartTicker=" + this.chartTicker + ", spotInfo=" + this.spotInfo + ", displayType=" + this.displayType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.coinName);
        parcel.writeString(this.pluginDataTime);
        parcel.writeString(this.pnl);
        parcel.writeString(this.pnlRatio);
        List<TradeTickerChartEntry> list = this.chartTicker;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<TradeTickerChartEntry> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
            }
        }
        parcel.writeParcelable(this.spotInfo, i);
        parcel.writeString(this.displayType);
    }

    public /* synthetic */ PluginSpotMetadata(int i, String str, String str2, String str3, String str4, List list, TradeAssetPlanetBean tradeAssetPlanetBean, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinName = null;
        } else {
            this.coinName = str;
        }
        if ((i & 2) == 0) {
            this.pluginDataTime = null;
        } else {
            this.pluginDataTime = str2;
        }
        if ((i & 4) == 0) {
            this.pnl = null;
        } else {
            this.pnl = str3;
        }
        if ((i & 8) == 0) {
            this.pnlRatio = null;
        } else {
            this.pnlRatio = str4;
        }
        if ((i & 16) == 0) {
            this.chartTicker = null;
        } else {
            this.chartTicker = list;
        }
        if ((i & 32) == 0) {
            this.spotInfo = null;
        } else {
            this.spotInfo = tradeAssetPlanetBean;
        }
        if ((i & 64) == 0) {
            this.displayType = null;
        } else {
            this.displayType = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(PluginSpotMetadata pluginSpotMetadata, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || pluginSpotMetadata.coinName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, pluginSpotMetadata.coinName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || pluginSpotMetadata.pluginDataTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, pluginSpotMetadata.pluginDataTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || pluginSpotMetadata.pnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, pluginSpotMetadata.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || pluginSpotMetadata.pnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, pluginSpotMetadata.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || pluginSpotMetadata.chartTicker != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], pluginSpotMetadata.chartTicker);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || pluginSpotMetadata.spotInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, TradeAssetPlanetBean$$serializer.INSTANCE, pluginSpotMetadata.spotInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && pluginSpotMetadata.displayType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, pluginSpotMetadata.displayType);
    }

    public PluginSpotMetadata(String str, String str2, String str3, String str4, List<TradeTickerChartEntry> list, TradeAssetPlanetBean tradeAssetPlanetBean, String str5) {
        this.coinName = str;
        this.pluginDataTime = str2;
        this.pnl = str3;
        this.pnlRatio = str4;
        this.chartTicker = list;
        this.spotInfo = tradeAssetPlanetBean;
        this.displayType = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r11v0 java.util.List))
  (wrap:com.okinc.tradeshare.api.TradeAssetPlanetBean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.tradeshare.api.TradeAssetPlanetBean) : (r12v0 com.okinc.tradeshare.api.TradeAssetPlanetBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.tradeshare.api.TradeTickerChartEntry>, com.okinc.tradeshare.api.TradeAssetPlanetBean, java.lang.String):void (m)] (LINE:24) call: com.okinc.planet.biz_plugin.spot.data.PluginSpotMetadata.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.tradeshare.api.TradeAssetPlanetBean, java.lang.String):void type: THIS */
    public /* synthetic */ PluginSpotMetadata(String str, String str2, String str3, String str4, List list, TradeAssetPlanetBean tradeAssetPlanetBean, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : tradeAssetPlanetBean, (i & 64) != 0 ? null : str5);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_plugin.spot.data.PluginSpotMetadata.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PluginSpotMetadata> serializer() {
            return PluginSpotMetadata$$serializer.INSTANCE;
        }

        public final PluginSpotMetadata AEQbTJ() {
            return PluginSpotMetadata.Empty;
        }

        public final PluginSpotMetadata OLrzqt(@NotNull String str) {
            Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(str, "");
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl((PluginSpotMetadata) C43284rmQ.KWHzl().decodeFromString(serializer(), str));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            PluginSpotMetadata pluginSpotMetadataAEQbTJ = AEQbTJ();
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = pluginSpotMetadataAEQbTJ;
            }
            return (PluginSpotMetadata) objM7377constructorimpl;
        }
    }

    public final String getInJsonString() {
        Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            Json jsonKWHzl = C43284rmQ.KWHzl();
            jsonKWHzl.getSerializersModule();
            objM7377constructorimpl = Result.m7377constructorimpl(jsonKWHzl.encodeToString(Companion.serializer(), this));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = "";
        }
        return (String) objM7377constructorimpl;
    }
}

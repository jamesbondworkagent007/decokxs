package com.okinc.planet.biz_plugin.future.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.tradeshare.api.TradeHisPositionHisOrderPlanetBean;
import com.okinc.tradeshare.api.TradeHisPositionHisOrderPlanetBean$$serializer;
import com.okinc.tradeshare.api.TradeHisPositionPlanetBean;
import com.okinc.tradeshare.api.TradeHisPositionPlanetBean$$serializer;
import com.okinc.tradeshare.api.TradePositionPlanetBean;
import com.okinc.tradeshare.api.TradePositionPlanetBean$$serializer;
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
public final class PluginFuturesMetadata implements Parcelable {
    public static final int $stable = 0;
    private final List<TradeHisPositionHisOrderPlanetBean> chartMarker;
    private final List<TradeTickerChartEntry> chartTicker;
    private final String coinName;
    private final String displayType;
    private final TradePositionPlanetBean futuresCurrentInfo;
    private final TradeHisPositionPlanetBean futuresHistoryInfo;
    private final String futuresType;
    private final String pluginDataTime;
    private final String pnl;
    private final String pnlRatio;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PluginFuturesMetadata> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(TradeTickerChartEntry$$serializer.INSTANCE), new ArrayListSerializer(TradeHisPositionHisOrderPlanetBean$$serializer.INSTANCE), null, null, null};
    private static final PluginFuturesMetadata Empty = new PluginFuturesMetadata((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (TradePositionPlanetBean) null, (TradeHisPositionPlanetBean) null, (String) null, 1023, (DefaultConstructorMarker) null);

    public static final class Creator implements Parcelable.Creator<PluginFuturesMetadata> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PluginFuturesMetadata createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(PluginFuturesMetadata.class.getClassLoader()));
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(PluginFuturesMetadata.class.getClassLoader()));
                }
            }
            return new PluginFuturesMetadata(string, string2, string3, string4, string5, arrayList, arrayList2, (TradePositionPlanetBean) parcel.readParcelable(PluginFuturesMetadata.class.getClassLoader()), (TradeHisPositionPlanetBean) parcel.readParcelable(PluginFuturesMetadata.class.getClassLoader()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PluginFuturesMetadata[] newArray(int i) {
            return new PluginFuturesMetadata[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PluginFuturesMetadata() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (TradePositionPlanetBean) null, (TradeHisPositionPlanetBean) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.displayType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.pluginDataTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.futuresType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeTickerChartEntry> component6() {
        return this.chartTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeHisPositionHisOrderPlanetBean> component7() {
        return this.chartMarker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradePositionPlanetBean component8() {
        return this.futuresCurrentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeHisPositionPlanetBean component9() {
        return this.futuresHistoryInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PluginFuturesMetadata copy(String str, String str2, String str3, String str4, String str5, List<TradeTickerChartEntry> list, List<TradeHisPositionHisOrderPlanetBean> list2, TradePositionPlanetBean tradePositionPlanetBean, TradeHisPositionPlanetBean tradeHisPositionPlanetBean, String str6) {
        return new PluginFuturesMetadata(str, str2, str3, str4, str5, list, list2, tradePositionPlanetBean, tradeHisPositionPlanetBean, str6);
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
        if (!(obj instanceof PluginFuturesMetadata)) {
            return false;
        }
        PluginFuturesMetadata pluginFuturesMetadata = (PluginFuturesMetadata) obj;
        return Intrinsics.EZpvd((Object) this.coinName, (Object) pluginFuturesMetadata.coinName) && Intrinsics.EZpvd((Object) this.pnl, (Object) pluginFuturesMetadata.pnl) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) pluginFuturesMetadata.pnlRatio) && Intrinsics.EZpvd((Object) this.pluginDataTime, (Object) pluginFuturesMetadata.pluginDataTime) && Intrinsics.EZpvd((Object) this.futuresType, (Object) pluginFuturesMetadata.futuresType) && Intrinsics.EZpvd(this.chartTicker, pluginFuturesMetadata.chartTicker) && Intrinsics.EZpvd(this.chartMarker, pluginFuturesMetadata.chartMarker) && Intrinsics.EZpvd(this.futuresCurrentInfo, pluginFuturesMetadata.futuresCurrentInfo) && Intrinsics.EZpvd(this.futuresHistoryInfo, pluginFuturesMetadata.futuresHistoryInfo) && Intrinsics.EZpvd((Object) this.displayType, (Object) pluginFuturesMetadata.displayType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeHisPositionHisOrderPlanetBean> getChartMarker() {
        return this.chartMarker;
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
    public final TradePositionPlanetBean getFuturesCurrentInfo() {
        return this.futuresCurrentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeHisPositionPlanetBean getFuturesHistoryInfo() {
        return this.futuresHistoryInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFuturesType() {
        return this.futuresType;
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
    public int hashCode() {
        String str = this.coinName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.pnl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.pnlRatio;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.pluginDataTime;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.futuresType;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        List<TradeTickerChartEntry> list = this.chartTicker;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        List<TradeHisPositionHisOrderPlanetBean> list2 = this.chartMarker;
        int iHashCode7 = list2 == null ? 0 : list2.hashCode();
        TradePositionPlanetBean tradePositionPlanetBean = this.futuresCurrentInfo;
        int iHashCode8 = tradePositionPlanetBean == null ? 0 : tradePositionPlanetBean.hashCode();
        TradeHisPositionPlanetBean tradeHisPositionPlanetBean = this.futuresHistoryInfo;
        int iHashCode9 = tradeHisPositionPlanetBean == null ? 0 : tradeHisPositionPlanetBean.hashCode();
        String str6 = this.displayType;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PluginFuturesMetadata(coinName=" + this.coinName + ", pnl=" + this.pnl + ", pnlRatio=" + this.pnlRatio + ", pluginDataTime=" + this.pluginDataTime + ", futuresType=" + this.futuresType + ", chartTicker=" + this.chartTicker + ", chartMarker=" + this.chartMarker + ", futuresCurrentInfo=" + this.futuresCurrentInfo + ", futuresHistoryInfo=" + this.futuresHistoryInfo + ", displayType=" + this.displayType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.coinName);
        parcel.writeString(this.pnl);
        parcel.writeString(this.pnlRatio);
        parcel.writeString(this.pluginDataTime);
        parcel.writeString(this.futuresType);
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
        List<TradeHisPositionHisOrderPlanetBean> list2 = this.chartMarker;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<TradeHisPositionHisOrderPlanetBean> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        parcel.writeParcelable(this.futuresCurrentInfo, i);
        parcel.writeParcelable(this.futuresHistoryInfo, i);
        parcel.writeString(this.displayType);
    }

    public /* synthetic */ PluginFuturesMetadata(int i, String str, String str2, String str3, String str4, String str5, List list, List list2, TradePositionPlanetBean tradePositionPlanetBean, TradeHisPositionPlanetBean tradeHisPositionPlanetBean, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinName = null;
        } else {
            this.coinName = str;
        }
        if ((i & 2) == 0) {
            this.pnl = null;
        } else {
            this.pnl = str2;
        }
        if ((i & 4) == 0) {
            this.pnlRatio = null;
        } else {
            this.pnlRatio = str3;
        }
        if ((i & 8) == 0) {
            this.pluginDataTime = null;
        } else {
            this.pluginDataTime = str4;
        }
        if ((i & 16) == 0) {
            this.futuresType = null;
        } else {
            this.futuresType = str5;
        }
        if ((i & 32) == 0) {
            this.chartTicker = null;
        } else {
            this.chartTicker = list;
        }
        if ((i & 64) == 0) {
            this.chartMarker = null;
        } else {
            this.chartMarker = list2;
        }
        if ((i & 128) == 0) {
            this.futuresCurrentInfo = null;
        } else {
            this.futuresCurrentInfo = tradePositionPlanetBean;
        }
        if ((i & 256) == 0) {
            this.futuresHistoryInfo = null;
        } else {
            this.futuresHistoryInfo = tradeHisPositionPlanetBean;
        }
        if ((i & 512) == 0) {
            this.displayType = null;
        } else {
            this.displayType = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(PluginFuturesMetadata pluginFuturesMetadata, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || pluginFuturesMetadata.coinName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, pluginFuturesMetadata.coinName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || pluginFuturesMetadata.pnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, pluginFuturesMetadata.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || pluginFuturesMetadata.pnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, pluginFuturesMetadata.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || pluginFuturesMetadata.pluginDataTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, pluginFuturesMetadata.pluginDataTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || pluginFuturesMetadata.futuresType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, pluginFuturesMetadata.futuresType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || pluginFuturesMetadata.chartTicker != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], pluginFuturesMetadata.chartTicker);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || pluginFuturesMetadata.chartMarker != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], pluginFuturesMetadata.chartMarker);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || pluginFuturesMetadata.futuresCurrentInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, TradePositionPlanetBean$$serializer.INSTANCE, pluginFuturesMetadata.futuresCurrentInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || pluginFuturesMetadata.futuresHistoryInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, TradeHisPositionPlanetBean$$serializer.INSTANCE, pluginFuturesMetadata.futuresHistoryInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && pluginFuturesMetadata.displayType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, pluginFuturesMetadata.displayType);
    }

    public PluginFuturesMetadata(String str, String str2, String str3, String str4, String str5, List<TradeTickerChartEntry> list, List<TradeHisPositionHisOrderPlanetBean> list2, TradePositionPlanetBean tradePositionPlanetBean, TradeHisPositionPlanetBean tradeHisPositionPlanetBean, String str6) {
        this.coinName = str;
        this.pnl = str2;
        this.pnlRatio = str3;
        this.pluginDataTime = str4;
        this.futuresType = str5;
        this.chartTicker = list;
        this.chartMarker = list2;
        this.futuresCurrentInfo = tradePositionPlanetBean;
        this.futuresHistoryInfo = tradeHisPositionPlanetBean;
        this.displayType = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r17v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r18v0 java.util.List))
  (wrap:com.okinc.tradeshare.api.TradePositionPlanetBean:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.tradeshare.api.TradePositionPlanetBean) : (r19v0 com.okinc.tradeshare.api.TradePositionPlanetBean))
  (wrap:com.okinc.tradeshare.api.TradeHisPositionPlanetBean:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.tradeshare.api.TradeHisPositionPlanetBean) : (r20v0 com.okinc.tradeshare.api.TradeHisPositionPlanetBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.tradeshare.api.TradeTickerChartEntry>, java.util.List<com.okinc.tradeshare.api.TradeHisPositionHisOrderPlanetBean>, com.okinc.tradeshare.api.TradePositionPlanetBean, com.okinc.tradeshare.api.TradeHisPositionPlanetBean, java.lang.String):void (m)] (LINE:26) call: com.okinc.planet.biz_plugin.future.data.PluginFuturesMetadata.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, com.okinc.tradeshare.api.TradePositionPlanetBean, com.okinc.tradeshare.api.TradeHisPositionPlanetBean, java.lang.String):void type: THIS */
    public /* synthetic */ PluginFuturesMetadata(String str, String str2, String str3, String str4, String str5, List list, List list2, TradePositionPlanetBean tradePositionPlanetBean, TradeHisPositionPlanetBean tradeHisPositionPlanetBean, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : tradePositionPlanetBean, (i & 256) != 0 ? null : tradeHisPositionPlanetBean, (i & 512) == 0 ? str6 : null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_plugin.future.data.PluginFuturesMetadata.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PluginFuturesMetadata> serializer() {
            return PluginFuturesMetadata$$serializer.INSTANCE;
        }

        public final PluginFuturesMetadata copydefault() {
            return PluginFuturesMetadata.Empty;
        }

        public final PluginFuturesMetadata copydefault(@NotNull String str) {
            Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(str, "");
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl((PluginFuturesMetadata) C43284rmQ.KWHzl().decodeFromString(serializer(), str));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            PluginFuturesMetadata pluginFuturesMetadataCopydefault = copydefault();
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = pluginFuturesMetadataCopydefault;
            }
            return (PluginFuturesMetadata) objM7377constructorimpl;
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

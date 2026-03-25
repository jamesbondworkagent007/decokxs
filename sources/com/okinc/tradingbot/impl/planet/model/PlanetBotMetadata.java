package com.okinc.tradingbot.impl.planet.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import o.C43284rmQ;
import o.C56391yDq;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class PlanetBotMetadata implements Parcelable {
    public static final KSerializer<Object>[] $childSerializers;
    public static final int $stable = 0;
    public static final PlanetBotMetadata Empty;
    public final List<Map<String, String>> additionalInfo;
    public final String algoId;
    public final String botType;
    public final List<StrategyProfitResponse> chartData;
    public final List<String> coinUrls;
    public final String deeplink;
    public final String displayType;
    public final List<String> instIds;
    public final String instType;
    public final String name;
    public final String pTime;
    public final String pnl;
    public final String pnlCcy;
    public final String pnlRatio;
    public final String precision;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PlanetBotMetadata> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PlanetBotMetadata> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanetBotMetadata createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(PlanetBotMetadata.class.getClassLoader()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                int i5 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                arrayList2.add(linkedHashMap);
            }
            return new PlanetBotMetadata(string, arrayListCreateStringArrayList, string2, string3, string4, arrayList, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanetBotMetadata[] newArray(int i) {
            return new PlanetBotMetadata[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetBotMetadata() {
        this((String) null, (List) null, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 32767, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetBotMetadata AEQbTJ(@NotNull String str, @NotNull List<String> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<StrategyProfitResponse> list2, @NotNull List<? extends Map<String, String>> list3, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull List<String> list4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(list4, "");
        return new PlanetBotMetadata(str, list, str2, str3, str4, list2, list3, str5, str6, str7, str8, str9, str10, str11, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> AkhnZx() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.botType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Map<String, String>> copydefault() {
        return this.additionalInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StrategyProfitResponse> djBIcL() {
        return this.chartData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ejfBZ() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlanetBotMetadata)) {
            return false;
        }
        PlanetBotMetadata planetBotMetadata = (PlanetBotMetadata) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) planetBotMetadata.algoId) && Intrinsics.EZpvd(this.instIds, planetBotMetadata.instIds) && Intrinsics.EZpvd((Object) this.instType, (Object) planetBotMetadata.instType) && Intrinsics.EZpvd((Object) this.pnl, (Object) planetBotMetadata.pnl) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) planetBotMetadata.pnlRatio) && Intrinsics.EZpvd(this.chartData, planetBotMetadata.chartData) && Intrinsics.EZpvd(this.additionalInfo, planetBotMetadata.additionalInfo) && Intrinsics.EZpvd((Object) this.name, (Object) planetBotMetadata.name) && Intrinsics.EZpvd((Object) this.botType, (Object) planetBotMetadata.botType) && Intrinsics.EZpvd((Object) this.deeplink, (Object) planetBotMetadata.deeplink) && Intrinsics.EZpvd((Object) this.displayType, (Object) planetBotMetadata.displayType) && Intrinsics.EZpvd((Object) this.pnlCcy, (Object) planetBotMetadata.pnlCcy) && Intrinsics.EZpvd((Object) this.pTime, (Object) planetBotMetadata.pTime) && Intrinsics.EZpvd((Object) this.precision, (Object) planetBotMetadata.precision) && Intrinsics.EZpvd(this.coinUrls, planetBotMetadata.coinUrls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.pnlCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fIwbmz() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.displayType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((this.algoId.hashCode() * 31) + this.instIds.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.pnl.hashCode()) * 31) + this.pnlRatio.hashCode()) * 31) + this.chartData.hashCode()) * 31) + this.additionalInfo.hashCode()) * 31) + this.name.hashCode()) * 31) + this.botType.hashCode()) * 31) + this.deeplink.hashCode()) * 31) + this.displayType.hashCode()) * 31) + this.pnlCcy.hashCode()) * 31) + this.pTime.hashCode()) * 31) + this.precision.hashCode()) * 31) + this.coinUrls.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PlanetBotMetadata(algoId=" + this.algoId + ", instIds=" + this.instIds + ", instType=" + this.instType + ", pnl=" + this.pnl + ", pnlRatio=" + this.pnlRatio + ", chartData=" + this.chartData + ", additionalInfo=" + this.additionalInfo + ", name=" + this.name + ", botType=" + this.botType + ", deeplink=" + this.deeplink + ", displayType=" + this.displayType + ", pnlCcy=" + this.pnlCcy + ", pTime=" + this.pTime + ", precision=" + this.precision + ", coinUrls=" + this.coinUrls + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> valueOf() {
        return this.coinUrls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeStringList(this.instIds);
        parcel.writeString(this.instType);
        parcel.writeString(this.pnl);
        parcel.writeString(this.pnlRatio);
        List<StrategyProfitResponse> list = this.chartData;
        parcel.writeInt(list.size());
        Iterator<StrategyProfitResponse> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        List<Map<String, String>> list2 = this.additionalInfo;
        parcel.writeInt(list2.size());
        for (Map<String, String> map : list2) {
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeString(this.name);
        parcel.writeString(this.botType);
        parcel.writeString(this.deeplink);
        parcel.writeString(this.displayType);
        parcel.writeString(this.pnlCcy);
        parcel.writeString(this.pTime);
        parcel.writeString(this.precision);
        parcel.writeStringList(this.coinUrls);
    }

    public /* synthetic */ PlanetBotMetadata(int i, String str, List list, String str2, String str3, String str4, List list2, List list3, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str;
        }
        this.instIds = (i & 2) == 0 ? yDY.AhwBna() : list;
        if ((i & 4) == 0) {
            this.instType = "";
        } else {
            this.instType = str2;
        }
        if ((i & 8) == 0) {
            this.pnl = "";
        } else {
            this.pnl = str3;
        }
        if ((i & 16) == 0) {
            this.pnlRatio = "";
        } else {
            this.pnlRatio = str4;
        }
        this.chartData = (i & 32) == 0 ? yDY.AhwBna() : list2;
        this.additionalInfo = (i & 64) == 0 ? yDY.AhwBna() : list3;
        if ((i & 128) == 0) {
            this.name = "";
        } else {
            this.name = str5;
        }
        if ((i & 256) == 0) {
            this.botType = "";
        } else {
            this.botType = str6;
        }
        if ((i & 512) == 0) {
            this.deeplink = "";
        } else {
            this.deeplink = str7;
        }
        if ((i & 1024) == 0) {
            this.displayType = "";
        } else {
            this.displayType = str8;
        }
        if ((i & 2048) == 0) {
            this.pnlCcy = "";
        } else {
            this.pnlCcy = str9;
        }
        if ((i & 4096) == 0) {
            this.pTime = "";
        } else {
            this.pTime = str10;
        }
        if ((i & 8192) == 0) {
            this.precision = "";
        } else {
            this.precision = str11;
        }
        this.coinUrls = (i & 16384) == 0 ? yDY.AhwBna() : list4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [30=5] */
    public static final /* synthetic */ void EZpvd(PlanetBotMetadata planetBotMetadata, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) planetBotMetadata.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, planetBotMetadata.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(planetBotMetadata.instIds, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], planetBotMetadata.instIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) planetBotMetadata.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, planetBotMetadata.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) planetBotMetadata.pnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, planetBotMetadata.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) planetBotMetadata.pnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, planetBotMetadata.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(planetBotMetadata.chartData, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], planetBotMetadata.chartData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(planetBotMetadata.additionalInfo, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], planetBotMetadata.additionalInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) planetBotMetadata.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, planetBotMetadata.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) planetBotMetadata.botType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, planetBotMetadata.botType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) planetBotMetadata.deeplink, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, planetBotMetadata.deeplink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) planetBotMetadata.displayType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, planetBotMetadata.displayType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) planetBotMetadata.pnlCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, planetBotMetadata.pnlCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) planetBotMetadata.pTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, planetBotMetadata.pTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) planetBotMetadata.precision, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, planetBotMetadata.precision);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && Intrinsics.EZpvd(planetBotMetadata.coinUrls, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], planetBotMetadata.coinUrls);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r23v0, resolved type: java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public PlanetBotMetadata(@NotNull String str, @NotNull List<String> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<StrategyProfitResponse> list2, @NotNull List<? extends Map<String, String>> list3, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull List<String> list4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.algoId = str;
        this.instIds = list;
        this.instType = str2;
        this.pnl = str3;
        this.pnlRatio = str4;
        this.chartData = list2;
        this.additionalInfo = list3;
        this.name = str5;
        this.botType = str6;
        this.deeplink = str7;
        this.displayType = str8;
        this.pnlCcy = str9;
        this.pTime = str10;
        this.precision = str11;
        this.coinUrls = list4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a7: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:35)) : (r18v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002f: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:39)) : (r22v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003a: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:40)) : (r23v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0075: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x007c: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0080: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:48)) : (r31v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.StrategyProfitResponse>, java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:33) call: com.okinc.tradingbot.impl.planet.model.PlanetBotMetadata.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ PlanetBotMetadata(String str, List list, String str2, String str3, String str4, List list2, List list3, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? yDY.AhwBna() : list2, (i & 64) != 0 ? yDY.AhwBna() : list3, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? "" : str8, (i & 2048) != 0 ? "" : str9, (i & 4096) != 0 ? "" : str10, (i & 8192) == 0 ? str11 : "", (i & 16384) != 0 ? yDY.AhwBna() : list4);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.planet.model.PlanetBotMetadata.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PlanetBotMetadata> serializer() {
            return PlanetBotMetadata$$serializer.INSTANCE;
        }

        public final PlanetBotMetadata KWHzl() {
            return PlanetBotMetadata.Empty;
        }

        public final PlanetBotMetadata KWHzl(@NotNull String str) {
            Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(str, "");
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl((PlanetBotMetadata) C43284rmQ.KWHzl().decodeFromString(serializer(), str));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            PlanetBotMetadata planetBotMetadataKWHzl = KWHzl();
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = planetBotMetadataKWHzl;
            }
            return (PlanetBotMetadata) objM7377constructorimpl;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(stringSerializer), null, null, null, new ArrayListSerializer(StrategyProfitResponse$$serializer.INSTANCE), new ArrayListSerializer(new LinkedHashMapSerializer(stringSerializer, stringSerializer)), null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer)};
        Empty = new PlanetBotMetadata((String) null, (List) null, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 32767, (DefaultConstructorMarker) null);
    }

    public final String AYXKKw() {
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

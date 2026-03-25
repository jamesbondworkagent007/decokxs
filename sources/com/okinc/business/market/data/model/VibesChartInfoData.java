package com.okinc.business.market.data.model;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class VibesChartInfoData {
    public final String kolCount;
    public final ArrayList<KolInfoData> kolInfoList;
    public final String price;
    public final String score;
    public final String timestamp;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(KolInfoData$$serializer.INSTANCE), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VibesChartInfoData() {
        this((String) null, (ArrayList) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.market.data.model.VibesChartInfoData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VibesChartInfoData copy$default(VibesChartInfoData vibesChartInfoData, String str, ArrayList arrayList, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vibesChartInfoData.kolCount;
        }
        if ((i & 2) != 0) {
            arrayList = vibesChartInfoData.kolInfoList;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 4) != 0) {
            str2 = vibesChartInfoData.price;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = vibesChartInfoData.score;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = vibesChartInfoData.timestamp;
        }
        return vibesChartInfoData.EZpvd(str, arrayList2, str5, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VibesChartInfoData EZpvd(String str, @NotNull ArrayList<KolInfoData> arrayList, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new VibesChartInfoData(str, arrayList, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<KolInfoData> EZpvd() {
        return this.kolInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.score;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.kolCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VibesChartInfoData)) {
            return false;
        }
        VibesChartInfoData vibesChartInfoData = (VibesChartInfoData) obj;
        return Intrinsics.EZpvd((Object) this.kolCount, (Object) vibesChartInfoData.kolCount) && Intrinsics.EZpvd(this.kolInfoList, vibesChartInfoData.kolInfoList) && Intrinsics.EZpvd((Object) this.price, (Object) vibesChartInfoData.price) && Intrinsics.EZpvd((Object) this.score, (Object) vibesChartInfoData.score) && Intrinsics.EZpvd((Object) this.timestamp, (Object) vibesChartInfoData.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.kolCount;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.kolInfoList.hashCode();
        String str2 = this.price;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.score;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.timestamp;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VibesChartInfoData(kolCount=" + this.kolCount + ", kolInfoList=" + this.kolInfoList + ", price=" + this.price + ", score=" + this.score + ", timestamp=" + this.timestamp + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.timestamp;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.VibesChartInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VibesChartInfoData> serializer() {
            return VibesChartInfoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VibesChartInfoData(int i, String str, ArrayList arrayList, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.kolCount = null;
        } else {
            this.kolCount = str;
        }
        if ((i & 2) == 0) {
            this.kolInfoList = new ArrayList<>();
        } else {
            this.kolInfoList = arrayList;
        }
        if ((i & 4) == 0) {
            this.price = null;
        } else {
            this.price = str2;
        }
        if ((i & 8) == 0) {
            this.score = null;
        } else {
            this.score = str3;
        }
        if ((i & 16) == 0) {
            this.timestamp = null;
        } else {
            this.timestamp = str4;
        }
    }

    public static final /* synthetic */ void AEQbTJ(VibesChartInfoData vibesChartInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || vibesChartInfoData.kolCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, vibesChartInfoData.kolCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(vibesChartInfoData.kolInfoList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], vibesChartInfoData.kolInfoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || vibesChartInfoData.price != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, vibesChartInfoData.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || vibesChartInfoData.score != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, vibesChartInfoData.score);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && vibesChartInfoData.timestamp == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, vibesChartInfoData.timestamp);
    }

    public VibesChartInfoData(String str, @NotNull ArrayList<KolInfoData> arrayList, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.kolCount = str;
        this.kolInfoList = arrayList;
        this.price = str2;
        this.score = str3;
        this.timestamp = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.util.ArrayList:0x0011: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x000e: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:49) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r6v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.util.ArrayList<com.okinc.business.market.data.model.KolInfoData>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:45) call: com.okinc.business.market.data.model.VibesChartInfoData.<init>(java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ VibesChartInfoData(String str, ArrayList arrayList, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}

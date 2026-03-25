package com.okinc.business.market.features.address_tracker_sa.ui.tracker.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TrackerTrendWsParam {
    public static final KSerializer<Object>[] $childSerializers;
    public final String chainId;
    public final List<Integer> groupIdList;
    public final String holderCountMin;
    public final String liquidityMax;
    public final String liquidityMin;
    public final String marketCapMax;
    public final String marketCapMin;
    public final int pageNum;
    public final int pageSize;
    public final List<Integer> tagTypeList;
    public final int timeType;
    public final String tokenAgeMax;
    public final String tokenAgeMin;
    public final List<Integer> userActionTypeList;
    public final String volumeMax;
    public final String volumeMin;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrackerTrendWsParam() {
        this((String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (List) null, (List) null, 0, 0, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackerTrendWsParam KWHzl(@NotNull String str, @NotNull List<Integer> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, int i, @NotNull List<Integer> list2, @NotNull List<Integer> list3, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new TrackerTrendWsParam(str, list, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, i, list2, list3, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackerTrendWsParam)) {
            return false;
        }
        TrackerTrendWsParam trackerTrendWsParam = (TrackerTrendWsParam) obj;
        return Intrinsics.EZpvd((Object) this.walletAddress, (Object) trackerTrendWsParam.walletAddress) && Intrinsics.EZpvd(this.userActionTypeList, trackerTrendWsParam.userActionTypeList) && Intrinsics.EZpvd((Object) this.volumeMin, (Object) trackerTrendWsParam.volumeMin) && Intrinsics.EZpvd((Object) this.volumeMax, (Object) trackerTrendWsParam.volumeMax) && Intrinsics.EZpvd((Object) this.holderCountMin, (Object) trackerTrendWsParam.holderCountMin) && Intrinsics.EZpvd((Object) this.marketCapMin, (Object) trackerTrendWsParam.marketCapMin) && Intrinsics.EZpvd((Object) this.marketCapMax, (Object) trackerTrendWsParam.marketCapMax) && Intrinsics.EZpvd((Object) this.liquidityMin, (Object) trackerTrendWsParam.liquidityMin) && Intrinsics.EZpvd((Object) this.liquidityMax, (Object) trackerTrendWsParam.liquidityMax) && Intrinsics.EZpvd((Object) this.tokenAgeMin, (Object) trackerTrendWsParam.tokenAgeMin) && Intrinsics.EZpvd((Object) this.tokenAgeMax, (Object) trackerTrendWsParam.tokenAgeMax) && Intrinsics.EZpvd((Object) this.chainId, (Object) trackerTrendWsParam.chainId) && this.timeType == trackerTrendWsParam.timeType && Intrinsics.EZpvd(this.groupIdList, trackerTrendWsParam.groupIdList) && Intrinsics.EZpvd(this.tagTypeList, trackerTrendWsParam.tagTypeList) && this.pageNum == trackerTrendWsParam.pageNum && this.pageSize == trackerTrendWsParam.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.walletAddress.hashCode() * 31) + this.userActionTypeList.hashCode()) * 31) + this.volumeMin.hashCode()) * 31) + this.volumeMax.hashCode()) * 31) + this.holderCountMin.hashCode()) * 31) + this.marketCapMin.hashCode()) * 31) + this.marketCapMax.hashCode()) * 31) + this.liquidityMin.hashCode()) * 31) + this.liquidityMax.hashCode()) * 31) + this.tokenAgeMin.hashCode()) * 31) + this.tokenAgeMax.hashCode()) * 31) + this.chainId.hashCode()) * 31) + Integer.hashCode(this.timeType)) * 31) + this.groupIdList.hashCode()) * 31) + this.tagTypeList.hashCode()) * 31) + Integer.hashCode(this.pageNum)) * 31) + Integer.hashCode(this.pageSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrackerTrendWsParam(walletAddress=" + this.walletAddress + ", userActionTypeList=" + this.userActionTypeList + ", volumeMin=" + this.volumeMin + ", volumeMax=" + this.volumeMax + ", holderCountMin=" + this.holderCountMin + ", marketCapMin=" + this.marketCapMin + ", marketCapMax=" + this.marketCapMax + ", liquidityMin=" + this.liquidityMin + ", liquidityMax=" + this.liquidityMax + ", tokenAgeMin=" + this.tokenAgeMin + ", tokenAgeMax=" + this.tokenAgeMax + ", chainId=" + this.chainId + ", timeType=" + this.timeType + ", groupIdList=" + this.groupIdList + ", tagTypeList=" + this.tagTypeList + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendWsParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TrackerTrendWsParam> serializer() {
            return TrackerTrendWsParam$$serializer.INSTANCE;
        }
    }

    static {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(intSerializer), null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(intSerializer), new ArrayListSerializer(intSerializer), null, null};
    }

    public /* synthetic */ TrackerTrendWsParam(int i, String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i2, List list2, List list3, int i3, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str;
        }
        this.userActionTypeList = (i & 2) == 0 ? yDY.AhwBna() : list;
        if ((i & 4) == 0) {
            this.volumeMin = "";
        } else {
            this.volumeMin = str2;
        }
        if ((i & 8) == 0) {
            this.volumeMax = "";
        } else {
            this.volumeMax = str3;
        }
        if ((i & 16) == 0) {
            this.holderCountMin = "";
        } else {
            this.holderCountMin = str4;
        }
        if ((i & 32) == 0) {
            this.marketCapMin = "";
        } else {
            this.marketCapMin = str5;
        }
        if ((i & 64) == 0) {
            this.marketCapMax = "";
        } else {
            this.marketCapMax = str6;
        }
        if ((i & 128) == 0) {
            this.liquidityMin = "";
        } else {
            this.liquidityMin = str7;
        }
        if ((i & 256) == 0) {
            this.liquidityMax = "";
        } else {
            this.liquidityMax = str8;
        }
        if ((i & 512) == 0) {
            this.tokenAgeMin = "";
        } else {
            this.tokenAgeMin = str9;
        }
        if ((i & 1024) == 0) {
            this.tokenAgeMax = "";
        } else {
            this.tokenAgeMax = str10;
        }
        if ((i & 2048) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str11;
        }
        this.timeType = (i & 4096) == 0 ? 5 : i2;
        this.groupIdList = (i & 8192) == 0 ? yDY.AhwBna() : list2;
        this.tagTypeList = (i & 16384) == 0 ? yDY.AhwBna() : list3;
        if ((32768 & i) == 0) {
            this.pageNum = 0;
        } else {
            this.pageNum = i3;
        }
        if ((i & 65536) == 0) {
            this.pageSize = 0;
        } else {
            this.pageSize = i4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [6=4] */
    public static final /* synthetic */ void OLrzqt(TrackerTrendWsParam trackerTrendWsParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) trackerTrendWsParam.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, trackerTrendWsParam.walletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(trackerTrendWsParam.userActionTypeList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], trackerTrendWsParam.userActionTypeList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) trackerTrendWsParam.volumeMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, trackerTrendWsParam.volumeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) trackerTrendWsParam.volumeMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, trackerTrendWsParam.volumeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) trackerTrendWsParam.holderCountMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, trackerTrendWsParam.holderCountMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) trackerTrendWsParam.marketCapMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, trackerTrendWsParam.marketCapMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) trackerTrendWsParam.marketCapMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, trackerTrendWsParam.marketCapMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) trackerTrendWsParam.liquidityMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, trackerTrendWsParam.liquidityMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) trackerTrendWsParam.liquidityMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, trackerTrendWsParam.liquidityMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) trackerTrendWsParam.tokenAgeMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, trackerTrendWsParam.tokenAgeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) trackerTrendWsParam.tokenAgeMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, trackerTrendWsParam.tokenAgeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) trackerTrendWsParam.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, trackerTrendWsParam.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || trackerTrendWsParam.timeType != 5) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, trackerTrendWsParam.timeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(trackerTrendWsParam.groupIdList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 13, kSerializerArr[13], trackerTrendWsParam.groupIdList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd(trackerTrendWsParam.tagTypeList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], trackerTrendWsParam.tagTypeList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || trackerTrendWsParam.pageNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 15, trackerTrendWsParam.pageNum);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && trackerTrendWsParam.pageSize == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 16, trackerTrendWsParam.pageSize);
    }

    public TrackerTrendWsParam(@NotNull String str, @NotNull List<Integer> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, int i, @NotNull List<Integer> list2, @NotNull List<Integer> list3, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.walletAddress = str;
        this.userActionTypeList = list;
        this.volumeMin = str2;
        this.volumeMax = str3;
        this.holderCountMin = str4;
        this.marketCapMin = str5;
        this.marketCapMax = str6;
        this.liquidityMin = str7;
        this.liquidityMax = str8;
        this.tokenAgeMin = str9;
        this.tokenAgeMax = str10;
        this.chainId = str11;
        this.timeType = i;
        this.groupIdList = list2;
        this.tagTypeList = list3;
        this.pageNum = i2;
        this.pageSize = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00bf: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r37v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r21v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r37v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r37v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r37v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r37v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r37v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r37v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r37v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r37v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r37v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005f: ARITH (r37v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0066: ARITH (r37v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (5 int) : (r32v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x006e: ARITH (r37v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0072: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:35)) : (r33v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0079: ARITH (r37v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x007d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:37)) : (r34v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0087: ARITH (r37v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r35v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0094: ARITH (r37v0 int) & (65536 int) A[WRAPPED]) == (0 int)) ? (r36v0 int) : (0 int))
 A[MD:(java.lang.String, java.util.List<java.lang.Integer>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.util.List<java.lang.Integer>, java.util.List<java.lang.Integer>, int, int):void (m)] (LINE:7) call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendWsParam.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.util.List, java.util.List, int, int):void type: THIS */
    public /* synthetic */ TrackerTrendWsParam(String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, List list2, List list3, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? yDY.AhwBna() : list, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? "" : str4, (i4 & 32) != 0 ? "" : str5, (i4 & 64) != 0 ? "" : str6, (i4 & 128) != 0 ? "" : str7, (i4 & 256) != 0 ? "" : str8, (i4 & 512) != 0 ? "" : str9, (i4 & 1024) != 0 ? "" : str10, (i4 & 2048) == 0 ? str11 : "", (i4 & 4096) != 0 ? 5 : i, (i4 & 8192) != 0 ? yDY.AhwBna() : list2, (i4 & 16384) != 0 ? yDY.AhwBna() : list3, (i4 & 32768) != 0 ? 0 : i2, (i4 & 65536) == 0 ? i3 : 0);
    }
}

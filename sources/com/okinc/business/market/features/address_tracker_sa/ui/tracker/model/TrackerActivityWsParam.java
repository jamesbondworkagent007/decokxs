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
public final class TrackerActivityWsParam {
    public final String chainId;
    public final String groupId;
    public final String holderCountMin;
    public final String liquidityMax;
    public final String liquidityMin;
    public final String marketCapMax;
    public final String marketCapMin;
    public final int timeType;
    public final String tokenAgeMax;
    public final String tokenAgeMin;
    public final List<Integer> userActionTypeList;
    public final String volumeMax;
    public final String volumeMin;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrackerActivityWsParam() {
        this((String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackerActivityWsParam OLrzqt(@NotNull String str, @NotNull List<Integer> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, int i, @NotNull String str12) {
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
        Intrinsics.checkNotNullParameter(str12, "");
        return new TrackerActivityWsParam(str, list, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, i, str12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackerActivityWsParam)) {
            return false;
        }
        TrackerActivityWsParam trackerActivityWsParam = (TrackerActivityWsParam) obj;
        return Intrinsics.EZpvd((Object) this.walletAddress, (Object) trackerActivityWsParam.walletAddress) && Intrinsics.EZpvd(this.userActionTypeList, trackerActivityWsParam.userActionTypeList) && Intrinsics.EZpvd((Object) this.volumeMin, (Object) trackerActivityWsParam.volumeMin) && Intrinsics.EZpvd((Object) this.volumeMax, (Object) trackerActivityWsParam.volumeMax) && Intrinsics.EZpvd((Object) this.holderCountMin, (Object) trackerActivityWsParam.holderCountMin) && Intrinsics.EZpvd((Object) this.marketCapMin, (Object) trackerActivityWsParam.marketCapMin) && Intrinsics.EZpvd((Object) this.marketCapMax, (Object) trackerActivityWsParam.marketCapMax) && Intrinsics.EZpvd((Object) this.liquidityMin, (Object) trackerActivityWsParam.liquidityMin) && Intrinsics.EZpvd((Object) this.liquidityMax, (Object) trackerActivityWsParam.liquidityMax) && Intrinsics.EZpvd((Object) this.tokenAgeMin, (Object) trackerActivityWsParam.tokenAgeMin) && Intrinsics.EZpvd((Object) this.tokenAgeMax, (Object) trackerActivityWsParam.tokenAgeMax) && Intrinsics.EZpvd((Object) this.chainId, (Object) trackerActivityWsParam.chainId) && this.timeType == trackerActivityWsParam.timeType && Intrinsics.EZpvd((Object) this.groupId, (Object) trackerActivityWsParam.groupId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((this.walletAddress.hashCode() * 31) + this.userActionTypeList.hashCode()) * 31) + this.volumeMin.hashCode()) * 31) + this.volumeMax.hashCode()) * 31) + this.holderCountMin.hashCode()) * 31) + this.marketCapMin.hashCode()) * 31) + this.marketCapMax.hashCode()) * 31) + this.liquidityMin.hashCode()) * 31) + this.liquidityMax.hashCode()) * 31) + this.tokenAgeMin.hashCode()) * 31) + this.tokenAgeMax.hashCode()) * 31) + this.chainId.hashCode()) * 31) + Integer.hashCode(this.timeType)) * 31) + this.groupId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrackerActivityWsParam(walletAddress=" + this.walletAddress + ", userActionTypeList=" + this.userActionTypeList + ", volumeMin=" + this.volumeMin + ", volumeMax=" + this.volumeMax + ", holderCountMin=" + this.holderCountMin + ", marketCapMin=" + this.marketCapMin + ", marketCapMax=" + this.marketCapMax + ", liquidityMin=" + this.liquidityMin + ", liquidityMax=" + this.liquidityMax + ", tokenAgeMin=" + this.tokenAgeMin + ", tokenAgeMax=" + this.tokenAgeMax + ", chainId=" + this.chainId + ", timeType=" + this.timeType + ", groupId=" + this.groupId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityWsParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TrackerActivityWsParam> serializer() {
            return TrackerActivityWsParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TrackerActivityWsParam(int i, String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i2, String str12, SerializationConstructorMarker serializationConstructorMarker) {
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
        if ((i & 8192) == 0) {
            this.groupId = "";
        } else {
            this.groupId = str12;
        }
    }

    public static final /* synthetic */ void EZpvd(TrackerActivityWsParam trackerActivityWsParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) trackerActivityWsParam.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, trackerActivityWsParam.walletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(trackerActivityWsParam.userActionTypeList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], trackerActivityWsParam.userActionTypeList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) trackerActivityWsParam.volumeMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, trackerActivityWsParam.volumeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) trackerActivityWsParam.volumeMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, trackerActivityWsParam.volumeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) trackerActivityWsParam.holderCountMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, trackerActivityWsParam.holderCountMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) trackerActivityWsParam.marketCapMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, trackerActivityWsParam.marketCapMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) trackerActivityWsParam.marketCapMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, trackerActivityWsParam.marketCapMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) trackerActivityWsParam.liquidityMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, trackerActivityWsParam.liquidityMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) trackerActivityWsParam.liquidityMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, trackerActivityWsParam.liquidityMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) trackerActivityWsParam.tokenAgeMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, trackerActivityWsParam.tokenAgeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) trackerActivityWsParam.tokenAgeMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, trackerActivityWsParam.tokenAgeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) trackerActivityWsParam.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, trackerActivityWsParam.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || trackerActivityWsParam.timeType != 5) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, trackerActivityWsParam.timeType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd((Object) trackerActivityWsParam.groupId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 13, trackerActivityWsParam.groupId);
    }

    public TrackerActivityWsParam(@NotNull String str, @NotNull List<Integer> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, int i, @NotNull String str12) {
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
        Intrinsics.checkNotNullParameter(str12, "");
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
        this.groupId = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0094: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r17v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005f: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0067: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (5 int) : (r28v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006f: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.util.List<java.lang.Integer>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String):void (m)] (LINE:7) call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityWsParam.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ TrackerActivityWsParam(String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, String str12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? yDY.AhwBna() : list, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? "" : str8, (i2 & 512) != 0 ? "" : str9, (i2 & 1024) != 0 ? "" : str10, (i2 & 2048) != 0 ? "" : str11, (i2 & 4096) != 0 ? 5 : i, (i2 & 8192) == 0 ? str12 : "");
    }
}

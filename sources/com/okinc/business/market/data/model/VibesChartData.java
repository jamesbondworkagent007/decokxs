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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class VibesChartData {
    public final ArrayList<VibesChartInfoData> chartInfo;
    public final String dimensionType;
    public final String engagement;
    public final String engagementChangeRate;
    public final String followerCount;
    public final String followerCountChangeRate;
    public final String impressions;
    public final String impressionsChangeRate;
    public final String liquidity;
    public final String mentionedKolCount;
    public final String mentionedKolCountChangeRate;
    public final String mentionsCount;
    public final String mentionsCountChangeRate;
    public final String score;
    public final String scoreChangeRate;
    public final boolean supportFirstMentioned;
    public final String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(VibesChartInfoData$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VibesChartData() {
        this((ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.impressionsChangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.score;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.supportFirstMentioned;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.engagement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VibesChartData KWHzl(@NotNull ArrayList<VibesChartInfoData> arrayList, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new VibesChartData(arrayList, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.dimensionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.engagementChangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<VibesChartInfoData> copydefault() {
        return this.chartInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.impressions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VibesChartData)) {
            return false;
        }
        VibesChartData vibesChartData = (VibesChartData) obj;
        return Intrinsics.EZpvd(this.chartInfo, vibesChartData.chartInfo) && Intrinsics.EZpvd((Object) this.engagement, (Object) vibesChartData.engagement) && Intrinsics.EZpvd((Object) this.engagementChangeRate, (Object) vibesChartData.engagementChangeRate) && Intrinsics.EZpvd((Object) this.followerCount, (Object) vibesChartData.followerCount) && Intrinsics.EZpvd((Object) this.followerCountChangeRate, (Object) vibesChartData.followerCountChangeRate) && Intrinsics.EZpvd((Object) this.impressions, (Object) vibesChartData.impressions) && Intrinsics.EZpvd((Object) this.impressionsChangeRate, (Object) vibesChartData.impressionsChangeRate) && Intrinsics.EZpvd((Object) this.mentionedKolCount, (Object) vibesChartData.mentionedKolCount) && Intrinsics.EZpvd((Object) this.mentionedKolCountChangeRate, (Object) vibesChartData.mentionedKolCountChangeRate) && Intrinsics.EZpvd((Object) this.mentionsCount, (Object) vibesChartData.mentionsCount) && Intrinsics.EZpvd((Object) this.mentionsCountChangeRate, (Object) vibesChartData.mentionsCountChangeRate) && Intrinsics.EZpvd((Object) this.score, (Object) vibesChartData.score) && Intrinsics.EZpvd((Object) this.scoreChangeRate, (Object) vibesChartData.scoreChangeRate) && Intrinsics.EZpvd((Object) this.liquidity, (Object) vibesChartData.liquidity) && Intrinsics.EZpvd((Object) this.dimensionType, (Object) vibesChartData.dimensionType) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) vibesChartData.tokenSymbol) && this.supportFirstMentioned == vibesChartData.supportFirstMentioned;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.mentionsCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chartInfo.hashCode();
        String str = this.engagement;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.engagementChangeRate;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.followerCount;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.followerCountChangeRate;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.impressions;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.impressionsChangeRate;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.mentionedKolCount;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.mentionedKolCountChangeRate;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.mentionsCount;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.mentionsCountChangeRate;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.score;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.scoreChangeRate;
        int iHashCode13 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.liquidity;
        int iHashCode14 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.dimensionType;
        int iHashCode15 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.tokenSymbol;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (str15 == null ? 0 : str15.hashCode())) * 31) + Boolean.hashCode(this.supportFirstMentioned);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.scoreChangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VibesChartData(chartInfo=" + this.chartInfo + ", engagement=" + this.engagement + ", engagementChangeRate=" + this.engagementChangeRate + ", followerCount=" + this.followerCount + ", followerCountChangeRate=" + this.followerCountChangeRate + ", impressions=" + this.impressions + ", impressionsChangeRate=" + this.impressionsChangeRate + ", mentionedKolCount=" + this.mentionedKolCount + ", mentionedKolCountChangeRate=" + this.mentionedKolCountChangeRate + ", mentionsCount=" + this.mentionsCount + ", mentionsCountChangeRate=" + this.mentionsCountChangeRate + ", score=" + this.score + ", scoreChangeRate=" + this.scoreChangeRate + ", liquidity=" + this.liquidity + ", dimensionType=" + this.dimensionType + ", tokenSymbol=" + this.tokenSymbol + ", supportFirstMentioned=" + this.supportFirstMentioned + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.mentionsCountChangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.tokenSymbol;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.VibesChartData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VibesChartData> serializer() {
            return VibesChartData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VibesChartData(int i, ArrayList arrayList, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.chartInfo = (i & 1) == 0 ? new ArrayList() : arrayList;
        if ((i & 2) == 0) {
            this.engagement = null;
        } else {
            this.engagement = str;
        }
        if ((i & 4) == 0) {
            this.engagementChangeRate = null;
        } else {
            this.engagementChangeRate = str2;
        }
        if ((i & 8) == 0) {
            this.followerCount = null;
        } else {
            this.followerCount = str3;
        }
        if ((i & 16) == 0) {
            this.followerCountChangeRate = null;
        } else {
            this.followerCountChangeRate = str4;
        }
        if ((i & 32) == 0) {
            this.impressions = null;
        } else {
            this.impressions = str5;
        }
        if ((i & 64) == 0) {
            this.impressionsChangeRate = null;
        } else {
            this.impressionsChangeRate = str6;
        }
        if ((i & 128) == 0) {
            this.mentionedKolCount = null;
        } else {
            this.mentionedKolCount = str7;
        }
        if ((i & 256) == 0) {
            this.mentionedKolCountChangeRate = null;
        } else {
            this.mentionedKolCountChangeRate = str8;
        }
        if ((i & 512) == 0) {
            this.mentionsCount = null;
        } else {
            this.mentionsCount = str9;
        }
        if ((i & 1024) == 0) {
            this.mentionsCountChangeRate = null;
        } else {
            this.mentionsCountChangeRate = str10;
        }
        if ((i & 2048) == 0) {
            this.score = null;
        } else {
            this.score = str11;
        }
        if ((i & 4096) == 0) {
            this.scoreChangeRate = null;
        } else {
            this.scoreChangeRate = str12;
        }
        if ((i & 8192) == 0) {
            this.liquidity = null;
        } else {
            this.liquidity = str13;
        }
        if ((i & 16384) == 0) {
            this.dimensionType = null;
        } else {
            this.dimensionType = str14;
        }
        if ((32768 & i) == 0) {
            this.tokenSymbol = null;
        } else {
            this.tokenSymbol = str15;
        }
        this.supportFirstMentioned = (i & 65536) == 0 ? false : z;
    }

    public static final /* synthetic */ void OLrzqt(VibesChartData vibesChartData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(vibesChartData.chartInfo, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], vibesChartData.chartInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || vibesChartData.engagement != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, vibesChartData.engagement);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || vibesChartData.engagementChangeRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, vibesChartData.engagementChangeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || vibesChartData.followerCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, vibesChartData.followerCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || vibesChartData.followerCountChangeRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, vibesChartData.followerCountChangeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || vibesChartData.impressions != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, vibesChartData.impressions);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || vibesChartData.impressionsChangeRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, vibesChartData.impressionsChangeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || vibesChartData.mentionedKolCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, vibesChartData.mentionedKolCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || vibesChartData.mentionedKolCountChangeRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, vibesChartData.mentionedKolCountChangeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || vibesChartData.mentionsCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, vibesChartData.mentionsCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || vibesChartData.mentionsCountChangeRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, vibesChartData.mentionsCountChangeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || vibesChartData.score != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, vibesChartData.score);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || vibesChartData.scoreChangeRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, vibesChartData.scoreChangeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || vibesChartData.liquidity != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, vibesChartData.liquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || vibesChartData.dimensionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, vibesChartData.dimensionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || vibesChartData.tokenSymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, vibesChartData.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || vibesChartData.supportFirstMentioned) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 16, vibesChartData.supportFirstMentioned);
        }
    }

    public VibesChartData(@NotNull ArrayList<VibesChartInfoData> arrayList, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.chartInfo = arrayList;
        this.engagement = str;
        this.engagementChangeRate = str2;
        this.followerCount = str3;
        this.followerCountChangeRate = str4;
        this.impressions = str5;
        this.impressionsChangeRate = str6;
        this.mentionedKolCount = str7;
        this.mentionedKolCountChangeRate = str8;
        this.mentionsCount = str9;
        this.mentionsCountChangeRate = str10;
        this.score = str11;
        this.scoreChangeRate = str12;
        this.liquidity = str13;
        this.dimensionType = str14;
        this.tokenSymbol = str15;
        this.supportFirstMentioned = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b8: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:9) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r19v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006e: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0081: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x008c: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? false : (r35v0 boolean))
 A[MD:(java.util.ArrayList<com.okinc.business.market.data.model.VibesChartInfoData>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:7) call: com.okinc.business.market.data.model.VibesChartData.<init>(java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ VibesChartData(ArrayList arrayList, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? false : z);
    }
}

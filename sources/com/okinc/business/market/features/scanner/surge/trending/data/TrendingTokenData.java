package com.okinc.business.market.features.scanner.surge.trending.data;

import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.CompactTagData$$serializer;
import com.okinc.business.market.features.meme.data.model.MediaV2Data;
import com.okinc.business.market.features.meme.data.model.MediaV2Data$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class TrendingTokenData {
    public final String bigLogo;
    public final String bundleHoldRatio;
    public final String chainId;
    public final String contractAddress;
    public final String createTime;
    public final String creatorAddress;
    public final String devHoldRatio;
    public final String internal;
    public final List<List<String>> kline;
    public final String logo;
    public final String mcap;
    public final MediaV2Data media;
    public final String meme;
    public final String migrationEnd;
    public final String mom;
    public final String name;
    public final String progress;
    public final String protocolId;
    public final String symbol;
    public final List<CompactTagData> tagData;
    public final String vol1h;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(CompactTagData$$serializer.INSTANCE), null, null, null, null, new ArrayListSerializer(new ArrayListSerializer(StringSerializer.INSTANCE))};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrendingTokenData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (MediaV2Data) null, (List) null, 2097151, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.devHoldRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> AhwBna() {
        return this.kline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> AuCTel() {
        return this.tagData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.migrationEnd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrendingTokenData EZpvd(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List<CompactTagData> list, String str16, String str17, String str18, MediaV2Data mediaV2Data, List<? extends List<String>> list2) {
        return new TrendingTokenData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, list, str16, str17, str18, mediaV2Data, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.bigLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.bundleHoldRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.creatorAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendingTokenData)) {
            return false;
        }
        TrendingTokenData trendingTokenData = (TrendingTokenData) obj;
        return Intrinsics.EZpvd((Object) this.contractAddress, (Object) trendingTokenData.contractAddress) && Intrinsics.EZpvd((Object) this.chainId, (Object) trendingTokenData.chainId) && Intrinsics.EZpvd((Object) this.mom, (Object) trendingTokenData.mom) && Intrinsics.EZpvd((Object) this.symbol, (Object) trendingTokenData.symbol) && Intrinsics.EZpvd((Object) this.name, (Object) trendingTokenData.name) && Intrinsics.EZpvd((Object) this.logo, (Object) trendingTokenData.logo) && Intrinsics.EZpvd((Object) this.bigLogo, (Object) trendingTokenData.bigLogo) && Intrinsics.EZpvd((Object) this.createTime, (Object) trendingTokenData.createTime) && Intrinsics.EZpvd((Object) this.creatorAddress, (Object) trendingTokenData.creatorAddress) && Intrinsics.EZpvd((Object) this.vol1h, (Object) trendingTokenData.vol1h) && Intrinsics.EZpvd((Object) this.mcap, (Object) trendingTokenData.mcap) && Intrinsics.EZpvd((Object) this.meme, (Object) trendingTokenData.meme) && Intrinsics.EZpvd((Object) this.internal, (Object) trendingTokenData.internal) && Intrinsics.EZpvd((Object) this.bundleHoldRatio, (Object) trendingTokenData.bundleHoldRatio) && Intrinsics.EZpvd((Object) this.devHoldRatio, (Object) trendingTokenData.devHoldRatio) && Intrinsics.EZpvd(this.tagData, trendingTokenData.tagData) && Intrinsics.EZpvd((Object) this.progress, (Object) trendingTokenData.progress) && Intrinsics.EZpvd((Object) this.migrationEnd, (Object) trendingTokenData.migrationEnd) && Intrinsics.EZpvd((Object) this.protocolId, (Object) trendingTokenData.protocolId) && Intrinsics.EZpvd(this.media, trendingTokenData.media) && Intrinsics.EZpvd(this.kline, trendingTokenData.kline);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fIwbmz() {
        return this.vol1h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediaV2Data fetchVPNInfo() {
        return this.media;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.contractAddress;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.chainId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.mom;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.symbol;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.name;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.logo;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.bigLogo;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.createTime;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.creatorAddress;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.vol1h;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.mcap;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.meme;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.internal;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.bundleHoldRatio;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.devHoldRatio;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        List<CompactTagData> list = this.tagData;
        int iHashCode16 = list == null ? 0 : list.hashCode();
        String str16 = this.progress;
        int iHashCode17 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.migrationEnd;
        int iHashCode18 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.protocolId;
        int iHashCode19 = str18 == null ? 0 : str18.hashCode();
        MediaV2Data mediaV2Data = this.media;
        int iHashCode20 = mediaV2Data == null ? 0 : mediaV2Data.hashCode();
        List<List<String>> list2 = this.kline;
        return (((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + (list2 == null ? 0 : list2.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.mcap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrendingTokenData(contractAddress=" + this.contractAddress + ", chainId=" + this.chainId + ", mom=" + this.mom + ", symbol=" + this.symbol + ", name=" + this.name + ", logo=" + this.logo + ", bigLogo=" + this.bigLogo + ", createTime=" + this.createTime + ", creatorAddress=" + this.creatorAddress + ", vol1h=" + this.vol1h + ", mcap=" + this.mcap + ", meme=" + this.meme + ", internal=" + this.internal + ", bundleHoldRatio=" + this.bundleHoldRatio + ", devHoldRatio=" + this.devHoldRatio + ", tagData=" + this.tagData + ", progress=" + this.progress + ", migrationEnd=" + this.migrationEnd + ", protocolId=" + this.protocolId + ", media=" + this.media + ", kline=" + this.kline + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.name;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.scanner.surge.trending.data.TrendingTokenData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TrendingTokenData> serializer() {
            return TrendingTokenData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TrendingTokenData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List list, String str16, String str17, String str18, MediaV2Data mediaV2Data, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.contractAddress = null;
        } else {
            this.contractAddress = str;
        }
        if ((i & 2) == 0) {
            this.chainId = null;
        } else {
            this.chainId = str2;
        }
        if ((i & 4) == 0) {
            this.mom = null;
        } else {
            this.mom = str3;
        }
        if ((i & 8) == 0) {
            this.symbol = null;
        } else {
            this.symbol = str4;
        }
        if ((i & 16) == 0) {
            this.name = null;
        } else {
            this.name = str5;
        }
        if ((i & 32) == 0) {
            this.logo = null;
        } else {
            this.logo = str6;
        }
        if ((i & 64) == 0) {
            this.bigLogo = null;
        } else {
            this.bigLogo = str7;
        }
        if ((i & 128) == 0) {
            this.createTime = null;
        } else {
            this.createTime = str8;
        }
        if ((i & 256) == 0) {
            this.creatorAddress = null;
        } else {
            this.creatorAddress = str9;
        }
        if ((i & 512) == 0) {
            this.vol1h = null;
        } else {
            this.vol1h = str10;
        }
        if ((i & 1024) == 0) {
            this.mcap = null;
        } else {
            this.mcap = str11;
        }
        if ((i & 2048) == 0) {
            this.meme = null;
        } else {
            this.meme = str12;
        }
        if ((i & 4096) == 0) {
            this.internal = null;
        } else {
            this.internal = str13;
        }
        if ((i & 8192) == 0) {
            this.bundleHoldRatio = null;
        } else {
            this.bundleHoldRatio = str14;
        }
        if ((i & 16384) == 0) {
            this.devHoldRatio = null;
        } else {
            this.devHoldRatio = str15;
        }
        if ((32768 & i) == 0) {
            this.tagData = null;
        } else {
            this.tagData = list;
        }
        if ((65536 & i) == 0) {
            this.progress = null;
        } else {
            this.progress = str16;
        }
        if ((131072 & i) == 0) {
            this.migrationEnd = null;
        } else {
            this.migrationEnd = str17;
        }
        if ((262144 & i) == 0) {
            this.protocolId = null;
        } else {
            this.protocolId = str18;
        }
        if ((524288 & i) == 0) {
            this.media = null;
        } else {
            this.media = mediaV2Data;
        }
        if ((i & 1048576) == 0) {
            this.kline = null;
        } else {
            this.kline = list2;
        }
    }

    public static final /* synthetic */ void AEQbTJ(TrendingTokenData trendingTokenData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || trendingTokenData.contractAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, trendingTokenData.contractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || trendingTokenData.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, trendingTokenData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || trendingTokenData.mom != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, trendingTokenData.mom);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || trendingTokenData.symbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, trendingTokenData.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || trendingTokenData.name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, trendingTokenData.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || trendingTokenData.logo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, trendingTokenData.logo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || trendingTokenData.bigLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, trendingTokenData.bigLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || trendingTokenData.createTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, trendingTokenData.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || trendingTokenData.creatorAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, trendingTokenData.creatorAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || trendingTokenData.vol1h != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, trendingTokenData.vol1h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || trendingTokenData.mcap != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, trendingTokenData.mcap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || trendingTokenData.meme != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, trendingTokenData.meme);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || trendingTokenData.internal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, trendingTokenData.internal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || trendingTokenData.bundleHoldRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, trendingTokenData.bundleHoldRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || trendingTokenData.devHoldRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, trendingTokenData.devHoldRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || trendingTokenData.tagData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, kSerializerArr[15], trendingTokenData.tagData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || trendingTokenData.progress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, trendingTokenData.progress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || trendingTokenData.migrationEnd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, trendingTokenData.migrationEnd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || trendingTokenData.protocolId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, trendingTokenData.protocolId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || trendingTokenData.media != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, MediaV2Data$$serializer.INSTANCE, trendingTokenData.media);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) && trendingTokenData.kline == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, kSerializerArr[20], trendingTokenData.kline);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r23v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public TrendingTokenData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List<CompactTagData> list, String str16, String str17, String str18, MediaV2Data mediaV2Data, List<? extends List<String>> list2) {
        this.contractAddress = str;
        this.chainId = str2;
        this.mom = str3;
        this.symbol = str4;
        this.name = str5;
        this.logo = str6;
        this.bigLogo = str7;
        this.createTime = str8;
        this.creatorAddress = str9;
        this.vol1h = str10;
        this.mcap = str11;
        this.meme = str12;
        this.internal = str13;
        this.bundleHoldRatio = str14;
        this.devHoldRatio = str15;
        this.tagData = list;
        this.progress = str16;
        this.migrationEnd = str17;
        this.protocolId = str18;
        this.media = mediaV2Data;
        this.kline = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00e8: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r44v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r44v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r44v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r44v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r44v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r44v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r44v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r44v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r44v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r44v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r44v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r44v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r44v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r44v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r44v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x007d: ARITH (r44v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r38v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r44v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r44v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r44v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:com.okinc.business.market.features.meme.data.model.MediaV2Data:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r44v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.data.model.MediaV2Data) : (r42v0 com.okinc.business.market.features.meme.data.model.MediaV2Data))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r44v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r43v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.data.model.CompactTagData>, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.data.model.MediaV2Data, java.util.List<? extends java.util.List<java.lang.String>>):void (m)] (LINE:9) call: com.okinc.business.market.features.scanner.surge.trending.data.TrendingTokenData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.data.model.MediaV2Data, java.util.List):void type: THIS */
    public /* synthetic */ TrendingTokenData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List list, String str16, String str17, String str18, MediaV2Data mediaV2Data, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : list, (i & 65536) != 0 ? null : str16, (i & 131072) != 0 ? null : str17, (i & 262144) != 0 ? null : str18, (i & 524288) != 0 ? null : mediaV2Data, (i & 1048576) != 0 ? null : list2);
    }
}

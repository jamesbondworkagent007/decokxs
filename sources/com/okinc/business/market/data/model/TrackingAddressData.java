package com.okinc.business.market.data.model;

import com.okinc.business.market.common.constants.StringBooleanType;
import com.okinc.business.market.data.model.common.ChainInfoData;
import com.okinc.business.market.data.model.common.ChainInfoData$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TrackingAddressData {
    public static final KSerializer<Object>[] $childSerializers;
    public final String alias;
    public final ChainInfoData chainInfo;
    public final long collectTime;
    public final StringBooleanType hasAlert;
    public final StringBooleanType hasAlias;
    public final StringBooleanType isFollowing;
    public final long lastTxTime;
    public final String nativeTokenAmount;
    public final List<CompactTagData> newTagList;
    public final String sevenDayPnl;
    public final String sevenDayPnlPercentage;
    public final String sevenDayTxs;
    public final String targetAddress;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrackingAddressData() {
        this((String) null, (StringBooleanType) null, (String) null, (String) null, (StringBooleanType) null, 0L, 0L, (String) null, (String) null, (String) null, (String) null, (StringBooleanType) null, (List) null, (ChainInfoData) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AYXKKw() {
        return this.lastTxTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> AhwBna() {
        return this.newTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.sevenDayTxs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StringBooleanType EZpvd() {
        return this.hasAlert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.collectTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackingAddressData copydefault(@NotNull String str, @NotNull StringBooleanType stringBooleanType, @NotNull String str2, @NotNull String str3, @NotNull StringBooleanType stringBooleanType2, long j, long j2, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull StringBooleanType stringBooleanType3, @NotNull List<CompactTagData> list, @NotNull ChainInfoData chainInfoData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(stringBooleanType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(stringBooleanType2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(stringBooleanType3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(chainInfoData, "");
        return new TrackingAddressData(str, stringBooleanType, str2, str3, stringBooleanType2, j, j2, str4, str5, str6, str7, stringBooleanType3, list, chainInfoData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChainInfoData copydefault() {
        return this.chainInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.nativeTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingAddressData)) {
            return false;
        }
        TrackingAddressData trackingAddressData = (TrackingAddressData) obj;
        return Intrinsics.EZpvd((Object) this.alias, (Object) trackingAddressData.alias) && this.hasAlias == trackingAddressData.hasAlias && Intrinsics.EZpvd((Object) this.targetAddress, (Object) trackingAddressData.targetAddress) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) trackingAddressData.walletAddress) && this.isFollowing == trackingAddressData.isFollowing && this.collectTime == trackingAddressData.collectTime && this.lastTxTime == trackingAddressData.lastTxTime && Intrinsics.EZpvd((Object) this.sevenDayPnl, (Object) trackingAddressData.sevenDayPnl) && Intrinsics.EZpvd((Object) this.sevenDayPnlPercentage, (Object) trackingAddressData.sevenDayPnlPercentage) && Intrinsics.EZpvd((Object) this.sevenDayTxs, (Object) trackingAddressData.sevenDayTxs) && Intrinsics.EZpvd((Object) this.nativeTokenAmount, (Object) trackingAddressData.nativeTokenAmount) && this.hasAlert == trackingAddressData.hasAlert && Intrinsics.EZpvd(this.newTagList, trackingAddressData.newTagList) && Intrinsics.EZpvd(this.chainInfo, trackingAddressData.chainInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.sevenDayPnlPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StringBooleanType gEmmrt() {
        return this.hasAlias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((this.alias.hashCode() * 31) + this.hasAlias.hashCode()) * 31) + this.targetAddress.hashCode()) * 31) + this.walletAddress.hashCode()) * 31) + this.isFollowing.hashCode()) * 31) + Long.hashCode(this.collectTime)) * 31) + Long.hashCode(this.lastTxTime)) * 31) + this.sevenDayPnl.hashCode()) * 31) + this.sevenDayPnlPercentage.hashCode()) * 31) + this.sevenDayTxs.hashCode()) * 31) + this.nativeTokenAmount.hashCode()) * 31) + this.hasAlert.hashCode()) * 31) + this.newTagList.hashCode()) * 31) + this.chainInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.targetAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrackingAddressData(alias=" + this.alias + ", hasAlias=" + this.hasAlias + ", targetAddress=" + this.targetAddress + ", walletAddress=" + this.walletAddress + ", isFollowing=" + this.isFollowing + ", collectTime=" + this.collectTime + ", lastTxTime=" + this.lastTxTime + ", sevenDayPnl=" + this.sevenDayPnl + ", sevenDayPnlPercentage=" + this.sevenDayPnlPercentage + ", sevenDayTxs=" + this.sevenDayTxs + ", nativeTokenAmount=" + this.nativeTokenAmount + ", hasAlert=" + this.hasAlert + ", newTagList=" + this.newTagList + ", chainInfo=" + this.chainInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.sevenDayPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StringBooleanType values() {
        return this.isFollowing;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.TrackingAddressData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TrackingAddressData> serializer() {
            return TrackingAddressData$$serializer.INSTANCE;
        }
    }

    static {
        StringBooleanType.Companion companion = StringBooleanType.Companion;
        $childSerializers = new KSerializer[]{null, companion.serializer(), null, null, companion.serializer(), null, null, null, null, null, null, companion.serializer(), new ArrayListSerializer(CompactTagData$$serializer.INSTANCE), null};
    }

    public /* synthetic */ TrackingAddressData(int i, String str, StringBooleanType stringBooleanType, String str2, String str3, StringBooleanType stringBooleanType2, long j, long j2, String str4, String str5, String str6, String str7, StringBooleanType stringBooleanType3, List list, ChainInfoData chainInfoData, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.alias = "";
        } else {
            this.alias = str;
        }
        this.hasAlias = (i & 2) == 0 ? StringBooleanType.FALSE : stringBooleanType;
        if ((i & 4) == 0) {
            this.targetAddress = "";
        } else {
            this.targetAddress = str2;
        }
        if ((i & 8) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str3;
        }
        this.isFollowing = (i & 16) == 0 ? StringBooleanType.FALSE : stringBooleanType2;
        if ((i & 32) == 0) {
            this.collectTime = 0L;
        } else {
            this.collectTime = j;
        }
        this.lastTxTime = (i & 64) != 0 ? j2 : 0L;
        if ((i & 128) == 0) {
            this.sevenDayPnl = "";
        } else {
            this.sevenDayPnl = str4;
        }
        if ((i & 256) == 0) {
            this.sevenDayPnlPercentage = "";
        } else {
            this.sevenDayPnlPercentage = str5;
        }
        if ((i & 512) == 0) {
            this.sevenDayTxs = "";
        } else {
            this.sevenDayTxs = str6;
        }
        if ((i & 1024) == 0) {
            this.nativeTokenAmount = "";
        } else {
            this.nativeTokenAmount = str7;
        }
        this.hasAlert = (i & 2048) == 0 ? StringBooleanType.FALSE : stringBooleanType3;
        this.newTagList = (i & 4096) == 0 ? yDY.AhwBna() : list;
        this.chainInfo = (i & 8192) == 0 ? new ChainInfoData((String) null, (String) null, (String) null, (String) null, (StringBooleanType) null, (String) null, 63, (DefaultConstructorMarker) null) : chainInfoData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [8=6] */
    public static final /* synthetic */ void OLrzqt(TrackingAddressData trackingAddressData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) trackingAddressData.alias, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, trackingAddressData.alias);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || trackingAddressData.hasAlias != StringBooleanType.FALSE) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], trackingAddressData.hasAlias);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) trackingAddressData.targetAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, trackingAddressData.targetAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) trackingAddressData.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, trackingAddressData.walletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || trackingAddressData.isFollowing != StringBooleanType.FALSE) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], trackingAddressData.isFollowing);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || trackingAddressData.collectTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 5, trackingAddressData.collectTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || trackingAddressData.lastTxTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 6, trackingAddressData.lastTxTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) trackingAddressData.sevenDayPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, trackingAddressData.sevenDayPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) trackingAddressData.sevenDayPnlPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, trackingAddressData.sevenDayPnlPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) trackingAddressData.sevenDayTxs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, trackingAddressData.sevenDayTxs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) trackingAddressData.nativeTokenAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, trackingAddressData.nativeTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || trackingAddressData.hasAlert != StringBooleanType.FALSE) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], trackingAddressData.hasAlert);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(trackingAddressData.newTagList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], trackingAddressData.newTagList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd(trackingAddressData.chainInfo, new ChainInfoData((String) null, (String) null, (String) null, (String) null, (StringBooleanType) null, (String) null, 63, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 13, ChainInfoData$$serializer.INSTANCE, trackingAddressData.chainInfo);
    }

    public TrackingAddressData(@NotNull String str, @NotNull StringBooleanType stringBooleanType, @NotNull String str2, @NotNull String str3, @NotNull StringBooleanType stringBooleanType2, long j, long j2, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull StringBooleanType stringBooleanType3, @NotNull List<CompactTagData> list, @NotNull ChainInfoData chainInfoData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(stringBooleanType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(stringBooleanType2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(stringBooleanType3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(chainInfoData, "");
        this.alias = str;
        this.hasAlias = stringBooleanType;
        this.targetAddress = str2;
        this.walletAddress = str3;
        this.isFollowing = stringBooleanType2;
        this.collectTime = j;
        this.lastTxTime = j2;
        this.sevenDayPnl = str4;
        this.sevenDayPnlPercentage = str5;
        this.sevenDayTxs = str6;
        this.nativeTokenAmount = str7;
        this.hasAlert = stringBooleanType3;
        this.newTagList = list;
        this.chainInfo = chainInfoData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00be: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r41v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.StringBooleanType:?: TERNARY null = ((wrap:int:0x000c: ARITH (r41v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: SGET  A[WRAPPED] (LINE:13) com.okinc.business.market.common.constants.StringBooleanType.FALSE com.okinc.business.market.common.constants.StringBooleanType) : (r26v0 com.okinc.business.market.common.constants.StringBooleanType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r41v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r41v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.StringBooleanType:?: TERNARY null = ((wrap:int:0x0025: ARITH (r41v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0029: SGET  A[WRAPPED] (LINE:19) com.okinc.business.market.common.constants.StringBooleanType.FALSE com.okinc.business.market.common.constants.StringBooleanType) : (r29v0 com.okinc.business.market.common.constants.StringBooleanType))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002e: ARITH (r41v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r30v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0038: ARITH (r41v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r32v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r41v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r41v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r41v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r41v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r37v0 java.lang.String) : (""))
  (wrap:com.okinc.business.market.common.constants.StringBooleanType:?: TERNARY null = ((wrap:int:0x005e: ARITH (r41v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0062: SGET  A[WRAPPED] (LINE:33) com.okinc.business.market.common.constants.StringBooleanType.FALSE com.okinc.business.market.common.constants.StringBooleanType) : (r38v0 com.okinc.business.market.common.constants.StringBooleanType))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0067: ARITH (r41v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:35)) : (r39v0 java.util.List))
  (wrap:com.okinc.business.market.data.model.common.ChainInfoData:?: TERNARY null = ((wrap:int:0x0072: ARITH (r41v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x009a: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.market.common.constants.StringBooleanType:?: CAST (com.okinc.business.market.common.constants.StringBooleanType) (null com.okinc.business.market.common.constants.StringBooleanType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (63 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.StringBooleanType, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:37) call: com.okinc.business.market.data.model.common.ChainInfoData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.StringBooleanType, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r40v0 com.okinc.business.market.data.model.common.ChainInfoData))
 A[MD:(java.lang.String, com.okinc.business.market.common.constants.StringBooleanType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.StringBooleanType, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.StringBooleanType, java.util.List<com.okinc.business.market.data.model.CompactTagData>, com.okinc.business.market.data.model.common.ChainInfoData):void (m)] (LINE:9) call: com.okinc.business.market.data.model.TrackingAddressData.<init>(java.lang.String, com.okinc.business.market.common.constants.StringBooleanType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.StringBooleanType, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.StringBooleanType, java.util.List, com.okinc.business.market.data.model.common.ChainInfoData):void type: THIS */
    public /* synthetic */ TrackingAddressData(String str, StringBooleanType stringBooleanType, String str2, String str3, StringBooleanType stringBooleanType2, long j, long j2, String str4, String str5, String str6, String str7, StringBooleanType stringBooleanType3, List list, ChainInfoData chainInfoData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? StringBooleanType.FALSE : stringBooleanType, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? StringBooleanType.FALSE : stringBooleanType2, (i & 32) != 0 ? 0L : j, (i & 64) == 0 ? j2 : 0L, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? "" : str6, (i & 1024) == 0 ? str7 : "", (i & 2048) != 0 ? StringBooleanType.FALSE : stringBooleanType3, (i & 4096) != 0 ? yDY.AhwBna() : list, (i & 8192) != 0 ? new ChainInfoData((String) null, (String) null, (String) null, (String) null, (StringBooleanType) null, (String) null, 63, (DefaultConstructorMarker) null) : chainInfoData);
    }
}

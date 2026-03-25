package com.okinc.business.market.data.model.smart_money;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.market.common.constants.RiskControlLevel;
import com.okinc.business.market.data.model.common.DexTokenMeta;
import com.okinc.business.market.data.model.common.DexTokenMeta$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class SignalData {
    public static final int $stable = 0;
    public final String addressNum;
    public final String addresses;
    public final String batchId;
    public final String batchIndex;
    public final String duration;
    public final String eventTime;
    public final String expireStatus;
    public final String holders;
    public final String id;
    public final String liquidity;
    public final String marketCap;
    public final String price;
    public final String sellRatio;
    public final String signalLabel;
    public final DexTokenMeta tokenInfo;
    public final String tokenKey;
    public final TxType trend;
    public final String volume;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, TxType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalData() {
        this((DexTokenMeta) null, (String) null, (String) null, (String) null, (TxType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 262143, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.eventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexTokenMeta AuCTel() {
        return this.tokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.sellRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.batchId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.addressNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalData OLrzqt(@NotNull DexTokenMeta dexTokenMeta, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull TxType txType, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
        Intrinsics.checkNotNullParameter(dexTokenMeta, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(txType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        return new SignalData(dexTokenMeta, str, str2, str3, txType, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.batchIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.addresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxType ejfBZ() {
        return this.trend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalData)) {
            return false;
        }
        SignalData signalData = (SignalData) obj;
        return Intrinsics.EZpvd(this.tokenInfo, signalData.tokenInfo) && Intrinsics.EZpvd((Object) this.id, (Object) signalData.id) && Intrinsics.EZpvd((Object) this.batchId, (Object) signalData.batchId) && Intrinsics.EZpvd((Object) this.batchIndex, (Object) signalData.batchIndex) && this.trend == signalData.trend && Intrinsics.EZpvd((Object) this.addressNum, (Object) signalData.addressNum) && Intrinsics.EZpvd((Object) this.addresses, (Object) signalData.addresses) && Intrinsics.EZpvd((Object) this.volume, (Object) signalData.volume) && Intrinsics.EZpvd((Object) this.price, (Object) signalData.price) && Intrinsics.EZpvd((Object) this.liquidity, (Object) signalData.liquidity) && Intrinsics.EZpvd((Object) this.marketCap, (Object) signalData.marketCap) && Intrinsics.EZpvd((Object) this.eventTime, (Object) signalData.eventTime) && Intrinsics.EZpvd((Object) this.duration, (Object) signalData.duration) && Intrinsics.EZpvd((Object) this.holders, (Object) signalData.holders) && Intrinsics.EZpvd((Object) this.sellRatio, (Object) signalData.sellRatio) && Intrinsics.EZpvd((Object) this.expireStatus, (Object) signalData.expireStatus) && Intrinsics.EZpvd((Object) this.signalLabel, (Object) signalData.signalLabel) && Intrinsics.EZpvd((Object) this.tokenKey, (Object) signalData.tokenKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.tokenKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fJNWhG() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.holders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.tokenInfo.hashCode() * 31) + this.id.hashCode()) * 31) + this.batchId.hashCode()) * 31) + this.batchIndex.hashCode()) * 31) + this.trend.hashCode()) * 31) + this.addressNum.hashCode()) * 31) + this.addresses.hashCode()) * 31) + this.volume.hashCode()) * 31) + this.price.hashCode()) * 31) + this.liquidity.hashCode()) * 31) + this.marketCap.hashCode()) * 31) + this.eventTime.hashCode()) * 31) + this.duration.hashCode()) * 31) + this.holders.hashCode()) * 31) + this.sellRatio.hashCode()) * 31) + this.expireStatus.hashCode()) * 31) + this.signalLabel.hashCode()) * 31) + this.tokenKey.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.signalLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalData(tokenInfo=" + this.tokenInfo + ", id=" + this.id + ", batchId=" + this.batchId + ", batchIndex=" + this.batchIndex + ", trend=" + this.trend + ", addressNum=" + this.addressNum + ", addresses=" + this.addresses + ", volume=" + this.volume + ", price=" + this.price + ", liquidity=" + this.liquidity + ", marketCap=" + this.marketCap + ", eventTime=" + this.eventTime + ", duration=" + this.duration + ", holders=" + this.holders + ", sellRatio=" + this.sellRatio + ", expireStatus=" + this.expireStatus + ", signalLabel=" + this.signalLabel + ", tokenKey=" + this.tokenKey + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.expireStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.marketCap;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.smart_money.SignalData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalData> serializer() {
            return SignalData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalData(int i, DexTokenMeta dexTokenMeta, String str, String str2, String str3, TxType txType, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, SerializationConstructorMarker serializationConstructorMarker) {
        this.tokenInfo = (i & 1) == 0 ? new DexTokenMeta((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (RiskControlLevel) null, 0L, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null) : dexTokenMeta;
        if ((i & 2) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 4) == 0) {
            this.batchId = "";
        } else {
            this.batchId = str2;
        }
        if ((i & 8) == 0) {
            this.batchIndex = "";
        } else {
            this.batchIndex = str3;
        }
        this.trend = (i & 16) == 0 ? TxType.ALL : txType;
        if ((i & 32) == 0) {
            this.addressNum = "0";
        } else {
            this.addressNum = str4;
        }
        if ((i & 64) == 0) {
            this.addresses = "";
        } else {
            this.addresses = str5;
        }
        if ((i & 128) == 0) {
            this.volume = "0";
        } else {
            this.volume = str6;
        }
        if ((i & 256) == 0) {
            this.price = "0";
        } else {
            this.price = str7;
        }
        if ((i & 512) == 0) {
            this.liquidity = "0";
        } else {
            this.liquidity = str8;
        }
        if ((i & 1024) == 0) {
            this.marketCap = "0";
        } else {
            this.marketCap = str9;
        }
        if ((i & 2048) == 0) {
            this.eventTime = "";
        } else {
            this.eventTime = str10;
        }
        if ((i & 4096) == 0) {
            this.duration = "";
        } else {
            this.duration = str11;
        }
        if ((i & 8192) == 0) {
            this.holders = "";
        } else {
            this.holders = str12;
        }
        if ((i & 16384) == 0) {
            this.sellRatio = "";
        } else {
            this.sellRatio = str13;
        }
        if ((32768 & i) == 0) {
            this.expireStatus = "";
        } else {
            this.expireStatus = str14;
        }
        if ((65536 & i) == 0) {
            this.signalLabel = "";
        } else {
            this.signalLabel = str15;
        }
        if ((i & 131072) == 0) {
            this.tokenKey = "";
        } else {
            this.tokenKey = str16;
        }
    }

    public static final /* synthetic */ void OLrzqt(SignalData signalData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(signalData.tokenInfo, new DexTokenMeta((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (RiskControlLevel) null, 0L, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, DexTokenMeta$$serializer.INSTANCE, signalData.tokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) signalData.id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, signalData.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) signalData.batchId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, signalData.batchId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) signalData.batchIndex, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, signalData.batchIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || signalData.trend != TxType.ALL) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], signalData.trend);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) signalData.addressNum, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, signalData.addressNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) signalData.addresses, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, signalData.addresses);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) signalData.volume, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, signalData.volume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) signalData.price, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, signalData.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) signalData.liquidity, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, signalData.liquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) signalData.marketCap, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, signalData.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) signalData.eventTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, signalData.eventTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) signalData.duration, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, signalData.duration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) signalData.holders, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, signalData.holders);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) signalData.sellRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, signalData.sellRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) signalData.expireStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, signalData.expireStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) signalData.signalLabel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, signalData.signalLabel);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) && Intrinsics.EZpvd((Object) signalData.tokenKey, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 17, signalData.tokenKey);
    }

    public SignalData(@NotNull DexTokenMeta dexTokenMeta, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull TxType txType, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
        Intrinsics.checkNotNullParameter(dexTokenMeta, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(txType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        this.tokenInfo = dexTokenMeta;
        this.id = str;
        this.batchId = str2;
        this.batchIndex = str3;
        this.trend = txType;
        this.addressNum = str4;
        this.addresses = str5;
        this.volume = str6;
        this.price = str7;
        this.liquidity = str8;
        this.marketCap = str9;
        this.eventTime = str10;
        this.duration = str11;
        this.holders = str12;
        this.sellRatio = str13;
        this.expireStatus = str14;
        this.signalLabel = str15;
        this.tokenKey = str16;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00db: CONSTRUCTOR 
  (wrap:com.okinc.business.market.data.model.common.DexTokenMeta:?: TERNARY null = ((wrap:int:0x0002: ARITH (r38v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.market.common.constants.RiskControlLevel:?: CAST (com.okinc.business.market.common.constants.RiskControlLevel) (null com.okinc.business.market.common.constants.RiskControlLevel))
  (0 long)
  (wrap:int:0x0012: SGET  A[WRAPPED] androidx.core.app.FrameMetricsAggregator.EVERY_DURATION int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.RiskControlLevel, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:12) call: com.okinc.business.market.data.model.common.DexTokenMeta.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.RiskControlLevel, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r20v0 com.okinc.business.market.data.model.common.DexTokenMeta))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r38v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r38v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r38v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.txs.TxType:?: TERNARY null = ((wrap:int:0x0036: ARITH (r38v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003a: SGET  A[WRAPPED] (LINE:20) com.okinc.business.dexlogic.txs.TxType.ALL com.okinc.business.dexlogic.txs.TxType) : (r24v0 com.okinc.business.dexlogic.txs.TxType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r38v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("0") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r38v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r38v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("0") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r38v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("0") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0061: ARITH (r38v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("0") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0069: ARITH (r38v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.String) : ("0"))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0070: ARITH (r38v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0078: ARITH (r38v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0080: ARITH (r38v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008a: ARITH (r38v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0096: ARITH (r38v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a1: ARITH (r38v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ac: ARITH (r38v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
 A[MD:(com.okinc.business.market.data.model.common.DexTokenMeta, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.txs.TxType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.business.market.data.model.smart_money.SignalData.<init>(com.okinc.business.market.data.model.common.DexTokenMeta, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.txs.TxType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SignalData(DexTokenMeta dexTokenMeta, String str, String str2, String str3, TxType txType, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new DexTokenMeta((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (RiskControlLevel) null, 0L, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null) : dexTokenMeta, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? TxType.ALL : txType, (i & 32) != 0 ? "0" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "0" : str6, (i & 256) != 0 ? "0" : str7, (i & 512) != 0 ? "0" : str8, (i & 1024) == 0 ? str9 : "0", (i & 2048) != 0 ? "" : str10, (i & 4096) != 0 ? "" : str11, (i & 8192) != 0 ? "" : str12, (i & 16384) != 0 ? "" : str13, (i & 32768) != 0 ? "" : str14, (i & 65536) != 0 ? "" : str15, (i & 131072) != 0 ? "" : str16);
    }
}

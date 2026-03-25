package com.okinc.business.market.features.scanner.surge.signal.data;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class GemItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String firstSignalTime;
    public final String gemsType;
    public final String maxIncreaseMultiplier;
    public final String maxIncreasePercent;
    public final String timestamp;
    public final String tokenChainId;
    public final String tokenContractAddress;
    public final String tokenLogoUrl;
    public final String tokenSymbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GemItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.maxIncreaseMultiplier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.firstSignalTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.maxIncreasePercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GemItem copydefault(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        return new GemItem(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.gemsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GemItem)) {
            return false;
        }
        GemItem gemItem = (GemItem) obj;
        return Intrinsics.EZpvd((Object) this.tokenChainId, (Object) gemItem.tokenChainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) gemItem.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) gemItem.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) gemItem.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.gemsType, (Object) gemItem.gemsType) && Intrinsics.EZpvd((Object) this.timestamp, (Object) gemItem.timestamp) && Intrinsics.EZpvd((Object) this.maxIncreasePercent, (Object) gemItem.maxIncreasePercent) && Intrinsics.EZpvd((Object) this.maxIncreaseMultiplier, (Object) gemItem.maxIncreaseMultiplier) && Intrinsics.EZpvd((Object) this.firstSignalTime, (Object) gemItem.firstSignalTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.tokenChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.tokenChainId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tokenContractAddress;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tokenSymbol;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tokenLogoUrl;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.gemsType;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.timestamp;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.maxIncreasePercent;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.maxIncreaseMultiplier;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.firstSignalTime;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GemItem(tokenChainId=" + this.tokenChainId + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenSymbol=" + this.tokenSymbol + ", tokenLogoUrl=" + this.tokenLogoUrl + ", gemsType=" + this.gemsType + ", timestamp=" + this.timestamp + ", maxIncreasePercent=" + this.maxIncreasePercent + ", maxIncreaseMultiplier=" + this.maxIncreaseMultiplier + ", firstSignalTime=" + this.firstSignalTime + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.scanner.surge.signal.data.GemItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GemItem> serializer() {
            return GemItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GemItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tokenChainId = null;
        } else {
            this.tokenChainId = str;
        }
        if ((i & 2) == 0) {
            this.tokenContractAddress = null;
        } else {
            this.tokenContractAddress = str2;
        }
        if ((i & 4) == 0) {
            this.tokenSymbol = null;
        } else {
            this.tokenSymbol = str3;
        }
        if ((i & 8) == 0) {
            this.tokenLogoUrl = null;
        } else {
            this.tokenLogoUrl = str4;
        }
        if ((i & 16) == 0) {
            this.gemsType = null;
        } else {
            this.gemsType = str5;
        }
        if ((i & 32) == 0) {
            this.timestamp = null;
        } else {
            this.timestamp = str6;
        }
        if ((i & 64) == 0) {
            this.maxIncreasePercent = null;
        } else {
            this.maxIncreasePercent = str7;
        }
        if ((i & 128) == 0) {
            this.maxIncreaseMultiplier = null;
        } else {
            this.maxIncreaseMultiplier = str8;
        }
        if ((i & 256) == 0) {
            this.firstSignalTime = null;
        } else {
            this.firstSignalTime = str9;
        }
    }

    public static final /* synthetic */ void AEQbTJ(GemItem gemItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || gemItem.tokenChainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, gemItem.tokenChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || gemItem.tokenContractAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, gemItem.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || gemItem.tokenSymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, gemItem.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || gemItem.tokenLogoUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, gemItem.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || gemItem.gemsType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, gemItem.gemsType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || gemItem.timestamp != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, gemItem.timestamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || gemItem.maxIncreasePercent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, gemItem.maxIncreasePercent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || gemItem.maxIncreaseMultiplier != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, gemItem.maxIncreaseMultiplier);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && gemItem.firstSignalTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, gemItem.firstSignalTime);
    }

    public GemItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.tokenChainId = str;
        this.tokenContractAddress = str2;
        this.tokenSymbol = str3;
        this.tokenLogoUrl = str4;
        this.gemsType = str5;
        this.timestamp = str6;
        this.maxIncreasePercent = str7;
        this.maxIncreaseMultiplier = str8;
        this.firstSignalTime = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:29) call: com.okinc.business.market.features.scanner.surge.signal.data.GemItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ GemItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) == 0 ? str9 : null);
    }
}

package com.okinc.business.market.data.model.common;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.market.common.constants.RiskControlLevel;
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
public final class DexTokenMeta {
    public static final int $stable = 0;
    public final String chainBWLogoUrl;
    public final String chainId;
    public final String chainLogo;
    public final RiskControlLevel riskControlLevel;
    public final String tokenContractAddress;
    public final long tokenCreationTime;
    public final String tokenLogoUrl;
    public final String tokenName;
    public final String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, RiskControlLevel.Companion.serializer(), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexTokenMeta() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (RiskControlLevel) null, 0L, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexTokenMeta AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull RiskControlLevel riskControlLevel, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(riskControlLevel, "");
        return new DexTokenMeta(str, str2, str3, str4, str5, str6, str7, riskControlLevel, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AYXKKw() {
        return this.tokenCreationTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.chainBWLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexTokenMeta)) {
            return false;
        }
        DexTokenMeta dexTokenMeta = (DexTokenMeta) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) dexTokenMeta.chainId) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) dexTokenMeta.chainLogo) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) dexTokenMeta.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) dexTokenMeta.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.tokenName, (Object) dexTokenMeta.tokenName) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) dexTokenMeta.tokenSymbol) && Intrinsics.EZpvd((Object) this.chainBWLogoUrl, (Object) dexTokenMeta.chainBWLogoUrl) && this.riskControlLevel == dexTokenMeta.riskControlLevel && this.tokenCreationTime == dexTokenMeta.tokenCreationTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.chainId.hashCode() * 31) + this.chainLogo.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.tokenLogoUrl.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.chainBWLogoUrl.hashCode()) * 31) + this.riskControlLevel.hashCode()) * 31) + Long.hashCode(this.tokenCreationTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexTokenMeta(chainId=" + this.chainId + ", chainLogo=" + this.chainLogo + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenLogoUrl=" + this.tokenLogoUrl + ", tokenName=" + this.tokenName + ", tokenSymbol=" + this.tokenSymbol + ", chainBWLogoUrl=" + this.chainBWLogoUrl + ", riskControlLevel=" + this.riskControlLevel + ", tokenCreationTime=" + this.tokenCreationTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.tokenLogoUrl;
    }

    public /* synthetic */ DexTokenMeta(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, RiskControlLevel riskControlLevel, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.chainLogo = "";
        } else {
            this.chainLogo = str2;
        }
        if ((i & 4) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str3;
        }
        if ((i & 8) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str4;
        }
        if ((i & 16) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str5;
        }
        if ((i & 32) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str6;
        }
        if ((i & 64) == 0) {
            this.chainBWLogoUrl = "";
        } else {
            this.chainBWLogoUrl = str7;
        }
        if ((i & 128) == 0) {
            this.riskControlLevel = RiskControlLevel.UNKNOWN;
        } else {
            this.riskControlLevel = riskControlLevel;
        }
        if ((i & 256) == 0) {
            this.tokenCreationTime = 0L;
        } else {
            this.tokenCreationTime = j;
        }
    }

    public static final /* synthetic */ void KWHzl(DexTokenMeta dexTokenMeta, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexTokenMeta.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexTokenMeta.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dexTokenMeta.chainLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dexTokenMeta.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dexTokenMeta.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dexTokenMeta.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dexTokenMeta.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dexTokenMeta.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dexTokenMeta.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dexTokenMeta.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dexTokenMeta.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dexTokenMeta.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) dexTokenMeta.chainBWLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, dexTokenMeta.chainBWLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || dexTokenMeta.riskControlLevel != RiskControlLevel.UNKNOWN) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], dexTokenMeta.riskControlLevel);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && dexTokenMeta.tokenCreationTime == 0) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 8, dexTokenMeta.tokenCreationTime);
    }

    public DexTokenMeta(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull RiskControlLevel riskControlLevel, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(riskControlLevel, "");
        this.chainId = str;
        this.chainLogo = str2;
        this.tokenContractAddress = str3;
        this.tokenLogoUrl = str4;
        this.tokenName = str5;
        this.tokenSymbol = str6;
        this.chainBWLogoUrl = str7;
        this.riskControlLevel = riskControlLevel;
        this.tokenCreationTime = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0059: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:com.okinc.business.market.common.constants.RiskControlLevel:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003b: SGET  A[WRAPPED] (LINE:25) com.okinc.business.market.common.constants.RiskControlLevel.UNKNOWN com.okinc.business.market.common.constants.RiskControlLevel) : (r19v0 com.okinc.business.market.common.constants.RiskControlLevel))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r20v0 long))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.RiskControlLevel, long):void (m)] (LINE:9) call: com.okinc.business.market.data.model.common.DexTokenMeta.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.RiskControlLevel, long):void type: THIS */
    public /* synthetic */ DexTokenMeta(String str, String str2, String str3, String str4, String str5, String str6, String str7, RiskControlLevel riskControlLevel, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str7 : "", (i & 128) != 0 ? RiskControlLevel.UNKNOWN : riskControlLevel, (i & 256) != 0 ? 0L : j);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.common.DexTokenMeta.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DexTokenMeta> serializer() {
            return DexTokenMeta$$serializer.INSTANCE;
        }

        public final DexTokenMeta OLrzqt(@NotNull TokenInfo tokenInfo) {
            Intrinsics.checkNotNullParameter(tokenInfo, "");
            return new DexTokenMeta(tokenInfo.EZpvd(), tokenInfo.KWHzl(), tokenInfo.isConnected(), tokenInfo.DbNXlk(), tokenInfo.fetchVPNInfo(), tokenInfo.AkhnZx(), tokenInfo.OLrzqt(), (RiskControlLevel) null, tokenInfo.values(), 128, (DefaultConstructorMarker) null);
        }
    }
}

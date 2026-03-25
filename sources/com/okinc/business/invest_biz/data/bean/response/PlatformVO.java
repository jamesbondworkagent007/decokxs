package com.okinc.business.invest_biz.data.bean.response;

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
public final class PlatformVO {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final long analysisPlatformId;
    public final long chainId;
    public final String currencyAmount;
    public final int investmentCount;
    public final boolean isSupportInvest;
    public final String network;
    public final String networkLogo;
    public final String platformLogo;
    public final String platformName;
    public final String platformUrl;
    public final String totalEarnings;
    public final String warnInfo;
    public final String yesterdayProfit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlatformVO() {
        this(0L, 0L, (String) null, 0, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.investmentCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.platformLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.isSupportInvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformVO OLrzqt(long j, long j2, @NotNull String str, int i, boolean z, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new PlatformVO(j, j2, str, i, z, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformVO)) {
            return false;
        }
        PlatformVO platformVO = (PlatformVO) obj;
        return this.analysisPlatformId == platformVO.analysisPlatformId && this.chainId == platformVO.chainId && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) platformVO.currencyAmount) && this.investmentCount == platformVO.investmentCount && this.isSupportInvest == platformVO.isSupportInvest && Intrinsics.EZpvd((Object) this.network, (Object) platformVO.network) && Intrinsics.EZpvd((Object) this.networkLogo, (Object) platformVO.networkLogo) && Intrinsics.EZpvd((Object) this.platformLogo, (Object) platformVO.platformLogo) && Intrinsics.EZpvd((Object) this.platformName, (Object) platformVO.platformName) && Intrinsics.EZpvd((Object) this.platformUrl, (Object) platformVO.platformUrl) && Intrinsics.EZpvd((Object) this.warnInfo, (Object) platformVO.warnInfo) && Intrinsics.EZpvd((Object) this.yesterdayProfit, (Object) platformVO.yesterdayProfit) && Intrinsics.EZpvd((Object) this.totalEarnings, (Object) platformVO.totalEarnings);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.totalEarnings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((Long.hashCode(this.analysisPlatformId) * 31) + Long.hashCode(this.chainId)) * 31) + this.currencyAmount.hashCode()) * 31) + Integer.hashCode(this.investmentCount)) * 31) + Boolean.hashCode(this.isSupportInvest)) * 31) + this.network.hashCode()) * 31) + this.networkLogo.hashCode()) * 31) + this.platformLogo.hashCode()) * 31) + this.platformName.hashCode()) * 31) + this.platformUrl.hashCode()) * 31) + this.warnInfo.hashCode()) * 31) + this.yesterdayProfit.hashCode()) * 31) + this.totalEarnings.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.yesterdayProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PlatformVO(analysisPlatformId=" + this.analysisPlatformId + ", chainId=" + this.chainId + ", currencyAmount=" + this.currencyAmount + ", investmentCount=" + this.investmentCount + ", isSupportInvest=" + this.isSupportInvest + ", network=" + this.network + ", networkLogo=" + this.networkLogo + ", platformLogo=" + this.platformLogo + ", platformName=" + this.platformName + ", platformUrl=" + this.platformUrl + ", warnInfo=" + this.warnInfo + ", yesterdayProfit=" + this.yesterdayProfit + ", totalEarnings=" + this.totalEarnings + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.platformUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.warnInfo;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.PlatformVO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PlatformVO> serializer() {
            return PlatformVO$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PlatformVO(int i, long j, long j2, String str, int i2, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.analysisPlatformId = 0L;
        } else {
            this.analysisPlatformId = j;
        }
        if ((i & 2) == 0) {
            this.chainId = 0L;
        } else {
            this.chainId = j2;
        }
        if ((i & 4) == 0) {
            this.currencyAmount = "";
        } else {
            this.currencyAmount = str;
        }
        if ((i & 8) == 0) {
            this.investmentCount = 0;
        } else {
            this.investmentCount = i2;
        }
        if ((i & 16) == 0) {
            this.isSupportInvest = false;
        } else {
            this.isSupportInvest = z;
        }
        if ((i & 32) == 0) {
            this.network = "";
        } else {
            this.network = str2;
        }
        if ((i & 64) == 0) {
            this.networkLogo = "";
        } else {
            this.networkLogo = str3;
        }
        if ((i & 128) == 0) {
            this.platformLogo = "";
        } else {
            this.platformLogo = str4;
        }
        if ((i & 256) == 0) {
            this.platformName = "";
        } else {
            this.platformName = str5;
        }
        if ((i & 512) == 0) {
            this.platformUrl = "";
        } else {
            this.platformUrl = str6;
        }
        if ((i & 1024) == 0) {
            this.warnInfo = "";
        } else {
            this.warnInfo = str7;
        }
        if ((i & 2048) == 0) {
            this.yesterdayProfit = "";
        } else {
            this.yesterdayProfit = str8;
        }
        if ((i & 4096) == 0) {
            this.totalEarnings = "";
        } else {
            this.totalEarnings = str9;
        }
    }

    public static final /* synthetic */ void AEQbTJ(PlatformVO platformVO, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || platformVO.analysisPlatformId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, platformVO.analysisPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || platformVO.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, platformVO.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) platformVO.currencyAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, platformVO.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || platformVO.investmentCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, platformVO.investmentCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || platformVO.isSupportInvest) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, platformVO.isSupportInvest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) platformVO.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, platformVO.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) platformVO.networkLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, platformVO.networkLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) platformVO.platformLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, platformVO.platformLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) platformVO.platformName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, platformVO.platformName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) platformVO.platformUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, platformVO.platformUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) platformVO.warnInfo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, platformVO.warnInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) platformVO.yesterdayProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, platformVO.yesterdayProfit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd((Object) platformVO.totalEarnings, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 12, platformVO.totalEarnings);
    }

    public PlatformVO(long j, long j2, @NotNull String str, int i, boolean z, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.analysisPlatformId = j;
        this.chainId = j2;
        this.currencyAmount = str;
        this.investmentCount = i;
        this.isSupportInvest = z;
        this.network = str2;
        this.networkLogo = str3;
        this.platformLogo = str4;
        this.platformName = str5;
        this.platformUrl = str6;
        this.warnInfo = str7;
        this.yesterdayProfit = str8;
        this.totalEarnings = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0088: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r17v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r19v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001d: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r22v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r32v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r23v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.String) : (""))
 A[MD:(long, long, java.lang.String, int, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:130) call: com.okinc.business.invest_biz.data.bean.response.PlatformVO.<init>(long, long, java.lang.String, int, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PlatformVO(long j, long j2, String str, int i, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) == 0 ? j2 : 0L, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? 0 : i, (i2 & 16) == 0 ? z : false, (i2 & 32) != 0 ? "" : str2, (i2 & 64) != 0 ? "" : str3, (i2 & 128) != 0 ? "" : str4, (i2 & 256) != 0 ? "" : str5, (i2 & 512) != 0 ? "" : str6, (i2 & 1024) != 0 ? "" : str7, (i2 & 2048) != 0 ? "" : str8, (i2 & 4096) == 0 ? str9 : "");
    }
}

package com.okinc.dexkline.market.data.model.position_pnl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class LatestPnLData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String averageBuy;
    public final String averageSell;
    public final String balance;
    public final String balanceUsd;
    public final String boughtVolume;
    public final String currentProfit;
    public final String currentProfitPercentage;
    public final boolean isPnlSupported;
    public final String realizedProfit;
    public final String realizedProfitPercentage;
    public final String soldVolume;
    public final String spotBalance;
    public final String unrealizedProfit;
    public final String unrealizedProfitPercentage;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LatestPnLData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.averageSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.spotBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.unrealizedProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.isPnlSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.currentProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.currentProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.averageBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LatestPnLData copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
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
        Intrinsics.checkNotNullParameter(str13, "");
        return new LatestPnLData(str, str2, str3, str4, str5, str6, str7, z, str8, str9, str10, str11, str12, str13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.boughtVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.soldVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatestPnLData)) {
            return false;
        }
        LatestPnLData latestPnLData = (LatestPnLData) obj;
        return Intrinsics.EZpvd((Object) this.averageBuy, (Object) latestPnLData.averageBuy) && Intrinsics.EZpvd((Object) this.averageSell, (Object) latestPnLData.averageSell) && Intrinsics.EZpvd((Object) this.balance, (Object) latestPnLData.balance) && Intrinsics.EZpvd((Object) this.balanceUsd, (Object) latestPnLData.balanceUsd) && Intrinsics.EZpvd((Object) this.boughtVolume, (Object) latestPnLData.boughtVolume) && Intrinsics.EZpvd((Object) this.currentProfit, (Object) latestPnLData.currentProfit) && Intrinsics.EZpvd((Object) this.currentProfitPercentage, (Object) latestPnLData.currentProfitPercentage) && this.isPnlSupported == latestPnLData.isPnlSupported && Intrinsics.EZpvd((Object) this.realizedProfit, (Object) latestPnLData.realizedProfit) && Intrinsics.EZpvd((Object) this.realizedProfitPercentage, (Object) latestPnLData.realizedProfitPercentage) && Intrinsics.EZpvd((Object) this.soldVolume, (Object) latestPnLData.soldVolume) && Intrinsics.EZpvd((Object) this.spotBalance, (Object) latestPnLData.spotBalance) && Intrinsics.EZpvd((Object) this.unrealizedProfit, (Object) latestPnLData.unrealizedProfit) && Intrinsics.EZpvd((Object) this.unrealizedProfitPercentage, (Object) latestPnLData.unrealizedProfitPercentage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.realizedProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((this.averageBuy.hashCode() * 31) + this.averageSell.hashCode()) * 31) + this.balance.hashCode()) * 31) + this.balanceUsd.hashCode()) * 31) + this.boughtVolume.hashCode()) * 31) + this.currentProfit.hashCode()) * 31) + this.currentProfitPercentage.hashCode()) * 31) + Boolean.hashCode(this.isPnlSupported)) * 31) + this.realizedProfit.hashCode()) * 31) + this.realizedProfitPercentage.hashCode()) * 31) + this.soldVolume.hashCode()) * 31) + this.spotBalance.hashCode()) * 31) + this.unrealizedProfit.hashCode()) * 31) + this.unrealizedProfitPercentage.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.unrealizedProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LatestPnLData(averageBuy=" + this.averageBuy + ", averageSell=" + this.averageSell + ", balance=" + this.balance + ", balanceUsd=" + this.balanceUsd + ", boughtVolume=" + this.boughtVolume + ", currentProfit=" + this.currentProfit + ", currentProfitPercentage=" + this.currentProfitPercentage + ", isPnlSupported=" + this.isPnlSupported + ", realizedProfit=" + this.realizedProfit + ", realizedProfitPercentage=" + this.realizedProfitPercentage + ", soldVolume=" + this.soldVolume + ", spotBalance=" + this.spotBalance + ", unrealizedProfit=" + this.unrealizedProfit + ", unrealizedProfitPercentage=" + this.unrealizedProfitPercentage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.realizedProfit;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.data.model.position_pnl.LatestPnLData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LatestPnLData> serializer() {
            return LatestPnLData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LatestPnLData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.averageBuy = "";
        } else {
            this.averageBuy = str;
        }
        if ((i & 2) == 0) {
            this.averageSell = "";
        } else {
            this.averageSell = str2;
        }
        if ((i & 4) == 0) {
            this.balance = "";
        } else {
            this.balance = str3;
        }
        if ((i & 8) == 0) {
            this.balanceUsd = "";
        } else {
            this.balanceUsd = str4;
        }
        if ((i & 16) == 0) {
            this.boughtVolume = "";
        } else {
            this.boughtVolume = str5;
        }
        if ((i & 32) == 0) {
            this.currentProfit = "";
        } else {
            this.currentProfit = str6;
        }
        if ((i & 64) == 0) {
            this.currentProfitPercentage = "";
        } else {
            this.currentProfitPercentage = str7;
        }
        this.isPnlSupported = (i & 128) == 0 ? false : z;
        if ((i & 256) == 0) {
            this.realizedProfit = "";
        } else {
            this.realizedProfit = str8;
        }
        if ((i & 512) == 0) {
            this.realizedProfitPercentage = "";
        } else {
            this.realizedProfitPercentage = str9;
        }
        if ((i & 1024) == 0) {
            this.soldVolume = "";
        } else {
            this.soldVolume = str10;
        }
        if ((i & 2048) == 0) {
            this.spotBalance = "";
        } else {
            this.spotBalance = str11;
        }
        if ((i & 4096) == 0) {
            this.unrealizedProfit = "";
        } else {
            this.unrealizedProfit = str12;
        }
        if ((i & 8192) == 0) {
            this.unrealizedProfitPercentage = "";
        } else {
            this.unrealizedProfitPercentage = str13;
        }
    }

    public static final /* synthetic */ void AEQbTJ(LatestPnLData latestPnLData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) latestPnLData.averageBuy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, latestPnLData.averageBuy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) latestPnLData.averageSell, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, latestPnLData.averageSell);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) latestPnLData.balance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, latestPnLData.balance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) latestPnLData.balanceUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, latestPnLData.balanceUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) latestPnLData.boughtVolume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, latestPnLData.boughtVolume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) latestPnLData.currentProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, latestPnLData.currentProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) latestPnLData.currentProfitPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, latestPnLData.currentProfitPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || latestPnLData.isPnlSupported) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, latestPnLData.isPnlSupported);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) latestPnLData.realizedProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, latestPnLData.realizedProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) latestPnLData.realizedProfitPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, latestPnLData.realizedProfitPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) latestPnLData.soldVolume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, latestPnLData.soldVolume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) latestPnLData.spotBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, latestPnLData.spotBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) latestPnLData.unrealizedProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, latestPnLData.unrealizedProfit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd((Object) latestPnLData.unrealizedProfitPercentage, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 13, latestPnLData.unrealizedProfitPercentage);
    }

    public LatestPnLData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
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
        Intrinsics.checkNotNullParameter(str13, "");
        this.averageBuy = str;
        this.averageSell = str2;
        this.balance = str3;
        this.balanceUsd = str4;
        this.boughtVolume = str5;
        this.currentProfit = str6;
        this.currentProfitPercentage = str7;
        this.isPnlSupported = z;
        this.realizedProfit = str8;
        this.realizedProfitPercentage = str9;
        this.soldVolume = str10;
        this.spotBalance = str11;
        this.unrealizedProfit = str12;
        this.unrealizedProfitPercentage = str13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0091: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003c: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.dexkline.market.data.model.position_pnl.LatestPnLData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LatestPnLData(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? false : z, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) == 0 ? str13 : "");
    }
}

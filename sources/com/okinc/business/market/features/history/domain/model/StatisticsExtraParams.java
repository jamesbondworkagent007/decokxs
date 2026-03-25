package com.okinc.business.market.features.history.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class StatisticsExtraParams {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String chainId;
    public final String tokenAddress;
    public final String walletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StatisticsExtraParams() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StatisticsExtraParams copy$default(StatisticsExtraParams statisticsExtraParams, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statisticsExtraParams.chainId;
        }
        if ((i & 2) != 0) {
            str2 = statisticsExtraParams.tokenAddress;
        }
        if ((i & 4) != 0) {
            str3 = statisticsExtraParams.walletAddress;
        }
        return statisticsExtraParams.KWHzl(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatisticsExtraParams KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new StatisticsExtraParams(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatisticsExtraParams)) {
            return false;
        }
        StatisticsExtraParams statisticsExtraParams = (StatisticsExtraParams) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) statisticsExtraParams.chainId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) statisticsExtraParams.tokenAddress) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) statisticsExtraParams.walletAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.chainId.hashCode() * 31) + this.tokenAddress.hashCode()) * 31) + this.walletAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StatisticsExtraParams(chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ", walletAddress=" + this.walletAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.history.domain.model.StatisticsExtraParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StatisticsExtraParams> serializer() {
            return StatisticsExtraParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StatisticsExtraParams(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str2;
        }
        if ((i & 4) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str3;
        }
    }

    public static final /* synthetic */ void OLrzqt(StatisticsExtraParams statisticsExtraParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) statisticsExtraParams.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, statisticsExtraParams.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) statisticsExtraParams.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, statisticsExtraParams.tokenAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) statisticsExtraParams.walletAddress, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, statisticsExtraParams.walletAddress);
    }

    public StatisticsExtraParams(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.chainId = str;
        this.tokenAddress = str2;
        this.walletAddress = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:29) call: com.okinc.business.market.features.history.domain.model.StatisticsExtraParams.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ StatisticsExtraParams(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}

package com.okinc.business.dex.trade.copytrading.home.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CTSubscribeRequestParam {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String accountId;
    private final String chainId;
    private final int paramType;
    private final String strategyId;
    private final int strategyMode;
    private final int timeRange;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CTSubscribeRequestParam copy$default(CTSubscribeRequestParam cTSubscribeRequestParam, String str, String str2, int i, int i2, String str3, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = cTSubscribeRequestParam.accountId;
        }
        if ((i4 & 2) != 0) {
            str2 = cTSubscribeRequestParam.strategyId;
        }
        String str4 = str2;
        if ((i4 & 4) != 0) {
            i = cTSubscribeRequestParam.strategyMode;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = cTSubscribeRequestParam.timeRange;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            str3 = cTSubscribeRequestParam.chainId;
        }
        String str5 = str3;
        if ((i4 & 32) != 0) {
            i3 = cTSubscribeRequestParam.paramType;
        }
        return cTSubscribeRequestParam.copy(str, str4, i5, i6, str5, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.timeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.paramType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTSubscribeRequestParam copy(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull String str3, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CTSubscribeRequestParam(str, str2, i, i2, str3, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CTSubscribeRequestParam)) {
            return false;
        }
        CTSubscribeRequestParam cTSubscribeRequestParam = (CTSubscribeRequestParam) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) cTSubscribeRequestParam.accountId) && Intrinsics.EZpvd((Object) this.strategyId, (Object) cTSubscribeRequestParam.strategyId) && this.strategyMode == cTSubscribeRequestParam.strategyMode && this.timeRange == cTSubscribeRequestParam.timeRange && Intrinsics.EZpvd((Object) this.chainId, (Object) cTSubscribeRequestParam.chainId) && this.paramType == cTSubscribeRequestParam.paramType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getParamType() {
        return this.paramType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyId() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStrategyMode() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTimeRange() {
        return this.timeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.accountId.hashCode() * 31) + this.strategyId.hashCode()) * 31) + Integer.hashCode(this.strategyMode)) * 31) + Integer.hashCode(this.timeRange)) * 31) + this.chainId.hashCode()) * 31) + Integer.hashCode(this.paramType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CTSubscribeRequestParam(accountId=" + this.accountId + ", strategyId=" + this.strategyId + ", strategyMode=" + this.strategyMode + ", timeRange=" + this.timeRange + ", chainId=" + this.chainId + ", paramType=" + this.paramType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.CTSubscribeRequestParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CTSubscribeRequestParam> serializer() {
            return CTSubscribeRequestParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CTSubscribeRequestParam(int i, String str, String str2, int i2, int i3, String str3, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CTSubscribeRequestParam$$serializer.INSTANCE.getDescriptor());
        }
        this.accountId = str;
        this.strategyId = str2;
        if ((i & 4) == 0) {
            this.strategyMode = 10;
        } else {
            this.strategyMode = i2;
        }
        if ((i & 8) == 0) {
            this.timeRange = 1;
        } else {
            this.timeRange = i3;
        }
        if ((i & 16) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str3;
        }
        if ((i & 32) == 0) {
            this.paramType = 1;
        } else {
            this.paramType = i4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CTSubscribeRequestParam cTSubscribeRequestParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, cTSubscribeRequestParam.accountId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, cTSubscribeRequestParam.strategyId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || cTSubscribeRequestParam.strategyMode != 10) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, cTSubscribeRequestParam.strategyMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || cTSubscribeRequestParam.timeRange != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, cTSubscribeRequestParam.timeRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) cTSubscribeRequestParam.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, cTSubscribeRequestParam.chainId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && cTSubscribeRequestParam.paramType == 1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 5, cTSubscribeRequestParam.paramType);
    }

    public CTSubscribeRequestParam(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull String str3, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.accountId = str;
        this.strategyId = str2;
        this.strategyMode = i;
        this.timeRange = i2;
        this.chainId = str3;
        this.paramType = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (wrap:int:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (10 int) : (r10v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r11v0 int))
  (wrap:java.lang.String:0x0015: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r13v0 int))
 A[MD:(java.lang.String, java.lang.String, int, int, java.lang.String, int):void (m)] (LINE:279) call: com.okinc.business.dex.trade.copytrading.home.data.CTSubscribeRequestParam.<init>(java.lang.String, java.lang.String, int, int, java.lang.String, int):void type: THIS */
    public /* synthetic */ CTSubscribeRequestParam(String str, String str2, int i, int i2, String str3, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i4 & 4) != 0 ? 10 : i, (i4 & 8) != 0 ? 1 : i2, (i4 & 16) != 0 ? "" : str3, (i4 & 32) != 0 ? 1 : i3);
    }
}

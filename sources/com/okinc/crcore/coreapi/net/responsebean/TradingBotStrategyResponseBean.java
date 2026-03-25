package com.okinc.crcore.coreapi.net.responsebean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class TradingBotStrategyResponseBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String strategyType;
    private final String userCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradingBotStrategyResponseBean() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TradingBotStrategyResponseBean copy$default(TradingBotStrategyResponseBean tradingBotStrategyResponseBean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradingBotStrategyResponseBean.strategyType;
        }
        if ((i & 2) != 0) {
            str2 = tradingBotStrategyResponseBean.userCount;
        }
        return tradingBotStrategyResponseBean.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.userCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradingBotStrategyResponseBean copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TradingBotStrategyResponseBean(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradingBotStrategyResponseBean)) {
            return false;
        }
        TradingBotStrategyResponseBean tradingBotStrategyResponseBean = (TradingBotStrategyResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.strategyType, (Object) tradingBotStrategyResponseBean.strategyType) && Intrinsics.EZpvd((Object) this.userCount, (Object) tradingBotStrategyResponseBean.userCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserCount() {
        return this.userCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.strategyType.hashCode() * 31) + this.userCount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradingBotStrategyResponseBean(strategyType=" + this.strategyType + ", userCount=" + this.userCount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.TradingBotStrategyResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradingBotStrategyResponseBean> serializer() {
            return TradingBotStrategyResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradingBotStrategyResponseBean(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.strategyType = "";
        } else {
            this.strategyType = str;
        }
        if ((i & 2) == 0) {
            this.userCount = "";
        } else {
            this.userCount = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(TradingBotStrategyResponseBean tradingBotStrategyResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tradingBotStrategyResponseBean.strategyType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tradingBotStrategyResponseBean.strategyType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) tradingBotStrategyResponseBean.userCount, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tradingBotStrategyResponseBean.userCount);
    }

    public TradingBotStrategyResponseBean(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.strategyType = str;
        this.userCount = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:17) call: com.okinc.crcore.coreapi.net.responsebean.TradingBotStrategyResponseBean.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TradingBotStrategyResponseBean(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}

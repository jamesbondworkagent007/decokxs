package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class AccountTradeConfig {
    private UserTradeConfigInfo accountConfig;
    private TradeCollateralCoinConfig collateralCoinConfig;
    private TradeInfo tradeConfig;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountTradeConfig() {
        this((UserTradeConfigInfo) null, (TradeInfo) null, (TradeCollateralCoinConfig) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AccountTradeConfig copy$default(AccountTradeConfig accountTradeConfig, UserTradeConfigInfo userTradeConfigInfo, TradeInfo tradeInfo, TradeCollateralCoinConfig tradeCollateralCoinConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            userTradeConfigInfo = accountTradeConfig.accountConfig;
        }
        if ((i & 2) != 0) {
            tradeInfo = accountTradeConfig.tradeConfig;
        }
        if ((i & 4) != 0) {
            tradeCollateralCoinConfig = accountTradeConfig.collateralCoinConfig;
        }
        return accountTradeConfig.copy(userTradeConfigInfo, tradeInfo, tradeCollateralCoinConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserTradeConfigInfo component1() {
        return this.accountConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeInfo component2() {
        return this.tradeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeCollateralCoinConfig component3() {
        return this.collateralCoinConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountTradeConfig copy(UserTradeConfigInfo userTradeConfigInfo, TradeInfo tradeInfo, TradeCollateralCoinConfig tradeCollateralCoinConfig) {
        return new AccountTradeConfig(userTradeConfigInfo, tradeInfo, tradeCollateralCoinConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountTradeConfig)) {
            return false;
        }
        AccountTradeConfig accountTradeConfig = (AccountTradeConfig) obj;
        return Intrinsics.EZpvd(this.accountConfig, accountTradeConfig.accountConfig) && Intrinsics.EZpvd(this.tradeConfig, accountTradeConfig.tradeConfig) && Intrinsics.EZpvd(this.collateralCoinConfig, accountTradeConfig.collateralCoinConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserTradeConfigInfo getAccountConfig() {
        return this.accountConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeCollateralCoinConfig getCollateralCoinConfig() {
        return this.collateralCoinConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeInfo getTradeConfig() {
        return this.tradeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        UserTradeConfigInfo userTradeConfigInfo = this.accountConfig;
        int iHashCode = userTradeConfigInfo == null ? 0 : userTradeConfigInfo.hashCode();
        TradeInfo tradeInfo = this.tradeConfig;
        int iHashCode2 = tradeInfo == null ? 0 : tradeInfo.hashCode();
        TradeCollateralCoinConfig tradeCollateralCoinConfig = this.collateralCoinConfig;
        return (((iHashCode * 31) + iHashCode2) * 31) + (tradeCollateralCoinConfig != null ? tradeCollateralCoinConfig.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountConfig(UserTradeConfigInfo userTradeConfigInfo) {
        this.accountConfig = userTradeConfigInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCollateralCoinConfig(TradeCollateralCoinConfig tradeCollateralCoinConfig) {
        this.collateralCoinConfig = tradeCollateralCoinConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeConfig(TradeInfo tradeInfo) {
        this.tradeConfig = tradeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountTradeConfig(accountConfig=" + this.accountConfig + ", tradeConfig=" + this.tradeConfig + ", collateralCoinConfig=" + this.collateralCoinConfig + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.AccountTradeConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountTradeConfig> serializer() {
            return AccountTradeConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountTradeConfig(int i, UserTradeConfigInfo userTradeConfigInfo, TradeInfo tradeInfo, TradeCollateralCoinConfig tradeCollateralCoinConfig, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accountConfig = null;
        } else {
            this.accountConfig = userTradeConfigInfo;
        }
        if ((i & 2) == 0) {
            this.tradeConfig = null;
        } else {
            this.tradeConfig = tradeInfo;
        }
        if ((i & 4) == 0) {
            this.collateralCoinConfig = null;
        } else {
            this.collateralCoinConfig = tradeCollateralCoinConfig;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AccountTradeConfig accountTradeConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || accountTradeConfig.accountConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, UserTradeConfigInfo$$serializer.INSTANCE, accountTradeConfig.accountConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || accountTradeConfig.tradeConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, TradeInfo$$serializer.INSTANCE, accountTradeConfig.tradeConfig);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && accountTradeConfig.collateralCoinConfig == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, TradeCollateralCoinConfig$$serializer.INSTANCE, accountTradeConfig.collateralCoinConfig);
    }

    public AccountTradeConfig(UserTradeConfigInfo userTradeConfigInfo, TradeInfo tradeInfo, TradeCollateralCoinConfig tradeCollateralCoinConfig) {
        this.accountConfig = userTradeConfigInfo;
        this.tradeConfig = tradeInfo;
        this.collateralCoinConfig = tradeCollateralCoinConfig;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.UserTradeConfigInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.UserTradeConfigInfo) : (r2v0 com.okinc.unify_trade.biz.UserTradeConfigInfo))
  (wrap:com.okinc.unify_trade.biz.TradeInfo:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.TradeInfo) : (r3v0 com.okinc.unify_trade.biz.TradeInfo))
  (wrap:com.okinc.unify_trade.biz.TradeCollateralCoinConfig:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.TradeCollateralCoinConfig) : (r4v0 com.okinc.unify_trade.biz.TradeCollateralCoinConfig))
 A[MD:(com.okinc.unify_trade.biz.UserTradeConfigInfo, com.okinc.unify_trade.biz.TradeInfo, com.okinc.unify_trade.biz.TradeCollateralCoinConfig):void (m)] (LINE:242) call: com.okinc.unify_trade.biz.AccountTradeConfig.<init>(com.okinc.unify_trade.biz.UserTradeConfigInfo, com.okinc.unify_trade.biz.TradeInfo, com.okinc.unify_trade.biz.TradeCollateralCoinConfig):void type: THIS */
    public /* synthetic */ AccountTradeConfig(UserTradeConfigInfo userTradeConfigInfo, TradeInfo tradeInfo, TradeCollateralCoinConfig tradeCollateralCoinConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : userTradeConfigInfo, (i & 2) != 0 ? null : tradeInfo, (i & 4) != 0 ? null : tradeCollateralCoinConfig);
    }
}

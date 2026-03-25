package com.okinc.business.dex.trade.copytrading.edit.data.model;

import com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset;
import com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset$$serializer;
import com.okinc.business.trade.features.home.ui.meme.data.FeeConfig;
import com.okinc.business.trade.features.home.ui.meme.data.RouteConfig;
import com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CopyTradingPresetConfig {
    private final BuySellPreset buyPreset;
    private final BuySellPreset sellPreset;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CopyTradingPresetConfig() {
        this((BuySellPreset) null, (BuySellPreset) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CopyTradingPresetConfig copy$default(CopyTradingPresetConfig copyTradingPresetConfig, BuySellPreset buySellPreset, BuySellPreset buySellPreset2, int i, Object obj) {
        if ((i & 1) != 0) {
            buySellPreset = copyTradingPresetConfig.buyPreset;
        }
        if ((i & 2) != 0) {
            buySellPreset2 = copyTradingPresetConfig.sellPreset;
        }
        return copyTradingPresetConfig.copy(buySellPreset, buySellPreset2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellPreset component1() {
        return this.buyPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellPreset component2() {
        return this.sellPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyTradingPresetConfig copy(@NotNull BuySellPreset buySellPreset, @NotNull BuySellPreset buySellPreset2) {
        Intrinsics.checkNotNullParameter(buySellPreset, "");
        Intrinsics.checkNotNullParameter(buySellPreset2, "");
        return new CopyTradingPresetConfig(buySellPreset, buySellPreset2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CopyTradingPresetConfig)) {
            return false;
        }
        CopyTradingPresetConfig copyTradingPresetConfig = (CopyTradingPresetConfig) obj;
        return Intrinsics.EZpvd(this.buyPreset, copyTradingPresetConfig.buyPreset) && Intrinsics.EZpvd(this.sellPreset, copyTradingPresetConfig.sellPreset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellPreset getBuyPreset() {
        return this.buyPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellPreset getSellPreset() {
        return this.sellPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.buyPreset.hashCode() * 31) + this.sellPreset.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CopyTradingPresetConfig(buyPreset=" + this.buyPreset + ", sellPreset=" + this.sellPreset + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPresetConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CopyTradingPresetConfig> serializer() {
            return CopyTradingPresetConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CopyTradingPresetConfig(int i, BuySellPreset buySellPreset, BuySellPreset buySellPreset2, SerializationConstructorMarker serializationConstructorMarker) {
        this.buyPreset = (i & 1) == 0 ? new BuySellPreset((FeeConfig) null, (RouteConfig) null, (SlippageConfigPreset) null, 7, (DefaultConstructorMarker) null) : buySellPreset;
        if ((i & 2) == 0) {
            this.sellPreset = new BuySellPreset((FeeConfig) null, (RouteConfig) null, (SlippageConfigPreset) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.sellPreset = buySellPreset2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CopyTradingPresetConfig copyTradingPresetConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(copyTradingPresetConfig.buyPreset, new BuySellPreset((FeeConfig) null, (RouteConfig) null, (SlippageConfigPreset) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, BuySellPreset$$serializer.INSTANCE, copyTradingPresetConfig.buyPreset);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(copyTradingPresetConfig.sellPreset, new BuySellPreset((FeeConfig) null, (RouteConfig) null, (SlippageConfigPreset) null, 7, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, BuySellPreset$$serializer.INSTANCE, copyTradingPresetConfig.sellPreset);
    }

    public CopyTradingPresetConfig(@NotNull BuySellPreset buySellPreset, @NotNull BuySellPreset buySellPreset2) {
        Intrinsics.checkNotNullParameter(buySellPreset, "");
        Intrinsics.checkNotNullParameter(buySellPreset2, "");
        this.buyPreset = buySellPreset;
        this.sellPreset = buySellPreset2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (wrap:com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset:0x000c: CONSTRUCTOR 
  (wrap:com.okinc.business.trade.features.home.ui.meme.data.FeeConfig:?: CAST (com.okinc.business.trade.features.home.ui.meme.data.FeeConfig) (null com.okinc.business.trade.features.home.ui.meme.data.FeeConfig))
  (wrap:com.okinc.business.trade.features.home.ui.meme.data.RouteConfig:?: CAST (com.okinc.business.trade.features.home.ui.meme.data.RouteConfig) (null com.okinc.business.trade.features.home.ui.meme.data.RouteConfig))
  (wrap:com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset:?: CAST (com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset) (null com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(com.okinc.business.trade.features.home.ui.meme.data.FeeConfig, com.okinc.business.trade.features.home.ui.meme.data.RouteConfig, com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:34) call: com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset.<init>(com.okinc.business.trade.features.home.ui.meme.data.FeeConfig, com.okinc.business.trade.features.home.ui.meme.data.RouteConfig, com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r7v0 com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset))
  (wrap:com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset:0x001b: CONSTRUCTOR 
  (wrap:com.okinc.business.trade.features.home.ui.meme.data.FeeConfig:?: CAST (com.okinc.business.trade.features.home.ui.meme.data.FeeConfig) (null com.okinc.business.trade.features.home.ui.meme.data.FeeConfig))
  (wrap:com.okinc.business.trade.features.home.ui.meme.data.RouteConfig:?: CAST (com.okinc.business.trade.features.home.ui.meme.data.RouteConfig) (null com.okinc.business.trade.features.home.ui.meme.data.RouteConfig))
  (wrap:com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset:?: CAST (com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset) (null com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(com.okinc.business.trade.features.home.ui.meme.data.FeeConfig, com.okinc.business.trade.features.home.ui.meme.data.RouteConfig, com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:35) call: com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset.<init>(com.okinc.business.trade.features.home.ui.meme.data.FeeConfig, com.okinc.business.trade.features.home.ui.meme.data.RouteConfig, com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r8v0 com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset))
 A[MD:(com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset, com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset):void (m)] (LINE:33) call: com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPresetConfig.<init>(com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset, com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset):void type: THIS */
    public /* synthetic */ CopyTradingPresetConfig(BuySellPreset buySellPreset, BuySellPreset buySellPreset2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new BuySellPreset((FeeConfig) null, (RouteConfig) null, (SlippageConfigPreset) null, 7, (DefaultConstructorMarker) null) : buySellPreset, (i & 2) != 0 ? new BuySellPreset((FeeConfig) null, (RouteConfig) null, (SlippageConfigPreset) null, 7, (DefaultConstructorMarker) null) : buySellPreset2);
    }
}

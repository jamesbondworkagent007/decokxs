package com.okinc.business.dexui.main.swap.trade.single.defiplatform.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest$$serializer;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest$$serializer;
import com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C24695iig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class V6QuoteRequestWrapper implements Parcelable {
    public static final int $stable = 0;
    public final V6QuoteAndCalldataRequest quoteAndCalldataRequest;
    public final V6QuoteRequest quoteRequest;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<V6QuoteRequestWrapper> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<V6QuoteRequestWrapper> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final V6QuoteRequestWrapper createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new V6QuoteRequestWrapper(parcel.readInt() == 0 ? null : V6QuoteRequest.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? V6QuoteAndCalldataRequest.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final V6QuoteRequestWrapper[] newArray(int i) {
            return new V6QuoteRequestWrapper[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public V6QuoteRequestWrapper() {
        this((V6QuoteRequest) null, (V6QuoteAndCalldataRequest) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ V6QuoteRequestWrapper copy$default(V6QuoteRequestWrapper v6QuoteRequestWrapper, V6QuoteRequest v6QuoteRequest, V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            v6QuoteRequest = v6QuoteRequestWrapper.quoteRequest;
        }
        if ((i & 2) != 0) {
            v6QuoteAndCalldataRequest = v6QuoteRequestWrapper.quoteAndCalldataRequest;
        }
        return v6QuoteRequestWrapper.KWHzl(v6QuoteRequest, v6QuoteAndCalldataRequest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6QuoteRequest EZpvd() {
        return this.quoteRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6QuoteAndCalldataRequest KWHzl() {
        return this.quoteAndCalldataRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6QuoteRequestWrapper KWHzl(V6QuoteRequest v6QuoteRequest, V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest) {
        return new V6QuoteRequestWrapper(v6QuoteRequest, v6QuoteAndCalldataRequest);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V6QuoteRequestWrapper)) {
            return false;
        }
        V6QuoteRequestWrapper v6QuoteRequestWrapper = (V6QuoteRequestWrapper) obj;
        return Intrinsics.EZpvd(this.quoteRequest, v6QuoteRequestWrapper.quoteRequest) && Intrinsics.EZpvd(this.quoteAndCalldataRequest, v6QuoteRequestWrapper.quoteAndCalldataRequest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        V6QuoteRequest v6QuoteRequest = this.quoteRequest;
        int iHashCode = v6QuoteRequest == null ? 0 : v6QuoteRequest.hashCode();
        V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest = this.quoteAndCalldataRequest;
        return (iHashCode * 31) + (v6QuoteAndCalldataRequest != null ? v6QuoteAndCalldataRequest.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "V6QuoteRequestWrapper(quoteRequest=" + this.quoteRequest + ", quoteAndCalldataRequest=" + this.quoteAndCalldataRequest + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        V6QuoteRequest v6QuoteRequest = this.quoteRequest;
        if (v6QuoteRequest == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            v6QuoteRequest.writeToParcel(parcel, i);
        }
        V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest = this.quoteAndCalldataRequest;
        if (v6QuoteAndCalldataRequest == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            v6QuoteAndCalldataRequest.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexui.main.swap.trade.single.defiplatform.data.V6QuoteRequestWrapper.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<V6QuoteRequestWrapper> serializer() {
            return V6QuoteRequestWrapper$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ V6QuoteRequestWrapper(int i, V6QuoteRequest v6QuoteRequest, V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.quoteRequest = null;
        } else {
            this.quoteRequest = v6QuoteRequest;
        }
        if ((i & 2) == 0) {
            this.quoteAndCalldataRequest = null;
        } else {
            this.quoteAndCalldataRequest = v6QuoteAndCalldataRequest;
        }
    }

    public static final /* synthetic */ void KWHzl(V6QuoteRequestWrapper v6QuoteRequestWrapper, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || v6QuoteRequestWrapper.quoteRequest != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, V6QuoteRequest$$serializer.INSTANCE, v6QuoteRequestWrapper.quoteRequest);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && v6QuoteRequestWrapper.quoteAndCalldataRequest == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, V6QuoteAndCalldataRequest$$serializer.INSTANCE, v6QuoteRequestWrapper.quoteAndCalldataRequest);
    }

    public V6QuoteRequestWrapper(V6QuoteRequest v6QuoteRequest, V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest) {
        this.quoteRequest = v6QuoteRequest;
        this.quoteAndCalldataRequest = v6QuoteAndCalldataRequest;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest) : (r2v0 com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest))
  (wrap:com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest) : (r3v0 com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest))
 A[MD:(com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest, com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest):void (m)] (LINE:19) call: com.okinc.business.dexui.main.swap.trade.single.defiplatform.data.V6QuoteRequestWrapper.<init>(com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest, com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest):void type: THIS */
    public /* synthetic */ V6QuoteRequestWrapper(V6QuoteRequest v6QuoteRequest, V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : v6QuoteRequest, (i & 2) != 0 ? null : v6QuoteAndCalldataRequest);
    }

    public final String OLrzqt() {
        String chainId;
        V6QuoteRequest v6QuoteRequest = this.quoteRequest;
        if (v6QuoteRequest == null || (chainId = v6QuoteRequest.getChainId()) == null) {
            V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest = this.quoteAndCalldataRequest;
            chainId = v6QuoteAndCalldataRequest != null ? v6QuoteAndCalldataRequest.getChainId() : null;
        }
        return chainId == null ? "" : chainId;
    }

    public final String copydefault() {
        return AEQbTJ();
    }

    public static /* synthetic */ V6QuoteRequestWrapper updateDexIds$default(V6QuoteRequestWrapper v6QuoteRequestWrapper, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "default_trade";
        }
        return v6QuoteRequestWrapper.KWHzl(str);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig.copy$default(com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig */
    public final V6QuoteRequestWrapper KWHzl(@NotNull String str) {
        V6QuoteRequest v6QuoteRequestCopy;
        LiquidityConfig liquidityConfig;
        LiquidityConfig liquidityConfig2;
        Intrinsics.checkNotNullParameter(str, "");
        V6QuoteRequest v6QuoteRequest = this.quoteRequest;
        V6QuoteAndCalldataRequest v6QuoteAndCalldataRequestCopy = null;
        if (v6QuoteRequest != null) {
            LiquidityConfig liquidityConfig3 = v6QuoteRequest.getLiquidityConfig();
            if (liquidityConfig3 == null || (liquidityConfig2 = LiquidityConfig.copy$default(liquidityConfig3, C24695iig.OLrzqt(str), null, null, 6, null)) == null) {
                liquidityConfig2 = new LiquidityConfig((String) null, (String) null, "11", 3, (DefaultConstructorMarker) null);
            }
            v6QuoteRequestCopy = v6QuoteRequest.copy((FrameMetricsAggregator.EVERY_DURATION & 1) != 0 ? v6QuoteRequest.userWalletAddress : null, (FrameMetricsAggregator.EVERY_DURATION & 2) != 0 ? v6QuoteRequest.tradeMode : null, (FrameMetricsAggregator.EVERY_DURATION & 4) != 0 ? v6QuoteRequest.slippageConfig : null, (FrameMetricsAggregator.EVERY_DURATION & 8) != 0 ? v6QuoteRequest.liquidityConfig : liquidityConfig2, (FrameMetricsAggregator.EVERY_DURATION & 16) != 0 ? v6QuoteRequest.ext : null, (FrameMetricsAggregator.EVERY_DURATION & 32) != 0 ? v6QuoteRequest.chainId : null, (FrameMetricsAggregator.EVERY_DURATION & 64) != 0 ? v6QuoteRequest.fromTokenAddress : null, (FrameMetricsAggregator.EVERY_DURATION & 128) != 0 ? v6QuoteRequest.toTokenAddress : null, (FrameMetricsAggregator.EVERY_DURATION & 256) != 0 ? v6QuoteRequest.amount : null, (FrameMetricsAggregator.EVERY_DURATION & 512) != 0 ? v6QuoteRequest.accountInfo : null);
        } else {
            v6QuoteRequestCopy = null;
        }
        V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest = this.quoteAndCalldataRequest;
        if (v6QuoteAndCalldataRequest != null) {
            LiquidityConfig liquidityConfig4 = v6QuoteAndCalldataRequest.getLiquidityConfig();
            if (liquidityConfig4 == null || (liquidityConfig = LiquidityConfig.copy$default(liquidityConfig4, C24695iig.OLrzqt(str), null, null, 6, null)) == null) {
                liquidityConfig = new LiquidityConfig((String) null, (String) null, "11", 3, (DefaultConstructorMarker) null);
            }
            v6QuoteAndCalldataRequestCopy = v6QuoteAndCalldataRequest.copy((32763 & 1) != 0 ? v6QuoteAndCalldataRequest.simulate : null, (32763 & 2) != 0 ? v6QuoteAndCalldataRequest.slippageConfig : null, (32763 & 4) != 0 ? v6QuoteAndCalldataRequest.liquidityConfig : liquidityConfig, (32763 & 8) != 0 ? v6QuoteAndCalldataRequest.preSetConfig : null, (32763 & 16) != 0 ? v6QuoteAndCalldataRequest.ext : null, (32763 & 32) != 0 ? v6QuoteAndCalldataRequest.tradeMode : null, (32763 & 64) != 0 ? v6QuoteAndCalldataRequest.orderSource : null, (32763 & 128) != 0 ? v6QuoteAndCalldataRequest.networkFee : null, (32763 & 256) != 0 ? v6QuoteAndCalldataRequest.chainId : null, (32763 & 512) != 0 ? v6QuoteAndCalldataRequest.fromTokenAddress : null, (32763 & 1024) != 0 ? v6QuoteAndCalldataRequest.toTokenAddress : null, (32763 & 2048) != 0 ? v6QuoteAndCalldataRequest.amount : null, (32763 & 4096) != 0 ? v6QuoteAndCalldataRequest.userWalletAddress : null, (32763 & 8192) != 0 ? v6QuoteAndCalldataRequest.direction : null, (32763 & 16384) != 0 ? v6QuoteAndCalldataRequest.accountInfo : null);
        }
        return KWHzl(v6QuoteRequestCopy, v6QuoteAndCalldataRequestCopy);
    }

    public final String AEQbTJ() {
        LiquidityConfig liquidityConfig;
        V6QuoteRequest v6QuoteRequest = this.quoteRequest;
        if (v6QuoteRequest != null) {
            liquidityConfig = v6QuoteRequest.getLiquidityConfig();
        } else {
            V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest = this.quoteAndCalldataRequest;
            liquidityConfig = v6QuoteAndCalldataRequest != null ? v6QuoteAndCalldataRequest.getLiquidityConfig() : null;
        }
        String defiPlatformIds = liquidityConfig != null ? liquidityConfig.getDefiPlatformIds() : null;
        return defiPlatformIds == null ? "" : defiPlatformIds;
    }
}

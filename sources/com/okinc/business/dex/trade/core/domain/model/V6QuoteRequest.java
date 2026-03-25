package com.okinc.business.dex.trade.core.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo$$serializer;
import com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig;
import com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig$$serializer;
import com.okinc.business.dex.trade.core.domain.model.common.QuoteExt;
import com.okinc.business.dex.trade.core.domain.model.common.QuoteExt$$serializer;
import com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig;
import com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class V6QuoteRequest implements Parcelable {
    public static final int $stable = 0;
    private final AccountInfo accountInfo;
    private final String amount;
    private final String chainId;
    private final QuoteExt ext;
    private final String fromTokenAddress;
    private final LiquidityConfig liquidityConfig;
    private final SlippageConfig slippageConfig;
    private final String toTokenAddress;
    private final String tradeMode;
    private final String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<V6QuoteRequest> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<V6QuoteRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final V6QuoteRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new V6QuoteRequest(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SlippageConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LiquidityConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : QuoteExt.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? AccountInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final V6QuoteRequest[] newArray(int i) {
            return new V6QuoteRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountInfo component10() {
        return this.accountInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageConfig component3() {
        return this.slippageConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiquidityConfig component4() {
        return this.liquidityConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuoteExt component5() {
        return this.ext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6QuoteRequest copy(String str, @NotNull String str2, SlippageConfig slippageConfig, LiquidityConfig liquidityConfig, QuoteExt quoteExt, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, AccountInfo accountInfo) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new V6QuoteRequest(str, str2, slippageConfig, liquidityConfig, quoteExt, str3, str4, str5, str6, accountInfo);
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
        if (!(obj instanceof V6QuoteRequest)) {
            return false;
        }
        V6QuoteRequest v6QuoteRequest = (V6QuoteRequest) obj;
        return Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) v6QuoteRequest.userWalletAddress) && Intrinsics.EZpvd((Object) this.tradeMode, (Object) v6QuoteRequest.tradeMode) && Intrinsics.EZpvd(this.slippageConfig, v6QuoteRequest.slippageConfig) && Intrinsics.EZpvd(this.liquidityConfig, v6QuoteRequest.liquidityConfig) && Intrinsics.EZpvd(this.ext, v6QuoteRequest.ext) && Intrinsics.EZpvd((Object) this.chainId, (Object) v6QuoteRequest.chainId) && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) v6QuoteRequest.fromTokenAddress) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) v6QuoteRequest.toTokenAddress) && Intrinsics.EZpvd((Object) this.amount, (Object) v6QuoteRequest.amount) && Intrinsics.EZpvd(this.accountInfo, v6QuoteRequest.accountInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountInfo getAccountInfo() {
        return this.accountInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuoteExt getExt() {
        return this.ext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiquidityConfig getLiquidityConfig() {
        return this.liquidityConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageConfig getSlippageConfig() {
        return this.slippageConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeMode() {
        return this.tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.userWalletAddress;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.tradeMode.hashCode();
        SlippageConfig slippageConfig = this.slippageConfig;
        int iHashCode3 = slippageConfig == null ? 0 : slippageConfig.hashCode();
        LiquidityConfig liquidityConfig = this.liquidityConfig;
        int iHashCode4 = liquidityConfig == null ? 0 : liquidityConfig.hashCode();
        QuoteExt quoteExt = this.ext;
        int iHashCode5 = quoteExt == null ? 0 : quoteExt.hashCode();
        int iHashCode6 = this.chainId.hashCode();
        int iHashCode7 = this.fromTokenAddress.hashCode();
        int iHashCode8 = this.toTokenAddress.hashCode();
        int iHashCode9 = this.amount.hashCode();
        AccountInfo accountInfo = this.accountInfo;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (accountInfo != null ? accountInfo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "V6QuoteRequest(userWalletAddress=" + this.userWalletAddress + ", tradeMode=" + this.tradeMode + ", slippageConfig=" + this.slippageConfig + ", liquidityConfig=" + this.liquidityConfig + ", ext=" + this.ext + ", chainId=" + this.chainId + ", fromTokenAddress=" + this.fromTokenAddress + ", toTokenAddress=" + this.toTokenAddress + ", amount=" + this.amount + ", accountInfo=" + this.accountInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.userWalletAddress);
        parcel.writeString(this.tradeMode);
        SlippageConfig slippageConfig = this.slippageConfig;
        if (slippageConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            slippageConfig.writeToParcel(parcel, i);
        }
        LiquidityConfig liquidityConfig = this.liquidityConfig;
        if (liquidityConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            liquidityConfig.writeToParcel(parcel, i);
        }
        QuoteExt quoteExt = this.ext;
        if (quoteExt == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            quoteExt.writeToParcel(parcel, i);
        }
        parcel.writeString(this.chainId);
        parcel.writeString(this.fromTokenAddress);
        parcel.writeString(this.toTokenAddress);
        parcel.writeString(this.amount);
        AccountInfo accountInfo = this.accountInfo;
        if (accountInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfo.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<V6QuoteRequest> serializer() {
            return V6QuoteRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ V6QuoteRequest(int i, String str, String str2, SlippageConfig slippageConfig, LiquidityConfig liquidityConfig, QuoteExt quoteExt, String str3, String str4, String str5, String str6, AccountInfo accountInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if (482 != (i & 482)) {
            PluginExceptionsKt.throwMissingFieldException(i, 482, V6QuoteRequest$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.userWalletAddress = null;
        } else {
            this.userWalletAddress = str;
        }
        this.tradeMode = str2;
        if ((i & 4) == 0) {
            this.slippageConfig = null;
        } else {
            this.slippageConfig = slippageConfig;
        }
        if ((i & 8) == 0) {
            this.liquidityConfig = null;
        } else {
            this.liquidityConfig = liquidityConfig;
        }
        if ((i & 16) == 0) {
            this.ext = null;
        } else {
            this.ext = quoteExt;
        }
        this.chainId = str3;
        this.fromTokenAddress = str4;
        this.toTokenAddress = str5;
        this.amount = str6;
        if ((i & 512) == 0) {
            this.accountInfo = null;
        } else {
            this.accountInfo = accountInfo;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(V6QuoteRequest v6QuoteRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || v6QuoteRequest.userWalletAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, v6QuoteRequest.userWalletAddress);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, v6QuoteRequest.tradeMode);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || v6QuoteRequest.slippageConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, SlippageConfig$$serializer.INSTANCE, v6QuoteRequest.slippageConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || v6QuoteRequest.liquidityConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LiquidityConfig$$serializer.INSTANCE, v6QuoteRequest.liquidityConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || v6QuoteRequest.ext != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, QuoteExt$$serializer.INSTANCE, v6QuoteRequest.ext);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, v6QuoteRequest.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, v6QuoteRequest.fromTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, v6QuoteRequest.toTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, v6QuoteRequest.amount);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && v6QuoteRequest.accountInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, AccountInfo$$serializer.INSTANCE, v6QuoteRequest.accountInfo);
    }

    public V6QuoteRequest(String str, @NotNull String str2, SlippageConfig slippageConfig, LiquidityConfig liquidityConfig, QuoteExt quoteExt, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, AccountInfo accountInfo) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.userWalletAddress = str;
        this.tradeMode = str2;
        this.slippageConfig = slippageConfig;
        this.liquidityConfig = liquidityConfig;
        this.ext = quoteExt;
        this.chainId = str3;
        this.fromTokenAddress = str4;
        this.toTokenAddress = str5;
        this.amount = str6;
        this.accountInfo = accountInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (r16v0 java.lang.String)
  (wrap:com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig:?: TERNARY null = ((wrap:int:0x000a: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig) : (r17v0 com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig))
  (wrap:com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig:?: TERNARY null = ((wrap:int:0x0012: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig) : (r18v0 com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig))
  (wrap:com.okinc.business.dex.trade.core.domain.model.common.QuoteExt:?: TERNARY null = ((wrap:int:0x001a: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.common.QuoteExt) : (r19v0 com.okinc.business.dex.trade.core.domain.model.common.QuoteExt))
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (wrap:com.okinc.business.dex.trade.core.domain.model.common.AccountInfo:?: TERNARY null = ((wrap:int:0x0022: ARITH (r25v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.common.AccountInfo) : (r24v0 com.okinc.business.dex.trade.core.domain.model.common.AccountInfo))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig, com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig, com.okinc.business.dex.trade.core.domain.model.common.QuoteExt, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.AccountInfo):void (m)] (LINE:21) call: com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest.<init>(java.lang.String, java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig, com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig, com.okinc.business.dex.trade.core.domain.model.common.QuoteExt, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.AccountInfo):void type: THIS */
    public /* synthetic */ V6QuoteRequest(String str, String str2, SlippageConfig slippageConfig, LiquidityConfig liquidityConfig, QuoteExt quoteExt, String str3, String str4, String str5, String str6, AccountInfo accountInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : slippageConfig, (i & 8) != 0 ? null : liquidityConfig, (i & 16) != 0 ? null : quoteExt, str3, str4, str5, str6, (i & 512) != 0 ? null : accountInfo);
    }
}

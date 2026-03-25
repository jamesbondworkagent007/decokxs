package com.okinc.business.dex.trade.core.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo$$serializer;
import com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig;
import com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig$$serializer;
import com.okinc.business.dex.trade.core.domain.model.common.NetworkFee;
import com.okinc.business.dex.trade.core.domain.model.common.NetworkFee$$serializer;
import com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig;
import com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig$$serializer;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class V6QuoteAndCalldataRequest implements Parcelable {
    public static final int $stable = 0;
    private final AccountInfo accountInfo;
    private final String amount;
    private final String chainId;
    private final String direction;
    private final QuoteExt ext;
    private final String fromTokenAddress;
    private final LiquidityConfig liquidityConfig;
    private final NetworkFee networkFee;
    private final String orderSource;
    private final PreSetConfig preSetConfig;
    private final Boolean simulate;
    private final SlippageConfig slippageConfig;
    private final String toTokenAddress;
    private final String tradeMode;
    private final String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<V6QuoteAndCalldataRequest> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<V6QuoteAndCalldataRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final V6QuoteAndCalldataRequest createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new V6QuoteAndCalldataRequest(boolValueOf, SlippageConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LiquidityConfig.CREATOR.createFromParcel(parcel), PreSetConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : QuoteExt.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : NetworkFee.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? AccountInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final V6QuoteAndCalldataRequest[] newArray(int i) {
            return new V6QuoteAndCalldataRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.simulate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountInfo component15() {
        return this.accountInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageConfig component2() {
        return this.slippageConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiquidityConfig component3() {
        return this.liquidityConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreSetConfig component4() {
        return this.preSetConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuoteExt component5() {
        return this.ext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.orderSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkFee component8() {
        return this.networkFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6QuoteAndCalldataRequest copy(Boolean bool, @NotNull SlippageConfig slippageConfig, LiquidityConfig liquidityConfig, @NotNull PreSetConfig preSetConfig, QuoteExt quoteExt, @NotNull String str, String str2, NetworkFee networkFee, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, AccountInfo accountInfo) {
        Intrinsics.checkNotNullParameter(slippageConfig, "");
        Intrinsics.checkNotNullParameter(preSetConfig, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new V6QuoteAndCalldataRequest(bool, slippageConfig, liquidityConfig, preSetConfig, quoteExt, str, str2, networkFee, str3, str4, str5, str6, str7, str8, accountInfo);
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
        if (!(obj instanceof V6QuoteAndCalldataRequest)) {
            return false;
        }
        V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest = (V6QuoteAndCalldataRequest) obj;
        return Intrinsics.EZpvd(this.simulate, v6QuoteAndCalldataRequest.simulate) && Intrinsics.EZpvd(this.slippageConfig, v6QuoteAndCalldataRequest.slippageConfig) && Intrinsics.EZpvd(this.liquidityConfig, v6QuoteAndCalldataRequest.liquidityConfig) && Intrinsics.EZpvd(this.preSetConfig, v6QuoteAndCalldataRequest.preSetConfig) && Intrinsics.EZpvd(this.ext, v6QuoteAndCalldataRequest.ext) && Intrinsics.EZpvd((Object) this.tradeMode, (Object) v6QuoteAndCalldataRequest.tradeMode) && Intrinsics.EZpvd((Object) this.orderSource, (Object) v6QuoteAndCalldataRequest.orderSource) && Intrinsics.EZpvd(this.networkFee, v6QuoteAndCalldataRequest.networkFee) && Intrinsics.EZpvd((Object) this.chainId, (Object) v6QuoteAndCalldataRequest.chainId) && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) v6QuoteAndCalldataRequest.fromTokenAddress) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) v6QuoteAndCalldataRequest.toTokenAddress) && Intrinsics.EZpvd((Object) this.amount, (Object) v6QuoteAndCalldataRequest.amount) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) v6QuoteAndCalldataRequest.userWalletAddress) && Intrinsics.EZpvd((Object) this.direction, (Object) v6QuoteAndCalldataRequest.direction) && Intrinsics.EZpvd(this.accountInfo, v6QuoteAndCalldataRequest.accountInfo);
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
    public final String getDirection() {
        return this.direction;
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
    public final NetworkFee getNetworkFee() {
        return this.networkFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderSource() {
        return this.orderSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreSetConfig getPreSetConfig() {
        return this.preSetConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSimulate() {
        return this.simulate;
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
        Boolean bool = this.simulate;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        int iHashCode2 = this.slippageConfig.hashCode();
        LiquidityConfig liquidityConfig = this.liquidityConfig;
        int iHashCode3 = liquidityConfig == null ? 0 : liquidityConfig.hashCode();
        int iHashCode4 = this.preSetConfig.hashCode();
        QuoteExt quoteExt = this.ext;
        int iHashCode5 = quoteExt == null ? 0 : quoteExt.hashCode();
        int iHashCode6 = this.tradeMode.hashCode();
        String str = this.orderSource;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        NetworkFee networkFee = this.networkFee;
        int iHashCode8 = networkFee == null ? 0 : networkFee.hashCode();
        int iHashCode9 = this.chainId.hashCode();
        int iHashCode10 = this.fromTokenAddress.hashCode();
        int iHashCode11 = this.toTokenAddress.hashCode();
        int iHashCode12 = this.amount.hashCode();
        int iHashCode13 = this.userWalletAddress.hashCode();
        String str2 = this.direction;
        int iHashCode14 = str2 == null ? 0 : str2.hashCode();
        AccountInfo accountInfo = this.accountInfo;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (accountInfo == null ? 0 : accountInfo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "V6QuoteAndCalldataRequest(simulate=" + this.simulate + ", slippageConfig=" + this.slippageConfig + ", liquidityConfig=" + this.liquidityConfig + ", preSetConfig=" + this.preSetConfig + ", ext=" + this.ext + ", tradeMode=" + this.tradeMode + ", orderSource=" + this.orderSource + ", networkFee=" + this.networkFee + ", chainId=" + this.chainId + ", fromTokenAddress=" + this.fromTokenAddress + ", toTokenAddress=" + this.toTokenAddress + ", amount=" + this.amount + ", userWalletAddress=" + this.userWalletAddress + ", direction=" + this.direction + ", accountInfo=" + this.accountInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.simulate;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        this.slippageConfig.writeToParcel(parcel, i);
        LiquidityConfig liquidityConfig = this.liquidityConfig;
        if (liquidityConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            liquidityConfig.writeToParcel(parcel, i);
        }
        this.preSetConfig.writeToParcel(parcel, i);
        QuoteExt quoteExt = this.ext;
        if (quoteExt == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            quoteExt.writeToParcel(parcel, i);
        }
        parcel.writeString(this.tradeMode);
        parcel.writeString(this.orderSource);
        NetworkFee networkFee = this.networkFee;
        if (networkFee == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            networkFee.writeToParcel(parcel, i);
        }
        parcel.writeString(this.chainId);
        parcel.writeString(this.fromTokenAddress);
        parcel.writeString(this.toTokenAddress);
        parcel.writeString(this.amount);
        parcel.writeString(this.userWalletAddress);
        parcel.writeString(this.direction);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<V6QuoteAndCalldataRequest> serializer() {
            return V6QuoteAndCalldataRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ V6QuoteAndCalldataRequest(int i, Boolean bool, SlippageConfig slippageConfig, LiquidityConfig liquidityConfig, PreSetConfig preSetConfig, QuoteExt quoteExt, String str, String str2, NetworkFee networkFee, String str3, String str4, String str5, String str6, String str7, String str8, AccountInfo accountInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if (7978 != (i & 7978)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7978, V6QuoteAndCalldataRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.simulate = (i & 1) == 0 ? Boolean.FALSE : bool;
        this.slippageConfig = slippageConfig;
        if ((i & 4) == 0) {
            this.liquidityConfig = null;
        } else {
            this.liquidityConfig = liquidityConfig;
        }
        this.preSetConfig = preSetConfig;
        if ((i & 16) == 0) {
            this.ext = null;
        } else {
            this.ext = quoteExt;
        }
        this.tradeMode = str;
        if ((i & 64) == 0) {
            this.orderSource = null;
        } else {
            this.orderSource = str2;
        }
        if ((i & 128) == 0) {
            this.networkFee = null;
        } else {
            this.networkFee = networkFee;
        }
        this.chainId = str3;
        this.fromTokenAddress = str4;
        this.toTokenAddress = str5;
        this.amount = str6;
        this.userWalletAddress = str7;
        if ((i & 8192) == 0) {
            this.direction = null;
        } else {
            this.direction = str8;
        }
        if ((i & 16384) == 0) {
            this.accountInfo = null;
        } else {
            this.accountInfo = accountInfo;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(v6QuoteAndCalldataRequest.simulate, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, v6QuoteAndCalldataRequest.simulate);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, SlippageConfig$$serializer.INSTANCE, v6QuoteAndCalldataRequest.slippageConfig);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || v6QuoteAndCalldataRequest.liquidityConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LiquidityConfig$$serializer.INSTANCE, v6QuoteAndCalldataRequest.liquidityConfig);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, PreSetConfig$$serializer.INSTANCE, v6QuoteAndCalldataRequest.preSetConfig);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || v6QuoteAndCalldataRequest.ext != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, QuoteExt$$serializer.INSTANCE, v6QuoteAndCalldataRequest.ext);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, v6QuoteAndCalldataRequest.tradeMode);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || v6QuoteAndCalldataRequest.orderSource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, v6QuoteAndCalldataRequest.orderSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || v6QuoteAndCalldataRequest.networkFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, NetworkFee$$serializer.INSTANCE, v6QuoteAndCalldataRequest.networkFee);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, v6QuoteAndCalldataRequest.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, v6QuoteAndCalldataRequest.fromTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 10, v6QuoteAndCalldataRequest.toTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 11, v6QuoteAndCalldataRequest.amount);
        compositeEncoder.encodeStringElement(serialDescriptor, 12, v6QuoteAndCalldataRequest.userWalletAddress);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || v6QuoteAndCalldataRequest.direction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, v6QuoteAndCalldataRequest.direction);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && v6QuoteAndCalldataRequest.accountInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, AccountInfo$$serializer.INSTANCE, v6QuoteAndCalldataRequest.accountInfo);
    }

    public V6QuoteAndCalldataRequest(Boolean bool, @NotNull SlippageConfig slippageConfig, LiquidityConfig liquidityConfig, @NotNull PreSetConfig preSetConfig, QuoteExt quoteExt, @NotNull String str, String str2, NetworkFee networkFee, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, AccountInfo accountInfo) {
        Intrinsics.checkNotNullParameter(slippageConfig, "");
        Intrinsics.checkNotNullParameter(preSetConfig, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.simulate = bool;
        this.slippageConfig = slippageConfig;
        this.liquidityConfig = liquidityConfig;
        this.preSetConfig = preSetConfig;
        this.ext = quoteExt;
        this.tradeMode = str;
        this.orderSource = str2;
        this.networkFee = networkFee;
        this.chainId = str3;
        this.fromTokenAddress = str4;
        this.toTokenAddress = str5;
        this.amount = str6;
        this.userWalletAddress = str7;
        this.direction = str8;
        this.accountInfo = accountInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0051: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r19v0 java.lang.Boolean))
  (r20v0 com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig)
  (wrap:com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig:?: TERNARY null = ((wrap:int:0x000c: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig) : (r21v0 com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig))
  (r22v0 com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig)
  (wrap:com.okinc.business.dex.trade.core.domain.model.common.QuoteExt:?: TERNARY null = ((wrap:int:0x0015: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.common.QuoteExt) : (r23v0 com.okinc.business.dex.trade.core.domain.model.common.QuoteExt))
  (r24v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:com.okinc.business.dex.trade.core.domain.model.common.NetworkFee:?: TERNARY null = ((wrap:int:0x0025: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.common.NetworkFee) : (r26v0 com.okinc.business.dex.trade.core.domain.model.common.NetworkFee))
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 java.lang.String)
  (r30v0 java.lang.String)
  (r31v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:com.okinc.business.dex.trade.core.domain.model.common.AccountInfo:?: TERNARY null = ((wrap:int:0x0036: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.common.AccountInfo) : (r33v0 com.okinc.business.dex.trade.core.domain.model.common.AccountInfo))
 A[MD:(java.lang.Boolean, com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig, com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig, com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig, com.okinc.business.dex.trade.core.domain.model.common.QuoteExt, java.lang.String, java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.NetworkFee, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.AccountInfo):void (m)] (LINE:32) call: com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest.<init>(java.lang.Boolean, com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig, com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig, com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig, com.okinc.business.dex.trade.core.domain.model.common.QuoteExt, java.lang.String, java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.NetworkFee, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.AccountInfo):void type: THIS */
    public /* synthetic */ V6QuoteAndCalldataRequest(Boolean bool, SlippageConfig slippageConfig, LiquidityConfig liquidityConfig, PreSetConfig preSetConfig, QuoteExt quoteExt, String str, String str2, NetworkFee networkFee, String str3, String str4, String str5, String str6, String str7, String str8, AccountInfo accountInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, slippageConfig, (i & 4) != 0 ? null : liquidityConfig, preSetConfig, (i & 16) != 0 ? null : quoteExt, str, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : networkFee, str3, str4, str5, str6, str7, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? null : accountInfo);
    }
}

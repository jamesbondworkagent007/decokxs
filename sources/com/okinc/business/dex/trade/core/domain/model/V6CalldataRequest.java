package com.okinc.business.dex.trade.core.domain.model;

import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo$$serializer;
import com.okinc.business.dex.trade.core.domain.model.common.NetworkFee;
import com.okinc.business.dex.trade.core.domain.model.common.NetworkFee$$serializer;
import com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig;
import com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig$$serializer;
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
public final class V6CalldataRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final AccountInfo accountInfo;
    private final String direction;
    private final NetworkFee networkFee;
    private final String orderSource;
    private final CalldataPermit2 permit2;
    private final PreSetConfig preSetConfig;
    private final String quoteId;
    private final boolean simulate;
    private final SlippageConfig slippageConfig;
    private final String userWalletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.simulate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.orderSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkFee component4() {
        return this.networkFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageConfig component5() {
        return this.slippageConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountInfo component6() {
        return this.accountInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreSetConfig component7() {
        return this.preSetConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CalldataPermit2 component8() {
        return this.permit2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6CalldataRequest copy(String str, boolean z, String str2, NetworkFee networkFee, @NotNull SlippageConfig slippageConfig, AccountInfo accountInfo, @NotNull PreSetConfig preSetConfig, CalldataPermit2 calldataPermit2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(slippageConfig, "");
        Intrinsics.checkNotNullParameter(preSetConfig, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new V6CalldataRequest(str, z, str2, networkFee, slippageConfig, accountInfo, preSetConfig, calldataPermit2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V6CalldataRequest)) {
            return false;
        }
        V6CalldataRequest v6CalldataRequest = (V6CalldataRequest) obj;
        return Intrinsics.EZpvd((Object) this.direction, (Object) v6CalldataRequest.direction) && this.simulate == v6CalldataRequest.simulate && Intrinsics.EZpvd((Object) this.orderSource, (Object) v6CalldataRequest.orderSource) && Intrinsics.EZpvd(this.networkFee, v6CalldataRequest.networkFee) && Intrinsics.EZpvd(this.slippageConfig, v6CalldataRequest.slippageConfig) && Intrinsics.EZpvd(this.accountInfo, v6CalldataRequest.accountInfo) && Intrinsics.EZpvd(this.preSetConfig, v6CalldataRequest.preSetConfig) && Intrinsics.EZpvd(this.permit2, v6CalldataRequest.permit2) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) v6CalldataRequest.userWalletAddress) && Intrinsics.EZpvd((Object) this.quoteId, (Object) v6CalldataRequest.quoteId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountInfo getAccountInfo() {
        return this.accountInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
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
    public final CalldataPermit2 getPermit2() {
        return this.permit2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreSetConfig getPreSetConfig() {
        return this.preSetConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteId() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSimulate() {
        return this.simulate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageConfig getSlippageConfig() {
        return this.slippageConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.direction;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = Boolean.hashCode(this.simulate);
        String str2 = this.orderSource;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        NetworkFee networkFee = this.networkFee;
        int iHashCode4 = networkFee == null ? 0 : networkFee.hashCode();
        int iHashCode5 = this.slippageConfig.hashCode();
        AccountInfo accountInfo = this.accountInfo;
        int iHashCode6 = accountInfo == null ? 0 : accountInfo.hashCode();
        int iHashCode7 = this.preSetConfig.hashCode();
        CalldataPermit2 calldataPermit2 = this.permit2;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (calldataPermit2 != null ? calldataPermit2.hashCode() : 0)) * 31) + this.userWalletAddress.hashCode()) * 31) + this.quoteId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "V6CalldataRequest(direction=" + this.direction + ", simulate=" + this.simulate + ", orderSource=" + this.orderSource + ", networkFee=" + this.networkFee + ", slippageConfig=" + this.slippageConfig + ", accountInfo=" + this.accountInfo + ", preSetConfig=" + this.preSetConfig + ", permit2=" + this.permit2 + ", userWalletAddress=" + this.userWalletAddress + ", quoteId=" + this.quoteId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.V6CalldataRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<V6CalldataRequest> serializer() {
            return V6CalldataRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ V6CalldataRequest(int i, String str, boolean z, String str2, NetworkFee networkFee, SlippageConfig slippageConfig, AccountInfo accountInfo, PreSetConfig preSetConfig, CalldataPermit2 calldataPermit2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (848 != (i & 848)) {
            PluginExceptionsKt.throwMissingFieldException(i, 848, V6CalldataRequest$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.direction = null;
        } else {
            this.direction = str;
        }
        if ((i & 2) == 0) {
            this.simulate = false;
        } else {
            this.simulate = z;
        }
        if ((i & 4) == 0) {
            this.orderSource = null;
        } else {
            this.orderSource = str2;
        }
        if ((i & 8) == 0) {
            this.networkFee = null;
        } else {
            this.networkFee = networkFee;
        }
        this.slippageConfig = slippageConfig;
        if ((i & 32) == 0) {
            this.accountInfo = null;
        } else {
            this.accountInfo = accountInfo;
        }
        this.preSetConfig = preSetConfig;
        if ((i & 128) == 0) {
            this.permit2 = null;
        } else {
            this.permit2 = calldataPermit2;
        }
        this.userWalletAddress = str3;
        this.quoteId = str4;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(V6CalldataRequest v6CalldataRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || v6CalldataRequest.direction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, v6CalldataRequest.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || v6CalldataRequest.simulate) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, v6CalldataRequest.simulate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || v6CalldataRequest.orderSource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, v6CalldataRequest.orderSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || v6CalldataRequest.networkFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, NetworkFee$$serializer.INSTANCE, v6CalldataRequest.networkFee);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, SlippageConfig$$serializer.INSTANCE, v6CalldataRequest.slippageConfig);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || v6CalldataRequest.accountInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, AccountInfo$$serializer.INSTANCE, v6CalldataRequest.accountInfo);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, PreSetConfig$$serializer.INSTANCE, v6CalldataRequest.preSetConfig);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || v6CalldataRequest.permit2 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, CalldataPermit2$$serializer.INSTANCE, v6CalldataRequest.permit2);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, v6CalldataRequest.userWalletAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, v6CalldataRequest.quoteId);
    }

    public V6CalldataRequest(String str, boolean z, String str2, NetworkFee networkFee, @NotNull SlippageConfig slippageConfig, AccountInfo accountInfo, @NotNull PreSetConfig preSetConfig, CalldataPermit2 calldataPermit2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(slippageConfig, "");
        Intrinsics.checkNotNullParameter(preSetConfig, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.direction = str;
        this.simulate = z;
        this.orderSource = str2;
        this.networkFee = networkFee;
        this.slippageConfig = slippageConfig;
        this.accountInfo = accountInfo;
        this.preSetConfig = preSetConfig;
        this.permit2 = calldataPermit2;
        this.userWalletAddress = str3;
        this.quoteId = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:com.okinc.business.dex.trade.core.domain.model.common.NetworkFee:?: TERNARY null = ((wrap:int:0x001b: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.common.NetworkFee) : (r18v0 com.okinc.business.dex.trade.core.domain.model.common.NetworkFee))
  (r19v0 com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig)
  (wrap:com.okinc.business.dex.trade.core.domain.model.common.AccountInfo:?: TERNARY null = ((wrap:int:0x0023: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.common.AccountInfo) : (r20v0 com.okinc.business.dex.trade.core.domain.model.common.AccountInfo))
  (r21v0 com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig)
  (wrap:com.okinc.business.dex.trade.core.domain.model.CalldataPermit2:?: TERNARY null = ((wrap:int:0x002b: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.CalldataPermit2) : (r22v0 com.okinc.business.dex.trade.core.domain.model.CalldataPermit2))
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
 A[MD:(java.lang.String, boolean, java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.NetworkFee, com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig, com.okinc.business.dex.trade.core.domain.model.common.AccountInfo, com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig, com.okinc.business.dex.trade.core.domain.model.CalldataPermit2, java.lang.String, java.lang.String):void (m)] (LINE:18) call: com.okinc.business.dex.trade.core.domain.model.V6CalldataRequest.<init>(java.lang.String, boolean, java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.NetworkFee, com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig, com.okinc.business.dex.trade.core.domain.model.common.AccountInfo, com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig, com.okinc.business.dex.trade.core.domain.model.CalldataPermit2, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ V6CalldataRequest(String str, boolean z, String str2, NetworkFee networkFee, SlippageConfig slippageConfig, AccountInfo accountInfo, PreSetConfig preSetConfig, CalldataPermit2 calldataPermit2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : networkFee, slippageConfig, (i & 32) != 0 ? null : accountInfo, preSetConfig, (i & 128) != 0 ? null : calldataPermit2, str3, str4);
    }
}

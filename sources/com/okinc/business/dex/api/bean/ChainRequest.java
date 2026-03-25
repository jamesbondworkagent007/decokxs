package com.okinc.business.dex.api.bean;

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
public final class ChainRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String fromAmount;
    private final CoinInfo fromCoinInfo;
    private final String sourceType;
    private final CoinInfo toCoinInfo;
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChainRequest copy$default(ChainRequest chainRequest, String str, String str2, CoinInfo coinInfo, CoinInfo coinInfo2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chainRequest.type;
        }
        if ((i & 2) != 0) {
            str2 = chainRequest.sourceType;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            coinInfo = chainRequest.fromCoinInfo;
        }
        CoinInfo coinInfo3 = coinInfo;
        if ((i & 8) != 0) {
            coinInfo2 = chainRequest.toCoinInfo;
        }
        CoinInfo coinInfo4 = coinInfo2;
        if ((i & 16) != 0) {
            str3 = chainRequest.fromAmount;
        }
        return chainRequest.copy(str, str4, coinInfo3, coinInfo4, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinInfo component3() {
        return this.fromCoinInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinInfo component4() {
        return this.toCoinInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChainRequest copy(@NotNull String str, @NotNull String str2, CoinInfo coinInfo, CoinInfo coinInfo2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ChainRequest(str, str2, coinInfo, coinInfo2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChainRequest)) {
            return false;
        }
        ChainRequest chainRequest = (ChainRequest) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) chainRequest.type) && Intrinsics.EZpvd((Object) this.sourceType, (Object) chainRequest.sourceType) && Intrinsics.EZpvd(this.fromCoinInfo, chainRequest.fromCoinInfo) && Intrinsics.EZpvd(this.toCoinInfo, chainRequest.toCoinInfo) && Intrinsics.EZpvd((Object) this.fromAmount, (Object) chainRequest.fromAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinInfo getFromCoinInfo() {
        return this.fromCoinInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceType() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinInfo getToCoinInfo() {
        return this.toCoinInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.type.hashCode();
        int iHashCode2 = this.sourceType.hashCode();
        CoinInfo coinInfo = this.fromCoinInfo;
        int iHashCode3 = coinInfo == null ? 0 : coinInfo.hashCode();
        CoinInfo coinInfo2 = this.toCoinInfo;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (coinInfo2 != null ? coinInfo2.hashCode() : 0)) * 31) + this.fromAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChainRequest(type=" + this.type + ", sourceType=" + this.sourceType + ", fromCoinInfo=" + this.fromCoinInfo + ", toCoinInfo=" + this.toCoinInfo + ", fromAmount=" + this.fromAmount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.api.bean.ChainRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChainRequest> serializer() {
            return ChainRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChainRequest(int i, String str, String str2, CoinInfo coinInfo, CoinInfo coinInfo2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ChainRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.sourceType = str2;
        if ((i & 4) == 0) {
            this.fromCoinInfo = null;
        } else {
            this.fromCoinInfo = coinInfo;
        }
        if ((i & 8) == 0) {
            this.toCoinInfo = null;
        } else {
            this.toCoinInfo = coinInfo2;
        }
        if ((i & 16) == 0) {
            this.fromAmount = "";
        } else {
            this.fromAmount = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_api(ChainRequest chainRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, chainRequest.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, chainRequest.sourceType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || chainRequest.fromCoinInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, CoinInfo$$serializer.INSTANCE, chainRequest.fromCoinInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || chainRequest.toCoinInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, CoinInfo$$serializer.INSTANCE, chainRequest.toCoinInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) chainRequest.fromAmount, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, chainRequest.fromAmount);
    }

    public ChainRequest(@NotNull String str, @NotNull String str2, CoinInfo coinInfo, CoinInfo coinInfo2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.type = str;
        this.sourceType = str2;
        this.fromCoinInfo = coinInfo;
        this.toCoinInfo = coinInfo2;
        this.fromAmount = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (wrap:com.okinc.business.dex.api.bean.CoinInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.api.bean.CoinInfo) : (r10v0 com.okinc.business.dex.api.bean.CoinInfo))
  (wrap:com.okinc.business.dex.api.bean.CoinInfo:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.api.bean.CoinInfo) : (r11v0 com.okinc.business.dex.api.bean.CoinInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.dex.api.bean.CoinInfo, com.okinc.business.dex.api.bean.CoinInfo, java.lang.String):void (m)] (LINE:138) call: com.okinc.business.dex.api.bean.ChainRequest.<init>(java.lang.String, java.lang.String, com.okinc.business.dex.api.bean.CoinInfo, com.okinc.business.dex.api.bean.CoinInfo, java.lang.String):void type: THIS */
    public /* synthetic */ ChainRequest(String str, String str2, CoinInfo coinInfo, CoinInfo coinInfo2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : coinInfo, (i & 8) != 0 ? null : coinInfo2, (i & 16) != 0 ? "" : str3);
    }
}

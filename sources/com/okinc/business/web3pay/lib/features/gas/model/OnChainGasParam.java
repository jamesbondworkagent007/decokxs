package com.okinc.business.web3pay.lib.features.gas.model;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OnChainGasParam {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chainIndex;
    private final String masterCurrencyId;
    private final String to;
    private final String tokenAddress;
    private final String tokenAmount;
    private final String tokenCoinTypeNo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OnChainGasParam copy$default(OnChainGasParam onChainGasParam, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onChainGasParam.chainIndex;
        }
        if ((i & 2) != 0) {
            str2 = onChainGasParam.tokenAddress;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = onChainGasParam.tokenAmount;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = onChainGasParam.to;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = onChainGasParam.tokenCoinTypeNo;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = onChainGasParam.masterCurrencyId;
        }
        return onChainGasParam.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.masterCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnChainGasParam copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new OnChainGasParam(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnChainGasParam)) {
            return false;
        }
        OnChainGasParam onChainGasParam = (OnChainGasParam) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) onChainGasParam.chainIndex) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) onChainGasParam.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) onChainGasParam.tokenAmount) && Intrinsics.EZpvd((Object) this.to, (Object) onChainGasParam.to) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) onChainGasParam.tokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.masterCurrencyId, (Object) onChainGasParam.masterCurrencyId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMasterCurrencyId() {
        return this.masterCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAmount() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenCoinTypeNo() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainIndex.hashCode();
        int iHashCode2 = this.tokenAddress.hashCode();
        int iHashCode3 = this.tokenAmount.hashCode();
        int iHashCode4 = this.to.hashCode();
        int iHashCode5 = this.tokenCoinTypeNo.hashCode();
        String str = this.masterCurrencyId;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OnChainGasParam(chainIndex=" + this.chainIndex + ", tokenAddress=" + this.tokenAddress + ", tokenAmount=" + this.tokenAmount + ", to=" + this.to + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", masterCurrencyId=" + this.masterCurrencyId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.gas.model.OnChainGasParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnChainGasParam> serializer() {
            return OnChainGasParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OnChainGasParam(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (55 != (i & 55)) {
            PluginExceptionsKt.throwMissingFieldException(i, 55, OnChainGasParam$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = str;
        this.tokenAddress = str2;
        this.tokenAmount = str3;
        if ((i & 8) == 0) {
            this.to = "";
        } else {
            this.to = str4;
        }
        this.tokenCoinTypeNo = str5;
        this.masterCurrencyId = str6;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(OnChainGasParam onChainGasParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, onChainGasParam.chainIndex);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, onChainGasParam.tokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, onChainGasParam.tokenAmount);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) onChainGasParam.to, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, onChainGasParam.to);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, onChainGasParam.tokenCoinTypeNo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, onChainGasParam.masterCurrencyId);
    }

    public OnChainGasParam(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.chainIndex = str;
        this.tokenAddress = str2;
        this.tokenAmount = str3;
        this.to = str4;
        this.tokenCoinTypeNo = str5;
        this.masterCurrencyId = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.business.web3pay.lib.features.gas.model.OnChainGasParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OnChainGasParam(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4, str5, str6);
    }
}

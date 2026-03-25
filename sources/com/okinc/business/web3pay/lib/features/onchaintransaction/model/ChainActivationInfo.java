package com.okinc.business.web3pay.lib.features.onchaintransaction.model;

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
public final class ChainActivationInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean activated;
    private final String activationFeeAmount;
    private final int activationFeeTokenDecimal;
    private final String activationFeeTokenSymbol;
    private final String chainIndex;
    private final String transactionFeeAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChainActivationInfo copy$default(ChainActivationInfo chainActivationInfo, String str, boolean z, int i, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = chainActivationInfo.chainIndex;
        }
        if ((i2 & 2) != 0) {
            z = chainActivationInfo.activated;
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            i = chainActivationInfo.activationFeeTokenDecimal;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = chainActivationInfo.activationFeeTokenSymbol;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = chainActivationInfo.activationFeeAmount;
        }
        String str6 = str3;
        if ((i2 & 32) != 0) {
            str4 = chainActivationInfo.transactionFeeAmount;
        }
        return chainActivationInfo.copy(str, z2, i3, str5, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.activated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.activationFeeTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.activationFeeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.activationFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.transactionFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChainActivationInfo copy(@NotNull String str, boolean z, int i, @NotNull String str2, @NotNull String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ChainActivationInfo(str, z, i, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChainActivationInfo)) {
            return false;
        }
        ChainActivationInfo chainActivationInfo = (ChainActivationInfo) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) chainActivationInfo.chainIndex) && this.activated == chainActivationInfo.activated && this.activationFeeTokenDecimal == chainActivationInfo.activationFeeTokenDecimal && Intrinsics.EZpvd((Object) this.activationFeeTokenSymbol, (Object) chainActivationInfo.activationFeeTokenSymbol) && Intrinsics.EZpvd((Object) this.activationFeeAmount, (Object) chainActivationInfo.activationFeeAmount) && Intrinsics.EZpvd((Object) this.transactionFeeAmount, (Object) chainActivationInfo.transactionFeeAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getActivated() {
        return this.activated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivationFeeAmount() {
        return this.activationFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getActivationFeeTokenDecimal() {
        return this.activationFeeTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivationFeeTokenSymbol() {
        return this.activationFeeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionFeeAmount() {
        return this.transactionFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainIndex.hashCode();
        int iHashCode2 = Boolean.hashCode(this.activated);
        int iHashCode3 = Integer.hashCode(this.activationFeeTokenDecimal);
        int iHashCode4 = this.activationFeeTokenSymbol.hashCode();
        int iHashCode5 = this.activationFeeAmount.hashCode();
        String str = this.transactionFeeAmount;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChainActivationInfo(chainIndex=" + this.chainIndex + ", activated=" + this.activated + ", activationFeeTokenDecimal=" + this.activationFeeTokenDecimal + ", activationFeeTokenSymbol=" + this.activationFeeTokenSymbol + ", activationFeeAmount=" + this.activationFeeAmount + ", transactionFeeAmount=" + this.transactionFeeAmount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.onchaintransaction.model.ChainActivationInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChainActivationInfo> serializer() {
            return ChainActivationInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChainActivationInfo(int i, String str, boolean z, int i2, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, ChainActivationInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = str;
        this.activated = z;
        this.activationFeeTokenDecimal = i2;
        this.activationFeeTokenSymbol = str2;
        this.activationFeeAmount = str3;
        if ((i & 32) == 0) {
            this.transactionFeeAmount = "0";
        } else {
            this.transactionFeeAmount = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(ChainActivationInfo chainActivationInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, chainActivationInfo.chainIndex);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, chainActivationInfo.activated);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, chainActivationInfo.activationFeeTokenDecimal);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, chainActivationInfo.activationFeeTokenSymbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, chainActivationInfo.activationFeeAmount);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) chainActivationInfo.transactionFeeAmount, (Object) "0")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, chainActivationInfo.transactionFeeAmount);
    }

    public ChainActivationInfo(@NotNull String str, boolean z, int i, @NotNull String str2, @NotNull String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.chainIndex = str;
        this.activated = z;
        this.activationFeeTokenDecimal = i;
        this.activationFeeTokenSymbol = str2;
        this.activationFeeAmount = str3;
        this.transactionFeeAmount = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 boolean)
  (r10v0 int)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("0") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, boolean, int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:14) call: com.okinc.business.web3pay.lib.features.onchaintransaction.model.ChainActivationInfo.<init>(java.lang.String, boolean, int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ChainActivationInfo(String str, boolean z, int i, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, i, str2, str3, (i2 & 32) != 0 ? "0" : str4);
    }
}

package com.okinc.business.dexlogic.main.swap.trade.input.helper;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class CoinState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String availableAmountNum;
    private final String availableCurrencyAmount;
    private final boolean errorType;
    private final String originData;
    private final String showData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CoinState copy$default(CoinState coinState, String str, String str2, boolean z, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coinState.showData;
        }
        if ((i & 2) != 0) {
            str2 = coinState.originData;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            z = coinState.errorType;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str3 = coinState.availableCurrencyAmount;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = coinState.availableAmountNum;
        }
        return coinState.copy(str, str5, z2, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.showData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.originData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.errorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.availableCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.availableAmountNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinState copy(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new CoinState(str, str2, z, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoinState)) {
            return false;
        }
        CoinState coinState = (CoinState) obj;
        return Intrinsics.EZpvd((Object) this.showData, (Object) coinState.showData) && Intrinsics.EZpvd((Object) this.originData, (Object) coinState.originData) && this.errorType == coinState.errorType && Intrinsics.EZpvd((Object) this.availableCurrencyAmount, (Object) coinState.availableCurrencyAmount) && Intrinsics.EZpvd((Object) this.availableAmountNum, (Object) coinState.availableAmountNum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailableAmountNum() {
        return this.availableAmountNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailableCurrencyAmount() {
        return this.availableCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getErrorType() {
        return this.errorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginData() {
        return this.originData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShowData() {
        return this.showData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.showData.hashCode() * 31) + this.originData.hashCode()) * 31) + Boolean.hashCode(this.errorType)) * 31) + this.availableCurrencyAmount.hashCode()) * 31) + this.availableAmountNum.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinState(showData=" + this.showData + ", originData=" + this.originData + ", errorType=" + this.errorType + ", availableCurrencyAmount=" + this.availableCurrencyAmount + ", availableAmountNum=" + this.availableAmountNum + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.swap.trade.input.helper.CoinState.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinState> serializer() {
            return CoinState$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoinState(int i, String str, String str2, boolean z, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CoinState$$serializer.INSTANCE.getDescriptor());
        }
        this.showData = str;
        this.originData = str2;
        if ((i & 4) == 0) {
            this.errorType = false;
        } else {
            this.errorType = z;
        }
        if ((i & 8) == 0) {
            this.availableCurrencyAmount = "";
        } else {
            this.availableCurrencyAmount = str3;
        }
        if ((i & 16) == 0) {
            this.availableAmountNum = "";
        } else {
            this.availableAmountNum = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CoinState coinState, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, coinState.showData);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, coinState.originData);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || coinState.errorType) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, coinState.errorType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) coinState.availableCurrencyAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, coinState.availableCurrencyAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) coinState.availableAmountNum, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, coinState.availableAmountNum);
    }

    public CoinState(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.showData = str;
        this.originData = str2;
        this.errorType = z;
        this.availableCurrencyAmount = str3;
        this.availableAmountNum = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (wrap:boolean:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void (m)] (LINE:44) call: com.okinc.business.dexlogic.main.swap.trade.input.helper.CoinState.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CoinState(String str, String str2, boolean z, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }
}

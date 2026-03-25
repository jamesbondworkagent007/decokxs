package com.okinc.business.web3pay.lib.features.asset.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CoinAsset {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String deficitAmount;
    private final String tokenAmount;
    private final String tokenCoinTypeNo;
    private final String usdAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CoinAsset copy$default(CoinAsset coinAsset, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coinAsset.tokenAmount;
        }
        if ((i & 2) != 0) {
            str2 = coinAsset.usdAmount;
        }
        if ((i & 4) != 0) {
            str3 = coinAsset.tokenCoinTypeNo;
        }
        if ((i & 8) != 0) {
            str4 = coinAsset.deficitAmount;
        }
        return coinAsset.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.deficitAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinAsset copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new CoinAsset(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoinAsset)) {
            return false;
        }
        CoinAsset coinAsset = (CoinAsset) obj;
        return Intrinsics.EZpvd((Object) this.tokenAmount, (Object) coinAsset.tokenAmount) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) coinAsset.usdAmount) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) coinAsset.tokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.deficitAmount, (Object) coinAsset.deficitAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeficitAmount() {
        return this.deficitAmount;
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
    public final String getUsdAmount() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.tokenAmount.hashCode() * 31) + this.usdAmount.hashCode()) * 31) + this.tokenCoinTypeNo.hashCode()) * 31) + this.deficitAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinAsset(tokenAmount=" + this.tokenAmount + ", usdAmount=" + this.usdAmount + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", deficitAmount=" + this.deficitAmount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.asset.model.CoinAsset.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinAsset> serializer() {
            return CoinAsset$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoinAsset(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, CoinAsset$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenAmount = str;
        this.usdAmount = str2;
        this.tokenCoinTypeNo = str3;
        if ((i & 8) == 0) {
            this.deficitAmount = "0";
        } else {
            this.deficitAmount = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(CoinAsset coinAsset, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, coinAsset.tokenAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, coinAsset.usdAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, coinAsset.tokenCoinTypeNo);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) coinAsset.deficitAmount, (Object) "0")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, coinAsset.deficitAmount);
    }

    public CoinAsset(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.tokenAmount = str;
        this.usdAmount = str2;
        this.tokenCoinTypeNo = str3;
        this.deficitAmount = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("0") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:138) call: com.okinc.business.web3pay.lib.features.asset.model.CoinAsset.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CoinAsset(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "0" : str4);
    }
}

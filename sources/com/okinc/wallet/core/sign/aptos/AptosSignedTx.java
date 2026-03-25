package com.okinc.wallet.core.sign.aptos;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class AptosSignedTx {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String accAuthenticator;
    private final String rawTxn;
    private final String txHash;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AptosSignedTx() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AptosSignedTx copy$default(AptosSignedTx aptosSignedTx, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aptosSignedTx.rawTxn;
        }
        if ((i & 2) != 0) {
            str2 = aptosSignedTx.txHash;
        }
        if ((i & 4) != 0) {
            str3 = aptosSignedTx.accAuthenticator;
        }
        return aptosSignedTx.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.rawTxn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.accAuthenticator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AptosSignedTx copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AptosSignedTx(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AptosSignedTx)) {
            return false;
        }
        AptosSignedTx aptosSignedTx = (AptosSignedTx) obj;
        return Intrinsics.EZpvd((Object) this.rawTxn, (Object) aptosSignedTx.rawTxn) && Intrinsics.EZpvd((Object) this.txHash, (Object) aptosSignedTx.txHash) && Intrinsics.EZpvd((Object) this.accAuthenticator, (Object) aptosSignedTx.accAuthenticator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccAuthenticator() {
        return this.accAuthenticator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRawTxn() {
        return this.rawTxn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.rawTxn.hashCode() * 31) + this.txHash.hashCode()) * 31) + this.accAuthenticator.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AptosSignedTx(rawTxn=" + this.rawTxn + ", txHash=" + this.txHash + ", accAuthenticator=" + this.accAuthenticator + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.aptos.AptosSignedTx.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AptosSignedTx> serializer() {
            return AptosSignedTx$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AptosSignedTx(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.rawTxn = "";
        } else {
            this.rawTxn = str;
        }
        if ((i & 2) == 0) {
            this.txHash = "";
        } else {
            this.txHash = str2;
        }
        if ((i & 4) == 0) {
            this.accAuthenticator = "";
        } else {
            this.accAuthenticator = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(AptosSignedTx aptosSignedTx, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) aptosSignedTx.rawTxn, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, aptosSignedTx.rawTxn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) aptosSignedTx.txHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, aptosSignedTx.txHash);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) aptosSignedTx.accAuthenticator, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, aptosSignedTx.accAuthenticator);
    }

    public AptosSignedTx(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.rawTxn = str;
        this.txHash = str2;
        this.accAuthenticator = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:52) call: com.okinc.wallet.core.sign.aptos.AptosSignedTx.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AptosSignedTx(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}

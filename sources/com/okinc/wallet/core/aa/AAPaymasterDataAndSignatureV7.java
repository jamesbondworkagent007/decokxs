package com.okinc.wallet.core.aa;

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
public final class AAPaymasterDataAndSignatureV7 {
    private String paymasterData;
    private String signature;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AAPaymasterDataAndSignatureV7() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AAPaymasterDataAndSignatureV7 copy$default(AAPaymasterDataAndSignatureV7 aAPaymasterDataAndSignatureV7, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aAPaymasterDataAndSignatureV7.paymasterData;
        }
        if ((i & 2) != 0) {
            str2 = aAPaymasterDataAndSignatureV7.signature;
        }
        return aAPaymasterDataAndSignatureV7.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.paymasterData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AAPaymasterDataAndSignatureV7 copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AAPaymasterDataAndSignatureV7(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AAPaymasterDataAndSignatureV7)) {
            return false;
        }
        AAPaymasterDataAndSignatureV7 aAPaymasterDataAndSignatureV7 = (AAPaymasterDataAndSignatureV7) obj;
        return Intrinsics.EZpvd((Object) this.paymasterData, (Object) aAPaymasterDataAndSignatureV7.paymasterData) && Intrinsics.EZpvd((Object) this.signature, (Object) aAPaymasterDataAndSignatureV7.signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterData() {
        return this.paymasterData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.paymasterData.hashCode() * 31) + this.signature.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymasterData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymasterData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignature(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signature = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AAPaymasterDataAndSignatureV7(paymasterData=" + this.paymasterData + ", signature=" + this.signature + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.aa.AAPaymasterDataAndSignatureV7.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AAPaymasterDataAndSignatureV7> serializer() {
            return AAPaymasterDataAndSignatureV7$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AAPaymasterDataAndSignatureV7(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.paymasterData = "";
        } else {
            this.paymasterData = str;
        }
        if ((i & 2) == 0) {
            this.signature = "";
        } else {
            this.signature = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(AAPaymasterDataAndSignatureV7 aAPaymasterDataAndSignatureV7, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) aAPaymasterDataAndSignatureV7.paymasterData, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, aAPaymasterDataAndSignatureV7.paymasterData);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) aAPaymasterDataAndSignatureV7.signature, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, aAPaymasterDataAndSignatureV7.signature);
    }

    public AAPaymasterDataAndSignatureV7(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.paymasterData = str;
        this.signature = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:40) call: com.okinc.wallet.core.aa.AAPaymasterDataAndSignatureV7.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AAPaymasterDataAndSignatureV7(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}

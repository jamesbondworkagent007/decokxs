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
public final class AAPaymasterDataAndSignature {
    private String paymasterAndData;
    private String signature;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AAPaymasterDataAndSignature() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AAPaymasterDataAndSignature copy$default(AAPaymasterDataAndSignature aAPaymasterDataAndSignature, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aAPaymasterDataAndSignature.paymasterAndData;
        }
        if ((i & 2) != 0) {
            str2 = aAPaymasterDataAndSignature.signature;
        }
        return aAPaymasterDataAndSignature.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.paymasterAndData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AAPaymasterDataAndSignature copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AAPaymasterDataAndSignature(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AAPaymasterDataAndSignature)) {
            return false;
        }
        AAPaymasterDataAndSignature aAPaymasterDataAndSignature = (AAPaymasterDataAndSignature) obj;
        return Intrinsics.EZpvd((Object) this.paymasterAndData, (Object) aAPaymasterDataAndSignature.paymasterAndData) && Intrinsics.EZpvd((Object) this.signature, (Object) aAPaymasterDataAndSignature.signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterAndData() {
        return this.paymasterAndData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.paymasterAndData.hashCode() * 31) + this.signature.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymasterAndData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymasterAndData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignature(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signature = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AAPaymasterDataAndSignature(paymasterAndData=" + this.paymasterAndData + ", signature=" + this.signature + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.aa.AAPaymasterDataAndSignature.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AAPaymasterDataAndSignature> serializer() {
            return AAPaymasterDataAndSignature$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AAPaymasterDataAndSignature(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.paymasterAndData = "";
        } else {
            this.paymasterAndData = str;
        }
        if ((i & 2) == 0) {
            this.signature = "";
        } else {
            this.signature = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(AAPaymasterDataAndSignature aAPaymasterDataAndSignature, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) aAPaymasterDataAndSignature.paymasterAndData, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, aAPaymasterDataAndSignature.paymasterAndData);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) aAPaymasterDataAndSignature.signature, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, aAPaymasterDataAndSignature.signature);
    }

    public AAPaymasterDataAndSignature(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.paymasterAndData = str;
        this.signature = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.okinc.wallet.core.aa.AAPaymasterDataAndSignature.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AAPaymasterDataAndSignature(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}

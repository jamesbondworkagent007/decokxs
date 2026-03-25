package com.okinc.wallet.core.sign.solana;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class SolUnitLimitAndPrice {
    private String computeUnitLimit;
    private String computeUnitPrice;
    private boolean deserialized;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SolUnitLimitAndPrice copy$default(SolUnitLimitAndPrice solUnitLimitAndPrice, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = solUnitLimitAndPrice.deserialized;
        }
        if ((i & 2) != 0) {
            str = solUnitLimitAndPrice.computeUnitLimit;
        }
        if ((i & 4) != 0) {
            str2 = solUnitLimitAndPrice.computeUnitPrice;
        }
        return solUnitLimitAndPrice.copy(z, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.deserialized;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.computeUnitLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.computeUnitPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SolUnitLimitAndPrice copy(boolean z, String str, String str2) {
        return new SolUnitLimitAndPrice(z, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SolUnitLimitAndPrice)) {
            return false;
        }
        SolUnitLimitAndPrice solUnitLimitAndPrice = (SolUnitLimitAndPrice) obj;
        return this.deserialized == solUnitLimitAndPrice.deserialized && Intrinsics.EZpvd((Object) this.computeUnitLimit, (Object) solUnitLimitAndPrice.computeUnitLimit) && Intrinsics.EZpvd((Object) this.computeUnitPrice, (Object) solUnitLimitAndPrice.computeUnitPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getComputeUnitLimit() {
        return this.computeUnitLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getComputeUnitPrice() {
        return this.computeUnitPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDeserialized() {
        return this.deserialized;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.deserialized);
        String str = this.computeUnitLimit;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.computeUnitPrice;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setComputeUnitLimit(String str) {
        this.computeUnitLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setComputeUnitPrice(String str) {
        this.computeUnitPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeserialized(boolean z) {
        this.deserialized = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SolUnitLimitAndPrice(deserialized=" + this.deserialized + ", computeUnitLimit=" + this.computeUnitLimit + ", computeUnitPrice=" + this.computeUnitPrice + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.solana.SolUnitLimitAndPrice.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SolUnitLimitAndPrice> serializer() {
            return SolUnitLimitAndPrice$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SolUnitLimitAndPrice(int i, boolean z, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, SolUnitLimitAndPrice$$serializer.INSTANCE.getDescriptor());
        }
        this.deserialized = z;
        if ((i & 2) == 0) {
            this.computeUnitLimit = "";
        } else {
            this.computeUnitLimit = str;
        }
        if ((i & 4) == 0) {
            this.computeUnitPrice = "";
        } else {
            this.computeUnitPrice = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(SolUnitLimitAndPrice solUnitLimitAndPrice, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, solUnitLimitAndPrice.deserialized);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) solUnitLimitAndPrice.computeUnitLimit, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, solUnitLimitAndPrice.computeUnitLimit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) solUnitLimitAndPrice.computeUnitPrice, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, solUnitLimitAndPrice.computeUnitPrice);
    }

    public SolUnitLimitAndPrice(boolean z, String str, String str2) {
        this.deserialized = z;
        this.computeUnitLimit = str;
        this.computeUnitPrice = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r2v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String):void (m)] (LINE:62) call: com.okinc.wallet.core.sign.solana.SolUnitLimitAndPrice.<init>(boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SolUnitLimitAndPrice(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}

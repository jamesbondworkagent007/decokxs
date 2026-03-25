package com.okinc.wallet.core.sign.sui;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C54907xZt;
import o.C56402yEa;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class SuiSignedTx {
    private String signature;
    private String tx_bytes;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SuiSignedTx copy$default(SuiSignedTx suiSignedTx, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suiSignedTx.tx_bytes;
        }
        if ((i & 2) != 0) {
            str2 = suiSignedTx.signature;
        }
        return suiSignedTx.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tx_bytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SuiSignedTx copy(String str, String str2) {
        return new SuiSignedTx(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuiSignedTx)) {
            return false;
        }
        SuiSignedTx suiSignedTx = (SuiSignedTx) obj;
        return Intrinsics.EZpvd((Object) this.tx_bytes, (Object) suiSignedTx.tx_bytes) && Intrinsics.EZpvd((Object) this.signature, (Object) suiSignedTx.signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTx_bytes() {
        return this.tx_bytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.tx_bytes;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.signature;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignature(String str) {
        this.signature = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTx_bytes(String str) {
        this.tx_bytes = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SuiSignedTx(tx_bytes=" + this.tx_bytes + ", signature=" + this.signature + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.sui.SuiSignedTx.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SuiSignedTx> serializer() {
            return SuiSignedTx$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SuiSignedTx(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SuiSignedTx$$serializer.INSTANCE.getDescriptor());
        }
        this.tx_bytes = str;
        this.signature = str2;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(SuiSignedTx suiSignedTx, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, suiSignedTx.tx_bytes);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, suiSignedTx.signature);
    }

    public SuiSignedTx(String str, String str2) {
        this.tx_bytes = str;
        this.signature = str2;
    }

    public final String toSerializedJson() {
        String str = this.tx_bytes;
        if (str == null) {
            str = "";
        }
        String str2 = this.signature;
        return C54907xZt.encodeToString$default(SuiSerializedTx.Companion.serializer(), new SuiSerializedTx(str, C56402yEa.EZpvd(str2 != null ? str2 : ""), "WaitForEffectsCert"), false, 2, null);
    }
}

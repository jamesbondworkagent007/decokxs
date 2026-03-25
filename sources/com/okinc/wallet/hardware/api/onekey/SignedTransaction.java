package com.okinc.wallet.hardware.api.onekey;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class SignedTransaction {
    public final String serializedTx;
    public final List<String> signatures;
    public final String txid;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.serializedTx;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.SignedTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignedTransaction> serializer() {
            return SignedTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignedTransaction(int i, List list, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SignedTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.signatures = list;
        this.serializedTx = str;
        if ((i & 4) == 0) {
            this.txid = null;
        } else {
            this.txid = str2;
        }
    }

    public static final /* synthetic */ void AEQbTJ(SignedTransaction signedTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], signedTransaction.signatures);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, signedTransaction.serializedTx);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && signedTransaction.txid == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, signedTransaction.txid);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(SignedTransaction.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        SignedTransaction signedTransaction = (SignedTransaction) obj;
        return Intrinsics.EZpvd(this.signatures, signedTransaction.signatures) && Intrinsics.EZpvd((Object) this.serializedTx, (Object) signedTransaction.serializedTx) && Intrinsics.EZpvd((Object) this.txid, (Object) signedTransaction.txid);
    }

    public int hashCode() {
        int iHashCode = this.signatures.hashCode();
        int iHashCode2 = this.serializedTx.hashCode();
        String str = this.txid;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "SignedTransaction(signatures=" + this.signatures + ", serializedTx='" + this.serializedTx + "', txid=" + this.txid + ")";
    }
}

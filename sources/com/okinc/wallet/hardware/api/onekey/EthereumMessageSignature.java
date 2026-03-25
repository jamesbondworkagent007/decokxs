package com.okinc.wallet.hardware.api.onekey;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class EthereumMessageSignature {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String address;
    public final String signature;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.signature;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.EthereumMessageSignature.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EthereumMessageSignature> serializer() {
            return EthereumMessageSignature$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EthereumMessageSignature(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, EthereumMessageSignature$$serializer.INSTANCE.getDescriptor());
        }
        this.signature = str;
        this.address = str2;
    }

    public static final /* synthetic */ void copydefault(EthereumMessageSignature ethereumMessageSignature, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, ethereumMessageSignature.signature);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, ethereumMessageSignature.address);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(EthereumMessageSignature.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        EthereumMessageSignature ethereumMessageSignature = (EthereumMessageSignature) obj;
        return Intrinsics.EZpvd((Object) this.signature, (Object) ethereumMessageSignature.signature) && Intrinsics.EZpvd((Object) this.address, (Object) ethereumMessageSignature.address);
    }

    public int hashCode() {
        return (this.signature.hashCode() * 31) + this.address.hashCode();
    }

    public String toString() {
        return "EthereumMessageSignature(signature='" + this.signature + "', address='" + this.address + "')";
    }
}

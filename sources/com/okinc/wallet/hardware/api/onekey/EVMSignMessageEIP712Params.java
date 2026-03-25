package com.okinc.wallet.hardware.api.onekey;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56996yaA;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class EVMSignMessageEIP712Params {
    public final String domainHash;
    public final String messageHash;
    public final Path path;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.EVMSignMessageEIP712Params.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EVMSignMessageEIP712Params> serializer() {
            return EVMSignMessageEIP712Params$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EVMSignMessageEIP712Params(int i, Path path, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, EVMSignMessageEIP712Params$$serializer.INSTANCE.getDescriptor());
        }
        this.path = path;
        this.domainHash = str;
        this.messageHash = str2;
    }

    public static final /* synthetic */ void AEQbTJ(EVMSignMessageEIP712Params eVMSignMessageEIP712Params, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, C56996yaA.KWHzl, eVMSignMessageEIP712Params.path);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, eVMSignMessageEIP712Params.domainHash);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, eVMSignMessageEIP712Params.messageHash);
    }
}

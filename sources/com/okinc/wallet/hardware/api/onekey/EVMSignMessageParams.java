package com.okinc.wallet.hardware.api.onekey;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56996yaA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class EVMSignMessageParams {
    public final Long chainId;
    public final String messageHex;
    public final Path path;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.EVMSignMessageParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EVMSignMessageParams> serializer() {
            return EVMSignMessageParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EVMSignMessageParams(int i, Path path, String str, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, EVMSignMessageParams$$serializer.INSTANCE.getDescriptor());
        }
        this.path = path;
        this.messageHex = str;
        if ((i & 4) == 0) {
            this.chainId = null;
        } else {
            this.chainId = l;
        }
    }

    public static final /* synthetic */ void EZpvd(EVMSignMessageParams eVMSignMessageParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, C56996yaA.KWHzl, eVMSignMessageParams.path);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, eVMSignMessageParams.messageHex);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && eVMSignMessageParams.chainId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, eVMSignMessageParams.chainId);
    }

    public EVMSignMessageParams(Path path, String str, Long l) {
        this.path = path;
        this.messageHex = str;
        this.chainId = l;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EVMSignMessageParams(@NotNull String str, @NotNull String str2, Long l) {
        this(new Path(str), str2, l);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }
}

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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import o.C56996yaA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class EVMSignTypedDataParams {
    public static final String EIP712_DOMAIN = "EIP712Domain";
    public final Long chainId;
    public final JsonObject data;
    public final String domainHash;
    public final String messageHash;
    public final boolean metamaskV4Compat;
    public final Path path;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ EVMSignTypedDataParams(int i, Path path, boolean z, JsonObject jsonObject, String str, String str2, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, EVMSignTypedDataParams$$serializer.INSTANCE.getDescriptor());
        }
        this.path = path;
        this.metamaskV4Compat = z;
        this.data = jsonObject;
        if ((i & 8) == 0) {
            this.domainHash = null;
        } else {
            this.domainHash = str;
        }
        if ((i & 16) == 0) {
            this.messageHash = null;
        } else {
            this.messageHash = str2;
        }
        if ((i & 32) == 0) {
            this.chainId = null;
        } else {
            this.chainId = l;
        }
    }

    public static final /* synthetic */ void OLrzqt(EVMSignTypedDataParams eVMSignTypedDataParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, C56996yaA.KWHzl, eVMSignTypedDataParams.path);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, eVMSignTypedDataParams.metamaskV4Compat);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, JsonObjectSerializer.INSTANCE, eVMSignTypedDataParams.data);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || eVMSignTypedDataParams.domainHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, eVMSignTypedDataParams.domainHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || eVMSignTypedDataParams.messageHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, eVMSignTypedDataParams.messageHash);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && eVMSignTypedDataParams.chainId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, eVMSignTypedDataParams.chainId);
    }

    public EVMSignTypedDataParams(Path path, boolean z, JsonObject jsonObject, String str, String str2, Long l) {
        this.path = path;
        this.metamaskV4Compat = z;
        this.data = jsonObject;
        this.domainHash = str;
        this.messageHash = str2;
        this.chainId = l;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.EVMSignTypedDataParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EVMSignTypedDataParams> serializer() {
            return EVMSignTypedDataParams$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EVMSignTypedDataParams(@NotNull String str, boolean z, @NotNull JsonObject jsonObject, String str2, String str3, Long l) {
        this(new Path(str), z, jsonObject, str2, str3, l);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
    }
}

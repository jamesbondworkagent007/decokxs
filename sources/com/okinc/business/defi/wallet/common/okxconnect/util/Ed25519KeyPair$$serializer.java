package com.okinc.business.defi.wallet.common.okxconnect.util;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ByteArraySerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Ed25519KeyPair$$serializer implements GeneratedSerializer<Ed25519KeyPair> {
    public static final int $stable;
    public static final Ed25519KeyPair$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Ed25519KeyPair$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Ed25519KeyPair$$serializer ed25519KeyPair$$serializer = new Ed25519KeyPair$$serializer();
        INSTANCE = ed25519KeyPair$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.common.okxconnect.util.Ed25519KeyPair", ed25519KeyPair$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("publicKey", false);
        pluginGeneratedSerialDescriptor.addElement("privateKey", false);
        pluginGeneratedSerialDescriptor.addElement("publicKeyByteArray", true);
        pluginGeneratedSerialDescriptor.addElement("privateKeyByteArray", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        ByteArraySerializer byteArraySerializer = ByteArraySerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, byteArraySerializer, byteArraySerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Ed25519KeyPair deserialize(@NotNull Decoder decoder) {
        int i;
        byte[] bArr;
        String str;
        String str2;
        byte[] bArr2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        byte[] bArr3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            ByteArraySerializer byteArraySerializer = ByteArraySerializer.INSTANCE;
            byte[] bArr4 = (byte[]) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, byteArraySerializer, null);
            str2 = strDecodeStringElement;
            bArr2 = (byte[]) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, byteArraySerializer, null);
            bArr = bArr4;
            str = strDecodeStringElement2;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            byte[] bArr5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    bArr3 = (byte[]) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, ByteArraySerializer.INSTANCE, bArr3);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    bArr5 = (byte[]) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, ByteArraySerializer.INSTANCE, bArr5);
                    i2 |= 8;
                }
            }
            i = i2;
            bArr = bArr3;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            bArr2 = bArr5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Ed25519KeyPair(i, str2, str, bArr, bArr2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull Ed25519KeyPair ed25519KeyPair) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(ed25519KeyPair, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Ed25519KeyPair.copydefault(ed25519KeyPair, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

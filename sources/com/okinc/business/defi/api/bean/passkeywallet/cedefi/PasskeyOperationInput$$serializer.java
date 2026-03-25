package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class PasskeyOperationInput$$serializer implements GeneratedSerializer<PasskeyOperationInput> {
    public static final int $stable;
    public static final PasskeyOperationInput$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PasskeyOperationInput$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PasskeyOperationInput$$serializer passkeyOperationInput$$serializer = new PasskeyOperationInput$$serializer();
        INSTANCE = passkeyOperationInput$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationInput", passkeyOperationInput$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("passkeyOperationSourceType", false);
        pluginGeneratedSerialDescriptor.addElement("passkeyOperationSourceSubType", false);
        pluginGeneratedSerialDescriptor.addElement("passkeyOperationType", true);
        pluginGeneratedSerialDescriptor.addElement("enableExternal", true);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = PasskeyOperationInput.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], kSerializerArr[2], BooleanSerializer.INSTANCE, StringSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PasskeyOperationInput deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        int i;
        PasskeyOperationType passkeyOperationType;
        String strDecodeStringElement;
        PasskeyOperationSourceSubType passkeyOperationSourceSubType;
        PasskeyOperationSourceType passkeyOperationSourceType;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PasskeyOperationInput.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            PasskeyOperationSourceType passkeyOperationSourceType2 = (PasskeyOperationSourceType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            PasskeyOperationSourceSubType passkeyOperationSourceSubType2 = (PasskeyOperationSourceSubType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            passkeyOperationType = (PasskeyOperationType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            passkeyOperationSourceType = passkeyOperationSourceType2;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            i = 31;
            passkeyOperationSourceSubType = passkeyOperationSourceSubType2;
        } else {
            PasskeyOperationType passkeyOperationType2 = null;
            String strDecodeStringElement2 = null;
            PasskeyOperationSourceSubType passkeyOperationSourceSubType3 = null;
            PasskeyOperationSourceType passkeyOperationSourceType3 = null;
            boolean zDecodeBooleanElement2 = false;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    passkeyOperationSourceType3 = (PasskeyOperationSourceType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], passkeyOperationSourceType3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    i2 |= 2;
                    passkeyOperationSourceSubType3 = (PasskeyOperationSourceSubType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], passkeyOperationSourceSubType3);
                } else if (iDecodeElementIndex == 2) {
                    i2 |= 4;
                    passkeyOperationType2 = (PasskeyOperationType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], passkeyOperationType2);
                } else if (iDecodeElementIndex == 3) {
                    zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    i2 |= 16;
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i = i2;
            passkeyOperationType = passkeyOperationType2;
            strDecodeStringElement = strDecodeStringElement2;
            passkeyOperationSourceSubType = passkeyOperationSourceSubType3;
            passkeyOperationSourceType = passkeyOperationSourceType3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PasskeyOperationInput(i, passkeyOperationSourceType, passkeyOperationSourceSubType, passkeyOperationType, zDecodeBooleanElement, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PasskeyOperationInput passkeyOperationInput) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(passkeyOperationInput, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PasskeyOperationInput.write$Self$OKWallet_wallet_api(passkeyOperationInput, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

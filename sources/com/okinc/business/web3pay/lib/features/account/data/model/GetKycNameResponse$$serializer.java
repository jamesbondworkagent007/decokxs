package com.okinc.business.web3pay.lib.features.account.data.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class GetKycNameResponse$$serializer implements GeneratedSerializer<GetKycNameResponse> {
    public static final int $stable;
    public static final GetKycNameResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private GetKycNameResponse$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        GetKycNameResponse$$serializer getKycNameResponse$$serializer = new GetKycNameResponse$$serializer();
        INSTANCE = getKycNameResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.account.data.model.GetKycNameResponse", getKycNameResponse$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("userSelf", false);
        pluginGeneratedSerialDescriptor.addElement("sender", false);
        pluginGeneratedSerialDescriptor.addElement("receiver", false);
        pluginGeneratedSerialDescriptor.addElement("receiverHasSA", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        KycNameAndUid$$serializer kycNameAndUid$$serializer = KycNameAndUid$$serializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, kycNameAndUid$$serializer, BuiltinSerializersKt.getNullable(kycNameAndUid$$serializer), booleanSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final GetKycNameResponse deserialize(@NotNull Decoder decoder) {
        boolean z;
        boolean zDecodeBooleanElement;
        KycNameAndUid kycNameAndUid;
        KycNameAndUid kycNameAndUid2;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            KycNameAndUid$$serializer kycNameAndUid$$serializer = KycNameAndUid$$serializer.INSTANCE;
            KycNameAndUid kycNameAndUid3 = (KycNameAndUid) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kycNameAndUid$$serializer, null);
            KycNameAndUid kycNameAndUid4 = (KycNameAndUid) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kycNameAndUid$$serializer, null);
            z = zDecodeBooleanElement2;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            kycNameAndUid = kycNameAndUid4;
            i = 15;
            kycNameAndUid2 = kycNameAndUid3;
        } else {
            KycNameAndUid kycNameAndUid5 = null;
            KycNameAndUid kycNameAndUid6 = null;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            int i2 = 0;
            boolean z2 = true;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z2 = false;
                } else if (iDecodeElementIndex == 0) {
                    zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    kycNameAndUid6 = (KycNameAndUid) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, KycNameAndUid$$serializer.INSTANCE, kycNameAndUid6);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    kycNameAndUid5 = (KycNameAndUid) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, KycNameAndUid$$serializer.INSTANCE, kycNameAndUid5);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                    i2 |= 8;
                }
            }
            z = zDecodeBooleanElement3;
            zDecodeBooleanElement = zDecodeBooleanElement4;
            kycNameAndUid = kycNameAndUid5;
            kycNameAndUid2 = kycNameAndUid6;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GetKycNameResponse(i, z, kycNameAndUid2, kycNameAndUid, zDecodeBooleanElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull GetKycNameResponse getKycNameResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(getKycNameResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        GetKycNameResponse.write$Self$OKPayCore_web3pay_lib(getKycNameResponse, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

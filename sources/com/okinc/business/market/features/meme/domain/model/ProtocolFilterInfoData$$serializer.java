package com.okinc.business.market.features.meme.domain.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ProtocolFilterInfoData$$serializer implements GeneratedSerializer<ProtocolFilterInfoData> {
    public static final int $stable;
    public static final ProtocolFilterInfoData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ProtocolFilterInfoData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ProtocolFilterInfoData$$serializer protocolFilterInfoData$$serializer = new ProtocolFilterInfoData$$serializer();
        INSTANCE = protocolFilterInfoData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.features.meme.domain.model.ProtocolFilterInfoData", protocolFilterInfoData$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("rankType", true);
        pluginGeneratedSerialDescriptor.addElement("protocolIdList", true);
        pluginGeneratedSerialDescriptor.addElement("defaultProtocolIdList", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = ProtocolFilterInfoData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, kSerializerArr[2], kSerializerArr[3]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ProtocolFilterInfoData deserialize(@NotNull Decoder decoder) {
        int i;
        List list;
        List list2;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = ProtocolFilterInfoData.$childSerializers;
        List list3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            str2 = strDecodeStringElement;
            str = strDecodeStringElement2;
            i = 15;
            list = list4;
        } else {
            int i2 = 0;
            boolean z = true;
            List list5 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
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
                    list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], list3);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], list5);
                    i2 |= 8;
                }
            }
            i = i2;
            list = list3;
            list2 = list5;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ProtocolFilterInfoData(i, str2, str, list, list2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ProtocolFilterInfoData protocolFilterInfoData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(protocolFilterInfoData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ProtocolFilterInfoData.write$Self$OKDex_dex_impl(protocolFilterInfoData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

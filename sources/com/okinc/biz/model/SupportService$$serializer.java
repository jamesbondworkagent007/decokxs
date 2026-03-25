package com.okinc.biz.model;

import com.okinc.biz.bean.enums.SupportChannelType;
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
import kotlinx.serialization.internal.StringSerializer;
import o.InterfaceC6817aWY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class SupportService$$serializer implements GeneratedSerializer<SupportService> {
    public static final int $stable;
    public static final SupportService$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SupportService$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SupportService$$serializer supportService$$serializer = new SupportService$$serializer();
        INSTANCE = supportService$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.biz.model.SupportService", supportService$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("supportChannelType", false);
        pluginGeneratedSerialDescriptor.addElement("serviceAction", false);
        pluginGeneratedSerialDescriptor.addElement("serviceLabel", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SupportService.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], StringSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SupportService deserialize(@NotNull Decoder decoder) {
        int i;
        InterfaceC6817aWY interfaceC6817aWY;
        String strDecodeStringElement;
        SupportChannelType supportChannelType;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SupportService.$childSerializers;
        InterfaceC6817aWY interfaceC6817aWY2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            SupportChannelType supportChannelType2 = (SupportChannelType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            interfaceC6817aWY = (InterfaceC6817aWY) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            supportChannelType = supportChannelType2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            String strDecodeStringElement2 = null;
            SupportChannelType supportChannelType3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    supportChannelType3 = (SupportChannelType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], supportChannelType3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    interfaceC6817aWY2 = (InterfaceC6817aWY) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], interfaceC6817aWY2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            interfaceC6817aWY = interfaceC6817aWY2;
            strDecodeStringElement = strDecodeStringElement2;
            supportChannelType = supportChannelType3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SupportService(i, supportChannelType, interfaceC6817aWY, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SupportService supportService) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(supportService, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SupportService.write$Self$OKSupport_support_api(supportService, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

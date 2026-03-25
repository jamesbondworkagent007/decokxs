package com.okinc.okimcore.model.im.inhouseim.ws;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class WSJoinLiveStream$$serializer implements GeneratedSerializer<WSJoinLiveStream> {
    public static final int $stable;
    public static final WSJoinLiveStream$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private WSJoinLiveStream$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        WSJoinLiveStream$$serializer wSJoinLiveStream$$serializer = new WSJoinLiveStream$$serializer();
        INSTANCE = wSJoinLiveStream$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.im.inhouseim.ws.WSJoinLiveStream", wSJoinLiveStream$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("websocketCommand", false);
        pluginGeneratedSerialDescriptor.addElement("requestId", true);
        pluginGeneratedSerialDescriptor.addElement("data", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{WSJoinLiveStream.$childSerializers[0], StringSerializer.INSTANCE, WSJoinLiveStreamData$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final WSJoinLiveStream deserialize(@NotNull Decoder decoder) {
        int i;
        WSJoinLiveStreamData wSJoinLiveStreamData;
        InHouseIMCommand inHouseIMCommand;
        String strDecodeStringElement;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = WSJoinLiveStream.$childSerializers;
        WSJoinLiveStreamData wSJoinLiveStreamData2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            inHouseIMCommand = (InHouseIMCommand) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            wSJoinLiveStreamData = (WSJoinLiveStreamData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, WSJoinLiveStreamData$$serializer.INSTANCE, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            InHouseIMCommand inHouseIMCommand2 = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    inHouseIMCommand2 = (InHouseIMCommand) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], inHouseIMCommand2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    wSJoinLiveStreamData2 = (WSJoinLiveStreamData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, WSJoinLiveStreamData$$serializer.INSTANCE, wSJoinLiveStreamData2);
                    i2 |= 4;
                }
            }
            i = i2;
            wSJoinLiveStreamData = wSJoinLiveStreamData2;
            inHouseIMCommand = inHouseIMCommand2;
            strDecodeStringElement = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new WSJoinLiveStream(i, inHouseIMCommand, strDecodeStringElement, wSJoinLiveStreamData, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull WSJoinLiveStream wSJoinLiveStream) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(wSJoinLiveStream, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        WSJoinLiveStream.OLrzqt(wSJoinLiveStream, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

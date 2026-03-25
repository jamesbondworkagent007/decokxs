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

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class WSConversationIds$$serializer implements GeneratedSerializer<WSConversationIds> {
    public static final int $stable;
    public static final WSConversationIds$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private WSConversationIds$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        WSConversationIds$$serializer wSConversationIds$$serializer = new WSConversationIds$$serializer();
        INSTANCE = wSConversationIds$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.im.inhouseim.ws.WSConversationIds", wSConversationIds$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("websocketCommand", false);
        pluginGeneratedSerialDescriptor.addElement("requestId", true);
        pluginGeneratedSerialDescriptor.addElement("data", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = WSConversationIds.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], StringSerializer.INSTANCE, kSerializerArr[2]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final WSConversationIds deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        InHouseIMConversationIdsQuery inHouseIMConversationIdsQuery;
        InHouseIMCommand inHouseIMCommand;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = WSConversationIds.$childSerializers;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            InHouseIMCommand inHouseIMCommand2 = (InHouseIMCommand) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            inHouseIMConversationIdsQuery = (InHouseIMConversationIdsQuery) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            inHouseIMCommand = inHouseIMCommand2;
            str = strDecodeStringElement2;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            InHouseIMConversationIdsQuery inHouseIMConversationIdsQuery2 = null;
            InHouseIMCommand inHouseIMCommand3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    inHouseIMCommand3 = (InHouseIMCommand) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], inHouseIMCommand3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    inHouseIMConversationIdsQuery2 = (InHouseIMConversationIdsQuery) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], inHouseIMConversationIdsQuery2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            inHouseIMConversationIdsQuery = inHouseIMConversationIdsQuery2;
            inHouseIMCommand = inHouseIMCommand3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new WSConversationIds(i, inHouseIMCommand, str, inHouseIMConversationIdsQuery, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull WSConversationIds wSConversationIds) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(wSConversationIds, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        WSConversationIds.copydefault(wSConversationIds, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

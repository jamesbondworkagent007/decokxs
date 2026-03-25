package com.okinc.okimcore.model.remote;

import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData$$serializer;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class BroadcastMessageRequest$$serializer implements GeneratedSerializer<BroadcastMessageRequest> {
    public static final int $stable;
    public static final BroadcastMessageRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BroadcastMessageRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BroadcastMessageRequest$$serializer broadcastMessageRequest$$serializer = new BroadcastMessageRequest$$serializer();
        INSTANCE = broadcastMessageRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.remote.BroadcastMessageRequest", broadcastMessageRequest$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("broadcastChannelId", false);
        pluginGeneratedSerialDescriptor.addElement("message", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{LongSerializer.INSTANCE, WSSendMessageDetailData$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BroadcastMessageRequest deserialize(@NotNull Decoder decoder) {
        WSSendMessageDetailData wSSendMessageDetailData;
        int i;
        long jDecodeLongElement;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            wSSendMessageDetailData = (WSSendMessageDetailData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, WSSendMessageDetailData$$serializer.INSTANCE, null);
            i = 3;
        } else {
            long jDecodeLongElement2 = 0;
            boolean z = true;
            WSSendMessageDetailData wSSendMessageDetailData2 = null;
            int i2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    wSSendMessageDetailData2 = (WSSendMessageDetailData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, WSSendMessageDetailData$$serializer.INSTANCE, wSSendMessageDetailData2);
                    i2 |= 2;
                }
            }
            wSSendMessageDetailData = wSSendMessageDetailData2;
            i = i2;
            jDecodeLongElement = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BroadcastMessageRequest(i, jDecodeLongElement, wSSendMessageDetailData, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BroadcastMessageRequest broadcastMessageRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(broadcastMessageRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BroadcastMessageRequest.write$Self$OKIMCore_okimcore(broadcastMessageRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

package com.okinc.okimcore.model.im.inhouseim.ws;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class InHouseMessageHandling$$serializer implements GeneratedSerializer<InHouseMessageHandling> {
    public static final int $stable;
    public static final InHouseMessageHandling$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InHouseMessageHandling$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InHouseMessageHandling$$serializer inHouseMessageHandling$$serializer = new InHouseMessageHandling$$serializer();
        INSTANCE = inHouseMessageHandling$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.im.inhouseim.ws.InHouseMessageHandling", inHouseMessageHandling$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("referenceSeq", false);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.PRIORITY, false);
        pluginGeneratedSerialDescriptor.addElement("replaceMessage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{InHouseMessageHandling.$childSerializers[0], LongSerializer.INSTANCE, IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(WSSendMessageDetailData$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InHouseMessageHandling deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        int i;
        WSSendMessageDetailData wSSendMessageDetailData;
        MessageHandlingType messageHandlingType;
        long j;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = InHouseMessageHandling.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            MessageHandlingType messageHandlingType2 = (MessageHandlingType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            messageHandlingType = messageHandlingType2;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            wSSendMessageDetailData = (WSSendMessageDetailData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, WSSendMessageDetailData$$serializer.INSTANCE, null);
            i = 15;
            j = jDecodeLongElement;
        } else {
            boolean z = true;
            int iDecodeIntElement2 = 0;
            long jDecodeLongElement2 = 0;
            WSSendMessageDetailData wSSendMessageDetailData2 = null;
            MessageHandlingType messageHandlingType3 = null;
            int i2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    messageHandlingType3 = (MessageHandlingType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], messageHandlingType3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    wSSendMessageDetailData2 = (WSSendMessageDetailData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, WSSendMessageDetailData$$serializer.INSTANCE, wSSendMessageDetailData2);
                    i2 |= 8;
                }
            }
            iDecodeIntElement = iDecodeIntElement2;
            i = i2;
            wSSendMessageDetailData = wSSendMessageDetailData2;
            messageHandlingType = messageHandlingType3;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InHouseMessageHandling(i, messageHandlingType, j, iDecodeIntElement, wSSendMessageDetailData, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InHouseMessageHandling inHouseMessageHandling) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(inHouseMessageHandling, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InHouseMessageHandling.write$Self$OKIMCore_okimcore(inHouseMessageHandling, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

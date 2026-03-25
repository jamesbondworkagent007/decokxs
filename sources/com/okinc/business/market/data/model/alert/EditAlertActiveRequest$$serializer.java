package com.okinc.business.market.data.model.alert;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class EditAlertActiveRequest$$serializer implements GeneratedSerializer<EditAlertActiveRequest> {
    public static final int $stable;
    public static final EditAlertActiveRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EditAlertActiveRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EditAlertActiveRequest$$serializer editAlertActiveRequest$$serializer = new EditAlertActiveRequest$$serializer();
        INSTANCE = editAlertActiveRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.alert.EditAlertActiveRequest", editAlertActiveRequest$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("alertType", false);
        pluginGeneratedSerialDescriptor.addElement("deviceId", false);
        pluginGeneratedSerialDescriptor.addElement("ruleId", false);
        pluginGeneratedSerialDescriptor.addElement("active", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{EditAlertActiveRequest.$childSerializers[0], StringSerializer.INSTANCE, intSerializer, intSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EditAlertActiveRequest deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int iDecodeIntElement;
        AlertType alertType;
        int iDecodeIntElement2;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = EditAlertActiveRequest.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            AlertType alertType2 = (AlertType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            alertType = alertType2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            i = 15;
        } else {
            String strDecodeStringElement2 = null;
            AlertType alertType3 = null;
            boolean z = true;
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            int i2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    alertType3 = (AlertType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], alertType3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                    i2 |= 8;
                }
            }
            strDecodeStringElement = strDecodeStringElement2;
            iDecodeIntElement = iDecodeIntElement3;
            alertType = alertType3;
            iDecodeIntElement2 = iDecodeIntElement4;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EditAlertActiveRequest(i, alertType, strDecodeStringElement, iDecodeIntElement, iDecodeIntElement2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EditAlertActiveRequest editAlertActiveRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(editAlertActiveRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EditAlertActiveRequest.EZpvd(editAlertActiveRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

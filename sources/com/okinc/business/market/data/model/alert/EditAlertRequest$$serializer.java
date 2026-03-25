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
public final /* synthetic */ class EditAlertRequest$$serializer implements GeneratedSerializer<EditAlertRequest> {
    public static final int $stable;
    public static final EditAlertRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EditAlertRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EditAlertRequest$$serializer editAlertRequest$$serializer = new EditAlertRequest$$serializer();
        INSTANCE = editAlertRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.alert.EditAlertRequest", editAlertRequest$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("alertType", false);
        pluginGeneratedSerialDescriptor.addElement("ruleId", false);
        pluginGeneratedSerialDescriptor.addElement("promptType", false);
        pluginGeneratedSerialDescriptor.addElement("threshold", false);
        pluginGeneratedSerialDescriptor.addElement("repeatType", false);
        pluginGeneratedSerialDescriptor.addElement("deviceId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = EditAlertRequest.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{kSerializerArr[0], IntSerializer.INSTANCE, kSerializerArr[2], stringSerializer, kSerializerArr[4], stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EditAlertRequest deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        AlertRepeatType alertRepeatType;
        int i;
        String str;
        AlertPromptType alertPromptType;
        AlertType alertType;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = EditAlertRequest.$childSerializers;
        int i4 = 5;
        AlertRepeatType alertRepeatType2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            alertType = (AlertType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            AlertPromptType alertPromptType2 = (AlertPromptType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            AlertRepeatType alertRepeatType3 = (AlertRepeatType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            i2 = iDecodeIntElement;
            alertRepeatType = alertRepeatType3;
            i = 63;
            str = strDecodeStringElement2;
            alertPromptType = alertPromptType2;
        } else {
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            AlertPromptType alertPromptType3 = null;
            AlertType alertType2 = null;
            boolean z = true;
            int i5 = 0;
            int iDecodeIntElement2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        alertType2 = (AlertType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], alertType2);
                        i5 |= 1;
                        i4 = 5;
                        break;
                    case 1:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i3 = i5 | 2;
                        i5 = i3;
                        break;
                    case 2:
                        i5 |= 4;
                        alertPromptType3 = (AlertPromptType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], alertPromptType3);
                        break;
                    case 3:
                        i5 |= 8;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        alertRepeatType2 = (AlertRepeatType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], alertRepeatType2);
                        i3 = i5 | 16;
                        i5 = i3;
                        break;
                    case 5:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i3 = i5 | 32;
                        i5 = i3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            strDecodeStringElement = strDecodeStringElement3;
            alertRepeatType = alertRepeatType2;
            i = i5;
            str = strDecodeStringElement4;
            alertPromptType = alertPromptType3;
            alertType = alertType2;
            i2 = iDecodeIntElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EditAlertRequest(i, alertType, i2, alertPromptType, str, alertRepeatType, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EditAlertRequest editAlertRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(editAlertRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EditAlertRequest.KWHzl(editAlertRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

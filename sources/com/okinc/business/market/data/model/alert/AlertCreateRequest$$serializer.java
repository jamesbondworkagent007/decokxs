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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class AlertCreateRequest$$serializer implements GeneratedSerializer<AlertCreateRequest> {
    public static final int $stable;
    public static final AlertCreateRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AlertCreateRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AlertCreateRequest$$serializer alertCreateRequest$$serializer = new AlertCreateRequest$$serializer();
        INSTANCE = alertCreateRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.alert.AlertCreateRequest", alertCreateRequest$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement("deviceId", false);
        pluginGeneratedSerialDescriptor.addElement("alertType", false);
        pluginGeneratedSerialDescriptor.addElement("promptType", false);
        pluginGeneratedSerialDescriptor.addElement("threshold", false);
        pluginGeneratedSerialDescriptor.addElement("repeatType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = AlertCreateRequest.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, kSerializerArr[3], kSerializerArr[4], stringSerializer, kSerializerArr[6]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AlertCreateRequest deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        AlertRepeatType alertRepeatType;
        String str;
        String str2;
        AlertType alertType;
        int i;
        AlertPromptType alertPromptType;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = AlertCreateRequest.$childSerializers;
        int i2 = 5;
        AlertType alertType2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            AlertType alertType3 = (AlertType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            AlertPromptType alertPromptType2 = (AlertPromptType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            alertRepeatType = (AlertRepeatType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            str3 = strDecodeStringElement2;
            str = strDecodeStringElement5;
            strDecodeStringElement = strDecodeStringElement4;
            i = 127;
            alertType = alertType3;
            str2 = strDecodeStringElement3;
            alertPromptType = alertPromptType2;
        } else {
            int i3 = 0;
            boolean z = true;
            AlertRepeatType alertRepeatType2 = null;
            AlertPromptType alertPromptType3 = null;
            String strDecodeStringElement6 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                        break;
                    case 0:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 5;
                        break;
                    case 1:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        i3 |= 4;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 = 5;
                        break;
                    case 3:
                        i3 |= 8;
                        alertType2 = (AlertType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], alertType2);
                        i2 = 5;
                        break;
                    case 4:
                        i3 |= 16;
                        alertPromptType3 = (AlertPromptType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], alertPromptType3);
                        i2 = 5;
                        break;
                    case 5:
                        i3 |= 32;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i2 = 5;
                        break;
                    case 6:
                        alertRepeatType2 = (AlertRepeatType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], alertRepeatType2);
                        i3 |= 64;
                        i2 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            alertRepeatType = alertRepeatType2;
            str = strDecodeStringElement6;
            str2 = strDecodeStringElement7;
            alertType = alertType2;
            i = i3;
            String str4 = strDecodeStringElement8;
            alertPromptType = alertPromptType3;
            str3 = str4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AlertCreateRequest(i, str3, str2, strDecodeStringElement, alertType, alertPromptType, str, alertRepeatType, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AlertCreateRequest alertCreateRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(alertCreateRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AlertCreateRequest.EZpvd(alertCreateRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

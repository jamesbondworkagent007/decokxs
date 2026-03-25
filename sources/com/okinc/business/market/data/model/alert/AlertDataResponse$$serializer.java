package com.okinc.business.market.data.model.alert;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class AlertDataResponse$$serializer implements GeneratedSerializer<AlertDataResponse> {
    public static final int $stable;
    public static final AlertDataResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AlertDataResponse$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AlertDataResponse$$serializer alertDataResponse$$serializer = new AlertDataResponse$$serializer();
        INSTANCE = alertDataResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.alert.AlertDataResponse", alertDataResponse$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("ruleId", false);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("promptType", true);
        pluginGeneratedSerialDescriptor.addElement("repeatType", true);
        pluginGeneratedSerialDescriptor.addElement("threshold", false);
        pluginGeneratedSerialDescriptor.addElement("active", false);
        pluginGeneratedSerialDescriptor.addElement("createTime", true);
        pluginGeneratedSerialDescriptor.addElement("modifyTime", true);
        pluginGeneratedSerialDescriptor.addElement("alertType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = AlertDataResponse.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[4], kSerializerArr[5], stringSerializer, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), kSerializerArr[10]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AlertDataResponse deserialize(@NotNull Decoder decoder) {
        AlertPromptType alertPromptType;
        AlertRepeatType alertRepeatType;
        String str;
        AlertType alertType;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        int i;
        String str6;
        String str7;
        int i2;
        AlertPromptType alertPromptType2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = AlertDataResponse.$childSerializers;
        int i3 = 9;
        int i4 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            AlertPromptType alertPromptType3 = (AlertPromptType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            AlertRepeatType alertRepeatType2 = (AlertRepeatType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            alertType = (AlertType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], null);
            str5 = strDecodeStringElement;
            str2 = str9;
            z = zDecodeBooleanElement;
            str6 = strDecodeStringElement5;
            str4 = strDecodeStringElement4;
            str = str8;
            str3 = strDecodeStringElement3;
            i = 2047;
            alertRepeatType = alertRepeatType2;
            str7 = strDecodeStringElement2;
            alertPromptType = alertPromptType3;
        } else {
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            AlertRepeatType alertRepeatType3 = null;
            String str10 = null;
            String str11 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            AlertPromptType alertPromptType4 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            AlertType alertType2 = null;
            int i5 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        alertPromptType2 = alertPromptType4;
                        z2 = false;
                        alertPromptType4 = alertPromptType2;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 0:
                        alertPromptType2 = alertPromptType4;
                        i5 |= 1;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        alertPromptType4 = alertPromptType2;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 1:
                        alertPromptType2 = alertPromptType4;
                        i5 |= 2;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        alertPromptType4 = alertPromptType2;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 2:
                        alertPromptType2 = alertPromptType4;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        alertPromptType4 = alertPromptType2;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 3:
                        alertPromptType2 = alertPromptType4;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i5 |= 8;
                        alertPromptType4 = alertPromptType2;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 4:
                        i5 |= 16;
                        alertPromptType2 = (AlertPromptType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], alertPromptType4);
                        alertPromptType4 = alertPromptType2;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 5:
                        alertRepeatType3 = (AlertRepeatType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], alertRepeatType3);
                        i5 |= 32;
                        break;
                    case 6:
                        i5 |= 64;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        break;
                    case 7:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i2 = i5 | 128;
                        i5 = i2;
                        break;
                    case 8:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str10);
                        i2 = i5 | 256;
                        i5 = i2;
                        break;
                    case 9:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str11);
                        i2 = i5 | 512;
                        i5 = i2;
                        break;
                    case 10:
                        alertType2 = (AlertType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], alertType2);
                        i2 = i5 | 1024;
                        i5 = i2;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            alertPromptType = alertPromptType4;
            alertRepeatType = alertRepeatType3;
            str = str10;
            alertType = alertType2;
            str2 = str11;
            str3 = strDecodeStringElement6;
            str4 = strDecodeStringElement7;
            str5 = strDecodeStringElement10;
            z = zDecodeBooleanElement2;
            i = i5;
            String str12 = strDecodeStringElement9;
            str6 = strDecodeStringElement8;
            str7 = str12;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AlertDataResponse(i, str5, str7, str3, str4, alertPromptType, alertRepeatType, str6, z, str, str2, alertType, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AlertDataResponse alertDataResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(alertDataResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AlertDataResponse.copydefault(alertDataResponse, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

package com.okinc.tradingbot.impl.aiBot.dto;

import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.List;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class ParamSpecDto$$serializer implements GeneratedSerializer<ParamSpecDto> {
    public static final int $stable;
    public static final ParamSpecDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ParamSpecDto$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ParamSpecDto$$serializer paramSpecDto$$serializer = new ParamSpecDto$$serializer();
        INSTANCE = paramSpecDto$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.tradingbot.impl.aiBot.dto.ParamSpecDto", paramSpecDto$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement(JwtUtilsKt.DID_METHOD_KEY, true);
        pluginGeneratedSerialDescriptor.addElement("label", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("multiValue", true);
        pluginGeneratedSerialDescriptor.addElement("min", true);
        pluginGeneratedSerialDescriptor.addElement("max", true);
        pluginGeneratedSerialDescriptor.addElement("exclusiveMin", true);
        pluginGeneratedSerialDescriptor.addElement("exclusiveMax", true);
        pluginGeneratedSerialDescriptor.addElement("showParamList", true);
        pluginGeneratedSerialDescriptor.addElement("defaultValue", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = ParamSpecDto.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(doubleSerializer), BuiltinSerializersKt.getNullable(doubleSerializer), booleanSerializer, booleanSerializer, kSerializerArr[8], BuiltinSerializersKt.getNullable(doubleSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ParamSpecDto deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        boolean z;
        List list;
        Double d;
        boolean z2;
        int i;
        String str;
        String str2;
        String str3;
        Double d2;
        Double d3;
        Double d4;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = ParamSpecDto.$childSerializers;
        int i3 = 9;
        int i4 = 7;
        int i5 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
            Double d5 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, doubleSerializer, null);
            Double d6 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, doubleSerializer, null);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], null);
            d = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, doubleSerializer, null);
            z = zDecodeBooleanElement4;
            z2 = zDecodeBooleanElement3;
            d3 = d6;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            d2 = d5;
            str2 = strDecodeStringElement3;
            str = strDecodeStringElement2;
            i = 1023;
            str3 = strDecodeStringElement;
        } else {
            boolean z3 = true;
            Double d7 = null;
            List list2 = null;
            Double d8 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            Double d9 = null;
            String strDecodeStringElement6 = null;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            zDecodeBooleanElement = false;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        d4 = d9;
                        z3 = false;
                        d9 = d4;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 0:
                        d4 = d9;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        d9 = d4;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 1:
                        d4 = d9;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        d9 = d4;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 2:
                        d4 = d9;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        d9 = d4;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 3:
                        d4 = d9;
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i5 |= 8;
                        d9 = d4;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 4:
                        d4 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, DoubleSerializer.INSTANCE, d9);
                        i5 |= 16;
                        d9 = d4;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 5:
                        d7 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, DoubleSerializer.INSTANCE, d7);
                        i5 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i2 = i5 | 64;
                        i5 = i2;
                        d4 = d9;
                        d9 = d4;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 7:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i2 = i5 | 128;
                        i5 = i2;
                        d4 = d9;
                        d9 = d4;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 8:
                        i5 |= 256;
                        d4 = d9;
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], list2);
                        d9 = d4;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 9:
                        Double d10 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, DoubleSerializer.INSTANCE, d8);
                        i5 |= 512;
                        d4 = d9;
                        d8 = d10;
                        d9 = d4;
                        i3 = 9;
                        i4 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Double d11 = d9;
            z = zDecodeBooleanElement5;
            list = list2;
            d = d8;
            z2 = zDecodeBooleanElement6;
            i = i5;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
            d2 = d11;
            d3 = d7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ParamSpecDto(i, str3, str, str2, zDecodeBooleanElement, d2, d3, z2, z, list, d, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ParamSpecDto paramSpecDto) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(paramSpecDto, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ParamSpecDto.OLrzqt(paramSpecDto, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

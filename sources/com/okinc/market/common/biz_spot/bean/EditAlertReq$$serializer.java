package com.okinc.market.common.biz_spot.bean;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class EditAlertReq$$serializer implements GeneratedSerializer<EditAlertReq> {
    public static final int $stable;
    public static final EditAlertReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EditAlertReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EditAlertReq$$serializer editAlertReq$$serializer = new EditAlertReq$$serializer();
        INSTANCE = editAlertReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.market.common.biz_spot.bean.EditAlertReq", editAlertReq$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("sourceType", false);
        pluginGeneratedSerialDescriptor.addElement("ruleId", false);
        pluginGeneratedSerialDescriptor.addElement("promptType", true);
        pluginGeneratedSerialDescriptor.addElement("repeatType", false);
        pluginGeneratedSerialDescriptor.addElement("promptThreshold", true);
        pluginGeneratedSerialDescriptor.addElement("customMsg", true);
        pluginGeneratedSerialDescriptor.addElement("timePeriod", true);
        pluginGeneratedSerialDescriptor.addElement("indicatorType", true);
        pluginGeneratedSerialDescriptor.addElement("signalType", true);
        pluginGeneratedSerialDescriptor.addElement("condition1", true);
        pluginGeneratedSerialDescriptor.addElement("condition2", true);
        pluginGeneratedSerialDescriptor.addElement("presetCondition", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, LongSerializer.INSTANCE, intSerializer, intSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EditAlertReq deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        Integer num;
        long j;
        String str3;
        int i2;
        String str4;
        String str5;
        int i3;
        int i4;
        String str6;
        Integer num2;
        char c;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, intSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, intSerializer, null);
            str2 = str9;
            str5 = str7;
            str3 = strDecodeStringElement2;
            str4 = str8;
            str6 = strDecodeStringElement;
            i = iDecodeIntElement;
            num2 = num3;
            i2 = 4095;
            i3 = iDecodeIntElement3;
            i4 = iDecodeIntElement2;
            j = jDecodeLongElement;
        } else {
            int i5 = 11;
            long jDecodeLongElement2 = 0;
            int iDecodeIntElement4 = 0;
            int i6 = 0;
            int iDecodeIntElement5 = 0;
            boolean z = true;
            Integer num4 = null;
            String str10 = null;
            String str11 = null;
            Integer num5 = null;
            String str12 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String str13 = null;
            int iDecodeIntElement6 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i5 = 11;
                        break;
                    case 0:
                        i6 |= 1;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i5 = 11;
                        break;
                    case 1:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i6 |= 2;
                        i5 = 11;
                        break;
                    case 2:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i6 |= 4;
                        i5 = 11;
                        break;
                    case 3:
                        i6 |= 8;
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i5 = 11;
                        break;
                    case 4:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i6 |= 16;
                        i5 = 11;
                        break;
                    case 5:
                        c = 6;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i6 |= 32;
                        i5 = 11;
                        break;
                    case 6:
                        c = 6;
                        i6 |= 64;
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, num4);
                        i5 = 11;
                        break;
                    case 7:
                        i6 |= 128;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str12);
                        i5 = 11;
                        break;
                    case 8:
                        i6 |= 256;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str13);
                        i5 = 11;
                        break;
                    case 9:
                        i6 |= 512;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str11);
                        i5 = 11;
                        break;
                    case 10:
                        i6 |= 1024;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str10);
                        i5 = 11;
                        break;
                    case 11:
                        i6 |= 2048;
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, IntSerializer.INSTANCE, num5);
                        i5 = 11;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement4;
            str = str10;
            str2 = str11;
            num = num5;
            j = jDecodeLongElement2;
            str3 = strDecodeStringElement4;
            i2 = i6;
            str4 = str13;
            str5 = str12;
            i3 = iDecodeIntElement6;
            i4 = iDecodeIntElement5;
            str6 = strDecodeStringElement3;
            num2 = num4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EditAlertReq(i2, i, j, i4, i3, str6, str3, num2, str5, str4, str2, str, num, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EditAlertReq editAlertReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(editAlertReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EditAlertReq.write$Self$OKMarket_market_api(editAlertReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

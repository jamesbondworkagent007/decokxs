package com.okinc.business.dex.trade.core.domain.model.common;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class V6CallData$$serializer implements GeneratedSerializer<V6CallData> {
    public static final int $stable;
    public static final V6CallData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private V6CallData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        V6CallData$$serializer v6CallData$$serializer = new V6CallData$$serializer();
        INSTANCE = v6CallData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.core.domain.model.common.V6CallData", v6CallData$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("from", true);
        pluginGeneratedSerialDescriptor.addElement("to", true);
        pluginGeneratedSerialDescriptor.addElement("data", true);
        pluginGeneratedSerialDescriptor.addElement("value", true);
        pluginGeneratedSerialDescriptor.addElement("gasPrice", true);
        pluginGeneratedSerialDescriptor.addElement("gas", true);
        pluginGeneratedSerialDescriptor.addElement("priorityFee", true);
        pluginGeneratedSerialDescriptor.addElement("sender", true);
        pluginGeneratedSerialDescriptor.addElement("memo", true);
        pluginGeneratedSerialDescriptor.addElement("memoPos", true);
        pluginGeneratedSerialDescriptor.addElement("bridgeId", true);
        pluginGeneratedSerialDescriptor.addElement("maxFeePerGas", true);
        pluginGeneratedSerialDescriptor.addElement("maxPriorityFeePerGas", true);
        pluginGeneratedSerialDescriptor.addElement("nonce", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final V6CallData deserialize(@NotNull Decoder decoder) {
        Long l;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        int i;
        String str15;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 11;
        int i4 = 10;
        int i5 = 9;
        String str16 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, LongSerializer.INSTANCE, null);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            str6 = str22;
            str4 = str21;
            str5 = str20;
            str7 = strDecodeStringElement4;
            str14 = str19;
            str3 = str17;
            str = str23;
            str12 = strDecodeStringElement;
            str11 = strDecodeStringElement2;
            str10 = strDecodeStringElement3;
            str9 = strDecodeStringElement6;
            str13 = str18;
            str8 = strDecodeStringElement5;
            i = 32767;
        } else {
            int i6 = 14;
            int i7 = 0;
            boolean z = true;
            Long l2 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String str29 = null;
            String str30 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str15 = str29;
                        z = false;
                        str29 = str15;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 0:
                        str15 = str29;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        str29 = str15;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 1:
                        str15 = str29;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i7 |= 2;
                        str29 = str15;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 2:
                        str15 = str29;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i7 |= 4;
                        str29 = str15;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 3:
                        str15 = str29;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i7 |= 8;
                        str29 = str15;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 4:
                        str15 = str29;
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str30);
                        i7 |= 16;
                        str29 = str15;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 5:
                        str15 = str29;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i7 |= 32;
                        str29 = str15;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 6:
                        i7 |= 64;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str29);
                        str29 = str15;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 7:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i7 |= 128;
                        str15 = str29;
                        str29 = str15;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 8:
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str25);
                        i2 = i7 | 256;
                        i7 = i2;
                        str15 = str29;
                        str29 = str15;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 9:
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str27);
                        i7 |= 512;
                        i6 = 14;
                        break;
                    case 10:
                        i7 |= 1024;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str26);
                        str15 = str29;
                        str29 = str15;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 11:
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str28);
                        i2 = i7 | 2048;
                        i7 = i2;
                        str15 = str29;
                        str29 = str15;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 12:
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str24);
                        i2 = i7 | 4096;
                        i7 = i2;
                        str15 = str29;
                        str29 = str15;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 13:
                        l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, LongSerializer.INSTANCE, l2);
                        i2 = i7 | 8192;
                        i7 = i2;
                        str15 = str29;
                        str29 = str15;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 14:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, StringSerializer.INSTANCE, str16);
                        i2 = i7 | 16384;
                        i7 = i2;
                        str15 = str29;
                        str29 = str15;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str31 = str29;
            l = l2;
            str = str24;
            str2 = str16;
            str3 = str30;
            str4 = str26;
            str5 = str27;
            str6 = str28;
            str7 = strDecodeStringElement7;
            str8 = strDecodeStringElement8;
            str9 = strDecodeStringElement9;
            str10 = strDecodeStringElement10;
            str11 = strDecodeStringElement11;
            str12 = strDecodeStringElement12;
            str13 = str31;
            str14 = str25;
            i = i7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new V6CallData(i, str12, str11, str10, str7, str3, str8, str13, str9, str14, str5, str4, str6, str, l, str2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull V6CallData v6CallData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(v6CallData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        V6CallData.write$Self$OKDex_dex_impl(v6CallData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

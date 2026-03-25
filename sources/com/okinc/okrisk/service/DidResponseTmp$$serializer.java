package com.okinc.okrisk.service;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class DidResponseTmp$$serializer implements GeneratedSerializer<DidResponseTmp> {
    public static final int $stable;
    public static final DidResponseTmp$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DidResponseTmp$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DidResponseTmp$$serializer didResponseTmp$$serializer = new DidResponseTmp$$serializer();
        INSTANCE = didResponseTmp$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okrisk.service.DidResponseTmp", didResponseTmp$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("fingerprintId", false);
        pluginGeneratedSerialDescriptor.addElement("efp", true);
        pluginGeneratedSerialDescriptor.addElement("e_deviceToken", true);
        pluginGeneratedSerialDescriptor.addElement("ts", true);
        pluginGeneratedSerialDescriptor.addElement("pv", true);
        pluginGeneratedSerialDescriptor.addElement("cg", true);
        pluginGeneratedSerialDescriptor.addElement("cv", true);
        pluginGeneratedSerialDescriptor.addElement("rid", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), intSerializer, BuiltinSerializersKt.getNullable(stringSerializer), intSerializer, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DidResponseTmp deserialize(@NotNull Decoder decoder) {
        String str;
        int iDecodeIntElement;
        String str2;
        String str3;
        int i;
        String str4;
        int i2;
        String str5;
        int i3;
        String str6;
        int iDecodeIntElement2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            str = str10;
            i2 = iDecodeIntElement4;
            str6 = str8;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            str4 = str9;
            str5 = str7;
            str3 = strDecodeStringElement;
            i3 = 511;
            i = iDecodeIntElement3;
        } else {
            int i5 = 0;
            int iDecodeIntElement5 = 0;
            int i6 = 0;
            boolean z = true;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String strDecodeStringElement2 = null;
            String str15 = null;
            int iDecodeIntElement6 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i6 |= 1;
                        i5 = iDecodeIntElement2;
                        i4 = 7;
                        break;
                    case 1:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i6 |= 2;
                        iDecodeIntElement2 = i5;
                        i5 = iDecodeIntElement2;
                        i4 = 7;
                        break;
                    case 2:
                        iDecodeIntElement2 = i5;
                        i6 |= 4;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str15);
                        i5 = iDecodeIntElement2;
                        i4 = 7;
                        break;
                    case 3:
                        iDecodeIntElement2 = i5;
                        i6 |= 8;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str12);
                        i5 = iDecodeIntElement2;
                        i4 = 7;
                        break;
                    case 4:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str11);
                        iDecodeIntElement2 = i5;
                        i6 |= 16;
                        i5 = iDecodeIntElement2;
                        i4 = 7;
                        break;
                    case 5:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i6 |= 32;
                        break;
                    case 6:
                        i6 |= 64;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str13);
                        break;
                    case 7:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i4);
                        i6 |= 128;
                        break;
                    case 8:
                        i6 |= 256;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str14);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str13;
            iDecodeIntElement = iDecodeIntElement6;
            str2 = str14;
            str3 = strDecodeStringElement2;
            i = i5;
            str4 = str11;
            i2 = iDecodeIntElement5;
            str5 = str15;
            i3 = i6;
            str6 = str12;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DidResponseTmp(i3, i, str3, str5, str6, str4, i2, str, iDecodeIntElement, str2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DidResponseTmp didResponseTmp) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(didResponseTmp, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DidResponseTmp.write$Self$OKRiskLibrary_okrisk_impl(didResponseTmp, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

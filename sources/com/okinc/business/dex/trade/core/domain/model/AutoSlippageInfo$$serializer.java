package com.okinc.business.dex.trade.core.domain.model;

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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class AutoSlippageInfo$$serializer implements GeneratedSerializer<AutoSlippageInfo> {
    public static final int $stable;
    public static final AutoSlippageInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AutoSlippageInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AutoSlippageInfo$$serializer autoSlippageInfo$$serializer = new AutoSlippageInfo$$serializer();
        INSTANCE = autoSlippageInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo", autoSlippageInfo$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("autoSlippage", true);
        pluginGeneratedSerialDescriptor.addElement("autoFromSlippage", true);
        pluginGeneratedSerialDescriptor.addElement("referenceSlippage", true);
        pluginGeneratedSerialDescriptor.addElement("shortcutFixSlippage", true);
        pluginGeneratedSerialDescriptor.addElement("supportMaxSlippage", true);
        pluginGeneratedSerialDescriptor.addElement("dynamicSlippageRangeMin", true);
        pluginGeneratedSerialDescriptor.addElement("dynamicSlippageRangeMax", true);
        pluginGeneratedSerialDescriptor.addElement("recommendSlippageRangeMin", true);
        pluginGeneratedSerialDescriptor.addElement("recommendSlippageRangeMax", true);
        pluginGeneratedSerialDescriptor.addElement("limitOrderDynamicSpecialSlippage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = AutoSlippageInfo.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[3]), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AutoSlippageInfo deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        List list;
        int i;
        String str6;
        String str7;
        String str8;
        Boolean bool;
        Boolean bool2;
        String str9;
        String str10;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = AutoSlippageInfo.$childSerializers;
        int i2 = 9;
        int i3 = 7;
        int i4 = 6;
        int i5 = 8;
        String str11 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            str4 = str17;
            str2 = str16;
            str8 = str15;
            str3 = str18;
            bool = bool3;
            str6 = str13;
            list = list2;
            i = 1023;
            str = str14;
            str7 = str12;
        } else {
            int i6 = 0;
            boolean z = true;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            str = null;
            String str22 = null;
            List list3 = null;
            String str23 = null;
            Boolean bool4 = null;
            String str24 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool2 = bool4;
                        str9 = str23;
                        str10 = str24;
                        z = false;
                        bool4 = bool2;
                        str23 = str9;
                        str24 = str10;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 0:
                        bool2 = bool4;
                        i6 |= 1;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str24);
                        str9 = str23;
                        bool4 = bool2;
                        str23 = str9;
                        str24 = str10;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 1:
                        bool2 = bool4;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str23);
                        i6 |= 2;
                        str10 = str24;
                        bool4 = bool2;
                        str23 = str9;
                        str24 = str10;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 2:
                        bool2 = bool4;
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str);
                        i6 |= 4;
                        str9 = str23;
                        str10 = str24;
                        bool4 = bool2;
                        str23 = str9;
                        str24 = str10;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 3:
                        bool2 = bool4;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], list3);
                        i6 |= 8;
                        str9 = str23;
                        str10 = str24;
                        bool4 = bool2;
                        str23 = str9;
                        str24 = str10;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 4:
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool4);
                        i6 |= 16;
                        str9 = str23;
                        bool2 = bool4;
                        str10 = str24;
                        bool4 = bool2;
                        str23 = str9;
                        str24 = str10;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 5:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str11);
                        i6 |= 32;
                        str9 = str23;
                        bool2 = bool4;
                        str10 = str24;
                        bool4 = bool2;
                        str23 = str9;
                        str24 = str10;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 6:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str19);
                        i6 |= 64;
                        str9 = str23;
                        bool2 = bool4;
                        str10 = str24;
                        bool4 = bool2;
                        str23 = str9;
                        str24 = str10;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 7:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str21);
                        i6 |= 128;
                        str9 = str23;
                        bool2 = bool4;
                        str10 = str24;
                        bool4 = bool2;
                        str23 = str9;
                        str24 = str10;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 8:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str20);
                        i6 |= 256;
                        break;
                    case 9:
                        i6 |= 512;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str22);
                        str9 = str23;
                        bool2 = bool4;
                        str10 = str24;
                        bool4 = bool2;
                        str23 = str9;
                        str24 = str10;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str25 = str23;
            str2 = str19;
            str3 = str20;
            str4 = str21;
            str5 = str22;
            list = list3;
            i = i6;
            str6 = str25;
            str7 = str24;
            str8 = str11;
            bool = bool4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AutoSlippageInfo(i, str7, str6, str, list, bool, str8, str2, str4, str3, str5, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AutoSlippageInfo autoSlippageInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(autoSlippageInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AutoSlippageInfo.write$Self$OKDex_dex_impl(autoSlippageInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

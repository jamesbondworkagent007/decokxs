package com.okinc.unify_trade.biz;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class ReversePreCheckResponse$$serializer implements GeneratedSerializer<ReversePreCheckResponse> {
    public static final int $stable;
    public static final ReversePreCheckResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ReversePreCheckResponse$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ReversePreCheckResponse$$serializer reversePreCheckResponse$$serializer = new ReversePreCheckResponse$$serializer();
        INSTANCE = reversePreCheckResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.ReversePreCheckResponse", reversePreCheckResponse$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("sCode", false);
        pluginGeneratedSerialDescriptor.addElement("sMsg", false);
        pluginGeneratedSerialDescriptor.addElement("instId", false);
        pluginGeneratedSerialDescriptor.addElement("clSz", false);
        pluginGeneratedSerialDescriptor.addElement("opSz", false);
        pluginGeneratedSerialDescriptor.addElement("liqPx", false);
        pluginGeneratedSerialDescriptor.addElement("liqPxPriceDiff", false);
        pluginGeneratedSerialDescriptor.addElement("liqPxPriceDiffRatio", false);
        pluginGeneratedSerialDescriptor.addElement("isFullOp", false);
        pluginGeneratedSerialDescriptor.addElement("opPercent", false);
        pluginGeneratedSerialDescriptor.addElement("maxOpLimit", false);
        pluginGeneratedSerialDescriptor.addElement("leverage", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ReversePreCheckResponse deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 8;
        String str16 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            bool = bool2;
            str3 = str26;
            str5 = str25;
            str2 = str24;
            str16 = str23;
            str8 = str22;
            i = 4095;
            str10 = str18;
            str7 = str20;
            str4 = str17;
            str = str21;
            str9 = str19;
        } else {
            int i5 = 11;
            int i6 = 0;
            boolean z = true;
            String str27 = null;
            Boolean bool3 = null;
            String str28 = null;
            String str29 = null;
            String str30 = null;
            str = null;
            String str31 = null;
            String str32 = null;
            String str33 = null;
            String str34 = null;
            String str35 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        str35 = str35;
                        i4 = 8;
                        break;
                    case 0:
                        str11 = str32;
                        str12 = str33;
                        String str36 = str35;
                        str13 = str34;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str36);
                        i6 |= 1;
                        str32 = str11;
                        str33 = str12;
                        str34 = str13;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str35 = str14;
                        break;
                    case 1:
                        str11 = str32;
                        str15 = str34;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str33);
                        i6 |= 2;
                        str14 = str35;
                        str13 = str15;
                        str32 = str11;
                        str33 = str12;
                        str34 = str13;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str35 = str14;
                        break;
                    case 2:
                        str15 = str34;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str32);
                        i6 |= 4;
                        str12 = str33;
                        str14 = str35;
                        str13 = str15;
                        str32 = str11;
                        str33 = str12;
                        str34 = str13;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str35 = str14;
                        break;
                    case 3:
                        str15 = str34;
                        i6 |= 8;
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str31);
                        str11 = str32;
                        str12 = str33;
                        str14 = str35;
                        str13 = str15;
                        str32 = str11;
                        str33 = str12;
                        str34 = str13;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str35 = str14;
                        break;
                    case 4:
                        str15 = str34;
                        i6 |= 16;
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str);
                        str11 = str32;
                        str12 = str33;
                        str14 = str35;
                        str13 = str15;
                        str32 = str11;
                        str33 = str12;
                        str34 = str13;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str35 = str14;
                        break;
                    case 5:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str34);
                        i6 |= 32;
                        str11 = str32;
                        str12 = str33;
                        str14 = str35;
                        str13 = str15;
                        str32 = str11;
                        str33 = str12;
                        str34 = str13;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str35 = str14;
                        break;
                    case 6:
                        i6 |= 64;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str16);
                        str11 = str32;
                        str12 = str33;
                        str14 = str35;
                        str13 = str34;
                        str32 = str11;
                        str33 = str12;
                        str34 = str13;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str35 = str14;
                        break;
                    case 7:
                        i6 |= 128;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str27);
                        str11 = str32;
                        str12 = str33;
                        str14 = str35;
                        str13 = str34;
                        str32 = str11;
                        str33 = str12;
                        str34 = str13;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str35 = str14;
                        break;
                    case 8:
                        i6 |= 256;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, BooleanSerializer.INSTANCE, bool3);
                        str11 = str32;
                        str12 = str33;
                        str14 = str35;
                        str13 = str34;
                        str32 = str11;
                        str33 = str12;
                        str34 = str13;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str35 = str14;
                        break;
                    case 9:
                        i6 |= 512;
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str29);
                        str11 = str32;
                        str12 = str33;
                        str14 = str35;
                        str13 = str34;
                        str32 = str11;
                        str33 = str12;
                        str34 = str13;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str35 = str14;
                        break;
                    case 10:
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str28);
                        i6 |= 1024;
                        break;
                    case 11:
                        i6 |= 2048;
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str30);
                        str11 = str32;
                        str12 = str33;
                        str14 = str35;
                        str13 = str34;
                        str32 = str11;
                        str33 = str12;
                        str34 = str13;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str35 = str14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str37 = str32;
            String str38 = str33;
            str2 = str27;
            bool = bool3;
            str3 = str28;
            str4 = str35;
            str5 = str29;
            str6 = str30;
            str7 = str31;
            str8 = str34;
            i = i6;
            str9 = str37;
            str10 = str38;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ReversePreCheckResponse(i, str4, str10, str9, str7, str, str8, str16, str2, bool, str5, str3, str6, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ReversePreCheckResponse reversePreCheckResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(reversePreCheckResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ReversePreCheckResponse.write$Self$OKTradeCore_trade_core(reversePreCheckResponse, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

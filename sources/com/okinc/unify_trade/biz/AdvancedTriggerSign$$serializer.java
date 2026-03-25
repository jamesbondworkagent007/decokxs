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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class AdvancedTriggerSign$$serializer implements GeneratedSerializer<AdvancedTriggerSign> {
    public static final int $stable;
    public static final AdvancedTriggerSign$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AdvancedTriggerSign$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AdvancedTriggerSign$$serializer advancedTriggerSign$$serializer = new AdvancedTriggerSign$$serializer();
        INSTANCE = advancedTriggerSign$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.AdvancedTriggerSign", advancedTriggerSign$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("triggerAction", true);
        pluginGeneratedSerialDescriptor.addElement("indicator", true);
        pluginGeneratedSerialDescriptor.addElement("triggerStrategy", true);
        pluginGeneratedSerialDescriptor.addElement("triggerPx", true);
        pluginGeneratedSerialDescriptor.addElement("delaySeconds", true);
        pluginGeneratedSerialDescriptor.addElement("timePeriod", true);
        pluginGeneratedSerialDescriptor.addElement("timeframe", true);
        pluginGeneratedSerialDescriptor.addElement("triggerCond", true);
        pluginGeneratedSerialDescriptor.addElement("oversoldThold", true);
        pluginGeneratedSerialDescriptor.addElement("thold", true);
        pluginGeneratedSerialDescriptor.addElement("stopType", true);
        pluginGeneratedSerialDescriptor.addElement("authToken", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AdvancedTriggerSign deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        String str7;
        String str8;
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
        int i2 = 11;
        int i3 = 10;
        int i4 = 9;
        int i5 = 7;
        int i6 = 8;
        String str16 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            str3 = str25;
            str9 = str24;
            str2 = str22;
            str = str21;
            str10 = str20;
            str4 = str23;
            str6 = strDecodeStringElement;
            str11 = str18;
            i = 4095;
            str12 = str19;
            str8 = str17;
        } else {
            int i7 = 0;
            boolean z = true;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            String str30 = null;
            String str31 = null;
            String str32 = null;
            String str33 = null;
            String strDecodeStringElement2 = null;
            String str34 = null;
            String str35 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str13 = str32;
                        str14 = str34;
                        str15 = str35;
                        z = false;
                        str34 = str14;
                        str35 = str15;
                        str32 = str13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    case 0:
                        str13 = str32;
                        str14 = str34;
                        str15 = str35;
                        i7 |= 1;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        str33 = str33;
                        str34 = str14;
                        str35 = str15;
                        str32 = str13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    case 1:
                        str13 = str32;
                        str14 = str34;
                        str15 = str35;
                        i7 |= 2;
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str33);
                        str34 = str14;
                        str35 = str15;
                        str32 = str13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    case 2:
                        str14 = str34;
                        str15 = str35;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str32);
                        i7 |= 4;
                        str34 = str14;
                        str35 = str15;
                        str32 = str13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    case 3:
                        str14 = str34;
                        str15 = str35;
                        i7 |= 8;
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str31);
                        str13 = str32;
                        str34 = str14;
                        str35 = str15;
                        str32 = str13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    case 4:
                        str14 = str34;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str35);
                        i7 |= 16;
                        str13 = str32;
                        str34 = str14;
                        str35 = str15;
                        str32 = str13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    case 5:
                        str14 = str34;
                        i7 |= 32;
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str30);
                        str13 = str32;
                        str15 = str35;
                        str34 = str14;
                        str35 = str15;
                        str32 = str13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    case 6:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str34);
                        i7 |= 64;
                        str13 = str32;
                        str15 = str35;
                        str34 = str14;
                        str35 = str15;
                        str32 = str13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    case 7:
                        i7 |= 128;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str26);
                        str13 = str32;
                        str14 = str34;
                        str15 = str35;
                        str34 = str14;
                        str35 = str15;
                        str32 = str13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    case 8:
                        i7 |= 256;
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, StringSerializer.INSTANCE, str28);
                        str13 = str32;
                        str14 = str34;
                        str15 = str35;
                        str34 = str14;
                        str35 = str15;
                        str32 = str13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    case 9:
                        i7 |= 512;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str16);
                        str13 = str32;
                        str14 = str34;
                        str15 = str35;
                        str34 = str14;
                        str35 = str15;
                        str32 = str13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    case 10:
                        i7 |= 1024;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str27);
                        str13 = str32;
                        str14 = str34;
                        str15 = str35;
                        str34 = str14;
                        str35 = str15;
                        str32 = str13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        break;
                    case 11:
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str29);
                        i7 |= 2048;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str36 = str32;
            String str37 = str33;
            str = str34;
            str2 = str26;
            str3 = str27;
            str4 = str28;
            str5 = str29;
            str6 = strDecodeStringElement2;
            i = i7;
            str7 = str36;
            str8 = str37;
            str9 = str16;
            str10 = str30;
            str11 = str31;
            str12 = str35;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AdvancedTriggerSign(i, str6, str8, str7, str11, str12, str10, str, str2, str4, str9, str3, str5, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AdvancedTriggerSign advancedTriggerSign) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(advancedTriggerSign, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AdvancedTriggerSign.write$Self$OKTradeCore_trade_core(advancedTriggerSign, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

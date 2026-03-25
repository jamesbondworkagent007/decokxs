package com.okinc.business.dex.trade.copytrading.edit.data.model;

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
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class CopyTradingPreset$$serializer implements GeneratedSerializer<CopyTradingPreset> {
    public static final int $stable;
    public static final CopyTradingPreset$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CopyTradingPreset$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CopyTradingPreset$$serializer copyTradingPreset$$serializer = new CopyTradingPreset$$serializer();
        INSTANCE = copyTradingPreset$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset", copyTradingPreset$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("slippageType", true);
        pluginGeneratedSerialDescriptor.addElement("slippageLevel", true);
        pluginGeneratedSerialDescriptor.addElement("slippageValue", true);
        pluginGeneratedSerialDescriptor.addElement("dynamicMaxSlippageValue", true);
        pluginGeneratedSerialDescriptor.addElement("routerModeType", true);
        pluginGeneratedSerialDescriptor.addElement("feeLevel", true);
        pluginGeneratedSerialDescriptor.addElement("feeValue", true);
        pluginGeneratedSerialDescriptor.addElement("limitOrderFeeLevel", true);
        pluginGeneratedSerialDescriptor.addElement("limitOrderFeeValue", true);
        pluginGeneratedSerialDescriptor.addElement("dexIds", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(JsonElementSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CopyTradingPreset deserialize(@NotNull Decoder decoder) {
        JsonElement jsonElement;
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 9;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, null);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            i = 1023;
            str2 = strDecodeStringElement2;
            jsonElement = (JsonElement) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, JsonElementSerializer.INSTANCE, null);
            str3 = str10;
            str8 = strDecodeStringElement8;
            str4 = strDecodeStringElement7;
            str7 = strDecodeStringElement5;
            str6 = strDecodeStringElement9;
            str = strDecodeStringElement6;
            str9 = strDecodeStringElement4;
            str5 = strDecodeStringElement3;
        } else {
            int i3 = 0;
            boolean z = true;
            JsonElement jsonElement2 = null;
            String str11 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 9;
                        break;
                    case 0:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 9;
                        break;
                    case 1:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 9;
                        break;
                    case 2:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        i3 |= 8;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 = 9;
                        break;
                    case 4:
                        i3 |= 16;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 = 9;
                        break;
                    case 5:
                        i3 |= 32;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 = 9;
                        break;
                    case 6:
                        i3 |= 64;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 = 9;
                        break;
                    case 7:
                        i3 |= 128;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str11);
                        i2 = 9;
                        break;
                    case 8:
                        i3 |= 256;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i2 = 9;
                        break;
                    case 9:
                        i3 |= 512;
                        jsonElement2 = (JsonElement) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, JsonElementSerializer.INSTANCE, jsonElement2);
                        i2 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            jsonElement = jsonElement2;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement15;
            str3 = str11;
            i = i3;
            String str12 = strDecodeStringElement13;
            str4 = strDecodeStringElement10;
            str5 = strDecodeStringElement16;
            str6 = strDecodeStringElement12;
            str7 = str12;
            String str13 = strDecodeStringElement14;
            str8 = strDecodeStringElement11;
            str9 = str13;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CopyTradingPreset(i, str2, str5, str9, str7, str, str4, str8, str3, str6, jsonElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CopyTradingPreset copyTradingPreset) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(copyTradingPreset, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CopyTradingPreset.write$Self$OKDex_dex_impl(copyTradingPreset, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class BuySettings$$serializer implements GeneratedSerializer<BuySettings> {
    public static final int $stable;
    public static final BuySettings$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BuySettings$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BuySettings$$serializer buySettings$$serializer = new BuySettings$$serializer();
        INSTANCE = buySettings$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.copytrading.edit.data.model.BuySettings", buySettings$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("buyType", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("buyAmount", true);
        pluginGeneratedSerialDescriptor.addElement("maxBuyAmount", true);
        pluginGeneratedSerialDescriptor.addElement("buyPercent", true);
        pluginGeneratedSerialDescriptor.addElement("repeatCopyBuy", true);
        pluginGeneratedSerialDescriptor.addElement("buyPreset", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{IntSerializer.INSTANCE, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BooleanSerializer.INSTANCE, CopyTradingPreset$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BuySettings deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String str;
        int i;
        boolean z;
        CopyTradingPreset copyTradingPreset;
        String str2;
        String str3;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            i2 = iDecodeIntElement;
            copyTradingPreset = (CopyTradingPreset) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, CopyTradingPreset$$serializer.INSTANCE, null);
            z = zDecodeBooleanElement;
            str = str4;
            str3 = strDecodeStringElement4;
            strDecodeStringElement = strDecodeStringElement3;
            i = 127;
            str2 = strDecodeStringElement2;
        } else {
            String strDecodeStringElement5 = null;
            CopyTradingPreset copyTradingPreset2 = null;
            strDecodeStringElement = null;
            str = null;
            String strDecodeStringElement6 = null;
            int iDecodeIntElement2 = 0;
            boolean zDecodeBooleanElement2 = false;
            i = 0;
            boolean z2 = true;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        i |= 4;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        break;
                    case 3:
                        i |= 8;
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str);
                        break;
                    case 4:
                        i |= 16;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        i |= 64;
                        copyTradingPreset2 = (CopyTradingPreset) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, CopyTradingPreset$$serializer.INSTANCE, copyTradingPreset2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement2;
            copyTradingPreset = copyTradingPreset2;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement5;
            i2 = iDecodeIntElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BuySettings(i, i2, str2, strDecodeStringElement, str, str3, z, copyTradingPreset, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BuySettings buySettings) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(buySettings, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BuySettings.write$Self$OKDex_dex_impl(buySettings, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

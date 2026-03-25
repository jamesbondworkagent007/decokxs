package com.okinc.business.dexlogic.bean;

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

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class DexMultiMetaSaveOrderParam$$serializer implements GeneratedSerializer<DexMultiMetaSaveOrderParam> {
    public static final int $stable;
    public static final DexMultiMetaSaveOrderParam$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DexMultiMetaSaveOrderParam$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DexMultiMetaSaveOrderParam$$serializer dexMultiMetaSaveOrderParam$$serializer = new DexMultiMetaSaveOrderParam$$serializer();
        INSTANCE = dexMultiMetaSaveOrderParam$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.DexMultiMetaSaveOrderParam", dexMultiMetaSaveOrderParam$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("autoSlippageInfo", true);
        pluginGeneratedSerialDescriptor.addElement("customSlippage", true);
        pluginGeneratedSerialDescriptor.addElement("tradeMode", false);
        pluginGeneratedSerialDescriptor.addElement("maxSlippage", true);
        pluginGeneratedSerialDescriptor.addElement("slippage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(DexAutoSlippageInfoParam$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DexMultiMetaSaveOrderParam deserialize(@NotNull Decoder decoder) {
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        DexAutoSlippageInfoParam dexAutoSlippageInfoParam;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            DexAutoSlippageInfoParam dexAutoSlippageInfoParam2 = (DexAutoSlippageInfoParam) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, DexAutoSlippageInfoParam$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            dexAutoSlippageInfoParam = dexAutoSlippageInfoParam2;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            i = iDecodeIntElement;
            i2 = 31;
            str3 = str4;
        } else {
            int iDecodeIntElement2 = 0;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            DexAutoSlippageInfoParam dexAutoSlippageInfoParam3 = null;
            boolean z = true;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    dexAutoSlippageInfoParam3 = (DexAutoSlippageInfoParam) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, DexAutoSlippageInfoParam$$serializer.INSTANCE, dexAutoSlippageInfoParam3);
                    i3 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str7);
                    i3 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i3 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str5);
                    i3 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str6);
                    i3 |= 16;
                }
            }
            i = iDecodeIntElement2;
            i2 = i3;
            str = str5;
            str2 = str6;
            str3 = str7;
            dexAutoSlippageInfoParam = dexAutoSlippageInfoParam3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DexMultiMetaSaveOrderParam(i2, dexAutoSlippageInfoParam, str3, i, str, str2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DexMultiMetaSaveOrderParam dexMultiMetaSaveOrderParam) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dexMultiMetaSaveOrderParam, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DexMultiMetaSaveOrderParam.write$Self$OKDex_dex_impl(dexMultiMetaSaveOrderParam, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

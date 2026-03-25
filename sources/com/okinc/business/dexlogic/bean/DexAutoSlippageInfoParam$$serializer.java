package com.okinc.business.dexlogic.bean;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class DexAutoSlippageInfoParam$$serializer implements GeneratedSerializer<DexAutoSlippageInfoParam> {
    public static final int $stable;
    public static final DexAutoSlippageInfoParam$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DexAutoSlippageInfoParam$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DexAutoSlippageInfoParam$$serializer dexAutoSlippageInfoParam$$serializer = new DexAutoSlippageInfoParam$$serializer();
        INSTANCE = dexAutoSlippageInfoParam$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam", dexAutoSlippageInfoParam$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("autoSlippage", true);
        pluginGeneratedSerialDescriptor.addElement("autoFromSlippage", true);
        pluginGeneratedSerialDescriptor.addElement("autoToSlippage", true);
        pluginGeneratedSerialDescriptor.addElement("autoTotalSlippage", true);
        pluginGeneratedSerialDescriptor.addElement("shortcutFixSlippage", true);
        pluginGeneratedSerialDescriptor.addElement("supportMaxSlippage", true);
        pluginGeneratedSerialDescriptor.addElement("dynamicSlippageRangeMin", true);
        pluginGeneratedSerialDescriptor.addElement("dynamicSlippageRangeMax", true);
        pluginGeneratedSerialDescriptor.addElement("recommendSlippageRangeMin", true);
        pluginGeneratedSerialDescriptor.addElement("recommendSlippageRangeMax", true);
        pluginGeneratedSerialDescriptor.addElement("referenceSlippage", true);
        pluginGeneratedSerialDescriptor.addElement("limitOrderDynamicSpecialSlippage", true);
        pluginGeneratedSerialDescriptor.addElement("slippageType", true);
        pluginGeneratedSerialDescriptor.addElement("slippageValue", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = DexAutoSlippageInfoParam.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[4]), BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, IntSerializer.INSTANCE, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DexAutoSlippageInfoParam deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int iDecodeIntElement;
        int i;
        String strDecodeStringElement2;
        String str;
        String str2;
        String strDecodeStringElement3;
        String str3;
        String str4;
        List list;
        String str5;
        boolean z;
        String str6;
        String str7;
        String str8;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = DexAutoSlippageInfoParam.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            i = 16383;
            list = list2;
            str = strDecodeStringElement4;
            str7 = strDecodeStringElement5;
            z = zDecodeBooleanElement;
            strDecodeStringElement = strDecodeStringElement8;
            str3 = strDecodeStringElement12;
            str8 = strDecodeStringElement11;
            str6 = strDecodeStringElement9;
            str5 = strDecodeStringElement10;
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            str4 = strDecodeStringElement7;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
            str2 = strDecodeStringElement6;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
        } else {
            int i2 = 13;
            boolean z2 = true;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            int i3 = 0;
            iDecodeIntElement = 0;
            boolean zDecodeBooleanElement2 = false;
            List list3 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i2 = 13;
                        break;
                    case 0:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 13;
                        break;
                    case 1:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 13;
                        break;
                    case 2:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        i2 = 13;
                        break;
                    case 3:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        i2 = 13;
                        break;
                    case 4:
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], list3);
                        i3 |= 16;
                        i2 = 13;
                        break;
                    case 5:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i3 |= 32;
                        i2 = 13;
                        break;
                    case 6:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 |= 64;
                        i2 = 13;
                        break;
                    case 7:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i3 |= 128;
                        i2 = 13;
                        break;
                    case 8:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i3 |= 256;
                        i2 = 13;
                        break;
                    case 9:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i3 |= 512;
                        i2 = 13;
                        break;
                    case 10:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i3 |= 1024;
                        i2 = 13;
                        break;
                    case 11:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i3 |= 2048;
                        i2 = 13;
                        break;
                    case 12:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
                        i3 |= 4096;
                        i2 = 13;
                        break;
                    case 13:
                        i3 |= 8192;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i2 = 13;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            strDecodeStringElement2 = strDecodeStringElement14;
            str = strDecodeStringElement21;
            str2 = strDecodeStringElement22;
            strDecodeStringElement3 = strDecodeStringElement15;
            str3 = strDecodeStringElement16;
            str4 = strDecodeStringElement19;
            list = list3;
            str5 = strDecodeStringElement17;
            z = zDecodeBooleanElement2;
            String str9 = strDecodeStringElement18;
            str6 = strDecodeStringElement13;
            str7 = strDecodeStringElement20;
            str8 = str9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DexAutoSlippageInfoParam(i, str, str7, str2, str4, list, z, strDecodeStringElement, str6, str5, str8, str3, strDecodeStringElement3, iDecodeIntElement, strDecodeStringElement2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DexAutoSlippageInfoParam dexAutoSlippageInfoParam) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dexAutoSlippageInfoParam, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DexAutoSlippageInfoParam.write$Self$OKDex_dex_impl(dexAutoSlippageInfoParam, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

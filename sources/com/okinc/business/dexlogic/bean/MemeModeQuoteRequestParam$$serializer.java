package com.okinc.business.dexlogic.bean;

import com.okinc.p2p.api.OtcExtraKeys;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class MemeModeQuoteRequestParam$$serializer implements GeneratedSerializer<MemeModeQuoteRequestParam> {
    public static final int $stable;
    public static final MemeModeQuoteRequestParam$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private MemeModeQuoteRequestParam$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        MemeModeQuoteRequestParam$$serializer memeModeQuoteRequestParam$$serializer = new MemeModeQuoteRequestParam$$serializer();
        INSTANCE = memeModeQuoteRequestParam$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.MemeModeQuoteRequestParam", memeModeQuoteRequestParam$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement("fromTokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("toTokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.AMOUNT, false);
        pluginGeneratedSerialDescriptor.addElement("slippage", false);
        pluginGeneratedSerialDescriptor.addElement("userWalletAddress", false);
        pluginGeneratedSerialDescriptor.addElement("slippageType", false);
        pluginGeneratedSerialDescriptor.addElement("refCode", true);
        pluginGeneratedSerialDescriptor.addElement("maxSlippage", false);
        pluginGeneratedSerialDescriptor.addElement("dexIds", true);
        pluginGeneratedSerialDescriptor.addElement("defiPlatformIds", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = MemeModeQuoteRequestParam.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[9]), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final MemeModeQuoteRequestParam deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        String str;
        String str2;
        List list;
        int i2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = MemeModeQuoteRequestParam.$childSerializers;
        int i4 = 10;
        int i5 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            i2 = 2047;
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], null);
            str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            str = str11;
            i = iDecodeIntElement;
            strDecodeStringElement = strDecodeStringElement6;
            str4 = strDecodeStringElement5;
            str2 = str12;
            str6 = str10;
            str3 = strDecodeStringElement4;
            str5 = strDecodeStringElement3;
            str8 = strDecodeStringElement2;
        } else {
            int iDecodeIntElement2 = 0;
            boolean z = true;
            String str13 = null;
            String str14 = null;
            List list2 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            strDecodeStringElement = null;
            String str15 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String str16 = null;
            int i6 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 10;
                        i5 = 7;
                        break;
                    case 0:
                        str9 = str15;
                        i6 |= 1;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        str15 = str9;
                        i4 = 10;
                        i5 = 7;
                        break;
                    case 1:
                        str9 = str15;
                        i6 |= 2;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        str15 = str9;
                        i4 = 10;
                        i5 = 7;
                        break;
                    case 2:
                        str9 = str15;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        str15 = str9;
                        i4 = 10;
                        i5 = 7;
                        break;
                    case 3:
                        str9 = str15;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        str15 = str9;
                        i4 = 10;
                        i5 = 7;
                        break;
                    case 4:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str15);
                        i6 |= 16;
                        str15 = str9;
                        i4 = 10;
                        i5 = 7;
                        break;
                    case 5:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i6 |= 32;
                        break;
                    case 6:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i3 = i6 | 64;
                        i6 = i3;
                        break;
                    case 7:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str13);
                        i3 = i6 | 128;
                        i6 = i3;
                        break;
                    case 8:
                        i6 |= 256;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str14);
                        break;
                    case 9:
                        i6 |= 512;
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], list2);
                        break;
                    case 10:
                        i6 |= 1024;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str16);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str17 = str15;
            i = iDecodeIntElement2;
            str = str13;
            str2 = str14;
            list = list2;
            i2 = i6;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
            str5 = strDecodeStringElement9;
            str6 = str17;
            str7 = str16;
            str8 = strDecodeStringElement10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MemeModeQuoteRequestParam(i2, str8, str5, str3, str4, str6, strDecodeStringElement, i, str, str2, list, str7, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull MemeModeQuoteRequestParam memeModeQuoteRequestParam) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(memeModeQuoteRequestParam, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MemeModeQuoteRequestParam.write$Self$OKDex_dex_impl(memeModeQuoteRequestParam, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

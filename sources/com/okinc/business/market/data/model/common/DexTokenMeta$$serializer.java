package com.okinc.business.market.data.model.common;

import com.okinc.business.market.common.constants.RiskControlLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class DexTokenMeta$$serializer implements GeneratedSerializer<DexTokenMeta> {
    public static final int $stable;
    public static final DexTokenMeta$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DexTokenMeta$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DexTokenMeta$$serializer dexTokenMeta$$serializer = new DexTokenMeta$$serializer();
        INSTANCE = dexTokenMeta$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.common.DexTokenMeta", dexTokenMeta$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("chainLogo", true);
        pluginGeneratedSerialDescriptor.addElement("tokenContractAddress", true);
        pluginGeneratedSerialDescriptor.addElement("tokenLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("tokenName", true);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("chainBWLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("riskControlLevel", true);
        pluginGeneratedSerialDescriptor.addElement("tokenCreateTime", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = DexTokenMeta.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[7], LongSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DexTokenMeta deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        RiskControlLevel riskControlLevel;
        long jDecodeLongElement;
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = DexTokenMeta.$childSerializers;
        int i2 = 6;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            riskControlLevel = (RiskControlLevel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement9;
            str5 = strDecodeStringElement8;
            strDecodeStringElement = strDecodeStringElement6;
            i = 511;
            str4 = strDecodeStringElement7;
            str3 = strDecodeStringElement5;
            str6 = strDecodeStringElement4;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
        } else {
            long jDecodeLongElement2 = 0;
            int i3 = 0;
            boolean z = true;
            RiskControlLevel riskControlLevel2 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                        break;
                    case 0:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 6;
                        break;
                    case 1:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        i3 |= 4;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 = 6;
                        break;
                    case 3:
                        i3 |= 8;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 = 6;
                        break;
                    case 4:
                        i3 |= 16;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 = 6;
                        break;
                    case 5:
                        i3 |= 32;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 = 6;
                        break;
                    case 6:
                        i3 |= 64;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i2 = 6;
                        break;
                    case 7:
                        riskControlLevel2 = (RiskControlLevel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], riskControlLevel2);
                        i3 |= 128;
                        i2 = 6;
                        break;
                    case 8:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
                        i3 |= 256;
                        i2 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            riskControlLevel = riskControlLevel2;
            jDecodeLongElement = jDecodeLongElement2;
            str = strDecodeStringElement14;
            i = i3;
            str2 = strDecodeStringElement11;
            str3 = strDecodeStringElement12;
            str4 = strDecodeStringElement2;
            String str7 = strDecodeStringElement13;
            str5 = strDecodeStringElement10;
            str6 = str7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DexTokenMeta(i, str, str6, str3, strDecodeStringElement, str4, str5, str2, riskControlLevel, jDecodeLongElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DexTokenMeta dexTokenMeta) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dexTokenMeta, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DexTokenMeta.KWHzl(dexTokenMeta, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

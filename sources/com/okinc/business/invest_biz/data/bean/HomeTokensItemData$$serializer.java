package com.okinc.business.invest_biz.data.bean;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class HomeTokensItemData$$serializer implements GeneratedSerializer<HomeTokensItemData> {
    public static final int $stable;
    public static final HomeTokensItemData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private HomeTokensItemData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        HomeTokensItemData$$serializer homeTokensItemData$$serializer = new HomeTokensItemData$$serializer();
        INSTANCE = homeTokensItemData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.HomeTokensItemData", homeTokensItemData$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("tokenLogo", true);
        pluginGeneratedSerialDescriptor.addElement("networkLogo", true);
        pluginGeneratedSerialDescriptor.addElement("rateDesc", true);
        pluginGeneratedSerialDescriptor.addElement("totalTokenAmount", true);
        pluginGeneratedSerialDescriptor.addElement("investmentId", true);
        pluginGeneratedSerialDescriptor.addElement("hasMultipleProtocols", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("coinId", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, HomeTokensLogoData$$serializer.INSTANCE, stringSerializer, stringSerializer, longSerializer, BooleanSerializer.INSTANCE, longSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final HomeTokensItemData deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String str;
        HomeTokensLogoData homeTokensLogoData;
        String str2;
        String str3;
        String str4;
        long j;
        long j2;
        boolean z;
        String str5;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            HomeTokensLogoData homeTokensLogoData2 = (HomeTokensLogoData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, HomeTokensLogoData$$serializer.INSTANCE, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            str5 = str6;
            z = zDecodeBooleanElement;
            str = strDecodeStringElement5;
            j = jDecodeLongElement;
            j2 = jDecodeLongElement2;
            str4 = strDecodeStringElement2;
            str2 = strDecodeStringElement4;
            homeTokensLogoData = homeTokensLogoData2;
            str3 = strDecodeStringElement3;
            i = 1023;
        } else {
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            HomeTokensLogoData homeTokensLogoData3 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            int i3 = 0;
            String str7 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        continue;
                        i2 = 9;
                        break;
                    case 0:
                        i3 |= 1;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        continue;
                        i2 = 9;
                        break;
                    case 1:
                        i3 |= 2;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        continue;
                        i2 = 9;
                        break;
                    case 2:
                        i3 |= 4;
                        homeTokensLogoData3 = (HomeTokensLogoData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, HomeTokensLogoData$$serializer.INSTANCE, homeTokensLogoData3);
                        break;
                    case 3:
                        i3 |= 8;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        i3 |= 16;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i3 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i3 |= 64;
                        break;
                    case 7:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
                        i3 |= 128;
                        break;
                    case 8:
                        i3 |= 256;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str7);
                        break;
                    case 9:
                        i3 |= 512;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
                i2 = 9;
            }
            strDecodeStringElement = strDecodeStringElement10;
            str = strDecodeStringElement6;
            homeTokensLogoData = homeTokensLogoData3;
            str2 = strDecodeStringElement9;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
            j = jDecodeLongElement3;
            j2 = jDecodeLongElement4;
            z = zDecodeBooleanElement2;
            str5 = str7;
            i = i3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new HomeTokensItemData(i, str4, str3, homeTokensLogoData, str2, str, j, z, j2, str5, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull HomeTokensItemData homeTokensItemData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeTokensItemData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        HomeTokensItemData.KWHzl(homeTokensItemData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

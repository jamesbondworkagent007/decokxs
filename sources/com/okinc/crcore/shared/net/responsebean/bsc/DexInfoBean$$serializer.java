package com.okinc.crcore.shared.net.responsebean.bsc;

import com.google.firebase.analytics.FirebaseAnalytics;
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

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class DexInfoBean$$serializer implements GeneratedSerializer<DexInfoBean> {
    public static final int $stable;
    public static final DexInfoBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DexInfoBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DexInfoBean$$serializer dexInfoBean$$serializer = new DexInfoBean$$serializer();
        INSTANCE = dexInfoBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.shared.net.responsebean.bsc.DexInfoBean", dexInfoBean$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("uniqueId", true);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", true);
        pluginGeneratedSerialDescriptor.addElement("chainName", true);
        pluginGeneratedSerialDescriptor.addElement("chainLogo", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, true);
        pluginGeneratedSerialDescriptor.addElement("liquidity", true);
        pluginGeneratedSerialDescriptor.addElement("marketCap", true);
        pluginGeneratedSerialDescriptor.addElement("riskLevel", true);
        pluginGeneratedSerialDescriptor.addElement("decimal", true);
        pluginGeneratedSerialDescriptor.addElement("balanceTag", true);
        pluginGeneratedSerialDescriptor.addElement("balance", true);
        pluginGeneratedSerialDescriptor.addElement("balanceUsd", true);
        pluginGeneratedSerialDescriptor.addElement("communityRecognized", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, intSerializer, intSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DexInfoBean deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        boolean zDecodeBooleanElement;
        int i2;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 11;
        String strDecodeStringElement3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            str3 = strDecodeStringElement5;
            str7 = str12;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            iDecodeIntElement = iDecodeIntElement3;
            i = iDecodeIntElement2;
            str5 = strDecodeStringElement9;
            str = str11;
            str2 = strDecodeStringElement8;
            str9 = str10;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            str8 = strDecodeStringElement7;
            str6 = strDecodeStringElement6;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
            i2 = 16383;
            str4 = strDecodeStringElement4;
        } else {
            int i4 = 13;
            int i5 = 0;
            iDecodeIntElement = 0;
            int iDecodeIntElement4 = 0;
            boolean zDecodeBooleanElement2 = false;
            String str13 = null;
            String str14 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            boolean z = true;
            String str15 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 13;
                        i3 = 11;
                        break;
                    case 0:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i4 = 13;
                        i3 = 11;
                        break;
                    case 1:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i4 = 13;
                        i3 = 11;
                        break;
                    case 2:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        i4 = 13;
                        i3 = 11;
                        break;
                    case 3:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str14);
                        i5 |= 8;
                        i4 = 13;
                        i3 = 11;
                        break;
                    case 4:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i5 |= 16;
                        i4 = 13;
                        break;
                    case 5:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i5 |= 32;
                        i4 = 13;
                        i3 = 11;
                        break;
                    case 6:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str15);
                        i5 |= 64;
                        i4 = 13;
                        i3 = 11;
                        break;
                    case 7:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str13);
                        i5 |= 128;
                        i4 = 13;
                        i3 = 11;
                        break;
                    case 8:
                        i5 |= 256;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i4 = 13;
                        i3 = 11;
                        break;
                    case 9:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
                        i5 |= 512;
                        i4 = 13;
                        i3 = 11;
                        break;
                    case 10:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
                        i5 |= 1024;
                        i4 = 13;
                        i3 = 11;
                        break;
                    case 11:
                        i5 |= 2048;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i4 = 13;
                        i3 = 11;
                        break;
                    case 12:
                        i5 |= 4096;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i4 = 13;
                        i3 = 11;
                        break;
                    case 13:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i5 |= 8192;
                        i4 = 13;
                        i3 = 11;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str15;
            str2 = strDecodeStringElement10;
            str3 = strDecodeStringElement15;
            str4 = strDecodeStringElement16;
            i = iDecodeIntElement4;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i2 = i5;
            strDecodeStringElement = strDecodeStringElement11;
            strDecodeStringElement2 = strDecodeStringElement12;
            str5 = strDecodeStringElement13;
            str6 = strDecodeStringElement14;
            str7 = str13;
            str8 = strDecodeStringElement3;
            str9 = str14;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DexInfoBean(i2, str4, str3, str6, str9, str8, str2, str, str7, str5, i, iDecodeIntElement, strDecodeStringElement, strDecodeStringElement2, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DexInfoBean dexInfoBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dexInfoBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DexInfoBean.write$Self$OKCRCore_cr_core(dexInfoBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

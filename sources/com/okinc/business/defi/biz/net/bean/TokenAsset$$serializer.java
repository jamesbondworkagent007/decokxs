package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class TokenAsset$$serializer implements GeneratedSerializer<TokenAsset> {
    public static final int $stable;
    public static final TokenAsset$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TokenAsset$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TokenAsset$$serializer tokenAsset$$serializer = new TokenAsset$$serializer();
        INSTANCE = tokenAsset$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.TokenAsset", tokenAsset$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("cid", true);
        pluginGeneratedSerialDescriptor.addElement("addr", true);
        pluginGeneratedSerialDescriptor.addElement("addrT", true);
        pluginGeneratedSerialDescriptor.addElement("amt", true);
        pluginGeneratedSerialDescriptor.addElement("amtD", true);
        pluginGeneratedSerialDescriptor.addElement("camt", true);
        pluginGeneratedSerialDescriptor.addElement("vtk", true);
        pluginGeneratedSerialDescriptor.addElement("upnl", true);
        pluginGeneratedSerialDescriptor.addElement("uy", true);
        pluginGeneratedSerialDescriptor.addElement("pnam", true);
        pluginGeneratedSerialDescriptor.addElement("witp", true);
        pluginGeneratedSerialDescriptor.addElement("sb", true);
        pluginGeneratedSerialDescriptor.addElement("hap", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{LongSerializer.INSTANCE, stringSerializer, IntSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TokenAsset deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        long j;
        String str4;
        String str5;
        boolean z;
        String str6;
        int i2;
        String str7;
        String str8;
        String str9;
        String str10;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            str6 = str13;
            str5 = strDecodeStringElement7;
            str9 = strDecodeStringElement6;
            str10 = str11;
            z = zDecodeBooleanElement;
            str4 = strDecodeStringElement5;
            str = str12;
            i2 = iDecodeIntElement;
            i = 8191;
            str8 = strDecodeStringElement2;
            str2 = strDecodeStringElement3;
            str3 = strDecodeStringElement4;
            j = jDecodeLongElement;
        } else {
            int i4 = 12;
            String str14 = null;
            String str15 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            int i5 = 0;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement2 = 0;
            boolean z2 = true;
            long jDecodeLongElement2 = 0;
            String str16 = null;
            String str17 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i4 = 12;
                        break;
                    case 0:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i5 |= 1;
                        i4 = 12;
                        break;
                    case 1:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i4 = 12;
                        break;
                    case 2:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i5 |= 4;
                        i4 = 12;
                        break;
                    case 3:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i5 |= 8;
                        i4 = 12;
                        break;
                    case 4:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i5 |= 16;
                        i4 = 12;
                        break;
                    case 5:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i5 |= 32;
                        i4 = 12;
                        break;
                    case 6:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i3 = i5 | 64;
                        i5 = i3;
                        i4 = 12;
                        break;
                    case 7:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str14);
                        i3 = i5 | 128;
                        i5 = i3;
                        i4 = 12;
                        break;
                    case 8:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str15);
                        i3 = i5 | 256;
                        i5 = i3;
                        i4 = 12;
                        break;
                    case 9:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i3 = i5 | 512;
                        i5 = i3;
                        i4 = 12;
                        break;
                    case 10:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i3 = i5 | 1024;
                        i5 = i3;
                        i4 = 12;
                        break;
                    case 11:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str17);
                        i3 = i5 | 2048;
                        i5 = i3;
                        i4 = 12;
                        break;
                    case 12:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str16);
                        i3 = i5 | 4096;
                        i5 = i3;
                        i4 = 12;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            str = str15;
            str2 = strDecodeStringElement8;
            str3 = strDecodeStringElement12;
            j = jDecodeLongElement2;
            str4 = strDecodeStringElement;
            str5 = strDecodeStringElement9;
            z = zDecodeBooleanElement2;
            str6 = str17;
            i2 = iDecodeIntElement2;
            str7 = str16;
            str8 = strDecodeStringElement11;
            str9 = strDecodeStringElement10;
            str10 = str14;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TokenAsset(i, j, str8, i2, str2, str3, str4, z, str10, str, str9, str5, str6, str7, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TokenAsset tokenAsset) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tokenAsset, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TokenAsset.write$Self$OKWallet_wallet_impl(tokenAsset, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

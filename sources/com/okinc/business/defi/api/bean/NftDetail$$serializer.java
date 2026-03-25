package com.okinc.business.defi.api.bean;

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

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class NftDetail$$serializer implements GeneratedSerializer<NftDetail> {
    public static final int $stable;
    public static final NftDetail$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NftDetail$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NftDetail$$serializer nftDetail$$serializer = new NftDetail$$serializer();
        INSTANCE = nftDetail$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.api.bean.NftDetail", nftDetail$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("intro", true);
        pluginGeneratedSerialDescriptor.addElement("contract", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("dataUrl", true);
        pluginGeneratedSerialDescriptor.addElement("coverUrl", true);
        pluginGeneratedSerialDescriptor.addElement("resourceType", true);
        pluginGeneratedSerialDescriptor.addElement("lastSale", true);
        pluginGeneratedSerialDescriptor.addElement("lastFee", true);
        pluginGeneratedSerialDescriptor.addElement("authorAddress", true);
        pluginGeneratedSerialDescriptor.addElement("owner", true);
        pluginGeneratedSerialDescriptor.addElement("nftId", true);
        pluginGeneratedSerialDescriptor.addElement("tokenId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        NftPrice$$serializer nftPrice$$serializer = NftPrice$$serializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(nftPrice$$serializer), BuiltinSerializersKt.getNullable(nftPrice$$serializer), BuiltinSerializersKt.getNullable(stringSerializer), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NftDetail deserialize(@NotNull Decoder decoder) {
        String str;
        NftPrice nftPrice;
        String str2;
        String str3;
        String str4;
        String strDecodeStringElement;
        String str5;
        boolean z;
        Integer num;
        int i;
        String str6;
        String str7;
        NftPrice nftPrice2;
        String str8;
        String str9;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str10 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, null);
            NftPrice$$serializer nftPrice$$serializer = NftPrice$$serializer.INSTANCE;
            NftPrice nftPrice3 = (NftPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, nftPrice$$serializer, null);
            NftPrice nftPrice4 = (NftPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, nftPrice$$serializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            z = zDecodeBooleanElement;
            str2 = str11;
            nftPrice = nftPrice4;
            num = num2;
            str9 = strDecodeStringElement7;
            str8 = strDecodeStringElement4;
            nftPrice2 = nftPrice3;
            str5 = strDecodeStringElement2;
            i = 16383;
            str3 = strDecodeStringElement6;
            str4 = strDecodeStringElement5;
            str6 = strDecodeStringElement3;
        } else {
            int i2 = 13;
            int i3 = 0;
            boolean zDecodeBooleanElement2 = false;
            String str12 = null;
            NftPrice nftPrice5 = null;
            Integer num3 = null;
            String str13 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            boolean z2 = true;
            NftPrice nftPrice6 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i2 = 13;
                        break;
                    case 0:
                        i3 |= 1;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 = 13;
                        break;
                    case 1:
                        i3 |= 2;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 = 13;
                        break;
                    case 2:
                        i3 |= 4;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 = 13;
                        break;
                    case 3:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        i2 = 13;
                        break;
                    case 4:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                        i2 = 13;
                        break;
                    case 5:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 |= 32;
                        i2 = 13;
                        break;
                    case 6:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 |= 64;
                        i2 = 13;
                        break;
                    case 7:
                        i3 |= 128;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, num3);
                        i2 = 13;
                        break;
                    case 8:
                        i3 |= 256;
                        nftPrice6 = (NftPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, NftPrice$$serializer.INSTANCE, nftPrice6);
                        i2 = 13;
                        break;
                    case 9:
                        i3 |= 512;
                        nftPrice5 = (NftPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, NftPrice$$serializer.INSTANCE, nftPrice5);
                        i2 = 13;
                        break;
                    case 10:
                        i3 |= 1024;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str13);
                        i2 = 13;
                        break;
                    case 11:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
                        i3 |= 2048;
                        i2 = 13;
                        break;
                    case 12:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str12);
                        i3 |= 4096;
                        i2 = 13;
                        break;
                    case 13:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str10);
                        i3 |= 8192;
                        i2 = 13;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str10;
            nftPrice = nftPrice5;
            str2 = str13;
            str3 = strDecodeStringElement9;
            str4 = strDecodeStringElement11;
            strDecodeStringElement = strDecodeStringElement13;
            str5 = strDecodeStringElement14;
            z = zDecodeBooleanElement2;
            num = num3;
            i = i3;
            str6 = strDecodeStringElement12;
            str7 = str12;
            String str14 = strDecodeStringElement10;
            nftPrice2 = nftPrice6;
            str8 = strDecodeStringElement8;
            str9 = str14;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NftDetail(i, str5, str6, strDecodeStringElement, str8, str4, str3, str9, num, nftPrice2, nftPrice, str2, z, str7, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NftDetail nftDetail) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(nftDetail, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NftDetail.write$Self$OKWallet_wallet_api(nftDetail, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

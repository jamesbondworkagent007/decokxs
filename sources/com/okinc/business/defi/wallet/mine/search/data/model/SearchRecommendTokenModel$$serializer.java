package com.okinc.business.defi.wallet.mine.search.data.model;

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

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class SearchRecommendTokenModel$$serializer implements GeneratedSerializer<SearchRecommendTokenModel> {
    public static final int $stable;
    public static final SearchRecommendTokenModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SearchRecommendTokenModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SearchRecommendTokenModel$$serializer searchRecommendTokenModel$$serializer = new SearchRecommendTokenModel$$serializer();
        INSTANCE = searchRecommendTokenModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.mine.search.data.model.SearchRecommendTokenModel", searchRecommendTokenModel$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("strategyType", true);
        pluginGeneratedSerialDescriptor.addElement("strategyName", true);
        pluginGeneratedSerialDescriptor.addElement("recRank", true);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", false);
        pluginGeneratedSerialDescriptor.addElement("contractAddress", true);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("tokenName", true);
        pluginGeneratedSerialDescriptor.addElement("tokenCustomSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("tokenCustomName", true);
        pluginGeneratedSerialDescriptor.addElement("tokenPrice", true);
        pluginGeneratedSerialDescriptor.addElement("tokenPrice24hChange", true);
        pluginGeneratedSerialDescriptor.addElement("tokenMcp", true);
        pluginGeneratedSerialDescriptor.addElement("sameUserNumber", true);
        pluginGeneratedSerialDescriptor.addElement("tokenLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("chainLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("tags", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = SearchRecommendTokenModel.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, stringSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[15])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SearchRecommendTokenModel deserialize(@NotNull Decoder decoder) {
        String str;
        int i;
        int i2;
        int i3;
        String str2;
        String str3;
        String str4;
        String str5;
        List list;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SearchRecommendTokenModel.$childSerializers;
        int i4 = 4;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, null);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, kSerializerArr[15], null);
            str = str14;
            str8 = strDecodeStringElement12;
            str9 = strDecodeStringElement10;
            str13 = strDecodeStringElement9;
            str10 = strDecodeStringElement8;
            str11 = strDecodeStringElement6;
            str7 = strDecodeStringElement5;
            str3 = strDecodeStringElement4;
            str6 = strDecodeStringElement7;
            str12 = strDecodeStringElement11;
            str5 = strDecodeStringElement;
            str2 = strDecodeStringElement2;
            i2 = iDecodeIntElement;
            i3 = iDecodeIntElement2;
            i = 65535;
            str4 = strDecodeStringElement3;
        } else {
            int i5 = 0;
            int i6 = 15;
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            boolean z = true;
            String str15 = null;
            List list2 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i6 = 15;
                        i4 = 4;
                        break;
                    case 0:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i5 |= 1;
                        i6 = 15;
                        i4 = 4;
                        break;
                    case 1:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i6 = 15;
                        i4 = 4;
                        break;
                    case 2:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i5 |= 4;
                        i6 = 15;
                        i4 = 4;
                        break;
                    case 3:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i5 |= 8;
                        i6 = 15;
                        i4 = 4;
                        break;
                    case 4:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i5 |= 16;
                        i6 = 15;
                        i4 = 4;
                        break;
                    case 5:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i5 |= 32;
                        i6 = 15;
                        i4 = 4;
                        break;
                    case 6:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i5 |= 64;
                        i6 = 15;
                        i4 = 4;
                        break;
                    case 7:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i5 |= 128;
                        i6 = 15;
                        i4 = 4;
                        break;
                    case 8:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i5 |= 256;
                        i6 = 15;
                        i4 = 4;
                        break;
                    case 9:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i5 |= 512;
                        i6 = 15;
                        i4 = 4;
                        break;
                    case 10:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i5 |= 1024;
                        i6 = 15;
                        i4 = 4;
                        break;
                    case 11:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i5 |= 2048;
                        i6 = 15;
                        i4 = 4;
                        break;
                    case 12:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str15);
                        i5 |= 4096;
                        i6 = 15;
                        i4 = 4;
                        break;
                    case 13:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i5 |= 8192;
                        i6 = 15;
                        i4 = 4;
                        break;
                    case 14:
                        i5 |= 16384;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i6 = 15;
                        i4 = 4;
                        break;
                    case 15:
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, kSerializerArr[i6], list2);
                        i5 |= 32768;
                        i6 = 15;
                        i4 = 4;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str15;
            i = i5;
            i2 = iDecodeIntElement3;
            i3 = iDecodeIntElement4;
            str2 = strDecodeStringElement21;
            str3 = strDecodeStringElement22;
            str4 = strDecodeStringElement23;
            str5 = strDecodeStringElement24;
            list = list2;
            String str16 = strDecodeStringElement15;
            str6 = strDecodeStringElement13;
            str7 = strDecodeStringElement20;
            str8 = strDecodeStringElement18;
            str9 = strDecodeStringElement16;
            str10 = strDecodeStringElement14;
            str11 = strDecodeStringElement19;
            str12 = strDecodeStringElement17;
            str13 = str16;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SearchRecommendTokenModel(i, i2, str5, i3, str2, str4, str3, str7, str11, str6, str10, str13, str9, str, str12, str8, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SearchRecommendTokenModel searchRecommendTokenModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(searchRecommendTokenModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SearchRecommendTokenModel.write$Self$OKWallet_wallet_impl(searchRecommendTokenModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

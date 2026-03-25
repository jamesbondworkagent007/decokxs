package com.okinc.business.defi.biz.net.bean;

import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import java.util.ArrayList;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class SearchCoinMetaBean$$serializer implements GeneratedSerializer<SearchCoinMetaBean> {
    public static final int $stable;
    public static final SearchCoinMetaBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SearchCoinMetaBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SearchCoinMetaBean$$serializer searchCoinMetaBean$$serializer = new SearchCoinMetaBean$$serializer();
        INSTANCE = searchCoinMetaBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.SearchCoinMetaBean", searchCoinMetaBean$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("coinId", true);
        pluginGeneratedSerialDescriptor.addElement("baseCoinId", true);
        pluginGeneratedSerialDescriptor.addElement("symbol", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("chainName", true);
        pluginGeneratedSerialDescriptor.addElement("tokenType", true);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, true);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("isAggregation", true);
        pluginGeneratedSerialDescriptor.addElement("coinIds", true);
        pluginGeneratedSerialDescriptor.addElement("chainIds", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = SearchCoinMetaBean.$childSerializers;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{longSerializer, longSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(kSerializerArr[9]), BuiltinSerializersKt.getNullable(kSerializerArr[10])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SearchCoinMetaBean deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        String str;
        int i2;
        ArrayList arrayList;
        long j;
        ArrayList arrayList2;
        long j2;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SearchCoinMetaBean.$childSerializers;
        int i3 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            ArrayList arrayList3 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], null);
            arrayList2 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], null);
            str = strDecodeStringElement7;
            str2 = strDecodeStringElement6;
            str4 = strDecodeStringElement5;
            str5 = strDecodeStringElement3;
            i2 = iDecodeIntElement;
            strDecodeStringElement = strDecodeStringElement4;
            arrayList = arrayList3;
            i = 2047;
            str3 = strDecodeStringElement2;
            j2 = jDecodeLongElement2;
            j = jDecodeLongElement;
        } else {
            String strDecodeStringElement8 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            int iDecodeIntElement2 = 0;
            boolean z = true;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            ArrayList arrayList4 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            int i4 = 0;
            ArrayList arrayList5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 7;
                        break;
                    case 0:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 7;
                        break;
                    case 1:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i4 |= 2;
                        i3 = 7;
                        break;
                    case 2:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        i4 |= 8;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        i4 |= 16;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        i4 |= 32;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        break;
                    case 6:
                        i4 |= 64;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        break;
                    case 7:
                        i4 |= 128;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        break;
                    case 8:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
                        i4 |= 256;
                        break;
                    case 9:
                        i4 |= 512;
                        arrayList5 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], arrayList5);
                        break;
                    case 10:
                        i4 |= 1024;
                        arrayList4 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], arrayList4);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            str = strDecodeStringElement11;
            long j3 = jDecodeLongElement3;
            i2 = iDecodeIntElement2;
            arrayList = arrayList5;
            j = jDecodeLongElement4;
            arrayList2 = arrayList4;
            j2 = j3;
            String str6 = strDecodeStringElement10;
            str2 = strDecodeStringElement12;
            str3 = str6;
            String str7 = strDecodeStringElement9;
            str4 = strDecodeStringElement8;
            str5 = str7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SearchCoinMetaBean(i, j, j2, str3, str5, strDecodeStringElement, str4, str2, str, i2, arrayList, arrayList2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SearchCoinMetaBean searchCoinMetaBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(searchCoinMetaBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SearchCoinMetaBean.write$Self$OKWallet_wallet_impl(searchCoinMetaBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

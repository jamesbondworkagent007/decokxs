package com.okinc.business.defi.dapp.utils;

import java.util.List;
import java.util.Map;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class DappDeeplinkRegexBean$$serializer implements GeneratedSerializer<DappDeeplinkRegexBean> {
    public static final int $stable;
    public static final DappDeeplinkRegexBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DappDeeplinkRegexBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DappDeeplinkRegexBean$$serializer dappDeeplinkRegexBean$$serializer = new DappDeeplinkRegexBean$$serializer();
        INSTANCE = dappDeeplinkRegexBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.dapp.utils.DappDeeplinkRegexBean", dappDeeplinkRegexBean$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("regex", false);
        pluginGeneratedSerialDescriptor.addElement("regexMatchs", false);
        pluginGeneratedSerialDescriptor.addElement("paramsMap", false);
        pluginGeneratedSerialDescriptor.addElement("deeplink", false);
        pluginGeneratedSerialDescriptor.addElement("minVersion", false);
        pluginGeneratedSerialDescriptor.addElement("uaConfig", false);
        pluginGeneratedSerialDescriptor.addElement("uaString", false);
        pluginGeneratedSerialDescriptor.addElement("noDohUrlConfig", true);
        pluginGeneratedSerialDescriptor.addElement("defaultUaConfig", true);
        pluginGeneratedSerialDescriptor.addElement("jsBridgeMethodBlackList", true);
        pluginGeneratedSerialDescriptor.addElement("dappHistoryBlackList", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = DappDeeplinkRegexBean.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, kSerializerArr[1], kSerializerArr[2], stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[5]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[7]), BuiltinSerializersKt.getNullable(kSerializerArr[8]), BuiltinSerializersKt.getNullable(kSerializerArr[9]), BuiltinSerializersKt.getNullable(DappHistoryBlack$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DappDeeplinkRegexBean deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        int i;
        String str;
        Map map;
        List list;
        List list2;
        List list3;
        DappHistoryBlack dappHistoryBlack;
        String str2;
        Map map2;
        List list4;
        Map map3;
        List list5;
        Map map4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = DappDeeplinkRegexBean.$childSerializers;
        int i2 = 10;
        int i3 = 6;
        int i4 = 9;
        int i5 = 7;
        DappHistoryBlack dappHistoryBlack2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            List list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            Map map5 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            Map map6 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, null);
            List list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            List list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], null);
            dappHistoryBlack = (DappHistoryBlack) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, DappHistoryBlack$$serializer.INSTANCE, null);
            str = str3;
            strDecodeStringElement = strDecodeStringElement4;
            strDecodeStringElement2 = strDecodeStringElement5;
            list2 = list7;
            map = map6;
            list4 = list6;
            list3 = list8;
            map2 = map5;
            str2 = strDecodeStringElement3;
            i = 2047;
        } else {
            int i6 = 0;
            boolean z = true;
            String str4 = null;
            Map map7 = null;
            List list9 = null;
            List list10 = null;
            List list11 = null;
            strDecodeStringElement = null;
            strDecodeStringElement2 = null;
            Map map8 = null;
            List list12 = null;
            String strDecodeStringElement6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        map3 = map8;
                        list5 = list12;
                        z = false;
                        map8 = map3;
                        list12 = list5;
                        i2 = 10;
                        i3 = 6;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 0:
                        map4 = map8;
                        i6 |= 1;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        list12 = list12;
                        map8 = map4;
                        i2 = 10;
                        i3 = 6;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 1:
                        map4 = map8;
                        i6 |= 2;
                        list12 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], list12);
                        map8 = map4;
                        i2 = 10;
                        i3 = 6;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 2:
                        i6 |= 4;
                        map4 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], map8);
                        map8 = map4;
                        i2 = 10;
                        i3 = 6;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 3:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        map4 = map8;
                        map8 = map4;
                        i2 = 10;
                        i3 = 6;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 4:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i6 |= 16;
                        map4 = map8;
                        map8 = map4;
                        i2 = 10;
                        i3 = 6;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 5:
                        i6 |= 32;
                        map7 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], map7);
                        map4 = map8;
                        map8 = map4;
                        i2 = 10;
                        i3 = 6;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 6:
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str4);
                        i6 |= 64;
                        map4 = map8;
                        map8 = map4;
                        i2 = 10;
                        i3 = 6;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 7:
                        i6 |= 128;
                        list10 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kSerializerArr[i5], list10);
                        map4 = map8;
                        map8 = map4;
                        i2 = 10;
                        i3 = 6;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 8:
                        i6 |= 256;
                        list11 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], list11);
                        map3 = map8;
                        list5 = list12;
                        map8 = map3;
                        list12 = list5;
                        i2 = 10;
                        i3 = 6;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 9:
                        i6 |= 512;
                        list9 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, kSerializerArr[i4], list9);
                        break;
                    case 10:
                        i6 |= 1024;
                        dappHistoryBlack2 = (DappHistoryBlack) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, DappHistoryBlack$$serializer.INSTANCE, dappHistoryBlack2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Map map9 = map8;
            List list13 = list12;
            i = i6;
            str = str4;
            map = map7;
            list = list9;
            list2 = list10;
            list3 = list11;
            dappHistoryBlack = dappHistoryBlack2;
            str2 = strDecodeStringElement6;
            map2 = map9;
            list4 = list13;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DappDeeplinkRegexBean(i, str2, list4, map2, strDecodeStringElement, strDecodeStringElement2, map, str, list2, list3, list, dappHistoryBlack, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DappDeeplinkRegexBean dappDeeplinkRegexBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dappDeeplinkRegexBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DappDeeplinkRegexBean.write$Self$OKDiscover_discover_impl(dappDeeplinkRegexBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DappBTCUTXOAllInfo$$serializer implements GeneratedSerializer<DappBTCUTXOAllInfo> {
    public static final int $stable;
    public static final DappBTCUTXOAllInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DappBTCUTXOAllInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DappBTCUTXOAllInfo$$serializer dappBTCUTXOAllInfo$$serializer = new DappBTCUTXOAllInfo$$serializer();
        INSTANCE = dappBTCUTXOAllInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.DappBTCUTXOAllInfo", dappBTCUTXOAllInfo$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", true);
        pluginGeneratedSerialDescriptor.addElement("gasFee", true);
        pluginGeneratedSerialDescriptor.addElement("usdGasFee", true);
        pluginGeneratedSerialDescriptor.addElement("isShowFee", true);
        pluginGeneratedSerialDescriptor.addElement("analysisStatus", true);
        pluginGeneratedSerialDescriptor.addElement("exploreUrl", true);
        pluginGeneratedSerialDescriptor.addElement("inputInfo", true);
        pluginGeneratedSerialDescriptor.addElement("outputInfo", true);
        pluginGeneratedSerialDescriptor.addElement("assetChange", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = DappBTCUTXOAllInfo.$childSerializers;
        KSerializer nullable = BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[6]), BuiltinSerializersKt.getNullable(kSerializerArr[7]), BuiltinSerializersKt.getNullable(kSerializerArr[8])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DappBTCUTXOAllInfo deserialize(@NotNull Decoder decoder) {
        int i;
        List list;
        String str;
        List list2;
        List list3;
        Boolean bool;
        String str2;
        Integer num;
        String str3;
        Long l;
        Integer num2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = DappBTCUTXOAllInfo.$childSerializers;
        int i2 = 5;
        int i3 = 7;
        int i4 = 6;
        List list4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, null);
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], null);
            str3 = str5;
            bool = bool2;
            list3 = list6;
            num = num3;
            str = str4;
            list = list5;
            i = 511;
            l = l2;
        } else {
            int i5 = 0;
            boolean z = true;
            String str6 = null;
            List list7 = null;
            String str7 = null;
            List list8 = null;
            Boolean bool3 = null;
            String str8 = null;
            Integer num4 = null;
            Long l3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        num2 = num4;
                        z = false;
                        num4 = num2;
                        i2 = 5;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 0:
                        num2 = num4;
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, l3);
                        i5 |= 1;
                        num4 = num2;
                        i2 = 5;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 1:
                        num2 = num4;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str8);
                        i5 |= 2;
                        num4 = num2;
                        i2 = 5;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 2:
                        num2 = num4;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str7);
                        i5 |= 4;
                        num4 = num2;
                        i2 = 5;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 3:
                        num2 = num4;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool3);
                        i5 |= 8;
                        num4 = num2;
                        i2 = 5;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 4:
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, num4);
                        i5 |= 16;
                        num4 = num2;
                        i2 = 5;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 5:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str6);
                        i5 |= 32;
                        num2 = num4;
                        num4 = num2;
                        i2 = 5;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 6:
                        list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, kSerializerArr[i4], list7);
                        i5 |= 64;
                        break;
                    case 7:
                        i5 |= 128;
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, kSerializerArr[i3], list4);
                        num2 = num4;
                        num4 = num2;
                        i2 = 5;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 8:
                        i5 |= 256;
                        list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], list8);
                        num2 = num4;
                        num4 = num2;
                        i2 = 5;
                        i3 = 7;
                        i4 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            list = list7;
            str = str7;
            list2 = list8;
            list3 = list4;
            bool = bool3;
            str2 = str8;
            num = num4;
            str3 = str6;
            l = l3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DappBTCUTXOAllInfo(i, l, str2, str, bool, num, str3, list, list3, list2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DappBTCUTXOAllInfo dappBTCUTXOAllInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dappBTCUTXOAllInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DappBTCUTXOAllInfo.write$Self$OKWallet_wallet_impl(dappBTCUTXOAllInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

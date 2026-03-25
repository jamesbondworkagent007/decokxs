package com.okinc.crcore.coreapi.net.requestbean.transactions.trades;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class AssetActivityHistoryRequest$$serializer implements GeneratedSerializer<AssetActivityHistoryRequest> {
    public static final int $stable;
    public static final AssetActivityHistoryRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AssetActivityHistoryRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AssetActivityHistoryRequest$$serializer assetActivityHistoryRequest$$serializer = new AssetActivityHistoryRequest$$serializer();
        INSTANCE = assetActivityHistoryRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.requestbean.transactions.trades.AssetActivityHistoryRequest", assetActivityHistoryRequest$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("offsetId", true);
        pluginGeneratedSerialDescriptor.addElement("offsetEventTime", true);
        pluginGeneratedSerialDescriptor.addElement("activityType", true);
        pluginGeneratedSerialDescriptor.addElement("activityCurrency", true);
        pluginGeneratedSerialDescriptor.addElement("queryType", false);
        pluginGeneratedSerialDescriptor.addElement("entryPoint", false);
        pluginGeneratedSerialDescriptor.addElement("fromTimestamp", false);
        pluginGeneratedSerialDescriptor.addElement("toTimestamp", false);
        pluginGeneratedSerialDescriptor.addElement("pageSize", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = AssetActivityHistoryRequest.$childSerializers;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[2]), BuiltinSerializersKt.getNullable(kSerializerArr[3]), intSerializer, intSerializer, BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), intSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AssetActivityHistoryRequest deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        Long l;
        Long l2;
        int i;
        int i2;
        int i3;
        Long l3;
        List list;
        Long l4;
        List list2;
        Long l5;
        List list3;
        List list4;
        Long l6;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = AssetActivityHistoryRequest.$childSerializers;
        int i4 = 7;
        int i5 = 6;
        int i6 = 5;
        int i7 = 8;
        int i8 = 4;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, longSerializer, null);
            Long l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, longSerializer, null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            Long l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, longSerializer, null);
            list = list6;
            l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, longSerializer, null);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            l2 = l9;
            i = iDecodeIntElement3;
            i3 = iDecodeIntElement2;
            l3 = l8;
            list2 = list5;
            i2 = 511;
            l4 = l7;
        } else {
            int iDecodeIntElement4 = 0;
            int i9 = 0;
            int iDecodeIntElement5 = 0;
            boolean z = true;
            Long l10 = null;
            Long l11 = null;
            Long l12 = null;
            List list7 = null;
            Long l13 = null;
            List list8 = null;
            int iDecodeIntElement6 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        l5 = l12;
                        list3 = list7;
                        z = false;
                        l12 = l5;
                        list7 = list3;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        i7 = 8;
                        i8 = 4;
                        break;
                    case 0:
                        l5 = l12;
                        list3 = list7;
                        l13 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, l13);
                        i9 |= 1;
                        l12 = l5;
                        list7 = list3;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        i7 = 8;
                        i8 = 4;
                        break;
                    case 1:
                        list4 = list7;
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, l12);
                        i9 |= 2;
                        l12 = l6;
                        list7 = list4;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        i7 = 8;
                        break;
                    case 2:
                        list4 = list7;
                        i9 |= 4;
                        l6 = l12;
                        list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], list8);
                        l12 = l6;
                        list7 = list4;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        i7 = 8;
                        break;
                    case 3:
                        i9 |= 8;
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], list7);
                        l6 = l12;
                        l12 = l6;
                        list7 = list4;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        i7 = 8;
                        break;
                    case 4:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i8);
                        i9 |= 16;
                        break;
                    case 5:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i6);
                        i9 |= 32;
                        break;
                    case 6:
                        Long l14 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, LongSerializer.INSTANCE, l11);
                        i9 |= 64;
                        l5 = l12;
                        list3 = list7;
                        l11 = l14;
                        l12 = l5;
                        list7 = list3;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        i7 = 8;
                        i8 = 4;
                        break;
                    case 7:
                        Long l15 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, LongSerializer.INSTANCE, l10);
                        i9 |= 128;
                        l5 = l12;
                        list3 = list7;
                        l10 = l15;
                        l12 = l5;
                        list7 = list3;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        i7 = 8;
                        i8 = 4;
                        break;
                    case 8:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i7);
                        i9 |= 256;
                        l5 = l12;
                        list3 = list7;
                        l12 = l5;
                        list7 = list3;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        i7 = 8;
                        i8 = 4;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Long l16 = l12;
            List list9 = list7;
            Long l17 = l13;
            iDecodeIntElement = iDecodeIntElement4;
            l = l10;
            l2 = l11;
            i = iDecodeIntElement6;
            i2 = i9;
            i3 = iDecodeIntElement5;
            l3 = l16;
            list = list9;
            l4 = l17;
            list2 = list8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AssetActivityHistoryRequest(i2, l4, l3, list2, list, i3, i, l2, l, iDecodeIntElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AssetActivityHistoryRequest assetActivityHistoryRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(assetActivityHistoryRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AssetActivityHistoryRequest.write$Self$OKCRCore_cr_core(assetActivityHistoryRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

package com.okinc.business.market.features.address_tracker_sa.ui.tracker.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class TrackerTrendRequest$$serializer implements GeneratedSerializer<TrackerTrendRequest> {
    public static final int $stable;
    public static final TrackerTrendRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TrackerTrendRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TrackerTrendRequest$$serializer trackerTrendRequest$$serializer = new TrackerTrendRequest$$serializer();
        INSTANCE = trackerTrendRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendRequest", trackerTrendRequest$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("walletAddress", false);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement("timeType", false);
        pluginGeneratedSerialDescriptor.addElement("tagTypeList", true);
        pluginGeneratedSerialDescriptor.addElement("groupIdList", true);
        pluginGeneratedSerialDescriptor.addElement("holderCountMin", true);
        pluginGeneratedSerialDescriptor.addElement("liquidityMax", true);
        pluginGeneratedSerialDescriptor.addElement("liquidityMin", true);
        pluginGeneratedSerialDescriptor.addElement("marketCapMax", true);
        pluginGeneratedSerialDescriptor.addElement("marketCapMin", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAgeMin", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAgeMax", true);
        pluginGeneratedSerialDescriptor.addElement("pageNum", true);
        pluginGeneratedSerialDescriptor.addElement("pageSize", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = TrackerTrendRequest.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, kSerializerArr[3], kSerializerArr[4], stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, intSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TrackerTrendRequest deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        String str;
        String str2;
        int iDecodeIntElement;
        List list;
        String str3;
        int iDecodeIntElement2;
        List list2;
        String strDecodeStringElement2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        char c;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TrackerTrendRequest.$childSerializers;
        int i2 = 4;
        String strDecodeStringElement3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            i = 16383;
            list2 = list4;
            str2 = strDecodeStringElement4;
            str8 = strDecodeStringElement5;
            strDecodeStringElement = strDecodeStringElement7;
            str6 = strDecodeStringElement8;
            str = strDecodeStringElement12;
            str5 = strDecodeStringElement11;
            str7 = strDecodeStringElement9;
            str3 = strDecodeStringElement10;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
            str4 = strDecodeStringElement6;
            list = list3;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 13);
        } else {
            int i3 = 13;
            boolean z = true;
            List list5 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            int i4 = 0;
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            List list6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 13;
                        i2 = 4;
                        break;
                    case 0:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 13;
                        i2 = 4;
                        break;
                    case 1:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i3 = 13;
                        i2 = 4;
                        break;
                    case 2:
                        c = 3;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        i3 = 13;
                        i2 = 4;
                        break;
                    case 3:
                        c = 3;
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], list5);
                        i4 |= 8;
                        i3 = 13;
                        i2 = 4;
                        break;
                    case 4:
                        list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i2, kSerializerArr[i2], list6);
                        i4 |= 16;
                        i3 = 13;
                        i2 = 4;
                        break;
                    case 5:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i4 |= 32;
                        i3 = 13;
                        i2 = 4;
                        break;
                    case 6:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i4 |= 64;
                        i3 = 13;
                        i2 = 4;
                        break;
                    case 7:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i4 |= 128;
                        i3 = 13;
                        i2 = 4;
                        break;
                    case 8:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i4 |= 256;
                        i3 = 13;
                        i2 = 4;
                        break;
                    case 9:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i4 |= 512;
                        i3 = 13;
                        i2 = 4;
                        break;
                    case 10:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i4 |= 1024;
                        i3 = 13;
                        i2 = 4;
                        break;
                    case 11:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i4 |= 2048;
                        i3 = 13;
                        i2 = 4;
                        break;
                    case 12:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
                        i4 |= 4096;
                        i3 = 13;
                        i2 = 4;
                        break;
                    case 13:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i3);
                        i4 |= 8192;
                        i3 = 13;
                        i2 = 4;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            str = strDecodeStringElement15;
            str2 = strDecodeStringElement19;
            iDecodeIntElement = iDecodeIntElement4;
            list = list5;
            str3 = strDecodeStringElement16;
            iDecodeIntElement2 = iDecodeIntElement3;
            list2 = list6;
            strDecodeStringElement2 = strDecodeStringElement14;
            str4 = strDecodeStringElement20;
            str5 = strDecodeStringElement17;
            str6 = strDecodeStringElement3;
            String str9 = strDecodeStringElement18;
            str7 = strDecodeStringElement13;
            str8 = str9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TrackerTrendRequest(i, str2, str8, str4, list, list2, strDecodeStringElement, str6, str7, str3, str5, str, strDecodeStringElement2, iDecodeIntElement2, iDecodeIntElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TrackerTrendRequest trackerTrendRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(trackerTrendRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TrackerTrendRequest.EZpvd(trackerTrendRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

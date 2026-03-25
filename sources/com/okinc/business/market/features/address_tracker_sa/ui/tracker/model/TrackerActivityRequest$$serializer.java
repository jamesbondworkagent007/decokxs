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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class TrackerActivityRequest$$serializer implements GeneratedSerializer<TrackerActivityRequest> {
    public static final int $stable;
    public static final TrackerActivityRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TrackerActivityRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TrackerActivityRequest$$serializer trackerActivityRequest$$serializer = new TrackerActivityRequest$$serializer();
        INSTANCE = trackerActivityRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityRequest", trackerActivityRequest$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("walletAddress", false);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement("timeType", false);
        pluginGeneratedSerialDescriptor.addElement("userActionTypeList", false);
        pluginGeneratedSerialDescriptor.addElement("tagTypeList", false);
        pluginGeneratedSerialDescriptor.addElement("groupIdList", false);
        pluginGeneratedSerialDescriptor.addElement("holderCountMin", false);
        pluginGeneratedSerialDescriptor.addElement("liquidityMax", false);
        pluginGeneratedSerialDescriptor.addElement("liquidityMin", false);
        pluginGeneratedSerialDescriptor.addElement("marketCapMax", false);
        pluginGeneratedSerialDescriptor.addElement("marketCapMin", false);
        pluginGeneratedSerialDescriptor.addElement("volumeMax", false);
        pluginGeneratedSerialDescriptor.addElement("volumeMin", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAgeMin", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAgeMax", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = TrackerActivityRequest.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, kSerializerArr[3], kSerializerArr[4], kSerializerArr[5], stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TrackerActivityRequest deserialize(@NotNull Decoder decoder) {
        List list;
        List list2;
        List list3;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String strDecodeStringElement;
        String str8;
        String str9;
        String str10;
        String str11;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TrackerActivityRequest.$childSerializers;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            List list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            List list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            str9 = strDecodeStringElement10;
            str = strDecodeStringElement9;
            str8 = strDecodeStringElement11;
            list2 = list4;
            str11 = strDecodeStringElement12;
            str10 = strDecodeStringElement13;
            i = 32767;
            list3 = list6;
            str7 = strDecodeStringElement3;
            list = list5;
            str4 = strDecodeStringElement6;
            str2 = strDecodeStringElement8;
            str5 = strDecodeStringElement5;
            str3 = strDecodeStringElement7;
            str6 = strDecodeStringElement4;
        } else {
            int i2 = 14;
            int i3 = 0;
            boolean z = true;
            List list7 = null;
            List list8 = null;
            list = null;
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
                        continue;
                        i2 = 14;
                        break;
                    case 0:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        continue;
                        i2 = 14;
                        break;
                    case 1:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        list7 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], list7);
                        i3 |= 8;
                        break;
                    case 4:
                        i3 |= 16;
                        list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], list);
                        continue;
                        i2 = 14;
                        break;
                    case 5:
                        list8 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], list8);
                        i3 |= 32;
                        continue;
                        i2 = 14;
                        break;
                    case 6:
                        i3 |= 64;
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        continue;
                        i2 = 14;
                        break;
                    case 7:
                        i3 |= 128;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        continue;
                        i2 = 14;
                        break;
                    case 8:
                        i3 |= 256;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        continue;
                        i2 = 14;
                        break;
                    case 9:
                        i3 |= 512;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        continue;
                        i2 = 14;
                        break;
                    case 10:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i3 |= 1024;
                        continue;
                        i2 = 14;
                        break;
                    case 11:
                        i3 |= 2048;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        continue;
                        i2 = 14;
                        break;
                    case 12:
                        i3 |= 4096;
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        continue;
                        i2 = 14;
                        break;
                    case 13:
                        i3 |= 8192;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        continue;
                        i2 = 14;
                        break;
                    case 14:
                        i3 |= 16384;
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        continue;
                        i2 = 14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
                i2 = 14;
            }
            list2 = list7;
            list3 = list8;
            i = i3;
            str = strDecodeStringElement18;
            str2 = strDecodeStringElement19;
            str3 = strDecodeStringElement20;
            str4 = strDecodeStringElement21;
            str5 = strDecodeStringElement22;
            str6 = strDecodeStringElement23;
            str7 = strDecodeStringElement24;
            strDecodeStringElement = strDecodeStringElement15;
            str8 = strDecodeStringElement14;
            str9 = strDecodeStringElement2;
            String str12 = strDecodeStringElement17;
            str10 = strDecodeStringElement16;
            str11 = str12;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TrackerActivityRequest(i, str7, str6, str5, list2, list, list3, str4, str3, str2, str, str9, str8, str11, str10, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TrackerActivityRequest trackerActivityRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(trackerActivityRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TrackerActivityRequest.OLrzqt(trackerActivityRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

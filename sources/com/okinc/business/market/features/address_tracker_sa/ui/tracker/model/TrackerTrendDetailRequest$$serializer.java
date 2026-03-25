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
public final /* synthetic */ class TrackerTrendDetailRequest$$serializer implements GeneratedSerializer<TrackerTrendDetailRequest> {
    public static final int $stable;
    public static final TrackerTrendDetailRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TrackerTrendDetailRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TrackerTrendDetailRequest$$serializer trackerTrendDetailRequest$$serializer = new TrackerTrendDetailRequest$$serializer();
        INSTANCE = trackerTrendDetailRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendDetailRequest", trackerTrendDetailRequest$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("walletAddress", false);
        pluginGeneratedSerialDescriptor.addElement("tokenContractAddress", false);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement("timeType", false);
        pluginGeneratedSerialDescriptor.addElement("tagTypeList", true);
        pluginGeneratedSerialDescriptor.addElement("groupIdList", true);
        pluginGeneratedSerialDescriptor.addElement("pageNum", true);
        pluginGeneratedSerialDescriptor.addElement("pageSize", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = TrackerTrendDetailRequest.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[4], kSerializerArr[5], intSerializer, intSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TrackerTrendDetailRequest deserialize(@NotNull Decoder decoder) {
        int i;
        int i2;
        String str;
        String str2;
        List list;
        List list2;
        String str3;
        String str4;
        int iDecodeIntElement;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TrackerTrendDetailRequest.$childSerializers;
        int i3 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            list = list4;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            i = iDecodeIntElement2;
            str2 = strDecodeStringElement4;
            str = strDecodeStringElement3;
            i2 = 255;
            list2 = list3;
            str3 = strDecodeStringElement2;
            str4 = strDecodeStringElement;
        } else {
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            int iDecodeIntElement3 = 0;
            int i4 = 0;
            boolean z = true;
            List list5 = null;
            int iDecodeIntElement4 = 0;
            List list6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 7;
                        break;
                    case 0:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 7;
                        break;
                    case 1:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i3 = 7;
                        break;
                    case 2:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        i4 |= 8;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 = 7;
                        break;
                    case 4:
                        i4 |= 16;
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], list5);
                        i3 = 7;
                        break;
                    case 5:
                        i4 |= 32;
                        list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], list6);
                        i3 = 7;
                        break;
                    case 6:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i4 |= 64;
                        i3 = 7;
                        break;
                    case 7:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i3);
                        i4 |= 128;
                        i3 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement4;
            i2 = i4;
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            list = list6;
            list2 = list5;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
            iDecodeIntElement = iDecodeIntElement3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TrackerTrendDetailRequest(i2, str4, str3, str, str2, list2, list, i, iDecodeIntElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TrackerTrendDetailRequest trackerTrendDetailRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(trackerTrendDetailRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TrackerTrendDetailRequest.EZpvd(trackerTrendDetailRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

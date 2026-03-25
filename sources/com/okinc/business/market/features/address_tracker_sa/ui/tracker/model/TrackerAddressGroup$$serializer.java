package com.okinc.business.market.features.address_tracker_sa.ui.tracker.model;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class TrackerAddressGroup$$serializer implements GeneratedSerializer<TrackerAddressGroup> {
    public static final int $stable;
    public static final TrackerAddressGroup$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TrackerAddressGroup$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TrackerAddressGroup$$serializer trackerAddressGroup$$serializer = new TrackerAddressGroup$$serializer();
        INSTANCE = trackerAddressGroup$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerAddressGroup", trackerAddressGroup$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("collectNum", false);
        pluginGeneratedSerialDescriptor.addElement("groupName", false);
        pluginGeneratedSerialDescriptor.addElement("groupStatus", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("sortOrder", false);
        pluginGeneratedSerialDescriptor.addElement("walletAddress", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, stringSerializer, intSerializer, LongSerializer.INSTANCE, intSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TrackerAddressGroup deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        String strDecodeStringElement;
        int i;
        String str;
        long j;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            i3 = iDecodeIntElement2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            i2 = iDecodeIntElement4;
            iDecodeIntElement = iDecodeIntElement3;
            str = strDecodeStringElement2;
            j = jDecodeLongElement;
            i = 63;
        } else {
            String strDecodeStringElement3 = null;
            int i5 = 0;
            iDecodeIntElement = 0;
            boolean z = true;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement4 = null;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i5 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 = i5 | 2;
                        break;
                    case 2:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i4 = i5 | 4;
                        break;
                    case 3:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i4 = i5 | 8;
                        break;
                    case 4:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i4 = i5 | 16;
                        break;
                    case 5:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i4 = i5 | 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
                i5 = i4;
            }
            strDecodeStringElement = strDecodeStringElement4;
            i = i5;
            str = strDecodeStringElement3;
            j = jDecodeLongElement2;
            i2 = iDecodeIntElement6;
            i3 = iDecodeIntElement5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TrackerAddressGroup(i, i3, str, iDecodeIntElement, j, i2, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TrackerAddressGroup trackerAddressGroup) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(trackerAddressGroup, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TrackerAddressGroup.OLrzqt(trackerAddressGroup, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

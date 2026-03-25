package com.okinc.business.market.data.model.smart_money;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class SignalOverview$$serializer implements GeneratedSerializer<SignalOverview> {
    public static final int $stable;
    public static final SignalOverview$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SignalOverview$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SignalOverview$$serializer signalOverview$$serializer = new SignalOverview$$serializer();
        INSTANCE = signalOverview$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.smart_money.SignalOverview", signalOverview$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("fstList", true);
        pluginGeneratedSerialDescriptor.addElement("klineDefaultPeriod", true);
        pluginGeneratedSerialDescriptor.addElement("klines", true);
        pluginGeneratedSerialDescriptor.addElement("lastEventTime", true);
        pluginGeneratedSerialDescriptor.addElement("maxIncreaseMultiplier", true);
        pluginGeneratedSerialDescriptor.addElement("maxIncreasePercentage", true);
        pluginGeneratedSerialDescriptor.addElement("mimList", true);
        pluginGeneratedSerialDescriptor.addElement("mipList", true);
        pluginGeneratedSerialDescriptor.addElement("signals", true);
        pluginGeneratedSerialDescriptor.addElement("tokenKey", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SignalOverview.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{kSerializerArr[0], stringSerializer, kSerializerArr[2], LongSerializer.INSTANCE, stringSerializer, stringSerializer, kSerializerArr[6], kSerializerArr[7], kSerializerArr[8], stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SignalOverview deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        List list;
        List list2;
        List list3;
        List list4;
        String strDecodeStringElement2;
        String strDecodeStringElement3;
        List list5;
        long j;
        List list6;
        List list7;
        List list8;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SignalOverview.$childSerializers;
        int i2 = 9;
        int i3 = 5;
        int i4 = 4;
        String strDecodeStringElement4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list9 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            List list10 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            List list11 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            List list12 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], null);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            strDecodeStringElement4 = strDecodeStringElement5;
            list3 = list12;
            i = 1023;
            list = list10;
            j = jDecodeLongElement;
            list2 = list9;
            strDecodeStringElement = strDecodeStringElement6;
            list5 = list11;
        } else {
            boolean z = true;
            int i5 = 0;
            List list13 = null;
            List list14 = null;
            List list15 = null;
            List list16 = null;
            String strDecodeStringElement7 = null;
            List list17 = null;
            long jDecodeLongElement2 = 0;
            strDecodeStringElement = null;
            String strDecodeStringElement8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        list6 = list16;
                        list7 = list17;
                        z = false;
                        list16 = list6;
                        list17 = list7;
                        i2 = 9;
                        i3 = 5;
                        i4 = 4;
                        break;
                    case 0:
                        list8 = list16;
                        i5 |= 1;
                        list17 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], list17);
                        list16 = list8;
                        i2 = 9;
                        i3 = 5;
                        i4 = 4;
                        break;
                    case 1:
                        list8 = list16;
                        i5 |= 2;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        list16 = list8;
                        i2 = 9;
                        i3 = 5;
                        i4 = 4;
                        break;
                    case 2:
                        i5 |= 4;
                        list8 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], list16);
                        list16 = list8;
                        i2 = 9;
                        i3 = 5;
                        i4 = 4;
                        break;
                    case 3:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i5 |= 8;
                        list6 = list16;
                        list7 = list17;
                        list16 = list6;
                        list17 = list7;
                        i2 = 9;
                        i3 = 5;
                        i4 = 4;
                        break;
                    case 4:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i5 |= 16;
                        break;
                    case 5:
                        i5 |= 32;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        break;
                    case 6:
                        i5 |= 64;
                        list14 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], list14);
                        break;
                    case 7:
                        i5 |= 128;
                        list13 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], list13);
                        break;
                    case 8:
                        i5 |= 256;
                        list15 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], list15);
                        break;
                    case 9:
                        i5 |= 512;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            list = list16;
            list2 = list17;
            list3 = list13;
            list4 = list15;
            strDecodeStringElement2 = strDecodeStringElement8;
            strDecodeStringElement3 = strDecodeStringElement7;
            list5 = list14;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SignalOverview(i, list2, strDecodeStringElement3, list, j, strDecodeStringElement4, strDecodeStringElement, list5, list3, list4, strDecodeStringElement2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SignalOverview signalOverview) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(signalOverview, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SignalOverview.OLrzqt(signalOverview, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class TrendTrader$$serializer implements GeneratedSerializer<TrendTrader> {
    public static final int $stable;
    public static final TrendTrader$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TrendTrader$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TrendTrader$$serializer trendTrader$$serializer = new TrendTrader$$serializer();
        INSTANCE = trendTrader$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrendTrader", trendTrader$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("addressAlias", true);
        pluginGeneratedSerialDescriptor.addElement("balance", true);
        pluginGeneratedSerialDescriptor.addElement("collectAddress", true);
        pluginGeneratedSerialDescriptor.addElement("inflow", true);
        pluginGeneratedSerialDescriptor.addElement("lastTradeType", true);
        pluginGeneratedSerialDescriptor.addElement("lastTxTime", true);
        pluginGeneratedSerialDescriptor.addElement("realizedProfit", true);
        pluginGeneratedSerialDescriptor.addElement("realizedProfitPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("t", true);
        pluginGeneratedSerialDescriptor.addElement("txsBuy", true);
        pluginGeneratedSerialDescriptor.addElement("txsSell", true);
        pluginGeneratedSerialDescriptor.addElement("unrealizedProfit", true);
        pluginGeneratedSerialDescriptor.addElement("unrealizedProfitPercentage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = TrendTrader.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, LongSerializer.INSTANCE, stringSerializer, stringSerializer, kSerializerArr[8], intSerializer, intSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TrendTrader deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        List list;
        int i2;
        String str4;
        String str5;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        String str6;
        int i3;
        int iDecodeIntElement;
        long j;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TrendTrader.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], null);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
            list = list2;
            str = strDecodeStringElement3;
            i = iDecodeIntElement3;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            str2 = strDecodeStringElement8;
            str4 = strDecodeStringElement7;
            i2 = 8191;
            str6 = strDecodeStringElement6;
            i3 = iDecodeIntElement2;
            j = jDecodeLongElement;
            str3 = strDecodeStringElement5;
            str5 = strDecodeStringElement4;
        } else {
            int i4 = 12;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            boolean z = true;
            int i5 = 0;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            int iDecodeIntElement6 = 0;
            List list3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 12;
                        break;
                    case 0:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i4 = 12;
                        break;
                    case 1:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i4 = 12;
                        break;
                    case 2:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        i4 = 12;
                        break;
                    case 3:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i5 |= 8;
                        i4 = 12;
                        break;
                    case 4:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i5 |= 16;
                        i4 = 12;
                        break;
                    case 5:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i5 |= 32;
                        i4 = 12;
                        break;
                    case 6:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i5 |= 64;
                        i4 = 12;
                        break;
                    case 7:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i5 |= 128;
                        i4 = 12;
                        break;
                    case 8:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], list3);
                        i5 |= 256;
                        i4 = 12;
                        break;
                    case 9:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
                        i5 |= 512;
                        i4 = 12;
                        break;
                    case 10:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
                        i5 |= 1024;
                        i4 = 12;
                        break;
                    case 11:
                        i5 |= 2048;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i4 = 12;
                        break;
                    case 12:
                        i5 |= 4096;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i4 = 12;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement6;
            str = strDecodeStringElement13;
            str2 = strDecodeStringElement16;
            str3 = strDecodeStringElement14;
            list = list3;
            i2 = i5;
            String str7 = strDecodeStringElement12;
            str4 = strDecodeStringElement15;
            str5 = str7;
            long j2 = jDecodeLongElement2;
            strDecodeStringElement = strDecodeStringElement9;
            strDecodeStringElement2 = strDecodeStringElement10;
            str6 = strDecodeStringElement11;
            i3 = iDecodeIntElement5;
            iDecodeIntElement = iDecodeIntElement4;
            j = j2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TrendTrader(i2, str, str5, str3, str6, i3, j, str4, str2, list, i, iDecodeIntElement, strDecodeStringElement, strDecodeStringElement2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TrendTrader trendTrader) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(trendTrader, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TrendTrader.AEQbTJ(trendTrader, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

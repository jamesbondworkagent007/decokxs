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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class SignalOverviewOrActivityListRequest$$serializer implements GeneratedSerializer<SignalOverviewOrActivityListRequest> {
    public static final int $stable;
    public static final SignalOverviewOrActivityListRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SignalOverviewOrActivityListRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SignalOverviewOrActivityListRequest$$serializer signalOverviewOrActivityListRequest$$serializer = new SignalOverviewOrActivityListRequest$$serializer();
        INSTANCE = signalOverviewOrActivityListRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.smart_money.SignalOverviewOrActivityListRequest", signalOverviewOrActivityListRequest$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("pageSize", false);
        pluginGeneratedSerialDescriptor.addElement("lastEventTime", false);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement("signalLabelList", false);
        pluginGeneratedSerialDescriptor.addElement("trend", false);
        pluginGeneratedSerialDescriptor.addElement("protocolIdList", false);
        pluginGeneratedSerialDescriptor.addElement("signalMetricsFilter", false);
        pluginGeneratedSerialDescriptor.addElement("tokenMetricsFilter", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SignalOverviewOrActivityListRequest.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{IntSerializer.INSTANCE, stringSerializer, stringSerializer, kSerializerArr[3], stringSerializer, kSerializerArr[5], SignalMetricsFilterRequest$$serializer.INSTANCE, TokenMetricsFilterRequest$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SignalOverviewOrActivityListRequest deserialize(@NotNull Decoder decoder) {
        List list;
        String strDecodeStringElement;
        SignalMetricsFilterRequest signalMetricsFilterRequest;
        int i;
        String str;
        int i2;
        TokenMetricsFilterRequest tokenMetricsFilterRequest;
        List list2;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SignalOverviewOrActivityListRequest.$childSerializers;
        int i3 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            SignalMetricsFilterRequest signalMetricsFilterRequest2 = (SignalMetricsFilterRequest) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, SignalMetricsFilterRequest$$serializer.INSTANCE, null);
            list2 = list4;
            tokenMetricsFilterRequest = (TokenMetricsFilterRequest) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, TokenMetricsFilterRequest$$serializer.INSTANCE, null);
            signalMetricsFilterRequest = signalMetricsFilterRequest2;
            strDecodeStringElement = strDecodeStringElement4;
            str = strDecodeStringElement3;
            list = list3;
            str2 = strDecodeStringElement2;
            i2 = iDecodeIntElement;
            i = 255;
        } else {
            int iDecodeIntElement2 = 0;
            boolean z = true;
            List list5 = null;
            list = null;
            strDecodeStringElement = null;
            TokenMetricsFilterRequest tokenMetricsFilterRequest2 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            SignalMetricsFilterRequest signalMetricsFilterRequest3 = null;
            int i4 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 7;
                        break;
                    case 0:
                        i4 |= 1;
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i3 = 7;
                        break;
                    case 1:
                        i4 |= 2;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 = 7;
                        break;
                    case 2:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        i3 = 7;
                        break;
                    case 3:
                        i4 |= 8;
                        list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], list);
                        i3 = 7;
                        break;
                    case 4:
                        i4 |= 16;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        i4 |= 32;
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], list5);
                        break;
                    case 6:
                        i4 |= 64;
                        signalMetricsFilterRequest3 = (SignalMetricsFilterRequest) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, SignalMetricsFilterRequest$$serializer.INSTANCE, signalMetricsFilterRequest3);
                        break;
                    case 7:
                        i4 |= 128;
                        tokenMetricsFilterRequest2 = (TokenMetricsFilterRequest) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i3, TokenMetricsFilterRequest$$serializer.INSTANCE, tokenMetricsFilterRequest2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            signalMetricsFilterRequest = signalMetricsFilterRequest3;
            i = i4;
            str = strDecodeStringElement5;
            i2 = iDecodeIntElement2;
            tokenMetricsFilterRequest = tokenMetricsFilterRequest2;
            list2 = list5;
            str2 = strDecodeStringElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SignalOverviewOrActivityListRequest(i, i2, str2, str, list, strDecodeStringElement, list2, signalMetricsFilterRequest, tokenMetricsFilterRequest, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SignalOverviewOrActivityListRequest signalOverviewOrActivityListRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(signalOverviewOrActivityListRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SignalOverviewOrActivityListRequest.OLrzqt(signalOverviewOrActivityListRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

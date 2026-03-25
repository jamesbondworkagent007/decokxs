package com.okinc.business.invest_biz.data.bean.request;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class BonusPopupRequest$$serializer implements GeneratedSerializer<BonusPopupRequest> {
    public static final int $stable;
    public static final BonusPopupRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BonusPopupRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BonusPopupRequest$$serializer bonusPopupRequest$$serializer = new BonusPopupRequest$$serializer();
        INSTANCE = bonusPopupRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.request.BonusPopupRequest", bonusPopupRequest$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("investmentId", false);
        pluginGeneratedSerialDescriptor.addElement("userAddress", false);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement("unclaimedTokenAddress", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = BonusPopupRequest.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, LongSerializer.INSTANCE, kSerializerArr[3]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BonusPopupRequest deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        List list;
        String str2;
        long j;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = BonusPopupRequest.$childSerializers;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            str2 = strDecodeStringElement2;
            i = 15;
            str = strDecodeStringElement3;
            j = jDecodeLongElement;
        } else {
            int i2 = 0;
            boolean z = true;
            long jDecodeLongElement2 = 0;
            List list2 = null;
            String strDecodeStringElement4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], list2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            list = list2;
            str2 = strDecodeStringElement4;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BonusPopupRequest(i, str2, str, j, list, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BonusPopupRequest bonusPopupRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bonusPopupRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BonusPopupRequest.OLrzqt(bonusPopupRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

package com.okinc.business.trade.features.home.ui.meme.data;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class FeeConfig$$serializer implements GeneratedSerializer<FeeConfig> {
    public static final int $stable;
    public static final FeeConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private FeeConfig$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FeeConfig$$serializer feeConfig$$serializer = new FeeConfig$$serializer();
        INSTANCE = feeConfig$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.trade.features.home.ui.meme.data.FeeConfig", feeConfig$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("feeOptions", true);
        pluginGeneratedSerialDescriptor.addElement("limitOrderFeeOptions", true);
        pluginGeneratedSerialDescriptor.addElement("max", true);
        pluginGeneratedSerialDescriptor.addElement("min", true);
        pluginGeneratedSerialDescriptor.addElement("limitOrderMax", true);
        pluginGeneratedSerialDescriptor.addElement("limitOrderMin", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = FeeConfig.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final FeeConfig deserialize(@NotNull Decoder decoder) {
        List list;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        String str;
        List list2;
        String str2;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = FeeConfig.$childSerializers;
        int i2 = 5;
        String strDecodeStringElement3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            list = list4;
            list2 = list3;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            strDecodeStringElement = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            str = strDecodeStringElement4;
            i = 63;
        } else {
            int i3 = 0;
            boolean z = true;
            String strDecodeStringElement7 = null;
            list = null;
            String strDecodeStringElement8 = null;
            strDecodeStringElement = null;
            List list5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], list5);
                        i3 |= 1;
                        i2 = 5;
                        continue;
                    case 1:
                        i3 |= 2;
                        list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], list);
                        break;
                    case 2:
                        i3 |= 4;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        break;
                    case 3:
                        i3 |= 8;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        i3 |= 16;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        i3 |= 32;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            strDecodeStringElement2 = strDecodeStringElement8;
            str = strDecodeStringElement7;
            list2 = list5;
            str2 = strDecodeStringElement3;
            i = i3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FeeConfig(i, list2, list, str, strDecodeStringElement, str2, strDecodeStringElement2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull FeeConfig feeConfig) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(feeConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        FeeConfig.write$Self$OKDex_dex_impl(feeConfig, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

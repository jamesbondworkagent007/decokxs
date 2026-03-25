package com.okinc.business.trade.features.home.ui.autosell.data;

import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class AdvancedAutoSellStrategy$StopLoss$$serializer implements GeneratedSerializer<AdvancedAutoSellStrategy.StopLoss> {
    public static final int $stable;
    public static final AdvancedAutoSellStrategy$StopLoss$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AdvancedAutoSellStrategy$StopLoss$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AdvancedAutoSellStrategy$StopLoss$$serializer advancedAutoSellStrategy$StopLoss$$serializer = new AdvancedAutoSellStrategy$StopLoss$$serializer();
        INSTANCE = advancedAutoSellStrategy$StopLoss$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("stopLoss", advancedAutoSellStrategy$StopLoss$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("priceDecreaseRatio", false);
        pluginGeneratedSerialDescriptor.addElement("sellPortion", false);
        pluginGeneratedSerialDescriptor.addElement("isRemoteConfig", true);
        pluginGeneratedSerialDescriptor.addElement("remoteConfigTitle", true);
        pluginGeneratedSerialDescriptor.addElement("remoteConfigDesc", true);
        pluginGeneratedSerialDescriptor.addElement("remoteConfigId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, IntSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AdvancedAutoSellStrategy.StopLoss deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        int iDecodeIntElement;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            str4 = strDecodeStringElement;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            str3 = strDecodeStringElement3;
            str = strDecodeStringElement4;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            str2 = strDecodeStringElement2;
            i = 63;
        } else {
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            int iDecodeIntElement2 = 0;
            zDecodeBooleanElement = false;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 = i3 | 2;
                        break;
                    case 2:
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i2 = i3 | 4;
                        break;
                    case 3:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 = i3 | 8;
                        break;
                    case 4:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 = i3 | 16;
                        break;
                    case 5:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i2 = i3 | 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
                i3 = i2;
            }
            iDecodeIntElement = iDecodeIntElement2;
            i = i3;
            str = strDecodeStringElement7;
            str2 = strDecodeStringElement8;
            str3 = strDecodeStringElement6;
            str4 = strDecodeStringElement5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AdvancedAutoSellStrategy.StopLoss(i, str4, str2, zDecodeBooleanElement, str3, str, iDecodeIntElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AdvancedAutoSellStrategy.StopLoss stopLoss) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(stopLoss, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AdvancedAutoSellStrategy.StopLoss.OLrzqt(stopLoss, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

package com.okinc.business.market.data.model.smart_money;

import com.okinc.business.market.data.model.common.DexTokenMeta;
import com.okinc.business.market.data.model.common.DexTokenMeta$$serializer;
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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class SignalGemItemData$$serializer implements GeneratedSerializer<SignalGemItemData> {
    public static final int $stable;
    public static final SignalGemItemData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SignalGemItemData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SignalGemItemData$$serializer signalGemItemData$$serializer = new SignalGemItemData$$serializer();
        INSTANCE = signalGemItemData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.smart_money.SignalGemItemData", signalGemItemData$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("tokenInfo", true);
        pluginGeneratedSerialDescriptor.addElement("gemsType", false);
        pluginGeneratedSerialDescriptor.addElement("currentMcap", true);
        pluginGeneratedSerialDescriptor.addElement("firstSignalMcap", true);
        pluginGeneratedSerialDescriptor.addElement("firstSignalTime", true);
        pluginGeneratedSerialDescriptor.addElement("firstSignalRectangleTime", true);
        pluginGeneratedSerialDescriptor.addElement("maxIncreasePercentage", true);
        pluginGeneratedSerialDescriptor.addElement("maxIncreaseMultiplier", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SignalGemItemData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{DexTokenMeta$$serializer.INSTANCE, kSerializerArr[1], stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SignalGemItemData deserialize(@NotNull Decoder decoder) {
        SignalGemType signalGemType;
        String strDecodeStringElement;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        DexTokenMeta dexTokenMeta;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SignalGemItemData.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            DexTokenMeta dexTokenMeta2 = (DexTokenMeta) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, DexTokenMeta$$serializer.INSTANCE, null);
            SignalGemType signalGemType2 = (SignalGemType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            signalGemType = signalGemType2;
            dexTokenMeta = dexTokenMeta2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            str = strDecodeStringElement7;
            str5 = strDecodeStringElement6;
            str2 = strDecodeStringElement4;
            str4 = strDecodeStringElement5;
            str3 = strDecodeStringElement3;
            i = 255;
        } else {
            int i4 = 0;
            boolean z2 = true;
            String strDecodeStringElement8 = null;
            signalGemType = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            DexTokenMeta dexTokenMeta3 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        z2 = false;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 0:
                        z = false;
                        i4 |= 1;
                        dexTokenMeta3 = (DexTokenMeta) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, DexTokenMeta$$serializer.INSTANCE, dexTokenMeta3);
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 1:
                        i4 |= 2;
                        signalGemType = (SignalGemType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], signalGemType);
                        break;
                    case 2:
                        i4 |= 4;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        break;
                    case 3:
                        i4 |= 8;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        i4 |= 16;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        i4 |= 32;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        break;
                    case 6:
                        i4 |= 64;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        break;
                    case 7:
                        i4 |= 128;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            DexTokenMeta dexTokenMeta4 = dexTokenMeta3;
            strDecodeStringElement = strDecodeStringElement9;
            str = strDecodeStringElement10;
            str2 = strDecodeStringElement11;
            str3 = strDecodeStringElement12;
            str4 = strDecodeStringElement2;
            str5 = strDecodeStringElement8;
            i = i4;
            dexTokenMeta = dexTokenMeta4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SignalGemItemData(i, dexTokenMeta, signalGemType, str3, str2, str4, str5, str, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SignalGemItemData signalGemItemData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(signalGemItemData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SignalGemItemData.OLrzqt(signalGemItemData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

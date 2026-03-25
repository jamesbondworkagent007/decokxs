package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class LearnCardItem$$serializer implements GeneratedSerializer<LearnCardItem> {
    public static final int $stable;
    public static final LearnCardItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private LearnCardItem$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        LearnCardItem$$serializer learnCardItem$$serializer = new LearnCardItem$$serializer();
        INSTANCE = learnCardItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.LearnCardItem", learnCardItem$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("cardTitle", true);
        pluginGeneratedSerialDescriptor.addElement("copyWriting", true);
        pluginGeneratedSerialDescriptor.addElement("backgroundImage", true);
        pluginGeneratedSerialDescriptor.addElement("popUpBackgroundImage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BackgroundImage$$serializer backgroundImage$$serializer = BackgroundImage$$serializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, backgroundImage$$serializer, backgroundImage$$serializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final LearnCardItem deserialize(@NotNull Decoder decoder) {
        int i;
        BackgroundImage backgroundImage;
        String str;
        String str2;
        BackgroundImage backgroundImage2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        BackgroundImage backgroundImage3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            BackgroundImage$$serializer backgroundImage$$serializer = BackgroundImage$$serializer.INSTANCE;
            BackgroundImage backgroundImage4 = (BackgroundImage) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, backgroundImage$$serializer, null);
            str2 = strDecodeStringElement;
            backgroundImage2 = (BackgroundImage) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, backgroundImage$$serializer, null);
            backgroundImage = backgroundImage4;
            str = strDecodeStringElement2;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            BackgroundImage backgroundImage5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    backgroundImage3 = (BackgroundImage) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, BackgroundImage$$serializer.INSTANCE, backgroundImage3);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    backgroundImage5 = (BackgroundImage) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, BackgroundImage$$serializer.INSTANCE, backgroundImage5);
                    i2 |= 8;
                }
            }
            i = i2;
            backgroundImage = backgroundImage3;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            backgroundImage2 = backgroundImage5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LearnCardItem(i, str2, str, backgroundImage, backgroundImage2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull LearnCardItem learnCardItem) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(learnCardItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LearnCardItem.KWHzl(learnCardItem, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

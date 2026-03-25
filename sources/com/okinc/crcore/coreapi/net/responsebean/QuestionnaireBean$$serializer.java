package com.okinc.crcore.coreapi.net.responsebean;

import java.util.ArrayList;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class QuestionnaireBean$$serializer implements GeneratedSerializer<QuestionnaireBean> {
    public static final int $stable;
    public static final QuestionnaireBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private QuestionnaireBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        QuestionnaireBean$$serializer questionnaireBean$$serializer = new QuestionnaireBean$$serializer();
        INSTANCE = questionnaireBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.QuestionnaireBean", questionnaireBean$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("question", true);
        pluginGeneratedSerialDescriptor.addElement("answers", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{QuestionBean$$serializer.INSTANCE, QuestionnaireBean.$childSerializers[1]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final QuestionnaireBean deserialize(@NotNull Decoder decoder) {
        ArrayList arrayList;
        QuestionBean questionBean;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = QuestionnaireBean.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            questionBean = (QuestionBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, QuestionBean$$serializer.INSTANCE, null);
            arrayList = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            i = 3;
        } else {
            ArrayList arrayList2 = null;
            QuestionBean questionBean2 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    questionBean2 = (QuestionBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, QuestionBean$$serializer.INSTANCE, questionBean2);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    arrayList2 = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], arrayList2);
                    i2 |= 2;
                }
            }
            arrayList = arrayList2;
            questionBean = questionBean2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new QuestionnaireBean(i, questionBean, arrayList, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull QuestionnaireBean questionnaireBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(questionnaireBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        QuestionnaireBean.write$Self$OKCRCore_cr_core(questionnaireBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

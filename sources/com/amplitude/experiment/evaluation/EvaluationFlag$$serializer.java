package com.amplitude.experiment.evaluation;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class EvaluationFlag$$serializer implements GeneratedSerializer<EvaluationFlag> {
    public static final EvaluationFlag$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EvaluationFlag$$serializer evaluationFlag$$serializer = new EvaluationFlag$$serializer();
        INSTANCE = evaluationFlag$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.amplitude.experiment.evaluation.EvaluationFlag", evaluationFlag$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement(JwtUtilsKt.DID_METHOD_KEY, false);
        pluginGeneratedSerialDescriptor.addElement("variants", false);
        pluginGeneratedSerialDescriptor.addElement("segments", false);
        pluginGeneratedSerialDescriptor.addElement("dependencies", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.TAG_METADATA, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EvaluationFlag$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = EvaluationFlag.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, kSerializerArr[1], kSerializerArr[2], BuiltinSerializersKt.getNullable(kSerializerArr[3]), BuiltinSerializersKt.getNullable(kSerializerArr[4])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public EvaluationFlag deserialize(@NotNull Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        int i;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeSerializableElement;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = EvaluationFlag.$childSerializers;
        Object objDecodeSerializableElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
            Object objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            Object objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            objDecodeSerializableElement2 = objDecodeSerializableElement3;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement3;
            i = 31;
            str = strDecodeStringElement;
        } else {
            int i2 = 0;
            boolean z = true;
            Object objDecodeNullableSerializableElement4 = null;
            objDecodeNullableSerializableElement = null;
            Object objDecodeSerializableElement4 = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    i2 |= 2;
                    objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], objDecodeSerializableElement2);
                } else if (iDecodeElementIndex == 2) {
                    i2 |= 4;
                    objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], objDecodeSerializableElement4);
                } else if (iDecodeElementIndex == 3) {
                    i2 |= 8;
                    objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, kSerializerArr[3], objDecodeNullableSerializableElement);
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    i2 |= 16;
                    objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, kSerializerArr[4], objDecodeNullableSerializableElement4);
                }
            }
            i = i2;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement4;
            objDecodeSerializableElement = objDecodeSerializableElement4;
            str = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new EvaluationFlag(i, str, (Map) objDecodeSerializableElement2, (List) objDecodeSerializableElement, (Set) objDecodeNullableSerializableElement, (Map) objDecodeNullableSerializableElement2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull EvaluationFlag evaluationFlag) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(evaluationFlag, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        EvaluationFlag.AEQbTJ(evaluationFlag, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}

package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.statemachine.codegen.data.SignInMethod;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SignInMethod$ApiBased$$serializer implements GeneratedSerializer<SignInMethod.ApiBased> {
    public static final SignInMethod$ApiBased$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SignInMethod$ApiBased$$serializer signInMethod$ApiBased$$serializer = new SignInMethod$ApiBased$$serializer();
        INSTANCE = signInMethod$ApiBased$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("SignInMethod.ApiBased", signInMethod$ApiBased$$serializer, 1);
        pluginGeneratedSerialDescriptor.addElement("authType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SignInMethod$ApiBased$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{SignInMethod.ApiBased.$childSerializers[0]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public SignInMethod.ApiBased deserialize(@NotNull Decoder decoder) {
        SignInMethod.ApiBased.AuthType authType;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SignInMethod.ApiBased.$childSerializers;
        int i = 1;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            authType = (SignInMethod.ApiBased.AuthType) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], null);
        } else {
            SignInMethod.ApiBased.AuthType authType2 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    authType2 = (SignInMethod.ApiBased.AuthType) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], authType2);
                    i2 = 1;
                }
            }
            authType = authType2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new SignInMethod.ApiBased(i, authType, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull SignInMethod.ApiBased apiBased) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(apiBased, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        SignInMethod.ApiBased.write$Self(apiBased, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}

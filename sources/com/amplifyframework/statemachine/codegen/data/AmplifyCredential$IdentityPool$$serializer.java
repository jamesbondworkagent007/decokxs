package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
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

/* JADX INFO: loaded from: classes2.dex */
public final class AmplifyCredential$IdentityPool$$serializer implements GeneratedSerializer<AmplifyCredential.IdentityPool> {
    public static final AmplifyCredential$IdentityPool$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AmplifyCredential$IdentityPool$$serializer amplifyCredential$IdentityPool$$serializer = new AmplifyCredential$IdentityPool$$serializer();
        INSTANCE = amplifyCredential$IdentityPool$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("identityPool", amplifyCredential$IdentityPool$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("identityId", false);
        pluginGeneratedSerialDescriptor.addElement("credentials", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AmplifyCredential$IdentityPool$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, AWSCredentials$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public AmplifyCredential.IdentityPool deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        AWSCredentials aWSCredentials;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
            aWSCredentials = (AWSCredentials) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, AWSCredentials$$serializer.INSTANCE, null);
            i = 3;
        } else {
            strDecodeStringElement = null;
            AWSCredentials aWSCredentials2 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    aWSCredentials2 = (AWSCredentials) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, AWSCredentials$$serializer.INSTANCE, aWSCredentials2);
                    i2 |= 2;
                }
            }
            aWSCredentials = aWSCredentials2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new AmplifyCredential.IdentityPool(i, strDecodeStringElement, aWSCredentials, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull AmplifyCredential.IdentityPool identityPool) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(identityPool, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        AmplifyCredential.IdentityPool.write$Self(identityPool, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}

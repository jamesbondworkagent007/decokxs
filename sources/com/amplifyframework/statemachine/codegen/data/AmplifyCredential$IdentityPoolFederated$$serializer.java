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
public final class AmplifyCredential$IdentityPoolFederated$$serializer implements GeneratedSerializer<AmplifyCredential.IdentityPoolFederated> {
    public static final AmplifyCredential$IdentityPoolFederated$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AmplifyCredential$IdentityPoolFederated$$serializer amplifyCredential$IdentityPoolFederated$$serializer = new AmplifyCredential$IdentityPoolFederated$$serializer();
        INSTANCE = amplifyCredential$IdentityPoolFederated$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("identityPoolFederated", amplifyCredential$IdentityPoolFederated$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("federatedToken", false);
        pluginGeneratedSerialDescriptor.addElement("identityId", false);
        pluginGeneratedSerialDescriptor.addElement("credentials", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AmplifyCredential$IdentityPoolFederated$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{FederatedToken$$serializer.INSTANCE, StringSerializer.INSTANCE, AWSCredentials$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public AmplifyCredential.IdentityPoolFederated deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        FederatedToken federatedToken;
        AWSCredentials aWSCredentials;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            FederatedToken federatedToken2 = (FederatedToken) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, FederatedToken$$serializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
            federatedToken = federatedToken2;
            aWSCredentials = (AWSCredentials) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, AWSCredentials$$serializer.INSTANCE, null);
            str = strDecodeStringElement2;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            FederatedToken federatedToken3 = null;
            AWSCredentials aWSCredentials2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    federatedToken3 = (FederatedToken) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, FederatedToken$$serializer.INSTANCE, federatedToken3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    aWSCredentials2 = (AWSCredentials) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, AWSCredentials$$serializer.INSTANCE, aWSCredentials2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            federatedToken = federatedToken3;
            aWSCredentials = aWSCredentials2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new AmplifyCredential.IdentityPoolFederated(i, federatedToken, str, aWSCredentials, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull AmplifyCredential.IdentityPoolFederated identityPoolFederated) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(identityPoolFederated, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        AmplifyCredential.IdentityPoolFederated.write$Self(identityPoolFederated, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}

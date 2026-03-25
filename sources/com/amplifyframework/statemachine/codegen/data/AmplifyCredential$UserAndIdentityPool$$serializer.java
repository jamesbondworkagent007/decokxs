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
public final class AmplifyCredential$UserAndIdentityPool$$serializer implements GeneratedSerializer<AmplifyCredential.UserAndIdentityPool> {
    public static final AmplifyCredential$UserAndIdentityPool$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AmplifyCredential$UserAndIdentityPool$$serializer amplifyCredential$UserAndIdentityPool$$serializer = new AmplifyCredential$UserAndIdentityPool$$serializer();
        INSTANCE = amplifyCredential$UserAndIdentityPool$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("userAndIdentityPool", amplifyCredential$UserAndIdentityPool$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("signedInData", false);
        pluginGeneratedSerialDescriptor.addElement("identityId", false);
        pluginGeneratedSerialDescriptor.addElement("credentials", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AmplifyCredential$UserAndIdentityPool$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{SignedInData$$serializer.INSTANCE, StringSerializer.INSTANCE, AWSCredentials$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public AmplifyCredential.UserAndIdentityPool deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        SignedInData signedInData;
        AWSCredentials aWSCredentials;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            SignedInData signedInData2 = (SignedInData) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, SignedInData$$serializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
            signedInData = signedInData2;
            aWSCredentials = (AWSCredentials) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, AWSCredentials$$serializer.INSTANCE, null);
            str = strDecodeStringElement2;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            SignedInData signedInData3 = null;
            AWSCredentials aWSCredentials2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    signedInData3 = (SignedInData) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, SignedInData$$serializer.INSTANCE, signedInData3);
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
            signedInData = signedInData3;
            aWSCredentials = aWSCredentials2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new AmplifyCredential.UserAndIdentityPool(i, signedInData, str, aWSCredentials, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull AmplifyCredential.UserAndIdentityPool userAndIdentityPool) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(userAndIdentityPool, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        AmplifyCredential.UserAndIdentityPool.write$Self(userAndIdentityPool, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}

package com.amplifyframework.statemachine.codegen.data;

import androidx.autofill.HintConstants;
import com.amplifyframework.statemachine.codegen.data.serializer.DateSerializer;
import java.util.Date;
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
public final class SignedInData$$serializer implements GeneratedSerializer<SignedInData> {
    public static final SignedInData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SignedInData$$serializer signedInData$$serializer = new SignedInData$$serializer();
        INSTANCE = signedInData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.amplifyframework.statemachine.codegen.data.SignedInData", signedInData$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("userId", false);
        pluginGeneratedSerialDescriptor.addElement(HintConstants.AUTOFILL_HINT_USERNAME, false);
        pluginGeneratedSerialDescriptor.addElement("signedInDate", false);
        pluginGeneratedSerialDescriptor.addElement("signInMethod", false);
        pluginGeneratedSerialDescriptor.addElement("cognitoUserPoolTokens", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SignedInData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SignedInData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, DateSerializer.INSTANCE, kSerializerArr[3], CognitoUserPoolTokens$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public SignedInData deserialize(@NotNull Decoder decoder) {
        int i;
        SignInMethod signInMethod;
        CognitoUserPoolTokens cognitoUserPoolTokens;
        Date date;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SignedInData.$childSerializers;
        SignInMethod signInMethod2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
            Date date2 = (Date) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, DateSerializer.INSTANCE, null);
            signInMethod = (SignInMethod) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            str2 = strDecodeStringElement;
            cognitoUserPoolTokens = (CognitoUserPoolTokens) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, CognitoUserPoolTokens$$serializer.INSTANCE, null);
            date = date2;
            str = strDecodeStringElement2;
            i = 31;
        } else {
            int i2 = 0;
            boolean z = true;
            CognitoUserPoolTokens cognitoUserPoolTokens2 = null;
            Date date3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    i2 |= 2;
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
                } else if (iDecodeElementIndex == 2) {
                    i2 |= 4;
                    date3 = (Date) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, DateSerializer.INSTANCE, date3);
                } else if (iDecodeElementIndex == 3) {
                    i2 |= 8;
                    signInMethod2 = (SignInMethod) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], signInMethod2);
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    i2 |= 16;
                    cognitoUserPoolTokens2 = (CognitoUserPoolTokens) compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, CognitoUserPoolTokens$$serializer.INSTANCE, cognitoUserPoolTokens2);
                }
            }
            i = i2;
            signInMethod = signInMethod2;
            cognitoUserPoolTokens = cognitoUserPoolTokens2;
            date = date3;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new SignedInData(i, str2, str, date, signInMethod, cognitoUserPoolTokens, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull SignedInData signedInData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(signedInData, "");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        SignedInData.write$Self(signedInData, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}

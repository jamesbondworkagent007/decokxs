package com.okinc.crcore.coreapi.net.responsebean;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ProfileRiskAssessmentBean$$serializer implements GeneratedSerializer<ProfileRiskAssessmentBean> {
    public static final int $stable;
    public static final ProfileRiskAssessmentBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ProfileRiskAssessmentBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ProfileRiskAssessmentBean$$serializer profileRiskAssessmentBean$$serializer = new ProfileRiskAssessmentBean$$serializer();
        INSTANCE = profileRiskAssessmentBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.ProfileRiskAssessmentBean", profileRiskAssessmentBean$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("isApplicable", false);
        pluginGeneratedSerialDescriptor.addElement("firstTime", false);
        pluginGeneratedSerialDescriptor.addElement("userRiskToleranceLevel", false);
        pluginGeneratedSerialDescriptor.addElement("productId", false);
        pluginGeneratedSerialDescriptor.addElement("productType", false);
        pluginGeneratedSerialDescriptor.addElement("isRisky", false);
        pluginGeneratedSerialDescriptor.addElement("coolingRemainSeconds", false);
        pluginGeneratedSerialDescriptor.addElement("failureCount", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, booleanSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, intSerializer, intSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ProfileRiskAssessmentBean deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        int i;
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        String str3;
        boolean z4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            z = zDecodeBooleanElement;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            i = iDecodeIntElement2;
            z2 = zDecodeBooleanElement3;
            str = strDecodeStringElement2;
            str3 = strDecodeStringElement3;
            str2 = strDecodeStringElement;
            z3 = zDecodeBooleanElement2;
            i2 = 255;
        } else {
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            boolean z5 = true;
            boolean zDecodeBooleanElement4 = false;
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        z5 = z4;
                        break;
                    case 0:
                        i3 |= 1;
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        break;
                    case 1:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        z4 = z5;
                        z5 = z4;
                        break;
                    case 3:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        z4 = z5;
                        z5 = z4;
                        break;
                    case 4:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                        z4 = z5;
                        z5 = z4;
                        break;
                    case 5:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i3 |= 32;
                        z4 = z5;
                        z5 = z4;
                        break;
                    case 6:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i3 |= 64;
                        z4 = z5;
                        z5 = z4;
                        break;
                    case 7:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i3 |= 128;
                        z4 = z5;
                        z5 = z4;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            iDecodeIntElement = iDecodeIntElement3;
            i = iDecodeIntElement4;
            z = zDecodeBooleanElement4;
            i2 = i3;
            boolean z6 = zDecodeBooleanElement6;
            z2 = zDecodeBooleanElement5;
            z3 = z6;
            String str4 = strDecodeStringElement5;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement6;
            str3 = str4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ProfileRiskAssessmentBean(i2, z, z3, str2, str, str3, z2, i, iDecodeIntElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ProfileRiskAssessmentBean profileRiskAssessmentBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(profileRiskAssessmentBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ProfileRiskAssessmentBean.write$Self$OKCRCore_cr_core(profileRiskAssessmentBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

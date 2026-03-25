package com.okinc.business.defi.api.bean;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class ActivateTeeGuideModel$$serializer implements GeneratedSerializer<ActivateTeeGuideModel> {
    public static final int $stable;
    public static final ActivateTeeGuideModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ActivateTeeGuideModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ActivateTeeGuideModel$$serializer activateTeeGuideModel$$serializer = new ActivateTeeGuideModel$$serializer();
        INSTANCE = activateTeeGuideModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.api.bean.ActivateTeeGuideModel", activateTeeGuideModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("accountId", false);
        pluginGeneratedSerialDescriptor.addElement("showSelectWalletEntry", true);
        pluginGeneratedSerialDescriptor.addElement("isNeedToCreateNewAccount", true);
        pluginGeneratedSerialDescriptor.addElement("rootWalletId", true);
        pluginGeneratedSerialDescriptor.addElement("addressIndex", true);
        pluginGeneratedSerialDescriptor.addElement("from", true);
        pluginGeneratedSerialDescriptor.addElement("bcakTo", true);
        pluginGeneratedSerialDescriptor.addElement("pathSource", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, booleanSerializer, booleanSerializer, stringSerializer, intSerializer, intSerializer, intSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ActivateTeeGuideModel deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        String str;
        int i2;
        int i3;
        boolean z;
        String str2;
        boolean z2;
        int i4;
        boolean z3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i5 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            str = strDecodeStringElement2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            i = iDecodeIntElement3;
            i3 = iDecodeIntElement2;
            str2 = strDecodeStringElement3;
            i4 = iDecodeIntElement;
            z2 = zDecodeBooleanElement2;
            z = zDecodeBooleanElement;
            i2 = 255;
        } else {
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            boolean z4 = true;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        z4 = z3;
                        break;
                    case 0:
                        i5 |= 1;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        break;
                    case 1:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i5 |= 2;
                        break;
                    case 2:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i5 |= 4;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 3:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i5 |= 8;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 4:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i5 |= 16;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 5:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i5 |= 32;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 6:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i5 |= 64;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 7:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i5 |= 128;
                        z3 = z4;
                        z4 = z3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            strDecodeStringElement = strDecodeStringElement5;
            i = iDecodeIntElement4;
            str = strDecodeStringElement4;
            i2 = i5;
            boolean z5 = zDecodeBooleanElement4;
            i3 = iDecodeIntElement5;
            z = z5;
            int i6 = iDecodeIntElement6;
            str2 = strDecodeStringElement6;
            z2 = zDecodeBooleanElement3;
            i4 = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ActivateTeeGuideModel(i2, str, z, z2, str2, i4, i3, i, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ActivateTeeGuideModel activateTeeGuideModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(activateTeeGuideModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ActivateTeeGuideModel.write$Self$OKWallet_wallet_api(activateTeeGuideModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

package com.okinc.affiliate.bean;

import java.util.List;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class BindPayoutWalletInput$$serializer implements GeneratedSerializer<BindPayoutWalletInput> {
    public static final int $stable;
    public static final BindPayoutWalletInput$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BindPayoutWalletInput$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BindPayoutWalletInput$$serializer bindPayoutWalletInput$$serializer = new BindPayoutWalletInput$$serializer();
        INSTANCE = bindPayoutWalletInput$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.affiliate.bean.BindPayoutWalletInput", bindPayoutWalletInput$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("walletAccounts", false);
        pluginGeneratedSerialDescriptor.addElement("showLanding", false);
        pluginGeneratedSerialDescriptor.addElement("needEmptyPage", true);
        pluginGeneratedSerialDescriptor.addElement("showWalletList", true);
        pluginGeneratedSerialDescriptor.addElement("enterFrom", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = BindPayoutWalletInput.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{kSerializerArr[0], booleanSerializer, booleanSerializer, booleanSerializer, kSerializerArr[4]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BindPayoutWalletInput deserialize(@NotNull Decoder decoder) {
        boolean z;
        int i;
        SetPayoutWalletFromPageEnum setPayoutWalletFromPageEnum;
        List list;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = BindPayoutWalletInput.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            setPayoutWalletFromPageEnum = (SetPayoutWalletFromPageEnum) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            list = list2;
            z = zDecodeBooleanElement3;
            i = 31;
            z2 = zDecodeBooleanElement2;
            z3 = zDecodeBooleanElement;
        } else {
            SetPayoutWalletFromPageEnum setPayoutWalletFromPageEnum2 = null;
            List list3 = null;
            boolean z4 = true;
            boolean zDecodeBooleanElement4 = false;
            int i2 = 0;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], list3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    i2 |= 16;
                    setPayoutWalletFromPageEnum2 = (SetPayoutWalletFromPageEnum) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], setPayoutWalletFromPageEnum2);
                }
            }
            z = zDecodeBooleanElement4;
            i = i2;
            setPayoutWalletFromPageEnum = setPayoutWalletFromPageEnum2;
            list = list3;
            z2 = zDecodeBooleanElement5;
            z3 = zDecodeBooleanElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BindPayoutWalletInput(i, list, z3, z2, z, setPayoutWalletFromPageEnum, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BindPayoutWalletInput bindPayoutWalletInput) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bindPayoutWalletInput, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BindPayoutWalletInput.write$Self$OKAffiliate_affiliate_api(bindPayoutWalletInput, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

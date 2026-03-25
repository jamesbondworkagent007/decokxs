package com.okinc.assets.backend.api.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class ChangeDepositAddressBean$$serializer implements GeneratedSerializer<ChangeDepositAddressBean> {
    public static final int $stable;
    public static final ChangeDepositAddressBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ChangeDepositAddressBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ChangeDepositAddressBean$$serializer changeDepositAddressBean$$serializer = new ChangeDepositAddressBean$$serializer();
        INSTANCE = changeDepositAddressBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.assets.backend.api.model.ChangeDepositAddressBean", changeDepositAddressBean$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("currencyId", false);
        pluginGeneratedSerialDescriptor.addElement("subCurrencyId", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement(TypedValues.AttributesType.S_TARGET, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, intSerializer, intSerializer, intSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ChangeDepositAddressBean deserialize(@NotNull Decoder decoder) {
        int i;
        int iDecodeIntElement;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            i = iDecodeIntElement2;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            i2 = iDecodeIntElement4;
            i3 = iDecodeIntElement3;
            i4 = 15;
        } else {
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            int iDecodeIntElement7 = 0;
            int iDecodeIntElement8 = 0;
            int i5 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                    i5 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                    i5 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i5 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                    i5 |= 8;
                }
            }
            i = iDecodeIntElement5;
            iDecodeIntElement = iDecodeIntElement6;
            i2 = iDecodeIntElement7;
            i3 = iDecodeIntElement8;
            i4 = i5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ChangeDepositAddressBean(i4, i, i3, i2, iDecodeIntElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ChangeDepositAddressBean changeDepositAddressBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(changeDepositAddressBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ChangeDepositAddressBean.write$Self$OKAssets_assets_pro_api(changeDepositAddressBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

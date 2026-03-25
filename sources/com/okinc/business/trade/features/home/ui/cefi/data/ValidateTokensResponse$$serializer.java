package com.okinc.business.trade.features.home.ui.cefi.data;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean$$serializer;
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

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class ValidateTokensResponse$$serializer implements GeneratedSerializer<ValidateTokensResponse> {
    public static final int $stable;
    public static final ValidateTokensResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ValidateTokensResponse$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ValidateTokensResponse$$serializer validateTokensResponse$$serializer = new ValidateTokensResponse$$serializer();
        INSTANCE = validateTokensResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensResponse", validateTokensResponse$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("quoteTokenInfo", false);
        pluginGeneratedSerialDescriptor.addElement("baseTokenInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
        return new KSerializer[]{dexMultiTokenInfoBean$$serializer, dexMultiTokenInfoBean$$serializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ValidateTokensResponse deserialize(@NotNull Decoder decoder) {
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
            dexMultiTokenInfoBean2 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, dexMultiTokenInfoBean$$serializer, null);
            dexMultiTokenInfoBean = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, dexMultiTokenInfoBean$$serializer, null);
            i = 3;
        } else {
            dexMultiTokenInfoBean = null;
            DexMultiTokenInfoBean dexMultiTokenInfoBean3 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    dexMultiTokenInfoBean3 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean3);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    dexMultiTokenInfoBean = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean);
                    i2 |= 2;
                }
            }
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean3;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ValidateTokensResponse(i, dexMultiTokenInfoBean2, dexMultiTokenInfoBean, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ValidateTokensResponse validateTokensResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(validateTokensResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ValidateTokensResponse.write$Self$OKDex_dex_impl(validateTokensResponse, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

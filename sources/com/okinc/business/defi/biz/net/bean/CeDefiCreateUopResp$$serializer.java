package com.okinc.business.defi.biz.net.bean;

import com.okinc.business.defi.biz.net.bean.CeDefiCreateUopResp;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class CeDefiCreateUopResp$$serializer implements GeneratedSerializer<CeDefiCreateUopResp> {
    public static final int $stable;
    public static final CeDefiCreateUopResp$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CeDefiCreateUopResp$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CeDefiCreateUopResp$$serializer ceDefiCreateUopResp$$serializer = new CeDefiCreateUopResp$$serializer();
        INSTANCE = ceDefiCreateUopResp$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.CeDefiCreateUopResp", ceDefiCreateUopResp$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("uopHash", false);
        pluginGeneratedSerialDescriptor.addElement("signType", false);
        pluginGeneratedSerialDescriptor.addElement("serverOption", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, IntSerializer.INSTANCE, CeDefiCreateUopResp$CeDefiCreateUopRespServerOption$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CeDefiCreateUopResp deserialize(@NotNull Decoder decoder) {
        String str;
        CeDefiCreateUopResp.CeDefiCreateUopRespServerOption ceDefiCreateUopRespServerOption;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        CeDefiCreateUopResp.CeDefiCreateUopRespServerOption ceDefiCreateUopRespServerOption2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            str = strDecodeStringElement;
            ceDefiCreateUopRespServerOption = (CeDefiCreateUopResp.CeDefiCreateUopRespServerOption) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, CeDefiCreateUopResp$CeDefiCreateUopRespServerOption$$serializer.INSTANCE, null);
            i = 7;
            i2 = iDecodeIntElement;
        } else {
            String strDecodeStringElement2 = null;
            int i3 = 0;
            int iDecodeIntElement2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i3 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                    i3 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    ceDefiCreateUopRespServerOption2 = (CeDefiCreateUopResp.CeDefiCreateUopRespServerOption) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, CeDefiCreateUopResp$CeDefiCreateUopRespServerOption$$serializer.INSTANCE, ceDefiCreateUopRespServerOption2);
                    i3 |= 4;
                }
            }
            str = strDecodeStringElement2;
            ceDefiCreateUopRespServerOption = ceDefiCreateUopRespServerOption2;
            i = i3;
            i2 = iDecodeIntElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CeDefiCreateUopResp(i, str, i2, ceDefiCreateUopRespServerOption, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CeDefiCreateUopResp ceDefiCreateUopResp) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(ceDefiCreateUopResp, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CeDefiCreateUopResp.write$Self$OKWallet_wallet_impl(ceDefiCreateUopResp, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

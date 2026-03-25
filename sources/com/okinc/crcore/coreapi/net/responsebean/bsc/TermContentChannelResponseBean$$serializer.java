package com.okinc.crcore.coreapi.net.responsebean.bsc;

import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class TermContentChannelResponseBean$$serializer implements GeneratedSerializer<TermContentChannelResponseBean> {
    public static final int $stable;
    public static final TermContentChannelResponseBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TermContentChannelResponseBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TermContentChannelResponseBean$$serializer termContentChannelResponseBean$$serializer = new TermContentChannelResponseBean$$serializer();
        INSTANCE = termContentChannelResponseBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.bsc.TermContentChannelResponseBean", termContentChannelResponseBean$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.MODE, true);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(TermsURLContentDataResponseBean$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TermContentChannelResponseBean deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        TermsURLContentDataResponseBean termsURLContentDataResponseBean;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            termsURLContentDataResponseBean = (TermsURLContentDataResponseBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, TermsURLContentDataResponseBean$$serializer.INSTANCE, null);
            i = 3;
        } else {
            TermsURLContentDataResponseBean termsURLContentDataResponseBean2 = null;
            iDecodeIntElement = 0;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    termsURLContentDataResponseBean2 = (TermsURLContentDataResponseBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, TermsURLContentDataResponseBean$$serializer.INSTANCE, termsURLContentDataResponseBean2);
                    i2 |= 2;
                }
            }
            termsURLContentDataResponseBean = termsURLContentDataResponseBean2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TermContentChannelResponseBean(i, iDecodeIntElement, termsURLContentDataResponseBean, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TermContentChannelResponseBean termContentChannelResponseBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(termContentChannelResponseBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TermContentChannelResponseBean.write$Self$OKCRCore_cr_core(termContentChannelResponseBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

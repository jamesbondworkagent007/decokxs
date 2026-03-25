package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class CtaLink$$serializer implements GeneratedSerializer<CtaLink> {
    public static final int $stable;
    public static final CtaLink$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CtaLink$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CtaLink$$serializer ctaLink$$serializer = new CtaLink$$serializer();
        INSTANCE = ctaLink$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.CtaLink", ctaLink$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("cta", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.TAG_STYLE, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(CTAButtonAppModel$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(LinkTextStyle$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CtaLink deserialize(@NotNull Decoder decoder) {
        CTAButtonAppModel cTAButtonAppModel;
        LinkTextStyle linkTextStyle;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            cTAButtonAppModel = (CTAButtonAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, CTAButtonAppModel$$serializer.INSTANCE, null);
            linkTextStyle = (LinkTextStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LinkTextStyle$$serializer.INSTANCE, null);
            i = 3;
        } else {
            cTAButtonAppModel = null;
            LinkTextStyle linkTextStyle2 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    cTAButtonAppModel = (CTAButtonAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, CTAButtonAppModel$$serializer.INSTANCE, cTAButtonAppModel);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    linkTextStyle2 = (LinkTextStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LinkTextStyle$$serializer.INSTANCE, linkTextStyle2);
                    i2 |= 2;
                }
            }
            linkTextStyle = linkTextStyle2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CtaLink(i, cTAButtonAppModel, linkTextStyle, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CtaLink ctaLink) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(ctaLink, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CtaLink.write$Self$OKCompliance_ok_compliance_impl(ctaLink, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

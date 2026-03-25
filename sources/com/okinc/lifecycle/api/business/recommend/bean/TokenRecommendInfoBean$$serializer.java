package com.okinc.lifecycle.api.business.recommend.bean;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class TokenRecommendInfoBean$$serializer implements GeneratedSerializer<TokenRecommendInfoBean> {
    public static final int $stable;
    public static final TokenRecommendInfoBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TokenRecommendInfoBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TokenRecommendInfoBean$$serializer tokenRecommendInfoBean$$serializer = new TokenRecommendInfoBean$$serializer();
        INSTANCE = tokenRecommendInfoBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendInfoBean", tokenRecommendInfoBean$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("componentType", false);
        pluginGeneratedSerialDescriptor.addElement("tokenPair", false);
        pluginGeneratedSerialDescriptor.addElement("token", false);
        pluginGeneratedSerialDescriptor.addElement("trackBean", true);
        pluginGeneratedSerialDescriptor.addElement("titleAlignType", true);
        pluginGeneratedSerialDescriptor.addElement("contentStyleType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = TokenRecommendInfoBean.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{kSerializerArr[0], stringSerializer, stringSerializer, TokenRecommendTrackBean$$serializer.INSTANCE, kSerializerArr[4], kSerializerArr[5]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TokenRecommendInfoBean deserialize(@NotNull Decoder decoder) {
        TokenRecommendContentStyle tokenRecommendContentStyle;
        TokenRecommendTitleAlign tokenRecommendTitleAlign;
        TokenRecommendComponent tokenRecommendComponent;
        int i;
        TokenRecommendTrackBean tokenRecommendTrackBean;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TokenRecommendInfoBean.$childSerializers;
        int i2 = 3;
        TokenRecommendTrackBean tokenRecommendTrackBean2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            TokenRecommendComponent tokenRecommendComponent2 = (TokenRecommendComponent) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            TokenRecommendTrackBean tokenRecommendTrackBean3 = (TokenRecommendTrackBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, TokenRecommendTrackBean$$serializer.INSTANCE, null);
            TokenRecommendTitleAlign tokenRecommendTitleAlign2 = (TokenRecommendTitleAlign) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            tokenRecommendContentStyle = (TokenRecommendContentStyle) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            tokenRecommendComponent = tokenRecommendComponent2;
            tokenRecommendTrackBean = tokenRecommendTrackBean3;
            str = strDecodeStringElement2;
            i = 63;
            str2 = strDecodeStringElement;
            tokenRecommendTitleAlign = tokenRecommendTitleAlign2;
        } else {
            boolean z = true;
            int i3 = 0;
            TokenRecommendContentStyle tokenRecommendContentStyle2 = null;
            TokenRecommendTitleAlign tokenRecommendTitleAlign3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            TokenRecommendComponent tokenRecommendComponent3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        tokenRecommendComponent3 = (TokenRecommendComponent) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], tokenRecommendComponent3);
                        i3 |= 1;
                        i2 = 3;
                        continue;
                    case 1:
                        i3 |= 2;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        break;
                    case 2:
                        i3 |= 4;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        break;
                    case 3:
                        i3 |= 8;
                        tokenRecommendTrackBean2 = (TokenRecommendTrackBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i2, TokenRecommendTrackBean$$serializer.INSTANCE, tokenRecommendTrackBean2);
                        break;
                    case 4:
                        i3 |= 16;
                        tokenRecommendTitleAlign3 = (TokenRecommendTitleAlign) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], tokenRecommendTitleAlign3);
                        break;
                    case 5:
                        i3 |= 32;
                        tokenRecommendContentStyle2 = (TokenRecommendContentStyle) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], tokenRecommendContentStyle2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            tokenRecommendContentStyle = tokenRecommendContentStyle2;
            tokenRecommendTitleAlign = tokenRecommendTitleAlign3;
            tokenRecommendComponent = tokenRecommendComponent3;
            i = i3;
            tokenRecommendTrackBean = tokenRecommendTrackBean2;
            String str3 = strDecodeStringElement4;
            str = strDecodeStringElement3;
            str2 = str3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TokenRecommendInfoBean(i, tokenRecommendComponent, str2, str, tokenRecommendTrackBean, tokenRecommendTitleAlign, tokenRecommendContentStyle, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TokenRecommendInfoBean tokenRecommendInfoBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tokenRecommendInfoBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TokenRecommendInfoBean.write$Self$OKLifecycle_lifecycle_api(tokenRecommendInfoBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

package com.okinc.business.invest_biz.data.bean;

import com.okinc.business.invest_biz.data.contants.ProductType;
import com.okinc.business.invest_biz.data.contants.ProtocolType;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class TokenInvestDetail$$serializer implements GeneratedSerializer<TokenInvestDetail> {
    public static final int $stable;
    public static final TokenInvestDetail$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TokenInvestDetail$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TokenInvestDetail$$serializer tokenInvestDetail$$serializer = new TokenInvestDetail$$serializer();
        INSTANCE = tokenInvestDetail$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.TokenInvestDetail", tokenInvestDetail$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("investmentId", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("investType", true);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.MODE, true);
        pluginGeneratedSerialDescriptor.addElement("detailPagePromptInformation", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = TokenInvestDetail.$childSerializers;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{longSerializer, longSerializer, kSerializerArr[2], kSerializerArr[3], BuiltinSerializersKt.getNullable(InvestDetailPagePromptInformation$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TokenInvestDetail deserialize(@NotNull Decoder decoder) {
        int i;
        ProtocolType protocolType;
        InvestDetailPagePromptInformation investDetailPagePromptInformation;
        ProductType productType;
        long j;
        long j2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TokenInvestDetail.$childSerializers;
        ProtocolType protocolType2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            ProductType productType2 = (ProductType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            protocolType = (ProtocolType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            productType = productType2;
            investDetailPagePromptInformation = (InvestDetailPagePromptInformation) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, InvestDetailPagePromptInformation$$serializer.INSTANCE, null);
            i = 31;
            j = jDecodeLongElement;
            j2 = jDecodeLongElement2;
        } else {
            int i2 = 0;
            boolean z = true;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            InvestDetailPagePromptInformation investDetailPagePromptInformation2 = null;
            ProductType productType3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    i2 |= 4;
                    productType3 = (ProductType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], productType3);
                } else if (iDecodeElementIndex == 3) {
                    i2 |= 8;
                    protocolType2 = (ProtocolType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], protocolType2);
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    i2 |= 16;
                    investDetailPagePromptInformation2 = (InvestDetailPagePromptInformation) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, InvestDetailPagePromptInformation$$serializer.INSTANCE, investDetailPagePromptInformation2);
                }
            }
            i = i2;
            protocolType = protocolType2;
            investDetailPagePromptInformation = investDetailPagePromptInformation2;
            productType = productType3;
            j = jDecodeLongElement3;
            j2 = jDecodeLongElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TokenInvestDetail(i, j, j2, productType, protocolType, investDetailPagePromptInformation, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TokenInvestDetail tokenInvestDetail) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tokenInvestDetail, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TokenInvestDetail.OLrzqt(tokenInvestDetail, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

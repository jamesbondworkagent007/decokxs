package com.okinc.business.data.model.market;

import java.util.List;
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

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class TokenHolderResponseData$$serializer implements GeneratedSerializer<TokenHolderResponseData> {
    public static final int $stable;
    public static final TokenHolderResponseData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TokenHolderResponseData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TokenHolderResponseData$$serializer tokenHolderResponseData$$serializer = new TokenHolderResponseData$$serializer();
        INSTANCE = tokenHolderResponseData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.data.model.market.TokenHolderResponseData", tokenHolderResponseData$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("holderRankingList", true);
        pluginGeneratedSerialDescriptor.addElement("summaryVO", true);
        pluginGeneratedSerialDescriptor.addElement("ownedVO", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(TokenHolderResponseData.$childSerializers[0]), BuiltinSerializersKt.getNullable(HolderSummaryResponseData$$serializer.INSTANCE), HolderOwnedResponseData$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TokenHolderResponseData deserialize(@NotNull Decoder decoder) {
        int i;
        HolderOwnedResponseData holderOwnedResponseData;
        List list;
        HolderSummaryResponseData holderSummaryResponseData;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TokenHolderResponseData.$childSerializers;
        HolderOwnedResponseData holderOwnedResponseData2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            holderSummaryResponseData = (HolderSummaryResponseData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, HolderSummaryResponseData$$serializer.INSTANCE, null);
            holderOwnedResponseData = (HolderOwnedResponseData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, HolderOwnedResponseData$$serializer.INSTANCE, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            List list2 = null;
            HolderSummaryResponseData holderSummaryResponseData2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], list2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    holderSummaryResponseData2 = (HolderSummaryResponseData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, HolderSummaryResponseData$$serializer.INSTANCE, holderSummaryResponseData2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    holderOwnedResponseData2 = (HolderOwnedResponseData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, HolderOwnedResponseData$$serializer.INSTANCE, holderOwnedResponseData2);
                    i2 |= 4;
                }
            }
            i = i2;
            holderOwnedResponseData = holderOwnedResponseData2;
            list = list2;
            holderSummaryResponseData = holderSummaryResponseData2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TokenHolderResponseData(i, list, holderSummaryResponseData, holderOwnedResponseData, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TokenHolderResponseData tokenHolderResponseData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tokenHolderResponseData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TokenHolderResponseData.write$Self$OKDex_dex_impl(tokenHolderResponseData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

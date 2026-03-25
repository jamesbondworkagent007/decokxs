package com.okinc.business.market.data.model;

import com.okinc.p2p.api.OtcExtraKeys;
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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class StarkNetSignData$$serializer implements GeneratedSerializer<StarkNetSignData> {
    public static final int $stable;
    public static final StarkNetSignData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private StarkNetSignData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        StarkNetSignData$$serializer starkNetSignData$$serializer = new StarkNetSignData$$serializer();
        INSTANCE = starkNetSignData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.StarkNetSignData", starkNetSignData$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.TYPES, true);
        pluginGeneratedSerialDescriptor.addElement("primaryType", true);
        pluginGeneratedSerialDescriptor.addElement("domain", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StarkNetSignTypeListData$$serializer.INSTANCE, StringSerializer.INSTANCE, SignDomainData$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final StarkNetSignData deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        StarkNetSignTypeListData starkNetSignTypeListData;
        SignDomainData signDomainData;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StarkNetSignTypeListData starkNetSignTypeListData2 = (StarkNetSignTypeListData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, StarkNetSignTypeListData$$serializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            starkNetSignTypeListData = starkNetSignTypeListData2;
            signDomainData = (SignDomainData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, SignDomainData$$serializer.INSTANCE, null);
            str = strDecodeStringElement2;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            StarkNetSignTypeListData starkNetSignTypeListData3 = null;
            SignDomainData signDomainData2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    starkNetSignTypeListData3 = (StarkNetSignTypeListData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, StarkNetSignTypeListData$$serializer.INSTANCE, starkNetSignTypeListData3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    signDomainData2 = (SignDomainData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, SignDomainData$$serializer.INSTANCE, signDomainData2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            starkNetSignTypeListData = starkNetSignTypeListData3;
            signDomainData = signDomainData2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new StarkNetSignData(i, starkNetSignTypeListData, str, signDomainData, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull StarkNetSignData starkNetSignData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(starkNetSignData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        StarkNetSignData.copydefault(starkNetSignData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

package com.okinc.unify_trade.biz;

import java.util.ArrayList;
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

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class InstConfigInfo$$serializer implements GeneratedSerializer<InstConfigInfo> {
    public static final int $stable;
    public static final InstConfigInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InstConfigInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InstConfigInfo$$serializer instConfigInfo$$serializer = new InstConfigInfo$$serializer();
        INSTANCE = instConfigInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.InstConfigInfo", instConfigInfo$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("spotCopyInstSwitchConfig", false);
        pluginGeneratedSerialDescriptor.addElement("instMarginModeConfigs", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{SpotCopyInstSwitchConfig$$serializer.INSTANCE, InstConfigInfo.$childSerializers[1]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InstConfigInfo deserialize(@NotNull Decoder decoder) {
        ArrayList arrayList;
        SpotCopyInstSwitchConfig spotCopyInstSwitchConfig;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = InstConfigInfo.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            spotCopyInstSwitchConfig = (SpotCopyInstSwitchConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, SpotCopyInstSwitchConfig$$serializer.INSTANCE, null);
            arrayList = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            i = 3;
        } else {
            ArrayList arrayList2 = null;
            SpotCopyInstSwitchConfig spotCopyInstSwitchConfig2 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    spotCopyInstSwitchConfig2 = (SpotCopyInstSwitchConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, SpotCopyInstSwitchConfig$$serializer.INSTANCE, spotCopyInstSwitchConfig2);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    arrayList2 = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], arrayList2);
                    i2 |= 2;
                }
            }
            arrayList = arrayList2;
            spotCopyInstSwitchConfig = spotCopyInstSwitchConfig2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InstConfigInfo(i, spotCopyInstSwitchConfig, arrayList, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InstConfigInfo instConfigInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(instConfigInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InstConfigInfo.write$Self$OKTradeCore_trade_core(instConfigInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

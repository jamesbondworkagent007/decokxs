package com.okinc.planet.biz_plugin.spot.data;

import com.okinc.tradeshare.api.TradeAssetPlanetBean;
import com.okinc.tradeshare.api.TradeAssetPlanetBean$$serializer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class SpotHoldingBean$$serializer implements GeneratedSerializer<SpotHoldingBean> {
    public static final int $stable;
    public static final SpotHoldingBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SpotHoldingBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SpotHoldingBean$$serializer spotHoldingBean$$serializer = new SpotHoldingBean$$serializer();
        INSTANCE = spotHoldingBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean", spotHoldingBean$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("tradeAssetPlanetBean", false);
        pluginGeneratedSerialDescriptor.addElement("isSelect", true);
        pluginGeneratedSerialDescriptor.addElement("pluginDataTime", true);
        pluginGeneratedSerialDescriptor.addElement("klineList", false);
        pluginGeneratedSerialDescriptor.addElement("isLoadingChatData", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SpotHoldingBean.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{TradeAssetPlanetBean$$serializer.INSTANCE, booleanSerializer, StringSerializer.INSTANCE, kSerializerArr[3], booleanSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SpotHoldingBean deserialize(@NotNull Decoder decoder) {
        List list;
        boolean zDecodeBooleanElement;
        String str;
        TradeAssetPlanetBean tradeAssetPlanetBean;
        int i;
        boolean z;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SpotHoldingBean.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            TradeAssetPlanetBean tradeAssetPlanetBean2 = (TradeAssetPlanetBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, TradeAssetPlanetBean$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            tradeAssetPlanetBean = tradeAssetPlanetBean2;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            i = 31;
            str = strDecodeStringElement;
            z = zDecodeBooleanElement2;
        } else {
            List list2 = null;
            String strDecodeStringElement2 = null;
            TradeAssetPlanetBean tradeAssetPlanetBean3 = null;
            boolean zDecodeBooleanElement3 = false;
            int i3 = 0;
            boolean zDecodeBooleanElement4 = false;
            boolean z2 = true;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z2 = false;
                } else if (iDecodeElementIndex != 0) {
                    if (iDecodeElementIndex == 1) {
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i2 = i3 | 2;
                    } else if (iDecodeElementIndex == 2) {
                        i3 |= 4;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                    } else if (iDecodeElementIndex == 3) {
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], list2);
                        i2 = i3 | 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i2 = i3 | 16;
                    }
                    i3 = i2;
                } else {
                    tradeAssetPlanetBean3 = (TradeAssetPlanetBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, TradeAssetPlanetBean$$serializer.INSTANCE, tradeAssetPlanetBean3);
                    i3 |= 1;
                }
            }
            list = list2;
            zDecodeBooleanElement = zDecodeBooleanElement3;
            str = strDecodeStringElement2;
            tradeAssetPlanetBean = tradeAssetPlanetBean3;
            i = i3;
            z = zDecodeBooleanElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SpotHoldingBean(i, tradeAssetPlanetBean, z, str, list, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SpotHoldingBean spotHoldingBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(spotHoldingBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SpotHoldingBean.write$Self$OKPlanet_ok_feature_planet_impl(spotHoldingBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

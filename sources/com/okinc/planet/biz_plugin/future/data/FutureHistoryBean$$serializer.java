package com.okinc.planet.biz_plugin.future.data;

import com.okinc.tradeshare.api.TradeHisPositionPlanetBean;
import com.okinc.tradeshare.api.TradeHisPositionPlanetBean$$serializer;
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
public final /* synthetic */ class FutureHistoryBean$$serializer implements GeneratedSerializer<FutureHistoryBean> {
    public static final int $stable;
    public static final FutureHistoryBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private FutureHistoryBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FutureHistoryBean$$serializer futureHistoryBean$$serializer = new FutureHistoryBean$$serializer();
        INSTANCE = futureHistoryBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.planet.biz_plugin.future.data.FutureHistoryBean", futureHistoryBean$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("tradeHisPositionPlanetBean", false);
        pluginGeneratedSerialDescriptor.addElement("isSelect", true);
        pluginGeneratedSerialDescriptor.addElement("pluginDataTime", true);
        pluginGeneratedSerialDescriptor.addElement("klineList", true);
        pluginGeneratedSerialDescriptor.addElement("buySellMarkerList", true);
        pluginGeneratedSerialDescriptor.addElement("isLoadingChatData", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = FutureHistoryBean.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{TradeHisPositionPlanetBean$$serializer.INSTANCE, booleanSerializer, StringSerializer.INSTANCE, kSerializerArr[3], kSerializerArr[4], booleanSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final FutureHistoryBean deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        boolean zDecodeBooleanElement;
        int i;
        List list;
        TradeHisPositionPlanetBean tradeHisPositionPlanetBean;
        List list2;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = FutureHistoryBean.$childSerializers;
        int i2 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            TradeHisPositionPlanetBean tradeHisPositionPlanetBean2 = (TradeHisPositionPlanetBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, TradeHisPositionPlanetBean$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            tradeHisPositionPlanetBean = tradeHisPositionPlanetBean2;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            strDecodeStringElement = strDecodeStringElement2;
            list2 = list3;
            i = 63;
            z = zDecodeBooleanElement2;
        } else {
            List list4 = null;
            List list5 = null;
            strDecodeStringElement = null;
            TradeHisPositionPlanetBean tradeHisPositionPlanetBean3 = null;
            boolean zDecodeBooleanElement3 = false;
            int i3 = 0;
            boolean zDecodeBooleanElement4 = false;
            boolean z3 = true;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        z3 = false;
                        i2 = 5;
                        break;
                    case 0:
                        z2 = false;
                        i3 |= 1;
                        tradeHisPositionPlanetBean3 = (TradeHisPositionPlanetBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, TradeHisPositionPlanetBean$$serializer.INSTANCE, tradeHisPositionPlanetBean3);
                        i2 = 5;
                        break;
                    case 1:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        i3 |= 4;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        break;
                    case 3:
                        i3 |= 8;
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], list5);
                        break;
                    case 4:
                        i3 |= 16;
                        list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], list4);
                        break;
                    case 5:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i3 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement3;
            i = i3;
            boolean z4 = zDecodeBooleanElement4;
            list = list4;
            tradeHisPositionPlanetBean = tradeHisPositionPlanetBean3;
            list2 = list5;
            z = z4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FutureHistoryBean(i, tradeHisPositionPlanetBean, z, strDecodeStringElement, list2, list, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull FutureHistoryBean futureHistoryBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(futureHistoryBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        FutureHistoryBean.write$Self$OKPlanet_ok_feature_planet_impl(futureHistoryBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

package com.okinc.okex.lite.onboarding.bean;

import com.okinc.okex.lite.onboarding.api.TradingModeBean;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class TradingModeRecommendationBean$$serializer implements GeneratedSerializer<TradingModeRecommendationBean> {
    public static final int $stable;
    public static final TradingModeRecommendationBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TradingModeRecommendationBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TradingModeRecommendationBean$$serializer tradingModeRecommendationBean$$serializer = new TradingModeRecommendationBean$$serializer();
        INSTANCE = tradingModeRecommendationBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.lite.onboarding.bean.TradingModeRecommendationBean", tradingModeRecommendationBean$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("questionnaires", false);
        pluginGeneratedSerialDescriptor.addElement("applicableToDisplayQuestionnaire", false);
        pluginGeneratedSerialDescriptor.addElement("recommend", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("initialPreference", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = TradingModeRecommendationBean.$childSerializers;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(kSerializerArr[0]), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[2]), BuiltinSerializersKt.getNullable(kSerializerArr[3]), BuiltinSerializersKt.getNullable(kSerializerArr[4])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TradingModeRecommendationBean deserialize(@NotNull Decoder decoder) {
        int i;
        TradingModeBean tradingModeBean;
        TradingModeBean tradingModeBean2;
        SegmentationRecommendationStatus segmentationRecommendationStatus;
        Boolean bool;
        List list;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TradingModeRecommendationBean.$childSerializers;
        TradingModeBean tradingModeBean3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, null);
            TradingModeBean tradingModeBean4 = (TradingModeBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            SegmentationRecommendationStatus segmentationRecommendationStatus2 = (SegmentationRecommendationStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            tradingModeBean2 = (TradingModeBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            list = list2;
            segmentationRecommendationStatus = segmentationRecommendationStatus2;
            bool = bool2;
            i = 31;
            tradingModeBean = tradingModeBean4;
        } else {
            boolean z = true;
            int i2 = 0;
            TradingModeBean tradingModeBean5 = null;
            SegmentationRecommendationStatus segmentationRecommendationStatus3 = null;
            Boolean bool3 = null;
            List list3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], list3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    i2 |= 2;
                    bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, bool3);
                } else if (iDecodeElementIndex == 2) {
                    i2 |= 4;
                    tradingModeBean3 = (TradingModeBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], tradingModeBean3);
                } else if (iDecodeElementIndex == 3) {
                    i2 |= 8;
                    segmentationRecommendationStatus3 = (SegmentationRecommendationStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], segmentationRecommendationStatus3);
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    i2 |= 16;
                    tradingModeBean5 = (TradingModeBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], tradingModeBean5);
                }
            }
            i = i2;
            tradingModeBean = tradingModeBean3;
            tradingModeBean2 = tradingModeBean5;
            segmentationRecommendationStatus = segmentationRecommendationStatus3;
            bool = bool3;
            list = list3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TradingModeRecommendationBean(i, list, bool, tradingModeBean, segmentationRecommendationStatus, tradingModeBean2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TradingModeRecommendationBean tradingModeRecommendationBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tradingModeRecommendationBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TradingModeRecommendationBean.write$Self$OKOnboarding_onboarding_impl(tradingModeRecommendationBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

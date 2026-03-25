package com.okinc.business.invest_biz.data.bean;

import com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class InvestOrderDetailsInfoVo$InvestTxInfo$$serializer implements GeneratedSerializer<InvestOrderDetailsInfoVo.InvestTxInfo> {
    public static final int $stable;
    public static final InvestOrderDetailsInfoVo$InvestTxInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestOrderDetailsInfoVo$InvestTxInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestOrderDetailsInfoVo$InvestTxInfo$$serializer investOrderDetailsInfoVo$InvestTxInfo$$serializer = new InvestOrderDetailsInfoVo$InvestTxInfo$$serializer();
        INSTANCE = investOrderDetailsInfoVo$InvestTxInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo.InvestTxInfo", investOrderDetailsInfoVo$InvestTxInfo$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("investTokenInfo", true);
        pluginGeneratedSerialDescriptor.addElement("investmentInfo", true);
        pluginGeneratedSerialDescriptor.addElement("rightCoinInfo", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("titleTip", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer nullable = BuiltinSerializersKt.getNullable(InvestOrderDetailsInfoVo.InvestTxInfo.$childSerializers[0]);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(InvestOrderDetailsInfoVo$InvestmentInfo$$serializer.INSTANCE);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(InvestOrderDetailsInfoVo$InvestCoinInfo$$serializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestOrderDetailsInfoVo.InvestTxInfo deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        InvestOrderDetailsInfoVo.InvestCoinInfo investCoinInfo;
        List list;
        InvestOrderDetailsInfoVo.InvestmentInfo investmentInfo;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = InvestOrderDetailsInfoVo.InvestTxInfo.$childSerializers;
        String str3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            InvestOrderDetailsInfoVo.InvestmentInfo investmentInfo2 = (InvestOrderDetailsInfoVo.InvestmentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, InvestOrderDetailsInfoVo$InvestmentInfo$$serializer.INSTANCE, null);
            InvestOrderDetailsInfoVo.InvestCoinInfo investCoinInfo2 = (InvestOrderDetailsInfoVo.InvestCoinInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, InvestOrderDetailsInfoVo$InvestCoinInfo$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            list = list2;
            investmentInfo = investmentInfo2;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            investCoinInfo = investCoinInfo2;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            String str4 = null;
            InvestOrderDetailsInfoVo.InvestCoinInfo investCoinInfo3 = null;
            List list3 = null;
            InvestOrderDetailsInfoVo.InvestmentInfo investmentInfo3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], list3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    i2 |= 2;
                    investmentInfo3 = (InvestOrderDetailsInfoVo.InvestmentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, InvestOrderDetailsInfoVo$InvestmentInfo$$serializer.INSTANCE, investmentInfo3);
                } else if (iDecodeElementIndex == 2) {
                    i2 |= 4;
                    investCoinInfo3 = (InvestOrderDetailsInfoVo.InvestCoinInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, InvestOrderDetailsInfoVo$InvestCoinInfo$$serializer.INSTANCE, investCoinInfo3);
                } else if (iDecodeElementIndex == 3) {
                    i2 |= 8;
                    str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str3);
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    i2 |= 16;
                    str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str4);
                }
            }
            i = i2;
            str = str3;
            str2 = str4;
            investCoinInfo = investCoinInfo3;
            list = list3;
            investmentInfo = investmentInfo3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestOrderDetailsInfoVo.InvestTxInfo(i, list, investmentInfo, investCoinInfo, str, str2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestOrderDetailsInfoVo.InvestTxInfo investTxInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investTxInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestOrderDetailsInfoVo.InvestTxInfo.write$Self$OKDeFi_invest_biz(investTxInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

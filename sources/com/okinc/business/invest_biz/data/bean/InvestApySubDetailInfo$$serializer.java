package com.okinc.business.invest_biz.data.bean;

import com.okinc.business.invest_biz.data.contants.ApyType;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class InvestApySubDetailInfo$$serializer implements GeneratedSerializer<InvestApySubDetailInfo> {
    public static final int $stable;
    public static final InvestApySubDetailInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestApySubDetailInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestApySubDetailInfo$$serializer investApySubDetailInfo$$serializer = new InvestApySubDetailInfo$$serializer();
        INSTANCE = investApySubDetailInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.InvestApySubDetailInfo", investApySubDetailInfo$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("keyValueList", true);
        pluginGeneratedSerialDescriptor.addElement("subTitle", true);
        pluginGeneratedSerialDescriptor.addElement("rate", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("templateTip", true);
        pluginGeneratedSerialDescriptor.addElement("totalValue", true);
        pluginGeneratedSerialDescriptor.addElement("hasBonus", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = InvestApySubDetailInfo.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{kSerializerArr[0], stringSerializer, stringSerializer, kSerializerArr[3], BuiltinSerializersKt.getNullable(InvestTipInfoVo$$serializer.INSTANCE), stringSerializer, BooleanSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestApySubDetailInfo deserialize(@NotNull Decoder decoder) {
        int i;
        ApyType apyType;
        String str;
        InvestTipInfoVo investTipInfoVo;
        String str2;
        boolean zDecodeBooleanElement;
        List list;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = InvestApySubDetailInfo.$childSerializers;
        int i2 = 6;
        int i3 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            ApyType apyType2 = (ApyType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            InvestTipInfoVo investTipInfoVo2 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, InvestTipInfoVo$$serializer.INSTANCE, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            str2 = strDecodeStringElement;
            apyType = apyType2;
            i = 127;
            str = strDecodeStringElement3;
            str3 = strDecodeStringElement2;
            investTipInfoVo = investTipInfoVo2;
        } else {
            String strDecodeStringElement4 = null;
            ApyType apyType3 = null;
            String strDecodeStringElement5 = null;
            InvestTipInfoVo investTipInfoVo3 = null;
            String strDecodeStringElement6 = null;
            List list2 = null;
            boolean z = true;
            boolean zDecodeBooleanElement2 = false;
            int i4 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 5;
                        break;
                    case 0:
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], list2);
                        i4 |= 1;
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 1:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        i4 |= 4;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        break;
                    case 3:
                        i4 |= 8;
                        apyType3 = (ApyType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], apyType3);
                        break;
                    case 4:
                        i4 |= 16;
                        investTipInfoVo3 = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, InvestTipInfoVo$$serializer.INSTANCE, investTipInfoVo3);
                        break;
                    case 5:
                        i4 |= 32;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        break;
                    case 6:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i4 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            apyType = apyType3;
            str = strDecodeStringElement5;
            investTipInfoVo = investTipInfoVo3;
            str2 = strDecodeStringElement6;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            list = list2;
            str3 = strDecodeStringElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestApySubDetailInfo(i, list, str2, str3, apyType, investTipInfoVo, str, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestApySubDetailInfo investApySubDetailInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investApySubDetailInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestApySubDetailInfo.write$Self$OKDeFi_invest_biz(investApySubDetailInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

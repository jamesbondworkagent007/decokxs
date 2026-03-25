package com.okinc.business.invest_biz.data.bean;

import com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class InvestOrderDetailsInfoVo$InvestmentInfo$$serializer implements GeneratedSerializer<InvestOrderDetailsInfoVo.InvestmentInfo> {
    public static final int $stable;
    public static final InvestOrderDetailsInfoVo$InvestmentInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestOrderDetailsInfoVo$InvestmentInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestOrderDetailsInfoVo$InvestmentInfo$$serializer investOrderDetailsInfoVo$InvestmentInfo$$serializer = new InvestOrderDetailsInfoVo$InvestmentInfo$$serializer();
        INSTANCE = investOrderDetailsInfoVo$InvestmentInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo.InvestmentInfo", investOrderDetailsInfoVo$InvestmentInfo$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("aggregateId", true);
        pluginGeneratedSerialDescriptor.addElement("investLogo", true);
        pluginGeneratedSerialDescriptor.addElement("investmentCategory", true);
        pluginGeneratedSerialDescriptor.addElement("investmentId", true);
        pluginGeneratedSerialDescriptor.addElement("investmentName", true);
        pluginGeneratedSerialDescriptor.addElement("platformName", true);
        pluginGeneratedSerialDescriptor.addElement("investmentClassify", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(InvestLogo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestOrderDetailsInfoVo.InvestmentInfo deserialize(@NotNull Decoder decoder) {
        String str;
        String strDecodeStringElement;
        Integer num;
        InvestLogo investLogo;
        Long l;
        String str2;
        int i;
        Long l2;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 6;
        int i3 = 5;
        Long l3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, longSerializer, null);
            InvestLogo investLogo2 = (InvestLogo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, InvestLogo$$serializer.INSTANCE, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, null);
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, longSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            l = l5;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            str = str4;
            i = 127;
            str2 = str3;
            num = num2;
            l2 = l4;
            investLogo = investLogo2;
        } else {
            int i4 = 0;
            boolean z2 = true;
            String str5 = null;
            String str6 = null;
            String strDecodeStringElement2 = null;
            Integer num3 = null;
            InvestLogo investLogo3 = null;
            Long l6 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        z2 = false;
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 0:
                        z = false;
                        i4 |= 1;
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, l6);
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 1:
                        i4 |= 2;
                        investLogo3 = (InvestLogo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, InvestLogo$$serializer.INSTANCE, investLogo3);
                        break;
                    case 2:
                        i4 |= 4;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num3);
                        break;
                    case 3:
                        i4 |= 8;
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, l3);
                        break;
                    case 4:
                        i4 |= 16;
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str5);
                        break;
                    case 5:
                        i4 |= 32;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str6);
                        break;
                    case 6:
                        i4 |= 64;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Long l7 = l6;
            str = str6;
            strDecodeStringElement = strDecodeStringElement2;
            num = num3;
            investLogo = investLogo3;
            l = l3;
            str2 = str5;
            i = i4;
            l2 = l7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestOrderDetailsInfoVo.InvestmentInfo(i, l2, investLogo, num, l, str2, str, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestOrderDetailsInfoVo.InvestmentInfo investmentInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investmentInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestOrderDetailsInfoVo.InvestmentInfo.write$Self$OKDeFi_invest_biz(investmentInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

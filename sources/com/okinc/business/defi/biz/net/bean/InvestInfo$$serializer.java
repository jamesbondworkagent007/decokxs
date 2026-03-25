package com.okinc.business.defi.biz.net.bean;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class InvestInfo$$serializer implements GeneratedSerializer<InvestInfo> {
    public static final int $stable;
    public static final InvestInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestInfo$$serializer investInfo$$serializer = new InvestInfo$$serializer();
        INSTANCE = investInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.InvestInfo", investInfo$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("investName", true);
        pluginGeneratedSerialDescriptor.addElement("investLogo", true);
        pluginGeneratedSerialDescriptor.addElement("num", true);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, true);
        pluginGeneratedSerialDescriptor.addElement("platformName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(InvestTxTokenLogo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestInfo deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        Integer num;
        InvestTxTokenLogo investTxTokenLogo;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            InvestTxTokenLogo investTxTokenLogo2 = (InvestTxTokenLogo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, InvestTxTokenLogo$$serializer.INSTANCE, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, null);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            num = num2;
            i = 31;
            str = str6;
            str3 = str5;
            investTxTokenLogo = investTxTokenLogo2;
        } else {
            int i2 = 0;
            boolean z = true;
            String str7 = null;
            Integer num3 = null;
            InvestTxTokenLogo investTxTokenLogo3 = null;
            String str8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str8);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    investTxTokenLogo3 = (InvestTxTokenLogo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, InvestTxTokenLogo$$serializer.INSTANCE, investTxTokenLogo3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str4);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, num3);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str7);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str4;
            str2 = str7;
            num = num3;
            investTxTokenLogo = investTxTokenLogo3;
            str3 = str8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestInfo(i, str3, investTxTokenLogo, str, num, str2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestInfo investInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestInfo.write$Self$OKWallet_wallet_impl(investInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

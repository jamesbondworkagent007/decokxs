package com.okinc.unify_trade.biz;

import androidx.camera.video.AudioStats;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class FundingRateArbCoin$$serializer implements GeneratedSerializer<FundingRateArbCoin> {
    public static final int $stable;
    public static final FundingRateArbCoin$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private FundingRateArbCoin$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FundingRateArbCoin$$serializer fundingRateArbCoin$$serializer = new FundingRateArbCoin$$serializer();
        INSTANCE = fundingRateArbCoin$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.FundingRateArbCoin", fundingRateArbCoin$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("ccy", true);
        pluginGeneratedSerialDescriptor.addElement("fundingRate", true);
        pluginGeneratedSerialDescriptor.addElement("apy", true);
        pluginGeneratedSerialDescriptor.addElement("instId", true);
        pluginGeneratedSerialDescriptor.addElement("highestApyOverview", true);
        pluginGeneratedSerialDescriptor.addElement("historicalRates", true);
        pluginGeneratedSerialDescriptor.addElement("nextFundingTime", true);
        pluginGeneratedSerialDescriptor.addElement("primary", true);
        pluginGeneratedSerialDescriptor.addElement("primarySimilarity", true);
        pluginGeneratedSerialDescriptor.addElement("secondary", true);
        pluginGeneratedSerialDescriptor.addElement("secondarySimilarity", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = FundingRateArbCoin.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(HighestApyOverview$$serializer.INSTANCE), kSerializerArr[5], stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), doubleSerializer, BuiltinSerializersKt.getNullable(stringSerializer), doubleSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final FundingRateArbCoin deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        double dDecodeDoubleElement;
        HighestApyOverview highestApyOverview;
        String str3;
        String str4;
        String str5;
        String str6;
        List list;
        String str7;
        double d;
        String str8;
        String str9;
        String str10;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = FundingRateArbCoin.$childSerializers;
        int i2 = 9;
        int i3 = 7;
        int i4 = 6;
        int i5 = 8;
        String str11 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            HighestApyOverview highestApyOverview2 = (HighestApyOverview) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, HighestApyOverview$$serializer.INSTANCE, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            double dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 8);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            str3 = str16;
            str7 = strDecodeStringElement;
            d = dDecodeDoubleElement2;
            str = str13;
            dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 10);
            list = list2;
            highestApyOverview = highestApyOverview2;
            i = 2047;
            str6 = str15;
            str4 = str14;
            str5 = str12;
        } else {
            int i6 = 10;
            double dDecodeDoubleElement3 = AudioStats.AUDIO_AMPLITUDE_NONE;
            int i7 = 0;
            boolean z = true;
            HighestApyOverview highestApyOverview3 = null;
            String str17 = null;
            List list3 = null;
            String strDecodeStringElement2 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            double dDecodeDoubleElement4 = 0.0d;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str8 = str18;
                        str9 = str19;
                        str10 = str20;
                        z = false;
                        str18 = str8;
                        str19 = str9;
                        str20 = str10;
                        i6 = 10;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 0:
                        str8 = str18;
                        str9 = str19;
                        str10 = str20;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str21);
                        i7 |= 1;
                        str18 = str8;
                        str19 = str9;
                        str20 = str10;
                        i6 = 10;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 1:
                        str8 = str18;
                        str9 = str19;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str20);
                        i7 |= 2;
                        str10 = str20;
                        str18 = str8;
                        str19 = str9;
                        str20 = str10;
                        i6 = 10;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 2:
                        str8 = str18;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str19);
                        i7 |= 4;
                        str9 = str19;
                        str10 = str20;
                        str18 = str8;
                        str19 = str9;
                        str20 = str10;
                        i6 = 10;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 3:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str18);
                        i7 |= 8;
                        str9 = str19;
                        str10 = str20;
                        str18 = str8;
                        str19 = str9;
                        str20 = str10;
                        i6 = 10;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 4:
                        highestApyOverview3 = (HighestApyOverview) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, HighestApyOverview$$serializer.INSTANCE, highestApyOverview3);
                        i7 |= 16;
                        str8 = str18;
                        str9 = str19;
                        str10 = str20;
                        str18 = str8;
                        str19 = str9;
                        str20 = str10;
                        i6 = 10;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 5:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], list3);
                        i7 |= 32;
                        str8 = str18;
                        str9 = str19;
                        str10 = str20;
                        str18 = str8;
                        str19 = str9;
                        str20 = str10;
                        i6 = 10;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 6:
                        i7 |= 64;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        break;
                    case 7:
                        i7 |= 128;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str17);
                        break;
                    case 8:
                        dDecodeDoubleElement3 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, i5);
                        i7 |= 256;
                        str8 = str18;
                        str9 = str19;
                        str10 = str20;
                        str18 = str8;
                        str19 = str9;
                        str20 = str10;
                        i6 = 10;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 9:
                        i7 |= 512;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str11);
                        str8 = str18;
                        str9 = str19;
                        str10 = str20;
                        str18 = str8;
                        str19 = str9;
                        str20 = str10;
                        i6 = 10;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 10:
                        dDecodeDoubleElement4 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, i6);
                        i7 |= 1024;
                        str8 = str18;
                        str9 = str19;
                        str10 = str20;
                        str18 = str8;
                        str19 = str9;
                        str20 = str10;
                        i6 = 10;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i7;
            str = str20;
            str2 = str11;
            dDecodeDoubleElement = dDecodeDoubleElement4;
            highestApyOverview = highestApyOverview3;
            str3 = str17;
            str4 = str19;
            str5 = str21;
            List list4 = list3;
            str6 = str18;
            double d2 = dDecodeDoubleElement3;
            list = list4;
            str7 = strDecodeStringElement2;
            d = d2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FundingRateArbCoin(i, str5, str, str4, str6, highestApyOverview, list, str7, str3, d, str2, dDecodeDoubleElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull FundingRateArbCoin fundingRateArbCoin) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(fundingRateArbCoin, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        FundingRateArbCoin.write$Self$OKTradeCore_trade_core(fundingRateArbCoin, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

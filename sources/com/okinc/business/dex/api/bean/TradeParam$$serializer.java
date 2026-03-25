package com.okinc.business.dex.api.bean;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class TradeParam$$serializer implements GeneratedSerializer<TradeParam> {
    public static final int $stable;
    public static final TradeParam$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TradeParam$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TradeParam$$serializer tradeParam$$serializer = new TradeParam$$serializer();
        INSTANCE = tradeParam$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.api.bean.TradeParam", tradeParam$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("walletId", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("fromCoinInfo", false);
        pluginGeneratedSerialDescriptor.addElement("toCoinInfo", false);
        pluginGeneratedSerialDescriptor.addElement("fromAmount", true);
        pluginGeneratedSerialDescriptor.addElement("addressType", true);
        pluginGeneratedSerialDescriptor.addElement("swapType", true);
        pluginGeneratedSerialDescriptor.addElement("isFromWalletCoinDetail", true);
        pluginGeneratedSerialDescriptor.addElement("tradeMode", true);
        pluginGeneratedSerialDescriptor.addElement("recordSwapTypeCache", true);
        pluginGeneratedSerialDescriptor.addElement("isOldTradingDialog", true);
        pluginGeneratedSerialDescriptor.addElement("sourcePageName", true);
        pluginGeneratedSerialDescriptor.addElement("srcType", true);
        pluginGeneratedSerialDescriptor.addElement("strategyType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        CoinInfo$$serializer coinInfo$$serializer = CoinInfo$$serializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, coinInfo$$serializer, coinInfo$$serializer, stringSerializer, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), booleanSerializer, stringSerializer, intSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TradeParam deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        CoinInfo coinInfo;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        int iDecodeIntElement;
        boolean z2;
        CoinInfo coinInfo2;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        String str5;
        Integer num;
        CoinInfo coinInfo3;
        CoinInfo coinInfo4;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 11;
        int i4 = 10;
        int i5 = 9;
        String strDecodeStringElement3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            CoinInfo$$serializer coinInfo$$serializer = CoinInfo$$serializer.INSTANCE;
            CoinInfo coinInfo5 = (CoinInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, coinInfo$$serializer, null);
            CoinInfo coinInfo6 = (CoinInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, coinInfo$$serializer, null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            bool = bool2;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            z = zDecodeBooleanElement2;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
            z2 = zDecodeBooleanElement;
            str = str6;
            num = num2;
            str2 = str7;
            str5 = strDecodeStringElement6;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            i = 16383;
            str4 = strDecodeStringElement4;
            coinInfo = coinInfo6;
            coinInfo2 = coinInfo5;
            str3 = strDecodeStringElement5;
        } else {
            int i6 = 13;
            int i7 = 0;
            boolean zDecodeBooleanElement3 = false;
            int iDecodeIntElement2 = 0;
            boolean zDecodeBooleanElement4 = false;
            Boolean bool3 = null;
            Integer num3 = null;
            String str8 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            CoinInfo coinInfo7 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            CoinInfo coinInfo8 = null;
            boolean z3 = true;
            String str9 = null;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        coinInfo3 = coinInfo7;
                        coinInfo4 = coinInfo8;
                        z3 = false;
                        coinInfo8 = coinInfo4;
                        coinInfo7 = coinInfo3;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 0:
                        coinInfo3 = coinInfo7;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        coinInfo7 = coinInfo3;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 1:
                        coinInfo3 = coinInfo7;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i7 |= 2;
                        coinInfo7 = coinInfo3;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 2:
                        coinInfo3 = coinInfo7;
                        coinInfo8 = (CoinInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, CoinInfo$$serializer.INSTANCE, coinInfo8);
                        i7 |= 4;
                        coinInfo7 = coinInfo3;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 3:
                        coinInfo7 = (CoinInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, CoinInfo$$serializer.INSTANCE, coinInfo7);
                        i2 = i7 | 8;
                        i7 = i2;
                        coinInfo3 = coinInfo7;
                        coinInfo7 = coinInfo3;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 4:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i7 |= 16;
                        coinInfo3 = coinInfo7;
                        coinInfo7 = coinInfo3;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 5:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, num3);
                        i2 = i7 | 32;
                        i7 = i2;
                        coinInfo3 = coinInfo7;
                        coinInfo7 = coinInfo3;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 6:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str8);
                        i2 = i7 | 64;
                        i7 = i2;
                        coinInfo3 = coinInfo7;
                        coinInfo7 = coinInfo3;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 7:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i7 |= 128;
                        i6 = 13;
                        break;
                    case 8:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str9);
                        i7 |= 256;
                        coinInfo3 = coinInfo7;
                        coinInfo4 = coinInfo8;
                        coinInfo8 = coinInfo4;
                        coinInfo7 = coinInfo3;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 9:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool3);
                        i7 |= 512;
                        coinInfo3 = coinInfo7;
                        coinInfo4 = coinInfo8;
                        coinInfo8 = coinInfo4;
                        coinInfo7 = coinInfo3;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 10:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i7 |= 1024;
                        coinInfo3 = coinInfo7;
                        coinInfo7 = coinInfo3;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 11:
                        i7 |= 2048;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        coinInfo3 = coinInfo7;
                        coinInfo7 = coinInfo3;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 12:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
                        i7 |= 4096;
                        coinInfo3 = coinInfo7;
                        coinInfo7 = coinInfo3;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 13:
                        i7 |= 8192;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        coinInfo3 = coinInfo7;
                        coinInfo7 = coinInfo3;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            CoinInfo coinInfo9 = coinInfo7;
            CoinInfo coinInfo10 = coinInfo8;
            bool = bool3;
            coinInfo = coinInfo9;
            i = i7;
            str = str8;
            str2 = str9;
            str3 = strDecodeStringElement9;
            str4 = strDecodeStringElement10;
            z = zDecodeBooleanElement3;
            iDecodeIntElement = iDecodeIntElement2;
            z2 = zDecodeBooleanElement4;
            coinInfo2 = coinInfo10;
            strDecodeStringElement = strDecodeStringElement7;
            strDecodeStringElement2 = strDecodeStringElement8;
            str5 = strDecodeStringElement3;
            num = num3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TradeParam(i, str4, str3, coinInfo2, coinInfo, str5, num, str, z2, str2, bool, z, strDecodeStringElement2, iDecodeIntElement, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TradeParam tradeParam) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tradeParam, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TradeParam.write$Self$OKDex_dex_api(tradeParam, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

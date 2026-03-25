package com.okinc.business.dex.trade.core.domain.model.limit;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean$$serializer;
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

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class TokenPairRateOrderInfo$$serializer implements GeneratedSerializer<TokenPairRateOrderInfo> {
    public static final int $stable;
    public static final TokenPairRateOrderInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TokenPairRateOrderInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TokenPairRateOrderInfo$$serializer tokenPairRateOrderInfo$$serializer = new TokenPairRateOrderInfo$$serializer();
        INSTANCE = tokenPairRateOrderInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateOrderInfo", tokenPairRateOrderInfo$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("estReserveNativeAmt", true);
        pluginGeneratedSerialDescriptor.addElement("fromToken", true);
        pluginGeneratedSerialDescriptor.addElement("toToken", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenAmount", true);
        pluginGeneratedSerialDescriptor.addElement("toTokenAmount", true);
        pluginGeneratedSerialDescriptor.addElement("isEnableMev", true);
        pluginGeneratedSerialDescriptor.addElement("minimumReceived", true);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenUnitPriceUsd", true);
        pluginGeneratedSerialDescriptor.addElement("minSellAmount", true);
        pluginGeneratedSerialDescriptor.addElement("code", true);
        pluginGeneratedSerialDescriptor.addElement("isHoneypot", true);
        pluginGeneratedSerialDescriptor.addElement("isSafeMoonToken", true);
        pluginGeneratedSerialDescriptor.addElement("tradeTaxes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(dexMultiTokenInfoBean$$serializer), BuiltinSerializersKt.getNullable(dexMultiTokenInfoBean$$serializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TokenPairRateOrderInfo deserialize(@NotNull Decoder decoder) {
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2;
        String str6;
        String str7;
        String str8;
        boolean z;
        String str9;
        String str10;
        int i;
        String str11;
        String str12;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 11;
        int i3 = 10;
        int i4 = 9;
        String str13 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
            DexMultiTokenInfoBean dexMultiTokenInfoBean3 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, dexMultiTokenInfoBean$$serializer, null);
            DexMultiTokenInfoBean dexMultiTokenInfoBean4 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, dexMultiTokenInfoBean$$serializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            str = str21;
            str5 = str20;
            str6 = str19;
            str3 = str17;
            str2 = str16;
            z = zDecodeBooleanElement;
            str7 = str14;
            str4 = str18;
            str9 = str15;
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean3;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean4;
            i = 8191;
            str8 = strDecodeStringElement;
        } else {
            int i5 = 12;
            boolean z2 = true;
            DexMultiTokenInfoBean dexMultiTokenInfoBean5 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            DexMultiTokenInfoBean dexMultiTokenInfoBean6 = null;
            String strDecodeStringElement2 = null;
            String str27 = null;
            String str28 = null;
            int i6 = 0;
            boolean zDecodeBooleanElement2 = false;
            String str29 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str11 = str27;
                        str12 = str28;
                        z2 = false;
                        str28 = str12;
                        str27 = str11;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 12;
                        break;
                    case 0:
                        str11 = str27;
                        str12 = str28;
                        i6 |= 1;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        dexMultiTokenInfoBean6 = dexMultiTokenInfoBean6;
                        str28 = str12;
                        str27 = str11;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 12;
                        break;
                    case 1:
                        str11 = str27;
                        str12 = str28;
                        i6 |= 2;
                        dexMultiTokenInfoBean6 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean6);
                        str28 = str12;
                        str27 = str11;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 12;
                        break;
                    case 2:
                        str11 = str27;
                        str12 = str28;
                        dexMultiTokenInfoBean5 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean5);
                        i6 |= 4;
                        str28 = str12;
                        str27 = str11;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 12;
                        break;
                    case 3:
                        str11 = str27;
                        str12 = str28;
                        i6 |= 8;
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str29);
                        str28 = str12;
                        str27 = str11;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 12;
                        break;
                    case 4:
                        str12 = str28;
                        i6 |= 16;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str27);
                        str28 = str12;
                        str27 = str11;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 12;
                        break;
                    case 5:
                        str12 = str28;
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i6 |= 32;
                        str11 = str27;
                        str28 = str12;
                        str27 = str11;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 12;
                        break;
                    case 6:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str28);
                        i6 |= 64;
                        str11 = str27;
                        str28 = str12;
                        str27 = str11;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 12;
                        break;
                    case 7:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str22);
                        i6 |= 128;
                        str11 = str27;
                        str12 = str28;
                        str28 = str12;
                        str27 = str11;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 12;
                        break;
                    case 8:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str23);
                        i6 |= 256;
                        str11 = str27;
                        str12 = str28;
                        str28 = str12;
                        str27 = str11;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 12;
                        break;
                    case 9:
                        i6 |= 512;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str25);
                        str11 = str27;
                        str12 = str28;
                        str28 = str12;
                        str27 = str11;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 12;
                        break;
                    case 10:
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str24);
                        i6 |= 1024;
                        str11 = str27;
                        str12 = str28;
                        str28 = str12;
                        str27 = str11;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 12;
                        break;
                    case 11:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str13);
                        i6 |= 2048;
                        break;
                    case 12:
                        i6 |= 4096;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str26);
                        str11 = str27;
                        str12 = str28;
                        str28 = str12;
                        str27 = str11;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 12;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str30 = str27;
            String str31 = str28;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean5;
            str = str13;
            str2 = str31;
            str3 = str22;
            str4 = str23;
            str5 = str24;
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean6;
            str6 = str25;
            str7 = str29;
            str8 = strDecodeStringElement2;
            z = zDecodeBooleanElement2;
            str9 = str30;
            str10 = str26;
            i = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TokenPairRateOrderInfo(i, str8, dexMultiTokenInfoBean2, dexMultiTokenInfoBean, str7, str9, z, str2, str3, str4, str6, str5, str, str10, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TokenPairRateOrderInfo tokenPairRateOrderInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tokenPairRateOrderInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TokenPairRateOrderInfo.write$Self$OKDex_dex_impl(tokenPairRateOrderInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

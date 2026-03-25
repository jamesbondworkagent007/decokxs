package com.okinc.business.trade.features.home.ui.cefi.data;

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
public final /* synthetic */ class LimitOrderInfo$$serializer implements GeneratedSerializer<LimitOrderInfo> {
    public static final int $stable;
    public static final LimitOrderInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private LimitOrderInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        LimitOrderInfo$$serializer limitOrderInfo$$serializer = new LimitOrderInfo$$serializer();
        INSTANCE = limitOrderInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.trade.features.home.ui.cefi.data.LimitOrderInfo", limitOrderInfo$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("fromToken", true);
        pluginGeneratedSerialDescriptor.addElement("toToken", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenAmount", true);
        pluginGeneratedSerialDescriptor.addElement("toTokenAmount", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenPrice", true);
        pluginGeneratedSerialDescriptor.addElement("isEnableMev", true);
        pluginGeneratedSerialDescriptor.addElement("minimumReceived", true);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenUnitPriceUsd", true);
        pluginGeneratedSerialDescriptor.addElement("estReserveNativeAmt", true);
        pluginGeneratedSerialDescriptor.addElement("minSellAmount", true);
        pluginGeneratedSerialDescriptor.addElement("code", true);
        pluginGeneratedSerialDescriptor.addElement("isHoneypot", true);
        pluginGeneratedSerialDescriptor.addElement("isSafeMoonToken", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(dexMultiTokenInfoBean$$serializer), BuiltinSerializersKt.getNullable(dexMultiTokenInfoBean$$serializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final LimitOrderInfo deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        String str6;
        String str7;
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        int i;
        String str8;
        String strDecodeStringElement2;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2;
        String str9;
        String str10;
        DexMultiTokenInfoBean dexMultiTokenInfoBean3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 11;
        int i3 = 10;
        int i4 = 9;
        int i5 = 7;
        String strDecodeStringElement3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
            DexMultiTokenInfoBean dexMultiTokenInfoBean4 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, dexMultiTokenInfoBean$$serializer, null);
            DexMultiTokenInfoBean dexMultiTokenInfoBean5 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, dexMultiTokenInfoBean$$serializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean5;
            str = str15;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            str3 = strDecodeStringElement6;
            str4 = strDecodeStringElement5;
            str5 = strDecodeStringElement4;
            str2 = str14;
            z = zDecodeBooleanElement;
            str6 = str12;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            str8 = str13;
            str7 = str11;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean4;
            i = 8191;
        } else {
            int i6 = 12;
            String str16 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String str17 = null;
            String str18 = null;
            DexMultiTokenInfoBean dexMultiTokenInfoBean6 = null;
            DexMultiTokenInfoBean dexMultiTokenInfoBean7 = null;
            int i7 = 0;
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            String str19 = null;
            String str20 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str9 = str17;
                        str10 = str18;
                        dexMultiTokenInfoBean3 = dexMultiTokenInfoBean6;
                        z2 = false;
                        str17 = str9;
                        str18 = str10;
                        dexMultiTokenInfoBean6 = dexMultiTokenInfoBean3;
                        i6 = 12;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 0:
                        str9 = str17;
                        str10 = str18;
                        dexMultiTokenInfoBean3 = dexMultiTokenInfoBean6;
                        dexMultiTokenInfoBean7 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean7);
                        i7 |= 1;
                        str17 = str9;
                        str18 = str10;
                        dexMultiTokenInfoBean6 = dexMultiTokenInfoBean3;
                        i6 = 12;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 1:
                        str9 = str17;
                        str10 = str18;
                        dexMultiTokenInfoBean6 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean6);
                        i7 |= 2;
                        dexMultiTokenInfoBean3 = dexMultiTokenInfoBean6;
                        str17 = str9;
                        str18 = str10;
                        dexMultiTokenInfoBean6 = dexMultiTokenInfoBean3;
                        i6 = 12;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 2:
                        str9 = str17;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str18);
                        i7 |= 4;
                        str10 = str18;
                        dexMultiTokenInfoBean3 = dexMultiTokenInfoBean6;
                        str17 = str9;
                        str18 = str10;
                        dexMultiTokenInfoBean6 = dexMultiTokenInfoBean3;
                        i6 = 12;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 3:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str17);
                        i7 |= 8;
                        str10 = str18;
                        dexMultiTokenInfoBean3 = dexMultiTokenInfoBean6;
                        str17 = str9;
                        str18 = str10;
                        dexMultiTokenInfoBean6 = dexMultiTokenInfoBean3;
                        i6 = 12;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 4:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str16);
                        i7 |= 16;
                        str9 = str17;
                        str10 = str18;
                        dexMultiTokenInfoBean3 = dexMultiTokenInfoBean6;
                        str17 = str9;
                        str18 = str10;
                        dexMultiTokenInfoBean6 = dexMultiTokenInfoBean3;
                        i6 = 12;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 5:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i7 |= 32;
                        str9 = str17;
                        str10 = str18;
                        dexMultiTokenInfoBean3 = dexMultiTokenInfoBean6;
                        str17 = str9;
                        str18 = str10;
                        dexMultiTokenInfoBean6 = dexMultiTokenInfoBean3;
                        i6 = 12;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 6:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str20);
                        i7 |= 64;
                        str9 = str17;
                        str10 = str18;
                        dexMultiTokenInfoBean3 = dexMultiTokenInfoBean6;
                        str17 = str9;
                        str18 = str10;
                        dexMultiTokenInfoBean6 = dexMultiTokenInfoBean3;
                        i6 = 12;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 7:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str19);
                        i7 |= 128;
                        break;
                    case 8:
                        i7 |= 256;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        str9 = str17;
                        str10 = str18;
                        dexMultiTokenInfoBean3 = dexMultiTokenInfoBean6;
                        str17 = str9;
                        str18 = str10;
                        dexMultiTokenInfoBean6 = dexMultiTokenInfoBean3;
                        i6 = 12;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 9:
                        i7 |= 512;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        str9 = str17;
                        str10 = str18;
                        dexMultiTokenInfoBean3 = dexMultiTokenInfoBean6;
                        str17 = str9;
                        str18 = str10;
                        dexMultiTokenInfoBean6 = dexMultiTokenInfoBean3;
                        i6 = 12;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 10:
                        i7 |= 1024;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        str9 = str17;
                        str10 = str18;
                        dexMultiTokenInfoBean3 = dexMultiTokenInfoBean6;
                        str17 = str9;
                        str18 = str10;
                        dexMultiTokenInfoBean6 = dexMultiTokenInfoBean3;
                        i6 = 12;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 11:
                        i7 |= 2048;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        str9 = str17;
                        str10 = str18;
                        dexMultiTokenInfoBean3 = dexMultiTokenInfoBean6;
                        str17 = str9;
                        str18 = str10;
                        dexMultiTokenInfoBean6 = dexMultiTokenInfoBean3;
                        i6 = 12;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 12:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i7 |= 4096;
                        str9 = str17;
                        str10 = str18;
                        dexMultiTokenInfoBean3 = dexMultiTokenInfoBean6;
                        str17 = str9;
                        str18 = str10;
                        dexMultiTokenInfoBean6 = dexMultiTokenInfoBean3;
                        i6 = 12;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str21 = str17;
            String str22 = str18;
            DexMultiTokenInfoBean dexMultiTokenInfoBean8 = dexMultiTokenInfoBean6;
            DexMultiTokenInfoBean dexMultiTokenInfoBean9 = dexMultiTokenInfoBean7;
            strDecodeStringElement = strDecodeStringElement3;
            str = str19;
            str2 = str20;
            str3 = strDecodeStringElement8;
            str4 = strDecodeStringElement9;
            str5 = strDecodeStringElement10;
            z = zDecodeBooleanElement2;
            str6 = str21;
            str7 = str22;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean9;
            i = i7;
            str8 = str16;
            strDecodeStringElement2 = strDecodeStringElement7;
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LimitOrderInfo(i, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, str7, str6, str8, z, str2, str, str5, str4, str3, strDecodeStringElement2, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull LimitOrderInfo limitOrderInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(limitOrderInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LimitOrderInfo.write$Self$OKDex_dex_impl(limitOrderInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

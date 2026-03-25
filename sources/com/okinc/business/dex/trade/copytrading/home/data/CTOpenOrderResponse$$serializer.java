package com.okinc.business.dex.trade.copytrading.home.data;

import com.okinc.business.dex.trade.order.domain.model.TokenInfo;
import com.okinc.business.dex.trade.order.domain.model.TokenInfo$$serializer;
import com.okinc.business.dex.trade.order.domain.model.TriggerInfo;
import com.okinc.business.dex.trade.order.domain.model.TriggerInfo$$serializer;
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
public final /* synthetic */ class CTOpenOrderResponse$$serializer implements GeneratedSerializer<CTOpenOrderResponse> {
    public static final int $stable;
    public static final CTOpenOrderResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CTOpenOrderResponse$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CTOpenOrderResponse$$serializer cTOpenOrderResponse$$serializer = new CTOpenOrderResponse$$serializer();
        INSTANCE = cTOpenOrderResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.copytrading.home.data.CTOpenOrderResponse", cTOpenOrderResponse$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("canResume", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("chainLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("chainName", true);
        pluginGeneratedSerialDescriptor.addElement("chainSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("createTime", true);
        pluginGeneratedSerialDescriptor.addElement("exchangeDirection", false);
        pluginGeneratedSerialDescriptor.addElement("expireTime", true);
        pluginGeneratedSerialDescriptor.addElement("fromToken", true);
        pluginGeneratedSerialDescriptor.addElement("orderId", true);
        pluginGeneratedSerialDescriptor.addElement("orderType", false);
        pluginGeneratedSerialDescriptor.addElement("realizedPnl", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("strategyMode", true);
        pluginGeneratedSerialDescriptor.addElement("toToken", true);
        pluginGeneratedSerialDescriptor.addElement("triggerInfo", true);
        pluginGeneratedSerialDescriptor.addElement("userWalletAddress", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        TokenInfo$$serializer tokenInfo$$serializer = TokenInfo$$serializer.INSTANCE;
        return new KSerializer[]{BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, stringSerializer, tokenInfo$$serializer, stringSerializer, intSerializer, BuiltinSerializersKt.getNullable(PnLDetail$$serializer.INSTANCE), intSerializer, intSerializer, tokenInfo$$serializer, TriggerInfo$$serializer.INSTANCE, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CTOpenOrderResponse deserialize(@NotNull Decoder decoder) {
        int i;
        String strDecodeStringElement;
        PnLDetail pnLDetail;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2;
        int i3;
        int i4;
        TriggerInfo triggerInfo;
        TokenInfo tokenInfo;
        int i5;
        String strDecodeStringElement2;
        String str6;
        TokenInfo tokenInfo2;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            TokenInfo$$serializer tokenInfo$$serializer = TokenInfo$$serializer.INSTANCE;
            TokenInfo tokenInfo3 = (TokenInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, tokenInfo$$serializer, null);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            PnLDetail pnLDetail2 = (PnLDetail) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, PnLDetail$$serializer.INSTANCE, null);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 13);
            TokenInfo tokenInfo4 = (TokenInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, tokenInfo$$serializer, null);
            i = 131071;
            triggerInfo = (TriggerInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 15, TriggerInfo$$serializer.INSTANCE, null);
            str5 = strDecodeStringElement3;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            i2 = iDecodeIntElement3;
            i3 = iDecodeIntElement2;
            str6 = strDecodeStringElement9;
            strDecodeStringElement = strDecodeStringElement8;
            i4 = iDecodeIntElement;
            tokenInfo2 = tokenInfo3;
            tokenInfo = tokenInfo4;
            i5 = iDecodeIntElement4;
            pnLDetail = pnLDetail2;
            z = zDecodeBooleanElement;
            str4 = strDecodeStringElement4;
            str3 = strDecodeStringElement5;
            str = strDecodeStringElement7;
            str2 = strDecodeStringElement6;
        } else {
            int i8 = 16;
            i = 0;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            int iDecodeIntElement7 = 0;
            boolean z2 = true;
            PnLDetail pnLDetail3 = null;
            TokenInfo tokenInfo5 = null;
            TokenInfo tokenInfo6 = null;
            String strDecodeStringElement10 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            TriggerInfo triggerInfo2 = null;
            int iDecodeIntElement8 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i8 = 16;
                        break;
                    case 0:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i |= 1;
                        i8 = 16;
                        break;
                    case 1:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        i8 = 16;
                        break;
                    case 2:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        i8 = 16;
                        break;
                    case 3:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        i8 = 16;
                        break;
                    case 4:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        i8 = 16;
                        break;
                    case 5:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        i8 = 16;
                        break;
                    case 6:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i6 = i | 64;
                        i = i6;
                        i8 = 16;
                        break;
                    case 7:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i6 = i | 128;
                        i = i6;
                        i8 = 16;
                        break;
                    case 8:
                        tokenInfo6 = (TokenInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, TokenInfo$$serializer.INSTANCE, tokenInfo6);
                        i6 = i | 256;
                        i = i6;
                        i8 = 16;
                        break;
                    case 9:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i6 = i | 512;
                        i = i6;
                        i8 = 16;
                        break;
                    case 10:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
                        i6 = i | 1024;
                        i = i6;
                        i8 = 16;
                        break;
                    case 11:
                        pnLDetail3 = (PnLDetail) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, PnLDetail$$serializer.INSTANCE, pnLDetail3);
                        i6 = i | 2048;
                        i = i6;
                        i8 = 16;
                        break;
                    case 12:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
                        i |= 4096;
                        i8 = 16;
                        break;
                    case 13:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 13);
                        i |= 8192;
                        i8 = 16;
                        break;
                    case 14:
                        tokenInfo5 = (TokenInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, TokenInfo$$serializer.INSTANCE, tokenInfo5);
                        i7 = i | 16384;
                        i = i7;
                        i8 = 16;
                        break;
                    case 15:
                        triggerInfo2 = (TriggerInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 15, TriggerInfo$$serializer.INSTANCE, triggerInfo2);
                        i7 = 32768 | i;
                        i = i7;
                        i8 = 16;
                        break;
                    case 16:
                        i |= 65536;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i8);
                        i8 = 16;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            pnLDetail = pnLDetail3;
            z = zDecodeBooleanElement2;
            str = strDecodeStringElement10;
            str2 = strDecodeStringElement13;
            str3 = strDecodeStringElement14;
            str4 = strDecodeStringElement15;
            str5 = strDecodeStringElement16;
            i2 = iDecodeIntElement5;
            i3 = iDecodeIntElement6;
            i4 = iDecodeIntElement7;
            triggerInfo = triggerInfo2;
            tokenInfo = tokenInfo5;
            i5 = iDecodeIntElement8;
            strDecodeStringElement2 = strDecodeStringElement12;
            str6 = strDecodeStringElement11;
            tokenInfo2 = tokenInfo6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CTOpenOrderResponse(i, z, str5, str4, str3, str2, str, i4, strDecodeStringElement, tokenInfo2, str6, i3, pnLDetail, i2, i5, tokenInfo, triggerInfo, strDecodeStringElement2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CTOpenOrderResponse cTOpenOrderResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cTOpenOrderResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CTOpenOrderResponse.write$Self$OKDex_dex_impl(cTOpenOrderResponse, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

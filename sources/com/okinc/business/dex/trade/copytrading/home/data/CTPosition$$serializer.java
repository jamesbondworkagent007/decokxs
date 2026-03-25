package com.okinc.business.dex.trade.copytrading.home.data;

import com.okinc.business.dex.trade.order.domain.model.TokenInfo;
import com.okinc.business.dex.trade.order.domain.model.TokenInfo$$serializer;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class CTPosition$$serializer implements GeneratedSerializer<CTPosition> {
    public static final int $stable;
    public static final CTPosition$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CTPosition$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CTPosition$$serializer cTPosition$$serializer = new CTPosition$$serializer();
        INSTANCE = cTPosition$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.copytrading.home.data.CTPosition", cTPosition$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("balanceAmount", true);
        pluginGeneratedSerialDescriptor.addElement("balanceUsdValue", true);
        pluginGeneratedSerialDescriptor.addElement("buyTokenAmount", true);
        pluginGeneratedSerialDescriptor.addElement("buyUsdValue", true);
        pluginGeneratedSerialDescriptor.addElement("lastActive", true);
        pluginGeneratedSerialDescriptor.addElement("positionId", true);
        pluginGeneratedSerialDescriptor.addElement("sellTokenAmount", true);
        pluginGeneratedSerialDescriptor.addElement("sellUsdValue", true);
        pluginGeneratedSerialDescriptor.addElement("tokenInfo", true);
        pluginGeneratedSerialDescriptor.addElement("totalPnl", true);
        pluginGeneratedSerialDescriptor.addElement("totalPnlRate", true);
        pluginGeneratedSerialDescriptor.addElement("unrealizedPnl", true);
        pluginGeneratedSerialDescriptor.addElement("unrealizedPnlRate", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, TokenInfo$$serializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CTPosition deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        String strDecodeStringElement2;
        String strDecodeStringElement3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        TokenInfo tokenInfo;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            TokenInfo tokenInfo2 = (TokenInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, TokenInfo$$serializer.INSTANCE, null);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            i = 8191;
            str7 = strDecodeStringElement5;
            tokenInfo = tokenInfo2;
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            str3 = strDecodeStringElement14;
            str4 = strDecodeStringElement13;
            str6 = strDecodeStringElement12;
            str5 = strDecodeStringElement11;
            str8 = strDecodeStringElement10;
            str9 = strDecodeStringElement8;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            strDecodeStringElement = strDecodeStringElement9;
            str = strDecodeStringElement7;
            str2 = strDecodeStringElement6;
        } else {
            int i2 = 12;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            boolean z = true;
            i = 0;
            TokenInfo tokenInfo3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 12;
                        break;
                    case 0:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        i2 = 12;
                        break;
                    case 1:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        i2 = 12;
                        break;
                    case 2:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        i |= 8;
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        i |= 16;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        i |= 32;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        break;
                    case 6:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        break;
                    case 7:
                        i |= 128;
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        break;
                    case 8:
                        i |= 256;
                        tokenInfo3 = (TokenInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, TokenInfo$$serializer.INSTANCE, tokenInfo3);
                        break;
                    case 9:
                        i |= 512;
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        break;
                    case 10:
                        i |= 1024;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        break;
                    case 11:
                        i |= 2048;
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        break;
                    case 12:
                        i |= 4096;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            strDecodeStringElement2 = strDecodeStringElement16;
            strDecodeStringElement3 = strDecodeStringElement17;
            str = strDecodeStringElement23;
            str2 = strDecodeStringElement24;
            str3 = strDecodeStringElement20;
            str4 = strDecodeStringElement21;
            str5 = strDecodeStringElement4;
            str6 = strDecodeStringElement15;
            str7 = strDecodeStringElement19;
            str8 = strDecodeStringElement18;
            str9 = strDecodeStringElement22;
            tokenInfo = tokenInfo3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CTPosition(i, str7, str2, str, str9, strDecodeStringElement, str8, str5, str6, tokenInfo, str4, str3, strDecodeStringElement3, strDecodeStringElement2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CTPosition cTPosition) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cTPosition, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CTPosition.write$Self$OKDex_dex_impl(cTPosition, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

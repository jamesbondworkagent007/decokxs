package com.okinc.business.dex.trade.core.domain.model;

import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo$$serializer;
import com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig;
import com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig$$serializer;
import com.okinc.business.dex.trade.core.domain.model.common.QuoteExt;
import com.okinc.business.dex.trade.core.domain.model.common.QuoteExt$$serializer;
import com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig;
import com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig$$serializer;
import com.okinc.p2p.api.OtcExtraKeys;
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

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class V6QuoteRequest$$serializer implements GeneratedSerializer<V6QuoteRequest> {
    public static final int $stable;
    public static final V6QuoteRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private V6QuoteRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        V6QuoteRequest$$serializer v6QuoteRequest$$serializer = new V6QuoteRequest$$serializer();
        INSTANCE = v6QuoteRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest", v6QuoteRequest$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("userWalletAddress", true);
        pluginGeneratedSerialDescriptor.addElement("tradeMode", false);
        pluginGeneratedSerialDescriptor.addElement("slippageConfig", true);
        pluginGeneratedSerialDescriptor.addElement("liquidityConfig", true);
        pluginGeneratedSerialDescriptor.addElement("ext", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement("fromTokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("toTokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.AMOUNT, false);
        pluginGeneratedSerialDescriptor.addElement("accountInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(SlippageConfig$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(LiquidityConfig$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(QuoteExt$$serializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(AccountInfo$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final V6QuoteRequest deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        QuoteExt quoteExt;
        AccountInfo accountInfo;
        String str;
        String str2;
        String str3;
        String str4;
        LiquidityConfig liquidityConfig;
        String str5;
        int i;
        SlippageConfig slippageConfig;
        SlippageConfig slippageConfig2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 9;
        int i3 = 7;
        int i4 = 6;
        int i5 = 5;
        AccountInfo accountInfo2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            SlippageConfig slippageConfig3 = (SlippageConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, SlippageConfig$$serializer.INSTANCE, null);
            LiquidityConfig liquidityConfig2 = (LiquidityConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LiquidityConfig$$serializer.INSTANCE, null);
            QuoteExt quoteExt2 = (QuoteExt) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, QuoteExt$$serializer.INSTANCE, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            i = 1023;
            str4 = str6;
            accountInfo = (AccountInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, AccountInfo$$serializer.INSTANCE, null);
            str = strDecodeStringElement5;
            str5 = strDecodeStringElement4;
            str2 = strDecodeStringElement3;
            liquidityConfig = liquidityConfig2;
            strDecodeStringElement = strDecodeStringElement6;
            quoteExt = quoteExt2;
            slippageConfig = slippageConfig3;
            str3 = strDecodeStringElement2;
        } else {
            int i6 = 0;
            boolean z = true;
            QuoteExt quoteExt3 = null;
            LiquidityConfig liquidityConfig3 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            SlippageConfig slippageConfig4 = null;
            String strDecodeStringElement10 = null;
            String str7 = null;
            strDecodeStringElement = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        slippageConfig2 = slippageConfig4;
                        z = false;
                        slippageConfig4 = slippageConfig2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 0:
                        slippageConfig2 = slippageConfig4;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str7);
                        i6 |= 1;
                        slippageConfig4 = slippageConfig2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 1:
                        slippageConfig2 = slippageConfig4;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i6 |= 2;
                        slippageConfig4 = slippageConfig2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 2:
                        slippageConfig2 = (SlippageConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, SlippageConfig$$serializer.INSTANCE, slippageConfig4);
                        i6 |= 4;
                        slippageConfig4 = slippageConfig2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 3:
                        liquidityConfig3 = (LiquidityConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LiquidityConfig$$serializer.INSTANCE, liquidityConfig3);
                        i6 |= 8;
                        break;
                    case 4:
                        i6 |= 16;
                        quoteExt3 = (QuoteExt) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, QuoteExt$$serializer.INSTANCE, quoteExt3);
                        slippageConfig2 = slippageConfig4;
                        slippageConfig4 = slippageConfig2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 5:
                        i6 |= 32;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        slippageConfig2 = slippageConfig4;
                        slippageConfig4 = slippageConfig2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 6:
                        i6 |= 64;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        slippageConfig2 = slippageConfig4;
                        slippageConfig4 = slippageConfig2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 7:
                        i6 |= 128;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        slippageConfig2 = slippageConfig4;
                        slippageConfig4 = slippageConfig2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 8:
                        i6 |= 256;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        slippageConfig2 = slippageConfig4;
                        slippageConfig4 = slippageConfig2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 9:
                        i6 |= 512;
                        accountInfo2 = (AccountInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, AccountInfo$$serializer.INSTANCE, accountInfo2);
                        slippageConfig2 = slippageConfig4;
                        slippageConfig4 = slippageConfig2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            SlippageConfig slippageConfig5 = slippageConfig4;
            String str8 = str7;
            quoteExt = quoteExt3;
            accountInfo = accountInfo2;
            str = strDecodeStringElement7;
            str2 = strDecodeStringElement9;
            str3 = strDecodeStringElement10;
            str4 = str8;
            liquidityConfig = liquidityConfig3;
            str5 = strDecodeStringElement8;
            i = i6;
            slippageConfig = slippageConfig5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new V6QuoteRequest(i, str4, str3, slippageConfig, liquidityConfig, quoteExt, str2, str5, str, strDecodeStringElement, accountInfo, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull V6QuoteRequest v6QuoteRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(v6QuoteRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        V6QuoteRequest.write$Self$OKDex_dex_impl(v6QuoteRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

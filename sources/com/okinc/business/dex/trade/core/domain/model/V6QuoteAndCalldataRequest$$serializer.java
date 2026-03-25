package com.okinc.business.dex.trade.core.domain.model;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo$$serializer;
import com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig;
import com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig$$serializer;
import com.okinc.business.dex.trade.core.domain.model.common.NetworkFee;
import com.okinc.business.dex.trade.core.domain.model.common.NetworkFee$$serializer;
import com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig;
import com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig$$serializer;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class V6QuoteAndCalldataRequest$$serializer implements GeneratedSerializer<V6QuoteAndCalldataRequest> {
    public static final int $stable;
    public static final V6QuoteAndCalldataRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private V6QuoteAndCalldataRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        V6QuoteAndCalldataRequest$$serializer v6QuoteAndCalldataRequest$$serializer = new V6QuoteAndCalldataRequest$$serializer();
        INSTANCE = v6QuoteAndCalldataRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest", v6QuoteAndCalldataRequest$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("simulate", true);
        pluginGeneratedSerialDescriptor.addElement("slippageConfig", false);
        pluginGeneratedSerialDescriptor.addElement("liquidityConfig", true);
        pluginGeneratedSerialDescriptor.addElement("preSetConfig", false);
        pluginGeneratedSerialDescriptor.addElement("ext", true);
        pluginGeneratedSerialDescriptor.addElement("tradeMode", false);
        pluginGeneratedSerialDescriptor.addElement("orderSource", true);
        pluginGeneratedSerialDescriptor.addElement("networkFee", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement("fromTokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("toTokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.AMOUNT, false);
        pluginGeneratedSerialDescriptor.addElement("userWalletAddress", false);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, true);
        pluginGeneratedSerialDescriptor.addElement("accountInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), SlippageConfig$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(LiquidityConfig$$serializer.INSTANCE), PreSetConfig$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(QuoteExt$$serializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(NetworkFee$$serializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(AccountInfo$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final V6QuoteAndCalldataRequest deserialize(@NotNull Decoder decoder) {
        String str;
        AccountInfo accountInfo;
        PreSetConfig preSetConfig;
        LiquidityConfig liquidityConfig;
        int i;
        QuoteExt quoteExt;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        SlippageConfig slippageConfig;
        NetworkFee networkFee;
        Boolean bool;
        String str7;
        String str8;
        PreSetConfig preSetConfig2;
        LiquidityConfig liquidityConfig2;
        SlippageConfig slippageConfig2;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 10;
        int i5 = 9;
        int i6 = 7;
        int i7 = 6;
        int i8 = 8;
        AccountInfo accountInfo2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, null);
            SlippageConfig slippageConfig3 = (SlippageConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, SlippageConfig$$serializer.INSTANCE, null);
            LiquidityConfig liquidityConfig3 = (LiquidityConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LiquidityConfig$$serializer.INSTANCE, null);
            PreSetConfig preSetConfig3 = (PreSetConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, PreSetConfig$$serializer.INSTANCE, null);
            QuoteExt quoteExt2 = (QuoteExt) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, QuoteExt$$serializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            NetworkFee networkFee2 = (NetworkFee) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, NetworkFee$$serializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            accountInfo = (AccountInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, AccountInfo$$serializer.INSTANCE, null);
            networkFee = networkFee2;
            str2 = strDecodeStringElement4;
            str7 = strDecodeStringElement3;
            str8 = strDecodeStringElement2;
            str5 = str9;
            str6 = strDecodeStringElement;
            str4 = strDecodeStringElement5;
            slippageConfig = slippageConfig3;
            str3 = strDecodeStringElement6;
            liquidityConfig = liquidityConfig3;
            i = 32767;
            preSetConfig = preSetConfig3;
            quoteExt = quoteExt2;
            bool = bool2;
        } else {
            int i9 = 14;
            int i10 = 0;
            boolean z = true;
            String str10 = null;
            String str11 = null;
            String strDecodeStringElement7 = null;
            NetworkFee networkFee3 = null;
            QuoteExt quoteExt3 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            PreSetConfig preSetConfig4 = null;
            LiquidityConfig liquidityConfig4 = null;
            SlippageConfig slippageConfig4 = null;
            Boolean bool3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        preSetConfig2 = preSetConfig4;
                        liquidityConfig2 = liquidityConfig4;
                        slippageConfig2 = slippageConfig4;
                        z = false;
                        preSetConfig4 = preSetConfig2;
                        liquidityConfig4 = liquidityConfig2;
                        slippageConfig4 = slippageConfig2;
                        i9 = 14;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        i8 = 8;
                        break;
                    case 0:
                        preSetConfig2 = preSetConfig4;
                        liquidityConfig2 = liquidityConfig4;
                        slippageConfig2 = slippageConfig4;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, bool3);
                        i10 |= 1;
                        preSetConfig4 = preSetConfig2;
                        liquidityConfig4 = liquidityConfig2;
                        slippageConfig4 = slippageConfig2;
                        i9 = 14;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        i8 = 8;
                        break;
                    case 1:
                        preSetConfig2 = preSetConfig4;
                        liquidityConfig2 = liquidityConfig4;
                        slippageConfig4 = (SlippageConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, SlippageConfig$$serializer.INSTANCE, slippageConfig4);
                        i10 |= 2;
                        slippageConfig2 = slippageConfig4;
                        preSetConfig4 = preSetConfig2;
                        liquidityConfig4 = liquidityConfig2;
                        slippageConfig4 = slippageConfig2;
                        i9 = 14;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        i8 = 8;
                        break;
                    case 2:
                        preSetConfig2 = preSetConfig4;
                        liquidityConfig4 = (LiquidityConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LiquidityConfig$$serializer.INSTANCE, liquidityConfig4);
                        i10 |= 4;
                        liquidityConfig2 = liquidityConfig4;
                        slippageConfig2 = slippageConfig4;
                        preSetConfig4 = preSetConfig2;
                        liquidityConfig4 = liquidityConfig2;
                        slippageConfig4 = slippageConfig2;
                        i9 = 14;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        i8 = 8;
                        break;
                    case 3:
                        i10 |= 8;
                        liquidityConfig2 = liquidityConfig4;
                        slippageConfig2 = slippageConfig4;
                        preSetConfig2 = (PreSetConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, PreSetConfig$$serializer.INSTANCE, preSetConfig4);
                        preSetConfig4 = preSetConfig2;
                        liquidityConfig4 = liquidityConfig2;
                        slippageConfig4 = slippageConfig2;
                        i9 = 14;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        i8 = 8;
                        break;
                    case 4:
                        quoteExt3 = (QuoteExt) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, QuoteExt$$serializer.INSTANCE, quoteExt3);
                        i2 = i10 | 16;
                        i10 = i2;
                        preSetConfig2 = preSetConfig4;
                        liquidityConfig2 = liquidityConfig4;
                        slippageConfig2 = slippageConfig4;
                        preSetConfig4 = preSetConfig2;
                        liquidityConfig4 = liquidityConfig2;
                        slippageConfig4 = slippageConfig2;
                        i9 = 14;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        i8 = 8;
                        break;
                    case 5:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i10 |= 32;
                        preSetConfig2 = preSetConfig4;
                        liquidityConfig2 = liquidityConfig4;
                        slippageConfig2 = slippageConfig4;
                        preSetConfig4 = preSetConfig2;
                        liquidityConfig4 = liquidityConfig2;
                        slippageConfig4 = slippageConfig2;
                        i9 = 14;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        i8 = 8;
                        break;
                    case 6:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i7, StringSerializer.INSTANCE, str11);
                        i2 = i10 | 64;
                        i10 = i2;
                        preSetConfig2 = preSetConfig4;
                        liquidityConfig2 = liquidityConfig4;
                        slippageConfig2 = slippageConfig4;
                        preSetConfig4 = preSetConfig2;
                        liquidityConfig4 = liquidityConfig2;
                        slippageConfig4 = slippageConfig2;
                        i9 = 14;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        i8 = 8;
                        break;
                    case 7:
                        i10 |= 128;
                        networkFee3 = (NetworkFee) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, NetworkFee$$serializer.INSTANCE, networkFee3);
                        preSetConfig2 = preSetConfig4;
                        liquidityConfig2 = liquidityConfig4;
                        slippageConfig2 = slippageConfig4;
                        preSetConfig4 = preSetConfig2;
                        liquidityConfig4 = liquidityConfig2;
                        slippageConfig4 = slippageConfig2;
                        i9 = 14;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        i8 = 8;
                        break;
                    case 8:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i8);
                        i10 |= 256;
                        i9 = 14;
                        break;
                    case 9:
                        i10 |= 512;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        preSetConfig2 = preSetConfig4;
                        liquidityConfig2 = liquidityConfig4;
                        slippageConfig2 = slippageConfig4;
                        preSetConfig4 = preSetConfig2;
                        liquidityConfig4 = liquidityConfig2;
                        slippageConfig4 = slippageConfig2;
                        i9 = 14;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        i8 = 8;
                        break;
                    case 10:
                        i10 |= 1024;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        preSetConfig2 = preSetConfig4;
                        liquidityConfig2 = liquidityConfig4;
                        slippageConfig2 = slippageConfig4;
                        preSetConfig4 = preSetConfig2;
                        liquidityConfig4 = liquidityConfig2;
                        slippageConfig4 = slippageConfig2;
                        i9 = 14;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        i8 = 8;
                        break;
                    case 11:
                        i10 |= 2048;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        preSetConfig2 = preSetConfig4;
                        liquidityConfig2 = liquidityConfig4;
                        slippageConfig2 = slippageConfig4;
                        preSetConfig4 = preSetConfig2;
                        liquidityConfig4 = liquidityConfig2;
                        slippageConfig4 = slippageConfig2;
                        i9 = 14;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        i8 = 8;
                        break;
                    case 12:
                        i10 |= 4096;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        preSetConfig2 = preSetConfig4;
                        liquidityConfig2 = liquidityConfig4;
                        slippageConfig2 = slippageConfig4;
                        preSetConfig4 = preSetConfig2;
                        liquidityConfig4 = liquidityConfig2;
                        slippageConfig4 = slippageConfig2;
                        i9 = 14;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        i8 = 8;
                        break;
                    case 13:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str10);
                        i3 = i10 | 8192;
                        i10 = i3;
                        preSetConfig2 = preSetConfig4;
                        liquidityConfig2 = liquidityConfig4;
                        slippageConfig2 = slippageConfig4;
                        preSetConfig4 = preSetConfig2;
                        liquidityConfig4 = liquidityConfig2;
                        slippageConfig4 = slippageConfig2;
                        i9 = 14;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        i8 = 8;
                        break;
                    case 14:
                        accountInfo2 = (AccountInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i9, AccountInfo$$serializer.INSTANCE, accountInfo2);
                        i3 = i10 | 16384;
                        i10 = i3;
                        preSetConfig2 = preSetConfig4;
                        liquidityConfig2 = liquidityConfig4;
                        slippageConfig2 = slippageConfig4;
                        preSetConfig4 = preSetConfig2;
                        liquidityConfig4 = liquidityConfig2;
                        slippageConfig4 = slippageConfig2;
                        i9 = 14;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        i8 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            LiquidityConfig liquidityConfig5 = liquidityConfig4;
            SlippageConfig slippageConfig5 = slippageConfig4;
            str = str10;
            accountInfo = accountInfo2;
            preSetConfig = preSetConfig4;
            liquidityConfig = liquidityConfig5;
            i = i10;
            quoteExt = quoteExt3;
            str2 = strDecodeStringElement8;
            str3 = strDecodeStringElement9;
            str4 = strDecodeStringElement10;
            str5 = str11;
            str6 = strDecodeStringElement7;
            slippageConfig = slippageConfig5;
            networkFee = networkFee3;
            bool = bool3;
            String str12 = strDecodeStringElement12;
            str7 = strDecodeStringElement11;
            str8 = str12;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new V6QuoteAndCalldataRequest(i, bool, slippageConfig, liquidityConfig, preSetConfig, quoteExt, str6, str5, networkFee, str8, str7, str2, str4, str3, str, accountInfo, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(v6QuoteAndCalldataRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        V6QuoteAndCalldataRequest.write$Self$OKDex_dex_impl(v6QuoteAndCalldataRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

package com.okinc.unify_trade.biz;

import com.okinc.unify_trade.biz.bot.AiBotDto;
import com.okinc.unify_trade.biz.bot.AiBotDto$$serializer;
import com.okinc.unify_trade.biz.bot.BacktestDto;
import com.okinc.unify_trade.biz.bot.BacktestDto$$serializer;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.biz.bot.BotCommon$$serializer;
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

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class BotVo$$serializer implements GeneratedSerializer<BotVo> {
    public static final int $stable;
    public static final BotVo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BotVo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BotVo$$serializer botVo$$serializer = new BotVo$$serializer();
        INSTANCE = botVo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.BotVo", botVo$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("smartArbitrage", true);
        pluginGeneratedSerialDescriptor.addElement("common", true);
        pluginGeneratedSerialDescriptor.addElement("userInfo", true);
        pluginGeneratedSerialDescriptor.addElement("compliancePauseDisplayType", true);
        pluginGeneratedSerialDescriptor.addElement("spotGrid", true);
        pluginGeneratedSerialDescriptor.addElement("ai", true);
        pluginGeneratedSerialDescriptor.addElement("backtest", true);
        pluginGeneratedSerialDescriptor.addElement("contractGrid", true);
        pluginGeneratedSerialDescriptor.addElement("spotDca", true);
        pluginGeneratedSerialDescriptor.addElement("recurring", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(SmartArbitrageVo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(BotCommon$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(UserInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(SpotGridVo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(AiBotDto$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(BacktestDto$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ContractGridVo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(SpotDCADto$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(RecurringBuyDto$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BotVo deserialize(@NotNull Decoder decoder) {
        int i;
        SpotDCADto spotDCADto;
        RecurringBuyDto recurringBuyDto;
        BotCommon botCommon;
        UserInfo userInfo;
        ContractGridVo contractGridVo;
        SpotGridVo spotGridVo;
        String str;
        AiBotDto aiBotDto;
        BacktestDto backtestDto;
        SmartArbitrageVo smartArbitrageVo;
        AiBotDto aiBotDto2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 9;
        int i3 = 7;
        int i4 = 6;
        ContractGridVo contractGridVo2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            SmartArbitrageVo smartArbitrageVo2 = (SmartArbitrageVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, SmartArbitrageVo$$serializer.INSTANCE, null);
            BotCommon botCommon2 = (BotCommon) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, BotCommon$$serializer.INSTANCE, null);
            UserInfo userInfo2 = (UserInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, UserInfo$$serializer.INSTANCE, null);
            String str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, null);
            SpotGridVo spotGridVo2 = (SpotGridVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, SpotGridVo$$serializer.INSTANCE, null);
            AiBotDto aiBotDto3 = (AiBotDto) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, AiBotDto$$serializer.INSTANCE, null);
            BacktestDto backtestDto2 = (BacktestDto) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BacktestDto$$serializer.INSTANCE, null);
            ContractGridVo contractGridVo3 = (ContractGridVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, ContractGridVo$$serializer.INSTANCE, null);
            SpotDCADto spotDCADto2 = (SpotDCADto) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, SpotDCADto$$serializer.INSTANCE, null);
            recurringBuyDto = (RecurringBuyDto) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, RecurringBuyDto$$serializer.INSTANCE, null);
            contractGridVo = contractGridVo3;
            backtestDto = backtestDto2;
            aiBotDto = aiBotDto3;
            spotDCADto = spotDCADto2;
            spotGridVo = spotGridVo2;
            i = 1023;
            smartArbitrageVo = smartArbitrageVo2;
            str = str2;
            userInfo = userInfo2;
            botCommon = botCommon2;
        } else {
            int i5 = 0;
            boolean z = true;
            SpotDCADto spotDCADto3 = null;
            BacktestDto backtestDto3 = null;
            RecurringBuyDto recurringBuyDto2 = null;
            BotCommon botCommon3 = null;
            UserInfo userInfo3 = null;
            SpotGridVo spotGridVo3 = null;
            String str3 = null;
            AiBotDto aiBotDto4 = null;
            SmartArbitrageVo smartArbitrageVo3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        aiBotDto2 = aiBotDto4;
                        z = false;
                        aiBotDto4 = aiBotDto2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 0:
                        aiBotDto2 = aiBotDto4;
                        smartArbitrageVo3 = (SmartArbitrageVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, SmartArbitrageVo$$serializer.INSTANCE, smartArbitrageVo3);
                        i5 |= 1;
                        aiBotDto4 = aiBotDto2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 1:
                        aiBotDto2 = aiBotDto4;
                        botCommon3 = (BotCommon) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, BotCommon$$serializer.INSTANCE, botCommon3);
                        i5 |= 2;
                        aiBotDto4 = aiBotDto2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 2:
                        aiBotDto2 = aiBotDto4;
                        userInfo3 = (UserInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, UserInfo$$serializer.INSTANCE, userInfo3);
                        i5 |= 4;
                        aiBotDto4 = aiBotDto2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 3:
                        aiBotDto2 = aiBotDto4;
                        str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str3);
                        i5 |= 8;
                        aiBotDto4 = aiBotDto2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 4:
                        aiBotDto2 = aiBotDto4;
                        spotGridVo3 = (SpotGridVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, SpotGridVo$$serializer.INSTANCE, spotGridVo3);
                        i5 |= 16;
                        aiBotDto4 = aiBotDto2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 5:
                        aiBotDto2 = (AiBotDto) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, AiBotDto$$serializer.INSTANCE, aiBotDto4);
                        i5 |= 32;
                        aiBotDto4 = aiBotDto2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 6:
                        backtestDto3 = (BacktestDto) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, BacktestDto$$serializer.INSTANCE, backtestDto3);
                        i5 |= 64;
                        aiBotDto2 = aiBotDto4;
                        aiBotDto4 = aiBotDto2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 7:
                        contractGridVo2 = (ContractGridVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, ContractGridVo$$serializer.INSTANCE, contractGridVo2);
                        i5 |= 128;
                        break;
                    case 8:
                        i5 |= 256;
                        spotDCADto3 = (SpotDCADto) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, SpotDCADto$$serializer.INSTANCE, spotDCADto3);
                        aiBotDto2 = aiBotDto4;
                        aiBotDto4 = aiBotDto2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 9:
                        i5 |= 512;
                        recurringBuyDto2 = (RecurringBuyDto) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, RecurringBuyDto$$serializer.INSTANCE, recurringBuyDto2);
                        aiBotDto2 = aiBotDto4;
                        aiBotDto4 = aiBotDto2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            spotDCADto = spotDCADto3;
            recurringBuyDto = recurringBuyDto2;
            botCommon = botCommon3;
            userInfo = userInfo3;
            contractGridVo = contractGridVo2;
            spotGridVo = spotGridVo3;
            str = str3;
            aiBotDto = aiBotDto4;
            backtestDto = backtestDto3;
            smartArbitrageVo = smartArbitrageVo3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BotVo(i, smartArbitrageVo, botCommon, userInfo, str, spotGridVo, aiBotDto, backtestDto, contractGridVo, spotDCADto, recurringBuyDto, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BotVo botVo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(botVo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BotVo.write$Self$OKTradeCore_trade_core(botVo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

package com.okinc.unify_trade.biz;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class StrategyReqGroup$$serializer implements GeneratedSerializer<StrategyReqGroup> {
    public static final int $stable;
    public static final StrategyReqGroup$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private StrategyReqGroup$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        StrategyReqGroup$$serializer strategyReqGroup$$serializer = new StrategyReqGroup$$serializer();
        INSTANCE = strategyReqGroup$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.StrategyReqGroup", strategyReqGroup$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("baseReq", false);
        pluginGeneratedSerialDescriptor.addElement("iceBergReq", true);
        pluginGeneratedSerialDescriptor.addElement("twapReq", true);
        pluginGeneratedSerialDescriptor.addElement("gridReq", true);
        pluginGeneratedSerialDescriptor.addElement("contractGridReq", true);
        pluginGeneratedSerialDescriptor.addElement("movingProfitReq", true);
        pluginGeneratedSerialDescriptor.addElement("signalBotReq", true);
        pluginGeneratedSerialDescriptor.addElement("smartArbitrageReq", true);
        pluginGeneratedSerialDescriptor.addElement("recurringOrderData", true);
        pluginGeneratedSerialDescriptor.addElement("smartPortfolioReq", true);
        pluginGeneratedSerialDescriptor.addElement("dcdReq", true);
        pluginGeneratedSerialDescriptor.addElement("isQuoteSize", true);
        pluginGeneratedSerialDescriptor.addElement("vipProfit", true);
        pluginGeneratedSerialDescriptor.addElement("dcaRequest", true);
        pluginGeneratedSerialDescriptor.addElement("aiBotReq", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StrategyBaseReq$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(IceBergReq$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(TwapReq$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(GridReq$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ContractGridReq$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(StrategyMoveOrderReq$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(SignalBotReq$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(SmartArbitrageReq$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(RecurringOrderData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(SmartPortfolioReq$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(DcdOrderReq$$serializer.INSTANCE), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(AutoVipProfitInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(DcaOrderReq$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(AiOrderReq$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final StrategyReqGroup deserialize(@NotNull Decoder decoder) {
        StrategyBaseReq strategyBaseReq;
        DcaOrderReq dcaOrderReq;
        StrategyMoveOrderReq strategyMoveOrderReq;
        GridReq gridReq;
        SmartArbitrageReq smartArbitrageReq;
        RecurringOrderData recurringOrderData;
        DcdOrderReq dcdOrderReq;
        SmartPortfolioReq smartPortfolioReq;
        IceBergReq iceBergReq;
        AiOrderReq aiOrderReq;
        SignalBotReq signalBotReq;
        boolean z;
        TwapReq twapReq;
        ContractGridReq contractGridReq;
        AutoVipProfitInfo autoVipProfitInfo;
        int i;
        AiOrderReq aiOrderReq2;
        SignalBotReq signalBotReq2;
        StrategyMoveOrderReq strategyMoveOrderReq2;
        ContractGridReq contractGridReq2;
        AiOrderReq aiOrderReq3;
        StrategyMoveOrderReq strategyMoveOrderReq3;
        ContractGridReq contractGridReq3;
        GridReq gridReq2;
        IceBergReq iceBergReq2;
        SignalBotReq signalBotReq3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 11;
        int i3 = 10;
        int i4 = 9;
        TwapReq twapReq2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StrategyBaseReq strategyBaseReq2 = (StrategyBaseReq) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, StrategyBaseReq$$serializer.INSTANCE, null);
            IceBergReq iceBergReq3 = (IceBergReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IceBergReq$$serializer.INSTANCE, null);
            TwapReq twapReq3 = (TwapReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, TwapReq$$serializer.INSTANCE, null);
            GridReq gridReq3 = (GridReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, GridReq$$serializer.INSTANCE, null);
            ContractGridReq contractGridReq4 = (ContractGridReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, ContractGridReq$$serializer.INSTANCE, null);
            StrategyMoveOrderReq strategyMoveOrderReq4 = (StrategyMoveOrderReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StrategyMoveOrderReq$$serializer.INSTANCE, null);
            SignalBotReq signalBotReq4 = (SignalBotReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, SignalBotReq$$serializer.INSTANCE, null);
            SmartArbitrageReq smartArbitrageReq2 = (SmartArbitrageReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, SmartArbitrageReq$$serializer.INSTANCE, null);
            RecurringOrderData recurringOrderData2 = (RecurringOrderData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, RecurringOrderData$$serializer.INSTANCE, null);
            SmartPortfolioReq smartPortfolioReq2 = (SmartPortfolioReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, SmartPortfolioReq$$serializer.INSTANCE, null);
            DcdOrderReq dcdOrderReq2 = (DcdOrderReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, DcdOrderReq$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            AutoVipProfitInfo autoVipProfitInfo2 = (AutoVipProfitInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, AutoVipProfitInfo$$serializer.INSTANCE, null);
            dcaOrderReq = (DcaOrderReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, DcaOrderReq$$serializer.INSTANCE, null);
            aiOrderReq = (AiOrderReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, AiOrderReq$$serializer.INSTANCE, null);
            i = 32767;
            z = zDecodeBooleanElement;
            dcdOrderReq = dcdOrderReq2;
            smartPortfolioReq = smartPortfolioReq2;
            smartArbitrageReq = smartArbitrageReq2;
            signalBotReq = signalBotReq4;
            strategyMoveOrderReq = strategyMoveOrderReq4;
            gridReq = gridReq3;
            recurringOrderData = recurringOrderData2;
            contractGridReq = contractGridReq4;
            autoVipProfitInfo = autoVipProfitInfo2;
            iceBergReq = iceBergReq3;
            strategyBaseReq = strategyBaseReq2;
            twapReq = twapReq3;
        } else {
            int i5 = 14;
            int i6 = 0;
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            AiOrderReq aiOrderReq4 = null;
            DcaOrderReq dcaOrderReq2 = null;
            SmartArbitrageReq smartArbitrageReq3 = null;
            RecurringOrderData recurringOrderData3 = null;
            DcdOrderReq dcdOrderReq3 = null;
            SmartPortfolioReq smartPortfolioReq3 = null;
            AutoVipProfitInfo autoVipProfitInfo3 = null;
            SignalBotReq signalBotReq5 = null;
            StrategyMoveOrderReq strategyMoveOrderReq5 = null;
            ContractGridReq contractGridReq5 = null;
            GridReq gridReq4 = null;
            IceBergReq iceBergReq4 = null;
            StrategyBaseReq strategyBaseReq3 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        aiOrderReq3 = aiOrderReq4;
                        strategyMoveOrderReq3 = strategyMoveOrderReq5;
                        contractGridReq3 = contractGridReq5;
                        gridReq2 = gridReq4;
                        iceBergReq2 = iceBergReq4;
                        signalBotReq3 = signalBotReq5;
                        z2 = false;
                        strategyMoveOrderReq5 = strategyMoveOrderReq3;
                        contractGridReq5 = contractGridReq3;
                        gridReq4 = gridReq2;
                        aiOrderReq4 = aiOrderReq3;
                        signalBotReq5 = signalBotReq3;
                        i5 = 14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        iceBergReq4 = iceBergReq2;
                        break;
                    case 0:
                        aiOrderReq3 = aiOrderReq4;
                        strategyMoveOrderReq3 = strategyMoveOrderReq5;
                        contractGridReq3 = contractGridReq5;
                        gridReq2 = gridReq4;
                        IceBergReq iceBergReq5 = iceBergReq4;
                        signalBotReq3 = signalBotReq5;
                        iceBergReq2 = iceBergReq5;
                        i6 |= 1;
                        strategyBaseReq3 = (StrategyBaseReq) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, StrategyBaseReq$$serializer.INSTANCE, strategyBaseReq3);
                        strategyMoveOrderReq5 = strategyMoveOrderReq3;
                        contractGridReq5 = contractGridReq3;
                        gridReq4 = gridReq2;
                        aiOrderReq4 = aiOrderReq3;
                        signalBotReq5 = signalBotReq3;
                        i5 = 14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        iceBergReq4 = iceBergReq2;
                        break;
                    case 1:
                        aiOrderReq3 = aiOrderReq4;
                        strategyMoveOrderReq3 = strategyMoveOrderReq5;
                        contractGridReq3 = contractGridReq5;
                        gridReq2 = gridReq4;
                        IceBergReq iceBergReq6 = iceBergReq4;
                        signalBotReq3 = signalBotReq5;
                        i6 |= 2;
                        iceBergReq2 = (IceBergReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IceBergReq$$serializer.INSTANCE, iceBergReq6);
                        strategyMoveOrderReq5 = strategyMoveOrderReq3;
                        contractGridReq5 = contractGridReq3;
                        gridReq4 = gridReq2;
                        aiOrderReq4 = aiOrderReq3;
                        signalBotReq5 = signalBotReq3;
                        i5 = 14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        iceBergReq4 = iceBergReq2;
                        break;
                    case 2:
                        aiOrderReq2 = aiOrderReq4;
                        twapReq2 = (TwapReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, TwapReq$$serializer.INSTANCE, twapReq2);
                        i6 |= 4;
                        aiOrderReq4 = aiOrderReq2;
                        i5 = 14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 3:
                        signalBotReq2 = signalBotReq5;
                        strategyMoveOrderReq2 = strategyMoveOrderReq5;
                        contractGridReq2 = contractGridReq5;
                        aiOrderReq2 = aiOrderReq4;
                        i6 |= 8;
                        gridReq4 = (GridReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, GridReq$$serializer.INSTANCE, gridReq4);
                        signalBotReq5 = signalBotReq2;
                        strategyMoveOrderReq5 = strategyMoveOrderReq2;
                        contractGridReq5 = contractGridReq2;
                        aiOrderReq4 = aiOrderReq2;
                        i5 = 14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 4:
                        signalBotReq2 = signalBotReq5;
                        strategyMoveOrderReq2 = strategyMoveOrderReq5;
                        contractGridReq2 = (ContractGridReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, ContractGridReq$$serializer.INSTANCE, contractGridReq5);
                        i6 |= 16;
                        aiOrderReq2 = aiOrderReq4;
                        signalBotReq5 = signalBotReq2;
                        strategyMoveOrderReq5 = strategyMoveOrderReq2;
                        contractGridReq5 = contractGridReq2;
                        aiOrderReq4 = aiOrderReq2;
                        i5 = 14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 5:
                        signalBotReq2 = signalBotReq5;
                        strategyMoveOrderReq2 = (StrategyMoveOrderReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StrategyMoveOrderReq$$serializer.INSTANCE, strategyMoveOrderReq5);
                        i6 |= 32;
                        aiOrderReq2 = aiOrderReq4;
                        contractGridReq2 = contractGridReq5;
                        signalBotReq5 = signalBotReq2;
                        strategyMoveOrderReq5 = strategyMoveOrderReq2;
                        contractGridReq5 = contractGridReq2;
                        aiOrderReq4 = aiOrderReq2;
                        i5 = 14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 6:
                        signalBotReq2 = (SignalBotReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, SignalBotReq$$serializer.INSTANCE, signalBotReq5);
                        i6 |= 64;
                        aiOrderReq2 = aiOrderReq4;
                        strategyMoveOrderReq2 = strategyMoveOrderReq5;
                        contractGridReq2 = contractGridReq5;
                        signalBotReq5 = signalBotReq2;
                        strategyMoveOrderReq5 = strategyMoveOrderReq2;
                        contractGridReq5 = contractGridReq2;
                        aiOrderReq4 = aiOrderReq2;
                        i5 = 14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 7:
                        smartArbitrageReq3 = (SmartArbitrageReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, SmartArbitrageReq$$serializer.INSTANCE, smartArbitrageReq3);
                        i6 |= 128;
                        aiOrderReq2 = aiOrderReq4;
                        signalBotReq2 = signalBotReq5;
                        strategyMoveOrderReq2 = strategyMoveOrderReq5;
                        contractGridReq2 = contractGridReq5;
                        signalBotReq5 = signalBotReq2;
                        strategyMoveOrderReq5 = strategyMoveOrderReq2;
                        contractGridReq5 = contractGridReq2;
                        aiOrderReq4 = aiOrderReq2;
                        i5 = 14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 8:
                        recurringOrderData3 = (RecurringOrderData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, RecurringOrderData$$serializer.INSTANCE, recurringOrderData3);
                        i6 |= 256;
                        aiOrderReq2 = aiOrderReq4;
                        signalBotReq2 = signalBotReq5;
                        strategyMoveOrderReq2 = strategyMoveOrderReq5;
                        contractGridReq2 = contractGridReq5;
                        signalBotReq5 = signalBotReq2;
                        strategyMoveOrderReq5 = strategyMoveOrderReq2;
                        contractGridReq5 = contractGridReq2;
                        aiOrderReq4 = aiOrderReq2;
                        i5 = 14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 9:
                        i6 |= 512;
                        aiOrderReq2 = aiOrderReq4;
                        smartPortfolioReq3 = (SmartPortfolioReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, SmartPortfolioReq$$serializer.INSTANCE, smartPortfolioReq3);
                        signalBotReq2 = signalBotReq5;
                        strategyMoveOrderReq2 = strategyMoveOrderReq5;
                        contractGridReq2 = contractGridReq5;
                        signalBotReq5 = signalBotReq2;
                        strategyMoveOrderReq5 = strategyMoveOrderReq2;
                        contractGridReq5 = contractGridReq2;
                        aiOrderReq4 = aiOrderReq2;
                        i5 = 14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 10:
                        dcdOrderReq3 = (DcdOrderReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, DcdOrderReq$$serializer.INSTANCE, dcdOrderReq3);
                        i6 |= 1024;
                        aiOrderReq2 = aiOrderReq4;
                        signalBotReq2 = signalBotReq5;
                        strategyMoveOrderReq2 = strategyMoveOrderReq5;
                        contractGridReq2 = contractGridReq5;
                        signalBotReq5 = signalBotReq2;
                        strategyMoveOrderReq5 = strategyMoveOrderReq2;
                        contractGridReq5 = contractGridReq2;
                        aiOrderReq4 = aiOrderReq2;
                        i5 = 14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 11:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i6 |= 2048;
                        aiOrderReq2 = aiOrderReq4;
                        signalBotReq2 = signalBotReq5;
                        strategyMoveOrderReq2 = strategyMoveOrderReq5;
                        contractGridReq2 = contractGridReq5;
                        signalBotReq5 = signalBotReq2;
                        strategyMoveOrderReq5 = strategyMoveOrderReq2;
                        contractGridReq5 = contractGridReq2;
                        aiOrderReq4 = aiOrderReq2;
                        i5 = 14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 12:
                        i6 |= 4096;
                        aiOrderReq2 = aiOrderReq4;
                        autoVipProfitInfo3 = (AutoVipProfitInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, AutoVipProfitInfo$$serializer.INSTANCE, autoVipProfitInfo3);
                        signalBotReq2 = signalBotReq5;
                        strategyMoveOrderReq2 = strategyMoveOrderReq5;
                        contractGridReq2 = contractGridReq5;
                        signalBotReq5 = signalBotReq2;
                        strategyMoveOrderReq5 = strategyMoveOrderReq2;
                        contractGridReq5 = contractGridReq2;
                        aiOrderReq4 = aiOrderReq2;
                        i5 = 14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 13:
                        dcaOrderReq2 = (DcaOrderReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, DcaOrderReq$$serializer.INSTANCE, dcaOrderReq2);
                        i6 |= 8192;
                        aiOrderReq2 = aiOrderReq4;
                        signalBotReq2 = signalBotReq5;
                        strategyMoveOrderReq2 = strategyMoveOrderReq5;
                        contractGridReq2 = contractGridReq5;
                        signalBotReq5 = signalBotReq2;
                        strategyMoveOrderReq5 = strategyMoveOrderReq2;
                        contractGridReq5 = contractGridReq2;
                        aiOrderReq4 = aiOrderReq2;
                        i5 = 14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 14:
                        aiOrderReq4 = (AiOrderReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, AiOrderReq$$serializer.INSTANCE, aiOrderReq4);
                        i6 |= 16384;
                        aiOrderReq2 = aiOrderReq4;
                        signalBotReq2 = signalBotReq5;
                        strategyMoveOrderReq2 = strategyMoveOrderReq5;
                        contractGridReq2 = contractGridReq5;
                        signalBotReq5 = signalBotReq2;
                        strategyMoveOrderReq5 = strategyMoveOrderReq2;
                        contractGridReq5 = contractGridReq2;
                        aiOrderReq4 = aiOrderReq2;
                        i5 = 14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            ContractGridReq contractGridReq6 = contractGridReq5;
            IceBergReq iceBergReq7 = iceBergReq4;
            SignalBotReq signalBotReq6 = signalBotReq5;
            strategyBaseReq = strategyBaseReq3;
            dcaOrderReq = dcaOrderReq2;
            strategyMoveOrderReq = strategyMoveOrderReq5;
            gridReq = gridReq4;
            smartArbitrageReq = smartArbitrageReq3;
            recurringOrderData = recurringOrderData3;
            dcdOrderReq = dcdOrderReq3;
            smartPortfolioReq = smartPortfolioReq3;
            iceBergReq = iceBergReq7;
            aiOrderReq = aiOrderReq4;
            signalBotReq = signalBotReq6;
            z = zDecodeBooleanElement2;
            twapReq = twapReq2;
            contractGridReq = contractGridReq6;
            autoVipProfitInfo = autoVipProfitInfo3;
            i = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new StrategyReqGroup(i, strategyBaseReq, iceBergReq, twapReq, gridReq, contractGridReq, strategyMoveOrderReq, signalBotReq, smartArbitrageReq, recurringOrderData, smartPortfolioReq, dcdOrderReq, z, autoVipProfitInfo, dcaOrderReq, aiOrderReq, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull StrategyReqGroup strategyReqGroup) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(strategyReqGroup, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        StrategyReqGroup.write$Self$OKTradeCore_trade_core(strategyReqGroup, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

package com.okinc.unify_trade.biz.bot;

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

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class BotCommon$$serializer implements GeneratedSerializer<BotCommon> {
    public static final int $stable;
    public static final BotCommon$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BotCommon$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BotCommon$$serializer botCommon$$serializer = new BotCommon$$serializer();
        INSTANCE = botCommon$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.bot.BotCommon", botCommon$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("autoEarn", true);
        pluginGeneratedSerialDescriptor.addElement("autoStaking", true);
        pluginGeneratedSerialDescriptor.addElement("syncParamFailed", true);
        pluginGeneratedSerialDescriptor.addElement("syncParamLeader", true);
        pluginGeneratedSerialDescriptor.addElement("isPinned", true);
        pluginGeneratedSerialDescriptor.addElement("stgyName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        AutoEarnStakingParam$$serializer autoEarnStakingParam$$serializer = AutoEarnStakingParam$$serializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(autoEarnStakingParam$$serializer), BuiltinSerializersKt.getNullable(autoEarnStakingParam$$serializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BotCommon deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        AutoEarnStakingParam autoEarnStakingParam;
        Boolean bool;
        AutoEarnStakingParam autoEarnStakingParam2;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            AutoEarnStakingParam$$serializer autoEarnStakingParam$$serializer = AutoEarnStakingParam$$serializer.INSTANCE;
            AutoEarnStakingParam autoEarnStakingParam3 = (AutoEarnStakingParam) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, autoEarnStakingParam$$serializer, null);
            AutoEarnStakingParam autoEarnStakingParam4 = (AutoEarnStakingParam) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, autoEarnStakingParam$$serializer, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            autoEarnStakingParam = autoEarnStakingParam4;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            str2 = str3;
            z = zDecodeBooleanElement;
            bool = bool2;
            autoEarnStakingParam2 = autoEarnStakingParam3;
            i = 63;
        } else {
            boolean zDecodeBooleanElement2 = false;
            boolean z3 = true;
            Boolean bool3 = null;
            String str4 = null;
            AutoEarnStakingParam autoEarnStakingParam5 = null;
            String str5 = null;
            AutoEarnStakingParam autoEarnStakingParam6 = null;
            i = 0;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        z3 = false;
                        i2 = 5;
                        break;
                    case 0:
                        z2 = false;
                        i |= 1;
                        autoEarnStakingParam6 = (AutoEarnStakingParam) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, AutoEarnStakingParam$$serializer.INSTANCE, autoEarnStakingParam6);
                        i2 = 5;
                        break;
                    case 1:
                        i |= 2;
                        autoEarnStakingParam5 = (AutoEarnStakingParam) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, AutoEarnStakingParam$$serializer.INSTANCE, autoEarnStakingParam5);
                        break;
                    case 2:
                        i |= 4;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool3);
                        break;
                    case 3:
                        i |= 8;
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str4);
                        break;
                    case 4:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        i |= 32;
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str5);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str5;
            str2 = str4;
            autoEarnStakingParam = autoEarnStakingParam5;
            bool = bool3;
            autoEarnStakingParam2 = autoEarnStakingParam6;
            z = zDecodeBooleanElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BotCommon(i, autoEarnStakingParam2, autoEarnStakingParam, bool, str2, z, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BotCommon botCommon) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(botCommon, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BotCommon.write$Self$OKTradeCore_trade_core(botCommon, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

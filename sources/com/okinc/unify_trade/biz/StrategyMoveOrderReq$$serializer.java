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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class StrategyMoveOrderReq$$serializer implements GeneratedSerializer<StrategyMoveOrderReq> {
    public static final int $stable;
    public static final StrategyMoveOrderReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private StrategyMoveOrderReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        StrategyMoveOrderReq$$serializer strategyMoveOrderReq$$serializer = new StrategyMoveOrderReq$$serializer();
        INSTANCE = strategyMoveOrderReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.StrategyMoveOrderReq", strategyMoveOrderReq$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("callbackRatio", false);
        pluginGeneratedSerialDescriptor.addElement("callbackSpread", false);
        pluginGeneratedSerialDescriptor.addElement("activePx", false);
        pluginGeneratedSerialDescriptor.addElement("showSz", true);
        pluginGeneratedSerialDescriptor.addElement("sz", true);
        pluginGeneratedSerialDescriptor.addElement("activePxType", false);
        pluginGeneratedSerialDescriptor.addElement("currentPrice", false);
        pluginGeneratedSerialDescriptor.addElement("quickMgnType", true);
        pluginGeneratedSerialDescriptor.addElement("isTradeBorrowMode", true);
        pluginGeneratedSerialDescriptor.addElement("ccy", true);
        pluginGeneratedSerialDescriptor.addElement("leftLever", true);
        pluginGeneratedSerialDescriptor.addElement("rightLever", true);
        pluginGeneratedSerialDescriptor.addElement("tradeQuoteCcy", true);
        pluginGeneratedSerialDescriptor.addElement("tag", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final StrategyMoveOrderReq deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Boolean bool;
        int i;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        Boolean bool2;
        String str17;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            bool = bool3;
            str11 = str25;
            str12 = str24;
            str3 = str23;
            str4 = str26;
            str10 = str19;
            str2 = str27;
            str7 = str21;
            str9 = strDecodeStringElement2;
            str13 = str20;
            i = 16383;
            str8 = strDecodeStringElement;
            str5 = str18;
            str = str22;
        } else {
            int i5 = 13;
            String str28 = null;
            String str29 = null;
            String str30 = null;
            String str31 = null;
            String str32 = null;
            String str33 = null;
            String str34 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String str35 = null;
            String str36 = null;
            String str37 = null;
            boolean z = true;
            int i6 = 0;
            Boolean bool4 = null;
            String str38 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str14 = str34;
                        String str39 = str35;
                        str15 = str36;
                        str16 = str37;
                        bool2 = bool4;
                        z = false;
                        str17 = str39;
                        str36 = str15;
                        str34 = str14;
                        str37 = str16;
                        bool4 = bool2;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        str35 = str17;
                        i2 = 10;
                        break;
                    case 0:
                        str14 = str34;
                        str15 = str36;
                        str16 = str37;
                        String str40 = str35;
                        bool2 = bool4;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str40);
                        i6 |= 1;
                        str36 = str15;
                        str34 = str14;
                        str37 = str16;
                        bool4 = bool2;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        str35 = str17;
                        i2 = 10;
                        break;
                    case 1:
                        str14 = str34;
                        str15 = str36;
                        i6 |= 2;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str37);
                        str17 = str35;
                        bool2 = bool4;
                        str36 = str15;
                        str34 = str14;
                        str37 = str16;
                        bool4 = bool2;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        str35 = str17;
                        i2 = 10;
                        break;
                    case 2:
                        str15 = str36;
                        i6 |= 4;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str34);
                        str17 = str35;
                        str16 = str37;
                        bool2 = bool4;
                        str36 = str15;
                        str34 = str14;
                        str37 = str16;
                        bool4 = bool2;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        str35 = str17;
                        i2 = 10;
                        break;
                    case 3:
                        str15 = str36;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        str14 = str34;
                        str17 = str35;
                        str16 = str37;
                        bool2 = bool4;
                        str36 = str15;
                        str34 = str14;
                        str37 = str16;
                        bool4 = bool2;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        str35 = str17;
                        i2 = 10;
                        break;
                    case 4:
                        str15 = str36;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i6 |= 16;
                        str14 = str34;
                        str17 = str35;
                        str16 = str37;
                        bool2 = bool4;
                        str36 = str15;
                        str34 = str14;
                        str37 = str16;
                        bool4 = bool2;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        str35 = str17;
                        i2 = 10;
                        break;
                    case 5:
                        str15 = str36;
                        i6 |= 32;
                        str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str38);
                        str14 = str34;
                        str17 = str35;
                        str16 = str37;
                        bool2 = bool4;
                        str36 = str15;
                        str34 = str14;
                        str37 = str16;
                        bool4 = bool2;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        str35 = str17;
                        i2 = 10;
                        break;
                    case 6:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str36);
                        i6 |= 64;
                        str14 = str34;
                        str17 = str35;
                        str16 = str37;
                        bool2 = bool4;
                        str36 = str15;
                        str34 = str14;
                        str37 = str16;
                        bool4 = bool2;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        str35 = str17;
                        i2 = 10;
                        break;
                    case 7:
                        i6 |= 128;
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str30);
                        str14 = str34;
                        str17 = str35;
                        str15 = str36;
                        str16 = str37;
                        bool2 = bool4;
                        str36 = str15;
                        str34 = str14;
                        str37 = str16;
                        bool4 = bool2;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        str35 = str17;
                        i2 = 10;
                        break;
                    case 8:
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, BooleanSerializer.INSTANCE, bool4);
                        i6 |= 256;
                        str14 = str34;
                        str17 = str35;
                        str15 = str36;
                        str16 = str37;
                        bool2 = bool4;
                        str36 = str15;
                        str34 = str14;
                        str37 = str16;
                        bool4 = bool2;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        str35 = str17;
                        i2 = 10;
                        break;
                    case 9:
                        i6 |= 512;
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str32);
                        str14 = str34;
                        str17 = str35;
                        str15 = str36;
                        str16 = str37;
                        bool2 = bool4;
                        str36 = str15;
                        str34 = str14;
                        str37 = str16;
                        bool4 = bool2;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        str35 = str17;
                        i2 = 10;
                        break;
                    case 10:
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str29);
                        i6 |= 1024;
                        i5 = 13;
                        break;
                    case 11:
                        i6 |= 2048;
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str31);
                        str14 = str34;
                        str17 = str35;
                        str15 = str36;
                        str16 = str37;
                        bool2 = bool4;
                        str36 = str15;
                        str34 = str14;
                        str37 = str16;
                        bool4 = bool2;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        str35 = str17;
                        i2 = 10;
                        break;
                    case 12:
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str28);
                        i6 |= 4096;
                        str14 = str34;
                        str17 = str35;
                        str15 = str36;
                        str16 = str37;
                        bool2 = bool4;
                        str36 = str15;
                        str34 = str14;
                        str37 = str16;
                        bool4 = bool2;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        str35 = str17;
                        i2 = 10;
                        break;
                    case 13:
                        i6 |= 8192;
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str33);
                        str14 = str34;
                        str17 = str35;
                        str15 = str36;
                        str16 = str37;
                        bool2 = bool4;
                        str36 = str15;
                        str34 = str14;
                        str37 = str16;
                        bool4 = bool2;
                        i5 = 13;
                        i3 = 9;
                        i4 = 8;
                        str35 = str17;
                        i2 = 10;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str41 = str34;
            str = str36;
            str2 = str28;
            str3 = str30;
            str4 = str31;
            str5 = str35;
            str6 = str33;
            str7 = str38;
            str8 = strDecodeStringElement3;
            str9 = strDecodeStringElement4;
            bool = bool4;
            i = i6;
            str10 = str37;
            str11 = str29;
            str12 = str32;
            str13 = str41;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new StrategyMoveOrderReq(i, str5, str10, str13, str8, str9, str7, str, str3, bool, str12, str11, str4, str2, str6, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull StrategyMoveOrderReq strategyMoveOrderReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(strategyMoveOrderReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        StrategyMoveOrderReq.write$Self$OKTradeCore_trade_core(strategyMoveOrderReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

package com.okinc.unify_trade.biz;

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

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class BaseTradeStrategyOrderReq$$serializer implements GeneratedSerializer<BaseTradeStrategyOrderReq> {
    public static final int $stable;
    public static final BaseTradeStrategyOrderReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BaseTradeStrategyOrderReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BaseTradeStrategyOrderReq$$serializer baseTradeStrategyOrderReq$$serializer = new BaseTradeStrategyOrderReq$$serializer();
        INSTANCE = baseTradeStrategyOrderReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.BaseTradeStrategyOrderReq", baseTradeStrategyOrderReq$$serializer, 22);
        pluginGeneratedSerialDescriptor.addElement("instId", false);
        pluginGeneratedSerialDescriptor.addElement("tdMode", false);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.SIDE, false);
        pluginGeneratedSerialDescriptor.addElement("posSide", true);
        pluginGeneratedSerialDescriptor.addElement("ccy", true);
        pluginGeneratedSerialDescriptor.addElement("orderType", false);
        pluginGeneratedSerialDescriptor.addElement("sz", false);
        pluginGeneratedSerialDescriptor.addElement("closeFraction", true);
        pluginGeneratedSerialDescriptor.addElement("reduceOnly", false);
        pluginGeneratedSerialDescriptor.addElement("_last", false);
        pluginGeneratedSerialDescriptor.addElement("tgtCcy", true);
        pluginGeneratedSerialDescriptor.addElement("tpTriggerPxType", true);
        pluginGeneratedSerialDescriptor.addElement("slTriggerPxType", true);
        pluginGeneratedSerialDescriptor.addElement("triggerPxType", false);
        pluginGeneratedSerialDescriptor.addElement("proposedPx", true);
        pluginGeneratedSerialDescriptor.addElement("quickMgnType", true);
        pluginGeneratedSerialDescriptor.addElement("instType", false);
        pluginGeneratedSerialDescriptor.addElement("cxlOnClosePos", true);
        pluginGeneratedSerialDescriptor.addElement("isTradeBorrowMode", true);
        pluginGeneratedSerialDescriptor.addElement("banAmend", true);
        pluginGeneratedSerialDescriptor.addElement("tradeQuoteCcy", true);
        pluginGeneratedSerialDescriptor.addElement("advanceOrdType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BaseTradeStrategyOrderReq deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Boolean bool;
        String str11;
        Boolean bool2;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        int i;
        Boolean bool3;
        String str19;
        Boolean bool4;
        int i2;
        Boolean bool5;
        String str20;
        String str21;
        Boolean bool6;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str29 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            String str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            String str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, booleanSerializer, null);
            Boolean bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, booleanSerializer, null);
            String str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, null);
            str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, stringSerializer, null);
            str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, stringSerializer, null);
            i = 4194303;
            str18 = str39;
            str12 = strDecodeStringElement5;
            bool3 = bool9;
            bool2 = bool8;
            str10 = strDecodeStringElement6;
            str7 = str38;
            str19 = strDecodeStringElement;
            str13 = strDecodeStringElement4;
            str16 = str31;
            bool = bool7;
            str3 = str33;
            str9 = str32;
            str6 = str37;
            str15 = str30;
            str14 = strDecodeStringElement3;
            str2 = str34;
            str8 = strDecodeStringElement2;
            str4 = str36;
            str5 = str35;
        } else {
            int i3 = 0;
            boolean z = true;
            Boolean bool10 = null;
            String str40 = null;
            String str41 = null;
            String str42 = null;
            String str43 = null;
            String str44 = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            String str45 = null;
            String str46 = null;
            String str47 = null;
            String str48 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String str49 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String str50 = null;
            String str51 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            while (z) {
                String str52 = str44;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool5 = bool10;
                        str20 = str40;
                        str21 = str41;
                        bool6 = bool11;
                        str22 = str49;
                        str23 = str50;
                        str24 = str52;
                        z = false;
                        str25 = str23;
                        str44 = str24;
                        str50 = str25;
                        str49 = str22;
                        str41 = str21;
                        bool11 = bool6;
                        str40 = str20;
                        bool10 = bool5;
                        break;
                    case 0:
                        bool5 = bool10;
                        str20 = str40;
                        str21 = str41;
                        bool6 = bool11;
                        str22 = str49;
                        str23 = str50;
                        str24 = str52;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        str25 = str23;
                        str44 = str24;
                        str50 = str25;
                        str49 = str22;
                        str41 = str21;
                        bool11 = bool6;
                        str40 = str20;
                        bool10 = bool5;
                        break;
                    case 1:
                        bool5 = bool10;
                        str20 = str40;
                        str21 = str41;
                        bool6 = bool11;
                        str22 = str49;
                        str26 = str50;
                        str27 = str52;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        str25 = str26;
                        str44 = str27;
                        str50 = str25;
                        str49 = str22;
                        str41 = str21;
                        bool11 = bool6;
                        str40 = str20;
                        bool10 = bool5;
                        break;
                    case 2:
                        bool5 = bool10;
                        str20 = str40;
                        str21 = str41;
                        bool6 = bool11;
                        str22 = str49;
                        str26 = str50;
                        str27 = str52;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        str25 = str26;
                        str44 = str27;
                        str50 = str25;
                        str49 = str22;
                        str41 = str21;
                        bool11 = bool6;
                        str40 = str20;
                        bool10 = bool5;
                        break;
                    case 3:
                        bool5 = bool10;
                        str20 = str40;
                        bool6 = bool11;
                        str22 = str49;
                        str26 = str50;
                        str27 = str52;
                        str21 = str41;
                        str51 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str51);
                        i3 |= 8;
                        str25 = str26;
                        str44 = str27;
                        str50 = str25;
                        str49 = str22;
                        str41 = str21;
                        bool11 = bool6;
                        str40 = str20;
                        bool10 = bool5;
                        break;
                    case 4:
                        bool5 = bool10;
                        str20 = str40;
                        bool6 = bool11;
                        str22 = str49;
                        str50 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str50);
                        i3 |= 16;
                        str21 = str41;
                        str44 = str52;
                        str25 = str50;
                        str50 = str25;
                        str49 = str22;
                        str41 = str21;
                        bool11 = bool6;
                        str40 = str20;
                        bool10 = bool5;
                        break;
                    case 5:
                        bool5 = bool10;
                        str20 = str40;
                        bool6 = bool11;
                        str22 = str49;
                        str28 = str52;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 |= 32;
                        str44 = str28;
                        str21 = str41;
                        str25 = str50;
                        str50 = str25;
                        str49 = str22;
                        str41 = str21;
                        bool11 = bool6;
                        str40 = str20;
                        bool10 = bool5;
                        break;
                    case 6:
                        bool5 = bool10;
                        str20 = str40;
                        bool6 = bool11;
                        str22 = str49;
                        str28 = str52;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 |= 64;
                        str44 = str28;
                        str21 = str41;
                        str25 = str50;
                        str50 = str25;
                        str49 = str22;
                        str41 = str21;
                        bool11 = bool6;
                        str40 = str20;
                        bool10 = bool5;
                        break;
                    case 7:
                        bool5 = bool10;
                        str20 = str40;
                        Boolean bool13 = bool11;
                        str22 = str49;
                        bool6 = bool13;
                        str44 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str52);
                        i3 |= 128;
                        str21 = str41;
                        str25 = str50;
                        str50 = str25;
                        str49 = str22;
                        str41 = str21;
                        bool11 = bool6;
                        str40 = str20;
                        bool10 = bool5;
                        break;
                    case 8:
                        bool5 = bool10;
                        Boolean bool14 = bool11;
                        str22 = str49;
                        str20 = str40;
                        i3 |= 256;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool14);
                        str21 = str41;
                        str25 = str50;
                        str44 = str52;
                        str50 = str25;
                        str49 = str22;
                        str41 = str21;
                        bool11 = bool6;
                        str40 = str20;
                        bool10 = bool5;
                        break;
                    case 9:
                        bool4 = bool11;
                        str49 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str49);
                        i3 |= 512;
                        bool10 = bool10;
                        str44 = str52;
                        bool11 = bool4;
                        break;
                    case 10:
                        bool4 = bool11;
                        str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str43);
                        i3 |= 1024;
                        str44 = str52;
                        bool11 = bool4;
                        break;
                    case 11:
                        bool4 = bool11;
                        i3 |= 2048;
                        str46 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str46);
                        str44 = str52;
                        bool11 = bool4;
                        break;
                    case 12:
                        bool4 = bool11;
                        str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str42);
                        i3 |= 4096;
                        str44 = str52;
                        bool11 = bool4;
                        break;
                    case 13:
                        bool4 = bool11;
                        i3 |= 8192;
                        str45 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str45);
                        str44 = str52;
                        bool11 = bool4;
                        break;
                    case 14:
                        bool4 = bool11;
                        i3 |= 16384;
                        str47 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str47);
                        str44 = str52;
                        bool11 = bool4;
                        break;
                    case 15:
                        bool4 = bool11;
                        str48 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str48);
                        i2 = 32768;
                        i3 |= i2;
                        str44 = str52;
                        bool11 = bool4;
                        break;
                    case 16:
                        bool4 = bool11;
                        i3 |= 65536;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        str44 = str52;
                        bool11 = bool4;
                        break;
                    case 17:
                        bool4 = bool11;
                        bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, BooleanSerializer.INSTANCE, bool10);
                        i2 = 131072;
                        i3 |= i2;
                        str44 = str52;
                        bool11 = bool4;
                        break;
                    case 18:
                        bool4 = bool11;
                        bool12 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, BooleanSerializer.INSTANCE, bool12);
                        i2 = 262144;
                        i3 |= i2;
                        str44 = str52;
                        bool11 = bool4;
                        break;
                    case 19:
                        bool4 = bool11;
                        str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, str41);
                        i2 = 524288;
                        i3 |= i2;
                        str44 = str52;
                        bool11 = bool4;
                        break;
                    case 20:
                        bool4 = bool11;
                        str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, str40);
                        i2 = 1048576;
                        i3 |= i2;
                        str44 = str52;
                        bool11 = bool4;
                        break;
                    case 21:
                        bool4 = bool11;
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, str29);
                        i2 = 2097152;
                        i3 |= i2;
                        str44 = str52;
                        bool11 = bool4;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str42;
            str2 = str43;
            str3 = str49;
            str4 = str45;
            str5 = str46;
            str6 = str47;
            str7 = str48;
            str8 = strDecodeStringElement7;
            str9 = str44;
            str10 = strDecodeStringElement8;
            bool = bool11;
            str11 = str40;
            bool2 = bool10;
            str12 = strDecodeStringElement9;
            str13 = strDecodeStringElement10;
            str14 = strDecodeStringElement11;
            str15 = str51;
            str16 = str50;
            str17 = str29;
            str18 = str41;
            i = i3;
            bool3 = bool12;
            str19 = strDecodeStringElement12;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BaseTradeStrategyOrderReq(i, str19, str8, str14, str15, str16, str13, str12, str9, bool, str3, str2, str5, str, str4, str6, str7, str10, bool2, bool3, str18, str11, str17, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BaseTradeStrategyOrderReq baseTradeStrategyOrderReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(baseTradeStrategyOrderReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BaseTradeStrategyOrderReq.write$Self$OKTradeCore_trade_core(baseTradeStrategyOrderReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

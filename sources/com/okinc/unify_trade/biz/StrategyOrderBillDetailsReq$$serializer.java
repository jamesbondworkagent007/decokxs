package com.okinc.unify_trade.biz;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
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

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class StrategyOrderBillDetailsReq$$serializer implements GeneratedSerializer<StrategyOrderBillDetailsReq> {
    public static final int $stable;
    public static final StrategyOrderBillDetailsReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private StrategyOrderBillDetailsReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        StrategyOrderBillDetailsReq$$serializer strategyOrderBillDetailsReq$$serializer = new StrategyOrderBillDetailsReq$$serializer();
        INSTANCE = strategyOrderBillDetailsReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.StrategyOrderBillDetailsReq", strategyOrderBillDetailsReq$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("algoId", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.SIDE, true);
        pluginGeneratedSerialDescriptor.addElement("groupId", true);
        pluginGeneratedSerialDescriptor.addElement("ordId", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.RUBY_AFTER, true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.RUBY_BEFORE, true);
        pluginGeneratedSerialDescriptor.addElement("limit", true);
        pluginGeneratedSerialDescriptor.addElement("ordType", true);
        pluginGeneratedSerialDescriptor.addElement("cycleId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final StrategyOrderBillDetailsReq deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 9;
        int i3 = 7;
        String str12 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            str3 = str18;
            str4 = str17;
            str2 = str16;
            str10 = str14;
            str9 = strDecodeStringElement3;
            str = str15;
            str7 = str13;
            str8 = strDecodeStringElement2;
            i = 1023;
            str5 = strDecodeStringElement;
        } else {
            int i4 = 0;
            boolean z = true;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            String strDecodeStringElement4 = null;
            String str24 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str11 = str24;
                        z = false;
                        str24 = str11;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 0:
                        str11 = str24;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        str24 = str11;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 1:
                        str11 = str24;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        str24 = str11;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 2:
                        str11 = str24;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str12);
                        i4 |= 4;
                        str24 = str11;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 3:
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str24);
                        i4 |= 8;
                        str11 = str24;
                        str24 = str11;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 4:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str19);
                        i4 |= 16;
                        str11 = str24;
                        str24 = str11;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 5:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str20);
                        i4 |= 32;
                        str11 = str24;
                        str24 = str11;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 6:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str22);
                        i4 |= 64;
                        break;
                    case 7:
                        i4 |= 128;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str21);
                        str11 = str24;
                        str24 = str11;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 8:
                        i4 |= 256;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        str11 = str24;
                        str24 = str11;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 9:
                        i4 |= 512;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str23);
                        str11 = str24;
                        str24 = str11;
                        i2 = 9;
                        i3 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str25 = str24;
            str = str19;
            str2 = str20;
            str3 = str21;
            str4 = str22;
            str5 = strDecodeStringElement6;
            i = i4;
            str6 = str23;
            str7 = str12;
            str8 = strDecodeStringElement5;
            str9 = strDecodeStringElement4;
            str10 = str25;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new StrategyOrderBillDetailsReq(i, str5, str8, str7, str10, str, str2, str4, str3, str9, str6, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull StrategyOrderBillDetailsReq strategyOrderBillDetailsReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(strategyOrderBillDetailsReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        StrategyOrderBillDetailsReq.write$Self$OKTradeCore_trade_core(strategyOrderBillDetailsReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

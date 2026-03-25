package com.okinc.business.invest_biz.data.bean.request;

import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class InvestSubscriptionReceiveReq$$serializer implements GeneratedSerializer<InvestSubscriptionReceiveReq> {
    public static final int $stable;
    public static final InvestSubscriptionReceiveReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestSubscriptionReceiveReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestSubscriptionReceiveReq$$serializer investSubscriptionReceiveReq$$serializer = new InvestSubscriptionReceiveReq$$serializer();
        INSTANCE = investSubscriptionReceiveReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionReceiveReq", investSubscriptionReceiveReq$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("accountId", false);
        pluginGeneratedSerialDescriptor.addElement("inputAmount", false);
        pluginGeneratedSerialDescriptor.addElement("investmentId", false);
        pluginGeneratedSerialDescriptor.addElement("inputTokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, false);
        pluginGeneratedSerialDescriptor.addElement("tokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("isSingle", true);
        pluginGeneratedSerialDescriptor.addElement("slippage", true);
        pluginGeneratedSerialDescriptor.addElement("tickLower", true);
        pluginGeneratedSerialDescriptor.addElement("tickUpper", true);
        pluginGeneratedSerialDescriptor.addElement("tokenId", true);
        pluginGeneratedSerialDescriptor.addElement("investmentCategory", true);
        pluginGeneratedSerialDescriptor.addElement("transactionType", true);
        pluginGeneratedSerialDescriptor.addElement("stakeId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, longSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(longSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestSubscriptionReceiveReq deserialize(@NotNull Decoder decoder) {
        String str;
        Integer num;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Integer num2;
        Long l;
        Integer num3;
        Boolean bool;
        Integer num4;
        long j;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        Long l2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, intSerializer, null);
            Integer num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, intSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, null);
            Integer num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, intSerializer, null);
            num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, intSerializer, null);
            l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, LongSerializer.INSTANCE, null);
            num3 = num7;
            num4 = num6;
            str5 = strDecodeStringElement3;
            num = num5;
            str = str8;
            str7 = strDecodeStringElement;
            j = jDecodeLongElement;
            bool = bool2;
            str4 = strDecodeStringElement6;
            i = 16383;
            str3 = strDecodeStringElement5;
            str2 = strDecodeStringElement4;
            str6 = strDecodeStringElement2;
        } else {
            int i3 = 13;
            int i4 = 0;
            boolean z = true;
            Integer num8 = null;
            String str9 = null;
            Integer num9 = null;
            Boolean bool3 = null;
            Integer num10 = null;
            Integer num11 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 10;
                        i3 = 13;
                        break;
                    case 0:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i2 = 10;
                        i3 = 13;
                        break;
                    case 1:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i2 = 10;
                        i3 = 13;
                        break;
                    case 2:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i4 |= 4;
                        i2 = 10;
                        i3 = 13;
                        break;
                    case 3:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 |= 8;
                        i2 = 10;
                        i3 = 13;
                        break;
                    case 4:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i4 |= 16;
                        i2 = 10;
                        i3 = 13;
                        break;
                    case 5:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i4 |= 32;
                        i2 = 10;
                        i3 = 13;
                        break;
                    case 6:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, bool3);
                        i4 |= 64;
                        i2 = 10;
                        i3 = 13;
                        break;
                    case 7:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i4 |= 128;
                        i3 = 13;
                        break;
                    case 8:
                        num10 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, num10);
                        i4 |= 256;
                        i3 = 13;
                        break;
                    case 9:
                        i4 |= 512;
                        num11 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, num11);
                        i2 = 10;
                        i3 = 13;
                        break;
                    case 10:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str9);
                        i4 |= 1024;
                        i2 = 10;
                        i3 = 13;
                        break;
                    case 11:
                        num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, num9);
                        i4 |= 2048;
                        i2 = 10;
                        i3 = 13;
                        break;
                    case 12:
                        num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, num8);
                        i4 |= 4096;
                        i2 = 10;
                        i3 = 13;
                        break;
                    case 13:
                        l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, LongSerializer.INSTANCE, l2);
                        i4 |= 8192;
                        i2 = 10;
                        i3 = 13;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str9;
            num = num10;
            str2 = strDecodeStringElement11;
            str3 = strDecodeStringElement12;
            str4 = strDecodeStringElement7;
            str5 = strDecodeStringElement8;
            str6 = strDecodeStringElement9;
            str7 = strDecodeStringElement10;
            num2 = num8;
            l = l2;
            num3 = num9;
            bool = bool3;
            num4 = num11;
            j = jDecodeLongElement2;
            i = i4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestSubscriptionReceiveReq(i, str7, str6, j, str5, str2, str3, bool, str4, num, num4, str, num3, num2, l, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestSubscriptionReceiveReq investSubscriptionReceiveReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investSubscriptionReceiveReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestSubscriptionReceiveReq.write$Self$OKDeFi_invest_biz(investSubscriptionReceiveReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

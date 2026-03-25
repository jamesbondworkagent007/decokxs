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
public final /* synthetic */ class InvestRedeemReceiveReq$$serializer implements GeneratedSerializer<InvestRedeemReceiveReq> {
    public static final int $stable;
    public static final InvestRedeemReceiveReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestRedeemReceiveReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestRedeemReceiveReq$$serializer investRedeemReceiveReq$$serializer = new InvestRedeemReceiveReq$$serializer();
        INSTANCE = investRedeemReceiveReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.request.InvestRedeemReceiveReq", investRedeemReceiveReq$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("accountId", false);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, false);
        pluginGeneratedSerialDescriptor.addElement("inputTokenAmount", false);
        pluginGeneratedSerialDescriptor.addElement("investmentId", false);
        pluginGeneratedSerialDescriptor.addElement("investmentCategory", false);
        pluginGeneratedSerialDescriptor.addElement("outputTokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("outputTokenDecimal", true);
        pluginGeneratedSerialDescriptor.addElement("isSingle", true);
        pluginGeneratedSerialDescriptor.addElement("slippage", true);
        pluginGeneratedSerialDescriptor.addElement("redeemId", true);
        pluginGeneratedSerialDescriptor.addElement("transactionType", true);
        pluginGeneratedSerialDescriptor.addElement("redeemPercent", true);
        pluginGeneratedSerialDescriptor.addElement("redeemNeedUnbond", true);
        pluginGeneratedSerialDescriptor.addElement("pubkey", true);
        pluginGeneratedSerialDescriptor.addElement("stakeId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, longSerializer, intSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(intSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(longSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestRedeemReceiveReq deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        long j;
        Long l;
        int i2;
        String str5;
        Boolean bool;
        String str6;
        String str7;
        Boolean bool2;
        String str8;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 10;
        Long l2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, null);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, booleanSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            bool2 = bool4;
            l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, LongSerializer.INSTANCE, null);
            str6 = strDecodeStringElement4;
            num = num2;
            str2 = strDecodeStringElement7;
            str3 = strDecodeStringElement6;
            bool = bool3;
            strDecodeStringElement = strDecodeStringElement5;
            str8 = str11;
            str7 = strDecodeStringElement3;
            j = jDecodeLongElement;
            str4 = strDecodeStringElement2;
            str = str10;
            str5 = str9;
            i = iDecodeIntElement;
            i2 = 32767;
        } else {
            int i5 = 14;
            int i6 = 0;
            int iDecodeIntElement2 = 0;
            boolean z = true;
            Boolean bool5 = null;
            Integer num3 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            Boolean bool6 = null;
            String strDecodeStringElement8 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement12 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i5 = 14;
                        i4 = 10;
                        break;
                    case 0:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        i5 = 14;
                        i4 = 10;
                        break;
                    case 1:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i6 |= 2;
                        i5 = 14;
                        i4 = 10;
                        break;
                    case 2:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        i5 = 14;
                        i4 = 10;
                        break;
                    case 3:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i6 |= 8;
                        i5 = 14;
                        i4 = 10;
                        break;
                    case 4:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i6 |= 16;
                        i5 = 14;
                        i4 = 10;
                        break;
                    case 5:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str14);
                        i6 |= 32;
                        i5 = 14;
                        i4 = 10;
                        break;
                    case 6:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str13);
                        i6 |= 64;
                        i5 = 14;
                        i4 = 10;
                        break;
                    case 7:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, bool6);
                        i6 |= 128;
                        i5 = 14;
                        break;
                    case 8:
                        i6 |= 256;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i5 = 14;
                        i4 = 10;
                        break;
                    case 9:
                        i6 |= 512;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i5 = 14;
                        break;
                    case 10:
                        i6 |= 1024;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, IntSerializer.INSTANCE, num3);
                        i5 = 14;
                        break;
                    case 11:
                        i6 |= 2048;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i5 = 14;
                        break;
                    case 12:
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, bool5);
                        i3 = i6 | 4096;
                        i6 = i3;
                        i5 = 14;
                        break;
                    case 13:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str12);
                        i3 = i6 | 8192;
                        i6 = i3;
                        i5 = 14;
                        break;
                    case 14:
                        l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, LongSerializer.INSTANCE, l2);
                        i3 = i6 | 16384;
                        i6 = i3;
                        i5 = 14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            num = num3;
            str = str13;
            str2 = strDecodeStringElement12;
            str3 = strDecodeStringElement8;
            str4 = strDecodeStringElement11;
            i = iDecodeIntElement2;
            j = jDecodeLongElement2;
            l = l2;
            i2 = i6;
            str5 = str14;
            bool = bool6;
            str6 = strDecodeStringElement9;
            str7 = strDecodeStringElement10;
            bool2 = bool5;
            str8 = str12;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestRedeemReceiveReq(i2, str4, str7, str6, j, i, str5, str, bool, strDecodeStringElement, str3, num, str2, bool2, str8, l, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestRedeemReceiveReq investRedeemReceiveReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investRedeemReceiveReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestRedeemReceiveReq.write$Self$OKDeFi_invest_biz(investRedeemReceiveReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

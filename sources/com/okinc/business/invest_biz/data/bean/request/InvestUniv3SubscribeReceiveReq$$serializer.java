package com.okinc.business.invest_biz.data.bean.request;

import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import java.util.List;
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
public final /* synthetic */ class InvestUniv3SubscribeReceiveReq$$serializer implements GeneratedSerializer<InvestUniv3SubscribeReceiveReq> {
    public static final int $stable;
    public static final InvestUniv3SubscribeReceiveReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestUniv3SubscribeReceiveReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestUniv3SubscribeReceiveReq$$serializer investUniv3SubscribeReceiveReq$$serializer = new InvestUniv3SubscribeReceiveReq$$serializer();
        INSTANCE = investUniv3SubscribeReceiveReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.request.InvestUniv3SubscribeReceiveReq", investUniv3SubscribeReceiveReq$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, false);
        pluginGeneratedSerialDescriptor.addElement("inputAmount", false);
        pluginGeneratedSerialDescriptor.addElement("inputTokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("investmentId", false);
        pluginGeneratedSerialDescriptor.addElement("isSingle", true);
        pluginGeneratedSerialDescriptor.addElement("tickLower", false);
        pluginGeneratedSerialDescriptor.addElement("tickUpper", false);
        pluginGeneratedSerialDescriptor.addElement("tokenId", true);
        pluginGeneratedSerialDescriptor.addElement("tokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("accountId", false);
        pluginGeneratedSerialDescriptor.addElement("slippage", true);
        pluginGeneratedSerialDescriptor.addElement("openZap", true);
        pluginGeneratedSerialDescriptor.addElement("inputTokenList", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = InvestUniv3SubscribeReceiveReq.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(booleanSerializer), intSerializer, intSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), kSerializerArr[12]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestUniv3SubscribeReceiveReq deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        String str;
        String str2;
        String str3;
        long j;
        String str4;
        List list;
        int i;
        Boolean bool2;
        String str5;
        String str6;
        int i2;
        String str7;
        int i3;
        Boolean bool3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = InvestUniv3SubscribeReceiveReq.$childSerializers;
        int i4 = 10;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], null);
            str5 = strDecodeStringElement2;
            str7 = strDecodeStringElement7;
            str6 = strDecodeStringElement6;
            str4 = str8;
            i2 = iDecodeIntElement2;
            i3 = iDecodeIntElement;
            bool2 = bool5;
            str = strDecodeStringElement5;
            bool = bool4;
            str3 = strDecodeStringElement3;
            j = jDecodeLongElement;
            i = 8191;
            str2 = strDecodeStringElement4;
        } else {
            int i5 = 12;
            String str9 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            Boolean bool6 = null;
            String strDecodeStringElement12 = null;
            int i6 = 0;
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            boolean z = true;
            long jDecodeLongElement2 = 0;
            List list2 = null;
            Boolean bool7 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool3 = bool6;
                        z = false;
                        bool6 = bool3;
                        i5 = 12;
                        i4 = 10;
                        break;
                    case 0:
                        bool3 = bool6;
                        i6 |= 1;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        bool6 = bool3;
                        i5 = 12;
                        i4 = 10;
                        break;
                    case 1:
                        bool3 = bool6;
                        i6 |= 2;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        bool6 = bool3;
                        i5 = 12;
                        i4 = 10;
                        break;
                    case 2:
                        bool3 = bool6;
                        i6 |= 4;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        bool6 = bool3;
                        i5 = 12;
                        i4 = 10;
                        break;
                    case 3:
                        bool3 = bool6;
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i6 |= 8;
                        bool6 = bool3;
                        i5 = 12;
                        i4 = 10;
                        break;
                    case 4:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool6);
                        i6 |= 16;
                        bool6 = bool3;
                        i5 = 12;
                        i4 = 10;
                        break;
                    case 5:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i6 |= 32;
                        bool3 = bool6;
                        bool6 = bool3;
                        i5 = 12;
                        i4 = 10;
                        break;
                    case 6:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i6 |= 64;
                        bool3 = bool6;
                        bool6 = bool3;
                        i5 = 12;
                        i4 = 10;
                        break;
                    case 7:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str9);
                        i6 |= 128;
                        bool3 = bool6;
                        bool6 = bool3;
                        i5 = 12;
                        i4 = 10;
                        break;
                    case 8:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i6 |= 256;
                        bool3 = bool6;
                        bool6 = bool3;
                        i5 = 12;
                        i4 = 10;
                        break;
                    case 9:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i6 |= 512;
                        bool3 = bool6;
                        bool6 = bool3;
                        i5 = 12;
                        i4 = 10;
                        break;
                    case 10:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i6 |= 1024;
                        bool3 = bool6;
                        bool6 = bool3;
                        i5 = 12;
                        i4 = 10;
                        break;
                    case 11:
                        bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, bool7);
                        i6 |= 2048;
                        bool3 = bool6;
                        bool6 = bool3;
                        i5 = 12;
                        i4 = 10;
                        break;
                    case 12:
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i5, kSerializerArr[i5], list2);
                        i6 |= 4096;
                        bool3 = bool6;
                        bool6 = bool3;
                        i5 = 12;
                        i4 = 10;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            bool = bool6;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement8;
            str3 = strDecodeStringElement11;
            j = jDecodeLongElement2;
            str4 = str9;
            list = list2;
            i = i6;
            int i7 = iDecodeIntElement4;
            bool2 = bool7;
            str5 = strDecodeStringElement12;
            str6 = strDecodeStringElement10;
            i2 = iDecodeIntElement3;
            str7 = strDecodeStringElement9;
            i3 = i7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestUniv3SubscribeReceiveReq(i, str5, str3, str2, j, bool, i3, i2, str4, str, str6, str7, bool2, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestUniv3SubscribeReceiveReq investUniv3SubscribeReceiveReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investUniv3SubscribeReceiveReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestUniv3SubscribeReceiveReq.write$Self$OKDeFi_invest_biz(investUniv3SubscribeReceiveReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}

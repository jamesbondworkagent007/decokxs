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
public final /* synthetic */ class InvestSubscriptionInitialReq$$serializer implements GeneratedSerializer<InvestSubscriptionInitialReq> {
    public static final int $stable;
    public static final InvestSubscriptionInitialReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestSubscriptionInitialReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestSubscriptionInitialReq$$serializer investSubscriptionInitialReq$$serializer = new InvestSubscriptionInitialReq$$serializer();
        INSTANCE = investSubscriptionInitialReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionInitialReq", investSubscriptionInitialReq$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("investmentId", false);
        pluginGeneratedSerialDescriptor.addElement("accountId", false);
        pluginGeneratedSerialDescriptor.addElement("isSingle", true);
        pluginGeneratedSerialDescriptor.addElement("inputTokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, false);
        pluginGeneratedSerialDescriptor.addElement("tokenId", true);
        pluginGeneratedSerialDescriptor.addElement("investmentCategory", true);
        pluginGeneratedSerialDescriptor.addElement("transactionType", true);
        pluginGeneratedSerialDescriptor.addElement("stakeId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{longSerializer, stringSerializer, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(longSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestSubscriptionInitialReq deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        Integer num;
        Integer num2;
        int i;
        String str;
        boolean z;
        Long l;
        String str2;
        long j;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, intSerializer, null);
            str = strDecodeStringElement3;
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, intSerializer, null);
            num2 = num3;
            str2 = str3;
            l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, null);
            z = zDecodeBooleanElement;
            strDecodeStringElement = strDecodeStringElement4;
            strDecodeStringElement2 = strDecodeStringElement5;
            i = 511;
            j = jDecodeLongElement;
        } else {
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            String str4 = null;
            Integer num4 = null;
            Long l2 = null;
            String strDecodeStringElement6 = null;
            long jDecodeLongElement2 = 0;
            Integer num5 = null;
            strDecodeStringElement = null;
            strDecodeStringElement2 = null;
            int i3 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i2 = 7;
                        break;
                    case 0:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 7;
                        break;
                    case 1:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 7;
                        break;
                    case 2:
                        i3 |= 4;
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                        break;
                    case 3:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                        break;
                    case 5:
                        i3 |= 32;
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str4);
                        break;
                    case 6:
                        i3 |= 64;
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, num4);
                        break;
                    case 7:
                        i3 |= 128;
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, IntSerializer.INSTANCE, num5);
                        break;
                    case 8:
                        i3 |= 256;
                        l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, l2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            num = num5;
            num2 = num4;
            i = i3;
            str = strDecodeStringElement6;
            z = zDecodeBooleanElement2;
            l = l2;
            str2 = str4;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestSubscriptionInitialReq(i, j, str, z, strDecodeStringElement, strDecodeStringElement2, str2, num2, num, l, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestSubscriptionInitialReq investSubscriptionInitialReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investSubscriptionInitialReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestSubscriptionInitialReq.write$Self$OKDeFi_invest_biz(investSubscriptionInitialReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
